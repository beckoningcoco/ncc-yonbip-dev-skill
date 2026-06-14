---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.planworkbench.RoutingDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工序表明细 (`mr.planworkbench.RoutingDetail`)

> MR | 物理表：`mr_routing_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工序表明细 |
| 物理表 | `mr_routing_detail` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:16:40.8750` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（22个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `assistQuantity` | 辅计量数量 | `assist_qty` | Decimal |
| 2 | `assistUnitId` | 辅计量单位 | `assist_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 3 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 4 | `changeRateDen` | 换算率分母 | `change_rateden` | Decimal |
| 5 | `changeRateNum` | 换算率分子 | `change_ratenum` | Decimal |
| 6 | `finishDate` | 计划完工时间 | `finish_date` | DateTime |
| 7 | `id` | ID | `id` | Long |
| 8 | `isOutsource` | 是否委外工序 | `is_outsource` | Short |
| 9 | `mainQuantity` | 主计量数量 | `main_qty` | Decimal |
| 10 | `mainUnitId` | 主计量单位 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 11 | `operateControlId` | 工序控制码 | `operate_control_id` | b47f926b-e3ed-40e1-8423-171e9fb107c9 |
| 12 | `planOrderId` | 计划订单id | `plan_order_id` | 8217afbf-acdc-42ef-a799-75a88d9fa69d |
| 13 | `prepareTime` | 计划准备时间 | `prepare_time` | Decimal |
| 14 | `processTime` | 计划加工时间 | `process_time` | Decimal |
| 15 | `pubts` | 时间戳 | `pubts` | DateTime |
| 16 | `routingOperationId` | 工序id | `routing_operation_id` | 4779185e-375a-4830-bc81-92255430924e |
| 17 | `serialNo` | 顺序号 | `serial_no` | Decimal |
| 18 | `startDate` | 计划开工时间 | `start_date` | DateTime |
| 19 | `timeUnit` | 时间单位 | `time_unit` | String |
| 20 | `vendorId` | 委外商 | `vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 21 | `workCenterId` | 工作中心ID | `work_center_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 22 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `operateControlId` | 工序控制码 | `ed.operationcontrolcode.OperationControlCode` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `workCenterId` | 工作中心ID | `ed.workcenter.WorkCenter` | Service |  |
| 4 | `assistUnitId` | 辅计量单位 | `pc.unit.Unit` | Service |  |
| 5 | `vendorId` | 委外商 | `aa.vendor.Vendor` | Service |  |
| 6 | `routingOperationId` | 工序id | `ed.routing.RoutingOperation` | Service |  |
| 7 | `planOrderId` | 计划订单id | `mr.planworkbench.PlanOrder` | None | true |
| 8 | `mainUnitId` | 主计量单位 | `pc.unit.Unit` | Service |  |
