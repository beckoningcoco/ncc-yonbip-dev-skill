---
tags: [BIP, 元数据, 数据字典, tlm.purchaseregister.PurchaseRegister]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 申购登记 (`tlm.purchaseregister.PurchaseRegister`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_purchaseregister` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：`9263d179-0cbc-43b1-b559-7235207192b1`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 申购登记 |
| 物理表 | `tlm_purchaseregister` |
| domain/服务域 | `yonbip-fi-ctmtlm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `TLM` |
| 直连字段 | 267 个 |
| 子表 | 15 个 |
| 关联引用 | 51 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `purchaseRegisterCheckFlowBackUp` | `tlm.purchaseregister.PurchaseRegisterCheckFlowBackUp` | composition |
| `purchaseRegisterAccrualPlan` | `tlm.purchaseregister.PurchaseRegisterAccrualPlan` | composition |
| `purchaseRegisterAccrualPlanBackUp` | `tlm.purchaseregister.PurchaseRegisterAccrualPlanBackUp` | composition |
| `purchaseRegisterFuLiZhuanCunRecord` | `tlm.purchaseregister.PurchaseRegisterFuLiZhuanCunRecord` | composition |
| `purchaseRegisterHistory` | `tlm.purchaseregister.PurchaseRegisterHistory` | composition |
| `purchaseRegisterCostFlow` | `tlm.purchaseregister.PurchaseRegisterCostFlow` | composition |
| `defines` | `tlm.purchaseregister.PurchaseRegisterDefine` | composition |
| `purchaseRegister_cashflowBackUp` | `tlm.purchaseregister.PurchaseRegister_cashflowBackUp` | composition |
| `purchaseRegisterRelatedQuota` | `tlm.purchaseregister.PurchaseRegisterRelatedQuota` | composition |
| `purchaseRegisterDebt` | `tlm.purchaseregister.PurchaseRegisterDebt` | composition |
| `purchaseRegisterCheckFlow` | `tlm.purchaseregister.PurchaseRegisterCheckFlow` | composition |
| `purchaseRegister_cashflow` | `tlm.purchaseregister.PurchaseRegister_cashflow` | composition |
| `purchaseRegisterCustomRate` | `tlm.purchaseregister.PurchaseRegisterCustomRate` | composition |
| `purchaseRegisterReduction` | `tlm.purchaseregister.PurchaseRegisterReduction` | composition |
| `purchaseRegisterRateChangeRecord` | `tlm.purchaseregister.PurchaseRegisterRateChangeRecord` | composition |

## 关联引用 (51个)

| 字段名 | 引用类型 |
|--------|---------|
| `purchase_apply` | `` |
| `baseRateType` | `tlm_interestrateRef` |
| `` | `` |
| `opposite_settle_currency` | `` |
| `accentity` | `ucf-org-center.bd_fundsorg_na` |
| `fundBusinessObject` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobjbank_Ref` |
| `capital_currency` | `ucfbasedoc.bd_currencytenantref` |
| `old_currency` | `` |
| `supplier_bank_account` | `yssupplier.aa_vendorbankref` |
| `last_withholding` | `` |
| `extension_id` | `` |
| `tenant_id` | `` |
| `cashflowplan` | `tlm_financingregister_cashflowRef` |
| `cost_center` | `` |
| `otherAccount` | `bd_enterprisebankacctref` |
| `settlement_currency` | `` |
| `last_balance_settlement` | `` |
| `agency_output_currency` | `` |
| `before_trans_id` | `` |
| `agency_outlay_acc` | `` |
| `dept_id` | `` |
| `profit_center` | `` |
| `purchase_register_character_def` | `` |
| `settlementMethod` | `aa_settlemethodref` |
| `last_balance_interest_collection` | `` |
| `protocolNumber` | `tlm_financingregisterRef` |
| `customer_bank_account` | `aa_merchantbankref` |
| `ytenant_id` | `` |
| `accentity_raw` | `ucf-org-center.bd_financeorgtreeref_na` |
| `virtual_purchase_id` | `` |
| `debtId` | `tlm_financeinRef` |
| `tradetype` | `bd_transtypelistref` |
| `exchangerate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `regular_notify_acc` | `` |

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

> 共 267 个直连字段

### 文本字段 (70个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `withholding_rule` | `withholding_rule` | `withholdingRule` | 预提头尾规则 |
| `voucher_no` | `voucher_no` | `voucherNo` | 凭证号 |
| `otherAcctName` | `otherAcctName` | `otherAcctName` | 对方账户名称 |
| `otherAcctNo` | `otherAcctNo` | `otherAcctNo` | 对方银行账号 |
| `bankType` | `bankType` | `bankType` | 对方账户银行类别 |
| `bankNumberName` | `bankNumberName` | `bankNumberName` | 对方账户开户行 |
| `repay_type` | `repay_type` | `repayType` | 收款类型 |
| `is_update_settlement_date` | `is_update_settlement_date` | `isUpdateSettlementDate` | 是否更新申购日为结算日 |
| `internal_acct_wr_date` | `internal_acct_wr_date` | `internalAcctWrDate` | 内部账写账日期 |
| `lineNumber` | `lineNumber` | `lineNumber` | 对方账户联行号 |
| `fund_payment_type` | `fund_payment_type` | `fundPaymentType` | 资金支付模式 |
| `default_financing_org` | `default_financing_org` | `defaultFinancingOrg` | 投资机构名称 |
| `entry_time` | `entry_time` | `entryTime` | 入账时机 |
| `incorporation_num` | `incorporation_num` | `incorporationNum` | 财资统一对账码 |
| `bank_order_no` | `bank_order_no` | `bankOrderNo` | 银行流水号 |
| `artificial_association` | `artificial_association` | `artificialAssociation` | 是否开启人工关联 |
| `bank_transaction_num` | `bank_transaction_num` | `bankTransactionNum` | 银行交易流水号 |
| `source_type` | `source_type` | `sourcetype` | 上游类型 |
| `down_stream_type` | `down_stream_type` | `downStreamType` | 下游关联单据类型 |
| `bankStatement_bank_ccount` | `bankStatement_bank_ccount` | `bankStatementBankAccount` | 银行账户 |
| `use_overdue` | `use_overdue` | `useOverdue` | 是否启用逾期 |
| `is_penalty` | `is_penalty` | `isPenalty` | 是否计算罚息 |
| `is_compound_interest` | `is_compound_interest` | `isCompoundInterest` | 是否计算复利 |
| `budget_release` | `budget_release` | `budgetRelease` | 预算释放 |
| `grant_or_not` | `grant_or_not` | `grantOrNot` | 是否受让 |
| `withholding_month_adjust` | `withholding_month_adjust` | `withholdingMonthAdjust` | 预提月末调整(预提) |
| `month_wh_adjust_date` | `month_wh_adjust_date` | `monthWithHoldingAdjustDate` | 月末日期调整(预提) |
| `auto_extension_term_unit` | `auto_extension_term_unit` | `autoExtensionTermUnit` | 期限单位 |
| `month_adjust_date` | `month_adjust_date` | `monthAdjustDate` | 月末日期调整(赎回) |
| `cf_beforebusiness_type` | `cf_beforebusiness_type` | `cfBeforeBusinessType` | 备份上个写现金流的业务类型 |
| `cf_business_type` | `cf_business_type` | `cfBusinessType` | 上个写现金流的业务类型 |
| `create_method` | `create_method` | `createMethod` | 生成方式:引用枚举类-BillCreateMethodEnum |
| `depositInterestRate` | `depositInterestRate` | `depositInterestRate` | 存款利率id |
| `remark1` | `remark1` | `remark1` | 备注1 |
| `associate_statement` | `associate_statement` | `associateStatement` | 是否关联对账单 |
| `` | `code` | `code` | 申请编号 |
| `initialization` | `initialization` | `initialization` | 是否期初 |
| `purchaseCode` | `purchaseCode` | `purchaseCode` | 申购单号 |
| `purchaseTerm` | `purchaseTerm` | `purchaseTerm` | 申购期限 |
| `investmentTermType` | `investmentTermType` | `investmentTermType` | 投资期限分类 |
| `floatType` | `floatType` | `floatType` | 浮动方式 |
| `expire_end_type` | `expire_end_type` | `expireEndType` | 到期结束方式 |
| `endReason` | `endReason` | `endReason` | 结束原因 |
| `remark` | `remark` | `remark` | 备注 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `` | `auditor` | `auditor` | 审批人 |
| `loan_interest_rate` | `loan_interest_rate` | `loanInterestRate` | 存款利率id |
| `interest_rate_values` | `interest_rate_values` | `interestRateValues` | 贷款利率管理id |
| `other_account_input` | `other_account_input` | `otherAccountInput` | 本方银行账户 |
| `rate_type` | `rate_type` | `rateType` | 利率类型 |
| `interest_days` | `interest_days` | `interestDays` | 计息天数 |
| `period_head_tail` | `period_head_tail` | `periodHeadTail` | 周期首尾规则 |
| `included_expiration_date` | `included_expiration_date` | `includedExpirationDate` | 是否含到期日 |
| `interes_base` | `interes_base` | `interesBase` | 提前还本计息基数 |
| `normal_interes_base` | `normal_interes_base` | `normalInteresBase` | 正常还本计息基数 |
| `associated_claim_form` | `associated_claim_form` | `associatedClaimForm` | 关联认领单id |
| `associated_bank_statements` | `associated_bank_statements` | `associatedBankStatements` | 关联银行对账单id |
| `purchase_apply_code` | `purchase_apply_code` | `purchaseApplyCode` | 申购申请编号 |
| `postscript_info` | `postscript_info` | `postscriptInfo` | 附言 |
| `abstract_info` | `abstract_info` | `abstractInfo` | 用途 |
| `purchaseMethod` | `purchaseMethod` | `purchaseMethod` | 申购方式 |
| `third_name` | `third_name` | `thirdName` | 第三方名称 |
| `third_account` | `third_account` | `thirdAccout` | 第三方银行账号 |
| `third_banktype` | `third_banktype` | `thirdBanktype` | 第三方账户名称 |
| `third_number` | `third_number` | `thirdNumber` | 第三方账户开户行 |
| `isreserve_date` | `isreserve_date` | `isReserveDate` | 是否填写备款日期 |
| `pay_account_type` | `pay_account_type` | `payAccountType` | 收支账户类型 |
| `regular_notify_acc_other` | `regular_notify_acc_other` | `regularNotifyAccOther` | 定期/通知账户 |
| `sync_msg` | `sync_msg` | `syncMsg` | 协同失败原因 |

### 引用字段 (35个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `virtual_purchase_id` | `virtual_purchase_id` | `virtualPurchaseId` | 虚拟申购单ID |
| `` | `auditorId` | `auditorId` | 审批人 |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `opposite_settle_currency` | `opposite_settle_currency` | `oppositeSettleCurrency` | 对方结算币种 |
| `settlement_currency` | `settlement_currency` | `settlementCurrency` | 结算币种 |
| `agency_output_currency` | `agency_output_currency` | `agencyOutputCurrency` | 代理支出账户币种 |
| `last_withholding` | `last_withholding` | `lastWithholding` | 上次预提 |
| `last_balance_settlement` | `last_balance_settlement` | `lastBalanceSettlement` | 上次余额结息 |
| `last_balance_interest_collection` | `last_balance_interest_collection` | `lastBalanceInterestCollection` | 上次余额收息 |
| `before_trans_id` | `before_trans_id` | `beforeTransId` | 转存前申购单ID |
| `dept_id` | `dept_id` | `deptid` | 部门 |
| `cost_center` | `cost_center` | `costCenter` | 成本中心 |
| `profit_center` | `profit_center` | `profitCenter` | 利润中心 |
| `agency_outlay_acc` | `agency_outlay_acc` | `agencyOutlayAcc` | 代理支出账户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `debtId` | `debtId` | `debtId` | 生成协同的融入id |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `accentity` | `accentity` | `accentity` | 资金组织id |
| `tradetype` | `tradetype` | `bustype` | 交易类型id |
| `protocolNumber` | `protocolNumber` | `protocolNumber` | 投资协议id |
| `cashflowplan` | `cashflowplan` | `cashflowplan` | 现金流计划ID |
| `capital_currency` | `capital_currency` | `capitalCurrency` | 本金币种id |
| `old_currency` | `old_currency` | `oldcurrency` | 本币币种ID |
| `exchangerate_type` | `exchangerate_type` | `exchangerateType` | 本币币种汇率类型ID |
| `settlementMethod` | `settlementMethod` | `settlementMethod` | 结算方式ID |
| `otherAccount` | `otherAccount` | `otherAccount` | 本方银行账户id |
| `fundBusinessObject` | `fundBusinessObject` | `fundBusinessObject` | 资金业务对象id |
| `baseRateType` | `baseRateType` | `baseRateType` | 基准利率种类ID |
| `extension_id` | `extension_id` | `extensionId` | 展期单据ID |
| `purchase_apply` | `purchase_apply` | `purchaseApply` | 申购申请ID |
| `customer_bank_account` | `customer_bank_account` | `settleCustomerBankAccount` | 对方账户名称id |
| `supplier_bank_account` | `supplier_bank_account` | `settleSupplierBankAccount` | 对方账户名称id |
| `regular_notify_acc` | `regular_notify_acc` | `regularNotifyAcc` | 定期/通知账户-企业银行账户档案 |

### 日期字段 (26个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accrual_begin_date` | `accrual_begin_date` | `accrualBeginDate` | 预提起息日 |
| `amortized_cost_update_date` | `amortized_cost_update_date` | `amortizedCostUpdateDate` | 摊余成本更新日期 |
| `collect_interest_begin_date` | `collect_interest_begin_date` | `collectInterestBeginDate` | 收息起息日 |
| `fair_value_update_date` | `fair_value_update_date` | `fairValueUpdateDate` | 公允价值更新日期 |
| `settlement_begin_date` | `settlement_begin_date` | `settlementBeginDate` | 结息起息日 |
| `interest_rate_date` | `interest_rate_date` | `interestRateDate` | 初始利率日期 |
| `settlement_date` | `settlement_date` | `settlementDate` | 结算日期 |
| `init_date` | `init_date` | `initDate` | 初始日期 |
| `last_settle_interest_date` | `last_settle_interest_date` | `lastSettleInterestDate` | 上一次结息日 |
| `next_transfer_date` | `next_transfer_date` | `nextTransferDate` | 下次转存日期 |
| `first_repayment_date` | `first_repayment_date` | `firstRepaymentDate` | 首次赎回日 |
| `first_payment_date` | `first_payment_date` | `firstPaymentDate` | 首次收息日 |
| `first_accrual_date` | `first_accrual_date` | `firstAccrualDate` | 首次预提利息日 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `purchaseDate` | `purchaseDate` | `purchaseDate` | 申购日期 |
| `purchaseEnddate` | `purchaseEnddate` | `purchaseEnddate` | 申购到期日期 |
| `last_redeem_date` | `last_redeem_date` | `lastRedeemDate` | 期初末次赎回日期 |
| `last_interest_date` | `last_interest_date` | `lastInterestDate` | 期初末次收息日期 |
| `endDate` | `endDate` | `endDate` | 结束日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `plan_paid_date` | `plan_paid_date` | `planPaidDate` | 已宣告待发放日期 |
| `first_effect_date` | `first_effect_date` | `firstEffectDate` | 调整首次生效日 |
| `exhibition_period_end_date` | `exhibition_period_end_date` | `exhibitionPeriodEndDate` | 展期后到期日 |
| `reserve_date` | `reserve_date` | `reserveDate` | 备款日期 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `canuseflow` | `canuseflow` | `canuseflow` | 是否走审批流 |
| `` | `isWfControlled` | `isWfControlled` | 审批流控制 |
| `autoCreate` | `autoCreate` | `autoCreate` | 是否投资生成 |

### 枚举字段 (26个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accrual_period` | `accrual_period` | `accrualPeriod` | 预提利息周期 |
| `settled_addition` | `settled_addition` | `settledAddition` | 已结算补单 |
| `transaction_association_method` | `transaction_association_method` | `transactionAssociationMethod` | 流水关联方式 |
| `business_integration` | `business_integration` | `businessIntegration` | 业务集成 |
| `settlement_processing_method` | `settlement_processing_method` | `settlementProcessingMethod` | 结算处理方式 |
| `is_support_settle_center` | `is_support_settle_center` | `isSupportSettleCenter` | 是否集成结算中心 |
| `overdue_auto_extension` | `overdue_auto_extension` | `overdueAutoExtension` | 逾期自动展期 |
| `repayment_type` | `repayment_type` | `repaymentType` | 赎回方式 |
| `repayment_cycle` | `repayment_cycle` | `repaymentCycle` | 赎回周期 |
| `settlement_type` | `settlement_type` | `settlementType` | 结息方式 |
| `settlement_cycle` | `settlement_cycle` | `settlementCycle` | 结息周期 |
| `month_interest_adjust_date` | `month_interest_adjust_date` | `monthInterestAdjustDate` | 月末日期调整(利息) |
| `modifyStatus` | `modifyStatus` | `modifyStatus` | 申购单是否修改过 yes no |
| `billtype` | `billtype` | `billtype` | 单据类型 |
| `purchaseTermUnit` | `purchaseTermUnit` | `purchaseTermUnit` | 期限单位 |
| `settlementStatus` | `settlementStatus` | `settlementStatus` | 结算状态 |
| `otherType` | `otherType` | `otherType` | 对方类型 |
| `is_budget` | `is_budget` | `isBudget` | 是否占用預算 |
| `is_settle` | `is_settle` | `isSettle` | 是否集成结算 |
| `year_month_day` | `year_month_day` | `yearMonthDay` | 年/月/日利率 |
| `holiday_principle` | `holiday_principle` | `holidayPrinciple` | 节假日处理原则 |
| `interest_settlement_rule` | `interest_settlement_rule` | `interestSettlementRule` | 结息头尾规则 |
| `interest_cal_method` | `interest_cal_method` | `interestCalMethod` | 利息计算方式 |
| `rate_adjust_cycle` | `rate_adjust_cycle` | `rateAdjustCycle` | 利率调整周期 |
| `holiday_interest_principle` | `holiday_interest_principle` | `holidayInterestPrinciple` | 节假日计息原则 |
| `pr_fund_payment_type` | `pr_fund_payment_type` | `prFundPaymentType` | 资金支付模式 |

### 整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_new` | `is_new` | `isNew` | 是否新单据 1-是 0或者为空-否 |
| `grace_period` | `grace_period` | `gracePeriod` | 宽限期 |
| `auto_extension_term_num` | `auto_extension_term_num` | `autoExtensionTermNum` | 自动展期期限 |
| `purchaseTermNumber` | `purchaseTermNumber` | `purchaseTermNumber` | 申购期限 |

### 短整数 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `purchase_type` | `purchase_type` | `purchaseType` | 申购单类型 |
| `protocolStatus` | `protocolStatus` | `protocolStatus` | 协议状态 |
| `exchangerate_ops` | `exchangerate_ops` | `exchangerateOps` | 汇率折算方式  |
| `domestic_or_overseas` | `domestic_or_overseas` | `domesticOrOverseas` | 境内/境外 |
| `` | `returncount` | `returncount` | 退回次数 |
| `send_sync` | `send_sync` | `sendSync` | 是否发起协同:1是0否 |
| `` | `status` | `status` | 单据状态 |
| `srcitem` | `srcitem` | `srcitem` | 事项来源 |
| `srcEventType` | `srcEventType` | `srcEventType` | 事项类型 |
| `voucherstatus` | `voucherstatus` | `voucherstatus` | 凭证状态 |
| `billStatus` | `billStatus` | `billStatus` | 单据状态 |
| `auditstatus` | `auditstatus` | `auditstatus` | 审批状态 |
| `purchaseStatus` | `purchaseStatus` | `purchaseStatus` | 申购单状态 |
| `` | `verifystate` | `verifystate` | 审批状态 |

### 长整数 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `voucher_id` | `voucher_id` | `voucherId` | 凭证单id |
| `cf_beforebusiness_id` | `cf_beforebusiness_id` | `cfBeforeBusinessId` | 备份上个写现金流的业务id |
| `filesCount` | `filesCount` | `filesCount` | 附件数 |
| `down_stream_id` | `down_stream_id` | `downStreamId` | 下游关联单据id |
| `cf_business_id` | `cf_business_id` | `cfBusinessId` | 上个写现金流的业务id |
| `prsettlementid` | `prsettlementid` | `prsettlementid` | 申购结算单id |
| `settlementId` | `settlementId` | `settlementId` | 结算单id |
| `srcbillid` | `srcbillid` | `srcbillid` | 来源单据id |
| `` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | ID |
| `regular_notify_acc_settlement_id` | `regular_notify_acc_settlement_id` | `regularNotifyAccSettlementId` | 定期/通知待结算ID |

### 数值字段 (58个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `amortized_cost` | `amortized_cost` | `amortizedCost` | 摊余成本 |
| `fair_value` | `fair_value` | `fairValue` | 公允价值 |
| `share_of_dividends_paid` | `share_of_dividends_paid` | `shareOfDividendsPaid` | 已分红份额 |
| `write_off_amount` | `write_off_amount` | `writeOffAmount` | 已核销金额 |
| `not_write_off_amount` | `not_write_off_amount` | `notWriteOffAmount` | 未核销金额 |
| `init_amt` | `init_amt` | `initAmt` | 初始金额 |
| `penalty_float_percent` | `penalty_float_percent` | `penaltyFloatPercent` | 罚息上浮比例(%) |
| `penalty_rate` | `penalty_rate` | `penaltyRate` | 罚息利率(%) |
| `compound_float_percent` | `compound_float_percent` | `compoundFloatPercent` | 复利上浮比例(%) |
| `compound_rate` | `compound_rate` | `compoundRate` | 复利利率(%) |
| `expected_return` | `expected_return` | `expectedReturn` | 预期收益率 |
| `expected_return_amt` | `expected_return_amt` | `expectedReturnAmt` | 预期收益 |
| `advance_interest_protocol` | `advance_interest_protocol` | `advanceInterestProtocol` | 垫付利息(协议币种) |
| `advance_interest_principal` | `advance_interest_principal` | `advanceInterestPrincipal` | 垫付利息(本金币种) |
| `advance_interest_local` | `advance_interest_local` | `advanceInterestLocal` | 垫付利息(本币币种) |
| `initRedeemedAmount` | `initRedeemedAmount` | `initRedeemedAmount` | 期初已赎回金额 |
| `initInterestAmount` | `initInterestAmount` | `initInterestAmount` | 期初已收息金额 |
| `wt_amt_int_ccy` | `wt_amt_int_ccy` | `wtAmtIntCcy` | 已预提金额(计息币种) |
| `un_wt_amt_int_ccy` | `un_wt_amt_int_ccy` | `unWtAmtTntCcy` | 未核销预提金额(计息币种) |
| `init_wt_amt_int_ccy` | `init_wt_amt_int_ccy` | `initWtAmtIntCcy` | 期初已预提金额(计息币种) |
| `init_un_wt_amt_int_ccy` | `init_un_wt_amt_int_ccy` | `initUnWtAmtIntCcy` | 期初未核销预提金额(计息币种) |
| `real_accrual_rate` | `real_accrual_rate` | `realAccrualRate` | 实际利率(%)(每个预提周期) |
| `purchaseAmount` | `purchaseAmount` | `purchaseAmount` | 申购金额(协议币种) |
| `baseRate` | `baseRate` | `baseRate` | 基准利率 |
| `floatValue` | `floatValue` | `floatValue` | 浮动值 |
| `purchaseRate` | `purchaseRate` | `purchaseRate` | 申购单利率(%) |
| `redeemedAmount` | `redeemedAmount` | `redeemedAmount` | 已赎回金额 |
| `interestAmount` | `interestAmount` | `interestAmount` | 已收息金额 |
| `purchaseBalance` | `purchaseBalance` | `purchaseBalance` | 申购单余额 |
| `purchasePriamount` | `purchasePriamount` | `purchasePriamount` | 申购金额(本金币种) |
| `exchangerate` | `exchangerate` | `exchangerate` | 本币币种汇率 |
| `purchaseLcamount` | `purchaseLcamount` | `purchaseLcamount` | 申购金额(本币币种) |
| `deal_price` | `deal_price` | `dealPrice` | 交易单价 |
| `purchase_num` | `purchase_num` | `purchaseNum` | 申购数量 |
| `deal_pc_amount` | `deal_pc_amount` | `dealPcAmount` | 交易金额(协议币种) |
| `deal_pc_fee` | `deal_pc_fee` | `dealPcFee` | 交易费用(协议币种) |
| `declared_unpaid_pc_interest` | `declared_unpaid_pc_interest` | `declaredUnpaidPcInterest` | 已宣告未发放的利息(协议币种) |
| `deal_All_paid_pc_amount` | `deal_All_paid_pc_amount` | `dealAllPaidPcAmount` | 实付金额(协议币种) |
| `retain_num` | `retain_num` | `retainNum` | 剩余数量 |
| `deal_cc_amount` | `deal_cc_amount` | `dealCcAmount` | 交易金额(本金币种) |
| `deal_cc_fee` | `deal_cc_fee` | `dealCcFee` | 交易费用(本金币种) |
| `declared_unpaid_cc_interest` | `declared_unpaid_cc_interest` | `declaredUnpaidCcInterest` | 已宣告未发放的利息(本金币种) |
| `deal_all_paid_cc_amount` | `deal_all_paid_cc_amount` | `dealAllPaidCcAmount` | 实付金额(本金币种) |
| `amount_of_dividends_paid` | `amount_of_dividends_paid` | `amountOfDividendsPaid` | 已分红金额 |
| `deal_oc_amount` | `deal_oc_amount` | `dealOcAmount` | 交易金额(本币币种) |
| `deal_oc_fee` | `deal_oc_fee` | `dealOcFee` | 交易费用(本币币种) |
| `declared_unpaid_oc_interest` | `declared_unpaid_oc_interest` | `declaredUnpaidOcInterest` | 已宣告未发放的利息(本币币种) |
| `deal_all_paid_oc_amount` | `deal_all_paid_oc_amount` | `dealAllPaidOcAmount` | 实付金额(本币币种) |
| `locked_amount` | `locked_amount` | `lockedAmount` | 已锁定金额 |
| `settled_interest_amount` | `settled_interest_amount` | `settledInterestAmount` | 已结息金额 |
| `current_interest_rate` | `current_interest_rate` | `currentInterestRate` | 活期利率(%) |
| `reduce_principal_amount` | `reduce_principal_amount` | `reducePrincipalAmount` | 减免本金 |
| `vf_reduce_principal_amount` | `vf_reduce_principal_amount` | `vfReducePrincipalAmount` | 已核销减免本金 |
| `reduce_interest_amount` | `reduce_interest_amount` | `reduceInterestAmount` | 减免利息 |
| `vf_reduce_interest_amount` | `vf_reduce_interest_amount` | `vfReduceInterestAmount` | 已核销减免利息 |
| `exhibition_period_amount` | `exhibition_period_amount` | `exhibitionPeriodAmount` | 展期金额 |
| `init_redeem_num` | `init_redeem_num` | `initRedeemNum` | 期初已赎回数量 |
| `current_valid_rate` | `current_valid_rate` | `currentValidRate` | 最新利率（%） |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `purchase_register_character_def` | `purchase_register_character_def` | `purchaseRegisterCharacterDef` | 申购登记自定义项 |

### other (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 申购登记自由自定义项 |
| `` | `` | `purchaseRegisterAccrualPlan` | 预提利息计划 |
| `` | `` | `purchaseRegisterAccrualPlanBackUp` | 预提利息计划备份 |
| `` | `` | `purchaseRegisterCheckFlow` | 申购登记核算流 |
| `` | `` | `purchaseRegisterCheckFlowBackUp` | 申购登记核算流备份 |
| `` | `` | `purchaseRegisterCostFlow` | 申购登记费用明细 |
| `` | `` | `purchaseRegisterCustomRate` | 自定义利率 |
| `` | `` | `purchaseRegisterDebt` | 申购登记关联借据子表 |
| `` | `` | `purchaseRegisterFuLiZhuanCunRecord` | 申购登记复利转存记录 |
| `` | `` | `purchaseRegisterHistory` | 申购登记历史详情子表 |
| `` | `` | `purchaseRegisterRateChangeRecord` | 申购登记利率变更记录 |
| `` | `` | `purchaseRegisterReduction` | 申购登记减免信息子表 |
| `` | `` | `purchaseRegisterRelatedQuota` | 关联投资额度 |
| `` | `` | `purchaseRegister_cashflow` | 申购登记现金流 |
| `` | `` | `purchaseRegister_cashflowBackUp` | 申购登记现金流备份表 |
