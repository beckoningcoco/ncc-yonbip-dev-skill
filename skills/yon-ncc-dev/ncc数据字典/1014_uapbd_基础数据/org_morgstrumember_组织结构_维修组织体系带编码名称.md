# |<<

**组织结构_维修组织体系带编码名称 (org_morgstrumember / nc.vo.ambd.morgstru.MaintainOrgStruWithCodeNameVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4101.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_morgstrumember | 维修组织体系成员主键 | pk_morgstrumember | char(20) | √ | 主键 (UFID) |
| 2 | pk_fatherorg | 上级组织 | pk_fatherorg | varchar(20) |  | 组织 (org) |
| 3 | pk_morgstru | 维修组织体系主键 | pk_morgstru | varchar(20) |  | 组织结构_维修组织体系 (maintainorgstru) |
| 4 | pk_org | 对应组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | innercode | 内部编码 | innercode | varchar(50) |  | 字符串 (String) |
| 6 | pk_fathermember | 上级成员 | pk_fathermember | varchar(20) |  | 组织结构_维修组织体系成员 (maintainorgstrumember) |
| 7 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 8 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 9 | virtualorg | 虚组织 | virtualorg | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | pk_entityorg | 对应实体组织 | pk_entityorg | varchar(20) |  | 组织 (org) |
| 11 | plan_flag | 编制计划 | plan_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | pk_user | 负责用户 | pk_user | varchar(20) |  | 用户 (user) |
| 13 | pk_role | 负责角色 | pk_role | varchar(20) |  | 角色 (Role) |
| 14 | idx | 排列顺序 | idx | int |  | 整数 (Integer) |
| 15 | pk_vid | 成员版本主键 | pk_vid | varchar(50) |  | 字符串 (String) |
| 16 | pk_svid | 体系版本主键 | pk_svid | varchar(20) |  | 组织结构_维修组织体系版本 (maintainorgstru_v) |
| 17 | vname | 版本名称 | vname | varchar(50) |  | 字符串 (String) |
| 18 | vno | 版本号 | vno | varchar(50) |  | 字符串 (String) |
| 19 | vstartdate | 版本生效日期 | vstartdate | char(19) |  | 日期 (UFDate) |
| 20 | venddate | 版本失效日期 | venddate | char(19) |  | 日期 (UFDate) |
| 21 | islastversion | 是否最新版本 | islastversion | char(1) |  | 布尔类型 (UFBoolean) |
| 22 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 23 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 24 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 25 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |