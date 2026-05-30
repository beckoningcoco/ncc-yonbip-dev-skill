# |<<

**收入单据子表 (cost_incomebill_b / nc.vo.hrpco.incomebill.CostIncomebillBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1618.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_incomebill_b | 子表主键 | pk_incomebill_b | char(20) | √ | 主键 (UFID) |
| 2 | badjust | 是否调整单 | badjust | char(1) |  | 布尔类型 (UFBoolean) |
| 3 | nmny | 金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 4 | pk_unit | 开单科室 | pk_unit | varchar(20) |  | 科室档案 (CodepartVO) |
| 5 | pk_execodept | 执行科室 | pk_execodept | varchar(20) |  | 科室档案 (CodepartVO) |
| 6 | pk_incomeclass | 收入分类 | pk_incomeclass | varchar(20) |  | 收入分类-成本组织 (incodeclass) |
| 7 | pk_incomeproject | 收入项目 | pk_incomeproject | varchar(20) |  | 收入项目-成本组织 (CostIncodeProVO) |
| 8 | vsourcesys | 来源系统 | vsourcesys | int |  | 来源系统 (sourcesysenum) |  | 1=手工录入; |