# |<<

**权限规则 (sm_permission_rule / nc.vo.uap.rbac.rule.PermissionRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5332.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rule | 主键 | pk_rule | char(20) | √ | 主键 (UFID) |
| 2 | ruledesc | 规则描述 | ruledesc | image |  | BLOB (BLOB) |
| 3 | ruletype | 规则类型 | ruletype | varchar(20) |  | 规则类型 (PermissionRuleType) |