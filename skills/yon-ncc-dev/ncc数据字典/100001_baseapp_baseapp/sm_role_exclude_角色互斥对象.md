# |<<

**角色互斥对象 (sm_role_exclude / nc.vo.uap.rbac.role.RoleExcludeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5340.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_role_exclude | 主键 | pk_role_exclude | char(20) | √ | 字符串 (String) |
| 2 | excluding_role | 互斥角色 | excluding_role | varchar(20) |  | 角色 (Role) |
| 3 | excluded_role | 被互斥角色 | excluded_role | varchar(20) |  | 角色 (Role) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 6 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 7 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 8 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |