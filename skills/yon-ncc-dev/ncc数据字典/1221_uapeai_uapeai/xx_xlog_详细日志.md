# |<<

**详细日志 (xx_xlog / nc.vo.pfxx.xlog.XlogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6390.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | 详细日志主键 | id | char(20) | √ | 主键 (UFID) |
| 2 | doc_type | 单据类型 | doc_type | varchar(50) |  | 字符串 (String) |
| 3 | doc_source | 发送方 | doc_source | varchar(50) |  | 字符串 (String) |
| 4 | doc_destination | 接收方 | doc_destination | varchar(500) |  | 字符串 (String) |
| 5 | doc_id | 单据编号 | doc_id | varchar(50) |  | 字符串 (String) |
| 6 | doc_time | 日期 | doc_time | char(19) |  | 日期时间 (UFDateTime) |
| 7 | filename | 发送文件名 | filename | varchar(500) |  | 字符串 (String) |
| 8 | correct | 是否成功接收 | correct | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | doc_dscpt | 描述 | doc_dscpt | varchar(1000) |  | 字符串 (String) |
| 10 | busibill | 业务单据返回值 | busibill | varchar(500) |  | 字符串 (String) |
| 11 | starttime | 开始时间 | starttime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | fileid | 文档编号 | fileid | varchar(50) |  | 字符串 (String) |
| 13 | indocpath | 原始文档路径 | indocpath | varchar(500) |  | 字符串 (String) |
| 14 | transdocpath | 翻译后文档路径 | transdocpath | varchar(500) |  | 字符串 (String) |