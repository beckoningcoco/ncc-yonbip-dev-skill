---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.dispatch.DisPatchOutputExt"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 任务分派产出扩展表 (`sfc.dispatch.DisPatchOutputExt`)

> IMPSFC | 物理表：`imp_sfc_proc_plan_output_ext`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 任务分派产出扩展表 |
| 物理表 | `imp_sfc_proc_plan_output_ext` |
| domain/服务域 | `IMP-SFC` |
| schema | `production_order` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:23:41.8990` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | 61b3a535-a7be-4ed3-b66c-cbf367856b7c | 任务分派产出ID |

---

## 直接属性（20个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 任务分派产出ID | `id` | 61b3a535-a7be-4ed3-b66c-cbf367856b7c |
| 2 | `offChartOutput` | 表外产出 | `off_chart_output` | Integer |
| 3 | `inspectionStatus` | 检验状态 | `inspection_status` | Short |
| 4 | `stockStatus` | 入库状态 | `stock_status` | Short |
| 5 | `totalCheckNum` | 累计检验数量 | `total_check_num` | Decimal |
| 6 | `scrapStockQuantity` | 报废入库数量 | `scrap_stock_quantity` | Decimal |
| 7 | `scrapStockAuxiliaryQuantity` | 报废入库件数 | `scrap_stock_auxiliary_quantity` | Decimal |
| 8 | `scrapStockOutQuantity` | 报废入库数量(产出) | `scrap_stock_out_quantity` | Decimal |
| 9 | `scrapNoStockQty` | 报废不入库数量 | `scrap_no_stock_qty` | Decimal |
| 10 | `scrapNoStockAuxQty` | 报废不入库件数 | `scrap_no_stock_aux_qty` | Decimal |
| 11 | `scrapNoStockOutQty` | 报废不入库数量(产出) | `scrap_no_stock_out_qty` | Decimal |
| 12 | `qualifiedStockQuantity` | 合格入库数量 | `qualified_stock_quantity` | Decimal |
| 13 | `qualifiedStockAuxiliaryQuantity` | 合格入库件数 | `qualified_stock_auxiliary_qua` | Decimal |
| 14 | `qualifiedStockOutQuantity` | 合格入库数量(产出) | `qualified_stock_out_quantity` | Decimal |
| 15 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 16 | `dr` | 逻辑删除标记 | `dr` | Short |
| 17 | `changeRateDen` | 生产换算率分母 | `change_rateden` | Decimal |
| 18 | `changeRateNum` | 生产换算率分子 | `change_ratenum` | Decimal |
| 19 | `outChangeRateDen` | 产出换算率分母 | `out_change_rateden` | Decimal |
| 20 | `outChangeRateNum` | 产出换算率分子 | `out_change_ratenum` | Decimal |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `id` | 任务分派产出ID | `sfc.dispatch.DisPatchOutput` | None | true |
