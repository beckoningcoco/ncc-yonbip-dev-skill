# |<<

**会议参会人数据中间表 (scapto_meetuploadapprove / nc.vo.scapto.meetingreport.meetingupload.MeetUploadApproveVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5171.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | attendee_id | 参会人标识主键 | attendee_id | char(20) | √ | 主键 (UFID) |
| 2 | attendee_name | 参会人姓名 | attendee_name | varchar(1024) |  | 字符串 (String) |
| 3 | reason | 缺席原因 | reason | varchar(512) |  | 字符串 (String) |
| 4 | upload_time | 上传时间 | upload_time | char(19) |  | 日期时间 (UFDateTime) |
| 5 | upload_flag | 上传标识 | upload_flag | varchar(50) |  | 上传标识 (UploadFlagEnum) |  | 0=没上传; |