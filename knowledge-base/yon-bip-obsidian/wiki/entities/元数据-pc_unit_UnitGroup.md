---
tags: [BIP, 元数据, 数据字典, pc.unit.UnitGroup]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 计量单位分组 (`pc.unit.UnitGroup`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `unit_group` | 应用: `GZTBDM` | 类型: `Class`

## 属性（22 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 3 | `sourcetype` | sourcetype | `sourcetype` | Boolean | `switch` |
| 4 | `code` | 编码 | `code` | String | `text` |
| 5 | `name` | 名称 | `name` | String | `multiLanguage` |
| 6 | `erpCode` | erp编码 | `erpCode` | String | `text` |
| 7 | `order` | order | `iOrder` | Integer | `int` |
| 8 | `desc` | desc | `desc` | String | `text` |
| 9 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |
| 10 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |
| 11 | `sociCoreArchive` | sociCoreArchive | `sociCoreArchive_id` | Long | `long` |
| 12 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 14 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 15 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 16 | `creator` | 创建人 | `creator` | String | `text` |
| 17 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 18 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 19 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 20 | `modifier` | 修改人 | `modifier` | String | `text` |
| 21 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 22 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |

## 关联（4 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `tenant` -> `base.tenant.Tenant` ()
