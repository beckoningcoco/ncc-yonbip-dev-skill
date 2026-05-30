# |<<

**角色 (sm_role / nc.vo.uap.rbac.role.RoleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5339.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_role | 角色主键 | pk_role | char(20) | √ | 主键 (UFID) |
| 2 | role_code | 角色编码 | role_code | varchar(30) |  | 字符串 (String) |
| 3 | role_memo | 角色备注 | role_memo | varchar(200) |  | 备注 (Memo) |
| 4 | role_name | 角色名称 | role_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | role_type | 角色类型 | role_type | integer |  | 角色类型枚举 (roletypeenum) |  | 0=管理类角色; |