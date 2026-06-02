---
tags: [BIP, 元数据, 数据字典, pc.product.SkuFreeCharacterItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# SKU特征冗余表 (`pc.product.SkuFreeCharacterItem`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `skufreecharacteritem` | 应用: `GZTBDM` | 类型: `Class`

## 属性（11 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 3 | `tenant` | tenant | `tenant_id` | Long | `long` |
| 4 | `productId` | productID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 5 | `skuId` | skuID | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `quote` |
| 6 | `characteristicsId` | characteristicsID | `characteristics_id` | 2bbf5f38-d9cd-41f4-828c-936c89972323 | `quote` |
| 7 | `characterId` | 特征ID | `character_id` | 1a5d304f-40a4-47a2-a075-f8b5ab6af37b | `quote` |
| 8 | `characterCode` | character编码 | `character_code` | String | `text` |
| 9 | `characterValueId` | characterValueID | `character_value_id` | String | `text` |
| 10 | `productFreeCharacterItemId` | productFreeCharacterItemID | `productfreecharacteritem_id` | 21570b2f-6eeb-438c-9ab0-3b2625e6b9b3 | `quote` |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |

## 关联（6 个）

- `characteristicsId` -> `base.character.Characteristics` ()
- `productId` -> `pc.product.Product` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `productFreeCharacterItemId` -> `pc.product.ProductFreeCharacterItem` ()
- `characterId` -> `base.character.Character` ()
- `skuId` -> `pc.product.ProductSKU` (0..n)
