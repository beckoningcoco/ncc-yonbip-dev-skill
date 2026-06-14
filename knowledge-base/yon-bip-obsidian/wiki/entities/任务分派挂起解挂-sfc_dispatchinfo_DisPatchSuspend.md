---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.dispatchinfo.DisPatchSuspend"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 任务分派挂起解挂 (`sfc.dispatchinfo.DisPatchSuspend`)

> IMPSFC | 物理表：`imp_sfc_proc_plan_suspend`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 任务分派挂起解挂 |
| 物理表 | `imp_sfc_proc_plan_suspend` |
| domain/服务域 | `IMP-SFC` |
| schema | `production_order` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:23:49.9650` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（18个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `dr` | 逻辑删除标记 | `dr` | Short |
| 2 | `holdDate` | 挂起日期 | `hold_date` | Date |
| 3 | `holdDesc` | 挂起说明 | `hold_desc` | String |
| 4 | `holdReasonId` | 挂起原因 | `hold_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 5 | `holdTime` | 挂起时间 | `hold_time` | DateTime |
| 6 | `holdUserId` | 挂起人 | `hold_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 7 | `id` | ID | `id` | Long |
| 8 | `procPlanDetailId` | 工序作业计划明细 | `proc_plan_detail_id` | 7e33a4bf-edce-447c-8e6f-0717cec2b092 |
| 9 | `procPlanId` | 派工工作台ID | `proc_plan_id` | 761ed5f1-5945-4f06-9c91-92368fe92ebe |
| 10 | `pubts` | 时间戳 | `pubts` | DateTime |
| 11 | `releaseDate` | 解除日期 | `release_date` | Date |
| 12 | `releaseDesc` | 解除说明 | `release_desc` | String |
| 13 | `releaseReasonId` | 解除原因 | `release_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 14 | `releaseTime` | 解除时间 | `release_time` | DateTime |
| 15 | `releaseUserId` | 解除人 | `release_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 16 | `rowno` | 序号 | `rowno` | Integer |
| 17 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 18 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `procPlanId` | 派工工作台ID | `sfc.dispatchinfo.DispatchWorkbench` | None | true |
| 2 | `releaseUserId` | 解除人 | `base.user.User` | Service |  |
| 3 | `holdUserId` | 挂起人 | `base.user.User` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `releaseReasonId` | 解除原因 | `aa.reason.Reason` | Service |  |
| 6 | `procPlanDetailId` | 工序作业计划明细 | `sfc.procPlan.ProcPlanDetail` | None |  |
| 7 | `holdReasonId` | 挂起原因 | `aa.reason.Reason` | Service |  |
| 8 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
