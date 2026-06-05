---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.dailydemandcapacity.DailyUsageLoc"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 日占用位置明细 (`cmp.dailydemandcapacity.DailyUsageLoc`)

> DCRP | 物理表：`cmp_daily_usage_loc`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 日占用位置明细 |
| 物理表 | `cmp_daily_usage_loc` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:59:26.7270` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（17个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `capacityObjectId` | 加工中心 | `capacity_object_id` | e3034100-f166-46e1-b750-d85fb84474b7 |
| 2 | `capacityObjectLocCode` | 模腔位置 | `capacity_object_loc_code` | String |
| 3 | `createDate` | 创建日期 | `create_date` | Date |
| 4 | `createTime` | 创建时间 | `create_time` | DateTime |
| 5 | `creator` | 创建人名称 | `creator` | String |
| 6 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 7 | `dailyDemandCapacityId` | 日占用 | `daily_demand_capacity_id` | 4a455939-629e-4604-8055-0ec3c57db187 |
| 8 | `id` | ID | `id` | Long |
| 9 | `modifier` | 修改人名称 | `modifier` | String |
| 10 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 11 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime |
| 14 | `schedulingEndDate` | 排产结束时间 | `scheduling_end_date` | DateTime |
| 15 | `schedulingStartDate` | 排产开始时间 | `scheduling_start_date` | DateTime |
| 16 | `usageValue` | 占用数量 | `usage_value` | Decimal |
| 17 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `dailyDemandCapacityId` | 日占用 | `cmp.dailydemandcapacity.DailyDemandCapacity` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `capacityObjectId` | 加工中心 | `cmp.capacityobject.CapacityObject` | None |  |
