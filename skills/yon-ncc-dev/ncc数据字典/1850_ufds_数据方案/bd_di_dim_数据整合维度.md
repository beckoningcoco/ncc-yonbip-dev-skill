# |<<

**数据整合维度 (bd_di_dim / nc.vo.bd.intdata.scheme.DIDimensionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/793.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dimension | 数据整合维度主键 | pk_dimension | char(20) | √ | 主键 (UFID) |
| 2 | pk_scheme | 所属整合方案 | pk_scheme | varchar(20) |  | 财务数据方案 (dataintschema) |
| 3 | metadataid | 元数据编号 | metadataid | varchar(50) |  | 字符串 (String) |
| 4 | displayname | 显示名称 | displayname | varchar(50) |  | 字符串 (String) |
| 5 | defaultmember | 默认成员Pk | defaultmember | varchar(20) |  | 字符串 (String) |
| 6 | dftmembername | 默认成员名称 | dftmembername | varchar(50) |  | 字符串 (String) |
| 7 | dimcode | 维度编码 | dimcode | varchar(50) |  | 字符串 (String) |
| 8 | dimtype | 维度类型 | dimtype | varchar(50) |  | 字符串 (String) |
| 9 | modulecode | 模块编码 | modulecode | varchar(50) |  | 字符串 (String) |
| 10 | isdefdoc | 自定档案 | isdefdoc | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | isdeafault | 预置 | isdeafault | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | isanadim | 分析维度 | isanadim | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 14 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 15 | id | 构造id | id | varchar(50) |  | 字符串 (String) |
| 16 | type_name | 维度分类名称 | type_name | varchar(50) |  | 字符串 (String) |
| 17 | type_dir_order | 分类顺序 | type_dir_order | int |  | 整数 (Integer) |
| 18 | dimorder | 维度顺序 | dimorder | int |  | 整数 (Integer) |
| 19 | smartmodelpk | 语义模型主键 | smartmodelpk | varchar(50) |  | 字符串 (String) |
| 20 | isreclassify | 是否重分类 | isreclassify | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 22 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 23 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 24 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |