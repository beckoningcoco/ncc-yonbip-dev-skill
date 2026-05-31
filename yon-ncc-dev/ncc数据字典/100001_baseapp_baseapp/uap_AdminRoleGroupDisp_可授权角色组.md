# |<<

**可授权角色组 (uap_AdminRoleGroupDisp / nc.vo.uap.rbac.authres.AdminRoleGroupDisplayValueObject)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5838.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | rolegroup_code | 角色组编码 | rolegroup_code | varchar(200) | √ | 字符串 (String) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | rolegroup_name | 角色组名称 | rolegroup_name | varchar(200) |  | 字符串 (String) |
| 4 | ismaintainable | 可维护 | ismaintainable | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | isusable | 可使用 | isusable | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | respk | 资源PK | respk | varchar(50) |  | 字符串 (String) |
| 7 | ruletype | 规则类型 | ruletype | varchar(50) |  | 字符串 (String) |
| 8 | rulepar | 规则参数 | rulepar | varchar(50) |  | 字符串 (String) |
| 9 | isrule | 是否规则 | isrule | varchar(50) |  | 字符串 (String) |