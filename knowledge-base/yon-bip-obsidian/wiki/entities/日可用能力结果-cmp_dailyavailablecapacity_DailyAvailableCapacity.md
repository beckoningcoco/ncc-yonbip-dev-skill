---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.dailyavailablecapacity.DailyAvailableCapacity"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 日可用能力结果 (`cmp.dailyavailablecapacity.DailyAvailableCapacity`)

> DCRP | 物理表：`cmp_daily_available_capacity`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 日可用能力结果 |
| 物理表 | `cmp_daily_available_capacity` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:58:35.3340` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（30个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `orgId` | 组织 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 4 | `calculateId` | 产能运算ID | `calculate_id` | 12a493ee-e7d1-4aac-b52d-8dd0dc02121b |
| 5 | `capacityObject` | 加工中心 | `capacity_object` | e3034100-f166-46e1-b750-d85fb84474b7 |
| 6 | `availableDatetime` | 日期 | `available_datetime` | DateTime |
| 7 | `availableCapacity` | 可用能力 | `available_capacity` | Decimal |
| 8 | `timeUnit` | 时间单位 | `time_unit` | String |
| 9 | `constraintRuleVerId` | 排产版本 | `constraint_rule_ver_id` | 1c76a52f-4c51-4554-9bec-dc552617ce6c |
| 10 | `srcWCId` | 加工中心来源ID(工作中心/生产线) | `src_wc_id` | Long |
| 11 | `srcWCType` | 加工中心来源类型 | `src_wc_type` | String |
| 12 | `dataClassType` | 数据类类型 | `data_class_type` | String |
| 13 | `dataClassItem` | 数据类项 | `data_class_item` | String |
| 14 | `dataClassSubItem` | 数据子项 | `data_class_sub_item` | String |
| 15 | `shiftId` | 班次 | `shift_id` | 6b8e0e86-1416-4b56-b3c3-02dac58aa640 |
| 16 | `shiftSegmentId` | 班段 | `shift_segment_id` | b1ae55ee-31b1-4b5c-b3ec-4cdf63dd4e7f |
| 17 | `beginDate` | 开始时间 | `begin_date` | DateTime |
| 18 | `endDate` | 结束时间 | `end_date` | DateTime |
| 19 | `usagecapValue` | 已占能力 | `usagecap_value` | Decimal |
| 20 | `balCapValue` | 剩余能力 | `balcap_value` | Decimal |
| 21 | `dr` | 逻辑删除标记 | `dr` | Short |
| 22 | `createTime` | 创建时间 | `create_time` | DateTime |
| 23 | `createDate` | 创建日期 | `create_date` | Date |
| 24 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 25 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 26 | `creator` | 创建人名称 | `creator` | String |
| 27 | `modifier` | 修改人名称 | `modifier` | String |
| 28 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 29 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 30 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `shiftId` | 班次 | `cmp.shift.Shift` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `constraintRuleVerId` | 排产版本 | `cmp.constraintRuleVersion.ConstraintRuleVersion` | None |  |
| 4 | `shiftSegmentId` | 班段 | `cmp.shift.ShiftSegment` | None |  |
| 5 | `calculateId` | 产能运算ID | `cmp.capacitycalculate.CapacityCalculate` | None |  |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 8 | `capacityObject` | 加工中心 | `cmp.capacityobject.CapacityObject` | None |  |
| 9 | `orgId` | 组织 | `aa.baseorg.OrgMV` | Service |  |
