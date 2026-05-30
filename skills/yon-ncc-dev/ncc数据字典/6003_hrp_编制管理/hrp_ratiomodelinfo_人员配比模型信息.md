# |<<

**人员配比模型信息 (hrp_ratiomodelinfo / nc.vo.hrp.forecast.RatioModelInfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2746.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ratiomodelinfo | 人员配比模型信息主键 | pk_ratiomodelinfo | char(20) | √ | 主键 (UFID) |
| 2 | pk_ratiomodel | 人员配比模型主键 | pk_ratiomodel | char(20) |  | 主键 (UFID) |
| 3 | pk_dimensiondef | 维度定义主键 | pk_dimensiondef | varchar(20) |  | 编制维度子表 (DimensionDef) |
| 4 | count_dimen | 人数 | count_dimen | int |  | 整数 (Integer) |  | [0 , 99999999] |
| 5 | ratio | 比例（%） | ratio | decimal(7, 4) |  | 数值 (UFDouble) |  | [0 , 99999999] |