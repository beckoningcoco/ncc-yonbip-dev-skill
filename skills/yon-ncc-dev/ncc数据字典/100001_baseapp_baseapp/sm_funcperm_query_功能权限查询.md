# |<<

**功能权限查询 (sm_funcperm_query / nc.vo.uap.funcpermquery.FuncPermQueryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5304.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_funcperm_query | 主键 | pk_funcperm_query | char(20) | √ | 主键 (UFID) |
| 2 | cuserid | 用户 | cuserid | varchar(20) |  | 用户 (user) |
| 3 | pk_role | 角色 | pk_role | varchar(20) |  | 角色 (Role) |
| 4 | roleorgperms | 角色已分配组织 | roleorgperms | varchar(200) |  | 字符串 (String) |
| 5 | pk_responsibility | 职责 | pk_responsibility | varchar(20) |  | 职责 (Responsibility) |
| 6 | funcode | 功能 | funcode | varchar(50) |  | 字符串 (String) |
| 7 | pk_org | 已分配组织 | pk_org | varchar(20) |  | 组织 (org) |
| 8 | orgtype | 组织类型 | orgtype | varchar(50) |  | 字符串 (String) |
| 9 | relateroles | 关联角色 | relateroles | varchar(50) |  | 字符串 (String) |
| 10 | systype | 系统类型 | systype | varchar(50) |  | 字符串 (String) |
| 11 | type | 业务功能类型 | type | int |  | 功能类型 (respfuncenum) |  | 0=功能节点; |