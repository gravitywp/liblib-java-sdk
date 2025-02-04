package cloud.liblibai.client.examples;

import cloud.liblibai.client.LibLib;
import cloud.liblibai.openapi.client.ApiException;
import cloud.liblibai.openapi.client.model.*;

public class ControlNetExample {

    public static void main(String[] args) {
        LibLib api = new LibLib();
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
