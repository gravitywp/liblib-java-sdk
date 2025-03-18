

# TextToImageRequestGenerateParams


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**checkPointId** | **String** | 底模 modelVersionUUID |  [optional] |
|**prompt** | **String** | 正向提示词，文本 |  [optional] |
|**negativePrompt** | **String** | 负向提示词，文本 |  [optional] |
|**sampler** | **Integer** | 采样方法 |  [optional] |
|**steps** | **Integer** | 采样步数 |  [optional] |
|**cfgScale** | **Double** | 提示词引导系数 |  [optional] |
|**width** | **Integer** | 图片宽度 |  [optional] |
|**height** | **Integer** | 图片高度 |  [optional] |
|**imgCount** | **Integer** | 图片数量 |  [optional] |
|**randnSource** | **Integer** | 随机种子生成器 0 cpu，1 Gpu |  [optional] |
|**seed** | **Integer** | 随机种子值，-1表示随机 |  [optional] |
|**restoreFaces** | **Integer** | 面部修复，0关闭，1开启 |  [optional] |
|**additionalNetwork** | [**List&lt;AdditionalNetwork&gt;**](AdditionalNetwork.md) |  |  [optional] |
|**hiResFixInfo** | [**TextToImageRequestGenerateParamsHiResFixInfo**](TextToImageRequestGenerateParamsHiResFixInfo.md) |  |  [optional] |
|**controlNet** | [**List&lt;ControlNet&gt;**](ControlNet.md) |  |  [optional] |



