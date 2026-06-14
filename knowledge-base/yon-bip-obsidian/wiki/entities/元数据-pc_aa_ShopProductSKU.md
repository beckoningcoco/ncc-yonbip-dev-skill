---
tags: [BIP, 元数据, 数据字典, pc.aa.ShopProductSKU]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# (停用)ShopProductSKU (`pc.aa.ShopProductSKU`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`` | domain：`productcenter` | 应用：`pc` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | (停用)ShopProductSKU |
| 物理表 | `` |
| domain/服务域 | `productcenter` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `pc` |
| 直连字段 | 35 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `productId` | `` |
| `productApplyRangeId` | `` |
| `ytenant_id` | `` |
| `customerId` | `` |
| `orgId` | `` |
| `tenant` | `` |
| `skuId` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`coredoc.pub.TenantObselete`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 35 个直连字段

### other (35个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `barCode` | `barCode` | `barCode` | SKU条形码 |
| `batchDeliveryDays` | `batchDeliveryDays` | `batchDeliveryDays` | 批发-交货周期（天） |
| `batchPrice` | `batchPrice` | `batchPrice` | 批发价 |
| `batchRate` | `batchRate` | `batchRate` | 批发单位换算率 |
| `batchUnit` | `batchUnit` | `batchUnit` | 批发价 |
| `customerId` | `customerId` | `customerId` | 客户ID |
| `fMarketPrice` | `fMarketPrice` | `fMarketPrice` | 市场价 |
| `fNoTaxCostPrice` | `fNoTaxCostPrice` | `fNoTaxCostPrice` | 参考成本 |
| `fPrimeCosts` | `fPrimeCosts` | `fPrimeCosts` | 采购参考价 |
| `fSettleAccountsRate` | `fSettleAccountsRate` | `fSettleAccountsRate` | 结算费率 |
| `iMinOrderQuantity` | `iMinOrderQuantity` | `iMinOrderQuantity` | 批发-起订量 |
| `id` | `id` | `id` | ID |
| `inventoryCount` | `inventoryCount` | `inventoryCount` | 线上库存量 |
| `isCreator` | `isCreator` | `isCreator` | 是否创建者 |
| `markPrice` | `markPrice` | `markPrice` | 建议零售价 |
| `noTaxCostPrice` | `noTaxCostPrice` | `noTaxCostPrice` | 参考成本 |
| `orgId` | `orgId` | `orgId` | 组织ID |
| `productId` | `productId` | `product` | 所属物料 |
| `productApplyRangeId` | `productApplyRangeId` | `productApplyRangeId` | 物料适用范围ID |
| `productId` | `productId` | `productId` | 所属物料 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `rangeType` | `rangeType` | `rangeType` | 物料适用范围类型 |
| `salePoints` | `salePoints` | `salePoints` | 销售积分 |
| `salePrice` | `salePrice` | `salePrice` | 线上零售价 |
| `saled` | `saled` | `saled` | 已售标记 |
| `shopProductId` | `shopProductId` | `shopProductId` | ID |
| `shortName` | `shortName` | `skuAbbreviation` | SKU简称 |
| `skuId` | `skuId` | `skuId` | SKUID |
| `status` | `status` | `status` | 商城上下架状态 |
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |
| `stoptime` | `stoptime` | `stoptime` | 停用时间 |
| `tenant` | `tenant` | `tenant` | 租户 |
| `ustatus` | `ustatus` | `ustatus` | U订货上下架状态 |
| `weight` | `weight` | `weight` | 重量 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
