package org.liblib.client.examples;

import org.liblib.client.LibLib;
import org.liblib.openapi.client.ApiException;
import org.liblib.openapi.client.model.*;

public class TextToImageUltra {
    public static void main(String[] args) throws ApiException, InterruptedException {
        String accessKey = "REwuW3xEMEdHIvKu567kMw";
        String secretKey ="5ov6OUFhooXApW5zHNYazc2SkWU4-AOH";
        LibLib api = new LibLib(accessKey, secretKey);
        TextToImageUltraRequest request = new TextToImageUltraRequest();
        request.templateUuid("5d7e67009b344550bc1aa6ccbfa1d7f4");
        TextToImageUltraRequestGenerateParams params = new TextToImageUltraRequestGenerateParams();
        request.generateParams(params);
        params.prompt("1 girl").aspectRatio(TextToImageUltraRequestGenerateParams.AspectRatioEnum.PORTRAIT)
                .steps(30).imgCount(4);
        SubmitResponse submitResponse = api.submitTextToImageUltra(request);

        while(true) {
            StatusResponse status = api.getStatus(new StatusRequest().generateUuid(submitResponse.getData().getGenerateUuid()));
            System.out.println(status.toJson());
            if (status.getData().getGenerateStatus() == GenerateStatus.SUCCEED) {
                System.out.println(status.getData().getImages());
                break;
            }
            Thread.sleep(5000);
        }

    }
}
