# |<<

**使用权委托关系 (pam_usedunitorg / nc.vo.am.usedunitorg.UsedUnitOrgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4341.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_usedunitorg | 使用权委托关系主键 | pk_usedunitorg | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 4 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 5 | pk_usedunit_v | 使用权 | pk_usedunit_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 6 | pk_usedunit | 使用权最新版本 | pk_usedunit | varchar(20) |  | 组织 (org) |
| 7 | pk_usedorg_v | 使用管理组织 | pk_usedorg_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 8 | pk_usedorg | 使用管理组织最新版本 | pk_usedorg | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 9 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 10 | def1 | 自定义项1 | def1 | varchar(128) |  | 字符串 (String) |
| 11 | def2 | 自定义项2 | def2 | varchar(128) |  | 字符串 (String) |
| 12 | def3 | 自定义项3 | def3 | varchar(128) |  | 字符串 (String) |
| 13 | def4 | 自定义项4 | def4 | varchar(128) |  | 字符串 (String) |
| 14 | def5 | 自定义项5 | def5 | varchar(128) |  | 字符串 (String) |
| 15 | def6 | 自定义项6 | def6 | varchar(128) |  | 字符串 (String) |
| 16 | def7 | 自定义项7 | def7 | varchar(128) |  | 字符串 (String) |
| 17 | def8 | 自定义项8 | def8 | varchar(128) |  | 字符串 (String) |
| 18 | def9 | 自定义项9 | def9 | varchar(128) |  | 字符串 (String) |
| 19 | def10 | 自定义项10 | def10 | varchar(128) |  | 字符串 (String) |
| 20 | def11 | 自定义项11 | def11 | varchar(128) |  | 字符串 (String) |
| 21 | def12 | 自定义项12 | def12 | varchar(128) |  | 字符串 (String) |
| 22 | def13 | 自定义项13 | def13 | varchar(128) |  | 字符串 (String) |
| 23 | def14 | 自定义项14 | def14 | varchar(128) |  | 字符串 (String) |
| 24 | def15 | 自定义项15 | def15 | varchar(128) |  | 字符串 (String) |
| 25 | def16 | 自定义项16 | def16 | varchar(128) |  | 字符串 (String) |
| 26 | def17 | 自定义项17 | def17 | varchar(128) |  | 字符串 (String) |
| 27 | def18 | 自定义项18 | def18 | varchar(128) |  | 字符串 (String) |
| 28 | def19 | 自定义项19 | def19 | varchar(128) |  | 字符串 (String) |
| 29 | def20 | 自定义项20 | def20 | varchar(128) |  | 字符串 (String) |
| 30 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 31 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 32 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 33 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |