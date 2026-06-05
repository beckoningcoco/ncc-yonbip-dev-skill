---
tags: ["BIP", "元数据", "数据字典", "QMSQTS", "QMSQTS.traceplan.BillRange"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 单据范围子表 (`QMSQTS.traceplan.BillRange`)

> QMSQTS | 物理表：`qms_qts_trace_bill_range`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 单据范围子表 |
| 物理表 | `qms_qts_trace_bill_range` |
| 数据库 schema | `QMS-DFM` |
| 所属应用 | `QMSQTS` |
| 构建时间 | `2026-06-05 17:01:31.1280` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（18个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `planId` | 追溯方案id | `plan_id` | f2f38b82-14b7-4035-ba4d-1aeebe02a881 |
| 4 | `billType` | 单据类型 | `bill_type` | String |
| 5 | `domain` | 服务域 | `domain` | String |
| 6 | `requestURL` | 请求URL | `request_url` | String |
| 7 | `pageSize` | 每次抽取条数 | `pageSize` | Integer |
| 8 | `billDescription` | 单据说明 | `bill_desc` | String |
| 9 | `dr` | 逻辑删除标记 | `dr` | Short |
| 10 | `createTime` | 创建时间 | `create_time` | DateTime |
| 11 | `createDate` | 创建日期 | `create_date` | Date |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 13 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 14 | `creator` | 创建人名称 | `creator` | String |
| 15 | `modifier` | 修改人名称 | `modifier` | String |
| 16 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 17 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `planId` | 追溯方案id | `QMSQTS.traceplan.TracePlan` | None | true |
