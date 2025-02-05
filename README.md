# openapi-java-client

LiblibAI API
- API version: 1.0.0
  - Build date: 2025-01-21T17:23:45.937473883+08:00[Asia/Shanghai]
  - Generator version: 7.10.0

LiblibAI x 星流 图像大模型API


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>cloud.liblibai.openapi</groupId>
  <artifactId>java-sdk</artifactId>
  <version>0.0.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "cloud.liblibai.openai:java-sdk:0.0.1"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Set LIBLIB_ACCESS_KEY and LIBLIB_SECRET_KEY enviroments, or pass AccessKey and SecretKey argument

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import cloud.liblibai.client.LibLib;
import cloud.liblibai.openapi.client.ApiException;
import cloud.liblibai.openapi.client.model.*;

public class Example {
  public static void main(String[] args) throws ApiException, InterruptedException {
    LibLib api = new LibLib(); //Read LIBLIB_ACCESS_KEY and LIBLIB_SECRET_KEY from env
    //LibLib api = new LibLib("access_key", "secret_key")
    TextToImageRequest request = new TextToImageRequest();
    TextToImageRequestGenerateParams params = new TextToImageRequestGenerateParams();
    params.prompt("1 girl").imgCount(2);
    request.generateParams(params);
    request.templateUuid("6f7c4652458d4802969f8d089cf5b91f");

    //NOTE(gz): 异步 SDK 调用方法
    SubmitResponse submitResponse = api.submitTextToImage(request);
    while(true) {
      StatusResponse status = api.getStatus(new StatusRequest().generateUuid(submitResponse.getData().getGenerateUuid()));
      System.out.println(status);
      if (status.getData().getGenerateStatus() == GenerateStatus.SUCCEED) {
        System.out.println(status.getData().getImages());
        break;
      }
      Thread.sleep(5000);
    }

    //NOTE(gz): 同步 SDK 调用方法
    StatusResponseData statusResponseData = api.textToImage(request);
    if (statusResponseData.getGenerateStatus() == GenerateStatus.SUCCEED) {
      System.out.println(statusResponseData.getImages());
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://openapi.liblibai.cloud*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**getComfyStatus**](docs/DefaultApi.md#getComfyStatus) | **POST** /api/generate/comfy/status | 查询 comfy 生图结果
*DefaultApi* | [**getModelVersion**](docs/DefaultApi.md#getModelVersion) | **POST** /api/model/version/get | 查询模型版本参数
*DefaultApi* | [**getStatus**](docs/DefaultApi.md#getStatus) | **POST** /api/generate/webui/status | 查询生图任务状态
*DefaultApi* | [**submitComfyTask**](docs/DefaultApi.md#submitComfyTask) | **POST** /api/generate/comfyui/app | 提交 ComfyUI 工作流生图任务
*DefaultApi* | [**submitImageToImage**](docs/DefaultApi.md#submitImageToImage) | **POST** /api/generate/webui/img2img | 提交图生图任务
*DefaultApi* | [**submitTextToImage**](docs/DefaultApi.md#submitTextToImage) | **POST** /api/generate/webui/text2img | 提交文生图任务
*DefaultApi* | [**submitTextToImageUltra**](docs/DefaultApi.md#submitTextToImageUltra) | **POST** /api/generate/webui/text2img/ultra | 星流Star-3 Alpha图生图


## Documentation for Models

 - [AdditionalNetwork](docs/AdditionalNetwork.md)
 - [AuditStatus](docs/AuditStatus.md)
 - [ComfyNodeParams](docs/ComfyNodeParams.md)
 - [ComfyRequest](docs/ComfyRequest.md)
 - [ComfyStatusResponse](docs/ComfyStatusResponse.md)
 - [ComfyStatusResponseData](docs/ComfyStatusResponseData.md)
 - [ComfyStatusResponseDataVideosInner](docs/ComfyStatusResponseDataVideosInner.md)
 - [ControlNet](docs/ControlNet.md)
 - [GenerateStatus](docs/GenerateStatus.md)
 - [GetModelVersion400Response](docs/GetModelVersion400Response.md)
 - [GetModelVersion404Response](docs/GetModelVersion404Response.md)
 - [GetModelVersionRequest](docs/GetModelVersionRequest.md)
 - [Image](docs/Image.md)
 - [ImageToImageRequest](docs/ImageToImageRequest.md)
 - [ImageToImageRequestGenerateParams](docs/ImageToImageRequestGenerateParams.md)
 - [NodeImage](docs/NodeImage.md)
 - [StatusResponse](docs/StatusResponse.md)
 - [StatusResponseData](docs/StatusResponseData.md)
 - [SubmitComfyResponse](docs/SubmitComfyResponse.md)
 - [SubmitComfyResponseData](docs/SubmitComfyResponseData.md)
 - [SubmitResponse](docs/SubmitResponse.md)
 - [SubmitResponseData](docs/SubmitResponseData.md)
 - [TextToImageRequest](docs/TextToImageRequest.md)
 - [TextToImageRequestGenerateParams](docs/TextToImageRequestGenerateParams.md)
 - [TextToImageRequestGenerateParamsHiResFixInfo](docs/TextToImageRequestGenerateParamsHiResFixInfo.md)
 - [TextToImageRequestGenerateParamsInpaintParam](docs/TextToImageRequestGenerateParamsInpaintParam.md)
 - [TextToImageUltraRequest](docs/TextToImageUltraRequest.md)
 - [TextToImageUltraRequestGenerateParams](docs/TextToImageUltraRequestGenerateParams.md)
 - [TextToImageUltraRequestGenerateParamsImageSize](docs/TextToImageUltraRequestGenerateParamsImageSize.md)
 - [UltraControlNet](docs/UltraControlNet.md)
 - [VersionResponse](docs/VersionResponse.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="ApiKeyAuth"></a>
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: AccessKey
- **Location**: URL query string


## Recommendation

## Author



