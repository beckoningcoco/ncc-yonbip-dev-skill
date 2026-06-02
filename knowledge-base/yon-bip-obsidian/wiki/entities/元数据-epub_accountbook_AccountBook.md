---
tags: [BIP, 元数据, 数据字典, epub.accountbook.AccountBook]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 账簿 (`epub.accountbook.AccountBook`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `epub_accountbook` | 应用: `FP`

## 属性（64 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `accpurpose` | accpurpose | `accpurpose` | 637f4637-0862-4167-a2bf-ef52818ca9d9 | `quote` |
| 2 | `controlscope` | controlscope | `controlscope` | b382fbab-2ecb-4733-bdb3-a6d3b81bf726 | `quote` |
| 3 | `accentity` | accentity | `accentity` | dabb8185-bfd2-4ed3-a721-f5bc5d948246 | `quote` |
| 4 | `accountbooktype` | accountbooktype | `accountbooktype` | 9e073034-63ae-4aba-a113-1b28396f35e6 | `quote` |
| 5 | `shortname` | shortname | `shortname` | String | `multiLanguage` |
| 6 | `accountingclassifi` | accountingclassifi | `accountingclassifi` | String | `text` |
| 7 | `accountbookattributes` | accountbookattributes | `accountbookattributes` | String | `text` |
| 8 | `description` | description | `description` | String | `text` |
| 9 | `accsubjectchart` | accsubjectchart | `accsubjectchart` | 85ed5168-72ae-41c2-a5a5-51f3fc7b1bc0 | `quote` |
| 10 | `accountelement` | accountelement | `accountelement` | 85ed5168-72ae-41c2-a5a5-51f3fc7b1bc0 | `quote` |
| 11 | `costelementtable` | costelementtable | `costelementtable` | b56c7f52-183c-4cea-a310-d6ee902365af | `quote` |
| 12 | `accperiodscheme` | accperiodscheme | `accperiodscheme` | e7bb3d2b-b288-4696-b5f0-a9b0626cded8 | `quote` |
| 13 | `accstandard` | accstandard | `accstandard` | f3f400fa-fb8d-43a6-8763-580b7dadcc60 | `quote` |
| 14 | `cashflowtype` | cashflowtype | `cashflowtype` | 3be4c758-4392-492a-8707-592ec2e5617f | `quote` |
| 15 | `currencyreducedparam` | currencyreducedparam | `currencyreducedparam` | String | `text` |
| 16 | `exchangeratescheme` | exchangeratescheme | `exchangeratescheme` | String | `text` |
| 17 | `ratetype` | ratetype | `ratetype` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |
| 18 | `profitlossratetype` | profitlossratetype | `profitlossratetype` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |
| 19 | `secondaryvoucher` | secondaryvoucher | `secondaryvoucher` | Boolean | `switch` |
| 20 | `issecond` | 是否second | `issecond` | Boolean | `switch` |
| 21 | `auxShow` | auxShow | `auxShow` | String | `text` |
| 22 | `systemgene` | systemgene | `systemgene` | Boolean | `switch` |
| 23 | `sysid` | sysid | `sysid` | String | `text` |
| 24 | `objid` | objid | `objid` | String | `text` |
| 25 | `code` | 编码 | `code` | String | `text` |
| 26 | `createDate` | createDate | `createDate` | Date | `date` |
| 27 | `createTime` | 创建时间 | `createTime` | DateTime | `timestamp` |
| 28 | `creator` | 创建人 | `creator` | String | `text` |
| 29 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 30 | `currency` | currency | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 31 | `id` | ID | `id` | String | `text` |
| 32 | `modifier` | 修改人 | `modifier` | String | `text` |
| 33 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 34 | `modifyDate` | modifyDate | `modifyDate` | Date | `date` |
| 35 | `modifyTime` | 修改时间 | `modifyTime` | DateTime | `timestamp` |
| 36 | `name` | 名称 | `name` | String | `multiLanguage` |
| 37 | `pubts` | 时间戳 | `pubts` | Date | `date` |
| 38 | `status` | 状态 | `status` | String | `text` |
| 39 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |
| 40 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |
| 41 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 42 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 43 | `accountBookAP` | accountBookAP | `` | 63725979-97c9-4f95-9a7a-a78b9740e7a1 | `` |
| 44 | `accountBookAR` | accountBookAR | `` | 780968a0-4142-4de4-b3f8-2b2d6daf2569 | `` |
| 45 | `accountBookCC` | accountBookCC | `` | 2da6292a-a05f-430a-8bc1-60f79004e245 | `` |
| 46 | `accountBookCE` | accountBookCE | `` | 9ad9c513-d66f-4d81-b053-a8af51280fae | `` |
| 47 | `accountBookCM` | accountBookCM | `` | 17b33dbb-0493-42ab-95b8-1cdb22d2a0df | `` |
| 48 | `accountBookFA` | accountBookFA | `` | 8818bcfd-4ab2-4440-8752-aba0be30e972 | `` |
| 49 | `accountBookGL` | accountBookGL | `` | 767f7e45-7917-4bb8-94ec-83b7d3c555f9 | `` |
| 50 | `accountBookIA` | accountBookIA | `` | 0793446f-c654-407a-812a-737dea5b4046 | `` |
| 51 | `accountBookIS` | accountBookIS | `` | 9d10611c-1ce2-465a-aa72-dfd136ff72b7 | `` |
| 52 | `accountBookPCM` | accountBookPCM | `` | 29f462ec-06f5-4a24-b254-718d559c3617 | `` |
| 53 | `accountBookPRC` | accountBookPRC | `` | 9f708666-af2e-4f8b-b947-13a0c149b8a6 | `` |
| 54 | `accountBookRA` | accountBookRA | `` | 5df5cf5e-c394-4c72-b2d3-99a51251bf22 | `` |
| 55 | `accountBookRVN` | accountBookRVN | `` | 85de1cf3-7e57-45c4-8915-e6d06c890cf0 | `` |
| 56 | `accountBookSC` | accountBookSC | `` | e88648e1-430f-42a4-9ca7-d6b6e960ade0 | `` |
| 57 | `character` | character | `character` | fae6ee6b-b717-4b13-99d4-0ac0f77c0743 | `UserDefine` |
| 58 | `multiLevelAccounting` | multiLevelAccounting | `` | e4c42f7a-1265-4366-8b12-a74026337745 | `` |
| 59 | `parent` | parent | `parent` | String | `text` |
| 60 | `path` | path | `path` | String | `text` |
| 61 | `secondAccEntity` | secondAccEntity | `` | e0e4a302-5388-4a09-9d40-ec72dfc7aea1 | `` |
| 62 | `sortnum` | sortnum | `sortnum` | Long | `long` |
| 63 | `svcregistration` | svcregistration | `` | e33fbb68-21e5-4682-bd2c-69d1579ae2c8 | `` |
| 64 | `treeSelect` | treeSelect | `tree_select` | String | `text` |

## 关联（35 个）

- `controlscope` -> `bd.controlscope.AccControlScopeVO` () 
- `accpurpose` -> `bd.accpurpose.AccPurposeVO` () 
- `creatorId` -> `base.user.User` () 
- `modifierId` -> `base.user.User` () 
- `secondAccEntity` -> `epub.accountbook.SecondAccEntity` (0..n) 
- `accountBookAP` -> `epub.accountbook.AccountBookAP` (1) 
- `accountBookRA` -> `epub.accountbook.AccountBookRA` (1) 
- `profitlossratetype` -> `bd.exchangeRate.ExchangeRateTypeVO` () 
- `accountBookAR` -> `epub.accountbook.AccountBookAR` (1) 
- `accountBookCM` -> `epub.accountbook.AccountBookCM` (1) 
- `accountBookIS` -> `epub.accountbook.AccountBookIS` (1) 
- `accentity` -> `bd.virtualaccbody.VirtualAccbody_view` () 
- `character` -> `epub.accountbook.AccountBookCharacter` () 
- `accperiodscheme` -> `bd.period.AccPeriodScheme` () 
- `accountelement` -> `epub.subject.AccSubjectchart` () 
- `currency` -> `bd.currencytenant.CurrencyTenantVO` () 
- `accountBookFA` -> `epub.accountbook.AccountBookFA` (1) 
- `costelementtable` -> `epub.subject.AccSubject` () 
- `tenant` -> `base.tenant.Tenant` () 
- `ratetype` -> `bd.exchangeRate.ExchangeRateTypeVO` () 
- `accountBookPCM` -> `epub.accountbook.AccountBookPCM` (1) 
- `accountBookIA` -> `epub.accountbook.AccountBookIA` (1) 
- `svcregistration` -> `epub.accountbook.Svcregistration` (0..n) 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `multiLevelAccounting` -> `epub.accountbook.multiLevelAccounting` (0..n) 
- `accountBookSC` -> `epub.accountbook.AccountBookSC` (1) 
- `accountbooktype` -> `epub.accountbooktype.AccountBookType` () 
- `accountBookPRC` -> `epub.accountbook.AccountBookPRC` (1) 
- `cashflowtype` -> `epub.cashflow.CashFlowType` () 
- `accountBookRVN` -> `epub.accountbook.AccountBookRVN` (1) 
- `accountBookCE` -> `epub.accountbook.AccountBookCE` (1) 
- `accountBookGL` -> `epub.accountbook.AccountBookGL` (1) 
- `accountBookCC` -> `epub.accountbook.AccountBookCC` (1) 
- `accstandard` -> `epub.basic.Accstandard` () 
- `accsubjectchart` -> `epub.subject.AccSubjectchart` () 
