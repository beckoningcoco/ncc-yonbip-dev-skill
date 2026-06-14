---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.procPlan.ProcPlanSuspend"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工序作业计划挂起解除信息 (`sfc.procPlan.ProcPlanSuspend`)

> IMPSFC | 物理表：`imp_sfc_proc_plan_suspend`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工序作业计划挂起解除信息 |
| 物理表 | `imp_sfc_proc_plan_suspend` |
| domain/服务域 | `IMP-SFC` |
| schema | `production_order` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:22:12.1980` |

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
| 3 | `id` | ID | `id` | Long |
| 4 | `procPlanId` | 工序作业计划 | `proc_plan_id` | 48e1a533-51f0-4a5a-9465-6fff30ce5229 |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime |
| 6 | `releaseDate` | 解除日期 | `release_date` | Date |
| 7 | `rowno` | 序号 | `rowno` | Integer |
| 8 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 10 | `holdReasonId` | 挂起原因ID | `hold_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 11 | `holdUserId` | 挂起人ID | `hold_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 12 | `holdTime` | 挂起时间 | `hold_time` | DateTime |
| 13 | `releaseReasonId` | 解挂原因id | `release_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 14 | `releaseUserId` | 解除人ID | `release_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 15 | `releaseTime` | 解挂时间 | `release_time` | DateTime |
| 16 | `holdDesc` | 挂起说明 | `hold_desc` | String |
| 17 | `procPlanDetailId` | 工序作业计划明细 | `proc_plan_detail_id` | 7e33a4bf-edce-447c-8e6f-0717cec2b092 |
| 18 | `releaseDesc` | 解除说明 | `release_desc` | String |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `procPlanId` | 工序作业计划 | `sfc.procPlan.ProcPlan` | None | true |
| 2 | `releaseUserId` | 解除人ID | `base.user.User` | Service |  |
| 3 | `holdUserId` | 挂起人ID | `base.user.User` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `releaseReasonId` | 解挂原因id | `aa.reason.Reason` | Service |  |
| 6 | `procPlanDetailId` | 工序作业计划明细 | `sfc.procPlan.ProcPlanDetail` | None |  |
| 7 | `holdReasonId` | 挂起原因ID | `aa.reason.Reason` | Service |  |
| 8 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
