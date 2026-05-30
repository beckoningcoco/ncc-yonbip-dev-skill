# |<<

**银行账户规则控制 (cmp_bankaccrule / nc.vo.cmp.bankaccrule.BankaccRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1534.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bankaccrule | 账户规则控制主键 | pk_bankaccrule | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_bankaccbas | 银行主账户主键 | pk_bankaccbas | varchar(20) |  | 银行账户 (bankaccount) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org_v | 组织多版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |