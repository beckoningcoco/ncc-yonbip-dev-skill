---
tags: ["BIP", "元数据", "数据字典", "ED", "ed.mainformula.FormulaOperationComponent"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工序投料 (`ed.mainformula.FormulaOperationComponent`)

> ED | 物理表：`ed_route_operation_component`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工序投料 |
| 物理表 | `ed_route_operation_component` |
| domain/服务域 | `engineeringdata` |
| 所属应用 | `ED` |
| 构建时间 | `2026-06-05 09:26:29.6450` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（14个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bomComponentId` | 子件ID | `bom_component_id` | f78e2b2f-0634-41d3-a002-c5a68f3e9992 |
| 2 | `denominatorQuantity` | 母件底数 | `denominator_quantity` | Decimal |
| 3 | `id` | ID | `id` | Long |
| 4 | `materialId` | 物料ID | `material_id` | Long |
| 5 | `memo` | 备注 | `memo` | String |
| 6 | `numeratorQuantity` | 主数量 | `numerator_quantity` | Decimal |
| 7 | `originalId` | 变更源 | `original_id` | Long |
| 8 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime |
| 10 | `routingOperationId` | 工艺路线工序ID | `routingOperation_id` | e3ed947a-f5e9-45e7-86b9-a225e6cbfbfb |
| 11 | `rowno` | 序号 | `rowno` | Integer |
| 12 | `stockNumeratorQuantity` | 子件数量 | `stock_numerator_quantity` | Decimal |
| 13 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 14 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `productId` | 物料 | `pc.product.Product` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `bomComponentId` | 子件ID | `ed.bom.BomComponent` | None |  |
| 4 | `routingOperationId` | 工艺路线工序ID | `ed.mainformula.FormulaOperation` | None | true |
| 5 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
