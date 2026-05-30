# |<<

**客户VAT (bd_custvat / nc.vo.bd.cust.CustvatVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/453.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_custvat | 客户VAT主键 | pk_custvat | varchar(50) | √ | 字符串 (String) |
| 2 | pk_country | 国家 | pk_country | varchar(20) |  | 国家地区 (countryzone) |
| 3 | isvat | VAT注册码 | isvat | char(1) |  | 布尔类型 (UFBoolean) | N |
| 4 | vatcode | 对应VAT注册码 | vatcode | varchar(50) |  | 字符串 (String) |
| 5 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据类型 (datatype) | 0 | 0=系统数据; |