# |<<

**可管理资源 (sm_admin_resource / nc.vo.uap.rbac.authres.AdminResourceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5272.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_admin_resource | 可管理资源PK | pk_admin_resource | char(20) | √ | 主键 (UFID) |
| 2 | admin_role_id | 角色 | admin_role_id | varchar(20) |  | 角色 (Role) |
| 3 | resourceid | 资源 | resourceid | varchar(20) |  | 权限资源 (PermissionResource) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | creator | 授权人 | creator | varchar(20) |  | 用户 (user) |
| 7 | creationtime | 授权时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |