---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.excepthandler.ExceptHandler"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 异常处理 (`sfc.excepthandler.ExceptHandler`)

> IMPSFC | 物理表：`imp_sfc_except_handler`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 异常处理 |
| 物理表 | `imp_sfc_except_handler` |
| domain/服务域 | `IMP-SFC` |
| schema | `production_order` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:20:44.8700` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（68个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `orgId` | 工厂 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 2 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 3 | `departmentId` | 申报部门 | `department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 4 | `applyStaffId` | 申报人 | `apply_staff_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 5 | `applyDate` | 申报日期 | `apply_date` | Date |
| 6 | `exceptTime` | 发生时间 | `except_time` | DateTime |
| 7 | `classifyId` | 异常类型 | `classify_id` | 50e2e950-c9af-43d1-97b4-681b98241a8a |
| 8 | `exceptDescription` | 异常描述 | `except_description` | String |
| 9 | `level` | 异常紧急状态 | `level` | String |
| 10 | `isProException` | 生产异常 | `is_pro_exception` | Short |
| 11 | `workCenterId` | 工作中心 | `work_center_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 12 | `operationId` | 标准工序 | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 13 | `deviceId` | 设备 | `device_id` | e9f23971-1c19-49e1-83d7-3a84ebcb187e |
| 14 | `attachmentId` | 附件 | `attachmentId` | String |
| 15 | `confirmUserId` | 确认人 | `confirm_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 16 | `confirmTime` | 确认时间 | `confirm_time` | DateTime |
| 17 | `selfDefineCharacter` | 自定义项特征 | `self_define_character` | 8c80144c-2cdc-436e-b6f4-d5d266ee1fc1 |
| 18 | `orderId` | 生产订单 | `order_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 19 | `orderProductId` | 生产订单产品 | `order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 20 | `orderProcessId` | 生产订单工序 | `order_process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 21 | `billType` | 单据类型 | `bill_type` | String |
| 22 | `procPlanId` | 工序作业计划 | `proc_plan_id` | 48e1a533-51f0-4a5a-9465-6fff30ce5229 |
| 23 | `flowCardId` | 工序流转卡 | `flow_card_id` | a1d46721-c171-401e-9f07-ef70a36e2abf |
| 24 | `flowPlanId` | 工序流转卡工序 | `flow_plan_id` | e4a42545-5567-4ba7-be49-38a63843cfab |
| 25 | `sourceCode` | 来源单据号 | `source_code` | String |
| 26 | `sourceLineno` | 来源单据行号 | `source_lineno` | Decimal |
| 27 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 28 | `scheduleProdNum` | 计划加工数量 | `schedule_prod_num` | Decimal |
| 29 | `scheduleProdNum1` | 计划加工件数 | `schedule_prod_num1` | Decimal |
| 30 | `scheduleProdNum2` | 计划加工数量(产出) | `schedule_prod_num2` | Decimal |
| 31 | `mainUnitId` | 主计量单位 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 32 | `productionUnitId` | 生产单位 | `production_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 33 | `outUnitId` | 产出单位 | `out_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 34 | `teamId` | 班组 | `team_id` | d1ce258a-6311-4719-846d-998458841d05 |
| 35 | `freeCharacteristics` | 自由项特征组 | `free_characteristics` | 5b9fe49e-89f0-4a1f-95f1-07c10998ded5 |
| 36 | `upcode` | 来源单据号 | `upcode` | String |
| 37 | `auditor` | 审批人名称 | `auditor` | String |
| 38 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 39 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 40 | `auditDate` | 审批日期 | `audit_date` | Date |
| 41 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 42 | `barCode` | 条形码 | `bar_code` | String |
| 43 | `dr` | 逻辑删除标记 | `dr` | Short |
| 44 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 45 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 46 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 47 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 48 | `source` | 上游单据类型 | `source` | String |
| 49 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 50 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 51 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 52 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 53 | `tplid` | 模板id | `tplid` | Long |
| 54 | `status` | 单据状态 | `status` | Short |
| 55 | `code` | 编码 | `code` | String |
| 56 | `createTime` | 创建时间 | `create_time` | DateTime |
| 57 | `createDate` | 创建日期 | `create_date` | Date |
| 58 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 59 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 60 | `creator` | 创建人名称 | `creator` | String |
| 61 | `modifier` | 修改人名称 | `modifier` | String |
| 62 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 63 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 64 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 65 | `id` | ID | `id` | Long |
| 66 | `pubts` | 时间戳 | `pubts` | DateTime |
| 67 | `ExceptHandlerInfoList` | 异常处理信息 | `` | 3c2e9f44-9c7d-42c1-8494-8110169cc5c9 |
| 68 | `procPlanDetailId` | 工序作业计划明细 | `proc_plan_detail_id` | 7e33a4bf-edce-447c-8e6f-0717cec2b092 |

---

## 关联属性（30个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `orderId` | 生产订单 | `po.order.Order` | Service |  |
| 2 | `classifyId` | 异常类型 | `sfc.expclassify.ExpClassify` | None |  |
| 3 | `departmentId` | 申报部门 | `aa.baseorg.DeptMV` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 7 | `deviceId` | 设备 | `aim.equip.EquipHeadVO` | Service |  |
| 8 | `confirmUserId` | 确认人 | `base.user.User` | Service |  |
| 9 | `orgId` | 工厂 | `org.func.BaseOrg` | Service |  |
| 10 | `workCenterId` | 工作中心 | `ed.workcenter.WorkCenter` | Service |  |
| 11 | `transTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 12 | `operationId` | 标准工序 | `ed.operation.Operation` | Service |  |
| 13 | `outUnitId` | 产出单位 | `pc.unit.Unit` | Service |  |
| 14 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 15 | `ExceptHandlerInfoList` | 异常处理信息 | `sfc.excepthandler.ExceptHandlerInfo` | None | true |
| 16 | `flowPlanId` | 工序流转卡工序 | `sfc.processFlowCard.processFlowCardPlan` | None |  |
| 17 | `mainUnitId` | 主计量单位 | `pc.unit.Unit` | Service |  |
| 18 | `productId` | 物料 | `pc.product.Product` | Service |  |
| 19 | `selfDefineCharacter` | 自定义项特征 | `sfc.excepthandler.ExceptHandlerSelfDefineCharacter` | None |  |
| 20 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 21 | `applyStaffId` | 申报人 | `bd.staff.Staff` | Service |  |
| 22 | `orderProductId` | 生产订单产品 | `po.order.OrderProduct` | Service |  |
| 23 | `productionUnitId` | 生产单位 | `pc.unit.Unit` | Service |  |
| 24 | `flowCardId` | 工序流转卡 | `sfc.processFlowCard.processFlowCard` | None |  |
| 25 | `procPlanId` | 工序作业计划 | `sfc.procPlan.ProcPlan` | None |  |
| 26 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 27 | `freeCharacteristics` | 自由项特征组 | `sfc.excepthandler.ExceptHandlerFreeCharacter` | None |  |
| 28 | `orderProcessId` | 生产订单工序 | `po.order.OrderProcess` | Service |  |
| 29 | `teamId` | 班组 | `bd.timemodel.TeamDefinition` | Service |  |
| 30 | `procPlanDetailId` | 工序作业计划明细 | `sfc.procPlan.ProcPlanDetail` | None |  |
