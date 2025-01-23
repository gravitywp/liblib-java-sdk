package cloud.liblibai.client;

import cloud.liblibai.openapi.client.ApiException;
import cloud.liblibai.openapi.client.api.DefaultApi;
import cloud.liblibai.openapi.client.model.*;
import org.jetbrains.annotations.Nullable;

public class LibLib extends DefaultApi {

    Integer queryStatusIntervalSeconds = 5;

    int toleratFailedQueryTimes = 5;

    public void setQueryStatusIntervalSeconds(Integer queryStatusInterval) {
        this.queryStatusIntervalSeconds = queryStatusInterval;
    }

    public Integer getQueryStatusIntervalSeconds() {
        return queryStatusIntervalSeconds;
    }

    public LibLib() {
        super();
        String accessKey = System.getenv().get("LIBLIB_ACCESS_KEY");
        String secretKey = System.getenv().get("LIBLIB_SECRET_KEY");
        if (accessKey == null || secretKey == null) {
            throw new RuntimeException("Not set LIBLIB_ACCESS_KEY or LIBLIB_SECRET_KEY");
        }
        getApiClient().setApiKeyPrefix(secretKey);
        getApiClient().setApiKey(accessKey);
    }

    public LibLib(String accessKey, String secretKey) {
        super();
        getApiClient().setApiKeyPrefix(secretKey);
        getApiClient().setApiKey(accessKey);
    }

    public StatusResponseData textToImage(TextToImageRequest request) throws ApiException {
        SubmitResponse submitResponse = submitTextToImage(request);
        String generateUuid = submitResponse.getData().getGenerateUuid();
        if (generateUuid == null) {
            throw new RuntimeException("Not fetch generate task uuid");
        }

        StatusResponse status = waitResult(generateUuid);

        return status.getData();
    }

    public StatusResponseData imageToImage(ImageToImageRequest request) throws ApiException {
        SubmitResponse submitResponse = submitImageToImage(request);
        String generateUuid = submitResponse.getData().getGenerateUuid();
        if (generateUuid == null) {
            throw new RuntimeException("Not fetch generate task uuid");
        }
        StatusResponse status = waitResult(generateUuid);
        return status.getData();
    }

    public ComfyStatusResponseData runComfy(ComfyRequest request) throws ApiException {
        SubmitComfyResponse submitComfyResponse = submitComfyTask(request);
        String generateUuid = submitComfyResponse.getData().getGenerateUuid();
        if (generateUuid == null) {
            throw new RuntimeException("Not fetch generate task uuid");
        }
        ComfyStatusResponse status = waitComfy(generateUuid);

        return status.getData();
    }

    public ComfyStatusResponse waitComfy(String uuid) throws ApiException {
        int failedQueryTimes = 0;
        boolean isFinished = false;
        ComfyStatusResponse status = null;

        while(!isFinished && failedQueryTimes < toleratFailedQueryTimes) {

            status = getComfyStatus(new ComfyStatusRequest().generateUuid(uuid));

            if (status.getData() == null || status.getData().getGenerateStatus() == null) {
                failedQueryTimes++;
                continue;
            }
            GenerateStatus generateStatus = status.getData().getGenerateStatus();
            switch (generateStatus) {
                case PENDING:
                case RUNNING:
                case GENERATED:
                case APPROVING:
                    break;
                case SUCCEED:
                    isFinished = true;
                    break;
                case FAILED:
                    isFinished = true;
                    break;
                default:
                    throw new RuntimeException("Unexpected status " + generateStatus);
            }
            try {
                Thread.sleep(queryStatusIntervalSeconds * 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return status;
    }

    @Nullable
    public StatusResponse waitResult(String uuid) throws ApiException {
        int failedQueryTimes = 0;
        boolean isFinished = false;

        StatusResponse status = null;
        while(!isFinished && failedQueryTimes < toleratFailedQueryTimes) {

            status = getStatus(new StatusRequest().generateUuid(uuid));

            if (status.getData() == null || status.getData().getGenerateStatus() == null) {
                failedQueryTimes++;
                continue;
            }
            GenerateStatus generateStatus = status.getData().getGenerateStatus();
            switch (generateStatus) {
                case PENDING:
                case RUNNING:
                case GENERATED:
                case APPROVING:
                    break;
                case SUCCEED:
                    isFinished = true;
                    break;
                case FAILED:
                    isFinished = true;
                    break;
                default:
                    throw new RuntimeException("Unexpected status " + generateStatus);
            }
            try {
                Thread.sleep(queryStatusIntervalSeconds * 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return status;
    }


}
