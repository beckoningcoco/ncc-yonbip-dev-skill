---
tags: [BIP, 元数据, 数据字典, uhybase.coupon.CouponExchangeRules]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 优惠券兑换规则 (`uhybase.coupon.CouponExchangeRules`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `mp_coupongoodsconvertrule` | 应用: `SDMB` | 类型: `Class`

## 属性（22 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `iGoodsID` | iGoodsID | `iGoodsID` | Long | `long` |
| 3 | `iGoodsSKUID` | iGoodsSKUID | `iGoodsSKUID` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `quote` |
| 4 | `cGoodsSKUName` | cGoodsSKU名称 | `cGoodsSKUName` | String | `text` |
| 5 | `iMaxGoodsQuantity` | iMaxGoodsQuantity | `iMaxGoodsQuantity` | Integer | `int` |
| 6 | `fSalePrice` | fSalePrice | `fSalePrice` | Decimal | `number` |
| 7 | `fDiscountPrice` | fDiscountPrice | `fDiscountPrice` | Decimal | `number` |
| 8 | `iGoodsCompanyBurdenAmount` | iGoodsCompanyBurdenAmount | `iGoodsCompanyBurdenAmount` | Decimal | `number` |
| 9 | `iGoodsDistributorBurdenAmount` | iGoodsDistributorBurdenAmount | `iGoodsDistributorBurdenAmount` | Decimal | `number` |
| 10 | `iGoodsStoreBurdenAmount` | iGoodsStoreBurdenAmount | `iGoodsStoreBurdenAmount` | Decimal | `number` |
| 11 | `iGoodsCompanyBurdenBl` | iGoodsCompanyBurdenBl | `iGoodsCompanyBurdenBl` | Decimal | `number` |
| 12 | `iGoodsDistributorBurdenBl` | iGoodsDistributorBurdenBl | `iGoodsDistributorBurdenBl` | Decimal | `number` |
| 13 | `iGoodsStoreBurdenBl` | iGoodsStoreBurdenBl | `iGoodsStoreBurdenBl` | Decimal | `number` |
| 14 | `couponExchangeRulesDefineCharacter` | couponExchangeRulesDefineCharacter | `couponExchangeRulesDefineCharacter` | 2fc94ceb-79df-474f-b251-5230dc025cbc | `UserDefine` |
| 15 | `cAppID` | cAppID | `cAppID` | String | `text` |
| 16 | `couponGoodsConvertFreeDefine` | couponGoodsConvertFreeDefine | `` | 824b007d-a97b-48b7-9175-68c6129817cd | `` |
| 17 | `iCouponID` | iCouponID | `iCouponID` | 01269572-184b-47c7-ad59-d4125d0f8cce | `quote` |
| 18 | `iDependOn` | iDependOn | `iDependOn` | Integer | `int` |
| 19 | `iGoodsClassID` | iGoodsClassID | `iGoodsClassID` | Long | `long` |
| 20 | `membercorp` | membercorp | `iCorpId` | Long | `long` |
| 21 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |
| 22 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（5 个）

- `iGoodsSKUID` -> `pc.product.ProductSKU` ()
- `iCouponID` -> `uhybase.coupon.Coupon` (0..n)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `couponGoodsConvertFreeDefine` -> `uhybase.coupon.CouponGoodsConvertFreeDefine` (1)
- `couponExchangeRulesDefineCharacter` -> `uhybase.coupon.CouponExchangeRulesDefineCharacter` ()
