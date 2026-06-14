---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.processFlowCard.processFlowCardPlanSuspend"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工序流转卡工序挂起解除信息 (`sfc.processFlowCard.processFlowCardPlanSuspend`)

> IMPSFC | 物理表：`imp_sfc_procflowcard_plan_suspend`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工序流转卡工序挂起解除信息 |
| 物理表 | `imp_sfc_procflowcard_plan_suspend` |
| domain/服务域 | `IMP-SFC` |
| schema | `production_order` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:26:24.6640` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（17个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `dr` | 逻辑删除标记 | `dr` | Short |
| 2 | `holdDate` | 挂起日期 | `hold_date` | Date |
| 3 | `holdReasonId` | 挂起原因 | `hold_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 4 | `holdTime` | 挂起时间 | `hold_time` | DateTime |
| 5 | `holdUserId` | 挂起人 | `hold_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 6 | `id` | ID | `id` | Long |
| 7 | `procFlowCardPlanId` | 工序流转卡工序 | `process_flow_plan_id` | e4a42545-5567-4ba7-be49-38a63843cfab |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime |
| 9 | `releaseDate` | 解除日期 | `release_date` | Date |
| 10 | `releaseReasonId` | 解除原因 | `release_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 11 | `releaseTime` | 解除时间 | `release_time` | DateTime |
| 12 | `releaseUserId` | 解除人 | `release_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 13 | `rowno` | 序号 | `rowno` | Integer |
| 14 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 15 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 16 | `holdDesc` | 挂起说明 | `hold_desc` | String |
| 17 | `releaseDesc` | 解除说明 | `release_desc` | String |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `releaseUserId` | 解除人 | `base.user.User` | Service |  |
| 2 | `holdUserId` | 挂起人 | `base.user.User` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `procFlowCardPlanId` | 工序流转卡工序 | `sfc.processFlowCard.processFlowCardPlan` | None | true |
| 5 | `releaseReasonId` | 解除原因 | `aa.reason.Reason` | Service |  |
| 6 | `holdReasonId` | 挂起原因 | `aa.reason.Reason` | Service |  |
| 7 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
