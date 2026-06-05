---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.shift.Shift"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 班次 (`cmp.shift.Shift`)

> DCRP | 物理表：`cmp_shift`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 班次 |
| 物理表 | `cmp_shift` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:59:43.5050` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（27个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `orgId` | 组织 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 4 | `code` | 编码 | `code` | String |
| 5 | `name` | 名称 | `name` | String |
| 6 | `startDay` | 开始日期类型 1是当天0是前一天 | `start_day` | Integer |
| 7 | `startTime` | 开始时间 | `start_time` | String |
| 8 | `endDay` | 结束日期类型 1是当天2是后一天 | `end_day` | Integer |
| 9 | `endTime` | 结束时间 | `end_time` | String |
| 10 | `timeUnit` | 时间单位, 1:小时,2:天 | `timeUnit` | String |
| 11 | `workHours` | 工作时长 | `workHours` | Decimal |
| 12 | `memo` | 备注 | `memo` | String |
| 13 | `srcShiftId` | 班次来源ID | `src_shift_id` | c3463093-9c67-4b51-b028-139f1b776070 |
| 14 | `createTime` | 创建时间 | `create_time` | DateTime |
| 15 | `createDate` | 创建日期 | `create_date` | Date |
| 16 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 17 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 18 | `creator` | 创建人名称 | `creator` | String |
| 19 | `modifier` | 修改人名称 | `modifier` | String |
| 20 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 21 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 22 | `enable` | 启用 | `enable` | sys_intboolean |
| 23 | `enablets` | 启用时间 | `enablets` | DateTime |
| 24 | `disablets` | 停用时间 | `disablets` | DateTime |
| 25 | `dr` | 逻辑删除标记 | `dr` | Short |
| 26 | `pubts` | 时间戳 | `pubts` | DateTime |
| 27 | `ShiftSegmentList` | 班段 | `` | b1ae55ee-31b1-4b5c-b3ec-4cdf63dd4e7f |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `srcShiftId` | 班次来源ID | `hrtm.platformShift.PlatformShift` | Service |  |
| 5 | `ShiftSegmentList` | 班段 | `cmp.shift.ShiftSegment` | None | true |
| 6 | `orgId` | 组织 | `aa.baseorg.OrgMV` | Service |  |
