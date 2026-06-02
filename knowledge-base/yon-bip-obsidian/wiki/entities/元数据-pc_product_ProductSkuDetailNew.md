---
tags: [BIP, 元数据, 数据字典, pc.product.ProductSkuDetailNew]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料SKU详情(整合) (`pc.product.ProductSkuDetailNew`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `productskudetailnew` | 应用: `GZTBDM` | 类型: `Class`

## 属性（41 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `productId` | productID | `productId` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 3 | `shortName` | short名称 | `shortName` | String | `text` |
| 4 | `mnemonicCode` | mnemonic编码 | `mnemonicCode` | String | `text` |
| 5 | `highestStock` | highestStock | `highestStock` | Decimal | `number` |
| 6 | `lowestStock` | lowestStock | `lowestStock` | Decimal | `number` |
| 7 | `skuId` | skuID | `skuId` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `quote` |
| 8 | `erpOuterCode` | erpOuter编码 | `cErpOuterCode` | String | `text` |
| 9 | `barCode` | bar编码 | `cBarCode` | String | `text` |
| 10 | `fNoTaxCostPrice` | fNoTaxCostPrice | `fNoTaxCostPrice` | Decimal | `number` |
| 11 | `fPrimeCosts` | fPrimeCosts | `fPrimeCosts` | Decimal | `number` |
| 12 | `iMinOrderQuantity` | iMinOrderQuantity | `iMinOrderQuantity` | Decimal | `number` |
| 13 | `iDoubleSale` | iDoubleSale | `iDoubleSale` | Decimal | `number` |
| 14 | `batchDeliveryDays` | batchDeliveryDays | `batchDeliveryDays` | Integer | `int` |
| 15 | `batchPrice` | batchPrice | `batchPrice` | Decimal | `number` |
| 16 | `markPrice` | markPrice | `fMarkPrice` | Decimal | `number` |
| 17 | `salePrice` | salePrice | `fSalePrice` | Decimal | `number` |
| 18 | `fLowestMarkPrice` | fLowestMarkPrice | `fLowestMarkPrice` | Decimal | `number` |
| 19 | `fMarketPrice` | fMarketPrice | `fMarketPrice` | Decimal | `number` |
| 20 | `fSettleAccountsRate` | fSettleAccountsRate | `fSettleAccountsRate` | Decimal | `number` |
| 21 | `salePoints` | salePoints | `salePoints` | Integer | `int` |
| 22 | `saled` | saled | `iSaled` | Boolean | `switch` |
| 23 | `stockUnit` | stockUnit | `stockUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 24 | `inventoryCount` | inventoryCount | `lInventoryCount` | Decimal | `number` |
| 25 | `safetyStock` | safetyStock | `safetyStock` | Decimal | `number` |
| 26 | `iOrder` | iOrder | `iOrder` | Integer | `int` |
| 27 | `ustatus` | ustatus | `iUStatus` | Boolean | `switch` |
| 28 | `ustatus_b` | ustatus_b | `iUStatus_b` | Boolean | `switch` |
| 29 | `status` | 状态 | `iStatus` | Boolean | `switch` |
| 30 | `status_b` | status_b | `iStatus_b` | Boolean | `switch` |
| 31 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |
| 32 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |
| 33 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 34 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 35 | `batchPriceUnit` | batchPriceUnit | `batchPriceUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 36 | `batchPriceUnitRate` | batchPriceUnitRate | `batchPriceUnitRate` | Decimal | `number` |
| 37 | `isCreator` | 是否Creator | `isCreator` | Boolean | `switch` |
| 38 | `skuDetailCharacterDef` | skuDetailCharacterDef | `sku_detail_character_def` | b55610bc-d133-4373-9e84-1e046f078a34 | `UserDefine` |
| 39 | `productApplyRangeId` | productApplyRangeID | `productApplyRangeId` | ed1f55f2-a3f7-4617-8bd2-7f2f404843ab | `quote` |
| 40 | `productDetailId` | productDetailID | `productDetailId` | 04616b02-47f8-4821-8c02-2e7a6d3264a8 | `quote` |
| 41 | `tenant` | tenant | `tenant_id` | Long | `long` |

## 关联（8 个）

- `batchPriceUnit` -> `pc.unit.Unit` ()
- `productApplyRangeId` -> `pc.product.ProductApplyRange` ()
- `productId` -> `pc.product.Product` (0..n)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `skuDetailCharacterDef` -> `pc.product.SkuDetailCharacterDef` ()
- `productDetailId` -> `pc.product.ProductDetail` (0..n)
- `skuId` -> `pc.product.ProductSKU` (0..n)
- `stockUnit` -> `pc.unit.Unit` ()
