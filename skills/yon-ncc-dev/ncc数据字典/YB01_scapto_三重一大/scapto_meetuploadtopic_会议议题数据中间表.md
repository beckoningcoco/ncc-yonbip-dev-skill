# |<<

**会议议题数据中间表 (scapto_meetuploadtopic / nc.vo.scapto.meetingreport.meetingupload.MeetUploadTopicVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5173.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | subject_id | 会议议题标识主键 | subject_id | char(20) | √ | 主键 (UFID) |
| 2 | subject_order | 审议议题序号 | subject_order | varchar(64) |  | 字符串 (String) |
| 3 | subject_code | 议题编码 | subject_code | varchar(100) |  | 字符串 (String) |
| 4 | subject_name | 议题名称 | subject_name | varchar(1024) |  | 字符串 (String) |
| 5 | source_name | 任务来源 | source_name | varchar(1024) |  | 字符串 (String) |
| 6 | special_name | 专项名称 | special_name | varchar(1024) |  | 字符串 (String) |
| 7 | item_code | 事项编码 | item_code | varchar(128) |  | 字符串 (String) |
| 8 | rel_company_id | 关联企业编码 | rel_company_id | varchar(64) |  | 字符串 (String) |
| 9 | rel_subject_code | 关联议题编码 | rel_subject_code | varchar(64) |  | 字符串 (String) |
| 10 | pass_flag | 是否通过 | pass_flag | varchar(50) |  | 字符串 (String) |
| 11 | approval_flag | 报国资委 | approval_flag | varchar(50) |  | 字符串 (String) |
| 12 | adopt_flag | 是否听取意见 | adopt_flag | varchar(50) |  | 字符串 (String) |
| 13 | subject_result | 议题决议 | subject_result | varchar(1024) |  | 字符串 (String) |
| 14 | supervise_flag | 是否需要督办 | supervise_flag | varchar(50) |  | 字符串 (String) |
| 15 | remark | 备注 | remark | varchar(2000) |  | 字符串 (String) |
| 16 | nc_ts | 最后修改时间 | nc_ts | char(19) |  | 日期时间 (UFDateTime) |
| 17 | upload_time | 上传时间 | upload_time | char(19) |  | 日期时间 (UFDateTime) |
| 18 | upload_flag | 上传标识 | upload_flag | varchar(50) |  | 上传标识 (UploadFlagEnum) |  | 0=没上传; |