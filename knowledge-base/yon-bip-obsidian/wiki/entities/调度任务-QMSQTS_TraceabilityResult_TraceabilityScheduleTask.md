---
tags: ["BIP", "元数据", "数据字典", "QMSQTS", "QMSQTS.TraceabilityResult.TraceabilityScheduleTask"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 调度任务 (`QMSQTS.TraceabilityResult.TraceabilityScheduleTask`)

> QMSQTS | 物理表：`qms_qts_trace_task_s`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 调度任务 |
| 物理表 | `qms_qts_trace_task_s` |
| 数据库 schema | `QMS-DFM` |
| 所属应用 | `QMSQTS` |
| 构建时间 | `2026-06-05 17:01:28.4380` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（27个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `createDate` | 创建日期 | `create_date` | Date |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime |
| 3 | `creator` | 创建人名称 | `creator` | String |
| 4 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 5 | `dr` | 逻辑删除标记 | `dr` | Short |
| 6 | `endDate` | 任务结束日期 | `end_date` | Date |
| 7 | `endTime` | 周期结束时间 | `end_time` | String |
| 8 | `exeFrequency` | 执行频率 | `exe_frequency` | String |
| 9 | `exeInterval` | 执行间隔 | `exe_interval` | Integer |
| 10 | `executeTime` | 单次执行时间 | `execute_time` | String |
| 11 | `id` | ID | `id` | Long |
| 12 | `modifier` | 修改人名称 | `modifier` | String |
| 13 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 14 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 15 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 16 | `periodMode` | 周期执行间隔单位 | `period_mode` | String |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime |
| 18 | `scheduleTaskID` | 调度任务ID | `schedule_task_id` | String |
| 19 | `specificTime` | 具体时间 | `specific_time` | String |
| 20 | `startDate` | 任务起始日期 | `start_date` | Date |
| 21 | `startTime` | 周期开始时间 | `start_time` | String |
| 22 | `taskID` | 任务ID | `task_id` | 1192c4b9-959c-4d85-b3ac-648ab3e0fd2e |
| 23 | `timeConfig` | 时间配置 | `time_config` | String |
| 24 | `timeList` | 时间列表 | `time_list` | String |
| 25 | `timeSpan` | 时间间隔 | `time_span` | Integer |
| 26 | `timeZone` | 时区 | `time_zone` | String |
| 27 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `taskID` | 任务ID | `QMSQTS.TraceabilityResult.TraceabilityTask` | None | true |
