---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.planscheme.PlanSchemeStockPlan"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 计划方案库存计划 (`mr.planscheme.PlanSchemeStockPlan`)

> MR | 物理表：`mr_plan_scheme_stock_plan`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计划方案库存计划 |
| 物理表 | `mr_plan_scheme_stock_plan` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:16:14.8000` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | 0807eed3-7def-4362-b2ec-8fea5c435fc7 | 计划方案id |

---

## 直接属性（8个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `calculationCutoffTime` | 计算截至时间 | `calculation_cutoff_time` | Integer |
| 2 | `id` | 计划方案id | `id` | 0807eed3-7def-4362-b2ec-8fea5c435fc7 |
| 3 | `pubts` | 时间戳 | `pubts` | DateTime |
| 4 | `sdHistoryCalculationDays` | 供需历史计算天数 | `sd_history_calculation_days` | Integer |
| 5 | `stockPlanningStrategy` | 库存规划策略 | `stock_planning_strategy` | stock_planning_strategy_enum |
| 6 | `summaryCondition` | 汇总条件 | `summary_condition` | String |
| 7 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 8 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `id` | 计划方案id | `mr.planscheme.PlanScheme` | None | true |
| 3 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
