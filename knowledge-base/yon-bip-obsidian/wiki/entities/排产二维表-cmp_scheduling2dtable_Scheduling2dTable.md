---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.scheduling2dtable.Scheduling2dTable"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 排产二维表 (`cmp.scheduling2dtable.Scheduling2dTable`)

> DCRP | 物理表：`cmp_scheduling_2d_table`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 排产二维表 |
| 物理表 | `cmp_scheduling_2d_table` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:58:13.2110` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（52个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `orgId` | 组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 4 | `capacityObject` | 工作中心 | `capacity_object_id` | String |
| 5 | `capacityObjectCode` | 工作中心编码 | `capacity_object_code` | String |
| 6 | `capacityObjectName` | 工作中心名称 | `capacity_object_name` | String |
| 7 | `dateType` | 数据类型 | `data_type` | String |
| 8 | `dataItem` | 数据项 | `data_item` | String |
| 9 | `demandCode` | 单号 | `order_number` | String |
| 10 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 11 | `exceptDate` | 期望交期 | `except_date` | DateTime |
| 12 | `preTime` | 单位用量 | `pre_time` | Decimal |
| 13 | `orderNum` | 订单数量 | `order_num` | Decimal |
| 14 | `planedQuantity` | 已排产数量 | `planed_quantity` | Decimal |
| 15 | `waitPlanQuantity` | 待排产数量 | `wait_plan_quantity` | Decimal |
| 16 | `showYearMonth` | 年月 | `show_year_month` | String |
| 17 | `monthDay` | 月日 | `month_day` | String |
| 18 | `quantity` | 数量 | `quantity` | Decimal |
| 19 | `capacityDemandId` | 能力需求ID | `capactiy_demand_id` | c09df742-e522-466c-a5ac-757f34e80092 |
| 20 | `indent` | 层级 | `indent` | Integer |
| 21 | `timeUnitPrecision` | 单位用量精度 | `time_unit_precision` | Integer |
| 22 | `mainUnit` | 主单位 | `main_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 23 | `mainUnitName` | 主计量单位名称 | `main_unit_name` | String |
| 24 | `mainUnitPrecision` | 主计量单位精度 | `main_unit_precision` | Integer |
| 25 | `orgName` | 组织名称 | `org_name` | String |
| 26 | `productName` | 物料名称 | `product_name` | String |
| 27 | `productCode` | 物料编码 | `product_code` | String |
| 28 | `weekly` | 周 | `weekly` | String |
| 29 | `releaseStatus` | 发布状态 | `release_status` | String |
| 30 | `truncationType` | 舍位方式 | `truncation_type` | String |
| 31 | `docWcAllocationId` | 加工中心分配关系ID | `doc_wc_allocation_id` | ba73254e-5f34-4288-a81a-3abf4065a6c4 |
| 32 | `allocationQuantity` | 分配数量 | `allocation_quantity` | Decimal |
| 33 | `operationId` | 工序 | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 34 | `routeId` | 工艺路线 | `route_id` | 37955d3b-2143-4a4d-bdd5-0213a13394f5 |
| 35 | `srcWCType` | 工艺路线类型 | `src_wc_type` | String |
| 36 | `wcAvailableCapacity` | 加工中心可用能力(小时) | `wc_available_capacity` | Decimal |
| 37 | `unit` | 单位 | `unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 38 | `unitName` | 计量单位名称 | `unit_name` | String |
| 39 | `unitPrecision` | 计量单位精度 | `unit_precision` | Integer |
| 40 | `mainQuantity` | 主数量 | `main_quantity` | Decimal |
| 41 | `mainOrderNum` | 订单主数量 | `main_order_num` | Decimal |
| 42 | `mainPlanedQuantity` | 已排产主数量 | `main_planed_quantity` | Decimal |
| 43 | `mainWaitPlanQuantity` | 待排产主数量 | `main_wait_plan_quantity` | Decimal |
| 44 | `shiftId` | 班次 | `shift_id` | 6b8e0e86-1416-4b56-b3c3-02dac58aa640 |
| 45 | `shiftSegmentId` | 班段 | `shift_segment_id` | b1ae55ee-31b1-4b5c-b3ec-4cdf63dd4e7f |
| 46 | `dailyOutput` | 日产量 | `daily_output` | Decimal |
| 47 | `shiftCode` | 班次编码 | `shift_code` | String |
| 48 | `shiftName` | 班次名称 | `shift_name` | String |
| 49 | `routeLineId` | 工艺约束行 | `route_line_id` | bd70e207-3153-4d6f-8a3f-11dae94555da |
| 50 | `pubts` | 时间戳 | `pubts` | DateTime |
| 51 | `sourceDocLineNo` | 源头单据行号 | `source_doc_line_no` | Decimal |
| 52 | `sourceDocNo` | 源头单据号 | `source_doc_no` | String |

---

## 关联属性（12个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `shiftId` | 班次 | `cmp.shift.Shift` | None |  |
| 2 | `mainUnit` | 主单位 | `pc.unit.Unit` | Service |  |
| 3 | `unit` | 单位 | `pc.unit.Unit` | Service |  |
| 4 | `docWcAllocationId` | 加工中心分配关系ID | `cmp.dailydemandcapacity.DocWcAllocation` | None |  |
| 5 | `routeId` | 工艺路线 | `ed.routing.Routing` | Service |  |
| 6 | `productId` | 物料 | `pc.product.Product` | Service |  |
| 7 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 8 | `routeLineId` | 工艺约束行 | `cmp.demandcapacity.DemandCapacityList` | None |  |
| 9 | `shiftSegmentId` | 班段 | `cmp.shift.ShiftSegment` | None |  |
| 10 | `capacityDemandId` | 能力需求ID | `cmp.capacitydemand.CapacityDemand` | None |  |
| 11 | `operationId` | 工序 | `ed.operation.Operation` | Service |  |
| 12 | `orgId` | 组织 | `org.func.BaseOrg` | Service |  |
