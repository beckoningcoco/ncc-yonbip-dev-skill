---
tags: ["BIP", "元数据", "数据字典", "GZTORG", "hrtm.platformShift.PlatformShift"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 平台班次 (`hrtm.platformShift.PlatformShift`)

> GZTORG | 物理表：`platform_shift`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 平台班次 |
| 物理表 | `platform_shift` |
| domain/服务域 | `yonbip-hr-tm` |
| schema | `yonbip_hr_tm` |
| 所属应用 | `GZTORG` |
| 构建时间 | `2026-06-05 09:22:49.2440` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |
| 编码 | `code` | String | 班次编码 |

---

## 直接属性（27个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `busiOrg` | 所属组织id | `busiOrg` | 14302233-1394-4a70-94e1-bed51636f312 |
| 2 | `code` | 班次编码 | `code` | String |
| 3 | `createDomain` | 创建领域 | `createDomain` | String |
| 4 | `createTime` | 创建时间 | `creationtime` | DateTime |
| 5 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 6 | `disablets` | 停用时间 | `disablets` | DateTime |
| 7 | `dr` | 逻辑删除标识 | `DR` | Integer |
| 8 | `enable` | 是否启用 | `isenable` | Integer |
| 9 | `enablets` | 启用时间 | `enablets` | DateTime |
| 10 | `endDay` | 结束日期类型 1是当天2是后一天 | `endDay` | Integer |
| 11 | `endTime` | 班次结束时间 | `endTime` | String |
| 12 | `id` | id | `id` | String |
| 13 | `modifier` | 最后修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 14 | `modifyTime` | 修改时间 | `modifiedtime` | DateTime |
| 15 | `name` | 班次名称 | `name` | String |
| 16 | `platformShiftPeriodList` | 平台班段 | `` | 06074623-12e1-4269-8e46-80735decb775 |
| 17 | `pubts` | ts | `TS` | DateTime |
| 18 | `remark` | 班次说明 | `remark` | String |
| 19 | `shiftType` | 班次类型(1:时间班次,2:时长班次,3:耗时班次) | `shiftType` | Integer |
| 20 | `shiftTypeLabel` | 班次分类标签 | `shiftTypeLabel` | String |
| 21 | `startDay` | 开始日期类型 1是当天0是前一天 | `startDay` | Integer |
| 22 | `startTime` | 班次开始时间 | `startTime` | String |
| 23 | `tenant` | 租户ID | `tenantid` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 24 | `timeUnit` | 时间单位, 1:小时,2:天 | `timeUnit` | String |
| 25 | `uniqueId` | 唯一标识 | `uniqueId` | String |
| 26 | `workHours` | 工作时长 | `workHours` | Decimal |
| 27 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `creator` | 创建人 | `base.user.BipUser` | Service |  |
| 2 | `busiOrg` | 所属组织id | `org.func.BaseOrg` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `modifier` | 最后修改人 | `base.user.BipUser` | Service |  |
| 5 | `platformShiftPeriodList` | 平台班段 | `hrtm.platformShift.PlatformShiftPeriod` | None | true |
| 6 | `tenant` | 租户ID | `yht.tenant.YhtTenant` | Service |  |
