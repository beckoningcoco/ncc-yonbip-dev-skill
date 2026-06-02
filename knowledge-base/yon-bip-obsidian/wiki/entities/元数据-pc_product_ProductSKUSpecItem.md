---
tags: [BIP, 元数据, 数据字典, pc.product.ProductSKUSpecItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# SKU规格冗余表 (`pc.product.ProductSKUSpecItem`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `productskuspecitem` | 应用: `GZTBDM` | 类型: `Class`

## 属性（8 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 3 | `tenant` | tenant | `tenant_id` | Long | `long` |
| 4 | `skuId` | skuID | `skuId` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `quote` |
| 5 | `productId` | productID | `productId` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 6 | `specId` | specID | `specId` | 8420b5e5-7919-41ca-a192-7b8c4fb1d8b8 | `quote` |
| 7 | `specItemId` | specItemID | `specItemId` | ea8eef91-08ab-4b54-8359-92eed26877e7 | `quote` |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |

## 关联（5 个）

- `specId` -> `pc.userdef.UserDefineClass` ()
- `productId` -> `pc.product.Product` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `specItemId` -> `pc.userdef.Userdefine` ()
- `skuId` -> `pc.product.ProductSKU` (0..n)
