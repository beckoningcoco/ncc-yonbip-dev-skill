---
tags: [BIP, 元数据, 数据字典, pu.purchaseorder.PurchaseOrdersParallel]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 采购订单子表平行表 (`pu.purchaseorder.PurchaseOrdersParallel`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `st_purchaseorders_parallel` | 应用: `PU`

## 属性（89 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `erpApplyOrderId` | erpApplyOrderID | `erpapplyorder_id` | String | `text` |
| 2 | `erpApplyOrderRowId` | erpApplyOrderRowID | `erpapplyorder_row_id` | String | `text` |
| 3 | `erpContractId` | erpContractID | `erpcontract_id` | String | `text` |
| 4 | `erpContractRowId` | erpContractRowID | `erpcontract_row_id` | String | `text` |
| 5 | `erpOrderBodyId` | erpOrderBodyID | `erporder_body_id` | String | `text` |
| 6 | `erpOrderBodyRowNo` | erpOrderBodyRowNo | `erporder_body_rowno` | Integer | `int` |
| 7 | `actualMoney` | actualMoney | `actual_money` | Decimal | `number` |
| 8 | `arrivedateSupconfirm` | arrivedateSupconfirm | `arrivedate_supconfirm` | DateTime | `timestamp` |
| 9 | `benchmarkType` | benchmarkType | `benchmark_type` | String | `text` |
| 10 | `rowCollaborationStatus` | rowCollaborationStatus | `row_collaboration_status` | PurOrderSplitEnum | `` |
| 11 | `conTaxRate` | conTaxRate | `conTaxRate` | Decimal | `number` |
| 12 | `conMemo` | conMemo | `conMemo` | String | `text` |
| 13 | `outForeignBusinessmen` | outForeignBusinessmen | `outForeignBusinessmen` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 14 | `signatory` | signatory | `signatory` | String | `text` |
| 15 | `hasForeignInvestors` | hasForeignInvestors | `hasForeignInvestors` | Boolean | `switch` |
| 16 | `erpApplyOrderType` | erpApplyOrderType | `erpapplyorder_type` | ErpApplyOrderTypeEnum | `` |
| 17 | `yuncaiOrderId` | yuncaiOrderID | `yuncairder_id` | String | `text` |
| 18 | `yuncaiOrderBId` | yuncaiOrderBID | `yuncairder_b_id` | String | `text` |
| 19 | `puReqCode` | puReq编码 | `puReqCode` | String | `text` |
| 20 | `applyOrderCode` | applyOrder编码 | `applyOrderCode` | String | `text` |
| 21 | `fileId` | fileID | `fileId` | String | `text` |
| 22 | `conTaxitems` | conTaxitems | `conTaxitems` | String | `text` |
| 23 | `availability` | availability | `availability` | String | `text` |
| 24 | `availabilityDescription` | availabilityDescription | `availability_description` | String | `text` |
| 25 | `deliveredNum` | deliveredNum | `delivered_num` | Decimal | `number` |
| 26 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 27 | `collaborationSource` | collaborationSource | `collaboration_source` | String | `text` |
| 28 | `collaborationPocode` | collaborationPocode | `collaboration_pocode` | String | `text` |
| 29 | `collaborationPoid` | collaborationPoid | `collaboration_poid` | Long | `long` |
| 30 | `collaborationPorowno` | collaborationPorowno | `collaboration_porowno` | Decimal | `number` |
| 31 | `collaborationPodetailid` | collaborationPodetailid | `collaboration_podetailid` | Long | `long` |
| 32 | `coSourceType` | coSourceType | `cCoSourceType` | String | `text` |
| 33 | `coUpcode` | coUpcode | `cCoUpcode` | String | `text` |
| 34 | `coSourceid` | coSourceid | `iCoSourceid` | Long | `long` |
| 35 | `coSourceLineNo` | coSourceLineNo | `coSourceLineNo` | Decimal | `number` |
| 36 | `coSourceautoid` | coSourceautoid | `iCoSourceautoid` | Long | `long` |
| 37 | `brandId` | brandID | `brand_id` | 75116b40-efe4-455e-b62d-d56ac4811eb1 | `quote` |
| 38 | `brandName` | brand名称 | `brandName` | String | `text` |
| 39 | `busSupabilityId` | busSupabilityID | `bus_supability_id` | Long | `long` |
| 40 | `buyofferDetailId` | buyofferDetailID | `buyoffer_detail_id` | Long | `long` |
| 41 | `buyofferId` | buyofferID | `buyoffer_id` | Long | `long` |
| 42 | `closeOrderReason` | closeOrderReason | `close_order_reason` | String | `text` |
| 43 | `conPrice` | conPrice | `con_price` | Decimal | `number` |
| 44 | `conQuantity` | conQuantity | `con_quantity` | Decimal | `number` |
| 45 | `conTaxPrice` | conTaxPrice | `con_tax_price` | Decimal | `number` |
| 46 | `confirmBrandId` | confirmBrandID | `confirm_brand_id` | Long | `long` |
| 47 | `confirmBrandName` | confirmBrand名称 | `confirm_brand_name` | String | `text` |
| 48 | `contractBillno` | contractBillno | `contract_billno` | String | `text` |
| 49 | `contractDetailId` | contractDetailID | `contract_detail_id` | Long | `long` |
| 50 | `contractId` | contractID | `contract_id` | Long | `long` |
| 51 | `contractName` | contract名称 | `contract_name` | String | `text` |
| 52 | `contractRowNum` | contractRowNum | `contract_row_num` | Long | `long` |
| 53 | `ctMaQuantity` | ctMaQuantity | `ct_ma_quantity` | Decimal | `number` |
| 54 | `ctMaTaxprice` | ctMaTaxprice | `ct_ma_taxprice` | Decimal | `number` |
| 55 | `demandBrandId` | demandBrandID | `demand_brand_id` | Long | `long` |
| 56 | `diffReceivedNum` | diffReceivedNum | `diff_received_num` | Decimal | `number` |
| 57 | `diffStorageNum` | diffStorageNum | `diff_storage_num` | Decimal | `number` |
| 58 | `erpCode` | erp编码 | `erp_code` | String | `text` |
| 59 | `erpRegCertNo` | erpRegCertNo | `erp_reg_cert_no` | String | `text` |
| 60 | `floatMoney` | floatMoney | `float_money` | Decimal | `number` |
| 61 | `floatProp` | floatProp | `float_prop` | String | `text` |
| 62 | `id` | ID | `id` | 68e65921-f77c-4794-a820-768e10ec6d28 | `quote` |
| 63 | `isMaterialClass` | 是否MaterialClass | `is_material_class` | Boolean | `switch` |
| 64 | `manufacturer` | manufacturer | `manufacturer` | String | `text` |
| 65 | `outOtherOrderRowNO` | outOtherOrderRowNO | `outOtherOrderRowNO` | Integer | `int` |
| 66 | `outSourceBillId` | outSourceBillID | `outSourceBillId` | Long | `long` |
| 67 | `outSourceBillNO` | outSourceBillNO | `outSourceBillNO` | String | `text` |
| 68 | `outSourceBillRowId` | outSourceBillRowID | `outSourceBillRowId` | Long | `long` |
| 69 | `outSourceBillRowNO` | outSourceBillRowNO | `outSourceBillRowNO` | Integer | `int` |
| 70 | `outSourceType` | outSourceType | `outSourceType` | String | `text` |
| 71 | `pricedecisionDetailId` | pricedecisionDetailID | `pricedecision_detail_id` | Long | `long` |
| 72 | `pricedecisionId` | pricedecisionID | `pricedecision_id` | Long | `long` |
| 73 | `pritemId` | pritemID | `pritem_id` | Long | `long` |
| 74 | `quotaofferdetailid` | quotaofferdetailid | `quotaofferdetail_id` | Long | `long` |
| 75 | `quotaofferid` | quotaofferid | `quotaoffer_id` | Long | `long` |
| 76 | `refArea` | refArea | `ref_area` | String | `text` |
| 77 | `refReaStatus` | refReaStatus | `ref_rea_status` | RefReaStatusEnum | `` |
| 78 | `reqDate` | req日期 | `req_date` | DateTime | `timestamp` |
| 79 | `reqDept` | reqDept | `req_dept` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 80 | `reqPsn` | reqPsn | `req_psn` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 81 | `requireBrandCode` | requireBrand编码 | `require_brand_code` | String | `text` |
| 82 | `requireBrandErpId` | requireBrandErpID | `require_brand_erp_id` | String | `text` |
| 83 | `rowConMessage` | rowConMessage | `row_con_message` | ReasonsForRefusalEnum | `` |
| 84 | `rowRefReaStatus` | rowRefReaStatus | `row_ref_rea_status` | String | `text` |
| 85 | `rowRefuseReason` | rowRefuseReason | `row_refuse_reason` | String | `text` |
| 86 | `settlementType` | settlementType | `settlement_type` | String | `text` |
| 87 | `signNum` | signNum | `sign_num` | Decimal | `number` |
| 88 | `totalPrice` | totalPrice | `total_price` | Decimal | `number` |
| 89 | `transparentPurchaseNo` | transparentPurchaseNo | `transparent_purchase_no` | String | `text` |

## 关联（6 个）

- `reqPsn` -> `bd.staff.Staff` () 
- `outForeignBusinessmen` -> `aa.vendor.Vendor` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `brandId` -> `pc.brand.Brand` () 
- `id` -> `pu.purchaseorder.PurchaseOrders` (1) 
- `reqDept` -> `bd.adminOrg.AdminOrgVO` () 
