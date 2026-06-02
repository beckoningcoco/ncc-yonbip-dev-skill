---
tags: [BIP, 元数据, 数据字典, 采购入库, ST, pu.purchaseorder.PurchaseOrders]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 采购订单子表 (`pu.purchaseorder.PurchaseOrders`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `st_purchaseorders` | 应用: `PU`

## 属性（317 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `ctjlCode` | ctjl编码 | `ctjl_code` | String | `text` |
| 2 | `isRelease` | 是否Release | `isRelease` | Boolean | `switch` |
| 3 | `mtoPolicy` | mtoPolicy | `mtoPolicy` | Boolean | `switch` |
| 4 | `product` | product | `iProductid` | 9a24ef07-e188-425b-b36a-402ddbf22073 | `quote` |
| 5 | `productn` | productn | `iProductid` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 6 | `productsku` | productsku | `iProductSkuid` | 0d86941d-5af3-4cf4-9255-4f5c74a3476f | `quote` |
| 7 | `productskun` | productskun | `iProductSkuid` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `quote` |
| 8 | `releaseApplyMainQty` | releaseApplyMainQty | `releaseApplyMainQty` | Decimal | `number` |
| 9 | `releaseApplyPurQty` | releaseApplyPurQty | `releaseApplyPurQty` | Decimal | `number` |
| 10 | `releaseDiffMainQty` | releaseDiffMainQty | `releaseDiffMainQty` | Decimal | `number` |
| 11 | `releaseDiffQty` | releaseDiffQty | `releaseDiffQty` | Decimal | `number` |
| 12 | `releaseQty` | releaseQty | `releaseQty` | Decimal | `number` |
| 13 | `rowArrivalClosePerson` | rowArrivalClosePerson | `row_arrival_close_person` | String | `text` |
| 14 | `rowArrivalClosePersonId` | rowArrivalClosePersonID | `row_arrival_close_person_id` | Long | `long` |
| 15 | `rowArrivalCloseTime` | rowArrivalCloseTime | `row_arrival_close_time` | DateTime | `timestamp` |
| 16 | `rowClose` | rowClose | `row_close` | Boolean | `switch` |
| 17 | `rowCloseReason` | rowCloseReason | `row_close_reason` | String | `text` |
| 18 | `rowPaymentClosePerson` | rowPaymentClosePerson | `row_payment_close_person` | String | `text` |
| 19 | `out_sys_lineid` | out_sys_lineid | `out_sys_lineid` | String | `text` |
| 20 | `totalAmountOfPayProcess` | totalAmountOfPayProcess | `totalAmountOfPayProcess` | Decimal | `number` |
| 21 | `out_sys_rowno` | out_sys_rowno | `out_sys_rowno` | String | `text` |
| 22 | `rowPaymentClosePersonId` | rowPaymentClosePersonID | `row_payment_close_person_id` | Long | `long` |
| 23 | `ctjlId` | ctjlID | `ctjl_id` | Long | `long` |
| 24 | `releaseStatus` | releaseStatus | `releaseStatus` | Integer | `int` |
| 25 | `materialn` | materialn | `material` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 26 | `subBusinessSourceType` | subBusinessSourceType | `sub_business_source_type` | String | `text` |
| 27 | `calculationPattern` | calculationPattern | `calculation_pattern` | CalculationPattern | `` |
| 28 | `oriSumOriginal` | oriSumOriginal | `oriSumOriginal` | Decimal | `number` |
| 29 | `discountMoney` | discountMoney | `discountMoney` | Decimal | `number` |
| 30 | `totalConfirmInQty` | totalConfirmInQty | `ftotalconfirminqty` | Decimal | `number` |
| 31 | `projectSource` | projectSource | `cProjectSource` | String | `text` |
| 32 | `totalConfirmInSubqty` | totalConfirmInSubqty | `ftotalconfirminsubqty` | Decimal | `number` |
| 33 | `taxCalcResults` | taxCalcResults | `taxCalcResults` | String | `text` |
| 34 | `withholdingTaxAmount` | withholdingTaxAmount | `iWithholdingTaxAmount` | Decimal | `number` |
| 35 | `natWithholdingTaxAmount` | natWithholdingTaxAmount | `iNatWithholdingTaxAmount` | Decimal | `number` |
| 36 | `throwStatus` | throwStatus | `throw_status` | Integer | `int` |
| 37 | `define1` | define1 | `define1` | String | `text` |
| 38 | `define2` | define2 | `define2` | String | `text` |
| 39 | `define3` | define3 | `define3` | String | `text` |
| 40 | `define4` | define4 | `define4` | String | `text` |
| 41 | `define5` | define5 | `define5` | String | `text` |
| 42 | `define6` | define6 | `define6` | String | `text` |
| 43 | `define7` | define7 | `define7` | String | `text` |
| 44 | `define8` | define8 | `define8` | String | `text` |
| 45 | `define9` | define9 | `define9` | String | `text` |
| 46 | `define10` | define10 | `define10` | String | `text` |
| 47 | `define11` | define11 | `define11` | String | `text` |
| 48 | `define12` | define12 | `define12` | String | `text` |
| 49 | `define13` | define13 | `define13` | String | `text` |
| 50 | `define14` | define14 | `define14` | String | `text` |
| 51 | `define15` | define15 | `define15` | String | `text` |
| 52 | `define16` | define16 | `define16` | String | `text` |
| 53 | `define17` | define17 | `define17` | String | `text` |
| 54 | `define18` | define18 | `define18` | String | `text` |
| 55 | `define19` | define19 | `define19` | String | `text` |
| 56 | `define20` | define20 | `define20` | String | `text` |
| 57 | `define21` | define21 | `define21` | String | `text` |
| 58 | `define22` | define22 | `define22` | String | `text` |
| 59 | `define23` | define23 | `define23` | String | `text` |
| 60 | `define24` | define24 | `define24` | String | `text` |
| 61 | `define25` | define25 | `define25` | String | `text` |
| 62 | `define26` | define26 | `define26` | String | `text` |
| 63 | `define27` | define27 | `define27` | String | `text` |
| 64 | `define28` | define28 | `define28` | String | `text` |
| 65 | `define29` | define29 | `define29` | String | `text` |
| 66 | `define30` | define30 | `define30` | String | `text` |
| 67 | `taxCodeId` | tax编码ID | `tax_code_id` | 3f7c3856-5b00-4506-b458-a64eed0d3bfb | `quote` |
| 68 | `subBusinessSourceLineNo` | subBusinessSourceLineNo | `sub_business_source_line_no` | Integer | `int` |
| 69 | `subBusinessSourceLineId` | subBusinessSourceLineID | `sub_business_source_line_id` | Long | `long` |
| 70 | `subBusinessSourceNo` | subBusinessSourceNo | `sub_business_source_no` | String | `text` |
| 71 | `subBusinessSourceId` | subBusinessSourceID | `sub_business_source_id` | Long | `long` |
| 72 | `taxAmountPayable` | taxAmountPayable | `fAmountPayable` | Decimal | `number` |
| 73 | `productPuType` | productPuType | `productPuType` | String | `text` |
| 74 | `arrivalInspect` | arrivalInspect | `arrival_inspect` | Boolean | `switch` |
| 75 | `taxWithholdingMoney` | taxWithholdingMoney | `iTaxWithholdingMoney` | Decimal | `number` |
| 76 | `taxWithholdingNAMoney` | taxWithholdingNAMoney | `iTaxWithholdingNAMoney` | Decimal | `number` |
| 77 | `tradeRouteID` | tradeRouteID | `tradeRouteID` | c69f1d6a-783c-4f79-b446-b4da14cb7fff | `quote` |
| 78 | `tradeRouteLineno` | tradeRouteLineno | `tradeRouteLineno` | Decimal | `number` |
| 79 | `isEndTrade` | 是否EndTrade | `isEndTrade` | Short | `short` |
| 80 | `wbs` | wbs | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 | `quote` |
| 81 | `activity` | activity | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 | `quote` |
| 82 | `releaseMainQty` | releaseMainQty | `releaseMainQty` | Decimal | `number` |
| 83 | `releaseType` | releaseType | `releaseType` | Integer | `int` |
| 84 | `rowPaymentCloseTime` | rowPaymentCloseTime | `row_payment_close_time` | DateTime | `timestamp` |
| 85 | `rowRefuseReason` | rowRefuseReason | `row_refuse_reason` | String | `text` |
| 86 | `rowTicketClosePerson` | rowTicketClosePerson | `row_ticket_close_person` | String | `text` |
| 87 | `rowTicketClosePersonId` | rowTicketClosePersonID | `row_ticket_close_person_id` | Long | `long` |
| 88 | `rowTicketCloseTime` | rowTicketCloseTime | `row_ticket_close_time` | DateTime | `timestamp` |
| 89 | `rowWarehousingClosePerson` | rowWarehousingClosePerson | `row_warehousing_close_person` | String | `text` |
| 90 | `rowWarehousingClosePersonId` | rowWarehousingClosePersonID | `row_warehousing_close_person_id` | Long | `long` |
| 91 | `rowWarehousingCloseTime` | rowWarehousingCloseTime | `row_warehousing_close_time` | DateTime | `timestamp` |
| 92 | `totalServiceMoney` | totalServiceMoney | `totalServiceMoney` | Decimal | `number` |
| 93 | `totalServiceNoTaxMoney` | totalServiceNoTaxMoney | `totalServiceNoTaxMoney` | Decimal | `number` |
| 94 | `totalServiceQty` | totalServiceQty | `totalServiceQty` | Decimal | `number` |
| 95 | `coreOrderCode` | coreOrder编码 | `coreOrderCode` | String | `text` |
| 96 | `coreOrderId` | coreOrderID | `coreOrderId` | Long | `long` |
| 97 | `coreOrderRowNO` | coreOrderRowNO | `coreOrderRowNO` | Decimal | `number` |
| 98 | `rejectReplenishSubQty` | rejectReplenishSubQty | `rejectReplenishSubQty` | Decimal | `number` |
| 99 | `coreOrderlineId` | coreOrderlineID | `coreOrderlineId` | Long | `long` |
| 100 | `priceEquationFormula` | priceEquationFormula | `priceEquationFormula` | String | `text` |
| 101 | `isLineFeedback` | 是否LineFeedback | `isLineFeedback` | Boolean | `switch` |
| 102 | `qualityPriceScheme` | qualityPriceScheme | `quality_price_scheme` | c7cc8895-2b03-4c7d-a327-da6e09410f76 | `quote` |
| 103 | `stockSensClue` | stockSensClue | `stockSensClue` | String | `text` |
| 104 | `expenseItemId` | expenseItemID | `expenseItemId` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 | `quote` |
| 105 | `distributionSide` | distributionSide | `distributionSide` | String | `text` |
| 106 | `purchaseOrdersDefineCharacter` | purchaseOrdersDefineCharacter | `purchaseOrdersDefineCharacter` | b8d69d17-1de0-4c1e-a43e-cfd0ac64d8ff | `UserDefine` |
| 107 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 108 | `batchno` | batchno | `sBatchNo` | String | `text` |
| 109 | `material` | material | `material` | 9a24ef07-e188-425b-b36a-402ddbf22073 | `quote` |
| 110 | `goodsposition` | goodsposition | `iGoodsPositionId` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc | `quote` |
| 111 | `isRowExpenses` | 是否RowExpenses | `isRowExpenses` | Boolean | `switch` |
| 112 | `groupTaskKey` | groupTaskKey | `groupTaskKey` | String | `text` |
| 113 | `invaliddate` | invaliddate | `dInvalidDate` | Date | `date` |
| 114 | `prePayMoney` | prePayMoney | `fPrePayMoney` | Decimal | `number` |
| 115 | `priceHaveTax` | priceHaveTax | `iPriceHaveTax` | Boolean | `switch` |
| 116 | `producedate` | producedate | `dProduceDate` | Date | `date` |
| 117 | `productAuth` | productAuth | `iProductid` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 | `quote` |
| 118 | `projectCode` | project编码 | `cProjectCode` | String | `text` |
| 119 | `purchaseOrdersCharacteristics` | purchaseOrdersCharacteristics | `purchaseOrdersCharacteristics` | 94ff6bce-ac1d-4753-b22a-d4045b339b8c | `FreeCT` |
| 120 | `sourceMainPubts` | sourceMainPubts | `sourceMainPubts` | DateTime | `timestamp` |
| 121 | `totalArrivedNatTaxMoney` | totalArrivedNatTaxMoney | `fTotalArrivedNatTaxMoney` | Decimal | `number` |
| 122 | `totalInNatTaxMoney` | totalInNatTaxMoney | `fTotalInNatTaxMoney` | Decimal | `number` |
| 123 | `totalInvoiceNatTaxMoney` | totalInvoiceNatTaxMoney | `fTotalInvoiceNatTaxMoney` | Decimal | `number` |
| 124 | `verifiedPrePayMoney` | verifiedPrePayMoney | `fVerifiedPrePayMoney` | Decimal | `number` |
| 125 | `id` | ID | `id` | Long | `long` |
| 126 | `mainid` | mainid | `iMainId` | ae75b080-0515-44b5-a9b3-d154d498325b | `quote` |
| 127 | `proDescFlag` | proDescFlag | `proDescFlag` | String | `text` |
| 128 | `productDesc` | productDesc | `productDesc` | String | `text` |
| 129 | `sourceProDescFlag` | sourceProDescFlag | `sourceProDescFlag` | String | `text` |
| 130 | `demandOrg` | demandOrg | `iDemandOrg` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 131 | `inOrg` | inOrg | `iInOrg` | c1135e08-c4bf-4499-90bf-67030d1f2654 | `quote` |
| 132 | `inInvoiceOrg` | inInvoiceOrg | `iInInvoiceOrg` | 4ec9e266-1eae-4f78-b5e3-26c220a15d70 | `quote` |
| 133 | `planTransRouteId` | planTransRouteID | `planTransRouteId` | 9aea767e-c207-4758-863d-afa266aa0138 | `quote` |
| 134 | `endAreaId` | endAreaID | `endAreaId` | 373171f0-f497-4bab-bda7-ff4b6489c13e | `quote` |
| 135 | `recePointId` | recePointID | `recePointId` | 42ee9178-d4e8-4c05-b72e-9650c492d33b | `quote` |
| 136 | `loadModeId` | loadModeID | `loadModeId` | 3b73800a-106b-41bb-8960-826a7f003aaa | `quote` |
| 137 | `logisticsOrgId` | logisticsOrgID | `logisticsOrgId` | 5b3cb420-49f7-4289-a937-76cee6a2a349 | `quote` |
| 138 | `taxitems` | taxitems | `iTaxItems` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |
| 139 | `materialClassId` | materialClassID | `iMaterialClassId` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `quote` |
| 140 | `materialId` | materialID | `material_id` | Long | `long` |
| 141 | `priceEquation` | priceEquation | `priceEquation` | 97790819-6d1f-4b4b-8d1c-f6d78b6531e4 | `quote` |
| 142 | `approveqty` | approveqty | `approveqty` | Decimal | `number` |
| 143 | `storageqty` | storageqty | `storageqty` | Decimal | `number` |
| 144 | `closeqty` | closeqty | `closeqty` | Decimal | `number` |
| 145 | `lineno` | lineno | `lineno` | Decimal | `number` |
| 146 | `rowno` | rowno | `rowno` | Integer | `int` |
| 147 | `unit` | unit | `iUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 148 | `qty` | qty | `qty` | Decimal | `number` |
| 149 | `invExchRate` | invExchRate | `invExchRate` | Decimal | `number` |
| 150 | `sourceUpLineno` | sourceUpLineno | `sourceUpLineno` | Decimal | `number` |
| 151 | `subQty` | subQty | `subQty` | Decimal | `number` |
| 152 | `upLineno` | upLineno | `upLineno` | Decimal | `number` |
| 153 | `invPriceExchRate` | invPriceExchRate | `invPriceExchRate` | Decimal | `number` |
| 154 | `priceQty` | priceQty | `priceQty` | Decimal | `number` |
| 155 | `oriTaxUnitPriceOriginal` | oriTaxUnitPriceOriginal | `oriTaxUnitPriceOriginal` | Decimal | `number` |
| 156 | `oriUnitPriceOriginal` | oriUnitPriceOriginal | `oriUnitPriceOriginal` | Decimal | `number` |
| 157 | `oriUnitPrice` | oriUnitPrice | `oriUnitPrice` | Decimal | `number` |
| 158 | `oriTaxUnitPrice` | oriTaxUnitPrice | `oriTaxUnitPrice` | Decimal | `number` |
| 159 | `taxRate` | taxRate | `taxRate` | Decimal | `number` |
| 160 | `discountRate` | discountRate | `discountRate` | Decimal | `number` |
| 161 | `unDeductTaxRate` | unDeductTaxRate | `iUnDeductTaxRate` | Decimal | `number` |
| 162 | `oriMoney` | oriMoney | `oriMoney` | Decimal | `number` |
| 163 | `oriSum` | oriSum | `oriSum` | Decimal | `number` |
| 164 | `oriTax` | oriTax | `oriTax` | Decimal | `number` |
| 165 | `unDeductTax` | unDeductTax | `iUnDeductTax` | Decimal | `number` |
| 166 | `natUnitPrice` | natUnitPrice | `natUnitPrice` | Decimal | `number` |
| 167 | `natTaxUnitPrice` | natTaxUnitPrice | `natTaxUnitPrice` | Decimal | `number` |
| 168 | `maxLimitPrice` | maxLimitPrice | `maxLimitPrice` | Decimal | `number` |
| 169 | `natMoney` | natMoney | `natMoney` | Decimal | `number` |
| 170 | `natSum` | natSum | `natSum` | Decimal | `number` |
| 171 | `recieveDate` | recieve日期 | `recieveDate` | Date | `date` |
| 172 | `inStoreLessLimit` | inStoreLessLimit | `inStoreLessLimit` | Decimal | `number` |
| 173 | `natTax` | natTax | `natTax` | Decimal | `number` |
| 174 | `free1` | free1 | `free1` | String | `text` |
| 175 | `more_or_less` | more_or_less | `more_or_less` | Decimal | `number` |
| 176 | `free2` | free2 | `free2` | String | `text` |
| 177 | `free3` | free3 | `free3` | String | `text` |
| 178 | `free4` | free4 | `free4` | String | `text` |
| 179 | `linecloser` | linecloser | `linecloser` | String | `text` |
| 180 | `linecloseTime` | linecloseTime | `lineclose_time` | DateTime | `timestamp` |
| 181 | `free5` | free5 | `free5` | String | `text` |
| 182 | `free6` | free6 | `free6` | String | `text` |
| 183 | `free7` | free7 | `free7` | String | `text` |
| 184 | `free8` | free8 | `free8` | String | `text` |
| 185 | `free9` | free9 | `free9` | String | `text` |
| 186 | `free10` | free10 | `free10` | String | `text` |
| 187 | `isGiftProduct` | 是否GiftProduct | `isGiftProduct` | Boolean | `switch` |
| 188 | `warehousingClose` | warehousingClose | `warehousingClose` | Boolean | `switch` |
| 189 | `discountTaxType` | discountTaxType | `discountTaxType` | DiscountTaxTypeEnum | `` |
| 190 | `ticketCollectionClose` | ticketCollectionClose | `ticketCollectionClose` | Boolean | `switch` |
| 191 | `arrivalClose` | arrivalClose | `arrivalClose` | Boolean | `switch` |
| 192 | `paymentClose` | paymentClose | `paymentClose` | Boolean | `switch` |
| 193 | `priceSource` | priceSource | `priceSource` | String | `text` |
| 194 | `isArrivalplan` | 是否Arrivalplan | `isArrivalplan` | Boolean | `switch` |
| 195 | `priceMark` | priceMark | `price_mark` | Integer | `int` |
| 196 | `reserveid` | reserveid | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 | `quote` |
| 197 | `memo` | 备注 | `cMemo` | String | `text` |
| 198 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 199 | `agentId` | agentID | `iAgentId` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 200 | `receiveAddress` | receiveAddress | `iReceiveAddress` | String | `text` |
| 201 | `receiver` | receiver | `iReceiver` | String | `text` |
| 202 | `receiveTelePhone` | receiveTelePhone | `iReceiveTelePhone` | String | `text` |
| 203 | `isDoLogistics` | 是否DoLogistics | `isDoLogistics` | Integer | `int` |
| 204 | `isLogisticsRelated` | 是否LogisticsRelated | `isLogisticsRelated` | Boolean | `switch` |
| 205 | `weighFinish` | weighFinish | `weighFinish` | Boolean | `switch` |
| 206 | `project` | project | `iProject` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |
| 207 | `warehouse` | warehouse | `iWarehouse` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |
| 208 | `hasPaymentSchedules` | hasPaymentSchedules | `hasPaymentSchedules` | Boolean | `switch` |
| 209 | `store` | store | `store` | 16e4e14c-ab05-4ee5-bbb8-c67351c9a8b3 | `quote` |
| 210 | `supplyItemCode` | supplyItem编码 | `cSupplyItemCode` | String | `text` |
| 211 | `supplyProductModel` | supplyProductModel | `supplyProductModel` | String | `text` |
| 212 | `supplyItemName` | supplyItem名称 | `cSupplyItemName` | String | `text` |
| 213 | `priceUOM` | priceUOM | `oPriceUOM` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 214 | `purUOM` | purUOM | `oPurUOM` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 215 | `maxInPrice` | maxInPrice | `fMaxInPrice` | Decimal | `number` |
| 216 | `totalPayQty` | totalPayQty | `fTotalPayQty` | Decimal | `number` |
| 217 | `totalSaleQty` | totalSaleQty | `fTotalSaleQty` | Decimal | `number` |
| 218 | `sourceid` | sourceid | `sourceid` | Long | `long` |
| 219 | `sourceautoid` | sourceautoid | `sourceautoid` | Long | `long` |
| 220 | `makeRuleCode` | makeRule编码 | `makerule_code` | String | `text` |
| 221 | `deliveryBatchNumber` | deliveryBatchNumber | `deliveryBatchNumber` | String | `text` |
| 222 | `contractBatchNumber` | contractBatchNumber | `contractBatchNumber` | String | `text` |
| 223 | `totalRecieveQty` | totalRecieveQty | `fTotalRecieveQty` | Decimal | `number` |
| 224 | `totalSendQty` | totalSendQty | `fTotalSendQty` | Decimal | `number` |
| 225 | `totalInQty` | totalInQty | `fTotalInQty` | Decimal | `number` |
| 226 | `totalAcceptQty` | totalAcceptQty | `fTotalAcceptQty` | Decimal | `number` |
| 227 | `totalInvoiceQty` | totalInvoiceQty | `fTotalInvoiceQty` | Decimal | `number` |
| 228 | `totalInvoiceMoney` | totalInvoiceMoney | `fTotalInvoiceMoney` | Decimal | `number` |
| 229 | `totalArrivedTaxMoney` | totalArrivedTaxMoney | `fTotalArrivedTaxMoney` | Decimal | `number` |
| 230 | `otherOrderRowNO` | otherOrderRowNO | `otherOrderRowNO` | Integer | `int` |
| 231 | `totalInTaxMoney` | totalInTaxMoney | `fTotalInTaxMoney` | Decimal | `number` |
| 232 | `totalPayOriMoney` | totalPayOriMoney | `fTotalPayOriMoney` | Decimal | `number` |
| 233 | `minOrderQty` | minOrderQty | `fMinOrderQty` | Decimal | `number` |
| 234 | `totalPayNATMoney` | totalPayNATMoney | `fTotalPayNATMoney` | Decimal | `number` |
| 235 | `orderDoubleQty` | orderDoubleQty | `fOrderDubboQty` | Decimal | `number` |
| 236 | `totalInvoiceNoTaxMoney` | totalInvoiceNoTaxMoney | `ftotalInvoiceNoTaxMoney` | Decimal | `number` |
| 237 | `outSrcBillRowNO` | outSrcBillRowNO | `outSrcBillRowNO` | Integer | `int` |
| 238 | `totalInNoTaxMoney` | totalInNoTaxMoney | `ftotalInNoTaxMoney` | Decimal | `number` |
| 239 | `outSrcBillId` | outSrcBillID | `outSrcBillId` | Long | `long` |
| 240 | `outSrcBillRowId` | outSrcBillRowID | `outSrcBillRowId` | Long | `long` |
| 241 | `unitExchangeType` | unitExchangeType | `unitExchangeType` | Integer | `int` |
| 242 | `upcode` | upcode | `upcode` | String | `text` |
| 243 | `unitExchangeTypePrice` | unitExchangeTypePrice | `unitExchangeTypePrice` | Integer | `int` |
| 244 | `source` | source | `source` | String | `text` |
| 245 | `firstsource` | firstsource | `firstsource` | String | `text` |
| 246 | `firstupcode` | firstupcode | `firstupcode` | String | `text` |
| 247 | `outSrcBillNO` | outSrcBillNO | `outSrcBillNO` | String | `text` |
| 248 | `outSource` | outSource | `outSource` | String | `text` |
| 249 | `trackingNO` | trackingNO | `trackingNO` | String | `text` |
| 250 | `rejectReplenishQty` | rejectReplenishQty | `rejectReplenishQty` | Decimal | `number` |
| 251 | `totalRecieveSubqty` | totalRecieveSubqty | `fTotalRecieveSubqty` | Decimal | `number` |
| 252 | `totalPurchaseSendQty` | totalPurchaseSendQty | `fTotalPurchaseSendQty` | Decimal | `number` |
| 253 | `totalInSubqty` | totalInSubqty | `fTotalInSubqty` | Decimal | `number` |
| 254 | `srcApplyOrderAotoId` | srcApplyOrderAotoID | `srcApplyOrderAotoId` | ee3a538b-b943-4914-a16c-2e6b6937f835 | `quote` |
| 255 | `srcApplyOrderId` | srcApplyOrderID | `srcApplyOrderId` | 787f2d17-c268-4362-994e-facbc5c489a5 | `quote` |
| 256 | `totalSaleOrderQty` | totalSaleOrderQty | `totalSaleOrderQty` | Decimal | `number` |
| 257 | `firstsourceautoid` | firstsourceautoid | `firstsourceautoid` | Long | `long` |
| 258 | `firstsourceid` | firstsourceid | `firstsourceid` | Long | `long` |
| 259 | `srcReqId` | srcReqID | `srcReqId` | Long | `long` |
| 260 | `totalAcceptSubqty` | totalAcceptSubqty | `fTotalAcceptSubqty` | Decimal | `number` |
| 261 | `totalRejectQty` | totalRejectQty | `fTotalRejectQty` | Decimal | `number` |
| 262 | `totalReturnInQty` | totalReturnInQty | `fTotalReturnInQty` | Decimal | `number` |
| 263 | `totalPayAmount` | totalPayAmount | `totalPayAmount` | Decimal | `number` |
| 264 | `totalRejectSubqty` | totalRejectSubqty | `fTotalRejectSubqty` | Decimal | `number` |
| 265 | `totalPayApplyAmount` | totalPayApplyAmount | `totalPayApplyAmount` | Decimal | `number` |
| 266 | `totalReturnInSubQty` | totalReturnInSubQty | `fTotalReturnInSubQty` | Decimal | `number` |
| 267 | `totalReturnQty` | totalReturnQty | `fTotalReturnQty` | Decimal | `number` |
| 268 | `plannedTotalRecPurQty` | plannedTotalRecPurQty | `fPlannedTotalRecPurQty` | Decimal | `number` |
| 269 | `totalReturnAndReturnInQty` | totalReturnAndReturnInQty | `fTotalReturnAndReturnInQty` | Decimal | `number` |
| 270 | `plannedTotalRecUnitQty` | plannedTotalRecUnitQty | `fPlannedTotalRecUnitQty` | Decimal | `number` |
| 271 | `totalReturnSubQty` | totalReturnSubQty | `fTotalReturnSubQty` | Decimal | `number` |
| 272 | `totalReturnAndReturnInSubQty` | totalReturnAndReturnInSubQty | `fTotalReturnAndReturnInSubQty` | Decimal | `number` |
| 273 | `costCenter` | costCenter | `cost_center` | 872630ba-e8f4-4080-817d-8fc9a6958733 | `quote` |
| 274 | `providerProfitCenter` | providerProfitCenter | `provider_profit_center` | e33ec72a-3857-4167-89e2-a437168ed3bb | `quote` |
| 275 | `consumerProfitCenter` | consumerProfitCenter | `consumer_profit_center` | e33ec72a-3857-4167-89e2-a437168ed3bb | `quote` |
| 276 | `expenseNatSum` | expenseNatSum | `expenseNatSum` | Decimal | `number` |
| 277 | `expenseNatMoney` | expenseNatMoney | `expenseNatMoney` | Decimal | `number` |
| 278 | `expenseOriSum` | expenseOriSum | `expenseOriSum` | Decimal | `number` |
| 279 | `expenseOriMoney` | expenseOriMoney | `expenseOriMoney` | Decimal | `number` |
| 280 | `arrivalPlans` | arrivalPlans | `` | 8a612f0d-2ee6-4601-a996-d0d293f698af | `` |
| 281 | `bodyFreeItem` | bodyFreeItem | `` | c1ffda71-f9d8-4acc-b940-b8b4d1e7de33 | `` |
| 282 | `bodyItem` | bodyItem | `` | 79243712-6140-4a9d-9d1d-bc48666cc2a3 | `` |
| 283 | `bodyParallel` | bodyParallel | `` | 1f9506b3-9b36-4882-bbdf-a84cf699c25b | `` |
| 284 | `closeReleaseContract` | closeReleaseContract | `close_release_contract` | Integer | `int` |
| 285 | `invExchRateDen` | invExchRateDen | `invexchrateden` | Decimal | `number` |
| 286 | `invExchRateNum` | invExchRateNum | `invexchratenum` | Decimal | `number` |
| 287 | `invPriceExchRateDen` | invPriceExchRateDen | `invpriceexchrateden` | Decimal | `number` |
| 288 | `invPriceExchRateNum` | invPriceExchRateNum | `invpriceexchratenum` | Decimal | `number` |
| 289 | `materialQty` | materialQty | `material_qty` | Decimal | `number` |
| 290 | `paymentProgressACKs` | paymentProgressACKs | `` | 31efee44-834e-4876-bccb-6f031bc42b79 | `` |
| 291 | `proposedVendorId` | proposedVendorID | `proposed_vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 292 | `ptoCostScrap` | ptoCostScrap | `ptoCostScrap` | Decimal | `number` |
| 293 | `ptoHierarchyType` | ptoHierarchyType | `ptoHierarchyType` | Integer | `int` |
| 294 | `ptoId` | ptoID | `ptoId` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 295 | `ptoPricingMethod` | ptoPricingMethod | `ptoPricingMethod` | Integer | `int` |
| 296 | `ptoQty` | ptoQty | `ptoQty` | Decimal | `number` |
| 297 | `ptoRowId` | ptoRowID | `ptoRowId` | Long | `long` |
| 298 | `ptoSonQty` | ptoSonQty | `ptoSonQty` | Decimal | `number` |
| 299 | `taxResults` | taxResults | `` | 0a675e63-6e60-4c1c-97f7-efe9c991e198 | `` |
| 300 | `totalOffsetMoney` | totalOffsetMoney | `total_offset_money` | Decimal | `number` |
| 301 | `totalOffsetNatMoney` | totalOffsetNatMoney | `total_offset_nat_money` | Decimal | `number` |
| 302 | `totalOffsetNatSum` | totalOffsetNatSum | `total_offset_nat_sum` | Decimal | `number` |
| 303 | `totalOffsetNatTax` | totalOffsetNatTax | `total_offset_nat_tax` | Decimal | `number` |
| 304 | `totalOffsetNatTaxAmt` | totalOffsetNatTaxAmt | `total_offset_nat_tax_amt` | Decimal | `number` |
| 305 | `totalOffsetQty` | totalOffsetQty | `total_offset_qty` | Decimal | `number` |
| 306 | `totalOffsetSum` | totalOffsetSum | `total_offset_sum` | Decimal | `number` |
| 307 | `totalOffsetTax` | totalOffsetTax | `total_offset_tax` | Decimal | `number` |
| 308 | `totalOffsetTaxAmt` | totalOffsetTaxAmt | `total_offset_tax_amt` | Decimal | `number` |
| 309 | `totalPreMoney` | totalPreMoney | `total_pre_money` | Decimal | `number` |
| 310 | `totalPreNatMoney` | totalPreNatMoney | `total_pre_nat_money` | Decimal | `number` |
| 311 | `totalPreNatSum` | totalPreNatSum | `total_pre_nat_sum` | Decimal | `number` |
| 312 | `totalPreNatTax` | totalPreNatTax | `total_pre_nat_tax` | Decimal | `number` |
| 313 | `totalPreNatTaxAmt` | totalPreNatTaxAmt | `total_pre_nat_tax_amt` | Decimal | `number` |
| 314 | `totalPreQty` | totalPreQty | `total_pre_qty` | Decimal | `number` |
| 315 | `totalPreSum` | totalPreSum | `total_pre_sum` | Decimal | `number` |
| 316 | `totalPreTax` | totalPreTax | `total_pre_tax` | Decimal | `number` |
| 317 | `totalPreTaxAmt` | totalPreTaxAmt | `total_pre_tax_amt` | Decimal | `number` |

## 关联（50 个）

- `expenseItemId` -> `bd.expenseitem.ExpenseItem` () 
- `purUOM` -> `pc.unit.Unit` () 
- `inOrg` -> `aa.baseorg.InventoryOrgMV` () 
- `ptoId` -> `pc.product.Product` () 
- `paymentProgressACKs` -> `pu.purchaseorder.PurchaseOrdersPaymentProgressACK` (0..n) 
- `project` -> `bd.project.ProjectVO` () 
- `wbs` -> `BGDM.wbs.wbs_doc` () 
- `providerProfitCenter` -> `bd.virtualaccbody.VirtualAccbody` () 
- `priceEquation` -> `aa.priceformula.PriceFormula` () 
- `inInvoiceOrg` -> `aa.baseorg.FinanceOrgMV` () 
- `logisticsOrgId` -> `org.func.LogisticsOrg` () 
- `goodsposition` -> `aa.goodsposition.GoodsPosition` () 
- `mainid` -> `pu.purchaseorder.PurchaseOrder` (1..n) 
- `bodyItem` -> `pu.purchaseorder.PurchaseOrdersCustomItem` (1) [废]
- `costCenter` -> `bd.costcenter.CostCenter` () 
- `arrivalPlans` -> `pu.purchaseorder.ArrivalPlan` (0..n) 
- `bodyParallel` -> `pu.purchaseorder.PurchaseOrdersParallel` (1) 
- `taxCodeId` -> `taxpubdoc.taxengine.TaxCode` () 
- `warehouse` -> `aa.warehouse.Warehouse` () 
- `tradeRouteID` -> `sccs.multitrade.TradeRoute` () 
- `taxResults` -> `pu.purchaseorder.TaxCalculationResult` (0..n) 
- `unit` -> `pc.unit.Unit` () 
- `productsku` -> `pc.aa.ProductSKU` () [废]
- `bodyFreeItem` -> `pu.purchaseorder.PurchaseOrdersFreeItem` (1) [废]
- `productAuth` -> `pb.dataauth.ProductDataAuth` () 
- `loadModeId` -> `base.loadway.LoadWay` () 
- `purchaseOrdersDefineCharacter` -> `pu.purchaseorder.NPurchaseOrdersDefineCharacter` () 
- `materialn` -> `pc.product.Product` () 
- `recePointId` -> `usp.sendAndReceiveSite.SendAndReceiveSite` () 
- `agentId` -> `aa.merchant.Merchant` () 
- `reserveid` -> `st.reservation.Reservation` () 
- `activity` -> `pgrm.projecttask.ProjectScheduleTask` () 
- `demandOrg` -> `aa.baseorg.OrgMV` () 
- `productskun` -> `pc.product.ProductSKU` () 
- `planTransRouteId` -> `usp.plantransportroute.PlanTransportRoute` () 
- `purchaseOrdersCharacteristics` -> `pu.purchaseorder.PurchaseOrdersCharacteristics` () 
- `endAreaId` -> `base.shipregion.ShipRegion` () 
- `priceUOM` -> `pc.unit.Unit` () 
- `srcApplyOrderAotoId` -> `pu.applyorder.ApplyOrders` () 
- `qualityPriceScheme` -> `aa.qualitypricescheme.QualitypriceScheme` () 
- `product` -> `pc.aa.Product` () [废]
- `srcApplyOrderId` -> `pu.applyorder.ApplyOrder` () 
- `materialClassId` -> `pc.cls.ManagementClass` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `proposedVendorId` -> `aa.vendor.Vendor` () 
- `store` -> `aa.store.Store` () 
- `consumerProfitCenter` -> `bd.virtualaccbody.VirtualAccbody` () 
- `material` -> `pc.aa.Product` () [废]
- `productn` -> `pc.product.Product` () 
- `taxitems` -> `archive.taxArchives.TaxRateArchive` () 
