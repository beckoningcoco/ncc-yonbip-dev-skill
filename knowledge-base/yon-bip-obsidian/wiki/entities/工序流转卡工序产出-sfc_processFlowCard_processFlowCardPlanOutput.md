---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.processFlowCard.processFlowCardPlanOutput"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工序流转卡工序产出 (`sfc.processFlowCard.processFlowCardPlanOutput`)

> IMPSFC | 物理表：`imp_sfc_procflowcard_plan_output`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工序流转卡工序产出 |
| 物理表 | `imp_sfc_procflowcard_plan_output` |
| domain/服务域 | `IMP-SFC` |
| schema | `production_order` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:24:54.5710` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（118个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `auxiliaryQuantity` | 计划产出件数 | `auxiliary_quantity` | Decimal |
| 2 | `changeRate` | 生产主计量转换率 | `change_rate` | Decimal |
| 3 | `checkConfirmUserId` | 检验确认人 | `check_confirm_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 4 | `confirmUserId` | 汇报确认人 | `confirm_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 5 | `dr` | 逻辑删除标记 | `dr` | Short |
| 6 | `freeCharacteristicsOutput` | 工序流转卡工序产出自由项特征组 | `free_characteristics` | 41189bef-9ff5-4e0f-a871-1623954cdebf |
| 7 | `id` | ID | `id` | Long |
| 8 | `isCheckConfirm` | 检验确认 | `is_check_confirm` | Short |
| 9 | `isConfirm` | 汇报确认 | `is_confirm` | Short |
| 10 | `breakUpTransferOutQty` | 分割转出数量 | `break_up_transfer_out_qty` | Decimal |
| 11 | `breakUpTransferOutQty1` | 分割转出件数 | `break_up_transfer_out_qty1` | Decimal |
| 12 | `breakUpTransferOutQty2` | 分割转出数量(产出) | `break_up_transfer_out_qty2` | Decimal |
| 13 | `breakUpTransferInQty` | 分割转入数量 | `break_up_transfer_in_qty` | Decimal |
| 14 | `breakUpTransferInQty1` | 分割转入件数 | `break_up_transfer_in_qty1` | Decimal |
| 15 | `breakUpTransferInQty2` | 分割转入数量(产出) | `break_up_transfer_in_qty2` | Decimal |
| 16 | `lineId` | 联副id | `line_id` | 4b08ee17-121c-4d32-9d32-e896d0d3a395 |
| 17 | `lineno` | 行号 | `lineno` | Decimal |
| 18 | `mainUnit` | 主计量单位 | `main_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 19 | `orgId` | 库存组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 20 | `outChangeRate` | 产出主计量转换率 | `out_change_rate` | Decimal |
| 21 | `outExchangeType` | 产出-主计量换算方式 | `out_exchange_type` | Short |
| 22 | `outQuantity` | 计划产出数量(产出) | `out_quantity` | Decimal |
| 23 | `outUnitId` | 产出单位 | `out_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 24 | `planStartDate` | 计划开工日期 | `plan_start_date` | Date |
| 25 | `procFlowCardPlanId` | 工序流转卡工序 | `process_flow_plan_id` | e4a42545-5567-4ba7-be49-38a63843cfab |
| 26 | `processSn` | 工序顺序号 | `process_sn` | Decimal |
| 27 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 28 | `productionDate` | 产出日期 | `production_date` | Date |
| 29 | `productionType` | 产出类型 | `production_type` | Short |
| 30 | `productionUnitId` | 生产单位 | `production_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 31 | `pubts` | 时间戳 | `pubts` | DateTime |
| 32 | `qualifiedInNum` | 合格在制入库数量 | `qualified_in_num` | Decimal |
| 33 | `qualifiedInNum1` | 合格在制入库件数 | `qualified_in_num1` | Decimal |
| 34 | `qualifiedInNum2` | 合格在制入库数量(产出) | `qualified_in_num2` | Decimal |
| 35 | `quantity` | 计划产出数量 | `quantity` | Decimal |
| 36 | `rowno` | 序号 | `rowno` | Integer |
| 37 | `scrapInNum` | 报废入库数量 | `scrap_in_num` | Decimal |
| 38 | `scrapInNum1` | 报废入库件数 | `scrap_in_num1` | Decimal |
| 39 | `scrapInNum2` | 报废入库数量(产出) | `scrap_in_num2` | Decimal |
| 40 | `selfDefineCharacterOutput` | 工序流转卡工序产出自定义项特征组 | `self_define_character` | 09eb20ae-3b05-472a-8b35-c74d68477b98 |
| 41 | `skuId` | SKU | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 42 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 43 | `totalCompleteNum` | 累计完成数量 | `total_complete_num` | Decimal |
| 44 | `totalCompleteNum1` | 累计完成件数 | `total_complete_num1` | Decimal |
| 45 | `totalCompleteNum2` | 累计完成数量(产出) | `total_complete_num2` | Decimal |
| 46 | `totalExecNum` | 累计执行数量 | `total_exec_num` | Decimal |
| 47 | `totalExecNum1` | 累计执行件数 | `total_exec_num1` | Decimal |
| 48 | `totalExecNum2` | 累计执行数量(产出) | `total_exec_num2` | Decimal |
| 49 | `totalQualifiedNum` | 累计合格数量 | `total_qualified_num` | Decimal |
| 50 | `totalQualifiedNum1` | 累计合格件数 | `total_qualified_num1` | Decimal |
| 51 | `totalQualifiedNum2` | 累计合格数量(产出) | `total_qualified_num2` | Decimal |
| 52 | `totalQualifiedTurnNum` | 累计合格转出数量 | `total_qualified_turn_num` | Decimal |
| 53 | `totalQualifiedTurnNum1` | 累计合格转出件数 | `total_qualified_turn_num1` | Decimal |
| 54 | `totalQualifiedTurnNum2` | 累计合格转出数量(产出) | `total_qualified_turn_num2` | Decimal |
| 55 | `totalReturnNum` | 累计退回数量 | `total_return_num` | Decimal |
| 56 | `totalReturnNum1` | 累计退回件数 | `total_return_num1` | Decimal |
| 57 | `totalReturnNum2` | 累计退回数量(产出) | `total_return_num2` | Decimal |
| 58 | `totalReworkNum` | 累计待返工数量 | `total_rework_num` | Decimal |
| 59 | `totalReworkNum1` | 累计待返工件数 | `total_rework_num1` | Decimal |
| 60 | `totalReworkNum2` | 累计待返工数量(产出) | `total_rework_num2` | Decimal |
| 61 | `totalReworkProcessNum` | 累计返工处理数量 | `total_rework_process_num` | Decimal |
| 62 | `totalReworkProcessNum1` | 累计返工处理件数 | `total_rework_process_num1` | Decimal |
| 63 | `totalReworkProcessNum2` | 累计返工处理数量(产出) | `total_rework_process_num2` | Decimal |
| 64 | `totalReworkTurnNum` | 累计返工转出数量 | `total_rework_turn_num` | Decimal |
| 65 | `totalReworkTurnNum1` | 累计返工转出件数 | `total_rework_turn_num1` | Decimal |
| 66 | `totalReworkTurnNum2` | 累计返工转出数量(产出) | `total_rework_turn_num2` | Decimal |
| 67 | `totalScrapNum` | 累计报废数量 | `total_scrap_num` | Decimal |
| 68 | `totalScrapNum1` | 累计报废件数 | `total_scrap_num1` | Decimal |
| 69 | `totalScrapNum2` | 累计报废数量(产出) | `total_scrap_num2` | Decimal |
| 70 | `totalTurnNum` | 累计转出数量 | `total_turn_num` | Decimal |
| 71 | `totalTurnNum1` | 累计转出件数 | `total_turn_num1` | Decimal |
| 72 | `totalTurnNum2` | 累计转出数量(产出) | `total_turn_num2` | Decimal |
| 73 | `totalTurninNum` | 累计转入数量 | `total_turnin_num` | Decimal |
| 74 | `totalTurninNum1` | 累计转入件数 | `total_turnin_num1` | Decimal |
| 75 | `totalTurninNum2` | 累计转入数量(产出) | `total_turnin_num2` | Decimal |
| 76 | `totalTurnoutBackNum` | 累计外发收回数量 | `total_turnout_back_num` | Decimal |
| 77 | `totalTurnoutBackNum1` | 累计外发收回件数 | `total_turnout_back_num1` | Decimal |
| 78 | `totalTurnoutBackNum2` | 累计外发收回数量(产出) | `total_turnout_back_num2` | Decimal |
| 79 | `totalTurnoutDispatchNum` | 累计外协分派数量 | `total_turnout_dispatch_num` | Decimal |
| 80 | `totalTurnoutDispatchNum1` | 累计外协分派件数 | `total_turnout_dispatch_num1` | Decimal |
| 81 | `totalTurnoutDispatchNum2` | 累计外协分派数量(产出) | `total_turnout_dispatch_num2` | Decimal |
| 82 | `totalTurnoutNum` | 累计转外发数量 | `total_turnout_num` | Decimal |
| 83 | `totalTurnoutNum1` | 累计转外发件数) | `total_turnout_num1` | Decimal |
| 84 | `totalTurnoutNum2` | 累计转外发数量(产出) | `total_turnout_num2` | Decimal |
| 85 | `totalTurnoutQualifiedNum` | 累计外协合格数量 | `total_turnout_qualified_num` | Decimal |
| 86 | `totalTurnoutQualifiedNum1` | 累计外协合格件数 | `total_turnout_qualified_num1` | Decimal |
| 87 | `totalTurnoutQualifiedNum2` | 累计外协合格数量(产出) | `total_turnout_qualified_num2` | Decimal |
| 88 | `totalTurnoutReturnNum` | 累计外协转自返数量 | `total_turnout_return_num` | Decimal |
| 89 | `totalTurnoutReturnNum1` | 累计外协转自返件数 | `total_turnout_return_num1` | Decimal |
| 90 | `totalTurnoutReturnNum2` | 累计外协转自返数量(产出) | `total_turnout_return_num2` | Decimal |
| 91 | `totalTurnoutReworkNum` | 累计外协待返工数量 | `total_turnout_rework_num` | Decimal |
| 92 | `totalTurnoutReworkNum1` | 累计外协待返工件数 | `total_turnout_rework_num1` | Decimal |
| 93 | `totalTurnoutReworkNum2` | 累计外协待返工数量(产出) | `total_turnout_rework_num2` | Decimal |
| 94 | `totalTurnoutScrapNum` | 累计外协报废数量 | `total_turnout_scrap_num` | Decimal |
| 95 | `totalTurnoutScrapNum1` | 累计外协报废件数 | `total_turnout_scrap_num1` | Decimal |
| 96 | `totalTurnoutScrapNum2` | 累计外协报废数量(产出) | `total_turnout_scrap_num2` | Decimal |
| 97 | `unitExchangeType` | 生产-主计量换算方式 | `unit_exchange_type` | Short |
| 98 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 99 | `changeRateDen` | 生产换算率分母 | `change_rateden` | Decimal |
| 100 | `changeRateNum` | 生产换算率分子 | `change_ratenum` | Decimal |
| 101 | `inspectionStatus` | 检验状态 | `inspection_status` | Short |
| 102 | `offChartOutput` | 表外产出 | `off_chart_output` | Integer |
| 103 | `outChangeRateDen` | 产出换算率分母 | `out_change_rateden` | Decimal |
| 104 | `outChangeRateNum` | 产出换算率分子 | `out_change_ratenum` | Decimal |
| 105 | `processFlowCardPlanOutputDefine` | 工序流转卡工序产出自由自定义项 | `` | 7d7c840b-9764-494c-b8d9-fa9247539f62 |
| 106 | `processFlowCardPlanOutputExt` | 流转卡工序产出扩展表 | `` | 0c40bea2-1eb9-422f-8ffa-3fdabcc3f0d1 |
| 107 | `processFlowCardPlanOutputUserDefine` | 工序流转卡工序产出固定自定义项 | `` | 462e8258-ef66-434f-836e-f8cb835c4c08 |
| 108 | `qualifiedStockAuxiliaryQuantity` | 合格入库件数 | `qualified_stock_auxiliary_qua` | Decimal |
| 109 | `qualifiedStockOutQuantity` | 合格入库数量(产出) | `qualified_stock_out_quantity` | Decimal |
| 110 | `qualifiedStockQuantity` | 合格入库数量 | `qualified_stock_quantity` | Decimal |
| 111 | `scrapNoStockAuxQty` | 报废不入库件数 | `scrap_no_stock_aux_qty` | Decimal |
| 112 | `scrapNoStockOutQty` | 报废不入库数量(产出) | `scrap_no_stock_out_qty` | Decimal |
| 113 | `scrapNoStockQty` | 报废不入库数量 | `scrap_no_stock_qty` | Decimal |
| 114 | `scrapStockAuxiliaryQuantity` | 报废入库件数 | `scrap_stock_auxiliary_quantity` | Decimal |
| 115 | `scrapStockOutQuantity` | 报废入库数量(产出) | `scrap_stock_out_quantity` | Decimal |
| 116 | `scrapStockQuantity` | 报废入库数量 | `scrap_stock_quantity` | Decimal |
| 117 | `stockStatus` | 入库状态 | `stock_status` | Short |
| 118 | `totalCheckNum` | 累计检验数量 | `total_check_num` | Decimal |

---

## 关联属性（17个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `mainUnit` | 主计量单位 | `pc.unit.Unit` | Service |  |
| 2 | `productId` | 物料 | `pc.product.Product` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `freeCharacteristicsOutput` | 工序流转卡工序产出自由项特征组 | `sfc.processFlowCard.ProcFlowCardPlanOutputFreeCharacter` | None |  |
| 5 | `lineId` | 联副id | `po.order.OrderByProduct` | Service |  |
| 6 | `procFlowCardPlanId` | 工序流转卡工序 | `sfc.processFlowCard.processFlowCardPlan` | None | true |
| 7 | `processFlowCardPlanOutputExt` | 流转卡工序产出扩展表 | `sfc.processFlowCard.processFlowCardPlanOutputExt` | None | true |
| 8 | `productionUnitId` | 生产单位 | `pc.unit.Unit` | Service |  |
| 9 | `selfDefineCharacterOutput` | 工序流转卡工序产出自定义项特征组 | `sfc.processFlowCard.ProcFlowCardPlanOutputSelfDefineCharacter` | None |  |
| 10 | `confirmUserId` | 汇报确认人 | `base.user.User` | Service |  |
| 11 | `orgId` | 库存组织 | `org.func.BaseOrg` | Service |  |
| 12 | `checkConfirmUserId` | 检验确认人 | `base.user.User` | Service |  |
| 13 | `processFlowCardPlanOutputUserDefine` | 工序流转卡工序产出固定自定义项 | `sfc.processFlowCard.processFlowCardPlanOutputUserDefine` | None | true |
| 14 | `processFlowCardPlanOutputDefine` | 工序流转卡工序产出自由自定义项 | `sfc.processFlowCard.processFlowCardPlanOutputDefine` | None | true |
| 15 | `outUnitId` | 产出单位 | `pc.unit.Unit` | Service |  |
| 16 | `skuId` | SKU | `pc.product.ProductSKU` | Service |  |
| 17 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
