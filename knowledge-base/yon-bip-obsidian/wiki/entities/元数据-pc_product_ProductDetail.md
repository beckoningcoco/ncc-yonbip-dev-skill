---
tags: [BIP, 元数据, 数据字典, pc.product.ProductDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料业务信息 (`pc.product.ProductDetail`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `productdetail` | 应用: `GZTBDM` | 类型: `Class`

## 属性（282 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 3 | `productId` | productID | `productId` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 4 | `orgId` | 组织ID | `orgId` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |
| 5 | `shortName` | short名称 | `shortName` | String | `text` |
| 6 | `mnemonicCode` | mnemonic编码 | `mnemonicCode` | String | `text` |
| 7 | `erpOuterCode` | erpOuter编码 | `cErpOuterCode` | String | `text` |
| 8 | `barCode` | bar编码 | `cBarCode` | String | `text` |
| 9 | `materialStatus` | materialStatus | `material_status` | 84a32a36-3aa1-444f-8155-79e7ce0869c8 | `quote` |
| 10 | `costItems` | costItems | `costItems` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 | `quote` |
| 11 | `businessAttribute` | businessAttribute | `businessAttribute` | String | `text` |
| 12 | `saleChannel` | saleChannel | `saleChannel` | String | `text` |
| 13 | `purchaseUnit` | purchaseUnit | `purchaseUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 14 | `purchasePriceUnit` | purchasePriceUnit | `purchasePriceUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 15 | `stockUnit` | stockUnit | `stockUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 16 | `produceUnit` | produceUnit | `produceUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 17 | `batchPriceUnit` | batchPriceUnit | `batchPriceUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 18 | `inspectionUnit` | inspectionUnit | `inspectionUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 19 | `batchUnit` | batchUnit | `batchUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 20 | `onlineUnit` | onlineUnit | `onlineUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 21 | `offlineUnit` | offlineUnit | `offlineUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 22 | `requireUnit` | requireUnit | `requireUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 23 | `demandPlanningUnit` | demandPlanningUnit | `demandPlanningUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 24 | `fMarkPrice` | fMarkPrice | `fMarkPrice` | Decimal | `number` |
| 25 | `fSalePrice` | fSalePrice | `fSalePrice` | Decimal | `number` |
| 26 | `fMarketPrice` | fMarketPrice | `fMarketPrice` | Decimal | `number` |
| 27 | `isDisplayPrice` | 是否DisplayPrice | `isDisplayPrice` | Boolean | `switch` |
| 28 | `priceAreaMessage` | priceAreaMessage | `priceAreaMessage` | String | `text` |
| 29 | `receiptName` | receipt名称 | `receiptName` | String | `multiLanguage` |
| 30 | `receiptSpec` | receiptSpec | `receiptSpec` | String | `multiLanguage` |
| 31 | `receiptModel` | receiptModel | `receiptModel` | String | `multiLanguage` |
| 32 | `inTaxrate` | inTaxrate | `inTaxrate` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |
| 33 | `outTaxrate` | outTaxrate | `outTaxrate` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |
| 34 | `billingUnit` | billingUnit | `billingUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 35 | `preferentialPolicyType` | preferentialPolicyType | `preferentialPolicyType` | 18c954fe-5588-4eae-bd1a-c66fd1f6dc7f | `quote` |
| 36 | `mallUpTime` | mallUpTime | `mallUpTime` | DateTime | `timestamp` |
| 37 | `mallupcount` | mallupcount | `mallupcount` | Integer | `int` |
| 38 | `mallDownTime` | mallDownTime | `mallDownTime` | DateTime | `timestamp` |
| 39 | `malldowncount` | malldowncount | `malldowncount` | Integer | `int` |
| 40 | `uorderUpTime` | uorderUpTime | `uorderUpTime` | DateTime | `timestamp` |
| 41 | `uorderupcount` | uorderupcount | `uorderupcount` | Integer | `int` |
| 42 | `uorderDownTime` | uorderDownTime | `uorderDownTime` | DateTime | `timestamp` |
| 43 | `uorderdowncount` | uorderdowncount | `uorderdowncount` | Integer | `int` |
| 44 | `productVendor` | productVendor | `productVendor` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 45 | `productBuyer` | productBuyer | `productBuyer` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 46 | `fPrimeCosts` | fPrimeCosts | `fPrimeCosts` | Decimal | `number` |
| 47 | `maxPrimeCosts` | maxPrimeCosts | `fMaxPrimeCosts` | Decimal | `number` |
| 48 | `requestOrderLimit` | requestOrderLimit | `fRequestOrderLimit` | Decimal | `number` |
| 49 | `purchaseOrderQuantity` | purchaseOrderQuantity | `purchase_order_quantity` | Decimal | `number` |
| 50 | `purchaseTimes` | purchaseTimes | `purchase_times` | Decimal | `number` |
| 51 | `receiptWarehouse` | receiptWarehouse | `receiptWarehouse` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |
| 52 | `arrivalAllowErrorLimit` | arrivalAllowErrorLimit | `fArrivalAllowErrorLimit` | Decimal | `number` |
| 53 | `invoiceAllowErrorLimit` | invoiceAllowErrorLimit | `fInvoiceAllowErrorLimit` | Decimal | `number` |
| 54 | `iMinOrderQuantity` | iMinOrderQuantity | `iMinOrderQuantity` | Decimal | `number` |
| 55 | `iDoubleSale` | iDoubleSale | `iDoubleSale` | Decimal | `number` |
| 56 | `deliveryDays` | deliveryDays | `deliveryDays` | Integer | `int` |
| 57 | `overSigning` | overSigning | `overSigning` | Integer | `int` |
| 58 | `omsWarehouse` | omsWarehouse | `OMSWarehouse` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |
| 59 | `isBatchManage` | 是否BatchManage | `isBatchManage` | Boolean | `switch` |
| 60 | `isExpiryDateManage` | 是否ExpiryDateManage | `isExpiryDateManage` | Boolean | `switch` |
| 61 | `isExpiryDateCalculationMethod` | 是否ExpiryDateCalculationMethod | `expirydate_calculation_method` | Short | `short` |
| 62 | `expireDateNo` | expireDateNo | `expireDateNo` | Integer | `int` |
| 63 | `expireDateUnit` | expireDateUnit | `expireDateUnit` | Short | `short` |
| 64 | `daysBeforeValidityReject` | daysBeforeValidityReject | `iDaysBeforeValidityReject` | Integer | `int` |
| 65 | `validityWarningDays` | validityWarningDays | `iValidityWarningDays` | Integer | `int` |
| 66 | `isSerialNoManage` | 是否SerialNoManage | `isSerialNoManage` | Boolean | `switch` |
| 67 | `isBarcodeManage` | 是否BarcodeManage | `isBarcodeManage` | Boolean | `switch` |
| 68 | `manageByInventory` | manageByInventory | `manageByInventory` | Integer | `int` |
| 69 | `safetyStock` | safetyStock | `safetyStock` | Decimal | `number` |
| 70 | `highestStock` | highestStock | `highestStock` | Decimal | `number` |
| 71 | `lowestStock` | lowestStock | `lowestStock` | Decimal | `number` |
| 72 | `ropStock` | ropStock | `ropStock` | Decimal | `number` |
| 73 | `maximumTurnoverDays` | maximumTurnoverDays | `iMaximumTurnoverDays` | Integer | `int` |
| 74 | `iABCClass` | iABCClass | `iABCClass` | Integer | `int` |
| 75 | `warehouseManager` | warehouseManager | `warehouseManager` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 76 | `deliveryWarehouse` | deliveryWarehouse | `deliveryWarehouse` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |
| 77 | `returnWarehouse` | returnWarehouse | `returnWarehouse` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |
| 78 | `inStoreExcessLimit` | inStoreExcessLimit | `fInStoreExcessLimit` | Decimal | `number` |
| 79 | `outStoreExcessLimit` | outStoreExcessLimit | `fOutStoreExcessLimit` | Decimal | `number` |
| 80 | `inStoreLessLimit` | inStoreLessLimit | `fInStoreLessLimit` | Decimal | `number` |
| 81 | `outStoreLessLimit` | outStoreLessLimit | `fOutStoreLessLimit` | Decimal | `number` |
| 82 | `storageLossRate` | storageLossRate | `storageLossRate` | Decimal | `number` |
| 83 | `scanCountUnit` | scanCountUnit | `scanCountUnit` | Short | `short` |
| 84 | `reservation` | reservation | `reservation` | Boolean | `switch` |
| 85 | `atpInspection` | atpInspection | `atpInspection` | Integer | `int` |
| 86 | `inspectionType` | inspectionType | `inspectionType` | Integer | `int` |
| 87 | `inspectionControlPoint` | inspectionControlPoint | `inspectionControlPoint` | Integer | `int` |
| 88 | `productInspection` | productInspection | `productInspection` | Integer | `int` |
| 89 | `productInspectionCtrlPoint` | productInspectionCtrlPoint | `productInspectionCtrlPoint` | Integer | `int` |
| 90 | `outSourceInspection` | outSourceInspection | `outSourceInspection` | Integer | `int` |
| 91 | `transferInspection` | transferInspection | `transferInspection` | Integer | `int` |
| 92 | `productFirstInspection` | productFirstInspection | `productFirstInspection` | Integer | `int` |
| 93 | `firstInspectionCtrlMethod` | firstInspectionCtrlMethod | `firstInspectionCtrlMethod` | Integer | `int` |
| 94 | `testRule` | testRule | `testRule` | TestRule | `` |
| 95 | `enableStockPeriodRecheck` | enableStockPeriodRecheck | `enable_stock_period_recheck` | Integer | `int` |
| 96 | `reviewCycle` | reviewCycle | `review_cycle` | Integer | `int` |
| 97 | `recheckReminderLeadTime` | recheckReminderLeadTime | `recheck_reminder_lead_time` | Integer | `int` |
| 98 | `enableStockExpireCheck` | enableStockExpireCheck | `enable_stock_expire_check` | Integer | `int` |
| 99 | `effectiveLeadTime` | effectiveLeadTime | `effective_lead_time` | Integer | `int` |
| 100 | `checkReminderLeadTime` | checkReminderLeadTime | `check_reminder_lead_time` | Integer | `int` |
| 101 | `sendInspection` | sendInspection | `send_inspection` | Integer | `int` |
| 102 | `returnInspection` | returnInspection | `return_inspection` | Integer | `int` |
| 103 | `planCheckDays` | planCheckDays | `plan_check_days` | Integer | `int` |
| 104 | `singleInspection` | singleInspection | `single_Inspection` | Integer | `int` |
| 105 | `warehousingByResult` | warehousingByResult | `bWarehousingByResult` | Boolean | `switch` |
| 106 | `periodicalInspection` | periodicalInspection | `bPeriodicalInspection` | Boolean | `switch` |
| 107 | `periodicalInspectionCycle` | periodicalInspectionCycle | `iPeriodicalInspectionCycle` | Integer | `int` |
| 108 | `exemption` | exemption | `bExemption` | Boolean | `switch` |
| 109 | `salesReturnsExemption` | salesReturnsExemption | `bSalesReturnsExemption` | Boolean | `switch` |
| 110 | `returnsWarehousingByResult` | returnsWarehousingByResult | `bReturnsWarehousingByResult` | Boolean | `switch` |
| 111 | `supplyType` | supplyType | `supplyType` | Short | `short` |
| 112 | `produceDepartment` | produceDepartment | `produceDepartment` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 113 | `engineeringDrawingNo` | engineeringDrawingNo | `cEngineeringDrawingNo` | String | `text` |
| 114 | `ECNControl` | ECNControl | `bECNControl` | Boolean | `switch` |
| 115 | `fullSetInspection` | fullSetInspection | `full_set_inspection` | Integer | `int` |
| 116 | `doubleReplenish` | doubleReplenish | `doubleReplenish` | Decimal | `number` |
| 117 | `doublePick` | doublePick | `doublePick` | Decimal | `number` |
| 118 | `bindCarrier` | bindCarrier | `bBindCarrier` | Boolean | `switch` |
| 119 | `purpose` | purpose | `iPurpose` | Short | `short` |
| 120 | `weigh` | weigh | `bWeigh` | Boolean | `switch` |
| 121 | `workingPlan` | workingPlan | `bWorkingPlan` | Boolean | `switch` |
| 122 | `productionMode` | productionMode | `production_mode` | ProductionMode | `` |
| 123 | `utility` | utility | `bUtility` | Boolean | `switch` |
| 124 | `planDefaultAttribute` | planDefaultAttribute | `planDefaultAttribute` | Short | `short` |
| 125 | `planMethod` | planMethod | `planMethod` | Short | `short` |
| 126 | `manufacturingStrategy` | manufacturingStrategy | `manufacturing_strategy` | String | `text` |
| 127 | `mtoStrategy` | mtoStrategy | `mto_strategy` | Integer | `int` |
| 128 | `projectTrackStrategy` | projectTrackStrategy | `projectTrackStrategy` | Integer | `int` |
| 129 | `inventoryPlanStrategy` | inventoryPlanStrategy | `inventoryPlanStrategy` | Short | `short` |
| 130 | `manufacturePlanner` | manufacturePlanner | `manufacturePlanner` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 131 | `planProduceLimit` | planProduceLimit | `iPlanProduceLimit` | Decimal | `number` |
| 132 | `keySubPart` | keySubPart | `bKeySubPart` | Boolean | `switch` |
| 133 | `BOMType` | BOMType | `iBOMType` | Short | `short` |
| 134 | `BOMSource` | BOMSource | `BOMSource` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 135 | `batchRule` | batchRule | `iBatchRule` | Short | `short` |
| 136 | `economicQuantity` | economicQuantity | `iEconomicQuantity` | Decimal | `number` |
| 137 | `fixedQuantity` | fixedQuantity | `iFixedQuantity` | Decimal | `number` |
| 138 | `batchDouble` | batchDouble | `iBatchDouble` | Decimal | `number` |
| 139 | `frontLeadTime` | frontLeadTime | `iFrontLeadTime` | Integer | `int` |
| 140 | `behindLeadTime` | behindLeadTime | `iBehindLeadTime` | Integer | `int` |
| 141 | `fixedLeadTime` | fixedLeadTime | `iFixedLeadTime` | Integer | `int` |
| 142 | `leadTimeCoefficient` | leadTimeCoefficient | `iLeadTimeCoefficient` | Decimal | `number` |
| 143 | `leadTimeQuantity` | leadTimeQuantity | `iLeadTimeQuantity` | Decimal | `number` |
| 144 | `lossType` | lossType | `lossType` | Short | `short` |
| 145 | `fixedWastage` | fixedWastage | `iFixedWastage` | Decimal | `number` |
| 146 | `wastageRate` | wastageRate | `iWastageRate` | Decimal | `number` |
| 147 | `rejectRate` | rejectRate | `iRejectRate` | Decimal | `number` |
| 148 | `prepareFeed` | prepareFeed | `bPrepareFeed` | Boolean | `switch` |
| 149 | `specialMaterials` | specialMaterials | `bSpecialMaterials` | Boolean | `switch` |
| 150 | `virtualPart` | virtualPart | `bVirtualPart` | Boolean | `switch` |
| 151 | `directProduction` | directProduction | `direct_production` | Integer | `int` |
| 152 | `demandConsolidation` | demandConsolidation | `iDemandConsolidation` | Short | `short` |
| 153 | `demandConsolidationType` | demandConsolidationType | `iDemandConsolidationType` | Short | `short` |
| 154 | `demandConsolidationUnit` | demandConsolidationUnit | `iDemandConsolidationUnit` | Short | `short` |
| 155 | `demandConsolidationNumber` | demandConsolidationNumber | `iDemandConsolidationNumber` | Integer | `int` |
| 156 | `demandConsolidationDateType` | demandConsolidationDateType | `iDemandConsolidationDateType` | Short | `short` |
| 157 | `resetForwardDays` | resetForwardDays | `iResetForwardDays` | Integer | `int` |
| 158 | `resetBackwardDays` | resetBackwardDays | `iResetBackwardDays` | Integer | `int` |
| 159 | `beyondSupplyDays` | beyondSupplyDays | `iBeyondSupplyDays` | Integer | `int` |
| 160 | `planStrategy` | planStrategy | `planStrategy` | Long | `long` |
| 161 | `strategyComparisonRule` | strategyComparisonRule | `strategy_comparison_rule` | Integer | `int` |
| 162 | `supplyDemandPolicy` | supplyDemandPolicy | `supplyDemandPolicy` | Short | `short` |
| 163 | `supplyTimes` | supplyTimes | `iSupplyTimes` | Integer | `int` |
| 164 | `logisticsRelated` | logisticsRelated | `bLogisticsRelated` | Boolean | `switch` |
| 165 | `weighingMode` | weighingMode | `iWeighingMode` | Short | `short` |
| 166 | `fixedReturn` | fixedReturn | `bFixedReturn` | Boolean | `switch` |
| 167 | `reviewGrossWeight` | reviewGrossWeight | `bReviewGrossWeight` | Boolean | `switch` |
| 168 | `specialCarTransport` | specialCarTransport | `bSpecialCarTransport` | Boolean | `switch` |
| 169 | `valueManageType` | valueManageType | `iValueManageType` | Short | `short` |
| 170 | `costValuation` | costValuation | `iCostValuation` | Short | `short` |
| 171 | `fNoTaxCostPrice` | fNoTaxCostPrice | `fNoTaxCostPrice` | Decimal | `number` |
| 172 | `checkByBatch` | checkByBatch | `checkByBatch` | Boolean | `switch` |
| 173 | `checkByProject` | checkByProject | `checkByProject` | Integer | `int` |
| 174 | `checkBySalesOrders` | checkBySalesOrders | `checkBySalesOrders` | Integer | `int` |
| 175 | `checkByRevenueManagement` | checkByRevenueManagement | `checkByRevenueManagement` | Integer | `int` |
| 176 | `checkByClient` | checkByClient | `checkByClient` | Integer | `int` |
| 177 | `checkByOutsourcing` | checkByOutsourcing | `checkByOutsourcing` | Integer | `int` |
| 178 | `turnoverMaterials` | turnoverMaterials | `turnover_materials` | Integer | `int` |
| 179 | `amortizationMethod` | amortizationMethod | `amortization_method` | Integer | `int` |
| 180 | `measurementCount` | measurementCount | `measurement_count` | Decimal | `number` |
| 181 | `measurementUnit` | measurementUnit | `measurement_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 182 | `compensationAmount` | compensationAmount | `compensation_amount` | Decimal | `number` |
| 183 | `moldingTime` | moldingTime | `molding_time` | Decimal | `number` |
| 184 | `moldCavities` | moldCavities | `mold_cavities` | Decimal | `number` |
| 185 | `saleStyle` | saleStyle | `productAttribute` | String | `text` |
| 186 | `salePoints` | salePoints | `salePoints` | Integer | `int` |
| 187 | `lInventoryCount` | lInventoryCount | `lInventoryCount` | Decimal | `number` |
| 188 | `iBaseSaleCount` | iBaseSaleCount | `iBaseSaleCount` | Integer | `int` |
| 189 | `dlyFeeRuleId` | dlyFeeRuleID | `dlyFeeRuleId` | b4505671-79b1-4593-8be4-ddc7eed18484 | `quote` |
| 190 | `metaDescription` | metaDescription | `metaDescription` | String | `multiLanguage` |
| 191 | `enableSubscribe` | enableSubscribe | `bEnableSubscribe` | Boolean | `switch` |
| 192 | `enableDeposit` | enableDeposit | `enableDeposit` | Boolean | `switch` |
| 193 | `depositDealPayType` | depositDealPayType | `depositDealPayType` | Integer | `int` |
| 194 | `enablemodifyDeposit` | enablemodifyDeposit | `enablemodifyDeposit` | Boolean | `switch` |
| 195 | `minimumDeposits` | minimumDeposits | `minimumDeposits` | Decimal | `number` |
| 196 | `depositPayType` | depositPayType | `depositPayType` | Integer | `int` |
| 197 | `iEnableCyclePurchase` | iEnableCyclePurchase | `iEnableCyclePurchase` | Boolean | `switch` |
| 198 | `fSettleAccountsRate` | fSettleAccountsRate | `fSettleAccountsRate` | Decimal | `number` |
| 199 | `depositPercentage` | depositPercentage | `depositPercentage` | Decimal | `number` |
| 200 | `deposits` | deposits | `deposits` | Decimal | `number` |
| 201 | `canOrder` | canOrder | `bCanOrder` | Boolean | `switch` |
| 202 | `onlyOrder` | onlyOrder | `bOnlyOrder` | Boolean | `switch` |
| 203 | `orderAdvanceTime` | orderAdvanceTime | `iOrderAdvanceTime` | Short | `short` |
| 204 | `iEnableEcontract` | iEnableEcontract | `iEnableEcontract` | Boolean | `switch` |
| 205 | `isAllArea` | 是否AllArea | `isAllArea` | Boolean | `switch` |
| 206 | `pageTitle` | pageTitle | `pageTitle` | String | `text` |
| 207 | `serviceDuration` | serviceDuration | `iServiceDuration` | Decimal | `number` |
| 208 | `serviceDurationUnit` | serviceDurationUnit | `iServiceDurationUnit` | Short | `short` |
| 209 | `isRecommend` | 是否Recommend | `isRecommend` | Boolean | `switch` |
| 210 | `displayName` | display名称 | `cDisplayName` | String | `multiLanguage` |
| 211 | `titleMemo` | titleMemo | `cTitleMemo` | String | `multiLanguage` |
| 212 | `allowStorePurchase` | allowStorePurchase | `allowStorePurchase` | Boolean | `switch` |
| 213 | `isSaleInOfflineStore` | 是否SaleInOfflineStore | `isSaleInOfflineStore` | Boolean | `switch` |
| 214 | `isPriceChangeAllowed` | 是否PriceChangeAllowed | `isPriceChangeAllowed` | Boolean | `switch` |
| 215 | `isOfflineStoreOrder` | 是否OfflineStoreOrder | `isOfflineStoreOrder` | Boolean | `switch` |
| 216 | `isOfflineStoreReturn` | 是否OfflineStoreReturn | `isOfflineStoreReturn` | Boolean | `switch` |
| 217 | `retailPriceDimension` | retailPriceDimension | `retailPriceDimension` | Short | `short` |
| 218 | `deliverQuantityChange` | deliverQuantityChange | `deliverQuantityChange` | Short | `short` |
| 219 | `isProcess` | 是否Process | `isProcess` | Boolean | `switch` |
| 220 | `processType` | processType | `iProcessType` | Short | `short` |
| 221 | `isMaterial` | 是否Material | `isMaterial` | Boolean | `switch` |
| 222 | `isWeight` | 是否Weight | `isWeight` | Boolean | `switch` |
| 223 | `fLowestMarkPrice` | fLowestMarkPrice | `fLowestMarkPrice` | Decimal | `number` |
| 224 | `enableSparePartsManagement` | enableSparePartsManagement | `enable_spare_parts_management` | Integer | `int` |
| 225 | `businessAttributePurchase` | businessAttributePurchase | `business_attr_purchase` | Integer | `int` |
| 226 | `businessAttributeSale` | businessAttributeSale | `business_attr_sale` | Integer | `int` |
| 227 | `businessAttributeSelfCreate` | businessAttributeSelfCreate | `business_attr_self_create` | Integer | `int` |
| 228 | `businessAttributeOutSourcing` | businessAttributeOutSourcing | `business_attr_outsourcing` | Integer | `int` |
| 229 | `saleChannelOfOnlineBatch` | saleChannelOfOnlineBatch | `saleChannelOfOnlineBatch` | Boolean | `switch` |
| 230 | `saleChannelOfOnlineRetail` | saleChannelOfOnlineRetail | `saleChannelOfOnlineRetail` | Boolean | `switch` |
| 231 | `saleChannelOfOfflineRetail` | saleChannelOfOfflineRetail | `saleChannelOfOfflineRetail` | Boolean | `switch` |
| 232 | `saleChannelOfDistribution` | saleChannelOfDistribution | `saleChannelOfDistribution` | Boolean | `switch` |
| 233 | `outSourceInspectionCtrlPoint` | outSourceInspectionCtrlPoint | `outSourceInspectionCtrlPoint` | Integer | `int` |
| 234 | `transferInspectionCtrlPoint` | transferInspectionCtrlPoint | `transferInspectionCtrlPoint` | Integer | `int` |
| 235 | `sendInspectionCtrlPoint` | sendInspectionCtrlPoint | `sendInspectionCtrlPoint` | Integer | `int` |
| 236 | `returnInspectionCtrlPoint` | returnInspectionCtrlPoint | `returnInspectionCtrlPoint` | Integer | `int` |
| 237 | `batchPrice` | batchPrice | `batchPrice` | Decimal | `number` |
| 238 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |
| 239 | `iUOrderStatus` | iUOrderStatus | `iUOrderStatus` | Boolean | `switch` |
| 240 | `iStatus` | iStatus | `iStatus` | Boolean | `switch` |
| 241 | `isCreator` | 是否Creator | `isCreator` | Boolean | `switch` |
| 242 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 243 | `maxBatchPrice` | maxBatchPrice | `maxBatchPrice` | Decimal | `number` |
| 244 | `minBatchPrice` | minBatchPrice | `minBatchPrice` | Decimal | `number` |
| 245 | `beUpTime` | beUpTime | `beUpTime` | DateTime | `timestamp` |
| 246 | `canSale` | canSale | `canSale` | Boolean | `switch` |
| 247 | `uorderDlyFeeRuleId` | uorderDlyFeeRuleID | `uorderDlyFeeRuleId` | Long | `long` |
| 248 | `allowNegativeInventory` | allowNegativeInventory | `bAllowNegativeInventory` | Boolean | `switch` |
| 249 | `requirementTrackingMethod` | requirementTrackingMethod | `requirementTrackingMethod` | Short | `short` |
| 250 | `batchPolicy` | batchPolicy | `batchPolicy` | Short | `short` |
| 251 | `accountingByItem` | accountingByItem | `bAccountingByItem` | Boolean | `switch` |
| 252 | `checkByCost` | checkByCost | `bCheckByCost` | Boolean | `switch` |
| 253 | `isCheckFree` | 是否CheckFree | `isCheckFree` | Short | `short` |
| 254 | `materialCost` | materialCost | `bMaterialCost` | Boolean | `switch` |
| 255 | `productApplyRangeId` | productApplyRangeID | `productApplyRangeId` | ed1f55f2-a3f7-4617-8bd2-7f2f404843ab | `quote` |
| 256 | `rangeType` | rangeType | `iRangeType` | Integer | `int` |
| 257 | `shopId` | shopID | `shopId` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 258 | `customerId` | customerID | `customerId` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 259 | `iOrder` | iOrder | `iOrder` | Integer | `int` |
| 260 | `remark` | remark | `remark` | String | `multiLanguage` |
| 261 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |
| 262 | `tenant` | tenant | `tenant_id` | Long | `long` |
| 263 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 264 | `creator` | 创建人 | `creator` | String | `text` |
| 265 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 266 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 267 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 268 | `modifier` | 修改人 | `modifier` | String | `text` |
| 269 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 270 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 271 | `deliveryMethod` | deliveryMethod | `delivery_method` | String | `text` |
| 272 | `productExtendCharacterDef` | productExtendCharacterDef | `product_detail_character_def` | 3b04e9c2-ab66-48b0-a1e5-57a2b48cd767 | `UserDefine` |
| 273 | `ProductSkuOrderProperty` | ProductSkuOrderProperty | `` | a810167f-b9ce-465d-ae5d-de40bc42b82f | `` |
| 274 | `costClass` | costClass | `costClass` | 80e9c421-f9e9-4752-b1e9-7c240cb2fc1f | `quote` |
| 275 | `productCheckFreeNew` | productCheckFreeNew | `` | 0c671a67-be50-4853-af7d-34a328fbbe7d | `` |
| 276 | `productDepositTimeDetail` | productDepositTimeDetail | `` | 50af4617-0d26-41d3-a575-2fda1f544f2d | `` |
| 277 | `productLoadWay` | productLoadWay | `` | 3c00f201-5ce7-4cfc-bc56-d214ae327f98 | `` |
| 278 | `productParameters` | productParameters | `` | a17ec282-d9c6-4beb-bdd2-e810bf87ce73 | `` |
| 279 | `productSkuDetailNew` | productSkuDetailNew | `` | da35aa40-15cd-4e54-b5fb-4608d40aa13c | `` |
| 280 | `productTagNew` | productTagNew | `` | c77e6af7-abba-4d81-9421-c276c46aab7f | `` |
| 281 | `skuTagNew` | skuTagNew | `` | 3fa4d3ea-fbf8-4f49-8b4f-9af7d282a8f6 | `` |
| 282 | `taxClass` | taxClass | `taxClass` | d81afee5-cdcb-4c02-b2ac-054f55275897 | `quote` |

## 关联（48 个）

- `costItems` -> `bd.expenseitem.ExpenseItem` ()
- `materialStatus` -> `pc.manage.MaterialStatus` ()
- `produceUnit` -> `pc.unit.Unit` ()
- `demandPlanningUnit` -> `pc.unit.Unit` ()
- `batchPriceUnit` -> `pc.unit.Unit` ()
- `productCheckFreeNew` -> `pc.product.ProductCheckFreeNew` (0..n)
- `productExtendCharacterDef` -> `pc.product.ProductDetailCharacterDef` ()
- `warehouseManager` -> `bd.staff.Staff` ()
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `BOMSource` -> `pc.product.Product` ()
- `offlineUnit` -> `pc.unit.Unit` ()
- `orgId` -> `bd.adminOrg.BaseOrgVO` ()
- `skuTagNew` -> `pc.product.SkuTagNew` (0..n)
- `inTaxrate` -> `archive.taxArchives.TaxRateArchive` ()
- `productParameters` -> `pc.product.ProductParameters` (0..n)
- `productApplyRangeId` -> `pc.product.ProductApplyRange` ()
- `outTaxrate` -> `archive.taxArchives.TaxRateArchive` ()
- `requireUnit` -> `pc.unit.Unit` ()
- `customerId` -> `aa.merchant.Merchant` ()
- `purchasePriceUnit` -> `pc.unit.Unit` ()
- `shopId` -> `aa.merchant.Merchant` ()
- `productDepositTimeDetail` -> `pc.product.ProductDepositTimeDetail` (0..n)
- `billingUnit` -> `pc.unit.Unit` ()
- `taxClass` -> `taxpubdoc.taxesClassification.TaxesClassification` ()
- `manufacturePlanner` -> `bd.staff.Staff` ()
- `productTagNew` -> `pc.product.ProductTagNew` (0..n)
- `productId` -> `pc.product.Product` (0..n)
- `receiptWarehouse` -> `aa.warehouse.Warehouse` ()
- `productSkuDetailNew` -> `pc.product.ProductSkuDetailNew` (0..n)
- `dlyFeeRuleId` -> `um.logisticssetting.Deliverytype` ()
- `productBuyer` -> `bd.staff.Staff` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `ProductSkuOrderProperty` -> `pc.product.ProductSkuOrderProperty` (0..n)
- `produceDepartment` -> `bd.adminOrg.AdminOrgVO` ()
- `omsWarehouse` -> `aa.warehouse.Warehouse` ()
- `productLoadWay` -> `pc.product.ProductLoadWay` (0..n)
- `measurementUnit` -> `pc.unit.Unit` ()
- `onlineUnit` -> `pc.unit.Unit` ()
- `productVendor` -> `aa.vendor.Vendor` ()
- `stockUnit` -> `pc.unit.Unit` ()
- `costClass` -> `pc.cls.CostClass` ()
- `purchaseUnit` -> `pc.unit.Unit` ()
- `deliveryWarehouse` -> `aa.warehouse.Warehouse` ()
- `batchUnit` -> `pc.unit.Unit` ()
- `preferentialPolicyType` -> `taxpubdoc.taxesClassification.TaxClassPolicy` ()
- `inspectionUnit` -> `pc.unit.Unit` ()
- `returnWarehouse` -> `aa.warehouse.Warehouse` ()
