---
tags: ["BIP", "元数据", "数据字典", "ED", "ed.mainformula.FormulaOperation"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 配方工序 (`ed.mainformula.FormulaOperation`)

> ED | 物理表：`ed_route_operation`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 配方工序 |
| 物理表 | `ed_route_operation` |
| 数据库 schema | `engineeringdata` |
| 所属应用 | `ED` |
| 构建时间 | `2026-06-05 09:25:09.8910` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（47个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `advanceTime` | 偏置时间 | `advance_time` | Decimal |
| 2 | `attritionRate` | 损耗率 | `attrition_rate` | Decimal |
| 3 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 4 | `changeRateDen` | 换算率分母 | `change_rate_den` | Decimal |
| 5 | `changeRateNum` | 换算率分子 | `change_rate_num` | Decimal |
| 6 | `elementId` | 工序节点元素UI_ID | `element_id` | String |
| 7 | `elementType` | UI节点类型 | `element_type` | Short |
| 8 | `id` | ID | `id` | Long |
| 9 | `industryProcessLibraryId` | 行业工艺库ID | `industryProcessLibraryId` | String |
| 10 | `isAbilityCalc` | 能力计算 | `is_ability_calc` | Short |
| 11 | `isDispatchSegPoints` | 派工单切分点 | `is_dispatch_seg_points` | Short |
| 12 | `isFromIndustryProcessLib` | 来源行业工艺库 | `is_from_industry_process_lib` | Short |
| 13 | `isFromMetallurgicalStandard` | 是否来源冶金规范 | `is_from_metallurgical_standard` | Short |
| 14 | `isMainProcess` | 主序 | `is_main_process` | Short |
| 15 | `isMakePlan` | 排工序计划 | `is_make_plan` | Short |
| 16 | `isMonitorPoint` | 检测点 | `is_monitor_point` | Short |
| 17 | `isOutsource` | 是否委外工序 | `is_outsource` | Short |
| 18 | `isReportPoint` | 报告点 | `is_report_point` | Short |
| 19 | `isSkipSequence` | 跳序 | `is_skip_sequence` | Short |
| 20 | `operationId` | 标准工序 | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 21 | `operationcontrolcodeId` | 工序控制码 | `operationcontrolcode_id` | b47f926b-e3ed-40e1-8423-171e9fb107c9 |
| 22 | `originalId` | 变更源 | `original_id` | Long |
| 23 | `overlappingCount` | 重叠数量 | `overlapping_count` | Decimal |
| 24 | `overlappingTime` | 重叠时间 | `overlapping_time` | Decimal |
| 25 | `overlappingType` | 重叠类型 | `overlapping_type` | Short |
| 26 | `preRoutingOperationId` | 前置工序 | `pre_routingOperation_id` | 4779185e-375a-4830-bc81-92255430924e |
| 27 | `prepareTime` | 准备时间 | `prepare_time` | Decimal |
| 28 | `processTime` | 加工时间 | `process_time` | Decimal |
| 29 | `processTransferMode` | 工序转移方式 | `process_transfer_mode` | Short |
| 30 | `produceUnit` | 工序产出单位 | `produce_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 31 | `pubts` | 时间戳 | `pubts` | DateTime |
| 32 | `qualityWay` | 质检方式 | `quality_way` | Short |
| 33 | `routingId` | 主配方线ID | `routing_id` | fa7b101c-5065-4f13-88d2-e6742dadb164 |
| 34 | `routingOperationActivityType` | 工序作业标准 | `` | bf14a59c-2887-4e61-b5ba-5c569aa345e6 |
| 35 | `routingOperationByproduct` | 联副产品 | `` | 1b63d9a4-0e1e-45cf-bdfa-18b27487daf1 |
| 36 | `routingOperationComponent` | 工序投料 | `` | a9c06847-629f-4e8e-a612-fea77b66bc8e |
| 37 | `routingOperationDefineCharacter` | 配方工序自定义项 | `routing_operation_df_ct` | 19c9169c-0af8-4aaf-b790-8c1357ead306 |
| 38 | `routingOperationDrawing` | 工序图纸 | `` | 65e293b9-1495-4c29-ad08-f1cefc76932a |
| 39 | `rowno` | 序号 | `rowno` | Integer |
| 40 | `scheduleNo` | 工艺规程号 | `schedule_no` | String |
| 41 | `sn` | 顺序号 | `sn` | Decimal |
| 42 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 43 | `timeUnit` | 时间单位 | `time_unit` | TimeUnitEnum |
| 44 | `vendorAuth` | 委外供应商权限 | `vendor_id` | 4267e0aa-1efb-4b5e-b921-25dca8392171 |
| 45 | `vendorId` | 委外商 | `vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 46 | `workCenterId` | 工作中心ID | `workCenter_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 47 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（15个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `produceUnit` | 工序产出单位 | `pc.unit.Unit` | Service |  |
| 2 | `routingOperationComponent` | 工序投料 | `ed.mainformula.FormulaOperationComponent` | None | true |
| 3 | `routingId` | 主配方线ID | `ed.mainformula.MainFormula` | None | true |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `operationcontrolcodeId` | 工序控制码 | `ed.operationcontrolcode.OperationControlCode` | None |  |
| 6 | `vendorId` | 委外商 | `aa.vendor.Vendor` | Service |  |
| 7 | `vendorAuth` | 委外供应商权限 | `pb.dataauth.VendorDataAuth` | None |  |
| 8 | `routingOperationByproduct` | 联副产品 | `ed.mainformula.FormulaOperationByproduct` | None | true |
| 9 | `routingOperationDrawing` | 工序图纸 | `ed.mainformula.FormulaOperationDrawing` | None | true |
| 10 | `preRoutingOperationId` | 前置工序 | `ed.routing.RoutingOperation` | None |  |
| 11 | `routingOperationDefineCharacter` | 配方工序自定义项 | `ed.routing.RoutingOperationDefineCharacter` | None |  |
| 12 | `workCenterId` | 工作中心ID | `ed.workcenter.WorkCenter` | None |  |
| 13 | `operationId` | 标准工序 | `ed.operation.Operation` | None |  |
| 14 | `routingOperationActivityType` | 工序作业标准 | `ed.mainformula.FormulaOperationActivityType` | None | true |
| 15 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
