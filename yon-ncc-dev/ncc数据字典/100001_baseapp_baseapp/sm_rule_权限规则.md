# |<<

**权限规则 (sm_rule / nc.vo.uap.rbac.rule.RbacRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5345.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rule | 规则主键 | pk_rule | char(20) | √ | 主键 (UFID) |
| 2 | type | 规则类型 | type | varchar(50) |  | 字符串 (String) |
| 3 | ruleclass | 规则实现类 | ruleclass | varchar(200) |  | 字符串 (String) |
| 4 | rulename | 规则名称 | rulename | varchar(50) |  | 字符串 (String) |
| 5 | rulecode | 规则编码 | rulecode | varchar(50) |  | 字符串 (String) |