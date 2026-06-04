---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "cpu-order.saleorder.SaleOrderBoxingRecordVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 销售订单装箱记录孙表 (`cpu-order.saleorder.SaleOrderBoxingRecordVO`)

> ycSaleCoor | 物理表：`cpu_sale_order_detail_boxingrecord`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售订单装箱记录孙表 |
| 物理表 | `cpu_sale_order_detail_boxingrecord` |
| 数据库 schema | `cpu-order` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:32:48.4110` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（10个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `boxingRecordId` | 装箱单主表主键 | `boxingrecord_id` | Long |
| 2 | `boxingrecordDetailId` | 装箱单子表主键 | `boxingrecord_detail_id` | Long |
| 3 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 4 | `dr` | 删除标识 | `dr` | Integer |
| 5 | `id` | id | `id` | Long |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime |
| 7 | `saleorderDetailId` | 销售订单子表主键 | `saleorder_detail_id` | 5fb7781a-74b1-4980-8261-0a9878c38f7b |
| 8 | `saleorderId` | 销售订单主表主键 | `saleorder_id` | 5fb7781a-74b1-4980-8261-0a9878c38f7b |
| 9 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 10 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `saleorderId` | 销售订单主表主键 | `cpu-order.saleorder.SaleOrderDetailVO` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `saleorderDetailId` | 销售订单子表主键 | `cpu-order.saleorder.SaleOrderDetailVO` | None | true |
