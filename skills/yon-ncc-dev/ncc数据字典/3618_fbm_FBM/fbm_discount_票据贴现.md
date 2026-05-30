# |<<

**票据贴现 (fbm_discount / nc.vo.fbm.discount.DiscountVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2126.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_discount | 主键 | pk_discount | char(20) | √ | 主键 (UFID) |
| 2 | discountno | 贴现单编号 | discountno | varchar(50) |  | 字符串 (String) |
| 3 | pk_register | 登记表主键 | pk_register | varchar(20) |  | 票据登记 (fbm_register) |
| 4 | pk_billtypecode | 单据类型 | pk_billtypecode | varchar(20) |  | 字符串 (String) |
| 5 | initflag | 期初标识 | initflag | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | busistatus | 票据状态 | busistatus | varchar(30) |  | 票据状态 (RegisterStatusEnum) |  | error=状态错误; |