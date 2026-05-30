# |<<

**成本单据子表 (cost_clcostbill_b / nc.vo.hrpco.clcostbill.ClcostbillBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1602.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_clcostbill_b | 子表主键 | pk_clcostbill_b | char(20) | √ | 主键 (UFID) |
| 2 | costpjcode | 成本项目编码 | costpjcode | varchar(20) |  | 成本项目-成本组织 (CostProOrgVO) |
| 3 | costpjname | 成本项目名称 | costpjname | varchar(20) |  | 成本项目-成本组织 (CostProOrgVO) |
| 4 | deptcode | 科室编码 | deptcode | varchar(20) |  | 科室档案 (CodepartVO) |
| 5 | deptname | 科室名称 | deptname | varchar(20) |  | 科室档案 (CodepartVO) |
| 6 | money | 金额 | money | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | isadjust | 是否调整单 | isadjust | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | sourcesys | 来源系统 | sourcesys | int |  | 来源系统 (sourcesysenum) |  | 1=手工录入; |