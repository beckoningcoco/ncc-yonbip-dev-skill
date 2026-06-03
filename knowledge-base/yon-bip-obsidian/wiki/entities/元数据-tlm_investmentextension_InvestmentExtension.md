---
tags: [BIP, 元数据, 数据字典, tlm.investmentextension.InvestmentExtension]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 申购展期 (`tlm.investmentextension.InvestmentExtension`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_investmentextension` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：`17418fdd-a31b-472f-8b99-5d810810ec12`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 申购展期 |
| 物理表 | `tlm_investmentextension` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 89 个 |
| 子表 | 4 个 |
| 关联引用 | 19 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `extensionCashFlowBackup` | `tlm.investmentextension.InvestmentExtensionCashFlowBackup` | composition |
| `customRate` | `tlm.investmentextension.InvestmentExtensionCustomRate` | composition |
| `extensionCashFlow` | `tlm.investmentextension.InvestmentExtensionCashFlow` | composition |
| `defines` | `tlm.investmentextension.InvestmentExtensionDefine` | composition |

## 关联引用 (19个)

| 字段名 | 引用类型 |
|--------|---------|
| `associate_financingRollover` | `` |
| `` | `` |
| `investmentExtensionCharacterDef` | `` |
| `back_purchase` | `` |
| `ytenant_id` | `` |
| `accentity_raw` | `ucf-org-center.bd_financeorgtreeref_na` |
| `purchase` | `tlm_purchaseregisterRef` |
| `accentity` | `ucf-org-center.bd_fundsorg_na` |
| `bustype` | `bd_transtypelistref` |
| `back_protocol` | `` |
| `protocol` | `tlm_financingregisterRef` |
| `financing_rollover` | `` |
| `tenant_id` | `` |

## 继承接口 (5个, 17字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``

## 字段列表（按类型分组）

> 共 89 个直连字段

### 文本字段 (26个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人 |
| `code` | `code` | `code` | 单据号 |
| `purchaseStatus` | `purchaseStatus` | `purchaseStatus` | 申购状态 |
| `protocolVersion` | `protocolVersion` | `protocolVersion` | 协议版本号 |
| `interestRateValues` | `interestRateValues` | `interestRateValues` | 现金流引用利率值集合 |
| `extension_term` | `extension_term` | `extensionTerm` | 展期期限 |
| `src_bill_id` | `src_bill_id` | `srcBillID` | 来源单据ID |
| `src_bill_code` | `src_bill_code` | `srcBillCode` | 来源单据号 |
| `src_bill_type` | `src_bill_type` | `srcBillType` | 来源类型 |
| `related_bill_id` | `related_bill_id` | `relatedBillID` | 协同单据ID |
| `related_bill_code` | `related_bill_code` | `relatedBillCode` | 协同单据号 |
| `related_bill_type` | `related_bill_type` | `relatedBillType` | 协同类型 |
| `cf_business_type` | `cf_business_type` | `cfBusinessType` | 上个写现金流的业务类型 |
| `cf_beforebusiness_type` | `cf_beforebusiness_type` | `cfBeforeBusinessType` | 备份上个写现金流的业务类型 |
| `item3` | `item3` | `item3` | 备用字段3 |
| `item4` | `item4` | `item4` | 备用字段4 |
| `` | `modifier` | `modifier` | 修改人 |
| `` | `auditor` | `auditor` | 审批人 |
| `loanInterestRate` | `loanInterestRate` | `loanInterestRate` | 贷款利率ID |
| `extension_protocol_number` | `extension_protocol_number` | `extensionProtocolNumber` | 展期协议号 |
| `item5` | `item5` | `item5` | backItem |
| `item6` | `item6` | `item6` | backItem |
| `rollover_reason` | `rollover_reason` | `rolloverReason` | 展期原因 |
| `item1` | `item1` | `item1` | 是否适配交易类型 |
| `item2` | `item2` | `item2` | 适配交易类型(金融产品ID) |
| `sync_msg` | `sync_msg` | `syncMsg` | 协同失败原因 |

### 引用字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 资金组织 |
| `protocol` | `protocol` | `protocol` | 协议号ID |
| `purchase` | `purchase` | `purchase` | 申购ID |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `financing_rollover` | `financing_rollover` | `financingRollover` | 融入展期ID |
| `associate_financingRollover` | `associate_financingRollover` | `associateFinancingRollover` | 协同融入展期ID |
| `back_protocol` | `back_protocol` | `backProtocol` | 备份协议ID |
| `back_purchase` | `back_purchase` | `backPurchase` | 备份申购ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `bustype` | `bustype` | `bustype` | 交易类型ID |

### 日期字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `rollover_start_date` | `rollover_start_date` | `rolloverStartDate` | 展期开始日 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `debt_rollover_end_date` | `debt_rollover_end_date` | `debtRolloverEndDate` | 展期后到期日 |
| `exhibition_period_end_date` | `exhibition_period_end_date` | `exhibitionPeriodEndDate` | 展期后到期日 |
| `extension_date` | `extension_date` | `extensionDate` | 展期日期 |
| `firstRepaymentDate` | `firstRepaymentDate` | `firstRepaymentDate` | 首次赎回日 |
| `firstPayInterestDate` | `firstPayInterestDate` | `firstPayInterestDate` | 首次收息日 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `canuseflow` | `canuseflow` | `canuseflow` | 是否从投资合同跳转 |
| `` | `isWfControlled` | `isWfControlled` | 审批流控制 |

### 枚举字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_auto_rollover` | `is_auto_rollover` | `isAutoRollover` | 是否自动展期 |
| `audit_status` | `audit_status` | `auditStatus` | 审批状态 |
| `create_method` | `create_method` | `createMethod` | 生成方式 |
| `validation_method` | `validation_method` | `validationMethod` | 单据生效时机 |
| `is_validation` | `is_validation` | `isValidation` | 是否生效 |
| `base_interest_rate_type_in` | `base_interest_rate_type_in` | `baseInterestRateTypeIn` | 利率类型 |
| `month_adjust_date` | `month_adjust_date` | `monthAdjustDate` | 月末日期调整(赎回) |
| `month_interest_adjust_date` | `month_interest_adjust_date` | `monthInterestAdjustDate` | 月末日期调整(收息) |
| `quotation_float_type` | `quotation_float_type` | `quotationFloatType` | 浮动方式 |
| `extension_term_unit` | `extension_term_unit` | `extensionTermUnit` | 展期期限单位 |
| `is_DirectlyConnected` | `is_DirectlyConnected` | `isDirectlyConnected` | 是否直连 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `extension_term_number` | `extension_term_number` | `extensionTermNumber` | 展期期限 |

### 短整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_type` | `bill_type` | `billType` | 单据类型 |
| `src_item` | `src_item` | `srcItem` | 来源系统编码 |
| `` | `returncount` | `returncount` | 退回次数 |
| `` | `status` | `status` | 单据状态 |
| `send_sync` | `send_sync` | `sendSync` | 是否发起协同 |
| `` | `verifystate` | `verifystate` | 审批状态 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cf_business_id` | `cf_business_id` | `cfBusinessId` | 上个写现金流的业务ID |
| `cf_beforebusiness_id` | `cf_beforebusiness_id` | `cfBeforeBusinessId` | 备份上个写现金流的业务ID |
| `` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | ID |

### 数值字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `extension_amount` | `extension_amount` | `extensionAmount` | 展期金额 |
| `expected_return` | `expected_return` | `expectedReturn` | 预期收益率(%) |
| `expected_return_amt` | `expected_return_amt` | `expectedReturnAmt` | 预期收益 |
| `quotation_base_rate` | `quotation_base_rate` | `quotationBaseRate` | 基准利率(%) |
| `float_value` | `float_value` | `floatValue` | 浮动值 |
| `extension_Rate` | `extension_Rate` | `extensionRate` | 展期利率(%) |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `investmentExtensionCharacterDef` | `investmentExtensionCharacterDef` | `investmentExtensionCharacterDef` | 申购展期自定义项 |

### other (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `customRate` | 自定义利率 |
| `` | `` | `defines` | 申购展期自定义项 |
| `` | `` | `extensionCashFlow` | 申购展期关联现金流 |
| `` | `` | `extensionCashFlowBackup` | 现金流备份 |
