---
tags: [BIP, 元数据, 数据字典, uhybase.coupon.CouponStore]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 卡券适用门店关系表 (`uhybase.coupon.CouponStore`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `mp_storescope` | 应用: `SDMB` | 类型: `Class`

## 属性（11 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `iStoreID` | iStoreID | `iStoreID` | 16e4e14c-ab05-4ee5-bbb8-c67351c9a8b3 | `quote` |
| 3 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |
| 4 | `cStoreCode` | cStore编码 | `cStoreCode` | String | `text` |
| 5 | `cOuterStoreCode` | cOuterStore编码 | `cOuterStoreCode` | String | `text` |
| 6 | `cAppID` | cAppID | `cAppID` | String | `text` |
| 7 | `cStoreName` | cStore名称 | `cStoreName` | String | `text` |
| 8 | `iDocID` | iDocID | `iDocID` | 01269572-184b-47c7-ad59-d4125d0f8cce | `quote` |
| 9 | `iScopeType` | iScopeType | `iScopeType` | Integer | `int` |
| 10 | `membercorp` | membercorp | `iCorpId` | Long | `long` |
| 11 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（3 个）

- `iDocID` -> `uhybase.coupon.Coupon` (0..n)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `iStoreID` -> `aa.store.Store` ()
