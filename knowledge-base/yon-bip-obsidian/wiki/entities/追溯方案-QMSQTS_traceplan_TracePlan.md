---
tags: ["BIP", "元数据", "数据字典", "QMSQTS", "QMSQTS.traceplan.TracePlan"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 追溯方案 (`QMSQTS.traceplan.TracePlan`)

> QMSQTS | 物理表：`qms_qts_trace_plan`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 追溯方案 |
| 物理表 | `qms_qts_trace_plan` |
| 数据库 schema | `QMS-DFM` |
| 所属应用 | `QMSQTS` |
| 构建时间 | `2026-06-05 17:01:34.0140` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（29个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `orgId` | 组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 4 | `code` | 编码 | `code` | String |
| 5 | `applyOrgId` | 使用组织 | `applyorg_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 6 | `name` | 名称 | `name` | String |
| 7 | `queryDirection` | 查询方向 | `query_direction` | Short |
| 8 | `isSystem` | 系统预置 | `is_system` | Short |
| 9 | `note` | 备注 | `note` | String |
| 10 | `traceRange` | 追溯范围 | `trace_range` | Short |
| 11 | `extractRangeType` | 抽取范围类型 | `extract_range` | Short |
| 12 | `offsetPeriod` | 偏移期间 | `offset_period` | Integer |
| 13 | `extractRule` | 抽取截止时间规则 | `extract_rule` | Short |
| 14 | `defineCharacteristics` | 自定义项特征组 | `define_cts` | 41ce31b5-0202-450d-8cdd-7222e0a5dde1 |
| 15 | `enable` | 启用 | `enable` | Short |
| 16 | `pageSize` | 每次抽取条数 | `pageSize` | Integer |
| 17 | `dr` | 逻辑删除标记 | `dr` | Short |
| 18 | `createTime` | 创建时间 | `create_time` | DateTime |
| 19 | `createDate` | 创建日期 | `create_date` | Date |
| 20 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 21 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 22 | `creator` | 创建人名称 | `creator` | String |
| 23 | `modifier` | 修改人名称 | `modifier` | String |
| 24 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 25 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 26 | `pubts` | 时间戳 | `pubts` | DateTime |
| 27 | `billRangeList` | 单据范围子表 | `` | 9ee550dc-ae43-4bb4-98c9-7343a8820fc7 |
| 28 | `productRangeList` | 物料范围子表 | `` | 4af32a88-eab2-45e1-a0e0-18e45fdc350e |
| 29 | `traceRouteList` | 追溯路径子表 | `` | ef76bd38-0f57-45b2-bdc1-5f3fe6dc4ad9 |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `applyOrgId` | 使用组织 | `org.func.BaseOrg` | Service |  |
| 2 | `defineCharacteristics` | 自定义项特征组 | `QMSQTS.traceplan.TracePlanDefineCharacter` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `productRangeList` | 物料范围子表 | `QMSQTS.traceplan.ProductRange` | None | true |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `billRangeList` | 单据范围子表 | `QMSQTS.traceplan.BillRange` | None | true |
| 8 | `traceRouteList` | 追溯路径子表 | `QMSQTS.traceplan.TraceRoute` | None | true |
| 9 | `orgId` | 组织 | `org.func.BaseOrg` | Service |  |
