---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.period.PeriodRange"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 排产周期 (`cmp.period.PeriodRange`)

> DCRP | 物理表：`cmp_period_range`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 排产周期 |
| 物理表 | `cmp_period_range` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:59:38.0970` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（12个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `mainId` | 排产周期方案ID | `main_id` | c011da56-f033-4ad2-96c6-fa811c9dc6b1 |
| 4 | `code` | 期间号 | `code` | String |
| 5 | `name` | 期间名称 | `name` | String |
| 6 | `periodYear` | 年度 | `period_year` | Integer |
| 7 | `startDate` | 开始日期 | `start_date` | Date |
| 8 | `endDate` | 结束日期 | `end_date` | Date |
| 9 | `enable` | 启用 | `enable` | sys_intboolean |
| 10 | `enablets` | 启用时间 | `enablets` | DateTime |
| 11 | `disablets` | 停用时间 | `disablets` | DateTime |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `mainId` | 排产周期方案ID | `cmp.period.PeriodScheme` | None | true |
