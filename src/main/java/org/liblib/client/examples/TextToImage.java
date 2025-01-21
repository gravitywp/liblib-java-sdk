package org.liblib.client.examples;

import org.liblib.client.LibLib;
import org.liblib.openapi.client.ApiException;
import org.liblib.openapi.client.model.*;

public class TextToImage {
    public static void main(String[] args) throws ApiException, InterruptedException {
        String apiKey = "REwuW3xEMEdHIvKu567kMw";
        String apiSecret ="5ov6OUFhooXApW5zHNYazc2SkWU4-AOH";
        LibLib api = new LibLib(apiKey, apiSecret);
        TextToImageRequest request = new TextToImageRequest();
        TextToImageRequestGenerateParams params = new TextToImageRequestGenerateParams();
        params.prompt("1 girl").imgCount(2);
        request.generateParams(params);
        request.templateUuid("6f7c4652458d4802969f8d089cf5b91f");

        //NOTE(gz): 异步 SDK 调用方法
        SubmitResponse submitResponse = api.submitTextToImage(request);
        StatusResponse status = api.getStatus(new StatusRequest().generateUuid(submitResponse.getData().getGenerateUuid()));
        while(true) {
            if (status.getData().getGenerateStatus() == GenerateStatus.SUCCEED) {
                System.out.println(status.getData().getImages());
                break;
            }
            System.out.println(status);
            Thread.sleep(5000);
        }

        //NOTE(gz): 同步 SDK 调用方法
        StatusResponseData statusResponseData = api.textToImage(request);
        if (statusResponseData.getGenerateStatus() == GenerateStatus.SUCCEED) {
            System.out.println(statusResponseData.getImages());
        }

    }
}
