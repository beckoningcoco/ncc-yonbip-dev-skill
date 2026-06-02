---
tags: [BIP, 元数据, 数据字典, uhybase.coupon.CouponGoodsClass]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 优惠券商品分类关系 (`uhybase.coupon.CouponGoodsClass`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `mp_coupongoodsclass` | 应用: `SDMB` | 类型: `Class`

## 属性（9 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `iGoodsClassId` | iGoodsClassID | `iGoodsClassId` | 5ad8fc93-4e6b-409f-a70f-462efa6fcee9 | `quote` |
| 3 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |
| 4 | `cAppID` | cAppID | `cAppID` | String | `text` |
| 5 | `cOuterID` | cOuterID | `cOuterID` | String | `text` |
| 6 | `iCouponID` | iCouponID | `iCouponId` | 01269572-184b-47c7-ad59-d4125d0f8cce | `quote` |
| 7 | `iDependOn` | iDependOn | `iDependOn` | Integer | `int` |
| 8 | `membercorp` | membercorp | `iCorpId` | Long | `long` |
| 9 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（3 个）

- `iCouponID` -> `uhybase.coupon.Coupon` (0..n)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `iGoodsClassId` -> `pc.cls.PresentationClass` ()
