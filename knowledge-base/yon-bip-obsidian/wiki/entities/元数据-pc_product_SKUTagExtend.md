---
tags: [BIP, 元数据, 数据字典, pc.product.SKUTagExtend]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# (停用)SKU标签关联表(管理组织) (`pc.product.SKUTagExtend`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `skutagnew` | 应用: `GZTBDM` | 类型: `Class`

## 属性（8 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 3 | `tenant` | tenant | `tenant_id` | Long | `long` |
| 4 | `productApplyRangeId` | productApplyRangeID | `productApplyRangeId` | ed1f55f2-a3f7-4617-8bd2-7f2f404843ab | `quote` |
| 5 | `skuId` | skuID | `skuId` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `quote` |
| 6 | `tagId` | tagID | `tagId` | 554a526a-26a3-42fa-a579-c795401e0e09 | `quote` |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 8 | `isCreator` | 是否Creator | `isCreator` | Boolean | `switch` |

## 关联（4 个）

- `productApplyRangeId` -> `pc.product.ProductApplyRange` ()
- `tagId` -> `pc.tag.Tag` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `skuId` -> `pc.product.ProductSKU` (0..n)
