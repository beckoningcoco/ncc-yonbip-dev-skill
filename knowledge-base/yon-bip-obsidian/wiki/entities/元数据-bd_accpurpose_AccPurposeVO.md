---
tags: [BIP, 元数据, 数据字典, bd.accpurpose.AccPurposeVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 核算目的 (`bd.accpurpose.AccPurposeVO`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_accpurpose` | 应用: `FP`

## 属性（23 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `code` | 编码 | `code` | String | `text` |
| 2 | `name` | 名称 | `name` | String | `multiLanguage` |
| 3 | `property` | property | `property` | AccPurposeProperty | `` |
| 4 | `description` | description | `description` | String | `multiLanguage` |
| 5 | `isdefault` | 是否default | `isdefault` | Boolean | `switch` |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 7 | `accsubjectchart` | accsubjectchart | `accsubjectchart` | String | `text` |
| 8 | `currency` | currency | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 9 | `accperiodscheme` | accperiodscheme | `accperiodscheme` | e7bb3d2b-b288-4696-b5f0-a9b0626cded8 | `quote` |
| 10 | `createDate` | create日期 | `create_date` | Date | `date` |
| 11 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 12 | `creator` | 创建人 | `creator` | String | `text` |
| 13 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 14 | `id` | ID | `id` | Long | `long` |
| 15 | `modifier` | 修改人 | `modifier` | String | `text` |
| 16 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 17 | `modifyDate` | modify日期 | `modify_date` | Date | `date` |
| 18 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 19 | `purposeAccbodyMapping` | purposeAccbodyMapping | `` | 57498f2c-3184-452f-81c0-6cebccd6ade7 | `` |
| 20 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |
| 21 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |
| 22 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 23 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（7 个）

- `ytenant` -> `yht.tenant.YhtTenant` () 
- `accperiodscheme` -> `bd.period.AccPeriodScheme` () 
- `creatorId` -> `base.user.User` () 
- `modifierId` -> `base.user.User` () 
- `currency` -> `bd.currencytenant.CurrencyTenantVO` () 
- `purposeAccbodyMapping` -> `bd.accpurpose.PurposeAccbodyMappingVO` (0..n) 
- `tenant` -> `base.tenant.Tenant` () 
