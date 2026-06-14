---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.capacityplanlog.CapacityPlanLog"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 产能计划日志 (`cmp.capacityplanlog.CapacityPlanLog`)

> DCRP | 物理表：`cmp_capacity_plan_log`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 产能计划日志 |
| 物理表 | `cmp_capacity_plan_log` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:58:30.9210` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（34个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `calculateId` | 产能运算ID | `calculate_id` | 12a493ee-e7d1-4aac-b52d-8dd0dc02121b |
| 4 | `logTime` | 日志时间 | `log_time` | DateTime |
| 5 | `message` | 信息 | `message` | String |
| 6 | `keyPoint` | 关键信息 | `key_point` | String |
| 7 | `stackTrace` | 堆栈信息 | `stack_trace` | String |
| 8 | `level` | 级别 | `level` | Short |
| 9 | `type` | 类型 | `type` | Short |
| 10 | `traceId` | 追踪号 | `trace_id` | Long |
| 11 | `calStepId` | 步骤ID | `cal_step_id` | 193f4be0-344b-4d24-8692-a750270a13b9 |
| 12 | `calStepCode` | 步骤编码 | `cal_step_code` | String |
| 13 | `exceptionInfoId` | 例外信息 | `exception_info_id` | 172c58c3-5be8-4ca0-abd1-6a84893ef545 |
| 14 | `voucherTransTypeId` | 交易类型 | `voucher_trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 15 | `srcDocId` | 来源单据ID | `src_doc_id` | Long |
| 16 | `srcDocType` | 来源单据类型 | `src_doc_type` | String |
| 17 | `srcDocNo` | 来源单据号 | `src_doc_no` | String |
| 18 | `srcDocLineNo` | 来源单据行号 | `src_doc_line_no` | String |
| 19 | `srcDocDate` | 来源单据日期 | `src_doc_date` | DateTime |
| 20 | `productId` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 21 | `quantity` | 数量 | `quantity` | Decimal |
| 22 | `unit` | 单位 | `unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 23 | `ansType` | 日志分析类型 | `ans_type` | Short |
| 24 | `duration` | 耗时(毫秒) | `duration` | Long |
| 25 | `dr` | 逻辑删除标记 | `dr` | Short |
| 26 | `createTime` | 创建时间 | `create_time` | DateTime |
| 27 | `createDate` | 创建日期 | `create_date` | Date |
| 28 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 29 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 30 | `creator` | 创建人名称 | `creator` | String |
| 31 | `modifier` | 修改人名称 | `modifier` | String |
| 32 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 33 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 34 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `unit` | 单位 | `pc.unit.Unit` | Service |  |
| 2 | `productId` | 物料ID | `pc.product.Product` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `exceptionInfoId` | 例外信息 | `cmp.exceptioninfo.ExceptionInfo` | None |  |
| 5 | `calculateId` | 产能运算ID | `cmp.capacitycalculate.CapacityCalculate` | None |  |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 8 | `calStepId` | 步骤ID | `cmp.calstep.CalStep` | None |  |
| 9 | `voucherTransTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
