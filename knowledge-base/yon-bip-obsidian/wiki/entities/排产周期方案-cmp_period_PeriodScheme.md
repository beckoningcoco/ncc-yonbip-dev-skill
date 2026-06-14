---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.period.PeriodScheme"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 排产周期方案 (`cmp.period.PeriodScheme`)

> DCRP | 物理表：`cmp_period_scheme`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 排产周期方案 |
| 物理表 | `cmp_period_scheme` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:58:01.4770` |

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
| 3 | `planOrgId` | 计划组织 | `plan_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 4 | `code` | 编码 | `code` | String |
| 5 | `name` | 名称 | `name` | String |
| 6 | `memo` | 备注 | `memo` | String |
| 7 | `periodType` | 期间类型 | `period_type` | String |
| 8 | `periodDayQty` | 期间天数 | `period_day_qty` | Integer |
| 9 | `periodQty` | 期间数 | `period_qty` | Integer |
| 10 | `startDate` | 起始时间 | `start_date` | Date |
| 11 | `endDate` | 结束时间 | `end_date` | Date |
| 12 | `bussinessKey` | 业务主键 | `bussiness_key` | String |
| 13 | `dr` | 逻辑删除标记 | `dr` | Short |
| 14 | `enable` | 启用 | `enable` | sys_intboolean |
| 15 | `enablets` | 启用时间 | `enablets` | DateTime |
| 16 | `disablets` | 停用时间 | `disablets` | DateTime |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime |
| 18 | `periodschemeList` | 排产周期 | `` | 0363b9a9-e3f0-4094-898e-6144562e115f |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `periodschemeList` | 排产周期 | `cmp.period.PeriodRange` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `planOrgId` | 计划组织 | `org.func.BaseOrg` | Service |  |
