---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.plan.RollingDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 滚动计划明细 (`mr.plan.RollingDetail`)

> MR | 物理表：`mr_plan_rolling_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 滚动计划明细 |
| 物理表 | `mr_plan_rolling_detail` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:16:05.0570` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（9个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `SDQty` | 供需数量 | `sd_qty` | Decimal |
| 2 | `SDType` | 供需类型 | `sd_type` | String |
| 3 | `id` | ID | `id` | Long |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime |
| 5 | `rollingId` | 滚动计划ID | `rolling_id` | a09341d4-3652-4ab6-9396-063efbf0c611 |
| 6 | `timeBucketEndDate` | 时格结束日期 | `time_bucket_end_date` | Date |
| 7 | `timeBucketStartDate` | 时格开始日期 | `time_bucket_start_date` | Date |
| 8 | `timeBucketType` | 时格类型 | `time_bucket_type` | String |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `rollingId` | 滚动计划ID | `mr.plan.Rolling` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
