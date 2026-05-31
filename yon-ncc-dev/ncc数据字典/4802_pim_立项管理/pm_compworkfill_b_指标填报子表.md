# |<<

**指标填报子表 (pm_compworkfill_b / nc.vo.ppm.compworkfill.CompWorkFillBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4426.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_compworkfill_b | 指标填报子表主键 | pk_compworkfill_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | pk_indexplan_b | 指标计划 | pk_indexplan_b | varchar(20) |  | 指标计划明细 (indexplanbody) |
| 6 | structure_code | 指标结构码 | structure_code | varchar(50) |  | 字符串 (String) |
| 7 | pk_measureindex | 计量指标 | pk_measureindex | varchar(20) |  | 计量指标 (measureindex) |
| 8 | pk_measdoc | 计量单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 9 | plan_value | 计划值 | plan_value | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | summode_planvalue | 计划值汇总 | summode_planvalue | int |  | 计划汇总方式 (planValueSumMode) |  | 1=不汇总; |