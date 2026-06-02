---
tags: [BIP, 元数据, 数据字典, CLM.clmContract.clmContractChange]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 合同变更 (`CLM.clmContract.clmContractChange`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `clm_contract_change` | 应用: `CLM`

## 属性（149 个）

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
| 10 | `cause` | cause | `cause` | String | `text` |
| 11 | `changeContractId` | changeContractID | `change_contract_id` | 58c5e448-536c-4fd6-b898-f6cdbaddd6ae | `quote` |
| 12 | `changeCreateDate` | changeCreateDate | `change_create_date` | String | `date` |
| 13 | `changeCreator` | changeCreator | `change_creator` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a | `quote` |
| 14 | `changeFeature` | changeFeature | `change_feature` | f19a3a79-c844-4e13-a0aa-db5a11ceb1aa | `UserDefine` |
| 15 | `changeStatus` | changeStatus | `change_status` | changeState | `singleOption` |
| 16 | `changeTimes` | changeTimes | `change_times` | Integer | `int` |
| 17 | `changeTypeId` | changeTypeID | `change_type_id` | 47dfd7ec-6161-4cc8-aa3b-a4c04bd6c79f | `quoteList` |
| 18 | `changeVersion` | changeVersion | `change_version` | Integer | `int` |
| 19 | `clmContractFileId` | clmContractFileID | `clm_contract_file_id` | ef3d136e-a9f0-45e2-ab61-1ccea4370646 | `quote` |
| 20 | `concludeType` | concludeType | `conclude_type` | concludeType | `singleOption` |
| 21 | `content` | content | `content` | String | `text` |
| 22 | `contractFileStatus` | contractFileStatus | `contract_file_status` | placeFileState | `singleOption` |
| 23 | `contractId` | contractID | `contract_id` | 4ff7bde2-8785-4e13-9109-a6d4d0c0c25e | `quote` |
| 24 | `contractJournalId` | contractJournalID | `contract_journal_id` | String | `text` |
| 25 | `createMethod` | createMethod | `create_method` | contractCreateMethod | `singleOption` |
| 26 | `ctClass` | ctClass | `ct_class` | ctClass | `singleOption` |
| 27 | `ctPeriod` | ctPeriod | `ct_period` | period | `singleOption` |
| 28 | `ctSummary` | ctSummary | `ct_summary` | String | `text` |
| 29 | `currencyId` | currencyID | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 30 | `deptId` | deptID | `dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 31 | `econtractStatus` | econtractStatus | `econtract_status` | econtractState | `singleOption` |
| 32 | `econtractTempCode` | econtractTemp编码 | `econtractTemp_Code` | String | `text` |
| 33 | `econtractTempId` | econtractTempID | `econtract_temp_id` | 2a45fe2c-202e-46a1-ba09-2f4ea704ae2b | `quote` |
| 34 | `econtractVersion` | econtractVersion | `econtract_version` | String | `text` |
| 35 | `efileMode` | efileMode | `efile_mode` | contractFileMode_C | `singleOption` |
| 36 | `exchangeRate` | exchangeRate | `exchange_rate` | Decimal | `number` |
| 37 | `feature` | feature | `feature` | String | `text` |
| 38 | `finalizeStatus` | finalizeStatus | `finalize_status` | finalizeStatus | `singleOption` |
| 39 | `finishFile` | finishFile | `finish_file` | String | `text` |
| 40 | `groupId` | groupID | `group_id` | 4c202967-83b6-4bc2-8c87-739ebb342000 | `quote` |
| 41 | `haveTaxMny` | haveTaxMny | `have_tax_mny` | Decimal | `number` |
| 42 | `importantLevel` | importantLevel | `important_level` | importantLevel | `singleOption` |
| 43 | `invaliCause` | invaliCause | `invali_cause` | String | `text` |
| 44 | `invaliDate` | invaliDate | `invali_date` | String | `date` |
| 45 | `isBackDate` | 是否BackDate | `is_back_date` | isOnOrYes | `singleOption` |
| 46 | `isEcontract` | 是否Econtract | `is_econtract` | isEcontract | `singleOption` |
| 47 | `isHaveTax` | 是否HaveTax | `is_have_tax` | isOnOrYes | `singleOption` |
| 48 | `isMaterial` | 是否Material | `is_material` | isOnOrYes | `singleOption` |
| 49 | `isOpenContract` | 是否OpenContract | `is_open_contract` | isOnOrYes | `singleOption` |
| 50 | `isReturnConfirm` | 是否ReturnConfirm | `is_return_confirm` | isOnOrYes | `singleOption` |
| 51 | `label` | label | `label` | String | `text` |
| 52 | `lawType` | lawType | `law_type` | 402cfddf-275b-409e-b1d7-4289e0e0e983 | `quote` |
| 53 | `maintenanceType` | maintenanceType | `maintenance_type` | maintenanceType | `singleOption` |
| 54 | `memo` | 备注 | `memo` | String | `text` |
| 55 | `mny` | mny | `mny` | Decimal | `number` |
| 56 | `mnyWords` | mnyWords | `mny_words` | String | `text` |
| 57 | `noTaxMny` | noTaxMny | `no_tax_mny` | Decimal | `number` |
| 58 | `offStandardCause` | offStandardCause | `off_standard_cause` | String | `text` |
| 59 | `offStandardFile` | offStandardFile | `off_standard_file` | String | `text` |
| 60 | `oldBusType` | oldBusType | `old_bus_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |
| 61 | `oriCurrencyId` | oriCurrencyID | `ori_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 62 | `oriHaveTaxMny` | oriHaveTaxMny | `ori_have_tax_mny` | Decimal | `number` |
| 63 | `oriNoTaxMny` | oriNoTaxMny | `ori_no_tax_mny` | Decimal | `number` |
| 64 | `oriTaxAmount` | oriTaxAmount | `ori_tax_amount` | Decimal | `number` |
| 65 | `overPayRatio` | overPayRatio | `over_pay_ratio` | Decimal | `number` |
| 66 | `performAddress` | performAddress | `perform_address` | String | `text` |
| 67 | `personId` | personID | `person_id` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a | `quote` |
| 68 | `physicalStamp` | physicalStamp | `physical_stamp` | afe79067-b165-4c2f-b19e-6740b75e1e1e | `quote` |
| 69 | `planInvallidate` | planInvallidate | `plan_invallidate` | String | `date` |
| 70 | `planValidate` | planValidate | `plan_validate` | String | `date` |
| 71 | `projectId` | projectID | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |
| 72 | `rateDate` | rateDate | `rate_date` | String | `date` |
| 73 | `rateType` | rateType | `rate_type` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |
| 74 | `reDirection` | reDirection | `re_direction` | reDirection | `singleOption` |
| 75 | `remark` | remark | `remark` | String | `text` |
| 76 | `repleFile` | repleFile | `reple_file` | String | `text` |
| 77 | `returnConfirmStatus` | returnConfirmStatus | `return_confirm_status` | ReturnConfirmStatusEnum | `singleOption` |
| 78 | `secretLevel` | secretLevel | `secret_level` | String | `text` |
| 79 | `secretLimit` | secretLimit | `secret_limit` | String | `text` |
| 80 | `serialNumber` | serialNumber | `serial_number` | String | `text` |
| 81 | `settleAccountType` | settleAccountType | `settle_account_type` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff | `quote` |
| 82 | `settleOrgid` | settleOrgid | `settle_orgid` | 5d4c5590-da40-4b50-80a1-8d04da2f79e0 | `quote` |
| 83 | `settlementBasis` | settlementBasis | `settlement_basis` | String | `text` |
| 84 | `signAddress` | signAddress | `sign_address` | String | `text` |
| 85 | `signDate` | signDate | `sign_date` | String | `date` |
| 86 | `signEcontractFile` | signEcontractFile | `sign_econtract_file` | String | `text` |
| 87 | `signPaperFile` | signPaperFile | `sign_paper_file` | String | `text` |
| 88 | `signPriority` | signPriority | `sign_priority` | signSort | `singleOption` |
| 89 | `signProcessId` | signProcessID | `sign_process_id` | String | `text` |
| 90 | `signSubjectId` | signSubjectID | `sign_subject_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 91 | `signType` | signType | `sign_type` | signType | `singleOption` |
| 92 | `sourceContractId` | sourceContractID | `source_contract_id` | 4ff7bde2-8785-4e13-9109-a6d4d0c0c25e | `quote` |
| 93 | `sourceSys` | sourceSys | `source_sys` | clmSourceSys | `singleOption` |
| 94 | `stampStatus` | stampStatus | `stamp_status` | stampStatus | `singleOption` |
| 95 | `state` | state | `state` | changeState | `singleOption` |
| 96 | `status` | 状态 | `status` | contractStatus | `singleOption` |
| 97 | `submitCsFile` | submitCsFile | `submit_cs_file` | String | `text` |
| 98 | `sysEffectiveDate` | sysEffectiveDate | `sys_effective_date` | String | `date` |
| 99 | `targetSys` | targetSys | `target_sys` | targetSys | `singleOption` |
| 100 | `taxAmount` | taxAmount | `tax_amount` | Decimal | `number` |
| 101 | `title` | title | `title` | String | `text` |
| 102 | `type` | type | `type` | b23c8bcc-9978-44fb-a5d5-b54d687b59bb | `quote` |
| 103 | `urgentLevel` | urgentLevel | `urgent_level` | urgentLevel | `singleOption` |
| 104 | `valiDate` | valiDate | `vali_date` | String | `date` |
| 105 | `version` | 版本号 | `version` | String | `text` |
| 106 | `way` | way | `way` | changeWay | `singleOption` |
| 107 | `exchangeRateOps` | exchangeRateOps | `exchange_rate_ops` | ExchangeRateMethod | `singleOption` |
| 108 | `customerId` | customerID | `customer_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 109 | `supplierId` | supplierID | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 110 | `activity` | activity | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 | `quote` |
| 111 | `wbs` | wbs | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 | `quote` |
| 112 | `clm_contract_change_rectermList` | clm_contract_change_rectermList | `` | 46433742-44db-4347-9f0b-1fb0bb274c7f | `` |
| 113 | `clm_contract_change_counterpartList` | clm_contract_change_counterpartList | `` | db748d3f-69a7-4106-bc30-396f695ca994 | `` |
| 114 | `clm_contract_change_appointmentList` | clm_contract_change_appointmentList | `` | 468fbc30-c500-4aa0-b329-9036e6520c54 | `` |
| 115 | `clmContractChangeEventsList` | clmContractChangeEventsList | `` | 4be50b26-ac42-40cb-b9da-beff35d39806 | `` |
| 116 | `clm_contract_change_itemList` | clm_contract_change_itemList | `` | 45ecbd04-7997-4cf7-b668-d05142d7fb8a | `` |
| 117 | `clm_contract_change_paytermList` | clm_contract_change_paytermList | `` | de64ecb8-c818-4e77-be55-dfd0cc42b308 | `` |
| 118 | `clmContractChangeBpmStepList` | clmContractChangeBpmStepList | `` | 7bf51f46-e8b3-4425-8513-414b49c11430 | `` |
| 119 | `clm_contract_change_workflowList` | clm_contract_change_workflowList | `` | a66bb0ed-2b8d-4e39-a89a-682ecbc9c7ff | `` |
| 120 | `clm_contract_change_status_flowList` | clm_contract_change_status_flowList | `` | 72883d26-cb3d-4fef-aab3-dea91ad92433 | `` |
| 121 | `clmContractChange_changeTypeIdList` | clmContractChange_changeTypeIdList | `` | a49f45eb-c038-4ab8-8cdb-418115c4e06e | `` |
| 122 | `auditNote` | auditNote | `auditnote` | String | `text` |
| 123 | `auditTime` | auditTime | `audit_time` | DateTime | `dateTime` |
| 124 | `auditor` | auditor | `auditor` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 125 | `procinstId` | procinstID | `procinst_id` | String | `text` |
| 126 | `verifyState` | verifyState | `verifystate` | sys_verifystate | `singleOption` |
| 127 | `id` | ID | `id` | String | `text` |
| 128 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 129 | `bizFlowInstanceId` | bizFlowInstanceID | `bizflowinstance_id` | String | `text` |
| 130 | `bizFlowMakeBillCode` | bizFlowMakeBill编码 | `bizflow_makebillcode` | String | `text` |
| 131 | `bizflowId` | bizflowID | `bizflow_id` | String | `text` |
| 132 | `bizflowName` | bizflow名称 | `bizflowname` | String | `text` |
| 133 | `sourceBusiObj` | sourceBusiObj | `sourcebusiobj` | String | `text` |
| 134 | `sourceChildId` | sourceChildID | `sourcechild_id` | String | `text` |
| 135 | `sourceCode` | source编码 | `sourcecode` | String | `text` |
| 136 | `sourceId` | sourceID | `source_id` | String | `text` |
| 137 | `firstBusiObj` | firstBusiObj | `firstbusiobj` | String | `text` |
| 138 | `firstChildId` | firstChildID | `firstchild_id` | String | `text` |
| 139 | `firstCode` | first编码 | `firstcode` | String | `text` |
| 140 | `firstId` | firstID | `first_id` | String | `text` |
| 141 | `sourceGrandId` | sourceGrandID | `sourcegrand_id` | String | `text` |
| 142 | `code` | 编码 | `code` | String | `text` |
| 143 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 144 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 145 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 146 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 147 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 148 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 149 | `orgId` | orgID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |

## 关联（43 个）

- `changeContractId` -> `CLM.clmContract.clmContractChange` () [废]
- `clm_contract_change_rectermList` -> `CLM.clmContract.clm_contract_change_recterm` (0..n) 
- `clmContractFileId` -> `CLM.clmContract.clmContractFile` () [废]
- `supplierId` -> `aa.vendor.Vendor` () [废]
- `activity` -> `pgrm.projecttask.ProjectScheduleTask` () 
- `groupId` -> `DZHTFW.econtract.contractTypeGroup` () [废]
- `modifier` -> `base.user.BipUser` () 
- `oriCurrencyId` -> `bd.currencytenant.CurrencyTenantVO` () [废]
- `wbs` -> `BGDM.wbs.wbs_doc` () 
- `type` -> `DZHTFW.econtract.contractType` () [废]
- `signSubjectId` -> `aa.baseorg.OrgMV` () [废]
- `orgId` -> `org.func.BaseOrg` () 
- `clm_contract_change_workflowList` -> `CLM.clmContract.clm_contract_change_workflow` (0..n) 
- `clm_contract_change_status_flowList` -> `CLM.clmContract.clm_contract_change_status_flow` (0..n) 
- `clm_contract_change_itemList` -> `CLM.clmContract.clm_contract_change_item` (0..n) 
- `rateType` -> `bd.exchangeRate.ExchangeRateTypeVO` () [废]
- `clm_contract_change_counterpartList` -> `CLM.clmContract.clm_contract_change_counterpart` (0..n) 
- `settleAccountType` -> `aa.settlemethod.SettleMethod` () [废]
- `customerId` -> `aa.merchant.Merchant` () [废]
- `econtractTempId` -> `DZHTFW.econtract.econtractTemplate` () [废]
- `oldBusType` -> `bd.bill.TransType` () [废]
- `currencyId` -> `bd.currencytenant.CurrencyTenantVO` () [废]
- `sourceContractId` -> `CLM.clmContract.clm_contract` () [废]
- `lawType` -> `DZHTFW.econtract.contractLegalType` () [废]
- `changeFeature` -> `CLM.clmContract.clmContractChangechangeFeatureUserDefine` () [废]
- `billtypeId` -> `bd.bill.BillTypeVO` () [废]
- `creator` -> `base.user.BipUser` () 
- `physicalStamp` -> `DZHTFW.econtract.physicalStamp` () [废]
- `clmContractChangeBpmStepList` -> `CLM.clmContract.clmContractChangeBpmStep` (0..n) 
- `deptId` -> `bd.adminOrg.AdminOrgVO` () [废]
- `auditor` -> `base.user.BipUser` () 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `bustype` -> `bd.bill.TransType` () [废]
- `changeCreator` -> `bd.staff.StaffNew` () [废]
- `clmContractChange_changeTypeIdList` -> `CLM.clmContract.clmContractChange_changeTypeId` (0..n) 
- `clmContractChangeEventsList` -> `CLM.clmContract.clmContractChangeEvents` (0..n) 
- `clm_contract_change_appointmentList` -> `CLM.clmContract.clm_contract_change_appointment` (0..n) 
- `contractId` -> `CLM.clmContract.clm_contract` () [废]
- `personId` -> `bd.staff.StaffNew` () [废]
- `clm_contract_change_paytermList` -> `CLM.clmContract.clm_contract_change_payterm` (0..n) 
- `projectId` -> `bd.project.ProjectVO` () [废]
- `settleOrgid` -> `org.func.FinanceOrg` () [废]
- `changeTypeId` -> `DZHTFW.econtract.contractChangeType` () [废]
