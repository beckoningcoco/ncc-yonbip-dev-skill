# |<<

**客户银行帐号 (bd_custbank / nc.vo.bd.cust.CustbankVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/435.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_custbank | 客户银行主键 | pk_custbank | char(20) | √ | 主键 (UFID) |
| 2 | isdefault | 默认 | isdefault | char(1) |  | 布尔类型 (UFBoolean) |
| 3 | pk_cust | 客户主键 | pk_cust | varchar(20) |  | 客户基本信息 (customer) |
| 4 | accclass | 账户分类 | accclass | int |  | 账户分类 (accclass) |  | 0=个人; |