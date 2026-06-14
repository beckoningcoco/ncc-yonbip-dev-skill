---
tags: [BIP, 元数据, 数据字典, pc.aa.ProductOfflineRetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# (停用)ProductOfflineRetail (`pc.aa.ProductOfflineRetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`` | domain：`productcenter` | 应用：`pc` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | (停用)ProductOfflineRetail |
| 物理表 | `` |
| domain/服务域 | `productcenter` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `pc` |
| 直连字段 | 89 个 |
| 子表 | 0 个 |
| 关联引用 | 19 个 |

## 关联引用 (19个)

| 字段名 | 引用类型 |
|--------|---------|
| `produceUnit` | `` |
| `batchPriceUnit` | `` |
| `ytenant_id` | `` |
| `productBuyer` | `` |
| `warehouseManager` | `` |
| `requireUnit` | `` |
| `offlineUnit` | `` |
| `onlineUnit` | `` |
| `productVendor` | `` |
| `stockUnit` | `` |
| `inTaxrate` | `` |
| `purchaseUnit` | `` |
| `productApplyRangeId` | `` |
| `deliveryWarehouse` | `` |
| `outTaxrate` | `` |
| `batchUnit` | `` |
| `purchasePriceUnit` | `` |
| `tenant` | `` |
| `returnWarehouse` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`coredoc.pub.TenantObselete`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 89 个直连字段

### other (89个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `allowStorePurchase` | `allowStorePurchase` | `allowStorePurchase` | 零售-允许门店自采 |
| `barCode` | `barCode` | `barCode` | 条形码 |
| `batchPrice` | `batchPrice` | `batchPrice` | 批发价 |
| `fMainUnitCount` | `fMainUnitCount` | `batchPriceRate` | 批改报价单位换算率 |
| `batchPriceUnit` | `batchPriceUnit` | `batchPriceUnit` | 批发计价单位 |
| `fMainUnitCount` | `fMainUnitCount` | `batchRate` | 批发单位换算率 |
| `batchUnit` | `batchUnit` | `batchUnit` | 批发销售单位 |
| `businessAttribute` | `businessAttribute` | `businessAttribute` | 业务属性 |
| `checkByBatch` | `checkByBatch` | `checkByBatch` | 成本-按批次核算 |
| `checkFreeType` | `checkFreeType` | `checkFreeType` | 成本-按规格核算 |
| `daysBeforeValidityReject` | `daysBeforeValidityReject` | `daysBeforeValidityReject` | 库存-近有效期拒收天数 |
| `deliverQuantityChange` | `deliverQuantityChange` | `deliverQuantityChange` | 零售-交货数量改变时 |
| `deliveryWarehouse` | `deliveryWarehouse` | `deliveryWarehouse` | 库存-发货仓库 |
| `saleChannelOfOfflineRetail` | `saleChannelOfOfflineRetail` | `enabled` | 销售渠道-线下零售 |
| `cEngineeringDrawingNo` | `cEngineeringDrawingNo` | `engineeringDrawingNo` | 制造-工程图号 |
| `expireDateNo` | `expireDateNo` | `expireDateNo` | 库存-保质期 |
| `expireDateUnit` | `expireDateUnit` | `expireDateUnit` | 库存-保质期单位 |
| `fLowestMarkPrice` | `fLowestMarkPrice` | `fLowestMarkPrice` | 最低零售价 |
| `fMarketPrice` | `fMarketPrice` | `fMarketPrice` | 市场价 |
| `fNoTaxCostPrice` | `fNoTaxCostPrice` | `fNoTaxCostPrice` | 成本-参考成本 |
| `fPrimeCosts` | `fPrimeCosts` | `fPrimeCosts` | 采购参考价 |
| `fSalePrice` | `fSalePrice` | `fSalePrice` | 线上零售价 |
| `fSettleAccountsRate` | `fSettleAccountsRate` | `fSettleAccountsRate` | 商城-结算费率 |
| `freeTaxCostPrice` | `freeTaxCostPrice` | `freeTaxCostPrice` | 成本-参考成本 |
| `highestStock` | `highestStock` | `highestStock` | 库存-最高库存 |
| `iOrder` | `iOrder` | `iOrder` | 排序号 |
| `id` | `id` | `id` | ID |
| `inStoreExcessLimit` | `inStoreExcessLimit` | `inStoreExcessLimit` | 库存-入库超量上限% |
| `inTaxrate` | `inTaxrate` | `inputTax` | 进项税率（%） |
| `isBarcodeManage` | `isBarcodeManage` | `isBarcodeManage` | 库存-条码管理 |
| `isBatchAccounting` | `isBatchAccounting` | `isBatchAccounting` | 成本-按批次核算 |
| `isBatchManage` | `isBatchManage` | `isBatchManage` | 库存-是否批次管理 |
| `isCheckFree` | `isCheckFree` | `isCheckFree` | 成本-按规格核算 |
| `isDisplayPrice` | `isDisplayPrice` | `isDisplayPrice` | 停用状态 |
| `isExpiryDateCalculationMethod` | `isExpiryDateCalculationMethod` | `isExpiryDateCalculationMethod` | 库存-有效期推算方式 |
| `isExpiryDateManage` | `isExpiryDateManage` | `isExpiryDateManage` | 库存-是否有效期管理 |
| `isMaterial` | `isMaterial` | `isMaterial` | 零售-材料 |
| `isOfflineStoreOrder` | `isOfflineStoreOrder` | `isOfflineStoreOrder` | 零售-允许门店要货 |
| `isOfflineStoreReturn` | `isOfflineStoreReturn` | `isOfflineStoreReturn` | 零售-允许门店退货 |
| `isPriceChangeAllowed` | `isPriceChangeAllowed` | `isPriceChangeAllowed` | 零售-允许开单改价 |
| `isProcess` | `isProcess` | `isProcess` | 零售-加工 |
| `isSaleInOfflineStore` | `isSaleInOfflineStore` | `isSaleInOfflineStore` | 零售-允许门店销售 |
| `isSerialNoManage` | `isSerialNoManage` | `isSerialNoManage` | 库存-是否序列号管理 |
| `isWeight` | `isWeight` | `isWeight` | 零售-是否称重 |
| `lowestStock` | `lowestStock` | `lowestStock` | 库存-最低库存 |
| `fMarkPrice` | `fMarkPrice` | `markPrice` | 建议零售价 |
| `maxPrimeCosts` | `maxPrimeCosts` | `maxPrimeCosts` | 最高进价 |
| `mnemonicCode` | `mnemonicCode` | `mnemonicCode` | 助记码 |
| `fMainUnitCount` | `fMainUnitCount` | `offlineRate` | 线下零售单位换算率 |
| `offlineUnit` | `offlineUnit` | `offlineUnit` | 线下零售单位 |
| `fMainUnitCount` | `fMainUnitCount` | `onlineRate` | 线上零售单位换算率 |
| `onlineUnit` | `onlineUnit` | `onlineUnit` | 线上零售单位 |
| `fMainUnitCount` | `fMainUnitCount` | `orderConversionRate` | 要货单位换算率 |
| `outStoreExcessLimit` | `outStoreExcessLimit` | `outStoreExcessLimit` | 库存-出库超量上限% |
| `outTaxrate` | `outTaxrate` | `outTaxrate` | 销项税率（%） |
| `planOrderLimit` | `planOrderLimit` | `planOrderLimit` | 计划订货超量上限% |
| `priceAreaMessage` | `priceAreaMessage` | `priceAreaMessage` | 线上不显示价格时，需要显示的提示信息 |
| `processType` | `processType` | `processType` | 零售-加工方式 |
| `produceRate` | `produceRate` | `produceRate` | 生产单位换算率 |
| `produceUnit` | `produceUnit` | `produceUnit` | 生产单位 |
| `productApplyRangeId` | `productApplyRangeId` | `productApplyRangeId` | 物料分配范围ID |
| `productBuyer` | `productBuyer` | `productBuyer` | 采购员 |
| `productVendor` | `productVendor` | `productVendor` | 供应商 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `purchasePriceUnit` | `purchasePriceUnit` | `purchasePriceUnit` | 采购计价单位 |
| `fMainUnitCount` | `fMainUnitCount` | `purchaseRate` | 采购单位换算率 |
| `purchaseUnit` | `purchaseUnit` | `purchaseUnit` | 采购单位 |
| `requestOrderLimit` | `requestOrderLimit` | `requestOrderLimit` | 请购订货超量上限% |
| `reservation` | `reservation` | `reservation` | 库存-可预留 |
| `retailPriceDimension` | `retailPriceDimension` | `retailPriceDimension` | 零售-零售取价维度 |
| `returnWarehouse` | `returnWarehouse` | `returnWarehouse` | 库存-退货仓库 |
| `ropStock` | `ropStock` | `ropStock` | 库存-再订货点 |
| `safetyStock` | `safetyStock` | `safetyStock` | 库存-安全库存 |
| `saleChannel` | `saleChannel` | `saleChannel` | 销售渠道 |
| `saleChannelOfDistribution` | `saleChannelOfDistribution` | `saleChannelOfDistribution` | 销售渠道-微分销 |
| `saleChannelOfOnlineBatch` | `saleChannelOfOnlineBatch` | `saleChannelOfOnlineBatch` | 销售渠道-线下零售 |
| `saleChannelOfOnlineRetail` | `saleChannelOfOnlineRetail` | `saleChannelOfOnlineRetail` | 销售渠道-线上零售 |
| `scanCountUnit` | `scanCountUnit` | `scanCountUnit` | 库存-扫码计数单位 |
| `fMainUnitCount` | `fMainUnitCount` | `stockRate` | 采购单位换算率 |
| `stockUnit` | `stockUnit` | `stockUnit` | 库存单位 |
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |
| `requireUnit` | `requireUnit` | `storeOrderUnitKey` | 要货单位 |
| `tenant` | `tenant` | `tenant` | 租户 |
| `validityWarningDays` | `validityWarningDays` | `validityWarningDays` | 库存-效期预警天数 |
| `iValueManageType` | `iValueManageType` | `valueManageType` | 成本-价值管理模式 |
| `volume` | `volume` | `volume` | 库存-体积 |
| `warehouseManager` | `warehouseManager` | `warehouseManager` | 库存-库管员 |
| `weight` | `weight` | `weight` | 库存-重量 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
