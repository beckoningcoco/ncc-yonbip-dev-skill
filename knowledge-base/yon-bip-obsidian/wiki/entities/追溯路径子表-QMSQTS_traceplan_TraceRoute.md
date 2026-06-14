---
tags: ["BIP", "元数据", "数据字典", "QMSQTS", "QMSQTS.traceplan.TraceRoute"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 追溯路径子表 (`QMSQTS.traceplan.TraceRoute`)

> QMSQTS | 物理表：`qms_qts_trace_route`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 追溯路径子表 |
| 物理表 | `qms_qts_trace_route` |
| domain/服务域 | `QMS-DFM` |
| schema | `qms_dfm` |
| 所属应用 | `QMSQTS` |
| 构建时间 | `2026-06-05 17:01:45.3350` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（23个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `planId` | 追溯方案id | `plan_id` | f2f38b82-14b7-4035-ba4d-1aeebe02a881 |
| 4 | `traceGroupNo` | 追溯组号 | `trace_group_no` | Decimal |
| 5 | `traceDescription` | 追溯说明 | `trace_description` | String |
| 6 | `sourceDoc` | 来源单据 | `source_doc` | String |
| 7 | `purposeDoc` | 目的单据 | `purpose_doc` | String |
| 8 | `matchType` | 匹配方式 | `match_type` | Short |
| 9 | `matchIdentify` | 匹配标识 | `match_identify` | String |
| 10 | `customCond` | 自定义条件 | `custom_cond` | String |
| 11 | `isTrace` | 是否参与追溯 | `is_trace` | Short |
| 12 | `lineNo` | 行号 | `line_no` | Decimal |
| 13 | `groupNoDescription` | 组号说明 | `groupno_desc` | String |
| 14 | `dr` | 逻辑删除标记 | `dr` | Short |
| 15 | `createTime` | 创建时间 | `create_time` | DateTime |
| 16 | `createDate` | 创建日期 | `create_date` | Date |
| 17 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 18 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 19 | `creator` | 创建人名称 | `creator` | String |
| 20 | `modifier` | 修改人名称 | `modifier` | String |
| 21 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 22 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 23 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `planId` | 追溯方案id | `QMSQTS.traceplan.TracePlan` | None | true |
