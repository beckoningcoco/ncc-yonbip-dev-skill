---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.dispatch.DisPatchOutput"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 任务分派产出 (`sfc.dispatch.DisPatchOutput`)

> IMPSFC | 物理表：`imp_sfc_proc_plan_output`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 任务分派产出 |
| 物理表 | `imp_sfc_proc_plan_output` |
| 数据库 schema | `IMP-SFC` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:21:33.9420` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（123个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `totalTurnoutReworkNum1` | 累计外协待返工件数 | `total_turnout_rework_num1` | Decimal |
| 2 | `totalTurnoutReturnNum1` | 累计外协转自返件数 | `total_turnout_return_num1` | Decimal |
| 3 | `totalTurnoutReworkNum2` | 累计外协待返工数量(产出) | `total_turnout_rework_num2` | Decimal |
| 4 | `totalTurnoutReturnNum2` | 累计外协转自返数量(产出) | `total_turnout_return_num2` | Decimal |
| 5 | `auxiliaryQuantity` | 计划产出件数 | `auxiliary_quantity` | Decimal |
| 6 | `outQuantity` | 计划产出数量(产出) | `out_quantity` | Decimal |
| 7 | `totalReworkTurnNum` | 累计返工转出数量 | `total_rework_turn_num` | Decimal |
| 8 | `totalTurnoutReworkNum` | 累计外协待返工数量 | `total_turnout_rework_num` | Decimal |
| 9 | `totalTurnoutQualifiedNum` | 累计外协合格数量 | `total_turnout_qualified_num` | Decimal |
| 10 | `outExchangeType` | 换算方式 | `out_exchange_type` | Short |
| 11 | `sourceGrandchildrenId` | 上游单据孙表id | `source_grandchildrenId` | Long |
| 12 | `offChartOutput` | 表外产出 | `off_chart_output` | Integer |
| 13 | `inspectionStatus` | 检验状态 | `inspection_status` | Short |
| 14 | `stockStatus` | 入库状态 | `stock_status` | Short |
| 15 | `totalCheckNum` | 累计检验数量 | `total_check_num` | Decimal |
| 16 | `scrapStockQuantity` | 报废入库数量 | `scrap_stock_quantity` | Decimal |
| 17 | `scrapStockAuxiliaryQuantity` | 报废入库件数 | `scrap_stock_auxiliary_quantity` | Decimal |
| 18 | `scrapStockOutQuantity` | 报废入库数量(产出) | `scrap_stock_out_quantity` | Decimal |
| 19 | `scrapNoStockQty` | 报废不入库数量 | `scrap_no_stock_qty` | Decimal |
| 20 | `scrapNoStockAuxQty` | 报废不入库件数 | `scrap_no_stock_aux_qty` | Decimal |
| 21 | `scrapNoStockOutQty` | 报废不入库数量(产出) | `scrap_no_stock_out_qty` | Decimal |
| 22 | `qualifiedStockQuantity` | 合格入库数量 | `qualified_stock_quantity` | Decimal |
| 23 | `qualifiedStockAuxiliaryQuantity` | 合格入库件数 | `qualified_stock_auxiliary_qua` | Decimal |
| 24 | `qualifiedStockOutQuantity` | 合格入库数量(产出) | `qualified_stock_out_quantity` | Decimal |
| 25 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 26 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 27 | `source` | 上游单据类型 | `source` | String |
| 28 | `upcode` | 上游单据号 | `upcode` | String |
| 29 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 30 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 31 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 32 | `scrapInNum1` | 累计报废转出件数 | `scrap_in_num1` | Decimal |
| 33 | `selfDefineCharacterOutput` | 工序作业计划产出自定义项 | `self_define_character` | 6deff7bd-e2b5-4aa3-bac8-a0bc9c1df03d |
| 34 | `dr` | 逻辑删除标记 | `dr` | Short |
| 35 | `totalScrapNum` | 累计报废数量 | `total_scrap_num` | Decimal |
| 36 | `scrapInNum2` | 累计报废转出数量(产出) | `scrap_in_num2` | Decimal |
| 37 | `totalCompleteNum` | 累计完成数量 | `total_complete_num` | Decimal |
| 38 | `qualifiedInNum2` | 合格在制入库数量(产出) | `qualified_in_num2` | Decimal |
| 39 | `qualifiedInNum1` | 合格在制入库件数 | `qualified_in_num1` | Decimal |
| 40 | `id` | ID | `id` | Long |
| 41 | `isReportConfirm` | 汇报确认 | `is_report_confirm` | Short |
| 42 | `totalTurnoutNum` | 累计转外发数量 | `total_turnout_num` | Decimal |
| 43 | `scrapInNum` | 累计报废转出数量 | `scrap_in_num` | Decimal |
| 44 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 45 | `outUnitId` | 产出单位 | `out_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 46 | `skuId` | SKU | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 47 | `totalTurnoutBackNum1` | 累计外发收回件数 | `total_turnout_back_num1` | Decimal |
| 48 | `totalTurnoutBackNum2` | 累计外发收回数量(产出) | `total_turnout_back_num2` | Decimal |
| 49 | `mainUnit` | 主计量单位 | `main_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 50 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 51 | `totalReworkNum` | 累计待返工数量 | `total_rework_num` | Decimal |
| 52 | `reportConfirmUserId` | 汇报确认人 | `report_confirm_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 53 | `totalTurnoutDispatchNum` | 累计外协分派数量 | `total_turnout_dispatch_num` | Decimal |
| 54 | `checkConfirmUserId` | 检验确认人 | `check_confirm_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 55 | `totalReworkTurnNum2` | 累计返工转出数量(产出) | `total_rework_turn_num2` | Decimal |
| 56 | `totalReworkTurnNum1` | 累计返工转出件数 | `total_rework_turn_num1` | Decimal |
| 57 | `totalTurnoutReturnNum` | 累计外协转自返数量 | `total_turnout_return_num` | Decimal |
| 58 | `totalReworkProcessNum2` | 累计返工处理数量(产出) | `total_rework_process_num2` | Decimal |
| 59 | `totalQualifiedTurnNum1` | 累计合格转出件数 | `total_qualified_turn_num1` | Decimal |
| 60 | `breakUpTransferInQty` | 分割转入数量 | `break_up_transfer_in_qty` | Decimal |
| 61 | `totalReworkProcessNum1` | 累计返工处理件数 | `total_rework_process_num1` | Decimal |
| 62 | `totalQualifiedTurnNum2` | 累计合格转出数量(产出) | `total_qualified_turn_num2` | Decimal |
| 63 | `totalExecNum` | 累计执行数量 | `total_exec_num` | Decimal |
| 64 | `breakUpTransferOutQty` | 分割转出数量 | `break_up_transfer_out_qty` | Decimal |
| 65 | `outChangeRate` | 产出主计量转换率 | `out_change_rate` | Decimal |
| 66 | `breakUpTransferInQty1` | 分割转入件数 | `break_up_transfer_in_qty1` | Decimal |
| 67 | `breakUpTransferOutQty2` | 分割转出数量(产出) | `break_up_transfer_out_qty2` | Decimal |
| 68 | `breakUpTransferInQty2` | 分割转入数量(产出) | `break_up_transfer_in_qty2` | Decimal |
| 69 | `breakUpTransferOutQty1` | 分割转出件数 | `break_up_transfer_out_qty1` | Decimal |
| 70 | `totalExecNum2` | 累计执行数量(产出) | `total_exec_num2` | Decimal |
| 71 | `totalTurnoutScrapNum1` | 累计外协报废件数 | `total_turnout_scrap_num1` | Decimal |
| 72 | `totalExecNum1` | 累计执行件数 | `total_exec_num1` | Decimal |
| 73 | `productionType` | 产出类型 | `production_type` | Short |
| 74 | `freeCharacteristicsOutput` | 工序作业计划产出自由项特征组 | `free_characteristics` | 6cb46c34-1ad8-41c5-9b3d-e2c08d5087f1 |
| 75 | `totalQualifiedNum2` | 累计合格数量(产出) | `total_qualified_num2` | Decimal |
| 76 | `totalQualifiedNum1` | 累计合格件数 | `total_qualified_num1` | Decimal |
| 77 | `totalQualifiedNum` | 累计合格数量 | `total_qualified_num` | Decimal |
| 78 | `orgId` | 库存组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 79 | `isCheckConfirm` | 检验确认 | `is_check_confirm` | Short |
| 80 | `productionDate` | 产出日期 | `production_date` | Date |
| 81 | `totalTurnoutScrapNum2` | 累计外协报废数量(产出) | `total_turnout_scrap_num2` | Decimal |
| 82 | `pubts` | 时间戳 | `pubts` | DateTime |
| 83 | `changeRate` | 生产主计量转换率 | `change_rate` | Decimal |
| 84 | `totalReturnNum1` | 累计退回件数 | `total_return_num1` | Decimal |
| 85 | `totalTurnoutDispatchNum2` | 累计外协分派数量(产出) | `total_turnout_dispatch_num2` | Decimal |
| 86 | `totalTurnoutDispatchNum1` | 累计外协分派件数 | `total_turnout_dispatch_num1` | Decimal |
| 87 | `totalReworkProcessNum` | 累计返工处理数量 | `total_rework_process_num` | Decimal |
| 88 | `rowno` | 序号 | `rowno` | Integer |
| 89 | `quantity` | 计划产出数量 | `quantity` | Decimal |
| 90 | `totalReturnNum2` | 累计退回数量(产出) | `total_return_num2` | Decimal |
| 91 | `totalReworkNum2` | 累计待返工数量(产出) | `total_rework_num2` | Decimal |
| 92 | `totalCompleteNum1` | 累计完成件数 | `total_complete_num1` | Decimal |
| 93 | `totalReworkNum1` | 累计待返工件数 | `total_rework_num1` | Decimal |
| 94 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 95 | `totalTurninNum` | 累计转入数量 | `total_turnin_num` | Decimal |
| 96 | `totalTurninNum1` | 累计转入件数 | `total_turnin_num1` | Decimal |
| 97 | `totalCompleteNum2` | 累计完成数量(产出) | `total_complete_num2` | Decimal |
| 98 | `totalTurninNum2` | 累计转入数量(产出) | `total_turnin_num2` | Decimal |
| 99 | `qualifiedInNum` | 合格在制入库数量 | `qualified_in_num` | Decimal |
| 100 | `totalScrapNum2` | 累计报废数量(产出) | `total_scrap_num2` | Decimal |
| 101 | `lineId` | 联副id | `line_id` | 4b08ee17-121c-4d32-9d32-e896d0d3a395 |
| 102 | `totalScrapNum1` | 累计报废件数 | `total_scrap_num1` | Decimal |
| 103 | `totalTurnoutQualifiedNum1` | 累计外协合格件数 | `total_turnout_qualified_num1` | Decimal |
| 104 | `totalQualifiedTurnNum` | 累计合格转出数量 | `total_qualified_turn_num` | Decimal |
| 105 | `unitExchangeType` | 换算方式 | `unit_exchange_type` | Short |
| 106 | `totalTurnoutBackNum` | 累计外发收回数量 | `total_turnout_back_num` | Decimal |
| 107 | `totalTurnoutQualifiedNum2` | 累计外协合格数量(产出) | `total_turnout_qualified_num2` | Decimal |
| 108 | `productionUnitId` | 生产单位 | `production_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 109 | `totalTurnNum` | 累计转出数量 | `total_turn_num` | Decimal |
| 110 | `totalTurnoutNum1` | 累计转外发件数 | `total_turnout_num1` | Decimal |
| 111 | `lineno` | 行号 | `lineno` | Decimal |
| 112 | `procPlanId` | 任务分派ID | `proc_plan_id` | 651c34e4-a23e-4bfd-89a7-f53f5d51e14e |
| 113 | `totalTurnoutNum2` | 累计转外发数量(产出) | `total_turnout_num2` | Decimal |
| 114 | `totalReturnNum` | 累计退回数量 | `total_return_num` | Decimal |
| 115 | `totalTurnoutScrapNum` | 累计外协报废数量 | `total_turnout_scrap_num` | Decimal |
| 116 | `totalTurnNum1` | 累计转出件数 | `total_turn_num1` | Decimal |
| 117 | `totalTurnNum2` | 累计转出数量(产出) | `total_turn_num2` | Decimal |
| 118 | `ProcPlanOutputExt` | 任务分派产出扩展表 | `` | 286aa570-3388-4665-b503-43e870fb8f35 |
| 119 | `changeRateDen` | 生产换算率分母 | `change_rateden` | Decimal |
| 120 | `changeRateNum` | 生产换算率分子 | `change_ratenum` | Decimal |
| 121 | `outChangeRateDen` | 产出换算率分母 | `out_change_rateden` | Decimal |
| 122 | `outChangeRateNum` | 产出换算率分子 | `out_change_ratenum` | Decimal |
| 123 | `procPlanDetailId` | 工序作业计划明细 | `proc_plan_detail_id` | 7e33a4bf-edce-447c-8e6f-0717cec2b092 |

---

## 关联属性（16个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `mainUnit` | 主计量单位 | `pc.unit.Unit` | Service |  |
| 2 | `productId` | 物料 | `pc.product.Product` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `freeCharacteristicsOutput` | 工序作业计划产出自由项特征组 | `sfc.procPlan.ProcPlanOutputFreeCharacter` | None |  |
| 5 | `reportConfirmUserId` | 汇报确认人 | `base.user.User` | Service |  |
| 6 | `lineId` | 联副id | `po.order.OrderByProduct` | Service |  |
| 7 | `productionUnitId` | 生产单位 | `pc.unit.Unit` | Service |  |
| 8 | `selfDefineCharacterOutput` | 工序作业计划产出自定义项 | `sfc.procPlan.ProcPlanOutputSelfDefineCharacter` | None |  |
| 9 | `ProcPlanOutputExt` | 任务分派产出扩展表 | `sfc.dispatch.DisPatchOutputExt` | None | true |
| 10 | `orgId` | 库存组织 | `org.func.BaseOrg` | Service |  |
| 11 | `checkConfirmUserId` | 检验确认人 | `base.user.User` | Service |  |
| 12 | `procPlanId` | 任务分派ID | `sfc.dispatch.DisPatch` | None | true |
| 13 | `procPlanDetailId` | 工序作业计划明细 | `sfc.procPlan.ProcPlanDetail` | None |  |
| 14 | `outUnitId` | 产出单位 | `pc.unit.Unit` | Service |  |
| 15 | `skuId` | SKU | `pc.product.ProductSKU` | Service |  |
| 16 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
