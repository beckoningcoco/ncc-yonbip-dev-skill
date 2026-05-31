# |<<

**数据整合数据来源 (bd_di_datasource / nc.vo.bd.intdata.scheme.DIDataSourceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/792.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | dspk | 数据来源主键 | dspk | char(20) | √ | 主键 (UFID) |
| 2 | datatype | 数据类型 | datatype | varchar(20) |  | DI数据类型 (didatatype) |
| 3 | smartmodelpk | 语义模型主键 | smartmodelpk | varchar(20) |  | 字符串 (String) |
| 4 | datasourcecode | 数据来源 | datasourcecode | varchar(50) |  | 数据来源模块 (didsenum) |
| 5 | fetchdatarule | 取数规则 | fetchdatarule | varchar(400) |  | 字符串 (String) |
| 6 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | rule | 取数规则内容 | rule | image |  | BLOB (BLOB) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |