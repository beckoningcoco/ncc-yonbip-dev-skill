---
tags: ["BIP", "元数据", "数据字典", "ED", "ed.mainformula.FormulaOperationByproduct"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 联副产品 (`ed.mainformula.FormulaOperationByproduct`)

> ED | 物理表：`ed_route_operation_byproduct`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 联副产品 |
| 物理表 | `ed_route_operation_byproduct` |
| 数据库 schema | `engineeringdata` |
| 所属应用 | `ED` |
| 构建时间 | `2026-06-05 09:26:28.2050` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（12个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bomByproductId` | 产出品ID | `bom_byproduct_id` | 0445cbea-e503-4d98-83bb-4761d390762b |
| 2 | `id` | ID | `id` | Long |
| 3 | `materialId` | 物料ID | `material_id` | Long |
| 4 | `numeratorQuantity` | 主数量 | `numerator_quantity` | Decimal |
| 5 | `originalId` | 变更源 | `original_id` | Long |
| 6 | `produceNumeratorQuantity` | 数量 | `produce_numerator_quantity` | Decimal |
| 7 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime |
| 9 | `routingOperationId` | 工艺路线工序ID | `routingOperation_id` | e3ed947a-f5e9-45e7-86b9-a225e6cbfbfb |
| 10 | `rowno` | 序号 | `rowno` | Integer |
| 11 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 12 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `productId` | 物料 | `pc.product.Product` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `bomByproductId` | 产出品ID | `ed.bom.BomByproduct` | None |  |
| 4 | `routingOperationId` | 工艺路线工序ID | `ed.mainformula.FormulaOperation` | None | true |
| 5 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
