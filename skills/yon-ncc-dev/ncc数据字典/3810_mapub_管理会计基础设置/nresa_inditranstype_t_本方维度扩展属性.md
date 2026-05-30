# |<<

**本方维度扩展属性 (nresa_inditranstype_t / nc.vo.mapub.indi.inditranstype.IndiTransTypeThisVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3876.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_inditranstypethis | 本方维度扩展属性主键 | pk_inditranstypethis | char(20) | √ | 主键 (UFID) |
| 2 | pk_inditemplate_t | 本方维度 | pk_inditemplate_t | varchar(20) |  | 字符串 (String) |
| 3 | orderno | 顺序号 | orderno | varchar(50) |  | 字符串 (String) |
| 4 | pk_entity | 维度编码 | pk_entity | varchar(20) |  | 实体 (entity) |
| 5 | entityname | 维度名称 | entityname | varchar(50) |  | 字符串 (String) |
| 6 | displayname | 显示名称 | displayname | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | bisnull | 允许为空 | bisnull | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | biswritelast | 允许录入非末级 | biswritelast | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | bismainorg | 是否主组织 | bismainorg | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | classid | 维度ID | classid | varchar(50) |  | 字符串 (String) |
| 11 | mappingtable | 对应表名 | mappingtable | varchar(50) |  | 字符串 (String) |
| 12 | mappingcolumn | 对应列名 | mappingcolumn | varchar(50) |  | 字符串 (String) |
| 13 | mappingclass | 对应类名 | mappingclass | varchar(50) |  | 字符串 (String) |
| 14 | etype | 维度类型 | etype | varchar(50) |  | 维度类型 (IndiDimEnum) |  | base=基本数据类型; |