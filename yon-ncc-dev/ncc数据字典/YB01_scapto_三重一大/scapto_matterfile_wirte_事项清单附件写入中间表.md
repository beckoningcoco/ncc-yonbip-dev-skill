# |<<

**事项清单附件写入中间表 (scapto_matterfile_wirte / nc.vo.scapto.matterlistreport.write.MatterfileWirteVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5149.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_filewirte | 事项清单附件写入主键 | pk_filewirte | char(20) | √ | 主键 (UFID) |
| 2 | file_id | 事项清单附件标识 | file_id | varchar(50) | √ | 字符串 (String) |
| 3 | file_type | 文件类型 | file_type | varchar(50) |  | 字符串 (String) |
| 4 | file_path | 文件存放路径 | file_path | varchar(500) |  | 字符串 (String) |
| 5 | file_name | 文件名称 | file_name | varchar(200) |  | 字符串 (String) |
| 6 | upload_time | 上传时间 | upload_time | char(19) |  | 日期时间 (UFDateTime) |
| 7 | upload_flag | 上传标识 | upload_flag | varchar(50) |  | 字符串 (String) |
| 8 | pk_matter_doc | 附件主键 | pk_matter_doc | varchar(20) |  | 字符串 (String) |
| 9 | vmemo | 备注 | vmemo | varchar(1024) |  | 备注 (Memo) |
| 10 | vreserve1 | 预留字段1 | vreserve1 | varchar(100) |  | 字符串 (String) |
| 11 | vreserve2 | 预留字段2 | vreserve2 | varchar(100) |  | 字符串 (String) |
| 12 | vreserve3 | 预留字段3 | vreserve3 | varchar(100) |  | 字符串 (String) |
| 13 | vreserve4 | 预留字段4 | vreserve4 | varchar(100) |  | 字符串 (String) |
| 14 | vreserve5 | 预留字段5 | vreserve5 | varchar(100) |  | 字符串 (String) |
| 15 | vreserve6 | 预留字段6 | vreserve6 | varchar(100) |  | 字符串 (String) |
| 16 | vreserve7 | 预留字段7 | vreserve7 | varchar(100) |  | 字符串 (String) |
| 17 | vreserve8 | 预留字段8 | vreserve8 | varchar(100) |  | 字符串 (String) |
| 18 | vreserve9 | 预留字段9 | vreserve9 | varchar(100) |  | 字符串 (String) |
| 19 | vreserve10 | 预留字段10 | vreserve10 | varchar(100) |  | 字符串 (String) |
| 20 | list_id | 事项清单标识 | list_id | varchar(50) | √ | 字符串 (String) |