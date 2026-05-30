# |<<

**用户应用 (sm_user_app / nc.vo.platform.workbench.UserAppVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5358.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_user_app | 主键 | pk_user_app | char(20) | √ | 主键 (UFID) |
| 2 | cuserid | 用户id | cuserid | varchar(20) |  | 用户 (user) |
| 3 | position | 位置 | position | varchar(50) |  | 字符串 (String) |
| 4 | pk_appregister | 应用注册id | pk_appregister | varchar(50) |  | 字符串 (String) |
| 5 | has_power | 是否有权限 | has_power | varchar(50) |  | 字符串 (String) |
| 6 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 7 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 8 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 9 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |