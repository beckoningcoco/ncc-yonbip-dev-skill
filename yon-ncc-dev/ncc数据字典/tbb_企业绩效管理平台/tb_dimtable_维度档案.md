# |<<

**维度档案 (tb_dimtable / nc.vo.mdm.dim.DimTable)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5717.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | 主键 | pk_obj | char(20) | √ | 主键 (UFID) |
| 2 | pk_dimdef | 维度定义 | pk_dimdef | char(20) |  | 主键 (UFID) |
| 3 | dbtablename | 数据库表 | dbtablename | varchar(38) |  | 字符串 (String) |
| 4 | tabledesc | 中文描述 | tabledesc | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | visible | 是否可见 | visible | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | dbtabletype | 数据表类型 | dbtabletype | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | dbtableclassid | 数据表classID | dbtableclassid | varchar(38) |  | 字符串 (String) |