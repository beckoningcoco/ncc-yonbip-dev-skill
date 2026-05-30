# |<<

**维度映射关系详情 (cca_dimension_b / nc.vo.mapub.dimension.DimensionBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1278.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dimension_b | 维度映射关系详情 | pk_dimension_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_dimension | 维度设置 | pk_dimension | varchar(20) |  | 预算维度设置 (mapub_dimension) |
| 3 | code | 维度编码 | code | varchar(50) |  | 字符串 (String) |
| 4 | name | 维度名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | type | 类型 | type | int |  | 维度指标类型 (DimTypeEnum) |  | 1=维度; |