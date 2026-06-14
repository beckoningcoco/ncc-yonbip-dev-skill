---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.procPlan.ProcPlanOutputExt"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工序作业计划产出扩展表 (`sfc.procPlan.ProcPlanOutputExt`)

> IMPSFC | 物理表：`imp_sfc_proc_plan_output_ext`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工序作业计划产出扩展表 |
| 物理表 | `imp_sfc_proc_plan_output_ext` |
| domain/服务域 | `IMP-SFC` |
| schema | `production_order` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:26:08.9140` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | f5a3555f-1369-4972-9600-12fc6fc4a7e9 | 工序作业计划产出 |

---

## 直接属性（20个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `changeRateDen` | 生产换算率分母 | `change_rateden` | Decimal |
| 2 | `changeRateNum` | 生产换算率分子 | `change_ratenum` | Decimal |
| 3 | `dr` | 逻辑删除标记 | `dr` | Short |
| 4 | `id` | 工序作业计划产出 | `id` | f5a3555f-1369-4972-9600-12fc6fc4a7e9 |
| 5 | `inspectionStatus` | 检验状态 | `inspection_status` | Short |
| 6 | `offChartOutput` | 表外产出 | `off_chart_output` | Integer |
| 7 | `outChangeRateDen` | 产出换算率分母 | `out_change_rateden` | Decimal |
| 8 | `outChangeRateNum` | 产出换算率分子 | `out_change_ratenum` | Decimal |
| 9 | `qualifiedStockAuxiliaryQuantity` | 合格入库件数 | `qualified_stock_auxiliary_qua` | Decimal |
| 10 | `qualifiedStockOutQuantity` | 合格入库数量(产出) | `qualified_stock_out_quantity` | Decimal |
| 11 | `qualifiedStockQuantity` | 合格入库数量 | `qualified_stock_quantity` | Decimal |
| 12 | `scrapNoStockAuxQty` | 报废不入库件数 | `scrap_no_stock_aux_qty` | Decimal |
| 13 | `scrapNoStockOutQty` | 报废不入库数量(产出) | `scrap_no_stock_out_qty` | Decimal |
| 14 | `scrapNoStockQty` | 报废不入库数量 | `scrap_no_stock_qty` | Decimal |
| 15 | `scrapStockAuxiliaryQuantity` | 报废入库件数 | `scrap_stock_auxiliary_quantity` | Decimal |
| 16 | `scrapStockOutQuantity` | 报废入库数量(产出) | `scrap_stock_out_quantity` | Decimal |
| 17 | `scrapStockQuantity` | 报废入库数量 | `scrap_stock_quantity` | Decimal |
| 18 | `stockStatus` | 入库状态 | `stock_status` | Short |
| 19 | `totalCheckNum` | 累计检验数量 | `total_check_num` | Decimal |
| 20 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `id` | 工序作业计划产出 | `sfc.procPlan.ProcPlanOutput` | None | true |
