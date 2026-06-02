---
tags: [BIP, 元数据, 数据字典, pu.purchaseorder.ArrivalPlan]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 到货计划子表 (`pu.purchaseorder.ArrivalPlan`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `st_arrival_plan` | 应用: `PU`

## 属性（105 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `arrivalPlanCharacteristics` | arrivalPlanCharacteristics | `arrivalPlanCharacteristics` | eb772290-e849-4fde-a96a-760641c8b75e | `FreeCT` |
| 2 | `arrivalPlanDefineCharacter` | arrivalPlanDefineCharacter | `arrivalPlanDefineCharacter` | 100f0c4c-21a9-4458-9c0d-e8aba1ba1fb3 | `UserDefine` |
| 3 | `confirmQty` | confirmQty | `confirm_qty` | Decimal | `number` |
| 4 | `confirmRecieveDate` | confirmRecieve日期 | `confirm_recievedate` | Date | `date` |
| 5 | `confirmStatus` | confirmStatus | `confirm_status` | ReasonsForRefusalEnum | `` |
| 6 | `confirmSubQty` | confirmSubQty | `confirm_subQty` | Decimal | `number` |
| 7 | `delplanId` | delplanID | `delplan_id` | Long | `long` |
| 8 | `productAuth` | productAuth | `iProductid` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 | `quote` |
| 9 | `productn` | productn | `iProductid` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 10 | `productskun` | productskun | `iProductSkuid` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `quote` |
| 11 | `erpArrivalPlanId` | erpArrivalPlanID | `erpArrivalPlanId` | String | `text` |
| 12 | `inspectPlanQty` | inspectPlanQty | `inspectPlanQty` | Decimal | `number` |
| 13 | `contact` | contact | `cContact` | String | `text` |
| 14 | `initiator` | initiator | `initiator` | String | `text` |
| 15 | `org` | org | `iOrgid` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 16 | `vendor` | vendor | `iVendorId` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 17 | `vendorcontact` | vendorcontact | `vendorcontactid` | b94fa77c-2f2b-464c-96fb-d028543825ee | `quote` |
| 18 | `delplanNo` | delplanNo | `delplan_no` | String | `text` |
| 19 | `isContract` | 是否Contract | `is_contract` | Boolean | `switch` |
| 20 | `orderCollaborationStatus` | orderCollaborationStatus | `orderCollaborationStatus` | PurOrderSplitEnum | `` |
| 21 | `refuseReason` | refuseReason | `refuse_reason` | String | `text` |
| 22 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 23 | `batchno` | batchno | `sBatchNo` | String | `text` |
| 24 | `free1` | free1 | `free1` | String | `text` |
| 25 | `free10` | free10 | `free10` | String | `text` |
| 26 | `free2` | free2 | `free2` | String | `text` |
| 27 | `free3` | free3 | `free3` | String | `text` |
| 28 | `free4` | free4 | `free4` | String | `text` |
| 29 | `free5` | free5 | `free5` | String | `text` |
| 30 | `free6` | free6 | `free6` | String | `text` |
| 31 | `free7` | free7 | `free7` | String | `text` |
| 32 | `free8` | free8 | `free8` | String | `text` |
| 33 | `free9` | free9 | `free9` | String | `text` |
| 34 | `goodsposition` | goodsposition | `iGoodsPositionId` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc | `quote` |
| 35 | `id` | ID | `id` | Long | `long` |
| 36 | `invExchRate` | invExchRate | `invExchRate` | Decimal | `number` |
| 37 | `invPriceExchRate` | invPriceExchRate | `invPriceExchRate` | Decimal | `number` |
| 38 | `invaliddate` | invaliddate | `dInvalidDate` | Date | `date` |
| 39 | `mainid` | mainid | `imainid` | 68e65921-f77c-4794-a820-768e10ec6d28 | `quote` |
| 40 | `memo` | 备注 | `cMemo` | String | `text` |
| 41 | `orderCode` | order编码 | `iorderCode` | String | `text` |
| 42 | `orderRowNO` | orderRowNO | `iOrderRowNO` | Integer | `int` |
| 43 | `priceQty` | priceQty | `priceQty` | Decimal | `number` |
| 44 | `priceUOM` | priceUOM | `oPriceUOM` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 45 | `producedate` | producedate | `dProduceDate` | Date | `date` |
| 46 | `product` | product | `iProductid` | 9a24ef07-e188-425b-b36a-402ddbf22073 | `quote` |
| 47 | `productsku` | productsku | `iProductSkuid` | 0d86941d-5af3-4cf4-9255-4f5c74a3476f | `quote` |
| 48 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 49 | `purOrderId` | purOrderID | `ipurOrderId` | ae75b080-0515-44b5-a9b3-d154d498325b | `quote` |
| 50 | `purUOM` | purUOM | `oPurUOM` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 51 | `qty` | qty | `qty` | Decimal | `number` |
| 52 | `recieveDate` | recieve日期 | `recieveDate` | Date | `date` |
| 53 | `rejectReplenishQty` | rejectReplenishQty | `rejectReplenishQty` | Decimal | `number` |
| 54 | `rowno` | rowno | `rowno` | Integer | `int` |
| 55 | `status` | 状态 | `status` | ArrivalPlanStatusTypeEnum | `` |
| 56 | `subQty` | subQty | `subQty` | Decimal | `number` |
| 57 | `tenant` | tenant | `tenant_id` | Long | `long` |
| 58 | `totalAcceptQty` | totalAcceptQty | `fTotalAcceptQty` | Decimal | `number` |
| 59 | `totalAcceptSubqty` | totalAcceptSubqty | `fTotalAcceptSubqty` | Decimal | `number` |
| 60 | `totalInQty` | totalInQty | `fTotalInQty` | Decimal | `number` |
| 61 | `totalInSubqty` | totalInSubqty | `fTotalInSubqty` | Decimal | `number` |
| 62 | `totalRecieveQty` | totalRecieveQty | `fTotalRecieveQty` | Decimal | `number` |
| 63 | `totalRecieveSubqty` | totalRecieveSubqty | `fTotalRecieveSubqty` | Decimal | `number` |
| 64 | `totalRejectQty` | totalRejectQty | `fTotalRejectQty` | Decimal | `number` |
| 65 | `totalRejectSubqty` | totalRejectSubqty | `fTotalRejectSubqty` | Decimal | `number` |
| 66 | `unit` | unit | `unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 67 | `unitExchangeType` | unitExchangeType | `unitExchangeType` | Integer | `int` |
| 68 | `unitExchangeTypePrice` | unitExchangeTypePrice | `unitExchangeTypePrice` | Integer | `int` |
| 69 | `warehouse` | warehouse | `iWarehouse` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |
| 70 | `bodyFreeItem` | bodyFreeItem | `` | c953a329-e4b8-479f-b23d-4e8ec509c439 | `` |
| 71 | `bodyItem` | bodyItem | `` | 0dd9ed50-6d40-4025-8e99-ed177a33abd7 | `` |
| 72 | `define1` | define1 | `define1` | String | `text` |
| 73 | `define10` | define10 | `define10` | String | `text` |
| 74 | `define11` | define11 | `define11` | String | `text` |
| 75 | `define12` | define12 | `define12` | String | `text` |
| 76 | `define13` | define13 | `define13` | String | `text` |
| 77 | `define14` | define14 | `define14` | String | `text` |
| 78 | `define15` | define15 | `define15` | String | `text` |
| 79 | `define16` | define16 | `define16` | String | `text` |
| 80 | `define17` | define17 | `define17` | String | `text` |
| 81 | `define18` | define18 | `define18` | String | `text` |
| 82 | `define19` | define19 | `define19` | String | `text` |
| 83 | `define2` | define2 | `define2` | String | `text` |
| 84 | `define20` | define20 | `define20` | String | `text` |
| 85 | `define21` | define21 | `define21` | String | `text` |
| 86 | `define22` | define22 | `define22` | String | `text` |
| 87 | `define23` | define23 | `define23` | String | `text` |
| 88 | `define24` | define24 | `define24` | String | `text` |
| 89 | `define25` | define25 | `define25` | String | `text` |
| 90 | `define26` | define26 | `define26` | String | `text` |
| 91 | `define27` | define27 | `define27` | String | `text` |
| 92 | `define28` | define28 | `define28` | String | `text` |
| 93 | `define29` | define29 | `define29` | String | `text` |
| 94 | `define3` | define3 | `define3` | String | `text` |
| 95 | `define30` | define30 | `define30` | String | `text` |
| 96 | `define4` | define4 | `define4` | String | `text` |
| 97 | `define5` | define5 | `define5` | String | `text` |
| 98 | `define6` | define6 | `define6` | String | `text` |
| 99 | `define7` | define7 | `define7` | String | `text` |
| 100 | `define8` | define8 | `define8` | String | `text` |
| 101 | `define9` | define9 | `define9` | String | `text` |
| 102 | `invExchRateDen` | invExchRateDen | `invexchrateden` | Decimal | `number` |
| 103 | `invExchRateNum` | invExchRateNum | `invexchratenum` | Decimal | `number` |
| 104 | `invPriceExchRateDen` | invPriceExchRateDen | `invpriceexchrateden` | Decimal | `number` |
| 105 | `invPriceExchRateNum` | invPriceExchRateNum | `invpriceexchratenum` | Decimal | `number` |

## 关联（20 个）

- `vendorcontact` -> `aa.vendor.VendorContacts` () 
- `product` -> `pc.aa.Product` () [废]
- `purUOM` -> `pc.unit.Unit` () 
- `bodyItem` -> `pu.purchaseorder.ArrivalPlanCustomItem` (1) [废]
- `org` -> `aa.baseorg.OrgMV` () 
- `productskun` -> `pc.product.ProductSKU` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `warehouse` -> `aa.warehouse.Warehouse` () 
- `purOrderId` -> `pu.purchaseorder.PurchaseOrder` () 
- `arrivalPlanDefineCharacter` -> `pu.purchaseorder.ArrivalPlanDefineCharacter` () 
- `unit` -> `pc.unit.Unit` () 
- `arrivalPlanCharacteristics` -> `pu.purchaseorder.ArrivalPlanCharacteristics` () 
- `priceUOM` -> `pc.unit.Unit` () 
- `productsku` -> `pc.aa.ProductSKU` () [废]
- `productn` -> `pc.product.Product` () 
- `vendor` -> `aa.vendor.Vendor` () 
- `bodyFreeItem` -> `pu.purchaseorder.ArrivalPlanFreeItem` (1) [废]
- `goodsposition` -> `aa.goodsposition.GoodsPosition` () 
- `productAuth` -> `pb.dataauth.ProductDataAuth` () 
- `mainid` -> `pu.purchaseorder.PurchaseOrders` (0..n) 
