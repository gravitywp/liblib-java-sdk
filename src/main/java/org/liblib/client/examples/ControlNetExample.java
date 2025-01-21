package org.liblib.client.examples;

import org.liblib.client.LibLib;
import org.liblib.openapi.client.ApiException;
import org.liblib.openapi.client.model.*;

public class ControlNetExample {

    public static void main(String[] args) {
        String apiKey = "REwuW3xEMEdHIvKu567kMw";
        String apiSecret ="5ov6OUFhooXApW5zHNYazc2SkWU4-AOH";
        LibLib api = new LibLib(apiKey, apiSecret);
        TextToImageRequest request = new TextToImageRequest();
        TextToImageRequestGenerateParams params = new TextToImageRequestGenerateParams();
//        ControlNet controlnet = new ControlNet();
//        controlnet.unitOrder(1);
//        controlnet.setModel()
        params.prompt("1 girl").imgCount(1);
        request.generateParams(params);
        request.templateUuid("6f7c4652458d4802969f8d089cf5b91f");

        try {
            StatusResponseData statusResponseData = api.textToImage(request);
            if (statusResponseData.getGenerateStatus() == GenerateStatus.SUCCEED ) {
                System.out.println("Generated output examples" +  statusResponseData.getImages());
            }

        } catch (ApiException e) {
            throw new RuntimeException(e);
        }
    }

}
