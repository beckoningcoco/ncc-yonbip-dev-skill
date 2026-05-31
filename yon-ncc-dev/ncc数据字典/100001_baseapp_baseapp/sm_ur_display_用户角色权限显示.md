# |<<

**用户角色权限显示 (sm_ur_display / nc.vo.uap.rbac.UserRolePermDisplayVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5356.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_user_role | 主键 | pk_user_role | char(20) | √ | 主键 (UFID) |
| 2 | cuserid | 用户 | cuserid | varchar(20) |  | 用户 (user) |
| 3 | pk_role | 角色主键 | pk_role | varchar(20) |  | 角色 (Role) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | enabledate | 关联生效日期 | enabledate | char(19) |  | 日期(开始) (UFDateBegin) |
| 6 | disabledate | 关联失效日期 | disabledate | char(19) |  | 日期(结束) (UFDateEnd) |
| 7 | role_name | 角色名称 | role_name | varchar(50) |  | 字符串 (String) |
| 8 | role_code | 角色编码 | role_code | varchar(50) |  | 字符串 (String) |
| 9 | assignresps | 关联职责 | assignresps | varchar(20) |  | 职责 (Responsibility) |
| 10 | assignorgs | 关联组织 | assignorgs | varchar(20) |  | 组织 (org) |
| 11 | creator | 授权人 | creator | varchar(20) |  | 用户 (user) |
| 12 | creationtime | 授权时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |