---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.processFlowCard.processFlowCardPlan"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工序流转卡工序 (`sfc.processFlowCard.processFlowCardPlan`)

> IMPSFC | 物理表：`imp_sfc_procflowcard_plan`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工序流转卡工序 |
| 物理表 | `imp_sfc_procflowcard_plan` |
| 数据库 schema | `IMP-SFC` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:24:51.6650` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（229个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `actualEndTime` | 实际完工时间 | `actual_end_time` | DateTime |
| 2 | `actualStartTime` | 实际开工时间 | `actual_start_time` | DateTime |
| 3 | `auditDate` | 审批日期 | `audit_date` | Date |
| 4 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 5 | `auditor` | 审批人名称 | `auditor` | String |
| 6 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 7 | `bHeadSn` | 是否头序 | `b_head_sn` | Short |
| 8 | `batch` | 批次 | `batch` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 9 | `batchNo` | 批次号 | `batch_no` | String |
| 10 | `checkConfirmUserId` | 检验确认人 | `check_confirm_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 11 | `checkType` | 质检方式 | `check_type` | Short |
| 12 | `closeDate` | 关闭日期 | `close_Date` | Date |
| 13 | `closeReasonId` | 关闭原因 | `close_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 14 | `closeTime` | 关闭时间 | `close_time` | DateTime |
| 15 | `closer` | 关闭人名称 | `closer` | String |
| 16 | `closerId` | 关闭人 | `closerId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 17 | `completeDate` | 完工日期 | `complete_date` | Date |
| 18 | `sn` | 工序顺序号 | `sn` | Decimal |
| 19 | `completeTime` | 完工时间 | `complete_time` | DateTime |
| 20 | `completeUserId` | 完工人 | `complete_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 21 | `warehouseId` | 仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 22 | `goodsId` | 货位 | `goods_id` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc |
| 23 | `osmApplicationQty` | 转委外申请数量 | `osm_application_qty` | Decimal |
| 24 | `osmApplicationQty1` | 转委外申请件数 | `osm_application_qty1` | Decimal |
| 25 | `osmApplicationQty2` | 转委外申请数量(产出) | `osm_application_qty2` | Decimal |
| 26 | `osmOrderQty` | 转委外订单数量 | `osm_order_qty` | Decimal |
| 27 | `osmOrderQty1` | 转委外订单件数 | `osm_order_qty1` | Decimal |
| 28 | `osmOrderQty2` | 转委外订单数量(产出) | `osm_order_qty2` | Decimal |
| 29 | `osmReleasedQty` | 委外下达量 | `osm_released_qty` | Decimal |
| 30 | `osmReleasedQty1` | 委外下达件数 | `osm_released_qty1` | Decimal |
| 31 | `osmReleasedQty2` | 委外下达量(产出) | `osm_released_qty2` | Decimal |
| 32 | `sourceGrandchildrenId` | 上游单据孙表id | `source_grandchildrenId` | Long |
| 33 | `breakUpTransferOutQty` | 分割转出数量 | `break_up_transfer_out_qty` | Decimal |
| 34 | `breakUpTransferOutQty1` | 分割转出件数 | `break_up_transfer_out_qty1` | Decimal |
| 35 | `breakUpTransferOutQty2` | 分割转出数量(产出) | `break_up_transfer_out_qty2` | Decimal |
| 36 | `breakUpTransferInQty` | 分割转入数量 | `break_up_transfer_in_qty` | Decimal |
| 37 | `breakUpTransferInQty1` | 分割转入件数 | `break_up_transfer_in_qty1` | Decimal |
| 38 | `breakUpTransferInQty2` | 分割转入数量(产出) | `break_up_transfer_in_qty2` | Decimal |
| 39 | `materialApplyStatus` | 领料申请状态 | `material_apply_status` | Short |
| 40 | `materialStatus` | 领料状态 | `material_status` | Short |
| 41 | `upcode` | 来源单据号 | `upcode` | String |
| 42 | `firstCheckType` | 首检控制方式 | `first_check_type` | String |
| 43 | `firstCheckStatus` | 首检状态 | `first_check_status` | String |
| 44 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 45 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 46 | `source` | 上游单据类型 | `source` | String |
| 47 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 48 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 49 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 50 | `confirmUserId` | 汇报确认人 | `confirm_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 51 | `costCenterId` | 成本中心 | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 52 | `dataSource` | 数据来源 | `data_source` | Short |
| 53 | `deviceId` | 设备 | `device_id` | e9f23971-1c19-49e1-83d7-3a84ebcb187e |
| 54 | `dr` | 逻辑删除标记 | `dr` | Short |
| 55 | `exeOrgId` | 执行组织 | `exe_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 56 | `firstCheck` | 首件检验 | `first_check` | String |
| 57 | `firstsource` | 源头单据类型 | `first_source` | String |
| 58 | `firstsourceautoid` | 源头单据子表id | `first_source_autoid` | Long |
| 59 | `firstsourceautono` | 源头单据子表行号 | `first_source_autono` | Decimal |
| 60 | `firstsourceid` | 源头单据id | `first_source_id` | Long |
| 61 | `firstupcode` | 源头单据号 | `first_upcode` | String |
| 62 | `handoverTime` | 交接时间 | `handover_time` | DateTime |
| 63 | `handoverUserId` | 交接人 | `handover_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 64 | `holdDate` | 挂起日期 | `hold_date` | Date |
| 65 | `holdReasonId` | 挂起原因 | `hold_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 66 | `holdTime` | 挂起时间 | `hold_time` | DateTime |
| 67 | `holdUserId` | 挂起人 | `hold_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 68 | `id` | ID | `id` | Long |
| 69 | `invaliddate` | 失效日期 | `dInvalidDate` | Date |
| 70 | `isApply` | 请购 | `is_apply` | Short |
| 71 | `isAutohandover` | 自动交接 | `is_autohandover` | Short |
| 72 | `isByReport` | 按任务汇报交接 | `is_by_report` | Short |
| 73 | `isCheckConfirm` | 检验确认 | `is_check_confirm` | Short |
| 74 | `isClose` | 关闭 | `is_close` | Short |
| 75 | `isConfirm` | 汇报确认 | `is_confirm` | Short |
| 76 | `isExemptCheck` | 免检 | `is_exempt_check` | Short |
| 77 | `isHold` | 挂起 | `is_hold` | Short |
| 78 | `isManualCreated` | 手工创建 | `is_manual_created` | Short |
| 79 | `isMonitorPoint` | 质检点 | `is_monitorpoint` | Short |
| 80 | `isOutsource` | 委外 | `is_outsource` | Short |
| 81 | `isReportPoint` | 报告点 | `is_reportpoint` | Short |
| 82 | `lineno` | 行号 | `lineno` | Decimal |
| 83 | `mainChangeRate` | 生产主计量转换率 | `main_change_rate` | Decimal |
| 84 | `mainUnitId` | 主计量单位 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 85 | `nextId` | 后工序 | `next_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 86 | `nextSn` | 后序顺序号 | `next_sn` | Decimal |
| 87 | `openDate` | 打开日期 | `open_date` | Date |
| 88 | `openTime` | 打开时间 | `open_time` | DateTime |
| 89 | `openUserId` | 打开人 | `open_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 90 | `operationControlId` | 工序控制码 | `operation_control_id` | b47f926b-e3ed-40e1-8423-171e9fb107c9 |
| 91 | `operationId` | 标准工序 | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 92 | `orderCode` | 生产订单编号 | `order_code` | String |
| 93 | `orderIsClose` | 生产订单关闭状态 | `order_is_close` | Short |
| 94 | `orderIsHold` | 生产订单挂起状态 | `order_is_hold` | Short |
| 95 | `orderLineNo` | 生产订单行号 | `order_line_no` | Decimal |
| 96 | `orderProcessId` | 生产订单工序 | `order_process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 97 | `orderStatus` | 生产订单状态 | `order_status` | Short |
| 98 | `outChangeRate` | 产出主计量转换率 | `out_change_rate` | Decimal |
| 99 | `outUnitId` | 产出单位 | `out_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 100 | `preId` | 前工序 | `pre_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 101 | `preSn` | 前序顺序号 | `pre_sn` | Decimal |
| 102 | `processFlowCardId` | 工序流转卡 | `process_flow_card_id` | a1d46721-c171-401e-9f07-ef70a36e2abf |
| 103 | `processMode` | 加工组织模式 | `process_mode` | Short |
| 104 | `processType` | 加工类型 | `process_type` | Short |
| 105 | `producedate` | 生产日期 | `dProduceDate` | Date |
| 106 | `productionUnitId` | 生产单位 | `production_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 107 | `pubts` | 时间戳 | `pubts` | DateTime |
| 108 | `qualifiedInNum` | 合格在制入库数量 | `qualified_in_num` | Decimal |
| 109 | `qualifiedInNum1` | 合格在制入库件数 | `qualified_in_num1` | Decimal |
| 110 | `qualifiedInNum2` | 合格在制入库数量(产出) | `qualified_in_num2` | Decimal |
| 111 | `remark` | 备注 | `remark` | String |
| 112 | `rowno` | 序号 | `rowno` | Integer |
| 113 | `scheduleEndTime` | 计划完工时间 | `schedule_end_time` | DateTime |
| 114 | `scheduleOutputNum` | 预计产出数量 | `schedule_output_num` | Decimal |
| 115 | `scheduleOutputNum1` | 预计产出件数 | `schedule_output_num1` | Decimal |
| 116 | `scheduleOutputNum2` | 预计产出数量(产出) | `schedule_output_num2` | Decimal |
| 117 | `schedulePrepareTime` | 计划准备工时 | `schedule_prepare_time` | Decimal |
| 118 | `scheduleProcessTime` | 计划加工工时 | `schedule_process_time` | Decimal |
| 119 | `scheduleProdNum` | 计划加工数量 | `schedule_prod_num` | Decimal |
| 120 | `scheduleProdNum1` | 计划加工件数 | `schedule_prod_num1` | Decimal |
| 121 | `scheduleProdNum2` | 计划加工数量(产出) | `schedule_prod_num2` | Decimal |
| 122 | `scheduleStartTime` | 计划开工时间 | `schedule_start_time` | DateTime |
| 123 | `isAutoComplete` | 自动完工 | `is_auto_complete` | Short |
| 124 | `scrapInNum` | 累计报废转出数量 | `scrap_in_num` | Decimal |
| 125 | `scrapInNum1` | 累计报废转出件数 | `scrap_in_num1` | Decimal |
| 126 | `scrapInNum2` | 累计报废转出数量(产出) | `scrap_in_num2` | Decimal |
| 127 | `selfDefineCharacterPlan` | 工序流转卡工序自定义项特征组 | `self_define_character` | f25b756b-223a-48e3-b6c1-631ef3dd58d9 |
| 128 | `shiftId` | 班次 | `shift_id` | c3463093-9c67-4b51-b028-139f1b776070 |
| 129 | `srcFlowPlanId` | 源工序流转卡工序 | `src_flow_plan_id` | e4a42545-5567-4ba7-be49-38a63843cfab |
| 130 | `staffId` | 员工 | `staff_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 131 | `startDate` | 开工日期 | `start_date` | Date |
| 132 | `startTime` | 开工时间 | `start_time` | DateTime |
| 133 | `startUserId` | 开工人 | `start_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 134 | `status` | 工序状态 | `status` | Short |
| 135 | `teamId` | 班组 | `team_id` | d1ce258a-6311-4719-846d-998458841d05 |
| 136 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 137 | `timeUnit` | 时间单位 | `time_unit` | Short |
| 138 | `totalCompleteNum` | 累计完成数量 | `total_complete_num` | Decimal |
| 139 | `totalCompleteNum1` | 累计完成件数 | `total_complete_num1` | Decimal |
| 140 | `totalCompleteNum2` | 累计完成数量(产出) | `total_complete_num2` | Decimal |
| 141 | `totalExecNum` | 累计执行数量 | `total_exec_num` | Decimal |
| 142 | `totalExecNum1` | 累计执行件数 | `total_exec_num1` | Decimal |
| 143 | `totalExecNum2` | 累计执行数量(产出) | `total_exec_num2` | Decimal |
| 144 | `totalQualifiedNum` | 累计合格数量 | `total_qualified_num` | Decimal |
| 145 | `totalQualifiedNum1` | 累计合格件数 | `total_qualified_num1` | Decimal |
| 146 | `totalQualifiedNum2` | 累计合格数量(产出) | `total_qualified_num2` | Decimal |
| 147 | `totalQualifiedTurnNum` | 累计合格转出数量 | `total_qualified_turn_num` | Decimal |
| 148 | `totalQualifiedTurnNum1` | 累计合格转出件数 | `total_qualified_turn_num1` | Decimal |
| 149 | `totalQualifiedTurnNum2` | 累计合格转出数量(产出) | `total_qualified_turn_num2` | Decimal |
| 150 | `totalReturnNum` | 累计退回数量 | `total_return_num` | Decimal |
| 151 | `totalReturnNum1` | 累计退回件数 | `total_return_num1` | Decimal |
| 152 | `totalReturnNum2` | 累计退回数量(产出) | `total_return_num2` | Decimal |
| 153 | `totalReworkNum` | 累计待返工数量 | `total_rework_num` | Decimal |
| 154 | `totalReworkNum1` | 累计待返工件数 | `total_rework_num1` | Decimal |
| 155 | `totalReworkNum2` | 累计待返工数量(产出) | `total_rework_num2` | Decimal |
| 156 | `totalReworkProcessNum` | 累计返工处理数量 | `total_rework_process_num` | Decimal |
| 157 | `totalReworkProcessNum1` | 累计返工处理件数 | `total_rework_process_num1` | Decimal |
| 158 | `totalReworkProcessNum2` | 累计返工处理数量(产出) | `total_rework_process_num2` | Decimal |
| 159 | `totalReworkTurnNum` | 累计返工转出数量 | `total_rework_turn_num` | Decimal |
| 160 | `totalReworkTurnNum1` | 累计返工转出件数 | `total_rework_turn_num1` | Decimal |
| 161 | `totalReworkTurnNum2` | 累计返工转出数量(产出) | `total_rework_turn_num2` | Decimal |
| 162 | `totalScrapNum` | 累计报废数量 | `total_scrap_num` | Decimal |
| 163 | `totalScrapNum1` | 累计报废件数 | `total_scrap_num1` | Decimal |
| 164 | `totalScrapNum2` | 累计报废数量(产出) | `total_scrap_num2` | Decimal |
| 165 | `totalTurnNum` | 累计转出数量 | `total_turn_num` | Decimal |
| 166 | `totalTurnNum1` | 累计转出件数 | `total_turn_num1` | Decimal |
| 167 | `totalTurnNum2` | 累计转出数量(产出) | `total_turn_num2` | Decimal |
| 168 | `totalTurninNum` | 累计转入数量 | `total_turnin_num` | Decimal |
| 169 | `totalTurninNum1` | 累计转入件数 | `total_turnin_num1` | Decimal |
| 170 | `totalTurninNum2` | 累计转入数量(产出) | `total_turnin_num2` | Decimal |
| 171 | `totalTurnoutBackNum` | 累计外发收回数量 | `total_turnout_back_num` | Decimal |
| 172 | `totalTurnoutBackNum1` | 累计外发收回件数 | `total_turnout_back_num1` | Decimal |
| 173 | `totalTurnoutBackNum2` | 累计外发收回数量(产出) | `total_turnout_back_num2` | Decimal |
| 174 | `totalTurnoutDispatchNum` | 累计外协分派数量 | `total_turnout_dispatch_num` | Decimal |
| 175 | `totalTurnoutDispatchNum1` | 累计外协分派件数 | `total_turnout_dispatch_num1` | Decimal |
| 176 | `totalTurnoutDispatchNum2` | 累计外协分派数量(产出) | `total_turnout_dispatch_num2` | Decimal |
| 177 | `totalTurnoutNum` | 累计转外发数量 | `total_turnout_num` | Decimal |
| 178 | `totalTurnoutNum1` | 累计转外发件数 | `total_turnout_num1` | Decimal |
| 179 | `totalTurnoutNum2` | 累计转外发数量(产出) | `total_turnout_num2` | Decimal |
| 180 | `totalTurnoutQualifiedNum` | 累计外协合格数量 | `total_turnout_qualified_num` | Decimal |
| 181 | `totalTurnoutQualifiedNum1` | 累计外协合格件数 | `total_turnout_qualified_num1` | Decimal |
| 182 | `totalTurnoutQualifiedNum2` | 累计外协合格数量(产出) | `total_turnout_qualified_num2` | Decimal |
| 183 | `totalTurnoutReturnNum` | 累计外协转自返数量 | `total_turnout_return_num` | Decimal |
| 184 | `totalTurnoutReturnNum1` | 累计外协转自返件数 | `total_turnout_return_num1` | Decimal |
| 185 | `totalTurnoutReturnNum2` | 累计外协转自返数量(产出) | `total_turnout_return_num2` | Decimal |
| 186 | `totalTurnoutReworkNum` | 累计外协待返工数量 | `total_turnout_rework_num` | Decimal |
| 187 | `totalTurnoutReworkNum1` | 累计外协待返工件数 | `total_turnout_rework_num1` | Decimal |
| 188 | `totalTurnoutReworkNum2` | 累计外协待返工数量(产出) | `total_turnout_rework_num2` | Decimal |
| 189 | `totalTurnoutScrapNum` | 累计外协报废数量 | `total_turnout_scrap_num` | Decimal |
| 190 | `totalTurnoutScrapNum1` | 累计外协报废件数 | `total_turnout_scrap_num1` | Decimal |
| 191 | `totalTurnoutScrapNum2` | 累计外协报废数量(产出) | `total_turnout_scrap_num2` | Decimal |
| 192 | `unauditDate` | 弃审日期 | `unaudit_date` | Date |
| 193 | `unauditTime` | 弃审时间 | `unaudit_time` | DateTime |
| 194 | `unauditorId` | 弃审人 | `unauditor_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 195 | `uncompleteDate` | 反完工日期 | `uncomplete_date` | Date |
| 196 | `uncompleteTime` | 反完工时间 | `uncomplete_time` | DateTime |
| 197 | `uncompleteUserId` | 反完工人 | `uncomplete_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 198 | `unstartDate` | 反开工日期 | `unstart_date` | Date |
| 199 | `unstartTime` | 反开工时间 | `unstart_time` | DateTime |
| 200 | `unstartUserId` | 反开工人 | `unstart_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 201 | `vendorId` | 供应商 | `vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 202 | `workCenterId` | 工作中心 | `work_center_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 203 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 204 | `ProcessFlowCardPlanExt` | 工序流转卡工序扩展 | `` | f5120232-be03-4ceb-b3f2-edd5a597010f |
| 205 | `closeRemark` | 关闭说明 | `close_remark` | String |
| 206 | `inspectionStatus` | 检验状态 | `inspection_status` | Short |
| 207 | `mainChangeRateDen` | 生产换算率分母 | `main_change_rateden` | Decimal |
| 208 | `mainChangeRateNum` | 生产换算率分子 | `main_change_ratenum` | Decimal |
| 209 | `opSequenceId` | 工序序列ID | `op_sequence_id` | c89032db-c707-4a7d-84ef-bdd29d142856 |
| 210 | `opSequenceType` | 序列类型 | `op_sequence_type` | Integer |
| 211 | `outChangeRateDen` | 产出换算率分母 | `out_change_rateden` | Decimal |
| 212 | `outChangeRateNum` | 产出换算率分子 | `out_change_ratenum` | Decimal |
| 213 | `processFlowCardHandOver` | 工序流转卡交接 | `` | 2eb3c5af-a252-4b2f-865f-d12237ee2735 |
| 214 | `processFlowCardPlanDefine` | 工序流转卡工序自由自定义项 | `` | 67b72b9a-4f30-4232-82db-696c984453fb |
| 215 | `processFlowCardPlanOutput` | 工序流转卡工序产出 | `` | 891c152d-4732-4bdb-a55e-bed04fa85597 |
| 216 | `processFlowCardPlanSource` | 工序流转卡工序来源信息 | `` | 460f6710-6b67-4f3e-af0d-491934a8c97d |
| 217 | `processFlowCardPlanSuspend` | 工序流转卡工序挂起解除信息 | `` | b46ef669-31ef-4fff-bb51-a30b87cd4c73 |
| 218 | `processFlowCardPlanUserDefine` | 工序流转卡工序固定自定义项 | `` | deeafd74-7b47-49be-b452-77e7fe69a180 |
| 219 | `qualifiedStockAuxiliaryQuantity` | 合格入库件数 | `qualified_stock_auxiliary_qua` | Decimal |
| 220 | `qualifiedStockOutQuantity` | 合格入库数量(产出) | `qualified_stock_out_quantity` | Decimal |
| 221 | `qualifiedStockQuantity` | 合格入库数量 | `qualified_stock_quantity` | Decimal |
| 222 | `scrapNoStockAuxQty` | 报废不入库件数 | `scrap_no_stock_aux_qty` | Decimal |
| 223 | `scrapNoStockOutQty` | 报废不入库数量(产出) | `scrap_no_stock_out_qty` | Decimal |
| 224 | `scrapNoStockQty` | 报废不入库数量 | `scrap_no_stock_qty` | Decimal |
| 225 | `scrapStockAuxiliaryQuantity` | 报废入库件数 | `scrap_stock_auxiliary_quantity` | Decimal |
| 226 | `scrapStockOutQuantity` | 报废入库数量(产出) | `scrap_stock_out_quantity` | Decimal |
| 227 | `scrapStockQuantity` | 报废入库数量 | `scrap_stock_quantity` | Decimal |
| 228 | `stockStatus` | 入库状态 | `stock_status` | Short |
| 229 | `totalCheckNum` | 累计检验数量 | `total_check_num` | Decimal |

---

## 关联属性（46个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `processFlowCardPlanOutput` | 工序流转卡工序产出 | `sfc.processFlowCard.processFlowCardPlanOutput` | None | true |
| 2 | `preId` | 前工序 | `po.order.OrderProcess` | Service |  |
| 3 | `goodsId` | 货位 | `aa.goodsposition.GoodsPosition` | Service |  |
| 4 | `exeOrgId` | 执行组织 | `org.func.BaseOrg` | Service |  |
| 5 | `operationControlId` | 工序控制码 | `ed.operationcontrolcode.OperationControlCode` | Service |  |
| 6 | `processFlowCardPlanSuspend` | 工序流转卡工序挂起解除信息 | `sfc.processFlowCard.processFlowCardPlanSuspend` | None | true |
| 7 | `vendorId` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 8 | `deviceId` | 设备 | `aim.equip.EquipHeadVO` | Service |  |
| 9 | `processFlowCardId` | 工序流转卡 | `sfc.processFlowCard.processFlowCard` | None | true |
| 10 | `confirmUserId` | 汇报确认人 | `base.user.User` | Service |  |
| 11 | `holdReasonId` | 挂起原因 | `aa.reason.Reason` | Service |  |
| 12 | `srcFlowPlanId` | 源工序流转卡工序 | `sfc.processFlowCard.processFlowCardPlan` | None |  |
| 13 | `nextId` | 后工序 | `po.order.OrderProcess` | Service |  |
| 14 | `startUserId` | 开工人 | `base.user.User` | Service |  |
| 15 | `handoverUserId` | 交接人 | `base.user.User` | Service |  |
| 16 | `costCenterId` | 成本中心 | `bd.costcenter.CostCenter` | Service |  |
| 17 | `workCenterId` | 工作中心 | `ed.workcenter.WorkCenter` | Service |  |
| 18 | `closerId` | 关闭人 | `base.user.User` | Service |  |
| 19 | `operationId` | 标准工序 | `ed.operation.Operation` | Service |  |
| 20 | `uncompleteUserId` | 反完工人 | `base.user.User` | Service |  |
| 21 | `outUnitId` | 产出单位 | `pc.unit.Unit` | Service |  |
| 22 | `selfDefineCharacterPlan` | 工序流转卡工序自定义项特征组 | `sfc.processFlowCard.ProcFlowCardPlanSelfDefineCharacter` | None |  |
| 23 | `unauditorId` | 弃审人 | `base.user.User` | Service |  |
| 24 | `unstartUserId` | 反开工人 | `base.user.User` | Service |  |
| 25 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 26 | `processFlowCardPlanUserDefine` | 工序流转卡工序固定自定义项 | `sfc.processFlowCard.processFlowCardPlanUserDefine` | None | true |
| 27 | `closeReasonId` | 关闭原因 | `aa.reason.Reason` | Service |  |
| 28 | `mainUnitId` | 主计量单位 | `pc.unit.Unit` | Service |  |
| 29 | `ProcessFlowCardPlanExt` | 工序流转卡工序扩展 | `sfc.processFlowCard.ProcessFlowCardPlanExt` | None | true |
| 30 | `shiftId` | 班次 | `hrtm.platformShift.PlatformShift` | Service |  |
| 31 | `holdUserId` | 挂起人 | `base.user.User` | Service |  |
| 32 | `opSequenceId` | 工序序列ID | `po.order.OrderOpSequence` | Service |  |
| 33 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 34 | `processFlowCardPlanSource` | 工序流转卡工序来源信息 | `sfc.processFlowCard.processFlowCardPlanSource` | None | true |
| 35 | `batch` | 批次 | `st.batchno.Batchno` | Service |  |
| 36 | `openUserId` | 打开人 | `base.user.User` | Service |  |
| 37 | `productionUnitId` | 生产单位 | `pc.unit.Unit` | Service |  |
| 38 | `checkConfirmUserId` | 检验确认人 | `base.user.User` | Service |  |
| 39 | `completeUserId` | 完工人 | `base.user.User` | Service |  |
| 40 | `processFlowCardHandOver` | 工序流转卡交接 | `sfc.processFlowCard.processFlowCardHandOver` | None | true |
| 41 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 42 | `orderProcessId` | 生产订单工序 | `po.order.OrderProcess` | Service |  |
| 43 | `warehouseId` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 44 | `teamId` | 班组 | `bd.timemodel.TeamDefinition` | Service |  |
| 45 | `processFlowCardPlanDefine` | 工序流转卡工序自由自定义项 | `sfc.processFlowCard.processFlowCardPlanDefine` | None | true |
| 46 | `staffId` | 员工 | `bd.staff.Staff` | Service |  |
