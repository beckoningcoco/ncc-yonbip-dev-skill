# |<<

**功能权限分配实体 (sm_perm_func / nc.vo.uap.rbac.FuncPermConfigVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5329.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_perm_config | 主键 | pk_perm_config | char(20) | √ | 主键 (UFID) |
| 2 | subjectid | 授权主体 | subjectid | varchar(50) |  | 字符串 (String) |
| 3 | resourceid | 授权资源(废弃) | resourceid | varchar(50) |  | 字符串 (String) |
| 4 | operationcode | 操作编码(废弃) | operationcode | varchar(50) |  | 字符串 (String) |
| 5 | ruleid | 职责 | ruleid | varchar(20) |  | 职责 (Responsibility) |
| 6 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | creator | 授权人 | creator | varchar(20) |  | 用户 (user) |
| 8 | creationtime | 授权时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |