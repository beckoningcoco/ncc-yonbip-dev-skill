---
tags: [BIP, 元数据, 数据字典, cam.agreement.Agreement]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 授信合同 (`cam.agreement.Agreement`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cam_agreement` | domain：`yonbip-fi-ctmcam` | 应用：`CAM` | 业务对象ID：`030778d2-f5a4-446f-8cbf-0e510c628c64`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 授信合同 |
| 物理表 | `cam_agreement` |
| 数据库 schema | `yonbip-fi-ctmcam` |
| 所属应用 | `CAM` |
| 直连字段 | 168 个 |
| 子表 | 8 个 |
| 关联引用 | 49 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `agreement_b` | `cam.agreement.Agreement_b` | composition |
| `agreementFeePlan` | `cam.agreement.AgreementFeePlan` | composition |
| `guarantee_b` | `cam.agreement.Guarantee_b` | composition |
| `agreementFeeScheme` | `cam.agreement.AgreementFeeScheme` | composition |
| `agreementApplicationCredit` | `cam.agreement.AgreementApplicationCredit` | composition |
| `agreementRateRecord` | `cam.agreement.AgreementRateRecord` | composition |
| `agreementQuotaDistribution` | `cam.agreement.AgreementQuotaDistribution` | composition |
| `defines` | `cam.agreement.AgreementDefine` | composition |

## 关联引用 (49个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `country` | `` |
| `headOfficeOrg` | `ucfbasedoc.bd_bankcard` |
| `project` | `` |
| `wbs` | `` |
| `accentity` | `ucf-org-center.bd_fundsorg_na` |
| `nat_currency` | `` |
| `creditSource` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobject_typeRef` |
| `backup11` | `` |
| `businessCurrency` | `` |
| `tenant_id` | `` |
| `relatedSyndicatedId` | `` |
| `bank_type` | `` |
| `creditOrganAcc` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `conversionExchangeRateType` | `` |
| `marginCurrency` | `bd_currencytenantreflist` |
| `trustedTarget` | `ucf-org-center.bd_financeorgtreeref_na` |
| `submitter` | `` |
| `relatedApplyId` | `` |
| `marginAccount` | `ucfbasedoc.bd_enterprisebankacct` |
| `activity` | `` |
| `cutAccount` | `ucfbasedoc.bd_enterprisebankacct` |
| `inCreditSource` | `` |
| `withdrawpp` | `` |
| `currency` | `bd_currencytenantreflist` |
| `settlemethod` | `aa_settlemethodref` |
| `applicationcredit` | `` |
| `ytenant_id` | `` |
| `accentity_raw` | `ucf-org-center.bd_financeorgtreeref_na` |
| `agreementCharacterDef` | `` |
| `dept` | `` |
| `bustype` | `bd_transtypelistref` |
| `exchangeRateType` | `` |
| `creditOrganBank` | `ucfbasedoc.bd_bankdotref` |
| `nat_exchange_rate_type` | `` |
| `relatedHead` | `cam_agreementheadref` |
| `trustee` | `` |
| `conversionCurrency` | `` |
| `currentAccount` | `ucfbasedoc.bd_enterprisebankacct` |

## 继承接口 (7个, 23字段)

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
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审批提交信息** (`ucfbase.ucfbaseItf.ISubmitInfo`)
  - `submitter` → `submitter`
  - `submit_time` → `submit_time`
  - `withdrawpp` → `withdrawpp`
  - `withdraw_time` → `withdraw_time`

## 字段列表（按类型分组）

> 共 168 个直连字段

### 文本字段 (44个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `beforeRelationExhibitionNoId` | `beforeRelationExhibitionNoId` | `beforeRelationExhibitionNoId` | 展期前关联协议id |
| `backup10` | `backup10` | `backup10` | 备用10 |
| `backup12` | `backup12` | `backup12` | 备用12 |
| `backup13` | `backup13` | `backup13` | 备用13 |
| `source_id` | `source_id` | `sourceId` | 来源单据id |
| `occupy_time` | `occupy_time` | `occupyTime` | 占用时机 |
| `financingPurpose` | `financingPurpose` | `financingPurpose` | 融资用途 |
| `projectName` | `projectName` | `projectName` | 项目名称 |
| `rateTermDesc` | `rateTermDesc` | `rateTermDesc` | 利率条件 |
| `guaranteeDescription` | `guaranteeDescription` | `guaranteeDescription` | 担保描述 |
| `trusteeType` | `trusteeType` | `trusteeType` | 受托人机构类型 |
| `repaymentType` | `repaymentType` | `repaymentType` | 还款方式 |
| `backItem11` | `backItem11` | `backItem11` | 预留1 |
| `relatedCarryOverNo` | `relatedCarryOverNo` | `relatedCarryOverNo` | 关联结转协议号 |
| `relationExhibitionNoId` | `relationExhibitionNoId` | `relationExhibitionNoId` | 关联展期协议id |
| `applyNo` | `applyNo` | `applyNo` | 申请单编号 |
| `backup1` | `backup1` | `backup1` | 备用1 |
| `backup3` | `backup3` | `backup3` | 备用3 |
| `backup4` | `backup4` | `backup4` | 备用4 |
| `backup5` | `backup5` | `backup5` | 备用5 |
| `backup6` | `backup6` | `backup6` | 备用6 |
| `backup8` | `backup8` | `backup8` | 备用8 |
| `backup9` | `backup9` | `backup9` | 备用9 |
| `creditOrganName` | `creditOrganName` | `creditOrganName` | 授信机构 |
| `showCreditTerm` | `showCreditTerm` | `showCreditTerm` | 授信期限 |
| `endReason` | `endReason` | `endReason` | 结束原因 |
| `agreementNo` | `agreementNo` | `agreementNo` | 授信协议号 |
| `` | `code` | `code` | 单据编号 |
| `beforeRelationExhibitionNo` | `beforeRelationExhibitionNo` | `beforeRelationExhibitionNo` | 展期前关联协议 |
| `relationExhibitionNo` | `relationExhibitionNo` | `relationExhibitionNo` | 关联展期协议 |
| `create_method` | `create_method` | `createMethod` | 生成方式 |
| `backup` | `backup` | `backup` | 备注 |
| `originAgreementId` | `originAgreementId` | `originAgreementId` | 结转关联协议 |
| `abandonner` | `abandonner` | `abandonner` | 废弃人id |
| `carryDownBeforeNo` | `carryDownBeforeNo` | `carryDownBeforeNo` | 结转关联协议 |
| `abandonner_name` | `abandonner_name` | `abandonnerName` | 废弃人 |
| `contract_type` | `contract_type` | `contractType` | 合同类型 |
| `source_code` | `source_code` | `sourceCode` | 来源单据编号 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `` | `auditor` | `auditor` | 审批人 |
| `backup7` | `backup7` | `backup7` | 实际失效日期 |
| `backup2` | `backup2` | `backup2` | backup2 |
| `usage_rate` | `usage_rate` | `usageRate` | 使用率% |

### 引用字段 (40个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `businessCurrency` | `businessCurrency` | `businessCurrency` | 业务币种 |
| `exchangeRateType` | `exchangeRateType` | `exchangeRateType` | 汇率类型id |
| `inCreditSource` | `inCreditSource` | `inCreditSource` | 授信来源 |
| `relatedApplyId` | `relatedApplyId` | `relatedApplyId` | 关联申请单ID |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `bank_type` | `bank_type` | `bankType` | 银行类别 |
| `backup11` | `backup11` | `backup11` | 备用11 |
| `applicationcredit` | `applicationcredit` | `applicationCredit` | 授信额度申请ID |
| `relatedSyndicatedId` | `relatedSyndicatedId` | `relatedSyndicatedId` | 关联银团授信ID |
| `country` | `country` | `country` | 国家(地区) |
| `trustee` | `trustee` | `trustee` | 受托人 |
| `project` | `project` | `project` | 项目 |
| `dept` | `dept` | `dept` | 部门 |
| `conversionCurrency` | `conversionCurrency` | `conversionCurrency` | 折算币种 |
| `conversionExchangeRateType` | `conversionExchangeRateType` | `conversionExchangeRateType` | 折算汇率类型 |
| `wbs` | `wbs` | `wbs` | WBS |
| `activity` | `activity` | `activity` | 活动 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `settlemethod` | `settlemethod` | `settleMethod` | 结算方式 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `relatedHead` | `relatedHead` | `relatedHead` | 关联总授信合同id |
| `headOfficeOrg` | `headOfficeOrg` | `headOfficeOrg` | 总行机构id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `accentity` | `accentity` | `accentity` | 资金组织 |
| `creditSource` | `creditSource` | `creditSource` | 授信来源 |
| `creditOrganAcc` | `creditOrganAcc` | `creditOrganAcc` | 授信机构id |
| `creditOrganBank` | `creditOrganBank` | `creditOrganBank` | 授信机构id |
| `trustedTarget` | `trustedTarget` | `trustedTarget` | 授信对象id |
| `currency` | `currency` | `currency` | 币种id |
| `currentAccount` | `currentAccount` | `currentAccount` | 活期账号id |
| `cutAccount` | `cutAccount` | `cutAccount` | 扣款账号id |
| `marginCurrency` | `marginCurrency` | `marginCurrency` | 保证金币种id |
| `bustype` | `bustype` | `bustype` | 交易类型id |
| `marginAccount` | `marginAccount` | `marginAccount` | 保证金账户id |
| `nat_currency` | `nat_currency` | `natCurrency` | 本币币种 |
| `nat_exchange_rate_type` | `nat_exchange_rate_type` | `natExchangeRateType` | 本币币种汇率类型 |
| `submitter` | `submitter` | `submitter` | 提交人 |
| `withdrawpp` | `withdrawpp` | `withdrawpp` | 撤回提交的人 |

### 日期字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `standard_expire_date` | `standard_expire_date` | `standardExpireDate` | 到期日期(规则计算的到期日期) |
| `actualFailureDate` | `actualFailureDate` | `actualFailureDate` | 实际失效日期 |
| `queryDate` | `queryDate` | `queryDate` | 查询日期 |
| `endDate` | `endDate` | `endDate` | 结束日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `creditStart` | `creditStart` | `creditStart` | 授信开始日 |
| `creditEnd` | `creditEnd` | `creditEnd` | 授信到期日 |
| `abandon_date` | `abandon_date` | `abandonDate` | 废弃日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |

### 日期时间 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `submit_time` | `submit_time` | `submitTime` | 提交时间 |
| `withdraw_time` | `withdraw_time` | `withdrawTime` | 撤回提交时间 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rateType` | `rateType` | `rateType` | 利率类型 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creditTerm` | `creditTerm` | `creditTerm` | 授信期限 |

### 短整数 (20个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `beRefer` | `beRefer` | `beRefer` | 是否被引用 |
| `isSettle` | `isSettle` | `isSettle` | 是否结算 |
| `isConnect` | `isConnect` | `isConnect` | 是否与融资关联 |
| `quotaUsageMode` | `quotaUsageMode` | `quotaUsageMode` | 额度使用模式 |
| `` | `returncount` | `returncount` | 退回次数 |
| `` | `status` | `status` | 单据状态 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `creditType` | `creditType` | `creditType` | 授信类型 |
| `creditTermType` | `creditTermType` | `creditTermType` | 授信期限类型 |
| `controlMode` | `controlMode` | `controlMode` | 控制方式 |
| `creditEmployMode` | `creditEmployMode` | `creditEmployMode` | 授信占用方式 |
| `approvalStatus` | `approvalStatus` | `approvalStatus` | 审批状态 |
| `creditBillStatus` | `creditBillStatus` | `creditBillStatus` | 授信状态 |
| `item_type` | `item_type` | `itemType` | 事项类型 |
| `item_source` | `item_source` | `itemSource` | 事项来源 |
| `isHistoryMargin` | `isHistoryMargin` | `isHistoryMargin` | 保证金是否历史数据 |
| `basebilltype` | `basebilltype` | `basebilltype` | 单据类型 |
| `conversionexchangerate_ops` | `conversionexchangerate_ops` | `conversionExchangeRateOps` | 汇率折算方式 |
| `margin_integrated` | `margin_integrated` | `isMarginIntegrated` | 是否保证金管理集成 |
| `nat_exchange_rate_ops` | `nat_exchange_rate_ops` | `natExchangeRateOps` | 保证金本币汇率折算方式 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `relatedCarryOverId` | `relatedCarryOverId` | `relatedCarryOverId` | 关联结转协议id |
| `` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | 主表id |

### 数值字段 (31个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `allocatedQuota` | `allocatedQuota` | `allocatedQuota` | 已分配额度 |
| `canDistributeQuota` | `canDistributeQuota` | `canDistributeQuota` | 剩余可分配额度 |
| `exchangeRate` | `exchangeRate` | `exchangeRate` | 核算汇率 |
| `marginBalance` | `marginBalance` | `marginBalance` | 保证金余额 |
| `marginTotalAmount` | `marginTotalAmount` | `marginTotalAmount` | 保证金总额 |
| `topRate` | `topRate` | `topRate` | 封顶利率 |
| `expectRate` | `expectRate` | `expectRate` | 预计利率 |
| `overdueInterestRate` | `overdueInterestRate` | `overdueInterestRate` | 逾期利率 |
| `creditQuotaConversion` | `creditQuotaConversion` | `creditQuotaConversion` | 授信总额度(折算币种) |
| `balanceConversion` | `balanceConversion` | `balanceConversion` | 授信余额(折算币种) |
| `actualRemainingLimit` | `actualRemainingLimit` | `actualRemainingLimit` | 实际剩余额度 |
| `conversionExchangeRate` | `conversionExchangeRate` | `conversionExchangeRate` | 折算汇率 |
| `creditOpenQuotaConversion` | `creditOpenQuotaConversion` | `creditOpenQuotaConversion` | 授信敞口额度(折算币种) |
| `occupiedQuotaConversion` | `occupiedQuotaConversion` | `occupiedQuotaConversion` | 已用额度(折算币种) |
| `releasedQuota` | `releasedQuota` | `releasedQuota` | 待释放额度 |
| `beginBalance` | `beginBalance` | `beginBalance` | 期初授信余额 |
| `endBalance` | `endBalance` | `endBalance` | 期末授信余额 |
| `occupyAmtSum` | `occupyAmtSum` | `occupyAmtSum` | 当日占用金额累计 |
| `releaseAmtSum` | `releaseAmtSum` | `releaseAmtSum` | 当日释放金额累计 |
| `creditQuota` | `creditQuota` | `creditQuota` | 授信总额度 |
| `creditOpenQuota` | `creditOpenQuota` | `creditOpenQuota` | 授信敞口额度 |
| `waveScale` | `waveScale` | `waveScale` | 动拨比例(%) |
| `occupiedQuota` | `occupiedQuota` | `occupiedQuota` | 已占用额度 |
| `residueAvailableQuota` | `residueAvailableQuota` | `residueAvailableQuota` | 剩余可用额度 |
| `manageFee` | `manageFee` | `manageFee` | 管理费 |
| `promiseFee` | `promiseFee` | `promiseFee` | 承诺费 |
| `quotaFee` | `quotaFee` | `quotaFee` | 额度使用费 |
| `marginRatio` | `marginRatio` | `marginRatio` | 保证金比例(%) |
| `marginAmount` | `marginAmount` | `marginAmount` | 保证金金额 |
| `nat_exchange_rate` | `nat_exchange_rate` | `natExchangeRate` | 本币币种汇率 |
| `nat_margin_amount` | `nat_margin_amount` | `natMarginAmount` | 本币保证金金额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `agreementCharacterDef` | `agreementCharacterDef` | `agreementCharacterDef` | 授信合同自定义项 |

### multipleOption (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `guaranteeType` | `guaranteeType` | `guaranteeType` | 担保方式 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |

### other (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `agreementApplicationCredit` | 授信额度申请子表 |
| `` | `` | `agreementFeePlan` | 授信费用计划 |
| `` | `` | `agreementFeeScheme` | 授信费用方案 |
| `` | `` | `agreementQuotaDistribution` | 授信机构额度分配 |
| `` | `` | `agreementRateRecord` | 结转汇率记录明细 |
| `` | `` | `agreement_b` | 授信明细 |
| `` | `` | `defines` | 授信合同自定义项 |
| `` | `` | `guarantee_b` | 担保明细 |
