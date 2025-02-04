/*
 * LiblibAI API
 * LiblibAI x 星流 图像大模型API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package cloud.liblibai.openapi.client.api;

import cloud.liblibai.openapi.client.ApiException;
import cloud.liblibai.openapi.client.model.ComfyRequest;
import cloud.liblibai.openapi.client.model.ComfyStatusRequest;
import cloud.liblibai.openapi.client.model.ComfyStatusResponse;
import cloud.liblibai.openapi.client.model.GetModelVersion400Response;
import cloud.liblibai.openapi.client.model.GetModelVersion404Response;
import cloud.liblibai.openapi.client.model.GetModelVersionRequest;
import cloud.liblibai.openapi.client.model.ImageToImageRequest;
import cloud.liblibai.openapi.client.model.StatusRequest;
import cloud.liblibai.openapi.client.model.StatusResponse;
import cloud.liblibai.openapi.client.model.SubmitComfyResponse;
import cloud.liblibai.openapi.client.model.SubmitResponse;
import cloud.liblibai.openapi.client.model.TextToImageRequest;
import cloud.liblibai.openapi.client.model.TextToImageUltraRequest;
import cloud.liblibai.openapi.client.model.VersionResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Disabled
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    /**
     * 查询 comfy 生图结果
     *
     * 根据生图任务uuid查询生图任务的状态和结果
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getComfyStatusTest() throws ApiException {
        ComfyStatusRequest comfyStatusRequest = null;
        ComfyStatusResponse response = api.getComfyStatus(comfyStatusRequest);
        // TODO: test validations
    }

    /**
     * 查询模型版本参数
     *
     * 查询指定的模型版本参数。目前Lib已开放全站的可商用模型供API使用，您可以在Lib站内检索可商用的Checkpoint和LoRA模型。 选择喜欢的模型版本，从浏览器网址中复制versionUuid，粘贴到文生图或图生图的参数模板中使用。 若您忘记了在生图参数中应用的模型是哪一款，您可以调用本接口进行查询。 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getModelVersionTest() throws ApiException {
        GetModelVersionRequest getModelVersionRequest = null;
        VersionResponse response = api.getModelVersion(getModelVersionRequest);
        // TODO: test validations
    }

    /**
     * 查询生图任务状态
     *
     * 根据生图任务uuid查询生图任务的状态和相关信息
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getStatusTest() throws ApiException {
        StatusRequest statusRequest = null;
        StatusResponse response = api.getStatus(statusRequest);
        // TODO: test validations
    }

    /**
     * 提交 ComfyUI 工作流生图任务
     *
     * 提交 ComfyUI 工作流生图任务。目前Lib已开放全站的可商用、可在线运行工作流供API使用，您可以在Lib站内工作流合集检索。 在工作流的详情页会出现【本工作流已提供API服务】，且可查看API相关参数。（详情页未出现API参数的工作流，暂不支持API调用） 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void submitComfyTaskTest() throws ApiException {
        ComfyRequest comfyRequest = null;
        SubmitComfyResponse response = api.submitComfyTask(comfyRequest);
        // TODO: test validations
    }

    /**
     * 提交图生图任务
     *
     * 提交图生图任务，生成图片
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void submitImageToImageTest() throws ApiException {
        ImageToImageRequest imageToImageRequest = null;
        SubmitResponse response = api.submitImageToImage(imageToImageRequest);
        // TODO: test validations
    }

    /**
     * 提交文生图任务
     *
     * 提交文生图任务，生成图片
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void submitTextToImageTest() throws ApiException {
        TextToImageRequest textToImageRequest = null;
        SubmitResponse response = api.submitTextToImage(textToImageRequest);
        // TODO: test validations
    }

    /**
     * 星流Star-3 Alpha图生图
     *
     * 根据提供的文本提示词和参数生成图片
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void submitTextToImageUltraTest() throws ApiException {
        TextToImageUltraRequest textToImageUltraRequest = null;
        SubmitResponse response = api.submitTextToImageUltra(textToImageUltraRequest);
        // TODO: test validations
    }

}
