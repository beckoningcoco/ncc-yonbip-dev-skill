# |<<

**银行账户子户分配 (fvm_bankaccassign / nc.vo.batm.config.BankaccAssignVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2329.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bankaccassign | 银行账户分配主键 | pk_bankaccassign | varchar(50) | √ | 字符串 (String) |
| 2 | pk_orgassign | 分配目标组织 | pk_orgassign | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_role | 角色 | pk_role | varchar(20) |  | 用户角色 (userrole) |
| 5 | pk_bankaccsub | 银行账户子户 | pk_bankaccsub | varchar(20) |  | 银行账户子户 (bankaccsub) |