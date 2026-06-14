---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.procPlan.ProcPlanExt"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工序作业计划扩展 (`sfc.procPlan.ProcPlanExt`)

> IMPSFC | 物理表：`imp_sfc_proc_plan_ext`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工序作业计划扩展 |
| 物理表 | `imp_sfc_proc_plan_ext` |
| domain/服务域 | `IMP-SFC` |
| schema | `production_order` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:24:13.0160` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | 48e1a533-51f0-4a5a-9465-6fff30ce5229 | 工序作业计划id |

---

## 直接属性（29个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `closeRemark` | 关闭说明 | `close_remark` | String |
| 2 | `dispatchTime` | 派工时间 | `dispatch_time` | DateTime |
| 3 | `dispatchUserId` | 派工人 | `dispatch_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 4 | `dr` | 逻辑删除标记 | `dr` | Short |
| 5 | `firstCheckStatus` | 首检状态 | `first_check_status` | String |
| 6 | `firstCheckType` | 首检控制方式 | `first_check_type` | String |
| 7 | `holdDesc` | 挂起说明 | `hold_desc` | String |
| 8 | `id` | 工序作业计划id | `id` | 48e1a533-51f0-4a5a-9465-6fff30ce5229 |
| 9 | `inspectionStatus` | 检验状态 | `inspection_status` | Short |
| 10 | `interactiveMode` | 交互模式 | `interactive_mode` | Short |
| 11 | `mainChangeRateDen` | 生产换算率分母 | `main_change_rateden` | Decimal |
| 12 | `mainChangeRateNum` | 生产换算率分子 | `main_change_ratenum` | Decimal |
| 13 | `materialApplyStatus` | 领料申请状态 | `material_apply_status` | Short |
| 14 | `materialStatus` | 领料状态 | `material_status` | Short |
| 15 | `outChangeRateDen` | 产出换算率分母 | `out_change_rateden` | Decimal |
| 16 | `outChangeRateNum` | 产出换算率分子 | `out_change_ratenum` | Decimal |
| 17 | `qualifiedStockAuxiliaryQuantity` | 合格入库件数 | `qualified_stock_auxiliary_qua` | Decimal |
| 18 | `qualifiedStockOutQuantity` | 合格入库数量(产出) | `qualified_stock_out_quantity` | Decimal |
| 19 | `qualifiedStockQuantity` | 合格入库数量 | `qualified_stock_quantity` | Decimal |
| 20 | `scrapNoStockAuxQty` | 报废不入库件数 | `scrap_no_stock_aux_qty` | Decimal |
| 21 | `scrapNoStockOutQty` | 报废不入库数量(产出) | `scrap_no_stock_out_qty` | Decimal |
| 22 | `scrapNoStockQty` | 报废不入库数量 | `scrap_no_stock_qty` | Decimal |
| 23 | `scrapStockAuxiliaryQuantity` | 报废入库件数 | `scrap_stock_auxiliary_quantity` | Decimal |
| 24 | `scrapStockOutQuantity` | 报废入库数量(产出) | `scrap_stock_out_quantity` | Decimal |
| 25 | `scrapStockQuantity` | 报废入库数量 | `scrap_stock_quantity` | Decimal |
| 26 | `stockStatus` | 入库状态 | `stock_status` | Short |
| 27 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 28 | `totalCheckNum` | 累计检验数量 | `total_check_num` | Decimal |
| 29 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `id` | 工序作业计划id | `sfc.procPlan.ProcPlan` | None | true |
| 3 | `dispatchUserId` | 派工人 | `base.user.User` | Service |  |
| 4 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
