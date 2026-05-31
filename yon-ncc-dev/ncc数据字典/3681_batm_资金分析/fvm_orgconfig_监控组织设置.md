# |<<

**监控组织设置 (fvm_orgconfig / nc.vo.batm.config.OrgConfigVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2332.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_orgconfig | 主键 | pk_orgconfig | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 组织PK | pk_org | varchar(20) |  | 组织 (org) |
| 3 | pk_role | 角色PK | pk_role | varchar(20) |  | 角色 (Role) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org_v | 组织版本PK | pk_org_v | char(20) |  | 主键 (UFID) |
| 6 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 7 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 8 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 9 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |