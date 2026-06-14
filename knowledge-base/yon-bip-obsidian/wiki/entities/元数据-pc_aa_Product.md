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

> **平台版本：BIP 旗舰版 V5**
> 物理表：`` | domain：`productcenter` | 应用：`pc` | 业务对象ID：`e850ba9c-b492-4cf2-a664-55e4c86f4910`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | (停用)Product |
| 物理表 | `` |
| domain/服务域 | `productcenter` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `pc` |
| 直连字段 | 67 个 |
| 子表 | 9 个 |
| 关联引用 | 30 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `productskus` | `pc.aa.ProductSKU` | composition |
| `shopProduct` | `pc.aa.ShopProduct` | composition |
| `productAlbums` | `aa.product.ProductAlbum` | composition |
| `productApplyRanges` | `pc.aa.ProductApplyRange` | composition |
| `productAssistUnitExchanges` | `pc.aa.ProductAssistUnitExchange` | composition |
| `productProps` | `pc.product.ProductDefine` | composition |
| `freeDefine` | `pc.product.ProductFreeDefine` | composition |
| `productOfflineRetail` | `pc.aa.ProductOfflineRetail` | composition |
| `productBarCodes` | `pc.product.ProductBarCode` | composition |

## 关联引用 (30个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `brand` | `` |
| `volumeUnitId` | `` |
| `couponId` | `` |
| `orgId` | `` |
| `inTaxrate` | `` |
| `productLineId` | `` |
| `unit` | `` |
| `outTaxrate` | `` |
| `defaultSKUId` | `` |
| `manageClass` | `` |
| `iProductPropCharacterDefine` | `` |
| `tenant` | `` |
| `netWeightUnitId` | `` |
| `taxClass` | `` |
| `productClass` | `` |
| `receiptWarehouse` | `` |
| `ytenant_id` | `` |
| `productTemplate` | `` |
| `deliveryWarehouse` | `` |
| `cust` | `` |
| `weightUnitId` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`coredoc.pub.TenantObselete`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 67 个直连字段

### other (66个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `abbreviation` | `abbreviation` | `abbreviation` | 物料简称 |
| `barCode` | `barCode` | `barCode` | 条形码 |
| `code` | `code` | `cCode` | 物料编码 |
| `name` | `name` | `cName` | 物料名称 |
| `couponId` | `couponId` | `couponId` | 卡券 |
| `couponType` | `couponType` | `couponType` | 卡券类型 |
| `creatorType` | `creatorType` | `creatorType` | 创建者类型 |
| `cust` | `cust` | `cust` | 创建者客户 |
| `url` | `url` | `defaultAlbumId` | 物料首图片 |
| `defaultSKUId` | `defaultSKUId` | `defaultSKUId` | 默认SKUID |
| `isDeleted` | `isDeleted` | `deleted` | 逻辑删除标记 |
| `deliveryWarehouse` | `deliveryWarehouse` | `deliveryWarehouse` | 库存-发货仓库 |
| `erpCode` | `erpCode` | `erpCode` | 商家编码 |
| `fMarketPrice` | `fMarketPrice` | `fMarketPrice` | 市场价 |
| `fSalePrice` | `fSalePrice` | `fSalePrice` | 线上零售价 |
| `hasSpecs` | `hasSpecs` | `hasSpecs` | 是否包含属性 |
| `id` | `id` | `id` | ID |
| `inTaxrate` | `inTaxrate` | `inputTax` | 进项税率(%) |
| `isCreator` | `isCreator` | `isCreator` | 是否创建者 |
| `manageClass` | `manageClass` | `manageClass` | 物料分类 |
| `manufacturer` | `manufacturer` | `manufacturer` | 生产厂商 |
| `fMarkPrice` | `fMarkPrice` | `markPrice` | 建议零售价 |
| `mnemonicCode` | `mnemonicCode` | `mnemonicCode` | 助记码 |
| `model` | `model` | `model` | 型号 |
| `modelDescription` | `modelDescription` | `modelDescription` | 规格 |
| `netWeight` | `netWeight` | `netWeight` | 库存-净重 |
| `netWeightUnitId` | `netWeightUnitId` | `netWeightUnit` | 库存-净重单位 |
| `unit` | `unit` | `oUnitId` | 主计量单位 |
| `orgId` | `orgId` | `orgId` | 创建者组织 |
| `outTaxrate` | `outTaxrate` | `outTaxrate` | 销项税率(%) |
| `placeOfOrigin` | `placeOfOrigin` | `placeOfOrigin` | 产地 |
| `maxPrimeCosts` | `maxPrimeCosts` | `primeCosts` | 最高进价 |
| `brand` | `brand` | `productBrand` | 物料品牌 |
| `productClass` | `productClass` | `productClass` | 商品分类 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `pubts` | `pubts` | `pubuts` | 时间戳 |
| `realProductAttribute` | `realProductAttribute` | `realProductAttribute` | 物料属性 |
| `realProductAttributeType` | `realProductAttributeType` | `realProductAttributeType` | 实物物料属性 |
| `receiptName` | `receiptName` | `receiptName` | 开票名称 |
| `receiptWarehouse` | `receiptWarehouse` | `receiptWarehouse` | 采购-收货仓库 |
| `reservation` | `reservation` | `reservation` | 库存-可预留 |
| `shortName` | `shortName` | `shortName` | 物料简称 |
| `source` | `source` | `source` | 物料来源 |
| `productTemplate` | `productTemplate` | `specPropertyTemplate` | 物料模板 |
| `stopstatus` | `stopstatus` | `status` | 停用状态 |
| `taxClass` | `taxClass` | `taxClass` | 税收分类码 |
| `tenant` | `tenant` | `tenant` | 租户 |
| `virtualProductAttribute` | `virtualProductAttribute` | `virtualProductAttribute` | 虚拟物料属性 |
| `volume` | `volume` | `volume` | 库存-体积 |
| `volumeUnitId` | `volumeUnitId` | `volumeUnit` | 库存-体积单位 |
| `weight` | `weight` | `weight` | 库存-毛重 |
| `weightUnitId` | `weightUnitId` | `weightUnit` | 库存-毛重单位 |
| `` | `` | `freeDefine` |  |
| `homepage_business_id` | `homepage_business_id` | `homepageBusinessId` | 物料首页图片业务ID |
| `iABCClass` | `iABCClass` | `iABCClass` | 库存-ABC分类 |
| `` | `` | `productAlbums` |  |
| `` | `` | `productApplyRanges` |  |
| `` | `` | `productAssistUnitExchanges` |  |
| `` | `` | `productBarCodes` |  |
| `productLineId` | `productLineId` | `productLine` | 产品线 |
| `` | `` | `productOfflineRetail` |  |
| `` | `` | `productProps` |  |
| `` | `` | `productskus` |  |
| `purchase_order_quantity` | `purchase_order_quantity` | `purchaseOrderQuantity` | 采购-采购起订量 |
| `` | `` | `shopProduct` |  |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### MaterialPropCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iProductPropCharacterDefine` | `iProductPropCharacterDefine` | `productPropCharacterDefine` | 物料属性特征实体 |
