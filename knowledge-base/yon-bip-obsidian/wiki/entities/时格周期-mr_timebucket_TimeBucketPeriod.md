---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.timebucket.TimeBucketPeriod"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 时格周期 (`mr.timebucket.TimeBucketPeriod`)

> MR | 物理表：`mr_time_bucket_period`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 时格周期 |
| 物理表 | `mr_time_bucket_period` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 09:34:43.2220` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 周期id |

---

## 直接属性（8个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `id` | 周期id | `id` | Long |
| 4 | `timeBucketId` | 时格id | `time_bucket_id` | 4e2f676d-fbf6-448e-b43f-aae7fd6fa808 |
| 5 | `periodType` | 期间类型 | `period_type` | PeriodTypeEnum |
| 6 | `periodCounts` | 期间数 | `period_counts` | String |
| 7 | `periodStart` | 起始位置 | `period_start` | Integer |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `timeBucketId` | 时格id | `mr.timebucket.TimeBucket` | None | true |
| 3 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
