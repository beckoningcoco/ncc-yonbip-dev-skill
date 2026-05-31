# |<<

**计划策略组明细 (bd_planstrategygroup_b / nc.vo.mmbd.psg.entity.PlanStrategyGroupBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/927.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_planstrategygroup_b | 主键 | pk_planstrategygroup_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_planstrategy | 计划策略编码 | pk_planstrategy | varchar(20) |  | 计划策略 (bd_planstrategy) |
| 4 | pk_org | 计划组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_org_v | 计划组织最新版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 6 | fplanpurpose | 计划目的 | fplanpurpose | int |  | 计划目的 (PlanPurposeEnum) |  | 0=生产; |