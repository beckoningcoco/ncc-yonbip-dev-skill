---
tags: [BIP, 元数据, 数据字典, pc.aa.Product]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# (停用)Product (`pc.aa.Product`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `` | 应用: `pc` | 类型: `Class`

## 属性（67 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `abbreviation` | abbreviation | `abbreviation` | String | `` |
| 2 | `barCode` | bar编码 | `barCode` | String | `` |
| 3 | `cCode` | c编码 | `code` | String | `` |
| 4 | `cName` | c名称 | `name` | String | `` |
| 5 | `couponId` | couponID | `couponId` | a96db54f-8118-4d2b-8c91-dae4d2fd160e | `` |
| 6 | `couponType` | couponType | `couponType` | Integer | `` |
| 7 | `creatorType` | creatorType | `creatorType` | CreatorType | `` |
| 8 | `cust` | cust | `cust` | 69bfc334-60af-4138-acc8-c3b08eb1b6b4 | `` |
| 9 | `defaultAlbumId` | defaultAlbumID | `url` | String | `` |
| 10 | `defaultSKUId` | defaultSKUID | `defaultSKUId` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `` |
| 11 | `deleted` | deleted | `isDeleted` | Boolean | `` |
| 12 | `deliveryWarehouse` | deliveryWarehouse | `deliveryWarehouse` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `` |
| 13 | `erpCode` | erp编码 | `erpCode` | String | `` |
| 14 | `fMarketPrice` | fMarketPrice | `fMarketPrice` | Decimal | `` |
| 15 | `fSalePrice` | fSalePrice | `fSalePrice` | Decimal | `` |
| 16 | `hasSpecs` | hasSpecs | `hasSpecs` | Boolean | `` |
| 17 | `id` | ID | `id` | Long | `` |
| 18 | `inputTax` | inputTax | `inTaxrate` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `` |
| 19 | `isCreator` | 是否Creator | `isCreator` | Boolean | `` |
| 20 | `manageClass` | manageClass | `manageClass` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `` |
| 21 | `manufacturer` | manufacturer | `manufacturer` | String | `` |
| 22 | `markPrice` | markPrice | `fMarkPrice` | Decimal | `` |
| 23 | `mnemonicCode` | mnemonic编码 | `mnemonicCode` | String | `` |
| 24 | `model` | model | `model` | String | `` |
| 25 | `modelDescription` | modelDescription | `modelDescription` | String | `` |
| 26 | `netWeight` | netWeight | `netWeight` | Decimal | `` |
| 27 | `netWeightUnit` | netWeightUnit | `netWeightUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `` |
| 28 | `oUnitId` | oUnitID | `unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `` |
| 29 | `orgId` | 组织ID | `orgId` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `` |
| 30 | `outTaxrate` | outTaxrate | `outTaxrate` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `` |
| 31 | `placeOfOrigin` | placeOfOrigin | `placeOfOrigin` | String | `` |
| 32 | `primeCosts` | primeCosts | `maxPrimeCosts` | Decimal | `` |
| 33 | `productBrand` | productBrand | `brand` | 75116b40-efe4-455e-b62d-d56ac4811eb1 | `` |
| 34 | `productClass` | productClass | `productClass` | 5ad8fc93-4e6b-409f-a70f-462efa6fcee9 | `` |
| 35 | `pubts` | 时间戳 | `pubts` | DateTime | `` |
| 36 | `pubuts` | pubuts | `pubts` | DateTime | `` |
| 37 | `realProductAttribute` | realProductAttribute | `realProductAttribute` | Integer | `` |
| 38 | `realProductAttributeType` | realProductAttributeType | `realProductAttributeType` | Integer | `` |
| 39 | `receiptName` | receipt名称 | `receiptName` | String | `` |
| 40 | `receiptWarehouse` | receiptWarehouse | `receiptWarehouse` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `` |
| 41 | `reservation` | reservation | `reservation` | Boolean | `` |
| 42 | `shortName` | short名称 | `shortName` | String | `` |
| 43 | `source` | source | `source` | ProductSource | `` |
| 44 | `specPropertyTemplate` | specPropertyTemplate | `productTemplate` | c40d564b-d166-4e0e-875f-1fafdab28955 | `` |
| 45 | `status` | 状态 | `stopstatus` | Boolean | `` |
| 46 | `taxClass` | taxClass | `taxClass` | 76bb6900-8cb4-4837-86b2-1d0ddab73269 | `` |
| 47 | `tenant` | tenant | `tenant` | c213cd56-d5de-421f-bae7-d77455b557cd | `` |
| 48 | `virtualProductAttribute` | virtualProductAttribute | `virtualProductAttribute` | Integer | `` |
| 49 | `volume` | volume | `volume` | Decimal | `` |
| 50 | `volumeUnit` | volumeUnit | `volumeUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `` |
| 51 | `weight` | weight | `weight` | Decimal | `` |
| 52 | `weightUnit` | weightUnit | `weightUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `` |
| 53 | `freeDefine` | freeDefine | `` | eb7d9145-cb45-4a96-974a-c2877736eb38 | `` |
| 54 | `homepageBusinessId` | homepageBusinessID | `homepage_business_id` | String | `` |
| 55 | `iABCClass` | iABCClass | `iABCClass` | Integer | `` |
| 56 | `productAlbums` | productAlbums | `` | b79dfa9c-2738-442b-b27e-43b7c63c5147 | `` |
| 57 | `productApplyRanges` | productApplyRanges | `` | 444ccb86-4b60-45af-82a1-f37fd1b8bf1f | `` |
| 58 | `productAssistUnitExchanges` | productAssistUnitExchanges | `` | adbcbd2c-ff00-487e-9144-629b9583b445 | `` |
| 59 | `productBarCodes` | productBarCodes | `` | ddab7c90-d6a4-49a6-b6f5-aa9d8e5b31e0 | `` |
| 60 | `productLine` | productLine | `productLineId` | fcdf5213-a995-4874-928f-ff97bcfa4b91 | `` |
| 61 | `productOfflineRetail` | productOfflineRetail | `` | 6f4d7ef0-3a73-414f-a237-ab00af62f2eb | `` |
| 62 | `productPropCharacterDefine` | productPropCharacterDefine | `iProductPropCharacterDefine` | 34e76385-7dbd-4fd1-91ff-56ead36c9565 | `MaterialPropCT` |
| 63 | `productProps` | productProps | `` | 7a1a021a-657f-47e9-a14d-dbd88a18d5bf | `` |
| 64 | `productskus` | productskus | `` | 0d86941d-5af3-4cf4-9255-4f5c74a3476f | `` |
| 65 | `purchaseOrderQuantity` | purchaseOrderQuantity | `purchase_order_quantity` | Decimal | `` |
| 66 | `shopProduct` | shopProduct | `` | 0599b497-f178-41e3-874b-492842894394 | `` |
| 67 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `` |

## 关联（30 个）

- `productskus` -> `pc.aa.ProductSKU` (1..n)
- `productAssistUnitExchanges` -> `pc.aa.ProductAssistUnitExchange` (0..n)
- `productBrand` -> `pc.brand.Brand` ()
- `volumeUnit` -> `pc.unit.Unit` ()
- `couponId` -> `membercenter.archive.Coupon` ()
- `orgId` -> `aa.baseorg.OrgMV` ()
- `inputTax` -> `archive.taxArchives.TaxRateArchive` ()
- `productLine` -> `pc.productline.ProductLine` ()
- `oUnitId` -> `pc.unit.Unit` ()
- `shopProduct` -> `pc.aa.ShopProduct` (0..n)
- `outTaxrate` -> `archive.taxArchives.TaxRateArchive` ()
- `productApplyRanges` -> `pc.aa.ProductApplyRange` (1..n)
- `defaultSKUId` -> `pc.product.ProductSKU` ()
- `manageClass` -> `pc.cls.ManagementClass` ()
- `productPropCharacterDefine` -> `pc.product.ProductPropCharacterDefine` ()
- `tenant` -> `base.tenant.Tenant` ()
- `netWeightUnit` -> `pc.unit.Unit` ()
- `taxClass` -> `pc.tax.TaxRevenue` ()
- `productClass` -> `pc.cls.PresentationClass` ()
- `receiptWarehouse` -> `aa.warehouse.Warehouse` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `productProps` -> `pc.product.ProductDefine` (1)
- `specPropertyTemplate` -> `pc.tpl.ProductTpl` ()
- `productOfflineRetail` -> `pc.aa.ProductOfflineRetail` (1)
- `productAlbums` -> `aa.product.ProductAlbum` (0..n)
- `deliveryWarehouse` -> `aa.warehouse.Warehouse` ()
- `freeDefine` -> `pc.product.ProductFreeDefine` (1)
- `cust` -> `aa.customer.Customer` ()
- `productBarCodes` -> `pc.product.ProductBarCode` (0..n)
- `weightUnit` -> `pc.unit.Unit` ()
