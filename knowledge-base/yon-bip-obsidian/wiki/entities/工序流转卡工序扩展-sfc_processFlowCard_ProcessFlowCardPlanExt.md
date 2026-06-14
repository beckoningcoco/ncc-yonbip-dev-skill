---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.processFlowCard.ProcessFlowCardPlanExt"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工序流转卡工序扩展 (`sfc.processFlowCard.ProcessFlowCardPlanExt`)

> IMPSFC | 物理表：`imp_sfc_procflowcard_plan_ext`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工序流转卡工序扩展 |
| 物理表 | `imp_sfc_procflowcard_plan_ext` |
| domain/服务域 | `IMP-SFC` |
| schema | `production_order` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:24:42.2730` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | e4a42545-5567-4ba7-be49-38a63843cfab | 工序流转卡工序id |

---

## 直接属性（43个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `breakUpTransferInQty` | 分割转入数量 | `break_up_transfer_in_qty` | Decimal |
| 2 | `breakUpTransferInQty1` | 分割转入件数 | `break_up_transfer_in_qty1` | Decimal |
| 3 | `breakUpTransferInQty2` | 分割转入数量(产出) | `break_up_transfer_in_qty2` | Decimal |
| 4 | `breakUpTransferOutQty` | 分割转出数量 | `break_up_transfer_out_qty` | Decimal |
| 5 | `breakUpTransferOutQty1` | 分割转出件数 | `break_up_transfer_out_qty1` | Decimal |
| 6 | `breakUpTransferOutQty2` | 分割转出数量(产出) | `break_up_transfer_out_qty2` | Decimal |
| 7 | `closeRemark` | 关闭说明 | `close_remark` | String |
| 8 | `dr` | 逻辑删除标记 | `dr` | Short |
| 9 | `firstCheckStatus` | 首检状态 | `first_check_status` | String |
| 10 | `firstCheckType` | 首检控制方式 | `first_check_type` | String |
| 11 | `holdDesc` | 挂起说明 | `hold_desc` | String |
| 12 | `id` | 工序流转卡工序id | `id` | e4a42545-5567-4ba7-be49-38a63843cfab |
| 13 | `inspectionStatus` | 检验状态 | `inspection_status` | Short |
| 14 | `mainChangeRateDen` | 生产换算率分母 | `main_change_rateden` | Decimal |
| 15 | `mainChangeRateNum` | 生产换算率分子 | `main_change_ratenum` | Decimal |
| 16 | `materialApplyStatus` | 领料申请状态 | `material_apply_status` | Short |
| 17 | `materialStatus` | 领料状态 | `material_status` | Short |
| 18 | `opSequenceId` | 工序序列ID | `op_sequence_id` | c89032db-c707-4a7d-84ef-bdd29d142856 |
| 19 | `opSequenceType` | 序列类型 | `op_sequence_type` | Integer |
| 20 | `osmApplicationQty` | 转委外申请数量 | `osm_application_qty` | Decimal |
| 21 | `osmApplicationQty1` | 转委外申请件数 | `osm_application_qty1` | Decimal |
| 22 | `osmApplicationQty2` | 转委外申请数量(产出) | `osm_application_qty2` | Decimal |
| 23 | `osmOrderQty` | 转委外订单数量 | `osm_order_qty` | Decimal |
| 24 | `osmOrderQty1` | 转委外订单件数 | `osm_order_qty1` | Decimal |
| 25 | `osmOrderQty2` | 转委外订单数量(产出) | `osm_order_qty2` | Decimal |
| 26 | `osmReleasedQty` | 委外下达量 | `osm_released_qty` | Decimal |
| 27 | `osmReleasedQty1` | 委外下达件数 | `osm_released_qty1` | Decimal |
| 28 | `osmReleasedQty2` | 委外下达量(产出) | `osm_released_qty2` | Decimal |
| 29 | `outChangeRateDen` | 产出换算率分母 | `out_change_rateden` | Decimal |
| 30 | `outChangeRateNum` | 产出换算率分子 | `out_change_ratenum` | Decimal |
| 31 | `pubts` | 时间戳 | `pubts` | DateTime |
| 32 | `qualifiedStockAuxiliaryQuantity` | 合格入库件数 | `qualified_stock_auxiliary_qua` | Decimal |
| 33 | `qualifiedStockOutQuantity` | 合格入库数量(产出) | `qualified_stock_out_quantity` | Decimal |
| 34 | `qualifiedStockQuantity` | 合格入库数量 | `qualified_stock_quantity` | Decimal |
| 35 | `scrapNoStockAuxQty` | 报废不入库件数 | `scrap_no_stock_aux_qty` | Decimal |
| 36 | `scrapNoStockOutQty` | 报废不入库数量(产出) | `scrap_no_stock_out_qty` | Decimal |
| 37 | `scrapNoStockQty` | 报废不入库数量 | `scrap_no_stock_qty` | Decimal |
| 38 | `scrapStockAuxiliaryQuantity` | 报废入库件数 | `scrap_stock_auxiliary_quantity` | Decimal |
| 39 | `scrapStockOutQuantity` | 报废入库数量(产出) | `scrap_stock_out_quantity` | Decimal |
| 40 | `scrapStockQuantity` | 报废入库数量 | `scrap_stock_quantity` | Decimal |
| 41 | `stockStatus` | 入库状态 | `stock_status` | Short |
| 42 | `totalCheckNum` | 累计检验数量 | `total_check_num` | Decimal |
| 43 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `opSequenceId` | 工序序列ID | `po.order.OrderOpSequence` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `id` | 工序流转卡工序id | `sfc.processFlowCard.processFlowCardPlan` | None | true |
