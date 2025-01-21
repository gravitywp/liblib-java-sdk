

# ControlNet


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**unitOrder** | **Integer** | 执行顺序 |  [optional] |
|**sourceImage** | **String** | 参考图地址 |  [optional] |
|**width** | **Integer** | 参考图宽度 |  [optional] |
|**height** | **Integer** | 参考图高度 |  [optional] |
|**preprocessor** | **Integer** | 预处理器枚举值 |  [optional] |
|**annotationParameters** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**model** | **String** | controlnet的模型 |  [optional] |
|**controlWeight** | **Float** | 控制权重 |  [optional] |
|**startingControlStep** | **Integer** | 开始控制步数 |  [optional] |
|**endingControlStep** | **Integer** | 结束控制步数 |  [optional] |
|**pixelPerfect** | **Integer** | 完美像素 |  [optional] |
|**controlMode** | **Integer** | 控制模式，0均衡，1更注重提示词，2更注重controlnet |  [optional] |
|**resizeMode** | **Integer** | 缩放模式，0拉伸，1裁剪，2填充 |  [optional] |
|**maskImage** | **String** | 蒙版图 |  [optional] |



