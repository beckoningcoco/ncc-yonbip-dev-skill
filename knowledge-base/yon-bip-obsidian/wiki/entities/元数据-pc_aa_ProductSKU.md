---
tags: [BIP, 元数据, 数据字典, pc.aa.ProductSKU]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# (停用)ProductSKU (`pc.aa.ProductSKU`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `` | 应用: `pc` | 类型: `Class`

## 属性（36 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `barCode` | bar编码 | `barCode` | String | `` |
| 2 | `batchUnit` | batchUnit | `batchUnit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `` |
| 3 | `cCode` | c编码 | `code` | String | `` |
| 4 | `cSpecs` | cSpecs | `cSpecs` | String | `` |
| 5 | `deleted` | deleted | `isDeleted` | Integer | `` |
| 6 | `erpCode` | erp编码 | `erpCode` | String | `` |
| 7 | `freeValueIds` | freeValueIds | `free_value_ids` | Text | `` |
| 8 | `freeValueIdsMd5` | freeValueIdsMd5 | `free_value_ids_md5` | String | `` |
| 9 | `freeValues` | freeValues | `free_values` | Text | `` |
| 10 | `id` | ID | `id` | Long | `` |
| 11 | `inventoryCount` | inventoryCount | `inventoryCount` | Decimal | `` |
| 12 | `isSKU` | 是否SKU | `isSKU` | Integer | `` |
| 13 | `markPrice` | markPrice | `markPrice` | Decimal | `` |
| 14 | `model` | model | `cModel` | String | `` |
| 15 | `modelDescription` | modelDescription | `modelDescription` | String | `` |
| 16 | `noTaxCostPrice` | noTaxCostPrice | `fNoTaxCostPrice` | Decimal | `` |
| 17 | `primeCosts` | primeCosts | `fPrimeCosts` | Decimal | `` |
| 18 | `product` | product | `productId` | 9a24ef07-e188-425b-b36a-402ddbf22073 | `` |
| 19 | `productSkuProps` | productSkuProps | `` | db49346a-5a0b-4c17-8a83-ed3ea45e7f64 | `` |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime | `` |
| 21 | `retailskus` | retailskus | `` | caf56335-3527-4d58-8222-7bb9fe980a04 | `` |
| 22 | `salePoints` | salePoints | `salePoints` | Integer | `` |
| 23 | `salePrice` | salePrice | `salePrice` | Decimal | `` |
| 24 | `saled` | saled | `saled` | Boolean | `` |
| 25 | `shopProductSku` | shopProductSku | `` | 2831ec4e-fae9-4eb2-990e-b406173e0d68 | `` |
| 26 | `skuAbbreviation` | skuAbbreviation | `shortName` | String | `` |
| 27 | `skuFreeCharacter` | skuFreeCharacter | `skufreecharacter` | d67917f8-98fb-48aa-be8a-ce2a44865ae5 | `FreeCT` |
| 28 | `skuName` | sku名称 | `name` | String | `` |
| 29 | `skuPropCharacter` | skuPropCharacter | `skupropcharacter` | 7717628c-43bf-4a4c-a5bf-d47a86851ae9 | `SkuPropCT` |
| 30 | `specIds` | specIds | `specIds` | String | `` |
| 31 | `status` | 状态 | `status` | Boolean | `` |
| 32 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `` |
| 33 | `stoptime` | stoptime | `stoptime` | DateTime | `` |
| 34 | `tenant` | tenant | `tenant` | c213cd56-d5de-421f-bae7-d77455b557cd | `` |
| 35 | `weight` | weight | `weight` | Decimal | `` |
| 36 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `` |

## 关联（9 个）

- `product` -> `pc.product.Product` (1..n)
- `retailskus` -> `aa.product.RetailSku` (1)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `skuPropCharacter` -> `pc.product.SkuPropCharacter` ()
- `batchUnit` -> `pc.unit.Unit` ()
- `productSkuProps` -> `aa.product.ProductSkuProps` (1)
- `skuFreeCharacter` -> `pc.product.SkuFreeCharacter` ()
- `shopProductSku` -> `pc.aa.ShopProductSKU` (0..n)
- `tenant` -> `base.tenant.Tenant` ()
