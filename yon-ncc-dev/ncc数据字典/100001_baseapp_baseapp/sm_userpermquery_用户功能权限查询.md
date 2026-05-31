# |<<

**用户功能权限查询 (sm_userpermquery / nc.vo.uap.rbac.query.UserPermissionQueryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5368.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_userpermqry | 主键 | pk_userpermqry | varchar(50) | √ | 字符串 (String) |
| 2 | userid | 用户名称 | userid | varchar(20) |  | 用户 (user) |
| 3 | funcode | 已授予功能 | funcode | varchar(20) |  | 功能实体 (functionEntity) |
| 4 | pk_org | 已授予组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | permman | 授权人 | permman | varchar(20) |  | 用户 (user) |
| 6 | permtime | 授权时间 | permtime | char(19) |  | 日期时间 (UFDateTime) |