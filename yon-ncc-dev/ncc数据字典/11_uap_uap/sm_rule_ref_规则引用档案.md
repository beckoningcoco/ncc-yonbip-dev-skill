# |<<

**规则引用档案 (sm_rule_ref / nc.vo.uap.rbac.rule.RuleRefDocVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5346.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rule_ref | 主键 | pk_rule_ref | char(20) | √ | 主键 (UFID) |
| 2 | pk_rule | 关联规则实例 | pk_rule | varchar(20) |  | 权限规则 (PermissionRule) |
| 3 | refdoc | 参照档案 | refdoc | varchar(50) |  | 字符串 (String) |