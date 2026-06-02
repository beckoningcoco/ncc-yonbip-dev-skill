---
tags: [BIP, 元数据, 数据字典, uhybase.coupon.CouponGoodsExclude]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 卡券商品例外表 (`uhybase.coupon.CouponGoodsExclude`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `mp_goodsscopeexception` | 应用: `SDMB` | 类型: `Class`

## 属性（13 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `iGoodsID` | iGoodsID | `iGoodsID` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 3 | `cGoodsCode` | cGoods编码 | `cGoodsCode` | String | `text` |
| 4 | `cOuterGoodsClassCode` | cOuterGoodsClass编码 | `cOuterGoodsClassCode` | String | `text` |
| 5 | `cOuterGoodsCode` | cOuterGoods编码 | `cOuterGoodsCode` | String | `text` |
| 6 | `cAppID` | cAppID | `cAppID` | String | `text` |
| 7 | `cGoodsName` | cGoods名称 | `cGoodsName` | String | `text` |
| 8 | `iDocID` | iDocID | `iDocID` | 01269572-184b-47c7-ad59-d4125d0f8cce | `quote` |
| 9 | `iScopeCategory` | iScopeCategory | `iScopeCategory` | Integer | `int` |
| 10 | `iScopeType` | iScopeType | `iScopeType` | Integer | `int` |
| 11 | `membercorp` | membercorp | `iCorpId` | Long | `long` |
| 12 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |
| 13 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（3 个）

- `iGoodsID` -> `pc.product.Product` ()
- `iDocID` -> `uhybase.coupon.Coupon` (0..n)
- `ytenant` -> `yht.tenant.YhtTenant` ()
