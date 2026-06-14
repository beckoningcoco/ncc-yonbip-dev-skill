---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.planworkbench.PlanParamExt"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 计划参数扩展 (`mr.planworkbench.PlanParamExt`)

> MR | 物理表：`mr_plan_param_ext`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计划参数扩展 |
| 物理表 | `mr_plan_param_ext` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:16:37.2370` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | 0d105898-52f1-4a97-971d-b334f721c74b | 计划参数ID |

---

## 直接属性（13个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `changePlanSchemeID` | 变更方案ID | `change_plan_scheme_id` | 0807eed3-7def-4362-b2ec-8fea5c435fc7 |
| 2 | `combinationDimension` | 计划维度 | `combination_dimension` | String |
| 3 | `id` | 计划参数ID | `id` | 0d105898-52f1-4a97-971d-b334f721c74b |
| 4 | `planProperty` | 计划属性 | `plan_property` | String |
| 5 | `planStaffId` | 计划员 | `plan_staff_id` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a |
| 6 | `productScopeType` | 物料范围 | `product_scope_type` | String |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |
| 8 | `purchaseStaffId` | 采购员 | `purchase_staff_id` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a |
| 9 | `sdState` | 供需状态 | `sd_state` | String |
| 10 | `timeBucketGroup` | 期间分组选项 | `time_bucket_group` | String |
| 11 | `timeBucketId` | 计划期间 | `time_bucket_id` | 4e2f676d-fbf6-448e-b43f-aae7fd6fa808 |
| 12 | `timeBucketOffset` | 前置期间天数 | `time_bucket_offset` | Integer |
| 13 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `planStaffId` | 计划员 | `bd.staff.StaffNew` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `timeBucketId` | 计划期间 | `mr.timebucket.TimeBucket` | None |  |
| 4 | `id` | 计划参数ID | `mr.planworkbench.PlanParam` | None | true |
| 5 | `purchaseStaffId` | 采购员 | `bd.staff.StaffNew` | Service |  |
| 6 | `changePlanSchemeID` | 变更方案ID | `mr.planscheme.PlanScheme` | None |  |
