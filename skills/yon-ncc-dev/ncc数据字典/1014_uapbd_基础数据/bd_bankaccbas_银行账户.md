# |<<

**银行账户 (bd_bankaccbas / nc.vo.bd.bankaccount.BankAccbasVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/348.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bankaccbas | 银行账户主键 | pk_bankaccbas | char(20) | √ | 主键 (UFID) |
| 2 | isinneracc | 是否内部账户 | isinneracc | char(1) |  | 布尔类型 (UFBoolean) |
| 3 | accclass | 账户分类 | accclass | smallint |  | 账户分类 (accclass) |  | 0=个人; |