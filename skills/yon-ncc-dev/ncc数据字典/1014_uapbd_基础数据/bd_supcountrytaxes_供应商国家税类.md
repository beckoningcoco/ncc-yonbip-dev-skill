# |<<

**供应商国家税类 (bd_supcountrytaxes / nc.vo.bd.supplier.SupCountryTaxesVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/973.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_supcountrytaxes | 供应商国家税类主键 | pk_supcountrytaxes | varchar(50) | √ | 字符串 (String) |
| 2 | pk_country | 国家 | pk_country | varchar(20) |  | 国家地区 (countryzone) |
| 3 | pk_taxes | 税类 | pk_taxes | varchar(20) |  | 供应商税类 (suptaxes) |
| 4 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |