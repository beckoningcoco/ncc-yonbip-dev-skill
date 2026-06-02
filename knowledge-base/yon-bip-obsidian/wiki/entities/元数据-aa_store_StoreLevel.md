---
tags: [BIP, 元数据, 数据字典, aa.store.StoreLevel]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 终端等级 (`aa.store.StoreLevel`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `mp_storelevel` | 应用: `Marketingpublic` | 类型: `Class`

## 属性（19 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `code` | 编码 | `cCode` | String | `text` |
| 2 | `name` | 名称 | `cName` | String | `multiLanguage` |
| 3 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |
| 4 | `memo` | 备注 | `cMemo` | String | `multiLanguage` |
| 5 | `creator` | 创建人 | `cCreator` | String | `text` |
| 6 | `createTime` | 创建时间 | `dCreateTime` | IntDateTime | `dateTime` |
| 7 | `modifier` | 修改人 | `cModifier` | String | `text` |
| 8 | `modifyTime` | 修改时间 | `dModifyTime` | IntDateTime | `dateTime` |
| 9 | `modifyDate` | 修改日期 | `dModifyDate` | IntDate | `date` |
| 10 | `id` | ID | `id` | Long | `long` |
| 11 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |
| 12 | `cAppID` | cAppID | `cAppID` | String | `text` |
| 13 | `bgColor` | bgColor | `cBgColor` | String | `text` |
| 14 | `createDate` | 创建日期 | `dCreateDate` | IntDate | `date` |
| 15 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 16 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 17 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |
| 18 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 19 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（4 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `tenant` -> `base.tenant.Tenant` ()
