

# TextToImageUltraRequestGenerateParams


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**prompt** | **String** | 正向提示词，文本 |  |
|**aspectRatio** | [**AspectRatioEnum**](#AspectRatioEnum) | 图片宽高比预设，与imageSize二选一配置即可 |  [optional] |
|**imageSize** | [**TextToImageUltraRequestGenerateParamsImageSize**](TextToImageUltraRequestGenerateParamsImageSize.md) |  |  [optional] |
|**imgCount** | **Integer** | 单次生图张数 |  |
|**steps** | **Integer** | 采样步数 |  [optional] |
|**controlnet** | [**UltraControlNet**](UltraControlNet.md) |  |  [optional] |



## Enum: AspectRatioEnum

| Name | Value |
|---- | -----|
| SQUARE | &quot;square&quot; |
| PORTRAIT | &quot;portrait&quot; |
| LANDSCAPE | &quot;landscape&quot; |



