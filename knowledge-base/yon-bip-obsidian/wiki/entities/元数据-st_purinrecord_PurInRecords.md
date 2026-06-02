---
tags: [BIP, 元数据, 数据字典, 采购入库, ST, st.purinrecord.PurInRecords]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
parent_entity: st.purinrecord.PurInRecord
---
# 采购入库单子表 (`st.purinrecord.PurInRecords`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `st_purinrecords` | 应用: `ST`

## 属性（240 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `backOrderDetailId` | backOrderDetailID | `backOrderDetailId` | Long | `long` |
| 2 | `backOrderId` | backOrderID | `backOrderId` | Long | `long` |
| 3 | `checking` | checking | `checking` | Boolean | `switch` |
| 4 | `checkingSettlementQty` | checkingSettlementQty | `checkingSettlementQty` | Decimal | `number` |
| 5 | `deductMessQty` | deductMessQty | `deductMessQty` | Decimal | `number` |
| 6 | `expenseNatMoney` | expenseNatMoney | `expenseNatMoney` | Decimal | `number` |
| 7 | `expenseNatSum` | expenseNatSum | `expenseNatSum` | Decimal | `number` |
| 8 | `expenseOriMoney` | expenseOriMoney | `expenseOriMoney` | Decimal | `number` |
| 9 | `expenseOriSum` | expenseOriSum | `expenseOriSum` | Decimal | `number` |
| 10 | `goodPriceQualityPlan` | goodPriceQualityPlan | `goodPriceQualityPlan` | c7cc8895-2b03-4c7d-a327-da6e09410f76 | `quote` |
| 11 | `haspaymentschedules` | haspaymentschedules | `iHaspaymentschedules` | Boolean | `switch` |
| 12 | `isLineFeedback` | 是否LineFeedback | `isLineFeedback` | Boolean | `switch` |
| 13 | `overflowRate` | overflowRate | `overflowRate` | Decimal | `number` |
| 14 | `priceSettlementCompleted` | priceSettlementCompleted | `priceSettlementCompleted` | Boolean | `switch` |
| 15 | `priceSettlementConfirmed` | priceSettlementConfirmed | `priceSettlementConfirmed` | Boolean | `switch` |
| 16 | `productAuth` | productAuth | `iProductid` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 | `quote` |
| 17 | `productn` | productn | `iProductid` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 18 | `productskun` | productskun | `iProductSkuid` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `quote` |
| 19 | `coSourceid` | coSourceid | `coSourceid` | Long | `long` |
| 20 | `inventoryOrExpenseToAsset` | inventoryOrExpenseToAsset | `inventory_expense_asset` | Integer | `int` |
| 21 | `subWarehouse` | subWarehouse | `sub_warehouse` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |
| 22 | `deductedTonnageQty` | deductedTonnageQty | `deducted_tonnage_qty` | Decimal | `number` |
| 23 | `referenceTime` | referenceTime | `reference_time` | DateTime | `timestamp` |
| 24 | `referenceQty` | referenceQty | `reference_qty` | Decimal | `number` |
| 25 | `isUpdateCost` | 是否UpdateCost | `isUpdateCost` | Boolean | `switch` |
| 26 | `throwStatus` | throwStatus | `throw_status` | Integer | `int` |
| 27 | `writeOffUpcode` | writeOffUpcode | `write_off_upcode` | String | `text` |
| 28 | `writeOffSourceid` | writeOffSourceid | `write_off_sourceid` | Long | `long` |
| 29 | `writeOffSourceautoid` | writeOffSourceautoid | `write_off_sourceautoid` | Long | `long` |
| 30 | `writeOffUplineno` | writeOffUplineno | `write_off_uplineno` | Decimal | `number` |
| 31 | `mtoSalesOrderLineNo` | mtoSalesOrderLineNo | `mtoSalesOrderLineNo` | Decimal | `number` |
| 32 | `wbs` | wbs | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 | `quote` |
| 33 | `coSourceautoid` | coSourceautoid | `coSourceautoid` | Long | `long` |
| 34 | `godownentryDetailId` | godownentryDetailID | `godownentryDetailId` | Long | `long` |
| 35 | `mtoSalesOrderCode` | mtoSalesOrder编码 | `mtoSalesOrderCode` | String | `text` |
| 36 | `retailMoney` | retailMoney | `retailMoney` | Decimal | `number` |
| 37 | `productPurtype` | productPurtype | `product_purtype` | Integer | `int` |
| 38 | `activity` | activity | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 | `quote` |
| 39 | `mtoSalesOrderId` | mtoSalesOrderID | `mtoSalesOrderId` | Long | `long` |
| 40 | `ctjlCode` | ctjl编码 | `ctjl_code` | String | `text` |
| 41 | `collaborationPolineno` | collaborationPolineno | `collaborationPolineno` | Decimal | `number` |
| 42 | `tradeRouteLineno` | tradeRouteLineno | `tradeRouteLineno` | Decimal | `number` |
| 43 | `isEndTrade` | 是否EndTrade | `isEndTrade` | Short | `short` |
| 44 | `out_sys_rowno` | out_sys_rowno | `out_sys_rowno` | String | `text` |
| 45 | `ctjlId` | ctjlID | `ctjl_id` | Long | `long` |
| 46 | `totalOthOutStockQuantity` | totalOthOutStockQuantity | `totalOthOutStockQuantity` | Decimal | `number` |
| 47 | `coSourceLineNo` | coSourceLineNo | `coSourceLineNo` | Decimal | `number` |
| 48 | `tradeRouteID` | tradeRouteID | `tradeRouteID` | c69f1d6a-783c-4f79-b446-b4da14cb7fff | `quote` |
| 49 | `out_sys_lineid` | out_sys_lineid | `out_sys_lineid` | String | `text` |
| 50 | `coUpcode` | coUpcode | `coUpcode` | String | `text` |
| 51 | `stockType` | stockType | `stockType` | de7a641c-45f2-4b85-8424-2ed8acf02456 | `quote` |
| 52 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 53 | `coSourceType` | coSourceType | `coSourceType` | String | `text` |
| 54 | `mtoSalesOrderLineId` | mtoSalesOrderLineID | `mtoSalesOrderLineId` | Long | `long` |
| 55 | `godownentryId` | godownentryID | `godownentryId` | Long | `long` |
| 56 | `retailUnitPrice` | retailUnitPrice | `retailUnitPrice` | Decimal | `number` |
| 57 | `reverseInvoiceQty` | reverseInvoiceQty | `reverseInvoiceQty` | Decimal | `number` |
| 58 | `shortageRate` | shortageRate | `shortageRate` | Decimal | `number` |
| 59 | `totalNatPayMoney` | totalNatPayMoney | `iTotalNatPayMoney` | Decimal | `number` |
| 60 | `totalPayMoney` | totalPayMoney | `iTotalPayMoney` | Decimal | `number` |
| 61 | `totalReturnQty` | totalReturnQty | `totalReturnQty` | Decimal | `number` |
| 62 | `tranFixedAssetQty` | tranFixedAssetQty | `tranFixedAssetQty` | Decimal | `number` |
| 63 | `tranFixedAssetType` | tranFixedAssetType | `tranFixedAssetType` | Integer | `int` |
| 64 | `builCardType` | builCardType | `builCardType` | Integer | `int` |
| 65 | `expenseItems` | expenseItems | `expenseItems` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 | `quote` |
| 66 | `oriCostMoney` | oriCostMoney | `ori_cost_money` | Decimal | `number` |
| 67 | `oriCostUnitPrice` | oriCostUnitPrice | `ori_cost_unit_price` | Decimal | `number` |
| 68 | `oriUnDeductTax` | oriUnDeductTax | `oriUnDeductTax` | Decimal | `number` |
| 69 | `purInRecordsDefineCharacter` | purInRecordsDefineCharacter | `purInRecordsDefineCharacter` | 4f38002f-0f5b-4275-b1b1-22de47ec4b12 | `UserDefine` |
| 70 | `stockSensClue` | stockSensClue | `stockSensClue` | String | `text` |
| 71 | `allTotalInternalNatMoney` | allTotalInternalNatMoney | `fAllTotalInternalNatMoney` | Decimal | `number` |
| 72 | `allTotalInternalOriMoney` | allTotalInternalOriMoney | `fAllTotalInternalOriMoney` | Decimal | `number` |
| 73 | `allTotalInternalQty` | allTotalInternalQty | `fAllTotalInternalQty` | Decimal | `number` |
| 74 | `allTotalInternalUnit` | allTotalInternalUnit | `fAllTotalInternalUnit` | Decimal | `number` |
| 75 | `fiCostPubts` | fiCostPubts | `fi_cost_pubts` | Long | `long` |
| 76 | `firstuplineno` | firstuplineno | `firstuplineno` | Decimal | `number` |
| 77 | `groupTaskKey` | groupTaskKey | `groupTaskKey` | String | `text` |
| 78 | `insresSourceId` | insresSourceID | `insresSourceId` | String | `text` |
| 79 | `lineno` | lineno | `lineno` | Decimal | `number` |
| 80 | `poDetailEntity` | poDetailEntity | `podetailid` | 68e65921-f77c-4794-a820-768e10ec6d28 | `quote` |
| 81 | `priceMark` | priceMark | `priceMark` | Integer | `int` |
| 82 | `priceSource` | priceSource | `priceSource` | String | `text` |
| 83 | `project_code` | project_code | `cProjectCode` | String | `text` |
| 84 | `purInRecordsCharacteristics` | purInRecordsCharacteristics | `purInRecordsCharacteristics` | c54c2aa7-5187-4451-988b-61d0f92a4c8e | `FreeCT` |
| 85 | `sourceMainPubts` | sourceMainPubts | `sourceMainPubts` | DateTime | `timestamp` |
| 86 | `sourceOrderlineno` | sourceOrderlineno | `sourceOrderlineno` | Decimal | `number` |
| 87 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 88 | `uplineno` | uplineno | `uplineno` | Decimal | `number` |
| 89 | `mainid` | mainid | `iMainId` | f27abe81-1a48-4c58-b5fd-9a49a519276e | `quote` |
| 90 | `id` | ID | `id` | Long | `long` |
| 91 | `rowno` | rowno | `rowno` | Integer | `int` |
| 92 | `productDesc` | productDesc | `productDesc` | String | `text` |
| 93 | `totalOutStockQuantity` | totalOutStockQuantity | `fOutStockQuantity` | Decimal | `number` |
| 94 | `totalOutStockSubQty` | totalOutStockSubQty | `fTotalOutStockSubQty` | Decimal | `number` |
| 95 | `isScrap` | 是否Scrap | `isScrap` | Boolean | `switch` |
| 96 | `stockStatusDoc` | stockStatusDoc | `stockStatusDoc` | 5275f074-3e60-4b90-9771-20970f1e905c | `quote` |
| 97 | `discountTaxType` | discountTaxType | `discountTaxType` | String | `text` |
| 98 | `establishedCardQty` | establishedCardQty | `fEstablishedCardQty` | Decimal | `number` |
| 99 | `goodsposition` | goodsposition | `iGoodsPositionId` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc | `quote` |
| 100 | `reserveid` | reserveid | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 | `quote` |
| 101 | `collaborationRecnc` | collaborationRecnc | `collaborationRecnc` | Boolean | `switch` |
| 102 | `recncStatus` | recncStatus | `recncStatus` | String | `text` |
| 103 | `supplierProductCode` | supplierProduct编码 | `supplierProductCode` | String | `text` |
| 104 | `supplierProductName` | supplierProduct名称 | `supplierProductName` | String | `text` |
| 105 | `supplyProductModel` | supplyProductModel | `supplyProductModel` | String | `text` |
| 106 | `product` | product | `iProductid` | 9a24ef07-e188-425b-b36a-402ddbf22073 | `quote` |
| 107 | `productsku` | productsku | `iProductSkuid` | 0d86941d-5af3-4cf4-9255-4f5c74a3476f | `quote` |
| 108 | `free1` | free1 | `free1` | String | `text` |
| 109 | `free2` | free2 | `free2` | String | `text` |
| 110 | `free3` | free3 | `free3` | String | `text` |
| 111 | `free4` | free4 | `free4` | String | `text` |
| 112 | `free5` | free5 | `free5` | String | `text` |
| 113 | `free6` | free6 | `free6` | String | `text` |
| 114 | `free7` | free7 | `free7` | String | `text` |
| 115 | `free8` | free8 | `free8` | String | `text` |
| 116 | `free9` | free9 | `free9` | String | `text` |
| 117 | `free10` | free10 | `free10` | String | `text` |
| 118 | `batchno` | batchno | `sBatchNo` | String | `text` |
| 119 | `producedate` | producedate | `dProduceDate` | Date | `date` |
| 120 | `invaliddate` | invaliddate | `dInvalidDate` | Date | `date` |
| 121 | `qty` | qty | `qty` | Decimal | `number` |
| 122 | `unit` | unit | `iUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 123 | `invExchRate` | invExchRate | `invExchRate` | Decimal | `number` |
| 124 | `unitExchangeType` | unitExchangeType | `unitExchangeType` | Integer | `int` |
| 125 | `subQty` | subQty | `subQty` | Decimal | `number` |
| 126 | `stockUnitId` | stockUnitID | `stock_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 127 | `contactsQuantity` | contactsQuantity | `contacts_quantity` | Decimal | `number` |
| 128 | `contactsPieces` | contactsPieces | `contacts_pieces` | Decimal | `number` |
| 129 | `unitExchangeTypePrice` | unitExchangeTypePrice | `unitExchangeTypePrice` | Integer | `int` |
| 130 | `priceQty` | priceQty | `priceQty` | Decimal | `number` |
| 131 | `invPriceExchRate` | invPriceExchRate | `invPriceExchRate` | Decimal | `number` |
| 132 | `priceUOM` | priceUOM | `oPriceUOM` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 133 | `isGiftProduct` | 是否GiftProduct | `isGiftProduct` | Boolean | `switch` |
| 134 | `oriUnitPrice` | oriUnitPrice | `oriUnitPrice` | Decimal | `number` |
| 135 | `oriTaxUnitPrice` | oriTaxUnitPrice | `oriTaxUnitPrice` | Decimal | `number` |
| 136 | `oriMoney` | oriMoney | `oriMoney` | Decimal | `number` |
| 137 | `oriSum` | oriSum | `oriSum` | Decimal | `number` |
| 138 | `oriTax` | oriTax | `oriTax` | Decimal | `number` |
| 139 | `taxitems` | taxitems | `iTaxItems` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |
| 140 | `taxRate` | taxRate | `taxRate` | Decimal | `number` |
| 141 | `natUnitPrice` | natUnitPrice | `natUnitPrice` | Decimal | `number` |
| 142 | `natTaxUnitPrice` | natTaxUnitPrice | `natTaxUnitPrice` | Decimal | `number` |
| 143 | `natMoney` | natMoney | `natMoney` | Decimal | `number` |
| 144 | `natSum` | natSum | `natSum` | Decimal | `number` |
| 145 | `natTax` | natTax | `natTax` | Decimal | `number` |
| 146 | `autoCalcCost` | autoCalcCost | `autoCalcCost` | Boolean | `switch` |
| 147 | `unDeductTaxRate` | unDeductTaxRate | `unDeductTaxRate` | Decimal | `number` |
| 148 | `unDeductTax` | unDeductTax | `unDeductTax` | Decimal | `number` |
| 149 | `costMoney` | costMoney | `cost_money` | Decimal | `number` |
| 150 | `costUnitPrice` | costUnitPrice | `cost_unit_price` | Decimal | `number` |
| 151 | `aprice` | aprice | `faprice` | Decimal | `number` |
| 152 | `amoney` | amoney | `famoney` | Decimal | `number` |
| 153 | `maxLimitPrice` | maxLimitPrice | `maxLimitPrice` | Decimal | `number` |
| 154 | `memo` | 备注 | `cMemo` | String | `text` |
| 155 | `totalBillOriSum` | totalBillOriSum | `totalBillOriSum` | Decimal | `number` |
| 156 | `totalBillNatSum` | totalBillNatSum | `totalBillNatSum` | Decimal | `number` |
| 157 | `billSubQty` | billSubQty | `fbillSubQty` | Decimal | `number` |
| 158 | `billqty` | billqty | `fbillqty` | Decimal | `number` |
| 159 | `sqty` | sqty | `fsqty` | Decimal | `number` |
| 160 | `smoney` | smoney | `fsmoney` | Decimal | `number` |
| 161 | `sfee` | sfee | `fsfee` | Decimal | `number` |
| 162 | `sumamoney` | sumamoney | `fsumamoney` | Decimal | `number` |
| 163 | `sdate` | sdate | `dsdate` | Date | `date` |
| 164 | `recorddate` | recorddate | `dRecordDate` | Date | `date` |
| 165 | `project` | project | `iProject` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |
| 166 | `license` | license | `license` | String | `text` |
| 167 | `weighFinish` | weighFinish | `weighFinish` | Boolean | `switch` |
| 168 | `isLogisticsRelated` | 是否LogisticsRelated | `isLogisticsRelated` | Boolean | `switch` |
| 169 | `makeRuleCode` | makeRule编码 | `makerule_code` | String | `text` |
| 170 | `sourceid` | sourceid | `sourceid` | Long | `long` |
| 171 | `sourceautoid` | sourceautoid | `sourceautoid` | Long | `long` |
| 172 | `qmsResultId` | qmsResultID | `qmsResultId` | String | `text` |
| 173 | `poid` | poid | `poid` | Long | `long` |
| 174 | `podetailid` | podetailid | `podetailid` | Long | `long` |
| 175 | `firstsourceid` | firstsourceid | `firstsourceid` | Long | `long` |
| 176 | `purchaseOrderSourceDetailId` | purchaseOrderSourceDetailID | `purchaseOrderSourceDetailId` | Long | `long` |
| 177 | `purchaseOrderSourceId` | purchaseOrderSourceID | `purchaseOrderSourceId` | Long | `long` |
| 178 | `firstsourceautoid` | firstsourceautoid | `firstsourceautoid` | Long | `long` |
| 179 | `source` | source | `source` | String | `text` |
| 180 | `arrId` | arrID | `arrId` | Long | `long` |
| 181 | `arrDetailId` | arrDetailID | `arrDetailId` | Long | `long` |
| 182 | `upcode` | upcode | `upcode` | String | `text` |
| 183 | `firstsource` | firstsource | `firstsource` | String | `text` |
| 184 | `pocode` | pocode | `pocode` | String | `text` |
| 185 | `firstupcode` | firstupcode | `firstupcode` | String | `text` |
| 186 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 187 | `canAssetsPull` | canAssetsPull | `canAssetsPull` | Boolean | `switch` |
| 188 | `vendorConfirmed` | vendorConfirmed | `vendorConfirmed` | Boolean | `switch` |
| 189 | `applyDept` | applyDept | `applyDept` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 | `quote` |
| 190 | `applyOperator` | applyOperator | `applyOperator` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 191 | `contractId` | contractID | `contract_id` | Long | `long` |
| 192 | `contractDetailId` | contractDetailID | `contract_detail_id` | Long | `long` |
| 193 | `contractRowNum` | contractRowNum | `contract_row_num` | Long | `long` |
| 194 | `contractBillno` | contractBillno | `contract_billno` | String | `text` |
| 195 | `contractName` | contract名称 | `contract_name` | String | `text` |
| 196 | `collaborationSource` | collaborationSource | `collaboration_source` | String | `text` |
| 197 | `collaborationPoid` | collaborationPoid | `collaboration_poid` | Long | `long` |
| 198 | `collaborationPocode` | collaborationPocode | `collaboration_pocode` | String | `text` |
| 199 | `aggregated` | aggregated | `aggregated` | Boolean | `switch` |
| 200 | `collaborationPodetailid` | collaborationPodetailid | `collaboration_podetailid` | Long | `long` |
| 201 | `bodyItem` | bodyItem | `` | a32aca24-7de0-4e31-8502-e9b4cebe9112 | `` |
| 202 | `define1` | define1 | `define1` | String | `text` |
| 203 | `define10` | define10 | `define10` | String | `text` |
| 204 | `define11` | define11 | `define11` | String | `text` |
| 205 | `define12` | define12 | `define12` | String | `text` |
| 206 | `define13` | define13 | `define13` | String | `text` |
| 207 | `define14` | define14 | `define14` | String | `text` |
| 208 | `define15` | define15 | `define15` | String | `text` |
| 209 | `define16` | define16 | `define16` | String | `text` |
| 210 | `define17` | define17 | `define17` | String | `text` |
| 211 | `define18` | define18 | `define18` | String | `text` |
| 212 | `define19` | define19 | `define19` | String | `text` |
| 213 | `define2` | define2 | `define2` | String | `text` |
| 214 | `define20` | define20 | `define20` | String | `text` |
| 215 | `define21` | define21 | `define21` | String | `text` |
| 216 | `define22` | define22 | `define22` | String | `text` |
| 217 | `define23` | define23 | `define23` | String | `text` |
| 218 | `define24` | define24 | `define24` | String | `text` |
| 219 | `define25` | define25 | `define25` | String | `text` |
| 220 | `define26` | define26 | `define26` | String | `text` |
| 221 | `define27` | define27 | `define27` | String | `text` |
| 222 | `define28` | define28 | `define28` | String | `text` |
| 223 | `define29` | define29 | `define29` | String | `text` |
| 224 | `define3` | define3 | `define3` | String | `text` |
| 225 | `define30` | define30 | `define30` | String | `text` |
| 226 | `define4` | define4 | `define4` | String | `text` |
| 227 | `define5` | define5 | `define5` | String | `text` |
| 228 | `define6` | define6 | `define6` | String | `text` |
| 229 | `define7` | define7 | `define7` | String | `text` |
| 230 | `define8` | define8 | `define8` | String | `text` |
| 231 | `define9` | define9 | `define9` | String | `text` |
| 232 | `defines` | defines | `` | 6cdad9e7-9c9a-42c0-a482-c5fcc2a85a0d | `` |
| 233 | `invExchRateDen` | invExchRateDen | `invexchrateden` | Decimal | `number` |
| 234 | `invExchRateNum` | invExchRateNum | `invexchratenum` | Decimal | `number` |
| 235 | `invPriceExchRateDen` | invPriceExchRateDen | `invpriceexchrateden` | Decimal | `number` |
| 236 | `invPriceExchRateNum` | invPriceExchRateNum | `invpriceexchratenum` | Decimal | `number` |
| 237 | `paymentExeDetails` | paymentExeDetails | `` | f145ca41-9653-4a36-a356-d35281371e72 | `` |
| 238 | `purInRecordsExtend` | purInRecordsExtend | `` | 7fbe93c2-cb78-4a6b-9d60-40d9aafc482f | `` |
| 239 | `purInRecordsSNs` | purInRecordsSNs | `` | 9516c84f-e5e7-4bfa-a9bc-086e72ff9f21 | `` |
| 240 | `writeOffQtyTotal` | writeOffQtyTotal | `write_off_qty_total` | Decimal | `number` |

## 关联（33 个）

- `purInRecordsExtend` -> `st.purinrecord.PurInRecordsExtend` (1) 
- `poDetailEntity` -> `pu.purchaseorder.PurchaseOrders` () 
- `reserveid` -> `st.reservation.Reservation` () 
- `activity` -> `pgrm.projecttask.ProjectScheduleTask` () 
- `productskun` -> `pc.product.ProductSKU` () 
- `stockStatusDoc` -> `st.stockStatusRecord.stockStatusRecord` () 
- `project` -> `bd.project.ProjectVO` () 
- `wbs` -> `BGDM.wbs.wbs_doc` () 
- `defines` -> `st.purinrecord.PurInRecordsDefine` (1) [废]
- `applyDept` -> `aa.baseorg.DeptMV` () 
- `priceUOM` -> `pc.unit.Unit` () 
- `goodsposition` -> `aa.goodsposition.GoodsPosition` () 
- `mainid` -> `st.purinrecord.PurInRecord` (1..n) 
- `tenant` -> `base.tenant.Tenant` () 
- `paymentExeDetails` -> `st.purinrecord.PaymentExeDetails` (0..n) 
- `product` -> `pc.aa.Product` () [废]
- `bodyItem` -> `st.purinrecord.PurInRecordsCustomItem` (1) [废]
- `expenseItems` -> `bd.expenseitem.ExpenseItem` () 
- `stockType` -> `st.stocktype.StockType` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `purInRecordsSNs` -> `st.purinrecord.PurInRecordsSN` (0..n) 
- `tradeRouteID` -> `sccs.multitrade.TradeRoute` () 
- `purInRecordsDefineCharacter` -> `st.purinrecord.PurInRecordsDefineCharacter` () 
- `purInRecordsCharacteristics` -> `st.purinrecord.PurInRecordsCharacteristics` () 
- `subWarehouse` -> `aa.warehouse.Warehouse` () 
- `unit` -> `pc.unit.Unit` () 
- `productsku` -> `pc.aa.ProductSKU` () [废]
- `productn` -> `pc.product.Product` () 
- `applyOperator` -> `bd.staff.Staff` () 
- `productAuth` -> `pb.dataauth.ProductDataAuth` () 
- `goodPriceQualityPlan` -> `aa.qualitypricescheme.QualitypriceScheme` () 
- `taxitems` -> `archive.taxArchives.TaxRateArchive` () 
- `stockUnitId` -> `pc.unit.Unit` () 
