---
tags: [BIP, 元数据, 数据字典, cam.creditapply.CreditApply]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 授信申请 (`cam.creditapply.CreditApply`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cam_creditapply` | domain：`yonbip-fi-ctmcam` | 应用：`CAM` | 业务对象ID：`15c7777d-dd59-497c-963c-408062c9c839`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 授信申请 |
| 物理表 | `cam_creditapply` |
| 数据库 schema | `yonbip-fi-ctmcam` |
| 所属应用 | `CAM` |
| 直连字段 | 145 个 |
| 子表 | 6 个 |
| 关联引用 | 42 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `creditApplyAgreements` | `cam.creditapply.CreditApplyAgreement` | composition |
| `creditApplySmartAreas` | `cam.creditapply.CreditApplySmartArea` | composition |
| `creditApplyContracts` | `cam.creditapply.CreditApplyContract` | composition |
| `creditApplyFeeSchemes` | `cam.creditapply.CreditApplyFeeScheme` | composition |
| `creditApplyCreditInstitutions` | `cam.creditapply.CreditApplyCreditInstitution` | composition |
| `defines` | `cam.creditapply.CreditApplyDefine` | composition |

## 关联引用 (42个)

| 字段名 | 引用类型 |
|--------|---------|
| `country` | `` |
| `headOfficeOrg` | `ucfbasedoc.bd_bankcard` |
| `trustedTarget` | `ucf-org-center.bd_financeorgtreeref_na` |
| `submitter` | `` |
| `` | `` |
| `marginAccount` | `ucfbasedoc.bd_enterprisebankacct` |
| `activity` | `` |
| `backItem10` | `` |
| `project` | `` |
| `wbs` | `` |
| `cutAccount` | `ucfbasedoc.bd_enterprisebankacct` |
| `cam_define_character_def` | `` |
| `accentity` | `ucf-org-center.bd_fundsorg_na` |
| `relatedTotal` | `cam_agreementheadref` |
| `nat_currency` | `` |
| `withdrawpp` | `` |
| `creditInstitution` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `creditSource` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobject_typeRef` |
| `changeCredit` | `cam_agreementref` |
| `orgCurrency` | `` |
| `currency` | `bd_currencytenantreflist` |
| `tenant_id` | `` |
| `creditchangetype` | `cam_creditchangetype_ref` |
| `carryOverCredit` | `cam_agreementref` |
| `ytenant_id` | `` |
| `bank_type` | `` |
| `accentity_raw` | `ucf-org-center.bd_financeorgtreeref_na` |
| `dept` | `` |
| `bustype` | `bd_transtypelistref` |
| `nat_exchange_rate_type` | `` |
| `conversionExchangeRateType` | `` |
| `trustee` | `` |
| `currentAccount` | `ucfbasedoc.bd_enterprisebankacct` |
| `marginCurrency` | `bd_currencytenantreflist` |

## 继承接口 (6个, 15字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审批提交信息** (`ucfbase.ucfbaseItf.ISubmitInfo`)
  - `submitter` → `submitter`
  - `submit_time` → `submit_time`
  - `withdrawpp` → `withdrawpp`
  - `withdraw_time` → `withdraw_time`

## 字段列表（按类型分组）

> 共 145 个直连字段

### 文本字段 (25个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `deleteRelationItem` | `deleteRelationItem` | `deleteRelationItem` | 附件关联审批通过时间 |
| `agreementNo` | `agreementNo` | `agreementNo` | 授信协议号 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `showCreditTerm` | `showCreditTerm` | `showCreditTerm` | 授信期限 |
| `relatedSyndicatedCode` | `relatedSyndicatedCode` | `relatedSyndicatedCode` | 关联银团授信(单据编号) |
| `is_generate_protocol` | `is_generate_protocol` | `isGenerateProtocol` | 是否生成协议 |
| `occupy_time` | `occupy_time` | `occupyTime` | 占用时机 |
| `financingPurpose` | `financingPurpose` | `financingPurpose` | 融资用途 |
| `projectName` | `projectName` | `projectName` | 项目名称 |
| `rateTermDesc` | `rateTermDesc` | `rateTermDesc` | 利率条件 |
| `guaranteeDescription` | `guaranteeDescription` | `guaranteeDescription` | 担保描述 |
| `trusteeType` | `trusteeType` | `trusteeType` | 受托人机构类型 |
| `repaymentType` | `repaymentType` | `repaymentType` | 还款方式 |
| `backItem11` | `backItem11` | `backItem11` | 预留1 |
| `` | `creator` | `creator` | 创建人 |
| `` | `auditor` | `auditor` | 审批人 |
| `` | `code` | `code` | 单据编号 |
| `relatedCreditCode` | `relatedCreditCode` | `relatedCreditCode` | 关联授信合同 |
| `backup` | `backup` | `backup` | 备注 |
| `backItem1` | `backItem1` | `backItem1` | backItem1 |
| `backItem2` | `backItem2` | `backItem2` | backItem2 |
| `backItem3` | `backItem3` | `backItem3` | backItem3 |
| `backItem4` | `backItem4` | `backItem4` | backItem4 |
| `backItem5` | `backItem5` | `backItem5` | backItem5 |
| `backItem6` | `backItem6` | `backItem6` | backItem6 |

### 引用字段 (35个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `currentAccount` | `currentAccount` | `currentAccount` | 活期账号id |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `carryOverCredit` | `carryOverCredit` | `carryOverCredit` | 结转前授信协议号Id |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `bank_type` | `bank_type` | `bankType` | 银行类别 |
| `country` | `country` | `country` | 国家(地区) |
| `trustee` | `trustee` | `trustee` | 受托人 |
| `project` | `project` | `project` | 项目 |
| `dept` | `dept` | `dept` | 部门 |
| `orgCurrency` | `orgCurrency` | `orgCurrency` | 组织本币 |
| `conversionExchangeRateType` | `conversionExchangeRateType` | `conversionExchangeRateType` | 折算汇率类型 |
| `wbs` | `wbs` | `wbs` | WBS |
| `activity` | `activity` | `activity` | 活动 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `changeCredit` | `changeCredit` | `changeCredit` | 变更前授信协议号Id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `accentity` | `accentity` | `accentity` | 资金组织 |
| `relatedTotal` | `relatedTotal` | `relatedTotal` | 关联总授信合同Id |
| `marginCurrency` | `marginCurrency` | `marginCurrency` | 保证金币种id |
| `marginAccount` | `marginAccount` | `marginAccount` | 保证金账号id |
| `creditchangetype` | `creditchangetype` | `creditchangetype` | 授信变更类型Id |
| `creditSource` | `creditSource` | `creditSource` | 授信来源Id |
| `headOfficeOrg` | `headOfficeOrg` | `headOfficeOrg` | 总行机构id |
| `creditInstitution` | `creditInstitution` | `creditInstitution` | 授信机构Id |
| `trustedTarget` | `trustedTarget` | `trustedTarget` | 受信对象id |
| `currency` | `currency` | `currency` | 授信币种id |
| `cutAccount` | `cutAccount` | `cutAccount` | 扣款账号id |
| `backItem10` | `backItem10` | `backItem10` | backItem10 |
| `bustype` | `bustype` | `bustype` | 交易类型id |
| `nat_currency` | `nat_currency` | `natCurrency` | 本币币种 |
| `nat_exchange_rate_type` | `nat_exchange_rate_type` | `natExchangeRateType` | 本币币种汇率类型 |
| `submitter` | `submitter` | `submitter` | 提交人 |
| `withdrawpp` | `withdrawpp` | `withdrawpp` | 撤回提交的人 |

### 日期字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `standard_expire_date` | `standard_expire_date` | `standardExpireDate` | 到期日期(规则计算的到期日期) |
| `updateDate` | `updateDate` | `updateDate` | 更新时间 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `creditStart` | `creditStart` | `creditStart` | 授信开始日 |
| `creditEnd` | `creditEnd` | `creditEnd` | 授信到期日 |
| `expireDate` | `expireDate` | `expireDate` | 实际失效日期 |

### 日期时间 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `submit_time` | `submit_time` | `submitTime` | 提交时间 |
| `withdraw_time` | `withdraw_time` | `withdrawTime` | 撤回提交时间 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isWfControlled` | `isWfControlled` | 审批流控制 |

### 枚举字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `applicationType` | `applicationType` | `applicationType` | 申请类型 |
| `rateType` | `rateType` | `rateType` | 利率类型 |
| `creditType` | `creditType` | `creditType` | 授信类型 |
| `creditTermType` | `creditTermType` | `creditTermType` | 授信期限类型 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creditTerm` | `creditTerm` | `creditTerm` | 授信期限 |

### 短整数 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `returncount` | `returncount` | 退回次数 |
| `business_type` | `business_type` | `businessType` | 业务类型 |
| `rateTip` | `rateTip` | `rateTip` | 汇率提示 |
| `quotaUsageMode` | `quotaUsageMode` | `quotaUsageMode` | 额度使用模式 |
| `` | `status` | `status` | 单据状态 |
| `controlMode` | `controlMode` | `controlMode` | 控制方式 |
| `creditEmployMode` | `creditEmployMode` | `creditEmployMode` | 授信占用方式 |
| `billStatus` | `billStatus` | `billStatus` | 申请单状态 |
| `approvalStatus` | `approvalStatus` | `approvalStatus` | 审批状态 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `auto_create_agreement` | `auto_create_agreement` | `autoCreateAgreement` | 是否自动生成授信合同 |
| `conversionexchangerate_ops` | `conversionexchangerate_ops` | `conversionExchangeRateOps` | 汇率折算方式 |
| `nat_exchange_rate_ops` | `nat_exchange_rate_ops` | `natExchangeRateOps` | 保证金本币汇率折算方式 |

### 长整数 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `relatedSyndicatedId` | `relatedSyndicatedId` | `relatedSyndicatedId` | 关联银团授信(单据Id) |
| `` | `tplid` | `tplid` | 模板id |
| `relatedCreditId` | `relatedCreditId` | `relatedCreditId` | 授信协议Id |
| `backItem9` | `backItem9` | `backItem9` | backItem9 |
| `id` | `id` | `id` | ID |
| `relatedChangeId` | `relatedChangeId` | `relatedChangeId` | 关联变更单Id |
| `relatedCarryOverId` | `relatedCarryOverId` | `relatedCarryOverId` | 关联结转单Id |

### 数值字段 (36个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `topRate` | `topRate` | `topRate` | 封顶利率 |
| `expectRate` | `expectRate` | `expectRate` | 预计利率 |
| `overdueInterestRate` | `overdueInterestRate` | `overdueInterestRate` | 逾期利率 |
| `totalGroup` | `totalGroup` | `totalGroup` | 集团授信余额 |
| `totalInner` | `totalInner` | `totalInner` | 内部授信余额 |
| `totalEnterprise` | `totalEnterprise` | `totalEnterprise` | 企业授信余额 |
| `totalGroupAcc` | `totalGroupAcc` | `totalGroupAcc` | 机构集团授信余额 |
| `totalInnerAcc` | `totalInnerAcc` | `totalInnerAcc` | 机构内部授信余额 |
| `totalEnterpriseAcc` | `totalEnterpriseAcc` | `totalEnterpriseAcc` | 机构企业授信余额 |
| `currentMonthCredit` | `currentMonthCredit` | `currentMonthCredit` | 本月新增授信 |
| `qoq` | `qoq` | `qoq` | 环比 |
| `yoy` | `yoy` | `yoy` | 同比 |
| `currentYearCredit` | `currentYearCredit` | `currentYearCredit` | 本年新增授信 |
| `qoqYear` | `qoqYear` | `qoqYear` | 环比(年) |
| `budgetUseQuota` | `budgetUseQuota` | `budgetUseQuota` | 已用额度 |
| `budgetQuota` | `budgetQuota` | `budgetQuota` | 预算额度 |
| `conversionExchangeRate` | `conversionExchangeRate` | `conversionExchangeRate` | 折算汇率 |
| `marginRatio` | `marginRatio` | `marginRatio` | 保证金比例(%) |
| `marginAmount` | `marginAmount` | `marginAmount` | 保证金金额(保证金币种) |
| `changedMarginAmount` | `changedMarginAmount` | `changedMarginAmount` | 变更后保证金金额(保证金币种) |
| `creditQuota` | `creditQuota` | `creditQuota` | 授信总额度 |
| `creditOpenQuota` | `creditOpenQuota` | `creditOpenQuota` | 授信敞口额度 |
| `waveScale` | `waveScale` | `waveScale` | 动拨比例(%) |
| `manageFee` | `manageFee` | `manageFee` | 管理费 |
| `promiseFee` | `promiseFee` | `promiseFee` | 承诺费 |
| `quotaFee` | `quotaFee` | `quotaFee` | 额度使用费 |
| `occupiedQuota` | `occupiedQuota` | `occupiedQuota` | 已占用额度 |
| `allocatedQuota` | `allocatedQuota` | `allocatedQuota` | 已分配额度 |
| `residueAvailableQuota` | `residueAvailableQuota` | `residueAvailableQuota` | 剩余可用额度 |
| `canDistributeQuota` | `canDistributeQuota` | `canDistributeQuota` | 剩余可分配额度 |
| `releasedQuota` | `releasedQuota` | `releasedQuota` | 待释放额度 |
| `backItem7` | `backItem7` | `backItem7` | backItem7 |
| `backItem8` | `backItem8` | `backItem8` | backItem8 |
| `balance` | `balance` | `balance` | 申请可用余额 |
| `nat_exchange_rate` | `nat_exchange_rate` | `natExchangeRate` | 本币币种汇率 |
| `nat_margin_amount` | `nat_margin_amount` | `natMarginAmount` | 本币保证金金额 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### multipleOption (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `guaranteeType` | `guaranteeType` | `guaranteeType` | 担保方式 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cam_define_character_def` | `cam_define_character_def` | `camDefineCharacterDef` | 特征组 |

### other (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `creditApplyAgreements` | 授信明细 |
| `` | `` | `creditApplyContracts` | 授信申请关联担保 |
| `` | `` | `creditApplyCreditInstitutions` | 授信机构 |
| `` | `` | `creditApplyFeeSchemes` | 授信费用方案 |
| `` | `` | `creditApplySmartAreas` | 授信申请智能区 |
| `` | `` | `defines` | 授信申请自由自定义项 |
