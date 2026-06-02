---
tags: [BIP, 元数据, 数据字典, pc.product.SKUOrderPropertyExtend]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# (停用)物料订单属性(管理组织) (`pc.product.SKUOrderPropertyExtend`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `productskuorderproperty` | 应用: `GZTBDM` | 类型: `Class`

## 属性（14 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 3 | `tenant` | tenant | `tenant_id` | Long | `long` |
| 4 | `productId` | productID | `productId` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 5 | `productApplyRangeId` | productApplyRangeID | `productApplyRangeId` | ed1f55f2-a3f7-4617-8bd2-7f2f404843ab | `quote` |
| 6 | `skuPropertyTypeId` | skuPropertyTypeID | `skuPropertyTypeId` | 8ce8fd53-c231-4a19-953d-5081a4c9bf20 | `quote` |
| 7 | `skuId` | skuID | `skuId` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `quote` |
| 8 | `isRequired` | 是否Required | `isRequired` | Boolean | `switch` |
| 9 | `isShow` | 是否Show | `isShow` | Boolean | `switch` |
| 10 | `iLimitNum` | iLimitNum | `iLimitNum` | Integer | `int` |
| 11 | `iOrder` | iOrder | `iOrder` | Integer | `int` |
| 12 | `promptMessage` | promptMessage | `promptMessage` | String | `text` |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 14 | `isCreator` | 是否Creator | `isCreator` | Boolean | `switch` |

## 关联（5 个）

- `productApplyRangeId` -> `pc.product.ProductApplyRange` ()
- `productId` -> `pc.product.Product` (0..n)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `skuPropertyTypeId` -> `pc.tpl.ProductTplOrderProperty` ()
- `skuId` -> `pc.product.ProductSKU` (0..n)
