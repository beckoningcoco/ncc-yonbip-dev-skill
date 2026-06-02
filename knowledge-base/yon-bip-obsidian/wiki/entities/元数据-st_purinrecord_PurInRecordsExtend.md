---
tags: [BIP, 元数据, 数据字典, 采购入库, ST, st.purinrecord.PurInRecordsExtend]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 采购入库单子表扩展 (`st.purinrecord.PurInRecordsExtend`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `st_purinrecords_extend` | 应用: `ST`

## 属性（33 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `despatchDetailId` | despatchDetailID | `despatchDetailId` | Long | `long` |
| 2 | `deliveryorderDetailId` | deliveryorderDetailID | `deliveryorderDetailId` | Long | `long` |
| 3 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 4 | `costCenter` | costCenter | `cost_center` | 872630ba-e8f4-4080-817d-8fc9a6958733 | `quote` |
| 5 | `subBusinessSourceNo` | subBusinessSourceNo | `subBusinessSourceNo` | String | `text` |
| 6 | `destroySimpleMagType` | destroySimpleMagType | `destroySimpleMagType` | String | `text` |
| 7 | `subBusinessSourceId` | subBusinessSourceID | `subBusinessSourceId` | Long | `long` |
| 8 | `subBusinessSourceLineNo` | subBusinessSourceLineNo | `subBusinessSourceLineNo` | Decimal | `number` |
| 9 | `consumerProfitCenter` | consumerProfitCenter | `consumer_profit_center` | e33ec72a-3857-4167-89e2-a437168ed3bb | `quote` |
| 10 | `subBusinessSourceType` | subBusinessSourceType | `subBusinessSourceType` | String | `text` |
| 11 | `providerProfitCenter` | providerProfitCenter | `provider_profit_center` | e33ec72a-3857-4167-89e2-a437168ed3bb | `quote` |
| 12 | `contractLot` | contractLot | `contract_lot` | String | `text` |
| 13 | `bankId` | bankID | `ibankId` | 4b6dcfa2-1d07-407d-a35a-9b219fadf37c | `quote` |
| 14 | `subBusinessSourceLineId` | subBusinessSourceLineID | `subBusinessSourceLineId` | Long | `long` |
| 15 | `deliveryLot` | deliveryLot | `delivery_lot` | String | `text` |
| 16 | `destroySimpleResult` | destroySimpleResult | `destroySimpleResult` | Boolean | `switch` |
| 17 | `id` | ID | `id` | da282394-f665-4148-b271-97b57607779a | `quote` |
| 18 | `deductedTonnageResultId` | deductedTonnageResultID | `deductedTonnageResultId` | Long | `long` |
| 19 | `emergencyReleaseApplyQty` | emergencyReleaseApplyQty | `emergency_release_apply_qty` | Decimal | `number` |
| 20 | `emergencyReleasePassQty` | emergencyReleasePassQty | `emergency_release_pass_qty` | Decimal | `number` |
| 21 | `inspection` | inspection | `inspection` | String | `text` |
| 22 | `manualAmount` | manualAmount | `manual_amount` | String | `text` |
| 23 | `ptoCostScrap` | ptoCostScrap | `ptoCostScrap` | Decimal | `number` |
| 24 | `ptoHierarchyType` | ptoHierarchyType | `ptoHierarchyType` | Integer | `int` |
| 25 | `ptoId` | ptoID | `ptoId` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 26 | `ptoPricingMethod` | ptoPricingMethod | `ptoPricingMethod` | Integer | `int` |
| 27 | `ptoQty` | ptoQty | `ptoQty` | Decimal | `number` |
| 28 | `ptoRowId` | ptoRowID | `ptoRowId` | Long | `long` |
| 29 | `ptoSonQty` | ptoSonQty | `ptoSonQty` | Decimal | `number` |
| 30 | `totalInspectionQty` | totalInspectionQty | `total_inspection_qty` | Decimal | `number` |
| 31 | `totalReqInspectionQty` | totalReqInspectionQty | `total_req_inspection_qty` | Decimal | `number` |
| 32 | `totalReturnInQty` | totalReturnInQty | `total_return_in_qty` | Decimal | `number` |
| 33 | `unqualifiedReturnQty` | unqualifiedReturnQty | `unqualified_return_qty` | Decimal | `number` |

## 关联（7 个）

- `providerProfitCenter` -> `bd.virtualaccbody.VirtualAccbody` () 
- `bankId` -> `aa.vendor.VendorBank` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `ptoId` -> `pc.product.Product` () 
- `costCenter` -> `bd.costcenter.CostCenter` () 
- `id` -> `st.purinrecord.PurInRecords` (1) 
- `consumerProfitCenter` -> `bd.virtualaccbody.VirtualAccbody` () 
