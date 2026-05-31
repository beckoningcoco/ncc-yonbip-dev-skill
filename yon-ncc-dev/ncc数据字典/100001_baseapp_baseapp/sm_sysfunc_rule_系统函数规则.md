# |<<

**系统函数规则 (sm_sysfunc_rule / nc.vo.uap.rbac.rule.SysFuncRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5351.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sysfunc_rule | 主键 | pk_sysfunc_rule | char(20) | √ | 主键 (UFID) |
| 2 | sysfunc_code | 系统函数编码 | sysfunc_code | varchar(50) |  | 字符串 (String) |
| 3 | permissionruleid | 关联权限规则 | permissionruleid | varchar(20) |  | 权限规则 (PermissionRule) |