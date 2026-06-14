---
tags: [BIP, 元数据, 数据字典, lgm.guaranteeregister.GuaranteeRegister]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 开函登记 (`lgm.guaranteeregister.GuaranteeRegister`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`lgm_guaranteeregister` | domain：`yonbip-fi-ctmlgm` | 应用：`LGM` | 业务对象ID：`6ae02096-957b-476b-946a-fbdacb105b92`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 开函登记 |
| 物理表 | `lgm_guaranteeregister` |
| domain/服务域 | `yonbip-fi-ctmlgm` |
| schema | `yonbip_fi_ctmlc` |
| 所属应用 | `LGM` |
| 直连字段 | 132 个 |
| 子表 | 5 个 |
| 关联引用 | 47 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `guaranteeRegisterFees` | `lgm.guaranteeregister.GuaranteeRegisterFee` | composition |
| `guaranteeRegisterAgreements` | `lgm.guaranteeregister.GuaranteeRegisterAgreement` | composition |
| `guaranteeRegisterContracts` | `lgm.guaranteeregister.GuaranteeRegisterContract` | composition |
| `changeHistorys` | `lgm.guaranteeregister.GuaranteeHistory` | composition |
| `defines` | `lgm.guaranteeregister.GuaranteeRegisterDefine` | composition |

## 关联引用 (47个)

| 字段名 | 引用类型 |
|--------|---------|
| `country` | `ucfbasedoc.bd_countryref` |
| `marginaccid` | `bd_enterprisebankacctref` |
| `activity` | `yonbip-pm-projectme.project_activity_ref` |
| `` | `` |
| `applicantaccid` | `ucfbasedoc.bd_enterprisebankacct` |
| `feeCurrency` | `bd_currencytenantreflist` |
| `project` | `ucfbasedoc.bd_projectcardref` |
| `transForwardOrg` | `ucfbasedoc.bd_bankdottableref` |
| `wbs` | `yonbip-pm-commonbd.wbs_doc_ref` |
| `openInstitution` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `accentity` | `ucf-org-center.bd_fundsorg_na` |
| `institution` | `` |
| `natCurrency` | `` |
| `sell_order` | `bd_accbody` |
| `purchase_contract` | `ucf-org-center.bd_financeorgtreeref_na` |
| `settle_mode` | `productcenter.aa_settlemethodref` |
| `supplier` | `yssupplier.aa_vendor` |
| `agency_name_bank` | `ucfbasedoc.bd_bankdottableref` |
| `financial_contract` | `yonbip-fi-ctmtlm.tlm_financingregisterRef` |
| `currency` | `bd_currencytenantreflist` |
| `fbObject` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `department` | `ucf-org-center.bd_adminorgsharetreeref` |
| `forwarding_institution` | `` |
| `tenant_id` | `` |
| `gr_define_character_def` | `` |
| `agency` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobject_typeRef` |
| `ytenant_id` | `` |
| `handlingfeeaccid` | `bd_enterprisebankacctref` |
| `accentity_raw` | `ucf-org-center.bd_financeorgtreeref_na` |
| `bus_type` | `bd_transtypelistref` |
| `be_agent_accentity` | `ucf-org-center.bd_financeorgtreeref_na` |
| `guarantee_type` | `lgm_guaranteetypeRef` |
| `sell_contract` | `ucf-org-center.bd_financeorgtreeref_na` |
| `natExchangeRateType` | `` |
| `purchase_order` | `ucf-org-center.bd_financeorgtreeref_na` |
| `bankNumberid` | `ucfbasedoc.bd_bankdotref` |
| `current_account` | `ucfbasedoc.bd_enterprisebankacct` |
| `open_agency` | `` |
| `marginCurrency` | `bd_currencytenantreflist` |
| `customer` | `productcenter.aa_merchantref` |

## 继承接口 (5个, 11字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 132 个直连字段

### 文本字段 (40个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pin_letter_type` | `pin_letter_type` | `pinLetterType` | 销函方式 |
| `used_id` | `used_id` | `usedId` | 占用流水号 |
| `used_system` | `used_system` | `usedSystem` | 占用来源系统 |
| `` | `auditor` | `auditor` | 审批人名称 |
| `canceler` | `canceler` | `canceler` | 销函人 |
| `bankLineNumber` | `bankLineNumber` | `bankLineNumber` | 申请人开户行行号 |
| `ifSettlement` | `ifSettlement` | `ifSettlement` | 是否结算 |
| `customerAddress` | `customerAddress` | `customerAddress` | 客户地址 |
| `customerPhone` | `customerPhone` | `customerPhone` | 客户电话 |
| `backItem8` | `backItem8` | `backItem8` | backItem8 |
| `backItem6` | `backItem6` | `backItem6` | backItem6 |
| `backItem7` | `backItem7` | `backItem7` | backItem7 |
| `backItem4` | `backItem4` | `backItem4` | backItem4 |
| `backItem5` | `backItem5` | `backItem5` | backItem5 |
| `backItem2` | `backItem2` | `backItem2` | backItem2 |
| `backItem3` | `backItem3` | `backItem3` | backItem3 |
| `backItem1` | `backItem1` | `backItem1` | backItem1 |
| `serialNumber` | `serialNumber` | `serialNumber` | 外系统推单流水号 |
| `isFromOut` | `isFromOut` | `isFromOut` | 是否外系统推单(新增态) |
| `estimateBasis` | `estimateBasis` | `estimateBasis` | 预估依据 |
| `` | `creator` | `creator` | 创建人名称 |
| `if_used` | `if_used` | `ifUsed` | 保函是否被使用 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `purchase_contract_number` | `purchase_contract_number` | `purchaseContractNumber` | 合同编号 |
| `purchase_order_number` | `purchase_order_number` | `purchaseOrderNumber` | 合同编号 |
| `sell_contract_number` | `sell_contract_number` | `sellContractNumber` | 合同编号 |
| `sell_order_number` | `sell_order_number` | `sellOrderNumber` | 合同编号 |
| `code` | `code` | `code` | 单据编号 |
| `guarantee_apply_number` | `guarantee_apply_number` | `guaranteeApplyNumber` | 申请编号 |
| `agency_name_other` | `agency_name_other` | `agencyNameForOther` | 机构名称 |
| `contract_number` | `contract_number` | `contractNumber` | 合同编号 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `dealing_status` | `dealing_status` | `dealingStatus` | 受理状态 |
| `refuse_reason` | `refuse_reason` | `refuseReason` | 拒绝原因 |
| `guarantee_number` | `guarantee_number` | `guaranteeNumber` | 保函编号 |
| `margin` | `margin` | `margin` | 保证金 |
| `handlingfee` | `handlingfee` | `handlingFee` | 手续费 |
| `recipient_for_ohter` | `recipient_for_ohter` | `recipientForOhter` | 收函人 |
| `recipient_address` | `recipient_address` | `recipientAddress` | 收函人地址 |
| `recipient_phone` | `recipient_phone` | `recipientPhone` | 收函人联系电话 |

### 引用字段 (41个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `financial_contract` | `financial_contract` | `financialContract` | 融资合同 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `wbs` | `wbs` | `wbs` | WBS |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `forwarding_institution` | `forwarding_institution` | `forwardingInstitution` | 转开/转递机构 |
| `institution` | `institution` | `institution` | 机构类型 |
| `natCurrency` | `natCurrency` | `natCurrency` | 本币币种 |
| `natExchangeRateType` | `natExchangeRateType` | `natExchangeRateType` | 本币币种汇率类型 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `activity` | `activity` | `activity` | 活动 |
| `project` | `project` | `project` | 项目 |
| `department` | `department` | `department` | 部门 |
| `marginCurrency` | `marginCurrency` | `marginCurrency` | 保证金币种 |
| `applicantaccid` | `applicantaccid` | `applicantaccid` | 申请人账号 |
| `transForwardOrg` | `transForwardOrg` | `transForwardOrg` | 转开/转递机构 |
| `fbObject` | `fbObject` | `fbObject` | 资金业务对象id |
| `agency` | `agency` | `agency` | 机构类型 |
| `current_account` | `current_account` | `currentAccount` | 活期账号 |
| `country` | `country` | `country` | 受益人国家地区 |
| `feeCurrency` | `feeCurrency` | `feeCurrency` | 手续费币种 |
| `bankNumberid` | `bankNumberid` | `bankNumberid` | 申请人开户行 |
| `openInstitution` | `openInstitution` | `openInstitution` | 机构名称 |
| `settle_mode` | `settle_mode` | `settleMode` | 结算方式 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `purchase_contract` | `purchase_contract` | `purchaseContract` | 采购合同id |
| `purchase_order` | `purchase_order` | `purchaseOrder` | 采购订单id |
| `sell_contract` | `sell_contract` | `sellContract` | 销售合同id |
| `sell_order` | `sell_order` | `sellOrder` | 销售订单id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `accentity` | `accentity` | `accentity` | 资金组织 |
| `guarantee_type` | `guarantee_type` | `guaranteeType` | 保函类型id |
| `open_agency` | `open_agency` | `openAgency` | 开立机构 |
| `agency_name_bank` | `agency_name_bank` | `agencyNameForBank` | 机构名称ID |
| `currency` | `currency` | `currency` | 币种id |
| `be_agent_accentity` | `be_agent_accentity` | `beAgentAccentity` | 被代理组织id |
| `marginaccid` | `marginaccid` | `marginaccid` | 保证金账号id |
| `handlingfeeaccid` | `handlingfeeaccid` | `handlingFeeaccid` | 手续费账号id |
| `supplier` | `supplier` | `supplier` | 供应商id |
| `customer` | `customer` | `customer` | 客户id |
| `bus_type` | `bus_type` | `bustype` | 交易类型id |

### 日期字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `settled_date` | `settled_date` | `settledDate` | 结算成功时间 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `guarantee_open_date` | `guarantee_open_date` | `guaranteeOpenDate` | 开函日期 |
| `guarantee_begin_date` | `guarantee_begin_date` | `guaranteeBeginDate` | 保函开始日期 |
| `guarantee_end_date` | `guarantee_end_date` | `guaranteeEndDate` | 保函结束日期 |
| `pin_letter_date` | `pin_letter_date` | `pinLetterDate` | 销函日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |

### 布尔字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isSynchronous` | `isSynchronous` | `isSynchronous` | 是否已同步 |
| `isOccupyCredit` | `isOccupyCredit` | `isOccupyCredit` | 是否占授信 |
| `isGuarantee` | `isGuarantee` | `isGuarantee` | 是否占担保 |
| `budgeted` | `budgeted` | `budgeted` | 是否已发起预算 |
| `` | `isWfControlled` | `isWfControlled` | 审批流控制 |
| `canuseflow` | `canuseflow` | `canuseflow` | 是否走审批流 |

### 枚举字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `generationMethod` | `generationMethod` | `generationMethod` | 生成方式 |
| `isOpen` | `isOpen` | `isOpen` | 是否敞口 |
| `isForeign` | `isForeign` | `isForeign` | 是否涉外 |
| `beginperiod` | `beginperiod` | `beginperiod` | 期初 |
| `issuing_method` | `issuing_method` | `issuingMethod` | 开立方式 |
| `contract_type` | `contract_type` | `contractType` | 合同类型 |
| `isagent` | `isagent` | `isAgent` | 代理开函 |
| `audit_status` | `audit_status` | `auditStatus` | 审批状态 |
| `guarantee_dealing_status` | `guarantee_dealing_status` | `guaranteeDealingStatus` | 保函状态 |
| `recipient_type` | `recipient_type` | `recipientType` | 收函方 |

### 短整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `settle_state` | `settle_state` | `settleState` | 结算状态 |
| `pay_settle_mode` | `pay_settle_mode` | `paySettleMode` | 付款结算模式 |
| `` | `returncount` | `returncount` | 退回次数 |
| `` | `status` | `status` | 单据状态 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `nat_exchange_rate_ops` | `nat_exchange_rate_ops` | `natExchangeRateOps` | 本币汇率折算方式 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `guarantee_applyid` | `guarantee_applyid` | `guaranteeApplyid` | 开函申请ID |
| `guarantee_dealid` | `guarantee_dealid` | `guaranteeDealid` | 开函受理ID |
| `` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | ID |

### 数值字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `natExchangeRate` | `natExchangeRate` | `natExchangeRate` | 本币币种汇率 |
| `natGuaranteeAmount` | `natGuaranteeAmount` | `natGuaranteeAmount` | 保函金额(本币币种) |
| `guarantee_amount` | `guarantee_amount` | `guaranteeAmount` | 保函金额 |
| `margin_ratio` | `margin_ratio` | `marginRatio` | 保证金比例(%) |
| `margin_amount` | `margin_amount` | `marginAmount` | 保证金金额 |
| `handlingfee_amount` | `handlingfee_amount` | `handlingFeeAmount` | 手续费金额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `gr_define_character_def` | `gr_define_character_def` | `grDefineCharacterDef` | 自由项特征组 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `changeHistorys` | 开函登记版本历史 |
| `` | `` | `defines` | 开函登记自由自定义项 |
| `` | `` | `guaranteeRegisterAgreements` | 开函登记关联授信 |
| `` | `` | `guaranteeRegisterContracts` | 开函登记关联担保 |
| `` | `` | `guaranteeRegisterFees` | 开函登记费用明细 |
