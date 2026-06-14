---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.procPlan.ProcPlanOutput"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工序作业计划产出 (`sfc.procPlan.ProcPlanOutput`)

> IMPSFC | 物理表：`imp_sfc_proc_plan_output`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工序作业计划产出 |
| 物理表 | `imp_sfc_proc_plan_output` |
| domain/服务域 | `IMP-SFC` |
| schema | `production_order` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:24:16.9500` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（125个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `lineno` | 行号 | `lineno` | Decimal |
| 2 | `outChangeRate` | 产出换算率 | `out_change_rate` | Decimal |
| 3 | `outExchangeType` | 换算方式 | `out_exchange_type` | Short |
| 4 | `outQuantity` | 计划产出数量(产出) | `out_quantity` | Decimal |
| 5 | `outUnitId` | 产出单位 | `out_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 6 | `qualifiedInNum` | 合格在制入库数量 | `qualified_in_num` | Decimal |
| 7 | `qualifiedInNum1` | 合格在制入库件数 | `qualified_in_num1` | Decimal |
| 8 | `qualifiedInNum2` | 合格在制入库数量(产出) | `qualified_in_num2` | Decimal |
| 9 | `scrapInNum` | 累计报废转出数量 | `scrap_in_num` | Decimal |
| 10 | `breakUpTransferInQty` | 分割转入数量 | `break_up_transfer_in_qty` | Decimal |
| 11 | `sourceGrandchildrenId` | 上游单据孙表id | `source_grandchildrenId` | Long |
| 12 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 13 | `procPlanDetailId` | 工序作业计划明细 | `proc_plan_detail_id` | 7e33a4bf-edce-447c-8e6f-0717cec2b092 |
| 14 | `offChartOutput` | 表外产出 | `off_chart_output` | Integer |
| 15 | `inspectionStatus` | 检验状态 | `inspection_status` | Short |
| 16 | `stockStatus` | 入库状态 | `stock_status` | Short |
| 17 | `totalCheckNum` | 累计检验数量 | `total_check_num` | Decimal |
| 18 | `scrapStockQuantity` | 报废入库数量 | `scrap_stock_quantity` | Decimal |
| 19 | `scrapStockAuxiliaryQuantity` | 报废入库件数 | `scrap_stock_auxiliary_quantity` | Decimal |
| 20 | `scrapStockOutQuantity` | 报废入库数量(产出) | `scrap_stock_out_quantity` | Decimal |
| 21 | `scrapNoStockQty` | 报废不入库数量 | `scrap_no_stock_qty` | Decimal |
| 22 | `scrapNoStockAuxQty` | 报废不入库件数 | `scrap_no_stock_aux_qty` | Decimal |
| 23 | `scrapNoStockOutQty` | 报废不入库数量(产出) | `scrap_no_stock_out_qty` | Decimal |
| 24 | `qualifiedStockQuantity` | 合格入库数量 | `qualified_stock_quantity` | Decimal |
| 25 | `qualifiedStockAuxiliaryQuantity` | 合格入库件数 | `qualified_stock_auxiliary_qua` | Decimal |
| 26 | `qualifiedStockOutQuantity` | 合格入库数量(产出) | `qualified_stock_out_quantity` | Decimal |
| 27 | `changeRateDen` | 生产换算率分母 | `change_rateden` | Decimal |
| 28 | `changeRateNum` | 生产换算率分子 | `change_ratenum` | Decimal |
| 29 | `outChangeRateDen` | 产出换算率分母 | `out_change_rateden` | Decimal |
| 30 | `outChangeRateNum` | 产出换算率分子 | `out_change_ratenum` | Decimal |
| 31 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 32 | `source` | 上游单据类型 | `source` | String |
| 33 | `upcode` | 上游单据号 | `upcode` | String |
| 34 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 35 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 36 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 37 | `breakUpTransferOutQty` | 分割转出数量 | `break_up_transfer_out_qty` | Decimal |
| 38 | `breakUpTransferInQty1` | 分割转入件数 | `break_up_transfer_in_qty1` | Decimal |
| 39 | `breakUpTransferOutQty2` | 分割转出数量(产出) | `break_up_transfer_out_qty2` | Decimal |
| 40 | `breakUpTransferInQty2` | 分割转入数量(产出) | `break_up_transfer_in_qty2` | Decimal |
| 41 | `breakUpTransferOutQty1` | 分割转出件数 | `break_up_transfer_out_qty1` | Decimal |
| 42 | `freeCharacteristicsOutput` | 工序作业计划产出自由项特征组 | `free_characteristics` | 6cb46c34-1ad8-41c5-9b3d-e2c08d5087f1 |
| 43 | `scrapInNum1` | 累计报废转出件数 | `scrap_in_num1` | Decimal |
| 44 | `scrapInNum2` | 累计报废转出数量(产出) | `scrap_in_num2` | Decimal |
| 45 | `skuId` | SKU | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 46 | `totalCompleteNum2` | 累计完成数量(产出) | `total_complete_num2` | Decimal |
| 47 | `totalExecNum` | 累计执行数量 | `total_exec_num` | Decimal |
| 48 | `totalExecNum1` | 累计执行件数 | `total_exec_num1` | Decimal |
| 49 | `totalExecNum2` | 累计执行数量(产出) | `total_exec_num2` | Decimal |
| 50 | `totalQualifiedNum2` | 累计合格数量(产出) | `total_qualified_num2` | Decimal |
| 51 | `totalQualifiedTurnNum` | 累计合格转出数量 | `total_qualified_turn_num` | Decimal |
| 52 | `totalQualifiedTurnNum1` | 累计合格转出件数 | `total_qualified_turn_num1` | Decimal |
| 53 | `totalQualifiedTurnNum2` | 累计合格转出数量(产出) | `total_qualified_turn_num2` | Decimal |
| 54 | `totalReturnNum` | 累计退回数量 | `total_return_num` | Decimal |
| 55 | `totalReturnNum1` | 累计退回件数 | `total_return_num1` | Decimal |
| 56 | `totalReturnNum2` | 累计退回数量(产出) | `total_return_num2` | Decimal |
| 57 | `totalReworkNum2` | 累计待返工数量(产出) | `total_rework_num2` | Decimal |
| 58 | `totalReworkProcessNum` | 累计返工处理数量 | `total_rework_process_num` | Decimal |
| 59 | `totalReworkProcessNum1` | 累计返工处理件数 | `total_rework_process_num1` | Decimal |
| 60 | `totalReworkProcessNum2` | 累计返工处理数量(产出) | `total_rework_process_num2` | Decimal |
| 61 | `totalReworkTurnNum` | 累计返工转出数量 | `total_rework_turn_num` | Decimal |
| 62 | `totalReworkTurnNum1` | 累计返工转出件数 | `total_rework_turn_num1` | Decimal |
| 63 | `totalReworkTurnNum2` | 累计返工转出数量(产出) | `total_rework_turn_num2` | Decimal |
| 64 | `totalScrapNum2` | 累计报废数量(产出) | `total_scrap_num2` | Decimal |
| 65 | `totalTurnNum` | 累计转出数量 | `total_turn_num` | Decimal |
| 66 | `totalTurnNum1` | 累计转出件数 | `total_turn_num1` | Decimal |
| 67 | `totalTurnNum2` | 累计转出数量(产出) | `total_turn_num2` | Decimal |
| 68 | `totalTurninNum` | 累计转入数量 | `total_turnin_num` | Decimal |
| 69 | `totalTurninNum1` | 累计转入件数 | `total_turnin_num1` | Decimal |
| 70 | `totalTurninNum2` | 累计转入数量(产出) | `total_turnin_num2` | Decimal |
| 71 | `totalTurnoutBackNum` | 累计外发收回数量 | `total_turnout_back_num` | Decimal |
| 72 | `totalTurnoutBackNum1` | 累计外发收回件数 | `total_turnout_back_num1` | Decimal |
| 73 | `totalTurnoutBackNum2` | 累计外发收回数量(产出) | `total_turnout_back_num2` | Decimal |
| 74 | `totalTurnoutDispatchNum` | 累计外协分派数量 | `total_turnout_dispatch_num` | Decimal |
| 75 | `totalTurnoutDispatchNum1` | 累计外协分派件数 | `total_turnout_dispatch_num1` | Decimal |
| 76 | `totalTurnoutDispatchNum2` | 累计外协分派数量(产出) | `total_turnout_dispatch_num2` | Decimal |
| 77 | `totalTurnoutNum` | 累计转外发数量 | `total_turnout_num` | Decimal |
| 78 | `totalTurnoutNum1` | 累计转外发件数 | `total_turnout_num1` | Decimal |
| 79 | `totalTurnoutNum2` | 累计转外发数量(产出) | `total_turnout_num2` | Decimal |
| 80 | `totalTurnoutQualifiedNum` | 累计外协合格数量 | `total_turnout_qualified_num` | Decimal |
| 81 | `totalTurnoutQualifiedNum1` | 累计外协合格件数 | `total_turnout_qualified_num1` | Decimal |
| 82 | `totalTurnoutQualifiedNum2` | 累计外协合格数量(产出) | `total_turnout_qualified_num2` | Decimal |
| 83 | `totalTurnoutReturnNum` | 累计外协转自返数量 | `total_turnout_return_num` | Decimal |
| 84 | `totalTurnoutReturnNum1` | 累计外协转自返件数 | `total_turnout_return_num1` | Decimal |
| 85 | `totalTurnoutReturnNum2` | 累计外协转自返数量(产出) | `total_turnout_return_num2` | Decimal |
| 86 | `totalTurnoutReworkNum` | 累计外协待返工数量 | `total_turnout_rework_num` | Decimal |
| 87 | `totalTurnoutReworkNum1` | 累计外协待返工件数 | `total_turnout_rework_num1` | Decimal |
| 88 | `totalTurnoutReworkNum2` | 累计外协待返工数量(产出) | `total_turnout_rework_num2` | Decimal |
| 89 | `totalTurnoutScrapNum` | 累计外协报废数量 | `total_turnout_scrap_num` | Decimal |
| 90 | `totalTurnoutScrapNum1` | 累计外协报废件数 | `total_turnout_scrap_num1` | Decimal |
| 91 | `totalTurnoutScrapNum2` | 累计外协报废数量(产出) | `total_turnout_scrap_num2` | Decimal |
| 92 | `unitExchangeType` | 换算方式 | `unit_exchange_type` | Short |
| 93 | `selfDefineCharacterOutput` | 工序作业计划产出自定义项 | `self_define_character` | 6deff7bd-e2b5-4aa3-bac8-a0bc9c1df03d |
| 94 | `dr` | 逻辑删除标记 | `dr` | Short |
| 95 | `lineId` | 联副id | `line_id` | 4b08ee17-121c-4d32-9d32-e896d0d3a395 |
| 96 | `procPlanId` | 工序作业计划 | `proc_plan_id` | 48e1a533-51f0-4a5a-9465-6fff30ce5229 |
| 97 | `rowno` | 序号 | `rowno` | Integer |
| 98 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 99 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 100 | `productionType` | 产出类型 | `production_type` | Short |
| 101 | `productId` | 物料id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 102 | `quantity` | 计划产出数量 | `quantity` | Decimal |
| 103 | `mainUnit` | 主计量单位id | `main_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 104 | `auxiliaryQuantity` | 计划产出件数 | `auxiliary_quantity` | Decimal |
| 105 | `productionUnitId` | 生产单位ID | `production_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 106 | `changeRate` | 生产换算率 | `change_rate` | Decimal |
| 107 | `orgId` | 库存组织ID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 108 | `productionDate` | 产出日期 | `production_date` | Date |
| 109 | `totalCompleteNum` | 累计完工数量 | `total_complete_num` | Decimal |
| 110 | `totalCompleteNum1` | 累计完工件数 | `total_complete_num1` | Decimal |
| 111 | `totalQualifiedNum` | 累计合格数量 | `total_qualified_num` | Decimal |
| 112 | `totalQualifiedNum1` | 累计合格件数 | `total_qualified_num1` | Decimal |
| 113 | `totalReworkNum` | 累计待返工数量 | `total_rework_num` | Decimal |
| 114 | `totalReworkNum1` | 累计待返工件数 | `total_rework_num1` | Decimal |
| 115 | `totalScrapNum` | 累计报废数量 | `total_scrap_num` | Decimal |
| 116 | `totalScrapNum1` | 累计报废件数 | `total_scrap_num1` | Decimal |
| 117 | `isReportConfirm` | 汇报确认 | `is_report_confirm` | Short |
| 118 | `reportConfirmUserId` | 汇报确认人ID | `report_confirm_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 119 | `isCheckConfirm` | 检验确认 | `is_check_confirm` | Short |
| 120 | `checkConfirmUserId` | 检验确认人ID | `check_confirm_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 121 | `id` | ID | `id` | Long |
| 122 | `pubts` | 时间戳 | `pubts` | DateTime |
| 123 | `ProcPlanOutputDefine` | 工序作业计划产出自定义项 | `` | 527134cb-33ba-4ee9-b003-80af9c75c250 |
| 124 | `ProcPlanOutputExt` | 工序作业计划产出扩展表 | `` | f1a5611b-ddc3-4a15-8cb7-e4827ed0213b |
| 125 | `ProcPlanOutputUserDefine` | 工序作业计划产出固定自定义项 | `` | db720da7-cda7-4689-b2f2-c0e3b611204f |

---

## 关联属性（18个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `mainUnit` | 主计量单位id | `pc.unit.Unit` | Service |  |
| 2 | `productId` | 物料id | `pc.product.Product` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `ProcPlanOutputUserDefine` | 工序作业计划产出固定自定义项 | `sfc.procPlan.ProcPlanOutputUserDefine` | None | true |
| 5 | `freeCharacteristicsOutput` | 工序作业计划产出自由项特征组 | `sfc.procPlan.ProcPlanOutputFreeCharacter` | None |  |
| 6 | `reportConfirmUserId` | 汇报确认人ID | `base.user.User` | Service |  |
| 7 | `lineId` | 联副id | `po.order.OrderByProduct` | Service |  |
| 8 | `productionUnitId` | 生产单位ID | `pc.unit.Unit` | Service |  |
| 9 | `selfDefineCharacterOutput` | 工序作业计划产出自定义项 | `sfc.procPlan.ProcPlanOutputSelfDefineCharacter` | None |  |
| 10 | `ProcPlanOutputExt` | 工序作业计划产出扩展表 | `sfc.procPlan.ProcPlanOutputExt` | None | true |
| 11 | `orgId` | 库存组织ID | `org.func.BaseOrg` | Service |  |
| 12 | `ProcPlanOutputDefine` | 工序作业计划产出自定义项 | `sfc.procPlan.ProcPlanOutputDefine` | None | true |
| 13 | `checkConfirmUserId` | 检验确认人ID | `base.user.User` | Service |  |
| 14 | `procPlanId` | 工序作业计划 | `sfc.procPlan.ProcPlan` | None | true |
| 15 | `procPlanDetailId` | 工序作业计划明细 | `sfc.procPlan.ProcPlanDetail` | None |  |
| 16 | `outUnitId` | 产出单位 | `pc.unit.Unit` | Service |  |
| 17 | `skuId` | SKU | `pc.product.ProductSKU` | Service |  |
| 18 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
