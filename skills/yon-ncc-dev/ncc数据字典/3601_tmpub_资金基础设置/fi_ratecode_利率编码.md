# |<<

**利率编码 (fi_ratecode / nc.vo.fi.rateconfig.RateCodeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2204.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ratecode | 主键 | pk_ratecode | char(20) | √ | 主键 (UFID) |
| 2 | pk_alter | 利率版本PK | pk_alter | varchar(50) |  | 字符串 (String) |
| 3 | rateid | 利率编码 | rateid | varchar(50) |  | 字符串 (String) |
| 4 | ratetype | 利率类型 | ratetype | varchar(50) |  | 利率类型 (ratetype) |  | CRATE=活期存款利率; |