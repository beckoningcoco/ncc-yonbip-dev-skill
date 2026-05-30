# |<<

**作业成本重估 (scaba_costrevaluation / nc.vo.scaba.costrevaluation.CostRevaluationVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5080.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_costrevaluation | 成本重估ID | pk_costrevaluation | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org_co | 业务单元 | pk_org_co | varchar(20) |  | 组织 (org) |
| 4 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 5 | pk_profitcenter | 利润中心 | pk_profitcenter | varchar(20) |  | 利润中心 (profitcenter) |
| 6 | pk_accbook | 核算账簿 | pk_accbook | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 7 | pk_setofbook | 账簿类型 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 8 | cperiod | 会计期间 | cperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 9 | cstatus | 状态 | cstatus | int |  | 计算状态 (calstatusenum) |  | 0=未计算; |