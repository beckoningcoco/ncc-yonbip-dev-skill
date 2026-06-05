---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.schedule.MRPCurrentStock"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 制造物料现存表 (`mr.schedule.MRPCurrentStock`)

> MR | 物理表：`mr_currentstock`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 制造物料现存表 |
| 物理表 | `mr_currentstock` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:10:39.7010` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（11个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `currentQuantity` | 现存量 | `current_quantity` | Decimal |
| 2 | `id` | ID | `id` | Long |
| 3 | `materialId` | 制造物料ID | `material_id` | Long |
| 4 | `orgId` | 工厂 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 5 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 6 | `productCode` | 物料编码 | `product_code` | String |
| 7 | `productId` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime |
| 9 | `skuId` | 物料skuId | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 10 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 11 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `productId` | 物料ID | `pc.product.Product` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 4 | `orgId` | 工厂 | `aa.baseorg.OrgMV` | Service |  |
| 5 | `skuId` | 物料skuId | `pc.product.ProductSKU` | Service |  |
| 6 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
