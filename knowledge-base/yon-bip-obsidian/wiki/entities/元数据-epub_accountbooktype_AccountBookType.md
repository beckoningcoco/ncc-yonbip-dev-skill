---
tags: [BIP, 元数据, 数据字典, epub.accountbooktype.AccountBookType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 账簿类型 (`epub.accountbooktype.AccountBookType`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `epub_accountbooktype` | 应用: `FP`

## 属性（25 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `code` | 编码 | `code` | String | `text` |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` |
| 4 | `createDate` | createDate | `create_date` | Date | `date` |
| 5 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 6 | `creator` | 创建人 | `creator` | String | `text` |
| 7 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 8 | `modifier` | 修改人 | `modifier` | String | `text` |
| 9 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 10 | `modifyDate` | modifyDate | `modify_date` | Date | `date` |
| 11 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 12 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |
| 13 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 15 | `shortname` | shortname | `shortname` | String | `multiLanguage` |
| 16 | `accperiodscheme` | accperiodscheme | `accperiodscheme` | e7bb3d2b-b288-4696-b5f0-a9b0626cded8 | `quote` |
| 17 | `accsubjectchart` | accsubjectchart | `accsubjectchart` | 85ed5168-72ae-41c2-a5a5-51f3fc7b1bc0 | `quote` |
| 18 | `costelementtable` | costelementtable | `costelementtable` | 2cbab17e-f378-4047-8745-4bcf08509108 | `quote` |
| 19 | `isexternal` | 是否external | `isexternal` | Boolean | `switch` |
| 20 | `isinner` | 是否inner | `isinner` | Boolean | `switch` |
| 21 | `currency` | currency | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 22 | `stop_time` | stop_time | `stop_time` | DateTime | `timestamp` |
| 23 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |
| 24 | `objid` | objid | `objid` | String | `text` |
| 25 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（8 个）

- `ytenant` -> `yht.tenant.YhtTenant` () 
- `accperiodscheme` -> `bd.period.AccPeriodScheme` () 
- `creatorId` -> `base.user.User` () 
- `modifierId` -> `base.user.User` () 
- `currency` -> `bd.currencytenant.CurrencyTenantVO` () 
- `accsubjectchart` -> `epub.subject.AccSubjectchart` () 
- `costelementtable` -> `bd.costelementtable.CostElementTableVO` () 
- `tenant` -> `base.tenant.Tenant` () 
