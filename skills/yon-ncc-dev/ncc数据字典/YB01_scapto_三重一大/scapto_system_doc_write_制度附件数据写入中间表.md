# |<<

**制度附件数据写入中间表 (scapto_system_doc_write / nc.vo.scapto.system.write.SystemDocWriteVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5187.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_system_doc_write | 制度附件写入主键 | pk_system_doc_write | char(20) | √ | 主键 (UFID) |
| 2 | file_id | 制度附件标识 | file_id | varchar(50) | √ | 字符串 (String) |
| 3 | regulation_id | 制度标识 | regulation_id | varchar(50) | √ | 字符串 (String) |
| 4 | file_type | 文件类型 | file_type | varchar(50) |  | 字符串 (String) |
| 5 | file_name | 文件名称 | file_name | varchar(200) |  | 字符串 (String) |
| 6 | file_path | 文件存放路径 | file_path | varchar(500) |  | 字符串 (String) |
| 7 | upload_time | 上传时间 | upload_time | char(19) |  | 日期时间 (UFDateTime) |
| 8 | upload_flag | 上传标识 | upload_flag | varchar(50) |  | 字符串 (String) |
| 9 | pk_system_doc | 附件主键 | pk_system_doc | varchar(20) |  | 字符串 (String) |
| 10 | vmemo | 备注 | vmemo | varchar(1024) |  | 备注 (Memo) |
| 11 | vreserve1 | 预留字段1 | vreserve1 | varchar(100) |  | 字符串 (String) |
| 12 | vreserve2 | 预留字段2 | vreserve2 | varchar(100) |  | 字符串 (String) |
| 13 | vreserve3 | 预留字段3 | vreserve3 | varchar(100) |  | 字符串 (String) |
| 14 | vreserve4 | 预留字段4 | vreserve4 | varchar(100) |  | 字符串 (String) |
| 15 | vreserve5 | 预留字段5 | vreserve5 | varchar(100) |  | 字符串 (String) |
| 16 | vreserve6 | 预留字段6 | vreserve6 | varchar(100) |  | 字符串 (String) |
| 17 | vreserve7 | 预留字段7 | vreserve7 | varchar(100) |  | 字符串 (String) |
| 18 | vreserve8 | 预留字段8 | vreserve8 | varchar(100) |  | 字符串 (String) |
| 19 | vreserve9 | 预留字段9 | vreserve9 | varchar(100) |  | 字符串 (String) |
| 20 | vreserve10 | 预留字段10 | vreserve10 | varchar(100) |  | 字符串 (String) |