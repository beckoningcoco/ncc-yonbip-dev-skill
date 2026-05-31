# |<<

**监控账户设置 (fvm_accconfig / nc.vo.batm.config.AccountConfigVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2328.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accconfig | 主键 | pk_accconfig | char(20) | √ | 主键 (UFID) |
| 2 | pk_orgconfig | 监控组织主键 | pk_orgconfig | char(20) |  | 主键 (UFID) |
| 3 | pk_role | 角色主键 | pk_role | varchar(20) |  | 角色 (Role) |
| 4 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_account | 银行账户主键 | pk_account | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 6 | pk_org_v | 组织版本PK | pk_org_v | char(20) |  | 主键 (UFID) |
| 7 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 8 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 10 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |