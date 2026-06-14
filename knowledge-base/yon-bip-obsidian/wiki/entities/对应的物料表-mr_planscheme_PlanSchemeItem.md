---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.planscheme.PlanSchemeItem"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 对应的物料表 (`mr.planscheme.PlanSchemeItem`)

> MR | 物理表：`mr_plan_scheme_item_metra`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 对应的物料表 |
| 物理表 | `mr_plan_scheme_item_metra` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:16:12.0340` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（12个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `dataType` | 数据类型 | `data_type` | Short |
| 2 | `id` | ID | `id` | Long |
| 3 | `itemId` | 制造物料id | `item_id` | Long |
| 4 | `itemsId` | 计划方案主表物料id | `items_id` | Long |
| 5 | `mOrder` | 顺序 | `m_order` | Integer |
| 6 | `materialClassId` | 物料分类 | `material_class_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 7 | `planClassId` | 计划分类 | `plan_class_id` | 5f9b1ee7-d6e8-4ba0-b5d7-6728fa089ae3 |
| 8 | `productId` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime |
| 10 | `schemeId` | 计划方案id | `scheme_id` | 0807eed3-7def-4362-b2ec-8fea5c435fc7 |
| 11 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 12 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `materialClassId` | 物料分类 | `pc.cls.ManagementClass` | Service |  |
| 2 | `productId` | 物料ID | `pc.product.Product` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `planClassId` | 计划分类 | `pc.cls.PlanClass` | Service |  |
| 5 | `schemeId` | 计划方案id | `mr.planscheme.PlanScheme` | None | true |
| 6 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
