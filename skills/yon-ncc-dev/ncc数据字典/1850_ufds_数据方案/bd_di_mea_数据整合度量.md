# |<<

**数据整合度量 (bd_di_mea / nc.vo.bd.intdata.scheme.DIMeasureVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/794.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_measure | 数据整合度量主键 | pk_measure | char(20) | √ | 主键 (UFID) |
| 2 | pk_scheme | 所属整合方案 | pk_scheme | varchar(50) |  | 字符串 (String) |
| 3 | measurecode | 度量编码 | measurecode | varchar(50) |  | 字符串 (String) |
| 4 | displayname | 显示名称 | displayname | varchar(50) |  | 字符串 (String) |
| 5 | modulecode | 模块编码 | modulecode | varchar(50) |  | 字符串 (String) |
| 6 | isstandard | 标准度量 | isstandard | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 8 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 9 | id | 构造结构id | id | varchar(50) |  | 字符串 (String) |
| 10 | type_name | 度量分类 | type_name | varchar(50) |  | 字符串 (String) |
| 11 | type_order | 分类顺序 | type_order | varchar(50) |  | 字符串 (String) |
| 12 | meaorder | 度量顺序 | meaorder | int |  | 整数 (Integer) |
| 13 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 14 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 15 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 16 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |