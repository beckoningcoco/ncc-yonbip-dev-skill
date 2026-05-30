# |<<

**角色组 (sm_role_group / nc.vo.uap.rbac.role.RoleGroupVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5341.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_role_group | 角色组主键 | pk_role_group | char(20) | √ | 主键 (UFID) |
| 2 | group_code | 角色组编码 | group_code | varchar(50) |  | 字符串 (String) |
| 3 | group_name | 角色组名称 | group_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | parent_code | 上级角色组 | parent_code | varchar(20) |  | 角色组 (RoleGroup) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | group_type | 角色组类型 | group_type | integer |  | 角色类型枚举 (roletypeenum) |  | 0=管理类角色; |