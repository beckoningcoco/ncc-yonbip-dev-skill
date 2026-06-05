---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.shift.ShiftSegment"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 班段 (`cmp.shift.ShiftSegment`)

> DCRP | 物理表：`cmp_shift_segment`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 班段 |
| 物理表 | `cmp_shift_segment` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 14:00:16.8070` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（21个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `mainId` | 班次 | `main_id` | 6b8e0e86-1416-4b56-b3c3-02dac58aa640 |
| 4 | `srcSegmentId` | 班段来源ID | `src_segment_id` | 06074623-12e1-4269-8e46-80735decb775 |
| 5 | `startDay` | 开始日期类型 1是当天0是前一天 | `start_day` | Integer |
| 6 | `startTime` | 开始时间 | `start_time` | String |
| 7 | `endDay` | 结束日期类型 1是当天2是后一天 | `end_day` | Integer |
| 8 | `endTime` | 结束时间 | `end_time` | String |
| 9 | `memo` | 备注 | `memo` | String |
| 10 | `periodType` | 时间类型 1是工作2是休息 | `periodType` | Integer |
| 11 | `corePeriod` | 核心时段标志 | `corePeriod` | Short |
| 12 | `createTime` | 创建时间 | `create_time` | DateTime |
| 13 | `createDate` | 创建日期 | `create_date` | Date |
| 14 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 15 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 16 | `creator` | 创建人名称 | `creator` | String |
| 17 | `modifier` | 修改人名称 | `modifier` | String |
| 18 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 19 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 20 | `dr` | 逻辑删除标记 | `dr` | Short |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `mainId` | 班次 | `cmp.shift.Shift` | None | true |
| 5 | `srcSegmentId` | 班段来源ID | `hrtm.platformShift.PlatformShiftPeriod` | Service |  |
