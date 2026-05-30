# |<<

**用户组 (sm_usergroup / nc.vo.uap.rbac.UserGroupVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5364.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_usergroup | 用户组主键 | pk_usergroup | char(20) | √ | 主键 (UFID) |
| 2 | groupcode | 用户组编码 | groupcode | varchar(200) |  | 字符串 (String) |
| 3 | groupname | 用户组名称 | groupname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | parentid | 上级用户组 | parentid | varchar(20) |  | 用户组 (userGroup) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | innercode | 内部码 | innercode | varchar(200) |  | 字符串 (String) |
| 8 | dataoriginflag | 分布式 | dataoriginflag | int |  | 整数 (Integer) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |