---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.timefence.TimeFenceDemandTypes"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 计划策略独立需求来源类型 (`mr.timefence.TimeFenceDemandTypes`)

> MR | 物理表：`mr_time_fence_demand_type`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计划策略独立需求来源类型 |
| 物理表 | `mr_time_fence_demand_type` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:17:20.7710` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（14个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 2 | `demandTypeCode` | 独立需求来源Code | `demand_type_code` | String |
| 3 | `beSelected` | 选择 | `be_selected` | Boolean |
| 4 | `transTypeIds` | 交易类型 | `trans_type_ids` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 5 | `periodStartDay` | 开始时段天数 | `period_start_day` | Integer |
| 6 | `periodEndDay` | 截止时段天数 | `period_end_day` | Integer |
| 7 | `safetyStockSource` | 安全库存来源 | `safety_stock_source` | SafetyStockSourceEnum |
| 8 | `extendedCondition` | 扩展条件 | `extended_condition` | String |
| 9 | `demandQuantity` | 需求量 | `demand_qty` | String |
| 10 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 11 | `demandTypeId` | 独立需求来源 | `demand_type_id` | b1ac8af8-72c2-4b2d-939f-9d7e22bd2f9c |
| 12 | `id` | ID | `id` | Long |
| 13 | `mainId` | 计划策略主表ID | `main_id` | 69a6556e-bd79-4981-b6fd-86d13b77c6aa |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `demandTypeId` | 独立需求来源 | `mr.sdDocType.SDDocType` | None |  |
| 3 | `mainId` | 计划策略主表ID | `mr.timefence.TimeFence` | None | true |
| 4 | `transTypeIds` | 交易类型 | `bd.bill.TransType` | Service |  |
| 5 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
