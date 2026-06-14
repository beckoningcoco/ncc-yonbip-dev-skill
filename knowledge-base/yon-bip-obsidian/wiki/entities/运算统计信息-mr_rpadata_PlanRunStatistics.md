---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.rpadata.PlanRunStatistics"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 运算统计信息 (`mr.rpadata.PlanRunStatistics`)

> MR | 物理表：`mr_plan_run_statistics`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 运算统计信息 |
| 物理表 | `mr_plan_run_statistics` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:13:29.0030` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（48个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `SDMatchDuration` | 供需匹配 | `sd_match_duration` | Integer |
| 2 | `bomExceptionSum` | BOM例外个数 | `bom_ep_sum` | Integer |
| 3 | `collectBomDuration` | 收集BOM | `collect_bom_duration` | Integer |
| 4 | `collectDemandDuration` | 收集需求 | `collect_demand_duration` | Integer |
| 5 | `collectSupplyDuration` | 收集供应 | `collect_supply_duration` | Integer |
| 6 | `dataCheckDuration` | 数据检查 | `data_check_duration` | Integer |
| 7 | `dataExceptionSum` | 数据例外个数 | `data_ep_sum` | Integer |
| 8 | `demandExceedExceptionSum` | 需求超出上限例外个数 | `demand_exceed_ep_sum` | Integer |
| 9 | `demandExceptionSum` | 需求例外个数 | `demand_ep_sum` | Integer |
| 10 | `demandSum` | 独立需求单据张数 | `demand_sum` | Integer |
| 11 | `dr` | 逻辑删除标记 | `dr` | Short |
| 12 | `exceptionDuration` | 生成例外信息 | `exception_duration` | Integer |
| 13 | `exceptionSum` | 例外信息个数 | `exception_sum` | Integer |
| 14 | `generateIODDuration` | 生成组织间需求 | `gen_iod_duration` | Integer |
| 15 | `generatePlanDuration` | 生成计划订单 | `gen_plan_duration` | Integer |
| 16 | `id` | ID | `id` | Long |
| 17 | `initDuration` | 初始化 | `init_duration` | Integer |
| 18 | `internalDemandSum` | 内部独立需求个数 | `internal_sum` | Integer |
| 19 | `lowLevelDuration` | 低阶码计算 | `low_level_duration` | Integer |
| 20 | `orgDemandSum` | 拉取组织间需求个数 | `org_demand_sum` | Integer |
| 21 | `orgPlanOrderSum` | 产生组织间需求单个数 | `org_plan_order_sum` | Integer |
| 22 | `outSourceOrderSum` | 拉取委外订单个数 | `outsource_order_sum` | Integer |
| 23 | `outputDuration` | 资料输出 | `output_duration` | Integer |
| 24 | `planEndDate` | 计划截止日期 | `plan_end_date` | DateTime |
| 25 | `planErrorCode` | 错误编码 | `plan_error_code` | String |
| 26 | `planOrderSum` | 计划订单生成张数 | `plan_order_sum` | Integer |
| 27 | `planParamId` | 计划名称 | `plan_param_id` | 0d105898-52f1-4a97-971d-b334f721c74b |
| 28 | `planParamVersion` | 计划版本 | `plan_param_version` | Integer |
| 29 | `planStartDate` | 计划开始日期 | `plan_start_date` | DateTime |
| 30 | `priorityCalcDuration` | 需求优先级计算 | `priority_calc_duration` | Integer |
| 31 | `productSum` | 物料个数 | `product_sum` | Integer |
| 32 | `productionOrderSum` | 拉取生产订单个数 | `production_order_sum` | Integer |
| 33 | `projectDemandSum` | 物资需求单个数 | `project_sum` | Integer |
| 34 | `pubts` | 时间戳 | `pubts` | DateTime |
| 35 | `purchaseOrderSum` | 拉取采购订单个数 | `purchase_order_sum` | Integer |
| 36 | `reExplodeDuration` | 重展备料 | `re_explode_duration` | Integer |
| 37 | `recordId` | 运算快照id | `record_id` | fd0f9ce5-d5c7-43cb-812b-41733565df18 |
| 38 | `resetSum` | 产生重排建议个数 | `reset_sum` | Integer |
| 39 | `runEndTime` | 运算结束时间 | `run_end_time` | DateTime |
| 40 | `runStartTime` | 运算开始时间 | `run_start_time` | DateTime |
| 41 | `runStatus` | 运算状态 | `run_status` | Integer |
| 42 | `substituteExceptionSum` | 替代例外个数 | `substitute_ep_sum` | Integer |
| 43 | `supplyPlanOrderSum` | 产生供应计划订单个数 | `supply_plan_order_sum` | Integer |
| 44 | `supplySum` | 供给单据张数 | `supply_sum` | Integer |
| 45 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 46 | `transferOrderSum` | 拉取调拨订单个数 | `transfer_order_sum` | Integer |
| 47 | `voucherOrderSum` | 拉取销售订单个数 | `voucher_order_sum` | Integer |
| 48 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `recordId` | 运算快照id | `mr.rpadata.Record` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `planParamId` | 计划名称 | `mr.planworkbench.PlanParam` | None |  |
| 4 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
