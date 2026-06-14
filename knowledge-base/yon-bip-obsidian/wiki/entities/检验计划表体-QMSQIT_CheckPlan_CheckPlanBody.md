---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.CheckPlan.CheckPlanBody"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验计划表体 (`QMSQIT.CheckPlan.CheckPlanBody`)

> QMSQIT | 物理表：`qms_qit_checkplan_m_body`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验计划表体 |
| 物理表 | `qms_qit_checkplan_m_body` |
| domain/服务域 | `QMS-QIT` |
| schema | `qms_qit_rejectbill` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:42:32.1370` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（31个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `planID` | 表头ID | `plan_id` | e1381ffa-c207-487b-bc7f-1800048891db |
| 4 | `inspectStepNumber` | 检验步骤顺序 | `inspect_step_number` | Integer |
| 5 | `inspectStep` | 检验步骤 | `inspect_step` | 0267b439-f9c9-4267-916c-66139b0f3627 |
| 6 | `planStartTime` | 计划开始时间 | `plan_start_time` | DateTime |
| 7 | `timeUnit` | 时长单位 | `time_unit` | String |
| 8 | `planEndTime` | 计划结束时间 | `plan_end_time` | DateTime |
| 9 | `inspectionPlanId` | 检验方案id(停用) | `inspectionplan_id` | 14bcdfef-7982-4772-baf8-e0d6ebef507e |
| 10 | `inspectionPlanVersion` | 检验方案版本 | `inspectionplan_version` | String |
| 11 | `trendsInspectionPlan` | 动态检验方案id | `trendsinspectionplan` | f9c8adf8-5485-417b-bb35-f242b0995126 |
| 12 | `trendsInspectionPlanVersion` | 动态检验方案版本 | `trends_inspectionplan_version` | String |
| 13 | `inspectionBasic` | 检测依据 | `inspection_basic` | f0529fa3-5e4b-444a-8212-716743519d68 |
| 14 | `samplingMethod` | 取样方式id(停用) | `sampling_method` | d21eaba0-3431-4238-b178-c6216a31b34b |
| 15 | `isInspectionItemConfirm` | 单一取样方式 | `isinspection_item_confirm` | String |
| 16 | `inspectionTime` | 检验时长 | `inspection_time` | Decimal |
| 17 | `checkPlanDetailId` | 检验方案主表id | `checkplandetail_id` | cacc3797-7e23-44d9-aad5-ebfe0c680961 |
| 18 | `sampleMethodDetailId` | 取样方式主表id | `sampledetail_id` | 5653b278-1a57-42ea-81ab-e579e060556a |
| 19 | `dr` | 逻辑删除标记 | `dr` | Short |
| 20 | `createTime` | 创建时间 | `create_time` | DateTime |
| 21 | `createDate` | 创建日期 | `create_date` | Date |
| 22 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 23 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 24 | `creator` | 创建人名称 | `creator` | String |
| 25 | `modifier` | 修改人名称 | `modifier` | String |
| 26 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 27 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 28 | `pubts` | 时间戳 | `pubts` | DateTime |
| 29 | `CheckDeviceList` | 检验仪器设备 | `` | 2d721b24-f7ea-4205-995c-12ed0861f255 |
| 30 | `CheckInfoList` | 检验信息 | `` | 3fdf986e-a1d8-402e-aa24-b982d5130fa7 |
| 31 | `CheckRoomList` | 检测室 | `` | 310ffe42-3e33-420a-b0f5-bb79aac8ca47 |

---

## 关联属性（14个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `CheckDeviceList` | 检验仪器设备 | `QMSQIT.CheckPlan.CheckDevice` | None | true |
| 2 | `trendsInspectionPlan` | 动态检验方案id | `QMSQIT.dynamicinspectplan.DynamicInspectPlan` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `inspectStep` | 检验步骤 | `QMSQIT.inspectstepdefine.InspectStepDefine` | None |  |
| 7 | `inspectionBasic` | 检测依据 | `QMSDFM.detectionbasis.qam_detectionbasis` | Service |  |
| 8 | `CheckRoomList` | 检测室 | `QMSQIT.CheckPlan.CheckRoom` | None | true |
| 9 | `CheckInfoList` | 检验信息 | `QMSQIT.CheckPlan.CheckInfo` | None | true |
| 10 | `planID` | 表头ID | `QMSQIT.CheckPlan.CheckPlan` | None | true |
| 11 | `sampleMethodDetailId` | 取样方式主表id | `QMSDFM.sampleMethod.sampleMethodDetail` | Service |  |
| 12 | `checkPlanDetailId` | 检验方案主表id | `QMSDFM.inspectionPlan.inspectionPlanDetail` | Service |  |
| 13 | `inspectionPlanId` | 检验方案id(停用) | `QMSDFM.inspectionPlan.inspectionPlan` | Service |  |
| 14 | `samplingMethod` | 取样方式id(停用) | `QMSDFM.sampleMethod.sampleMethod` | Service |  |
