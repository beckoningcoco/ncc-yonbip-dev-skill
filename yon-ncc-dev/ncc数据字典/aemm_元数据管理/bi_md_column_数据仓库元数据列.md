# |<<

**数据仓库元数据列 (bi_md_column / nc.vo.bi.meta.MetaColumn)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1199.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | guid | 列标识 | guid | char(20) | √ | 主键 (UFID) |
| 2 | tableguid | 表标识 | tableguid | varchar(50) |  | 字符串 (String) |
| 3 | columnname | 列名 | columnname | varchar(50) |  | 字符串 (String) |
| 4 | displayname | 显示名 | displayname | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | columnprecision | 长度 | columnprecision | int |  | 整数 (Integer) |
| 6 | columnscale | 小数位 | columnscale | int |  | 整数 (Integer) |
| 7 | nullable | 空置 | nullable | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | pkey | 主键 | pkey | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | defaultvalue | 默认值 | defaultvalue | varchar(50) |  | 字符串 (String) |
| 10 | columnindex | 列索引 | columnindex | int |  | 整数 (Integer) |
| 11 | note | 注释 | note | varchar(1024) |  | 备注 (Memo) |
| 12 | dbcolumntype | 列类型 | dbcolumntype | int |  | 整数 (Integer) |
| 13 | datatype | 数据类型 | datatype | varchar(50) |  | 数据类型 (数据类型) |  | 1=数据类型; |