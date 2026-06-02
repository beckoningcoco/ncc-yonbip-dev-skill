---
tags: [BIP, 元数据, 数据字典, 付款, earap.payment.PaymentHeader]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 付款单基本信息 (`earap.payment.PaymentHeader`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `ap_payment_h` | 应用: `EAP`

## 主键与编码

| 角色 | 字段 | 列 |
|------|------|-----|
| 主键 | `id` | `id` |
| 编码 | `code` | `bill_code` |

## 依赖接口（11 个）

- `LogicDelete` -> `iuap.busiObj.LogicDelete` (v211)
- `Code` -> `iuap.busiObj.Code` (v223)
- `BusinessFlowSourcesItf` -> `iuap.busiObj.BusinessFlowSourcesItf` (v800)
- `ApprovalFlowItf` -> `iuap.busiObj.ApprovalFlowItf` (v830)
- `BusinessFlowItf` -> `iuap.busiObj.BusinessFlowItf` (v1221)
- `projectStructureProperties` -> `BGDM.wbs.projectStructureProperties` (v49)
- `BustypeItf` -> `iuap.busiObj.BustypeItf` (v160)
- `IAuditInfo` -> `iuap.busiObj.IAuditInfo` (v679)
- `IYTenant` -> `iuap.busiObj.IYTenant` (v214)
- `IPrintCount` -> `base.itf.IPrintCount` (v66)
- `IPrintCountSplit` -> `base.itf.IPrintCountSplit` (v1)

## 属性（98 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `auditDate` | audit日期 | `audit_date` | Date | `dateTime` |
| 2 | `bustype` | bustype | `bus_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |
| 3 | `billDate` | bill日期 | `bill_date` | String | `date` |
| 4 | `billType` | billType | `bill_type_id` | 4a227650-b866-4f4c-a6ca-2433297a1713 | `quote` |
| 5 | `blnWriteOff` | blnWriteOff | `bln_write_off` | Boolean | `switch` |
| 6 | `businessType` | businessType | `business_type` | BusinessTypeEnum | `singleOption` |
| 7 | `contractNo` | contractNo | `contract_no` | String | `text` |
| 8 | `cooperateFlag` | cooperateFlag | `cooperate_flag` | BillCooperationFlagEnum | `singleOption` |
| 9 | `cooperateState` | cooperateState | `cooperate_state` | BillCooperationConfirmStateEnum | `singleOption` |
| 10 | `cooperateTime` | cooperateTime | `cooperate_time` | Date | `dateTime` |
| 11 | `cooperater` | cooperater | `cooperater` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 12 | `dept` | dept | `dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 13 | `dtcGtxId` | dtcGtxID | `dtc_gtxid` | String | `text` |
| 14 | `dtcStatus` | dtcStatus | `dtc_status` | Integer | `int` |
| 15 | `eeacVersion` | eeacVersion | `eeac_version` | Long | `long` |
| 16 | `effectState` | effectState | `effect_state` | EffectEnum | `singleOption` |
| 17 | `effectTime` | effectTime | `effect_time` | Date | `dateTime` |
| 18 | `employee` | employee | `employee_id` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a | `quote` |
| 19 | `employeeBankAccount` | employeeBankAccount | `employee_bank_account_id` | e1db328d-c25b-49de-8aad-33400dc10e4b | `quote` |
| 20 | `enterpriseBankAccount` | enterpriseBankAccount | `enterprise_bank_account_id` | fbc20885-a507-45bd-a986-74d3fc28d38a | `quote` |
| 21 | `enterpriseCashAccount` | enterpriseCashAccount | `enterprise_cash_account_id` | 39f4ff02-fea2-4a92-adf2-37d02207f799 | `quote` |
| 22 | `exchangeRate` | exchangeRate | `exchange_rate` | Decimal | `number` |
| 23 | `exchangeRateDate` | exchangeRate日期 | `exchange_rate_date` | String | `date` |
| 24 | `exchangeRateType` | exchangeRateType | `exchange_rate_type_id` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |
| 25 | `extSystemCode` | extSystem编码 | `ext_system_code` | String | `text` |
| 26 | `extVouchCode` | extVouch编码 | `ext_vouch_code` | String | `text` |
| 27 | `financeOrg` | financeOrg | `finance_org_id` | 5d4c5590-da40-4b50-80a1-8d04da2f79e0 | `quote` |
| 28 | `freeChId` | freeChID | `free_ch_id` | 67793ca7-6340-46a7-89bf-6d097a191220 | `UserDefine` |
| 29 | `funder` | funder | `funder_id` | e969728a-efe8-49db-86b0-5f8e18c2f098 | `quote` |
| 30 | `funderBankAccount` | funderBankAccount | `funder_bank_account_id` | c5eba128-e930-4602-897a-30d3a049390e | `quote` |
| 31 | `localTaxExcludedAmount` | localTaxExcludedAmount | `local_tax_excluded_amount` | Decimal | `number` |
| 32 | `localTaxIncludedAmount` | localTaxIncludedAmount | `local_tax_included_amount` | Decimal | `number` |
| 33 | `objectBankAccountNo` | objectBankAccountNo | `object_bank_account_no` | String | `text` |
| 34 | `objectType` | objectType | `object_type` | ObjectTypeApEnum | `singleOption` |
| 35 | `orderNo` | orderNo | `order_no` | String | `text` |
| 36 | `org` | org | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 37 | `orgCurrency` | orgCurrency | `org_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 38 | `oriCurrency` | oriCurrency | `ori_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 39 | `oriOccupyAmount` | oriOccupyAmount | `ori_occupy_amount` | Decimal | `number` |
| 40 | `oriTaxExcludedAmount` | oriTaxExcludedAmount | `ori_tax_excluded_amount` | Decimal | `number` |
| 41 | `oriTaxIncludedAmount` | oriTaxIncludedAmount | `ori_tax_included_amount` | Decimal | `number` |
| 42 | `partner` | partner | `partner_id` | c1627369-6457-4828-883d-756b79bd0f46 | `quote` |
| 43 | `postStatus` | postStatus | `busi_post_status` | PostStatusEnum | `singleOption` |
| 44 | `project` | project | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |
| 45 | `remarks` | remarks | `remarks` | String | `text` |
| 46 | `retailer` | retailer | `retailer_name` | String | `text` |
| 47 | `settleMode` | settleMode | `settle_mode_id` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff | `quote` |
| 48 | `settleState` | settleState | `settle_state` | SettleStateEnum | `singleOption` |
| 49 | `settleStopType` | settleStopType | `settle_stop_type` | SettleStopTypeEnum | `singleOption` |
| 50 | `settleSubmitType` | settleSubmitType | `settle_submit_type` | SettleSubmitTypeEnum | `singleOption` |
| 51 | `shop` | shop | `shop_id` | String | `text` |
| 52 | `srcApp` | srcApp | `src_app_id` | d5737052-9d1e-4cfa-9cab-bee31d88dd8b | `quote` |
| 53 | `srcBillAmount` | srcBillAmount | `src_bill_amount` | Decimal | `number` |
| 54 | `srcBillId` | srcBillID | `src_bill_id` | String | `text` |
| 55 | `srcBillType` | srcBillType | `src_bill_type` | String | `text` |
| 56 | `srcSystem` | srcSystem | `src_system` | SrcSystemEnum | `singleOption` |
| 57 | `staff` | staff | `staff_id` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a | `quote` |
| 58 | `status` | 状态 | `status` | BillStatusEnum | `singleOption` |
| 59 | `supplier` | supplier | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 60 | `supplierBankAccount` | supplierBankAccount | `supplier_bank_account_id` | 4b6dcfa2-1d07-407d-a35a-9b219fadf37c | `quote` |
| 61 | `treasuryOrg` | treasuryOrg | `treasury_org` | 60bf293e-5593-454b-be50-5a5fa016e4a6 | `quote` |
| 62 | `writeOffState` | writeOffState | `write_off_state` | WriteOffStateEnum | `singleOption` |
| 63 | `exchangeRateOps` | exchangeRateOps | `exchange_rate_ops` | Integer | `int` |
| 64 | `bodyItem` | bodyItem | `` | 83697b00-1e51-4a2d-a1d3-13cd2c8003f2 | `` |
| 65 | `approvalTasks` | approvalTasks | `` | 1f94ff2c-a6e6-48e6-9320-45081d916e02 | `` |
| 66 | `bpmSteps` | bpmSteps | `` | 9e73e70a-1bb3-4d02-b761-4c751b8a686f | `` |
| 67 | `bizFlowMakeBillCode` | bizFlowMakeBill编码 | `bizflow_makebillcode` | String | `text` |
| 68 | `sourceChildId` | sourceChildID | `sourcechild_id` | String | `text` |
| 69 | `bizFlowInstanceId` | bizFlowInstanceID | `bizflowinstance_id` | String | `text` |
| 70 | `bizflowId` | bizflowID | `bizflow_id` | String | `text` |
| 71 | `bizflowName` | bizflow名称 | `bizflowname` | String | `text` |
| 72 | `sourceBusiObj` | sourceBusiObj | `sourcebusiObj` | String | `text` |
| 73 | `sourceCode` | source编码 | `sourcecode` | String | `text` |
| 74 | `sourceId` | sourceID | `source_id` | String | `text` |
| 75 | `firstChildId` | firstChildID | `firstchild_id` | String | `text` |
| 76 | `firstBusiObj` | firstBusiObj | `firstbusiobj` | String | `text` |
| 77 | `firstCode` | first编码 | `firstcode` | String | `text` |
| 78 | `firstId` | firstID | `first_id` | String | `text` |
| 79 | `sourceGrandId` | sourceGrandID | `sourcegrand_id` | String | `text` |
| 80 | `auditNote` | auditNote | `auditnote` | String | `text` |
| 81 | `auditTime` | auditTime | `audit_time` | Date | `dateTime` |
| 82 | `auditor` | auditor | `auditor` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 83 | `procinstId` | procinstID | `procinst_id` | String | `text` |
| 84 | `verifyState` | verifyState | `verifystate` | sys_verifystate | `singleOption` |
| 85 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 86 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 87 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 88 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 89 | `directPrintCount` | directPrintCount | `direct_print_count` | Integer | `int` |
| 90 | `previewPrintCount` | previewPrintCount | `preview_print_count` | Integer | `int` |
| 91 | `printCount` | printCount | `print_count` | Integer | `int` |
| 92 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 93 | `code` | 编码 | `bill_code` | String | `text` |
| 94 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 95 | `activity` | activity | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 | `quote` |
| 96 | `wbs` | wbs | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 | `quote` |
| 97 | `id` | ID | `id` | String | `text` |
| 98 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |

## 关联（33 个）

| # | 字段 | 目标实体 | 多重性 | 组合 | 废弃 |
|---|------|---------|--------|------|------|
| 1 | `funder` | `tmsp.fundbusinobjarchives.FundBusinObjArchives` |  |  | false |
| 2 | `oriCurrency` | `bd.currencytenant.CurrencyTenantVO` |  |  | false |
| 3 | `financeOrg` | `org.func.FinanceOrg` |  |  | false |
| 4 | `activity` | `pgrm.projecttask.ProjectScheduleTask` |  |  | false |
| 5 | `modifier` | `base.user.BipUser` |  |  |  |
| 6 | `employeeBankAccount` | `bd.staff.StaffBankAcct` |  |  | false |
| 7 | `project` | `bd.project.ProjectVO` |  |  | false |
| 8 | `wbs` | `BGDM.wbs.wbs_doc` |  |  | false |
| 9 | `employee` | `bd.staff.StaffNew` |  |  | false |
| 10 | `funderBankAccount` | `tmsp.fundbusinobjarchives.FundBusinObjArchivesItem` |  |  | false |
| 11 | `settleMode` | `aa.settlemethod.SettleMethod` |  |  | false |
| 12 | `supplier` | `aa.vendor.Vendor` |  |  | false |
| 13 | `treasuryOrg` | `org.func.FundsOrg` |  |  | false |
| 14 | `orgCurrency` | `bd.currencytenant.CurrencyTenantVO` |  |  | false |
| 15 | `creator` | `base.user.BipUser` |  |  | false |
| 16 | `bodyItem` | `earap.payment.PaymentBody` | 0..n | Y |  |
| 17 | `org` | `org.func.BaseOrg` |  |  | false |
| 18 | `enterpriseBankAccount` | `bd.enterprise.OrgFinBankacctVO` |  |  | false |
| 19 | `billType` | `bd.bill.BillTypeVO` |  |  | false |
| 20 | `cooperater` | `base.user.BipUser` |  |  | false |
| 21 | `approvalTasks` | `earap.payment.PaymentApprovalTask` | 0..n | Y |  |
| 22 | `auditor` | `base.user.BipUser` |  |  | false |
| 23 | `staff` | `bd.staff.StaffNew` |  |  | false |
| 24 | `dept` | `bd.adminOrg.AdminOrgVO` |  |  | false |
| 25 | `freeChId` | `earap.payment.PaymentHeaderfreeChIdUserDefine` |  |  | false |
| 26 | `ytenantId` | `yht.tenant.YhtTenant` |  |  | false |
| 27 | `srcApp` | `epub.sourceapplication.SourceApplication` |  |  | false |
| 28 | `supplierBankAccount` | `aa.vendor.VendorBank` |  |  | false |
| 29 | `bustype` | `bd.bill.TransType` |  |  | false |
| 30 | `exchangeRateType` | `bd.exchangeRate.ExchangeRateTypeVO` |  |  | false |
| 31 | `enterpriseCashAccount` | `bd.enterprise.OrgFinCashacctVO` |  |  | false |
| 32 | `partner` | `base.businesspartner.BusinessPartner` |  |  | false |
| 33 | `bpmSteps` | `earap.payment.PaymentBpmStep` | 0..n | Y |  |
