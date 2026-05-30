# |<<

**国家地区 (bd_countryzone / nc.vo.bd.countryzone.CountryZoneVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/413.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_country | 主键 | pk_country | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(40) | √ | 字符串 (String) |
| 3 | codeth | 三位代码 | codeth | varchar(40) | √ | 字符串 (String) |
| 4 | name | 名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 5 | wholename | 全称 | wholename | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | ename | 英文名称 | ename | varchar(200) |  | 字符串 (String) |
| 7 | phonecode | 电话代码 | phonecode | varchar(20) |  | 字符串 (String) |
| 8 | description | 描述 | description | varchar(200) |  | 字符串 (String) |
| 9 | pk_timezone | 时区 | pk_timezone | varchar(20) | √ | 时区 (timezone) |
| 10 | pk_lang | 语种 | pk_lang | varchar(50) | √ | 字符串 (String) |
| 11 | pk_format | 数据格式 | pk_format | varchar(20) |  | 数据格式 (formatdoc) |
| 12 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 13 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |