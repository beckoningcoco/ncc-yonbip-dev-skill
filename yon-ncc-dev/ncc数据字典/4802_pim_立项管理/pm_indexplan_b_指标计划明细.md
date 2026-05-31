# |<<

**指标计划明细 (pm_indexplan_b / nc.vo.ppm.indexplan.IndexPlanBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4470.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_indexplan_b | 指标计划明细主键 | pk_indexplan_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | structure_code | 指标结构码 | structure_code | varchar(50) |  | 字符串 (String) |
| 6 | pk_measureindex | 计量指标 | pk_measureindex | varchar(20) |  | 计量指标 (measureindex) |
| 7 | pk_measdoc | 计量单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 8 | summode_planvalue | 计划值汇总 | summode_planvalue | int |  | 计划汇总方式 (planValueSumMode) |  | 1=不汇总; |