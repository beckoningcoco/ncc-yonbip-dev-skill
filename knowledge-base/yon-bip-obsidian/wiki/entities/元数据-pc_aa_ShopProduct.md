---
tags: [BIP, 元数据, 数据字典, pc.aa.ShopProduct]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# (停用)ShopProduct (`pc.aa.ShopProduct`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`` | domain：`productcenter` | 应用：`pc` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | (停用)ShopProduct |
| 物理表 | `` |
| 数据库 schema | `productcenter` |
| 所属应用 | `pc` |
| 直连字段 | 98 个 |
| 子表 | 0 个 |
| 关联引用 | 16 个 |

## 关联引用 (16个)

| 字段名 | 引用类型 |
|--------|---------|
| `productId` | `` |
| `batchPriceUnit` | `` |
| `receiptWarehouse` | `` |
| `ytenant_id` | `` |
| `offlineUnit` | `` |
| `orgId` | `` |
| `onlineUnit` | `` |
| `stockUnit` | `` |
| `inTaxrate` | `` |
| `purchaseUnit` | `` |
| `outTaxrate` | `` |
| `batchUnit` | `` |
| `requireUnit` | `` |
| `customerId` | `` |
| `purchasePriceUnit` | `` |
| `tenant` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`coredoc.pub.TenantObselete`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 98 个直连字段

### other (98个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `allowStorePurchase` | `allowStorePurchase` | `allowStorePurchase` | 零售-允许门店自采 |
| `barCode` | `barCode` | `barCode` | 条形码 |
| `batchPrice` | `batchPrice` | `batchPrice` | 批发价 |
| `fAssistUnitCount` | `fAssistUnitCount` | `batchPriceRate` | 批改报价单位换算率 |
| `batchPriceUnit` | `batchPriceUnit` | `batchPriceUnit` | 批发计价单位 |
| `fAssistUnitCount` | `fAssistUnitCount` | `batchRate` | 批发单位换算率 |
| `batchUnit` | `batchUnit` | `batchUnit` | 批发销售单位 |
| `businessAttribute` | `businessAttribute` | `businessAttribute` | 业务属性 |
| `canSale` | `canSale` | `canSale` | 批发-可售状态 |
| `checkByBatch` | `checkByBatch` | `checkByBatch` | 成本-按批次核算 |
| `checkFreeType` | `checkFreeType` | `checkFreeType` | 成本-按规格核算 |
| `customerId` | `customerId` | `customerId` | 客户ID |
| `deliverQuantityChange` | `deliverQuantityChange` | `deliverQuantityChange` | 零售-交货数量改变时 |
| `deliveryDays` | `deliveryDays` | `deliveryDays` | 批发-交货周期（天） |
| `depositDealPayType` | `depositDealPayType` | `depositDealPayType` | 商城-定金设置类型 |
| `depositPayType` | `depositPayType` | `depositPayType` | 商城-支付尾款方式 |
| `depositPercentage` | `depositPercentage` | `depositPercentage` | 商城-预付定金百分比 |
| `deposits` | `deposits` | `deposits` | 商城-预付定金金额 |
| `enableDeposit` | `enableDeposit` | `enableDeposit` | 商城-启用定金业务 |
| `saleChannelOfOfflineRetail` | `saleChannelOfOfflineRetail` | `enabled` | 销售渠道-线下零售 |
| `enablemodifyDeposit` | `enablemodifyDeposit` | `enablemodifyDeposit` | 商城-订单改价时可修改定金 |
| `cEngineeringDrawingNo` | `cEngineeringDrawingNo` | `engineeringDrawingNo` | 制造-工程图号 |
| `expireDateNo` | `expireDateNo` | `expireDateNo` | 库存-保质期 |
| `expireDateUnit` | `expireDateUnit` | `expireDateUnit` | 库存-保质期单位 |
| `fLowestMarkPrice` | `fLowestMarkPrice` | `fLowestMarkPrice` | 最低零售价 |
| `fMarketPrice` | `fMarketPrice` | `fMarketPrice` | 市场价 |
| `fNoTaxCostPrice` | `fNoTaxCostPrice` | `fNoTaxCostPrice` | 成本-参考成本 |
| `fPrimeCosts` | `fPrimeCosts` | `fPrimeCosts` | 采购参考价 |
| `fSalePrice` | `fSalePrice` | `fSalePrice` | 线上零售价 |
| `fSettleAccountsRate` | `fSettleAccountsRate` | `fSettleAccountsRate` | 商城-结算费率 |
| `highestStock` | `highestStock` | `highestStock` | 库存-最高库存 |
| `iBaseSaleCount` | `iBaseSaleCount` | `iBaseSaleCount` | 商城-初始销量 |
| `iEnableCyclePurchase` | `iEnableCyclePurchase` | `iEnableCyclePurchase` | 商城-启用周期购 |
| `iMinOrderQuantity` | `iMinOrderQuantity` | `iMinOrderQuantity` | 批发-起订量 |
| `iOrder` | `iOrder` | `iOrder` | 排序号 |
| `iStatus` | `iStatus` | `iStatus` | 停用状态 |
| `iUOrderStatus` | `iUOrderStatus` | `iUOrderStatus` | U订货上下架状态 |
| `id` | `id` | `id` | ID |
| `inStoreExcessLimit` | `inStoreExcessLimit` | `inStoreExcessLimit` | 库存-入库超量上限% |
| `inTaxrate` | `inTaxrate` | `inputTax` | 进项税率（%） |
| `isBarcodeManage` | `isBarcodeManage` | `isBarcodeManage` | 库存-条码管理 |
| `isBatchManage` | `isBatchManage` | `isBatchManage` | 库存-是否批次管理 |
| `isCheckFree` | `isCheckFree` | `isCheckFree` | 成本-按规格核算 |
| `isCreator` | `isCreator` | `isCreator` | 是否创建者 |
| `isDisplayPrice` | `isDisplayPrice` | `isDisplayPrice` | 线上显示价格 |
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
| `lInventoryCount` | `lInventoryCount` | `lInventoryCount` | 商城-线上库存量 |
| `lowestStock` | `lowestStock` | `lowestStock` | 库存-最低库存 |
| `malldowncount` | `malldowncount` | `malldowncount` | 商城下架数量 |
| `mallupcount` | `mallupcount` | `mallupcount` | 商城上架数量 |
| `fMarkPrice` | `fMarkPrice` | `markPrice` | 建议零售价 |
| `minimumDeposits` | `minimumDeposits` | `minimumDeposits` | 商城-最低定金金额 |
| `mnemonicCode` | `mnemonicCode` | `mnemonicCode` | 助记码 |
| `fAssistUnitCount` | `fAssistUnitCount` | `offlineRate` | 线下零售单位换算率 |
| `offlineUnit` | `offlineUnit` | `offlineUnit` | 线下零售单位 |
| `fAssistUnitCount` | `fAssistUnitCount` | `onlineRate` | 线上零售单位换算率 |
| `onlineUnit` | `onlineUnit` | `onlineUnit` | 线上零售单位 |
| `orgId` | `orgId` | `orgId` | 组织ID |
| `outStoreExcessLimit` | `outStoreExcessLimit` | `outStoreExcessLimit` | 库存-出库超量上限% |
| `outTaxrate` | `outTaxrate` | `outTaxrate` | 销项税率（%） |
| `priceAreaMessage` | `priceAreaMessage` | `priceAreaMessage` | 线上不显示价格时，需要显示的提示信息 |
| `processType` | `processType` | `processType` | 零售-加工方式 |
| `productId` | `productId` | `product` | 所属物料 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `purchasePriceUnit` | `purchasePriceUnit` | `purchasePriceUnit` | 采购计价单位 |
| `fAssistUnitCount` | `fAssistUnitCount` | `purchaseRate` | 采购单位换算率 |
| `purchaseUnit` | `purchaseUnit` | `purchaseUnit` | 采购单位 |
| `rangeType` | `rangeType` | `rangeType` | 物料适用范围类型 |
| `receiptWarehouse` | `receiptWarehouse` | `receiptWarehouse` | 采购-收货仓库 |
| `fAssistUnitCount` | `fAssistUnitCount` | `requireRate` | 要货单位换算率 |
| `requireUnit` | `requireUnit` | `requireUnit` | 要货单位 |
| `retailPriceDimension` | `retailPriceDimension` | `retailPriceDimension` | 零售-零售取价维度 |
| `ropStock` | `ropStock` | `ropStock` | 库存-再订货点 |
| `safetyStock` | `safetyStock` | `safetyStock` | 库存-安全库存 |
| `saleChannel` | `saleChannel` | `saleChannel` | 销售渠道 |
| `saleChannelOfDistribution` | `saleChannelOfDistribution` | `saleChannelOfDistribution` | 销售渠道-微分销 |
| `saleChannelOfOnlineBatch` | `saleChannelOfOnlineBatch` | `saleChannelOfOnlineBatch` | 销售渠道-线下零售 |
| `saleChannelOfOnlineRetail` | `saleChannelOfOnlineRetail` | `saleChannelOfOnlineRetail` | 销售渠道-线上零售 |
| `scanCountUnit` | `scanCountUnit` | `scanCountUnit` | 库存-扫码计数单位 |
| `fAssistUnitCount` | `fAssistUnitCount` | `stockRate` | 采购单位换算率 |
| `stockUnit` | `stockUnit` | `stockUnit` | 库存单位 |
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |
| `stoptime` | `stoptime` | `stoptime` | 停用时间 |
| `tenant` | `tenant` | `tenant` | 租户 |
| `uorderdowncount` | `uorderdowncount` | `uorderdowncount` | U订货下架数量 |
| `uorderupcount` | `uorderupcount` | `uorderupcount` | U订货上架数量 |
| `volume` | `volume` | `volume` | 库存-体积 |
| `weigh` | `weigh` | `weigh` | 制造-是否过磅 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
