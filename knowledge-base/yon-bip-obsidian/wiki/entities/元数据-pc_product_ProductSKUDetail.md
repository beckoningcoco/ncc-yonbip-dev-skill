---
tags: [BIP, 元数据, 数据字典, pc.product.ProductSKUDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# (停用)物料SKU详情(使用组织) (`pc.product.ProductSKUDetail`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `productskudetailnew` | 应用: `GZTBDM` | 类型: `Class`

## 属性（40 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 3 | `tenant` | tenant | `tenant_id` | Long | `long` |
| 4 | `productId` | productID | `productId` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 5 | `highestStock` | highestStock | `highestStock` | Decimal | `number` |
| 6 | `lowestStock` | lowestStock | `lowestStock` | Decimal | `number` |
| 7 | `productApplyRangeId` | productApplyRangeID | `productApplyRangeId` | ed1f55f2-a3f7-4617-8bd2-7f2f404843ab | `quote` |
| 8 | `skuId` | skuID | `skuId` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `quote` |
| 9 | `weight` | weight | `weight` | Decimal | `number` |
| 10 | `shortName` | short名称 | `shortName` | String | `text` |
| 11 | `mnemonicCode` | mnemonic编码 | `mnemonicCode` | String | `text` |
| 12 | `barCode` | bar编码 | `cBarCode` | String | `text` |
| 13 | `fNoTaxCostPrice` | fNoTaxCostPrice | `fNoTaxCostPrice` | Decimal | `number` |
| 14 | `fPrimeCosts` | fPrimeCosts | `fPrimeCosts` | Decimal | `number` |
| 15 | `iMinOrderQuantity` | iMinOrderQuantity | `iMinOrderQuantity` | Decimal | `number` |
| 16 | `iDoubleSale` | iDoubleSale | `iDoubleSale` | Decimal | `number` |
| 17 | `batchDeliveryDays` | batchDeliveryDays | `batchDeliveryDays` | Integer | `int` |
| 18 | `batchUnit` | batchUnit | `batchUnitId` | Long | `long` |
| 19 | `batchRate` | batchRate | `batchRate` | Decimal | `number` |
| 20 | `batchPrice` | batchPrice | `batchPrice` | Decimal | `number` |
| 21 | `markPrice` | markPrice | `fMarkPrice` | Decimal | `number` |
| 22 | `salePrice` | salePrice | `fSalePrice` | Decimal | `number` |
| 23 | `fLowestMarkPrice` | fLowestMarkPrice | `fLowestMarkPrice` | Decimal | `number` |
| 24 | `fMarketPrice` | fMarketPrice | `fMarketPrice` | Decimal | `number` |
| 25 | `fSettleAccountsRate` | fSettleAccountsRate | `fSettleAccountsRate` | Decimal | `number` |
| 26 | `salePoints` | salePoints | `salePoints` | Integer | `int` |
| 27 | `saled` | saled | `iSaled` | Boolean | `switch` |
| 28 | `inventoryCount` | inventoryCount | `lInventoryCount` | Decimal | `number` |
| 29 | `safetyStock` | safetyStock | `safetyStock` | Decimal | `number` |
| 30 | `iOrder` | iOrder | `iOrder` | Integer | `int` |
| 31 | `ustatus` | ustatus | `iUStatus` | Boolean | `switch` |
| 32 | `ustatus_b` | ustatus_b | `iUStatus_b` | Boolean | `switch` |
| 33 | `status` | 状态 | `iStatus` | Boolean | `switch` |
| 34 | `status_b` | status_b | `iStatus_b` | Boolean | `switch` |
| 35 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |
| 36 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |
| 37 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 38 | `batchPriceUnit` | batchPriceUnit | `batchPriceUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 39 | `batchPriceUnitRate` | batchPriceUnitRate | `batchPriceUnitRate` | Decimal | `number` |
| 40 | `isCreator` | 是否Creator | `isCreator` | Boolean | `switch` |

## 关联（5 个）

- `batchPriceUnit` -> `pc.unit.Unit` ()
- `productApplyRangeId` -> `pc.product.ProductApplyRange` ()
- `productId` -> `pc.product.Product` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `skuId` -> `pc.product.ProductSKU` (1)
