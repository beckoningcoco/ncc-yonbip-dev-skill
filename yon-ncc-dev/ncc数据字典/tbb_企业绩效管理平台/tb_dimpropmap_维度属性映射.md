# |<<

**维度属性映射 (tb_dimpropmap / nc.vo.mdm.dim.DimPropMap)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5716.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | 主键 | pk_obj | char(20) | √ | 主键 (UFID) |
| 2 | pk_dimdef | 维度定义 | pk_dimdef | char(20) |  | 主键 (UFID) |
| 3 | levelcode | 层次编码 | levelcode | varchar(30) |  | 字符串 (String) |
| 4 | propid | 属性ID | propid | varchar(30) |  | 字符串 (String) |
| 5 | dbtablename | 数据库表 | dbtablename | varchar(38) |  | 字符串 (String) |
| 6 | dbcol | 数据库列 | dbcol | varchar(30) |  | 字符串 (String) |
| 7 | beanid | 元数据ID | beanid | varchar(60) |  | 字符串 (String) |
| 8 | proppath | 查询路径 | proppath | varchar(150) |  | 字符串 (String) |