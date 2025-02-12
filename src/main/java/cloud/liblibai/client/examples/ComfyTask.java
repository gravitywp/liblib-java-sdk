package cloud.liblibai.client.examples;

import com.fasterxml.jackson.core.JsonProcessingException;
import cloud.liblibai.client.LibLib;
import cloud.liblibai.openapi.client.ApiException;
import cloud.liblibai.openapi.client.model.*;

import java.util.HashMap;

public class ComfyTask {

    public static void main(String[] args) throws ApiException, JsonProcessingException, InterruptedException {
        LibLib api = new LibLib();
        ComfyRequest request = new ComfyRequest();

        request.templateUuid("");

        ComfyNodeParams inputNode = new ComfyNodeParams();
        inputNode.classType("LoadImage")
                .putInputsItem("image", "https://liblibai-tmp-image.liblib.cloud/img/baf2e419ce1cb06812314957efd2e067/af0c523d3d2b4092ab45c64c72e4deb76babb12e9b8a178eb524143c3b71bf85.png");

        ComfyNodeParams scaleNode = new ComfyNodeParams();
        scaleNode.classType("ScaleImage")
                .putInputsItem("width", 768);

        ComfyNodeParams repeatLatentNode = new ComfyNodeParams();
        repeatLatentNode.classType("RepeatLatentImage")
                .putInputsItem("amount", 4);

        ComfyRequestGenerateParams generateParams = new ComfyRequestGenerateParams();
        generateParams.workflowUuid("2f22ab7ce4c044afb6d5eee2e61547f3");
        generateParams.putAdditionalProperty("12", inputNode);
        generateParams.putAdditionalProperty("112", scaleNode);
        generateParams.putAdditionalProperty("136", repeatLatentNode);
        request.generateParams(generateParams);

        // 异步 SDK API 调用
        SubmitComfyResponse submitComfyResponse = api.submitComfyTask(request);
        String uuid = submitComfyResponse.getData().getGenerateUuid();

        boolean finished = false;
        while (!finished) {
            ComfyStatusResponse comfyStatus = api.getComfyStatus(new ComfyStatusRequest().generateUuid(uuid));
            GenerateStatus status = comfyStatus.getData().getGenerateStatus();
            System.out.println(comfyStatus);
            switch (status) {
                case RUNNING:
                case PENDING:
                case APPROVING:
                case GENERATED:
                    break;
                case SUCCEED:
                    finished = true;
                    System.out.println(status);
                    break;
                case TIMEOUT:
                case FAILED:
                    finished = true;
                    break;
                default:
                    throw new RuntimeException("Unknown comfy status: " + status);
            }
            Thread.sleep(5000);
        }

        //同步 SDK API 调用 ComfyTask
        ComfyStatusResponseData comfyStatusResponseData = api.runComfy(request);
        if (comfyStatusResponseData.getGenerateStatus() == GenerateStatus.SUCCEED) {
            System.out.println("generated images: " +  comfyStatusResponseData.getImages());
        }

    }
}
