---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "cpu-order.deliveryorder.DeliveryOrderBoxingRecordVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 发货单装箱记录孙表 (`cpu-order.deliveryorder.DeliveryOrderBoxingRecordVO`)

> ycSaleCoor | 物理表：`cpu_deliveryorder_boxingrecord`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 发货单装箱记录孙表 |
| 物理表 | `cpu_deliveryorder_boxingrecord` |
| domain/服务域 | `cpu-order` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:32:35.0400` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 发货单孙表主键 |

---

## 直接属性（11个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `boxedNum` | 装箱数量 | `boxed_num` | Decimal |
| 2 | `boxingRecordId` | 装箱单主表主键 | `boxingrecord_id` | Long |
| 3 | `boxingrecordDetailId` | 装箱单子表主键 | `boxingrecord_detail_id` | Long |
| 4 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 5 | `deliveryorderDetailId` | 发货单子表主键 | `deliveryorder_detail_id` | 8343f3b7-50ab-4dde-b761-a599b9bc6309 |
| 6 | `deliveryorderId` | 发货单主表主键 | `deliveryorder_id` | 12b75182-bf0e-426e-8c2c-10c46b3177f6 |
| 7 | `dr` | 删除标识 | `dr` | Integer |
| 8 | `id` | 发货单孙表主键 | `id` | Long |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime |
| 10 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 11 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `deliveryorderDetailId` | 发货单子表主键 | `cpu-order.deliveryorder.DeliveryOrderDetailVO` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `deliveryorderId` | 发货单主表主键 | `cpu-order.deliveryorder.DeliveryOrderVO` | None |  |
