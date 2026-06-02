---
tags: [BIP, 元数据, 数据字典, uhybase.coupon.CouponGoodsSKU]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 优惠券商品SKU关系 (`uhybase.coupon.CouponGoodsSKU`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `mp_coupongoodsclass` | 应用: `SDMB` | 类型: `Class`

## 属性（11 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `iGoodsID` | iGoodsID | `iGoodsID` | Long | `long` |
| 3 | `iGoodsSKUID` | iGoodsSKUID | `iGoodsSKUID` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `quote` |
| 4 | `cAppID` | cAppID | `cAppID` | String | `text` |
| 5 | `cGoodsSKUName` | cGoodsSKU名称 | `cGoodsSKUName` | String | `text` |
| 6 | `cOuterGoodsSKUID` | cOuterGoodsSKUID | `cOuterGoodsSKUID` | String | `text` |
| 7 | `iCouponID` | iCouponID | `iCouponId` | 01269572-184b-47c7-ad59-d4125d0f8cce | `quote` |
| 8 | `iDependOn` | iDependOn | `iDependOn` | Integer | `int` |
| 9 | `membercorp` | membercorp | `iCorpId` | Long | `long` |
| 10 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |
| 11 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（3 个）

- `iGoodsSKUID` -> `pc.product.ProductSKU` ()
- `iCouponID` -> `uhybase.coupon.Coupon` (0..n)
- `ytenant` -> `yht.tenant.YhtTenant` ()
