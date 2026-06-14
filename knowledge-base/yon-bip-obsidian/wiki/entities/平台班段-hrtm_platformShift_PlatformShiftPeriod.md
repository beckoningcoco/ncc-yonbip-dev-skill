---
tags: ["BIP", "元数据", "数据字典", "GZTORG", "hrtm.platformShift.PlatformShiftPeriod"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 平台班段 (`hrtm.platformShift.PlatformShiftPeriod`)

> GZTORG | 物理表：`platform_shift_period`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 平台班段 |
| 物理表 | `platform_shift_period` |
| domain/服务域 | `yonbip-hr-tm` |
| schema | `yonbip_hr_tm` |
| 所属应用 | `GZTORG` |
| 构建时间 | `2026-06-05 09:25:28.0180` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（17个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | String |
| 2 | `shiftId` | 班次Id | `shiftId` | c3463093-9c67-4b51-b028-139f1b776070 |
| 3 | `periodCode` | 班段编码 | `periodCode` | String |
| 4 | `periodStartTime` | 班段开始时间 | `periodStartTime` | String |
| 5 | `periodStartDay` | 班段开始时间类型 1是当天0是前一天 | `periodStartDay` | Integer |
| 6 | `periodEndTime` | 班段结束时间 | `periodEndTime` | String |
| 7 | `periodEndDay` | 班段结束时间类型 1是当天2是后一天 | `periodEndDay` | Integer |
| 8 | `periodType` | 时间类型 1是工作2是休息 | `periodType` | Integer |
| 9 | `corePeriod` | 核心时段标志（Y/N） | `corePeriod` | String |
| 10 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 11 | `createTime` | 创建时间 | `creationtime` | DateTime |
| 12 | `modifier` | 最后修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 13 | `modifyTime` | 修改时间 | `modifiedtime` | DateTime |
| 14 | `pubts` | ts | `TS` | DateTime |
| 15 | `dr` | 逻辑删除标识 | `DR` | Integer |
| 16 | `tenant` | 租户ID | `tenantid` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 17 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `shiftId` | 班次Id | `hrtm.platformShift.PlatformShift` | None | true |
| 2 | `creator` | 创建人 | `base.user.BipUser` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `modifier` | 最后修改人 | `base.user.BipUser` | Service |  |
| 5 | `tenant` | 租户ID | `yht.tenant.YhtTenant` | Service |  |
