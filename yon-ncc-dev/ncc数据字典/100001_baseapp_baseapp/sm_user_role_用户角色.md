# |<<

**用户角色 (sm_user_role / nc.vo.uap.rbac.UserRoleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5362.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_user_role | 用户角色主键 | pk_user_role | char(20) | √ | 主键 (UFID) |
| 2 | cuserid | 管理员 | cuserid | varchar(20) |  | 用户 (user) |
| 3 | pk_role | 角色 | pk_role | varchar(20) |  | 角色 (Role) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | enabledate | 关联生效日期 | enabledate | char(19) |  | 日期(开始) (UFDateBegin) |
| 6 | disabledate | 关联失效日期 | disabledate | char(19) |  | 日期(结束) (UFDateEnd) |
| 7 | creator | 授权人 | creator | varchar(20) |  | 用户 (user) |
| 8 | creationtime | 授权时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |