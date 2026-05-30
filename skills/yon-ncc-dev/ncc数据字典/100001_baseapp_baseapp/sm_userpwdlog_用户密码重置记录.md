# |<<

**用户密码重置记录 (sm_userpwdlog / nc.vo.uap.rbac.UserPasswordLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5369.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_userpwdlog | 主键 | pk_userpwdlog | char(20) | √ | 主键 (UFID) |
| 2 | cuserid | 被重置用户 | cuserid | varchar(20) |  | 用户 (user) |
| 3 | modifier | 操作员 | modifier | varchar(20) |  | 用户 (user) |
| 4 | modifiedtime | 重置时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |