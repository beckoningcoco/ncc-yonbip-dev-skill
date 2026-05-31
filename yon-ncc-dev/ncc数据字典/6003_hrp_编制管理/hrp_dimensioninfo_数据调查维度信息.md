# |<<

**数据调查维度信息 (hrp_dimensioninfo / nc.vo.hrp.research.DimensionInfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2739.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dimensioninfo | 数据调查维度信息主键 | pk_dimensioninfo | char(20) | √ | 主键 (UFID) |
| 2 | pk_research | 调查表主键 | pk_research | char(20) |  | 主键 (UFID) |
| 3 | pk_dimension | 编制维度 | pk_dimension | varchar(20) |  | 编制维度 (Dimension) |
| 4 | pk_dimensiondef | 调查项目 | pk_dimensiondef | varchar(20) |  | 编制维度子表 (DimensionDef) |
| 5 | num | 数值 | num | int |  | 整数 (Integer) |  | [0 , 99999999] |
| 6 | ratio | 比例(%) | ratio | decimal(7, 4) |  | 数值 (UFDouble) |