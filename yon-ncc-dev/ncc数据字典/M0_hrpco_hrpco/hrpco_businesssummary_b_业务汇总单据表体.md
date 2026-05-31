# |<<

**业务汇总单据表体 (hrpco_businesssummary_b / nc.vo.hrpco.cobusinesssummary.BusinessSummaryB)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2752.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_businesssummary_h | 主键 | pk_businesssummary_h | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 3 | pk_dept | 科室 | pk_dept | varchar(20) |  | 科室档案 (CodepartVO) |
| 4 | pk_costpro | 成本项目 | pk_costpro | varchar(20) |  | 成本项目-成本组织 (CostProOrgVO) |
| 5 | pk_fundsource | 资金来源 | pk_fundsource | varchar(20) |  | 医疗资金来源 (FundSourceVO) |
| 6 | money | 金额 | money | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | remark | 备注 | remark | varchar(50) |  | 字符串 (String) |
| 8 | vsourcesys | 来源系统 | vsourcesys | int |  | 来源系统 (SourcesysEnum) |  | 1=人员工资明细; |