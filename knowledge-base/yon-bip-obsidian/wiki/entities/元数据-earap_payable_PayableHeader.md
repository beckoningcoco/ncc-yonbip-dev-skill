---
tags: [BIP, 元数据, 数据字典, earap.payable.PayableHeader]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 应付结算清单基本信息 (`earap.payable.PayableHeader`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `ap_payable_h` | 应用: `STB`

## 属性（92 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `invoiceType` | invoiceType | `invoice_type_id` | 3a762abb-858d-4fc4-a60e-4850edf0ab1b | `quote` |
| 2 | `supplier` | supplier | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 3 | `org` | org | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 4 | `cooperater` | cooperater | `cooperater` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 5 | `freeChId` | freeChID | `free_ch_id` | 403a5724-3f14-481f-86d5-147147eda49b | `UserDefine` |
| 6 | `oriTaxExcludedAmount` | oriTaxExcludedAmount | `ori_tax_excluded_amount` | Decimal | `number` |
| 7 | `partner` | partner | `partner_id` | c1627369-6457-4828-883d-756b79bd0f46 | `quote` |
| 8 | `invoiceCode` | invoice编码 | `invoice_code` | String | `text` |
| 9 | `cooperateState` | cooperateState | `cooperate_state` | STB_BillCooperationConfirmStateEnum | `singleOption` |
| 10 | `invoiceDate` | invoiceDate | `invoice_date` | String | `date` |
| 11 | `contractNo` | 合同编号 | `contract_no` | String | `text` |
| 12 | `cooperateFlag` | cooperateFlag | `cooperate_flag` | STB_BillCooperationFlagEnum | `singleOption` |
| 13 | `retailer` | retailer | `retailer_name` | String | `text` |
| 14 | `bustype` | bustype | `bus_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |
| 15 | `srcSystem` | srcSystem | `src_system` | STB_SrcSystemEnum | `singleOption` |
| 16 | `businessType` | businessType | `business_type` | STB_BusinessTypeEnum | `singleOption` |
| 17 | `cooperateTime` | cooperateTime | `cooperate_time` | Date | `dateTime` |
| 18 | `billType` | 票据类型 | `bill_type_id` | 4a227650-b866-4f4c-a6ca-2433297a1713 | `quote` |
| 19 | `staff` | staff | `staff_id` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a | `quote` |
| 20 | `orderNo` | orderNo | `order_no` | String | `text` |
| 21 | `oriTaxIncludedAmount` | oriTaxIncludedAmount | `ori_tax_included_amount` | Decimal | `number` |
| 22 | `agreement` | agreement | `pay_agreement_id` | 3cce8052-512e-4e51-9b6e-57adff40948c | `quote` |
| 23 | `srcBillId` | srcBillID | `src_bill_id` | String | `text` |
| 24 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 25 | `objectType` | objectType | `object_type` | STB_ObjectTypeApEnum | `singleOption` |
| 26 | `funder` | funder | `funder_id` | e969728a-efe8-49db-86b0-5f8e18c2f098 | `quote` |
| 27 | `financeOrg` | financeOrg | `finance_org_id` | 5d4c5590-da40-4b50-80a1-8d04da2f79e0 | `quote` |
| 28 | `employee` | employee | `employee_id` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a | `quote` |
| 29 | `dept` | dept | `dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 30 | `srcBillType` | srcBillType | `src_bill_type` | String | `text` |
| 31 | `project` | project | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |
| 32 | `localTaxExcludedAmount` | localTaxExcludedAmount | `local_tax_excluded_amount` | Decimal | `number` |
| 33 | `extSystemCode` | extSystem编码 | `ext_system_code` | String | `text` |
| 34 | `code` | 编码 | `bill_code` | String | `text` |
| 35 | `localTaxIncludedAmount` | localTaxIncludedAmount | `local_tax_included_amount` | Decimal | `number` |
| 36 | `direction` | direction | `direction` | STB_DirectionEnum | `singleOption` |
| 37 | `extVouchCode` | extVouch编码 | `ext_vouch_code` | String | `text` |
| 38 | `invoiceNo` | invoiceNo | `invoice_no` | String | `text` |
| 39 | `billDate` | billDate | `bill_date` | String | `text` |
| 40 | `srcApp` | srcApp | `src_app_id` | a38a641a-6992-46cc-b8b8-55da8d2d07c9 | `quote` |
| 41 | `status` | 状态 | `status` | STB_BillStatusEnum | `singleOption` |
| 42 | `postStatus` | postStatus | `busi_post_status` | STB_PostStatusEnum | `singleOption` |
| 43 | `oriCurrency` | oriCurrency | `ori_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 44 | `orgCurrency` | orgCurrency | `org_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 45 | `exchangeRateType` | exchangeRateType | `exchange_rate_type_id` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |
| 46 | `exchangeRateDate` | exchangeRateDate | `exchange_rate_date` | String | `date` |
| 47 | `exchangeRate` | exchangeRate | `exchange_rate` | Decimal | `number` |
| 48 | `blnWriteOff` | blnWriteOff | `bln_write_off` | Boolean | `switch` |
| 49 | `writeOffState` | writeOffState | `write_off_state` | STB_WriteOffStateEnum | `singleOption` |
| 50 | `effectState` | effectState | `effect_state` | STB_EffectEnum | `singleOption` |
| 51 | `effectTime` | effectTime | `effect_time` | Date | `dateTime` |
| 52 | `auditDate` | auditDate | `audit_date` | Date | `dateTime` |
| 53 | `remarks` | remarks | `remarks` | String | `text` |
| 54 | `dtcStatus` | dtcStatus | `dtc_status` | Integer | `int` |
| 55 | `dtcGtxId` | dtcGtxID | `dtc_gtxid` | String | `text` |
| 56 | `eeacVersion` | eeacVersion | `eeac_version` | Integer | `int` |
| 57 | `accountingMethod` | accountingMethod | `accounting_method` | AccountingMethodEnum | `singleOption` |
| 58 | `taxMethod` | taxMethod | `tax_method` | TaxMethod_C | `singleOption` |
| 59 | `printCount` | printCount | `print_count` | Integer | `int` |
| 60 | `previewPrintCount` | previewPrintCount | `preview_print_count` | Integer | `int` |
| 61 | `directPrintCount` | directPrintCount | `direct_print_count` | Integer | `int` |
| 62 | `exchangeRateOps` | exchangeRateOps | `exchange_rate_ops` | STB_ExchangeRateOpsEnum | `singleOption` |
| 63 | `activity` | activity | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 | `quote` |
| 64 | `approvalTasks` | approvalTasks | `` | 26c26c12-1e81-4bdc-b4c1-374f3f1a3d11 | `` |
| 65 | `auditNote` | auditNote | `auditnote` | String | `text` |
| 66 | `auditTime` | auditTime | `audit_time` | DateTime | `dateTime` |
| 67 | `auditor` | auditor | `auditor` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 68 | `bizFlowInstanceId` | bizFlowInstanceID | `bizflowinstance_id` | String | `text` |
| 69 | `bizFlowMakeBillCode` | bizFlowMakeBill编码 | `bizflow_makebillcode` | String | `text` |
| 70 | `bizflowId` | bizflowID | `bizflow_id` | String | `text` |
| 71 | `bizflowName` | bizflow名称 | `bizflowname` | String | `text` |
| 72 | `bodyItem` | bodyItem | `` | b32666f6-353f-4f31-bca7-d17de7bb53e8 | `` |
| 73 | `bpmSteps` | bpmSteps | `` | 4a8b1611-ab2a-426d-a173-a3cc1716b4f3 | `` |
| 74 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 75 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 76 | `firstBusiObj` | firstBusiObj | `firstbusiobj` | String | `text` |
| 77 | `firstChildId` | firstChildID | `firstchild_id` | String | `text` |
| 78 | `firstCode` | first编码 | `firstcode` | String | `text` |
| 79 | `firstId` | firstID | `first_id` | String | `text` |
| 80 | `id` | ID | `id` | String | `text` |
| 81 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 82 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 83 | `procinstId` | procinstID | `procinst_id` | String | `text` |
| 84 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 85 | `sourceBusiObj` | sourceBusiObj | `sourcebusiobj` | String | `text` |
| 86 | `sourceChildId` | sourceChildID | `sourcechild_id` | String | `text` |
| 87 | `sourceCode` | source编码 | `sourcecode` | String | `text` |
| 88 | `sourceGrandId` | sourceGrandID | `sourcegrand_id` | String | `text` |
| 89 | `sourceId` | sourceID | `source_id` | String | `text` |
| 90 | `verifyState` | verifyState | `verifystate` | sys_verifystate | `singleOption` |
| 91 | `wbs` | wbs | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 | `quote` |
| 92 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（28 个）

- `funder` -> `tmsp.fundbusinobjarchives.FundBusinObjArchives` () [废]
- `oriCurrency` -> `bd.currencytenant.CurrencyTenantVO` () [废]
- `financeOrg` -> `org.func.FinanceOrg` () [废]
- `activity` -> `pgrm.projecttask.ProjectScheduleTask` () 
- `modifier` -> `base.user.BipUser` () 
- `project` -> `bd.project.ProjectVO` () [废]
- `wbs` -> `BGDM.wbs.wbs_doc` () 
- `employee` -> `bd.staff.StaffNew` () [废]
- `supplier` -> `aa.vendor.Vendor` () [废]
- `invoiceType` -> `bd.invoice.InvoiceTypeVO` () [废]
- `orgCurrency` -> `bd.currencytenant.CurrencyTenantVO` () [废]
- `creator` -> `base.user.BipUser` () [废]
- `bodyItem` -> `earap.payable.PayableBody` (0..n) 
- `agreement` -> `bd.payments.PayAgreement` () [废]
- `org` -> `org.func.BaseOrg` () [废]
- `billType` -> `bd.bill.BillTypeVO` () [废]
- `cooperater` -> `base.user.BipUser` () [废]
- `approvalTasks` -> `earap.payable.PayableApprovalTask` (0..n) 
- `auditor` -> `base.user.BipUser` () 
- `staff` -> `bd.staff.StaffNew` () [废]
- `dept` -> `bd.adminOrg.AdminOrgVO` () [废]
- `freeChId` -> `earap.payable.PayableHeaderfreeChIdUserDefine` () [废]
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `srcApp` -> `STB.sourceapplication.SourceApplication` () [废]
- `bustype` -> `bd.bill.TransType` () [废]
- `exchangeRateType` -> `bd.exchangeRate.ExchangeRateTypeVO` () [废]
- `partner` -> `base.businesspartner.BusinessPartner` () [废]
- `bpmSteps` -> `earap.payable.PayableBpmStep` (0..n) 
