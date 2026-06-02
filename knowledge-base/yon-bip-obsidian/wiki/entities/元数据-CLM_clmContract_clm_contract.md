---
tags: [BIP, 元数据, 数据字典, CLM.clmContract.clm_contract]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 合同登记 (`CLM.clmContract.clm_contract`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `clm_contract` | 应用: `CLM`

## 属性（143 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `appendix` | appendix | `appendix` | String | `attachment` |
| 2 | `applyStandardTpl` | applyStandardTpl | `apply_standard_tpl` | isOnOrYes | `singleOption` |
| 3 | `bWatermark` | bWatermark | `b_watermark` | bWatermark | `singleOption` |
| 4 | `backDateCause` | backDateCause | `back_date_cause` | String | `text` |
| 5 | `beginningFlag` | beginningFlag | `beginning_flag` | isOnOrYes | `singleOption` |
| 6 | `billtypeCode` | billtype编码 | `billtype_code` | String | `text` |
| 7 | `billtypeId` | billtypeID | `billtype_id` | 4a227650-b866-4f4c-a6ca-2433297a1713 | `quote` |
| 8 | `businessFileId` | businessFileID | `business_file_id` | String | `text` |
| 9 | `bustype` | bustype | `bustype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |
| 10 | `changeContractId` | changeContractID | `change_contract_id` | String | `text` |
| 11 | `changeCreateDate` | changeCreateDate | `change_create_date` | String | `date` |
| 12 | `changeCreator` | changeCreator | `change_creator` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a | `quote` |
| 13 | `changeStatus` | changeStatus | `change_status` | changeState | `singleOption` |
| 14 | `changeTimes` | changeTimes | `change_times` | Integer | `int` |
| 15 | `clmContractFileId` | clmContractFileID | `clm_contract_file_id` | ef3d136e-a9f0-45e2-ab61-1ccea4370646 | `quote` |
| 16 | `concludeType` | concludeType | `conclude_type` | concludeType | `singleOption` |
| 17 | `contractFileStatus` | contractFileStatus | `contract_file_status` | placeFileState | `singleOption` |
| 18 | `contractId` | contractID | `contract_id` | 4ff7bde2-8785-4e13-9109-a6d4d0c0c25e | `quote` |
| 19 | `contractJournalId` | contractJournalID | `contract_journal_id` | String | `text` |
| 20 | `createMethod` | createMethod | `create_method` | contractCreateMethod | `singleOption` |
| 21 | `ctClass` | ctClass | `ct_class` | ctClass | `singleOption` |
| 22 | `ctPeriod` | ctPeriod | `ct_period` | period | `singleOption` |
| 23 | `ctSummary` | ctSummary | `ct_summary` | String | `text` |
| 24 | `currencyId` | currencyID | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 25 | `deptId` | deptID | `dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 26 | `econtractStatus` | econtractStatus | `econtract_status` | econtractState | `singleOption` |
| 27 | `econtractTempCode` | econtractTemp编码 | `econtractTemp_Code` | String | `text` |
| 28 | `econtractTempId` | econtractTempID | `econtract_temp_id` | 2a45fe2c-202e-46a1-ba09-2f4ea704ae2b | `quote` |
| 29 | `econtractVersion` | econtractVersion | `econtract_version` | String | `text` |
| 30 | `efileMode` | efileMode | `efile_mode` | contractFileMode_C | `singleOption` |
| 31 | `exchangeRate` | exchangeRate | `exchange_rate` | Decimal | `number` |
| 32 | `feature` | feature | `feature` | 0e76c570-1ca6-4fb1-afc1-9ee5b39e4871 | `UserDefine` |
| 33 | `finalizeStatus` | finalizeStatus | `finalize_status` | finalizeStatus | `singleOption` |
| 34 | `finishFile` | finishFile | `finish_file` | String | `attachment` |
| 35 | `groupId` | groupID | `group_id` | 4c202967-83b6-4bc2-8c87-739ebb342000 | `quote` |
| 36 | `haveTaxMny` | haveTaxMny | `have_tax_mny` | Decimal | `number` |
| 37 | `importantLevel` | importantLevel | `important_level` | importantLevel | `singleOption` |
| 38 | `invaliCause` | invaliCause | `invali_cause` | String | `text` |
| 39 | `invaliDate` | invaliDate | `invali_date` | String | `date` |
| 40 | `isBackDate` | 是否BackDate | `is_back_date` | isOnOrYes | `singleOption` |
| 41 | `isEcontract` | 是否Econtract | `is_econtract` | isEcontract | `singleOption` |
| 42 | `isHaveTax` | 是否HaveTax | `is_have_tax` | isOnOrYes | `singleOption` |
| 43 | `isMaterial` | 是否Material | `is_material` | isOnOrYes | `singleOption` |
| 44 | `isOpenContract` | 是否OpenContract | `is_open_contract` | isOnOrYes | `singleOption` |
| 45 | `isReturnConfirm` | 是否ReturnConfirm | `is_return_confirm` | isOnOrYes | `singleOption` |
| 46 | `label` | label | `label` | String | `text` |
| 47 | `lawType` | lawType | `law_type` | 402cfddf-275b-409e-b1d7-4289e0e0e983 | `quote` |
| 48 | `maintenanceType` | maintenanceType | `maintenance_type` | maintenanceType | `singleOption` |
| 49 | `memo` | 备注 | `memo` | String | `text` |
| 50 | `mny` | mny | `mny` | Decimal | `number` |
| 51 | `mnyWords` | mnyWords | `mny_words` | String | `text` |
| 52 | `noTaxMny` | noTaxMny | `no_tax_mny` | Decimal | `number` |
| 53 | `offStandardCause` | offStandardCause | `off_standard_cause` | String | `text` |
| 54 | `offStandardFile` | offStandardFile | `off_standard_file` | String | `text` |
| 55 | `oriCurrencyId` | oriCurrencyID | `ori_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 56 | `oriDeptId` | oriDeptID | `ori_dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 57 | `oriHaveTaxMny` | oriHaveTaxMny | `ori_have_tax_mny` | Decimal | `number` |
| 58 | `oriNoTaxMny` | oriNoTaxMny | `ori_no_tax_mny` | Decimal | `number` |
| 59 | `oriPersonId` | oriPersonID | `ori_person_id` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a | `quote` |
| 60 | `oriTaxAmount` | oriTaxAmount | `ori_tax_amount` | Decimal | `number` |
| 61 | `overPayRatio` | overPayRatio | `over_pay_ratio` | Decimal | `number` |
| 62 | `performAddress` | performAddress | `perform_address` | String | `text` |
| 63 | `personId` | personID | `person_id` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a | `quote` |
| 64 | `physicalStamp` | physicalStamp | `physical_stamp` | afe79067-b165-4c2f-b19e-6740b75e1e1e | `quote` |
| 65 | `planInvallidate` | planInvallidate | `plan_invallidate` | String | `date` |
| 66 | `planValidate` | planValidate | `plan_validate` | String | `date` |
| 67 | `projectId` | projectID | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |
| 68 | `rateDate` | rateDate | `rate_date` | String | `date` |
| 69 | `rateType` | rateType | `rate_type` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |
| 70 | `reDirection` | reDirection | `re_direction` | reDirection | `singleOption` |
| 71 | `repleFile` | repleFile | `reple_file` | String | `text` |
| 72 | `returnConfirmStatus` | returnConfirmStatus | `return_confirm_status` | ReturnConfirmStatusEnum | `singleOption` |
| 73 | `secretLevel` | secretLevel | `secret_level` | String | `text` |
| 74 | `secretLimit` | secretLimit | `secret_limit` | String | `text` |
| 75 | `serialNumber` | serialNumber | `serial_number` | String | `text` |
| 76 | `settleAccountType` | settleAccountType | `settle_account_type` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff | `quote` |
| 77 | `settleOrgid` | settleOrgid | `settle_orgid` | 5d4c5590-da40-4b50-80a1-8d04da2f79e0 | `quote` |
| 78 | `signAddress` | signAddress | `sign_address` | String | `text` |
| 79 | `signDate` | signDate | `sign_date` | String | `date` |
| 80 | `signEcontractFile` | signEcontractFile | `sign_econtract_file` | String | `text` |
| 81 | `signPaperFile` | signPaperFile | `sign_paper_file` | String | `text` |
| 82 | `signPriority` | signPriority | `sign_priority` | signSort | `singleOption` |
| 83 | `signProcessId` | signProcessID | `sign_process_id` | String | `text` |
| 84 | `signSubjectId` | signSubjectID | `sign_subject_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 85 | `signType` | signType | `sign_type` | signType | `singleOption` |
| 86 | `sourceSys` | sourceSys | `source_sys` | clmSourceSys | `singleOption` |
| 87 | `stampStatus` | stampStatus | `stamp_status` | stampStatus | `singleOption` |
| 88 | `status` | 状态 | `status` | contractStatus | `singleOption` |
| 89 | `submitCsFile` | submitCsFile | `submit_cs_file` | String | `attachment` |
| 90 | `sysEffectiveDate` | sysEffectiveDate | `sys_effective_date` | String | `date` |
| 91 | `sysOffDate` | sysOffDate | `sys_off_date` | String | `date` |
| 92 | `targetSys` | targetSys | `target_sys` | targetSys | `singleOption` |
| 93 | `taxAmount` | taxAmount | `tax_amount` | Decimal | `number` |
| 94 | `title` | title | `title` | String | `text` |
| 95 | `type` | type | `type` | b23c8bcc-9978-44fb-a5d5-b54d687b59bb | `quote` |
| 96 | `urgentLevel` | urgentLevel | `urgent_level` | urgentLevel | `singleOption` |
| 97 | `valiDate` | valiDate | `vali_date` | String | `date` |
| 98 | `version` | 版本号 | `version` | String | `text` |
| 99 | `eprojectInitiationStatus` | eprojectInitiationStatus | `eproject_initiation_status` | projectInitiationStatus | `singleOption` |
| 100 | `exchangeRateOps` | exchangeRateOps | `exchange_rate_ops` | ExchangeRateMethod | `singleOption` |
| 101 | `customerId` | customerID | `customer_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 102 | `supplierId` | supplierID | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 103 | `activity` | activity | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 | `quote` |
| 104 | `wbs` | wbs | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 | `quote` |
| 105 | `clmContractBpmStepList` | clmContractBpmStepList | `` | 4ad18d2f-cbbf-4fab-9fc8-70d0d768c83e | `` |
| 106 | `clmContractWorkflowList` | clmContractWorkflowList | `` | 366be46b-e927-4e3c-b325-00f7e419043a | `` |
| 107 | `clmEventRecordList` | clmEventRecordList | `` | ba91ff16-2193-48b2-995f-fd78be2336e0 | `` |
| 108 | `clmContractRiskRecordList` | clmContractRiskRecordList | `` | effb4388-a752-4a91-90ee-becf9b0d2c2b | `` |
| 109 | `clm_appointmentList` | clm_appointmentList | `` | 24e33906-ca4f-4076-bcff-7829fe095c4f | `` |
| 110 | `clm_contract_status_flowList` | clm_contract_status_flowList | `` | 3f2a5548-249a-41e4-a00e-bd7eccee4092 | `` |
| 111 | `clm_contract_rectermList` | clm_contract_rectermList | `` | 58d562f4-02be-4292-a87d-d666eaadd936 | `` |
| 112 | `clm_contract_paytermList` | clm_contract_paytermList | `` | a9b87a7a-5ef1-4e45-8234-f26a3495f3e7 | `` |
| 113 | `clm_contract_itemList` | clm_contract_itemList | `` | 33d27936-d172-44d3-bb6e-ac60096d3412 | `` |
| 114 | `clm_contract_counterpartList` | clm_contract_counterpartList | `` | f74724b4-0be6-46f7-907a-1f183b014fe6 | `` |
| 115 | `auditNote` | auditNote | `auditnote` | String | `text` |
| 116 | `auditTime` | auditTime | `audit_time` | DateTime | `dateTime` |
| 117 | `auditor` | auditor | `auditor` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 118 | `procinstId` | procinstID | `procinst_id` | String | `text` |
| 119 | `verifyState` | verifyState | `verifystate` | sys_verifystate | `singleOption` |
| 120 | `id` | ID | `id` | String | `text` |
| 121 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 122 | `bizFlowInstanceId` | bizFlowInstanceID | `bizflowinstance_id` | String | `text` |
| 123 | `bizFlowMakeBillCode` | bizFlowMakeBill编码 | `bizflow_makebillcode` | String | `text` |
| 124 | `bizflowId` | bizflowID | `bizflow_id` | String | `text` |
| 125 | `bizflowName` | bizflow名称 | `bizflowname` | String | `text` |
| 126 | `sourceBusiObj` | sourceBusiObj | `sourcebusiobj` | String | `text` |
| 127 | `sourceChildId` | sourceChildID | `sourcechild_id` | String | `text` |
| 128 | `sourceCode` | source编码 | `sourcecode` | String | `text` |
| 129 | `sourceId` | sourceID | `source_id` | String | `text` |
| 130 | `firstBusiObj` | firstBusiObj | `firstbusiobj` | String | `text` |
| 131 | `firstChildId` | firstChildID | `firstchild_id` | String | `text` |
| 132 | `firstCode` | first编码 | `firstcode` | String | `text` |
| 133 | `firstId` | firstID | `first_id` | String | `text` |
| 134 | `sourceGrandId` | sourceGrandID | `sourcegrand_id` | String | `text` |
| 135 | `code` | 编码 | `code` | String | `text` |
| 136 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 137 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 138 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 139 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 140 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 141 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 142 | `orgId` | orgID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 143 | `foodListList` | foodListList | `` | a244bcc6-5d39-4d6f-a1ff-d0f2e6cf2407 | `` |

## 关联（42 个）

- `clmContractRiskRecordList` -> `CLM.clmContract.clmContractRiskRecord` (0..n) 
- `clmContractFileId` -> `CLM.clmContract.clmContractFile` () [废]
- `supplierId` -> `aa.vendor.Vendor` () [废]
- `activity` -> `pgrm.projecttask.ProjectScheduleTask` () 
- `groupId` -> `DZHTFW.econtract.contractTypeGroup` () [废]
- `modifier` -> `base.user.BipUser` () 
- `clm_contract_itemList` -> `CLM.clmContract.clm_contract_item` (0..n) 
- `oriCurrencyId` -> `bd.currencytenant.CurrencyTenantVO` () [废]
- `wbs` -> `BGDM.wbs.wbs_doc` () 
- `foodListList` -> `CLM.clmContract.foodList` (0..n) 
- `type` -> `DZHTFW.econtract.contractType` () [废]
- `signSubjectId` -> `aa.baseorg.OrgMV` () [废]
- `orgId` -> `org.func.BaseOrg` () 
- `rateType` -> `bd.exchangeRate.ExchangeRateTypeVO` () [废]
- `settleAccountType` -> `aa.settlemethod.SettleMethod` () [废]
- `feature` -> `CLM.clmContract.clm_contractfeatureUserDefine` () [废]
- `clmEventRecordList` -> `CLM.clmContract.clmEventRecord` (0..n) 
- `clmContractWorkflowList` -> `CLM.clmContract.clmContractWorkflow` (0..n) 
- `customerId` -> `aa.merchant.Merchant` () [废]
- `econtractTempId` -> `DZHTFW.econtract.econtractTemplate` () [废]
- `clm_contract_counterpartList` -> `CLM.clmContract.clm_contract_counterpart` (0..n) 
- `clm_contract_rectermList` -> `CLM.clmContract.clm_contract_recterm` (0..n) 
- `currencyId` -> `bd.currencytenant.CurrencyTenantVO` () [废]
- `lawType` -> `DZHTFW.econtract.contractLegalType` () [废]
- `billtypeId` -> `bd.bill.BillTypeVO` () [废]
- `creator` -> `base.user.BipUser` () 
- `oriPersonId` -> `bd.staff.StaffNew` () [废]
- `physicalStamp` -> `DZHTFW.econtract.physicalStamp` () [废]
- `clm_contract_paytermList` -> `CLM.clmContract.clm_contract_payterm` (0..n) 
- `clmContractBpmStepList` -> `CLM.clmContract.clmContractBpmStep` (0..n) 
- `deptId` -> `bd.adminOrg.AdminOrgVO` () [废]
- `auditor` -> `base.user.BipUser` () 
- `oriDeptId` -> `bd.adminOrg.AdminOrgVO` () [废]
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `bustype` -> `bd.bill.TransType` () [废]
- `changeCreator` -> `bd.staff.StaffNew` () [废]
- `clm_contract_status_flowList` -> `CLM.clmContract.clm_contract_status_flow` (0..n) 
- `contractId` -> `CLM.clmContract.clm_contract` () [废]
- `personId` -> `bd.staff.StaffNew` () [废]
- `clm_appointmentList` -> `CLM.clmContract.clm_appointment` (0..n) 
- `projectId` -> `bd.project.ProjectVO` () [废]
- `settleOrgid` -> `org.func.FinanceOrg` () [废]
