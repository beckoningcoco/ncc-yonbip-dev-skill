# |<<

**客商银行账户信息 (bd_bankaccbas / nc.vo.bd.bankaccount.BankAccbasVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/347.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bankaccbas | 客商银行账户主键 | pk_bankaccbas | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | accnum | 账号 | accnum | varchar(40) |  | 字符串 (String) |
| 5 | accname | 户名 | accname | varchar(200) |  | 字符串 (String) |
| 6 | pk_bankdoc | 开户银行 | pk_bankdoc | varchar(20) |  | 银行档案 (bankdoc) |
| 7 | pk_banktype | 银行类别 | pk_banktype | varchar(20) |  | 银行类别 (banktype) |
| 8 | accclass | 账户分类 | accclass | smallint |  | 账户分类 (accclass) |  | 0=个人; |