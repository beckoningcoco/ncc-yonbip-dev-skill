---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.consumption.MRPConsumption"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# MRP预测消抵表 (`mr.consumption.MRPConsumption`)

> MR | 物理表：`mr_consumption`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | MRP预测消抵表 |
| 物理表 | `mr_consumption` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:10:38.0250` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（22个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `consumptionQuantity` | 消抵数量 | `consumption_quantity` | Decimal |
| 2 | `forecastOrderAuditDate` | 预测单审核日期 | `forecast_order_audit_date` | Date |
| 3 | `forecastOrderCode` | 预测单编码 | `forecast_order_code` | String |
| 4 | `forecastOrderId` | 预测单id | `forecast_order_id` | Long |
| 5 | `forecastOrderRowId` | 预测单行id | `forecast_order_row_id` | Long |
| 6 | `forecastOrderRowRequirementDate` | 预测单行需求日期 | `forecast_order_row_requirement_date` | Date |
| 7 | `forecastOrderRowRequirementNumber` | 预测单行预测数量 | `forecast_order_row_requirement_number` | Decimal |
| 8 | `forecastOrderVouchdate` | 预测单单据日期 | `forecast_order_vouch_date` | Date |
| 9 | `forecastRemainQuantity` | 预测余量 | `forecast_remain_quantity` | Decimal |
| 10 | `id` | ID | `id` | Long |
| 11 | `materialId` | 物料id | `material_id` | Long |
| 12 | `orderCode` | 订单编码 | `order_code` | String |
| 13 | `orderId` | 订单id | `order_id` | Long |
| 14 | `orderRowConsignTime` | 订单预发货日期 | `order_row_consign_time` | Date |
| 15 | `orderRowId` | 订单行id | `order_row_id` | Long |
| 16 | `orderType` | 消抵预测单的订单类型 | `order_type` | ConsumptionOrderType |
| 17 | `orgId` | 工厂 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 18 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 19 | `productId` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime |
| 21 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 22 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `productId` | 物料ID | `pc.product.Product` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 4 | `orgId` | 工厂 | `aa.baseorg.OrgMV` | Service |  |
| 5 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
