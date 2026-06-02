---
tags: [BIP, 元数据, 数据字典, pgrm.projecttask.ProjectTaskMaterial]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 项目活动物资清单 (`pgrm.projecttask.ProjectTaskMaterial`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `prpr_material_b` | 应用: `PGRM` | 类型: `Class`

## 属性（74 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `agentId` | agentID | `agent_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 2 | `applyOrderFlag` | applyOrderFlag | `apply_order_flag` | xmyYesNo | `singleOption` |
| 3 | `applyedQty` | applyedQty | `applyed_qty` | Decimal | `number` |
| 4 | `auxiliaryUnitId` | auxiliaryUnitID | `auxiliary_unit_id` | String | `text` |
| 5 | `closedPurchaseTaskQty` | closedPurchaseTaskQty | `closed_purchase_task_qty` | Decimal | `number` |
| 6 | `completeQty` | completeQty | `complete_qty` | Decimal | `number` |
| 7 | `conversionRate` | conversionRate | `conversion_rate` | String | `text` |
| 8 | `cqtUnitId` | cqtUnitID | `cqt_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 9 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 10 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 11 | `defineCharacteristic` | defineCharacteristic | `define_characteristic` | 16fef424-0dd4-4ae4-8845-cf69732a1ab2 | `UserDefine` |
| 12 | `defineCharacteristics` | defineCharacteristics | `define_characteristics` | aff289c1-c874-42a8-af9f-f34cde718c16 | `FreeCT` |
| 13 | `demandTime` | demandTime | `demand_time` | String | `date` |
| 14 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 15 | `edirection` | edirection | `edirection` | pmDirectionEnum | `singleOption` |
| 16 | `effectFlag` | effectFlag | `effect_flag` | xmyYesNo | `singleOption` |
| 17 | `id` | ID | `id` | String | `text` |
| 18 | `inventoryOrg` | inventoryOrg | `inventory_org` | e18e914b-4518-4e8c-ac21-783145fe7da1 | `quote` |
| 19 | `latestVersion` | latestVersion | `latest_version` | xmyYesNo | `singleOption` |
| 20 | `materialDesc` | materialDesc | `material_desc` | String | `text` |
| 21 | `materialSourceId` | materialSourceID | `material_source_id` | String | `text` |
| 22 | `memo` | 备注 | `memo` | String | `text` |
| 23 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 24 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 25 | `mrpDemandFlag` | mrpDemandFlag | `mrp_demand_flag` | aa_boolean | `singleOption` |
| 26 | `oid` | oid | `oid` | String | `text` |
| 27 | `orgId` | 组织ID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 28 | `prjSaleItemId` | prjSaleItemID | `prj_sale_item_id` | String | `text` |
| 29 | `productId` | productID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 30 | `productionOrderFlag` | productionOrderFlag | `production_order_flag` | xmyYesNo | `singleOption` |
| 31 | `projectMaterialListId` | projectMaterialListID | `project_material_list_id` | 36541413-04c3-48bd-add3-4e382ae3904b | `quote` |
| 32 | `projectScheduleTaskId` | projectScheduleTaskID | `activity_id` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 | `quote` |
| 33 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 34 | `purchaseContractId` | purchaseContractID | `purchaset_contract_id` | String | `text` |
| 35 | `purchaseDirectShipFlag` | purchaseDirectShipFlag | `purchase_direct_ship_flag` | aa_boolean | `singleOption` |
| 36 | `purchaseOrgId` | purchaseOrgID | `purchase_org_id` | a4916c85-f087-4e87-a178-0ad37aff7cd0 | `quote` |
| 37 | `purchaseTaskQty` | purchaseTaskQty | `purchaset_taskt_qty` | Decimal | `number` |
| 38 | `quantity` | quantity | `quantity` | Decimal | `number` |
| 39 | `receiveAddress` | receiveAddress | `receive_address` | String | `text` |
| 40 | `receiveMobile` | receiveMobile | `receive_mobile` | String | `text` |
| 41 | `receiveTelePhone` | receiveTelePhone | `receive_tele_phone` | String | `text` |
| 42 | `receiver` | receiver | `receiver` | String | `text` |
| 43 | `receiverCustId` | receiverCustID | `receiver_cust_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 44 | `requirementPlanFlag` | requirementPlanFlag | `requirement_plan_flag` | xmyYesNo | `singleOption` |
| 45 | `reserveId` | reserveID | `reserve_id` | fdc23f28-4a7f-46e8-844b-345f01c13996 | `quote` |
| 46 | `rowStatus` | rowStatus | `row_status` | prjc_mater_row_status | `singleOption` |
| 47 | `rowType` | rowType | `row_type` | 877e3ccb-564a-48c3-9c63-73d9f63e6a18 | `quote` |
| 48 | `shipmentFlag` | shipmentFlag | `shipment_flag` | xmyYesNo | `singleOption` |
| 49 | `signedPurchContrQty` | signedPurchContrQty | `signed_purch_contr_qty` | Decimal | `number` |
| 50 | `subRequisitionFlag` | subRequisitionFlag | `sub_requisition_flag` | xmyYesNo | `singleOption` |
| 51 | `suggestVendorId` | suggestVendorID | `suggest_vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 52 | `supplierId` | supplierID | `supplier_id` | String | `text` |
| 53 | `taxCategoryId` | taxCategoryID | `tax_category_id` | 01e7528c-c35c-4d33-b2aa-382b4b4f4534 | `quote` |
| 54 | `taxMny` | taxMny | `tax_mny` | Decimal | `number` |
| 55 | `taxRate` | taxRate | `tax_rate` | Decimal | `number` |
| 56 | `totalMny` | totalMny | `total_mny` | Decimal | `number` |
| 57 | `totalOutStockQty` | totalOutStockQty | `total_out_stock_qty` | Decimal | `number` |
| 58 | `totalProductIncomingQty` | totalProductIncomingQty | `total_product_incoming_qty` | Decimal | `number` |
| 59 | `totalProductQty` | totalProductQty | `total_product_qty` | Decimal | `number` |
| 60 | `totalPurInStockQuantity` | totalPurInStockQuantity | `total_purin_stock_quantity` | Decimal | `number` |
| 61 | `totalShipQty` | totalShipQty | `total_ship_qty` | Decimal | `number` |
| 62 | `totalSignQty` | totalSignQty | `total_sign_qty` | Decimal | `number` |
| 63 | `totalSubArriveQty` | totalSubArriveQty | `total_sub_arrive_qty` | Decimal | `number` |
| 64 | `totalSubIncomingQty` | totalSubIncomingQty | `total_sub_incoming_qty` | Decimal | `number` |
| 65 | `totalSubOrderQty` | totalSubOrderQty | `total_sub_order_qty` | Decimal | `number` |
| 66 | `totalSubRequireQty` | totalSubRequireQty | `total_sub_require_qty` | Decimal | `number` |
| 67 | `totalTaxMny` | totalTaxMny | `total_tax_mny` | Decimal | `number` |
| 68 | `trackingNO` | trackingNO | `tracking_no` | String | `text` |
| 69 | `unitPrice` | unitPrice | `unit_price` | Decimal | `number` |
| 70 | `unitTaxPrice` | unitTaxPrice | `unit_tax_price` | Decimal | `number` |
| 71 | `waitApplyedQty` | waitApplyedQty | `wait_applyed_qty` | Decimal | `number` |
| 72 | `waitPurchaseTaskQty` | waitPurchaseTaskQty | `wait_purchase_task_qty` | Decimal | `number` |
| 73 | `wbs` | wbs | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 | `quote` |
| 74 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（19 个）

- `projectMaterialListId` -> `rscm.projectmaterial.ProjectMaterialList` ()
- `defineCharacteristic` -> `pgrm.projecttask.ProjectTaskMaterialdefineCharacteristicUserDefine` ()
- `agentId` -> `aa.merchant.Merchant` ()
- `creator` -> `base.user.BipUser` ()
- `productId` -> `pc.product.Product` ()
- `reserveId` -> `st.reservation.Reservation` ()
- `modifier` -> `base.user.BipUser` ()
- `wbs` -> `BGDM.wbs.wbs_doc` ()
- `purchaseOrgId` -> `org.func.PurchaseOrg` ()
- `ytenantId` -> `yht.tenant.YhtTenant` ()
- `orgId` -> `org.func.BaseOrg` ()
- `inventoryOrg` -> `org.func.InventoryOrg` ()
- `rowType` -> `bd.bill.TransTypeAdmin` ()
- `defineCharacteristics` -> `pgrm.projecttask.ProjectTaskMaterialdefineCharacteristicsFreeCT` ()
- `projectScheduleTaskId` -> `pgrm.projecttask.ProjectScheduleTask` (0..n)
- `receiverCustId` -> `aa.merchant.Merchant` ()
- `suggestVendorId` -> `aa.vendor.Vendor` ()
- `cqtUnitId` -> `pc.unit.Unit` ()
- `taxCategoryId` -> `bd.taxrate.TaxRateVO` ()
