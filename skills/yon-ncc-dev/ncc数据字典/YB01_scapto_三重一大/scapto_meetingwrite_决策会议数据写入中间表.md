# |<<

**决策会议数据写入中间表 (scapto_meetingwrite / nc.vo.scapto.meeting.write.MeetingWriteVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5164.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_meetingwrite | 决策会议数据写入中间表主键 | pk_meetingwrite | char(20) | √ | 主键 (UFID) |
| 2 | meeting_id | 决策会议标识 | meeting_id | varchar(50) | √ | 字符串 (String) |
| 3 | company_name | 企业名称 | company_name | varchar(512) |  | 字符串 (String) |
| 4 | company_id | 企业编码 | company_id | varchar(64) | √ | 字符串 (String) |
| 5 | meeting_name | 会议名称 | meeting_name | varchar(1024) | √ | 字符串 (String) |
| 6 | meeting_code | 会议编码 | meeting_code | varchar(64) |  | 字符串 (String) |
| 7 | meeting_type_name | 会议类型 | meeting_type_name | varchar(100) |  | 字符串 (String) |
| 8 | meeting_type_code | 会议类型编码 | meeting_type_code | varchar(50) |  | 字符串 (String) |
| 9 | meeting_form | 会议形式 | meeting_form | varchar(100) |  | 字符串 (String) |
| 10 | meeting_time | 会议时间 | meeting_time | varchar(50) |  | 字符串 (String) |
| 11 | release_time | 会议纪要印发时间 | release_time | varchar(50) |  | 字符串 (String) |
| 12 | moderator | 主持人 | moderator | varchar(50) |  | 字符串 (String) |
| 13 | remark | 备注 | remark | varchar(2000) |  | 字符串 (String) |
| 14 | nc_ts | 最后修改时间 | nc_ts | char(19) |  | 日期时间 (UFDateTime) |
| 15 | upload_time | 上传时间 | upload_time | char(19) |  | 日期时间 (UFDateTime) |
| 16 | upload_flag | 上传标识 | upload_flag | varchar(50) |  | 上传标识 (UploadFlagEnum) |  | 0=没上传; |