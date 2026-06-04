---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "cpu-order.deliveryorder.DeliveryOrderDetailHealthVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 发货单医疗拓展表 (`cpu-order.deliveryorder.DeliveryOrderDetailHealthVO`)

> ycSaleCoor | 物理表：`cpu_deliveryorder_detail_health`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 发货单医疗拓展表 |
| 物理表 | `cpu_deliveryorder_detail_health` |
| 数据库 schema | `cpu-order` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:32:39.0020` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

---

## 直接属性（18个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 2 | `pubts` | 时间戳 | `ts` | DateTime |
| 3 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 4 | `deliveryManufacturer` | 生产厂家 | `delivery_manufacturer` | String |
| 5 | `deliveryModel` | 型号 | `delivery_model` | String |
| 6 | `deliverySpec` | 规格 | `delivery_spec` | String |
| 7 | `deliveryorderDetailId` | 发货单明细ID | `deliveryorder_detail_id` | 8343f3b7-50ab-4dde-b761-a599b9bc6309 |
| 8 | `dr` | 删除标识 | `dr` | Integer |
| 9 | `exFactoryDate` | 出厂日期 | `ex_factory_date` | DateTime |
| 10 | `factoryNo` | 出厂编号 | `factory_no` | String |
| 11 | `id` | 主键 | `id` | Long |
| 12 | `materialComposition` | 材料成分 | `material_composition` | String |
| 13 | `regQualificationCode` | 注册证号 | `reg_qualification_code` | String |
| 14 | `sourceArea` | 原产地 | `source_area` | String |
| 15 | `sterilizationNo` | 灭菌批号 | `sterilization_no` | String |
| 16 | `transparentPurchaseNo` | 阳光采购号 | `transparent_purchase_no` | String |
| 17 | `ts` | 时间戳 | `ts` | DateTime |
| 18 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `deliveryorderDetailId` | 发货单明细ID | `cpu-order.deliveryorder.DeliveryOrderDetailVO` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
