# |<<

**自由报表查询方案 (iufo_querycasedefine / nc.vo.iufo.freereport.QueryCaseDefineVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3486.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_casedefine | 查询方案主键 | pk_casedefine | char(20) | √ | 主键 (UFID) |
| 2 | name | 查询方案名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | pk_user | 用户主键 | pk_user | varchar(50) |  | 字符串 (String) |
| 4 | pk_func | 功能节点主键 | pk_func | varchar(50) |  | 字符串 (String) |
| 5 | pk_report | 报表主键 | pk_report | varchar(50) |  | 字符串 (String) |
| 6 | casedefine | 查询条件定义 | casedefine | image |  | BLOB (BLOB) |
| 7 | isinit | 是否预置 | isinit | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | isdefault | 是否默认 | isdefault | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 10 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 11 | creator | 创建用户 | creator | varchar(20) |  | 用户 (user) |
| 12 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 13 | modifier | 修改用户 | modifier | varchar(20) |  | 用户 (user) |
| 14 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |