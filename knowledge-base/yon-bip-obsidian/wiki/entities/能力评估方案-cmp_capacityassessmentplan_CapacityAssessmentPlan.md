---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.capacityassessmentplan.CapacityAssessmentPlan"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 能力评估方案 (`cmp.capacityassessmentplan.CapacityAssessmentPlan`)

> DCRP | 物理表：`cmp_capacity_assessment_plan`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 能力评估方案 |
| 物理表 | `cmp_capacity_assessment_plan` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:58:32.4230` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（34个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `orgId` | 组织id | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 3 | `id` | ID | `id` | Long |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime |
| 5 | `planAssessStrategy` | 计划订单评估策略 | `plan_assess_strategy` | String |
| 6 | `produceAssessStrategy` | 生产订单评估策略 | `produce_assess_strategy` | String |
| 7 | `type` | 类型 | `type` | String |
| 8 | `scheduleMethodId` | 排产方向 | `schedule_method_id` | e0cc2683-9758-484f-8a7b-81a49003db27 |
| 9 | `optimizationConfId` | 排产优化算法 | `optimization_conf_id` | e0cc2683-9758-484f-8a7b-81a49003db27 |
| 10 | `appScene` | 应用场景 | `app_scene` | String |
| 11 | `bGoalOptimize` | 按目标优化 | `b_goal_optimize` | Boolean |
| 12 | `dr` | 逻辑删除标记 | `dr` | Short |
| 13 | `enablets` | 启用时间 | `enablets` | DateTime |
| 14 | `disablets` | 停用时间 | `disablets` | DateTime |
| 15 | `createTime` | 创建时间 | `create_time` | DateTime |
| 16 | `createDate` | 创建日期 | `create_date` | Date |
| 17 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 18 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 19 | `creator` | 创建人名称 | `creator` | String |
| 20 | `modifier` | 修改人名称 | `modifier` | String |
| 21 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 22 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 23 | `code` | 编码 | `code` | String |
| 24 | `name` | 名称 | `name` | String |
| 25 | `prognosisCount` | 展望期间 | `prognosis_count` | Integer |
| 26 | `prognosisType` | 展望类型 | `prognosis_type` | String |
| 27 | `enable` | 启用状态 | `enable` | sys_intboolean |
| 28 | `memo` | 备注 | `memo` | String |
| 29 | `bCapacityResultAutoLock` | 排产结果自动锁定 | `b_schedule_result_auto_lock` | Boolean |
| 30 | `constraintRuleConfigList` | 约束规则配置 | `` | 2b756279-2ba0-4c20-a98b-6d96f97a01be |
| 31 | `factoryScopeList` | 工厂范围 | `` | 7d94c893-cda0-44cf-a3ed-fc37862054ec |
| 32 | `optimizationGoalConfigList` | 优化目标配置 | `` | 7668d7be-39fe-4faf-9c7c-bb7a7d8acf94 |
| 33 | `stepConfigList` | 运算步骤配置 | `` | 7eb86c87-3bc6-4020-81e5-4d8fea6c80ca |
| 34 | `workCenterScopeList` | 工作中心范围 | `` | 1c05746c-caaa-49fa-84cb-920805d0852d |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `scheduleMethodId` | 排产方向 | `cmp.alconfig.AlgorithmConfiguration` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `constraintRuleConfigList` | 约束规则配置 | `cmp.capacityassessmentplan.ConstraintRuleConfig` | None | true |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `factoryScopeList` | 工厂范围 | `cmp.capacityassessmentplan.FactoryScope` | None | true |
| 7 | `orgId` | 组织id | `aa.baseorg.OrgMV` | Service |  |
| 8 | `optimizationGoalConfigList` | 优化目标配置 | `cmp.capacityassessmentplan.OptimizationGoalConfig` | None | true |
| 9 | `optimizationConfId` | 排产优化算法 | `cmp.alconfig.AlgorithmConfiguration` | None |  |
| 10 | `workCenterScopeList` | 工作中心范围 | `cmp.capacityassessmentplan.WorkCenterScope` | None | true |
| 11 | `stepConfigList` | 运算步骤配置 | `cmp.capacityassessmentplan.StepConfig` | None | true |
