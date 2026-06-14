---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.dispatch.DisPatchDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 任务分派明细 (`sfc.dispatch.DisPatchDetail`)

> IMPSFC | 物理表：`imp_sfc_proc_plan_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 任务分派明细 |
| 物理表 | `imp_sfc_proc_plan_detail` |
| domain/服务域 | `IMP-SFC` |
| schema | `production_order` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:21:29.7530` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（226个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ProcPlanDetailExt` | 任务分派明细扩展 | `` | 2038fad4-e989-4eb9-82e6-25ed2e454806 |
| 2 | `ProcPlanDetailOutputList` | 任务分派明细产出 | `` | 7ca025b3-f8c2-4baf-88f8-0eb2faea6743 |
| 3 | `ProcPlanDeviceAndStaffList` | 任务分派明细设备人员 | `` | 40e8cf93-b4e3-4554-bf44-2517c722deb8 |
| 4 | `actualEndTime` | 实际完工时间 | `actual_end_time` | DateTime |
| 5 | `actualStartTime` | 实际开工时间 | `actual_start_time` | DateTime |
| 6 | `batch` | 批次 | `batch` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 7 | `batchNo` | 批次号 | `batch_no` | String |
| 8 | `breakUpTransferInQty` | 分割转入数量 | `break_up_transfer_in_qty` | Decimal |
| 9 | `breakUpTransferInQty1` | 分割转入件数 | `break_up_transfer_in_qty1` | Decimal |
| 10 | `breakUpTransferInQty2` | 分割转入数量(产出) | `break_up_transfer_in_qty2` | Decimal |
| 11 | `breakUpTransferOutQty` | 分割转出数量 | `break_up_transfer_out_qty` | Decimal |
| 12 | `breakUpTransferOutQty1` | 分割转出件数 | `break_up_transfer_out_qty1` | Decimal |
| 13 | `breakUpTransferOutQty2` | 分割转出数量(产出) | `break_up_transfer_out_qty2` | Decimal |
| 14 | `checkType` | 质检方式 | `check_type` | Short |
| 15 | `closeDate` | 关闭日期 | `close_Date` | Date |
| 16 | `closeReasonId` | 关闭原因 | `close_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 17 | `closeRemark` | 关闭说明 | `close_remark` | String |
| 18 | `closeTime` | 关闭时间 | `close_time` | DateTime |
| 19 | `closer` | 关闭人名称 | `closer` | String |
| 20 | `closerId` | 关闭人 | `closerId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 21 | `completeDate` | 完工日期 | `complete_date` | Date |
| 22 | `completeTime` | 完工时间 | `complete_time` | DateTime |
| 23 | `completeUserId` | 完工人 | `complete_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 24 | `costCenterId` | 成本中心 | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 25 | `define1` | 自定义项1 | `define1` | String |
| 26 | `define10` | 自定义项10 | `define10` | String |
| 27 | `define11` | 自定义项11 | `define11` | String |
| 28 | `define12` | 自定义项12 | `define12` | String |
| 29 | `define13` | 自定义项13 | `define13` | String |
| 30 | `define14` | 自定义项14 | `define14` | String |
| 31 | `define15` | 自定义项15 | `define15` | String |
| 32 | `define16` | 自定义项16 | `define16` | String |
| 33 | `define17` | 自定义项17 | `define17` | String |
| 34 | `define18` | 自定义项18 | `define18` | String |
| 35 | `define19` | 自定义项19 | `define19` | String |
| 36 | `define2` | 自定义项2 | `define2` | String |
| 37 | `define20` | 自定义项20 | `define20` | String |
| 38 | `define21` | 自定义项21 | `define21` | String |
| 39 | `define22` | 自定义项22 | `define22` | String |
| 40 | `define23` | 自定义项23 | `define23` | String |
| 41 | `define24` | 自定义项24 | `define24` | String |
| 42 | `define25` | 自定义项25 | `define25` | String |
| 43 | `define26` | 自定义项26 | `define26` | String |
| 44 | `define27` | 自定义项27 | `define27` | String |
| 45 | `define28` | 自定义项28 | `define28` | String |
| 46 | `define29` | 自定义项29 | `define29` | String |
| 47 | `define3` | 自定义项3 | `define3` | String |
| 48 | `define30` | 自定义项30 | `define30` | String |
| 49 | `define4` | 自定义项4 | `define4` | String |
| 50 | `define5` | 自定义项5 | `define5` | String |
| 51 | `define6` | 自定义项6 | `define6` | String |
| 52 | `define7` | 自定义项7 | `define7` | String |
| 53 | `define8` | 自定义项8 | `define8` | String |
| 54 | `define9` | 自定义项9 | `define9` | String |
| 55 | `dispatchId` | 派工单id | `dispatch_id` | d9807931-2439-4200-9b93-efacb0f688b5 |
| 56 | `dispatchSn` | 派工顺序号 | `dispatch_sn` | Decimal |
| 57 | `dispatchStatus` | 派工状态 | `dispatch_status` | Short |
| 58 | `dispatchTime` | 派工时间 | `dispatch_time` | DateTime |
| 59 | `dispatchUserId` | 派工人 | `dispatch_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 60 | `dr` | 逻辑删除标记 | `dr` | Short |
| 61 | `exeOrgId` | 执行组织 | `exe_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 62 | `firstCheck` | 首件检验 | `first_check` | String |
| 63 | `firstCheckStatus` | 首检状态 | `first_check_status` | String |
| 64 | `firstCheckType` | 首检控制方式 | `first_check_type` | String |
| 65 | `firstsource` | 源头单据类型 | `first_source` | String |
| 66 | `firstsourceautoid` | 源头单据子表id | `first_source_autoid` | Long |
| 67 | `firstsourceautono` | 源头单据子表行号 | `first_source_autono` | Decimal |
| 68 | `firstsourceid` | 源头单据id | `first_source_id` | Long |
| 69 | `firstupcode` | 源头单据号 | `first_upcode` | String |
| 70 | `freeCharacteristics` | 工序作业计划明细自由项特征组 | `free_characteristics` | cdf87562-7b30-4f30-a653-c062b091608d |
| 71 | `goodsId` | 货位 | `goods_id` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc |
| 72 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 73 | `holdDate` | 挂起日期 | `hold_date` | Date |
| 74 | `holdDesc` | 挂起说明 | `hold_desc` | String |
| 75 | `holdReasonId` | 挂起原因 | `hold_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 76 | `holdTime` | 挂起时间 | `hold_time` | DateTime |
| 77 | `holdUserId` | 挂起人 | `hold_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 78 | `id` | ID | `id` | Long |
| 79 | `inspectionStatus` | 检验状态 | `inspection_status` | Short |
| 80 | `invaliddate` | 失效日期 | `dInvalidDate` | Date |
| 81 | `isAutoComplete` | 自动完工 | `is_auto_complete` | Short |
| 82 | `isAutohandover` | 自动交接 | `is_autohandover` | Short |
| 83 | `isClose` | 关闭 | `is_close` | Short |
| 84 | `isHold` | 挂起 | `is_hold` | Short |
| 85 | `isOutsource` | 委外 | `is_outsource` | Short |
| 86 | `isPublish` | 发布 | `is_publish` | Short |
| 87 | `isReportPoint` | 报告点 | `is_reportpoint` | Short |
| 88 | `isSerialNoManage` | 序列号管理 | `is_serial_no_manage` | Short |
| 89 | `lineStatus` | 行状态 | `line_status` | Short |
| 90 | `lineno` | 行号 | `lineno` | Decimal |
| 91 | `mainChangeRate` | 生产换算率 | `main_change_rate` | Decimal |
| 92 | `mainChangeRateDen` | 生产换算率分母 | `main_change_rateden` | Decimal |
| 93 | `mainChangeRateNum` | 生产换算率分子 | `main_change_ratenum` | Decimal |
| 94 | `mainUnitId` | 主计量单位 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 95 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 96 | `materialApplyStatus` | 领料申请状态 | `material_apply_status` | Short |
| 97 | `materialStatus` | 领料状态 | `material_status` | Short |
| 98 | `nextId` | 后工序 | `next_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 99 | `nextSn` | 后序顺序号 | `next_sn` | Decimal |
| 100 | `opSequenceId` | 工序序列 | `op_sequence_id` | c89032db-c707-4a7d-84ef-bdd29d142856 |
| 101 | `opSequenceType` | 序列类型 | `op_sequence_type` | Integer |
| 102 | `openDate` | 打开日期 | `open_date` | Date |
| 103 | `openTime` | 打开时间 | `open_time` | DateTime |
| 104 | `openUserId` | 打开人 | `open_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 105 | `operationControlId` | 工序控制码 | `operation_control_id` | b47f926b-e3ed-40e1-8423-171e9fb107c9 |
| 106 | `operationId` | 标准工序 | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 107 | `orderCode` | 生产订单编号 | `order_code` | String |
| 108 | `orderId` | 生产订单 | `order_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 109 | `orderLineNo` | 生产订单产品行号 | `order_line_no` | Decimal |
| 110 | `orderProcessId` | 生产订单工序 | `order_process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 111 | `orderProductId` | 生产订单产品 | `order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 112 | `originProdNum` | 应加工数量 | `origin_prod_num` | Decimal |
| 113 | `originProdNum1` | 应加工件数 | `origin_prod_num1` | Decimal |
| 114 | `originProdNum2` | 应加工数量(产出) | `origin_prod_num2` | Decimal |
| 115 | `osmApplicationQty` | 转委外申请数量 | `osm_application_qty` | Decimal |
| 116 | `osmApplicationQty1` | 转委外申请件数 | `osm_application_qty1` | Decimal |
| 117 | `osmApplicationQty2` | 转委外申请数量(产出) | `osm_application_qty2` | Decimal |
| 118 | `osmOrderQty` | 转委外订单数量 | `osm_order_qty` | Decimal |
| 119 | `osmOrderQty1` | 转委外订单件数 | `osm_order_qty1` | Decimal |
| 120 | `osmOrderQty2` | 转委外订单数量(产出) | `osm_order_qty2` | Decimal |
| 121 | `osmReleasedQty` | 委外下达量 | `osm_released_qty` | Decimal |
| 122 | `osmReleasedQty1` | 委外下达件数 | `osm_released_qty1` | Decimal |
| 123 | `osmReleasedQty2` | 委外下达量(产出) | `osm_released_qty2` | Decimal |
| 124 | `outChangeRate` | 产出换算率 | `out_change_rate` | Decimal |
| 125 | `outChangeRateDen` | 产出换算率分母 | `out_change_rateden` | Decimal |
| 126 | `outChangeRateNum` | 产出换算率分子 | `out_change_ratenum` | Decimal |
| 127 | `outExchangeType` | 换算方式 | `out_exchange_type` | Short |
| 128 | `outUnitId` | 产出单位 | `out_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 129 | `preId` | 前工序 | `pre_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 130 | `preSn` | 前序顺序号 | `pre_sn` | Decimal |
| 131 | `procPlanId` | 任务分派ID | `proc_plan_id` | 651c34e4-a23e-4bfd-89a7-f53f5d51e14e |
| 132 | `processType` | 加工类型 | `process_type` | Short |
| 133 | `producedate` | 生产日期 | `dProduceDate` | Date |
| 134 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 135 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 136 | `productionDepartmentId` | 部门 | `production_department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 137 | `productionUnitId` | 生产单位 | `production_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 138 | `publishDate` | 发布日期 | `publish_date` | Date |
| 139 | `publishTime` | 发布时间 | `publish_time` | DateTime |
| 140 | `publishUserId` | 发布人 | `publish_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 141 | `pubts` | 时间戳 | `pubts` | DateTime |
| 142 | `qualifiedStockAuxiliaryQuantity` | 合格入库件数 | `qualified_stock_auxiliary_qua` | Decimal |
| 143 | `qualifiedStockOutQuantity` | 合格入库数量(产出) | `qualified_stock_out_quantity` | Decimal |
| 144 | `qualifiedStockQuantity` | 合格入库数量 | `qualified_stock_quantity` | Decimal |
| 145 | `remark` | 备注 | `remark` | String |
| 146 | `rowno` | 序号 | `rowno` | Integer |
| 147 | `scheduleEndTime` | 计划完工时间 | `schedule_end_time` | DateTime |
| 148 | `scheduleOutputNum` | 预计产出数量 | `schedule_output_num` | Decimal |
| 149 | `scheduleOutputNum1` | 预计产出件数 | `schedule_output_num1` | Decimal |
| 150 | `scheduleOutputNum2` | 预计产出数量(产出) | `schedule_output_num2` | Decimal |
| 151 | `schedulePrepareTime` | 计划准备工时 | `schedule_prepare_time` | Decimal |
| 152 | `scheduleProcessTime` | 计划加工工时 | `schedule_process_time` | Decimal |
| 153 | `scheduleProdNum` | 计划加工数量 | `schedule_prod_num` | Decimal |
| 154 | `scheduleProdNum1` | 计划加工件数 | `schedule_prod_num1` | Decimal |
| 155 | `scheduleProdNum2` | 计划加工数量(产出) | `schedule_prod_num2` | Decimal |
| 156 | `scheduleStartTime` | 计划开工时间 | `schedule_start_time` | DateTime |
| 157 | `scrapInNum` | 累计报废转出数量 | `scrap_in_num` | Decimal |
| 158 | `scrapInNum1` | 累计报废转出件数 | `scrap_in_num1` | Decimal |
| 159 | `scrapInNum2` | 累计报废转出数量(产出) | `scrap_in_num2` | Decimal |
| 160 | `scrapNoStockAuxQty` | 报废不入库件数 | `scrap_no_stock_aux_qty` | Decimal |
| 161 | `scrapNoStockOutQty` | 报废不入库数量(产出) | `scrap_no_stock_out_qty` | Decimal |
| 162 | `scrapNoStockQty` | 报废不入库数量 | `scrap_no_stock_qty` | Decimal |
| 163 | `scrapStockAuxiliaryQuantity` | 报废入库件数 | `scrap_stock_auxiliary_quantity` | Decimal |
| 164 | `scrapStockOutQuantity` | 报废入库数量(产出) | `scrap_stock_out_quantity` | Decimal |
| 165 | `scrapStockQuantity` | 报废入库数量 | `scrap_stock_quantity` | Decimal |
| 166 | `selfDefineCharacter` | 工序作业计划明细自定义项特征实体 | `self_define_character` | f47fba49-a0d9-4a0e-8745-da17a6ef14d2 |
| 167 | `shiftId` | 班次 | `shift_id` | 566d5ab9-aeca-4f63-a0d1-1b98a161c6bc |
| 168 | `sn` | 工序顺序号 | `sn` | Decimal |
| 169 | `source` | 上游单据类型 | `source` | String |
| 170 | `sourceGrandchildrenId` | 上游单据孙表id | `source_grandchildrenId` | Long |
| 171 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 172 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 173 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 174 | `srcDispatchPlanId` | 源派工工序id | `src_dispatch_plan_id` | Long |
| 175 | `startDate` | 开工日期 | `start_date` | Date |
| 176 | `startTime` | 开工时间 | `start_time` | DateTime |
| 177 | `startUserId` | 开工人 | `start_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 178 | `stockStatus` | 入库状态 | `stock_status` | Short |
| 179 | `teamId` | 班组 | `team_id` | d1ce258a-6311-4719-846d-998458841d05 |
| 180 | `timeUnit` | 时间单位 | `time_unit` | Short |
| 181 | `totalCheckNum` | 累计检验数量 | `total_check_num` | Decimal |
| 182 | `totalCompleteNum` | 累计完成数量 | `total_complete_num` | Decimal |
| 183 | `totalCompleteNum1` | 累计完成件数 | `total_complete_num1` | Decimal |
| 184 | `totalCompleteNum2` | 累计完成数量(产出) | `total_complete_num2` | Decimal |
| 185 | `totalExecNum` | 累计执行数量 | `total_exec_num` | Decimal |
| 186 | `totalExecNum1` | 累计执行件数 | `total_exec_num1` | Decimal |
| 187 | `totalExecNum2` | 累计执行数量(产出) | `total_exec_num2` | Decimal |
| 188 | `totalQualifiedNum` | 累计合格数量 | `total_qualified_num` | Decimal |
| 189 | `totalQualifiedNum1` | 累计合格件数 | `total_qualified_num1` | Decimal |
| 190 | `totalQualifiedNum2` | 累计合格数量(产出) | `total_qualified_num2` | Decimal |
| 191 | `totalQualifiedTurnNum` | 累计合格转出数量 | `total_qualified_turn_num` | Decimal |
| 192 | `totalQualifiedTurnNum1` | 累计合格转出件数 | `total_qualified_turn_num1` | Decimal |
| 193 | `totalQualifiedTurnNum2` | 累计合格转出数量(产出) | `total_qualified_turn_num2` | Decimal |
| 194 | `totalReworkNum` | 累计待返工数量 | `total_rework_num` | Decimal |
| 195 | `totalReworkNum1` | 累计待返工件数 | `total_rework_num1` | Decimal |
| 196 | `totalReworkNum2` | 累计待返工数量(产出) | `total_rework_num2` | Decimal |
| 197 | `totalReworkProcessNum` | 累计返工处理数量 | `total_rework_process_num` | Decimal |
| 198 | `totalReworkProcessNum1` | 累计返工处理件数 | `total_rework_process_num1` | Decimal |
| 199 | `totalReworkProcessNum2` | 累计返工处理数量(产出) | `total_rework_process_num2` | Decimal |
| 200 | `totalReworkTurnNum` | 累计返工转出数量 | `total_rework_turn_num` | Decimal |
| 201 | `totalReworkTurnNum1` | 累计返工转出件数 | `total_rework_turn_num1` | Decimal |
| 202 | `totalReworkTurnNum2` | 累计返工转出数量(产出) | `total_rework_turn_num2` | Decimal |
| 203 | `totalScrapNum` | 累计报废数量 | `total_scrap_num` | Decimal |
| 204 | `totalScrapNum1` | 累计报废件数 | `total_scrap_num1` | Decimal |
| 205 | `totalScrapNum2` | 累计报废数量(产出) | `total_scrap_num2` | Decimal |
| 206 | `totalTurnNum` | 累计转出数量 | `total_turn_num` | Decimal |
| 207 | `totalTurnNum1` | 累计转出件数 | `total_turn_num1` | Decimal |
| 208 | `totalTurnNum2` | 累计转出数量(产出) | `total_turn_num2` | Decimal |
| 209 | `totalTurninNum` | 累计转入数量 | `total_turnin_num` | Decimal |
| 210 | `totalTurninNum1` | 累计转入件数 | `total_turnin_num1` | Decimal |
| 211 | `totalTurninNum2` | 累计转入数量(产出) | `total_turnin_num2` | Decimal |
| 212 | `uncompleteDate` | 反完工日期 | `uncomplete_date` | Date |
| 213 | `uncompleteTime` | 反完工时间 | `uncomplete_time` | DateTime |
| 214 | `uncompleteUserId` | 反完工人 | `uncomplete_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 215 | `unitExchangeType` | 换算方式 | `unit_exchange_type` | Short |
| 216 | `unpublishDate` | 取消发布日期 | `unpublish_date` | Date |
| 217 | `unpublishTime` | 取消发布时间 | `unpublish_time` | DateTime |
| 218 | `unpublishUserId` | 取消发布人 | `unpublish_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 219 | `unstartDate` | 反开工日期 | `unstart_date` | Date |
| 220 | `unstartTime` | 反开工时间 | `unstart_time` | DateTime |
| 221 | `unstartUserId` | 反开工人 | `unstart_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 222 | `upcode` | 上游单据号 | `upcode` | String |
| 223 | `vendorId` | 供应商 | `vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 224 | `warehouseId` | 仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 225 | `workCenterId` | 工作中心 | `work_center_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 226 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（43个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `preId` | 前工序 | `po.order.OrderProcess` | Service |  |
| 2 | `orderId` | 生产订单 | `po.order.Order` | Service |  |
| 3 | `goodsId` | 货位 | `aa.goodsposition.GoodsPosition` | Service |  |
| 4 | `exeOrgId` | 执行组织 | `org.func.BaseOrg` | Service |  |
| 5 | `operationControlId` | 工序控制码 | `ed.operationcontrolcode.OperationControlCode` | Service |  |
| 6 | `vendorId` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 7 | `unpublishUserId` | 取消发布人 | `base.user.User` | Service |  |
| 8 | `holdReasonId` | 挂起原因 | `aa.reason.Reason` | Service |  |
| 9 | `dispatchId` | 派工单id | `sfc.dispatchinfo.DispatchInfo` | None |  |
| 10 | `nextId` | 后工序 | `po.order.OrderProcess` | Service |  |
| 11 | `startUserId` | 开工人 | `base.user.User` | Service |  |
| 12 | `ProcPlanDetailOutputList` | 任务分派明细产出 | `sfc.dispatch.DisPatchDetailOutput` | None | true |
| 13 | `costCenterId` | 成本中心 | `bd.costcenter.CostCenter` | Service |  |
| 14 | `workCenterId` | 工作中心 | `ed.workcenter.WorkCenter` | Service |  |
| 15 | `closerId` | 关闭人 | `base.user.User` | Service |  |
| 16 | `operationId` | 标准工序 | `ed.operation.Operation` | Service |  |
| 17 | `uncompleteUserId` | 反完工人 | `base.user.User` | Service |  |
| 18 | `dispatchUserId` | 派工人 | `base.user.User` | Service |  |
| 19 | `outUnitId` | 产出单位 | `pc.unit.Unit` | Service |  |
| 20 | `unstartUserId` | 反开工人 | `base.user.User` | Service |  |
| 21 | `closeReasonId` | 关闭原因 | `aa.reason.Reason` | Service |  |
| 22 | `mainUnitId` | 主计量单位 | `pc.unit.Unit` | Service |  |
| 23 | `shiftId` | 班次 | `calendar.platformShift.PlatformShift` | Service |  |
| 24 | `productId` | 物料 | `pc.product.Product` | Service |  |
| 25 | `selfDefineCharacter` | 工序作业计划明细自定义项特征实体 | `sfc.procPlan.ProcPlanDetailSelfDefineCharacter` | None |  |
| 26 | `holdUserId` | 挂起人 | `base.user.User` | Service |  |
| 27 | `opSequenceId` | 工序序列 | `po.order.OrderOpSequence` | Service |  |
| 28 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 29 | `batch` | 批次 | `st.batchno.Batchno` | Service |  |
| 30 | `publishUserId` | 发布人 | `base.user.User` | Service |  |
| 31 | `orderProductId` | 生产订单产品 | `po.order.OrderProduct` | Service |  |
| 32 | `openUserId` | 打开人 | `base.user.User` | Service |  |
| 33 | `productionUnitId` | 生产单位 | `pc.unit.Unit` | Service |  |
| 34 | `completeUserId` | 完工人 | `base.user.User` | Service |  |
| 35 | `ProcPlanDeviceAndStaffList` | 任务分派明细设备人员 | `sfc.dispatch.DisPatchDetailDeviceAndStaff` | None | true |
| 36 | `ProcPlanDetailExt` | 任务分派明细扩展 | `sfc.dispatch.DisPatchDetailExt` | None | true |
| 37 | `procPlanId` | 任务分派ID | `sfc.dispatch.DisPatch` | None | true |
| 38 | `freeCharacteristics` | 工序作业计划明细自由项特征组 | `sfc.procPlan.ProcPlanDetailFreeCharacter` | None |  |
| 39 | `orderProcessId` | 生产订单工序 | `po.order.OrderProcess` | Service |  |
| 40 | `warehouseId` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 41 | `teamId` | 班组 | `bd.timemodel.TeamDefinition` | Service |  |
| 42 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 43 | `productionDepartmentId` | 部门 | `aa.baseorg.DeptMV` | Service |  |
