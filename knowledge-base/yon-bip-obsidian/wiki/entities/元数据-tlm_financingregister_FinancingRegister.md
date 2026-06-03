---
tags: [BIP, 元数据, 数据字典, tlm.financingregister.FinancingRegister]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 金融合同 (`tlm.financingregister.FinancingRegister`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_financingregister` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：`ae745468-3f3b-4b36-bf18-4ea1dc727a4f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 金融合同 |
| 物理表 | `tlm_financingregister` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 586 个 |
| 子表 | 35 个 |
| 关联引用 | 142 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `financingRegisterCashFlow` | `tlm.financingregister.FinancingRegisterCashFlow` | composition |
| `financingRegisterContract` | `tlm.financingregister.FinancingRegisterContract` | composition |
| `customRate` | `tlm.financingregister.FinancingRegisterCustomRate` | composition |
| `financingRegisterInquiry` | `tlm.financingregister.FinancingRegisterInquiry` | composition |
| `financingRegisterAgreement` | `tlm.financingregister.FinancingRegisterAgreement` | composition |
| `financingRegisterIBpmCurrentAuditor` | `tlm.financingregister.FinancingRegisterIBpmCurrentAuditor` | composition |
| `financingRegisterIBpmStep` | `tlm.financingregister.FinancingRegisterIBpmStep` | composition |
| `financingRegisterInvestor` | `tlm.financingregister.FinancingRegisterInvestor` | composition |
| `financingRegisterMargin` | `tlm.financingregister.FinancingRegisterMargin` | composition |
| `financingRegisterChangeDetail` | `tlm.financingregister.FinancingRegisterChangeDetail` | composition |
| `financingRegisterUnderwriter` | `tlm.financingregister.FinancingRegisterUnderwriter` | composition |
| `financingRegisterInterestAdjustment` | `tlm.financingregister.FinancingRegisterInterestAdjustment` | composition |
| `financingRegisterRepaymentPlan` | `tlm.financingregister.FinancingRegisterRepaymentPlan` | composition |
| `financingRegisterPartner` | `tlm.financingregister.FinancingRegisterPartner` | composition |
| `financingRegisterInterestCurrency` | `tlm.financingregister.FinancingRegisterInterestCurrency` | composition |
| `financingRegisterCustodyInstitution` | `tlm.financingregister.FinancingRegisterCustodyInstitution` | composition |
| `financingRegisterSyndicated` | `tlm.financingregister.FinancingRegisterSyndicated` | composition |
| `financingRegisterQuota` | `tlm.financingregister.FinancingRegisterQuota` | composition |
| `financingRegisterCurrency` | `tlm.financingregister.FinancingRegisterCurrency` | composition |
| `financingRegisterLease` | `tlm.financingregister.FinancingRegisterLease` | composition |
| `financingRegisterWithholdingPlan` | `tlm.financingregister.FRWithholdingPlan` | composition |
| `financingRegisterCostFlow` | `tlm.financingregister.FinancingRegisterCostFlow` | composition |
| `financingRegisterProperty` | `tlm.financingregister.FinancingRegisterProperty` | composition |
| `financingRegisterRelatedBusiness` | `tlm.financingregister.FinancingRegisterRelatedBusiness` | composition |
| `financingRegisterCostSchema` | `tlm.financingregister.FinancingRegisterCostSchema` | composition |
| `financingRegisterProtocol` | `tlm.financingregister.FinancingRegisterProtocol` | composition |
| `financingRegisterSuperviseAccount` | `tlm.financingregister.FinancingRegisterSuperviseAccount` | composition |
| `financingRegisterRiskClause` | `tlm.financingregister.FinancingRegisterRiskClause` | composition |
| `financingRegisterRateChangeRecord` | `tlm.financingregister.FinancingRegisterRateChangeRecord` | composition |
| `investmentRegisterCheckFlow` | `tlm.financingregister.InvestmentRegisterCheckFlow` | composition |
| `principalAmortizationPlan` | `tlm.financingregister.PrincipalAmortizationPlan` | composition |
| `financingRegisterReduction` | `tlm.financingregister.FinancingRegisterReduction` | composition |
| `financingRegisterGuarantee` | `tlm.financingregister.FinancingRegisterGuarantee` | composition |
| `registerRelatedQuota` | `tlm.financingregister.RegisterRelatedQuota` | composition |
| `financingRegisterDebt` | `tlm.financingregister.FinancingRegisterDebt` | composition |

## 关联引用 (142个)

| 字段名 | 引用类型 |
|--------|---------|
| `interest_settlemethod` | `` |
| `financing_org_bank` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `agency_interest_currency` | `` |
| `` | `` |
| `wbs` | `` |
| `opposite_settle_currency` | `` |
| `accentity` | `ucf-org-center.bd_fundsorg_na` |
| `near_sold_currency` | `` |
| `near_denomination_currency` | `` |
| `creditapply` | `` |
| `fundBusinessObject` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobjbank_Ref` |
| `capital_currency` | `bd_currencytenantreflist` |
| `supplier` | `` |
| `property` | `yonbip-fi-ctmgrm.grm_propertyrightref` |
| `settleSupplierBankAccount` | `` |
| `tenant_id` | `` |
| `agreement` | `` |
| `agency_interest_acc` | `` |
| `cost_center` | `` |
| `convertible_currency` | `bd_currencytenantreflist` |
| `trade_category` | `tlm_futurestradingvarietyRef` |
| `interest_collection_accid` | `` |
| `out_near_sold_currency` | `` |
| `investment_apply` | `` |
| `relation_past_protocol` | `tlm_investmentregisterRef` |
| `bond_class` | `` |
| `margin_currency` | `bd_currencytenantreflist` |
| `exchange_currency_in` | `` |
| `activity` | `` |
| `agency_outlay_acc` | `` |
| `dept_id` | `` |
| `interest_accid` | `bd_enterprisebankacctref` |
| `out_near_purchase_currency` | `` |
| `outlay_accid` | `bd_enterprisebankacctref` |
| `income_currency` | `` |
| `infuse_income_accid` | `bd_enterprisebankacctref` |
| `project_id` | `` |
| `old_currency` | `bd_currencytenantreflist` |
| `expense_out_account_local_in` | `` |
| `output_currency` | `` |
| `settleCustomerBankAccount` | `` |
| `settle_local_currency` | `bd_currencytenantreflist` |
| `infuse_capital_currency` | `bd_currencytenantreflist` |
| `agency_income_currency` | `` |
| `agency_settle_interest_acc` | `` |
| `financing_apply` | `` |
| `fr_define_character` | `` |
| `debtId` | `` |
| `contract_type_id` | `` |
| `exchange_currency_out` | `` |
| `change_with_primary` | `tlm_financingregisterRef` |
| `base_interest_rate_type_out` | `` |
| `trustee` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `expense_account_out` | `` |
| `fee_item` | `` |
| `marginaccid` | `bd_enterprisebankacctref` |
| `inCustomerBankAccount` | `` |
| `inSupplierBankAccount` | `` |
| `trading_market` | `` |
| `base_rate_type` | `tlm_interestrateRef` |
| `sc_amount` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobjbank_Ref` |
| `exchange_rate_type_out` | `` |
| `near_purchase_currency` | `` |
| `financial_product` | `tlm_financialProductRef` |
| `agency_infuse_income_acc` | `` |
| `interest_currency` | `bd_currencytenantreflist` |
| `denomination_currency` | `` |
| `interest_acc_currency` | `` |
| `relation_cash_flow` | `tlm_investmentregister_cashflowRef` |
| `settle_local_accid` | `bd_enterprisebankacctref` |
| `related_purchase` | `` |
| `income_accid` | `bd_enterprisebankacctref` |
| `interest_cash_flow` | `` |
| `protocol_currency` | `bd_currencytenantreflist` |
| `agency_settle_acc_currency` | `` |
| `agency_output_currency` | `` |
| `out_near_denomination_currency` | `` |
| `local_accid` | `bd_enterprisebankacctref` |
| `relation_next_protocol` | `tlm_investmentregisterRef` |
| `pay_currency` | `` |
| `asset_specific_plan` | `` |
| `infuse_income_currency` | `` |
| `base_interest_rate_type_in` | `` |
| `exchange_rate_type_in` | `` |
| `scheme_number` | `` |
| `profit_center` | `` |
| `settlement_method` | `aa_settlemethodref` |
| `settle_interest_currency` | `bd_currencytenantreflist` |
| `bond_regist_ration` | `` |
| `settle_er_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `agency_infuse_income_currency` | `` |
| `related_protocol` | `` |
| `valuation_currency` | `` |
| `ytenant_id` | `` |
| `accentity_raw` | `ucf-org-center.bd_financeorgtreeref_na` |
| `agency_income_acc` | `` |
| `settle_js_method` | `aa_settlemethodref` |
| `contract_lib_id` | `` |
| `bus_type` | `bd_transtypelistref` |
| `exchange_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `fxsettle_acc_currency` | `` |
| `settle_other_id` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobjbank_Ref` |
| `customer` | `` |
| `regular_notify_acc` | `` |
| `sync_register` | `tlm_financingregisterRef` |

## 继承接口 (4个, 9字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``

## 字段列表（按类型分组）

> 共 586 个直连字段

### 文本字段 (187个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_be_pledged` | `is_be_pledged` | `isBePledged` | 是否被抵质押担保 |
| `local_acc_other` | `local_acc_other` | `localAccOther` | 本方银行账户 |
| `infuse_type` | `infuse_type` | `infuseType` | 融入方式 |
| `product_custodian` | `product_custodian` | `productCustodian` | 产品托管人 |
| `product_issuer` | `product_issuer` | `productIssuer` | 产品发行人 |
| `product_name` | `product_name` | `productName` | 产品名称 |
| `product_size` | `product_size` | `productSize` | 产品规模 |
| `settle_js_status` | `settle_js_status` | `settleJsStatus` | 结算状态 |
| `settle_other_type` | `settle_other_type` | `settleOtherType` | 对方类型 |
| `before_autoend_status` | `before_autoend_status` | `beforeAutoEndStatus` | 自动结束前的协议状态 |
| `before_expire_end_type` | `before_expire_end_type` | `beforeExpireEndType` | 自动结束前的到期结束方式 |
| `bak_protocol_status` | `bak_protocol_status` | `bakProtocolStatus` | 备份协议状态 |
| `settle_direction` | `settle_direction` | `settleDirection` | 结息发起方 |
| `assessment_period` | `assessment_period` | `assessmentPeriod` | 分摊周期 |
| `internal_acct_wr_date` | `internal_acct_wr_date` | `internalAcctWrDate` | 内部账写账日期 |
| `issue_invoice_event` | `issue_invoice_event` | `issueInvoiceEvent` | 开票事件 |
| `invoice_timing` | `invoice_timing` | `invoiceTiming` | 开票时机 |
| `settle_interest_first` | `settle_interest_first` | `settleInterestFirst` | 是否先结息再付息 |
| `rate_adjuster_direction` | `rate_adjuster_direction` | `rateAdjusterDirection` | 利息调整发起方 |
| `transfer_interest_rule` | `transfer_interest_rule` | `transferInterestRule` | 转存利率规则 |
| `other_name` | `other_name` | `otherName` | 对方账户名称 |
| `other_account` | `other_account` | `otherAccout` | 对方银行账号 |
| `other_banktype` | `other_banktype` | `otherBanktype` | 对方账户银行类别 |
| `other_number` | `other_number` | `otherNumber` | 对方账户联行号 |
| `other_bank` | `other_bank` | `otherBank` | 对方账户开户行 |
| `derivative_application_form` | `derivative_application_form` | `derivativeApplicationForm` | 衍生品申请单id |
| `derivative_application_form_no` | `derivative_application_form_no` | `derivativeApplicationFormNo` | 衍生品申请单编号 |
| `principal_exchange_method` | `principal_exchange_method` | `principalExchangeMethod` | 本金交换方式 |
| `delivery_frequency` | `delivery_frequency` | `deliveryFrequency` | 交割频率 |
| `credit_occupancy_method` | `credit_occupancy_method` | `creditOccupancyMethod` | 信用占用方式 |
| `transaction_method` | `transaction_method` | `transactionMethod` | 交易方式 |
| `apply_method` | `apply_method` | `applyMethod` | 申请方式 |
| `interest_rate_type_in` | `interest_rate_type_in` | `interestRateTypeIn` | 利率类型 |
| `interest_accrual_days_in` | `interest_accrual_days_in` | `interestAccrualDaysIn` | 计息天数 |
| `interest_settlement_rule_in` | `interest_settlement_rule_in` | `interestSettlementRuleIn` | 结息头尾规则 |
| `interest_type_in` | `interest_type_in` | `interestTypeIn` | 年/月/日利率 |
| `floating_mode_in` | `floating_mode_in` | `floatingModeIn` | 浮动方式 |
| `interest_adjusting_cycle_in` | `interest_adjusting_cycle_in` | `interestAdjustingCycleIn` | 利率调整周期 |
| `delivery_frequency_in` | `delivery_frequency_in` | `deliveryFrequencyIn` | 换入交割频率 |
| `interest_rate_type_out` | `interest_rate_type_out` | `interestRateTypeOut` | 利率类型 |
| `interest_accrual_days_out` | `interest_accrual_days_out` | `interestAccrualDaysOut` | 计息天数 |
| `interest_settlement_rule_out` | `interest_settlement_rule_out` | `interestSettlementRuleOut` | 结息头尾规则 |
| `interest_type_out` | `interest_type_out` | `interestTypeOut` | 年/月/日利率 |
| `floating_mode_out` | `floating_mode_out` | `floatingModeOut` | 浮动方式 |
| `interest_adjusting_cycle_out` | `interest_adjusting_cycle_out` | `interestAdjustingCycleOut` | 利率调整周期 |
| `delivery_frequency_out` | `delivery_frequency_out` | `deliveryFrequencyOut` | 换出交割频率 |
| `near_trade_direction` | `near_trade_direction` | `nearTradeDirection` | 交易方向 |
| `near_delivery_method` | `near_delivery_method` | `nearDeliveryMethod` | 交割方式 |
| `near_term_type` | `near_term_type` | `nearTermType` | 期限类型 |
| `near_currency_pair` | `near_currency_pair` | `nearCurrencyPair` | 货币对 |
| `far_trade_direction` | `far_trade_direction` | `farTradeDirection` | 交易方向 |
| `far_delivery_method` | `far_delivery_method` | `farDeliveryMethod` | 交割方式 |
| `far_term_type` | `far_term_type` | `farTermType` | 期限类型 |
| `out_near_currency_pair` | `out_near_currency_pair` | `outNearCurrencyPair` | 货币对 |
| `settle_other_name` | `settle_other_name` | `settleOtherName` | 对方账户名称 |
| `settle_other_account` | `settle_other_account` | `settleOtherAccout` | 对方银行账号 |
| `settle_other_banktype` | `settle_other_banktype` | `settleOtherBanktype` | 对方账户银行类别 |
| `settle_other_number` | `settle_other_number` | `settleOtherNumber` | 对方账户联行号 |
| `settle_other_bank` | `settle_other_bank` | `settleOtherBank` | 对方账户开户行 |
| `contract_type` | `contract_type` | `contractType` | 担保方式 |
| `allow_loan` | `allow_loan` | `allowLoan` | 允许内部借贷:yes/no |
| `capital_source` | `capital_source` | `capitalSource` | 资金来源 |
| `manual_associate` | `manual_associate` | `manualAssociate` | 是否开启人工关联协同单据 |
| `frc_sync_direction` | `frc_sync_direction` | `frcSyncDirection` | 融资/投资变更发起方 |
| `fp_sync_direction` | `fp_sync_direction` | `fpSyncDirection` | 融入/申购发起方 |
| `ri_sync_direction` | `ri_sync_direction` | `riSyncDirection` | 还本/赎回发起方 |
| `pi_sync_direction` | `pi_sync_direction` | `piSyncDirection` | 付息/收息发起方 |
| `fpc_sync_direction` | `fpc_sync_direction` | `fpcSyncDirection` | 融入/申购变更发起方 |
| `ex_sync_direction` | `ex_sync_direction` | `exSyncDirection` | 展期发起方 |
| `red_sync_direction` | `red_sync_direction` | `redSyncDirection` | 减免发起方 |
| `default_add_principal` | `default_add_principal` | `defaultAddPrincipal` | 登记时是否默认增加本金 |
| `isreserve_date` | `isreserve_date` | `isReserveDate` | 是否填写备款日期 |
| `allow_transfer` | `allow_transfer` | `allowTransfer` | 是否允许转让 |
| `regular_notify_acc_other` | `regular_notify_acc_other` | `regularNotifyAccOther` | 定期/通知账户 |
| `notice_deposit_type` | `notice_deposit_type` | `noticeDepositType` | 通知存款类型 |
| `interest_settlestatus` | `interest_settlestatus` | `interestSettleStatus` | 收息结算状态 |
| `interest_collection_accid_other` | `interest_collection_accid_other` | `interestCollectionAccidOther` | 计息账户-收息 |
| `currency_pair` | `currency_pair` | `currencyPair` | 货币对 |
| `call_option` | `call_option` | `callOption` | 是否有赎回选择权:yes/no |
| `has_debt_rating` | `has_debt_rating` | `hasDebtRating` | 是否有债项评级:yes/no |
| `debt_rating` | `debt_rating` | `debtRating` | 债项评级结果 |
| `with_pay` | `with_pay` | `withPay` | 是否同时扣费:yes/no |
| `leasing_asset` | `leasing_asset` | `leasingAsset` | 是否包含租赁资产 |
| `bond_alert_message` | `bond_alert_message` | `bondAlertMessage` | 债券注册额度不足提醒 |
| `settle_param` | `settle_param` | `settleParam` | 结算集成参数:资金结算stwb,不结算no |
| `scheme_title` | `scheme_title` | `schemeTitle` | 方案标题 |
| `is_effect` | `is_effect` | `isEffect` | 是否生效 |
| `bill_effective_time` | `bill_effective_time` | `billEffectiveTime` | 单据生效时机 |
| `if_direct_Connection` | `if_direct_Connection` | `ifDirectConnection` | 是否直连 |
| `plan_name` | `plan_name` | `planName` | 年度交易计划名称 |
| `balance_method` | `balance_method` | `balanceMethod` | 余额方式 |
| `purchaseMethod` | `purchaseMethod` | `purchaseMethod` | 申购方式 |
| `third_name` | `third_name` | `thirdName` | 第三方名称 |
| `third_account` | `third_account` | `thirdAccout` | 第三方银行账号 |
| `third_banktype` | `third_banktype` | `thirdBanktype` | 第三方账户名称 |
| `third_number` | `third_number` | `thirdNumber` | 第三方账户开户行 |
| `release_bill` | `release_bill` | `releaseBill` | 预算释放单据 |
| `release_timing` | `release_timing` | `releaseTiming` | 预算释放时机 |
| `source_type` | `source_type` | `sourcetype` | 上游类型 |
| `month_adjust_date` | `month_adjust_date` | `monthAdjustDate` | 月末日期调整(还本) |
| `month_interest_adjust_date` | `month_interest_adjust_date` | `monthInterestAdjustDate` | 月末日期调整(计息) |
| `included_expiration_date` | `included_expiration_date` | `includedExpirationDate` | 是否含到期日 |
| `interes_base` | `interes_base` | `interesBase` | 提前还本计息基数 |
| `normal_interes_base` | `normal_interes_base` | `normalInteresBase` | 正常还本计息基数 |
| `sync_accessory` | `sync_accessory` | `syncAccessory` | 是否协同附件/影像 |
| `isConnectExternalData` | `isConnectExternalData` | `isConnectExternalData` | 是否对接外部数据 |
| `btnBond` | `btnBond` | `btnBond` | 查询债券 |
| `bond_name` | `bond_name` | `bondName` | 债券简称 |
| `bond_full_name` | `bond_full_name` | `bondFullName` | 债券全称 |
| `more_Currency` | `more_Currency` | `moreCurrency` | 是否多币种贷款 |
| `cashflowplan_gen_reminders` | `cashflowplan_gen_reminders` | `cashFlowPlanGenReminders` | 现金流计划生成提醒 |
| `use_overdue` | `use_overdue` | `useOverdue` | 是否启用逾期 |
| `is_penalty` | `is_penalty` | `isPenalty` | 是否计算罚息 |
| `is_compound_interest` | `is_compound_interest` | `isCompoundInterest` | 是否计算复利 |
| `before_overdue_status` | `before_overdue_status` | `beforeOverdueStatus` | 逾期前的协议状态 |
| `is_agreed_repayment` | `is_agreed_repayment` | `isAgreedRepayment` | 是否约定还款计划 |
| `debt_allot_method` | `debt_allot_method` | `debtAllotMethod` | 借据分配方式 |
| `trading_limit` | `trading_limit` | `tradingLimit` | 交易限额 |
| `occupy_trading_limit` | `occupy_trading_limit` | `occupyTradingLimit` | 投资额度占用时机 |
| `release_trading_limit` | `release_trading_limit` | `releaseTradingLimit` | 投资额度释放时机 |
| `grant_or_not` | `grant_or_not` | `grantOrNot` | 是否受让 |
| `combined_ratio_reload` | `combined_ratio_reload` | `combinedRatioReload` | 是否重算综合成本率 |
| `month_wh_adjust_date` | `month_wh_adjust_date` | `monthWithHoldingAdjustDate` | 月末日期调整(预提) |
| `regular_notify_acc_interest` | `regular_notify_acc_interest` | `regularNotifyAccInterest` | 定期/通知账户是否计息 |
| `is_freeze_inneraccount` | `is_freeze_inneraccount` | `isFreezeInnerAccount` | 是否冻结内部账户 |
| `auto_extension_term_unit` | `auto_extension_term_unit` | `autoExtensionTermUnit` | 期限单位 |
| `forward_term_type` | `forward_term_type` | `forwardTermType` | 期限类型 |
| `income_acc_other` | `income_acc_other` | `incomeAccOther` | 收入账户 |
| `interest_acc_other` | `interest_acc_other` | `interestAccOther` | 计息账户 |
| `outlay_acc_other` | `outlay_acc_other` | `outlayAccOther` | 支出账户 |
| `pay_account_type` | `pay_account_type` | `payAccountType` | 收支账户类型 |
| `withholding_cycle` | `withholding_cycle` | `withholdingCycle` | 预提利息周期 |
| `financing_apply_code` | `financing_apply_code` | `financingApplyCode` | 融资申请编号 |
| `auto_infuse_fail_reason` | `auto_infuse_fail_reason` | `autoInfuseFailReason` | 自动生单失败原因 |
| `auto_infuse_status` | `auto_infuse_status` | `autoInfuseStatus` | 自动生成融入单状态 |
| `cf_business_type` | `cf_business_type` | `cfBusinessType` | 上个写现金流的业务类型 |
| `deposit_receipt_number` | `deposit_receipt_number` | `depositReceiptNumber` | 存单号 |
| `if_used` | `if_used` | `ifUsed` | 参照是否被使用 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `version_type` | `version_type` | `versionType` | 版本生成类型 |
| `version` | `version` | `version` | 版本号 |
| `protocol_type` | `protocol_type` | `protocolType` | 版本类型 |
| `code` | `code` | `code` | 关联单据编号 |
| `protocol_number` | `protocol_number` | `protocolNumber` | 协议号 |
| `term` | `term` | `term` | 期限 |
| `change_protocol_number` | `change_protocol_number` | `changeProtocolNumber` | 补充协议号 |
| `change_reason` | `change_reason` | `changeReason` | 变更原因 |
| `renew` | `renew` | `renew` | 是否续签 |
| `financing_org_type` | `financing_org_type` | `financingOrgType` | 融资机构类型 |
| `financing_org_other` | `financing_org_other` | `financingOrgForOther` | 融资机构 |
| `term_unit` | `term_unit` | `termUnit` | 期限类型 |
| `term_type` | `term_type` | `termType` | 融资期限分类 |
| `repayment_type` | `repayment_type` | `repaymentType` | 还款方式 |
| `repayment_cycle` | `repayment_cycle` | `repaymentCycle` | 还款周期 |
| `fund_payment_type` | `fund_payment_type` | `fundPaymentType` | 资金支付模式 |
| `bank` | `bank` | `bank` | 实际引用的贷款利率银行类别 |
| `protocol_status` | `protocol_status` | `protocolStatus` | 协议状态 |
| `relate_risk_clause` | `relate_risk_clause` | `relateRiskClause` | 关联风险条款 |
| `expire_end_type` | `expire_end_type` | `expireEndType` | 到期结束方式 |
| `end_reason` | `end_reason` | `endReason` | 结束原因 |
| `rate_type` | `rate_type` | `rateType` | 利率类型 |
| `interest_days` | `interest_days` | `interestDays` | 计息天数 |
| `trustee_type` | `trustee_type` | `trusteeType` | 受托人机构类型 |
| `loan_interest_rate` | `loan_interest_rate` | `loanInterestRate` | 现金流引用利率id集合(融资方向) |
| `deposit_interest_rate` | `deposit_interest_rate` | `depositInterestRate` | 现金流引用利率id集合(投资方向) |
| `interest_rate_values` | `interest_rate_values` | `interestRateValues` | 贷款利率管理值 |
| `num_unit` | `num_unit` | `numUnit` | 数量单位 |
| `year_month_day` | `year_month_day` | `yearMonthDay` | 年/月/日利率 |
| `float_type` | `float_type` | `floatType` | 浮动方式 |
| `rate_adjust_cycle` | `rate_adjust_cycle` | `rateAdjustCycle` | 利率调整周期 |
| `settlement_cycle` | `settlement_cycle` | `settlementCycle` | 结息周期 |
| `isInit` | `isInit` | `isInit` | 是否期初 |
| `source` | `source` | `source` | 来源 |
| `delivery_methods` | `delivery_methods` | `deliveryMethods` | 交割方式 |
| `last_version` | `last_version` | `lastVersion` | 最新版本号 |
| `advance_principal` | `advance_principal` | `advancePrincipal` | 是否预付本金 |
| `create_method` | `create_method` | `createMethod` | 生成方式 |
| `settlement_status` | `settlement_status` | `settlementStatus` | 结算状态 |
| `other_type` | `other_type` | `otherType` | 对方类型 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `` | `creator` | `creator` | 创建人 |
| `trustee_pay_type` | `trustee_pay_type` | `trusteePayType` | 受托支付类型 |
| `third_bank_account` | `third_bank_account` | `thirdBankAccount` | 第三方银行账号 |
| `` | `auditor` | `auditor` | 审批人 |
| `third_bank_name` | `third_bank_name` | `thirdBankName` | 第三方账户名称 |
| `third_bank` | `third_bank` | `thirdBank` | 第三方账户开户行 |
| `sync_msg` | `sync_msg` | `syncMsg` | 协同失败原因 |

### 引用字段 (106个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `property` | `property` | `property` | 关联物权 |
| `settle_er_type` | `settle_er_type` | `settleErType` | 本币币种汇率类型 |
| `settle_interest_currency` | `settle_interest_currency` | `settleInterestCurrency` | 计息币种 |
| `settle_js_method` | `settle_js_method` | `settleJsMethod` | 结算方式 |
| `settle_local_accid` | `settle_local_accid` | `settleLocalAccid` | 本方账户 |
| `settle_local_currency` | `settle_local_currency` | `settleLocalCurrency` | 本币币种 |
| `settle_other_id` | `settle_other_id` | `settleOtherId` | 对方资金业务对象银行信息参照id |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `opposite_settle_currency` | `opposite_settle_currency` | `oppositeSettleCurrency` | 对方账户币种 |
| `contract_lib_id` | `contract_lib_id` | `contractLibId` | 合同台账ID |
| `contract_type_id` | `contract_type_id` | `contractTypeId` | 合同类型 |
| `inSupplierBankAccount` | `inSupplierBankAccount` | `inSupplierBankAccount` | 供应商银行账号 |
| `inCustomerBankAccount` | `inCustomerBankAccount` | `inCustomerBankAccount` | 客户银行账号 |
| `exchange_currency_in` | `exchange_currency_in` | `exchangeCurrencyIn` | 换入币种 |
| `expense_out_account_local_in` | `expense_out_account_local_in` | `expenseOutAccountLocalIn` | 支出账户 |
| `base_interest_rate_type_in` | `base_interest_rate_type_in` | `baseInterestRateTypeIn` | 基准利率类型 |
| `exchange_rate_type_in` | `exchange_rate_type_in` | `exchangeRateTypeIn` | 本币币种汇率类型 |
| `exchange_currency_out` | `exchange_currency_out` | `exchangeCurrencyOut` | 换出币种 |
| `expense_account_out` | `expense_account_out` | `expenseAccountOut` | 收款账户 |
| `base_interest_rate_type_out` | `base_interest_rate_type_out` | `baseInterestRateTypeOut` | 基准利率类型 |
| `exchange_rate_type_out` | `exchange_rate_type_out` | `exchangeRateTypeOut` | 本币币种汇率类型 |
| `near_purchase_currency` | `near_purchase_currency` | `nearPurchaseCurrency` | 买入币种 |
| `near_sold_currency` | `near_sold_currency` | `nearSoldCurrency` | 卖出币种 |
| `near_denomination_currency` | `near_denomination_currency` | `nearDenominationCurrency` | 计价币种 |
| `out_near_purchase_currency` | `out_near_purchase_currency` | `outNearPurchaseCurrency` | 买入币种 |
| `out_near_sold_currency` | `out_near_sold_currency` | `outNearSoldCurrency` | 卖出币种 |
| `out_near_denomination_currency` | `out_near_denomination_currency` | `outNearDenominationCurrency` | 计价币种 |
| `settleSupplierBankAccount` | `settleSupplierBankAccount` | `settleSupplierBankAccount` | 供应商银行账号 |
| `settleCustomerBankAccount` | `settleCustomerBankAccount` | `settleCustomerBankAccount` | 客户银行账号 |
| `supplier` | `supplier` | `supplier` | 供应商id |
| `customer` | `customer` | `customer` | 客户id |
| `related_protocol` | `related_protocol` | `relatedProtocol` | 关联协议 |
| `debtId` | `debtId` | `debtId` | 协同借据id |
| `related_purchase` | `related_purchase` | `relatedPurchase` | 协同申购 |
| `investment_apply` | `investment_apply` | `investmentApply` | 关联申请单 |
| `regular_notify_acc` | `regular_notify_acc` | `regularNotifyAcc` | 定期/通知账户-企业银行账户档案 |
| `interest_cash_flow` | `interest_cash_flow` | `interestCashFlow` | 收息现金流 |
| `interest_settlemethod` | `interest_settlemethod` | `interestSettleMethod` | 收息结算方式 |
| `interest_collection_accid` | `interest_collection_accid` | `interestCollectionAccid` | 计息账户-收息 |
| `valuation_currency` | `valuation_currency` | `valuationCurrency` | 估值币种 |
| `denomination_currency` | `denomination_currency` | `denominationCurrency` | 计价币种 |
| `dept_id` | `dept_id` | `deptid` | 部门 |
| `project_id` | `project_id` | `projectid` | 项目 |
| `wbs` | `wbs` | `wbs` | wbs |
| `activity` | `activity` | `activity` | 活动 |
| `bond_class` | `bond_class` | `bondClass` | 债券类别 |
| `trading_market` | `trading_market` | `tradingMarket` | 交易市场 |
| `bond_regist_ration` | `bond_regist_ration` | `bondRegistration` | 债券注册登记 |
| `fee_item` | `fee_item` | `feeItem` | 付费项目 |
| `pay_currency` | `pay_currency` | `payCurrency` | 付费币种 |
| `scheme_number` | `scheme_number` | `schemeNumber` | 方案编号 |
| `asset_specific_plan` | `asset_specific_plan` | `assetSpecificPlan` | 资产专项计划 |
| `agreement` | `agreement` | `agreement` | 授信明细id |
| `creditapply` | `creditapply` | `creditapply` | 授信申请id |
| `income_currency` | `income_currency` | `incomeCurrency` | 收入账户币种 |
| `infuse_income_currency` | `infuse_income_currency` | `infuseIncomeCurrency` | 融入结算信息收入账户币种 |
| `output_currency` | `output_currency` | `outputCurrency` | 支出账户币种 |
| `interest_acc_currency` | `interest_acc_currency` | `interestAccCurrency` | 计息账户币种 |
| `fxsettle_acc_currency` | `fxsettle_acc_currency` | `fxSettleAccCurrency` | 付息结算信息计息账户币种 |
| `cost_center` | `cost_center` | `costCenter` | 成本中心 |
| `profit_center` | `profit_center` | `profitCenter` | 利润中心 |
| `agency_income_acc` | `agency_income_acc` | `agencyIncomeAcc` | 代理收入账户 |
| `agency_income_currency` | `agency_income_currency` | `agencyIncomeCurrency` | 代理收入账户币种 |
| `agency_outlay_acc` | `agency_outlay_acc` | `agencyOutlayAcc` | 代理支出账户 |
| `agency_output_currency` | `agency_output_currency` | `agencyOutputCurrency` | 代理支出账户币种 |
| `agency_interest_acc` | `agency_interest_acc` | `agencyInterestAcc` | 代理付息账户 |
| `agency_interest_currency` | `agency_interest_currency` | `agencyInterestCurrency` | 代理付息账户币种 |
| `agency_infuse_income_acc` | `agency_infuse_income_acc` | `agencyInfuseIncomeAcc` | 代理收入账户 |
| `agency_infuse_income_currency` | `agency_infuse_income_currency` | `agencyInfuseIncomeCurrency` | 代理收入账户币种 |
| `agency_settle_interest_acc` | `agency_settle_interest_acc` | `agencySettleInterestAcc` | 代理付息账户 |
| `agency_settle_acc_currency` | `agency_settle_acc_currency` | `agencySettleAccCurrency` | 代理付息账户币种 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `margin_currency` | `margin_currency` | `marginCurrency` | 保证金币种 |
| `financing_apply` | `financing_apply` | `financingApply` | 融资申请id |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `accentity` | `accentity` | `accentity` | 资金组织id |
| `change_with_primary` | `change_with_primary` | `changeWithPrimary` | 关联原协议id |
| `financial_product` | `financial_product` | `financialProduct` | 金融产品id |
| `protocol_currency` | `protocol_currency` | `protocolCurrency` | 协议币种id |
| `bus_type` | `bus_type` | `bustype` | 交易类型id |
| `relation_cash_flow` | `relation_cash_flow` | `relationCashFlow` | 现金流计划id |
| `relation_past_protocol` | `relation_past_protocol` | `relationPastProtocol` | 关联原协议id |
| `financing_org_bank` | `financing_org_bank` | `financingOrgForBank` | 融资机构ID |
| `sc_amount` | `sc_amount` | `scAmount` | 对方账户名称id |
| `capital_currency` | `capital_currency` | `capitalCurrency` | 本金币种id |
| `income_accid` | `income_accid` | `incomeAccid` | 收入账户id |
| `outlay_accid` | `outlay_accid` | `outlayAccid` | 支出账户id |
| `relation_next_protocol` | `relation_next_protocol` | `relationNextProtocol` | 续签协议id |
| `trade_category` | `trade_category` | `tradeCategory` | 交易品种id |
| `base_rate_type` | `base_rate_type` | `baseRateType` | 基准利率类型id |
| `trustee` | `trustee` | `trustee` | 受托人id |
| `convertible_currency` | `convertible_currency` | `convertibleCurrency` | 兑换币种id |
| `interest_currency` | `interest_currency` | `interestCurrency` | 计息币种id |
| `interest_accid` | `interest_accid` | `interestAccid` | 计息账户id |
| `sync_register` | `sync_register` | `syncRegister` | 协同关联协议id |
| `infuse_capital_currency` | `infuse_capital_currency` | `infuseCapitalCurrency` | 本金币种id |
| `old_currency` | `old_currency` | `oldCurrency` | 本币币种ID |
| `exchange_rate_type` | `exchange_rate_type` | `exchangeRateType` | 本币币种汇率类型ID |
| `local_accid` | `local_accid` | `localAccid` | 本方账户ID |
| `infuse_income_accid` | `infuse_income_accid` | `infuseIncomeAccid` | 收入账户ID |
| `settlement_method` | `settlement_method` | `settlementMethod` | 结算方式ID |
| `marginaccid` | `marginaccid` | `marginaccid` | 保证金账号id |
| `fundBusinessObject` | `fundBusinessObject` | `fundBusinessObject` | 对方账户名称id |

### 日期字段 (60个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `amortized_cost_date` | `amortized_cost_date` | `amortizedCostDate` | 摊余成本更新日期 |
| `closed_expiration_date` | `closed_expiration_date` | `closedExpirationDate` | 封闭到期日期 |
| `closing_start_date` | `closing_start_date` | `closingStartDate` | 封闭开始日期 |
| `settle_begin_date` | `settle_begin_date` | `settleBeginDate` | 付息起息日 |
| `settle_end_date` | `settle_end_date` | `settleEndDate` | 付息止息日 |
| `time_to_market` | `time_to_market` | `timeToMarket` | 上市时间 |
| `standard_expire_date` | `standard_expire_date` | `standardExpireDate` | 到期日期(规则计算的到期日期) |
| `apportion_begin_date` | `apportion_begin_date` | `apportionBeginDate` | 分摊开始日期 |
| `apportion_end_date` | `apportion_end_date` | `apportionEndDate` | 分摊结束日期 |
| `first_assessment_date` | `first_assessment_date` | `firstAssessmentDate` | 首次分摊日 |
| `interest_rate_date` | `interest_rate_date` | `interestRateDate` | 初始利率日期 |
| `first_delivery_date` | `first_delivery_date` | `firstDeliveryDate` | 首次交割日 |
| `first_effective_date_in` | `first_effective_date_in` | `firstEffectiveDateIn` | 调整首次生效日 |
| `first_delivery_in_date` | `first_delivery_in_date` | `firstDeliveryInDate` | 换入首次交割日 |
| `first_effective_date_out` | `first_effective_date_out` | `firstEffectiveDateOut` | 调整首次生效日 |
| `first_delivery_out_date` | `first_delivery_out_date` | `firstDeliveryOutDate` | 换出首次交割日 |
| `near_start_date` | `near_start_date` | `nearStartDate` | 预计起息日 |
| `near_end_date` | `near_end_date` | `nearEndDate` | 预计到期日 |
| `near_delivery_date` | `near_delivery_date` | `nearDeliveryDate` | 交割日期 |
| `near_delivery_date_start` | `near_delivery_date_start` | `nearDeliveryDateStart` | 交割日期从 |
| `near_delivery_date_end` | `near_delivery_date_end` | `nearDeliveryDateEnd` | 交割日期至 |
| `far_end_start_date` | `far_end_start_date` | `farStartDate` | 预计起息日 |
| `far_end_date` | `far_end_date` | `farEndDate` | 预计到期日 |
| `far_delivery_date` | `far_delivery_date` | `farDeliveryDate` | 交割日期 |
| `far_delivery_date_start` | `far_delivery_date_start` | `farDeliveryDateStart` | 交割日期从 |
| `far_delivery_date_end` | `far_delivery_date_end` | `farDeliveryDateEnd` | 交割日期至 |
| `reserve_date` | `reserve_date` | `reserveDate` | 备款日期 |
| `interest_start_date` | `interest_start_date` | `interestStartDate` | 收息起息日 |
| `interest_end_date` | `interest_end_date` | `interestEndDate` | 收息止息日 |
| `valuation_date` | `valuation_date` | `valuationDate` | 估值日期 |
| `redeem_date` | `redeem_date` | `redeemDate` | 赎回日期 |
| `plan_year` | `plan_year` | `planYear` | 计划年度 |
| `last_interest_date` | `last_interest_date` | `lastInterestDate` | 上一次结息日 |
| `next_transfer_date` | `next_transfer_date` | `nextTransferDate` | 下次转存日期 |
| `declared_interest_date` | `declared_interest_date` | `declaredInterestDate` | 已宣告利息待发放日期 |
| `fair_value_date` | `fair_value_date` | `fairValueDate` | 公允价值更新日期 |
| `first_withholding_cycle` | `first_withholding_cycle` | `firstWithholdingDate` | 首次预提利息日 |
| `grant_interest_date` | `grant_interest_date` | `grantInterestDate` | 计划发放日期 |
| `purchase_date` | `purchase_date` | `purchaseDate` | 申购日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `version_date` | `version_date` | `versionDate` | 版本生成时间 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `change_date` | `change_date` | `changeDate` | 变更日期 |
| `begin_date` | `begin_date` | `beginDate` | 开始日期 |
| `expire_date` | `expire_date` | `expireDate` | 到期日期 |
| `sign_date` | `sign_date` | `signDate` | 签约日期 |
| `first_repayment_date` | `first_repayment_date` | `firstRepaymentDate` | 首次还款日 |
| `exhibition_period_end_date` | `exhibition_period_end_date` | `exhibitionPeriodEndDate` | 展期后到期日 |
| `end_date` | `end_date` | `endDate` | 结束日期 |
| `first_effect_date` | `first_effect_date` | `firstEffectDate` | 调整首次生效日 |
| `first_payment_date` | `first_payment_date` | `firstPaymentDate` | 首次付息日 |
| `advance_date` | `advance_date` | `advanceDate` | 预付本金日期 |
| `delivery_date` | `delivery_date` | `deliveryDate` | 交割日期 |
| `delivery_date_from` | `delivery_date_from` | `deliveryDateFrom` | 交割日期从 |
| `delivery_date_to` | `delivery_date_to` | `deliveryDateTo` | 交割日期至 |
| `init_hb_date` | `init_hb_date` | `initHbDate` | 期初还本日 |
| `init_fx_date` | `init_fx_date` | `initFxDate` | 期初付息日 |
| `withholding_interest_date` | `withholding_interest_date` | `withholdingInterestDate` | 预提起息日 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isWfControlled` | `isWfControlled` | 审批流控制 |
| `canuseflow` | `canuseflow` | `canuseflow` | 是否走审批流 |

### 枚举字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `interest_cal_method` | `interest_cal_method` | `interestCalMethod` | 利息计算方式 |
| `allocation_type` | `allocation_type` | `allocationType` | 费用分摊类型 |
| `is_update_settlement_date` | `is_update_settlement_date` | `isUpdateSettlementDate` | 是否更新申购日为结算日 |
| `settled_addition` | `settled_addition` | `settledAddition` | 已结算补单(融入结算) |
| `fx_settled_addition` | `fx_settled_addition` | `fxSettledAddition` | 已结算补单(付息结算) |
| `period_head_tail` | `period_head_tail` | `periodHeadTail` | 周期首尾规则 |
| `holiday_principle` | `holiday_principle` | `holidayPrinciple` | 节假日处理原则 |
| `interest_settlement_rule` | `interest_settlement_rule` | `interestSettlementRule` | 结息头尾规则 |
| `withholding_rule` | `withholding_rule` | `withholdingRule` | 预提头尾规则 |
| `is_budget` | `is_budget` | `isBudget` | 是否占用预算 |
| `holiday_interest_principle` | `holiday_interest_principle` | `holidayInterestPrinciple` | 节假日计息原则 |
| `is_support_settle_center` | `is_support_settle_center` | `isSupportSettleCenter` | 是否集成结算中心 |
| `overdue_auto_extension` | `overdue_auto_extension` | `overdueAutoExtension` | 逾期自动展期 |
| `settlement_type` | `settlement_type` | `settlementType` | 结息方式 |

### 整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pre_payment_days` | `pre_payment_days` | `prePaymentDays` | 提前付款天数 |
| `percent_digit` | `percent_digit` | `percentDigit` | 比例精度 |
| `grace_period` | `grace_period` | `gracePeriod` | 宽限期 |
| `auto_extension_term_num` | `auto_extension_term_num` | `autoExtensionTermNum` | 自动展期期限 |
| `capital_happen_number` | `capital_happen_number` | `capitalHappenNumber` | 本金发生次数 |
| `term_number` | `term_number` | `termNumber` | 期限 |

### 短整数 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `close_period` | `close_period` | `closePeriod` | 封闭期 |
| `exchange_rate_ops` | `exchange_rate_ops` | `exchangeRateOps` | 本币币种汇率折算方式 |
| `settle_er_ops` | `settle_er_ops` | `settleErOps` | 本币币种汇率折算方式 |
| `foreign_trade_direction` | `foreign_trade_direction` | `foreignTradeDirection` | 交易方向:0买入1卖出 |
| `trade_direction_rate` | `trade_direction_rate` | `tradeDirectionRate` | 交易方向(利率掉期) |
| `trade_direction_export` | `trade_direction_export` | `tradeDirectionExport` | 交易方向(导入使用):0买入1卖出2近端买远端卖3近端卖远端买 |
| `domestic_or_overseas` | `domestic_or_overseas` | `domesticOrOverseas` | 境内/境外 |
| `on_site_or_off_site` | `on_site_or_off_site` | `onSiteOrOffSite` | 场内/场外 |
| `transaction_purpose` | `transaction_purpose` | `transactionPurpose` | 交易目的 |
| `exchange_rate_unit` | `exchange_rate_unit` | `exchangeRateUnit` | 汇率单位 |
| `apply_status` | `apply_status` | `applyStatus` | 融资申请状态 |
| `` | `returncount` | `returncount` | 退回次数 |
| `` | `status` | `status` | 单据状态 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `audit_status` | `audit_status` | `auditStatus` | 单据状态 |
| `trade_direction` | `trade_direction` | `tradeDirection` | 交易方向 |
| `lend_by_trustee` | `lend_by_trustee` | `lendByTrustee` | 是否通过受托人放款 |
| `send_sync` | `send_sync` | `sendSync` | 是否发起协同 |
| `receive_sync` | `receive_sync` | `receiveSync` | 接收协同状态 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bak_id` | `bak_id` | `bakId` | 关联的协议备份表id |
| `cf_business_id` | `cf_business_id` | `cfBusinessId` | 上个写现金流的业务id |
| `` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | 主表id |

### 数值字段 (148个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pledged_price` | `pledged_price` | `pledgedPrice` | 抵质押价值 |
| `amortized_cost` | `amortized_cost` | `amortizedCost` | 摊余成本 |
| `amount_of_dividends_paid` | `amount_of_dividends_paid` | `amountOfDividendsPaid` | 已分红金额 |
| `expected_return` | `expected_return` | `expectedReturn` | 预期收益率 |
| `own_pay_amount_capital` | `own_pay_amount_capital` | `ownPayAmountCapital` | 自主支付金额(本金币种) |
| `own_pay_amount_local` | `own_pay_amount_local` | `ownPayAmountLocal` | 自主支付金额(本币币种) |
| `settle_appoint_rate` | `settle_appoint_rate` | `settleAppointRate` | 利息约定汇率 |
| `settle_er` | `settle_er` | `settleEr` | 本币币种汇率 |
| `settle_interest_protocol` | `settle_interest_protocol` | `settleInterestAmount` | 付息金额(计息币种) |
| `settle_interest_protocol_local` | `settle_interest_protocol_local` | `settleInterestAmountLocal` | 付息金额(本币币种) |
| `settle_amount_origin` | `settle_amount_origin` | `settleInterestAmountOrigin` | 付息金额(协议币种) |
| `trustee_pay_amount_capital` | `trustee_pay_amount_capital` | `trusteePayAmountCapital` | 受托支付金额(本金币种) |
| `trustee_pay_amount_local` | `trustee_pay_amount_local` | `trusteePayAmountLocal` | 受托支付金额(本币币种) |
| `deal_amount_capital` | `deal_amount_capital` | `dealAmountCapital` | 交易金额(本金币种) |
| `deal_amount_local` | `deal_amount_local` | `dealAmountLocal` | 交易金额(本币币种) |
| `deal_amount_protocol` | `deal_amount_protocol` | `dealAmountProtocol` | 交易金额(协议币种) |
| `deal_cost_capital` | `deal_cost_capital` | `dealCostCapital` | 交易费用(本金币种) |
| `deal_cost_local` | `deal_cost_local` | `dealCostLocal` | 交易费用(本币币种) |
| `deal_cost_protocol` | `deal_cost_protocol` | `dealCostProtocol` | 交易费用(协议币种) |
| `deal_price` | `deal_price` | `dealPrice` | 交易单价 |
| `jx_amount` | `jx_amount` | `jxAmount` | 已结息金额 |
| `settle_nopay_amount` | `settle_nopay_amount` | `settleNopayAmount` | 已结未付利息 |
| `current_interest_rate` | `current_interest_rate` | `currentInterestRate` | 活期利率(%) |
| `unpaid_expenses` | `unpaid_expenses` | `unpaidExpenses` | 未支付费用 |
| `opening_price` | `opening_price` | `openingPrice` | 期初价格 |
| `closing_price` | `closing_price` | `closingPrice` | 期末价格 |
| `less_price` | `less_price` | `lessPrice` | 目标价格 |
| `market_reference_price_exchange_rate` | `market_reference_price_exchange_rate` | `marketReferencePriceExchangeRate` | 市场参考价(汇率) |
| `buy_amount` | `buy_amount` | `buyAmount` | 买入金额 |
| `sell_amount` | `sell_amount` | `sellAmount` | 卖出金额 |
| `exchange_amount_in` | `exchange_amount_in` | `exchangeAmountIn` | 换入金额(换入币种) |
| `interest_rate_in` | `interest_rate_in` | `interestRateIn` | 基准利率(%) |
| `floating_value_in` | `floating_value_in` | `floatingValueIn` | 浮动值 |
| `exchange_rate_in` | `exchange_rate_in` | `exchangeRateIn` | 换入利率(%) |
| `exchange_rate_local_in` | `exchange_rate_local_in` | `exchangeRateLocalIn` | 本币币种汇率 |
| `exchange_amount_local_in` | `exchange_amount_local_in` | `exchangeAmountLocalIn` | 换入金额(本币币种) |
| `exchange_in_less_price` | `exchange_in_less_price` | `exchangeInLessPrice` | 换入目标价格(%) |
| `exchange_in_market_price` | `exchange_in_market_price` | `exchangeInMarketPrice` | 换入市场参考价(%) |
| `exchange_amount_out` | `exchange_amount_out` | `exchangeAmountOut` | 换出金额(换出币种) |
| `interest_rate_out` | `interest_rate_out` | `interestRateOut` | 基准利率(%) |
| `floating_value_out` | `floating_value_out` | `floatingValueOut` | 浮动值 |
| `exchange_rate_o_put` | `exchange_rate_o_put` | `exchangeRateOPut` | 换出利率(%) |
| `exchange_rate_out` | `exchange_rate_out` | `exchangeRateOut` | 本币币种汇率 |
| `exchange_amount_local_out` | `exchange_amount_local_out` | `exchangeAmountLocalOut` | 换出金额(本币币种) |
| `exchange_less_price` | `exchange_less_price` | `exchangeLessPrice` | 换出目标价格(%) |
| `exchange_market_price` | `exchange_market_price` | `exchangeMarketPrice` | 换出市场参考价(%) |
| `near_estimated_price` | `near_estimated_price` | `nearEstimatedPrice` | 预计价格 |
| `near_purchase_money` | `near_purchase_money` | `nearPurchaseMoney` | 买入金额 |
| `near_sold_money` | `near_sold_money` | `nearSoldMoney` | 卖出金额 |
| `far_estimated_price` | `far_estimated_price` | `farEstimatedPrice` | 预计价格 |
| `out_near_purchase_money` | `out_near_purchase_money` | `outNearPurchaseMoney` | 买入金额 |
| `out_near_sold_money` | `out_near_sold_money` | `outNearSoldMoney` | 卖出金额 |
| `expected_return_amt` | `expected_return_amt` | `expectedReturnAmt` | 预期收益 |
| `init_hb_amount_capital` | `init_hb_amount_capital` | `initHbAmountCapital` | 期初还本金额(本金币种) |
| `init_redeem_num` | `init_redeem_num` | `initRedeemNum` | 期初赎回数量 |
| `init_fx_amount_Interest` | `init_fx_amount_Interest` | `initFxAmountInterest` | 期初付息金额(计息币种) |
| `advance_amount_capital` | `advance_amount_capital` | `advanceAmountCapital` | 预付本金(本金币种) |
| `can_loan_amount` | `can_loan_amount` | `canLoanAmount` | 可用金额 |
| `interest_collection_amount` | `interest_collection_amount` | `interestCollectionAmount` | 收息金额(协议币种) |
| `adjusted_interest_amount` | `adjusted_interest_amount` | `adjustedInterestAmount` | 调整后收息金额(协议币种) |
| `valuation_amount` | `valuation_amount` | `valuationAmount` | 估值金额 |
| `near_balance` | `near_balance` | `nearBalance` | 合约近端余额 |
| `far_balance` | `far_balance` | `farBalance` | 合约远端余额 |
| `near_transaction_amount` | `near_transaction_amount` | `nearTransactionAmount` | 近端已交易金额 |
| `far_transaction_amount` | `far_transaction_amount` | `farTransactionAmount` | 远端已交易金额 |
| `near_closed_amount` | `near_closed_amount` | `nearClosedAmount` | 近端已平仓金额 |
| `far_closed_amount` | `far_closed_amount` | `farClosedAmount` | 远端已平仓金额 |
| `near_delivered_amount` | `near_delivered_amount` | `nearDeliveredAmount` | 近端已交割金额 |
| `far_delivered_amount` | `far_delivered_amount` | `farDeliveredAmount` | 远端已交割金额 |
| `purchase_money` | `purchase_money` | `purchaseMoney` | 买入金额 |
| `sold_money` | `sold_money` | `soldMoney` | 卖出金额 |
| `reduce_principal_amount` | `reduce_principal_amount` | `reducePrincipalAmount` | 减免本金 |
| `vf_reduce_principal_amount` | `vf_reduce_principal_amount` | `vfReducePrincipalAmount` | 已核销减免本金 |
| `reduce_interest_amount` | `reduce_interest_amount` | `reduceInterestAmount` | 减免利息 |
| `vf_reduce_interest_amount` | `vf_reduce_interest_amount` | `vfReduceInterestAmount` | 已核销减免利息 |
| `underwriting_rate` | `underwriting_rate` | `underwritingRate` | 承销费率(%) |
| `underwriting_amount_protocol` | `underwriting_amount_protocol` | `underwritingAmountProtocol` | 费用金额(协议币种) |
| `reservation_price` | `reservation_price` | `reservationPrice` | 留购价款 |
| `release_apply_bond_amount` | `release_apply_bond_amount` | `releaseApplyBondAmount` | 记录当前释放的融资申请债券注册登记额度 |
| `underwriting_amount_capital` | `underwriting_amount_capital` | `underwritingAmountCapital` | 承销费(付费币种) |
| `underwriting_amount_local` | `underwriting_amount_local` | `underwritingAmountLocal` | 承销费(本币币种) |
| `funds_used_scale` | `funds_used_scale` | `fundsUsedScale` | 资金占用规模 |
| `quota_occupation_scale` | `quota_occupation_scale` | `quotaOccupationScale` | 额度占用规模 |
| `time_point_position_scale` | `time_point_position_scale` | `timePointPositionScale` | 时点持仓规模 |
| `market_reference_price_fixed_rate` | `market_reference_price_fixed_rate` | `marketReferencePriceFixedRate` | 市场参考价(固定利率) |
| `market_reference_price_float_rate` | `market_reference_price_float_rate` | `marketReferencePriceFloatRate` | 市场参照价(浮动利率) |
| `handicap` | `handicap` | `handicap` | 差点(bps) |
| `tjtd_in_use_amount` | `tjtd_in_use_amount` | `tjtdInUseAmount` | 已占用金额(协议币种) |
| `tjtd_release_amount` | `tjtd_release_amount` | `tjtdReleaseAmount` | 已释放金额(协议币种) |
| `lock_amount` | `lock_amount` | `lockAmount` | 已锁定金额(协议币种) |
| `penalty_float_percent` | `penalty_float_percent` | `penaltyFloatPercent` | 罚息上浮比例(%) |
| `penalty_rate` | `penalty_rate` | `penaltyRate` | 罚息利率(%) |
| `compound_float_percent` | `compound_float_percent` | `compoundFloatPercent` | 复利上浮比例(%) |
| `compound_rate` | `compound_rate` | `compoundRate` | 复利利率(%) |
| `purchaseAmount` | `purchaseAmount` | `purchaseAmount` | 申购金额(协议币种) |
| `advance_interest_protocol` | `advance_interest_protocol` | `advanceInterestProtocol` | 垫付利息(协议币种) |
| `advance_interest_principal` | `advance_interest_principal` | `advanceInterestPrincipal` | 垫付利息(本金币种) |
| `advance_interest_local` | `advance_interest_local` | `advanceInterestLocal` | 垫付利息(本币币种) |
| `combined_ratio` | `combined_ratio` | `combinedRatio` | 综合成本率(%) |
| `init_wt_amt_int_ccy` | `init_wt_amt_int_ccy` | `initWtAmtIntCcy` | 期初预提金额(计息币种) |
| `init_un_wt_amt_int_ccy` | `init_un_wt_amt_int_ccy` | `initUnWtAmtIntCcy` | 期初未核销金额(计息币种) |
| `declared_interest_capital` | `declared_interest_capital` | `declaredInterestCapital` | 已宣告未发放的利息(本金币种) |
| `declared_interest_local` | `declared_interest_local` | `declaredInterestLocal` | 已宣告未发放的利息(本币币种) |
| `declared_interest_protocol` | `declared_interest_protocol` | `declaredInterestProtocol` | 已宣告未发放的利息(协议币种) |
| `fair_value` | `fair_value` | `fairValue` | 公允价值 |
| `purchase_num` | `purchase_num` | `purchaseNum` | 申购数量 |
| `real_pay_amount_capital` | `real_pay_amount_capital` | `realPayAmountCapital` | 实付金额(本金币种) |
| `real_pay_amount_local` | `real_pay_amount_local` | `realPayAmountLocal` | 实付金额(本币币种) |
| `real_pay_amount_protocol` | `real_pay_amount_protocol` | `realPayAmountProtocol` | 实付金额(协议币种) |
| `real_rate` | `real_rate` | `realRate` | 实际利率(%) |
| `remain_num` | `remain_num` | `remainNum` | 剩余数量 |
| `protocol_amount` | `protocol_amount` | `protocolAmount` | 协议金额 |
| `no_return_interest` | `no_return_interest` | `noReturnInterest` | 未收利息 |
| `relation_next_amount` | `relation_next_amount` | `relationNextAmount` | 续签金额 |
| `auto_infuse_amount` | `auto_infuse_amount` | `autoInfuseAmount` | 自动融入金额 |
| `price` | `price` | `price` | 单价 |
| `num` | `num` | `num` | 数量 |
| `capital_exchange_rate` | `capital_exchange_rate` | `capitalExchangeRate` | 本金约定汇率 |
| `collected_origin_amount` | `collected_origin_amount` | `collectedOriginAmount` | 实际收款金额(本金币种) |
| `advance_principal_amount` | `advance_principal_amount` | `advancePrincipalAmount` | 已预付本金 |
| `collected_local_amount` | `collected_local_amount` | `collectedLocalAmount` | 实际收款金额(本币币种) |
| `infused_amount` | `infused_amount` | `infusedAmount` | 已融入金额 |
| `share_paid_out` | `share_paid_out` | `sharePaidOut` | 已分红份额 |
| `can_infuse_amount` | `can_infuse_amount` | `canInfuseAmount` | 可融入金额 |
| `repaid_amount` | `repaid_amount` | `repaidAmount` | 已还本金额 |
| `pay_interest_amount` | `pay_interest_amount` | `payInterestAmount` | 已付息金额 |
| `protocol_balance` | `protocol_balance` | `protocolBalance` | 协议余额 |
| `exhibition_period_amount` | `exhibition_period_amount` | `exhibitionPeriodAmount` | 展期金额 |
| `base_rate` | `base_rate` | `baseRate` | 基准利率(%) |
| `float_value` | `float_value` | `floatValue` | 浮动值 |
| `infused_num` | `infused_num` | `infusedNum` | 已交易数量 |
| `canInfuse_num` | `canInfuse_num` | `canInfuseNum` | 可交易数量 |
| `protocol_rate` | `protocol_rate` | `protocolRate` | 协议利率(%) |
| `appoint_rate` | `appoint_rate` | `appointRate` | 利息约定汇率 |
| `contract_price` | `contract_price` | `contractPrice` | 协议价格 |
| `advance_amount` | `advance_amount` | `advanceAmount` | 预付本金 |
| `infuse_capital_rate` | `infuse_capital_rate` | `infuseCapitalRate` | 本金约定汇率 |
| `finance_innate_origin_amount` | `finance_innate_origin_amount` | `financeInnateOriginAmount` | 融入金额(本金币种) |
| `exchange_rate` | `exchange_rate` | `exchangeRate` | 本币币种汇率 |
| `pay_amount` | `pay_amount` | `payAmount` | 已付费金额 |
| `finance_innate_local_amount` | `finance_innate_local_amount` | `financeInnateLocalAmount` | 融入金额(本币币种) |
| `deliverable_amount` | `deliverable_amount` | `deliverableAmount` | 可交割金额 |
| `amount_delivered` | `amount_delivered` | `amountDelivered` | 已交割金额 |
| `margin_ratio` | `margin_ratio` | `marginRatio` | 保证金比例(%) |
| `margin_amount` | `margin_amount` | `marginAmount` | 保证金金额 |
| `init_hb_amount` | `init_hb_amount` | `initHbAmount` | 期初还本金额 |
| `init_fx_amount` | `init_fx_amount` | `initFxAmount` | 期初付息金额 |
| `current_valid_rate` | `current_valid_rate` | `currentValidRate` | 最新利率(%) |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fr_define_character` | `fr_define_character` | `financingRegisterCharacterDef` | 投融资协议自定义项 |

### other (35个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `customRate` | 金融合同自定义利率 |
| `` | `` | `financingRegisterAgreement` | 金融合同关联授信 |
| `` | `` | `financingRegisterCashFlow` | 金融合同现金流 |
| `` | `` | `financingRegisterChangeDetail` | 金融合同变更明细 |
| `` | `` | `financingRegisterContract` | 金融合同关联担保 |
| `` | `` | `financingRegisterCostFlow` | 金融合同费用明细 |
| `` | `` | `financingRegisterCostSchema` | 金融合同费用方案 |
| `` | `` | `financingRegisterCurrency` | 金融合同本金币种 |
| `` | `` | `financingRegisterCustodyInstitution` | 金融合同托管机构 |
| `` | `` | `financingRegisterDebt` | 金融合同关联借据 |
| `` | `` | `financingRegisterGuarantee` | 金融合同关联保函 |
| `` | `` | `financingRegisterIBpmCurrentAuditor` | 金融合同当前审批人 |
| `` | `` | `financingRegisterIBpmStep` | 金融合同审批业务阶段 |
| `` | `` | `financingRegisterInquiry` | 询价信息 |
| `` | `` | `financingRegisterInterestAdjustment` | 金融合同利息调整生效日期 |
| `` | `` | `financingRegisterInterestCurrency` | 金融合同计息币种 |
| `` | `` | `financingRegisterInvestor` | 金融合同投资人子表 |
| `` | `` | `financingRegisterLease` | 金融合同租赁物 |
| `` | `` | `financingRegisterMargin` | 金融合同关联保证金 |
| `` | `` | `financingRegisterPartner` | 金融合同合作机构子表 |
| `` | `` | `financingRegisterProperty` | 金融合同关联物权 |
| `` | `` | `financingRegisterProtocol` | 金融合同关联协议 |
| `` | `` | `financingRegisterQuota` | 衍生品登记额度 |
| `` | `` | `financingRegisterRateChangeRecord` | 金融合同利率变更记录 |
| `` | `` | `financingRegisterReduction` | 金融合同减免信息子表 |
| `` | `` | `financingRegisterRelatedBusiness` | 衍生品登记关联业务 |
| `` | `` | `financingRegisterRepaymentPlan` | 金融合同还款计划 |
| `` | `` | `financingRegisterRiskClause` | 金融合同关联风险条款 |
| `` | `` | `financingRegisterSuperviseAccount` | 金融合同承销商子表 |
| `` | `` | `financingRegisterSyndicated` | 金融合同银团信息 |
| `` | `` | `financingRegisterUnderwriter` | 金融合同监管账户子表 |
| `` | `` | `financingRegisterWithholdingPlan` | 金融合同预提利息计划 |
| `` | `` | `investmentRegisterCheckFlow` | 金融合同核算流 |
| `` | `` | `principalAmortizationPlan` | 金融合同本金摊还计划 |
| `` | `` | `registerRelatedQuota` | 关联投资额度 |
