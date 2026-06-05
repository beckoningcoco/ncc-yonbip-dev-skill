---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.dispatchinfo.DispatchWorkbench"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 派工工作台 (`sfc.dispatchinfo.DispatchWorkbench`)

> IMPSFC | 物理表：`imp_sfc_proc_plan`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 派工工作台 |
| 物理表 | `imp_sfc_proc_plan` |
| 数据库 schema | `IMP-SFC` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:23:51.5320` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（296个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `totalTurnoutReworkNum1` | 累计外协待返工件数 | `total_turnout_rework_num1` | Decimal |
| 2 | `preSn` | 前序顺序号 | `pre_sn` | Decimal |
| 3 | `totalTurnoutReworkNum2` | 累计外协待返工数量(产出) | `total_turnout_rework_num2` | Decimal |
| 4 | `osmOrderQty` | 转委外订单数量 | `osm_order_qty` | Decimal |
| 5 | `orderIsHold` | 生产订单挂起状态 | `order_is_hold` | Short |
| 6 | `publishDate` | 发布日期 | `publish_date` | Date |
| 7 | `firstsource` | 源头单据类型 | `first_source` | String |
| 8 | `scrapInNum1` | 累计报废转出件数 | `scrap_in_num1` | Decimal |
| 9 | `deviceId` | 设备 | `device_id` | e9f23971-1c19-49e1-83d7-3a84ebcb187e |
| 10 | `scrapInNum2` | 累计报废转出数量(产出) | `scrap_in_num2` | Decimal |
| 11 | `isApply` | 请购 | `is_apply` | Short |
| 12 | `nextId` | 后工序 | `next_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 13 | `processFlowId` | 工序流转卡 | `process_flow_id` | a1d46721-c171-401e-9f07-ef70a36e2abf |
| 14 | `isConfirm` | 汇报确认 | `is_confirm` | Short |
| 15 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 16 | `tplid` | 模板id | `tplid` | Long |
| 17 | `mainUnitId` | 主计量单位 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 18 | `scheduleEndTime` | 计划完工时间 | `schedule_end_time` | DateTime |
| 19 | `totalReworkNum` | 累计待返工数量 | `total_rework_num` | Decimal |
| 20 | `completeTime` | 完工时间 | `complete_time` | DateTime |
| 21 | `orderProductId` | 生产订单产品 | `order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 22 | `materialId` | 制造物料 | `material_id` | Long |
| 23 | `dispatchedNum` | 已分派数量 | `dispatched_num` | Decimal |
| 24 | `orderProcessId` | 生产订单工序 | `order_process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 25 | `isAutohandover` | 自动交接 | `is_autohandover` | Short |
| 26 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 27 | `isSerialNoManage` | 序列号管理 | `is_serial_no_manage` | Short |
| 28 | `holdDesc` | 挂起说明 | `hold_desc` | String |
| 29 | `dispatchUserId` | 派工人 | `dispatch_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 30 | `dispatchTime` | 派工时间 | `dispatch_time` | DateTime |
| 31 | `materialApplyStatus` | 领料申请状态 | `material_apply_status` | Short |
| 32 | `materialStatus` | 领料状态 | `material_status` | Short |
| 33 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 34 | `verifystate` | 审批状态 | `verifystate` | Short |
| 35 | `returncount` | 退回次数 | `returncount` | Short |
| 36 | `printCount` | 打印次数 | `printCount` | Integer |
| 37 | `holdDate` | 挂起日期 | `hold_date` | Date |
| 38 | `totalTurnoutReturnNum` | 累计外协转自返数量 | `total_turnout_return_num` | Decimal |
| 39 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 40 | `actualEndTime` | 实际完工时间 | `actual_end_time` | DateTime |
| 41 | `unauditDate` | 弃审日期 | `unaudit_date` | Date |
| 42 | `srcProcPlanId` | 源工序作业计划 | `src_proc_plan_id` | 48e1a533-51f0-4a5a-9465-6fff30ce5229 |
| 43 | `startDate` | 开工日期 | `start_date` | Date |
| 44 | `schedulePrepareTime` | 计划准备工时 | `schedule_prepare_time` | Decimal |
| 45 | `totalExecNum2` | 累计执行数量(产出) | `total_exec_num2` | Decimal |
| 46 | `totalExecNum1` | 累计执行件数 | `total_exec_num1` | Decimal |
| 47 | `totalQualifiedNum2` | 累计合格数量(产出) | `total_qualified_num2` | Decimal |
| 48 | `totalQualifiedNum1` | 累计合格件数 | `total_qualified_num1` | Decimal |
| 49 | `holdReasonId` | 挂起原因 | `hold_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 50 | `sn` | 工序顺序号 | `sn` | Decimal |
| 51 | `processType` | 加工类型 | `process_type` | Short |
| 52 | `orderIsClose` | 生产订单关闭状态 | `order_is_close` | Short |
| 53 | `pubts` | 时间戳 | `pubts` | DateTime |
| 54 | `totalReturnNum1` | 累计退回件数 | `total_return_num1` | Decimal |
| 55 | `totalTurnoutDispatchNum2` | 累计外协分派数量(产出) | `total_turnout_dispatch_num2` | Decimal |
| 56 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 57 | `totalTurnoutDispatchNum1` | 累计外协分派件数 | `total_turnout_dispatch_num1` | Decimal |
| 58 | `totalReworkProcessNum` | 累计返工处理数量 | `total_rework_process_num` | Decimal |
| 59 | `isClose` | 关闭 | `is_close` | Short |
| 60 | `totalReturnNum2` | 累计退回数量(产出) | `total_return_num2` | Decimal |
| 61 | `auditor` | 审批人名称 | `auditor` | String |
| 62 | `isOutsource` | 委外 | `is_outsource` | Short |
| 63 | `totalTurnNum` | 累计转出数量 | `total_turn_num` | Decimal |
| 64 | `closer` | 关闭人名称 | `closer` | String |
| 65 | `completeUserId` | 完工人 | `complete_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 66 | `createTime` | 创建时间 | `create_time` | DateTime |
| 67 | `productionDepartmentId` | 部门 | `production_department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 68 | `totalTurnoutReturnNum1` | 累计外协转自返件数 | `total_turnout_return_num1` | Decimal |
| 69 | `totalTurnoutReturnNum2` | 累计外协转自返数量(产出) | `total_turnout_return_num2` | Decimal |
| 70 | `uncompleteTime` | 反完工时间 | `uncomplete_time` | DateTime |
| 71 | `totalReworkTurnNum` | 累计返工转出数量 | `total_rework_turn_num` | Decimal |
| 72 | `exeOrgId` | 执行组织 | `exe_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 73 | `totalTurnoutReworkNum` | 累计外协待返工数量 | `total_turnout_rework_num` | Decimal |
| 74 | `osmApplicationQty` | 转委外申请数量 | `osm_application_qty` | Decimal |
| 75 | `vendorId` | 供应商 | `vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 76 | `outExchangeType` | 换算方式 | `out_exchange_type` | Short |
| 77 | `dr` | 逻辑删除标记 | `dr` | Short |
| 78 | `dispatchId` | 派工单id | `dispatch_id` | d9807931-2439-4200-9b93-efacb0f688b5 |
| 79 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 80 | `scheduleOutputNum2` | 预计产出数量(产出) | `schedule_output_num2` | Decimal |
| 81 | `scheduleOutputNum1` | 预计产出件数 | `schedule_output_num1` | Decimal |
| 82 | `scrapInNum` | 累计报废转出数量 | `scrap_in_num` | Decimal |
| 83 | `totalTurnoutBackNum1` | 累计外发收回件数 | `total_turnout_back_num1` | Decimal |
| 84 | `totalTurnoutBackNum2` | 累计外发收回数量(产出) | `total_turnout_back_num2` | Decimal |
| 85 | `scheduleOutputNum` | 预计产出数量 | `schedule_output_num` | Decimal |
| 86 | `batchNo` | 批次号 | `batch_no` | String |
| 87 | `batch` | 批次 | `batch` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 88 | `unpublishDate` | 取消发布日期 | `unpublish_date` | Date |
| 89 | `isHold` | 挂起 | `is_hold` | Short |
| 90 | `barCode` | 条形码 | `bar_code` | String |
| 91 | `name` | 名称 | `name` | String |
| 92 | `totalReworkProcessNum2` | 累计返工处理数量(产出) | `total_rework_process_num2` | Decimal |
| 93 | `breakUpTransferInQty` | 分割转入数量 | `break_up_transfer_in_qty` | Decimal |
| 94 | `totalReworkProcessNum1` | 累计返工处理件数 | `total_rework_process_num1` | Decimal |
| 95 | `processMode` | 加工组织模式 | `process_mode` | Short |
| 96 | `breakUpTransferOutQty` | 分割转出数量 | `break_up_transfer_out_qty` | Decimal |
| 97 | `outChangeRate` | 产出主计量转换率 | `out_change_rate` | Decimal |
| 98 | `breakUpTransferInQty1` | 分割转入件数 | `break_up_transfer_in_qty1` | Decimal |
| 99 | `breakUpTransferOutQty2` | 分割转出数量(产出) | `break_up_transfer_out_qty2` | Decimal |
| 100 | `breakUpTransferInQty2` | 分割转入数量(产出) | `break_up_transfer_in_qty2` | Decimal |
| 101 | `actualStartTime` | 实际开工时间 | `actual_start_time` | DateTime |
| 102 | `breakUpTransferOutQty1` | 分割转出件数 | `break_up_transfer_out_qty1` | Decimal |
| 103 | `producedate` | 生产日期 | `dProduceDate` | Date |
| 104 | `firstsourceautoid` | 源头单据子表id | `first_source_autoid` | Long |
| 105 | `totalTurnoutScrapNum1` | 累计外协报废件数 | `total_turnout_scrap_num1` | Decimal |
| 106 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 107 | `costCenterId` | 成本中心 | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 108 | `isAutoComplete` | 自动完工 | `is_auto_complete` | Short |
| 109 | `totalTurnoutScrapNum2` | 累计外协报废数量(产出) | `total_turnout_scrap_num2` | Decimal |
| 110 | `firstsourceid` | 源头单据id | `first_source_id` | Long |
| 111 | `isByReport` | 按任务汇报交接 | `is_by_report` | Short |
| 112 | `firstCheck` | 首件检验 | `first_check` | String |
| 113 | `totalReworkNum2` | 累计待返工数量(产出) | `total_rework_num2` | Decimal |
| 114 | `totalReworkNum1` | 累计待返工件数 | `total_rework_num1` | Decimal |
| 115 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 116 | `totalTurninNum` | 累计转入数量 | `total_turnin_num` | Decimal |
| 117 | `qualifiedInNum` | 合格在制入库数量 | `qualified_in_num` | Decimal |
| 118 | `totalTurnoutQualifiedNum1` | 累计外协合格件数 | `total_turnout_qualified_num1` | Decimal |
| 119 | `totalTurnoutQualifiedNum2` | 累计外协合格数量(产出) | `total_turnout_qualified_num2` | Decimal |
| 120 | `dispatchStatus` | 派工状态 | `dispatch_status` | Short |
| 121 | `closeDate` | 关闭日期 | `close_Date` | Date |
| 122 | `totalReturnNum` | 累计退回数量 | `total_return_num` | Decimal |
| 123 | `totalTurnoutScrapNum` | 累计外协报废数量 | `total_turnout_scrap_num` | Decimal |
| 124 | `orderCode` | 生产订单编号 | `order_code` | String |
| 125 | `openDate` | 打开日期 | `open_date` | Date |
| 126 | `staffId` | 员工 | `staff_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 127 | `unstartTime` | 反开工时间 | `unstart_time` | DateTime |
| 128 | `orderId` | 生产订单 | `order_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 129 | `operationControlId` | 工序控制码 | `operation_control_id` | b47f926b-e3ed-40e1-8423-171e9fb107c9 |
| 130 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 131 | `confirmUserId` | 汇报确认人 | `confirm_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 132 | `completeDate` | 完工日期 | `complete_date` | Date |
| 133 | `scheduleProdNum` | 计划加工数量 | `schedule_prod_num` | Decimal |
| 134 | `totalCompleteNum` | 累计完成数量 | `total_complete_num` | Decimal |
| 135 | `invaliddate` | 失效日期 | `dInvalidDate` | Date |
| 136 | `closerId` | 关闭人 | `closerId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 137 | `uncompleteUserId` | 反完工人 | `uncomplete_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 138 | `id` | ID | `id` | Long |
| 139 | `scheduleProdNum2` | 计划加工数量(产出) | `schedule_prod_num2` | Decimal |
| 140 | `totalTurnoutNum` | 累计转外发数量 | `total_turnout_num` | Decimal |
| 141 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 142 | `scheduleProdNum1` | 计划加工件数 | `schedule_prod_num1` | Decimal |
| 143 | `publishTime` | 发布时间 | `publish_time` | DateTime |
| 144 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 145 | `openUserId` | 打开人 | `open_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 146 | `totalReworkTurnNum2` | 累计返工转出数量(产出) | `total_rework_turn_num2` | Decimal |
| 147 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 148 | `totalReworkTurnNum1` | 累计返工转出件数 | `total_rework_turn_num1` | Decimal |
| 149 | `warehouseId` | 仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 150 | `totalQualifiedTurnNum1` | 累计合格转出件数 | `total_qualified_turn_num1` | Decimal |
| 151 | `totalQualifiedTurnNum2` | 累计合格转出数量(产出) | `total_qualified_turn_num2` | Decimal |
| 152 | `totalExecNum` | 累计执行数量 | `total_exec_num` | Decimal |
| 153 | `status` | 单据状态 | `status` | Short |
| 154 | `preId` | 前工序 | `pre_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 155 | `goodsId` | 货位 | `goods_id` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc |
| 156 | `orgId` | 工厂 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 157 | `isCheckConfirm` | 检验确认 | `is_check_confirm` | Short |
| 158 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 159 | `startUserId` | 开工人 | `start_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 160 | `handoverUserId` | 交接人 | `handover_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 161 | `operationId` | 标准工序 | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 162 | `startTime` | 开工时间 | `start_time` | DateTime |
| 163 | `unauditTime` | 弃审时间 | `unaudit_time` | DateTime |
| 164 | `unstartUserId` | 反开工人 | `unstart_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 165 | `isReportPoint` | 报告点 | `is_reportpoint` | Short |
| 166 | `createDate` | 创建日期 | `create_date` | Date |
| 167 | `auditDate` | 审批日期 | `audit_date` | Date |
| 168 | `closeReasonId` | 关闭原因 | `close_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 169 | `creator` | 创建人名称 | `creator` | String |
| 170 | `orderLineNo` | 生产订单产品行号 | `order_line_no` | Decimal |
| 171 | `selfDefineCharacter` | 工序作业计划自定义项特征实体 | `self_define_character` | 71b56487-a568-4d6e-9c11-0f09d8e82411 |
| 172 | `publishUserId` | 发布人 | `publish_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 173 | `firstsourceautono` | 源头单据子表行号 | `first_source_autono` | Decimal |
| 174 | `totalTurnoutBackNum` | 累计外发收回数量 | `total_turnout_back_num` | Decimal |
| 175 | `productionUnitId` | 生产单位 | `production_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 176 | `holdTime` | 挂起时间 | `hold_time` | DateTime |
| 177 | `totalTurnNum1` | 累计转出件数 | `total_turn_num1` | Decimal |
| 178 | `totalTurnNum2` | 累计转出数量(产出) | `total_turn_num2` | Decimal |
| 179 | `osmOrderQty1` | 转委外订单件数 | `osm_order_qty1` | Decimal |
| 180 | `osmOrderQty2` | 转委外订单数量(产出) | `osm_order_qty2` | Decimal |
| 181 | `osmApplicationQty2` | 转委外申请数量(产出) | `osm_application_qty2` | Decimal |
| 182 | `modifier` | 修改人名称 | `modifier` | String |
| 183 | `osmApplicationQty1` | 转委外申请件数 | `osm_application_qty1` | Decimal |
| 184 | `totalTurnoutQualifiedNum` | 累计外协合格数量 | `total_turnout_qualified_num` | Decimal |
| 185 | `firstupcode` | 源头单据号 | `first_upcode` | String |
| 186 | `define30` | 自定义项30 | `define30` | String |
| 187 | `totalScrapNum` | 累计报废数量 | `total_scrap_num` | Decimal |
| 188 | `uncompleteDate` | 反完工日期 | `uncomplete_date` | Date |
| 189 | `define27` | 自定义项27 | `define27` | String |
| 190 | `define28` | 自定义项28 | `define28` | String |
| 191 | `unstartDate` | 反开工日期 | `unstart_date` | Date |
| 192 | `define29` | 自定义项29 | `define29` | String |
| 193 | `workCenterId` | 工作中心 | `work_center_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 194 | `handoverTime` | 交接时间 | `handover_time` | DateTime |
| 195 | `qualifiedInNum2` | 合格在制入库数量(产出) | `qualified_in_num2` | Decimal |
| 196 | `qualifiedInNum1` | 合格在制入库件数 | `qualified_in_num1` | Decimal |
| 197 | `isManualCreated` | 手工创建 | `is_manual_created` | Short |
| 198 | `outUnitId` | 产出单位 | `out_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 199 | `skuId` | SKU | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 200 | `checkType` | 质检方式 | `check_type` | Short |
| 201 | `osmReleasedQty` | 委外下达量 | `osm_released_qty` | Decimal |
| 202 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 203 | `osmReleasedQty2` | 委外下达量(产出) | `osm_released_qty2` | Decimal |
| 204 | `osmReleasedQty1` | 委外下达件数 | `osm_released_qty1` | Decimal |
| 205 | `isMonitorPoint` | 质检点 | `is_monitorpoint` | Short |
| 206 | `scheduleProcessTime` | 计划加工工时 | `schedule_process_time` | Decimal |
| 207 | `totalTurnoutDispatchNum` | 累计外协分派数量 | `total_turnout_dispatch_num` | Decimal |
| 208 | `checkConfirmUserId` | 检验确认人 | `check_confirm_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 209 | `mainChangeRate` | 生产主计量转换率 | `main_change_rate` | Decimal |
| 210 | `dataSource` | 数据来源 | `data_source` | Short |
| 211 | `define2` | 自定义项2 | `define2` | String |
| 212 | `define1` | 自定义项1 | `define1` | String |
| 213 | `code` | 编码 | `code` | String |
| 214 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 215 | `define12` | 自定义项12 | `define12` | String |
| 216 | `define9` | 自定义项9 | `define9` | String |
| 217 | `define13` | 自定义项13 | `define13` | String |
| 218 | `orderStatus` | 生产订单状态 | `order_status` | Short |
| 219 | `define8` | 自定义项8 | `define8` | String |
| 220 | `define14` | 自定义项14 | `define14` | String |
| 221 | `remark` | 备注 | `remark` | String |
| 222 | `define7` | 自定义项7 | `define7` | String |
| 223 | `define15` | 自定义项15 | `define15` | String |
| 224 | `define6` | 自定义项6 | `define6` | String |
| 225 | `unpublishUserId` | 取消发布人 | `unpublish_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 226 | `define5` | 自定义项5 | `define5` | String |
| 227 | `totalQualifiedNum` | 累计合格数量 | `total_qualified_num` | Decimal |
| 228 | `define4` | 自定义项4 | `define4` | String |
| 229 | `define10` | 自定义项10 | `define10` | String |
| 230 | `define3` | 自定义项3 | `define3` | String |
| 231 | `define11` | 自定义项11 | `define11` | String |
| 232 | `scheduleStartTime` | 计划开工时间 | `schedule_start_time` | DateTime |
| 233 | `dispatchSn` | 派工顺序号 | `dispatch_sn` | Decimal |
| 234 | `nextSn` | 后序顺序号 | `next_sn` | Decimal |
| 235 | `isExemptCheck` | 免检 | `is_exempt_check` | Short |
| 236 | `unpublishTime` | 取消发布时间 | `unpublish_time` | DateTime |
| 237 | `closeTime` | 关闭时间 | `close_time` | DateTime |
| 238 | `openTime` | 打开时间 | `open_time` | DateTime |
| 239 | `unauditorId` | 弃审人 | `unauditor_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 240 | `timeUnit` | 时间单位 | `time_unit` | Short |
| 241 | `shiftId` | 班次 | `shift_id` | 566d5ab9-aeca-4f63-a0d1-1b98a161c6bc |
| 242 | `totalCompleteNum1` | 累计完成件数 | `total_complete_num1` | Decimal |
| 243 | `holdUserId` | 挂起人 | `hold_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 244 | `totalTurninNum1` | 累计转入件数 | `total_turnin_num1` | Decimal |
| 245 | `totalCompleteNum2` | 累计完成数量(产出) | `total_complete_num2` | Decimal |
| 246 | `totalTurninNum2` | 累计转入数量(产出) | `total_turnin_num2` | Decimal |
| 247 | `define23` | 自定义项23 | `define23` | String |
| 248 | `totalScrapNum2` | 累计报废数量(产出) | `total_scrap_num2` | Decimal |
| 249 | `define24` | 自定义项24 | `define24` | String |
| 250 | `totalScrapNum1` | 累计报废件数 | `total_scrap_num1` | Decimal |
| 251 | `define25` | 自定义项25 | `define25` | String |
| 252 | `totalQualifiedTurnNum` | 累计合格转出数量 | `total_qualified_turn_num` | Decimal |
| 253 | `unitExchangeType` | 换算方式 | `unit_exchange_type` | Short |
| 254 | `define26` | 自定义项26 | `define26` | String |
| 255 | `isPublish` | 发布 | `is_publish` | Short |
| 256 | `define20` | 自定义项20 | `define20` | String |
| 257 | `define21` | 自定义项21 | `define21` | String |
| 258 | `define22` | 自定义项22 | `define22` | String |
| 259 | `totalTurnoutNum1` | 累计转外发件数 | `total_turnout_num1` | Decimal |
| 260 | `totalTurnoutNum2` | 累计转外发数量(产出) | `total_turnout_num2` | Decimal |
| 261 | `define16` | 自定义项16 | `define16` | String |
| 262 | `freeCharacteristics` | 工序作业计划自由项特征组 | `free_characteristics` | bcea44c4-b76e-4a60-b92f-cbfe0fb4ccea |
| 263 | `srcDispatchPlanId` | 源派工工序id | `src_dispatch_plan_id` | Long |
| 264 | `define17` | 自定义项17 | `define17` | String |
| 265 | `define18` | 自定义项18 | `define18` | String |
| 266 | `define19` | 自定义项19 | `define19` | String |
| 267 | `teamId` | 班组 | `team_id` | d1ce258a-6311-4719-846d-998458841d05 |
| 268 | `ProcPlanDeviceList` | 派工工作台设备 | `` | f55b04bc-b759-4561-a54a-68dde43390e4 |
| 269 | `ProcPlanDispatchList` | 任务分派信息表 | `` | e3987020-b920-474d-9f7f-8b88a9779485 |
| 270 | `ProcPlanExt` | 作业计划拓展 | `` | 2440ac51-6aa9-4661-81c8-28d61c0282ee |
| 271 | `ProcPlanOutputList` | 作业计划产出 | `` | d73fe026-9d13-472d-84bf-8342af4d8d87 |
| 272 | `ProcPlanSourceList` | 任务分派来源表 | `` | bd1d9c59-f287-4478-b9a0-09f1747dd70f |
| 273 | `ProcPlanStaffList` | 派工工作台人员 | `` | 1448bec6-a340-411f-b334-fcbff8eb67cc |
| 274 | `ProcPlanSuspendList` | 任务分派挂起解挂 | `` | 244bf663-0770-4c0b-8c2d-0c8aa81190e3 |
| 275 | `closeRemark` | 关闭说明 | `close_remark` | String |
| 276 | `firstCheckStatus` | 首检状态 | `first_check_status` | String |
| 277 | `firstCheckType` | 首检控制方式 | `first_check_type` | String |
| 278 | `inspectionStatus` | 检验状态 | `inspection_status` | Short |
| 279 | `interactiveMode` | 交互模式 | `interactive_mode` | Short |
| 280 | `mainChangeRateDen` | 生产换算率分母 | `main_change_rateden` | Decimal |
| 281 | `mainChangeRateNum` | 生产换算率分子 | `main_change_ratenum` | Decimal |
| 282 | `opSequenceId` | 工序序列 | `op_sequence_id` | c89032db-c707-4a7d-84ef-bdd29d142856 |
| 283 | `opSequenceType` | 序列类型 | `op_sequence_type` | Integer |
| 284 | `outChangeRateDen` | 产出换算率分母 | `out_change_rateden` | Decimal |
| 285 | `outChangeRateNum` | 产出换算率分子 | `out_change_ratenum` | Decimal |
| 286 | `qualifiedStockAuxiliaryQuantity` | 合格入库件数 | `qualified_stock_auxiliary_qua` | Decimal |
| 287 | `qualifiedStockOutQuantity` | 合格入库数量(产出) | `qualified_stock_out_quantity` | Decimal |
| 288 | `qualifiedStockQuantity` | 合格入库数量 | `qualified_stock_quantity` | Decimal |
| 289 | `scrapNoStockAuxQty` | 报废不入库件数 | `scrap_no_stock_aux_qty` | Decimal |
| 290 | `scrapNoStockOutQty` | 报废不入库数量(产出) | `scrap_no_stock_out_qty` | Decimal |
| 291 | `scrapNoStockQty` | 报废不入库数量 | `scrap_no_stock_qty` | Decimal |
| 292 | `scrapStockAuxiliaryQuantity` | 报废入库件数 | `scrap_stock_auxiliary_quantity` | Decimal |
| 293 | `scrapStockOutQuantity` | 报废入库数量(产出) | `scrap_stock_out_quantity` | Decimal |
| 294 | `scrapStockQuantity` | 报废入库数量 | `scrap_stock_quantity` | Decimal |
| 295 | `stockStatus` | 入库状态 | `stock_status` | Short |
| 296 | `totalCheckNum` | 累计检验数量 | `total_check_num` | Decimal |

---

## 关联属性（62个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ProcPlanOutputList` | 作业计划产出 | `sfc.dispatchinfo.DisPatchOutput` | None | true |
| 2 | `orderId` | 生产订单 | `po.order.Order` | Service |  |
| 3 | `exeOrgId` | 执行组织 | `org.func.BaseOrg` | Service |  |
| 4 | `operationControlId` | 工序控制码 | `ed.operationcontrolcode.OperationControlCode` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `vendorId` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 7 | `deviceId` | 设备 | `aim.equip.EquipHeadVO` | Service |  |
| 8 | `confirmUserId` | 汇报确认人 | `base.user.User` | Service |  |
| 9 | `dispatchId` | 派工单id | `sfc.dispatchinfo.DispatchInfo` | None | true |
| 10 | `nextId` | 后工序 | `po.order.OrderProcess` | Service |  |
| 11 | `processFlowId` | 工序流转卡 | `sfc.processFlowCard.processFlowCard` | None |  |
| 12 | `workCenterId` | 工作中心 | `ed.workcenter.WorkCenter` | Service |  |
| 13 | `closerId` | 关闭人 | `base.user.User` | Service |  |
| 14 | `transTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 15 | `uncompleteUserId` | 反完工人 | `base.user.User` | Service |  |
| 16 | `outUnitId` | 产出单位 | `pc.unit.Unit` | Service |  |
| 17 | `skuId` | SKU | `pc.product.ProductSKU` | Service |  |
| 18 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 19 | `mainUnitId` | 主计量单位 | `pc.unit.Unit` | Service |  |
| 20 | `productId` | 物料 | `pc.product.Product` | Service |  |
| 21 | `batch` | 批次 | `st.batchno.Batchno` | Service |  |
| 22 | `ProcPlanDispatchList` | 任务分派信息表 | `sfc.dispatchinfo.ProcPlanDispatch` | None | true |
| 23 | `orderProductId` | 生产订单产品 | `po.order.OrderProduct` | Service |  |
| 24 | `openUserId` | 打开人 | `base.user.User` | Service |  |
| 25 | `checkConfirmUserId` | 检验确认人 | `base.user.User` | Service |  |
| 26 | `ProcPlanSuspendList` | 任务分派挂起解挂 | `sfc.dispatchinfo.DisPatchSuspend` | None | true |
| 27 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 28 | `orderProcessId` | 生产订单工序 | `po.order.OrderProcess` | Service |  |
| 29 | `warehouseId` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 30 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 31 | `srcProcPlanId` | 源工序作业计划 | `sfc.procPlan.ProcPlan` | None |  |
| 32 | `preId` | 前工序 | `po.order.OrderProcess` | Service |  |
| 33 | `goodsId` | 货位 | `aa.goodsposition.GoodsPosition` | Service |  |
| 34 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 35 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 36 | `unpublishUserId` | 取消发布人 | `base.user.User` | Service |  |
| 37 | `holdReasonId` | 挂起原因 | `aa.reason.Reason` | Service |  |
| 38 | `orgId` | 工厂 | `org.func.BaseOrg` | Service |  |
| 39 | `ProcPlanStaffList` | 派工工作台人员 | `sfc.dispatchinfo.DisPatchStaff` | None | true |
| 40 | `startUserId` | 开工人 | `base.user.User` | Service |  |
| 41 | `handoverUserId` | 交接人 | `base.user.User` | Service |  |
| 42 | `costCenterId` | 成本中心 | `bd.costcenter.CostCenter` | Service |  |
| 43 | `ProcPlanExt` | 作业计划拓展 | `sfc.dispatchinfo.DisPatchExt` | None | true |
| 44 | `operationId` | 标准工序 | `ed.operation.Operation` | Service |  |
| 45 | `dispatchUserId` | 派工人 | `base.user.User` | Service |  |
| 46 | `unauditorId` | 弃审人 | `base.user.User` | Service |  |
| 47 | `unstartUserId` | 反开工人 | `base.user.User` | Service |  |
| 48 | `closeReasonId` | 关闭原因 | `aa.reason.Reason` | Service |  |
| 49 | `shiftId` | 班次 | `calendar.platformShift.PlatformShift` | Service |  |
| 50 | `selfDefineCharacter` | 工序作业计划自定义项特征实体 | `sfc.procPlan.ProcPlanSelfDefineCharacter` | None |  |
| 51 | `holdUserId` | 挂起人 | `base.user.User` | Service |  |
| 52 | `opSequenceId` | 工序序列 | `po.order.OrderOpSequence` | Service |  |
| 53 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 54 | `publishUserId` | 发布人 | `base.user.User` | Service |  |
| 55 | `productionUnitId` | 生产单位 | `pc.unit.Unit` | Service |  |
| 56 | `ProcPlanDeviceList` | 派工工作台设备 | `sfc.dispatchinfo.DisPatchDevice` | None | true |
| 57 | `completeUserId` | 完工人 | `base.user.User` | Service |  |
| 58 | `freeCharacteristics` | 工序作业计划自由项特征组 | `sfc.procPlan.ProcPlanFreeCharacter` | None |  |
| 59 | `ProcPlanSourceList` | 任务分派来源表 | `sfc.dispatchinfo.DisPatchSource` | None | true |
| 60 | `teamId` | 班组 | `bd.timemodel.TeamDefinition` | Service |  |
| 61 | `productionDepartmentId` | 部门 | `aa.baseorg.DeptMV` | Service |  |
| 62 | `staffId` | 员工 | `bd.staff.Staff` | Service |  |
