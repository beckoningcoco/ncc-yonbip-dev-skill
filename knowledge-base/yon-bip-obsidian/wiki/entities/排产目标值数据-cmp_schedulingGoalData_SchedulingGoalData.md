---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.schedulingGoalData.SchedulingGoalData"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 排产目标值数据 (`cmp.schedulingGoalData.SchedulingGoalData`)

> DCRP | 物理表：`cmp_scheduling_goal_data`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 排产目标值数据 |
| 物理表 | `cmp_scheduling_goal_data` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:58:11.7050` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（25个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `constraintRuleVerId` | 排产版本 | `constraint_rule_ver_id` | 1c76a52f-4c51-4554-9bec-dc552617ce6c |
| 4 | `calculateId` | 产能运算ID | `calculate_id` | 12a493ee-e7d1-4aac-b52d-8dd0dc02121b |
| 5 | `dataClassType` | 数据类类型 | `data_class_type` | String |
| 6 | `dataClassItem` | 数据类项 | `data_class_item` | String |
| 7 | `dataClassSubItem` | 数据子项 | `data_class_sub_item` | String |
| 8 | `optimizationGoalId` | 优化目标ID | `optimization_goal_id` | 6a62b22e-87fe-4487-9521-3fec888c56d7 |
| 9 | `optimizationGoalCode` | 优化目标编码 | `optimization_goal_code` | String |
| 10 | `targetProportion` | 目标占比 | `target_proportion` | Integer |
| 11 | `optimizationGoalValue` | 优化目标分值 | `optimization_goal_value` | String |
| 12 | `RelTargetItem1` | 相关目标项1 | `rel_target_item1` | String |
| 13 | `RelTargetValue1` | 相关目标值1 | `rel_target_value1` | String |
| 14 | `RelTargetItem2` | 相关目标项2 | `rel_target_item2` | String |
| 15 | `RelTargetValue2` | 相关目标值2 | `rel_target_value2` | String |
| 16 | `createTime` | 创建时间 | `create_time` | DateTime |
| 17 | `createDate` | 创建日期 | `create_date` | Date |
| 18 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 19 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 20 | `creator` | 创建人名称 | `creator` | String |
| 21 | `modifier` | 修改人名称 | `modifier` | String |
| 22 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 23 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 24 | `pubts` | 时间戳 | `pubts` | DateTime |
| 25 | `schedulingGoalRtDataList` | 排产目标值相关目标项数据 | `` | 6ab0baf8-ee3c-4a8a-a48d-15548afb262e |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `schedulingGoalRtDataList` | 排产目标值相关目标项数据 | `cmp.schedulingGoalData.SchedulingGoalRtDataList` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `constraintRuleVerId` | 排产版本 | `cmp.constraintRuleVersion.ConstraintRuleVersion` | None |  |
| 4 | `calculateId` | 产能运算ID | `cmp.capacitycalculate.CapacityCalculate` | None |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `optimizationGoalId` | 优化目标ID | `cmp.optimizationGoal.OptimizationGoal` | None |  |
