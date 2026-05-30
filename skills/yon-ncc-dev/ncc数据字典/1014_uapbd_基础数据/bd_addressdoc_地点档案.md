# |<<

**地点档案 (bd_addressdoc / nc.vo.bd.cust.addressdoc.AddressDocVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/326.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_addressdoc | 地点档案主键 | pk_addressdoc | char(20) | √ | 主键 (UFID) |
| 2 | code | 地点编码 | code | varchar(40) | √ | 字符串 (String) |
| 3 | name | 地点名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | simple_name | 地点简称 | simple_name | varchar(200) |  | 字符串 (String) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织 (org) |
| 7 | pk_areacl | 所属地区分类 | pk_areacl | varchar(20) |  | 地区分类 (areaclass) |
| 8 | postcode | 邮政编码 | postcode | varchar(200) |  | 字符串 (String) |
| 9 | country | 所属国家 | country | varchar(20) |  | 国家地区 (countryzone) |
| 10 | province | 所属省份 | province | varchar(20) |  | 行政区划 (region) |
| 11 | city | 所属城市 | city | varchar(20) |  | 行政区划 (region) |
| 12 | region | 所属区县 | region | varchar(20) |  | 行政区划 (region) |
| 13 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 2 | 1=未启用; |