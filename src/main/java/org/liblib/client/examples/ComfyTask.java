package org.liblib.client.examples;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeCreator;
import com.google.gson.JsonObject;
import org.liblib.client.FluentHashMap;
import org.liblib.client.LibLib;
import org.liblib.openapi.client.ApiException;
import org.liblib.openapi.client.model.*;

import java.util.HashMap;
import java.util.Map;

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

        request.generateParams(new HashMap<String, ComfyNodeParams>(){{
            put("12", inputNode);
            put("112", scaleNode);
            put("136", repeatLatentNode);
       }});

        SubmitComfyResponse submitComfyResponse = api.submitComfyTask(request);
        ComfyStatusResponse comfyStatus = api.getComfyStatus(submitComfyResponse.getData().getGenerateUuid());
        boolean finished = false;
        while (!finished) {
            GenerateStatus status = comfyStatus.getData().getGenerateStatus();
            switch (status) {
                case RUNNING:
                case PENDING:
                case APPROVING:
                case GENERATED:
                case SUCCEED:
                    finished = true;
                    break;
                case FAILED:
                    finished = true;
                    break;
            }
            Thread.sleep(5000);
        }

    }
}
