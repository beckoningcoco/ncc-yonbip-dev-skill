---
tags: [BIP, metadata, CLM, contract]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同登记 (CLM.clmContract.clm_contract)

> Platform: BIP V5
> Source: metadata API query for CLM.clmContract.clm_contract
> Table: clm_contract | Schema: yonbip-ec-contract

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 合同登记 |
| uri | CLM.clmContract.clm_contract |
| tableName | clm_contract |
| domain | yonbip-ec-contract |
| schema | `yonbip_clm_contract` |
| applicationCode | CLM |
| superUri | iuap.busiObj.BizObject |
| isBusinessObject | true |
| isExtend | true |

## Key / Code / Name

| Role | Name | Column | Type |
|------|------|--------|------|
| key | id | id | String(22) REF.ID |
| code | code | code | String(200) isCode |
| name | title | title | String(200) isName |

## Suppliers (10)

| # | Name | URI |
|---|------|-----|
| 1 | 逻辑删除 (LogicDelete) | iuap.busiObj.LogicDelete |
| 2 | 编码 (Code) | iuap.busiObj.Code |
| 3 | 统一租户接口 (IYTenant) | iuap.busiObj.IYTenant |
| 4 | 业务流多来源 (BusinessFlowSourcesItf) | iuap.busiObj.BusinessFlowSourcesItf |
| 5 | 审批流接口 (ApprovalFlowItf) | iuap.busiObj.ApprovalFlowItf |
| 6 | 业务流基础 (BusinessFlowItf) | iuap.busiObj.BusinessFlowItf |
| 7 | 项目结构属性 (projectStructureProperties) | BGDM.wbs.projectStructureProperties |
| 8 | 审计信息 (IAuditInfo) | iuap.busiObj.IAuditInfo |
| 9 | 主组织 (OrgItf) | iuap.busiObj.OrgItf |
| 10 | 交易类型 (BustypeItf) | iuap.busiObj.BustypeItf |

---

## All Fields (143)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | appendix | 合同附件 | appendix | attachment | String |  |  |  |
| 2 | applyStandardTpl | 是否申请为标准合同模板 | apply_standard_tpl | singleOption | unitfyEnum.CLM.isOnOrYes |  |  |  |
| 3 | bWatermark | 是否无水印 | b_watermark | singleOption | unitfyEnum.CLM.bWatermark |  |  |  |
| 4 | backDateCause | 倒签原因 | back_date_cause | text | String |  |  |  |
| 5 | beginningFlag | 期初标记 | beginning_flag | singleOption | unitfyEnum.CLM.isOnOrYes |  |  |  |
| 6 | billtypeCode | 单据类型编码 | billtype_code | text | String |  |  |  |
| 7 | billtypeId | 单据类型ID | billtype_id | quote | bd.bill.BillTypeVO |  |  |  |
| 8 | businessFileId | 合同文本附件id | business_file_id | text | String |  |  |  |
| 9 | bustype | 交易类型 | bustype | quote | bd.bill.TransType |  |  | data_auth,nullable |
| 10 | changeContractId | 变更合同id | change_contract_id | text | String |  |  |  |
| 11 | changeCreateDate | 变更申请日期(不要使用) | change_create_date | date | String |  |  |  |
| 12 | changeCreator | 变更申请人(不要使用) | change_creator | quote | bd.staff.StaffNew |  |  |  |
| 13 | changeStatus | 变更状态(不要使用) | change_status | singleOption | unitfyEnum.CLM.changeState |  |  |  |
| 14 | changeTimes | 变更次数(不要使用) | change_times | int | Integer |  |  |  |
| 15 | clmContractFileId | 合同文本对象Id | clm_contract_file_id | quote | CLM.clmContract.clmContractFile |  |  |  |
| 16 | concludeType | 签订类型 | conclude_type | singleOption | unitfyEnum.CLM.concludeType |  |  |  |
| 17 | contractFileStatus | 合同归档状态 | contract_file_status | singleOption | unitfyEnum.CLM.placeFileState |  |  |  |
| 18 | contractId | 关联合同 | contract_id | quote | CLM.clmContract.clm_contract |  |  |  |
| 19 | contractJournalId | 合同台账ID | contract_journal_id | text | String |  |  |  |
| 20 | createMethod | 合同生成方式 | create_method | singleOption | unitfyEnum.CLM.contractCreateMethod |  |  |  |
| 21 | ctClass | 合同性质 | ct_class | singleOption | unitfyEnum.CLM.ctClass |  |  |  |
| 22 | ctPeriod | 合同期限 | ct_period | singleOption | unitfyEnum.CLM.period |  |  |  |
| 23 | ctSummary | 合同概要 | ct_summary | text | String |  |  |  |
| 24 | currencyId | 本币 | currency_id | quote | bd.currencytenant.CurrencyTenantVO |  |  |  |
| 25 | deptId | 承办部门 | dept_id | quote | bd.adminOrg.AdminOrgVO |  |  | data_auth |
| 26 | econtractStatus | 合同模板状态 | econtract_status | singleOption | unitfyEnum.CLM.econtractState |  |  |  |
| 27 | econtractTempCode | 合同模板编码 | econtractTemp_Code | text | String |  |  |  |
| 28 | econtractTempId | 合同模板 | econtract_temp_id | quote | DZHTFW.econtract.econtractTemplate |  |  |  |
| 29 | econtractVersion | 合同模板版本号 | econtract_version | text | String |  |  |  |
| 30 | efileMode | 合同文件模式 | efile_mode | singleOption | unitfyEnum.CLM.contractFileMode_C |  |  |  |
| 31 | exchangeRate | 汇率 | exchange_rate | number | Real |  |  |  |
| 32 | feature | 合同信息特征 | feature | UserDefine | CLM.clmContract.clm_contractfeatureUserDefine |  |  |  |
| 33 | finalizeStatus | 定稿状态 | finalize_status | singleOption | unitfyEnum.CLM.finalizeStatus |  |  |  |
| 34 | finishFile | 送审文件附件 | finish_file | attachment | String |  |  |  |
| 35 | groupId | 合同分组 | group_id | quote | DZHTFW.econtract.contractTypeGroup |  |  |  |
| 36 | haveTaxMny | 本币含税金额 | have_tax_mny | number | Real |  |  |  |
| 37 | importantLevel | 重要程度 | important_level | singleOption | unitfyEnum.CLM.importantLevel |  |  |  |
| 38 | invaliCause | 合同终止原因 | invali_cause | text | String |  |  |  |
| 39 | invaliDate | 合同终止日期 | invali_date | date | String |  |  |  |
| 40 | isBackDate | 是否倒签 | is_back_date | singleOption | unitfyEnum.CLM.isOnOrYes |  |  |  |
| 41 | isEcontract | 是否为电子合同 | is_econtract | singleOption | unitfyEnum.CLM.isEcontract |  |  |  |
| 42 | isHaveTax | 合同金额是否含税 | is_have_tax | singleOption | unitfyEnum.CLM.isOnOrYes |  |  |  |
| 43 | isMaterial | 物料分类合同 | is_material | singleOption | unitfyEnum.CLM.isOnOrYes |  |  |  |
| 44 | isOpenContract | 是否开口合同 | is_open_contract | singleOption | unitfyEnum.CLM.isOnOrYes |  |  |  |
| 45 | isReturnConfirm | 是否回传确认 | is_return_confirm | singleOption | unitfyEnum.CLM.isOnOrYes |  |  |  |
| 46 | label | 合同标签 | label | text | String |  |  |  |
| 47 | lawType | 法律类别 | law_type | quote | DZHTFW.econtract.contractLegalType |  |  |  |
| 48 | maintenanceType | 维护类型 | maintenance_type | singleOption | unitfyEnum.CLM.maintenanceType |  |  |  |
| 49 | memo | 备注 | memo | text | String |  |  |  |
| 50 | mny | 本币合同金额 | mny | number | Real |  |  |  |
| 51 | mnyWords | 合同金额大写 | mny_words | text | String |  |  |  |
| 52 | noTaxMny | 本币无税金额 | no_tax_mny | number | Real |  |  |  |
| 53 | offStandardCause | 选择非标准合同的原因 | off_standard_cause | text | String |  |  |  |
| 54 | offStandardFile | 非标准合同文本 | off_standard_file | text | String |  |  |  |
| 55 | oriCurrencyId | 原币 | ori_currency_id | quote | bd.currencytenant.CurrencyTenantVO |  |  |  |
| 56 | oriDeptId | 原承办部门 | ori_dept_id | quote | bd.adminOrg.AdminOrgVO |  |  |  |
| 57 | oriHaveTaxMny | 原币含税金额 | ori_have_tax_mny | number | Real |  |  |  |
| 58 | oriNoTaxMny | 原币无税金额 | ori_no_tax_mny | number | Real |  |  |  |
| 59 | oriPersonId | 原承办人 | ori_person_id | quote | bd.staff.StaffNew |  |  |  |
| 60 | oriTaxAmount | 原币合同税额 | ori_tax_amount | number | Real |  |  |  |
| 61 | overPayRatio | 超合同付款比例 | over_pay_ratio | number | Real |  |  |  |
| 62 | performAddress | 履约地点 | perform_address | text | String |  |  |  |
| 63 | personId | 承办人 | person_id | quote | bd.staff.StaffNew |  |  |  |
| 64 | physicalStamp | 物理印章 | physical_stamp | quote | DZHTFW.econtract.physicalStamp |  |  |  |
| 65 | planInvallidate | 计划失效日期 | plan_invallidate | date | String |  |  |  |
| 66 | planValidate | 计划生效日期 | plan_validate | date | String |  |  |  |
| 67 | projectId | 关联项目 | project_id | quote | bd.project.ProjectVO |  |  |  |
| 68 | rateDate | 汇率日期 | rate_date | date | String |  |  |  |
| 69 | rateType | 汇率类型 | rate_type | quote | bd.exchangeRate.ExchangeRateTypeVO |  |  |  |
| 70 | reDirection | 收支方向 | re_direction | singleOption | unitfyEnum.CLM.reDirection |  |  |  |
| 71 | repleFile | 补充协议文件 | reple_file | text | String |  |  |  |
| 72 | returnConfirmStatus | 回传确认状态 | return_confirm_status | singleOption | unitfyEnum.CLM.ReturnConfirmStatusEnum |  |  |  |
| 73 | secretLevel | 密级 | secret_level | text | String |  |  |  |
| 74 | secretLimit | 保密期限 | secret_limit | text | String |  |  |  |
| 75 | serialNumber | 合同编号 | serial_number | text | String |  |  |  |
| 76 | settleAccountType | 结算方式 | settle_account_type | quote | aa.settlemethod.SettleMethod |  |  |  |
| 77 | settleOrgid | 结算组织 | settle_orgid | quote | org.func.FinanceOrg |  |  |  |
| 78 | signAddress | 签订地点 | sign_address | text | String |  |  |  |
| 79 | signDate | 合同签订日期 | sign_date | date | String |  |  |  |
| 80 | signEcontractFile | 签署电子版 | sign_econtract_file | text | String |  |  |  |
| 81 | signPaperFile | 签署纸质回传版 | sign_paper_file | text | String |  |  |  |
| 82 | signPriority | 签署优先级 | sign_priority | singleOption | unitfyEnum.CLM.signSort |  |  |  |
| 83 | signProcessId | 签署流程id | sign_process_id | text | String |  |  |  |
| 84 | signSubjectId | 承办组织 | sign_subject_id | quote | aa.baseorg.OrgMV |  |  | data_auth |
| 85 | signType | 签署方式 | sign_type | singleOption | unitfyEnum.CLM.signType |  |  |  |
| 86 | sourceSys | 合同来源 | source_sys | singleOption | unitfyEnum.CLM.clmSourceSys |  |  |  |
| 87 | stampStatus | 用印状态 | stamp_status | singleOption | unitfyEnum.CLM.stampStatus |  |  |  |
| 88 | status | 合同状态 | status | singleOption | unitfyEnum.CLM.contractStatus |  |  |  |
| 89 | submitCsFile | 送审文件正文 | submit_cs_file | attachment | String |  |  |  |
| 90 | sysEffectiveDate | 系统生效日期 | sys_effective_date | date | String |  |  |  |
| 91 | sysOffDate | 系统关闭日期 | sys_off_date | date | String |  |  |  |
| 92 | targetSys |  推送系统 | target_sys | singleOption | unitfyEnum.CLM.targetSys |  |  |  |
| 93 | taxAmount | 本币税额 | tax_amount | number | Real |  |  |  |
| 94 | title | 合同名称 | title | text | String |  |  | isName |
| 95 | type | 合同类型 | type | quote | DZHTFW.econtract.contractType |  |  | data_auth |
| 96 | urgentLevel | 紧急程度 | urgent_level | singleOption | unitfyEnum.CLM.urgentLevel |  |  |  |
| 97 | valiDate | 合同生效日期 | vali_date | date | String |  |  |  |
| 98 | version | 版本号 | version | text | String |  |  |  |
| 99 | eprojectInitiationStatus | 立项状态 | eproject_initiation_status | singleOption | unitfyEnum.CLM.projectInitiationStatus |  |  |  |
| 100 | exchangeRateOps | 汇率折算方式 | exchange_rate_ops | singleOption | unitfyEnum.GZTBDM.ExchangeRateMethod |  |  |  |
| 101 | customerId | 客户 | customer_id | quote | aa.merchant.Merchant |  |  |  |
| 102 | supplierId | 供应商 | supplier_id | quote | aa.vendor.Vendor |  |  |  |
| 103 | activity | 活动 | activity | quote | pgrm.projecttask.ProjectScheduleTask |  |  | nullable |
| 104 | wbs | WBS | wbs | quote | BGDM.wbs.wbs_doc |  |  | nullable |
| 105 | clmContractBpmStepList | 合同审批业务阶段 | - | - | CLM.clmContract.clmContractBpmStep |  |  |  |
| 106 | clmContractWorkflowList | 合同审批审批任务 | - | - | CLM.clmContract.clmContractWorkflow |  |  |  |
| 107 | clmEventRecordList | 大事记信息 | - | - | CLM.clmContract.clmEventRecord |  |  |  |
| 108 | clmContractRiskRecordList | 合同风险记录 | - | - | CLM.clmContract.clmContractRiskRecord |  |  |  |
| 109 | clm_appointmentList | 履约事项 | - | - | CLM.clmContract.clm_appointment |  |  |  |
| 110 | clm_contract_status_flowList | 合同状态流水 | - | - | CLM.clmContract.clm_contract_status_flow |  |  |  |
| 111 | clm_contract_rectermList | 收款协议 | - | - | CLM.clmContract.clm_contract_recterm |  |  |  |
| 112 | clm_contract_paytermList | 付款协议 | - | - | CLM.clmContract.clm_contract_payterm |  |  |  |
| 113 | clm_contract_itemList | 合同标的物 | - | - | CLM.clmContract.clm_contract_item |  |  |  |
| 114 | clm_contract_counterpartList | 合同相对方 | - | - | CLM.clmContract.clm_contract_counterpart |  |  |  |
| 115 | auditNote | 审批批语 | auditnote | text | String |  |  | nullable,uiHide |
| 116 | auditTime | 审批日期 | audit_time | dateTime | Timestamp |  |  | nullable,uiHide |
| 117 | auditor | 审批人 | auditor | quote | base.user.BipUser |  |  | nullable,uiHide |
| 118 | procinstId | 流程实例ID | procinst_id | text | String |  |  | nullable,uiHide |
| 119 | verifyState | 单据状态 | verifystate | singleOption | unitfyEnum.GZTSYS.sys_verifystate |  |  | nullable |
| 120 | id | 主键 | id | text | String |  |  | nullable,REF.ID,uiHide |
| 121 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 122 | bizFlowInstanceId | 业务流实例id | bizflowinstance_id | text | String |  |  | nullable,uiHide |
| 123 | bizFlowMakeBillCode | 单据转换规则编码 | bizflow_makebillcode | text | String |  |  | nullable,uiHide |
| 124 | bizflowId | 业务流id | bizflow_id | text | String |  |  | nullable,uiHide |
| 125 | bizflowName | 流程名称 | bizflowname | text | String |  |  | nullable,uiHide |
| 126 | sourceBusiObj | 上游业务对象 | sourcebusiobj | text | String |  |  | nullable,uiHide |
| 127 | sourceChildId | 上游单据子表id | sourcechild_id | text | String |  |  | nullable,uiHide |
| 128 | sourceCode | 上游单据号 | sourcecode | text | String |  |  | nullable,uiHide |
| 129 | sourceId | 上游单据主表id | source_id | text | String |  |  | nullable,uiHide |
| 130 | firstBusiObj | 来源业务对象 | firstbusiobj | text | String |  |  | nullable,uiHide |
| 131 | firstChildId | 来源单据子表id | firstchild_id | text | String |  |  | nullable,uiHide |
| 132 | firstCode | 来源单据号 | firstcode | text | String |  |  | nullable,uiHide |
| 133 | firstId | 来源单据主表id | first_id | text | String |  |  | nullable,uiHide |
| 134 | sourceGrandId | 来源孙表id | sourcegrand_id | text | String |  |  | nullable,uiHide |
| 135 | code | 编码 | code | text | String |  |  | isCode,nullable |
| 136 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 137 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 138 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 139 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 140 | ytenantId | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 141 | dr | 逻辑删除 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 142 | orgId | 主组织 | org_id | quote | org.func.BaseOrg |  |  | isMasterOrg,nullable,uiDesign |
| 143 | foodListList |  | - | - | CLM.clmContract.foodList |  |  |  |

---
## Child Tables (11)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | clmContractRiskRecordList | 合同风险记录 | CLM.clmContract.clmContractRiskRecord |
| 2 | clm_contract_status_flowList | 合同状态流水 | CLM.clmContract.clm_contract_status_flow |
| 3 | clmEventRecordList | 大事记信息 | CLM.clmContract.clmEventRecord |
| 4 | clm_contract_paytermList | 付款协议 | CLM.clmContract.clm_contract_payterm |
| 5 | clmContractBpmStepList | 合同审批业务阶段 | CLM.clmContract.clmContractBpmStep |
| 6 | clm_contract_itemList | 合同标的物 | CLM.clmContract.clm_contract_item |
| 7 | clmContractWorkflowList | 合同审批审批任务 | CLM.clmContract.clmContractWorkflow |
| 8 | clm_contract_counterpartList | 合同相对方 | CLM.clmContract.clm_contract_counterpart |
| 9 | clm_appointmentList | 履约事项 | CLM.clmContract.clm_appointment |
| 10 | foodListList | - | CLM.clmContract.foodList |
| 11 | clm_contract_rectermList | 收款协议 | CLM.clmContract.clm_contract_recterm |

---
## Reference Fields (30)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | billtypeId | 单据类型ID | billtype_id | bd.bill.BillTypeVO |
| 2 | bustype | 交易类型 | bustype | bd.bill.TransType |
| 3 | changeCreator | 变更申请人(不要使用) | change_creator | bd.staff.StaffNew |
| 4 | clmContractFileId | 合同文本对象Id | clm_contract_file_id | CLM.clmContract.clmContractFile |
| 5 | contractId | 关联合同 | contract_id | CLM.clmContract.clm_contract |
| 6 | currencyId | 本币 | currency_id | bd.currencytenant.CurrencyTenantVO |
| 7 | deptId | 承办部门 | dept_id | bd.adminOrg.AdminOrgVO |
| 8 | econtractTempId | 合同模板 | econtract_temp_id | DZHTFW.econtract.econtractTemplate |
| 9 | groupId | 合同分组 | group_id | DZHTFW.econtract.contractTypeGroup |
| 10 | lawType | 法律类别 | law_type | DZHTFW.econtract.contractLegalType |
| 11 | oriCurrencyId | 原币 | ori_currency_id | bd.currencytenant.CurrencyTenantVO |
| 12 | oriDeptId | 原承办部门 | ori_dept_id | bd.adminOrg.AdminOrgVO |
| 13 | oriPersonId | 原承办人 | ori_person_id | bd.staff.StaffNew |
| 14 | personId | 承办人 | person_id | bd.staff.StaffNew |
| 15 | physicalStamp | 物理印章 | physical_stamp | DZHTFW.econtract.physicalStamp |
| 16 | projectId | 关联项目 | project_id | bd.project.ProjectVO |
| 17 | rateType | 汇率类型 | rate_type | bd.exchangeRate.ExchangeRateTypeVO |
| 18 | settleAccountType | 结算方式 | settle_account_type | aa.settlemethod.SettleMethod |
| 19 | settleOrgid | 结算组织 | settle_orgid | org.func.FinanceOrg |
| 20 | signSubjectId | 承办组织 | sign_subject_id | aa.baseorg.OrgMV |
| 21 | type | 合同类型 | type | DZHTFW.econtract.contractType |
| 22 | customerId | 客户 | customer_id | aa.merchant.Merchant |
| 23 | supplierId | 供应商 | supplier_id | aa.vendor.Vendor |
| 24 | activity | 活动 | activity | pgrm.projecttask.ProjectScheduleTask |
| 25 | wbs | WBS | wbs | BGDM.wbs.wbs_doc |
| 26 | auditor | 审批人 | auditor | base.user.BipUser |
| 27 | creator | 创建人 | creator | base.user.BipUser |
| 28 | modifier | 修改人 | modifier | base.user.BipUser |
| 29 | ytenantId | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 30 | orgId | 主组织 | org_id | org.func.BaseOrg |

---
## Enum Fields (32)

| # | name | displayName | columnName | enumType |
|---|------|-------------|------------|----------|
| 1 | applyStandardTpl | 是否申请为标准合同模板 | apply_standard_tpl | isOnOrYes |
| 2 | bWatermark | 是否无水印 | b_watermark | bWatermark |
| 3 | beginningFlag | 期初标记 | beginning_flag | isOnOrYes |
| 4 | changeStatus | 变更状态(不要使用) | change_status | changeState |
| 5 | concludeType | 签订类型 | conclude_type | concludeType |
| 6 | contractFileStatus | 合同归档状态 | contract_file_status | placeFileState |
| 7 | createMethod | 合同生成方式 | create_method | contractCreateMethod |
| 8 | ctClass | 合同性质 | ct_class | ctClass |
| 9 | ctPeriod | 合同期限 | ct_period | period |
| 10 | econtractStatus | 合同模板状态 | econtract_status | econtractState |
| 11 | efileMode | 合同文件模式 | efile_mode | contractFileMode_C |
| 12 | finalizeStatus | 定稿状态 | finalize_status | finalizeStatus |
| 13 | importantLevel | 重要程度 | important_level | importantLevel |
| 14 | isBackDate | 是否倒签 | is_back_date | isOnOrYes |
| 15 | isEcontract | 是否为电子合同 | is_econtract | isEcontract |
| 16 | isHaveTax | 合同金额是否含税 | is_have_tax | isOnOrYes |
| 17 | isMaterial | 物料分类合同 | is_material | isOnOrYes |
| 18 | isOpenContract | 是否开口合同 | is_open_contract | isOnOrYes |
| 19 | isReturnConfirm | 是否回传确认 | is_return_confirm | isOnOrYes |
| 20 | maintenanceType | 维护类型 | maintenance_type | maintenanceType |
| 21 | reDirection | 收支方向 | re_direction | reDirection |
| 22 | returnConfirmStatus | 回传确认状态 | return_confirm_status | ReturnConfirmStatusEnum |
| 23 | signPriority | 签署优先级 | sign_priority | signSort |
| 24 | signType | 签署方式 | sign_type | signType |
| 25 | sourceSys | 合同来源 | source_sys | clmSourceSys |
| 26 | stampStatus | 用印状态 | stamp_status | stampStatus |
| 27 | status | 合同状态 | status | contractStatus |
| 28 | targetSys |  推送系统 | target_sys | targetSys |
| 29 | urgentLevel | 紧急程度 | urgent_level | urgentLevel |
| 30 | eprojectInitiationStatus | 立项状态 | eproject_initiation_status | projectInitiationStatus |
| 31 | exchangeRateOps | 汇率折算方式 | exchange_rate_ops | ExchangeRateMethod |
| 32 | verifyState | 单据状态 | verifystate | sys_verifystate |

---
## Key Enum Details

### 是否无水印 (bWatermark) -> b_watermark
> Enum URI: unitfyEnum.CLM.bWatermark

| code | value | name |
|------|-------|------|
| 0 | 0 | 定稿水印 |
| 2 | 2 | 回传水印 |
| 1 | 1 | 否 |

### 变更状态(不要使用) (changeStatus) -> change_status
> Enum URI: unitfyEnum.CLM.changeState

| code | value | name |
|------|-------|------|
| 0 | 0 | 未变更 |
| 1 | 1 | 未提交 |
| 2 | 2 | 变更中 |
| 3 | 3 | 变更不通过 |
| 4 | 4 | 变更完成 |
| 5 | 5 | 变更作废 |

### 签订类型 (concludeType) -> conclude_type
> Enum URI: unitfyEnum.CLM.concludeType

| code | value | name |
|------|-------|------|
| 1 | 1 | 新签 |
| 2 | 2 | 续签 |
| 3 | 3 | 变更 |
| 4 | 4 | 其他 |

### 合同归档状态 (contractFileStatus) -> contract_file_status
> Enum URI: unitfyEnum.CLM.placeFileState

| code | value | name |
|------|-------|------|
| 0 | 0 | 未归档 |
| 1 | 1 | 已归档 |
| 2 | 2 | 归档中 |
| 3 | 3 | 归档退回 |
| 4 | 4 | 归档失败 |

### 合同生成方式 (createMethod) -> create_method
> Enum URI: unitfyEnum.CLM.contractCreateMethod

| code | value | name |
|------|-------|------|
| 1 | 1 | 标准合同 |
| 0 | 0 | 非标准合同 |

### 合同性质 (ctClass) -> ct_class
> Enum URI: unitfyEnum.CLM.ctClass

| code | value | name |
|------|-------|------|
| 1 | 1 | 普通合同 |
| 2 | 2 | 框架协议 |

### 合同期限 (ctPeriod) -> ct_period
> Enum URI: unitfyEnum.CLM.period

| code | value | name |
|------|-------|------|
| 0 | 0 | 固定期限 |
| 1 | 1 | 无固定期限 |

### 合同模板状态 (econtractStatus) -> econtract_status
> Enum URI: unitfyEnum.CLM.econtractState

| code | value | name |
|------|-------|------|
| 0 | 0 | 未签署 |
| 1 | 1 | 签署中 |
| 2 | 2 | 签署不通过 |
| 3 | 3 | 签署完成 |

### 定稿状态 (finalizeStatus) -> finalize_status
> Enum URI: unitfyEnum.CLM.finalizeStatus

| code | value | name |
|------|-------|------|
| 2 | 2 | 定稿失败 |
| 3 | 3 | 定稿中 |
| 0 | 0 | 未定稿 |
| 1 | 1 | 已定稿 |

### 重要程度 (importantLevel) -> important_level
> Enum URI: unitfyEnum.CLM.importantLevel

| code | value | name |
|------|-------|------|
| 1 | 1 | 一般 |
| 2 | 2 | 普通 |
| 3 | 3 | 重大 |

### 是否为电子合同 (isEcontract) -> is_econtract
> Enum URI: unitfyEnum.CLM.isEcontract

| code | value | name |
|------|-------|------|
| 0 | 0 | 否 |
| 1 | 1 | 是 |

### 维护类型 (maintenanceType) -> maintenance_type
> Enum URI: unitfyEnum.CLM.maintenanceType

| code | value | name |
|------|-------|------|
| 1 | 1 | 新合同 |
| 2 | 2 | 历史合同 |

### 收支方向 (reDirection) -> re_direction
> Enum URI: unitfyEnum.CLM.reDirection

| code | value | name |
|------|-------|------|
| 0 | 0 | 无 |
| 1 | 1 | 收款 |
| 2 | 2 | 付款 |

### 回传确认状态 (returnConfirmStatus) -> return_confirm_status
> Enum URI: unitfyEnum.CLM.ReturnConfirmStatusEnum

| code | value | name |
|------|-------|------|
| 0 | 0 | 未确认 |
| 1 | 1 | 确认中 |
| 2 | 2 | 确认通过 |
| 3 | 3 | 确认不通过 |

### 签署优先级 (signPriority) -> sign_priority
> Enum URI: unitfyEnum.CLM.signSort

| code | value | name |
|------|-------|------|
| 1 | 1 | 我方先签 |
| 2 | 2 | 相对方先签 |

### 签署方式 (signType) -> sign_type
> Enum URI: unitfyEnum.CLM.signType

| code | value | name |
|------|-------|------|
| 1 | 1 | 电子签署 |
| 2 | 2 | 线下签署 |
| 0 | 0 | 无需签署 |

### 合同来源 (sourceSys) -> source_sys
> Enum URI: unitfyEnum.CLM.clmSourceSys

| code | value | name |
|------|-------|------|
| 1 | 1 | CLM合同 |
| 2 | 2 | 高级版 |
| 3 | 3 | 第三方 |

### 用印状态 (stampStatus) -> stamp_status
> Enum URI: unitfyEnum.CLM.stampStatus

| code | value | name |
|------|-------|------|
| 1 | 1 | 待用印 |
| 2 | 2 | 用印中 |
| 3 | 3 | 用印完成 |
| 4 | 4 | 用印不通过 |

### 合同状态 (status) -> status
> Enum URI: unitfyEnum.CLM.contractStatus

| code | value | name |
|------|-------|------|
| 1 | 1 | 开立 |
| 10 | 10 | 办结 |
| 11 | 11 | 终止 |
| 12 | 12 | 审批终止 |
| 13 | 13 | 作废 |
| 2 | 2 | 审批中 |
| 3 | 3 | 已审批 |
| 4 | 4 | 签署中 |
| 5 | 5 | 已拒签 |
| 6 | 6 | 签署完成 |
| 7 | 7 | 已回传 |
| 8 | 8 | 生效 |
| 9 | 9 | 冻结 |
| 14 | 14 | 归档中 |

###  推送系统 (targetSys) -> target_sys
> Enum URI: unitfyEnum.CLM.targetSys

| code | value | name |
|------|-------|------|
| 2 | 2 | 高级版 |

### 紧急程度 (urgentLevel) -> urgent_level
> Enum URI: unitfyEnum.CLM.urgentLevel

| code | value | name |
|------|-------|------|
| 1 | 1 | 一般 |
| 2 | 2 | 紧急 |
| 3 | 3 | 特急 |

### 立项状态 (eprojectInitiationStatus) -> eproject_initiation_status
> Enum URI: unitfyEnum.CLM.projectInitiationStatus

| code | value | name |
|------|-------|------|
| 0 | 0 | 未立项 |
| 1 | 1 | 立项中 |
| 2 | 2 | 已立项 |

### 汇率折算方式 (exchangeRateOps) -> exchange_rate_ops
> Enum URI: unitfyEnum.GZTBDM.ExchangeRateMethod

| code | value | name |
|------|-------|------|
| 1 | 1 | * |
| 2 | 2 | / |

### 单据状态 (verifyState) -> verifystate
> Enum URI: unitfyEnum.GZTSYS.sys_verifystate

| code | value | name |
|------|-------|------|
| 0 | 0 | 开立态 |
| 1 | 1 | 审核中 |
| 2 | 2 | 已审核 |
| 3 | 3 | 终止态 |
| 4 | 4 | 驳回到制单 |
