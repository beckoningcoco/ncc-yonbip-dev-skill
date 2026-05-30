# |<<

**权限规则 (bq_permission / uap.vo.bq.pub.security.dataperm.Permission)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1263.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk | 主键 | pk | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | describe | 描述 | describe | varchar(200) |  | 字符串 (String) |
| 4 | pk_role | 角色主键 | pk_role | varchar(20) |  | 角色 (Role) |
| 5 | resourceid | 资源主键 | resourceid | varchar(50) |  | 字符串 (String) |
| 6 | resourcetypeid | 资源类型主键 | resourcetypeid | varchar(50) |  | 字符串 (String) |
| 7 | ruletypeid | 规则类型主键 | ruletypeid | varchar(50) |  | 字符串 (String) |
| 8 | permissionmodel | 规则条件模型 | permissionmodel | image |  | BLOB (BLOB) |
| 9 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 10 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 11 | creator | 创建用户 | creator | varchar(20) |  | 用户 (user) |
| 12 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 13 | modifier | 修改用户 | modifier | varchar(20) |  | 用户 (user) |
| 14 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |