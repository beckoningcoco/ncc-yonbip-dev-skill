---
tags: [BIP, 元数据, 数据字典, FIAP.FIAP.APPublicEventBody]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 应付公共明细信息 (`FIAP.FIAP.APPublicEventBody`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `arap_ledger_b` | 应用: `EAP`

## 属性（169 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `accBalance` | accBalance | `acc_balance` | Decimal | `number` |
| 2 | `accBook` | accBook | `acc_book_id` | 5df8e763-5595-4a87-9ff9-a7ac3bd1e81e | `quote` |
| 3 | `accExchangeRate` | accExchangeRate | `acc_exchange_rate` | Decimal | `number` |
| 4 | `accExchangeRateOps` | accExchangeRateOps | `acc_exchange_rate_ops` | ExchangeRateMethod | `singleOption` |
| 5 | `accExchangeRateType` | accExchangeRateType | `acc_exchange_rate_type_id` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |
| 6 | `accNonDeductTax` | accNonDeductTax | `acc_non_deduct_tax` | Decimal | `number` |
| 7 | `accPeriod` | accPeriod | `acc_period_id` | 0028813f-135a-485e-a5c3-c15a3d18168b | `quote` |
| 8 | `accPeriodCode` | accPeriod编码 | `acc_period_code` | String | `text` |
| 9 | `accSettleDifference` | accSettleDifference | `acc_settle_difference` | Decimal | `number` |
| 10 | `accTaxAmount` | accTaxAmount | `acc_tax_amount` | Decimal | `number` |
| 11 | `accTaxExcludedAmount` | accTaxExcludedAmount | `acc_tax_excluded_amount` | Decimal | `number` |
| 12 | `accTaxExcludedPrice` | accTaxExcludedPrice | `acc_tax_excluded_price` | Decimal | `number` |
| 13 | `accTaxIncludedAmount` | accTaxIncludedAmount | `acc_tax_included_amount` | Decimal | `number` |
| 14 | `accTaxIncludedPrice` | accTaxIncludedPrice | `acc_tax_included_price` | Decimal | `number` |
| 15 | `accYear` | accYear | `acc_year_id` | 0028813f-135a-485e-a5c3-c15a3d18168b | `quote` |
| 16 | `accYearCode` | accYear编码 | `acc_year_code` | String | `text` |
| 17 | `amountOrg` | amountOrg | `amount_org_id` | 5d4c5590-da40-4b50-80a1-8d04da2f79e0 | `quote` |
| 18 | `billOrg` | billOrg | `bill_org_id` | 5d4c5590-da40-4b50-80a1-8d04da2f79e0 | `quote` |
| 19 | `blnDeductTax` | blnDeductTax | `bln_deduct_tax` | Integer | `int` |
| 20 | `contractNo` | contractNo | `contract_no` | String | `text` |
| 21 | `cooperateNo` | cooperateNo | `cooperate_no` | String | `text` |
| 22 | `costCenter` | costCenter | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 | `quote` |
| 23 | `deductTaxType` | deductTaxType | `deduct_tax_type` | DeductTaxTypeEnum | `singleOption` |
| 24 | `dept` | dept | `dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 25 | `enterpriseCashAccount` | enterpriseCashAccount | `enterprise_cash_account_id` | 39f4ff02-fea2-4a92-adf2-37d02207f799 | `quote` |
| 26 | `event` | event | `event_id` | 5a4e7d5d-57c1-4d58-b931-0477ad5ca5d2 | `quote` |
| 27 | `eventType` | eventType | `event_type_id` | ff8c5979-f9dc-4259-8b9f-6fe69da87bf6 | `quote` |
| 28 | `exchangeRateDate` | exchangeRate日期 | `exchange_rate_date` | String | `date` |
| 29 | `expenseItem` | expenseItem | `expense_item_id` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 | `quote` |
| 30 | `faCode` | fa编码 | `fa_code` | String | `text` |
| 31 | `faName` | fa名称 | `fa_name` | String | `text` |
| 32 | `financeOrg` | financeOrg | `finance_org_id` | 5d4c5590-da40-4b50-80a1-8d04da2f79e0 | `quote` |
| 33 | `freeChId` | freeChID | `free_ch_id` | f791c6a7-ee30-4e08-a774-db37a8d3e643 | `UserDefine` |
| 34 | `gblBalance` | gblBalance | `gbl_balance` | Decimal | `number` |
| 35 | `gblExchangeRate` | gblExchangeRate | `gbl_exchange_rate` | Decimal | `number` |
| 36 | `gblExchangeRateOps` | gblExchangeRateOps | `gbl_exchange_rate_ops` | ExchangeRateMethod | `singleOption` |
| 37 | `gblExchangeRateType` | gblExchangeRateType | `gbl_exchange_rate_type_id` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |
| 38 | `gblNonDeductTax` | gblNonDeductTax | `gbl_non_deduct_tax` | Decimal | `number` |
| 39 | `gblSettleDifference` | gblSettleDifference | `gbl_settle_difference` | Decimal | `number` |
| 40 | `gblTaxAmount` | gblTaxAmount | `gbl_tax_amount` | Decimal | `number` |
| 41 | `gblTaxExcludedAmount` | gblTaxExcludedAmount | `gbl_tax_excluded_amount` | Decimal | `number` |
| 42 | `gblTaxExcludedPrice` | gblTaxExcludedPrice | `gbl_tax_excluded_price` | Decimal | `number` |
| 43 | `gblTaxIncludedAmount` | gblTaxIncludedAmount | `gbl_tax_included_amount` | Decimal | `number` |
| 44 | `gblTaxIncludedPrice` | gblTaxIncludedPrice | `gbl_tax_included_price` | Decimal | `number` |
| 45 | `grpBalance` | grpBalance | `grp_balance` | Decimal | `number` |
| 46 | `grpExchangeRate` | grpExchangeRate | `grp_exchange_rate` | Decimal | `number` |
| 47 | `grpExchangeRateOps` | grpExchangeRateOps | `grp_exchange_rate_ops` | ExchangeRateMethod | `singleOption` |
| 48 | `grpExchangeRateType` | grpExchangeRateType | `grp_exchange_rate_type_id` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |
| 49 | `grpNonDeductTax` | grpNonDeductTax | `grp_non_deduct_tax` | Decimal | `number` |
| 50 | `grpSettleDifference` | grpSettleDifference | `grp_settle_difference` | Decimal | `number` |
| 51 | `grpTaxAmount` | grpTaxAmount | `grp_tax_amount` | Decimal | `number` |
| 52 | `grpTaxExcludedAmount` | grpTaxExcludedAmount | `grp_tax_excluded_amount` | Decimal | `number` |
| 53 | `grpTaxExcludedPrice` | grpTaxExcludedPrice | `grp_tax_excluded_price` | Decimal | `number` |
| 54 | `grpTaxIncludedAmount` | grpTaxIncludedAmount | `grp_tax_included_amount` | Decimal | `number` |
| 55 | `grpTaxIncludedPrice` | grpTaxIncludedPrice | `grp_tax_included_price` | Decimal | `number` |
| 56 | `invProductType` | invProductType | `inv_product_type` | InvProductTypeEnum | `singleOption` |
| 57 | `inventoryOrg` | inventoryOrg | `inventory_org_id` | e18e914b-4518-4e8c-ac21-783145fe7da1 | `quote` |
| 58 | `invoiceDate` | invoice日期 | `invoice_date` | String | `date` |
| 59 | `invoiceNo` | invoiceNo | `invoice_no` | String | `text` |
| 60 | `invoiceType` | invoiceType | `invoice_type_id` | 3a762abb-858d-4fc4-a60e-4850edf0ab1b | `quote` |
| 61 | `material` | material | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 62 | `mtoSalesOrderId` | mtoSalesOrderID | `mto_sales_order_id` | Long | `long` |
| 63 | `mtoSalesOrderRowId` | mtoSalesOrderRowID | `mto_sales_order_row_id` | Long | `long` |
| 64 | `nonDeductTaxRate` | nonDeductTaxRate | `non_deduct_tax_rate` | Decimal | `number` |
| 65 | `oppBillId` | oppBillID | `opp_bill_id` | String | `text` |
| 66 | `oppBillRowId` | oppBillRowID | `opp_bill_row_id` | String | `text` |
| 67 | `oppProCenter` | oppProCenter | `opp_procenter_id` | e33ec72a-3857-4167-89e2-a437168ed3bb | `quote` |
| 68 | `orderNo` | orderNo | `order_no` | String | `text` |
| 69 | `orgBalance` | orgBalance | `org_balance` | Decimal | `number` |
| 70 | `orgExchangeRate` | orgExchangeRate | `org_exchange_rate` | Decimal | `number` |
| 71 | `orgExchangeRateOps` | orgExchangeRateOps | `org_exchange_rate_ops` | ExchangeRateMethod | `singleOption` |
| 72 | `orgExchangeRateType` | orgExchangeRateType | `org_exchange_rate_type_id` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |
| 73 | `orgNonDeductTax` | orgNonDeductTax | `org_non_deduct_tax` | Decimal | `number` |
| 74 | `orgSettleDifference` | orgSettleDifference | `org_settle_difference` | Decimal | `number` |
| 75 | `orgTaxAmount` | orgTaxAmount | `org_tax_amount` | Decimal | `number` |
| 76 | `orgTaxExcludedAmount` | orgTaxExcludedAmount | `org_tax_excluded_amount` | Decimal | `number` |
| 77 | `orgTaxExcludedPrice` | orgTaxExcludedPrice | `org_tax_excluded_price` | Decimal | `number` |
| 78 | `orgTaxIncludedAmount` | orgTaxIncludedAmount | `org_tax_included_amount` | Decimal | `number` |
| 79 | `orgTaxIncludedPrice` | orgTaxIncludedPrice | `org_tax_included_price` | Decimal | `number` |
| 80 | `oriBalance` | oriBalance | `ori_balance` | Decimal | `number` |
| 81 | `oriBillId` | oriBillID | `ori_bill_id` | String | `text` |
| 82 | `oriBillNo` | oriBillNo | `ori_bill_no` | String | `text` |
| 83 | `oriBillRowId` | oriBillRowID | `ori_bill_row_id` | String | `text` |
| 84 | `oriBillType` | oriBillType | `ori_bill_type` | 4a227650-b866-4f4c-a6ca-2433297a1713 | `quote` |
| 85 | `oriCurrency` | oriCurrency | `ori_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 86 | `oriNonDeductTax` | oriNonDeductTax | `ori_non_deduct_tax` | Decimal | `number` |
| 87 | `oriOcupyAmount` | oriOcupyAmount | `ori_ocupy_amount` | Decimal | `number` |
| 88 | `oriSettleDifference` | oriSettleDifference | `ori_settle_difference` | Decimal | `number` |
| 89 | `oriTaxAmount` | oriTaxAmount | `ori_tax_amount` | Decimal | `number` |
| 90 | `oriTaxExcludedAmount` | oriTaxExcludedAmount | `ori_tax_excluded_amount` | Decimal | `number` |
| 91 | `oriTaxExcludedPrice` | oriTaxExcludedPrice | `ori_tax_excluded_price` | Decimal | `number` |
| 92 | `oriTaxIncludedAmount` | oriTaxIncludedAmount | `ori_tax_included_amount` | Decimal | `number` |
| 93 | `oriTaxIncludedPrice` | oriTaxIncludedPrice | `ori_tax_included_price` | Decimal | `number` |
| 94 | `payAgreement` | payAgreement | `pay_agreement_id` | 3cce8052-512e-4e51-9b6e-57adff40948c | `quote` |
| 95 | `proCenter` | proCenter | `procenter_id` | e33ec72a-3857-4167-89e2-a437168ed3bb | `quote` |
| 96 | `project` | project | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |
| 97 | `purchaseSubject` | purchaseSubject | `purchase_subject_id` | b56c7f52-183c-4cea-a310-d6ee902365af | `quote` |
| 98 | `purchaseSubjectVid` | purchaseSubjectVid | `purchase_subject_vid` | ce8d451a-3779-4a48-ba8b-894e68a87fed | `quote` |
| 99 | `quantity` | 数量 | `quantity` | Decimal | `number` |
| 100 | `quickType` | quickType | `quick_type_id` | 14b092f3-5d27-4a47-82a0-d6bad074c9f1 | `quote` |
| 101 | `remainQuantity` | remainQuantity | `remain_quantity` | Decimal | `number` |
| 102 | `remarks` | remarks | `remarks` | String | `text` |
| 103 | `rowNo` | rowNo | `row_no` | Decimal | `number` |
| 104 | `settleSubject` | settleSubject | `settle_subject_id` | b56c7f52-183c-4cea-a310-d6ee902365af | `quote` |
| 105 | `settleSubjectVid` | settleSubjectVid | `settle_subject_vid` | ce8d451a-3779-4a48-ba8b-894e68a87fed | `quote` |
| 106 | `srcBillId` | srcBillID | `src_bill_id` | String | `text` |
| 107 | `srcBillNo` | srcBillNo | `src_bill_no` | String | `text` |
| 108 | `srcBillRowId` | srcBillRowID | `src_bill_row_id` | String | `text` |
| 109 | `srcBillType` | srcBillType | `src_bill_type` | 4a227650-b866-4f4c-a6ca-2433297a1713 | `quote` |
| 110 | `srcBody` | srcBody | `src_body_id` | String | `text` |
| 111 | `srcDataId` | srcDataID | `src_data_id` | String | `text` |
| 112 | `srcDataType` | srcDataType | `src_data_type` | String | `text` |
| 113 | `srcOrderId` | srcOrderID | `src_order_id` | String | `text` |
| 114 | `srcOrderRowId` | srcOrderRowID | `src_order_row_id` | String | `text` |
| 115 | `srcOrderRowNo` | srcOrderRowNo | `src_order_row_no` | Decimal | `number` |
| 116 | `staff` | staff | `staff_id` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a | `quote` |
| 117 | `taxCode` | tax编码 | `tax_code_id` | 3f7c3856-5b00-4506-b458-a64eed0d3bfb | `quote` |
| 118 | `taxInBuffSubject` | taxInBuffSubject | `tax_in_buff_subject_id` | b56c7f52-183c-4cea-a310-d6ee902365af | `quote` |
| 119 | `taxInBuffSubjectVid` | taxInBuffSubjectVid | `tax_in_buff_subject_vid` | ce8d451a-3779-4a48-ba8b-894e68a87fed | `quote` |
| 120 | `taxInSubject` | taxInSubject | `tax_in_subject_id` | b56c7f52-183c-4cea-a310-d6ee902365af | `quote` |
| 121 | `taxInSubjectVid` | taxInSubjectVid | `tax_in_subject_vid` | ce8d451a-3779-4a48-ba8b-894e68a87fed | `quote` |
| 122 | `taxRate` | taxRate | `tax_rate` | Decimal | `number` |
| 123 | `taxSubject` | taxSubject | `tax_subject_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |
| 124 | `unit` | unit | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 125 | `writeOffSrcDataId` | writeOffSrcDataID | `write_off_src_data_id` | String | `text` |
| 126 | `taxGrandsonItem` | taxGrandsonItem | `` | bded7d4f-a855-4be6-82b4-4de4ef7a01c7 | `` |
| 127 | `grandsonItem` | grandsonItem | `` | b44a55a8-d0ac-4eef-9380-1574a4ec8bb0 | `` |
| 128 | `withHoldingTax` | withHoldingTax | `` | 073e6165-e9fe-4cb9-b50c-4734f3e0b401 | `` |
| 129 | `sourceCode` | source编码 | `sourcecode` | String | `text` |
| 130 | `bizFlowInstanceId` | bizFlowInstanceID | `bizflowinstance_id` | String | `text` |
| 131 | `bizFlowMakeBillCode` | bizFlowMakeBill编码 | `bizflow_makebillcode` | String | `text` |
| 132 | `sourceChildId` | sourceChildID | `sourcechild_id` | String | `text` |
| 133 | `sourceBusiObj` | sourceBusiObj | `sourcebusiobj` | String | `text` |
| 134 | `bizflowId` | bizflowID | `bizflow_id` | String | `text` |
| 135 | `sourceId` | sourceID | `source_id` | String | `text` |
| 136 | `bizflowName` | bizflow名称 | `bizflowname` | String | `text` |
| 137 | `firstId` | firstID | `first_id` | String | `text` |
| 138 | `firstCode` | first编码 | `firstcode` | String | `text` |
| 139 | `sourceGrandId` | sourceGrandID | `sourcegrand_id` | String | `text` |
| 140 | `firstBusiObj` | firstBusiObj | `firstbusiobj` | String | `text` |
| 141 | `firstChildId` | firstChildID | `firstchild_id` | String | `text` |
| 142 | `orgWhtaxAmount` | orgWhtaxAmount | `org_whtax_amount` | Decimal | `number` |
| 143 | `grpWhtaxAmount` | grpWhtaxAmount | `grp_whtax_amount` | Decimal | `number` |
| 144 | `oriWhtaxAmount` | oriWhtaxAmount | `ori_whtax_amount` | Decimal | `number` |
| 145 | `whtax` | whtax | `whtax_id` | aaae292d-ebbc-4b8f-a9f7-b67bff16c947 | `quote` |
| 146 | `accWhtaxAmount` | accWhtaxAmount | `acc_whtax_amount` | Decimal | `number` |
| 147 | `gblWhtaxAmount` | gblWhtaxAmount | `gbl_whtax_amount` | Decimal | `number` |
| 148 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 149 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 150 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 151 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 152 | `grpArapAmount` | grpArapAmount | `grp_arap_amount` | Decimal | `number` |
| 153 | `accArapAmount` | accArapAmount | `acc_arap_amount` | Decimal | `number` |
| 154 | `orgArapAmount` | orgArapAmount | `org_arap_amount` | Decimal | `number` |
| 155 | `gblArapAmount` | gblArapAmount | `gbl_arap_amount` | Decimal | `number` |
| 156 | `oriArapAmount` | oriArapAmount | `ori_arap_amount` | Decimal | `number` |
| 157 | `blnCarryover` | blnCarryover | `bln_carryover` | Short | `short` |
| 158 | `carryoverBody` | carryoverBody | `carryover_body_id` | String | `text` |
| 159 | `carryoverYearCode` | carryoverYear编码 | `carryover_year_code` | String | `text` |
| 160 | `carryoverEvent` | carryoverEvent | `carryover_event_id` | String | `text` |
| 161 | `carryoverPeriod` | carryoverPeriod | `carryover_period_id` | 0028813f-135a-485e-a5c3-c15a3d18168b | `quote` |
| 162 | `carryoverYear` | carryoverYear | `carryover_year_id` | 0028813f-135a-485e-a5c3-c15a3d18168b | `quote` |
| 163 | `carryoverPeriodCode` | carryoverPeriod编码 | `carryover_period_code` | String | `text` |
| 164 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 165 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 166 | `activity` | activity | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 | `quote` |
| 167 | `wbs` | wbs | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 | `quote` |
| 168 | `id` | ID | `id` | String | `text` |
| 169 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |

## 关联（51 个）

- `orgExchangeRateType` -> `bd.exchangeRate.ExchangeRateTypeVO` () [废]
- `oriCurrency` -> `bd.currencytenant.CurrencyTenantVO` () [废]
- `financeOrg` -> `org.func.FinanceOrg` () [废]
- `whtax` -> `taxpubdoc.taxWithholding.taxWithholdingCode` () 
- `modifier` -> `base.user.BipUser` () 
- `project` -> `bd.project.ProjectVO` () [废]
- `wbs` -> `BGDM.wbs.wbs_doc` () 
- `purchaseSubjectVid` -> `epub.subjectversion.AccsubjectVersion` () [废]
- `inventoryOrg` -> `org.func.InventoryOrg` () [废]
- `settleSubject` -> `epub.subject.AccSubject` () [废]
- `accYear` -> `bd.period.Period` () [废]
- `invoiceType` -> `bd.invoice.InvoiceTypeVO` () [废]
- `grpExchangeRateType` -> `bd.exchangeRate.ExchangeRateTypeVO` () [废]
- `taxSubject` -> `archive.taxArchives.TaxRateArchive` () [废]
- `withHoldingTax` -> `FIAP.FIAP.APPublicEventWithHoldingTax` (0..n) 
- `costCenter` -> `bd.costcenter.CostCenter` () [废]
- `carryoverYear` -> `bd.period.Period` () 
- `eventType` -> `eeac.fievent.FiEventDO` () [废]
- `freeChId` -> `FIAP.FIAP.APPublicEventBodyfreeItemUserDefine` () [废]
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `taxCode` -> `taxpubdoc.taxengine.TaxCode` () [废]
- `srcBillType` -> `bd.bill.BillTypeVO` () [废]
- `billOrg` -> `org.func.FinanceOrg` () [废]
- `grandsonItem` -> `FIAP.FIAP.APPublicEventGrandson` (0..n) 
- `taxGrandsonItem` -> `FIAP.FIAP.APPublicEventTaxCalculationResult` (0..n) 
- `settleSubjectVid` -> `epub.subjectversion.AccsubjectVersion` () [废]
- `unit` -> `pc.unit.Unit` () [废]
- `accBook` -> `epub.accountbook.AccountBook` () [废]
- `oriBillType` -> `bd.bill.BillTypeVO` () [废]
- `oppProCenter` -> `bd.virtualaccbody.VirtualAccbody` () [废]
- `expenseItem` -> `bd.expenseitem.ExpenseItem` () [废]
- `proCenter` -> `bd.virtualaccbody.VirtualAccbody` () [废]
- `taxInBuffSubject` -> `epub.subject.AccSubject` () [废]
- `activity` -> `pgrm.projecttask.ProjectScheduleTask` () 
- `quickType` -> `bd.paymenttype.PaymentTypeVO` () [废]
- `taxInBuffSubjectVid` -> `epub.subjectversion.AccsubjectVersion` () [废]
- `event` -> `FIAP.FIAP.APPublicEvent` (0..n) [废]
- `amountOrg` -> `org.func.FinanceOrg` () [废]
- `creator` -> `base.user.BipUser` () 
- `accExchangeRateType` -> `bd.exchangeRate.ExchangeRateTypeVO` () [废]
- `taxInSubject` -> `epub.subject.AccSubject` () [废]
- `carryoverPeriod` -> `bd.period.Period` () 
- `staff` -> `bd.staff.StaffNew` () [废]
- `dept` -> `bd.adminOrg.AdminOrgVO` () [废]
- `gblExchangeRateType` -> `bd.exchangeRate.ExchangeRateTypeVO` () [废]
- `purchaseSubject` -> `epub.subject.AccSubject` () [废]
- `accPeriod` -> `bd.period.Period` () [废]
- `payAgreement` -> `bd.payments.PayAgreement` () [废]
- `enterpriseCashAccount` -> `bd.enterprise.OrgFinCashacctVO` () [废]
- `material` -> `pc.product.Product` () [废]
- `taxInSubjectVid` -> `epub.subjectversion.AccsubjectVersion` () [废]
