# |<<

**个人银行账户子户 (bd_bankaccsub / nc.vo.bd.bankaccount.BankAccSubVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/349.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bankaccsub | 个人银行账户子户主键 | pk_bankaccsub | char(20) | √ | 主键 (UFID) |
| 2 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 3 | pk_bankaccbas | 个人银行账户信息主键 | pk_bankaccbas | varchar(20) |  | 个人银行账户信息 (psnbankaccbas) |
| 4 | acctype | 账户类型 | acctype | smallint |  | 账户类型 (accounttype) |  | 0=活期; |