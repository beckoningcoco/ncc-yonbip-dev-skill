---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "cpu-order.deliveryorder.DeliveryOrderDetailParallelVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 发货单子表拓展 (`cpu-order.deliveryorder.DeliveryOrderDetailParallelVO`)

> ycSaleCoor | 物理表：`cpu_deliveryorder_detail_parallel`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 发货单子表拓展 |
| 物理表 | `cpu_deliveryorder_detail_parallel` |
| domain/服务域 | `cpu-order` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:32:40.3170` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | 8343f3b7-50ab-4dde-b761-a599b9bc6309 | 发货单子表主键 |

---

## 直接属性（10个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `wbsCode` | WBS任务编码 | `wbs_code` | String |
| 2 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 3 | `activityCode` | 活动编码 | `activity_code` | String |
| 4 | `activity` | 活动主键 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 5 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 6 | `activityName` | 活动 | `activity_name` | String |
| 7 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 8 | `wbsName` | WBS任务 | `wbs_name` | String |
| 9 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 10 | `id` | 发货单子表主键 | `id` | 8343f3b7-50ab-4dde-b761-a599b9bc6309 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `activity` | 活动主键 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 4 | `id` | 发货单子表主键 | `cpu-order.deliveryorder.DeliveryOrderDetailVO` | None | true |
