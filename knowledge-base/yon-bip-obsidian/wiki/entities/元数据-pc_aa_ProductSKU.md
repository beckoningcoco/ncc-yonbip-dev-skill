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

> **平台版本：BIP 旗舰版 V5**
> 物理表：`` | domain：`productcenter` | 应用：`pc` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | (停用)ProductSKU |
| 物理表 | `` |
| domain/服务域 | `productcenter` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `pc` |
| 直连字段 | 36 个 |
| 子表 | 3 个 |
| 关联引用 | 9 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `retailskus` | `aa.product.RetailSku` | composition |
| `productSkuProps` | `aa.product.ProductSkuProps` | composition |
| `shopProductSku` | `pc.aa.ShopProductSKU` | composition |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `productId` | `` |
| `` | `` |
| `ytenant_id` | `` |
| `skupropcharacter` | `` |
| `batchUnit` | `` |
| `skufreecharacter` | `` |
| `tenant` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`coredoc.pub.TenantObselete`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 36 个直连字段

### other (34个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `barCode` | `barCode` | `barCode` | SKU条形码 |
| `batchUnit` | `batchUnit` | `batchUnit` | 包装单位 |
| `code` | `code` | `cCode` | SKU编码 |
| `cSpecs` | `cSpecs` | `cSpecs` | 规格值 |
| `isDeleted` | `isDeleted` | `deleted` | 是否删除 |
| `erpCode` | `erpCode` | `erpCode` | 商家编码 |
| `free_value_ids` | `free_value_ids` | `freeValueIds` | 自由项特征值id集合 |
| `free_value_ids_md5` | `free_value_ids_md5` | `freeValueIdsMd5` | 自由项特征值id组合md5 |
| `free_values` | `free_values` | `freeValues` | 自由项特征值组合json |
| `id` | `id` | `id` | ID |
| `inventoryCount` | `inventoryCount` | `inventoryCount` | 线上库存量 |
| `isSKU` | `isSKU` | `isSKU` | 是否SKU |
| `markPrice` | `markPrice` | `markPrice` | 建议零售价 |
| `cModel` | `cModel` | `model` | 型号 |
| `modelDescription` | `modelDescription` | `modelDescription` | 规格说明 |
| `fNoTaxCostPrice` | `fNoTaxCostPrice` | `noTaxCostPrice` | 参考成本 |
| `fPrimeCosts` | `fPrimeCosts` | `primeCosts` | 进货价格 |
| `productId` | `productId` | `product` | 所属物料 |
| `` | `` | `productSkuProps` |  |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `` | `` | `retailskus` |  |
| `salePoints` | `salePoints` | `salePoints` | 销售积分 |
| `salePrice` | `salePrice` | `salePrice` | 线上零售价 |
| `saled` | `saled` | `saled` | 已售标记 |
| `` | `` | `shopProductSku` |  |
| `shortName` | `shortName` | `skuAbbreviation` | SKU简称 |
| `name` | `name` | `skuName` | SKU名称 |
| `specIds` | `specIds` | `specIds` | 规格ID |
| `status` | `status` | `status` | 商城上下架状态 |
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |
| `stoptime` | `stoptime` | `stoptime` | 停用时间 |
| `tenant` | `tenant` | `tenant` | 租户 |
| `weight` | `weight` | `weight` | 重量 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### FreeCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `skufreecharacter` | `skufreecharacter` | `skuFreeCharacter` | sku自由项特征组 |

### SkuPropCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `skupropcharacter` | `skupropcharacter` | `skuPropCharacter` | sku属性特征组 |
