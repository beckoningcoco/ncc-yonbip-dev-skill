# |<<

**维度属性 (tb_dimprop / nc.vo.mdm.dim.DimProp)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5715.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | 主键 | pk_obj | char(20) | √ | 主键 (UFID) |
| 2 | propid | 编码 | propid | varchar(50) |  | 字符串 (String) |
| 3 | propname | 名称 | propname | varchar(100) |  | 多语文本 (MultiLangText) |
| 4 | pk_dimlevel | 维度层次 | pk_dimlevel | char(20) |  | 主键 (UFID) |
| 5 | table_name | 数据库表 | table_name | varchar(30) |  | 字符串 (String) |
| 6 | colname | 数据库字段 | colname | varchar(30) |  | 字符串 (String) |
| 7 | datatype | 数据类型 | datatype | varchar(30) |  | 字符串 (String) |
| 8 | keyprop | key属性标志 | keyprop | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | codeprop | code属性标志 | codeprop | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | nameprop | name属性标志 | nameprop | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | treekeyprop | 树键属性标志 | treekeyprop | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | treefatherkeyprop | 树上级键属性标志 | treefatherkeyprop | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | issystem | 系统预置 | issystem | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | metaprop | 元数据属性 | metaprop | char(1) |  | 布尔类型 (UFBoolean) |