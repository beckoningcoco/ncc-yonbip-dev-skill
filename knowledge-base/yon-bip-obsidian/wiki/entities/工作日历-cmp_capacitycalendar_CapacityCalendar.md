---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.capacitycalendar.CapacityCalendar"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工作日历 (`cmp.capacitycalendar.CapacityCalendar`)

> DCRP | 物理表：`cmp_capacity_calendar`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工作日历 |
| 物理表 | `cmp_capacity_calendar` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:58:08.9400` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（6个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `workingCalendarId` | 工作日历ID | `working_calendar_id` | 54e52ba8-a2cf-47cc-b47b-95fc6f4dffbd |
| 4 | `demandDatetime` | 日期 | `demand_datetime` | DateTime |
| 5 | `isWorkingTime` | 是否工作时间 | `is_working_time` | Short |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `workingCalendarId` | 工作日历ID | `calendar.workingCalendar.WorkingCalendar` | Service |  |
