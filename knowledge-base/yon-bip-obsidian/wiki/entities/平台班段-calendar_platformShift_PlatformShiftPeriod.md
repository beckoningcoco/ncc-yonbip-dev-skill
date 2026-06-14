---
tags: ["BIP", "元数据", "数据字典", "DPMWDC", "calendar.platformShift.PlatformShiftPeriod"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 平台班段 (`calendar.platformShift.PlatformShiftPeriod`)

> DPMWDC | 物理表：`platform_shift_period`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 平台班段 |
| 物理表 | `platform_shift_period` |
| domain/服务域 | `ucf-staff-center` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `DPMWDC` |
| 构建时间 | `2026-06-05 09:22:43.5030` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（17个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `corePeriod` | 核心时段标志（Y/N） | `corePeriod` | String |
| 2 | `createTime` | 创建时间 | `creationtime` | DateTime |
| 3 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 4 | `dr` | 逻辑删除标识 | `DR` | Integer |
| 5 | `id` | id | `id` | String |
| 6 | `modifier` | 最后修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 7 | `modifyTime` | 修改时间 | `modifiedtime` | DateTime |
| 8 | `periodCode` | 班段编码 | `periodCode` | String |
| 9 | `periodEndDay` | 班段结束时间类型 1是当天2是后一天 | `periodEndDay` | Integer |
| 10 | `periodEndTime` | 班段结束时间 | `periodEndTime` | String |
| 11 | `periodStartDay` | 班段开始时间类型 1是当天0是前一天 | `periodStartDay` | Integer |
| 12 | `periodStartTime` | 班段开始时间 | `periodStartTime` | String |
| 13 | `periodType` | 时间类型 1是工作2是休息 | `periodType` | Integer |
| 14 | `pubts` | ts | `TS` | DateTime |
| 15 | `shiftId` | 班次Id | `shiftId` | 566d5ab9-aeca-4f63-a0d1-1b98a161c6bc |
| 16 | `tenant` | 租户ID | `tenantid` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 17 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `shiftId` | 班次Id | `calendar.platformShift.PlatformShift` | None | true |
| 2 | `creator` | 创建人 | `base.user.BipUser` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `modifier` | 最后修改人 | `base.user.BipUser` | Service |  |
| 5 | `tenant` | 租户ID | `yht.tenant.YhtTenant` | Service |  |
