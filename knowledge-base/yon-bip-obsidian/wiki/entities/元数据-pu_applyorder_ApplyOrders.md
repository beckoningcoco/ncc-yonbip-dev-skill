---
tags: [BIP, 元数据, 数据字典, pu.applyorder.ApplyOrders]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 请购单子表 (`pu.applyorder.ApplyOrders`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `pu_applyorders` | 应用: `PU`

## 属性（179 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `zhuanXunJiaLiang` | zhuanXunJiaLiang | `decimal_0` | Decimal | `number` |
| 2 | `shenYuLiang` | shenYuLiang | `decimal_1` | Decimal | `number` |
| 3 | `productn` | productn | `iProductid` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 4 | `productskun` | productskun | `iProductSkuid` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `quote` |
| 5 | `stockSensClue` | stockSensClue | `stockSensClue` | String | `text` |
| 6 | `expenseItemId` | expenseItemID | `expenseItemId` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 | `quote` |
| 7 | `applyOrdersDefineCharacter` | applyOrdersDefineCharacter | `applyOrdersDefineCharacter` | d0f6a763-d811-4fa0-b947-a1a255a9100b | `UserDefine` |
| 8 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 9 | `applyOrdersCharacteristics` | applyOrdersCharacteristics | `applyOrdersCharacteristics` | 736b06a2-5cfe-4ec9-9e38-d435622b3f34 | `FreeCT` |
| 10 | `batchno` | batchno | `sBatchNo` | String | `text` |
| 11 | `sendBackUserId` | sendBackUserID | `sendBackUserId` | String | `text` |
| 12 | `natCurrency` | natCurrency | `iNatCurrencyID` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 13 | `ycReqId` | ycReqID | `ycReqId` | String | `text` |
| 14 | `natSum` | natSum | `natSum` | Decimal | `number` |
| 15 | `mtoPolicy` | mtoPolicy | `mtoPolicy` | Boolean | `switch` |
| 16 | `exchRateOps` | exchRateOps | `exchRateOps` | ExchangeRateMethod | `` |
| 17 | `materialn` | materialn | `material` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 18 | `bomMaterialId` | bomMaterialID | `bom_material_id` | Long | `long` |
| 19 | `substituteFlag` | substituteFlag | `substitute_flag` | Short | `short` |
| 20 | `alternateMaterialId` | alternateMaterialID | `alternate_material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 21 | `productAuth` | productAuth | `iProductid` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 | `quote` |
| 22 | `productPuType` | productPuType | `productPuType` | String | `text` |
| 23 | `accShopOrderQty` | accShopOrderQty | `accShopOrderQty` | Decimal | `number` |
| 24 | `rowCloseReason` | rowCloseReason | `row_close_reason` | String | `text` |
| 25 | `demandOrg` | demandOrg | `demandOrg` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 26 | `ycCooperateResult` | ycCooperateResult | `yc_cooperate_result` | String | `text` |
| 27 | `businessType` | businessType | `business_type` | String | `text` |
| 28 | `wbs` | wbs | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 | `quote` |
| 29 | `activity` | activity | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 | `quote` |
| 30 | `exchRateType` | exchRateType | `iExchRateType` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |
| 31 | `sendBackUserName` | sendBackUser名称 | `sendBackUserName` | String | `text` |
| 32 | `exchRateDate` | exchRate日期 | `exchRateDate` | Date | `date` |
| 33 | `YCCollaborationStatus` | YCCollaborationStatus | `YCCollaborationStatus` | String | `text` |
| 34 | `out_sys_rowno` | out_sys_rowno | `out_sys_rowno` | String | `text` |
| 35 | `natMoney` | natMoney | `natMoney` | Decimal | `number` |
| 36 | `natTax` | natTax | `natTax` | Decimal | `number` |
| 37 | `natUnitPrice` | natUnitPrice | `natUnitPrice` | Decimal | `number` |
| 38 | `exchRate` | exchRate | `exchRate` | Decimal | `number` |
| 39 | `out_sys_lineid` | out_sys_lineid | `out_sys_lineid` | String | `text` |
| 40 | `material` | material | `material` | 9a24ef07-e188-425b-b36a-402ddbf22073 | `quote` |
| 41 | `sendBackDateTime` | sendBackDateTime | `sendBackDateTime` | Date | `date` |
| 42 | `natTaxUnitPrice` | natTaxUnitPrice | `natTaxUnitPrice` | Decimal | `number` |
| 43 | `goodsposition` | goodsposition | `iGoodsPositionId` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc | `quote` |
| 44 | `groupTaskKey` | groupTaskKey | `groupTaskKey` | String | `text` |
| 45 | `invaliddate` | invaliddate | `dInvalidDate` | Date | `date` |
| 46 | `producedate` | producedate | `dProduceDate` | Date | `date` |
| 47 | `sourceMainPubts` | sourceMainPubts | `sourceMainPubts` | DateTime | `timestamp` |
| 48 | `id` | ID | `id` | Long | `long` |
| 49 | `mainid` | mainid | `iMainId` | 787f2d17-c268-4362-994e-facbc5c489a5 | `quote` |
| 50 | `receiveOrg` | receiveOrg | `iReceiveOrgId` | c1135e08-c4bf-4499-90bf-67030d1f2654 | `quote` |
| 51 | `purchaseOrg` | purchaseOrg | `iPurchaseOrgId` | 528ae807-a9d3-4f2a-9ee7-1db3e5eddc01 | `quote` |
| 52 | `warehouseId` | warehouseID | `warehouseId` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |
| 53 | `correspondingOrg` | correspondingOrg | `correspondingOrg` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |
| 54 | `sourceid` | sourceid | `sourceid` | Long | `long` |
| 55 | `productDesc` | productDesc | `productDesc` | String | `text` |
| 56 | `sourceProDescFlag` | sourceProDescFlag | `sourceProDescFlag` | String | `text` |
| 57 | `proDescFlag` | proDescFlag | `proDescFlag` | String | `text` |
| 58 | `unit` | unit | `iUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 59 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 60 | `adviseSupplier` | adviseSupplier | `adviseVendor` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 61 | `vendor` | vendor | `iVendorId` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 62 | `qty` | qty | `qty` | Decimal | `number` |
| 63 | `approvedQuantity` | approvedQuantity | `approvedQuantity` | Decimal | `number` |
| 64 | `totalAgreementQty` | totalAgreementQty | `fTotalAgreementQty` | Decimal | `number` |
| 65 | `invExchRate` | invExchRate | `invExchRate` | Decimal | `number` |
| 66 | `subQty` | subQty | `subQty` | Decimal | `number` |
| 67 | `requirementDate` | requirement日期 | `requirementDate` | Date | `date` |
| 68 | `adviseOrderDate` | adviseOrder日期 | `adviseOrderDate` | Date | `date` |
| 69 | `purDept` | purDept | `iPurDept` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 70 | `purPerson` | purPerson | `iPurPerson` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 71 | `makeRuleCode` | makeRule编码 | `makerule_code` | String | `text` |
| 72 | `sourceautoid` | sourceautoid | `sourceautoid` | Long | `long` |
| 73 | `memo` | 备注 | `cMemo` | String | `text` |
| 74 | `product` | product | `iProductid` | 9a24ef07-e188-425b-b36a-402ddbf22073 | `quote` |
| 75 | `productsku` | productsku | `iProductSkuid` | 0d86941d-5af3-4cf4-9255-4f5c74a3476f | `quote` |
| 76 | `materialId` | materialID | `material_id` | Long | `long` |
| 77 | `rowno` | rowno | `rowno` | Integer | `int` |
| 78 | `lineno` | lineno | `lineno` | Decimal | `number` |
| 79 | `sourceUpLineno` | sourceUpLineno | `sourceUpLineno` | Decimal | `number` |
| 80 | `purQty` | purQty | `fPurQty` | Decimal | `number` |
| 81 | `upLineno` | upLineno | `upLineno` | Decimal | `number` |
| 82 | `approveNum` | approveNum | `dapprovenum` | Decimal | `number` |
| 83 | `supplyCount` | supplyCount | `iSupplyCount` | Decimal | `number` |
| 84 | `supplyMoney` | supplyMoney | `iSupplyMoney` | Decimal | `number` |
| 85 | `orderMoneyRatio` | orderMoneyRatio | `orderMoneyRatio` | Decimal | `number` |
| 86 | `priceQty` | priceQty | `priceQty` | Decimal | `number` |
| 87 | `priceUOM` | priceUOM | `oPriceUOM` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 88 | `unitExchangeTypePrice` | unitExchangeTypePrice | `unitExchangeTypePrice` | Integer | `int` |
| 89 | `invPriceExchRate` | invPriceExchRate | `invPriceExchRate` | Decimal | `number` |
| 90 | `currency` | currency | `iCurrencyID` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 91 | `taxitems` | taxitems | `iTaxItems` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |
| 92 | `oriTaxUnitPrice` | oriTaxUnitPrice | `oriTaxUnitPrice` | Decimal | `number` |
| 93 | `oriSum` | oriSum | `oriSum` | Decimal | `number` |
| 94 | `oriUnitPrice` | oriUnitPrice | `oriUnitPrice` | Decimal | `number` |
| 95 | `oriMoney` | oriMoney | `oriMoney` | Decimal | `number` |
| 96 | `taxRate` | taxRate | `taxRate` | Decimal | `number` |
| 97 | `oriTax` | oriTax | `oriTax` | Decimal | `number` |
| 98 | `discountTaxType` | discountTaxType | `discountTaxType` | DiscountTaxTypeEnum | `` |
| 99 | `free1` | free1 | `free1` | String | `text` |
| 100 | `free2` | free2 | `free2` | String | `text` |
| 101 | `free3` | free3 | `free3` | String | `text` |
| 102 | `free4` | free4 | `free4` | String | `text` |
| 103 | `free5` | free5 | `free5` | String | `text` |
| 104 | `priceMark` | priceMark | `price_mark` | Integer | `int` |
| 105 | `free6` | free6 | `free6` | String | `text` |
| 106 | `free7` | free7 | `free7` | String | `text` |
| 107 | `priceSource` | priceSource | `priceSource` | String | `text` |
| 108 | `free8` | free8 | `free8` | String | `text` |
| 109 | `free9` | free9 | `free9` | String | `text` |
| 110 | `free10` | free10 | `free10` | String | `text` |
| 111 | `isPostDemand` | 是否PostDemand | `isPostDemand` | Boolean | `switch` |
| 112 | `sendBackCause` | sendBackCause | `sendBackCause` | String | `text` |
| 113 | `purUOM` | purUOM | `oPurUOM` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 114 | `project` | project | `project` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |
| 115 | `trackNo` | trackNo | `trackNo` | Long | `long` |
| 116 | `reserveid` | reserveid | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 | `quote` |
| 117 | `linecloser` | linecloser | `linecloser` | String | `text` |
| 118 | `linecloseTime` | linecloseTime | `lineclose_time` | DateTime | `timestamp` |
| 119 | `unitExchangeType` | unitExchangeType | `unitExchangeType` | Integer | `int` |
| 120 | `upcode` | upcode | `upcode` | String | `text` |
| 121 | `source` | source | `source` | String | `text` |
| 122 | `agentId` | agentID | `iAgentId` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 123 | `demandDep` | demandDep | `iDemandDept` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 124 | `firstupcode` | firstupcode | `firstupcode` | String | `text` |
| 125 | `firstsourceautoid` | firstsourceautoid | `firstsourceautoid` | Long | `long` |
| 126 | `receiver` | receiver | `iReceiver` | String | `text` |
| 127 | `firstsourceid` | firstsourceid | `firstsourceid` | Long | `long` |
| 128 | `receiveTelePhone` | receiveTelePhone | `iReceiveTelePhone` | String | `text` |
| 129 | `firstsource` | firstsource | `firstsource` | String | `text` |
| 130 | `receiveAddress` | receiveAddress | `iReceiveAddress` | String | `text` |
| 131 | `costCenter` | costCenter | `cost_center` | 872630ba-e8f4-4080-817d-8fc9a6958733 | `quote` |
| 132 | `providerProfitCenter` | providerProfitCenter | `provider_profit_center` | e33ec72a-3857-4167-89e2-a437168ed3bb | `quote` |
| 133 | `consumerProfitCenter` | consumerProfitCenter | `consumer_profit_center` | e33ec72a-3857-4167-89e2-a437168ed3bb | `quote` |
| 134 | `fileId` | fileID | `fileId` | String | `text` |
| 135 | `applyOrderSun` | applyOrderSun | `` | d1d16977-0248-4731-b084-a8bc57863b55 | `` |
| 136 | `bodyFreeItem` | bodyFreeItem | `` | ed728595-0eba-49f1-bdef-a5d9c57cd484 | `` |
| 137 | `bodyItem` | bodyItem | `` | 4ee62bb6-cb13-41f5-a70f-bc48551fb527 | `` |
| 138 | `define1` | define1 | `define1` | String | `text` |
| 139 | `define10` | define10 | `define10` | String | `text` |
| 140 | `define11` | define11 | `define11` | String | `text` |
| 141 | `define12` | define12 | `define12` | String | `text` |
| 142 | `define13` | define13 | `define13` | String | `text` |
| 143 | `define14` | define14 | `define14` | String | `text` |
| 144 | `define15` | define15 | `define15` | String | `text` |
| 145 | `define16` | define16 | `define16` | String | `text` |
| 146 | `define17` | define17 | `define17` | String | `text` |
| 147 | `define18` | define18 | `define18` | String | `text` |
| 148 | `define19` | define19 | `define19` | String | `text` |
| 149 | `define2` | define2 | `define2` | String | `text` |
| 150 | `define20` | define20 | `define20` | String | `text` |
| 151 | `define21` | define21 | `define21` | String | `text` |
| 152 | `define22` | define22 | `define22` | String | `text` |
| 153 | `define23` | define23 | `define23` | String | `text` |
| 154 | `define24` | define24 | `define24` | String | `text` |
| 155 | `define25` | define25 | `define25` | String | `text` |
| 156 | `define26` | define26 | `define26` | String | `text` |
| 157 | `define27` | define27 | `define27` | String | `text` |
| 158 | `define28` | define28 | `define28` | String | `text` |
| 159 | `define29` | define29 | `define29` | String | `text` |
| 160 | `define3` | define3 | `define3` | String | `text` |
| 161 | `define30` | define30 | `define30` | String | `text` |
| 162 | `define4` | define4 | `define4` | String | `text` |
| 163 | `define5` | define5 | `define5` | String | `text` |
| 164 | `define6` | define6 | `define6` | String | `text` |
| 165 | `define7` | define7 | `define7` | String | `text` |
| 166 | `define8` | define8 | `define8` | String | `text` |
| 167 | `define9` | define9 | `define9` | String | `text` |
| 168 | `invExchRateDen` | invExchRateDen | `invexchrateden` | Decimal | `number` |
| 169 | `invExchRateNum` | invExchRateNum | `invexchratenum` | Decimal | `number` |
| 170 | `invPriceExchRateDen` | invPriceExchRateDen | `invpriceexchrateden` | Decimal | `number` |
| 171 | `invPriceExchRateNum` | invPriceExchRateNum | `invpriceexchratenum` | Decimal | `number` |
| 172 | `materialQty` | materialQty | `material_qty` | Decimal | `number` |
| 173 | `ptoCostScrap` | ptoCostScrap | `ptoCostScrap` | Decimal | `number` |
| 174 | `ptoHierarchyType` | ptoHierarchyType | `ptoHierarchyType` | Integer | `int` |
| 175 | `ptoId` | ptoID | `ptoId` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 176 | `ptoPricingMethod` | ptoPricingMethod | `ptoPricingMethod` | Integer | `int` |
| 177 | `ptoQty` | ptoQty | `ptoQty` | Decimal | `number` |
| 178 | `ptoRowId` | ptoRowID | `ptoRowId` | Long | `long` |
| 179 | `ptoSonQty` | ptoSonQty | `ptoSonQty` | Decimal | `number` |

## 关联（43 个）

- `applyOrdersCharacteristics` -> `pu.applyorder.ApplyOrdersCharacteristics` () 
- `applyOrderSun` -> `pu.applyorder.ApplyOrderSun` (0..n) 
- `expenseItemId` -> `bd.expenseitem.ExpenseItem` () 
- `agentId` -> `aa.merchant.Merchant` () 
- `purUOM` -> `pc.unit.Unit` () 
- `reserveid` -> `st.reservation.Reservation` () 
- `activity` -> `pgrm.projecttask.ProjectScheduleTask` () 
- `demandOrg` -> `aa.baseorg.OrgMV` () 
- `productskun` -> `pc.product.ProductSKU` () 
- `ptoId` -> `pc.product.Product` () 
- `project` -> `bd.project.ProjectVO` () 
- `wbs` -> `BGDM.wbs.wbs_doc` () 
- `adviseSupplier` -> `aa.vendor.Vendor` () 
- `providerProfitCenter` -> `bd.virtualaccbody.VirtualAccbody` () 
- `priceUOM` -> `pc.unit.Unit` () 
- `natCurrency` -> `bd.currencytenant.CurrencyTenantVO` () 
- `correspondingOrg` -> `bd.adminOrg.BaseOrgVO` () 
- `vendor` -> `aa.vendor.Vendor` () 
- `goodsposition` -> `aa.goodsposition.GoodsPosition` () 
- `currency` -> `bd.currencytenant.CurrencyTenantVO` () 
- `mainid` -> `pu.applyorder.ApplyOrder` (1..n) 
- `alternateMaterialId` -> `pc.product.Product` () 
- `purchaseOrg` -> `aa.baseorg.PurchaseOrgMV` () 
- `demandDep` -> `bd.adminOrg.AdminOrgVO` () 
- `product` -> `pc.aa.Product` () [废]
- `bodyItem` -> `pu.applyorder.ApplyOrdersCustomItem` (1) [废]
- `applyOrdersDefineCharacter` -> `pu.applyorder.NApplyOrdersDefineCharacter` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `costCenter` -> `bd.costcenter.CostCenter` () 
- `purPerson` -> `bd.staff.Staff` () 
- `consumerProfitCenter` -> `bd.virtualaccbody.VirtualAccbody` () 
- `unit` -> `pc.unit.Unit` () 
- `productsku` -> `pc.aa.ProductSKU` () [废]
- `material` -> `pc.aa.Product` () [废]
- `productn` -> `pc.product.Product` () 
- `purDept` -> `bd.adminOrg.AdminOrgVO` () 
- `warehouseId` -> `aa.warehouse.Warehouse` () 
- `exchRateType` -> `bd.exchangeRate.ExchangeRateTypeVO` () 
- `bodyFreeItem` -> `pu.applyorder.ApplyOrdersFreeItem` (1) [废]
- `productAuth` -> `pb.dataauth.ProductDataAuth` () 
- `receiveOrg` -> `aa.baseorg.InventoryOrgMV` () 
- `taxitems` -> `archive.taxArchives.TaxRateArchive` () 
- `materialn` -> `pc.product.Product` () 
