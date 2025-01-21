# DefaultApi

All URIs are relative to *https://openapi.liblibai.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getComfyStatus**](DefaultApi.md#getComfyStatus) | **POST** /api/generate/comfy/status | 查询 comfy 生图结果 |
| [**getModelVersion**](DefaultApi.md#getModelVersion) | **POST** /api/model/version/get | 查询模型版本参数 |
| [**getStatus**](DefaultApi.md#getStatus) | **POST** /api/generate/webui/status | 查询生图任务状态 |
| [**submitComfyTask**](DefaultApi.md#submitComfyTask) | **POST** /api/generate/comfyui/app | 提交 ComfyUI 工作流生图任务 |
| [**submitImageToImage**](DefaultApi.md#submitImageToImage) | **POST** /api/generate/webui/img2img | 提交图生图任务 |
| [**submitTextToImage**](DefaultApi.md#submitTextToImage) | **POST** /api/generate/webui/text2img | 提交文生图任务 |
| [**submitTextToImageUltra**](DefaultApi.md#submitTextToImageUltra) | **POST** /api/generate/webui/text2img/ultra | 星流Star-3 Alpha图生图 |


<a id="getComfyStatus"></a>
# **getComfyStatus**
> ComfyStatusResponse getComfyStatus(body)

查询 comfy 生图结果

根据生图任务uuid查询生图任务的状态和结果

### Example
```java
// Import classes:
import org.liblib.openapi.client.ApiClient;
import org.liblib.openapi.client.ApiException;
import org.liblib.openapi.client.Configuration;
import org.liblib.openapi.client.auth.*;
import org.liblib.openapi.client.models.*;
import org.liblib.openapi.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.liblibai.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String body = "body_example"; // String | 查询请求参数
    try {
      ComfyStatusResponse result = apiInstance.getComfyStatus(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getComfyStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **String**| 查询请求参数 | [optional] |

### Return type

[**ComfyStatusResponse**](ComfyStatusResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功 |  -  |
| **400** | 请求参数错误 |  -  |
| **500** | 服务器内部错误 |  -  |

<a id="getModelVersion"></a>
# **getModelVersion**
> VersionResponse getModelVersion(getModelVersionRequest)

查询模型版本参数

查询指定的模型版本参数。目前Lib已开放全站的可商用模型供API使用，您可以在Lib站内检索可商用的Checkpoint和LoRA模型。 选择喜欢的模型版本，从浏览器网址中复制versionUuid，粘贴到文生图或图生图的参数模板中使用。 若您忘记了在生图参数中应用的模型是哪一款，您可以调用本接口进行查询。 

### Example
```java
// Import classes:
import org.liblib.openapi.client.ApiClient;
import org.liblib.openapi.client.ApiException;
import org.liblib.openapi.client.Configuration;
import org.liblib.openapi.client.auth.*;
import org.liblib.openapi.client.models.*;
import org.liblib.openapi.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.liblibai.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    GetModelVersionRequest getModelVersionRequest = new GetModelVersionRequest(); // GetModelVersionRequest | 查询请求参数
    try {
      VersionResponse result = apiInstance.getModelVersion(getModelVersionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getModelVersion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **getModelVersionRequest** | [**GetModelVersionRequest**](GetModelVersionRequest.md)| 查询请求参数 | [optional] |

### Return type

[**VersionResponse**](VersionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功 |  -  |
| **404** | 未找到模型 |  -  |
| **400** | 请求参数错误 |  -  |

<a id="getStatus"></a>
# **getStatus**
> StatusResponse getStatus(body)

查询生图任务状态

根据生图任务uuid查询生图任务的状态和相关信息

### Example
```java
// Import classes:
import org.liblib.openapi.client.ApiClient;
import org.liblib.openapi.client.ApiException;
import org.liblib.openapi.client.Configuration;
import org.liblib.openapi.client.auth.*;
import org.liblib.openapi.client.models.*;
import org.liblib.openapi.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.liblibai.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String body = "body_example"; // String | 查询请求参数
    try {
      StatusResponse result = apiInstance.getStatus(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **String**| 查询请求参数 | [optional] |

### Return type

[**StatusResponse**](StatusResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功 |  -  |
| **400** | 请求参数错误 |  -  |
| **500** | 服务器内部错误 |  -  |

<a id="submitComfyTask"></a>
# **submitComfyTask**
> SubmitComfyResponse submitComfyTask(comfyRequest)

提交 ComfyUI 工作流生图任务

提交 ComfyUI 工作流生图任务。目前Lib已开放全站的可商用、可在线运行工作流供API使用，您可以在Lib站内工作流合集检索。 在工作流的详情页会出现【本工作流已提供API服务】，且可查看API相关参数。（详情页未出现API参数的工作流，暂不支持API调用） 

### Example
```java
// Import classes:
import org.liblib.openapi.client.ApiClient;
import org.liblib.openapi.client.ApiException;
import org.liblib.openapi.client.Configuration;
import org.liblib.openapi.client.auth.*;
import org.liblib.openapi.client.models.*;
import org.liblib.openapi.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.liblibai.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    ComfyRequest comfyRequest = new ComfyRequest(); // ComfyRequest | ComfyUI 工作流生图任务请求参数
    try {
      SubmitComfyResponse result = apiInstance.submitComfyTask(comfyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#submitComfyTask");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **comfyRequest** | [**ComfyRequest**](ComfyRequest.md)| ComfyUI 工作流生图任务请求参数 | [optional] |

### Return type

[**SubmitComfyResponse**](SubmitComfyResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功 |  -  |
| **400** | 请求参数错误 |  -  |
| **500** | 服务器内部错误 |  -  |

<a id="submitImageToImage"></a>
# **submitImageToImage**
> SubmitResponse submitImageToImage(imageToImageRequest)

提交图生图任务

提交图生图任务，生成图片

### Example
```java
// Import classes:
import org.liblib.openapi.client.ApiClient;
import org.liblib.openapi.client.ApiException;
import org.liblib.openapi.client.Configuration;
import org.liblib.openapi.client.auth.*;
import org.liblib.openapi.client.models.*;
import org.liblib.openapi.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.liblibai.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    ImageToImageRequest imageToImageRequest = new ImageToImageRequest(); // ImageToImageRequest | 图生图任务请求参数
    try {
      SubmitResponse result = apiInstance.submitImageToImage(imageToImageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#submitImageToImage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **imageToImageRequest** | [**ImageToImageRequest**](ImageToImageRequest.md)| 图生图任务请求参数 | [optional] |

### Return type

[**SubmitResponse**](SubmitResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功 |  -  |
| **400** | 请求参数错误 |  -  |
| **500** | 服务器内部错误 |  -  |

<a id="submitTextToImage"></a>
# **submitTextToImage**
> SubmitResponse submitTextToImage(textToImageRequest)

提交文生图任务

提交文生图任务，生成图片

### Example
```java
// Import classes:
import org.liblib.openapi.client.ApiClient;
import org.liblib.openapi.client.ApiException;
import org.liblib.openapi.client.Configuration;
import org.liblib.openapi.client.auth.*;
import org.liblib.openapi.client.models.*;
import org.liblib.openapi.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.liblibai.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    TextToImageRequest textToImageRequest = new TextToImageRequest(); // TextToImageRequest | 文生图任务请求参数
    try {
      SubmitResponse result = apiInstance.submitTextToImage(textToImageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#submitTextToImage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **textToImageRequest** | [**TextToImageRequest**](TextToImageRequest.md)| 文生图任务请求参数 | [optional] |

### Return type

[**SubmitResponse**](SubmitResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功 |  -  |
| **400** | 请求参数错误 |  -  |
| **500** | 服务器内部错误 |  -  |

<a id="submitTextToImageUltra"></a>
# **submitTextToImageUltra**
> SubmitResponse submitTextToImageUltra(textToImageUltraRequest)

星流Star-3 Alpha图生图

根据提供的文本提示词和参数生成图片

### Example
```java
// Import classes:
import org.liblib.openapi.client.ApiClient;
import org.liblib.openapi.client.ApiException;
import org.liblib.openapi.client.Configuration;
import org.liblib.openapi.client.auth.*;
import org.liblib.openapi.client.models.*;
import org.liblib.openapi.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.liblibai.cloud");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    TextToImageUltraRequest textToImageUltraRequest = new TextToImageUltraRequest(); // TextToImageUltraRequest | 生图请求参数
    try {
      SubmitResponse result = apiInstance.submitTextToImageUltra(textToImageUltraRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#submitTextToImageUltra");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **textToImageUltraRequest** | [**TextToImageUltraRequest**](TextToImageUltraRequest.md)| 生图请求参数 | [optional] |

### Return type

[**SubmitResponse**](SubmitResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功 |  -  |
| **400** | 请求参数错误 |  -  |
| **500** | 服务器内部错误 |  -  |

