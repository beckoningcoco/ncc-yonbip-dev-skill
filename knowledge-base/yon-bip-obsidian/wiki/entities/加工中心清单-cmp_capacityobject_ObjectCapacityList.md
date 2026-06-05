---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.capacityobject.ObjectCapacityList"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 加工中心清单 (`cmp.capacityobject.ObjectCapacityList`)

> DCRP | 物理表：`cmp_capacity_object_list`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 加工中心清单 |
| 物理表 | `cmp_capacity_object_list` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 14:00:02.7060` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（37个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `objectId` | 加工中心 | `object_id` | e3034100-f166-46e1-b750-d85fb84474b7 |
| 4 | `capacityType` | 能力类型 | `capacity_type` | 642b1472-4120-4290-8a72-549d4c3389cc |
| 5 | `quantity` | 数量 | `quantity` | Decimal |
| 6 | `availability` | 利用率 | `availability` | Decimal |
| 7 | `limitCapacityMark` | 有限能力标识 | `limit_capacity_mark` | Short |
| 8 | `workCalendar` | 工作日历 | `work_calendar` | String |
| 9 | `workCalendarName` | 工作日历名称 | `work_calendar_name` | String |
| 10 | `capacityValue` | 能力值 | `capacity_value` | Decimal |
| 11 | `timeUnit` | 时间单位 | `time_unit` | String |
| 12 | `capacityShowUnit` | 能力显示单位 | `capacity_show_unit` | String |
| 13 | `conversionRate` | 换算率 | `conversion_rate` | Decimal |
| 14 | `excessCoefficient` | 超额系数 | `excess_coefficient` | Decimal |
| 15 | `effectiveDate` | 生效日期 | `effective_date` | DateTime |
| 16 | `expiryDate` | 失效日期 | `expiry_date` | DateTime |
| 17 | `calculateId` | 产能运算ID | `calculate_id` | 12a493ee-e7d1-4aac-b52d-8dd0dc02121b |
| 18 | `sourceId` | 来源对象ID | `source_id` | Long |
| 19 | `CapacityAdjustMark` | 能力调节标志 | `capacity_adjust_mark` | Short |
| 20 | `adjustQuantity` | 调整后数量 | `adjust_quantity` | Decimal |
| 21 | `adjustCapacityValue` | 调整后能力值 | `adjust_capacity_value` | Decimal |
| 22 | `changeStatus` | 变更状态 | `change_status` | String |
| 23 | `syncStatus` | 同步状态 | `sync_status` | String |
| 24 | `syncMessage` | 同步信息 | `sync_message` | String |
| 25 | `originalPubts` | 来源时间戳 | `original_pubts` | DateTime |
| 26 | `dr` | 逻辑删除标记 | `dr` | Short |
| 27 | `createTime` | 创建时间 | `create_time` | DateTime |
| 28 | `createDate` | 创建日期 | `create_date` | Date |
| 29 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 30 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 31 | `creator` | 创建人名称 | `creator` | String |
| 32 | `modifier` | 修改人名称 | `modifier` | String |
| 33 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 34 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 35 | `pubts` | 时间戳 | `pubts` | DateTime |
| 36 | `conversionRateDen` | 换算率分母 | `conversion_rateden` | Decimal |
| 37 | `conversionRateNum` | 换算率分子 | `conversion_ratenum` | Decimal |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `capacityType` | 能力类型 | `cmp.capacitytype.CapacityType` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `calculateId` | 产能运算ID | `cmp.capacitycalculate.CapacityCalculate` | None |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `objectId` | 加工中心 | `cmp.capacityobject.CapacityObject` | None | true |
