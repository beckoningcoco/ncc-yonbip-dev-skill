---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "cpu-order.deliveryorder.DeliveryOrderDetailBarcodeVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 发货单条码子表 (`cpu-order.deliveryorder.DeliveryOrderDetailBarcodeVO`)

> ycSaleCoor | 物理表：`cpu_deliveryorder_detail_barcode`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 发货单条码子表 |
| 物理表 | `cpu_deliveryorder_detail_barcode` |
| domain/服务域 | `cpu-order` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:32:37.6400` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

---

## 直接属性（14个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 2 | `dr` | 删除标识 | `dr` | Integer |
| 3 | `ts` | 时间戳 | `ts` | DateTime |
| 4 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 5 | `status` | 条码对应物资状态:1.未发货;2.发货;3.签收 | `status` | Integer |
| 6 | `id` | 主键 | `id` | Long |
| 7 | `serialNo` | 序列号 | `serial_no` | String |
| 8 | `deliveryBarcode` | 配送条码 | `barcode` | String |
| 9 | `deliveryorderDetailId` | 发货单明细ID | `deliveryorder_detail_id` | 8343f3b7-50ab-4dde-b761-a599b9bc6309 |
| 10 | `productId` | 物料id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 11 | `productLineno` | 物料行号 | `product_lineno` | Decimal |
| 12 | `pubts` | 时间戳 | `ts` | DateTime |
| 13 | `snCharacteristics` | 序列号自由项特征组 | `serial_no_characteristics` | b663d6c1-7987-4b10-b180-e531acdfdb2d |
| 14 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `deliveryorderDetailId` | 发货单明细ID | `cpu-order.deliveryorder.DeliveryOrderDetailVO` | None | true |
| 2 | `productId` | 物料id | `pc.product.Product` | Service |  |
| 3 | `snCharacteristics` | 序列号自由项特征组 | `cpu-order.deliveryorder.DeliveryOrderDetailBarcodeCharacteristics` | None |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
