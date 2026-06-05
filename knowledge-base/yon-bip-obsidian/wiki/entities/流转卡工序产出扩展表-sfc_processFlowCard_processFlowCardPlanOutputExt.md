---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.processFlowCard.processFlowCardPlanOutputExt"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 流转卡工序产出扩展表 (`sfc.processFlowCard.processFlowCardPlanOutputExt`)

> IMPSFC | 物理表：`imp_sfc_procflowcard_plan_output_ext`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 流转卡工序产出扩展表 |
| 物理表 | `imp_sfc_procflowcard_plan_output_ext` |
| 数据库 schema | `IMP-SFC` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:26:21.8970` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | 891c152d-4732-4bdb-a55e-bed04fa85597 | 流转卡工序产出 |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（22个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `changeRateDen` | 生产换算率分母 | `change_rateden` | Decimal |
| 2 | `changeRateNum` | 生产换算率分子 | `change_ratenum` | Decimal |
| 3 | `dr` | 逻辑删除标记 | `dr` | Short |
| 4 | `id` | 流转卡工序产出 | `id` | 891c152d-4732-4bdb-a55e-bed04fa85597 |
| 5 | `inspectionStatus` | 检验状态 | `inspection_status` | Short |
| 6 | `offChartOutput` | 表外产出 | `off_chart_output` | Integer |
| 7 | `outChangeRateDen` | 产出换算率分母 | `out_change_rateden` | Decimal |
| 8 | `outChangeRateNum` | 产出换算率分子 | `out_change_ratenum` | Decimal |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime |
| 10 | `qualifiedStockAuxiliaryQuantity` | 合格入库件数 | `qualified_stock_auxiliary_qua` | Decimal |
| 11 | `qualifiedStockOutQuantity` | 合格入库数量(产出) | `qualified_stock_out_quantity` | Decimal |
| 12 | `qualifiedStockQuantity` | 合格入库数量 | `qualified_stock_quantity` | Decimal |
| 13 | `rowno` | 序号 | `rowno` | Integer |
| 14 | `scrapNoStockAuxQty` | 报废不入库件数 | `scrap_no_stock_aux_qty` | Decimal |
| 15 | `scrapNoStockOutQty` | 报废不入库数量(产出) | `scrap_no_stock_out_qty` | Decimal |
| 16 | `scrapNoStockQty` | 报废不入库数量 | `scrap_no_stock_qty` | Decimal |
| 17 | `scrapStockAuxiliaryQuantity` | 报废入库件数 | `scrap_stock_auxiliary_quantity` | Decimal |
| 18 | `scrapStockOutQuantity` | 报废入库数量(产出) | `scrap_stock_out_quantity` | Decimal |
| 19 | `scrapStockQuantity` | 报废入库数量 | `scrap_stock_quantity` | Decimal |
| 20 | `stockStatus` | 入库状态 | `stock_status` | Short |
| 21 | `totalCheckNum` | 累计检验数量 | `total_check_num` | Decimal |
| 22 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `id` | 流转卡工序产出 | `sfc.processFlowCard.processFlowCardPlanOutput` | None | true |
