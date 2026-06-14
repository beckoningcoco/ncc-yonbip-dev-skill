---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.routeConstraint.Routing"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工艺路线/物料生产线关系 (`cmp.routeConstraint.Routing`)

> DCRP | 物理表：`cmp_route_constrainted_routing`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工艺路线/物料生产线关系 |
| 物理表 | `cmp_route_constrainted_routing` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:58:07.4970` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（18个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `orgId` | 工厂 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 4 | `sourceRoutingId` | 工艺路线ID | `source_routing_id` | 37955d3b-2143-4a4d-bdd5-0213a13394f5 |
| 5 | `sourceMaterialProductionLineId` | 物料生产线关系Id | `source_material_prod_line_id` | edb229e2-ff7c-4076-9945-5420433038ec |
| 6 | `constraintType` | 类型 | `constraint_type` | Integer |
| 7 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 8 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 9 | `routingType` | 路线类别 | `routing_type` | Integer |
| 10 | `substituteDescription` | 替代标识 | `substitute_description` | String |
| 11 | `batch` | 主批量 | `batch` | Decimal |
| 12 | `produceBatch` | 生产批量 | `produce_batch` | Decimal |
| 13 | `productUnit` | 主计量单位 | `product_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 14 | `produceUnit` | 生产单位 | `produce_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 15 | `effectiveDate` | 生效日期 | `effective_date` | DateTime |
| 16 | `expiryDate` | 失效日期 | `expiry_date` | DateTime |
| 17 | `routingVersion` | 工艺路线版本 | `routing_version` | String |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `produceUnit` | 生产单位 | `pc.unit.Unit` | Service |  |
| 2 | `sourceRoutingId` | 工艺路线ID | `ed.routing.Routing` | Service |  |
| 3 | `productId` | 物料 | `pc.product.Product` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 6 | `sourceMaterialProductionLineId` | 物料生产线关系Id | `ed.materialproductionline.MaterialProductionLine` | Service |  |
| 7 | `productUnit` | 主计量单位 | `pc.unit.Unit` | Service |  |
| 8 | `orgId` | 工厂 | `aa.baseorg.OrgMV` | Service |  |
