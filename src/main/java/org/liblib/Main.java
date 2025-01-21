package org.liblib;


import org.liblib.client.LibLib;
import org.liblib.openapi.client.ApiException;
import org.liblib.openapi.client.model.*;

public class Main {
    public static void main(String[] args) throws ApiException, InterruptedException {
        String apiKey = "REwuW3xEMEdHIvKu567kMw";
        String apiSecret ="5ov6OUFhooXApW5zHNYazc2SkWU4-AOH";
        LibLib api = new LibLib(apiKey, apiSecret);
        TextToImageUltraRequest request = new TextToImageUltraRequest();
        request.templateUuid("5d7e67009b344550bc1aa6ccbfa1d7f4");
        TextToImageUltraRequestGenerateParams params = new TextToImageUltraRequestGenerateParams();
        request.generateParams(params);
        params.prompt("1 girl").aspectRatio(TextToImageUltraRequestGenerateParams.AspectRatioEnum.PORTRAIT)
                .steps(30).imgCount(4);
        SubmitResponse submitResponse = api.submitTextToImageUltra(request);

        StatusRequest getStatusRequest = new StatusRequest();
        getStatusRequest.setGenerateUuid(submitResponse.getData().getGenerateUuid());

        while(true) {
            StatusResponse status = api.getStatus(getStatusRequest);
            System.out.println(status.toJson());
            if (status.getData().getGenerateStatus() == GenerateStatus.SUCCEED) {
                break;
            }
            Thread.sleep(5000);
        }

        System.out.println("Hello, World!");
    }
}