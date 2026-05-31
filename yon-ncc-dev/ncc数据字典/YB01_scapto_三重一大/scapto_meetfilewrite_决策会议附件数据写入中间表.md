# |<<

**决策会议附件数据写入中间表 (scapto_meetfilewrite / nc.vo.scapto.meeting.write.MeetFileWriteVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5158.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_meetfilewrite | 决策会议附件数据写入中间表主键 | pk_meetfilewrite | char(20) | √ | 主键 (UFID) |
| 2 | file_id | 附件子表标识 | file_id | varchar(50) | √ | 字符串 (String) |
| 3 | file_type | 文件类型 | file_type | varchar(400) |  | 字符串 (String) |
| 4 | file_path | 文件存放路径 | file_path | varchar(2000) |  | 字符串 (String) |
| 5 | upload_time | 上传时间 | upload_time | char(19) |  | 日期时间 (UFDateTime) |
| 6 | upload_flag | 上传标识 | upload_flag | varchar(50) |  | 上传标识 (UploadFlagEnum) |  | 0=没上传; |