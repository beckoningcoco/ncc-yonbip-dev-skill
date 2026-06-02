---
tags: [BIP, 元数据, 数据字典, uhybase.fan.WxAccount]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 公众号 (`uhybase.fan.WxAccount`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `mp_wxaccount` | 应用: `SDMB` | 类型: `Class`

## 属性（27 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `cAppID` | cAppID | `cAppID` | 4556b717-b77c-4631-8314-70fc8d5ac99d | `quote` |
| 2 | `id` | ID | `id` | Long | `long` |
| 3 | `iCategory` | iCategory | `iCategory` | Integer | `int` |
| 4 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |
| 5 | `cWXAccountID` | cWXAccountID | `cWXAccountID` | String | `text` |
| 6 | `cWXAccountName` | cWXAccount名称 | `cWXAccountName` | String | `text` |
| 7 | `cAppSecret` | cAppSecret | `cAppSecret` | String | `text` |
| 8 | `cCompany` | cCompany | `cCompany` | String | `text` |
| 9 | `cDescription` | cDescription | `cDescription` | String | `text` |
| 10 | `iFirstReplyType` | iFirstReplyType | `iFirstReplyType` | Short | `short` |
| 11 | `bAuthentic` | bAuthentic | `bAuthentic` | Integer | `int` |
| 12 | `cBindWXAccount` | cBindWXAccount | `cBindWXAccount` | String | `text` |
| 13 | `cFuncInfo` | cFuncInfo | `cFuncInfo` | String | `text` |
| 14 | `cQRCode` | cQR编码 | `cQRCode` | String | `text` |
| 15 | `cWXAppID` | cWXAppID | `cWXAppID` | String | `text` |
| 16 | `cWXHeadPic` | cWXHeadPic | `cWXHeadPic` | String | `text` |
| 17 | `createTime` | 创建时间 | `dCreateTime` | Integer | `int` |
| 18 | `dCreateTime` | dCreateTime | `dCreateTime` | Integer | `int` |
| 19 | `iEPUserID` | iEPUserID | `iEPUserID` | Long | `long` |
| 20 | `iMiniProgramType` | iMiniProgramType | `iMiniProgramType` | Integer | `int` |
| 21 | `iOpenPlatFormAccess` | iOpenPlatFormAccess | `iOpenPlatFormAccess` | Integer | `int` |
| 22 | `iServiceTypeInfo` | iServiceTypeInfo | `iServiceTypeInfo` | Integer | `int` |
| 23 | `iStatus` | iStatus | `iStatus` | Integer | `int` |
| 24 | `iVerifyTypeInfo` | iVerifyTypeInfo | `iVerifyTypeInfo` | Integer | `int` |
| 25 | `membercorp` | membercorp | `iCorpId` | Long | `long` |
| 26 | `wxAccountCoupon` | wxAccountCoupon | `` | 6d9ecb2a-9fac-40df-b597-a1e81aa59cf1 | `` |
| 27 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（3 个）

- `cAppID` -> `uhybase.basic.CorpHierarchyTemp` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `wxAccountCoupon` -> `uhybase.fan.WxAccountCoupon` (0..n)
