---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.dispatch.DisPatch"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 任务分派 (`sfc.dispatch.DisPatch`)

> IMPSFC | 物理表：`imp_sfc_proc_plan`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 任务分派 |
| 物理表 | `imp_sfc_proc_plan` |
| 数据库 schema | `IMP-SFC` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:20:57.1840` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（297个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `actualEndTime` | 实际完工时间 | `actual_end_time` | DateTime |
| 2 | `actualStartTime` | 实际开工时间 | `actual_start_time` | DateTime |
| 3 | `auditDate` | 审批日期 | `audit_date` | Date |
| 4 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 5 | `auditor` | 审批人名称 | `auditor` | String |
| 6 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 7 | `barCode` | 条形码 | `bar_code` | String |
| 8 | `batch` | 批次 | `batch` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 9 | `batchNo` | 批次号 | `batch_no` | String |
| 10 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 11 | `checkConfirmUserId` | 检验确认人 | `check_confirm_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 12 | `checkType` | 质检方式 | `check_type` | Short |
| 13 | `closeDate` | 关闭日期 | `close_Date` | Date |
| 14 | `closeReasonId` | 关闭原因 | `close_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 15 | `closeTime` | 关闭时间 | `close_time` | DateTime |
| 16 | `closer` | 关闭人名称 | `closer` | String |
| 17 | `closerId` | 关闭人 | `closerId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 18 | `code` | 编码 | `code` | String |
| 19 | `completeDate` | 完工日期 | `complete_date` | Date |
| 20 | `completeTime` | 完工时间 | `complete_time` | DateTime |
| 21 | `completeUserId` | 完工人 | `complete_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 22 | `confirmUserId` | 汇报确认人 | `confirm_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 23 | `costCenterId` | 成本中心 | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 24 | `createDate` | 创建日期 | `create_date` | Date |
| 25 | `createTime` | 创建时间 | `create_time` | DateTime |
| 26 | `osmOrderQty` | 转委外订单数量 | `osm_order_qty` | Decimal |
| 27 | `srcDispatchPlanId` | 源派工工序id | `src_dispatch_plan_id` | Long |
| 28 | `firstCheckType` | 首检控制方式 | `first_check_type` | String |
| 29 | `firstCheckStatus` | 首检状态 | `first_check_status` | String |
| 30 | `isSerialNoManage` | 序列号管理 | `is_serial_no_manage` | Short |
| 31 | `holdDesc` | 挂起说明 | `hold_desc` | String |
| 32 | `dispatchUserId` | 派工人 | `dispatch_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 33 | `dispatchTime` | 派工时间 | `dispatch_time` | DateTime |
| 34 | `materialApplyStatus` | 领料申请状态 | `material_apply_status` | Short |
| 35 | `materialStatus` | 领料状态 | `material_status` | Short |
| 36 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 37 | `verifystate` | 审批状态 | `verifystate` | Short |
| 38 | `returncount` | 退回次数 | `returncount` | Short |
| 39 | `printCount` | 打印次数 | `printCount` | Integer |
| 40 | `osmApplicationQty` | 转委外申请数量 | `osm_application_qty` | Decimal |
| 41 | `dispatchId` | 派工单id | `dispatch_id` | d9807931-2439-4200-9b93-efacb0f688b5 |
| 42 | `breakUpTransferInQty` | 分割转入数量 | `break_up_transfer_in_qty` | Decimal |
| 43 | `breakUpTransferOutQty` | 分割转出数量 | `break_up_transfer_out_qty` | Decimal |
| 44 | `breakUpTransferInQty1` | 分割转入件数 | `break_up_transfer_in_qty1` | Decimal |
| 45 | `breakUpTransferOutQty2` | 分割转出数量(产出) | `break_up_transfer_out_qty2` | Decimal |
| 46 | `breakUpTransferInQty2` | 分割转入数量(产出) | `break_up_transfer_in_qty2` | Decimal |
| 47 | `breakUpTransferOutQty1` | 分割转出件数 | `break_up_transfer_out_qty1` | Decimal |
| 48 | `isAutoComplete` | 自动完工 | `is_auto_complete` | Short |
| 49 | `warehouseId` | 仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 50 | `goodsId` | 货位 | `goods_id` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc |
| 51 | `osmOrderQty1` | 转委外订单件数 | `osm_order_qty1` | Decimal |
| 52 | `osmOrderQty2` | 转委外订单数量(产出) | `osm_order_qty2` | Decimal |
| 53 | `osmApplicationQty2` | 转委外申请数量(产出) | `osm_application_qty2` | Decimal |
| 54 | `osmApplicationQty1` | 转委外申请件数 | `osm_application_qty1` | Decimal |
| 55 | `osmReleasedQty` | 委外下达量 | `osm_released_qty` | Decimal |
| 56 | `osmReleasedQty2` | 委外下达量(产出) | `osm_released_qty2` | Decimal |
| 57 | `osmReleasedQty1` | 委外下达件数 | `osm_released_qty1` | Decimal |
| 58 | `dispatchSn` | 派工顺序号 | `dispatch_sn` | Decimal |
| 59 | `creator` | 创建人名称 | `creator` | String |
| 60 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 61 | `dataSource` | 数据来源 | `data_source` | Short |
| 62 | `define1` | 自定义项1 | `define1` | String |
| 63 | `define10` | 自定义项10 | `define10` | String |
| 64 | `define11` | 自定义项11 | `define11` | String |
| 65 | `define12` | 自定义项12 | `define12` | String |
| 66 | `define13` | 自定义项13 | `define13` | String |
| 67 | `define14` | 自定义项14 | `define14` | String |
| 68 | `define15` | 自定义项15 | `define15` | String |
| 69 | `define16` | 自定义项16 | `define16` | String |
| 70 | `define17` | 自定义项17 | `define17` | String |
| 71 | `define18` | 自定义项18 | `define18` | String |
| 72 | `define19` | 自定义项19 | `define19` | String |
| 73 | `define2` | 自定义项2 | `define2` | String |
| 74 | `define20` | 自定义项20 | `define20` | String |
| 75 | `define21` | 自定义项21 | `define21` | String |
| 76 | `define22` | 自定义项22 | `define22` | String |
| 77 | `define23` | 自定义项23 | `define23` | String |
| 78 | `define24` | 自定义项24 | `define24` | String |
| 79 | `define25` | 自定义项25 | `define25` | String |
| 80 | `define26` | 自定义项26 | `define26` | String |
| 81 | `define27` | 自定义项27 | `define27` | String |
| 82 | `define28` | 自定义项28 | `define28` | String |
| 83 | `define29` | 自定义项29 | `define29` | String |
| 84 | `define3` | 自定义项3 | `define3` | String |
| 85 | `define30` | 自定义项30 | `define30` | String |
| 86 | `define4` | 自定义项4 | `define4` | String |
| 87 | `define5` | 自定义项5 | `define5` | String |
| 88 | `define6` | 自定义项6 | `define6` | String |
| 89 | `define7` | 自定义项7 | `define7` | String |
| 90 | `define8` | 自定义项8 | `define8` | String |
| 91 | `define9` | 自定义项9 | `define9` | String |
| 92 | `deviceId` | 设备 | `device_id` | e9f23971-1c19-49e1-83d7-3a84ebcb187e |
| 93 | `dispatchStatus` | 派工状态 | `dispatch_status` | Short |
| 94 | `dispatchedNum` | 已分派数量 | `dispatched_num` | Decimal |
| 95 | `dr` | 逻辑删除标记 | `dr` | Short |
| 96 | `exeOrgId` | 执行组织 | `exe_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 97 | `firstCheck` | 首件检验 | `first_check` | String |
| 98 | `firstsource` | 源头单据类型 | `first_source` | String |
| 99 | `firstsourceautoid` | 源头单据子表id | `first_source_autoid` | Long |
| 100 | `firstsourceautono` | 源头单据子表行号 | `first_source_autono` | Decimal |
| 101 | `firstsourceid` | 源头单据id | `first_source_id` | Long |
| 102 | `firstupcode` | 源头单据号 | `first_upcode` | String |
| 103 | `freeCharacteristics` | 工序作业计划自由项特征组 | `free_characteristics` | bcea44c4-b76e-4a60-b92f-cbfe0fb4ccea |
| 104 | `handoverTime` | 交接时间 | `handover_time` | DateTime |
| 105 | `handoverUserId` | 交接人 | `handover_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 106 | `holdDate` | 挂起日期 | `hold_date` | Date |
| 107 | `holdReasonId` | 挂起原因 | `hold_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 108 | `holdTime` | 挂起时间 | `hold_time` | DateTime |
| 109 | `holdUserId` | 挂起人 | `hold_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 110 | `id` | ID | `id` | Long |
| 111 | `invaliddate` | 失效日期 | `dInvalidDate` | Date |
| 112 | `isApply` | 请购 | `is_apply` | Short |
| 113 | `isAutohandover` | 自动交接 | `is_autohandover` | Short |
| 114 | `isByReport` | 按任务汇报交接 | `is_by_report` | Short |
| 115 | `isCheckConfirm` | 检验确认 | `is_check_confirm` | Short |
| 116 | `isClose` | 关闭 | `is_close` | Short |
| 117 | `isConfirm` | 汇报确认 | `is_confirm` | Short |
| 118 | `isExemptCheck` | 免检 | `is_exempt_check` | Short |
| 119 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 120 | `isHold` | 挂起 | `is_hold` | Short |
| 121 | `isManualCreated` | 手工创建 | `is_manual_created` | Short |
| 122 | `isMonitorPoint` | 质检点 | `is_monitorpoint` | Short |
| 123 | `isOutsource` | 委外 | `is_outsource` | Short |
| 124 | `isPublish` | 发布 | `is_publish` | Short |
| 125 | `isReportPoint` | 报告点 | `is_reportpoint` | Short |
| 126 | `mainChangeRate` | 生产主计量转换率 | `main_change_rate` | Decimal |
| 127 | `mainUnitId` | 主计量单位 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 128 | `materialId` | 制造物料 | `material_id` | Long |
| 129 | `modifier` | 修改人名称 | `modifier` | String |
| 130 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 131 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 132 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 133 | `name` | 名称 | `name` | String |
| 134 | `nextId` | 后工序 | `next_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 135 | `nextSn` | 后序顺序号 | `next_sn` | Decimal |
| 136 | `openDate` | 打开日期 | `open_date` | Date |
| 137 | `openTime` | 打开时间 | `open_time` | DateTime |
| 138 | `openUserId` | 打开人 | `open_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 139 | `operationControlId` | 工序控制码 | `operation_control_id` | b47f926b-e3ed-40e1-8423-171e9fb107c9 |
| 140 | `operationId` | 标准工序 | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 141 | `orderCode` | 生产订单编号 | `order_code` | String |
| 142 | `orderId` | 生产订单 | `order_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 143 | `orderIsClose` | 生产订单关闭状态 | `order_is_close` | Short |
| 144 | `orderIsHold` | 生产订单挂起状态 | `order_is_hold` | Short |
| 145 | `orderLineNo` | 生产订单产品行号 | `order_line_no` | Decimal |
| 146 | `orderProcessId` | 生产订单工序 | `order_process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 147 | `orderProductId` | 生产订单产品 | `order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 148 | `orderStatus` | 生产订单状态 | `order_status` | Short |
| 149 | `orgId` | 工厂 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 150 | `outChangeRate` | 产出主计量转换率 | `out_change_rate` | Decimal |
| 151 | `outExchangeType` | 换算方式 | `out_exchange_type` | Short |
| 152 | `outUnitId` | 产出单位 | `out_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 153 | `preId` | 前工序 | `pre_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 154 | `preSn` | 前序顺序号 | `pre_sn` | Decimal |
| 155 | `processFlowId` | 工序流转卡 | `process_flow_id` | a1d46721-c171-401e-9f07-ef70a36e2abf |
| 156 | `processMode` | 加工组织模式 | `process_mode` | Short |
| 157 | `processType` | 加工类型 | `process_type` | Short |
| 158 | `producedate` | 生产日期 | `dProduceDate` | Date |
| 159 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 160 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 161 | `productionDepartmentId` | 部门 | `production_department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 162 | `productionUnitId` | 生产单位 | `production_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 163 | `publishDate` | 发布日期 | `publish_date` | Date |
| 164 | `publishTime` | 发布时间 | `publish_time` | DateTime |
| 165 | `publishUserId` | 发布人 | `publish_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 166 | `pubts` | 时间戳 | `pubts` | DateTime |
| 167 | `qualifiedInNum` | 合格在制入库数量 | `qualified_in_num` | Decimal |
| 168 | `qualifiedInNum1` | 合格在制入库件数 | `qualified_in_num1` | Decimal |
| 169 | `qualifiedInNum2` | 合格在制入库数量(产出) | `qualified_in_num2` | Decimal |
| 170 | `remark` | 备注 | `remark` | String |
| 171 | `scheduleEndTime` | 计划完工时间 | `schedule_end_time` | DateTime |
| 172 | `scheduleOutputNum` | 预计产出数量 | `schedule_output_num` | Decimal |
| 173 | `scheduleOutputNum1` | 预计产出件数 | `schedule_output_num1` | Decimal |
| 174 | `scheduleOutputNum2` | 预计产出数量(产出) | `schedule_output_num2` | Decimal |
| 175 | `schedulePrepareTime` | 计划准备工时 | `schedule_prepare_time` | Decimal |
| 176 | `scheduleProcessTime` | 计划加工工时 | `schedule_process_time` | Decimal |
| 177 | `scheduleProdNum` | 计划加工数量 | `schedule_prod_num` | Decimal |
| 178 | `scheduleProdNum1` | 计划加工件数 | `schedule_prod_num1` | Decimal |
| 179 | `scheduleProdNum2` | 计划加工数量(产出) | `schedule_prod_num2` | Decimal |
| 180 | `scheduleStartTime` | 计划开工时间 | `schedule_start_time` | DateTime |
| 181 | `scrapInNum` | 累计报废转出数量 | `scrap_in_num` | Decimal |
| 182 | `scrapInNum1` | 累计报废转出件数 | `scrap_in_num1` | Decimal |
| 183 | `scrapInNum2` | 累计报废转出数量(产出) | `scrap_in_num2` | Decimal |
| 184 | `selfDefineCharacter` | 工序作业计划自定义项特征实体 | `self_define_character` | 71b56487-a568-4d6e-9c11-0f09d8e82411 |
| 185 | `shiftId` | 班次 | `shift_id` | 566d5ab9-aeca-4f63-a0d1-1b98a161c6bc |
| 186 | `skuId` | SKU | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 187 | `sn` | 工序顺序号 | `sn` | Decimal |
| 188 | `srcProcPlanId` | 源工序作业计划 | `src_proc_plan_id` | 48e1a533-51f0-4a5a-9465-6fff30ce5229 |
| 189 | `staffId` | 员工 | `staff_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 190 | `startDate` | 开工日期 | `start_date` | Date |
| 191 | `startTime` | 开工时间 | `start_time` | DateTime |
| 192 | `startUserId` | 开工人 | `start_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 193 | `status` | 单据状态 | `status` | Short |
| 194 | `teamId` | 班组 | `team_id` | d1ce258a-6311-4719-846d-998458841d05 |
| 195 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 196 | `timeUnit` | 时间单位 | `time_unit` | Short |
| 197 | `totalCompleteNum` | 累计完成数量 | `total_complete_num` | Decimal |
| 198 | `totalCompleteNum1` | 累计完成件数 | `total_complete_num1` | Decimal |
| 199 | `totalCompleteNum2` | 累计完成数量(产出) | `total_complete_num2` | Decimal |
| 200 | `totalExecNum` | 累计执行数量 | `total_exec_num` | Decimal |
| 201 | `totalExecNum1` | 累计执行件数 | `total_exec_num1` | Decimal |
| 202 | `totalExecNum2` | 累计执行数量(产出) | `total_exec_num2` | Decimal |
| 203 | `totalQualifiedNum` | 累计合格数量 | `total_qualified_num` | Decimal |
| 204 | `totalQualifiedNum1` | 累计合格件数 | `total_qualified_num1` | Decimal |
| 205 | `totalQualifiedNum2` | 累计合格数量(产出) | `total_qualified_num2` | Decimal |
| 206 | `totalQualifiedTurnNum` | 累计合格转出数量 | `total_qualified_turn_num` | Decimal |
| 207 | `totalQualifiedTurnNum1` | 累计合格转出件数 | `total_qualified_turn_num1` | Decimal |
| 208 | `totalQualifiedTurnNum2` | 累计合格转出数量(产出) | `total_qualified_turn_num2` | Decimal |
| 209 | `totalReturnNum` | 累计退回数量 | `total_return_num` | Decimal |
| 210 | `totalReturnNum1` | 累计退回件数 | `total_return_num1` | Decimal |
| 211 | `totalReturnNum2` | 累计退回数量(产出) | `total_return_num2` | Decimal |
| 212 | `totalReworkNum` | 累计待返工数量 | `total_rework_num` | Decimal |
| 213 | `totalReworkNum1` | 累计待返工件数 | `total_rework_num1` | Decimal |
| 214 | `totalReworkNum2` | 累计待返工数量(产出) | `total_rework_num2` | Decimal |
| 215 | `totalReworkProcessNum` | 累计返工处理数量 | `total_rework_process_num` | Decimal |
| 216 | `totalReworkProcessNum1` | 累计返工处理件数 | `total_rework_process_num1` | Decimal |
| 217 | `totalReworkProcessNum2` | 累计返工处理数量(产出) | `total_rework_process_num2` | Decimal |
| 218 | `totalReworkTurnNum` | 累计返工转出数量 | `total_rework_turn_num` | Decimal |
| 219 | `totalReworkTurnNum1` | 累计返工转出件数 | `total_rework_turn_num1` | Decimal |
| 220 | `totalReworkTurnNum2` | 累计返工转出数量(产出) | `total_rework_turn_num2` | Decimal |
| 221 | `totalScrapNum` | 累计报废数量 | `total_scrap_num` | Decimal |
| 222 | `totalScrapNum1` | 累计报废件数 | `total_scrap_num1` | Decimal |
| 223 | `totalScrapNum2` | 累计报废数量(产出) | `total_scrap_num2` | Decimal |
| 224 | `totalTurnNum` | 累计转出数量 | `total_turn_num` | Decimal |
| 225 | `totalTurnNum1` | 累计转出件数 | `total_turn_num1` | Decimal |
| 226 | `totalTurnNum2` | 累计转出数量(产出) | `total_turn_num2` | Decimal |
| 227 | `totalTurninNum` | 累计转入数量 | `total_turnin_num` | Decimal |
| 228 | `totalTurninNum1` | 累计转入件数 | `total_turnin_num1` | Decimal |
| 229 | `totalTurninNum2` | 累计转入数量(产出) | `total_turnin_num2` | Decimal |
| 230 | `totalTurnoutBackNum` | 累计外发收回数量 | `total_turnout_back_num` | Decimal |
| 231 | `totalTurnoutBackNum1` | 累计外发收回件数 | `total_turnout_back_num1` | Decimal |
| 232 | `totalTurnoutBackNum2` | 累计外发收回数量(产出) | `total_turnout_back_num2` | Decimal |
| 233 | `totalTurnoutDispatchNum` | 累计外协分派数量 | `total_turnout_dispatch_num` | Decimal |
| 234 | `totalTurnoutDispatchNum1` | 累计外协分派件数 | `total_turnout_dispatch_num1` | Decimal |
| 235 | `totalTurnoutDispatchNum2` | 累计外协分派数量(产出) | `total_turnout_dispatch_num2` | Decimal |
| 236 | `totalTurnoutNum` | 累计转外发数量 | `total_turnout_num` | Decimal |
| 237 | `totalTurnoutNum1` | 累计转外发件数 | `total_turnout_num1` | Decimal |
| 238 | `totalTurnoutNum2` | 累计转外发数量(产出) | `total_turnout_num2` | Decimal |
| 239 | `totalTurnoutQualifiedNum` | 累计外协合格数量 | `total_turnout_qualified_num` | Decimal |
| 240 | `totalTurnoutQualifiedNum1` | 累计外协合格件数 | `total_turnout_qualified_num1` | Decimal |
| 241 | `totalTurnoutQualifiedNum2` | 累计外协合格数量(产出) | `total_turnout_qualified_num2` | Decimal |
| 242 | `totalTurnoutReturnNum` | 累计外协转自返数量 | `total_turnout_return_num` | Decimal |
| 243 | `totalTurnoutReturnNum1` | 累计外协转自返件数 | `total_turnout_return_num1` | Decimal |
| 244 | `totalTurnoutReturnNum2` | 累计外协转自返数量(产出) | `total_turnout_return_num2` | Decimal |
| 245 | `totalTurnoutReworkNum` | 累计外协待返工数量 | `total_turnout_rework_num` | Decimal |
| 246 | `totalTurnoutReworkNum1` | 累计外协待返工件数 | `total_turnout_rework_num1` | Decimal |
| 247 | `totalTurnoutReworkNum2` | 累计外协待返工数量(产出) | `total_turnout_rework_num2` | Decimal |
| 248 | `totalTurnoutScrapNum` | 累计外协报废数量 | `total_turnout_scrap_num` | Decimal |
| 249 | `totalTurnoutScrapNum1` | 累计外协报废件数 | `total_turnout_scrap_num1` | Decimal |
| 250 | `totalTurnoutScrapNum2` | 累计外协报废数量(产出) | `total_turnout_scrap_num2` | Decimal |
| 251 | `tplid` | 模板id | `tplid` | Long |
| 252 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 253 | `unauditDate` | 弃审日期 | `unaudit_date` | Date |
| 254 | `unauditTime` | 弃审时间 | `unaudit_time` | DateTime |
| 255 | `unauditorId` | 弃审人 | `unauditor_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 256 | `uncompleteDate` | 反完工日期 | `uncomplete_date` | Date |
| 257 | `uncompleteTime` | 反完工时间 | `uncomplete_time` | DateTime |
| 258 | `uncompleteUserId` | 反完工人 | `uncomplete_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 259 | `unitExchangeType` | 换算方式 | `unit_exchange_type` | Short |
| 260 | `unpublishDate` | 取消发布日期 | `unpublish_date` | Date |
| 261 | `unpublishTime` | 取消发布时间 | `unpublish_time` | DateTime |
| 262 | `unpublishUserId` | 取消发布人 | `unpublish_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 263 | `unstartDate` | 反开工日期 | `unstart_date` | Date |
| 264 | `unstartTime` | 反开工时间 | `unstart_time` | DateTime |
| 265 | `unstartUserId` | 反开工人 | `unstart_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 266 | `vendorId` | 供应商 | `vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 267 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 268 | `workCenterId` | 工作中心 | `work_center_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 269 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 270 | `ProcPlanDetailList` | 任务分派明细 | `` | db43487c-74bf-448e-a97c-8e4246938f6c |
| 271 | `ProcPlanDeviceList` | 任务分派设备 | `` | 2218ab7d-dbf2-44c5-9bde-2d0a8df536ba |
| 272 | `ProcPlanDispatchList` | 任务分派信息表 | `` | 0133d852-d3c5-4987-ba4f-9fe89480f624 |
| 273 | `ProcPlanExt` | 任务分派拓展 | `` | 674108af-83b9-484a-925a-30f2fda43b14 |
| 274 | `ProcPlanOutputList` | 任务分派产出 | `` | 61b3a535-a7be-4ed3-b66c-cbf367856b7c |
| 275 | `ProcPlanSourceList` | 任务分派来源表 | `` | 27942709-817c-41d1-beb4-575c0f8903e4 |
| 276 | `ProcPlanStaffList` | 任务分派人员 | `` | 4a46ad33-7387-46db-bd9a-1563d3447635 |
| 277 | `ProcPlanSuspendList` | 任务分派挂起解挂 | `` | 5e59dd81-63de-4c55-a3c4-a1cca1ba7268 |
| 278 | `closeRemark` | 关闭说明 | `close_remark` | String |
| 279 | `inspectionStatus` | 检验状态 | `inspection_status` | Short |
| 280 | `interactiveMode` | 交互模式 | `interactive_mode` | Short |
| 281 | `mainChangeRateDen` | 生产换算率分母 | `main_change_rateden` | Decimal |
| 282 | `mainChangeRateNum` | 生产换算率分子 | `main_change_ratenum` | Decimal |
| 283 | `opSequenceId` | 工序序列 | `op_sequence_id` | c89032db-c707-4a7d-84ef-bdd29d142856 |
| 284 | `opSequenceType` | 序列类型 | `op_sequence_type` | Integer |
| 285 | `outChangeRateDen` | 产出换算率分母 | `out_change_rateden` | Decimal |
| 286 | `outChangeRateNum` | 产出换算率分子 | `out_change_ratenum` | Decimal |
| 287 | `qualifiedStockAuxiliaryQuantity` | 合格入库件数 | `qualified_stock_auxiliary_qua` | Decimal |
| 288 | `qualifiedStockOutQuantity` | 合格入库数量(产出) | `qualified_stock_out_quantity` | Decimal |
| 289 | `qualifiedStockQuantity` | 合格入库数量 | `qualified_stock_quantity` | Decimal |
| 290 | `scrapNoStockAuxQty` | 报废不入库件数 | `scrap_no_stock_aux_qty` | Decimal |
| 291 | `scrapNoStockOutQty` | 报废不入库数量(产出) | `scrap_no_stock_out_qty` | Decimal |
| 292 | `scrapNoStockQty` | 报废不入库数量 | `scrap_no_stock_qty` | Decimal |
| 293 | `scrapStockAuxiliaryQuantity` | 报废入库件数 | `scrap_stock_auxiliary_quantity` | Decimal |
| 294 | `scrapStockOutQuantity` | 报废入库数量(产出) | `scrap_stock_out_quantity` | Decimal |
| 295 | `scrapStockQuantity` | 报废入库数量 | `scrap_stock_quantity` | Decimal |
| 296 | `stockStatus` | 入库状态 | `stock_status` | Short |
| 297 | `totalCheckNum` | 累计检验数量 | `total_check_num` | Decimal |

---

## 关联属性（63个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ProcPlanOutputList` | 任务分派产出 | `sfc.dispatch.DisPatchOutput` | None | true |
| 2 | `orderId` | 生产订单 | `po.order.Order` | Service |  |
| 3 | `exeOrgId` | 执行组织 | `org.func.BaseOrg` | Service |  |
| 4 | `operationControlId` | 工序控制码 | `ed.operationcontrolcode.OperationControlCode` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `vendorId` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 7 | `deviceId` | 设备 | `aim.equip.EquipHeadVO` | Service |  |
| 8 | `confirmUserId` | 汇报确认人 | `base.user.User` | Service |  |
| 9 | `dispatchId` | 派工单id | `sfc.dispatchinfo.DispatchInfo` | None |  |
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
| 21 | `ProcPlanDetailList` | 任务分派明细 | `sfc.dispatch.DisPatchDetail` | None | true |
| 22 | `batch` | 批次 | `st.batchno.Batchno` | Service |  |
| 23 | `ProcPlanDispatchList` | 任务分派信息表 | `sfc.dispatch.ProcPlanDispatch` | None | true |
| 24 | `orderProductId` | 生产订单产品 | `po.order.OrderProduct` | Service |  |
| 25 | `openUserId` | 打开人 | `base.user.User` | Service |  |
| 26 | `checkConfirmUserId` | 检验确认人 | `base.user.User` | Service |  |
| 27 | `ProcPlanSuspendList` | 任务分派挂起解挂 | `sfc.dispatch.DisPatchSuspend` | None | true |
| 28 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 29 | `orderProcessId` | 生产订单工序 | `po.order.OrderProcess` | Service |  |
| 30 | `warehouseId` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 31 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 32 | `srcProcPlanId` | 源工序作业计划 | `sfc.procPlan.ProcPlan` | None |  |
| 33 | `preId` | 前工序 | `po.order.OrderProcess` | Service |  |
| 34 | `goodsId` | 货位 | `aa.goodsposition.GoodsPosition` | Service |  |
| 35 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 36 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 37 | `unpublishUserId` | 取消发布人 | `base.user.User` | Service |  |
| 38 | `holdReasonId` | 挂起原因 | `aa.reason.Reason` | Service |  |
| 39 | `orgId` | 工厂 | `org.func.BaseOrg` | Service |  |
| 40 | `ProcPlanStaffList` | 任务分派人员 | `sfc.dispatch.DisPatchStaff` | None | true |
| 41 | `startUserId` | 开工人 | `base.user.User` | Service |  |
| 42 | `handoverUserId` | 交接人 | `base.user.User` | Service |  |
| 43 | `costCenterId` | 成本中心 | `bd.costcenter.CostCenter` | Service |  |
| 44 | `ProcPlanExt` | 任务分派拓展 | `sfc.dispatch.DisPatchExt` | None | true |
| 45 | `operationId` | 标准工序 | `ed.operation.Operation` | Service |  |
| 46 | `dispatchUserId` | 派工人 | `base.user.User` | Service |  |
| 47 | `unauditorId` | 弃审人 | `base.user.User` | Service |  |
| 48 | `unstartUserId` | 反开工人 | `base.user.User` | Service |  |
| 49 | `closeReasonId` | 关闭原因 | `aa.reason.Reason` | Service |  |
| 50 | `shiftId` | 班次 | `calendar.platformShift.PlatformShift` | Service |  |
| 51 | `selfDefineCharacter` | 工序作业计划自定义项特征实体 | `sfc.procPlan.ProcPlanSelfDefineCharacter` | None |  |
| 52 | `holdUserId` | 挂起人 | `base.user.User` | Service |  |
| 53 | `opSequenceId` | 工序序列 | `po.order.OrderOpSequence` | Service |  |
| 54 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 55 | `publishUserId` | 发布人 | `base.user.User` | Service |  |
| 56 | `productionUnitId` | 生产单位 | `pc.unit.Unit` | Service |  |
| 57 | `ProcPlanDeviceList` | 任务分派设备 | `sfc.dispatch.DisPatchDevice` | None | true |
| 58 | `completeUserId` | 完工人 | `base.user.User` | Service |  |
| 59 | `freeCharacteristics` | 工序作业计划自由项特征组 | `sfc.procPlan.ProcPlanFreeCharacter` | None |  |
| 60 | `ProcPlanSourceList` | 任务分派来源表 | `sfc.dispatch.DisPatchSource` | None | true |
| 61 | `teamId` | 班组 | `bd.timemodel.TeamDefinition` | Service |  |
| 62 | `productionDepartmentId` | 部门 | `aa.baseorg.DeptMV` | Service |  |
| 63 | `staffId` | 员工 | `bd.staff.Staff` | Service |  |
