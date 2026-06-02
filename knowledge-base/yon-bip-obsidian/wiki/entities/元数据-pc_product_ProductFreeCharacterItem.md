---
tags: [BIP, 元数据, 数据字典, pc.product.ProductFreeCharacterItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料特征值冗余表 (`pc.product.ProductFreeCharacterItem`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `productfreecharacteritem` | 应用: `GZTBDM` | 类型: `Class`

## 属性（13 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 3 | `tenant` | tenant | `tenant_id` | Long | `long` |
| 4 | `productId` | productID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 5 | `characteristicsId` | characteristicsID | `characteristics_id` | 2bbf5f38-d9cd-41f4-828c-936c89972323 | `quote` |
| 6 | `characterId` | 特征ID | `character_id` | 1a5d304f-40a4-47a2-a075-f8b5ab6af37b | `quote` |
| 7 | `characterCode` | character编码 | `character_code` | String | `text` |
| 8 | `characterValueId` | characterValueID | `character_value_id` | String | `text` |
| 9 | `haveImg` | haveImg | `have_img` | Integer | `int` |
| 10 | `imgBusinessId` | imgBusinessID | `img_business_id` | String | `text` |
| 11 | `iOrder` | iOrder | `iorder` | Integer | `int` |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 13 | `productFreeCharacterItemAlbums` | productFreeCharacterItemAlbums | `` | 569dedab-cf16-4941-a465-bebab8b58900 | `` |

## 关联（5 个）

- `characteristicsId` -> `base.character.Characteristics` ()
- `productId` -> `pc.product.Product` (0..n)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `productFreeCharacterItemAlbums` -> `pc.product.ProductSpecItemAlbum` (0..n)
- `characterId` -> `base.character.Character` ()
