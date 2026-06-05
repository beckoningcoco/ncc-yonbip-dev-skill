---
tags: ["BIP", "元数据", "数据字典", "PO", "po.order.OrderProductSrcinfo"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 生产订单产品来源信息 (`po.order.OrderProductSrcinfo`)

> PO | 物理表：`po_order_product_srcinfo`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 生产订单产品来源信息 |
| 物理表 | `po_order_product_srcinfo` |
| 数据库 schema | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:25:44.0180` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（9个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `orderId` | 生产订单ID | `order_id` | Long |
| 3 | `orderProductId` | 生产订单产品ID | `order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime |
| 5 | `srcType` | 来源类型 | `src_type` | String |
| 6 | `srceOrderId` | 来源订单id | `src_order_id` | Long |
| 7 | `srceOrderProductId` | 来源订单产品id | `src_order_product_id` | Long |
| 8 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `orderProductId` | 生产订单产品ID | `po.order.OrderProduct` | None | true |
| 3 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
