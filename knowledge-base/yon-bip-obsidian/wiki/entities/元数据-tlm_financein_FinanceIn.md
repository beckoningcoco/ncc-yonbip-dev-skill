---
tags: [BIP, 元数据, 数据字典, tlm.financein.FinanceIn]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 融入登记 (`tlm.financein.FinanceIn`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_financein` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：`dfa1c2b0-94ea-450b-8ad6-3588bb90c1a3`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 融入登记 |
| 物理表 | `tlm_financein` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 339 个 |
| 子表 | 25 个 |
| 关联引用 | 82 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `financein_checkFlow` | `tlm.financein.FinanceIn_checkFlow` | composition |
| `financeinRateChangeRecord` | `tlm.financein.FinanceinRateChangeRecord` | composition |
| `financein_cashflow` | `tlm.financein.FinanceIn_cashflow` | composition |
| `financeInSuperviseAccount` | `tlm.financein.FinanceInSuperviseAccount` | composition |
| `financeInInvestors` | `tlm.financein.FinanceInInvestors` | composition |
| `customRate` | `tlm.financein.FinanceInCustomRate` | composition |
| `financeInCompoundInterest` | `tlm.financein.FinanceinCompoundInterest` | composition |
| `financeInnterestAdjustment` | `tlm.financein.FinanceInnterestAdjustment` | composition |
| `financein_db` | `tlm.financein.FinanceIn_db` | composition |
| `defines` | `tlm.financein.FinanceInDefine` | composition |
| `financeInDebtLock` | `tlm.financein.FinanceInDebtLock` | composition |
| `financeInChangeDetail` | `tlm.financein.FinanceInChangeDetail` | composition |
| `financeInUnderwriters` | `tlm.financein.FinanceInUnderwriters` | composition |
| `financeInLease` | `tlm.financein.FinanceInLease` | composition |
| `financein_sx` | `tlm.financein.FinanceIn_sx` | composition |
| `financeInTransactionFlow` | `tlm.financein.FinanceInTransactionFlow` | composition |
| `financeinCostFlow` | `tlm.financein.FinanceinCostFlow` | composition |
| `financeInChange` | `tlm.financein.FinanceInChange` | composition |
| `financeInDebt` | `tlm.financein.FinanceInDebt` | composition |
| `financeInPenaltyInterest` | `tlm.financein.FinanceinPenaltyInterest` | composition |
| `financeInMargin` | `tlm.financein.FinanceInMargin` | composition |
| `financeInWithholdingPlanBackUP` | `tlm.financein.FinanceInWithholdingPlanBackUP` | composition |
| `financeInPartners` | `tlm.financein.FinanceInPartners` | composition |
| `financeinReduction` | `tlm.financein.FinanceinReduction` | composition |
| `financeInWithholdingPlan` | `tlm.financein.FinanceInWithholdingPlan` | composition |

## 关联引用 (82个)

| 字段名 | 引用类型 |
|--------|---------|
| `fxcustomerBankAccount` | `aa_merchantbankref` |
| `fxfunctionalcurrency` | `` |
| `` | `` |
| `trading_market` | `` |
| `base_rate_type` | `tlm_interestrateRef` |
| `fxsupplierBankAccount` | `yssupplier.aa_vendorbankref` |
| `opposite_settle_currency` | `` |
| `accentity` | `ucf-org-center.bd_fundsorg_na` |
| `fxratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `agency_infuse_income_acc` | `` |
| `interest_currency` | `ucfbasedoc.bd_currencytenantref` |
| `capital_currency` | `ucfbasedoc.bd_currencytenantref` |
| `old_currency` | `ucfbasedoc.bd_currencytenantref` |
| `supplier` | `yssupplier.aa_vendor` |
| `fi_define_character_def` | `` |
| `fxinterestbeartranscurrency` | `` |
| `last_withholding` | `` |
| `rrsupplierBankAccount` | `yssupplier.aa_vendorbankref` |
| `tenant_id` | `` |
| `cashflowplanbackup` | `` |
| `cashflowplan` | `tlm_financingregister_cashflowRef` |
| `agency_interest_acc` | `` |
| `cost_center` | `` |
| `financeApply_id` | `tlm_financeapplyRef` |
| `rrcustomerBankAccount` | `aa_merchantbankref` |
| `settlement_currency` | `` |
| `last_balance_settlement` | `` |
| `origin_id_bak` | `` |
| `agency_output_currency` | `` |
| `pay_currency` | `ucfbasedoc.bd_currencytenantref` |
| `fxothertype_object` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobjbank_Ref` |
| `fxsettlemethod` | `aa_settlemethodref` |
| `dept_id` | `` |
| `profit_center` | `` |
| `fxourbankaccount` | `bd_enterprisebankacctref` |
| `interest_accid` | `bd_enterprisebankacctref` |
| `settlement_method` | `aa_settlemethodref` |
| `outlay_accid` | `bd_enterprisebankacctref` |
| `origin_id` | `tlm_financeinRef` |
| `last_balance_pay_interest` | `` |
| `manual_associate_purchase` | `tlm_purchaseregisterRef` |
| `otherAccid` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobjbank_Ref` |
| `protocol_number` | `tlm_financingregisterRef` |
| `infuse_income_accid` | `bd_enterprisebankacctref` |
| `agency_settle_interest_acc` | `` |
| `ytenant_id` | `` |
| `associate_purchase` | `` |
| `accentity_raw` | `ucf-org-center.bd_financeorgtreeref_na` |
| `agency_income_acc` | `` |
| `bustype` | `bd_transtypelistref` |
| `exchangerate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `associate_purchase_change` | `` |
| `bond_type` | `tlm_bondclassdefinitionRef` |
| `fee_item` | `finbd.bd_expenseitemref` |
| `customer` | `productcenter.aa_merchantref` |

## 继承接口 (4个, 9字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
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

> 共 339 个直连字段

### 文本字段 (88个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `latest_version` | `latest_version` | `latestVersion` | 最新的版本号 |
| `other_account_input` | `other_account_input` | `otherAccountInput` | 本方银行账户 |
| `remark1` | `remark1` | `remark1` | 备用1 |
| `remark2` | `remark2` | `remark2` | 备用2 |
| `remark3` | `remark3` | `remark3` | 备用3 |
| `voucherNo` | `voucherNo` | `voucherNo` | 凭证号 |
| `accounting_docId` | `accounting_docId` | `accountingDocId` | 会计平台的凭证id |
| `change_version` | `change_version` | `changeVersion` | 版本号 |
| `financein_type` | `financein_type` | `financeInType` | 版本类型 |
| `born_source_system` | `born_source_system` | `bornSourceSystem` | 来源业务系统 |
| `born_source_type` | `born_source_type` | `bornSourceTyoe` | 来源业务单据 |
| `born_id` | `born_id` | `bornID` | 来源业务流水号 |
| `settled_addition` | `settled_addition` | `settledAddition` | 已结算补单 |
| `fx_settled_addition` | `fx_settled_addition` | `fxSettledAddition` | 已结算补单 |
| `assessment_period` | `assessment_period` | `assessmentPeriod` | 分摊周期 |
| `internal_acct_wr_date` | `internal_acct_wr_date` | `internalAcctWrDate` | 内部账写账日期 |
| `fxotheraccountname` | `fxotheraccountname` | `fxotherAccountName` | 对方账户名称 |
| `fxotherbankaccount` | `fxotherbankaccount` | `fxotherBankAccount` | 对方银行账号 |
| `fxotherbanktype` | `fxotherbanktype` | `fxotherBankType` | 对方账户银行类别 |
| `fxotheropenaccountbank` | `fxotheropenaccountbank` | `fxotherOpenAccountBank` | 对方账户开户行 |
| `fxotheraccountunitbanknum` | `fxotheraccountunitbanknum` | `fxotherAccountUnitBankNum` | 对方账户联行号 |
| `contract_type` | `contract_type` | `contractType` | 担保方式 |
| `allow_loan` | `allow_loan` | `allowLoan` | 允许内部借贷:yes/no |
| `capital_source` | `capital_source` | `capitalSource` | 资金来源 |
| `entry_time` | `entry_time` | `entryTime` | 入账时机 |
| `payfee_id` | `payfee_id` | `payfeeID` | 生成付费单id |
| `netIdentificateCode` | `netIdentificateCode` | `netIdentificateCode` | 轧差识别码 |
| `source_type` | `source_type` | `sourcetype` | 上游类型 |
| `month_wh_adjust_date` | `month_wh_adjust_date` | `monthWithHoldingAdjustDate` | 月末日期调整(预提) |
| `use_overdue` | `use_overdue` | `useOverdue` | 是否启用逾期 |
| `is_penalty` | `is_penalty` | `isPenalty` | 是否计算罚息 |
| `is_compound_interest` | `is_compound_interest` | `isCompoundInterest` | 是否计算复利 |
| `pre_debt_status` | `pre_debt_status` | `predebtstatus` | 上次借据状态 |
| `change_voucher_code` | `change_voucher_code` | `changeVoucherCode` | 变更单据编码 |
| `change_voucher_type` | `change_voucher_type` | `changeVoucherType` | 变更单据类型 |
| `repay_type` | `repay_type` | `repayType` | 偿还类型 |
| `auto_extension_term_unit` | `auto_extension_term_unit` | `autoExtensionTermUnit` | 期限单位 |
| `cf_beforebusiness_type` | `cf_beforebusiness_type` | `cfBeforeBusinessType` | 备份上个写现金流的业务类型 |
| `cf_business_type` | `cf_business_type` | `cfBusinessType` | 上个写现金流的业务类型 |
| `change_debtcode` | `change_debtcode` | `changeDebtCode` | 变更借据号 |
| `change_reason` | `change_reason` | `changeReason` | 变更原因 |
| `settlementId` | `settlementId` | `settlementId` | 结算单id |
| `settlementNo` | `settlementNo` | `settlementNo` | 结算单号 |
| `settlementbId` | `settlementbId` | `settlementbId` | 结算明细id |
| `unsettlementId` | `unsettlementId` | `unsettlementId` | 待结算id |
| `vouvher_status` | `vouvher_status` | `vouvherstatus` | 单据状态 |
| `if_direct_Connection` | `if_direct_Connection` | `ifDirectConnection` | 是否直连 |
| `` | `code` | `code` | 申请编号 |
| `initialization` | `initialization` | `initialization` | 是否期初 |
| `debtcode` | `debtcode` | `debtcode` | 借据号 |
| `bill_effective_time` | `bill_effective_time` | `billEffectiveTime` | 单据生效时机 |
| `is_effective` | `is_effective` | `isEffective` | 是否生效 |
| `manual_associate` | `manual_associate` | `manualAssociate` | 人工关联 |
| `term` | `term` | `financeinterm` | 融入期限 |
| `loan_interest_rate` | `loan_interest_rate` | `loanInterestRate` | 贷款利率管理id |
| `interestRateValues` | `interestRateValues` | `interestRateValues` | 现金流引用利率值集合 |
| `debtstatus` | `debtstatus` | `debtstatus` | 借据状态 |
| `endReason` | `endReason` | `endReason` | 结束原因 |
| `register_creat_flag` | `register_creat_flag` | `registerCreatFlag` | 是否融资自动生成 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `month_adjust_date` | `month_adjust_date` | `monthAdjustDate` | 月末日期调整(还本) |
| `` | `auditor` | `auditor` | 审批人 |
| `interes_base` | `interes_base` | `interesBase` | 提前还本计息基数 |
| `month_interest_adjust_date` | `month_interest_adjust_date` | `monthInterestAdjustDate` | 月末日期调整(计息) |
| `normal_interes_base` | `normal_interes_base` | `normalInteresBase` | 正常还本计息基数 |
| `included_expiration_date` | `included_expiration_date` | `includedExpirationDate` | 是否含到期日 |
| `xyzotherbankaccount` | `xyzotherbankaccount` | `xyzotherBankAccount` | 对方银行账号 |
| `xyzotheraccountname` | `xyzotheraccountname` | `xyzotherAccountName` | 对方账户名称 |
| `xyzotheropenaccountbank` | `xyzotheropenaccountbank` | `xyzotherOpenAccountBank` | 对方账户开户行 |
| `fxsettlestatus` | `fxsettlestatus` | `fxsettleStatus` | 结算状态 |
| `fxothertype` | `fxothertype` | `fxotherType` | 对方类型 |
| `modifyStatus` | `modifyStatus` | `modifyStatus` | 协同后是否有修改 |
| `isRelateCheckBill` | `isRelateCheckBill` | `isRelateCheckBill` | 是否关联对账单 |
| `associated_bank_statements` | `associated_bank_statements` | `associatedBankStatements` | 关联银行对账单id |
| `associated_claim_form` | `associated_claim_form` | `associatedClaimForm` | 关联认领单id |
| `bank_transaction_num` | `bank_transaction_num` | `bankTransactionNum` | 银行交易流水号 |
| `incorporation_num` | `incorporation_num` | `incorporationNum` | 财资统一对账码 |
| `settle_param` | `settle_param` | `settleParam` | 结算集成参数 |
| `postscript_info` | `postscript_info` | `postscriptInfo` | 附言 |
| `abstract_info` | `abstract_info` | `abstractInfo` | 用途 |
| `purchaseMethod` | `purchaseMethod` | `purchaseMethod` | 申购方式 |
| `third_name` | `third_name` | `thirdName` | 对方银行名称 |
| `third_account` | `third_account` | `thirdAccout` | 对方银行账号 |
| `third_banktype` | `third_banktype` | `thirdBanktype` | 对方账户名称 |
| `third_number` | `third_number` | `thirdNumber` | 对方账户开户行 |
| `financein_create_method` | `financein_create_method` | `financeinCreateMethod` | 生成方式 |
| `sync_msg` | `sync_msg` | `syncMsg` | 协同失败原因 |

### 引用字段 (56个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fxfunctionalcurrency` | `fxfunctionalcurrency` | `fxfunctionalCurrency` | 本币币种 |
| `fxinterestbeartranscurrency` | `fxinterestbeartranscurrency` | `fxinterestBearTransCurrency` | 计息交易币种 |
| `origin_id_bak` | `origin_id_bak` | `originIdBak` | 备份单据关联的变更单 |
| `associate_purchase` | `associate_purchase` | `associatePurchase` | 协同到申购后申购的id |
| `` | `auditorId` | `auditorId` | 审批人 |
| `cashflowplanbackup` | `cashflowplanbackup` | `cashflowplanbackup` | 现金流计划备份 |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `associate_purchase_change` | `associate_purchase_change` | `associatePurchaseChange` | 协同到申购变更后申购变更的id |
| `trading_market` | `trading_market` | `tradingMarket` | 交易市场 |
| `agency_output_currency` | `agency_output_currency` | `agencyOutputCurrency` | 代理收入账户币种 |
| `opposite_settle_currency` | `opposite_settle_currency` | `oppositeSettleCurrency` | 对方结算币种 |
| `last_withholding` | `last_withholding` | `lastWithholding` | 上次预提 |
| `last_balance_settlement` | `last_balance_settlement` | `lastBalanceSettlement` | 上次余额结息 |
| `last_balance_pay_interest` | `last_balance_pay_interest` | `lastBalancePayInterest` | 上次余额付息 |
| `settlement_currency` | `settlement_currency` | `settlementCurrency` | 结算币种 |
| `dept_id` | `dept_id` | `deptid` | 部门 |
| `cost_center` | `cost_center` | `costCenter` | 成本中心 |
| `profit_center` | `profit_center` | `profitCenter` | 利润中心 |
| `agency_income_acc` | `agency_income_acc` | `agencyIncomeAcc` | 代理收入账户 |
| `agency_interest_acc` | `agency_interest_acc` | `agencyInterestAcc` | 代理付息账户 |
| `agency_infuse_income_acc` | `agency_infuse_income_acc` | `agencyInfuseIncomeAcc` | 代理收入账户 |
| `agency_settle_interest_acc` | `agency_settle_interest_acc` | `agencySettleInterestAcc` | 代理付息账户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `origin_id` | `origin_id` | `originId` | 融入协议id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `infuse_income_accid` | `infuse_income_accid` | `infuseIncomeAccid` | 收入账户 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `accentity` | `accentity` | `accentity` | 资金组织 |
| `supplier` | `supplier` | `supplier` | 供应商id |
| `customer` | `customer` | `customer` | 客户id |
| `protocol_number` | `protocol_number` | `protocolNumber` | 融资协议id |
| `cashflowplan` | `cashflowplan` | `cashflowplan` | 现金流计划ID |
| `fee_item` | `fee_item` | `feeItem` | 付费项目id |
| `base_rate_type` | `base_rate_type` | `baseRateType` | 基准利率类型ID |
| `financeApply_id` | `financeApply_id` | `financeApplyID` | 融入申请ID |
| `capital_currency` | `capital_currency` | `capitalCurrency` | 本金币种id |
| `old_currency` | `old_currency` | `oldcurrency` | 本币币种ID |
| `exchangerate_type` | `exchangerate_type` | `exchangerateType` | 本币币种汇率类型ID |
| `settlement_method` | `settlement_method` | `settlementMethod` | 结算方式ID |
| `bustype` | `bustype` | `bustype` | 交易类型id |
| `outlay_accid` | `outlay_accid` | `outlayAccid` | 支出账户id |
| `otherAccid` | `otherAccid` | `otherAccid` | 对方账户名称id |
| `fxratetype` | `fxratetype` | `fxrateType` | 汇率类型id |
| `fxsettlemethod` | `fxsettlemethod` | `fxsettleMethod` | 结算方式id |
| `fxothertype_object` | `fxothertype_object` | `fxotherTypeObject` | 对方账户名称id |
| `manual_associate_purchase` | `manual_associate_purchase` | `manualassociatePurchase` | 协同申购ID |
| `interest_currency` | `interest_currency` | `interestCurrency` | 计息币种id |
| `rrsupplierBankAccount` | `rrsupplierBankAccount` | `rrsupplierBankAccount` | 供应商账户名称id |
| `interest_accid` | `interest_accid` | `interestAccid` | 计息账户id |
| `pay_currency` | `pay_currency` | `payCurrency` | 付费币种id |
| `rrcustomerBankAccount` | `rrcustomerBankAccount` | `rrcustomerBankAccount` | 客户银行账号id |
| `fxsupplierBankAccount` | `fxsupplierBankAccount` | `fxsupplierBankAccount` | 供应商账户名称id |
| `bond_type` | `bond_type` | `bondType` | 债券类别ID |
| `fxcustomerBankAccount` | `fxcustomerBankAccount` | `fxcustomerBankAccount` | 客户银行账号id |
| `fxourbankaccount` | `fxourbankaccount` | `fxourBankAccount` | 本方银行账户id |

### 日期字段 (27个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `amortized_cost_update_date` | `amortized_cost_update_date` | `amortizedCostUpdateDate` | 摊余成本更新日期 |
| `first_financeinexpire_date` | `first_financeinexpire_date` | `firstfinanceinexpireDate` | 融入到期日期(初始) |
| `change_date` | `change_date` | `changeDate` | 变更日期 |
| `apportion_begin_date` | `apportion_begin_date` | `apportionBeginDate` | 分摊开始日期 |
| `apportion_end_date` | `apportion_end_date` | `apportionEndDate` | 分摊结束日期 |
| `first_assessment_date` | `first_assessment_date` | `firstAssessmentDate` | 首次分摊日 |
| `interest_rate_date` | `interest_rate_date` | `interestRateDate` | 初始利率日期 |
| `settlementDate` | `settlementDate` | `settlementDate` | 单结算日期 |
| `first_repayment_date` | `first_repayment_date` | `firstRepaymentDate` | 首次还款日 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `financeindate` | `financeindate` | `financeindate` | 融入日期 |
| `first_effect_date` | `first_effect_date` | `firstEffectDate` | 利率调整首次生效日 |
| `first_payment_date` | `first_payment_date` | `firstPaymentDate` | 首次付息日 |
| `financeinexpire_date` | `financeinexpire_date` | `financeinexpireDate` | 融入到期日期 |
| `last_fx_date` | `last_fx_date` | `lastfxdate` | 期初付息日 |
| `last_hb_date` | `last_hb_date` | `lasthbdate` | 期初还本日 |
| `exhibition_period_end_date` | `exhibition_period_end_date` | `exhibitionPeriodEndDate` | 展期后到期日 |
| `endDate` | `endDate` | `endDate` | 结束日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `redempdate` | `redempdate` | `redemdate` | 赎回日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `advance_date` | `advance_date` | `advanceDate` | 预付本金日期 |
| `fxbegindate` | `fxbegindate` | `fxbegindate` | 付息起息日 |
| `fxenddate` | `fxenddate` | `fxenddate` | 付息止息日 |
| `first_accrual_date` | `first_accrual_date` | `firstAccrualDate` | 首次预提利息日 |
| `withholding_interest_date` | `withholding_interest_date` | `withholdingInterestDate` | 预提起息日 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isWfControlled` | `isWfControlled` | 审批流控制 |

### 枚举字段 (34个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `interest_days` | `interest_days` | `interestDays` | 计息天数 |
| `allocation_type` | `allocation_type` | `allocationType` | 费用分摊类型 |
| `release_budget` | `release_budget` | `releaseBudget` | 释放预算 |
| `transaction_association_method` | `transaction_association_method` | `transactionAssociationMethod` | 流水关联方式 |
| `is_support_settle_center` | `is_support_settle_center` | `isSupportSettleCenter` | 是否集成结算中心 |
| `is_freeze_inner_account` | `is_freeze_inner_account` | `isFreezeInnerAccount` | 是否冻结内部账户 |
| `overdue_auto_extension` | `overdue_auto_extension` | `overdueAutoExtension` | 逾期自动展期 |
| `year_month_day` | `year_month_day` | `yearMonthDay` | 年/月/日利率 |
| `repayment_type` | `repayment_type` | `repaymentType` | 还款方式 |
| `repayment_cycle` | `repayment_cycle` | `repaymentCycle` | 还款周期 |
| `interest_rate_type` | `interest_rate_type` | `interestRateType` | 利率类型 |
| `holiday_interest_principle` | `holiday_interest_principle` | `holidayInterestPrinciple` | 节假日计息原则 |
| `rate_adjust_cycle` | `rate_adjust_cycle` | `rateAdjustCycle` | 利率调整周期 |
| `settlement_type` | `settlement_type` | `settlementType` | 结息方式 |
| `term_unit` | `term_unit` | `financeintermUnit` | 融入期限类型 |
| `settlement_cycle` | `settlement_cycle` | `settlementCycle` | 结息周期 |
| `term_type` | `term_type` | `termType` | 融资期限分类 |
| `float_type` | `float_type` | `floatType` | 浮动方式 |
| `exhibition_float_type` | `exhibition_float_type` | `exhibitionfloatType` | 展期浮动方式 |
| `expire_end_type` | `expire_end_type` | `expireEndType` | 到期结束方式 |
| `settlement_status` | `settlement_status` | `settlementStatus` | 结算状态 |
| `other_type` | `other_type` | `otherType` | 对方类型 |
| `more_Currency` | `more_Currency` | `moreCurrency` | 是否多币种贷款 |
| `period_head_tail` | `period_head_tail` | `periodHeadTail` | 周期首尾规则 |
| `interest_settlement_rule` | `interest_settlement_rule` | `interestSettlementRule` | 结息头尾规则 |
| `redemption_option` | `redemption_option` | `redemptionOption` | 是否有赎回选择权 |
| `pay_fee_same_time` | `pay_fee_same_time` | `payFeeSameTime` | 是否同时扣费 |
| `financeinMethod` | `financeinMethod` | `financeinMethod` | 融入方式 |
| `advance_principal` | `advance_principal` | `advancePrincipal` | 是否预付本金 |
| `accrual_period` | `accrual_period` | `accrualPeriod` | 预提利息周期 |
| `holiday_principle` | `holiday_principle` | `holidayPrinciple` | 节假日处理原则 |
| `trustee_pay_type` | `trustee_pay_type` | `trusteePayType` | 受托支付类型 |
| `withholding_rule` | `withholding_rule` | `withholdingRule` | 预提头尾规则 |
| `is_budget` | `is_budget` | `isBudget` | 是否占用预算 |

### 整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_new` | `is_new` | `isNew` | 是否新单据 |
| `grace_period` | `grace_period` | `gracePeriod` | 宽限期 |
| `auto_extension_term_num` | `auto_extension_term_num` | `autoExtensionTermNum` | 自动展期期限 |
| `version` | `version` | `version` | 版本号 |
| `term_number` | `term_number` | `financeintermNumber` | 融入期限 |

### 短整数 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `billtype` | `billtype` | `billtype` | 单据类型编码 |
| `exchangerate_ops` | `exchangerate_ops` | `exchangerateOps` | 本币币种汇率折算方式 |
| `fxrate_ops` | `fxrate_ops` | `fxrateOps` | 汇率折算方式 |
| `netSettleCount` | `netSettleCount` | `netSettleCount` | 轧差结算总笔数 |
| `afterNetDir` | `afterNetDir` | `afterNetDir` | 轧差后收付方向 |
| `` | `returncount` | `returncount` | 退回次数 |
| `send_sync` | `send_sync` | `sendSync` | 是否发起协同:1是0否 |
| `srcitem` | `srcitem` | `srcitem` | 来源系统编码 |
| `` | `status` | `status` | 单据状态 |
| `voucherstatus` | `voucherstatus` | `voucherstatus` | 凭证状态 |
| `audit_status` | `audit_status` | `auditstatus` | 单据状态 |
| `` | `verifystate` | `verifystate` | 审批状态 |

### 长整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cf_beforebusiness_id` | `cf_beforebusiness_id` | `cfBeforeBusinessId` | 备份上个写现金流的业务id |
| `filesCount` | `filesCount` | `filesCount` | 附件数 |
| `change_voucher_id` | `change_voucher_id` | `changeVoucherId` | 变更单据Id |
| `cf_business_id` | `cf_business_id` | `cfBusinessId` | 上个写现金流的业务id |
| `` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | ID |

### 数值字段 (79个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fxinterestcontractedrate` | `fxinterestcontractedrate` | `fxinterestContractedRate` | 利息约定汇率 |
| `realownPayAmountBB` | `realownPayAmountBB` | `realownPayAmountBB` | 实际收款金额(本币币种) |
| `realownPayAmountBJ` | `realownPayAmountBJ` | `realownPayAmountBJ` | 实际收款金额(本金币种) |
| `capital_exchange_rate` | `capital_exchange_rate` | `capitalExchangeRate` | 本金约定汇率 |
| `current_valid_rate` | `current_valid_rate` | `currentValidRate` | 最新利率(%) |
| `afterNetAmt` | `afterNetAmt` | `afterNetAmt` | 轧差后金额 |
| `penalty_float_percent` | `penalty_float_percent` | `penaltyFloatPercent` | 罚息上浮比例(%) |
| `penalty_rate` | `penalty_rate` | `penaltyRate` | 罚息利率(%) |
| `compound_float_percent` | `compound_float_percent` | `compoundFloatPercent` | 复利上浮比例(%) |
| `compound_rate` | `compound_rate` | `compoundRate` | 复利利率(%) |
| `initial_repayment_amt_bj` | `initial_repayment_amt_bj` | `initialRepaymentAmtBJ` | 期初已还本金额(本金币种) |
| `initial_repayment_amt_xy` | `initial_repayment_amt_xy` | `initialRepaymentAmtXY` | 期初已还本金额(协议币种) |
| `initial_interest_amt_jx` | `initial_interest_amt_jx` | `initialInterestAmtJX` | 期初已付息金额(计息币种) |
| `initial_interest_amt_xy` | `initial_interest_amt_xy` | `initialInterestAmtXY` | 期初已付息金额(协议币种) |
| `wt_amt_int_ccy` | `wt_amt_int_ccy` | `wtAmtIntCcy` | 已预提金额(计息币种) |
| `un_wt_amt_int_ccy` | `un_wt_amt_int_ccy` | `unWtAmtTntCcy` | 未核销预提金额(计息币种) |
| `init_wt_amt_int_ccy` | `init_wt_amt_int_ccy` | `initWtAmtIntCcy` | 期初已预提金额(计息币种) |
| `init_un_wt_amt_int_ccy` | `init_un_wt_amt_int_ccy` | `initUnWtAmtIntCcy` | 期初未核销预提金额(计息币种) |
| `underwriting_rate` | `underwriting_rate` | `underwritingRate` | 承销费率(%) |
| `appoint_rate` | `appoint_rate` | `appointRate` | 利息约定汇率 |
| `financeinamount` | `financeinamount` | `financeinamount` | 融入金额(协议币种) |
| `base_rate` | `base_rate` | `baserate` | 基准利率(%) |
| `reservation_price` | `reservation_price` | `reservationPrice` | 留购价款 |
| `float_value` | `float_value` | `floatValue` | 浮动值 |
| `debt_rate` | `debt_rate` | `debtRate` | 借据利率(%) |
| `repaid_amount` | `repaid_amount` | `repaidAmount` | 已还本金额 |
| `pay_interest_amount` | `pay_interest_amount` | `payInterestAmount` | 已付息金额 |
| `debtbalance` | `debtbalance` | `debtbalance` | 借据余额 |
| `exhibition_period_amount` | `exhibition_period_amount` | `exhibitionPeriodAmount` | 展期金额 |
| `exhibition_float_value` | `exhibition_float_value` | `exhibitionfloatValue` | 展期浮动值 |
| `exhibition_rate` | `exhibition_rate` | `exhibitionRate` | 展期利率 |
| `financeinnatoriginAmount` | `financeinnatoriginAmount` | `financeinnatoriginAmount` | 融入金额(本金币种) |
| `exchangerate` | `exchangerate` | `exchangerate` | 本币币种汇率 |
| `financeinnatlocalAmount` | `financeinnatlocalAmount` | `financeinnatlocalAmount` | 融入金额(本币币种) |
| `firealnatoriginAmount` | `firealnatoriginAmount` | `firealnatoriginAmount` | 实际收款金额(本金币种) |
| `fireallocalAmount` | `fireallocalAmount` | `fireallocalAmount` | 实际收款金额(本币币种) |
| `issue_num` | `issue_num` | `issueNum` | 发行数量 |
| `issue_unit_price` | `issue_unit_price` | `issueunitPrice` | 发行价格 |
| `realInAmountXYWhenNum` | `realInAmountXYWhenNum` | `realInAmountXYWhenNum` | 实际融入金额(协议币种) |
| `tobeamortizedXYWhenNum` | `tobeamortizedXYWhenNum` | `tobeamortizedXYWhenNum` | 需摊销费用(协议币种) |
| `amortized_cost` | `amortized_cost` | `amortizedCost` | 摊余成本 |
| `amortized_cost_first` | `amortized_cost_first` | `amortizedCostFirst` | 摊余成本 |
| `underwriting_amount` | `underwriting_amount` | `underwritingAmount` | 承销费(协议币种) |
| `realInAmountBJWhenNum` | `realInAmountBJWhenNum` | `realInAmountBJWhenNum` | 实际融入金额(本金币种) |
| `tobeamortizedBJWhenNum` | `tobeamortizedBJWhenNum` | `tobeamortizedBJWhenNum` | 需摊销费用(本金币种) |
| `ownPayAmountBJ` | `ownPayAmountBJ` | `ownPayAmountBJ` | 自主支付金额(本金币种) |
| `trusteePayAmountBJ` | `trusteePayAmountBJ` | `trusteePayAmountBJ` | 受托支付金额(本金币种) |
| `ownPayAmountBB` | `ownPayAmountBB` | `ownPayAmountBB` | 自主支付金额(本币币种) |
| `settlement_total_amount` | `settlement_total_amount` | `settlementTotalAmount` | 已结息金额 |
| `realInAmountBBWhenNum` | `realInAmountBBWhenNum` | `realInAmountBBWhenNum` | 实际融入金额(本币币种) |
| `settlement_nopay_amount` | `settlement_nopay_amount` | `settlementNoPayAmount` | 已结未付利息 |
| `trusteePayAmountBB` | `trusteePayAmountBB` | `trusteePayAmountBB` | 受托支付金额(本币币种) |
| `tobeamortizedBBWhenNum` | `tobeamortizedBBWhenNum` | `tobeamortizedBBWhenNum` | 需摊销费用(本币币种) |
| `advance_amount` | `advance_amount` | `advanceAmount` | 预付本金(协议币种) |
| `can_loan_amount` | `can_loan_amount` | `canLoanAmount` | 可用金额 |
| `fxtradeamount` | `fxtradeamount` | `fxtradeAmount` | 付息金额(计息币种) |
| `lock_amount` | `lock_amount` | `lockAmount` | 已锁定金额 |
| `fxamountxy` | `fxamountxy` | `fxamountxy` | 付息金额(协议币种) |
| `repaid_amount_bj` | `repaid_amount_bj` | `repaidAmountBJ` | 已还本金额(本金币种) |
| `fxrate` | `fxrate` | `fxrate` | 汇率 |
| `fxfunctionalcurrencyamount` | `fxfunctionalcurrencyamount` | `fxfunctionalCurrencyAmount` | 付息金额(本币币种) |
| `pay_interest_amount_jx` | `pay_interest_amount_jx` | `payInterestAmountJX` | 已付息金额(计息币种) |
| `settlement_total_amount_jx` | `settlement_total_amount_jx` | `settlementTotalAmountJX` | 已结息金额(计息币种) |
| `real_accrual_rate` | `real_accrual_rate` | `realAccrualRate` | 实际利率(%) |
| `reduce_principal_amount` | `reduce_principal_amount` | `reducePrincipalAmount` | 减免本金 |
| `vf_reduce_principal_amount` | `vf_reduce_principal_amount` | `vfReducePrincipalAmount` | 已核销减免本金 |
| `settlement_nopay_amount_jx` | `settlement_nopay_amount_jx` | `settlementNoPayAmountJX` | 已结未付利息(计息币种) |
| `reduce_interest_amount` | `reduce_interest_amount` | `reduceInterestAmount` | 减免利息 |
| `vf_reduce_interest_amount` | `vf_reduce_interest_amount` | `vfReduceInterestAmount` | 已核销减免利息 |
| `debtbalance_bj` | `debtbalance_bj` | `debtbalanceBJ` | 借据余额(本金币种) |
| `reduce_principal_amount_bj` | `reduce_principal_amount_bj` | `reducePrincipalAmountBJ` | 减免本金(本金币种) |
| `vf_reduce_principal_amount_bj` | `vf_reduce_principal_amount_bj` | `vfReducePrincipalAmountBJ` | 已核销减免本金(本金币种) |
| `reduce_interest_amount_jx` | `reduce_interest_amount_jx` | `reduceInterestAmountJX` | 减免利息(计息币种) |
| `vf_reduce_interest_amount_jx` | `vf_reduce_interest_amount_jx` | `vfReduceInterestAmountJX` | 已核销减免利息(计息币种) |
| `advance_amount_bj` | `advance_amount_bj` | `advanceAmountBJ` | 预付本金(本金币种) |
| `underwriting_amount_capital` | `underwriting_amount_capital` | `underwritingAmountCapital` | 承销费(付费币种) |
| `underwriting_amount_local` | `underwriting_amount_local` | `underwritingAmountLocal` | 承销费(本币币种) |
| `tjtd_in_use_amount` | `tjtd_in_use_amount` | `tjtdInUseAmount` | 已占用金额(协议币种) |
| `tjtd_release_amount` | `tjtd_release_amount` | `tjtdReleaseAmount` | 已释放金额(协议币种) |

### timestamp (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `relate_check_bill_pubts` | `relate_check_bill_pubts` | `relateCheckBillpubts` | 银行对账单时间戳 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fi_define_character_def` | `fi_define_character_def` | `fiDefineCharacterDef` | 融入登记特征自定义项 |

### other (25个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `customRate` | 自定义利率 |
| `` | `` | `defines` | 融入登记自由自定义项 |
| `` | `` | `financeInChange` | 融入变更记录表 |
| `` | `` | `financeInChangeDetail` | 融入登记变更明细 |
| `` | `` | `financeInCompoundInterest` | 融入登记复利浮动记录 |
| `` | `` | `financeInDebt` | 融入登记关联借据 |
| `` | `` | `financeInDebtLock` | 融入登记余额锁定记录 |
| `` | `` | `financeInInvestors` | 投资人子表 |
| `` | `` | `financeInLease` | 融入登记租赁物 |
| `` | `` | `financeInMargin` | 融入登记关联保证金 |
| `` | `` | `financeInPartners` | 合作机构子表 |
| `` | `` | `financeInPenaltyInterest` | 融入登记罚息浮动记录 |
| `` | `` | `financeInSuperviseAccount` | 承销商子表 |
| `` | `` | `financeInTransactionFlow` | 交易进度表 |
| `` | `` | `financeInUnderwriters` | 监管账户子表 |
| `` | `` | `financeInWithholdingPlan` | 融入利息摊销表 |
| `` | `` | `financeInWithholdingPlanBackUP` | 融入利息摊销备份表 |
| `` | `` | `financeInnterestAdjustment` | 融入登记利息调整生效日期 |
| `` | `` | `financeinCostFlow` | 融入登记费用明细 |
| `` | `` | `financeinRateChangeRecord` | 借据利率变更记录 |
| `` | `` | `financeinReduction` | 融入登记减免信息子表 |
| `` | `` | `financein_cashflow` | 融入登记现金流 |
| `` | `` | `financein_checkFlow` | 融入核算流 |
| `` | `` | `financein_db` | 融入登记关联担保 |
| `` | `` | `financein_sx` | 融入登记关联授信 |
