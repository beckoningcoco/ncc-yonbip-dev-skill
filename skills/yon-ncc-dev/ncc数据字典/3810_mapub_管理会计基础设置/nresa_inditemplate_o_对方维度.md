# |<<

**对方维度 (nresa_inditemplate_o / nc.vo.mapub.indi.inditemplate.IndiTemplateOtherVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3871.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_inditemplate_o | 对方维度主键 | pk_inditemplate_o | char(20) | √ | 主键 (UFID) |
| 2 | orderno | 顺序号 | orderno | int |  | 整数 (Integer) |
| 3 | pk_entity | 维度编码 | pk_entity | varchar(50) |  | 实体 (entity) |
| 4 | entityname | 维度名称 | entityname | varchar(50) |  | 字符串 (String) |
| 5 | displayname | 显示名称 | displayname | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | bisnull | 允许为空 | bisnull | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | biswritelast | 允许录入非末级 | biswritelast | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | bismainorg | 是否主组织 | bismainorg | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | classid | 维度ID | classid | varchar(50) |  | 字符串 (String) |
| 10 | mappingtable | 对应表名 | mappingtable | varchar(50) |  | 字符串 (String) |
| 11 | mappingcolumn | 对应列名 | mappingcolumn | varchar(50) |  | 字符串 (String) |
| 12 | mappingclass | 对应类名 | mappingclass | varchar(50) |  | 字符串 (String) |
| 13 | etype | 维度类型 | etype | varchar(50) |  | 维度类型 (IndiDimEnum) |  | base=基本数据类型; |