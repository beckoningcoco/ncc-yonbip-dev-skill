---
tags: ["BIP", "元数据", "数据字典", "QMSQTS", "QMSQTS.TraceabilityPool.OrderTraceabilityPoolSN"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 订单追溯池序列号子表 (`QMSQTS.TraceabilityPool.OrderTraceabilityPoolSN`)

> QMSQTS | 物理表：`qms_qts_o_tracepool_sn`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 订单追溯池序列号子表 |
| 物理表 | `qms_qts_o_tracepool_sn` |
| 数据库 schema | `QMS-DFM` |
| 所属应用 | `QMSQTS` |
| 构建时间 | `2026-06-05 17:01:18.5610` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（17个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `billType` | 单据类型 | `bill_type` | String |
| 2 | `createDate` | 创建日期 | `create_date` | Date |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime |
| 4 | `creator` | 创建人名称 | `creator` | String |
| 5 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 6 | `dr` | 逻辑删除标记 | `dr` | Short |
| 7 | `grandchildID` | 序列号孙表ID | `grandchild_id` | Long |
| 8 | `id` | id | `id` | Long |
| 9 | `modifier` | 修改人名称 | `modifier` | String |
| 10 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 11 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 13 | `orderTPID` | 订单追溯池ID | `order_tp_id` | b11dec38-ee5e-43ed-867d-f96d7a4f86f0 |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime |
| 15 | `serialNumber` | 序列号 | `serial_number` | String |
| 16 | `serialNumberID` | 序列号主档ID | `serial_number_id` | Long |
| 17 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `orderTPID` | 订单追溯池ID | `QMSQTS.TraceabilityPool.OrderTraceabilityPool` | None | true |
