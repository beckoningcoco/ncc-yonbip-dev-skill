---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.exceptapply.ExceptApplyDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 异常申报信息 (`sfc.exceptapply.ExceptApplyDetail`)

> IMPSFC | 物理表：`imp_sfc_except_apply_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 异常申报信息 |
| 物理表 | `imp_sfc_except_apply_detail` |
| 数据库 schema | `IMP-SFC` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:21:43.6810` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（38个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `applyId` | 异常申报 | `apply_id` | 4656e54c-3f6b-452f-bd9b-0d09391b456b |
| 2 | `attachmentId` | 附件 | `attachmentId` | String |
| 3 | `billType` | 单据类型 | `bill_type` | String |
| 4 | `classifyId` | 异常类型 | `classify_id` | 50e2e950-c9af-43d1-97b4-681b98241a8a |
| 5 | `deviceId` | 设备 | `device_id` | e9f23971-1c19-49e1-83d7-3a84ebcb187e |
| 6 | `dr` | 逻辑删除标记 | `dr` | Short |
| 7 | `exceptDescription` | 异常描述 | `except_description` | String |
| 8 | `exceptTime` | 发生时间 | `except_time` | DateTime |
| 9 | `flowCardId` | 工序流转卡 | `flow_card_id` | a1d46721-c171-401e-9f07-ef70a36e2abf |
| 10 | `flowPlanId` | 工序流转卡工序 | `flow_plan_id` | e4a42545-5567-4ba7-be49-38a63843cfab |
| 11 | `freeCharacteristics` | 自由项特征组 | `free_characteristics` | 29b9bea5-c072-4e8f-8123-9dd56652a9bd |
| 12 | `handlerStatus` | 异常处理状态 | `handler_status` | String |
| 13 | `id` | ID | `id` | Long |
| 14 | `isHandled` | 已生成生产异常 | `is_handled` | Short |
| 15 | `isProException` | 生产异常 | `is_pro_exception` | Short |
| 16 | `level` | 异常紧急状态 | `level` | String |
| 17 | `lineno` | 行号 | `lineno` | Decimal |
| 18 | `mainUnitId` | 主计量单位 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 19 | `operationId` | 标准工序 | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 20 | `orderId` | 生产订单 | `order_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 21 | `orderProcessId` | 生产订单工序 | `order_process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 22 | `orderProductId` | 生产订单产品 | `order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 23 | `outUnitId` | 产出单位 | `out_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 24 | `procPlanDetailId` | 工序作业计划明细 | `proc_plan_detail_id` | 7e33a4bf-edce-447c-8e6f-0717cec2b092 |
| 25 | `procPlanId` | 工序作业计划 | `proc_plan_id` | 48e1a533-51f0-4a5a-9465-6fff30ce5229 |
| 26 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 27 | `productionUnitId` | 生产单位 | `production_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 28 | `pubts` | 时间戳 | `pubts` | DateTime |
| 29 | `rowno` | 序号 | `rowno` | Integer |
| 30 | `scheduleProdNum` | 计划加工数量 | `schedule_prod_num` | Decimal |
| 31 | `scheduleProdNum1` | 计划加工件数 | `schedule_prod_num1` | Decimal |
| 32 | `scheduleProdNum2` | 计划加工数量(产出) | `schedule_prod_num2` | Decimal |
| 33 | `selfDefineCharacter` | 自定义项特征 | `self_define_character` | 39c58c43-e2a0-4c61-b905-3ffaf187b6ce |
| 34 | `sourceCode` | 来源单据号 | `source_code` | String |
| 35 | `sourceLineno` | 来源单据行号 | `source_lineno` | Decimal |
| 36 | `teamId` | 班组 | `team_id` | d1ce258a-6311-4719-846d-998458841d05 |
| 37 | `workCenterId` | 工作中心 | `work_center_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 38 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（20个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `productId` | 物料 | `pc.product.Product` | Service |  |
| 2 | `selfDefineCharacter` | 自定义项特征 | `sfc.exceptapply.ExceptApplyDetailSelfDefineCharacter` | None |  |
| 3 | `orderId` | 生产订单 | `po.order.Order` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `classifyId` | 异常类型 | `sfc.expclassify.ExpClassify` | None |  |
| 6 | `orderProductId` | 生产订单产品 | `po.order.OrderProduct` | Service |  |
| 7 | `deviceId` | 设备 | `aim.equip.EquipHeadVO` | Service |  |
| 8 | `productionUnitId` | 生产单位 | `pc.unit.Unit` | Service |  |
| 9 | `applyId` | 异常申报 | `sfc.exceptapply.ExceptApply` | None | true |
| 10 | `flowCardId` | 工序流转卡 | `sfc.processFlowCard.processFlowCard` | None |  |
| 11 | `procPlanId` | 工序作业计划 | `sfc.procPlan.ProcPlan` | None |  |
| 12 | `freeCharacteristics` | 自由项特征组 | `sfc.exceptapply.ExceptApplyDetailFreeCharacter` | None |  |
| 13 | `orderProcessId` | 生产订单工序 | `po.order.OrderProcess` | Service |  |
| 14 | `workCenterId` | 工作中心 | `ed.workcenter.WorkCenter` | Service |  |
| 15 | `teamId` | 班组 | `bd.timemodel.TeamDefinition` | Service |  |
| 16 | `operationId` | 标准工序 | `ed.operation.Operation` | Service |  |
| 17 | `procPlanDetailId` | 工序作业计划明细 | `sfc.procPlan.ProcPlanDetail` | None |  |
| 18 | `outUnitId` | 产出单位 | `pc.unit.Unit` | Service |  |
| 19 | `flowPlanId` | 工序流转卡工序 | `sfc.processFlowCard.processFlowCardPlan` | None |  |
| 20 | `mainUnitId` | 主计量单位 | `pc.unit.Unit` | Service |  |
