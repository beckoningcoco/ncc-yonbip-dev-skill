# |<<

**编制维度 (hrp_dimension / nc.vo.hrp.budgetdimension.DimensionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2735.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dimension | 项目主键 | pk_dimension | char(20) | √ | 主键 (UFID) |
| 2 | pk_dim_doc | 编制维度档案主键 | pk_dim_doc | varchar(20) |  | 编制维度档案 (DimensionDocVO) |
| 3 | dim_attr | 编制维度属性 | dim_attr | int |  | 编制维度属性 (DimensionAttr) | 1 | 0=编制维度档案; |