---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.dispatchinfo.DisPatchExt"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 作业计划拓展 (`sfc.dispatchinfo.DisPatchExt`)

> IMPSFC | 物理表：`imp_sfc_proc_plan_ext`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 作业计划拓展 |
| 物理表 | `imp_sfc_proc_plan_ext` |
| domain/服务域 | `IMP-SFC` |
| schema | `production_order` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:23:44.5000` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | 761ed5f1-5945-4f06-9c91-92368fe92ebe | 派工工作台ID |

---

## 直接属性（29个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 派工工作台ID | `id` | 761ed5f1-5945-4f06-9c91-92368fe92ebe |
| 2 | `holdDesc` | 挂起说明 | `hold_desc` | String |
| 3 | `dispatchUserId` | 派工人 | `dispatch_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 4 | `dispatchTime` | 派工时间 | `dispatch_time` | DateTime |
| 5 | `materialApplyStatus` | 领料申请状态 | `material_apply_status` | Short |
| 6 | `materialStatus` | 领料状态 | `material_status` | Short |
| 7 | `firstCheckType` | 首检控制方式 | `first_check_type` | String |
| 8 | `firstCheckStatus` | 首检状态 | `first_check_status` | String |
| 9 | `inspectionStatus` | 检验状态 | `inspection_status` | Short |
| 10 | `stockStatus` | 入库状态 | `stock_status` | Short |
| 11 | `totalCheckNum` | 累计检验数量 | `total_check_num` | Decimal |
| 12 | `scrapStockQuantity` | 报废入库数量 | `scrap_stock_quantity` | Decimal |
| 13 | `scrapStockAuxiliaryQuantity` | 报废入库件数 | `scrap_stock_auxiliary_quantity` | Decimal |
| 14 | `scrapStockOutQuantity` | 报废入库数量(产出) | `scrap_stock_out_quantity` | Decimal |
| 15 | `scrapNoStockQty` | 报废不入库数量 | `scrap_no_stock_qty` | Decimal |
| 16 | `scrapNoStockAuxQty` | 报废不入库件数 | `scrap_no_stock_aux_qty` | Decimal |
| 17 | `scrapNoStockOutQty` | 报废不入库数量(产出) | `scrap_no_stock_out_qty` | Decimal |
| 18 | `qualifiedStockQuantity` | 合格入库数量 | `qualified_stock_quantity` | Decimal |
| 19 | `qualifiedStockAuxiliaryQuantity` | 合格入库件数 | `qualified_stock_auxiliary_qua` | Decimal |
| 20 | `qualifiedStockOutQuantity` | 合格入库数量(产出) | `qualified_stock_out_quantity` | Decimal |
| 21 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 22 | `dr` | 逻辑删除标记 | `dr` | Short |
| 23 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 24 | `closeRemark` | 关闭说明 | `close_remark` | String |
| 25 | `interactiveMode` | 交互模式 | `interactive_mode` | Short |
| 26 | `mainChangeRateDen` | 生产换算率分母 | `main_change_rateden` | Decimal |
| 27 | `mainChangeRateNum` | 生产换算率分子 | `main_change_ratenum` | Decimal |
| 28 | `outChangeRateDen` | 产出换算率分母 | `out_change_rateden` | Decimal |
| 29 | `outChangeRateNum` | 产出换算率分子 | `out_change_ratenum` | Decimal |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `id` | 派工工作台ID | `sfc.dispatchinfo.DispatchWorkbench` | None | true |
| 3 | `dispatchUserId` | 派工人 | `base.user.User` | Service |  |
| 4 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
