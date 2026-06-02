---
tags: [BIP, 元数据, 数据字典, pc.product.ProductSpecItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料关联的规格值明细 (`pc.product.ProductSpecItem`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `productspecitem` | 应用: `GZTBDM` | 类型: `Class`

## 属性（12 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 3 | `tenant` | tenant | `tenant_id` | Long | `long` |
| 4 | `productId` | productID | `productId` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 5 | `iSpecId` | iSpecID | `iSpecId` | 8420b5e5-7919-41ca-a192-7b8c4fb1d8b8 | `quote` |
| 6 | `lsSpecItems_id` | lsSpecItems_id | `lsSpecItems_id` | ea8eef91-08ab-4b54-8359-92eed26877e7 | `quote` |
| 7 | `specValue` | specValue | `specValue` | String | `text` |
| 8 | `haveImg` | haveImg | `haveImg` | Boolean | `switch` |
| 9 | `imgBusinessId` | imgBusinessID | `img_business_id` | String | `text` |
| 10 | `iOrder` | iOrder | `iOrder` | Integer | `int` |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 12 | `productspecitemalbums` | productspecitemalbums | `` | 569dedab-cf16-4941-a465-bebab8b58900 | `` |

## 关联（5 个）

- `lsSpecItems_id` -> `pc.userdef.Userdefine` ()
- `productspecitemalbums` -> `pc.product.ProductSpecItemAlbum` (0..n)
- `productId` -> `pc.product.Product` (0..n)
- `iSpecId` -> `pc.userdef.UserDefineClass` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
