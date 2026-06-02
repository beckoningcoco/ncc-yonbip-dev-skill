---
tags: [BIP, 元数据, 数据字典, uhybase.coupon.CouponGoodsTag]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 优惠券商品标签关系 (`uhybase.coupon.CouponGoodsTag`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `mp_coupongoodstag` | 应用: `SDMB` | 类型: `Class`

## 属性（8 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `iGoodsTagID` | iGoodsTagID | `iGoodsTagID` | 554a526a-26a3-42fa-a579-c795401e0e09 | `quote` |
| 3 | `cAppID` | cAppID | `cAppID` | String | `text` |
| 4 | `cGoodsTagName` | cGoodsTag名称 | `cGoodsTagName` | String | `text` |
| 5 | `iCouponID` | iCouponID | `iCouponID` | 01269572-184b-47c7-ad59-d4125d0f8cce | `quote` |
| 6 | `membercorp` | membercorp | `iCorpId` | Long | `long` |
| 7 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |
| 8 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（3 个）

- `iCouponID` -> `uhybase.coupon.Coupon` (0..n)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `iGoodsTagID` -> `pc.tag.Tag` ()
