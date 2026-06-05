---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.proceTaskReport.proceTaskReportLine"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工序任务汇报信息 (`sfc.proceTaskReport.proceTaskReportLine`)

> IMPSFC | 物理表：`imp_sfc_procetaskrep_line`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工序任务汇报信息 |
| 物理表 | `imp_sfc_procetaskrep_line` |
| 数据库 schema | `IMP-SFC` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:24:32.4840` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（143个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 2 | `actualEndTime` | 实际结束时间 | `actual_end_time` | DateTime |
| 3 | `actualStartTime` | 实际开始时间 | `actual_start_time` | DateTime |
| 4 | `cancelDate` | 取消确认日期 | `cancel_date` | Date |
| 5 | `cancelStaff` | 取消确认人 | `cancel_staff` | String |
| 6 | `cancelStaffId` | 取消确认人ID | `cancel_staff_id` | String |
| 7 | `cancelTime` | 取消确认时间 | `cancel_time` | DateTime |
| 8 | `cardSourceOutProdId` | 流转卡产出ID | `card_source_out_prod_id` | 891c152d-4732-4bdb-a55e-bed04fa85597 |
| 9 | `checkDate` | 检验确认日期 | `check_date` | Date |
| 10 | `checkTime` | 检验确认时间 | `check_time` | DateTime |
| 11 | `checkUser` | 检验人 | `check_user` | String |
| 12 | `checkUserId` | 检验人ID | `check_user_id` | String |
| 13 | `costId` | 成本中心 | `cost_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 14 | `deptId` | 生产部门 | `dept_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 15 | `deviceActualPrepareTime` | 设备实际准备工时 | `device_actual_prepare_time` | Decimal |
| 16 | `deviceActualProcessTime` | 设备实际加工工时 | `device_actual_process_time` | Decimal |
| 17 | `dr` | 逻辑删除标记 | `dr` | Short |
| 18 | `financeOrgId` | 会计主体组织 | `finance_org_id` | 4ec9e266-1eae-4f78-b5e3-26c220a15d70 |
| 19 | `firstCheck` | 首件检验 | `first_check` | String |
| 20 | `firstChildId` | 源头单据行ID | `first_child_id` | Long |
| 21 | `firstCode` | 源头单据号 | `first_code` | String |
| 22 | `firstId` | 源头单据ID | `first_id` | Long |
| 23 | `firstLineno` | 源头单据行号 | `first_lineno` | Decimal |
| 24 | `firstType` | 源头单据类别 | `first_type` | String |
| 25 | `freeCharacteristics` | 工序任务汇报信息自由项特征组 | `free_characteristics` | 5f68783a-d075-4e38-9cbf-e4024a460482 |
| 26 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 27 | `id` | ID | `id` | Long |
| 28 | `inspectionStatus` | 检验状态 | `inspection_status` | Short |
| 29 | `isAutohandover` | 是否自动交接 | `is_autohandover` | Short |
| 30 | `isFinalReport` | 末次报工 | `is_final_report` | Short |
| 31 | `isOutsource` | 委外 | `is_outsource` | Short |
| 32 | `isReportPoint` | 是否报告点 | `is_reportpoint` | Short |
| 33 | `isScrapStorage` | 报废入库 | `is_scrap_storage` | Short |
| 34 | `isSerialNoManage` | 序列号管理 | `is_serial_no_manage` | Short |
| 35 | `joinDate` | 交接时间 | `join_date` | DateTime |
| 36 | `lineno` | 行号 | `lineno` | Decimal |
| 37 | `locationId` | 仓库 | `location_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 38 | `mainFinishNum` | 完成数量(主计量) | `main_finish_num` | Decimal |
| 39 | `mainQualifiedNum` | 合格数量(主计量) | `main_qualified_num` | Decimal |
| 40 | `mainReworkNum` | 待返工数量(主计量) | `main_rework_num` | Decimal |
| 41 | `mainScrapNum` | 报废数量(主计量) | `main_scrap_num` | Decimal |
| 42 | `mainTotalQualifiedJoinNum` | 累计合格交接数量(主计量) | `main_total_qualified_join_num` | Decimal |
| 43 | `mainTotalReworkHandledNum` | 累计返工已处理数量(主计量) | `main_total_rework_handled_num` | Decimal |
| 44 | `mainTotalReworkJoinNum` | 累计返工交接数量(主计量) | `main_total_rework_join_num` | Decimal |
| 45 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 46 | `nextProcessId` | 后工序 | `next_process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 47 | `nextProcessNo` | 后工序 | `next_process_no` | Decimal |
| 48 | `offChartOutput` | 表外产出 | `off_chart_output` | Integer |
| 49 | `opSequenceId` | 工序序列ID | `op_sequence_id` | c89032db-c707-4a7d-84ef-bdd29d142856 |
| 50 | `opSequenceType` | 序列类型 | `op_sequence_type` | Integer |
| 51 | `orderByProductId` | 生产订单联副产品 | `order_by_product_id` | 4b08ee17-121c-4d32-9d32-e896d0d3a395 |
| 52 | `orderCode` | 生产订单编码 | `order_code` | String |
| 53 | `orderId` | 生产订单 | `order_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 54 | `orderProcessId` | 生产订单工序 | `order_process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 55 | `orderProductId` | 生产订单行号 | `order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 56 | `outConversionRate` | 产出换算率 | `out_conversion_rate` | Decimal |
| 57 | `outConversionRateDen` | 产出换算率分母 | `out_conversion_rateden` | Decimal |
| 58 | `outConversionRateNum` | 产出换算率分子 | `out_conversion_ratenum` | Decimal |
| 59 | `outExchangeType` | 产出换算方式 | `out_exchange_type` | Short |
| 60 | `outFinishNum` | 完成数量(产出) | `out_finish_num` | Decimal |
| 61 | `outProdType` | 产出类型 | `out_prod_type` | Short |
| 62 | `outQualifiedNum` | 合格数量(产出) | `out_qualified_num` | Decimal |
| 63 | `outReworkNum` | 待返工数量(产出) | `out_rework_num` | Decimal |
| 64 | `outScrapNum` | 报废数量(产出) | `out_scrap_num` | Decimal |
| 65 | `outTotalQualifiedJoinNum` | 累计合格交接数量(产出) | `out_total_qualified_join_num` | Decimal |
| 66 | `outTotalReworkHandledNum` | 累计返工已处理数量(产出) | `out_total_rework_handled_num` | Decimal |
| 67 | `outTotalReworkJoinNum` | 累计返工交接数量(产出) | `out_total_rework_join_num` | Decimal |
| 68 | `outputUnitId` | 产出单位 | `output_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 69 | `pieceWorkCollect` | 采集数据ID | `pwork_collect_id` | f514eacb-ca9c-4164-80ab-38b630c5cfe3 |
| 70 | `planPrepareTime` | 计划准备工时 | `plan_prepare_time` | Decimal |
| 71 | `planProcessTime` | 计划加工工时 | `plan_process_time` | Decimal |
| 72 | `prevProcessId` | 前工序 | `prev_process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 73 | `prevProcessNo` | 前工序 | `prev_process_no` | Decimal |
| 74 | `proFinishNum` | 完成数量(生产) | `pro_finish_num` | Decimal |
| 75 | `proQualifiedNum` | 合格数量(生产) | `pro_qualified_num` | Decimal |
| 76 | `proReworkNum` | 待返工数量(生产) | `pro_rework_num` | Decimal |
| 77 | `proScrapNum` | 报废数量(生产) | `pro_scrap_num` | Decimal |
| 78 | `proTotalQualifiedJoinNum` | 累计合格交接数量(生产) | `pro_total_qualified_join_num` | Decimal |
| 79 | `proTotalReworkHandledNum` | 累计返工已处理数量(生产) | `pro_total_rework_handled_num` | Decimal |
| 80 | `proTotalReworkJoinNum` | 累计返工交接数量(生产) | `pro_total_rework_join_num` | Decimal |
| 81 | `procePlanDetailId` | 工序作业计划明细 | `proce_plan_detail_id` | 7e33a4bf-edce-447c-8e6f-0717cec2b092 |
| 82 | `procePlanId` | 工序作业计划 | `proce_plan_id` | 48e1a533-51f0-4a5a-9465-6fff30ce5229 |
| 83 | `proceTaskId` | 工序任务汇报ID | `proce_task_id` | 5b6b44a2-42c1-49e8-9351-f34ff6838c71 |
| 84 | `proceTaskReportLineDetailList` | 汇报信息明细 | `` | e06c9574-cfd7-4a0d-870f-946867a33521 |
| 85 | `proceTaskReportLineDeviceList` | 汇报信息设备明细 | `` | 240ebe9b-cf85-4c5e-9cfe-a110e99caf10 |
| 86 | `proceTaskReportLineExt` | 工序任务汇报平行表 | `` | a7d97206-d052-49a8-806c-c903b2cfbbd9 |
| 87 | `proceTaskReportLineSnList` | 汇报信息序列号明细 | `` | 310459b3-ac07-41a0-b71a-3ac24a2c5f5a |
| 88 | `processFlowId` | 工序流转卡 | `process_flow_id` | a1d46721-c171-401e-9f07-ef70a36e2abf |
| 89 | `processFlowPlanId` | 工序流转卡工序 | `process_flow_plan_id` | e4a42545-5567-4ba7-be49-38a63843cfab |
| 90 | `processType` | 加工类型 | `process_type` | Short |
| 91 | `prodConversionRate` | 生产换算率 | `prod_conversion_rate` | Decimal |
| 92 | `prodConversionRateDen` | 生产换算率分母 | `prod_conversion_rateden` | Decimal |
| 93 | `prodConversionRateNum` | 生产换算率分子 | `prod_conversion_ratenum` | Decimal |
| 94 | `prodUnitId` | 生产单位 | `prod_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 95 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 96 | `productCode` | 物料编码 | `product_code` | String |
| 97 | `productId` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 98 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 99 | `pubts` | 时间戳 | `pubts` | DateTime |
| 100 | `qualityCheckPoint` | 质检方式 | `quality_check_point` | Short |
| 101 | `rowno` | 序号 | `rowno` | Integer |
| 102 | `scheduleEndTime` | 计划完工时间 | `schedule_end_time` | DateTime |
| 103 | `scheduleStartTime` | 计划开工时间 | `schedule_start_time` | DateTime |
| 104 | `selfDefineCharacter` | 工序任务汇报信息自定义项 | `self_define_character` | 9304149f-f0a7-4615-8dd6-bf7243d874b9 |
| 105 | `shiftId` | 班次 | `shift_id` | 566d5ab9-aeca-4f63-a0d1-1b98a161c6bc |
| 106 | `sn` | 工序顺序号 | `sn` | Decimal |
| 107 | `source` | 上游单据类型 | `source` | String |
| 108 | `sourceBizClueCode` | 来源业务线索单号 | `source_biz_clue_code` | String |
| 109 | `sourceBizClueId` | 来源业务线索主表id | `source_biz_clue_id` | Long |
| 110 | `sourceBizClueType` | 来源业务线索类型 | `source_biz_clue_type` | String |
| 111 | `sourceLineno` | 来源单据行号 | `source_lineno` | Decimal |
| 112 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 113 | `sourceOutProdId` | 作业计划产出ID | `source_out_prod_id` | f5a3555f-1369-4972-9600-12fc6fc4a7e9 |
| 114 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 115 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 116 | `staffActualPrepareTime` | 人员实际准备工时 | `staff_actual_prepare_time` | Decimal |
| 117 | `staffActualProcessTime` | 人员实际加工工时 | `staff_actual_process_time` | Decimal |
| 118 | `standardProcessCode` | 标准工序编号 | `standard_process_code` | String |
| 119 | `standardProcessId` | 标准工序 | `standard_process_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 120 | `stockStatus` | 入库状态 | `stock_status` | Short |
| 121 | `storageId` | 货位 | `storage_id` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc |
| 122 | `storeOrgId` | 库存工厂 | `store_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 123 | `supplyVirtualAccbodyId` | 供方利润中心 | `supply_virtual_accbody_id` | e33ec72a-3857-4167-89e2-a437168ed3bb |
| 124 | `teamId` | 班组 | `team_id` | d1ce258a-6311-4719-846d-998458841d05 |
| 125 | `timeUnit` | 工时单位 | `time_unit` | Short |
| 126 | `totalCheckNum` | 累计检验数量 | `total_check_num` | Decimal |
| 127 | `totalRequestNum` | 累计请检数量 | `total_request_num` | Decimal |
| 128 | `totalScrapJoinNum` | 累计报废交接数量(主计量) | `total_scrap_join_num` | Decimal |
| 129 | `totalScrapJoinNum1` | 累计报废交接数量(生产) | `total_scrap_join_num1` | Decimal |
| 130 | `totalScrapJoinNum2` | 累计报废交接数量(产出) | `total_scrap_join_num2` | Decimal |
| 131 | `totalSfcReworkNum` | 累计车间返工数量 | `total_sfc_rework_num` | Decimal |
| 132 | `totalSfcScrapNum` | 累计车间报废数量 | `total_sfc_scrap_num` | Decimal |
| 133 | `totalTurnNum` | 累计转出数量 | `total_turn_num` | Decimal |
| 134 | `totalTurnNum1` | 累计转出数量(生产) | `total_turn_num1` | Decimal |
| 135 | `totalTurnNum2` | 累计转出数量(产出) | `total_turn_num2` | Decimal |
| 136 | `transferDate` | 转移时间 | `transfer_date` | DateTime |
| 137 | `unitExchangeType` | 生产换算方式 | `unit_exchange_type` | Short |
| 138 | `unitId` | 主计量单位 | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 139 | `upcode` | 上游单据号 | `upcode` | String |
| 140 | `vendorId` | 委外商 | `vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 141 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 142 | `workcenterId` | 工作中心 | `workcenter_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 143 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（42个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplyVirtualAccbodyId` | 供方利润中心 | `bd.virtualaccbody.VirtualAccbody` | Service |  |
| 2 | `pieceWorkCollect` | 采集数据ID | `sfc.pieceworkcollect.PieceworkCollect` | None |  |
| 3 | `prevProcessId` | 前工序 | `po.order.OrderProcess` | Service |  |
| 4 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 5 | `orderId` | 生产订单 | `po.order.Order` | Service |  |
| 6 | `costId` | 成本中心 | `bd.costcenter.CostCenter` | Service |  |
| 7 | `vendorId` | 委外商 | `aa.vendor.Vendor` | Service |  |
| 8 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 9 | `prodUnitId` | 生产单位 | `pc.unit.Unit` | Service |  |
| 10 | `processFlowId` | 工序流转卡 | `sfc.processFlowCard.processFlowCard` | None |  |
| 11 | `proceTaskId` | 工序任务汇报ID | `sfc.proceTaskReport.proceTaskReport` | None | true |
| 12 | `proceTaskReportLineDeviceList` | 汇报信息设备明细 | `sfc.proceTaskReport.proceTaskReportLineDevice` | None | true |
| 13 | `locationId` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 14 | `sourceOutProdId` | 作业计划产出ID | `sfc.procPlan.ProcPlanOutput` | None |  |
| 15 | `unitId` | 主计量单位 | `pc.unit.Unit` | Service |  |
| 16 | `proceTaskReportLineExt` | 工序任务汇报平行表 | `sfc.proceTaskReport.proceTaskReportLineExt` | None | true |
| 17 | `workcenterId` | 工作中心 | `ed.workcenter.WorkCenter` | Service |  |
| 18 | `storageId` | 货位 | `aa.goodsposition.GoodsPosition` | Service |  |
| 19 | `financeOrgId` | 会计主体组织 | `aa.baseorg.FinanceOrgMV` | Service |  |
| 20 | `shiftId` | 班次 | `calendar.platformShift.PlatformShift` | Service |  |
| 21 | `standardProcessId` | 标准工序 | `ed.operation.Operation` | Service |  |
| 22 | `productId` | 物料ID | `pc.product.Product` | Service |  |
| 23 | `selfDefineCharacter` | 工序任务汇报信息自定义项 | `sfc.proceTaskReport.ProcTaskReportLineSelfDefineCharacter` | None |  |
| 24 | `opSequenceId` | 工序序列ID | `po.order.OrderOpSequence` | Service |  |
| 25 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 26 | `deptId` | 生产部门 | `aa.baseorg.DeptMV` | Service |  |
| 27 | `procePlanId` | 工序作业计划 | `sfc.procPlan.ProcPlan` | None |  |
| 28 | `processFlowPlanId` | 工序流转卡工序 | `sfc.processFlowCard.processFlowCardPlan` | None |  |
| 29 | `proceTaskReportLineSnList` | 汇报信息序列号明细 | `sfc.proceTaskReport.proceTaskReportLineSn` | None | true |
| 30 | `orderProductId` | 生产订单行号 | `po.order.OrderProduct` | Service |  |
| 31 | `outputUnitId` | 产出单位 | `pc.unit.Unit` | Service |  |
| 32 | `cardSourceOutProdId` | 流转卡产出ID | `sfc.processFlowCard.processFlowCardPlanOutput` | None |  |
| 33 | `storeOrgId` | 库存工厂 | `org.func.BaseOrg` | Service |  |
| 34 | `freeCharacteristics` | 工序任务汇报信息自由项特征组 | `sfc.proceTaskReport.ProcTaskReportLineFreeCharacter` | None |  |
| 35 | `orderByProductId` | 生产订单联副产品 | `po.order.OrderByProduct` | Service |  |
| 36 | `orderProcessId` | 生产订单工序 | `po.order.OrderProcess` | Service |  |
| 37 | `teamId` | 班组 | `bd.timemodel.TeamDefinition` | Service |  |
| 38 | `nextProcessId` | 后工序 | `po.order.OrderProcess` | Service |  |
| 39 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 40 | `proceTaskReportLineDetailList` | 汇报信息明细 | `sfc.proceTaskReport.proceTaskReportLineDetail` | None | true |
| 41 | `procePlanDetailId` | 工序作业计划明细 | `sfc.procPlan.ProcPlanDetail` | None |  |
| 42 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
