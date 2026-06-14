---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.processFlowCard.processFlowCardHandOver"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工序流转卡交接 (`sfc.processFlowCard.processFlowCardHandOver`)

> IMPSFC | 物理表：`imp_sfc_procflowcard_handover`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工序流转卡交接 |
| 物理表 | `imp_sfc_procflowcard_handover` |
| domain/服务域 | `IMP-SFC` |
| schema | `production_order` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:20:48.0040` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（41个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `createDate` | 创建日期 | `create_date` | Date |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime |
| 3 | `creator` | 创建人名称 | `creator` | String |
| 4 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 5 | `dr` | 逻辑删除标记 | `dr` | Short |
| 6 | `handMethod` | 交接方式 | `hand_method` | Short |
| 7 | `handoverDate` | 交接日期 | `handover_date` | Date |
| 8 | `handoverTime` | 交接时间 | `handover_time` | DateTime |
| 9 | `handoverType` | 交接类型 | `handover_type` | Short |
| 10 | `id` | ID | `id` | Long |
| 11 | `isConfirm` | 交接确认 | `is_confirm` | Short |
| 12 | `modifier` | 修改人名称 | `modifier` | String |
| 13 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 14 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 15 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 16 | `outputUnitId` | 产出单位 | `output_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 17 | `prodUnitId` | 生产单位 | `prod_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime |
| 19 | `receiveCardId` | 目标工序流转卡ID | `receive_card_id` | a1d46721-c171-401e-9f07-ef70a36e2abf |
| 20 | `receivePlanId` | 目标流转卡工序ID | `receive_plan_id` | e4a42545-5567-4ba7-be49-38a63843cfab |
| 21 | `receiveUser` | 接收人 | `receive_user` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 22 | `sourceCardId` | 来源工序流转卡ID | `source_card_id` | a1d46721-c171-401e-9f07-ef70a36e2abf |
| 23 | `sourcePlanId` | 来源流转卡工序ID | `source_plan_id` | e4a42545-5567-4ba7-be49-38a63843cfab |
| 24 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 25 | `transferUser` | 转出人 | `transfer_user` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 26 | `turnQty` | 交接数量 | `turn_qty` | Decimal |
| 27 | `turnQty1` | 交接件数 | `turn_qty1` | Decimal |
| 28 | `turnQty2` | 交接数量(产出) | `turn_qty2` | Decimal |
| 29 | `unitId` | 主计量单位 | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 30 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 31 | `opSequenceId` | 工序序列ID | `op_sequence_id` | c89032db-c707-4a7d-84ef-bdd29d142856 |
| 32 | `opSequenceType` | 序列类型 | `op_sequence_type` | Integer |
| 33 | `receiveCenterId` | 转入工作中心 | `receive_center_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 34 | `remarks` | 备注 | `remarks` | String |
| 35 | `taskReportDetailId` | 任务汇报行ID | `task_report_detail_id` | 7ed5ecde-bf12-45c3-a73a-e69e184d05e8 |
| 36 | `taskReportId` | 任务汇报ID | `task_report_id` | 5b6b44a2-42c1-49e8-9351-f34ff6838c71 |
| 37 | `transferCenterId` | 转出工作中心 | `transfer_center_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 38 | `transferOutQty` | 转出数量 | `transfer_out_qty` | Decimal |
| 39 | `transferOutQty1` | 转出件数 | `transfer_out_qty1` | Decimal |
| 40 | `transferOutQty2` | 转出数量（产出） | `transfer_out_qty2` | Decimal |
| 41 | `transferOutTime` | 转出时间 | `transfer_out_time` | DateTime |

---

## 关联属性（18个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `receiveCardId` | 目标工序流转卡ID | `sfc.processFlowCard.processFlowCard` | None |  |
| 2 | `opSequenceId` | 工序序列ID | `po.order.OrderOpSequence` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `receivePlanId` | 目标流转卡工序ID | `sfc.processFlowCard.processFlowCardPlan` | None |  |
| 7 | `transferUser` | 转出人 | `bd.staff.Staff` | Service |  |
| 8 | `outputUnitId` | 产出单位 | `pc.unit.Unit` | Service |  |
| 9 | `sourceCardId` | 来源工序流转卡ID | `sfc.processFlowCard.processFlowCard` | None |  |
| 10 | `taskReportDetailId` | 任务汇报行ID | `sfc.proceTaskReport.ProceTaskReportDetail` | None |  |
| 11 | `prodUnitId` | 生产单位 | `pc.unit.Unit` | Service |  |
| 12 | `receiveUser` | 接收人 | `bd.staff.Staff` | Service |  |
| 13 | `sourcePlanId` | 来源流转卡工序ID | `sfc.processFlowCard.processFlowCardPlan` | None | true |
| 14 | `taskReportId` | 任务汇报ID | `sfc.proceTaskReport.proceTaskReport` | None |  |
| 15 | `transferCenterId` | 转出工作中心 | `ed.workcenter.WorkCenter` | Service |  |
| 16 | `receiveCenterId` | 转入工作中心 | `ed.workcenter.WorkCenter` | Service |  |
| 17 | `unitId` | 主计量单位 | `pc.unit.Unit` | Service |  |
| 18 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
