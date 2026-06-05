---
tags: ["BIP", "元数据", "数据字典", "QMSQTS", "QMSQTS.TraceabilityResult.TraceabilityResultBody"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 追溯结果表体 (`QMSQTS.TraceabilityResult.TraceabilityResultBody`)

> QMSQTS | 物理表：`qms_qts_traceresult_body`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 追溯结果表体 |
| 物理表 | `qms_qts_traceresult_body` |
| 数据库 schema | `QMS-DFM` |
| 所属应用 | `QMSQTS` |
| 构建时间 | `2026-06-05 17:01:44.0400` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（26个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | id | `id` | Long |
| 3 | `traceResultID` | 追溯结果ID | `trace_result_id` | e2a251d9-0802-41a7-aeb6-4d7c379b93f1 |
| 4 | `executeStatus` | 执行状态 | `execute_status` | Integer |
| 5 | `success` | 是否执行成功 | `success` | String |
| 6 | `dataAmount` | 抽取数据总数 | `data_amount` | Integer |
| 7 | `billType` | 单据类型 | `bill_type` | String |
| 8 | `errorInfo` | 错误信息 | `error_info` | String |
| 9 | `billRowType` | 单据行类型 | `bill_row_type` | Integer |
| 10 | `actualAmount` | 实际抽取总数 | `actual_amount` | Integer |
| 11 | `takeTime` | 耗时(分钟) | `take_time` | String |
| 12 | `executeTime` | 数据收集执行时间 | `execute_time` | DateTime |
| 13 | `pageSize` | 每次抽取条数 | `pageSize` | Integer |
| 14 | `dataStatus` | 数据生成状态 | `data_status` | String |
| 15 | `dataErrorInfo` | 数据生成错误信息 | `data_error_info` | String |
| 16 | `dataTakeTime` | 数据生成耗时 | `data_take_time` | String |
| 17 | `createTime` | 创建时间 | `create_time` | DateTime |
| 18 | `createDate` | 创建日期 | `create_date` | Date |
| 19 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 20 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 21 | `creator` | 创建人名称 | `creator` | String |
| 22 | `modifier` | 修改人名称 | `modifier` | String |
| 23 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 24 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 25 | `dr` | 逻辑删除标记 | `dr` | Short |
| 26 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `traceResultID` | 追溯结果ID | `QMSQTS.TraceabilityResult.TraceabilityResult` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
