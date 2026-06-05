---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.planscheme.PlanSchemeSupplyDocTypes"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 计划方案供需单据类型 (`mr.planscheme.PlanSchemeSupplyDocTypes`)

> MR | 物理表：`mr_plan_scheme_supply_doc_type`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计划方案供需单据类型 |
| 物理表 | `mr_plan_scheme_supply_doc_type` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:16:16.1260` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 子表ID |

---

## 直接属性（15个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `datasub` | 应用来源 | `datasub` | String |
| 2 | `sdDoctypeCode` | 供应单据类型Code | `sd_doctype_code` | String |
| 3 | `sdType` | 供需类型 | `sd_type` | mr_sd_type_enum |
| 4 | `extendedCondition` | 扩展条件 | `extended_condition` | String |
| 5 | `transTypeIds` | 交易类型 | `trans_type_ids` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 6 | `beSelected` | 被选择 | `be_selected` | Boolean |
| 7 | `supplyQuantity` | 供应量 | `supply_qty` | String |
| 8 | `nullBizDate` | 是否支持业务日期为空 | `null_biz_date` | Boolean |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 10 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 11 | `sdDoctypeId` | 供应来源ID | `sd_doctype_id` | b1ac8af8-72c2-4b2d-939f-9d7e22bd2f9c |
| 12 | `sequence` | 顺序号 | `sequence` | Integer |
| 13 | `id` | 子表ID | `id` | Long |
| 14 | `planId` | 计划方案主表id | `plan_id` | 0807eed3-7def-4362-b2ec-8fea5c435fc7 |
| 15 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `sdDoctypeId` | 供应来源ID | `mr.sdDocType.SDDocType` | None |  |
| 3 | `planId` | 计划方案主表id | `mr.planscheme.PlanScheme` | None | true |
| 4 | `transTypeIds` | 交易类型 | `bd.bill.TransType` | Service |  |
| 5 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
