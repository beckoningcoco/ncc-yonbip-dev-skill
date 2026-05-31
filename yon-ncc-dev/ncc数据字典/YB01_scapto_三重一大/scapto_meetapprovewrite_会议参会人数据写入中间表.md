# |<<

**会议参会人数据写入中间表 (scapto_meetapprovewrite / nc.vo.scapto.meeting.write.MeetApproveWriteVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5157.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_meetapprovewrite | 会议参会人数据写入主键 | pk_meetapprovewrite | char(20) | √ | 主键 (UFID) |
| 2 | attendee_id | 会议参会人标识 | attendee_id | varchar(50) | √ | 字符串 (String) |
| 3 | meeting_id | 决策会议标识 | meeting_id | varchar(50) | √ | 字符串 (String) |
| 4 | attendee_name | 参会人姓名 | attendee_name | varchar(1024) |  | 字符串 (String) |
| 5 | reason | 缺席原因 | reason | varchar(512) |  | 字符串 (String) |
| 6 | upload_time | 上传时间 | upload_time | char(19) |  | 日期时间 (UFDateTime) |
| 7 | upload_flag | 上传标识 | upload_flag | varchar(50) |  | 上传标识 (UploadFlagEnum) |  | 0=没上传; |