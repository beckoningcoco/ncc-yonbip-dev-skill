# |<<

**规则执行 (cca_execrule / nc.vo.cca.execrule.ExecRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1280.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_execrule | 主键 | pk_execrule | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_setofbook | 账簿类型 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 5 | pk_accountingbook | 核算账簿 | pk_accountingbook | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 6 | ruletype | 规则类型 | ruletype | int |  | 规则类型 (RuletypeEnum) |  | 1=分摊规则; |