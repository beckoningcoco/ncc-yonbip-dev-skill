---
tags: [BIP, 元数据, 数据字典, 其他入库, ST, st.othinrecord.OthInRecords]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
parent_entity: st.othinrecord.OthInRecord
---
# 其他入库单子表 (`st.othinrecord.OthInRecords`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `st_othinrecords` | 应用: `ST`

## 属性（138 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `stockSensClue` | stockSensClue | `stockSensClue` | String | `text` |
| 2 | `othInRecordsDefineCharacter` | othInRecordsDefineCharacter | `othInRecordsDefineCharacter` | e12f3801-83b8-41f6-a193-9108635738d0 | `UserDefine` |
| 3 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 4 | `firstuplineno` | firstuplineno | `firstuplineno` | Decimal | `number` |
| 5 | `groupTaskKey` | groupTaskKey | `groupTaskKey` | String | `text` |
| 6 | `lineno` | lineno | `lineno` | Decimal | `number` |
| 7 | `othInRecordsCharacteristics` | othInRecordsCharacteristics | `othInRecordsCharacteristics` | 99a899ab-3a77-4554-bd8d-c641edd23461 | `FreeCT` |
| 8 | `ownertype` | ownertype | `ownertype` | Integer | `int` |
| 9 | `project_code` | project_code | `cProjectCode` | String | `text` |
| 10 | `productn` | productn | `iProductid` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 11 | `custodian` | custodian | `custodianid` | 0578a613-7f7f-4bec-b589-039035ca3f8a | `quote` |
| 12 | `custodianType` | custodianType | `custodian_type` | String | `text` |
| 13 | `writeOffUpcode` | writeOffUpcode | `write_off_upcode` | String | `text` |
| 14 | `writeOffSourceid` | writeOffSourceid | `write_off_sourceid` | Long | `long` |
| 15 | `writeOffSourceautoid` | writeOffSourceautoid | `write_off_sourceautoid` | Long | `long` |
| 16 | `writeOffUplineno` | writeOffUplineno | `write_off_uplineno` | Decimal | `number` |
| 17 | `expenseNatSum` | expenseNatSum | `expenseNatSum` | Decimal | `number` |
| 18 | `expenseNatMoney` | expenseNatMoney | `expenseNatMoney` | Decimal | `number` |
| 19 | `sfee` | sfee | `fsfee` | Decimal | `number` |
| 20 | `productAuth` | productAuth | `iProductid` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 | `quote` |
| 21 | `productskun` | productskun | `iProductSkuid` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `quote` |
| 22 | `mtoSalesOrderCode` | mtoSalesOrder编码 | `mtoSalesOrderCode` | String | `text` |
| 23 | `mtoSalesOrderId` | mtoSalesOrderID | `mtoSalesOrderId` | Long | `long` |
| 24 | `mtoSalesOrderLineId` | mtoSalesOrderLineID | `mtoSalesOrderLineId` | Long | `long` |
| 25 | `mtoSalesOrderLineNo` | mtoSalesOrderLineNo | `mtoSalesOrderLineNo` | Decimal | `number` |
| 26 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 27 | `wbs` | wbs | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 | `quote` |
| 28 | `activity` | activity | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 | `quote` |
| 29 | `out_sys_rowno` | out_sys_rowno | `out_sys_rowno` | String | `text` |
| 30 | `out_sys_lineid` | out_sys_lineid | `out_sys_lineid` | String | `text` |
| 31 | `propertyRightsTransferred` | propertyRightsTransferred | `propertyRightsTransferred` | Boolean | `switch` |
| 32 | `returnDate` | return日期 | `return_date` | Date | `date` |
| 33 | `sourceMainPubts` | sourceMainPubts | `sourceMainPubts` | DateTime | `timestamp` |
| 34 | `sourceOrderlineno` | sourceOrderlineno | `sourceOrderlineno` | Decimal | `number` |
| 35 | `uplineno` | uplineno | `uplineno` | Decimal | `number` |
| 36 | `id` | ID | `id` | Long | `long` |
| 37 | `mainid` | mainid | `iMainId` | 7e2e8c06-07d7-41a2-8b9f-a7e7add74c76 | `quote` |
| 38 | `rowno` | rowno | `rowno` | Integer | `int` |
| 39 | `isScrap` | 是否Scrap | `isScrap` | Boolean | `switch` |
| 40 | `product` | product | `iProductid` | 9a24ef07-e188-425b-b36a-402ddbf22073 | `quote` |
| 41 | `isUpdateCost` | 是否UpdateCost | `isUpdateCost` | Boolean | `switch` |
| 42 | `assetsStatus` | assetsStatus | `assets_status` | String | `text` |
| 43 | `inventoryowner` | inventoryowner | `inventoryowner` | af1b583d-f5e4-4f7c-bba5-66d570ef7e3e | `quote` |
| 44 | `free1` | free1 | `free1` | String | `text` |
| 45 | `free2` | free2 | `free2` | String | `text` |
| 46 | `free3` | free3 | `free3` | String | `text` |
| 47 | `free4` | free4 | `free4` | String | `text` |
| 48 | `free5` | free5 | `free5` | String | `text` |
| 49 | `free6` | free6 | `free6` | String | `text` |
| 50 | `free7` | free7 | `free7` | String | `text` |
| 51 | `free8` | free8 | `free8` | String | `text` |
| 52 | `free9` | free9 | `free9` | String | `text` |
| 53 | `free10` | free10 | `free10` | String | `text` |
| 54 | `stockStatusDoc` | stockStatusDoc | `stockStatusDoc` | 5275f074-3e60-4b90-9771-20970f1e905c | `quote` |
| 55 | `goodsposition` | goodsposition | `iGoodsPositionId` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc | `quote` |
| 56 | `reserveid` | reserveid | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 | `quote` |
| 57 | `proratadistribution` | proratadistribution | `proratadistribution` | Decimal | `number` |
| 58 | `assetsCode` | assets编码 | `assets_code` | String | `text` |
| 59 | `batchno` | batchno | `sBatchNo` | String | `text` |
| 60 | `producedate` | producedate | `dProduceDate` | Date | `date` |
| 61 | `invaliddate` | invaliddate | `dInvalidDate` | Date | `date` |
| 62 | `contactsQuantity` | contactsQuantity | `contacts_quantity` | Decimal | `number` |
| 63 | `contactsPieces` | contactsPieces | `contacts_pieces` | Decimal | `number` |
| 64 | `qty` | qty | `qty` | Decimal | `number` |
| 65 | `unit` | unit | `iUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 66 | `subQty` | subQty | `subQty` | Decimal | `number` |
| 67 | `invExchRate` | invExchRate | `invExchRate` | Decimal | `number` |
| 68 | `stockUnitId` | stockUnitID | `stock_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 69 | `recorddate` | recorddate | `dRecordDate` | Date | `date` |
| 70 | `natUnitPrice` | natUnitPrice | `natUnitPrice` | Decimal | `number` |
| 71 | `natMoney` | natMoney | `natMoney` | Decimal | `number` |
| 72 | `costMoney` | costMoney | `cost_money` | Decimal | `number` |
| 73 | `costUnitPrice` | costUnitPrice | `cost_unit_price` | Decimal | `number` |
| 74 | `natTaxUnitPrice` | natTaxUnitPrice | `natTaxUnitPrice` | Decimal | `number` |
| 75 | `natSum` | natSum | `natSum` | Decimal | `number` |
| 76 | `natTax` | natTax | `natTax` | Decimal | `number` |
| 77 | `oriUnitPrice` | oriUnitPrice | `oriUnitPrice` | Decimal | `number` |
| 78 | `oriTaxUnitPrice` | oriTaxUnitPrice | `oriTaxUnitPrice` | Decimal | `number` |
| 79 | `oriMoney` | oriMoney | `oriMoney` | Decimal | `number` |
| 80 | `productsku` | productsku | `iProductSkuid` | 0d86941d-5af3-4cf4-9255-4f5c74a3476f | `quote` |
| 81 | `oriSum` | oriSum | `oriSum` | Decimal | `number` |
| 82 | `oriTax` | oriTax | `oriTax` | Decimal | `number` |
| 83 | `taxRate` | 税率 | `taxRate` | Decimal | `number` |
| 84 | `group_number` | group_number | `group_number` | Integer | `int` |
| 85 | `project` | project | `iProject` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |
| 86 | `sourceid` | sourceid | `sourceid` | Long | `long` |
| 87 | `sourceautoid` | sourceautoid | `sourceautoid` | Long | `long` |
| 88 | `source` | source | `source` | String | `text` |
| 89 | `upcode` | upcode | `upcode` | String | `text` |
| 90 | `makeRuleCode` | makeRule编码 | `makerule_code` | String | `text` |
| 91 | `memo` | 备注 | `cMemo` | String | `text` |
| 92 | `unitExchangeType` | unitExchangeType | `unitExchangeType` | Integer | `int` |
| 93 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 94 | `autoCalcCost` | autoCalcCost | `autoCalcCost` | Boolean | `switch` |
| 95 | `firstupcode` | firstupcode | `firstupcode` | String | `text` |
| 96 | `firstsource` | firstsource | `firstsource` | String | `text` |
| 97 | `firstsourceautoid` | firstsourceautoid | `firstsourceautoid` | Long | `long` |
| 98 | `firstsourceid` | firstsourceid | `firstsourceid` | Long | `long` |
| 99 | `stockType` | stockType | `stockType` | de7a641c-45f2-4b85-8424-2ed8acf02456 | `quote` |
| 100 | `retailUnitPrice` | retailUnitPrice | `retailUnitPrice` | Decimal | `number` |
| 101 | `retailMoney` | retailMoney | `retailMoney` | Decimal | `number` |
| 102 | `bodyItem` | bodyItem | `` | 3ded3713-153c-4a39-b96f-7120c48b2808 | `` |
| 103 | `bodyParallel` | bodyParallel | `` | 9148eb8f-1d06-4c54-bc36-5faae209a627 | `` |
| 104 | `define1` | define1 | `define1` | String | `text` |
| 105 | `define10` | define10 | `define10` | String | `text` |
| 106 | `define11` | define11 | `define11` | String | `text` |
| 107 | `define12` | define12 | `define12` | String | `text` |
| 108 | `define13` | define13 | `define13` | String | `text` |
| 109 | `define14` | define14 | `define14` | String | `text` |
| 110 | `define15` | define15 | `define15` | String | `text` |
| 111 | `define16` | define16 | `define16` | String | `text` |
| 112 | `define17` | define17 | `define17` | String | `text` |
| 113 | `define18` | define18 | `define18` | String | `text` |
| 114 | `define19` | define19 | `define19` | String | `text` |
| 115 | `define2` | define2 | `define2` | String | `text` |
| 116 | `define20` | define20 | `define20` | String | `text` |
| 117 | `define21` | define21 | `define21` | String | `text` |
| 118 | `define22` | define22 | `define22` | String | `text` |
| 119 | `define23` | define23 | `define23` | String | `text` |
| 120 | `define24` | define24 | `define24` | String | `text` |
| 121 | `define25` | define25 | `define25` | String | `text` |
| 122 | `define26` | define26 | `define26` | String | `text` |
| 123 | `define27` | define27 | `define27` | String | `text` |
| 124 | `define28` | define28 | `define28` | String | `text` |
| 125 | `define29` | define29 | `define29` | String | `text` |
| 126 | `define3` | define3 | `define3` | String | `text` |
| 127 | `define30` | define30 | `define30` | String | `text` |
| 128 | `define4` | define4 | `define4` | String | `text` |
| 129 | `define5` | define5 | `define5` | String | `text` |
| 130 | `define6` | define6 | `define6` | String | `text` |
| 131 | `define7` | define7 | `define7` | String | `text` |
| 132 | `define8` | define8 | `define8` | String | `text` |
| 133 | `define9` | define9 | `define9` | String | `text` |
| 134 | `defines` | defines | `` | 24db2295-a017-44ff-9289-4710ec83afb0 | `` |
| 135 | `invExchRateDen` | invExchRateDen | `invexchrateden` | Decimal | `number` |
| 136 | `invExchRateNum` | invExchRateNum | `invexchratenum` | Decimal | `number` |
| 137 | `othInRecordsSNs` | othInRecordsSNs | `` | 6e47a3e0-11b5-40bb-9e60-695197abcfb1 | `` |
| 138 | `writeOffQtyTotal` | writeOffQtyTotal | `write_off_qty_total` | Decimal | `number` |

## 关联（25 个）

- `reserveid` -> `st.reservation.Reservation` () 
- `activity` -> `pgrm.projecttask.ProjectScheduleTask` () 
- `productskun` -> `pc.product.ProductSKU` () 
- `stockStatusDoc` -> `st.stockStatusRecord.stockStatusRecord` () 
- `project` -> `bd.project.ProjectVO` () 
- `wbs` -> `BGDM.wbs.wbs_doc` () 
- `othInRecordsSNs` -> `st.othinrecord.OthInRecordsSN` (0..n) 
- `defines` -> `st.othinrecord.OthInRecordsDefine` (1) [废]
- `othInRecordsDefineCharacter` -> `st.othinrecord.OthInRecordsDefineCharacter` () 
- `goodsposition` -> `aa.goodsposition.GoodsPosition` () 
- `mainid` -> `st.othinrecord.OthInRecord` (1..n) 
- `tenant` -> `base.tenant.Tenant` () 
- `product` -> `pc.aa.Product` () [废]
- `bodyItem` -> `st.othinrecord.OthInRecordsCustomItem` (1) [废]
- `custodian` -> `st.custodian.Custodian` () 
- `stockType` -> `st.stocktype.StockType` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `bodyParallel` -> `st.othinrecord.OthInRecordsParallel` (1) 
- `unit` -> `pc.unit.Unit` () 
- `productsku` -> `pc.aa.ProductSKU` () [废]
- `productn` -> `pc.product.Product` () 
- `othInRecordsCharacteristics` -> `st.othinrecord.OthInRecordsCharacteristics` () 
- `productAuth` -> `pb.dataauth.ProductDataAuth` () 
- `inventoryowner` -> `st.inventoryowner.InventoryOwner` () 
- `stockUnitId` -> `pc.unit.Unit` () 
