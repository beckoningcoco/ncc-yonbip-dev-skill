---
tags: ["BIP", "元数据", "数据字典", "QMSQTS", "QMSQTS.TraceabilityResult.TraceabilityResult"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 追溯结果 (`QMSQTS.TraceabilityResult.TraceabilityResult`)

> QMSQTS | 物理表：`qms_qts_traceresult`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 追溯结果 |
| 物理表 | `qms_qts_traceresult` |
| domain/服务域 | `QMS-DFM` |
| schema | `qms_dfm` |
| 所属应用 | `QMSQTS` |
| 构建时间 | `2026-06-05 17:01:25.3430` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（28个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `taskID` | 追溯任务ID | `task_id` | 1192c4b9-959c-4d85-b3ac-648ab3e0fd2e |
| 4 | `orgId` | 组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 5 | `creator` | 创建人名称 | `creator` | String |
| 6 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 7 | `successCount` | 成功数量 | `success_count` | Integer |
| 8 | `otherException` | 其他异常 | `other_exception` | String |
| 9 | `takeTime` | 总耗时(分钟) | `take_time` | String |
| 10 | `modifier` | 修改人名称 | `modifier` | String |
| 11 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 12 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 13 | `executeStatus` | 执行状态 | `execute_status` | Integer |
| 14 | `errorInfo` | 错误信息 | `error_info` | String |
| 15 | `forceLevel` | 强制等级 | `force_level` | String |
| 16 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 17 | `createTime` | 创建时间 | `create_time` | DateTime |
| 18 | `success` | 是否执行成功 | `success` | String |
| 19 | `tracePlanID` | 追溯方案ID | `trace_plan_id` | f2f38b82-14b7-4035-ba4d-1aeebe02a881 |
| 20 | `startTime` | 抽取数据起始时间 | `start_time` | DateTime |
| 21 | `endTime` | 抽取数据截止时间 | `end_time` | DateTime |
| 22 | `calculateTime` | 计算时间 | `calculate_time` | DateTime |
| 23 | `pubts` | 时间戳 | `pubts` | DateTime |
| 24 | `createDate` | 创建日期 | `create_date` | Date |
| 25 | `executeTime` | 数据收集执行时间 | `execute_time` | DateTime |
| 26 | `dr` | 逻辑删除标记 | `dr` | Short |
| 27 | `TraceabilityResultBodyList` | 追溯结果表体 | `` | 6d91e08c-9fa4-4dc5-8e23-54eab108180a |
| 28 | `noteInfo` | 备注 | `note_info` | String |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `TraceabilityResultBodyList` | 追溯结果表体 | `QMSQTS.TraceabilityResult.TraceabilityResultBody` | None | true |
| 5 | `tracePlanID` | 追溯方案ID | `QMSQTS.traceplan.TracePlan` | None |  |
| 6 | `orgId` | 组织 | `org.func.BaseOrg` | Service |  |
| 7 | `taskID` | 追溯任务ID | `QMSQTS.TraceabilityResult.TraceabilityTask` | None | true |
