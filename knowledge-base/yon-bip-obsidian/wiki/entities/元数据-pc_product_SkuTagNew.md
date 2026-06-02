---
tags: [BIP, 元数据, 数据字典, pc.product.SkuTagNew]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# SKU标签关联表(整合) (`pc.product.SkuTagNew`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `skutagnew` | 应用: `GZTBDM` | 类型: `Class`

## 属性（9 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `skuId` | skuID | `skuId` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `quote` |
| 3 | `tagId` | tagID | `tagId` | 554a526a-26a3-42fa-a579-c795401e0e09 | `quote` |
| 4 | `productApplyRangeId` | productApplyRangeID | `productApplyRangeId` | ed1f55f2-a3f7-4617-8bd2-7f2f404843ab | `quote` |
| 5 | `productDetailId` | productDetailID | `productDetailId` | 04616b02-47f8-4821-8c02-2e7a6d3264a8 | `quote` |
| 6 | `isCreator` | 是否Creator | `isCreator` | Boolean | `switch` |
| 7 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 9 | `tenant` | tenant | `tenant_id` | Long | `long` |

## 关联（5 个）

- `productApplyRangeId` -> `pc.product.ProductApplyRange` (0..n)
- `tagId` -> `pc.tag.Tag` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `productDetailId` -> `pc.product.ProductDetail` (0..n)
- `skuId` -> `pc.product.ProductSKU` (0..n)
