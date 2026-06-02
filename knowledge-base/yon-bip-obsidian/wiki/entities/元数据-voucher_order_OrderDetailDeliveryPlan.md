---
tags: [BIP, 元数据, 数据字典, voucher.order.OrderDetailDeliveryPlan]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 订单发货计划 (`voucher.order.OrderDetailDeliveryPlan`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `orderdetail_deliveryplan` | 应用: `SCMSA` | 类型: `Class`

## 属性（39 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |
| 2 | `uordercorp` | uordercorp | `iCorpId` | Long | `long` |
| 3 | `id` | ID | `id` | Long | `long` |
| 4 | `idKey` | idKey | `idKey` | String | `text` |
| 5 | `lineMark` | lineMark | `ilinemark` | Short | `short` |
| 6 | `sourceId` | sourceID | `isourceid` | Long | `long` |
| 7 | `confirmQty` | confirmQty | `fconfirmqty` | Decimal | `number` |
| 8 | `unConfirmQty` | unConfirmQty | `funconfirmqty` | Decimal | `number` |
| 9 | `promiseDate` | promiseDate | `promisedate` | Date | `date` |
| 10 | `deliveryPlanDefineCharacter` | deliveryPlanDefineCharacter | `deliveryplandefinecharacter` | bba0baf3-4111-4c4a-b553-84791d31ad28 | `UserDefine` |
| 11 | `ptoId` | ptoID | `ptoId` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 12 | `ptoQty` | ptoQty | `ptoQty` | Decimal | `number` |
| 13 | `ptoSonQty` | ptoSonQty | `ptoSonQty` | Decimal | `number` |
| 14 | `ptoCostScrap` | ptoCostScrap | `ptoCostScrap` | Decimal | `number` |
| 15 | `ptoRowId` | ptoRowID | `ptoRowId` | Long | `long` |
| 16 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 17 | `lineno` | lineno | `lineno` | Decimal | `number` |
| 18 | `orderId` | orderID | `iorderId` | Long | `long` |
| 19 | `orderDetailId` | orderDetailID | `iOrderDetailId` | 3722d563-08aa-453d-ac82-6b8cf906b1ab | `quote` |
| 20 | `pubts` | 时间戳 | `pubuts` | DateTime | `timestamp` |
| 21 | `hopeReceiveDate` | hopeReceiveDate | `dHopeReceiveDate` | Date | `date` |
| 22 | `consignTime` | consignTime | `dConsignTime` | Date | `date` |
| 23 | `wopStrateDate` | wopStrateDate | `wopStrateDate` | Date | `date` |
| 24 | `loadDate` | loadDate | `loadDate` | Date | `date` |
| 25 | `planTransCompleteDate` | planTransCompleteDate | `planTransCompleteDate` | Date | `date` |
| 26 | `planArrivalDate` | planArrivalDate | `planArrivalDate` | Date | `date` |
| 27 | `qty` | qty | `fMasterMeasureQuantity` | Decimal | `number` |
| 28 | `EstiDeliveryCreateDate` | EstiDeliveryCreateDate | `EstiDeliveryCreateDate` | Date | `date` |
| 29 | `subQty` | subQty | `iAuxUnitQuantity` | Decimal | `number` |
| 30 | `priceQty` | priceQty | `iQuantity` | Decimal | `number` |
| 31 | `stockId` | stockID | `iStockId` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |
| 32 | `sendQty` | sendQty | `fSendQty` | Decimal | `number` |
| 33 | `memo` | 备注 | `memo` | String | `text` |
| 34 | `ptoHierarchyType` | ptoHierarchyType | `ptoHierarchyType` | Integer | `int` |
| 35 | `ptoPricingMethod` | ptoPricingMethod | `ptoPricingMethod` | Integer | `int` |
| 36 | `totalOutStockConfirmQuantity` | totalOutStockConfirmQuantity | `ftotaloutstockconfirmquantity` | Decimal | `number` |
| 37 | `totalOutStockConfirmSubQty` | totalOutStockConfirmSubQty | `ftotaloutstockconfirmsubqty` | Decimal | `number` |
| 38 | `totalOutStockQuantity` | totalOutStockQuantity | `fOutBoundQty` | Decimal | `number` |
| 39 | `totalOutStockSubQty` | totalOutStockSubQty | `fTotalOutStockSubQty` | Decimal | `number` |

## 关联（5 个）

- `deliveryPlanDefineCharacter` -> `voucher.order.OrderDetailDeliveryPlanDefineCharacter` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `ptoId` -> `pc.product.Product` ()
- `stockId` -> `aa.warehouse.Warehouse` ()
- `orderDetailId` -> `voucher.order.OrderDetail` (0..n)
