# |<<

**指标模板明细 (pm_indextemplet_b / nc.vo.pmbd.indextemplet.IndexTempletBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4472.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_indextemplet_b | 指标模板明细主键 | pk_indextemplet_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | structure_code | 指标结构码 | structure_code | varchar(50) |  | 字符串 (String) |
| 5 | pk_measureindex | 计量指标 | pk_measureindex | varchar(20) |  | 计量指标 (measureindex) |
| 6 | summode_planvalue | 计划值汇总 | summode_planvalue | int |  | 计划汇总方式 (planValueSumMode) |  | 1=不汇总; |