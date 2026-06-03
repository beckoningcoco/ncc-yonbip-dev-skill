---
tags: [BIP, 元数据, 数据字典, pc.product.ProductSKUExtend]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# (停用)物料SKU详情(管理组织) (`pc.product.ProductSKUExtend`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`productskudetailnew` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | (停用)物料SKU详情(管理组织) |
| 物理表 | `productskudetailnew` |
| 数据库 schema | `productcenter` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 37 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `batchPriceUnitId` | `` |
| `productApplyRangeId` | `` |
| `productId` | `` |
| `ytenant_id` | `` |
| `skuId` | `` |

## 继承接口 (3个, 4字段)

- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **租户相关** (`coredoc.pub.TenantObselete`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 37 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `shortName` | `shortName` | `shortName` | SKU简称 |
| `mnemonicCode` | `mnemonicCode` | `mnemonicCode` | SKU助记码 |
| `cBarCode` | `cBarCode` | `barCode` | SKU条形码 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户ID |
| `productId` | `productId` | `productId` | 所属物料 |
| `productApplyRangeId` | `productApplyRangeId` | `productApplyRangeId` | 物料适用范围ID |
| `skuId` | `skuId` | `skuId` | SKUID |
| `batchPriceUnitId` | `batchPriceUnitId` | `batchPriceUnit` | 批发计价单位 |

### 布尔字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iSaled` | `iSaled` | `saled` | 已售标记 |
| `iUStatus` | `iUStatus` | `ustatus` | U订货上下架状态 |
| `iUStatus_b` | `iUStatus_b` | `ustatus_b` | U订货上下架状态_备用 |
| `iStatus` | `iStatus` | `status` | 商城上下架状态 |
| `iStatus_b` | `iStatus_b` | `status_b` | 商城上下架状态_备用 |
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |
| `isCreator` | `isCreator` | `isCreator` | 是否创建者 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `batchDeliveryDays` | `batchDeliveryDays` | `batchDeliveryDays` | 批发-交货周期(天) |
| `salePoints` | `salePoints` | `salePoints` | 销售积分 |
| `iOrder` | `iOrder` | `iOrder` | 排序号 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户ID(旧) |

### 数值字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `highestStock` | `highestStock` | `highestStock` | 最高库存 |
| `lowestStock` | `lowestStock` | `lowestStock` | 最低库存 |
| `fNoTaxCostPrice` | `fNoTaxCostPrice` | `fNoTaxCostPrice` | 参考成本 |
| `fPrimeCosts` | `fPrimeCosts` | `fPrimeCosts` | 采购参考价 |
| `iMinOrderQuantity` | `iMinOrderQuantity` | `iMinOrderQuantity` | 批发-起订量 |
| `iDoubleSale` | `iDoubleSale` | `iDoubleSale` | 销售倍量 |
| `batchPrice` | `batchPrice` | `batchPrice` | 批发价 |
| `fMarkPrice` | `fMarkPrice` | `markPrice` | 建议零售价 |
| `fSalePrice` | `fSalePrice` | `salePrice` | 线上零售价 |
| `fLowestMarkPrice` | `fLowestMarkPrice` | `fLowestMarkPrice` | 最低零售价 |
| `fMarketPrice` | `fMarketPrice` | `fMarketPrice` | 市场价 |
| `fSettleAccountsRate` | `fSettleAccountsRate` | `fSettleAccountsRate` | 结算费率 |
| `lInventoryCount` | `lInventoryCount` | `inventoryCount` | 线上库存量 |
| `safetyStock` | `safetyStock` | `safetyStock` | 安全库存 |
| `batchPriceUnitRate` | `batchPriceUnitRate` | `batchPriceUnitRate` | 批发计价单位换算率 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
