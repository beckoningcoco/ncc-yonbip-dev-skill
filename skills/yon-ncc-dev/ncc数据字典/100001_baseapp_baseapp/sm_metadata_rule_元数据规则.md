# |<<

**元数据规则 (sm_metadata_rule / nc.vo.uap.rbac.rule.MetaDataRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5321.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_metadata_rule | 主键 | pk_metadata_rule | char(20) | √ | 主键 (UFID) |
| 2 | rule_script | 规则脚本 | rule_script | image |  | BLOB (BLOB) |
| 3 | sql_script | SQL脚本 | sql_script | image |  | BLOB (BLOB) |
| 4 | permissionruleid | 关联权限规则 | permissionruleid | varchar(20) |  | 权限规则 (PermissionRule) |