---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.proceTaskReport.proceTaskReport"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工序任务汇报 (`sfc.proceTaskReport.proceTaskReport`)

> IMPSFC | 物理表：`imp_sfc_procetaskrep`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工序任务汇报 |
| 物理表 | `imp_sfc_procetaskrep` |
| domain/服务域 | `IMP-SFC` |
| schema | `production_order` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:21:10.1040` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（218个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `batchNo` | 批次号 | `batch_no` | String |
| 2 | `ProceTaskReportDeviceDetailList` | 工序任务汇报设备 | `` | 5e7eab36-df46-48c8-8fd4-35bc1df9c09a |
| 3 | `ProceTaskReportExt` | 工序任务汇报平行表 | `` | 22504700-5993-44db-b7de-46a28cdcbd89 |
| 4 | `ProceTaskReportStaffList` | 工序任务汇报人员 | `` | 96853ea2-d458-46e0-b9bb-65a688b5a8dc |
| 5 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 6 | `actualEndTime` | 实际结束时间 | `actual_end_time` | DateTime |
| 7 | `actualStartTime` | 实际开始时间 | `actual_start_time` | DateTime |
| 8 | `auditDate` | 审批日期 | `audit_date` | Date |
| 9 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 10 | `auditor` | 审批人名称 | `auditor` | String |
| 11 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 12 | `barCode` | 条形码 | `bar_code` | String |
| 13 | `batch` | 批次id | `batch` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 14 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 15 | `cancelDate` | 取消确认日期 | `cancel_date` | Date |
| 16 | `cancelStaff` | 取消确认人 | `cancel_staff` | String |
| 17 | `cancelStaffId` | 取消确认人ID | `cancel_staff_id` | String |
| 18 | `cancelTime` | 取消确认时间 | `cancel_time` | DateTime |
| 19 | `cardSourceOutProdId` | 流转卡来源单据子表ID | `card_source_out_prod_id` | 891c152d-4732-4bdb-a55e-bed04fa85597 |
| 20 | `checkDate` | 检验确认日期 | `check_date` | Date |
| 21 | `checkTime` | 检验确认时间 | `check_time` | DateTime |
| 22 | `checkUser` | 检验人 | `check_user` | String |
| 23 | `checkUserId` | 检验人ID | `check_user_id` | String |
| 24 | `code` | 编码 | `code` | String |
| 25 | `costId` | 成本中心 | `cost_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 26 | `createDate` | 创建日期 | `create_date` | Date |
| 27 | `createTime` | 创建时间 | `create_time` | DateTime |
| 28 | `creator` | 创建人名称 | `creator` | String |
| 29 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 30 | `declarant` | 申报人 | `declarant` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 31 | `define1` | 自定义项1 | `define1` | String |
| 32 | `define10` | 自定义项10 | `define10` | String |
| 33 | `define11` | 自定义项11 | `define11` | String |
| 34 | `define12` | 自定义项12 | `define12` | String |
| 35 | `define13` | 自定义项13 | `define13` | String |
| 36 | `define14` | 自定义项14 | `define14` | String |
| 37 | `define15` | 自定义项15 | `define15` | String |
| 38 | `define16` | 自定义项16 | `define16` | String |
| 39 | `define17` | 自定义项17 | `define17` | String |
| 40 | `define18` | 自定义项18 | `define18` | String |
| 41 | `define19` | 自定义项19 | `define19` | String |
| 42 | `define2` | 自定义项2 | `define2` | String |
| 43 | `define20` | 自定义项20 | `define20` | String |
| 44 | `define21` | 自定义项21 | `define21` | String |
| 45 | `define22` | 自定义项22 | `define22` | String |
| 46 | `define23` | 自定义项23 | `define23` | String |
| 47 | `define24` | 自定义项24 | `define24` | String |
| 48 | `define25` | 自定义项25 | `define25` | String |
| 49 | `define26` | 自定义项26 | `define26` | String |
| 50 | `define27` | 自定义项27 | `define27` | String |
| 51 | `define28` | 自定义项28 | `define28` | String |
| 52 | `define29` | 自定义项29 | `define29` | String |
| 53 | `define3` | 自定义项3 | `define3` | String |
| 54 | `define30` | 自定义项30 | `define30` | String |
| 55 | `define4` | 自定义项4 | `define4` | String |
| 56 | `define5` | 自定义项5 | `define5` | String |
| 57 | `define6` | 自定义项6 | `define6` | String |
| 58 | `define7` | 自定义项7 | `define7` | String |
| 59 | `define8` | 自定义项8 | `define8` | String |
| 60 | `define9` | 自定义项9 | `define9` | String |
| 61 | `deptId` | 生产部门 | `dept_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 62 | `deviceActualPrepareTime` | 设备实际准备工时 | `device_actual_prepare_time` | Decimal |
| 63 | `deviceActualProcessTime` | 设备实际加工工时 | `device_actual_process_time` | Decimal |
| 64 | `deviceId` | 设备 | `device_id` | e9f23971-1c19-49e1-83d7-3a84ebcb187e |
| 65 | `dr` | 逻辑删除标识 | `dr` | Short |
| 66 | `financeOrgId` | 会计主体组织 | `finance_org_id` | 4ec9e266-1eae-4f78-b5e3-26c220a15d70 |
| 67 | `firstCheck` | 首件检验 | `first_check` | String |
| 68 | `firstChildId` | 头单据行ID | `first_child_id` | Long |
| 69 | `firstCode` | 头单据号 | `first_code` | String |
| 70 | `firstId` | 头单据ID | `first_id` | Long |
| 71 | `firstLineno` | 头单据行号 | `first_lineno` | Decimal |
| 72 | `firstType` | 头单据类别 | `first_type` | String |
| 73 | `freeCharacteristics` | 工序任务汇报自由项特征组 | `free_characteristics` | dee04fa5-7a50-4598-8619-e1ab823f2021 |
| 74 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 75 | `id` | ID | `id` | Long |
| 76 | `inspectionStatus` | 检验状态 | `inspection_status` | Short |
| 77 | `interactiveMode` | 新老模式标识 | `interactive_mode` | Short |
| 78 | `invaliddate` | 失效日期 | `dInvalidDate` | Date |
| 79 | `isAutohandover` | 是否自动交接 | `is_autohandover` | Short |
| 80 | `isByReport` | 按任务汇报交接 | `is_by_report` | Short |
| 81 | `isFinalReport` | 末次报工 | `is_final_report` | Short |
| 82 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 83 | `isMultiDevice` | 多设备 | `is_multi_device` | Short |
| 84 | `isMultiStaff` | 多人员 | `is_multi_staff` | Short |
| 85 | `isOutsource` | 委外 | `is_outsource` | Short |
| 86 | `isReportPoint` | 是否报告点 | `is_reportpoint` | Short |
| 87 | `isScrapStorage` | 报废入库 | `is_scrap_storage` | Short |
| 88 | `isSerialNoManage` | 序列号管理 | `is_serial_no_manage` | Short |
| 89 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 90 | `joinDate` | 交接时间 | `join_date` | DateTime |
| 91 | `locationId` | 存储地点 | `location_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 92 | `mainFinishNum` | 完成数量(主计量) | `main_finish_num` | Decimal |
| 93 | `mainQualifiedNum` | 合格数量(主计量) | `main_qualified_num` | Decimal |
| 94 | `mainReworkNum` | 待返工数量(主计量) | `main_rework_num` | Decimal |
| 95 | `mainScrapNum` | 报废数量(主计量) | `main_scrap_num` | Decimal |
| 96 | `mainTotalQualifiedJoinNum` | 累计合格交接数量(主计量) | `main_total_qualified_join_num` | Decimal |
| 97 | `mainTotalReworkHandledNum` | 累计返工已处理数量(主计量) | `main_total_rework_handled_num` | Decimal |
| 98 | `mainTotalReworkJoinNum` | 累计返工交接数量(主计量) | `main_total_rework_join_num` | Decimal |
| 99 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 100 | `materialId` | 制造物料 | `material_id` | Long |
| 101 | `modifier` | 修改人名称 | `modifier` | String |
| 102 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 103 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 104 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 105 | `nextProcessId` | 后工序 | `next_process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 106 | `nextProcessNo` | 后工序 | `next_process_no` | Decimal |
| 107 | `offChartOutput` | 表外产出 | `off_chart_output` | Integer |
| 108 | `opSequenceId` | 工序序列ID | `op_sequence_id` | c89032db-c707-4a7d-84ef-bdd29d142856 |
| 109 | `opSequenceType` | 序列类型 | `op_sequence_type` | Integer |
| 110 | `orderByProductId` | 生产订单联副产品 | `order_by_product_id` | 4b08ee17-121c-4d32-9d32-e896d0d3a395 |
| 111 | `orderCode` | 生产订单编码 | `order_code` | String |
| 112 | `orderId` | 生产订单 | `order_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 113 | `orderProcessId` | 生产订单工序 | `order_process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 114 | `orderProductId` | 生产订单行号 | `order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 115 | `orgId` | 工厂 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 116 | `outConversionRate` | 产出换算率 | `out_conversion_rate` | Decimal |
| 117 | `outConversionRateDen` | 产出换算率分母 | `out_conversion_rateden` | Decimal |
| 118 | `outConversionRateNum` | 产出换算率分子 | `out_conversion_ratenum` | Decimal |
| 119 | `outExchangeType` | 产出换算方式 | `out_exchange_type` | Short |
| 120 | `outFinishNum` | 完成数量(产出) | `out_finish_num` | Decimal |
| 121 | `outProdType` | 产出类型 | `out_prod_type` | Short |
| 122 | `outQualifiedNum` | 合格数量(产出) | `out_qualified_num` | Decimal |
| 123 | `outReworkNum` | 待返工数量(产出) | `out_rework_num` | Decimal |
| 124 | `outScrapNum` | 报废数量(产出) | `out_scrap_num` | Decimal |
| 125 | `outTotalQualifiedJoinNum` | 累计合格交接数量(产出) | `out_total_qualified_join_num` | Decimal |
| 126 | `outTotalReworkHandledNum` | 累计返工已处理数量(产出) | `out_total_rework_handled_num` | Decimal |
| 127 | `outTotalReworkJoinNum` | 累计返工交接数量(产出) | `out_total_rework_join_num` | Decimal |
| 128 | `outputUnitId` | 产出单位 | `output_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 129 | `pieceWorkCollect` | 采集数据ID | `pwork_collect_id` | f514eacb-ca9c-4164-80ab-38b630c5cfe3 |
| 130 | `planPrepareTime` | 计划准备工时 | `plan_prepare_time` | Decimal |
| 131 | `planProcessTime` | 计划加工工时 | `plan_process_time` | Decimal |
| 132 | `prevProcessId` | 前工序 | `prev_process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 133 | `prevProcessNo` | 前工序 | `prev_process_no` | Decimal |
| 134 | `printCount` | 打印次数 | `printCount` | Integer |
| 135 | `proFinishNum` | 完成数量(生产) | `pro_finish_num` | Decimal |
| 136 | `proQualifiedNum` | 合格数量(生产) | `pro_qualified_num` | Decimal |
| 137 | `proReworkNum` | 待返工数量(生产) | `pro_rework_num` | Decimal |
| 138 | `proScrapNum` | 报废数量(生产) | `pro_scrap_num` | Decimal |
| 139 | `proTotalQualifiedJoinNum` | 累计合格交接数量(生产) | `pro_total_qualified_join_num` | Decimal |
| 140 | `proTotalReworkHandledNum` | 累计返工已处理数量(生产) | `pro_total_rework_handled_num` | Decimal |
| 141 | `proTotalReworkJoinNum` | 累计返工交接数量(生产) | `pro_total_rework_join_num` | Decimal |
| 142 | `procePlanId` | 工序作业计划 | `proce_plan_id` | 48e1a533-51f0-4a5a-9465-6fff30ce5229 |
| 143 | `proceTaskReportDefine` | 工序任务汇报自定义表 | `` | b222b50d-45a1-4af7-b9ca-f751cd35b3f3 |
| 144 | `proceTaskReportDetailList` | 工序任务汇报明细 | `` | 7ed5ecde-bf12-45c3-a73a-e69e184d05e8 |
| 145 | `proceTaskReportDeviceList` | 工序任务汇报设备人员 | `` | 492dd688-5a02-4492-9f1e-a1e89ab59cad |
| 146 | `proceTaskReportLineList` | 工序任务汇报信息 | `` | de66617d-1de0-4dca-8844-cfc180a45de8 |
| 147 | `proceTaskReportUserDf` | 工序任务汇报固定自定义项 | `` | 2e8d5a7b-079e-4fc8-a904-984bb6badde3 |
| 148 | `processFlowId` | 工序流转卡 | `process_flow_id` | a1d46721-c171-401e-9f07-ef70a36e2abf |
| 149 | `processFlowPlanId` | 工序流转卡工序 | `process_flow_plan_id` | e4a42545-5567-4ba7-be49-38a63843cfab |
| 150 | `processType` | 加工类型 | `process_type` | Short |
| 151 | `prodConversionRate` | 生产换算率 | `prod_conversion_rate` | Decimal |
| 152 | `prodConversionRateDen` | 生产换算率分母 | `prod_conversion_rateden` | Decimal |
| 153 | `prodConversionRateNum` | 生产换算率分子 | `prod_conversion_ratenum` | Decimal |
| 154 | `prodUnitId` | 生产单位 | `prod_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 155 | `producedate` | 生产日期 | `dProduceDate` | Date |
| 156 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 157 | `productCode` | 物料编码 | `product_code` | String |
| 158 | `productId` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 159 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 160 | `pubts` | 时间戳 | `pubts` | DateTime |
| 161 | `qualityCheckPoint` | 质检方式 | `quality_check_point` | Short |
| 162 | `remark` | 备注 | `remark` | String |
| 163 | `returncount` | 退回次数 | `returncount` | Short |
| 164 | `scheduleEndTime` | 计划完工时间 | `schedule_end_time` | DateTime |
| 165 | `scheduleStartTime` | 计划开工时间 | `schedule_start_time` | DateTime |
| 166 | `selfDefineCharacter` | 工序任务汇报自定义项 | `self_define_character` | 4e7a2c02-2dd7-48c7-80f7-8cd739ba761f |
| 167 | `shiftId` | 班次 | `shift_id` | 566d5ab9-aeca-4f63-a0d1-1b98a161c6bc |
| 168 | `skuId` | SKU | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 169 | `source` | 上游单据类型 | `source` | String |
| 170 | `sourceBizClueCode` | 来源业务线索单号 | `source_biz_clue_code` | String |
| 171 | `sourceBizClueId` | 来源业务线索主表id | `source_biz_clue_id` | Long |
| 172 | `sourceBizClueType` | 来源业务线索类型 | `source_biz_clue_type` | String |
| 173 | `sourceLineno` | 来源单据行号 | `source_lineno` | Decimal |
| 174 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 175 | `sourceOutProdId` | 来源单据子表ID | `source_out_prod_id` | f5a3555f-1369-4972-9600-12fc6fc4a7e9 |
| 176 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 177 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 178 | `srcOutDocTypeId` | 来源外协单据 | `src_out_doc_type_id` | String |
| 179 | `staffActualPrepareTime` | 人员实际准备工时 | `staff_actual_prepare_time` | Decimal |
| 180 | `staffActualProcessTime` | 人员实际加工工时 | `staff_actual_process_time` | Decimal |
| 181 | `standardProcessCode` | 标准工序编号 | `standard_process_code` | String |
| 182 | `standardProcessId` | 标准工序 | `standard_process_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 183 | `status` | 单据状态 | `status` | Short |
| 184 | `stockStatus` | 入库状态 | `stock_status` | Short |
| 185 | `storageId` | 库位 | `storage_id` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc |
| 186 | `storeOrgId` | 库存工厂 | `store_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 187 | `supplyVirtualAccbodyId` | 供方利润中心 | `supply_virtual_accbody_id` | e33ec72a-3857-4167-89e2-a437168ed3bb |
| 188 | `teamId` | 班组 | `team_id` | d1ce258a-6311-4719-846d-998458841d05 |
| 189 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 190 | `timeUnit` | 工时单位 | `time_unit` | Short |
| 191 | `totalCheckNum` | 累计检验数量 | `total_check_num` | Decimal |
| 192 | `totalRequestNum` | 累计请检数量 | `total_request_num` | Decimal |
| 193 | `totalScrapJoinNum` | 累计报废交接数量(主计量) | `total_scrap_join_num` | Decimal |
| 194 | `totalScrapJoinNum1` | 累计报废交接数量(生产) | `total_scrap_join_num1` | Decimal |
| 195 | `totalScrapJoinNum2` | 累计报废交接数量(产出) | `total_scrap_join_num2` | Decimal |
| 196 | `totalSfcReworkNum` | 累计车间返工数量 | `total_sfc_rework_num` | Decimal |
| 197 | `totalSfcScrapNum` | 累计车间报废数量 | `total_sfc_scrap_num` | Decimal |
| 198 | `totalTurnNum` | 累计转出数量 | `total_turn_num` | Decimal |
| 199 | `totalTurnNum1` | 累计转出数量(生产) | `total_turn_num1` | Decimal |
| 200 | `totalTurnNum2` | 累计转出数量(产出) | `total_turn_num2` | Decimal |
| 201 | `tplid` | 模板id | `tplid` | Long |
| 202 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 203 | `transferDate` | 转移时间 | `transfer_date` | DateTime |
| 204 | `transferTaskId` | 转入工序 | `transfer_task_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 205 | `unauditDate` | 弃审日期 | `unaudit_date` | Date |
| 206 | `unauditStaff` | 弃审人 | `unaudit_staff` | String |
| 207 | `unauditStaffId` | 弃审人ID | `unaudit_staff_id` | String |
| 208 | `unauditTime` | 弃审时间 | `unaudit_time` | DateTime |
| 209 | `unitExchangeType` | 换算方式 | `unit_exchange_type` | Short |
| 210 | `unitId` | 主计量单位 | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 211 | `upcode` | 来源单据号 | `upcode` | String |
| 212 | `userId` | 人员 | `user_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 213 | `vendorId` | 供应商 | `vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 214 | `verifystate` | 审批状态 | `verifystate` | Short |
| 215 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 216 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 217 | `workcenterId` | 工作中心 | `workcenter_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 218 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（57个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `pieceWorkCollect` | 采集数据ID | `sfc.pieceworkcollect.PieceworkCollect` | None |  |
| 2 | `orderId` | 生产订单 | `po.order.Order` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `costId` | 成本中心 | `bd.costcenter.CostCenter` | Service |  |
| 5 | `vendorId` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 6 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 7 | `proceTaskReportDetailList` | 工序任务汇报明细 | `sfc.proceTaskReport.ProceTaskReportDetail` | None | true |
| 8 | `deviceId` | 设备 | `aim.equip.EquipHeadVO` | Service |  |
| 9 | `prodUnitId` | 生产单位 | `pc.unit.Unit` | Service |  |
| 10 | `processFlowId` | 工序流转卡 | `sfc.processFlowCard.processFlowCard` | None |  |
| 11 | `transTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 12 | `sourceOutProdId` | 来源单据子表ID | `sfc.procPlan.ProcPlanOutput` | None |  |
| 13 | `skuId` | SKU | `pc.product.ProductSKU` | Service |  |
| 14 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 15 | `financeOrgId` | 会计主体组织 | `aa.baseorg.FinanceOrgMV` | Service |  |
| 16 | `proceTaskReportDefine` | 工序任务汇报自定义表 | `sfc.proceTaskReport.proceTaskReportDefine` | None | true |
| 17 | `standardProcessId` | 标准工序 | `ed.operation.Operation` | Service |  |
| 18 | `productId` | 物料ID | `pc.product.Product` | Service |  |
| 19 | `transferTaskId` | 转入工序 | `po.order.OrderProcess` | Service |  |
| 20 | `batch` | 批次id | `st.batchno.Batchno` | Service |  |
| 21 | `deptId` | 生产部门 | `aa.baseorg.DeptMV` | Service |  |
| 22 | `procePlanId` | 工序作业计划 | `sfc.procPlan.ProcPlan` | None |  |
| 23 | `orderProductId` | 生产订单行号 | `po.order.OrderProduct` | Service |  |
| 24 | `ProceTaskReportExt` | 工序任务汇报平行表 | `sfc.proceTaskReport.ProceTaskReportExt` | None | true |
| 25 | `storeOrgId` | 库存工厂 | `org.func.BaseOrg` | Service |  |
| 26 | `proceTaskReportDeviceList` | 工序任务汇报设备人员 | `sfc.proceTaskReport.ProceTaskReportDevice` | None | true |
| 27 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 28 | `orderProcessId` | 生产订单工序 | `po.order.OrderProcess` | Service |  |
| 29 | `nextProcessId` | 后工序 | `po.order.OrderProcess` | Service |  |
| 30 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 31 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
| 32 | `supplyVirtualAccbodyId` | 供方利润中心 | `bd.virtualaccbody.VirtualAccbody` | Service |  |
| 33 | `prevProcessId` | 前工序 | `po.order.OrderProcess` | Service |  |
| 34 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 35 | `proceTaskReportLineList` | 工序任务汇报信息 | `sfc.proceTaskReport.proceTaskReportLine` | None | true |
| 36 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 37 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 38 | `orgId` | 工厂 | `org.func.BaseOrg` | Service |  |
| 39 | `locationId` | 存储地点 | `aa.warehouse.Warehouse` | Service |  |
| 40 | `unitId` | 主计量单位 | `pc.unit.Unit` | Service |  |
| 41 | `workcenterId` | 工作中心 | `ed.workcenter.WorkCenter` | Service |  |
| 42 | `ProceTaskReportStaffList` | 工序任务汇报人员 | `sfc.proceTaskReport.ProceTaskReportStaff` | None | true |
| 43 | `proceTaskReportUserDf` | 工序任务汇报固定自定义项 | `sfc.proceTaskReport.proceTaskReportUserDf` | None | true |
| 44 | `declarant` | 申报人 | `bd.staff.Staff` | Service |  |
| 45 | `storageId` | 库位 | `aa.goodsposition.GoodsPosition` | Service |  |
| 46 | `shiftId` | 班次 | `calendar.platformShift.PlatformShift` | Service |  |
| 47 | `ProceTaskReportDeviceDetailList` | 工序任务汇报设备 | `sfc.proceTaskReport.ProceTaskReportDeviceDetail` | None | true |
| 48 | `selfDefineCharacter` | 工序任务汇报自定义项 | `sfc.proceTaskReport.ProcTaskReportSelfDefineCharacter` | None |  |
| 49 | `opSequenceId` | 工序序列ID | `po.order.OrderOpSequence` | Service |  |
| 50 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 51 | `processFlowPlanId` | 工序流转卡工序 | `sfc.processFlowCard.processFlowCardPlan` | None |  |
| 52 | `outputUnitId` | 产出单位 | `pc.unit.Unit` | Service |  |
| 53 | `cardSourceOutProdId` | 流转卡来源单据子表ID | `sfc.processFlowCard.processFlowCardPlanOutput` | None |  |
| 54 | `userId` | 人员 | `bd.staff.Staff` | Service |  |
| 55 | `freeCharacteristics` | 工序任务汇报自由项特征组 | `sfc.proceTaskReport.ProcTaskReportFreeCharacter` | None |  |
| 56 | `orderByProductId` | 生产订单联副产品 | `po.order.OrderByProduct` | Service |  |
| 57 | `teamId` | 班组 | `bd.timemodel.TeamDefinition` | Service |  |
