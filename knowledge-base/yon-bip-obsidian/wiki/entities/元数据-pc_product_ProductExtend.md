---
tags: [BIP, 元数据, 数据字典, pc.product.ProductExtend]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# （停用）物料详情（管理组织） (`pc.product.ProductExtend`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `productdetail` | 应用: `GZTBDM` | 类型: `Class`

## 属性（275 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `productId` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 2 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 3 | `tenant` | tenant | `tenant_id` | Long | `long` |
| 4 | `demandPlanningUnit` | demandPlanningUnit | `demandPlanningUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 5 | `barCode` | bar编码 | `cBarCode` | String | `text` |
| 6 | `businessAttribute` | businessAttribute | `businessAttribute` | String | `text` |
| 7 | `businessAttributePurchase` | businessAttributePurchase | `business_attr_purchase` | Integer | `int` |
| 8 | `businessAttributeSale` | businessAttributeSale | `business_attr_sale` | Integer | `int` |
| 9 | `businessAttributeSelfCreate` | businessAttributeSelfCreate | `business_attr_self_create` | Integer | `int` |
| 10 | `businessAttributeOutSourcing` | businessAttributeOutSourcing | `business_attr_outsourcing` | Integer | `int` |
| 11 | `batchUnit` | batchUnit | `batchUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 12 | `batchPriceUnit` | batchPriceUnit | `batchPriceUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 13 | `batchPrice` | batchPrice | `batchPrice` | Decimal | `number` |
| 14 | `BOMSource` | BOMSource | `BOMSource` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 15 | `BOMType` | BOMType | `iBOMType` | Short | `short` |
| 16 | `ECNControl` | ECNControl | `bECNControl` | Boolean | `switch` |
| 17 | `accountingByItem` | accountingByItem | `bAccountingByItem` | Boolean | `switch` |
| 18 | `allowNegativeInventory` | allowNegativeInventory | `bAllowNegativeInventory` | Boolean | `switch` |
| 19 | `allowStorePurchase` | allowStorePurchase | `allowStorePurchase` | Boolean | `switch` |
| 20 | `arrivalAllowErrorLimit` | arrivalAllowErrorLimit | `fArrivalAllowErrorLimit` | Decimal | `number` |
| 21 | `batchDouble` | batchDouble | `iBatchDouble` | Decimal | `number` |
| 22 | `batchPolicy` | batchPolicy | `batchPolicy` | Short | `short` |
| 23 | `batchRule` | batchRule | `iBatchRule` | Short | `short` |
| 24 | `beUpTime` | beUpTime | `beUpTime` | DateTime | `timestamp` |
| 25 | `behindLeadTime` | behindLeadTime | `iBehindLeadTime` | Integer | `int` |
| 26 | `singleInspection` | singleInspection | `single_Inspection` | Integer | `int` |
| 27 | `productionMode` | productionMode | `production_mode` | ProductionMode | `` |
| 28 | `billingUnit` | billingUnit | `billingUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 29 | `inspectionControlPoint` | inspectionControlPoint | `inspectionControlPoint` | Integer | `int` |
| 30 | `manageByInventory` | manageByInventory | `manageByInventory` | Integer | `int` |
| 31 | `overSigning` | overSigning | `overSigning` | Integer | `int` |
| 32 | `projectTrackStrategy` | projectTrackStrategy | `projectTrackStrategy` | Integer | `int` |
| 33 | `doublePick` | doublePick | `doublePick` | Decimal | `number` |
| 34 | `atpInspection` | atpInspection | `atpInspection` | Integer | `int` |
| 35 | `checkByProject` | checkByProject | `checkByProject` | Integer | `int` |
| 36 | `checkBySalesOrders` | checkBySalesOrders | `checkBySalesOrders` | Integer | `int` |
| 37 | `checkByClient` | checkByClient | `checkByClient` | Integer | `int` |
| 38 | `checkByOutsourcing` | checkByOutsourcing | `checkByOutsourcing` | Integer | `int` |
| 39 | `checkByRevenueManagement` | checkByRevenueManagement | `checkByRevenueManagement` | Integer | `int` |
| 40 | `turnoverMaterials` | turnoverMaterials | `turnover_materials` | Integer | `int` |
| 41 | `amortizationMethod` | amortizationMethod | `amortization_method` | Integer | `int` |
| 42 | `measurementCount` | measurementCount | `measurement_count` | Decimal | `number` |
| 43 | `measurementUnit` | measurementUnit | `measurement_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 44 | `compensationAmount` | compensationAmount | `compensation_amount` | Decimal | `number` |
| 45 | `moldingTime` | moldingTime | `molding_time` | Decimal | `number` |
| 46 | `moldCavities` | moldCavities | `mold_cavities` | Decimal | `number` |
| 47 | `productInspection` | productInspection | `productInspection` | Integer | `int` |
| 48 | `productInspectionCtrlPoint` | productInspectionCtrlPoint | `productInspectionCtrlPoint` | Integer | `int` |
| 49 | `outSourceInspection` | outSourceInspection | `outSourceInspection` | Integer | `int` |
| 50 | `outSourceInspectionCtrlPoint` | outSourceInspectionCtrlPoint | `outSourceInspectionCtrlPoint` | Integer | `int` |
| 51 | `transferInspection` | transferInspection | `transferInspection` | Integer | `int` |
| 52 | `transferInspectionCtrlPoint` | transferInspectionCtrlPoint | `transferInspectionCtrlPoint` | Integer | `int` |
| 53 | `productFirstInspection` | productFirstInspection | `productFirstInspection` | Integer | `int` |
| 54 | `firstInspectionCtrlMethod` | firstInspectionCtrlMethod | `firstInspectionCtrlMethod` | Integer | `int` |
| 55 | `sendInspectionCtrlPoint` | sendInspectionCtrlPoint | `sendInspectionCtrlPoint` | Integer | `int` |
| 56 | `returnInspectionCtrlPoint` | returnInspectionCtrlPoint | `returnInspectionCtrlPoint` | Integer | `int` |
| 57 | `costItems` | costItems | `costItems` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 | `quote` |
| 58 | `beyondSupplyDays` | beyondSupplyDays | `iBeyondSupplyDays` | Integer | `int` |
| 59 | `bindCarrier` | bindCarrier | `bBindCarrier` | Boolean | `switch` |
| 60 | `canOrder` | canOrder | `bCanOrder` | Boolean | `switch` |
| 61 | `canSale` | canSale | `canSale` | Boolean | `switch` |
| 62 | `checkByBatch` | checkByBatch | `checkByBatch` | Boolean | `switch` |
| 63 | `checkByCost` | checkByCost | `bCheckByCost` | Boolean | `switch` |
| 64 | `checkReminderLeadTime` | checkReminderLeadTime | `check_reminder_lead_time` | Integer | `int` |
| 65 | `costValuation` | costValuation | `iCostValuation` | Short | `short` |
| 66 | `customerId` | customerID | `customerId` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 67 | `daysBeforeValidityReject` | daysBeforeValidityReject | `iDaysBeforeValidityReject` | Integer | `int` |
| 68 | `deliverQuantityChange` | deliverQuantityChange | `deliverQuantityChange` | Short | `short` |
| 69 | `deliveryDays` | deliveryDays | `deliveryDays` | Integer | `int` |
| 70 | `deliveryWarehouse` | deliveryWarehouse | `deliveryWarehouse` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |
| 71 | `demandConsolidation` | demandConsolidation | `iDemandConsolidation` | Short | `short` |
| 72 | `demandConsolidationDateType` | demandConsolidationDateType | `iDemandConsolidationDateType` | Short | `short` |
| 73 | `demandConsolidationNumber` | demandConsolidationNumber | `iDemandConsolidationNumber` | Integer | `int` |
| 74 | `demandConsolidationType` | demandConsolidationType | `iDemandConsolidationType` | Short | `short` |
| 75 | `demandConsolidationUnit` | demandConsolidationUnit | `iDemandConsolidationUnit` | Short | `short` |
| 76 | `depositDealPayType` | depositDealPayType | `depositDealPayType` | Integer | `int` |
| 77 | `depositPayType` | depositPayType | `depositPayType` | Integer | `int` |
| 78 | `depositPercentage` | depositPercentage | `depositPercentage` | Decimal | `number` |
| 79 | `deposits` | deposits | `deposits` | Decimal | `number` |
| 80 | `directProduction` | directProduction | `direct_production` | Integer | `int` |
| 81 | `displayName` | display名称 | `cDisplayName` | String | `multiLanguage` |
| 82 | `dlyFeeRuleId` | dlyFeeRuleID | `dlyFeeRuleId` | b4505671-79b1-4593-8be4-ddc7eed18484 | `quote` |
| 83 | `doubleReplenish` | doubleReplenish | `doubleReplenish` | Decimal | `number` |
| 84 | `economicQuantity` | economicQuantity | `iEconomicQuantity` | Decimal | `number` |
| 85 | `effectiveLeadTime` | effectiveLeadTime | `effective_lead_time` | Integer | `int` |
| 86 | `enableDeposit` | enableDeposit | `enableDeposit` | Boolean | `switch` |
| 87 | `enableSparePartsManagement` | enableSparePartsManagement | `enable_spare_parts_management` | Integer | `int` |
| 88 | `enableStockExpireCheck` | enableStockExpireCheck | `enable_stock_expire_check` | Integer | `int` |
| 89 | `enableStockPeriodRecheck` | enableStockPeriodRecheck | `enable_stock_period_recheck` | Integer | `int` |
| 90 | `enableSubscribe` | enableSubscribe | `bEnableSubscribe` | Boolean | `switch` |
| 91 | `enablemodifyDeposit` | enablemodifyDeposit | `enablemodifyDeposit` | Boolean | `switch` |
| 92 | `engineeringDrawingNo` | engineeringDrawingNo | `cEngineeringDrawingNo` | String | `text` |
| 93 | `erpOuterCode` | erpOuter编码 | `cErpOuterCode` | String | `text` |
| 94 | `exemption` | exemption | `bExemption` | Boolean | `switch` |
| 95 | `expireDateNo` | expireDateNo | `expireDateNo` | Integer | `int` |
| 96 | `expireDateUnit` | expireDateUnit | `expireDateUnit` | Short | `short` |
| 97 | `fLowestMarkPrice` | fLowestMarkPrice | `fLowestMarkPrice` | Decimal | `number` |
| 98 | `fMarkPrice` | fMarkPrice | `fMarkPrice` | Decimal | `number` |
| 99 | `fMarketPrice` | fMarketPrice | `fMarketPrice` | Decimal | `number` |
| 100 | `fNoTaxCostPrice` | fNoTaxCostPrice | `fNoTaxCostPrice` | Decimal | `number` |
| 101 | `fPrimeCosts` | fPrimeCosts | `fPrimeCosts` | Decimal | `number` |
| 102 | `fSalePrice` | fSalePrice | `fSalePrice` | Decimal | `number` |
| 103 | `fSettleAccountsRate` | fSettleAccountsRate | `fSettleAccountsRate` | Decimal | `number` |
| 104 | `fixedLeadTime` | fixedLeadTime | `iFixedLeadTime` | Integer | `int` |
| 105 | `fixedQuantity` | fixedQuantity | `iFixedQuantity` | Decimal | `number` |
| 106 | `fixedReturn` | fixedReturn | `bFixedReturn` | Boolean | `switch` |
| 107 | `fixedWastage` | fixedWastage | `iFixedWastage` | Decimal | `number` |
| 108 | `frontLeadTime` | frontLeadTime | `iFrontLeadTime` | Integer | `int` |
| 109 | `fullSetInspection` | fullSetInspection | `full_set_inspection` | Integer | `int` |
| 110 | `highestStock` | highestStock | `highestStock` | Decimal | `number` |
| 111 | `iABCClass` | iABCClass | `iABCClass` | Integer | `int` |
| 112 | `iBaseSaleCount` | iBaseSaleCount | `iBaseSaleCount` | Integer | `int` |
| 113 | `iDoubleSale` | iDoubleSale | `iDoubleSale` | Decimal | `number` |
| 114 | `iEnableCyclePurchase` | iEnableCyclePurchase | `iEnableCyclePurchase` | Boolean | `switch` |
| 115 | `iEnableEcontract` | iEnableEcontract | `iEnableEcontract` | Boolean | `switch` |
| 116 | `iMinOrderQuantity` | iMinOrderQuantity | `iMinOrderQuantity` | Decimal | `number` |
| 117 | `iOrder` | iOrder | `iOrder` | Integer | `int` |
| 118 | `iStatus` | iStatus | `iStatus` | Boolean | `switch` |
| 119 | `iUOrderStatus` | iUOrderStatus | `iUOrderStatus` | Boolean | `switch` |
| 120 | `inStoreExcessLimit` | inStoreExcessLimit | `fInStoreExcessLimit` | Decimal | `number` |
| 121 | `inStoreLessLimit` | inStoreLessLimit | `fInStoreLessLimit` | Decimal | `number` |
| 122 | `inTaxrate` | inTaxrate | `inTaxrate` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |
| 123 | `inspectionType` | inspectionType | `inspectionType` | Integer | `int` |
| 124 | `inspectionUnit` | inspectionUnit | `inspectionUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 125 | `inventoryPlanStrategy` | inventoryPlanStrategy | `inventoryPlanStrategy` | Short | `short` |
| 126 | `invoiceAllowErrorLimit` | invoiceAllowErrorLimit | `fInvoiceAllowErrorLimit` | Decimal | `number` |
| 127 | `isAllArea` | 是否AllArea | `isAllArea` | Boolean | `switch` |
| 128 | `isBarcodeManage` | 是否BarcodeManage | `isBarcodeManage` | Boolean | `switch` |
| 129 | `isBatchManage` | 是否BatchManage | `isBatchManage` | Boolean | `switch` |
| 130 | `isCheckFree` | 是否CheckFree | `isCheckFree` | Short | `short` |
| 131 | `isCreator` | 是否Creator | `isCreator` | Boolean | `switch` |
| 132 | `isDisplayPrice` | 是否DisplayPrice | `isDisplayPrice` | Boolean | `switch` |
| 133 | `isExpiryDateCalculationMethod` | 是否ExpiryDateCalculationMethod | `expirydate_calculation_method` | Short | `short` |
| 134 | `isExpiryDateManage` | 是否ExpiryDateManage | `isExpiryDateManage` | Boolean | `switch` |
| 135 | `isMaterial` | 是否Material | `isMaterial` | Boolean | `switch` |
| 136 | `isOfflineStoreOrder` | 是否OfflineStoreOrder | `isOfflineStoreOrder` | Boolean | `switch` |
| 137 | `isOfflineStoreReturn` | 是否OfflineStoreReturn | `isOfflineStoreReturn` | Boolean | `switch` |
| 138 | `isPriceChangeAllowed` | 是否PriceChangeAllowed | `isPriceChangeAllowed` | Boolean | `switch` |
| 139 | `isProcess` | 是否Process | `isProcess` | Boolean | `switch` |
| 140 | `isRecommend` | 是否Recommend | `isRecommend` | Boolean | `switch` |
| 141 | `isSaleInOfflineStore` | 是否SaleInOfflineStore | `isSaleInOfflineStore` | Boolean | `switch` |
| 142 | `isSerialNoManage` | 是否SerialNoManage | `isSerialNoManage` | Boolean | `switch` |
| 143 | `isWeight` | 是否Weight | `isWeight` | Boolean | `switch` |
| 144 | `keySubPart` | keySubPart | `bKeySubPart` | Boolean | `switch` |
| 145 | `lInventoryCount` | lInventoryCount | `lInventoryCount` | Decimal | `number` |
| 146 | `leadTimeCoefficient` | leadTimeCoefficient | `iLeadTimeCoefficient` | Decimal | `number` |
| 147 | `leadTimeQuantity` | leadTimeQuantity | `iLeadTimeQuantity` | Decimal | `number` |
| 148 | `logisticsRelated` | logisticsRelated | `bLogisticsRelated` | Boolean | `switch` |
| 149 | `lossType` | lossType | `lossType` | Short | `short` |
| 150 | `lowestStock` | lowestStock | `lowestStock` | Decimal | `number` |
| 151 | `mallDownTime` | mallDownTime | `mallDownTime` | DateTime | `timestamp` |
| 152 | `mallUpTime` | mallUpTime | `mallUpTime` | DateTime | `timestamp` |
| 153 | `malldowncount` | malldowncount | `malldowncount` | Integer | `int` |
| 154 | `mallupcount` | mallupcount | `mallupcount` | Integer | `int` |
| 155 | `manufacturePlanner` | manufacturePlanner | `manufacturePlanner` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 156 | `manufacturingStrategy` | manufacturingStrategy | `manufacturing_strategy` | String | `text` |
| 157 | `materialCost` | materialCost | `bMaterialCost` | Boolean | `switch` |
| 158 | `materialStatus` | materialStatus | `material_status` | 84a32a36-3aa1-444f-8155-79e7ce0869c8 | `quote` |
| 159 | `maxBatchPrice` | maxBatchPrice | `maxBatchPrice` | Decimal | `number` |
| 160 | `maxPrimeCosts` | maxPrimeCosts | `fMaxPrimeCosts` | Decimal | `number` |
| 161 | `maximumTurnoverDays` | maximumTurnoverDays | `iMaximumTurnoverDays` | Integer | `int` |
| 162 | `metaDescription` | metaDescription | `metaDescription` | String | `multiLanguage` |
| 163 | `minBatchPrice` | minBatchPrice | `minBatchPrice` | Decimal | `number` |
| 164 | `minimumDeposits` | minimumDeposits | `minimumDeposits` | Decimal | `number` |
| 165 | `mnemonicCode` | mnemonic编码 | `mnemonicCode` | String | `text` |
| 166 | `modifier` | 修改人 | `modifier` | String | `text` |
| 167 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 168 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 169 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 170 | `mtoStrategy` | mtoStrategy | `mto_strategy` | Integer | `int` |
| 171 | `offlineUnit` | offlineUnit | `offlineUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 172 | `omsWarehouse` | omsWarehouse | `OMSWarehouse` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |
| 173 | `onlineUnit` | onlineUnit | `onlineUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 174 | `onlyOrder` | onlyOrder | `bOnlyOrder` | Boolean | `switch` |
| 175 | `orderAdvanceTime` | orderAdvanceTime | `iOrderAdvanceTime` | Short | `short` |
| 176 | `orgId` | 组织ID | `orgId` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |
| 177 | `outStoreExcessLimit` | outStoreExcessLimit | `fOutStoreExcessLimit` | Decimal | `number` |
| 178 | `outStoreLessLimit` | outStoreLessLimit | `fOutStoreLessLimit` | Decimal | `number` |
| 179 | `outTaxrate` | outTaxrate | `outTaxrate` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |
| 180 | `pageTitle` | pageTitle | `pageTitle` | String | `text` |
| 181 | `periodicalInspection` | periodicalInspection | `bPeriodicalInspection` | Boolean | `switch` |
| 182 | `periodicalInspectionCycle` | periodicalInspectionCycle | `iPeriodicalInspectionCycle` | Integer | `int` |
| 183 | `planCheckDays` | planCheckDays | `plan_check_days` | Integer | `int` |
| 184 | `planDefaultAttribute` | planDefaultAttribute | `planDefaultAttribute` | Short | `short` |
| 185 | `planMethod` | planMethod | `planMethod` | Short | `short` |
| 186 | `planOrderLimit` | planOrderLimit | `fPlanOrderLimit` | Decimal | `number` |
| 187 | `planProduceLimit` | planProduceLimit | `iPlanProduceLimit` | Decimal | `number` |
| 188 | `planStrategy` | planStrategy | `planStrategy` | Long | `long` |
| 189 | `preferentialPolicyType` | preferentialPolicyType | `preferentialPolicyType` | 18c954fe-5588-4eae-bd1a-c66fd1f6dc7f | `quote` |
| 190 | `prepareFeed` | prepareFeed | `bPrepareFeed` | Boolean | `switch` |
| 191 | `priceAreaMessage` | priceAreaMessage | `priceAreaMessage` | String | `text` |
| 192 | `processType` | processType | `iProcessType` | Short | `short` |
| 193 | `produceDepartment` | produceDepartment | `produceDepartment` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 194 | `produceRate` | produceRate | `produceRate` | Decimal | `number` |
| 195 | `produceUnit` | produceUnit | `produceUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 196 | `productApplyRangeId` | productApplyRangeID | `productApplyRangeId` | ed1f55f2-a3f7-4617-8bd2-7f2f404843ab | `quote` |
| 197 | `productBuyer` | productBuyer | `productBuyer` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 198 | `productExtendCharacterDef` | productExtendCharacterDef | `product_detail_character_def` | 3b04e9c2-ab66-48b0-a1e5-57a2b48cd767 | `UserDefine` |
| 199 | `productVendor` | productVendor | `productVendor` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 200 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 201 | `purchaseOrderQuantity` | purchaseOrderQuantity | `purchase_order_quantity` | Decimal | `number` |
| 202 | `purchasePriceUnit` | purchasePriceUnit | `purchasePriceUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 203 | `purchaseTimes` | purchaseTimes | `purchase_times` | Decimal | `number` |
| 204 | `purchaseUnit` | purchaseUnit | `purchaseUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 205 | `purpose` | purpose | `iPurpose` | Short | `short` |
| 206 | `rangeType` | rangeType | `iRangeType` | Integer | `int` |
| 207 | `receiptModel` | receiptModel | `receiptModel` | String | `multiLanguage` |
| 208 | `receiptName` | receipt名称 | `receiptName` | String | `multiLanguage` |
| 209 | `receiptSpec` | receiptSpec | `receiptSpec` | String | `multiLanguage` |
| 210 | `receiptWarehouse` | receiptWarehouse | `receiptWarehouse` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |
| 211 | `recheckReminderLeadTime` | recheckReminderLeadTime | `recheck_reminder_lead_time` | Integer | `int` |
| 212 | `rejectRate` | rejectRate | `iRejectRate` | Decimal | `number` |
| 213 | `remark` | remark | `remark` | String | `multiLanguage` |
| 214 | `requestOrderLimit` | requestOrderLimit | `fRequestOrderLimit` | Decimal | `number` |
| 215 | `requireUnit` | requireUnit | `requireUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 216 | `requirementTrackingMethod` | requirementTrackingMethod | `requirementTrackingMethod` | Short | `short` |
| 217 | `reservation` | reservation | `reservation` | Boolean | `switch` |
| 218 | `resetBackwardDays` | resetBackwardDays | `iResetBackwardDays` | Integer | `int` |
| 219 | `resetForwardDays` | resetForwardDays | `iResetForwardDays` | Integer | `int` |
| 220 | `retailPriceDimension` | retailPriceDimension | `retailPriceDimension` | Short | `short` |
| 221 | `returnInspection` | returnInspection | `return_inspection` | Integer | `int` |
| 222 | `returnWarehouse` | returnWarehouse | `returnWarehouse` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |
| 223 | `returnsWarehousingByResult` | returnsWarehousingByResult | `bReturnsWarehousingByResult` | Boolean | `switch` |
| 224 | `reviewCycle` | reviewCycle | `review_cycle` | Integer | `int` |
| 225 | `reviewGrossWeight` | reviewGrossWeight | `bReviewGrossWeight` | Boolean | `switch` |
| 226 | `ropStock` | ropStock | `ropStock` | Decimal | `number` |
| 227 | `safetyStock` | safetyStock | `safetyStock` | Decimal | `number` |
| 228 | `saleChannel` | saleChannel | `saleChannel` | String | `text` |
| 229 | `saleChannelOfDistribution` | saleChannelOfDistribution | `saleChannelOfDistribution` | Boolean | `switch` |
| 230 | `saleChannelOfOfflineRetail` | saleChannelOfOfflineRetail | `saleChannelOfOfflineRetail` | Boolean | `switch` |
| 231 | `saleChannelOfOnlineBatch` | saleChannelOfOnlineBatch | `saleChannelOfOnlineBatch` | Boolean | `switch` |
| 232 | `saleChannelOfOnlineRetail` | saleChannelOfOnlineRetail | `saleChannelOfOnlineRetail` | Boolean | `switch` |
| 233 | `salePoints` | salePoints | `salePoints` | Integer | `int` |
| 234 | `saleStyle` | saleStyle | `productAttribute` | String | `text` |
| 235 | `salesReturnsExemption` | salesReturnsExemption | `bSalesReturnsExemption` | Boolean | `switch` |
| 236 | `scanCountUnit` | scanCountUnit | `scanCountUnit` | Short | `short` |
| 237 | `sendInspection` | sendInspection | `send_inspection` | Integer | `int` |
| 238 | `serviceDuration` | serviceDuration | `iServiceDuration` | Decimal | `number` |
| 239 | `serviceDurationUnit` | serviceDurationUnit | `iServiceDurationUnit` | Short | `short` |
| 240 | `shopId` | shopID | `shopId` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 241 | `shortName` | short名称 | `shortName` | String | `text` |
| 242 | `specialCarTransport` | specialCarTransport | `bSpecialCarTransport` | Boolean | `switch` |
| 243 | `specialMaterials` | specialMaterials | `bSpecialMaterials` | Boolean | `switch` |
| 244 | `stockUnit` | stockUnit | `stockUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 245 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |
| 246 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |
| 247 | `storageLossRate` | storageLossRate | `storageLossRate` | Decimal | `number` |
| 248 | `strategyComparisonRule` | strategyComparisonRule | `strategy_comparison_rule` | Integer | `int` |
| 249 | `supplyDemandPolicy` | supplyDemandPolicy | `supplyDemandPolicy` | Short | `short` |
| 250 | `supplyTimes` | supplyTimes | `iSupplyTimes` | Integer | `int` |
| 251 | `supplyType` | supplyType | `supplyType` | Short | `short` |
| 252 | `testRule` | testRule | `testRule` | TestRule | `` |
| 253 | `titleMemo` | titleMemo | `cTitleMemo` | String | `multiLanguage` |
| 254 | `uorderDlyFeeRuleId` | uorderDlyFeeRuleID | `uorderDlyFeeRuleId` | Long | `long` |
| 255 | `uorderDownTime` | uorderDownTime | `uorderDownTime` | DateTime | `timestamp` |
| 256 | `uorderUpTime` | uorderUpTime | `uorderUpTime` | DateTime | `timestamp` |
| 257 | `uorderdowncount` | uorderdowncount | `uorderdowncount` | Integer | `int` |
| 258 | `uorderupcount` | uorderupcount | `uorderupcount` | Integer | `int` |
| 259 | `utility` | utility | `bUtility` | Boolean | `switch` |
| 260 | `validityWarningDays` | validityWarningDays | `iValidityWarningDays` | Integer | `int` |
| 261 | `valueManageType` | valueManageType | `iValueManageType` | Short | `short` |
| 262 | `virtualPart` | virtualPart | `bVirtualPart` | Boolean | `switch` |
| 263 | `warehouseManager` | warehouseManager | `warehouseManager` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 264 | `warehousingByResult` | warehousingByResult | `bWarehousingByResult` | Boolean | `switch` |
| 265 | `wastageRate` | wastageRate | `iWastageRate` | Decimal | `number` |
| 266 | `weigh` | weigh | `bWeigh` | Boolean | `switch` |
| 267 | `weighingMode` | weighingMode | `iWeighingMode` | Short | `short` |
| 268 | `workingPlan` | workingPlan | `bWorkingPlan` | Boolean | `switch` |
| 269 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 270 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 271 | `creator` | 创建人 | `creator` | String | `text` |
| 272 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 273 | `costClass` | costClass | `costClass` | 80e9c421-f9e9-4752-b1e9-7c240cb2fc1f | `quote` |
| 274 | `deliveryMethod` | deliveryMethod | `delivery_method` | String | `text` |
| 275 | `taxClass` | taxClass | `taxClass` | d81afee5-cdcb-4c02-b2ac-054f55275897 | `quote` |

## 关联（40 个）

- `costItems` -> `bd.expenseitem.ExpenseItem` ()
- `materialStatus` -> `pc.manage.MaterialStatus` ()
- `produceUnit` -> `pc.unit.Unit` ()
- `demandPlanningUnit` -> `pc.unit.Unit` ()
- `batchPriceUnit` -> `pc.unit.Unit` ()
- `productExtendCharacterDef` -> `pc.product.ProductDetailCharacterDef` ()
- `warehouseManager` -> `bd.staff.Staff` ()
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `BOMSource` -> `pc.product.Product` ()
- `offlineUnit` -> `pc.unit.Unit` ()
- `orgId` -> `bd.adminOrg.BaseOrgVO` ()
- `inTaxrate` -> `archive.taxArchives.TaxRateArchive` ()
- `productApplyRangeId` -> `pc.product.ProductApplyRange` ()
- `outTaxrate` -> `archive.taxArchives.TaxRateArchive` ()
- `requireUnit` -> `pc.unit.Unit` ()
- `customerId` -> `aa.merchant.Merchant` ()
- `purchasePriceUnit` -> `pc.unit.Unit` ()
- `id` -> `pc.product.Product` (1)
- `shopId` -> `aa.merchant.Merchant` ()
- `billingUnit` -> `pc.unit.Unit` ()
- `taxClass` -> `taxpubdoc.taxesClassification.TaxesClassification` ()
- `manufacturePlanner` -> `bd.staff.Staff` ()
- `receiptWarehouse` -> `aa.warehouse.Warehouse` ()
- `dlyFeeRuleId` -> `um.logisticssetting.Deliverytype` ()
- `productBuyer` -> `bd.staff.Staff` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `produceDepartment` -> `bd.adminOrg.AdminOrgVO` ()
- `omsWarehouse` -> `aa.warehouse.Warehouse` ()
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
