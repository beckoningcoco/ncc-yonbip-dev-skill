---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "cpu-order.saleorder.SaleOrderDetailParallelVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 销售订单子表拓展 (`cpu-order.saleorder.SaleOrderDetailParallelVO`)

> ycSaleCoor | 物理表：`cpu_sale_order_detail_parallel`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售订单子表拓展 |
| 物理表 | `cpu_sale_order_detail_parallel` |
| 数据库 schema | `cpu-order` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:32:52.3580` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | 5fb7781a-74b1-4980-8261-0a9878c38f7b | 销售订单子表主键 |

---

## 直接属性（16个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `wbsCode` | WBS任务编码 | `wbs_code` | String |
| 2 | `plannedQuantity` | 已计划数量 | `planned_quantity` | Decimal |
| 3 | `plannedMainQty` | 已计划主数量 | `planned_main_qty` | Decimal |
| 4 | `allowSupDeliveryPlan` | 允许供应商发起交货计划 | `allow_sup_deliveryplan` | Boolean |
| 5 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 6 | `activityCode` | 活动编码 | `activity_code` | String |
| 7 | `activity` | 活动主键 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 8 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 9 | `activityName` | 活动 | `activity_name` | String |
| 10 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 11 | `wbsName` | WBS任务 | `wbs_name` | String |
| 12 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 13 | `id` | 销售订单子表主键 | `id` | 5fb7781a-74b1-4980-8261-0a9878c38f7b |
| 14 | `totalServiceMoney` | 累计服务确认无税金额 | `total_service_money` | Decimal |
| 15 | `totalServiceQty` | 累计服务确认数量 | `total_service_qty` | Decimal |
| 16 | `totalServiceTaxMoney` | 累计服务确认含税金额 | `total_service_tax_money` | Decimal |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `activity` | 活动主键 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 4 | `id` | 销售订单子表主键 | `cpu-order.saleorder.SaleOrderDetailVO` | None | true |
