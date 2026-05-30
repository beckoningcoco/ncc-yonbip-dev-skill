# |<<

**议题审批人数据写入中间表 (scapto_topicapprwrite / nc.vo.scapto.meeting.write.TopicApprWriteVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5194.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_topicapprwrite | 议题审议人数据写入中间表主键 | pk_topicapprwrite | char(20) | √ | 主键 (UFID) |
| 2 | deliberation_id | 议题审议人标识 | deliberation_id | varchar(50) | √ | 字符串 (String) |
| 3 | deliberation_personnel | 审议人姓名 | deliberation_personnel | varchar(1024) |  | 字符串 (String) |
| 4 | deliberation_result | 审议结果 | deliberation_result | varchar(200) |  | 字符串 (String) |
| 5 | upload_time | 上传时间 | upload_time | char(19) |  | 日期时间 (UFDateTime) |
| 6 | upload_flag | 上传标识 | upload_flag | varchar(50) |  | 上传标识 (UploadFlagEnum) |  | 0=没上传; |