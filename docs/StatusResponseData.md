

# StatusResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**generateUuid** | **String** | 生图任务uuid，使用该uuid查询生图进度 |  [optional] |
|**generateStatus** | **GenerateStatus** |  |  [optional] |
|**percentCompleted** | **Float** | 生图进度，0到1之间的浮点数，（暂未实现） |  [optional] |
|**generateMsg** | **String** | 生图信息，提供附加信息，如生图失败信息 |  [optional] |
|**pointsCost** | **Integer** | 本次生图任务消耗积分数 |  [optional] |
|**accountBalance** | **Integer** | 账户剩余积分数 |  [optional] |
|**images** | [**List&lt;Image&gt;**](Image.md) |  |  [optional] |



