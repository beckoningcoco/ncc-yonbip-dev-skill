---
tags: [BIP, 元数据, 数据字典, tlm.absrepayment.ABSRepayment]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 专项还款登记 (`tlm.absrepayment.ABSRepayment`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_absrepayment` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：`c406d38f-d8af-4c99-977a-ee257f6f11e4`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 专项还款登记 |
| 物理表 | `tlm_absrepayment` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 76 个 |
| 子表 | 3 个 |
| 关联引用 | 21 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `repaymentCashFlows` | `tlm.absrepayment.ABSRepaymentCashFlow` | composition |
| `repaymentDetails` | `tlm.absrepayment.ABSRepaymentDetail` | composition |
| `defines` | `tlm.absrepayment.ABSRepaymentDefine` | composition |

## 关联引用 (21个)

| 字段名 | 引用类型 |
|--------|---------|
| `asset_specific_plan` | `tlm_assetspecificplan_ref` |
| `` | `` |
| `ytenant_id` | `` |
| `our_bank_account` | `bd_enterprisebankacctref` |
| `accentity_raw` | `ucf-org-center.bd_financeorgtreeref_na` |
| `tlm_define_character_def` | `` |
| `otherBankAccount` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobjbank_Ref` |
| `accentity` | `ucf-org-center.bd_fundsorg_na` |
| `bustype` | `bd_transtypelistref` |
| `old_exchange_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `trusteeship_agency` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `repayment_currency` | `ucfbasedoc.bd_currencytenantref` |
| `repayment_date_check` | `tlm_assetspecificplan_ref` |
| `settle_method` | `aa_settlemethodref` |
| `old_currency` | `ucfbasedoc.bd_currencytenantref` |
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

> 共 76 个直连字段

### 文本字段 (20个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人 |
| `settle_param` | `settle_param` | `settleParam` | 结算集成参数:资金结算stwb,不结算no |
| `associated_bank_statements` | `associated_bank_statements` | `associatedBankStatements` | 关联银行对账单id |
| `associated_claim_form` | `associated_claim_form` | `associatedClaimForm` | 关联认领单id |
| `bank_transaction_num` | `bank_transaction_num` | `bankTransactionNum` | 银行交易流水号 |
| `incorporation_num` | `incorporation_num` | `incorporationNum` | 勾兑号 |
| `create_method` | `create_method` | `createMethod` | 生成方式 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `` | `code` | `code` | 单据编号 |
| `` | `auditor` | `auditor` | 审批人 |
| `other_type` | `other_type` | `otherType` | 对方类型 |
| `associate_statement` | `associate_statement` | `associateStatement` | 是否关联对账单 |
| `postscript_info` | `postscript_info` | `postscriptInfo` | 附言 |
| `abstract_info` | `abstract_info` | `abstractInfo` | 用途 |
| `back_item1` | `back_item1` | `backItem1` | backItem1 |
| `back_item2` | `back_item2` | `backItem2` | backItem2 |
| `back_item3` | `back_item3` | `backItem3` | backItem3 |
| `back_item4` | `back_item4` | `backItem4` | backItem4 |
| `back_item5` | `back_item5` | `backItem5` | backItem5 |
| `back_item6` | `back_item6` | `backItem6` | backItem6 |

### 引用字段 (17个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 资金组织 |
| `settle_method` | `settle_method` | `settleMethod` | 结算方式ID |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `repayment_date_check` | `repayment_date_check` | `repaymentDateCheck` | 资产专项计划Id |
| `repayment_currency` | `repayment_currency` | `repaymentCurrency` | 还款币种ID |
| `our_bank_account` | `our_bank_account` | `ourBankAccount` | 本方银行账户ID |
| `asset_specific_plan` | `asset_specific_plan` | `assetSpecificPlan` | 资产专项计划Id |
| `trusteeship_agency` | `trusteeship_agency` | `trusteeshipAgency` | 托管机构id |
| `old_currency` | `old_currency` | `oldCurrency` | 本币币种ID |
| `otherBankAccount` | `otherBankAccount` | `otherBankAccount` | 对方账户名称id |
| `old_exchange_rate_type` | `old_exchange_rate_type` | `oldExchangeRateType` | 本币币种汇率类型ID |
| `bustype` | `bustype` | `bustype` | 交易类型id |

### 日期字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `repayment_date` | `repayment_date` | `repaymentDate` | 还款日期 |
| `settle_success_date` | `settle_success_date` | `settleSuccessDate` | 结算成功日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isWfControlled` | `isWfControlled` | 审批流控制 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `transaction_association_method` | `transaction_association_method` | `transactionAssociationMethod` | 流水关联方式 |
| `settled_addition` | `settled_addition` | `settledAddition` | 已结算补单 |

### 短整数 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `repayment_method` | `repayment_method` | `repaymentMethod` | 还款方式 |
| `` | `returncount` | `returncount` | 退回次数 |
| `` | `status` | `status` | 单据状态 |
| `settle_status` | `settle_status` | `settleStatus` | 结算状态 |
| `audit_status` | `audit_status` | `auditStatus` | 审批状态 |
| `supplement_status` | `supplement_status` | `supplementStatus` | 补录状态 |
| `` | `verifystate` | `verifystate` | 审批状态 |

### 长整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fund_settle_id` | `fund_settle_id` | `fundSettleId` | 待结算数据Id |
| `settle_bench_id` | `settle_bench_id` | `settleBenchId` | 结算工作台Id |
| `` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | ID |
| `back_item9` | `back_item9` | `backItem9` | backItem9 |
| `back_item10` | `back_item10` | `backItem10` | backItem10 |

### 数值字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `repayment_amt` | `repayment_amt` | `repaymentAmt` | 还本总额 |
| `pay_interest_amt` | `pay_interest_amt` | `payInterestAmt` | 付息总额 |
| `repayment_total_amt` | `repayment_total_amt` | `repaymentTotalAmt` | 还款总金额 |
| `old_exchange_rate` | `old_exchange_rate` | `oldExchangeRate` | 本币币种汇率 |
| `repayment_amt_old` | `repayment_amt_old` | `repaymentAmtOld` | 还本总额(本币币种) |
| `pay_interest_amt_old` | `pay_interest_amt_old` | `payInterestAmtOld` | 付息总额(本币币种) |
| `repayment_total_amt_old` | `repayment_total_amt_old` | `repaymentTotalAmtOld` | 还款总金额(本币币种) |
| `back_item7` | `back_item7` | `backItem7` | backItem7 |
| `back_item8` | `back_item8` | `backItem8` | backItem8 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tlm_define_character_def` | `tlm_define_character_def` | `tlmDefineCharacterDef` | 特征组 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 专项还款登记自由自定义项 |
| `` | `` | `repaymentCashFlows` | 现金流明细 |
| `` | `` | `repaymentDetails` | 还款明细 |
