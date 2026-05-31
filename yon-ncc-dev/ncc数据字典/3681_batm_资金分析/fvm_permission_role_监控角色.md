# |<<

**监控角色 (fvm_permission_role / nc.vo.batm.permissionconfig.PermissionRoleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2334.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_permission_role | 监控角色主键 | pk_permission_role | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_role | 角色主键 | pk_role | varchar(20) |  | 角色 (Role) |
| 5 | role_type | 角色类型 | role_type | int |  | 整数 (Integer) |
| 6 | creator | 引入人 | creator | varchar(20) |  | 用户 (user) |
| 7 | creationtime | 引入时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 8 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 9 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |