# |<<

**组织实施附件数据写入中间表 (scapto_implementfilewrite / nc.vo.scapto.implement.write.ImplementFileWriteVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5135.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_implementfilewrite | 组织实施附件数据写入主键 | pk_implementfilewrite | char(20) | √ | 主键 (UFID) |
| 2 | file_id | 组织实施附件标识 | file_id | varchar(50) | √ | 字符串 (String) |
| 3 | file_type | 文件类型 | file_type | varchar(50) |  | 字符串 (String) |
| 4 | file_name | 文件名称 | file_name | varchar(200) |  | 字符串 (String) |
| 5 | file_path | 文件存放路径 | file_path | varchar(500) |  | 字符串 (String) |
| 6 | upload_time | 上传时间 | upload_time | char(19) |  | 日期时间 (UFDateTime) |
| 7 | upload_flag | 上传标识 | upload_flag | varchar(50) |  | 字符串 (String) |
| 8 | pk_system_doc | 附件主键 | pk_system_doc | varchar(20) |  | 字符串 (String) |
| 9 | execution_id | 组织实施标识 | execution_id | varchar(50) | √ | 字符串 (String) |