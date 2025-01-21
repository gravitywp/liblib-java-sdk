

# GetComfyStatus200ResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountBalance** | **Integer** | 账户剩余积分数 |  [optional] |
|**generateStatus** | **GenerateStatus** |  |  [optional] |
|**generateUuid** | **String** | 生图任务uuid，使用该uuid查询生图进度 |  [optional] |
|**percentCompleted** | **Float** | 生图进度，0到1之间的浮点数 |  [optional] |
|**pointsCost** | **Integer** | 本次生图任务消耗积分数 |  [optional] |
|**images** | [**List&lt;GetComfyStatus200ResponseDataImagesInner&gt;**](GetComfyStatus200ResponseDataImagesInner.md) |  |  [optional] |
|**videos** | [**List&lt;GetComfyStatus200ResponseDataVideosInner&gt;**](GetComfyStatus200ResponseDataVideosInner.md) |  |  [optional] |



