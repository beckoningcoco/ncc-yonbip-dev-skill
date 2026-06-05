---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.planscheme.PlanSchemeExt"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 计划方案扩展 (`mr.planscheme.PlanSchemeExt`)

> MR | 物理表：`mr_plan_scheme_ext`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计划方案扩展 |
| 物理表 | `mr_plan_scheme_ext` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:16:10.6900` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | 0807eed3-7def-4362-b2ec-8fea5c435fc7 | 计划方案ID |

---

## 直接属性（11个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `capacityPlanId` | 约束方案 | `capacity_plan_id` | 041020b1-3648-445c-9ed9-4343313ab927 |
| 2 | `demandAllocation` | 需求分配算法 | `demand_allocation` | 22781602-f94d-455a-84d5-de48d4ad9a1f |
| 3 | `expandZeroPlan` | 数量为0的订单层级 | `expand_zero_plan` | String |
| 4 | `id` | 计划方案ID | `id` | 0807eed3-7def-4362-b2ec-8fea5c435fc7 |
| 5 | `obsoleteAdvice` | 呆滞料建议 | `obsolete_advice` | Boolean |
| 6 | `optimizeGoals` | 优化目标 | `optimize_goals` | fe030cee-cec2-4f26-a2ff-531fb2d328b8 |
| 7 | `overdueSupply` | 是否允许超期供应 | `overdue_supply` | Boolean |
| 8 | `planGenerate` | 计划生成模式 | `plan_generate` | String |
| 9 | `planMergeId` | 合并档案ID | `plan_merge_id` | e019670a-881a-4a9f-b005-665671fa87fa |
| 10 | `pubts` | 时间戳 | `pubts` | DateTime |
| 11 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `planMergeId` | 合并档案ID | `mr.planscheme.PlanMerge` | None |  |
| 2 | `demandAllocation` | 需求分配算法 | `cmp.algorithm.AlgorithmImpl` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `optimizeGoals` | 优化目标 | `mr.optimization.Definition` | None |  |
| 5 | `id` | 计划方案ID | `mr.planscheme.PlanScheme` | None | true |
| 6 | `capacityPlanId` | 约束方案 | `cmp.capacityassessmentplan.CapacityAssessmentPlan` | None |  |
