---
tags: ["BIP", "元数据", "数据字典", "QMSQTS", "QMSQTS.TraceabilityResult.MaxTracedRange"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 最大追溯范围 (`QMSQTS.TraceabilityResult.MaxTracedRange`)

> QMSQTS | 物理表：`qms_qts_max_traced_range`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 最大追溯范围 |
| 物理表 | `qms_qts_max_traced_range` |
| 数据库 schema | `QMS-DFM` |
| 所属应用 | `QMSQTS` |
| 构建时间 | `2026-06-05 17:00:59.2900` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（11个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `billType` | 单据类型 | `bill_type` | String |
| 2 | `endTime` | 结束时间 | `end_time` | String |
| 3 | `id` | id | `id` | Long |
| 4 | `include` | 是否包含 | `include` | Boolean |
| 5 | `multiLine` | 多行存储标记 | `multi_line` | Integer |
| 6 | `productClassList` | 物料分类列表 | `product_class_list` | String |
| 7 | `productList` | 物料列表 | `product_list` | String |
| 8 | `runTime` | 运行时间 | `run_time` | String |
| 9 | `startTime` | 开始时间 | `start_time` | String |
| 10 | `timeRangeList` | 起止时间列表 | `time_range_list` | String |
| 11 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（1个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
