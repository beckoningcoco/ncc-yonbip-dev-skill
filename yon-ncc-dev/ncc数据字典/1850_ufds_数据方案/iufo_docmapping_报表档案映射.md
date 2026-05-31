# |<<

**报表档案映射 (iufo_docmapping / nc.vo.iufo.docmapping.DIDocMappingVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3420.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_docmapping | 主键 | pk_docmapping | char(20) | √ | 字符串 (String) |
| 2 | dsname | 数据源名称 | dsname | varchar(50) |  | 字符串 (String) |
| 3 | pk_dim | 维度 | pk_dim | varchar(20) |  | 报表档案映射维度 (docdim) |
| 4 | proptype | 映射类型 | proptype | varchar(10) |  | 字符串 (String) |
| 5 | attribute | 属性 | attribute | varchar(50) |  | 字符串 (String) |
| 6 | pk_data | 基本档案 | pk_data | varchar(50) |  | 字符串 (String) |
| 7 | owndata | 基本档案数据 | owndata | varchar(300) |  | 字符串 (String) |
| 8 | ownname | 基本档案名称 | ownname | varchar(300) |  | 字符串 (String) |
| 9 | owncode | 基本档案编码 | owncode | varchar(300) |  | 字符串 (String) |
| 10 | mapdata | 外部系统数据 | mapdata | varchar(300) |  | 字符串 (String) |
| 11 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 12 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 13 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 14 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 15 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |