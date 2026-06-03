---
tags: [BIP, 元数据, 数据字典, tlm.investmentapply.InvestmentApply]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 投资申请 (`tlm.investmentapply.InvestmentApply`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_investmentapply` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：`13419c71-99da-4a97-95ed-971547b171ec`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 投资申请 |
| 物理表 | `tlm_investmentapply` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 241 个 |
| 子表 | 5 个 |
| 关联引用 | 52 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `investmentRelatedQuota` | `tlm.investmentapply.InvestmentRelatedQuota` | composition |
| `investmentCustomRate` | `tlm.investmentapply.InvestmentCustomRate` | composition |
| `investmentApplyParity` | `tlm.investmentapply.InvestmentApplyParity` | composition |
| `investmentApplyDetail` | `tlm.investmentapply.InvestmentApplyDetail` | composition |
| `defines` | `tlm.investmentapply.InvestmentApplyDefine` | composition |

## 关联引用 (52个)

| 字段名 | 引用类型 |
|--------|---------|
| `inCustomerBankAccount` | `aa_merchantbankref` |
| `inSupplierBankAccount` | `yssupplier.aa_vendorbankref` |
| `financing_org_bank` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `base_rate_type` | `tlm_interestrateRef` |
| `` | `` |
| `wbs` | `yonbip-pm-commonbd.wbs_doc_ref` |
| `opposite_settle_currency` | `` |
| `accentity` | `ucf-org-center.bd_fundsorg_na` |
| `financial_product` | `tlm_financialProductRef` |
| `interest_currency` | `ucfbasedoc.bd_currencytenantref` |
| `fundBusinessObject` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobjbank_Ref` |
| `capital_currency` | `ucfbasedoc.bd_currencytenantref` |
| `supplier` | `yssupplier.aa_vendor` |
| `settleSupplierBankAccount` | `` |
| `tenant_id` | `` |
| `cost_center` | `` |
| `income_accid` | `bd_enterprisebankacctref` |
| `protocol_currency` | `ucfbasedoc.bd_currencytenantref` |
| `agency_output_currency` | `` |
| `agent_income_accid` | `` |
| `local_accid` | `bd_enterprisebankacctref` |
| `activity` | `yonbip-pm-projectme.project_activity_ref` |
| `dept_id` | `ucf-org-center.bd_adminorgsharetreeref` |
| `profit_center` | `` |
| `interest_accid` | `bd_enterprisebankacctref` |
| `settlement_method` | `aa_settlemethodref` |
| `outlay_accid` | `bd_enterprisebankacctref` |
| `agent_outlay_accid` | `` |
| `infuse_income_accid` | `` |
| `project_id` | `ucfbasedoc.bd_projectNewRef` |
| `old_currency` | `ucfbasedoc.bd_currencytenantref` |
| `output_currency` | `` |
| `settleCustomerBankAccount` | `` |
| `infuse_capital_currency` | `ucfbasedoc.bd_currencytenantref` |
| `financing_apply` | `` |
| `ytenant_id` | `` |
| `accentity_raw` | `ucf-org-center.bd_financeorgtreeref_na` |
| `bus_type` | `bd_transtypelistref` |
| `exchange_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `ia_define_character` | `` |
| `settle_other_id` | `` |
| `trustee` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `agent_interest_accid` | `` |
| `customer` | `productcenter.aa_merchantref` |
| `regular_notify_acc` | `bd_enterprisebankacctref` |

## 继承接口 (4个, 9字段)

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
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 241 个直连字段

### 文本字段 (101个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_method` | `create_method` | `createMethod` | 生成方式 |
| `code` | `code` | `code` | 单据编号 |
| `protocol_number` | `protocol_number` | `protocolNumber` | 协议号 |
| `loan_interest_rate` | `loan_interest_rate` | `loanInterestRate` | 现金流引用利率id集合(融资方向) |
| `interest_rate_values` | `interest_rate_values` | `interestRateValues` | 现金流引用利率值集合 |
| `bank` | `bank` | `bank` | 贷款利率的银行类别 |
| `is_update_settlement_date` | `is_update_settlement_date` | `isUpdateSettlementDate` | 是否更新申购日为结算日 |
| `settle_interest_first` | `settle_interest_first` | `settleInterestFirst` | 是否先结息再收息 |
| `settle_other_name` | `settle_other_name` | `settleOtherName` | 对方账户名称 |
| `settle_other_account` | `settle_other_account` | `settleOtherAccout` | 对方银行账号 |
| `settle_other_banktype` | `settle_other_banktype` | `settleOtherBanktype` | 对方账户银行类别 |
| `settle_other_number` | `settle_other_number` | `settleOtherNumber` | 对方账户联行号 |
| `settle_other_bank` | `settle_other_bank` | `settleOtherBank` | 对方账户开户行 |
| `auto_infuse_status` | `auto_infuse_status` | `autoInfuseStatus` | 自动生成融入单状态 |
| `auto_infuse_fail_reason` | `auto_infuse_fail_reason` | `autoInfuseFailReason` | 自动生单失败原因 |
| `if_used` | `if_used` | `ifUsed` | 参照是否被使用 |
| `version` | `version` | `version` | 版本号 |
| `last_version` | `last_version` | `lastVersion` | 最新的版本号 |
| `cf_business_type` | `cf_business_type` | `cfBusinessType` | 上个写现金流的业务类型 |
| `version_type` | `version_type` | `versionType` | 版本生成类型 |
| `isreserve_date` | `isreserve_date` | `isReserveDate` | 是否填写备款日期 |
| `other_name` | `other_name` | `otherName` | 对方账户名称 |
| `other_account` | `other_account` | `otherAccout` | 对方银行账号 |
| `other_banktype` | `other_banktype` | `otherBanktype` | 对方账户银行类别 |
| `other_number` | `other_number` | `otherNumber` | 对方账户联行号 |
| `other_bank` | `other_bank` | `otherBank` | 对方账户开户行 |
| `trading_limit` | `trading_limit` | `tradingLimit` | 交易限额 |
| `occupy_trading_limit` | `occupy_trading_limit` | `occupyTradingLimit` | 投资额度占用时机 |
| `release_trading_limit` | `release_trading_limit` | `releaseTradingLimit` | 投资额度释放时机 |
| `budget_release` | `budget_release` | `budgetRelease` | 预算释放 |
| `grant_or_not` | `grant_or_not` | `grantOrNot` | 是否受让 |
| `month_wh_adjust_date` | `month_wh_adjust_date` | `monthWithHoldingAdjustDate` | 月末日期调整(预提) |
| `regular_notify_acc_interest` | `regular_notify_acc_interest` | `regularNotifyAccInterest` | 定期/通知账户是否计息 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `default_add_principal` | `default_add_principal` | `defaultAddPrincipal` | 登记时是否默认增加本金 |
| `dis_used` | `dis_used` | `disused` | 是否废弃 |
| `financing_org_type` | `financing_org_type` | `financingOrgType` | 投资机构类型 |
| `bill_effective_time` | `bill_effective_time` | `billEffectiveTime` | 单据生效时机 |
| `if_effective` | `if_effective` | `ifEffective` | 是否生效 |
| `deposit_product_code` | `deposit_product_code` | `depositProductCode` | 存款产品编码 |
| `financing_org_other` | `financing_org_other` | `financingOrgForOther` | 投资机构 |
| `is_budget` | `is_budget` | `isBudget` | 是否占用预算 |
| `term_unit` | `term_unit` | `termUnit` | 期限类型 |
| `product_name` | `product_name` | `productName` | 产品名称 |
| `term` | `term` | `term` | 期限 |
| `product_issuer` | `product_issuer` | `productIssuer` | 产品发行人 |
| `product_custodian` | `product_custodian` | `productCustodian` | 产品托管人 |
| `term_type` | `term_type` | `termType` | 投资期限分类 |
| `product_size` | `product_size` | `productSize` | 产品规模 |
| `repayment_type` | `repayment_type` | `repaymentType` | 赎回方式 |
| `trustee_type` | `trustee_type` | `trusteeType` | 受托人机构类型 |
| `repayment_cycle` | `repayment_cycle` | `repaymentCycle` | 赎回周期 |
| `pay_account_type` | `pay_account_type` | `payAccountType` | 收支账户类型 |
| `settle_param` | `settle_param` | `settleParam` | 结算集成参数:资金结算stwb,不结算no |
| `sync_accessory` | `sync_accessory` | `syncAccessory` | 是否协同附件 |
| `income_acc_other` | `income_acc_other` | `incomeAccOther` | 收入账户 |
| `regular_notify_acc_other` | `regular_notify_acc_other` | `regularNotifyAccOther` | 定期/通知账户 |
| `outlay_acc_other` | `outlay_acc_other` | `outlayAccOther` | 支出账户 |
| `fund_payment_type` | `fund_payment_type` | `fundPaymentType` | 资金支付模式 |
| `call_deposit_type` | `call_deposit_type` | `callDepositType` | 通知存款类型 |
| `is_split_applied_amount` | `is_split_applied_amount` | `isSplitAppliedAmount` | 申请金额是否拆分 |
| `expire_end_type` | `expire_end_type` | `expireEndType` | 到期结束方式 |
| `rate_type` | `rate_type` | `rateType` | 利率类型 |
| `interest_days` | `interest_days` | `interestDays` | 计息天数 |
| `deposit_interest_rate` | `deposit_interest_rate` | `depositInterestRate` | 存款利率管理id |
| `year_month_day` | `year_month_day` | `yearMonthDay` | 年/月/日利率 |
| `month_adjust_date` | `month_adjust_date` | `monthAdjustDate` | 月末日期调整(赎回) |
| `float_type` | `float_type` | `floatType` | 浮动方式 |
| `rate_adjust_cycle` | `rate_adjust_cycle` | `rateAdjustCycle` | 利率调整周期 |
| `settlement_type` | `settlement_type` | `settlementType` | 结息方式 |
| `settlement_cycle` | `settlement_cycle` | `settlementCycle` | 结息周期 |
| `contract_originator` | `contract_originator` | `contractOriginator` | 合同发起方 |
| `if_direct_connection` | `if_direct_connection` | `ifDirectConnection` | 是否直联 |
| `interest_acc_other` | `interest_acc_other` | `interestAccOther` | 计息账户 |
| `fp_sync_direction` | `fp_sync_direction` | `fpSyncDirection` | 融入/申购发起方 |
| `ri_sync_direction` | `ri_sync_direction` | `riSyncDirection` | 还本/赎回发起方 |
| `pi_sync_direction` | `pi_sync_direction` | `piSyncDirection` | 付息/收息发起方 |
| `red_sync_direction` | `red_sync_direction` | `redSyncDirection` | 融资/贷款减免协同方向 |
| `fpc_sync_direction` | `fpc_sync_direction` | `fpcSyncDirection` | 融入/申购变更发起方 |
| `rollover_originator` | `rollover_originator` | `rolloverOriginator` | 展期发起方 |
| `frc_sync_direction` | `frc_sync_direction` | `frcSyncDirection` | 变更发起方 |
| `settlement_status` | `settlement_status` | `settlementStatus` | 结算状态 |
| `allow_transfer` | `allow_transfer` | `allowTransfer` | 是否允许转让 |
| `local_acc_other` | `local_acc_other` | `localAccOther` | 本方银行账户 |
| `other_type` | `other_type` | `otherType` | 对方类型 |
| `month_interest_adjust_date` | `month_interest_adjust_date` | `monthInterestAdjustDate` | 月末日期调整(计息) |
| `included_expiration_date` | `included_expiration_date` | `includedExpirationDate` | 是否含到期日 |
| `interes_base` | `interes_base` | `interesBase` | 提前赎回计息基数 |
| `normal_interes_base` | `normal_interes_base` | `normalInteresBase` | 正常赎回计息基数 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `` | `creator` | `creator` | 创建人 |
| `` | `auditor` | `auditor` | 审批人 |
| `withholding_cycle` | `withholding_cycle` | `withholdingCycle` | 预提利息周期 |
| `purchaseMethod` | `purchaseMethod` | `purchaseMethod` | 申购方式 |
| `third_name` | `third_name` | `thirdName` | 第三方名称 |
| `third_account` | `third_account` | `thirdAccout` | 第三方银行账号 |
| `third_banktype` | `third_banktype` | `thirdBanktype` | 第三方账户名称 |
| `third_number` | `third_number` | `thirdNumber` | 第三方账户开户行 |
| `auto_generate_contract` | `auto_generate_contract` | `autoGenerateContract` | 是否自动生成合同:yes、no |
| `interest_accrual_days_in` | `interest_accrual_days_in` | `interestAccrualDaysIn` | 计息算法 |
| `sync_msg` | `sync_msg` | `syncMsg` | 协同失败原因 |

### 引用字段 (46个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bus_type` | `bus_type` | `bustype` | 交易类型id |
| `accentity` | `accentity` | `accentity` | 资金组织 |
| `financial_product` | `financial_product` | `financialProduct` | 金融产品id |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `agent_income_accid` | `agent_income_accid` | `agentIncomeAccid` | 代理收入账户 |
| `agent_outlay_accid` | `agent_outlay_accid` | `agentOutlayAccid` | 代理支出账户 |
| `agent_interest_accid` | `agent_interest_accid` | `agentInterestAccid` | 代理收息账户 |
| `settle_other_id` | `settle_other_id` | `settleOtherId` | 对方资金业务对象银行信息参照id |
| `settleSupplierBankAccount` | `settleSupplierBankAccount` | `settleSupplierBankAccount` | 供应商银行账号 |
| `settleCustomerBankAccount` | `settleCustomerBankAccount` | `settleCustomerBankAccount` | 客户银行账号 |
| `infuse_income_accid` | `infuse_income_accid` | `infuseIncomeAccid` | 收入账户 |
| `financing_apply` | `financing_apply` | `financingApply` | 融资申请id |
| `cost_center` | `cost_center` | `costCenter` | 成本中心 |
| `profit_center` | `profit_center` | `profitCenter` | 利润中心 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `project_id` | `project_id` | `projectid` | 项目 |
| `financing_org_bank` | `financing_org_bank` | `financingOrgForBank` | 投资机构ID |
| `wbs` | `wbs` | `wbs` | WBS |
| `supplier` | `supplier` | `supplier` | 供应商id |
| `activity` | `activity` | `activity` | 活动 |
| `customer` | `customer` | `customer` | 客户id |
| `protocol_currency` | `protocol_currency` | `protocolCurrency` | 投资币种id |
| `dept_id` | `dept_id` | `deptid` | 部门 |
| `capital_currency` | `capital_currency` | `capitalCurrency` | 本金币种id |
| `trustee` | `trustee` | `trustee` | 受托人id |
| `income_accid` | `income_accid` | `incomeAccid` | 收入账户id |
| `outlay_accid` | `outlay_accid` | `outlayAccid` | 支出账户id |
| `regular_notify_acc` | `regular_notify_acc` | `regularNotifyAcc` | 定期/通知账户id |
| `base_rate_type` | `base_rate_type` | `baseRateType` | 基准利率种类id |
| `interest_currency` | `interest_currency` | `interestCurrency` | 计息币种id |
| `interest_accid` | `interest_accid` | `interestAccid` | 计息账户id |
| `infuse_capital_currency` | `infuse_capital_currency` | `infuseCapitalCurrency` | 本金币种id |
| `old_currency` | `old_currency` | `oldCurrency` | 本币币种ID |
| `exchange_rate_type` | `exchange_rate_type` | `exchangeRateType` | 本币币种汇率类型ID |
| `settlement_method` | `settlement_method` | `settlementMethod` | 结算方式ID |
| `local_accid` | `local_accid` | `localAccid` | 本方银行账户ID |
| `fundBusinessObject` | `fundBusinessObject` | `fundBusinessObject` | 对方账户名称id |
| `inCustomerBankAccount` | `inCustomerBankAccount` | `inCustomerBankAccount` | 对方账户名称id |
| `inSupplierBankAccount` | `inSupplierBankAccount` | `inSupplierBankAccount` | 对方账户名称id |
| `agency_output_currency` | `agency_output_currency` | `agencyOutputCurrency` | 代理支出账户币种 |
| `opposite_settle_currency` | `opposite_settle_currency` | `oppositeSettleCurrency` | 对方账户币种 |
| `output_currency` | `output_currency` | `outputCurrency` | 支出账户币种 |

### 日期字段 (24个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `version_date` | `version_date` | `versionDate` | 版本生成时间 |
| `reserve_date` | `reserve_date` | `reserveDate` | 备款日期 |
| `grant_interest_date` | `grant_interest_date` | `grantInterestDate` | 计划发放日期 |
| `last_interest_date` | `last_interest_date` | `lastInterestDate` | 上一次结息日 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `begin_date` | `begin_date` | `beginDate` | 预计开始日期 |
| `expire_date` | `expire_date` | `expireDate` | 预计到期日期 |
| `time_to_market` | `time_to_market` | `timeToMarket` | 上市时间 |
| `sign_date` | `sign_date` | `signDate` | 签约日期 |
| `closing_start_date` | `closing_start_date` | `closingStartDate` | 封闭开始日期 |
| `closed_expiration_date` | `closed_expiration_date` | `closedExpirationDate` | 封闭到期日期 |
| `first_repayment_date` | `first_repayment_date` | `firstRepaymentDate` | 首次赎回日 |
| `first_effect_date` | `first_effect_date` | `firstEffectDate` | 调整首次生效日 |
| `first_payment_date` | `first_payment_date` | `firstPaymentDate` | 首次收息日 |
| `standard_expire_date` | `standard_expire_date` | `standardExpireDate` | 到期日期 |
| `purchase_date` | `purchase_date` | `purchaseDate` | 申购日期 |
| `declared_interest_date` | `declared_interest_date` | `declaredInterestDate` | 已宣告待发放日期 |
| `amortized_cost_date` | `amortized_cost_date` | `amortizedCostDate` | 摊余成本更新日期 |
| `fair_value_date` | `fair_value_date` | `fairValueDate` | 公允价值更新日期 |
| `withholding_interest_date` | `withholding_interest_date` | `withholdingInterestDate` | 预提起息日 |
| `first_withholding_cycle` | `first_withholding_cycle` | `firstWithholdingDate` | 首次预提利息日 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isWfControlled` | `isWfControlled` | 审批流控制 |
| `canuseflow` | `canuseflow` | `canuseflow` | 是否走审批流 |

### 枚举字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `order_trans_status` | `order_trans_status` | `orderTransStatus` | 单据交易状态 |
| `period_head_tail` | `period_head_tail` | `periodHeadTail` | 周期首尾规则 |
| `holiday_principle` | `holiday_principle` | `holidayPrinciple` | 节假日处理原则 |
| `interest_settlement_rule` | `interest_settlement_rule` | `interestSettlementRule` | 结息头尾规则 |
| `holiday_interest_principle` | `holiday_interest_principle` | `holidayInterestPrinciple` | 节假日计息原则 |
| `interest_cal_method` | `interest_cal_method` | `interestCalMethod` | 利息计算方式 |
| `withholding_rule` | `withholding_rule` | `withholdingRule` | 预提头尾规则 |
| `settled_addition` | `settled_addition` | `settledAddition` | 已结算补单 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `capital_happen_number` | `capital_happen_number` | `capitalHappenNumber` | 本金发生次数 |
| `term_number` | `term_number` | `termNumber` | 期限 |

### 短整数 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `verifystate` | `verifystate` | 审批状态 |
| `send_sync` | `send_sync` | `sendSync` | 是否发起协同 |
| `receive_sync` | `receive_sync` | `receiveSync` | 接收协同状态 |
| `domestic_or_overseas` | `domestic_or_overseas` | `domesticOrOverseas` | 境内/境外 |
| `` | `returncount` | `returncount` | 退回次数 |
| `` | `status` | `status` | 单据状态 |
| `audit_status` | `audit_status` | `auditStatus` | 审批状态 |
| `push_downstream_status` | `push_downstream_status` | `pushDownStreamStatus` | 推下游单据状态 |
| `close_period` | `close_period` | `closePeriod` | 封闭期 |
| `lend_by_trustee` | `lend_by_trustee` | `lendByTrustee` | 是否通过受托人放款 |
| `apply_status` | `apply_status` | `applyStatus` | 申请状态 |
| `exchange_rate_ops` | `exchange_rate_ops` | `exchangeRateOps` | 本币币种汇率折算方式 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `cf_business_id` | `cf_business_id` | `cfBusinessId` | 上个写现金流的业务id |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (33个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `purchase_num` | `purchase_num` | `purchaseNum` | 申购数量 |
| `protocol_amount` | `protocol_amount` | `protocolAmount` | 投资金额 |
| `expected_return` | `expected_return` | `expectedReturn` | 预期收益率 |
| `capital_exchange_rate` | `capital_exchange_rate` | `capitalExchangeRate` | 本金约定汇率 |
| `price` | `price` | `price` | 单价 |
| `num` | `num` | `num` | 数量 |
| `base_rate` | `base_rate` | `baseRate` | 基准利率(%) |
| `float_value` | `float_value` | `floatValue` | 浮动值 |
| `protocol_rate` | `protocol_rate` | `protocolRate` | 协议利率(%) |
| `appoint_rate` | `appoint_rate` | `appointRate` | 利息约定汇率 |
| `remain_num` | `remain_num` | `remainNum` | 剩余数量 |
| `infuse_capital_rate` | `infuse_capital_rate` | `infuseCapitalRate` | 本金约定汇率 |
| `purchase_priamount` | `purchase_priamount` | `purchasePriamount` | 申购金额(本金币种) |
| `exchange_rate` | `exchange_rate` | `exchangeRate` | 本币币种汇率 |
| `purchase_lcamount` | `purchase_lcamount` | `purchaseLcamount` | 申购金额(本币币种) |
| `deal_price` | `deal_price` | `dealPrice` | 交易单价 |
| `deal_amount_protocol` | `deal_amount_protocol` | `dealAmountProtocol` | 交易金额(协议币种) |
| `deal_cost_protocol` | `deal_cost_protocol` | `dealCostProtocol` | 交易费用(协议币种) |
| `declared_interest_protocol` | `declared_interest_protocol` | `declaredInterestProtocol` | 已宣告未发放金额(协议币种) |
| `real_pay_amount_protocol` | `real_pay_amount_protocol` | `realPayAmountProtocol` | 实付金额(协议币种) |
| `current_interest_rate` | `current_interest_rate` | `currentInterestRate` | 活期利率(%) |
| `amortized_cost` | `amortized_cost` | `amortizedCost` | 摊余成本 |
| `fair_value` | `fair_value` | `fairValue` | 公允价值 |
| `deal_amount_capital` | `deal_amount_capital` | `dealAmountCapital` | 交易金额(本金币种) |
| `deal_cost_capital` | `deal_cost_capital` | `dealCostCapital` | 交易费用(本金币种) |
| `declared_interest_capital` | `declared_interest_capital` | `declaredInterestCapital` | 已宣告未发放金额(本金币种) |
| `real_rate` | `real_rate` | `realRate` | 实际利率(%) |
| `real_pay_amount_capital` | `real_pay_amount_capital` | `realPayAmountCapital` | 实付金额(本金币种) |
| `deal_amount_local` | `deal_amount_local` | `dealAmountLocal` | 交易金额(本币币种) |
| `deal_cost_local` | `deal_cost_local` | `dealCostLocal` | 交易费用(本币币种) |
| `declared_interest_local` | `declared_interest_local` | `declaredInterestLocal` | 已宣告未发放金额(本币币种) |
| `real_pay_amount_local` | `real_pay_amount_local` | `realPayAmountLocal` | 实付金额(本币币种) |
| `available_balance` | `available_balance` | `availableBalance` | 剩余可用额度 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ia_define_character` | `ia_define_character` | `investmentApplyCharacterDef` | 投资申请自定义项特征属性组 |

### other (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 投资申请自由自定义项 |
| `` | `` | `investmentApplyDetail` | 申请明细 |
| `` | `` | `investmentApplyParity` | 比价信息子表 |
| `` | `` | `investmentCustomRate` | 自定义利率 |
| `` | `` | `investmentRelatedQuota` | 关联投资额度 |
