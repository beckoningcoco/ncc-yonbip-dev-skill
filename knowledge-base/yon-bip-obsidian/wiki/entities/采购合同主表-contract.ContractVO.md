---
tags: ["BIP", "元数据", "数据字典", "ycContractManagement", "cpu-contract.contract.ContractVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购合同主表 (`cpu-contract.contract.ContractVO`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycContractManagement 模块实体元数据字典。
> 物理表：`cpu_ct` | 所属应用：`ycContractManagement`
> 来源：元数据API `queryByUri` 返回的 `cpu-contract.contract.ContractVO` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购合同主表 |
| 物理表 | `cpu_ct` |
| domain/服务域 | `cpu-contract` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycContractManagement` |
| 业务对象ID | `6df3bac7-6df7-4404-a525-c658562ccb59` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:08:01.3200` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `billno` | `billno` | String | 合同编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-23 00:06:29:000
- **安装来源**: `/app/data_scripts/cpu-cooperation-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_cpu_cooperation/0010_iuap_common/DML/0270_iuap_metadata/202604/202604031737_metadata_cpu-contract-contract_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `5ba461fc-d68e-4f56-9235-ba62c48a66ac`

## 业务场景

- `econtract`
- `workflow`
- `DataAuth`
- `transtype`
- `isCoreBill`
- `userdefine`
- `classified`
- `prewarning`
- `FieldAuth`
- `print`
- `UITemplate`
- `imextmp`
- `filegroup`
- `report`
- `billcode`
- `ruleengine`
- `msgtemplate`
- `api`
- `bpm`

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`, `data_auth`, `isCoding`, `isMultiCodeRule`, `isMain`, `doc`, `isUseCondition`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 11 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 合同条款接口 (`IContractTerms`) | `pub.itf.IContractTerms` | 175 | 8 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 3 | 企业ID (`IEnterprise`) | `cpu-base.itf.IEnterprise` | 7 | 1 |
| 4 | 审批流信息 (`IApprovalFlow`) | `base.itf.IApprovalFlow` | 134 | 3 |
| 5 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| 6 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 7 | 流程接口 (`IBusinessFlow`) | `base.itf.IBusinessFlow` | 77 | 2 |
| 8 | 审批信息 (`IApprovalInfo`) | `base.itf.IApprovalInfo` | 172 | 4 |
| 9 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 10 | 审批提交信息 (`ISubmitInfo`) | `ucfbase.ucfbaseItf.ISubmitInfo` | 85 | 4 |
| 11 | 打印次数 (`IPrintCount`) | `base.itf.IPrintCount` | 66 | 1 |

---

## 直接属性（共 300 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `ctjlId` | 合同台账主键 | `ctjl_id` | a2b72a3c-8c65-4b56-8e8f-35821ac27556 | `quote` |  | ✓ |
| 2 | `contractPreviewUrl` | 签章查看地址 | `contract_preview_url` | String | `text` |  | ✓ |
| 3 | `processId` | 签章流程主键 | `process_id` | String | `text` |  | ✓ |
| 4 | `refuseSignReason` | 拒签原因 | `refuse_sign_reason` | String | `text` |  | ✓ |
| 5 | `signFinishTime` | 签署完成时间 | `sign_finish_time` | DateTime | `timestamp` |  | ✓ |
| 6 | `signFlow` | 签署流程 | `sign_flow` | Integer | `int` |  | ✓ |
| 7 | `submitSignPerson` | 提交签署人 | `submit_sign_person` | String | `text` |  | ✓ |
| 8 | `submitSignTime` | 提交签署时间 | `submit_sign_time` | DateTime | `timestamp` |  | ✓ |
| 9 | `paymentBasis` | 付款依据 | `paymentBasis` | Integer | `int` |  | ✓ |
| 10 | `eContractWordFileId` | 电子合同word附件 | `econtract_word_file_id` | String | `attachment` |  | ✓ |
| 11 | `eContractbCanModify` | 电子合同可编辑 | `econtract_can_modify` | Boolean | `switch` |  | ✓ |
| 12 | `filedPersonId` | 归档人主键 | `filed_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 13 | `filedStatus` | 归档状态 | `filed_status` | String | `text` |  | ✓ |
| 14 | `filedTime` | 归档时间 | `filed_time` | DateTime | `timestamp` |  | ✓ |
| 15 | `priceStructure` | 价格构成 | `price_structure` | String | `text` |  | ✓ |
| 16 | `pushPaycontractFailReason` | 付款合同推送失败原因 | `push_paycontract_fail_reason` | String | `text` |  | ✓ |
| 17 | `ctjlCode` | 合同台账编码 | `ctjl_code` | String | `text` |  | ✓ |
| 18 | `ctSignId` | 签署人主键 | `ct_sign_id` | String | `text` |  | ✓ |
| 19 | `creatorId` | 创建人主键 | `creator_Id` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 20 | `ctTplCode` | 合同模板编码 | `ct_tpl_code` | String | `text` |  | ✓ |
| 21 | `ctTplId` | 合同模板主键 | `ct_tpl_id` | 2a45fe2c-202e-46a1-ba09-2f4ea704ae2b | `quote` |  | ✓ |
| 22 | `billTemplateId` | 单据模板主键 | `bill_template_id` | fa7aa0a8-dffb-4595-ab15-ad7053de81a3 | `quote` |  | ✓ |
| 23 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | ✓ |
| 24 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 25 | `sendErpStatus` | 发送erp状态 | `send_erp_status` | String | `text` |  | ✓ |
| 26 | `eContractFileName` | 电子合同文件名称 | `econtract_file_name` | String | `text` |  | ✓ |
| 27 | `collaborativeProcesse` | 协同流程 | `collaborative_processe` | Short | `short` |  | ✓ |
| 28 | `auditorId` | 审批人 | `auditor_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 29 | `submitter` | 提交人 | `submitter` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 30 | `eContractVoidReason` | 文本作废原因 | `econtract_void_reason` | String | `text` |  | ✓ |
| 31 | `eContractVoidFileId` | 已作废签署合同附件 | `econtract_void_fileId` | String | `attachment` |  | ✓ |
| 32 | `eContractVoidSignStatus` | 作废签署状态 | `econtract_void_signStatus` | Integer | `int` |  | ✓ |
| 33 | `paymentExcessControl` | 付款超额控制 | `payment_excess_control` | Short | `short` |  | ✓ |
| 34 | `contractStatus` | 合同单据状态 | `contract_status` | Short | `short` |  | ✓ |
| 35 | `collabStatus` | 协同状态 | `collab_status` | Short | `short` |  | ✓ |
| 36 | `erpCollabStatus` | ERP协同状态 | `erp_collab_status` | Short | `short` |  | ✓ |
| 37 | `ctChangeStatus` | 合同变更状态 | `ct_change_status` | Short | `short` |  | ✓ |
| 38 | `exchRateOps` | 汇率折算方式 | `exchRateOps` | ExchangeRateMethod | `` |  | ✓ |
| 39 | `signerName` | 当前签署人 | `signer_name` | String | `text` |  | ✓ |
| 40 | `legalType` | 合同法律类别 | `legal_type` | 402cfddf-275b-409e-b1d7-4289e0e0e983 | `quote` |  | ✓ |
| 41 | `paymentDimension` | 付款维度 | `payment_dimension` | Integer | `int` |  | ✓ |
| 42 | `sendChangeErpStatus` | 合同变更推送ERP状态 | `send_change_erp_status` | String | `text` |  | ✓ |
| 43 | `actualValiSysDate` | 系统生效时间 | `actual_vali_sys_date` | DateTime | `timestamp` |  | ✓ |
| 44 | `actualValiUserId` | 生效人 | `actual_vali_user_id` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 45 | `moneyControlType` | 金额控制方式 | `money_control_type` | Short | `short` |  | ✓ |
| 46 | `moneyRatio` | 金额超量比例 | `money_ratio` | Decimal | `number` |  | ✓ |
| 47 | `cumulativeMoney` | 累计下单无税金额 | `cumulative_money` | Decimal | `number` |  | ✓ |
| 48 | `cumulativeTaxMoney` | 累计下单含税金额 | `cumulative_tax_money` | Decimal | `number` |  | ✓ |
| 49 | `cancelType` | 履约状态变更类型 | `cancel_type` | Integer | `int` |  | ✓ |
| 50 | `chgStateUserId` | 履约状态变更人id | `chgState_userId` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 51 | `chgStateUserName` | 履约状态变更用户 | `chgState_userName` | String | `text` |  | ✓ |
| 52 | `chgStateMemo` | 履约状态变更原因 | `chgState_Memo` | String | `text` |  | ✓ |
| 53 | `chgStateDate` | 履约状态变更日期 | `chgState_date` | DateTime | `timestamp` |  | ✓ |
| 54 | `chgStateReasonId` | 履约状态变更原因档案 | `chgState_reasonId` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 | `quote` |  | ✓ |
| 55 | `chgStateFileId` | 履约状态变更附件 | `chgState_fileId` | String | `attachment` |  | ✓ |
| 56 | `purBipUserId` | Bip采购员用户 | `pur_bip_user_id` | String | `text` |  | ✓ |
| 57 | `terminateCloseBipUserId` | Bip关闭人 | `terminate_close_bip_user_id` | String | `text` |  | ✓ |
| 58 | `cancelBipUserId` | Bip作废人 | `cancel_bip_user_id` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 59 | `terminateBipUserId` | Bip终止人 | `terminate_bip_user_id` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 60 | `natMoney` | 本币无税金额 | `nat_money` | Decimal | `number` |  | ✓ |
| 61 | `natTaxMoney` | 本币含税金额 | `nat_tax_money` | Decimal | `number` |  | ✓ |
| 62 | `withdrawpp` | 撤回提交的人 | `withdrawpp` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 63 | `auditor` | 审批人名称 | `auditor` | String | `text` |  | ✓ |
| 64 | `auditTime` | 审批时间 | `audit_time` | DateTime | `timestamp` |  | ✓ |
| 65 | `auditDate` | 审批日期 | `audit_date` | Date | `date` |  | ✓ |
| 66 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 67 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 68 | `submitTime` | 提交时间 | `submit_time` | DateTime | `dateTime` |  | ✓ |
| 69 | `withdrawTime` | 撤回提交时间 | `withdraw_time` | DateTime | `dateTime` |  | ✓ |
| 70 | `printCount` | 打印次数 | `printCount` | Integer | `int` |  | ✓ |
| 71 | `otherStampFileId` | 其他需签署附件 | `other_stamp_fileId` | String | `text` |  | ✓ |
| 72 | `settleName` | 结算方式 | `settle_name` | String | `text` |  | ✓ |
| 73 | `projectName` | 项目名称 | `project_name` | String | `text` |  | ✓ |
| 74 | `money` | 无税金额 | `money` | Decimal | `number` |  | ✓ |
| 75 | `projectCode` | 项目编码 | `project_code` | String | `text` |  | ✓ |
| 76 | `taxMoney` | 含税金额 | `tax_money` | Decimal | `number` |  | ✓ |
| 77 | `executionStatus` | 执行状态 | `execution_status` | Integer | `int` |  | ✓ |
| 78 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean | `switch` |  | ✓ |
| 79 | `templateId` | 主模板主键 | `template_id` | 9846efd9-caa6-4b42-a848-477a09a83b44 | `quote` |  | ✓ |
| 80 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 81 | `ctTermsData` | 合同条款数据 | `ctTermsData` | String | `text` |  | ✓ |
| 82 | `bizFlow` | 业务流主键 | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 | `quote` |  | ✓ |
| 83 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 84 | `tenant` | 租户主键 | `tenant_id` | String | `text` |  | ✓ |
| 85 | `status` | 单据状态 | `status` | Short | `short` |  | ✓ |
| 86 | `verifystate` | 审批流程状态 | `verifystate` | Short | `short` |  | ✓ |
| 87 | `vouchdate` | 单据日期 | `vouchdate` | Date | `date` | ✓ |  |
| 88 | `ctTplName` | 合同模板名称 | `ct_tpl_name` | String | `text` |  | ✓ |
| 89 | `ctTplVersion` | 合同模板版本 | `ct_tpl_version` | String | `text` |  | ✓ |
| 90 | `eContractCreateType` | 变更合同生成方式 | `econtract_create_type` | String | `text` |  | ✓ |
| 91 | `consultVersion` | 磋商版本 | `consultVersion` | Integer | `int` |  | ✓ |
| 92 | `consultStatus` | 磋商状态 | `consultStatus` | String | `text` |  | ✓ |
| 93 | `reqDeptName` | 需求部门名称 | `req_dept_name` | String | `text` |  | ✓ |
| 94 | `consultType` | 磋商操作类型 | `consultType` | String | `text` |  | ✓ |
| 95 | `billcategory` | 合同类型 | `billcategory` | b23c8bcc-9978-44fb-a5d5-b54d687b59bb | `quote` |  | ✓ |
| 96 | `payment_process` | 付款流程 | `payment_process` | String | `text` |  | ✓ |
| 97 | `purContactPersonId` | 甲方联系人主键 | `pur_contact_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 98 | `eContractFileId` | 电子合同附件 | `econtract_file_id` | String | `attachment` |  | ✓ |
| 99 | `eContractServiceType` | 合同服务类型 | `econtract_service_type` | String | `text` |  | ✓ |
| 100 | `signOffline` | 是否线下签署 | `sign_offline` | Integer | `int` |  | ✓ |
| 101 | `nonStandardFileId` | 非制式合同 | `nonstandard_file_id` | String | `attachment` |  | ✓ |
| 102 | `signStatus` | 电子签署状态 | `sign_status` | Short | `short` |  | ✓ |
| 103 | `bAllowConsult` | 是否与供应商磋商 | `bAllowConsult` | Boolean | `switch` |  | ✓ |
| 104 | `isPushPaycontract` | 是否推付款合同 | `is_push_paycontract` | Boolean | `switch` |  | ✓ |
| 105 | `signedFileId` | 已签合同附件 | `signed_file_id` | String | `attachment` |  | ✓ |
| 106 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 107 | `code` | 合同编码 | `billno` | String | `text` |  | ✓ |
| 108 | `approveEndTime` | 审批通过时间 | `approve_end_time` | DateTime | `timestamp` |  | ✓ |
| 109 | `businessType` | 业务类型 | `business_type` | String | `text` |  | ✓ |
| 110 | `ectOldBillCode` | 旧电子合同编号 | `ect_old_bill_code` | String | `text` |  | ✓ |
| 111 | `serviceConfirMode` | 服务确认方式 | `service_confirmode` | String | `text` |  | ✓ |
| 112 | `ectOldFilePath` | 旧电子合同文件路径 | `ect_old_file_path` | String | `text` |  | ✓ |
| 113 | `ectOldId` | 旧电子合同主键(废弃) | `ect_old_id` | String | `text` |  | ✓ |
| 114 | `exchRateDate` | 汇率日期 | `exch_rate_date` | Date | `date` |  | ✓ |
| 115 | `ectOldTemplateCode` | 旧电子合同模板编号 | `ect_old_template_code` | String | `text` |  | ✓ |
| 116 | `ectOldTemplateId` | 旧电子合同模板主键 | `ect_old_template_id` | String | `text` |  | ✓ |
| 117 | `ectOldTemplateName` | 旧电子合同模板名称  | `ect_old_template_name` | String | `text` |  | ✓ |
| 118 | `externalFileId` | 外部附件 | `external_file_id` | String | `attachment` |  | ✓ |
| 119 | `internalFileId` | 内控附件 | `internal_file_id` | String | `attachment` |  | ✓ |
| 120 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean | `switch` |  | ✓ |
| 121 | `exchRate` | 汇率 | `exch_rate` | Decimal | `number` |  | ✓ |
| 122 | `saleFileId` | 供应方附件 | `sale_file_id` | String | `attachment` |  | ✓ |
| 123 | `saleStampFileId` | 供应方盖章附件 | `sale_stamp_file_id` | String | `attachment` |  | ✓ |
| 124 | `stockStampFileId` | 采购盖章附件 | `stock_stamp_file_id` | String | `attachment` |  | ✓ |
| 125 | `billstatus` | 单据状态(废弃) | `billstatus` | String | `text` |  | ✓ |
| 126 | `subject` | 合同标题 | `subject` | String | `text` |  | ✓ |
| 127 | `orgId` | 采购组织主键 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 128 | `orgName` | 采购组织名称 | `org_name` | String | `text` |  | ✓ |
| 129 | `supplierId` | 供应商主键 | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 130 | `isMultiParty` | 是否多方合同 | `is_multi_party` | String | `text` |  | ✓ |
| 131 | `supplierSupName` | 供应商档案的供应商名称 | `supplier_sup_name` | String | `text` |  | ✓ |
| 132 | `creator` | 创建人 | `creator` | String | `text` |  | ✓ |
| 133 | `createTime` | 创建时间 | `createtime` | DateTime | `timestamp` |  | ✓ |
| 134 | `billtype` | 合同性质 | `billtype` | String | `text` |  | ✓ |
| 135 | `fbillstatus` | 合同审批状态(废弃) | `fbillstatus` | String | `text` |  | ✓ |
| 136 | `subscribedate` | 合同签订日期 | `subscribedate` | Date | `date` |  | ✓ |
| 137 | `firstPartyId` | 甲方主键 | `first_party_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |  | ✓ |
| 138 | `firstPartyName` | 甲方名称 | `first_party_name` | String | `text` |  | ✓ |
| 139 | `secondPartyId` | 乙方主键 | `second_party_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 140 | `secondPartyName` | 乙方名称 | `second_party_name` | String | `text` |  | ✓ |
| 141 | `totalnum` | 总计价数量 | `totalnum` | Decimal | `number` |  | ✓ |
| 142 | `ERPProjectName` | Erp项目名称 | `erp_project_name` | String | `text` |  | ✓ |
| 143 | `deliveryMethod` | 发票寄送方式 | `delivery_method` | String | `text` |  | ✓ |
| 144 | `description` | 随货送票说明 | `description` | String | `text` |  | ✓ |
| 145 | `toProductStatus` | 合同生成商品流程状态 | `to_product_status` | Integer | `int` |  | ✓ |
| 146 | `sendErpMsg` | 发送erp信息 | `send_erp_msg` | String | `text` |  | ✓ |
| 147 | `logisticsCode` | 物流单号 | `logistics_code` | String | `text` |  | ✓ |
| 148 | `logisticsCompany` | 物流公司 | `logistics_company` | String | `text` |  | ✓ |
| 149 | `logisticsCompanyCode` | 物流公司代码 | `logistics_company_code` | String | `text` |  | ✓ |
| 150 | `agentConfirmDate` | 代确认时间 | `agent_confirm_date` | DateTime | `timestamp` |  | ✓ |
| 151 | `agentConfirmPersonId` | 代确认人主键 | `agent_confirm_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 152 | `agentConfirmPersonName` | 代确认人 | `agent_confirm_person_name` | String | `text` |  | ✓ |
| 153 | `modifiedtime` | 修改时间 | `modifiedtime` | DateTime | `timestamp` |  | ✓ |
| 154 | `erpProductVersion` | ERP系统版本 | `erp_product_version` | String | `text` |  | ✓ |
| 155 | `enterpriseId` | 企业主键(采购云) | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 | `quote` | ✓ | ✓ |
| 156 | `enterpriseName` | 租户名称 | `enterprise_name` | String | `text` |  | ✓ |
| 157 | `supEnterpriseId` | 供应商企业主键(采购云) | `sup_enterprise_id` | Long | `long` |  | ✓ |
| 158 | `supPersionId` | 供应商联系人主键 | `sup_persion_id` | b94fa77c-2f2b-464c-96fb-d028543825ee | `quote` |  | ✓ |
| 159 | `supPersionName` | 供应商联系人 | `sup_persion_name` | String | `text` |  | ✓ |
| 160 | `supPersonTel` | 供应商联系人座机 | `sup_person_tel` | String | `text` |  | ✓ |
| 161 | `supPersonMobile` | 供应商联系人手机号 | `sup_person_mobile` | String | `text` |  | ✓ |
| 162 | `purPersonId` | 采购员主键 | `pur_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 163 | `purUserId` | 币种主键 | `pur_user_id` | a2f7c666-0173-4f52-bf36-ed780414b2f3 | `quote` |  | ✓ |
| 164 | `purPersonTel` | 采购员座机电话 | `pur_person_tel` | String | `text` |  | ✓ |
| 165 | `purPersonMobile` | 采购员手机号 | `pur_person_mobile` | String | `text` |  | ✓ |
| 166 | `memo` | 备注 | `memo` | String | `text` |  | ✓ |
| 167 | `deliveryAddress` | 收货地址 | `delivery_address` | String | `text` |  | ✓ |
| 168 | `actualvalidate` | 合同生效日期 | `actualvalidate` | Date | `date` |  | ✓ |
| 169 | `actualinvalidate` | 合同终止日期 | `actualinvalidate` | Date | `date` |  | ✓ |
| 170 | `totalPayMny` | 累计付款总额 | `total_pay_mny` | Decimal | `number` |  | ✓ |
| 171 | `reason` | 拒绝/变更的理由 | `reason` | String | `text` |  | ✓ |
| 172 | `erpCtCode` | ERP合同编码 | `erp_ct_code` | String | `text` |  | ✓ |
| 173 | `buyofferId` | 询价单主键 | `buyoffer_id` | Long | `long` |  | ✓ |
| 174 | `sourceType` | 来源 | `source_type` | String | `text` |  | ✓ |
| 175 | `isMaterialClass` | 是否物料分类合同 | `is_material_class` | Boolean | `switch` |  | ✓ |
| 176 | `effectContract` | 合同生效是否需要供应商协同 | `effect_contract` | String | `text` |  | ✓ |
| 177 | `deptName` | 采购部门名称 | `dept_name` | String | `text` |  | ✓ |
| 178 | `deptId` | 采购部门 | `dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |  | ✓ |
| 179 | `supplyPayment` | 付款条件 | `supply_payment` | String | `text` |  | ✓ |
| 180 | `supplyDelivery` | 交货说明 | `supply_delivery` | String | `text` |  | ✓ |
| 181 | `quotaSupplyMny` | 供应商首次报价总金额 | `quota_supplymny` | Decimal | `number` |  | ✓ |
| 182 | `quotaSupplys` | 供应商报价家数 | `quota_supplys` | Integer | `int` |  | ✓ |
| 183 | `furtureTemplate` | 确认是否启用期货报价模板  1表示使用期货报价模板  0表示用之前的报价 | `furture_template` | String | `text` |  | ✓ |
| 184 | `offerType` | 期货报价模板下的报价方式  1实价 2 浮动金额  3 浮动比例 | `offer_type` | String | `text` |  | ✓ |
| 185 | `advanceRatio` | 选择报价模式下的部分预付,预付比例字段必填 | `advance_ratio` | Decimal | `number` |  | ✓ |
| 186 | `totalFullMoney` | 全额预付总价 | `total_full_money` | Decimal | `number` |  | ✓ |
| 187 | `totalPartialMoney` | 部分预付总价 | `total_partial_money` | Decimal | `number` |  | ✓ |
| 188 | `receiveAddress` | 收货地址 | `receive_address` | String | `text` |  | ✓ |
| 189 | `addressName` | 地址名称 | `address_name` | String | `text` |  | ✓ |
| 190 | `reqUapProjectId` | 平台项目档案主键 | `req_uap_project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |  | ✓ |
| 191 | `receiveArea` | 区域 | `receive_area` | String | `text` |  | ✓ |
| 192 | `receiver` | 收货人 | `receiver` | String | `text` |  | ✓ |
| 193 | `phone` | 联系方式 | `phone` | String | `text` |  | ✓ |
| 194 | `purContentType` | 采购内容 | `pur_content_type` | String | `text` |  | ✓ |
| 195 | `parentContractno` | 父合同编码 | `parent_contractno` | String | `text` |  | ✓ |
| 196 | `projectAddress` | 项目详细地址 | `project_address` | String | `text` |  | ✓ |
| 197 | `parentContractName` | 父合同名称 | `parent_contract_name` | String | `text` |  | ✓ |
| 198 | `vBuyOfferBillCode` | 询报价单单据号 | `vbuyoffer_billcode` | String | `text` |  | ✓ |
| 199 | `taxlessFullMoney` | 无税总价全额预付 | `taxless_full_money` | Decimal | `number` |  | ✓ |
| 200 | `taxlessPartialMoney` | 无税总价部分预付 | `taxless_partial_money` | Decimal | `number` |  | ✓ |
| 201 | `transtypeCode` | 交易类型编码 | `transtype_code` | String | `text` |  | ✓ |
| 202 | `transtypeName` | 交易类型名称 | `transtype_name` | String | `text` |  | ✓ |
| 203 | `transtypeSource` | 交易类型来源 | `transtype_source` | Boolean | `switch` |  | ✓ |
| 204 | `signAddress` | 签订地点 | `sign_address` | String | `text` |  | ✓ |
| 205 | `controlType` | 合同签订形式 | `control_type` | String | `text` |  | ✓ |
| 206 | `execType` | 执行方式-是否可以超数量执行 | `exec_type` | String | `text` |  | ✓ |
| 207 | `settleType` | 结算方式编码 | `settle_type` | String | `text` |  | ✓ |
| 208 | `payAgreement` | 付款协议 | `pay_agreement` | String | `text` |  | ✓ |
| 209 | `invoiceAgreement` | 发票协议 | `invoice_agreement` | String | `text` |  | ✓ |
| 210 | `termManualAddEnable` | 条款可否删除 | `term_manual_add_enable` | Boolean | `switch` |  | ✓ |
| 211 | `shelfPeriod` | 质保期 | `shelf_period` | String | `text` |  | ✓ |
| 212 | `workPeriod` | 工期 | `work_period` | String | `text` |  | ✓ |
| 213 | `outerCTBillCode` | 外部合同号 | `outer_ct_billcode` | String | `text` |  | ✓ |
| 214 | `shelfRatio` | 质保金或比例 | `shelf_ratio` | Decimal | `number` |  | ✓ |
| 215 | `ectBillCode` | 电子合同编号 | `ect_bill_code` | String | `text` |  | ✓ |
| 216 | `ectTemplateCode` | 电子合同模板编号 | `ect_template_code` | String | `text` |  | ✓ |
| 217 | `ectTemplateName` | 电子合同模板名称  | `ect_template_name` | String | `text` |  | ✓ |
| 218 | `ectFilePath` | 电子合同文件路径 | `ect_file_path` | String | `text` |  | ✓ |
| 219 | `signatureEffect` | 签章是否生效 | `signature_effect` | Integer | `int` |  | ✓ |
| 220 | `signatureStatus` | 签章状态 | `signature_status` | String | `text` |  | ✓ |
| 221 | `changingCommitterName` | 变更人 | `changing_committer_name` | String | `text` |  | ✓ |
| 222 | `changingCommittedDate` | 变更时间 | `changing_committed_date` | DateTime | `timestamp` |  | ✓ |
| 223 | `changingCommittedReason` | 变更理由 | `changing_committed_reason` | String | `text` |  | ✓ |
| 224 | `changingConfirmerName` | 变更确认人 | `changing_confirmer_name` | String | `text` |  | ✓ |
| 225 | `changingConfirmedDate` | 变更确认时间 | `changing_confirmed_date` | DateTime | `timestamp` |  | ✓ |
| 226 | `changingRejectedReason` | 变更被拒绝原因 | `changing_rejected_reason` | String | `text` |  | ✓ |
| 227 | `changingStatus` | 变更状态 | `changing_status` | String | `text` |  | ✓ |
| 228 | `changingAction` | 变更动作:终止合同、变更合同 | `changing_action` | String | `text` |  | ✓ |
| 229 | `changingVersion` | 当前变更版本 | `changing_version` | String | `text` |  | ✓ |
| 230 | `changingInfo` | 变更信息 | `changing_info` | String | `text` |  | ✓ |
| 231 | `orgScope` | 合同组织范围 | `org_scope` | Boolean | `switch` |  | ✓ |
| 232 | `signatureFailMessage` | 签章失败原因 | `signature_fail_message` | String | `text` |  | ✓ |
| 233 | `cancelUserId` | 作废人主键 | `cancel_user_id` | a2f7c666-0173-4f52-bf36-ed780414b2f3 | `quote` |  | ✓ |
| 234 | `cancelUserName` | 作废人名称 | `cancel_user_name` | String | `text` |  | ✓ |
| 235 | `cancelReason` | 作废原因 | `cancel_reason` | String | `text` |  | ✓ |
| 236 | `cancelDate` | 作废日期 | `cancel_date` | DateTime | `timestamp` |  | ✓ |
| 237 | `terminateUserId` | 终止人主键 | `terminate_user_id` | a2f7c666-0173-4f52-bf36-ed780414b2f3 | `quote` |  | ✓ |
| 238 | `terminateUserName` | 终止人名称 | `terminate_user_name` | String | `text` |  | ✓ |
| 239 | `terminateReason` | 终止原因 | `terminate_reason` | String | `text` |  | ✓ |
| 240 | `terminateDate` | 终止日期 | `terminate_date` | DateTime | `timestamp` |  | ✓ |
| 241 | `dealPsnId` | 处理人主键 | `deal_psn_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 242 | `dealPsnName` | 处理人名称 | `deal_psn_name` | String | `text` |  | ✓ |
| 243 | `parentContractId` | 父合同主键 | `parent_contract_id` | 6c20fd57-9f69-497e-a1af-d0b30f9be5c3 | `quote` |  | ✓ |
| 244 | `transtypeId` | 交易类型主键 | `transtype_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 245 | `termTemplateId` | 条款模板主键 | `term_template_id` | String | `text` |  | ✓ |
| 246 | `purContentTypeId` | 采购内容档案主键 | `pur_content_type_id` | 92b613a5-0e7c-4f87-8a9b-7fccc9ba556a | `quote` |  | ✓ |
| 247 | `settleTypeId` | 结算方式主键 | `settle_type_id` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff | `quote` |  | ✓ |
| 248 | `erpCtid` | ERP合同主键 | `erp_ct_id` | String | `text` |  | ✓ |
| 249 | `epayType` | 超合同付款 | `epay_type` | Boolean | `switch` |  | ✓ |
| 250 | `ectId` | 电子合同主键 | `ectid` | String | `text` |  | ✓ |
| 251 | `purPersonName` | 采购员姓名 | `pur_person_name` | String | `text` |  | ✓ |
| 252 | `currencyName` | 币种 | `currency_name` | String | `text` |  | ✓ |
| 253 | `currencySymbol` | 币种符号 | `currency_symbol` | String | `text` |  | ✓ |
| 254 | `currencyCode` | 币种编码 | `currency_code` | String | `text` |  | ✓ |
| 255 | `currencyId` | 币种主键 | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | ✓ |
| 256 | `payAgreementId` | 付款协议主键 | `pay_agreement_id` | 3cce8052-512e-4e51-9b6e-57adff40948c | `quote` |  | ✓ |
| 257 | `insideRemark` | 内审备注 | `inside_remark` | String | `text` |  | ✓ |
| 258 | `billFiledType` | 单据归档状态 | `bill_filed_type` | String | `text` |  | ✓ |
| 259 | `isAllowAdjustPrice` | 是否允许调价 | `is_allow_adjust_price` | String | `text` |  | ✓ |
| 260 | `intendPaymentmny` | 累计合同预付付款金额 | `intend_paymentmny` | Decimal | `number` |  | ✓ |
| 261 | `practicalPaymentmny` | 累计合同预付实付金额 | `practical_paymentmny` | Decimal | `number` |  | ✓ |
| 262 | `singleBudgetApplyId` | 单项预算申请单 | `single_budget_applyid` | c89a2b73-7637-4642-abc1-c49bf1a5c460 | `quote` |  | ✓ |
| 263 | `accPayApplyMoney` | 累计合同申请预付款金额 | `acc_pay_apply_money` | Decimal | `number` |  | ✓ |
| 264 | `pushPaycontractStatus` | 推付款合同状态 | `push_paycontract_status` | String | `text` |  | ✓ |
| 265 | `supMsgNotifierId` | 消息通知人主键 | `sup_msg_notifier_id` | b94fa77c-2f2b-464c-96fb-d028543825ee | `quote` |  | ✓ |
| 266 | `supMsgNotifierName` | 消息通知人名称 | `sup_msg_notifier_name` | String | `text` |  | ✓ |
| 267 | `ts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 268 | `paymentAgreementCode` | 付款协议编码 | `payment_agreement_code` | String | `text` |  | ✓ |
| 269 | `settlementBasis` | 结算依据 | `settlement_basis` | String | `text` |  | ✓ |
| 270 | `projectDocId` | 项目主键 | `project_doc_id` | String | `text` |  | ✓ |
| 271 | `supEnterpriseName` | 供应商租户的名字 | `sup_enterprise_name` | String | `text` |  | ✓ |
| 272 | `dr` | dr | `dr` | Integer | `int` |  | ✓ |
| 273 | `totalPurchaseNum` | 总采购数量 | `total_main_num` | Decimal | `number` |  | ✓ |
| 274 | `projectId` | 项目主键 | `project_id` | Long | `long` |  | ✓ |
| 275 | `pricedecisionId` | 定标单主表主键 | `pricedecision_id` | Long | `long` |  | ✓ |
| 276 | `ectTemplateId` | 电子合同模板主键 | `ect_template_id` | String | `text` |  | ✓ |
| 277 | `modifierId` | 修改人主键 | `modifier_Id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 278 | `ERPProjectId` | Erp项目档案主键 | `erp_project_id` | String | `text` |  | ✓ |
| 279 | `ContractVODefineCharacter` | 合同表头特征 | `defineHeader` | 5a73a0e2-c22f-4999-89c8-1dab6a40c687 | `UserDefine` |  | ✓ |
| 280 | `modifier` | 修改人 | `modifier` | String | `text` |  | ✓ |
| 281 | `totalMainNum` | 总主数量 | `total_purchase_num` | Decimal | `number` |  | ✓ |
| 282 | `reqDeptId` | 需求部门主键 | `req_dept_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 283 | `payTypes` | 期货报价模板下的报价模式(1表示账期2表示金额预付3表示部分预付) | `pay_types` | String | `text` |  | ✓ |
| 284 | `econtractCreateDate` | 电子合同生成时间 | `econtract_create_date` | DateTime | `timestamp` |  | ✓ |
| 285 | `terminateCloseUserId` | 关闭人主键 | `terminate_close_user_id` | a2f7c666-0173-4f52-bf36-ed780414b2f3 | `quote` |  | ✓ |
| 286 | `terminateCloseUserName` | 关闭人名称 | `terminate_close_user_name` | String | `text` |  | ✓ |
| 287 | `terminateCloseReason` | 关闭理由 | `terminate_close_reason` | String | `text` |  | ✓ |
| 288 | `terminateAction` | 终止动作 | `terminate_action` | String | `text` |  | ✓ |
| 289 | `terminateCloseDate` | 关闭日期 | `terminate_close_date` | DateTime | `timestamp` |  | ✓ |
| 290 | `natCurrency` | 本币 | `nat_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | ✓ |
| 291 | `exchRateType` | 汇率类型主键 | `exch_rate_type_id` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |  | ✓ |
| 292 | `bpmsource` | bpm源 | `bpmsource` | String | `text` |  | ✓ |
| 293 | `contractExpList` | 采购合同表体费用 | `` | f3b75c79-a95a-482b-91d7-ea85bc73d96e | `` |  |  |
| 294 | `contractMaterialList` | 采购合同表体物料 | `` | 07141343-35c1-4687-b99c-405bfa7a3096 | `` |  |  |
| 295 | `contractPartyList` | 合同多方签署 | `` | 2cf102c2-4db0-4c53-8054-eb1aea85036d | `` |  |  |
| 296 | `contractPayTermList` | 采购合同表体付款协议 | `` | e9956481-c2c6-4f0b-a371-960b026a67f6 | `` |  |  |
| 297 | `contractPrepayList` | 采购合同预付付款单表体 | `` | 6c467ee0-a02c-496c-958f-94b8fb0c566c | `` |  |  |
| 298 | `contractScopeList` | 采购合同适应组织 | `` | bfa6fed5-a9b9-4265-9610-7cffcceae27d | `` |  |  |
| 299 | `contractTermList` | 采购合同表体条款 | `` | 873806f0-228c-4dbd-9efc-0e107fa57891 | `` |  |  |
| 300 | `defines` | 采购合同表头自定义项 | `` | 5f5d4f89-40d3-4069-9987-d5a455aa179a | `` |  |  |

---

## 关联属性（共 55 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `billTemplateId` | 单据模板主键 | `tpl.templateinst.TplBillTemplateInst` | `bill_template_id` |  →  |  |  | Service |  |
| 2 | `secondPartyId` | 乙方主键 | `aa.vendor.Vendor` | `second_party_id` |  →  |  |  | Service |  |
| 3 | `cancelUserId` | 作废人主键 | `cpu-privilege.user.MgrUser` | `cancel_user_id` |  →  |  |  | Service |  |
| 4 | `modifierId` | 修改人主键 | `base.user.User` | `modifier_Id` |  →  |  |  | Service |  |
| 5 | `templateId` | 主模板主键 | `tpl.templateorginst.TplTemplateInst` | `template_id` |  →  |  |  | Service |  |
| 6 | `dealPsnId` | 处理人主键 | `bd.staff.Staff` | `deal_psn_id` |  →  |  |  | Service |  |
| 7 | `supMsgNotifierId` | 消息通知人主键 | `aa.vendor.VendorContacts` | `sup_msg_notifier_id` |  →  |  |  | Service |  |
| 8 | `defines` | 采购合同表头自定义项 | `cpu-contract.contract.ContractVODefine` | `` | defines → id | 1 | true | None | ⚠️ |
| 9 | `contractMaterialList` | 采购合同表体物料 | `cpu-contract.contract.ContractBodyVO` | `` | contractMaterialList → contractId | 1..n | true | None |  |
| 10 | `natCurrency` | 本币 | `bd.currencytenant.CurrencyTenantVO` | `nat_currency_id` |  →  |  |  | Service |  |
| 11 | `contractTermList` | 采购合同表体条款 | `cpu-contract.contract.ContractTermVO` | `` | contractTermList → contractId | 0..n | true | None |  |
| 12 | `chgStateReasonId` | 履约状态变更原因档案 | `aa.reason.Reason` | `chgState_reasonId` |  →  |  |  | Service |  |
| 13 | `currencyId` | 币种主键 | `bd.currencytenant.CurrencyTenantVO` | `currency_id` |  →  |  |  | Service |  |
| 14 | `actualValiUserId` | 生效人 | `base.user.BipUser` | `actual_vali_user_id` |  →  |  |  | Service |  |
| 15 | `contractPartyList` | 合同多方签署 | `cpu-contract.contract.ContractSignParty` | `` | contractPartyList → contractId | 0..n | true | None |  |
| 16 | `purPersonId` | 采购员主键 | `bd.staff.Staff` | `pur_person_id` |  →  |  |  | Service |  |
| 17 | `reqUapProjectId` | 平台项目档案主键 | `bd.project.ProjectVO` | `req_uap_project_id` |  →  |  |  | Service |  |
| 18 | `contractScopeList` | 采购合同适应组织 | `cpu-contract.contract.ContractOrgScopeVO` | `` | contractScopeList → contractId | 0..n | true | None |  |
| 19 | `terminateUserId` | 终止人主键 | `cpu-privilege.user.MgrUser` | `terminate_user_id` |  →  |  |  | Service |  |
| 20 | `deptId` | 采购部门 | `bd.adminOrg.AdminOrgVO` | `dept_id` |  →  |  |  | Service |  |
| 21 | `contractPayTermList` | 采购合同表体付款协议 | `cpu-contract.contract.ContractPayTermVO` | `` | contractPayTermList → contractId | 0..n | true | None |  |
| 22 | `contractPrepayList` | 采购合同预付付款单表体 | `cpu-contract.contract.ContractPrepayVo` | `` | contractPrepayList → contractId | 0..n | true | None |  |
| 23 | `billcategory` | 合同类型 | `DZHTFW.econtract.contractType` | `billcategory` |  →  |  |  | Service |  |
| 24 | `supPersionId` | 供应商联系人主键 | `aa.vendor.VendorContacts` | `sup_persion_id` |  →  |  |  | Service |  |
| 25 | `auditorId` | 审批人 | `base.user.User` | `auditor_id` |  →  |  |  | Service |  |
| 26 | `cancelBipUserId` | Bip作废人 | `base.user.BipUser` | `cancel_bip_user_id` |  →  |  |  | Service |  |
| 27 | `exchRateType` | 汇率类型主键 | `bd.exchangeRate.ExchangeRateTypeVO` | `exch_rate_type_id` |  →  |  |  | Service |  |
| 28 | `terminateBipUserId` | Bip终止人 | `base.user.BipUser` | `terminate_bip_user_id` |  →  |  |  | Service |  |
| 29 | `terminateCloseUserId` | 关闭人主键 | `cpu-privilege.user.MgrUser` | `terminate_close_user_id` |  →  |  |  | Service |  |
| 30 | `submitter` | 提交人 | `base.user.BipUser` | `submitter` |  →  |  |  | Service |  |
| 31 | `ContractVODefineCharacter` | 合同表头特征 | `cpu-contract.contract.CTHeaderDefine` | `defineHeader` |  →  |  |  | None |  |
| 32 | `purContentTypeId` | 采购内容档案主键 | `bctask.basedoc.CustomerDocVO` | `pur_content_type_id` |  →  |  |  | Service |  |
| 33 | `purUserId` | 币种主键 | `cpu-privilege.user.MgrUser` | `pur_user_id` |  →  |  |  | Service |  |
| 34 | `reqDeptId` | 需求部门主键 | `org.func.BaseOrg` | `req_dept_id` |  →  |  |  | Service |  |
| 35 | `supplierId` | 供应商主键 | `aa.vendor.Vendor` | `supplier_id` |  →  |  |  | Service |  |
| 36 | `creatorId` | 创建人主键 | `base.user.BipUser` | `creator_Id` |  →  |  |  | Service |  |
| 37 | `bizFlow` | 业务流主键 | `bf.bizflow.BusinessFlow` | `bizFlowId` |  →  |  |  | Service |  |
| 38 | `orgId` | 采购组织主键 | `org.func.BaseOrg` | `org_id` |  →  |  |  | Service |  |
| 39 | `singleBudgetApplyId` | 单项预算申请单 | `znbzbx.memoapply.MemoApplyVO` | `single_budget_applyid` |  →  |  |  | Service |  |
| 40 | `firstPartyId` | 甲方主键 | `aa.baseorg.OrgMV` | `first_party_id` |  →  |  |  | Service |  |
| 41 | `withdrawpp` | 撤回提交的人 | `base.user.BipUser` | `withdrawpp` |  →  |  |  | Service |  |
| 42 | `payAgreementId` | 付款协议主键 | `bd.payments.PayAgreement` | `pay_agreement_id` |  →  |  |  | Service |  |
| 43 | `transtypeId` | 交易类型主键 | `bd.bill.TransType` | `transtype_id` |  →  |  |  | Service |  |
| 44 | `filedPersonId` | 归档人主键 | `bd.staff.Staff` | `filed_person_id` |  →  |  |  | Service |  |
| 45 | `purContactPersonId` | 甲方联系人主键 | `bd.staff.Staff` | `pur_contact_person_id` |  →  |  |  | Service |  |
| 46 | `legalType` | 合同法律类别 | `DZHTFW.econtract.contractLegalType` | `legal_type` |  →  |  |  | Service |  |
| 47 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 48 | `ctjlId` | 合同台账主键 | `CLM.clmContract.contractLib` | `ctjl_id` |  →  |  |  | Service |  |
| 49 | `parentContractId` | 父合同主键 | `cpu-contract.contract.ContractVO` | `parent_contract_id` |  →  |  |  | None |  |
| 50 | `agentConfirmPersonId` | 代确认人主键 | `bd.staff.Staff` | `agent_confirm_person_id` |  →  |  |  | Service |  |
| 51 | `ctTplId` | 合同模板主键 | `DZHTFW.econtract.econtractTemplate` | `ct_tpl_id` |  →  |  |  | Service |  |
| 52 | `contractExpList` | 采购合同表体费用 | `cpu-contract.contract.ContractExpVO` | `` | contractExpList → contractId | 0..n | true | None |  |
| 53 | `chgStateUserId` | 履约状态变更人id | `base.user.BipUser` | `chgState_userId` |  →  |  |  | Service |  |
| 54 | `settleTypeId` | 结算方式主键 | `aa.settlemethod.SettleMethod` | `settle_type_id` |  →  |  |  | Service |  |
| 55 | `enterpriseId` | 企业主键(采购云) | `cpu-privilege.enterprise.EnterprisePOJO` | `enterprise_id` |  →  |  |  | Service |  |

### Composition（子表）

- **defines**: `defines` → `cpu-contract.contract.ContractVODefine` | 1 ⚠️ 已废弃
- **contractMaterialList**: `contractMaterialList` → `cpu-contract.contract.ContractBodyVO` | 1..n
- **contractTermList**: `contractTermList` → `cpu-contract.contract.ContractTermVO` | 0..n
- **contractPartyList**: `contractPartyList` → `cpu-contract.contract.ContractSignParty` | 0..n
- **contractScopeList**: `contractScopeList` → `cpu-contract.contract.ContractOrgScopeVO` | 0..n
- **contractPayTermList**: `contractPayTermList` → `cpu-contract.contract.ContractPayTermVO` | 0..n
- **contractPrepayList**: `contractPrepayList` → `cpu-contract.contract.ContractPrepayVo` | 0..n
- **contractExpList**: `contractExpList` → `cpu-contract.contract.ContractExpVO` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `billTemplateId` (单据模板主键) | `tpl.templateinst.TplBillTemplateInst` | `bill_template_id` |
| `secondPartyId` (乙方主键) | `aa.vendor.Vendor` | `second_party_id` |
| `cancelUserId` (作废人主键) | `cpu-privilege.user.MgrUser` | `cancel_user_id` |
| `modifierId` (修改人主键) | `base.user.User` | `modifier_Id` |
| `templateId` (主模板主键) | `tpl.templateorginst.TplTemplateInst` | `template_id` |
| `dealPsnId` (处理人主键) | `bd.staff.Staff` | `deal_psn_id` |
| `supMsgNotifierId` (消息通知人主键) | `aa.vendor.VendorContacts` | `sup_msg_notifier_id` |
| `natCurrency` (本币) | `bd.currencytenant.CurrencyTenantVO` | `nat_currency_id` |
| `chgStateReasonId` (履约状态变更原因档案) | `aa.reason.Reason` | `chgState_reasonId` |
| `currencyId` (币种主键) | `bd.currencytenant.CurrencyTenantVO` | `currency_id` |
| `actualValiUserId` (生效人) | `base.user.BipUser` | `actual_vali_user_id` |
| `purPersonId` (采购员主键) | `bd.staff.Staff` | `pur_person_id` |
| `reqUapProjectId` (平台项目档案主键) | `bd.project.ProjectVO` | `req_uap_project_id` |
| `terminateUserId` (终止人主键) | `cpu-privilege.user.MgrUser` | `terminate_user_id` |
| `deptId` (采购部门) | `bd.adminOrg.AdminOrgVO` | `dept_id` |
| `billcategory` (合同类型) | `DZHTFW.econtract.contractType` | `billcategory` |
| `supPersionId` (供应商联系人主键) | `aa.vendor.VendorContacts` | `sup_persion_id` |
| `auditorId` (审批人) | `base.user.User` | `auditor_id` |
| `cancelBipUserId` (Bip作废人) | `base.user.BipUser` | `cancel_bip_user_id` |
| `exchRateType` (汇率类型主键) | `bd.exchangeRate.ExchangeRateTypeVO` | `exch_rate_type_id` |
| `terminateBipUserId` (Bip终止人) | `base.user.BipUser` | `terminate_bip_user_id` |
| `terminateCloseUserId` (关闭人主键) | `cpu-privilege.user.MgrUser` | `terminate_close_user_id` |
| `submitter` (提交人) | `base.user.BipUser` | `submitter` |
| `purContentTypeId` (采购内容档案主键) | `bctask.basedoc.CustomerDocVO` | `pur_content_type_id` |
| `purUserId` (币种主键) | `cpu-privilege.user.MgrUser` | `pur_user_id` |
| `reqDeptId` (需求部门主键) | `org.func.BaseOrg` | `req_dept_id` |
| `supplierId` (供应商主键) | `aa.vendor.Vendor` | `supplier_id` |
| `creatorId` (创建人主键) | `base.user.BipUser` | `creator_Id` |
| `bizFlow` (业务流主键) | `bf.bizflow.BusinessFlow` | `bizFlowId` |
| `orgId` (采购组织主键) | `org.func.BaseOrg` | `org_id` |
| `singleBudgetApplyId` (单项预算申请单) | `znbzbx.memoapply.MemoApplyVO` | `single_budget_applyid` |
| `firstPartyId` (甲方主键) | `aa.baseorg.OrgMV` | `first_party_id` |
| `withdrawpp` (撤回提交的人) | `base.user.BipUser` | `withdrawpp` |
| `payAgreementId` (付款协议主键) | `bd.payments.PayAgreement` | `pay_agreement_id` |
| `transtypeId` (交易类型主键) | `bd.bill.TransType` | `transtype_id` |
| `filedPersonId` (归档人主键) | `bd.staff.Staff` | `filed_person_id` |
| `purContactPersonId` (甲方联系人主键) | `bd.staff.Staff` | `pur_contact_person_id` |
| `legalType` (合同法律类别) | `DZHTFW.econtract.contractLegalType` | `legal_type` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `ctjlId` (合同台账主键) | `CLM.clmContract.contractLib` | `ctjl_id` |
| `agentConfirmPersonId` (代确认人主键) | `bd.staff.Staff` | `agent_confirm_person_id` |
| `ctTplId` (合同模板主键) | `DZHTFW.econtract.econtractTemplate` | `ct_tpl_id` |
| `chgStateUserId` (履约状态变更人id) | `base.user.BipUser` | `chgState_userId` |
| `settleTypeId` (结算方式主键) | `aa.settlemethod.SettleMethod` | `settle_type_id` |
| `enterpriseId` (企业主键(采购云)) | `cpu-privilege.enterprise.EnterprisePOJO` | `enterprise_id` |
