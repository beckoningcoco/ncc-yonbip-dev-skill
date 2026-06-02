---
tags: [BIP, 元数据, 数据字典, earap.payment.PaymentBody]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 付款单明细信息 (`earap.payment.PaymentBody`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `ap_payment_b` | 应用: `EAP`

## 属性（111 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `taxCodeId` | tax编码ID | `tax_code_id` | 3f7c3856-5b00-4506-b458-a64eed0d3bfb | `quote` |
| 2 | `clmContractLibId` | clmContractLibID | `clm_contract_lib_id` | a2b72a3c-8c65-4b56-8e8f-35821ac27556 | `quote` |
| 3 | `bizFlowMakeBillCode` | bizFlowMakeBill编码 | `bizflow_makebillcode` | String | `text` |
| 4 | `blnSettlePatch` | blnSettlePatch | `bln_settle_patch` | Boolean | `switch` |
| 5 | `blnSettleRefund` | blnSettleRefund | `bln_settle_refund` | BlnSettleRefundEnum | `singleOption` |
| 6 | `checkNo` | checkNo | `check_no` | String | `text` |
| 7 | `contractNo` | contractNo | `contract_no` | String | `text` |
| 8 | `cooperateNo` | cooperateNo | `cooperate_no` | String | `text` |
| 9 | `costCenter` | costCenter | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 | `quote` |
| 10 | `demanderProCenter` | demanderProCenter | `demander_procenter_id` | e33ec72a-3857-4167-89e2-a437168ed3bb | `quote` |
| 11 | `dept` | dept | `dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 12 | `dtcGtxId` | dtcGtxID | `dtc_gtxid` | String | `text` |
| 13 | `dtcStatus` | dtcStatus | `dtc_status` | Integer | `int` |
| 14 | `employee` | employee | `employee_id` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a | `quote` |
| 15 | `employeeBankAccount` | employeeBankAccount | `employee_bank_account_id` | e1db328d-c25b-49de-8aad-33400dc10e4b | `quote` |
| 16 | `enterpriseBankAccount` | enterpriseBankAccount | `enterprise_bank_account_id` | fbc20885-a507-45bd-a986-74d3fc28d38a | `quote` |
| 17 | `enterpriseCashAccount` | enterpriseCashAccount | `enterprise_cash_account_id` | 39f4ff02-fea2-4a92-adf2-37d02207f799 | `quote` |
| 18 | `exchangeRate` | exchangeRate | `exchange_rate` | Decimal | `number` |
| 19 | `exchangeRateDate` | exchangeRate日期 | `exchange_rate_date` | String | `date` |
| 20 | `exchangeRateType` | exchangeRateType | `exchange_rate_type_id` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |
| 21 | `expenseItem` | expenseItem | `expense_item_id` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 | `quote` |
| 22 | `expireDate` | expire日期 | `expire_date` | String | `date` |
| 23 | `extRowNo` | extRowNo | `ext_row_no` | String | `text` |
| 24 | `freeChId` | freeChID | `free_ch_id` | 8719faa9-1ade-4b68-8248-a30a024f4cf9 | `UserDefine` |
| 25 | `funder` | funder | `funder_id` | e969728a-efe8-49db-86b0-5f8e18c2f098 | `quote` |
| 26 | `funderBankAccount` | funderBankAccount | `funder_bank_account_id` | c5eba128-e930-4602-897a-30d3a049390e | `quote` |
| 27 | `headerId` | headerID | `header_id` | f49cb723-973a-4687-b17d-bd37178b92b3 | `quote` |
| 28 | `invoiceNo` | invoiceNo | `invoice_no` | String | `text` |
| 29 | `issueNo` | 是否sueNo | `issue_no` | Integer | `int` |
| 30 | `localSettleAmount` | localSettleAmount | `local_settle_amount` | Decimal | `number` |
| 31 | `localTaxAmount` | localTaxAmount | `local_tax_amount` | Decimal | `number` |
| 32 | `localTaxExcludedAmount` | localTaxExcludedAmount | `local_tax_excluded_amount` | Decimal | `number` |
| 33 | `localTaxIncludedAmount` | localTaxIncludedAmount | `local_tax_included_amount` | Decimal | `number` |
| 34 | `localWhtaxAmount` | localWhtaxAmount | `local_whtax_amount` | Decimal | `number` |
| 35 | `material` | material | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 36 | `noteDate` | note日期 | `note_date` | String | `date` |
| 37 | `noteNo` | noteNo | `note_no` | 188a8035-1815-4024-b1f9-e60be16249fc | `quote` |
| 38 | `noteType` | noteType | `note_type_id` | 1ffb45b4-f3e9-4e02-8fa0-d3429c8d7fb4 | `quote` |
| 39 | `objectBankAccountNo` | objectBankAccountNo | `object_bank_account_no` | String | `text` |
| 40 | `objectType` | objectType | `object_type` | ObjectTypeApEnum | `singleOption` |
| 41 | `orderNo` | orderNo | `order_no` | String | `text` |
| 42 | `org` | org | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 43 | `orgCurrency` | orgCurrency | `org_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 44 | `oriBillId` | oriBillID | `ori_bill_id` | String | `text` |
| 45 | `oriBillNo` | oriBillNo | `ori_bill_no` | String | `text` |
| 46 | `oriBillRowId` | oriBillRowID | `ori_bill_row_id` | String | `text` |
| 47 | `oriBillType` | oriBillType | `ori_bill_type` | String | `text` |
| 48 | `oriCurrency` | oriCurrency | `ori_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 49 | `oriOccupyAmount` | oriOccupyAmount | `ori_occupy_amount` | Decimal | `number` |
| 50 | `oriSettleAmount` | oriSettleAmount | `ori_settle_amount` | Decimal | `number` |
| 51 | `oriSettleRefundAmount` | oriSettleRefundAmount | `ori_settle_refund_amount` | Decimal | `number` |
| 52 | `oriSettleRejectAmount` | oriSettleRejectAmount | `ori_settle_reject_amount` | Decimal | `number` |
| 53 | `oriTaxAmount` | oriTaxAmount | `ori_tax_amount` | Decimal | `number` |
| 54 | `oriTaxExcludedAmount` | oriTaxExcludedAmount | `ori_tax_excluded_amount` | Decimal | `number` |
| 55 | `oriTaxIncludedAmount` | oriTaxIncludedAmount | `ori_tax_included_amount` | Decimal | `number` |
| 56 | `oriWhtaxAmount` | oriWhtaxAmount | `ori_whtax_amount` | Decimal | `number` |
| 57 | `partner` | partner | `partner_id` | c1627369-6457-4828-883d-756b79bd0f46 | `quote` |
| 58 | `project` | project | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |
| 59 | `quickType` | quickType | `quick_type_id` | 14b092f3-5d27-4a47-82a0-d6bad074c9f1 | `quote` |
| 60 | `quickTypeCode` | quickType编码 | `quick_type_code` | String | `text` |
| 61 | `relateCheckBill` | relateCheckBill | `brelate_check_bill` | Boolean | `switch` |
| 62 | `remarks` | remarks | `remarks` | String | `text` |
| 63 | `retailer` | retailer | `retailer_name` | String | `text` |
| 64 | `rowNo` | rowNo | `row_no` | Decimal | `number` |
| 65 | `settleDate` | settle日期 | `settle_date` | Date | `dateTime` |
| 66 | `settleMode` | settleMode | `settle_mode_id` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff | `quote` |
| 67 | `settleRejectType` | settleRejectType | `settle_reject_type` | SettleRejectTypeEnum | `singleOption` |
| 68 | `settleState` | settleState | `settle_state` | SettleStateEnum | `singleOption` |
| 69 | `shop` | shop | `shop_id` | String | `text` |
| 70 | `sourceGrandId` | sourceGrandID | `sourcegrand_id` | String | `text` |
| 71 | `srcBillId` | srcBillID | `src_bill_id` | String | `text` |
| 72 | `srcBillNo` | srcBillNo | `src_bill_no` | String | `text` |
| 73 | `srcBillRowAmount` | srcBillRowAmount | `src_bill_row_amount` | Decimal | `number` |
| 74 | `srcBillRowId` | srcBillRowID | `src_bill_row_id` | String | `text` |
| 75 | `srcBillType` | srcBillType | `src_bill_type` | String | `text` |
| 76 | `srcClaimId` | srcClaimID | `src_claim_id` | String | `text` |
| 77 | `srcExeDetailId` | srcExeDetailID | `src_exe_detail_id` | String | `text` |
| 78 | `srcOrderRowNo` | srcOrderRowNo | `src_order_row_no` | Decimal | `number` |
| 79 | `staff` | staff | `staff_id` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a | `quote` |
| 80 | `supplier` | supplier | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 81 | `supplierBankAccount` | supplierBankAccount | `supplier_bank_account_id` | 4b6dcfa2-1d07-407d-a35a-9b219fadf37c | `quote` |
| 82 | `supplierProCenter` | supplierProCenter | `supplier_procenter_id` | e33ec72a-3857-4167-89e2-a437168ed3bb | `quote` |
| 83 | `taxRate` | taxRate | `tax_rate` | Decimal | `number` |
| 84 | `taxSubject` | taxSubject | `tax_subject_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |
| 85 | `verifyAmount` | verifyAmount | `verify_amount` | Decimal | `number` |
| 86 | `verifyCurrency` | verifyCurrency | `verify_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 87 | `whtax` | whtax | `whtax_id` | aaae292d-ebbc-4b8f-a9f7-b67bff16c947 | `quote` |
| 88 | `exchangeRateOps` | exchangeRateOps | `exchange_rate_ops` | Integer | `int` |
| 89 | `activity` | activity | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 | `quote` |
| 90 | `wbs` | wbs | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 | `quote` |
| 91 | `withHoldingTaxItem` | withHoldingTaxItem | `` | 88867866-b3dc-49ba-821f-73aa6719dd7e | `` |
| 92 | `id` | ID | `id` | String | `text` |
| 93 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 94 | `bizFlowInstanceId` | bizFlowInstanceID | `bizflowinstance_id` | String | `text` |
| 95 | `bizflowId` | bizflowID | `bizflow_id` | String | `text` |
| 96 | `bizflowName` | bizflow名称 | `bizflowname` | String | `text` |
| 97 | `sourceBusiObj` | sourceBusiObj | `sourcebusiobj` | String | `text` |
| 98 | `sourceChildId` | sourceChildID | `sourcechild_id` | String | `text` |
| 99 | `sourceCode` | source编码 | `sourcecode` | String | `text` |
| 100 | `sourceId` | sourceID | `source_id` | String | `text` |
| 101 | `firstBusiObj` | firstBusiObj | `firstbusiobj` | String | `text` |
| 102 | `firstChildId` | firstChildID | `firstchild_id` | String | `text` |
| 103 | `firstCode` | first编码 | `firstcode` | String | `text` |
| 104 | `firstId` | firstID | `first_id` | String | `text` |
| 105 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 106 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 107 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 108 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 109 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 110 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 111 | `taxCalculationResultList` | taxCalculationResultList | `` | 08a46952-2d1c-44ab-b444-7e0571e3f66a | `` |

## 关联（39 个）

- `expenseItem` -> `bd.expenseitem.ExpenseItem` () [废]
- `funder` -> `tmsp.fundbusinobjarchives.FundBusinObjArchives` () [废]
- `oriCurrency` -> `bd.currencytenant.CurrencyTenantVO` () [废]
- `activity` -> `pgrm.projecttask.ProjectScheduleTask` () [废]
- `whtax` -> `taxpubdoc.taxWithholding.taxWithholdingCode` () [废]
- `modifier` -> `base.user.BipUser` () 
- `employeeBankAccount` -> `bd.staff.StaffBankAcct` () [废]
- `project` -> `bd.project.ProjectVO` () [废]
- `wbs` -> `BGDM.wbs.wbs_doc` () 
- `employee` -> `bd.staff.StaffNew` () [废]
- `headerId` -> `earap.payment.PaymentHeader` (0..n) [废]
- `quickType` -> `bd.paymenttype.PaymentTypeVO` () [废]
- `supplierProCenter` -> `bd.virtualaccbody.VirtualAccbody` () [废]
- `funderBankAccount` -> `tmsp.fundbusinobjarchives.FundBusinObjArchivesItem` () [废]
- `noteNo` -> `drft.billno.Billno` () [废]
- `settleMode` -> `aa.settlemethod.SettleMethod` () [废]
- `supplier` -> `aa.vendor.Vendor` () [废]
- `orgCurrency` -> `bd.currencytenant.CurrencyTenantVO` () [废]
- `demanderProCenter` -> `bd.virtualaccbody.VirtualAccbody` () [废]
- `withHoldingTaxItem` -> `earap.payment.PaymentWithHoldingTax` (0..n) 
- `creator` -> `base.user.BipUser` () 
- `taxSubject` -> `archive.taxArchives.TaxRateArchive` () [废]
- `org` -> `org.func.BaseOrg` () [废]
- `clmContractLibId` -> `CLM.clmContract.contractLib` () [废]
- `costCenter` -> `bd.costcenter.CostCenter` () [废]
- `enterpriseBankAccount` -> `bd.enterprise.OrgFinBankacctVO` () [废]
- `staff` -> `bd.staff.StaffNew` () [废]
- `dept` -> `bd.adminOrg.AdminOrgVO` () [废]
- `freeChId` -> `earap.payment.PaymentBodyfreeChIdUserDefine` () [废]
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `supplierBankAccount` -> `aa.vendor.VendorBank` () [废]
- `taxCodeId` -> `taxpubdoc.taxengine.TaxCode` () [废]
- `exchangeRateType` -> `bd.exchangeRate.ExchangeRateTypeVO` () [废]
- `noteType` -> `drft.billtype.BillType` () [废]
- `enterpriseCashAccount` -> `bd.enterprise.OrgFinCashacctVO` () [废]
- `material` -> `pc.product.Product` () [废]
- `partner` -> `base.businesspartner.BusinessPartner` () [废]
- `taxCalculationResultList` -> `earap.payment.TaxCalculationResult` (0..n) 
- `verifyCurrency` -> `bd.currencytenant.CurrencyTenantVO` () [废]
