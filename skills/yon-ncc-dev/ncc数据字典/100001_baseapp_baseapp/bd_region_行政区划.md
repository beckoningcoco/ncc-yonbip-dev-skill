# |<<

**行政区划 (bd_region / nc.vo.bd.region.RegionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/954.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_region | 行政区划主键 | pk_region | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | char(20) | √ | 组织 (org) |
| 4 | code | 行政区划编码 | code | varchar(40) | √ | 字符串 (String) |
| 5 | name | 行政区划名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 6 | shortname | 简称 | shortname | varchar(50) |  | 字符串 (String) |
| 7 | memcode | 助记码 | memcode | varchar(50) |  | 字符串 (String) |
| 8 | pk_father | 上级行政区划 | pk_father | varchar(20) |  | 行政区划 (region) |
| 9 | pk_timezone | 时区 | pk_timezone | varchar(20) |  | 时区 (timezone) |
| 10 | zipcode | 邮编 | zipcode | varchar(50) |  | 字符串 (String) |
| 11 | pk_lang | 语种 | pk_lang | varchar(20) |  | 语种信息 (MultiLang) |
| 12 | pk_format | 数据格式 | pk_format | varchar(20) |  | 数据格式 (formatdoc) |
| 13 | innercode | 内部编码 | innercode | varchar(200) |  | 字符串 (String) |
| 14 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 2 | 1=未启用; |