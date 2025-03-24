package cloud.liblibai.client.examples;

import cloud.liblibai.client.LibLib;
import cloud.liblibai.openapi.client.ApiException;
import cloud.liblibai.openapi.client.model.*;

import java.util.HashMap;
import java.util.Map;

public class TextToImage {
    public static void main(String[] args) throws ApiException, InterruptedException {
        LibLib api = new LibLib();
        GetModelVersionRequest getModelVersionRequest = new GetModelVersionRequest();
        getModelVersionRequest.setVersionUuid("a57911b5dfe64c6aa78821be99367276");
        VersionResponse modelVersion = api.getModelVersion(getModelVersionRequest);
        if (modelVersion.getData().getCommercialUse() == CommercialUseEnum.CommercialUse) {
            System.out.println(modelVersion);
        }
        TextToImageRequest request = new TextToImageRequest();
        TextToImageRequestGenerateParams params = new TextToImageRequestGenerateParams();
        params.checkPointId("a57911b5dfe64c6aa78821be99367276");
        params.prompt("1 girl").imgCount(2);
        params.cfgScale(7.5);
        ControlNet controlNet = new ControlNet();
        controlNet.width(1024).height(768);
        Map<String, Object> annoParams = new HashMap<>();
        Map<String, Object> cannyParams = new HashMap<>();
        cannyParams.put("preprocessorResolution", 512);
        annoParams.put("canny", cannyParams);
        controlNet.unitOrder(1);
        controlNet.model("efb97e9d8c237573298c3a5a7869b89c").preprocessor(1)
                .sourceImage("https://liblibai-online.liblib.cloud/img/081e9f07d9bd4c2ba090efde163518f9/7c1cc38e-522c-43fe-aca9-07d5420d743e.png")
                .annotationParameters(annoParams);
        params.addControlNetItem(controlNet);
        params.vaeId("2c1a337416e029dd65ab58784e8a4763");
        request.generateParams(params);
        request.templateUuid("6f7c4652458d4802969f8d089cf5b91f");


        //NOTE(gz): 异步 SDK 调用方法
        SubmitResponse submitResponse = api.submitTextToImage(request);
        while(true) {
            if (submitResponse.getData() == null) {
                System.out.println("Error: " +  submitResponse.getMsg());
                break;
            }
            StatusResponse status = api.getStatus(new StatusRequest().generateUuid(submitResponse.getData().getGenerateUuid()));
            System.out.println(status);
            if (status.getData().getGenerateStatus() == GenerateStatus.SUCCEED) {
                System.out.println(status.getData().getImages());
                break;
            }
            Thread.sleep(5000);
        }

        //NOTE(gz): 同步 SDK 调用方法
//        StatusResponseData statusResponseData = api.textToImage(request);
//        if (statusResponseData.getGenerateStatus() == GenerateStatus.SUCCEED) {
//            System.out.println(statusResponseData.getImages());
//        }

    }
}
