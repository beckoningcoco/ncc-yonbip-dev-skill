---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.dailydemandcapacity.DailyDemandCapacity"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 日需求能力占用结果(能力占用明细) (`cmp.dailydemandcapacity.DailyDemandCapacity`)

> DCRP | 物理表：`cmp_daily_demand_capacity`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 日需求能力占用结果(能力占用明细) |
| 物理表 | `cmp_daily_demand_capacity` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:58:33.9220` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（59个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `orgId` | 组织 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 4 | `calculateId` | 产能运算ID | `calculate_id` | 12a493ee-e7d1-4aac-b52d-8dd0dc02121b |
| 5 | `capacityObject` | 加工中心 | `capacity_object` | e3034100-f166-46e1-b750-d85fb84474b7 |
| 6 | `srcWCId` | 加工中心来源ID(工作中心/生产线) | `src_wc_id` | Long |
| 7 | `srcWCType` | 加工中心来源类型 | `src_wc_type` | String |
| 8 | `demandDatetime` | 日期 | `demand_datetime` | DateTime |
| 9 | `demandCapacity` | 占用值 | `demand_capacity` | Decimal |
| 10 | `srcRouteId` | 工艺约束来源ID | `src_route_id` | Long |
| 11 | `srcRouteLineId` | 工艺约束来源行ID | `src_route_line_id` | Long |
| 12 | `srcRouteType` | 工艺约束来源类型 | `src_route_type` | String |
| 13 | `timeUnit` | 时间单位 | `time_unit` | String |
| 14 | `capacityDemand` | 能力需求(订单) | `capacity_demand_id` | c09df742-e522-466c-a5ac-757f34e80092 |
| 15 | `srcDocId` | 能力需求来源ID(订单ID) | `src_doc_id` | Long |
| 16 | `srcDocType` | 能力需求来源类型 | `src_doc_type` | String |
| 17 | `capacityDemandList` | 能力需求清单ID | `capacity_demand_list` | 0aa3f101-f572-447c-8998-b17f8a9f1c28 |
| 18 | `constraintRuleVerId` | 排产版本 | `constraint_rule_ver_id` | 1c76a52f-4c51-4554-9bec-dc552617ce6c |
| 19 | `quantity` | 排产数量 | `quantity` | Decimal |
| 20 | `unit` | 排产单位 | `unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 21 | `mainQuantity` | 排产主单位数量 | `main_quantity` | Decimal |
| 22 | `mainUnit` | 排产主单位 | `main_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 23 | `serialNo` | 排产顺序号 | `serial_no` | Decimal |
| 24 | `operationSerialNo` | 工序顺序号 | `operation_serial_no` | Decimal |
| 25 | `operation` | 工序 | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 26 | `dosageUnit` | 单位用量(小时) | `dosage_unit` | Decimal |
| 27 | `mainDosageUnit` | 单位用量(主单位)(小时) | `main_dosage_unit` | Decimal |
| 28 | `demandType` | 占用类型 | `demand_type` | String |
| 29 | `dataClassType` | 数据类类型 | `data_class_type` | String |
| 30 | `dataClassItem` | 数据类项 | `data_class_item` | String |
| 31 | `dataClassSubItem` | 数据子项 | `data_class_sub_item` | String |
| 32 | `schedulingStartDate` | 排产开始时间 | `scheduling_start_date` | DateTime |
| 33 | `schedulingEndDate` | 排产结束时间 | `scheduling_end_date` | DateTime |
| 34 | `wcAvailableCapacity` | 加工中心可用能力(小时) | `wc_available_capacity` | Decimal |
| 35 | `docWcAllocationId` | 加工中心分配关系ID | `doc_wc_allocation_id` | ba73254e-5f34-4288-a81a-3abf4065a6c4 |
| 36 | `appScene` | 应用场景 | `app_scene` | String |
| 37 | `shiftId` | 班次 | `shift_id` | 6b8e0e86-1416-4b56-b3c3-02dac58aa640 |
| 38 | `shiftSegmentId` | 班段 | `shift_segment_id` | b1ae55ee-31b1-4b5c-b3ec-4cdf63dd4e7f |
| 39 | `capacityValueId` | 可用能力 | `capacity_value_id` | 35618498-8fee-4eda-9f74-10e339efceb2 |
| 40 | `routeId` | 工艺约束 | `route_id` | 1550bbc9-2eed-432c-84cd-6c36a16d9507 |
| 41 | `routeLineId` | 工艺约束行 | `route_line_id` | bd70e207-3153-4d6f-8a3f-11dae94555da |
| 42 | `demandUnit` | 占用单位 | `demand_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 43 | `mainDemandUnit` | 主计量占用单位 | `main_demand_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 44 | `mainDemandCapacity` | 主单位占用值 | `main_demand_capacity` | Decimal |
| 45 | `conversionRate` | 换算率 | `conversion_rate` | Decimal |
| 46 | `dr` | 逻辑删除标记 | `dr` | Short |
| 47 | `createTime` | 创建时间 | `create_time` | DateTime |
| 48 | `createDate` | 创建日期 | `create_date` | Date |
| 49 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 50 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 51 | `creator` | 创建人名称 | `creator` | String |
| 52 | `modifier` | 修改人名称 | `modifier` | String |
| 53 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 54 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 55 | `pubts` | 时间戳 | `pubts` | DateTime |
| 56 | `conversionRateDen` | 换算率分母 | `conversion_rateden` | Decimal |
| 57 | `conversionRateNum` | 换算率分子 | `conversion_ratenum` | Decimal |
| 58 | `dailyUsageLocs` | 日占用位置明细 | `` | 2918f24f-bd5c-4940-92bf-0d5c5c393d71 |
| 59 | `lockStatus` | 锁定状态 | `lock_status` | String |

---

## 关联属性（21个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `shiftId` | 班次 | `cmp.shift.Shift` | None |  |
| 2 | `mainUnit` | 排产主单位 | `pc.unit.Unit` | Service |  |
| 3 | `docWcAllocationId` | 加工中心分配关系ID | `cmp.dailydemandcapacity.DocWcAllocation` | None |  |
| 4 | `demandUnit` | 占用单位 | `pc.unit.Unit` | Service |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `constraintRuleVerId` | 排产版本 | `cmp.constraintRuleVersion.ConstraintRuleVersion` | None |  |
| 7 | `routeLineId` | 工艺约束行 | `cmp.demandcapacity.DemandCapacityList` | None |  |
| 8 | `shiftSegmentId` | 班段 | `cmp.shift.ShiftSegment` | None |  |
| 9 | `calculateId` | 产能运算ID | `cmp.capacitycalculate.CapacityCalculate` | None |  |
| 10 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 11 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 12 | `capacityDemand` | 能力需求(订单) | `cmp.capacitydemand.CapacityDemand` | None |  |
| 13 | `capacityDemandList` | 能力需求清单ID | `cmp.capacitydemand.CapacityDemandList` | None |  |
| 14 | `orgId` | 组织 | `aa.baseorg.OrgMV` | Service |  |
| 15 | `dailyUsageLocs` | 日占用位置明细 | `cmp.dailydemandcapacity.DailyUsageLoc` | None | true |
| 16 | `unit` | 排产单位 | `pc.unit.Unit` | Service |  |
| 17 | `routeId` | 工艺约束 | `cmp.demandcapacity.DemandCapacity` | None |  |
| 18 | `mainDemandUnit` | 主计量占用单位 | `pc.unit.Unit` | Service |  |
| 19 | `capacityObject` | 加工中心 | `cmp.capacityobject.CapacityObject` | None |  |
| 20 | `operation` | 工序 | `ed.operation.Operation` | Service |  |
| 21 | `capacityValueId` | 可用能力 | `cmp.dailyavailablecapacity.DailyAvailableCapacityCommon` | None |  |
