---
tags: ["BIP", "元数据", "数据字典", "ED", "ed.routing.RoutingOperationComponent"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工序投料 (`ed.routing.RoutingOperationComponent`)

> ED | 物理表：`ed_route_operation_component`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工序投料 |
| 物理表 | `ed_route_operation_component` |
| 数据库 schema | `engineeringdata` |
| 所属应用 | `ED` |
| 构建时间 | `2026-06-05 09:26:42.3400` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 行号 |

---

## 直接属性（14个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `routingOperationId` | 工序表关联标识 | `routingOperation_id` | 4779185e-375a-4830-bc81-92255430924e |
| 2 | `id` | ID | `id` | Long |
| 3 | `pubts` | 时间戳 | `pubts` | DateTime |
| 4 | `materialId` | 制造物料ID | `material_id` | Long |
| 5 | `denominatorQuantity` | 母件底数 | `denominator_quantity` | Decimal |
| 6 | `numeratorQuantity` | 数量 | `numerator_quantity` | Decimal |
| 7 | `memo` | 备注 | `memo` | String |
| 8 | `rowno` | 行号 | `rowno` | Integer |
| 9 | `bomComponentId` | 子件ID | `bom_component_id` | f78e2b2f-0634-41d3-a002-c5a68f3e9992 |
| 10 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 11 | `originalId` | 变更源 | `original_id` | Long |
| 12 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 13 | `stockNumeratorQuantity` | 子件数量 | `stock_numerator_quantity` | Decimal |
| 14 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `productId` | 物料 | `pc.product.Product` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `bomComponentId` | 子件ID | `ed.bom.BomComponent` | None |  |
| 4 | `routingOperationId` | 工序表关联标识 | `ed.routing.RoutingOperation` | None | true |
| 5 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
