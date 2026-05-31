# |<<

**归档单据设置 (pmdoc_config / nc.vo.pmdoc.docconfig.DocConfigVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4571.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pkconf | 主键 | pkconf | char(20) | √ | 主键 (UFID) |
| 2 | fileitfname | 附件上传扩展接口 | fileitfname | varchar(300) |  | 字符串 (String) |
| 3 | detailitfname | 联查NCC查询接口 | detailitfname | varchar(300) |  | 字符串 (String) |
| 4 | billtypes | 单据编码 | billtypes | varchar(20) |  | 单据类型 (BilltypeVO) |
| 5 | architfname | 归档策略扩展接口 | architfname | varchar(300) |  | 字符串 (String) |
| 6 | archfields | 归档字段 | archfields | varchar(200) |  | 字符串 (String) |
| 7 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 8 | billmaketime | 制单日期 | billmaketime | char(19) |  | 日期 (UFDate) |
| 9 | ispreset | 是否预置数据 | ispreset | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 11 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 13 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 14 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |