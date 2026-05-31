# |<<

**地址簿 (bd_address / nc.vo.bd.address.AddressVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/324.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_address | 主键 | pk_address | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(40) |  | 字符串 (String) |
| 3 | detailinfo | 地址详址 | detailinfo | varchar(200) |  | 字符串 (String) |
| 4 | postcode | 邮政编码 | postcode | varchar(200) |  | 字符串 (String) |
| 5 | country | 国家 | country | varchar(20) |  | 国家地区 (countryzone) |
| 6 | province | 省份 | province | varchar(20) |  | 行政区划 (region) |
| 7 | city | 城市 | city | varchar(20) |  | 行政区划 (region) |
| 8 | vsection | 县区 | vsection | varchar(20) |  | 行政区划 (region) |
| 9 | dataoriginflag | 数据来源 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |