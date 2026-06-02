---
tags: [BIP, 元数据, 数据字典, CLM.clmContract.contractLib]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 合同库 (`CLM.clmContract.contractLib`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `clm_contract` | 应用: `CLM`

## 属性（151 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `apMny` | apMny | `ap_mny` | Decimal | `number` |
| 2 | `apOrigmny` | apOrigmny | `ap_origmny` | Decimal | `number` |
| 3 | `appendix` | appendix | `appendix` | String | `attachment` |
| 4 | `bContractlib` | bContractlib | `b_contractlib` | Boolean | `switch` |
| 5 | `bWatermark` | bWatermark | `b_watermark` | bWatermark | `singleOption` |
| 6 | `backDateCause` | backDateCause | `back_date_cause` | String | `text` |
| 7 | `beginningFlag` | beginningFlag | `beginning_flag` | isOnOrYes | `singleOption` |
| 8 | `billtypeCode` | billtype编码 | `billtype_code` | String | `text` |
| 9 | `billtypeId` | billtypeID | `billtype_id` | 4a227650-b866-4f4c-a6ca-2433297a1713 | `quote` |
| 10 | `businessFileId` | businessFileID | `business_file_id` | String | `text` |
| 11 | `bustype` | bustype | `contractlib_bustype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |
| 12 | `changeContractId` | changeContractID | `change_contract_id` | 58c5e448-536c-4fd6-b898-f6cdbaddd6ae | `quote` |
| 13 | `changeCreateDate` | changeCreateDate | `change_create_date` | String | `date` |
| 14 | `changeCreator` | changeCreator | `change_creator` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a | `quote` |
| 15 | `changeStatus` | changeStatus | `change_status` | changeState | `singleOption` |
| 16 | `changeTimes` | changeTimes | `change_times` | Integer | `int` |
| 17 | `clmContractFileId` | clmContractFileID | `clm_contract_file_id` | ef3d136e-a9f0-45e2-ab61-1ccea4370646 | `quote` |
| 18 | `code` | 编码 | `serial_number` | String | `text` |
| 19 | `concludeType` | concludeType | `conclude_type` | concludeType | `singleOption` |
| 20 | `contractFileStatus` | contractFileStatus | `contract_file_status` | placeFileState | `singleOption` |
| 21 | `contractId` | contractID | `contract_id` | 4ff7bde2-8785-4e13-9109-a6d4d0c0c25e | `quote` |
| 22 | `contractJournalId` | contractJournalID | `contract_journal_id` | String | `text` |
| 23 | `contractfileConfigId` | contractfileConfigID | `contractfile_config_id` | 361c3cc9-358a-4933-a267-fd50da708e70 | `quote` |
| 24 | `createMethod` | createMethod | `create_method` | contractCreateMethod | `singleOption` |
| 25 | `ctClass` | ctClass | `ct_class` | ctClass | `singleOption` |
| 26 | `ctPeriod` | ctPeriod | `ct_period` | period | `singleOption` |
| 27 | `ctSummary` | ctSummary | `ct_summary` | String | `text` |
| 28 | `ctlibFeature` | ctlibFeature | `ctlib_feature` | f8cc267b-8fad-4f3e-9dcb-89b4cb2c44ff | `UserDefine` |
| 29 | `currencyId` | currencyID | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 30 | `deptId` | deptID | `dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 31 | `econtractTempCode` | econtractTemp编码 | `econtractTemp_Code` | String | `text` |
| 32 | `econtractTempId` | econtractTempID | `econtract_temp_id` | 2a45fe2c-202e-46a1-ba09-2f4ea704ae2b | `quote` |
| 33 | `econtractVersion` | econtractVersion | `econtract_version` | String | `text` |
| 34 | `efileMode` | efileMode | `efile_mode` | contractFileMode_C | `singleOption` |
| 35 | `exchangeRate` | exchangeRate | `exchange_rate` | Decimal | `number` |
| 36 | `finalizeStatus` | finalizeStatus | `finalize_status` | finalizeStatus | `singleOption` |
| 37 | `finishFile` | finishFile | `finish_file` | String | `text` |
| 38 | `groupId` | groupID | `group_id` | 4c202967-83b6-4bc2-8c87-739ebb342000 | `quote` |
| 39 | `haveTaxMny` | haveTaxMny | `have_tax_mny` | Decimal | `number` |
| 40 | `importantLevel` | importantLevel | `important_level` | importantLevel | `singleOption` |
| 41 | `invaliCause` | invaliCause | `invali_cause` | String | `text` |
| 42 | `invaliDate` | invaliDate | `invali_date` | String | `date` |
| 43 | `invoiceMny` | invoiceMny | `invoice_mny` | Decimal | `number` |
| 44 | `invoiceOrigmny` | invoiceOrigmny | `invoice_origmny` | Decimal | `number` |
| 45 | `isBackDate` | 是否BackDate | `is_back_date` | isOnOrYes | `singleOption` |
| 46 | `isEcontract` | 是否Econtract | `is_econtract` | isEcontract | `singleOption` |
| 47 | `isHaveTax` | 是否HaveTax | `is_have_tax` | isOnOrYes | `singleOption` |
| 48 | `isMaterial` | 是否Material | `is_material` | isOnOrYes | `singleOption` |
| 49 | `isOpenContract` | 是否OpenContract | `is_open_contract` | isOnOrYes | `singleOption` |
| 50 | `label` | label | `label` | String | `text` |
| 51 | `lawType` | lawType | `law_type` | 402cfddf-275b-409e-b1d7-4289e0e0e983 | `quote` |
| 52 | `marginMny` | marginMny | `margin_mny` | Decimal | `number` |
| 53 | `marginOrigmny` | marginOrigmny | `margin_origmny` | Decimal | `number` |
| 54 | `memo` | 备注 | `memo` | String | `text` |
| 55 | `mny` | mny | `mny` | Decimal | `number` |
| 56 | `noTaxMny` | noTaxMny | `no_tax_mny` | Decimal | `number` |
| 57 | `offStandardCause` | offStandardCause | `off_standard_cause` | String | `text` |
| 58 | `offStandardFile` | offStandardFile | `off_standard_file` | String | `text` |
| 59 | `oriCurrencyId` | oriCurrencyID | `ori_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 60 | `oriHaveTaxMny` | oriHaveTaxMny | `ori_have_tax_mny` | Decimal | `number` |
| 61 | `oriNoTaxMny` | oriNoTaxMny | `ori_no_tax_mny` | Decimal | `number` |
| 62 | `oriTaxAmount` | oriTaxAmount | `ori_tax_amount` | Decimal | `number` |
| 63 | `overPayRatio` | overPayRatio | `over_pay_ratio` | Decimal | `number` |
| 64 | `paidMny` | paidMny | `paid_mny` | Decimal | `number` |
| 65 | `paidOrigMny` | paidOrigMny | `paid_orig_mny` | Decimal | `number` |
| 66 | `performAddress` | performAddress | `perform_address` | String | `text` |
| 67 | `personId` | personID | `person_id` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a | `quote` |
| 68 | `physicalStamp` | physicalStamp | `physical_stamp` | afe79067-b165-4c2f-b19e-6740b75e1e1e | `quote` |
| 69 | `planInvallidate` | planInvallidate | `plan_invallidate` | String | `date` |
| 70 | `planValidate` | planValidate | `plan_validate` | String | `date` |
| 71 | `prepayMny` | prepayMny | `prepay_mny` | Decimal | `number` |
| 72 | `prepayOrigmny` | prepayOrigmny | `prepay_origmny` | Decimal | `number` |
| 73 | `prepayPaidmny` | prepayPaidmny | `prepay_paidmny` | Decimal | `number` |
| 74 | `prepayPaidorigmny` | prepayPaidorigmny | `prepay_paidorigmny` | Decimal | `number` |
| 75 | `projectId` | projectID | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |
| 76 | `rateDate` | rateDate | `rate_date` | String | `date` |
| 77 | `rateType` | rateType | `rate_type` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |
| 78 | `reDirection` | reDirection | `re_direction` | reDirection | `singleOption` |
| 79 | `receivedBondmny` | receivedBondmny | `received_bondmny` | Decimal | `number` |
| 80 | `receivedBondorigmny` | receivedBondorigmny | `received_bondorigmny` | Decimal | `number` |
| 81 | `repleFile` | repleFile | `reple_file` | String | `text` |
| 82 | `retentionMny` | retentionMny | `retention_mny` | Decimal | `number` |
| 83 | `retentionOrigmny` | retentionOrigmny | `retention_origmny` | Decimal | `number` |
| 84 | `retentionPaidmny` | retentionPaidmny | `retention_paidmny` | Decimal | `number` |
| 85 | `retentionPaidorigmny` | retentionPaidorigmny | `retention_paidorigmny` | Decimal | `number` |
| 86 | `returnBondmny` | returnBondmny | `return_bondmny` | Decimal | `number` |
| 87 | `returnBondorigmny` | returnBondorigmny | `return_bondorigmny` | Decimal | `number` |
| 88 | `secretLevel` | secretLevel | `secret_level` | String | `text` |
| 89 | `secretLimit` | secretLimit | `secret_limit` | String | `text` |
| 90 | `settleAccountType` | settleAccountType | `settle_account_type` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff | `quote` |
| 91 | `settleOrgid` | settleOrgid | `settle_orgid` | 5d4c5590-da40-4b50-80a1-8d04da2f79e0 | `quote` |
| 92 | `settlementBasis` | settlementBasis | `settlement_basis` | String | `text` |
| 93 | `signAddress` | signAddress | `sign_address` | String | `text` |
| 94 | `signDate` | signDate | `sign_date` | String | `date` |
| 95 | `signEcontractFile` | signEcontractFile | `sign_econtract_file` | String | `text` |
| 96 | `signPaperFile` | signPaperFile | `sign_paper_file` | String | `text` |
| 97 | `signPriority` | signPriority | `sign_priority` | signSort | `singleOption` |
| 98 | `signProcessId` | signProcessID | `sign_process_id` | String | `text` |
| 99 | `signSubjectId` | signSubjectID | `sign_subject_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 100 | `signType` | signType | `sign_type` | signType | `singleOption` |
| 101 | `sourceSys` | sourceSys | `source_sys` | sourceSys | `singleOption` |
| 102 | `srvConfirmny` | srvConfirmny | `srv_confirmny` | Decimal | `number` |
| 103 | `srvConfirorigmny` | srvConfirorigmny | `srv_confirorigmny` | Decimal | `number` |
| 104 | `stampStatus` | stampStatus | `stamp_status` | stampStatus | `singleOption` |
| 105 | `status` | 状态 | `status` | contractStatus | `singleOption` |
| 106 | `subStatus` | subStatus | `sub_status` | contractLibSubStatus | `singleOption` |
| 107 | `targetSys` | targetSys | `target_sys` | targetSys | `singleOption` |
| 108 | `taxAmount` | taxAmount | `tax_amount` | Decimal | `number` |
| 109 | `title` | title | `title` | String | `text` |
| 110 | `type` | type | `type` | b23c8bcc-9978-44fb-a5d5-b54d687b59bb | `quote` |
| 111 | `urgentLevel` | urgentLevel | `urgent_level` | urgentLevel | `singleOption` |
| 112 | `valiDate` | valiDate | `vali_date` | String | `date` |
| 113 | `version` | 版本号 | `version` | String | `text` |
| 114 | `warrantyPeriod` | warrantyPeriod | `warranty_period` | String | `text` |
| 115 | `sourceBillCode` | sourceBill编码 | `source_bill_code` | String | `text` |
| 116 | `eprojectInitiationStatus` | eprojectInitiationStatus | `eproject_initiation_status` | projectInitiationStatus | `singleOption` |
| 117 | `exchangeRateOps` | exchangeRateOps | `exchange_rate_ops` | ExchangeRateMethod | `singleOption` |
| 118 | `customerId` | customerID | `customer_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 119 | `supplierId` | supplierID | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 120 | `activity` | activity | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 | `quote` |
| 121 | `wbs` | wbs | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 | `quote` |
| 122 | `contractLibCounterpartList` | contractLibCounterpartList | `` | a5aec596-64df-4415-901b-a88743c17c55 | `` |
| 123 | `clmContractFiletemDetailList` | clmContractFiletemDetailList | `` | 1897827b-0b73-4952-a924-75f6bd8cbb9a | `` |
| 124 | `contractLibChangeList` | contractLibChangeList | `` | fb715c75-2c73-4087-af0b-5e3153155b54 | `` |
| 125 | `auditNote` | auditNote | `auditnote` | String | `text` |
| 126 | `auditTime` | auditTime | `audit_time` | DateTime | `dateTime` |
| 127 | `auditor` | auditor | `auditor` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 128 | `procinstId` | procinstID | `procinst_id` | String | `text` |
| 129 | `verifyState` | verifyState | `verifystate` | sys_verifystate | `singleOption` |
| 130 | `id` | ID | `id` | String | `text` |
| 131 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 132 | `bizFlowInstanceId` | bizFlowInstanceID | `bizflowinstance_id` | String | `text` |
| 133 | `bizFlowMakeBillCode` | bizFlowMakeBill编码 | `bizflow_makebillcode` | String | `text` |
| 134 | `bizflowId` | bizflowID | `bizflow_id` | String | `text` |
| 135 | `bizflowName` | bizflow名称 | `bizflowname` | String | `text` |
| 136 | `sourceBusiObj` | sourceBusiObj | `sourcebusiobj` | String | `text` |
| 137 | `sourceChildId` | sourceChildID | `sourcechild_id` | String | `text` |
| 138 | `sourceCode` | source编码 | `sourcecode` | String | `text` |
| 139 | `sourceId` | sourceID | `source_id` | String | `text` |
| 140 | `firstBusiObj` | firstBusiObj | `firstbusiobj` | String | `text` |
| 141 | `firstChildId` | firstChildID | `firstchild_id` | String | `text` |
| 142 | `firstCode` | first编码 | `firstcode` | String | `text` |
| 143 | `firstId` | firstID | `first_id` | String | `text` |
| 144 | `sourceGrandId` | sourceGrandID | `sourcegrand_id` | String | `text` |
| 145 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 146 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 147 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 148 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 149 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 150 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 151 | `orgId` | orgID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |

## 关联（34 个）

- `changeContractId` -> `CLM.clmContract.clmContractChange` () [废]
- `clmContractFileId` -> `CLM.clmContract.clmContractFile` () [废]
- `supplierId` -> `aa.vendor.Vendor` () [废]
- `activity` -> `pgrm.projecttask.ProjectScheduleTask` () 
- `groupId` -> `DZHTFW.econtract.contractTypeGroup` () [废]
- `modifier` -> `base.user.BipUser` () 
- `oriCurrencyId` -> `bd.currencytenant.CurrencyTenantVO` () [废]
- `wbs` -> `BGDM.wbs.wbs_doc` () 
- `type` -> `DZHTFW.econtract.contractType` () [废]
- `ctlibFeature` -> `CLM.clmContract.contractLibctlibFeatureUserDefine` () [废]
- `signSubjectId` -> `aa.baseorg.OrgMV` () [废]
- `orgId` -> `org.func.BaseOrg` () 
- `contractLibChangeList` -> `CLM.clmContract.contractLibChange` (0..n) 
- `rateType` -> `bd.exchangeRate.ExchangeRateTypeVO` () [废]
- `settleAccountType` -> `aa.settlemethod.SettleMethod` () [废]
- `customerId` -> `aa.merchant.Merchant` () [废]
- `econtractTempId` -> `DZHTFW.econtract.econtractTemplate` () [废]
- `contractfileConfigId` -> `CLM.clmContract.clmContractFileConfig` () [废]
- `currencyId` -> `bd.currencytenant.CurrencyTenantVO` () [废]
- `lawType` -> `DZHTFW.econtract.contractLegalType` () [废]
- `billtypeId` -> `bd.bill.BillTypeVO` () [废]
- `creator` -> `base.user.BipUser` () 
- `physicalStamp` -> `DZHTFW.econtract.physicalStamp` () [废]
- `deptId` -> `bd.adminOrg.AdminOrgVO` () [废]
- `auditor` -> `base.user.BipUser` () 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `contractLibCounterpartList` -> `CLM.clmContract.contractLibCounterpart` (0..n) 
- `bustype` -> `bd.bill.TransType` () [废]
- `changeCreator` -> `bd.staff.StaffNew` () [废]
- `clmContractFiletemDetailList` -> `CLM.clmContract.clmContractFiletemDetail` (0..n) 
- `contractId` -> `CLM.clmContract.clm_contract` () [废]
- `personId` -> `bd.staff.StaffNew` () [废]
- `projectId` -> `bd.project.ProjectVO` () [废]
- `settleOrgid` -> `org.func.FinanceOrg` () [废]
