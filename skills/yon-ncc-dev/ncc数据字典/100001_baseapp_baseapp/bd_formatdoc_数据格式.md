# |<<

**数据格式 (bd_formatdoc / nc.vo.bd.format.FormatDocVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/845.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_formatdoc | 档案主键 | pk_formatdoc | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 字符串 (String) |
| 3 | code | 编码 | code | varchar(40) | √ | 字符串 (String) |
| 4 | name | 名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 5 | description | 描述 | description | varchar(200) |  | 字符串 (String) |
| 6 | is_default | 默认格式 | is_default | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | formatdef | 格式定义 | formatdef | image |  | BLOB (BLOB) |
| 8 | exp_number | 数字格式 | exp_number | varchar(128) |  | 字符串 (String) |
| 9 | exp_currency | 货币格式 | exp_currency | varchar(128) |  | 字符串 (String) |
| 10 | exp_date | 日期格式 | exp_date | varchar(128) |  | 字符串 (String) |
| 11 | exp_time | 时间格式 | exp_time | varchar(128) |  | 字符串 (String) |
| 12 | exp_address | 地址格式 | exp_address | varchar(128) |  | 字符串 (String) |
| 13 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |