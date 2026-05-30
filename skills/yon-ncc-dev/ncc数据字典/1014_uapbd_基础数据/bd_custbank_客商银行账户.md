# |<<

**客商银行账户 (bd_custbank / nc.vo.bd.cust.CustbankVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/434.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_custbank | 客商银行账户主键 | pk_custbank | char(20) | √ | 主键 (UFID) |
| 2 | pk_bankaccbas | 银行账户主键 | pk_bankaccbas | varchar(20) |  | 客商银行账户信息 (custbankaccbas) |
| 3 | isdefault | 是否默认 | isdefault | char(1) |  | 布尔类型 (UFBoolean) |
| 4 | pk_cust | 客商主键 | pk_cust | varchar(20) |  | 客商 (custsupplier) |
| 5 | accclass | 账户分类 | accclass | int |  | 账户分类 (accclass) |  | 0=个人; |