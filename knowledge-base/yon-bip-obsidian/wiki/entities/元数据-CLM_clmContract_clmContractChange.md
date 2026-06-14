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

> **平台版本：BIP 旗舰版 V5**
> 物理表：`clm_contract_change` | domain：`yonbip-ec-contract` | 应用：`CLM` | 业务对象ID：`18dc7fea-15f6-41e0-9ab9-b14c3e510b5f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同变更 |
| 物理表 | `clm_contract_change` |
| domain/服务域 | `yonbip-ec-contract` |
| schema | `yonbip_clm_contract` |
| 所属应用 | `CLM` |
| 直连字段 | 149 个 |
| 子表 | 10 个 |
| 关联引用 | 43 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `clmContractChange_changeTypeIdList` | `CLM.clmContract.clmContractChange_changeTypeId` | composition |
| `clmContractChangeEventsList` | `CLM.clmContract.clmContractChangeEvents` | composition |
| `clm_contract_change_counterpartList` | `CLM.clmContract.clm_contract_change_counterpart` | composition |
| `clm_contract_change_rectermList` | `CLM.clmContract.clm_contract_change_recterm` | composition |
| `clm_contract_change_appointmentList` | `CLM.clmContract.clm_contract_change_appointment` | composition |
| `clmContractChangeBpmStepList` | `CLM.clmContract.clmContractChangeBpmStep` | composition |
| `clm_contract_change_paytermList` | `CLM.clmContract.clm_contract_change_payterm` | composition |
| `clm_contract_change_workflowList` | `CLM.clmContract.clm_contract_change_workflow` | composition |
| `clm_contract_change_status_flowList` | `CLM.clmContract.clm_contract_change_status_flow` | composition |
| `clm_contract_change_itemList` | `CLM.clmContract.clm_contract_change_item` | composition |

## 关联引用 (43个)

| 字段名 | 引用类型 |
|--------|---------|
| `change_contract_id` | `` |
| `` | `` |
| `clm_contract_file_id` | `` |
| `supplier_id` | `yssupplier.aa_vendorSimpleRef` |
| `activity` | `` |
| `group_id` | `iuap-apcom-contract.contractTypeGroupRef` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ori_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `wbs` | `` |
| `type` | `iuap-apcom-contract.contractTypeTreeRef` |
| `sign_subject_id` | `ucf-org-center.org_pure_tree_ref_mv` |
| `org_id` | `ucf-org-center.org_pure_tree_ref` |
| `rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `settle_account_type` | `productcenter.aa_settlemethodref` |
| `customer_id` | `productcenter.aa_merchantref` |
| `econtract_temp_id` | `iuap-apcom-contract.econtractTemplateRef` |
| `old_bus_type` | `ucfbasedoc.bd_billtyperef` |
| `currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `source_contract_id` | `yonbip-ec-contract.clmContractRef1` |
| `law_type` | `iuap-apcom-contract.contractLegalTypeRef_new` |
| `change_feature` | `` |
| `billtype_id` | `ucfbasedoc.bd_billtypetreeref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `physical_stamp` | `iuap-apcom-contract.physicalStampRef` |
| `dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `bustype` | `ucfbasedoc.bd_billtyperef` |
| `change_creator` | `ucf-staff-center.bd_staff_all_ref` |
| `contract_id` | `yonbip-ec-contract.clmContractRef1` |
| `person_id` | `ucf-staff-center.bd_staff_all_ref` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |
| `settle_orgid` | `ucf-org-center.bd_financeorgtreeref` |
| `change_type_id` | `iuap-apcom-contract.contractChangeTypeRef` |

## 继承接口 (10个, 29字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **业务流多来源** (`iuap.busiObj.BusinessFlowSourcesItf`)
  - `firstbusiobj` → `firstbusiobj`
  - `firstchild_id` → `firstchild_id`
  - `firstcode` → `firstcode`
  - `first_id` → `first_id`
  - `sourcegrand_id` → `sourcegrand_id`
- **审批流接口** (`iuap.busiObj.ApprovalFlowItf`)
  - `auditnote` → `auditnote`
  - `auditor` → `auditor`
  - `audit_time` → `audit_time`
  - `procinst_id` → `procinst_id`
  - `verifystate` → `verifystate`
- **业务流基础** (`iuap.busiObj.BusinessFlowItf`)
  - `bizflow_id` → `bizflow_id`
  - `bizflowinstance_id` → `bizflowinstance_id`
  - `bizflow_makebillcode` → `bizflow_makebillcode`
  - `bizflowname` → `bizflowname`
  - `sourcebusiobj` → `sourcebusiobj`
  - `sourcechild_id` → `sourcechild_id`
  - `sourcecode` → `sourcecode`
  - `source_id` → `source_id`
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **主组织** (`iuap.busiObj.OrgItf`)
  - `org_id` → `org_id`
- **交易类型** (`iuap.busiObj.BustypeItf`)
  - `bustype` → `bustype`

## 字段列表（按类型分组）

> 共 149 个直连字段

### 文本字段 (48个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `back_date_cause` | `back_date_cause` | `backDateCause` | 倒签原因 |
| `billtype_code` | `billtype_code` | `billtypeCode` | 单据类型编码 |
| `business_file_id` | `business_file_id` | `businessFileId` | 合同文本附件id |
| `cause` | `cause` | `cause` | 变更事由 |
| `content` | `content` | `content` | 变更内容 |
| `contract_journal_id` | `contract_journal_id` | `contractJournalId` | 合同台账ID |
| `ct_summary` | `ct_summary` | `ctSummary` | 合同概要 |
| `econtractTemp_Code` | `econtractTemp_Code` | `econtractTempCode` | 合同模板编码 |
| `econtract_version` | `econtract_version` | `econtractVersion` | 合同模板版本号 |
| `feature` | `feature` | `feature` | 原合同特征 |
| `finish_file` | `finish_file` | `finishFile` | 定稿文件/送签文件 |
| `invali_cause` | `invali_cause` | `invaliCause` | 合同终止原因 |
| `label` | `label` | `label` | 合同标签 |
| `memo` | `memo` | `memo` | 备注 |
| `mny_words` | `mny_words` | `mnyWords` | 合同金额大写 |
| `off_standard_cause` | `off_standard_cause` | `offStandardCause` | 选择非标准合同的原因 |
| `off_standard_file` | `off_standard_file` | `offStandardFile` | 非标准合同文本 |
| `perform_address` | `perform_address` | `performAddress` | 履约地点 |
| `remark` | `remark` | `remark` | 说明 |
| `reple_file` | `reple_file` | `repleFile` | 补充协议文件 |
| `secret_level` | `secret_level` | `secretLevel` | 密级 |
| `secret_limit` | `secret_limit` | `secretLimit` | 保密期限	 |
| `serial_number` | `serial_number` | `serialNumber` | 合同编号 |
| `settlement_basis` | `settlement_basis` | `settlementBasis` | 结算依据 |
| `sign_address` | `sign_address` | `signAddress` | 签订地点 |
| `sign_econtract_file` | `sign_econtract_file` | `signEcontractFile` | 签署电子版 |
| `sign_paper_file` | `sign_paper_file` | `signPaperFile` | 签署纸质回传版 |
| `sign_process_id` | `sign_process_id` | `signProcessId` | 签署流程id |
| `submit_cs_file` | `submit_cs_file` | `submitCsFile` | 送审文件 |
| `title` | `title` | `title` | 合同名称 |
| `version` | `version` | `version` | 版本号 |
| `auditnote` | `auditnote` | `auditNote` | 审批批语 |
| `procinst_id` | `procinst_id` | `procinstId` | 流程实例ID |
| `id` | `id` | `id` | 主键 |
| `bizflowinstance_id` | `bizflowinstance_id` | `bizFlowInstanceId` | 业务流实例id |
| `bizflow_makebillcode` | `bizflow_makebillcode` | `bizFlowMakeBillCode` | 单据转换规则编码 |
| `bizflow_id` | `bizflow_id` | `bizflowId` | 业务流id |
| `bizflowname` | `bizflowname` | `bizflowName` | 流程名称 |
| `sourcebusiobj` | `sourcebusiobj` | `sourceBusiObj` | 上游业务对象 |
| `sourcechild_id` | `sourcechild_id` | `sourceChildId` | 上游单据子表id |
| `sourcecode` | `sourcecode` | `sourceCode` | 上游单据号 |
| `source_id` | `source_id` | `sourceId` | 上游单据主表id |
| `firstbusiobj` | `firstbusiobj` | `firstBusiObj` | 来源业务对象 |
| `firstchild_id` | `firstchild_id` | `firstChildId` | 来源单据子表id |
| `firstcode` | `firstcode` | `firstCode` | 来源单据号 |
| `first_id` | `first_id` | `firstId` | 来源单据主表id |
| `sourcegrand_id` | `sourcegrand_id` | `sourceGrandId` | 来源孙表id |
| `code` | `code` | `code` | 编码 |

### 引用字段 (31个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `billtype_id` | `billtype_id` | `billtypeId` | 单据类型ID |
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `change_contract_id` | `change_contract_id` | `changeContractId` | 变更合同id |
| `change_creator` | `change_creator` | `changeCreator` | 变更申请人 |
| `clm_contract_file_id` | `clm_contract_file_id` | `clmContractFileId` | 合同文本对象Id |
| `contract_id` | `contract_id` | `contractId` | 关联合同 |
| `currency_id` | `currency_id` | `currencyId` | 本币 |
| `dept_id` | `dept_id` | `deptId` | 承办部门 |
| `econtract_temp_id` | `econtract_temp_id` | `econtractTempId` | 合同模板 |
| `group_id` | `group_id` | `groupId` | 合同分组 |
| `law_type` | `law_type` | `lawType` | 法律类别 |
| `old_bus_type` | `old_bus_type` | `oldBusType` | 原合同交易类型 |
| `ori_currency_id` | `ori_currency_id` | `oriCurrencyId` | 原币 |
| `person_id` | `person_id` | `personId` | 承办人 |
| `physical_stamp` | `physical_stamp` | `physicalStamp` | 物理印章 |
| `project_id` | `project_id` | `projectId` | 关联项目 |
| `rate_type` | `rate_type` | `rateType` | 汇率类型 |
| `settle_account_type` | `settle_account_type` | `settleAccountType` | 结算方式 |
| `settle_orgid` | `settle_orgid` | `settleOrgid` | 结算组织 |
| `sign_subject_id` | `sign_subject_id` | `signSubjectId` | 承办组织 |
| `source_contract_id` | `source_contract_id` | `sourceContractId` | 源合同id |
| `type` | `type` | `type` | 合同类型 |
| `customer_id` | `customer_id` | `customerId` | 客户 |
| `supplier_id` | `supplier_id` | `supplierId` | 供应商 |
| `activity` | `activity` | `activity` | 活动 |
| `wbs` | `wbs` | `wbs` | WBS |
| `auditor` | `auditor` | `auditor` | 审批人 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |
| `org_id` | `org_id` | `orgId` | 主组织 |

### 日期字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `change_create_date` | `change_create_date` | `changeCreateDate` | 变更申请日期 |
| `invali_date` | `invali_date` | `invaliDate` | 合同终止日期 |
| `plan_invallidate` | `plan_invallidate` | `planInvallidate` | 计划失效日期 |
| `plan_validate` | `plan_validate` | `planValidate` | 计划生效日期 |
| `rate_date` | `rate_date` | `rateDate` | 汇率日期 |
| `sign_date` | `sign_date` | `signDate` | 合同签订日期 |
| `sys_effective_date` | `sys_effective_date` | `sysEffectiveDate` | 系统生效日期 |
| `vali_date` | `vali_date` | `valiDate` | 合同生效日期 |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 枚举字段 (33个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `apply_standard_tpl` | `apply_standard_tpl` | `applyStandardTpl` | 是否申请为标准合同模板	 |
| `b_watermark` | `b_watermark` | `bWatermark` | 是否无水印 |
| `beginning_flag` | `beginning_flag` | `beginningFlag` | 期初标识 |
| `change_status` | `change_status` | `changeStatus` | 原变更状态 |
| `conclude_type` | `conclude_type` | `concludeType` | 签订类型 |
| `contract_file_status` | `contract_file_status` | `contractFileStatus` | 合同归档状态 |
| `create_method` | `create_method` | `createMethod` | 合同生成方式 |
| `ct_class` | `ct_class` | `ctClass` | 合同性质 |
| `ct_period` | `ct_period` | `ctPeriod` | 合同期限 |
| `econtract_status` | `econtract_status` | `econtractStatus` | 合同模板状态 |
| `efile_mode` | `efile_mode` | `efileMode` |  合同文件模式 |
| `finalize_status` | `finalize_status` | `finalizeStatus` | 定稿状态 |
| `important_level` | `important_level` | `importantLevel` | 重要程度 |
| `is_back_date` | `is_back_date` | `isBackDate` | 是否倒签 |
| `is_econtract` | `is_econtract` | `isEcontract` | 是否为电子合同 |
| `is_have_tax` | `is_have_tax` | `isHaveTax` | 合同金额是否含税 |
| `is_material` | `is_material` | `isMaterial` | 物料分类合同 |
| `is_open_contract` | `is_open_contract` | `isOpenContract` | 是否开口合同 |
| `is_return_confirm` | `is_return_confirm` | `isReturnConfirm` | 是否回传确认 |
| `maintenance_type` | `maintenance_type` | `maintenanceType` | 维护类型 |
| `re_direction` | `re_direction` | `reDirection` | 收支方向 |
| `return_confirm_status` | `return_confirm_status` | `returnConfirmStatus` | 回传确认状态 |
| `sign_priority` | `sign_priority` | `signPriority` | 签署优先级 |
| `sign_type` | `sign_type` | `signType` | 签署方式 |
| `source_sys` | `source_sys` | `sourceSys` | 合同来源 |
| `stamp_status` | `stamp_status` | `stampStatus` | 用印状态 |
| `state` | `state` | `state` | 变更状态 |
| `status` | `status` | `status` | 合同状态 |
| `target_sys` | `target_sys` | `targetSys` | 推送系统 |
| `urgent_level` | `urgent_level` | `urgentLevel` | 紧急程度 |
| `way` | `way` | `way` | 变更方式 |
| `exchange_rate_ops` | `exchange_rate_ops` | `exchangeRateOps` | 汇率折算方式 |
| `verifystate` | `verifystate` | `verifyState` | 单据状态 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `change_times` | `change_times` | `changeTimes` | 变更次数 |
| `change_version` | `change_version` | `changeVersion` | 版本 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exchange_rate` | `exchange_rate` | `exchangeRate` | 汇率 |
| `have_tax_mny` | `have_tax_mny` | `haveTaxMny` | 本币含税金额 |
| `mny` | `mny` | `mny` | 本币合同金额 |
| `no_tax_mny` | `no_tax_mny` | `noTaxMny` | 本币无税金额 |
| `ori_have_tax_mny` | `ori_have_tax_mny` | `oriHaveTaxMny` | 原币含税金额 |
| `ori_no_tax_mny` | `ori_no_tax_mny` | `oriNoTaxMny` | 原币无税金额 |
| `ori_tax_amount` | `ori_tax_amount` | `oriTaxAmount` | 原币合同税额 |
| `over_pay_ratio` | `over_pay_ratio` | `overPayRatio` | 超合同付款比例 |
| `tax_amount` | `tax_amount` | `taxAmount` | 本币合同税额 |

### attachment (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `appendix` | `appendix` | `appendix` | 合同附件 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `change_feature` | `change_feature` | `changeFeature` |  变更自定义项 |

### quoteList (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `change_type_id` | `change_type_id` | `changeTypeId` | 变更类型 |

### other (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `clm_contract_change_rectermList` | 合同变更收款协议 |
| `` | `` | `clm_contract_change_counterpartList` | 合同变更相对方 |
| `` | `` | `clm_contract_change_appointmentList` | 合同变更履约事项 |
| `` | `` | `clmContractChangeEventsList` | 合同变更大事记信息 |
| `` | `` | `clm_contract_change_itemList` | 合同变更标的物 |
| `` | `` | `clm_contract_change_paytermList` | 合同变更付款协议 |
| `` | `` | `clmContractChangeBpmStepList` | 合同变更审批业务阶段 |
| `` | `` | `clm_contract_change_workflowList` | 合同变更审批任务 |
| `` | `` | `clm_contract_change_status_flowList` | 合同变更状态流水 |
| `` | `` | `clmContractChange_changeTypeIdList` | 合同变更变更类型 |
