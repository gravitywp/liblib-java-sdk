

# ImageToImageRequestGenerateParams


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vaeId** | **String** | VAE的模型uuid |  [optional] |
|**checkPointId** | **String** | 底模 modelVersionUUID |  [optional] |
|**prompt** | **String** | 正向提示词 |  [optional] |
|**negativePrompt** | **String** | 负向提示词 |  [optional] |
|**clipSkip** | **Integer** | Clip跳过层 |  [optional] |
|**sampler** | **Integer** | 采样方法 |  [optional] |
|**steps** | **Integer** | 采样步数 |  [optional] |
|**cfgScale** | **Double** | 提示词引导系数 |  [optional] |
|**randnSource** | **Integer** | 随机种子来源，0表示CPU，1表示GPU |  [optional] |
|**seed** | **Integer** | 随机种子值，-1表示随机 |  [optional] |
|**imgCount** | **Integer** | 图片数量，1到4 |  [optional] |
|**restoreFaces** | **Integer** | 面部修复，0关闭，1开启 |  [optional] |
|**sourceImage** | **String** | 源图像地址 |  [optional] |
|**resizeMode** | **Integer** | 缩放模式，0拉伸，1裁剪，2填充 |  [optional] |
|**resizedWidth** | **Integer** | 图像缩放后的宽度 |  [optional] |
|**resizedHeight** | **Integer** | 图像缩放后的高度 |  [optional] |
|**mode** | **Integer** | 0图生图，4局部重绘 |  [optional] |
|**denoisingStrength** | **Float** | 重绘幅度 |  [optional] |
|**additionalNetwork** | [**List&lt;AdditionalNetwork&gt;**](AdditionalNetwork.md) |  |  [optional] |
|**inpaintParam** | [**InpaintParams**](InpaintParams.md) |  |  [optional] |
|**controlNet** | [**List&lt;ControlNet&gt;**](ControlNet.md) |  |  [optional] |



