---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.schedulingGoalData.SchedulingGoalRtDataList"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 排产目标值相关目标项数据 (`cmp.schedulingGoalData.SchedulingGoalRtDataList`)

> DCRP | 物理表：`cmp_scheduling_goal_rt_data_list`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 排产目标值相关目标项数据 |
| 物理表 | `cmp_scheduling_goal_rt_data_list` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:59:42.1230` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（6个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `mainId` | 排产目标值数据ID | `main_id` | 89db6307-dbb0-401e-8abf-474cb1a36744 |
| 4 | `relTargetItem` | 相关目标项 | `rel_target_item` | String |
| 5 | `relTargetValue` | 相关目标值 | `rel_target_value` | String |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `mainId` | 排产目标值数据ID | `cmp.schedulingGoalData.SchedulingGoalData` | None | true |
