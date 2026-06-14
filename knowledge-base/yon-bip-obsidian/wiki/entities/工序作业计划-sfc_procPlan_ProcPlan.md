---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.procPlan.ProcPlan"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工序作业计划 (`sfc.procPlan.ProcPlan`)

> IMPSFC | 物理表：`imp_sfc_proc_plan`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工序作业计划 |
| 物理表 | `imp_sfc_proc_plan` |
| domain/服务域 | `IMP-SFC` |
| schema | `production_order` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:21:57.1610` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 车间任务编号 |

---

## 直接属性（299个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `batch` | 批次 | `batch` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 2 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 3 | `define1` | 自定义项1 | `define1` | String |
| 4 | `define10` | 自定义项10 | `define10` | String |
| 5 | `define11` | 自定义项11 | `define11` | String |
| 6 | `define12` | 自定义项12 | `define12` | String |
| 7 | `define13` | 自定义项13 | `define13` | String |
| 8 | `define14` | 自定义项14 | `define14` | String |
| 9 | `define15` | 自定义项15 | `define15` | String |
| 10 | `define16` | 自定义项16 | `define16` | String |
| 11 | `define17` | 自定义项17 | `define17` | String |
| 12 | `define18` | 自定义项18 | `define18` | String |
| 13 | `define19` | 自定义项19 | `define19` | String |
| 14 | `define2` | 自定义项2 | `define2` | String |
| 15 | `define20` | 自定义项20 | `define20` | String |
| 16 | `define21` | 自定义项21 | `define21` | String |
| 17 | `define22` | 自定义项22 | `define22` | String |
| 18 | `define23` | 自定义项23 | `define23` | String |
| 19 | `define24` | 自定义项24 | `define24` | String |
| 20 | `define25` | 自定义项25 | `define25` | String |
| 21 | `define26` | 自定义项26 | `define26` | String |
| 22 | `define27` | 自定义项27 | `define27` | String |
| 23 | `define28` | 自定义项28 | `define28` | String |
| 24 | `define29` | 自定义项29 | `define29` | String |
| 25 | `define3` | 自定义项3 | `define3` | String |
| 26 | `dispatchId` | 派工单id | `dispatch_id` | d9807931-2439-4200-9b93-efacb0f688b5 |
| 27 | `srcDispatchPlanId` | 源派工工序id | `src_dispatch_plan_id` | Long |
| 28 | `isSerialNoManage` | 序列号管理 | `is_serial_no_manage` | Short |
| 29 | `firstCheckType` | 首检控制方式 | `first_check_type` | String |
| 30 | `firstCheckStatus` | 首检状态 | `first_check_status` | String |
| 31 | `inspectionStatus` | 检验状态 | `inspection_status` | Short |
| 32 | `stockStatus` | 入库状态 | `stock_status` | Short |
| 33 | `totalCheckNum` | 累计检验数量 | `total_check_num` | Decimal |
| 34 | `scrapStockQuantity` | 报废入库数量 | `scrap_stock_quantity` | Decimal |
| 35 | `scrapStockAuxiliaryQuantity` | 报废入库件数 | `scrap_stock_auxiliary_quantity` | Decimal |
| 36 | `scrapStockOutQuantity` | 报废入库数量(产出) | `scrap_stock_out_quantity` | Decimal |
| 37 | `scrapNoStockQty` | 报废不入库数量 | `scrap_no_stock_qty` | Decimal |
| 38 | `scrapNoStockAuxQty` | 报废不入库件数 | `scrap_no_stock_aux_qty` | Decimal |
| 39 | `scrapNoStockOutQty` | 报废不入库数量(产出) | `scrap_no_stock_out_qty` | Decimal |
| 40 | `qualifiedStockQuantity` | 合格入库数量 | `qualified_stock_quantity` | Decimal |
| 41 | `qualifiedStockAuxiliaryQuantity` | 合格入库件数 | `qualified_stock_auxiliary_qua` | Decimal |
| 42 | `qualifiedStockOutQuantity` | 合格入库数量(产出) | `qualified_stock_out_quantity` | Decimal |
| 43 | `interactiveMode` | 交互模式 | `interactive_mode` | Short |
| 44 | `closeRemark` | 关闭说明 | `close_remark` | String |
| 45 | `mainChangeRateDen` | 生产换算率分母 | `main_change_rateden` | Decimal |
| 46 | `mainChangeRateNum` | 生产换算率分子 | `main_change_ratenum` | Decimal |
| 47 | `outChangeRateDen` | 产出换算率分母 | `out_change_rateden` | Decimal |
| 48 | `outChangeRateNum` | 产出换算率分子 | `out_change_ratenum` | Decimal |
| 49 | `holdDesc` | 挂起说明 | `hold_desc` | String |
| 50 | `dispatchUserId` | 派工人 | `dispatch_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 51 | `dispatchTime` | 派工时间 | `dispatch_time` | DateTime |
| 52 | `materialApplyStatus` | 领料申请状态 | `material_apply_status` | Short |
| 53 | `materialStatus` | 领料状态 | `material_status` | Short |
| 54 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 55 | `verifystate` | 审批状态 | `verifystate` | Short |
| 56 | `returncount` | 退回次数 | `returncount` | Short |
| 57 | `printCount` | 打印次数 | `printCount` | Integer |
| 58 | `breakUpTransferInQty` | 分割转入数量 | `break_up_transfer_in_qty` | Decimal |
| 59 | `breakUpTransferOutQty` | 分割转出数量 | `break_up_transfer_out_qty` | Decimal |
| 60 | `breakUpTransferInQty1` | 分割转入件数 | `break_up_transfer_in_qty1` | Decimal |
| 61 | `breakUpTransferOutQty2` | 分割转出数量(产出) | `break_up_transfer_out_qty2` | Decimal |
| 62 | `breakUpTransferInQty2` | 分割转入数量(产出) | `break_up_transfer_in_qty2` | Decimal |
| 63 | `breakUpTransferOutQty1` | 分割转出件数 | `break_up_transfer_out_qty1` | Decimal |
| 64 | `producedate` | 生产日期 | `dProduceDate` | Date |
| 65 | `isAutoComplete` | 自动完工 | `is_auto_complete` | Short |
| 66 | `invaliddate` | 失效日期 | `dInvalidDate` | Date |
| 67 | `dispatchSn` | 派工顺序号 | `dispatch_sn` | Decimal |
| 68 | `define30` | 自定义项30 | `define30` | String |
| 69 | `define4` | 自定义项4 | `define4` | String |
| 70 | `define5` | 自定义项5 | `define5` | String |
| 71 | `define6` | 自定义项6 | `define6` | String |
| 72 | `define7` | 自定义项7 | `define7` | String |
| 73 | `define8` | 自定义项8 | `define8` | String |
| 74 | `define9` | 自定义项9 | `define9` | String |
| 75 | `firstsource` | 源头单据类型 | `first_source` | String |
| 76 | `firstsourceautoid` | 源头单据子表id | `first_source_autoid` | Long |
| 77 | `firstsourceautono` | 源头单据子表行号 | `first_source_autono` | Decimal |
| 78 | `firstsourceid` | 源头单据id | `first_source_id` | Long |
| 79 | `firstupcode` | 源头单据号 | `first_upcode` | String |
| 80 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 81 | `outExchangeType` | 换算方式 | `out_exchange_type` | Short |
| 82 | `skuId` | SKU | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 83 | `unitExchangeType` | 换算方式 | `unit_exchange_type` | Short |
| 84 | `handoverTime` | 交接时间 | `handover_time` | DateTime |
| 85 | `handoverUserId` | 交接人 | `handover_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 86 | `isByReport` | 按任务汇报交接 | `is_by_report` | Short |
| 87 | `auditor` | 审批人名称 | `auditor` | String |
| 88 | `osmApplicationQty` | 转委外申请数量 | `osm_application_qty` | Decimal |
| 89 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 90 | `closer` | 关闭人名称 | `closer` | String |
| 91 | `osmApplicationQty1` | 转委外申请件数 | `osm_application_qty1` | Decimal |
| 92 | `createDate` | 创建日期 | `create_date` | Date |
| 93 | `osmApplicationQty2` | 转委外申请数量(产出) | `osm_application_qty2` | Decimal |
| 94 | `osmOrderQty` | 转委外订单数量 | `osm_order_qty` | Decimal |
| 95 | `creator` | 创建人名称 | `creator` | String |
| 96 | `dr` | 逻辑删除标记 | `dr` | Short |
| 97 | `osmOrderQty1` | 转委外订单件数 | `osm_order_qty1` | Decimal |
| 98 | `osmOrderQty2` | 转委外订单数量(产出) | `osm_order_qty2` | Decimal |
| 99 | `modifier` | 修改人名称 | `modifier` | String |
| 100 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 101 | `osmReleasedQty` | 委外下达量 | `osm_released_qty` | Decimal |
| 102 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 103 | `osmReleasedQty1` | 委外下达件数 | `osm_released_qty1` | Decimal |
| 104 | `processFlowId` | 工序流转卡 | `process_flow_id` | a1d46721-c171-401e-9f07-ef70a36e2abf |
| 105 | `osmReleasedQty2` | 委外下达量(产出) | `osm_released_qty2` | Decimal |
| 106 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 107 | `selfDefineCharacter` | 工序作业计划自定义项特征属性 | `self_define_character` | 71b56487-a568-4d6e-9c11-0f09d8e82411 |
| 108 | `shiftId` | 班次 | `shift_id` | 566d5ab9-aeca-4f63-a0d1-1b98a161c6bc |
| 109 | `srcProcPlanId` | 源工序作业计划 | `src_proc_plan_id` | 48e1a533-51f0-4a5a-9465-6fff30ce5229 |
| 110 | `teamId` | 班组 | `team_id` | d1ce258a-6311-4719-846d-998458841d05 |
| 111 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 112 | `tplid` | 模板id | `tplid` | Long |
| 113 | `vendorId` | 供应商 | `vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 114 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 115 | `warehouseId` | 仓库ID | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 116 | `freeCharacteristics` | 自由项特征组 | `free_characteristics` | bcea44c4-b76e-4a60-b92f-cbfe0fb4ccea |
| 117 | `orgId` | 工厂 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 118 | `productionDepartmentId` | 部门ID | `production_department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 119 | `goodsId` | 货位ID | `goods_id` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc |
| 120 | `workCenterId` | 工作中心 | `work_center_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 121 | `orderId` | 生产订单ID | `order_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 122 | `dispatchedNum` | 已分派数量 | `dispatched_num` | Decimal |
| 123 | `orderProductId` | 生产订单产品ID | `order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 124 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 125 | `closeDate` | 关闭日期 | `close_Date` | Date |
| 126 | `code` | 车间任务编号 | `code` | String |
| 127 | `name` | 名称 | `name` | String |
| 128 | `barCode` | 单据条码 | `bar_code` | String |
| 129 | `preSn` | 前序顺序号 | `pre_sn` | Decimal |
| 130 | `nextSn` | 后序顺序号 | `next_sn` | Decimal |
| 131 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 132 | `productId` | 物料id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 133 | `batchNo` | 生产批次 | `batch_no` | String |
| 134 | `sn` | 工序顺序号 | `sn` | Decimal |
| 135 | `operationId` | 标准工序 | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 136 | `operationControlId` | 工序控制码ID | `operation_control_id` | b47f926b-e3ed-40e1-8423-171e9fb107c9 |
| 137 | `costCenterId` | 成本中心ID | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 138 | `deviceId` | 设备ID | `device_id` | e9f23971-1c19-49e1-83d7-3a84ebcb187e |
| 139 | `staffId` | 员工ID | `staff_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 140 | `scheduleProdNum` | 计划加工数量 | `schedule_prod_num` | Decimal |
| 141 | `scheduleOutputNum` | 预计产出数量 | `schedule_output_num` | Decimal |
| 142 | `mainUnitId` | 主计量单位ID | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 143 | `scheduleProdNum1` | 计划加工件数 | `schedule_prod_num1` | Decimal |
| 144 | `scheduleOutputNum1` | 预计产出件数 | `schedule_output_num1` | Decimal |
| 145 | `productionUnitId` | 生产单位id | `production_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 146 | `scheduleProdNum2` | 计划加工数量(产出) | `schedule_prod_num2` | Decimal |
| 147 | `scheduleOutputNum2` | 预计产出数量(产出) | `schedule_output_num2` | Decimal |
| 148 | `outUnitId` | 产出单位id | `out_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 149 | `mainChangeRate` | 生产换算率 | `main_change_rate` | Decimal |
| 150 | `outChangeRate` | 产出换算率 | `out_change_rate` | Decimal |
| 151 | `scheduleStartTime` | 计划开工时间 | `schedule_start_time` | DateTime |
| 152 | `scheduleEndTime` | 计划完工时间 | `schedule_end_time` | DateTime |
| 153 | `actualStartTime` | 实际开工时间 | `actual_start_time` | DateTime |
| 154 | `actualEndTime` | 实际完工时间 | `actual_end_time` | DateTime |
| 155 | `processMode` | 加工组织模式 | `process_mode` | Short |
| 156 | `processType` | 加工类型 | `process_type` | Short |
| 157 | `dispatchStatus` | 派工状态 | `dispatch_status` | Short |
| 158 | `remark` | 备注 | `remark` | String |
| 159 | `auditDate` | 审核日期 | `audit_date` | Date |
| 160 | `isHold` | 挂起 | `is_hold` | Short |
| 161 | `holdUserId` | 挂起人id | `hold_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 162 | `holdDate` | 挂起日期 | `hold_date` | Date |
| 163 | `holdTime` | 挂起时间 | `hold_time` | DateTime |
| 164 | `holdReasonId` | 挂起原因ID | `hold_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 165 | `isClose` | 关闭 | `is_close` | Short |
| 166 | `closerId` | 关闭人id | `closerId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 167 | `closeTime` | 关闭时间 | `close_time` | DateTime |
| 168 | `closeReasonId` | 关闭原因ID | `close_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 169 | `status` | 状态 | `status` | Short |
| 170 | `openUserId` | 打开人ID | `open_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 171 | `openDate` | 打开日期 | `open_date` | Date |
| 172 | `openTime` | 打开时间 | `open_time` | DateTime |
| 173 | `isPublish` | 发布 | `is_publish` | Short |
| 174 | `publishUserId` | 发布人ID | `publish_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 175 | `publishDate` | 发布日期 | `publish_date` | Date |
| 176 | `publishTime` | 发布时间 | `publish_time` | DateTime |
| 177 | `unpublishUserId` | 取消发布人ID | `unpublish_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 178 | `unpublishDate` | 取消发布日期 | `unpublish_date` | Date |
| 179 | `unpublishTime` | 取消发布时间 | `unpublish_time` | DateTime |
| 180 | `unauditorId` | 弃审人ID | `unauditor_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 181 | `unauditDate` | 弃审日期 | `unaudit_date` | Date |
| 182 | `unauditTime` | 弃审时间 | `unaudit_time` | DateTime |
| 183 | `startUserId` | 开工人ID | `start_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 184 | `startDate` | 开工日期 | `start_date` | Date |
| 185 | `startTime` | 开工时间 | `start_time` | DateTime |
| 186 | `unstartUserId` | 反开工人ID | `unstart_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 187 | `unstartDate` | 反开工日期 | `unstart_date` | Date |
| 188 | `unstartTime` | 反开工时间 | `unstart_time` | DateTime |
| 189 | `completeUserId` | 完工人ID | `complete_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 190 | `completeDate` | 完工日期 | `complete_date` | Date |
| 191 | `completeTime` | 完工时间 | `complete_time` | DateTime |
| 192 | `uncompleteUserId` | 反完工人ID | `uncomplete_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 193 | `uncompleteDate` | 反完工日期 | `uncomplete_date` | Date |
| 194 | `uncompleteTime` | 反完工时间 | `uncomplete_time` | DateTime |
| 195 | `isReportPoint` | 报告点 | `is_reportpoint` | Short |
| 196 | `isAutohandover` | 自动交接 | `is_autohandover` | Short |
| 197 | `firstCheck` | 首件检验 | `first_check` | String |
| 198 | `isMonitorPoint` | 质检点 | `is_monitorpoint` | Short |
| 199 | `isManualCreated` | 手工创建 | `is_manual_created` | Short |
| 200 | `isConfirm` | 汇报确认 | `is_confirm` | Short |
| 201 | `confirmUserId` | 汇报确认人ID | `confirm_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 202 | `isCheckConfirm` | 检验确认 | `is_check_confirm` | Short |
| 203 | `checkConfirmUserId` | 检验确认人ID | `check_confirm_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 204 | `isApply` | 请购 | `is_apply` | Short |
| 205 | `isExemptCheck` | 自检 | `is_exempt_check` | Short |
| 206 | `checkType` | 质检方式 | `check_type` | Short |
| 207 | `orderStatus` | 生产订单状态 | `order_status` | Short |
| 208 | `orderIsHold` | 生产订单挂起 | `order_is_hold` | Short |
| 209 | `orderIsClose` | 生产订单关闭 | `order_is_close` | Short |
| 210 | `schedulePrepareTime` | 计划准备工时 | `schedule_prepare_time` | Decimal |
| 211 | `scheduleProcessTime` | 计划加工工时 | `schedule_process_time` | Decimal |
| 212 | `timeUnit` | 时间单位 | `time_unit` | Short |
| 213 | `exeOrgId` | 执行组织ID | `exe_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 214 | `isOutsource` | 委外 | `is_outsource` | Short |
| 215 | `preId` | 前工序ID | `pre_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 216 | `nextId` | 后工序ID | `next_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 217 | `id` | ID | `id` | Long |
| 218 | `pubts` | 时间戳 | `pubts` | DateTime |
| 219 | `totalExecNum1` | 累计执行件数 | `total_exec_num1` | Decimal |
| 220 | `totalExecNum` | 累计执行数量 | `total_exec_num` | Decimal |
| 221 | `totalExecNum2` | 累计执行数量(产出) | `total_exec_num2` | Decimal |
| 222 | `totalCompleteNum1` | 累计完成件数 | `total_complete_num1` | Decimal |
| 223 | `totalCompleteNum` | 累计完成数量 | `total_complete_num` | Decimal |
| 224 | `totalCompleteNum2` | 累计完成数量(产出) | `total_complete_num2` | Decimal |
| 225 | `totalQualifiedNum1` | 累计合格件数 | `total_qualified_num1` | Decimal |
| 226 | `totalQualifiedNum` | 累计合格数量 | `total_qualified_num` | Decimal |
| 227 | `totalQualifiedNum2` | 累计合格数量(产出) | `total_qualified_num2` | Decimal |
| 228 | `totalScrapNum1` | 累计报废件数 | `total_scrap_num1` | Decimal |
| 229 | `totalScrapNum` | 累计报废数量 | `total_scrap_num` | Decimal |
| 230 | `totalScrapNum2` | 累计报废数量(产出) | `total_scrap_num2` | Decimal |
| 231 | `totalReworkNum1` | 累计待返工件数 | `total_rework_num1` | Decimal |
| 232 | `totalReworkNum` | 累计待返工数量 | `total_rework_num` | Decimal |
| 233 | `totalReworkNum2` | 累计待返工数量(产出) | `total_rework_num2` | Decimal |
| 234 | `totalReworkProcessNum1` | 累计返工处理件数 | `total_rework_process_num1` | Decimal |
| 235 | `totalReworkProcessNum` | 累计返工处理数量 | `total_rework_process_num` | Decimal |
| 236 | `totalReworkProcessNum2` | 累计返工处理数量(产出) | `total_rework_process_num2` | Decimal |
| 237 | `totalTurnNum1` | 累计转出件数 | `total_turn_num1` | Decimal |
| 238 | `totalTurnNum` | 累计转出数量 | `total_turn_num` | Decimal |
| 239 | `totalTurnNum2` | 累计转出数量(产出) | `total_turn_num2` | Decimal |
| 240 | `totalQualifiedTurnNum1` | 累计合格转出件数 | `total_qualified_turn_num1` | Decimal |
| 241 | `totalQualifiedTurnNum` | 累计合格转出数量 | `total_qualified_turn_num` | Decimal |
| 242 | `totalQualifiedTurnNum2` | 累计合格转出数量(产出) | `total_qualified_turn_num2` | Decimal |
| 243 | `totalTurnoutNum1` | 累计转外发件数 | `total_turnout_num1` | Decimal |
| 244 | `totalTurnoutNum` | 累计转外发数量 | `total_turnout_num` | Decimal |
| 245 | `totalTurnoutNum2` | 累计转外发数量(产出) | `total_turnout_num2` | Decimal |
| 246 | `totalTurnoutBackNum1` | 累计外发收回件数 | `total_turnout_back_num1` | Decimal |
| 247 | `totalTurnoutBackNum` | 累计外发收回数量 | `total_turnout_back_num` | Decimal |
| 248 | `totalTurnoutBackNum2` | 累计外发收回数量(产出) | `total_turnout_back_num2` | Decimal |
| 249 | `totalTurnoutQualifiedNum1` | 累计外协合格件数 | `total_turnout_qualified_num1` | Decimal |
| 250 | `totalTurnoutQualifiedNum` | 累计外协合格数量 | `total_turnout_qualified_num` | Decimal |
| 251 | `totalTurnoutQualifiedNum2` | 累计外协合格数量(产出) | `total_turnout_qualified_num2` | Decimal |
| 252 | `totalTurnoutScrapNum1` | 累计外协报废件数 | `total_turnout_scrap_num1` | Decimal |
| 253 | `totalTurnoutScrapNum` | 累计外协报废数量 | `total_turnout_scrap_num` | Decimal |
| 254 | `totalTurnoutScrapNum2` | 累计外协报废数量(产出) | `total_turnout_scrap_num2` | Decimal |
| 255 | `totalTurnoutReworkNum1` | 累计外协待返工件数 | `total_turnout_rework_num1` | Decimal |
| 256 | `totalTurnoutReworkNum` | 累计外协待返工数量 | `total_turnout_rework_num` | Decimal |
| 257 | `totalTurnoutReworkNum2` | 累计外协待返工数量(产出) | `total_turnout_rework_num2` | Decimal |
| 258 | `totalTurnoutReturnNum1` | 累计外协转自返件数 | `total_turnout_return_num1` | Decimal |
| 259 | `totalTurnoutReturnNum` | 累计外协转自返数量 | `total_turnout_return_num` | Decimal |
| 260 | `totalTurnoutReturnNum2` | 累计外协转自返数量(产出) | `total_turnout_return_num2` | Decimal |
| 261 | `totalReturnNum1` | 累计退回件数 | `total_return_num1` | Decimal |
| 262 | `totalReturnNum` | 累计退回数量 | `total_return_num` | Decimal |
| 263 | `totalReturnNum2` | 累计退回数量(产出) | `total_return_num2` | Decimal |
| 264 | `totalTurnoutDispatchNum1` | 累计外协分派件数 | `total_turnout_dispatch_num1` | Decimal |
| 265 | `totalTurnoutDispatchNum` | 累计外协分派数量 | `total_turnout_dispatch_num` | Decimal |
| 266 | `totalTurnoutDispatchNum2` | 累计外协分派数量(产出) | `total_turnout_dispatch_num2` | Decimal |
| 267 | `totalReworkTurnNum1` | 累计返工转出件数 | `total_rework_turn_num1` | Decimal |
| 268 | `totalReworkTurnNum` | 累计返工转出数量 | `total_rework_turn_num` | Decimal |
| 269 | `totalReworkTurnNum2` | 累计返工转出数量(产出) | `total_rework_turn_num2` | Decimal |
| 270 | `scrapInNum1` | 报废入库件数 | `scrap_in_num1` | Decimal |
| 271 | `scrapInNum` | 报废入库数量 | `scrap_in_num` | Decimal |
| 272 | `scrapInNum2` | 报废入库数量(产出) | `scrap_in_num2` | Decimal |
| 273 | `totalTurninNum1` | 累计转入件数 | `total_turnin_num1` | Decimal |
| 274 | `totalTurninNum` | 累计转入数量 | `total_turnin_num` | Decimal |
| 275 | `totalTurninNum2` | 累计转入数量(产出) | `total_turnin_num2` | Decimal |
| 276 | `qualifiedInNum1` | 合格在制入库件数 | `qualified_in_num1` | Decimal |
| 277 | `qualifiedInNum` | 合格在制入库数量 | `qualified_in_num` | Decimal |
| 278 | `qualifiedInNum2` | 合格在制入库数量(产出) | `qualified_in_num2` | Decimal |
| 279 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 280 | `createTime` | 创建时间 | `create_time` | DateTime |
| 281 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 282 | `auditTime` | 审核时间 | `audit_time` | DateTime |
| 283 | `orderProcessId` | 生产订单工序id | `order_process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 284 | `orderCode` | 生产订单号 | `order_code` | String |
| 285 | `orderLineNo` | 生产订单行号 | `order_line_no` | Decimal |
| 286 | `materialId` | 制造物料id | `material_id` | Long |
| 287 | `dataSource` | 数据来源 | `data_source` | Short |
| 288 | `ProcPlanDefine` | 工序作业计划自定义项 | `` | bd4cbd31-38fb-44ed-83e2-1981cad2a081 |
| 289 | `ProcPlanDetailList` | 工序作业计划明细 | `` | 7e33a4bf-edce-447c-8e6f-0717cec2b092 |
| 290 | `ProcPlanDeviceList` | 工序作业计划设备 | `` | e4a9d6ab-c934-437a-ba42-112d02bdce61 |
| 291 | `ProcPlanDispatchList` | 工序作业计划派工信息 | `` | 4ac99bbd-e113-48bc-b841-3f35da8fc453 |
| 292 | `ProcPlanExt` | 工序作业计划扩展 | `` | 23713166-8135-4562-920d-9cd87fabe4ad |
| 293 | `ProcPlanOutputList` | 工序作业计划产出 | `` | f5a3555f-1369-4972-9600-12fc6fc4a7e9 |
| 294 | `ProcPlanSourceList` | 工序作业计划来源信息 | `` | e7e2ecea-8755-47f8-8212-75c9e7fbc2e2 |
| 295 | `ProcPlanStaffList` | 工序作业计划人员 | `` | 1681ea27-5984-4cb4-845f-fc6f7f7c8919 |
| 296 | `ProcPlanSuspendList` | 工序作业计划挂起解除信息 | `` | 7411bc49-48c0-4960-bdc3-f33d1234ca51 |
| 297 | `ProcPlanUserDefine` | 工序作业计划固定自定义项 | `` | 410c7171-8d59-447b-b78e-a3aa4a525e65 |
| 298 | `opSequenceId` | 工序序列 | `op_sequence_id` | c89032db-c707-4a7d-84ef-bdd29d142856 |
| 299 | `opSequenceType` | 序列类型 | `op_sequence_type` | Integer |

---

## 关联属性（65个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ProcPlanOutputList` | 工序作业计划产出 | `sfc.procPlan.ProcPlanOutput` | None | true |
| 2 | `orderId` | 生产订单ID | `po.order.Order` | Service |  |
| 3 | `exeOrgId` | 执行组织ID | `org.func.BaseOrg` | Service |  |
| 4 | `operationControlId` | 工序控制码ID | `ed.operationcontrolcode.OperationControlCode` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `vendorId` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 7 | `deviceId` | 设备ID | `aim.equip.EquipHeadVO` | Service |  |
| 8 | `confirmUserId` | 汇报确认人ID | `base.user.User` | Service |  |
| 9 | `dispatchId` | 派工单id | `sfc.dispatchinfo.DispatchInfo` | None |  |
| 10 | `nextId` | 后工序ID | `po.order.OrderProcess` | Service |  |
| 11 | `processFlowId` | 工序流转卡 | `sfc.processFlowCard.processFlowCard` | None |  |
| 12 | `workCenterId` | 工作中心 | `ed.workcenter.WorkCenter` | Service |  |
| 13 | `closerId` | 关闭人id | `base.user.User` | Service |  |
| 14 | `transTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 15 | `uncompleteUserId` | 反完工人ID | `base.user.User` | Service |  |
| 16 | `outUnitId` | 产出单位id | `pc.unit.Unit` | Service |  |
| 17 | `skuId` | SKU | `pc.product.ProductSKU` | Service |  |
| 18 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 19 | `mainUnitId` | 主计量单位ID | `pc.unit.Unit` | Service |  |
| 20 | `ProcPlanDefine` | 工序作业计划自定义项 | `sfc.procPlan.ProcPlanDefine` | None | true |
| 21 | `productId` | 物料id | `pc.product.Product` | Service |  |
| 22 | `ProcPlanDetailList` | 工序作业计划明细 | `sfc.procPlan.ProcPlanDetail` | None | true |
| 23 | `batch` | 批次 | `st.batchno.Batchno` | Service |  |
| 24 | `ProcPlanDispatchList` | 工序作业计划派工信息 | `sfc.procPlan.ProcPlanDispatch` | None | true |
| 25 | `orderProductId` | 生产订单产品ID | `po.order.OrderProduct` | Service |  |
| 26 | `openUserId` | 打开人ID | `base.user.User` | Service |  |
| 27 | `checkConfirmUserId` | 检验确认人ID | `base.user.User` | Service |  |
| 28 | `ProcPlanSuspendList` | 工序作业计划挂起解除信息 | `sfc.procPlan.ProcPlanSuspend` | None | true |
| 29 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 30 | `orderProcessId` | 生产订单工序id | `po.order.OrderProcess` | Service |  |
| 31 | `warehouseId` | 仓库ID | `aa.warehouse.Warehouse` | Service |  |
| 32 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 33 | `srcProcPlanId` | 源工序作业计划 | `sfc.procPlan.ProcPlan` | None |  |
| 34 | `ProcPlanUserDefine` | 工序作业计划固定自定义项 | `sfc.procPlan.ProcPlanUserDefine` | None | true |
| 35 | `preId` | 前工序ID | `po.order.OrderProcess` | Service |  |
| 36 | `goodsId` | 货位ID | `aa.goodsposition.GoodsPosition` | Service |  |
| 37 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 38 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 39 | `unpublishUserId` | 取消发布人ID | `base.user.User` | Service |  |
| 40 | `holdReasonId` | 挂起原因ID | `aa.reason.Reason` | Service |  |
| 41 | `orgId` | 工厂 | `org.func.BaseOrg` | Service |  |
| 42 | `ProcPlanStaffList` | 工序作业计划人员 | `sfc.procPlan.ProcPlanStaff` | None | true |
| 43 | `startUserId` | 开工人ID | `base.user.User` | Service |  |
| 44 | `handoverUserId` | 交接人 | `base.user.User` | Service |  |
| 45 | `costCenterId` | 成本中心ID | `bd.costcenter.CostCenter` | Service |  |
| 46 | `ProcPlanExt` | 工序作业计划扩展 | `sfc.procPlan.ProcPlanExt` | None | true |
| 47 | `operationId` | 标准工序 | `ed.operation.Operation` | Service |  |
| 48 | `dispatchUserId` | 派工人 | `base.user.User` | Service |  |
| 49 | `unauditorId` | 弃审人ID | `base.user.User` | Service |  |
| 50 | `unstartUserId` | 反开工人ID | `base.user.User` | Service |  |
| 51 | `closeReasonId` | 关闭原因ID | `aa.reason.Reason` | Service |  |
| 52 | `shiftId` | 班次 | `calendar.platformShift.PlatformShift` | Service |  |
| 53 | `selfDefineCharacter` | 工序作业计划自定义项特征属性 | `sfc.procPlan.ProcPlanSelfDefineCharacter` | None |  |
| 54 | `holdUserId` | 挂起人id | `base.user.User` | Service |  |
| 55 | `opSequenceId` | 工序序列 | `po.order.OrderOpSequence` | Service |  |
| 56 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 57 | `publishUserId` | 发布人ID | `base.user.User` | Service |  |
| 58 | `productionUnitId` | 生产单位id | `pc.unit.Unit` | Service |  |
| 59 | `ProcPlanDeviceList` | 工序作业计划设备 | `sfc.procPlan.ProcPlanDevice` | None | true |
| 60 | `completeUserId` | 完工人ID | `base.user.User` | Service |  |
| 61 | `freeCharacteristics` | 自由项特征组 | `sfc.procPlan.ProcPlanFreeCharacter` | None |  |
| 62 | `ProcPlanSourceList` | 工序作业计划来源信息 | `sfc.procPlan.ProcPlanSource` | None | true |
| 63 | `teamId` | 班组 | `bd.timemodel.TeamDefinition` | Service |  |
| 64 | `productionDepartmentId` | 部门ID | `aa.baseorg.DeptMV` | Service |  |
| 65 | `staffId` | 员工ID | `bd.staff.Staff` | Service |  |
