---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "cpu-order.deliveryorder.DeliveryOrderBoxCodeVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 发货单关联箱码信息表 (`cpu-order.deliveryorder.DeliveryOrderBoxCodeVO`)

> ycSaleCoor | 物理表：`cpu_deliveryorder_boxcode`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 发货单关联箱码信息表 |
| 物理表 | `cpu_deliveryorder_boxcode` |
| 数据库 schema | `cpu-order` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:31:14.9970` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

---

## 直接属性（13个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `barCodeId` | 箱码档案主键 | `barcode_id` | 463527dd-f297-48b1-b84f-cca54440bdb2 |
| 2 | `boxCode` | 箱码 | `box_code` | String |
| 3 | `boxQty` | 数量 | `box_qty` | Decimal |
| 4 | `boxSubQty` | 件数 | `box_subqty` | Decimal |
| 5 | `boxingRecordId` | 装箱单主表主键 | `boxingrecord_id` | 06399052-9995-4dd2-9b12-af2ce7b38c64 |
| 6 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 7 | `dr` | 删除标识 | `dr` | Integer |
| 8 | `id` | 主键 | `id` | Long |
| 9 | `inBoxQty` | 箱内码个数 | `in_box_qty` | Decimal |
| 10 | `mainId` | 单据主键 | `main_id` | 12b75182-bf0e-426e-8c2c-10c46b3177f6 |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime |
| 12 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 13 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `barCodeId` | 箱码档案主键 | `st.barcode.Barcode` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `boxingRecordId` | 装箱单主表主键 | `st.boxingrecord.BoxingRecord` | Service |  |
| 4 | `mainId` | 单据主键 | `cpu-order.deliveryorder.DeliveryOrderVO` | None | true |
