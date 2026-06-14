---
tags: ["BIP", "元数据", "数据字典", "QMSQTS", "QMSQTS.TraceabilityResult.TraceabilityTask"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 追溯任务 (`QMSQTS.TraceabilityResult.TraceabilityTask`)

> QMSQTS | 物理表：`qms_qts_trace_task`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 追溯任务 |
| 物理表 | `qms_qts_trace_task` |
| domain/服务域 | `QMS-DFM` |
| schema | `qms_dfm` |
| 所属应用 | `QMSQTS` |
| 构建时间 | `2026-06-05 17:01:29.7700` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（26个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `TraceabilityResultList` | 追溯结果 | `` | e2a251d9-0802-41a7-aeb6-4d7c379b93f1 |
| 2 | `TraceabilityScheduleTaskList` | 调度任务 | `` | bd3e99eb-5103-419e-8a57-555906be02aa |
| 3 | `calculateTime` | 计算时间 | `calculate_time` | DateTime |
| 4 | `code` | 编码 | `code` | String |
| 5 | `createDate` | 创建日期 | `create_date` | Date |
| 6 | `createTime` | 创建时间 | `create_time` | DateTime |
| 7 | `creator` | 创建人名称 | `creator` | String |
| 8 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 9 | `disablets` | 停用时间 | `disablets` | DateTime |
| 10 | `dr` | 逻辑删除标记 | `dr` | Short |
| 11 | `enable` | 启用 | `enable` | sys_intboolean |
| 12 | `enablets` | 启用时间 | `enablets` | DateTime |
| 13 | `failCount` | 失败次数 | `fail_count` | Integer |
| 14 | `id` | ID | `id` | Long |
| 15 | `latestExeStatus` | 最近一次执行状态 | `latest_exe_status` | String |
| 16 | `latestExeTime` | 最近一次执行时间 | `latest_exe_time` | DateTime |
| 17 | `modifier` | 修改人名称 | `modifier` | String |
| 18 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 19 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 20 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 21 | `name` | 名称 | `name` | String |
| 22 | `pubts` | 时间戳 | `pubts` | DateTime |
| 23 | `successCount` | 成功次数 | `success_count` | Integer |
| 24 | `taskType` | 任务类型 | `task_type` | String |
| 25 | `tracePlanID` | 追溯方案ID | `trace_plan_id` | f2f38b82-14b7-4035-ba4d-1aeebe02a881 |
| 26 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `TraceabilityResultList` | 追溯结果 | `QMSQTS.TraceabilityResult.TraceabilityResult` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `tracePlanID` | 追溯方案ID | `QMSQTS.traceplan.TracePlan` | None |  |
| 6 | `TraceabilityScheduleTaskList` | 调度任务 | `QMSQTS.TraceabilityResult.TraceabilityScheduleTask` | None | true |
