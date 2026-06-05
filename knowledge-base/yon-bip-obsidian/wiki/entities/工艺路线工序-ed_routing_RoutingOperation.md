---
tags: ["BIP", "元数据", "数据字典", "ED", "ed.routing.RoutingOperation"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工艺路线工序 (`ed.routing.RoutingOperation`)

> ED | 物理表：`ed_route_operation`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工艺路线工序 |
| 物理表 | `ed_route_operation` |
| 数据库 schema | `engineeringdata` |
| 所属应用 | `ED` |
| 构建时间 | `2026-06-05 09:25:18.2130` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 工序表关联标识 |
| 编码 | `rowno` | Integer | 行号 |

---

## 直接属性（52个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 2 | `isSkipSequence` | 跳序 | `is_skip_sequence` | Short |
| 3 | `operationcontrolcodeId` | 工序控制码 | `operationcontrolcode_id` | b47f926b-e3ed-40e1-8423-171e9fb107c9 |
| 4 | `produceUnit` | 工序产出单位 | `produce_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 5 | `firstCheck` | 首检 | `first_check` | String |
| 6 | `firstCheckType` | 首检控制方式 | `first_check_type` | String |
| 7 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 8 | `originalId` | 变更源 | `original_id` | Long |
| 9 | `qualityWay` | 质检方式 | `quality_way` | Short |
| 10 | `routingOperationDefineCharacter` | 自定义项特征属性组 | `routing_operation_df_ct` | 19c9169c-0af8-4aaf-b790-8c1357ead306 |
| 11 | `routingId` | 工艺路线表关联标识 | `routing_id` | 37955d3b-2143-4a4d-bdd5-0213a13394f5 |
| 12 | `id` | 工序表关联标识 | `id` | Long |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime |
| 14 | `sn` | 顺序号 | `sn` | Decimal |
| 15 | `operationId` | 标准工序ID | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 16 | `scheduleNo` | 工艺规程号 | `schedule_no` | String |
| 17 | `workCenterId` | 工作中心ID | `workCenter_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 18 | `isMainProcess` | 主序 | `is_main_process` | Short |
| 19 | `isOutsource` | 委外工序 | `is_outsource` | Short |
| 20 | `vendorId` | 委外商id | `vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 21 | `timeUnit` | 时间单位 | `time_unit` | TimeUnitEnum |
| 22 | `prepareTime` | 准备时间 | `prepare_time` | Decimal |
| 23 | `processTime` | 加工时间 | `process_time` | Decimal |
| 24 | `overlappingType` | 重叠类型 | `overlapping_type` | Short |
| 25 | `overlappingTime` | 重叠时间 | `overlapping_time` | Decimal |
| 26 | `overlappingCount` | 重叠数量 | `overlapping_count` | Decimal |
| 27 | `isReportPoint` | 报告点 | `is_report_point` | Short |
| 28 | `isMonitorPoint` | 检测点 | `is_monitor_point` | Short |
| 29 | `processTransferMode` | 自动交接 | `process_transfer_mode` | Short |
| 30 | `advanceTime` | 偏置时间 | `advance_time` | Decimal |
| 31 | `isAbilityCalc` | 能力计算 | `is_ability_calc` | Short |
| 32 | `isMakePlan` | 排工序计划 | `is_make_plan` | Short |
| 33 | `isDispatchSegPoints` | 派工单切分点 | `is_dispatch_seg_points` | Short |
| 34 | `isFromIndustryProcessLib` | 来源行业工艺库 | `is_from_industry_process_lib` | Short |
| 35 | `industryProcessLibraryId` | 行业工艺库ID | `industryProcessLibraryId` | String |
| 36 | `attritionRate` | 损耗率 | `attrition_rate` | Decimal |
| 37 | `isFromMetallurgicalStandard` | 是否来源冶金规范 | `is_from_metallurgical_standard` | Short |
| 38 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 39 | `vendorAuth` | 委外供应商权限 | `vendor_id` | 4267e0aa-1efb-4b5e-b921-25dca8392171 |
| 40 | `rowno` | 行号 | `rowno` | Integer |
| 41 | `elementType` | UI节点类型 | `element_type` | Short |
| 42 | `elementId` | 工序节点元素UI_ID | `element_id` | String |
| 43 | `preRoutingOperationId` | 前置工序 | `pre_routingOperation_id` | 4779185e-375a-4830-bc81-92255430924e |
| 44 | `changeRateDen` | 换算率分母 | `change_rate_den` | Decimal |
| 45 | `changeRateNum` | 换算率分子 | `change_rate_num` | Decimal |
| 46 | `defines` | 工艺路线工序(固定自定义项)表 | `` | 543f73d0-7d00-43db-a581-bd432874d544 |
| 47 | `operationSequenceId` | 工序序列ID | `operation_sequence_id` | e06ef0eb-bcef-4c86-9b2a-70288829bbaa |
| 48 | `routingOperationActivityType` | 工序作业标准 | `` | 8ff91823-ec45-4a6b-abfc-1a06a049f56e |
| 49 | `routingOperationAttrextItem` | 工艺路线工序(自由自定义项)表 | `` | 86511def-a2d1-49ce-973b-be6c1e38ec28 |
| 50 | `routingOperationByproduct` | 联副产品 | `` | 887bec6e-289f-4342-8870-a2fe519d928e |
| 51 | `routingOperationComponent` | 工序投料 | `` | 670af9da-a81f-4d26-ba74-0fb3fe249dcd |
| 52 | `routingOperationDrawing` | 工序图纸 | `` | d7f7877c-ac21-405a-acbd-9ba9b8a8f2a8 |

---

## 关联属性（18个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `produceUnit` | 工序产出单位 | `pc.unit.Unit` | Service |  |
| 2 | `routingOperationComponent` | 工序投料 | `ed.routing.RoutingOperationComponent` | None | true |
| 3 | `routingId` | 工艺路线表关联标识 | `ed.routing.Routing` | None | true |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `operationcontrolcodeId` | 工序控制码 | `ed.operationcontrolcode.OperationControlCode` | None |  |
| 6 | `vendorId` | 委外商id | `aa.vendor.Vendor` | Service |  |
| 7 | `vendorAuth` | 委外供应商权限 | `pb.dataauth.VendorDataAuth` | None |  |
| 8 | `routingOperationByproduct` | 联副产品 | `ed.routing.RoutingOperationByproduct` | None | true |
| 9 | `routingOperationDrawing` | 工序图纸 | `ed.routing.RoutingOperationDrawing` | None | true |
| 10 | `preRoutingOperationId` | 前置工序 | `ed.routing.RoutingOperation` | None |  |
| 11 | `defines` | 工艺路线工序(固定自定义项)表 | `ed.routing.RoutingOperationUserDefine` | None | true |
| 12 | `routingOperationAttrextItem` | 工艺路线工序(自由自定义项)表 | `ed.routing.RoutingOperationAttrextItem` | None | true |
| 13 | `routingOperationDefineCharacter` | 自定义项特征属性组 | `ed.routing.RoutingOperationDefineCharacter` | None |  |
| 14 | `workCenterId` | 工作中心ID | `ed.workcenter.WorkCenter` | None |  |
| 15 | `operationSequenceId` | 工序序列ID | `ed.routing.OperationSequence` | None |  |
| 16 | `operationId` | 标准工序ID | `ed.operation.Operation` | None |  |
| 17 | `routingOperationActivityType` | 工序作业标准 | `ed.routing.RoutingOperationActivityType` | None | true |
| 18 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
