---
tags: [BIP, 元数据, 数据字典, earap.payable.PayableBody]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 应付结算清单明细信息 (`earap.payable.PayableBody`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `ap_payable_b` | 应用: `STB`

## 属性（98 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `contractLibId` | contractLibID | `contract_lib_id` | a2b72a3c-8c65-4b56-8e8f-35821ac27556 | `quote` |
| 2 | `taxCode` | tax编码 | `tax_code_id` | 3f7c3856-5b00-4506-b458-a64eed0d3bfb | `quote` |
| 3 | `staff` | staff | `staff_id` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a | `quote` |
| 4 | `oriTaxIncludedAmount` | oriTaxIncludedAmount | `ori_tax_included_amount` | Decimal | `number` |
| 5 | `localTaxIncludedPrice` | localTaxIncludedPrice | `local_tax_included_price` | Decimal | `number` |
| 6 | `localNonDeductTax` | localNonDeductTax | `local_non_deduct_tax` | Decimal | `number` |
| 7 | `invoiceNo` | invoiceNo | `invoice_no` | String | `text` |
| 8 | `demanderProCenter` | demanderProCenter | `demander_procenter_id` | e33ec72a-3857-4167-89e2-a437168ed3bb | `quote` |
| 9 | `agreement` | agreement | `pay_agreement_id` | 3cce8052-512e-4e51-9b6e-57adff40948c | `quote` |
| 10 | `srcBillRowId` | srcBillRowID | `src_bill_row_id` | String | `text` |
| 11 | `project` | project | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |
| 12 | `invoiceType` | invoiceType | `invoice_type_id` | 3a762abb-858d-4fc4-a60e-4850edf0ab1b | `quote` |
| 13 | `dept` | dept | `dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 14 | `cooperateNo` | cooperateNo | `cooperate_no` | String | `text` |
| 15 | `deductTaxType` | deductTaxType | `deduct_tax_type` | STB_DeductTaxTypeEnum | `singleOption` |
| 16 | `blnDeductTax` | blnDeductTax | `bln_deduct_tax` | Boolean | `switch` |
| 17 | `employee` | employee | `employee_id` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a | `quote` |
| 18 | `oriTaxIncludedPrice` | oriTaxIncludedPrice | `ori_tax_included_price` | Decimal | `number` |
| 19 | `headerId` | headerID | `header_id` | 404676ad-786c-4ee3-9996-66b853d3bebe | `quote` |
| 20 | `srcBillId` | srcBillID | `src_bill_id` | String | `text` |
| 21 | `supplier` | supplier | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 22 | `oriBillId` | oriBillID | `ori_bill_id` | String | `text` |
| 23 | `oriTaxExcludedAmount` | oriTaxExcludedAmount | `ori_tax_excluded_amount` | Decimal | `number` |
| 24 | `objectType` | objectType | `object_type` | STB_ObjectTypeApEnum | `singleOption` |
| 25 | `invoiceDate` | invoiceDate | `invoice_date` | String | `date` |
| 26 | `supplierProCenter` | supplierProCenter | `supplier_procenter_id` | e33ec72a-3857-4167-89e2-a437168ed3bb | `quote` |
| 27 | `rowNo` | rowNo | `row_no` | Decimal | `number` |
| 28 | `contractNo` | 合同编号 | `contract_no` | String | `text` |
| 29 | `freeChId` | freeChID | `free_ch_id` | 69004058-4892-4832-89ef-b3917b35fb27 | `UserDefine` |
| 30 | `localTaxIncludedAmount` | localTaxIncludedAmount | `local_tax_included_amount` | Decimal | `number` |
| 31 | `partner` | partner | `partner_id` | c1627369-6457-4828-883d-756b79bd0f46 | `quote` |
| 32 | `material` | material | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 33 | `oriTaxExcludedPrice` | oriTaxExcludedPrice | `ori_tax_excluded_price` | Decimal | `number` |
| 34 | `oriBillNo` | oriBillNo | `ori_bill_no` | String | `text` |
| 35 | `oriWhtaxAmount` | oriWhtaxAmount | `ori_whtax_amount` | Decimal | `number` |
| 36 | `expenseItem` | expenseItem | `expense_item_id` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 | `quote` |
| 37 | `retailer` | retailer | `retailer_name` | String | `text` |
| 38 | `localWhtaxAmount` | localWhtaxAmount | `local_whtax_amount` | Decimal | `number` |
| 39 | `oriBillRowId` | oriBillRowID | `ori_bill_row_id` | String | `text` |
| 40 | `taxSubject` | taxSubject | `tax_subject_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |
| 41 | `costCenter` | costCenter | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 | `quote` |
| 42 | `startDate` | startDate | `start_date` | String | `date` |
| 43 | `unit` | unit | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 44 | `srcBillRowAmount` | srcBillRowAmount | `src_bill_row_amount` | Decimal | `number` |
| 45 | `nonDeductTaxRate` | nonDeductTaxRate | `non_deduct_tax_rate` | Decimal | `number` |
| 46 | `localTaxAmount` | localTaxAmount | `local_tax_amount` | Decimal | `number` |
| 47 | `srcBillType` | srcBillType | `src_bill_type` | String | `text` |
| 48 | `oriNonDeductTax` | oriNonDeductTax | `ori_non_deduct_tax` | Decimal | `number` |
| 49 | `oriTaxAmount` | oriTaxAmount | `ori_tax_amount` | Decimal | `number` |
| 50 | `oriBillType` | oriBillType | `ori_bill_type` | String | `text` |
| 51 | `extRowNo` | extRowNo | `ext_row_no` | String | `text` |
| 52 | `funder` | funder | `funder_id` | e969728a-efe8-49db-86b0-5f8e18c2f098 | `quote` |
| 53 | `whtax` | whtax | `whtax_id` | aaae292d-ebbc-4b8f-a9f7-b67bff16c947 | `quote` |
| 54 | `invoiceCode` | invoice编码 | `invoice_code` | String | `text` |
| 55 | `quantity` | quantity | `quantity` | Decimal | `number` |
| 56 | `localTaxExcludedPrice` | localTaxExcludedPrice | `local_tax_excluded_price` | Decimal | `number` |
| 57 | `org` | org | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 58 | `localTaxExcludedAmount` | localTaxExcludedAmount | `local_tax_excluded_amount` | Decimal | `number` |
| 59 | `srcBillNo` | srcBillNo | `src_bill_no` | String | `text` |
| 60 | `orderNo` | orderNo | `order_no` | String | `text` |
| 61 | `taxRate` | taxRate | `tax_rate` | Decimal | `number` |
| 62 | `oriCurrency` | oriCurrency | `ori_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 63 | `orgCurrency` | orgCurrency | `org_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 64 | `exchangeRateType` | exchangeRateType | `exchange_rate_type_id` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |
| 65 | `exchangeRateDate` | exchangeRateDate | `exchange_rate_date` | String | `date` |
| 66 | `exchangeRate` | exchangeRate | `exchange_rate` | Decimal | `number` |
| 67 | `remarks` | remarks | `remarks` | String | `text` |
| 68 | `dtcGtxId` | dtcGtxID | `dtc_gtxid` | String | `text` |
| 69 | `dtcStatus` | dtcStatus | `dtc_status` | Integer | `int` |
| 70 | `accountingMethod` | accountingMethod | `accounting_method` | String | `text` |
| 71 | `estimateBackwash` | estimateBackwash | `estimate_backwash` | EstimateBackwashEnum | `singleOption` |
| 72 | `exchangeRateOps` | exchangeRateOps | `exchange_rate_ops` | STB_ExchangeRateOpsEnum | `singleOption` |
| 73 | `activity` | activity | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 | `quote` |
| 74 | `wbs` | wbs | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 | `quote` |
| 75 | `withHoldingTaxItem` | withHoldingTaxItem | `` | b07012c7-6110-4282-adf1-23ca20b85809 | `` |
| 76 | `grandsonItem` | grandsonItem | `` | 1f826b30-0c92-4c26-9c3e-bc4c05796341 | `` |
| 77 | `id` | ID | `id` | String | `text` |
| 78 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 79 | `bizFlowInstanceId` | bizFlowInstanceID | `bizflowinstance_id` | String | `text` |
| 80 | `bizFlowMakeBillCode` | bizFlowMakeBill编码 | `bizflow_makebillcode` | String | `text` |
| 81 | `bizflowId` | bizflowID | `bizflow_id` | String | `text` |
| 82 | `bizflowName` | bizflow名称 | `bizflowname` | String | `text` |
| 83 | `sourceBusiObj` | sourceBusiObj | `sourcebusiobj` | String | `text` |
| 84 | `sourceChildId` | sourceChildID | `sourcechild_id` | String | `text` |
| 85 | `sourceCode` | source编码 | `sourcecode` | String | `text` |
| 86 | `sourceId` | sourceID | `source_id` | String | `text` |
| 87 | `firstBusiObj` | firstBusiObj | `firstbusiobj` | String | `text` |
| 88 | `firstChildId` | firstChildID | `firstchild_id` | String | `text` |
| 89 | `firstCode` | first编码 | `firstcode` | String | `text` |
| 90 | `firstId` | firstID | `first_id` | String | `text` |
| 91 | `sourceGrandId` | sourceGrandID | `sourcegrand_id` | String | `text` |
| 92 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 93 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 94 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 95 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 96 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 97 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 98 | `taxCalcResultItem` | taxCalcResultItem | `` | d9925a6f-74f5-40c3-83b5-9d47e34b2de1 | `` |

## 关联（33 个）

- `expenseItem` -> `bd.expenseitem.ExpenseItem` () [废]
- `funder` -> `tmsp.fundbusinobjarchives.FundBusinObjArchives` () [废]
- `oriCurrency` -> `bd.currencytenant.CurrencyTenantVO` () [废]
- `activity` -> `pgrm.projecttask.ProjectScheduleTask` () 
- `whtax` -> `taxpubdoc.taxWithholding.taxWithholdingCode` () [废]
- `modifier` -> `base.user.BipUser` () 
- `project` -> `bd.project.ProjectVO` () [废]
- `wbs` -> `BGDM.wbs.wbs_doc` () 
- `employee` -> `bd.staff.StaffNew` () [废]
- `headerId` -> `earap.payable.PayableHeader` (0..n) [废]
- `supplierProCenter` -> `bd.virtualaccbody.VirtualAccbody` () [废]
- `supplier` -> `aa.vendor.Vendor` () [废]
- `invoiceType` -> `bd.invoice.InvoiceTypeVO` () [废]
- `orgCurrency` -> `bd.currencytenant.CurrencyTenantVO` () [废]
- `demanderProCenter` -> `bd.virtualaccbody.VirtualAccbody` () [废]
- `withHoldingTaxItem` -> `earap.payable.PayableWithHoldingTax` (0..n) 
- `creator` -> `base.user.BipUser` () 
- `agreement` -> `bd.payments.PayAgreement` () [废]
- `taxSubject` -> `archive.taxArchives.TaxRateArchive` () [废]
- `org` -> `org.func.BaseOrg` () [废]
- `costCenter` -> `bd.costcenter.CostCenter` () [废]
- `contractLibId` -> `CLM.clmContract.contractLib` () [废]
- `staff` -> `bd.staff.StaffNew` () [废]
- `dept` -> `bd.adminOrg.AdminOrgVO` () [废]
- `freeChId` -> `earap.payable.PayableBodyfreeChIdUserDefine` () [废]
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `taxCode` -> `taxpubdoc.taxengine.TaxCode` () [废]
- `grandsonItem` -> `earap.payable.PayableProtocol` (0..n) 
- `exchangeRateType` -> `bd.exchangeRate.ExchangeRateTypeVO` () [废]
- `unit` -> `pc.unit.Unit` () [废]
- `taxCalcResultItem` -> `earap.payable.PayableTaxCalcResult` (0..n) 
- `material` -> `pc.product.Product` () [废]
- `partner` -> `base.businesspartner.BusinessPartner` () [废]
