---
tags: [BIP, 元数据, 数据字典, tlm.financeapply.FinanceApply]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 融入申请 (`tlm.financeapply.FinanceApply`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_financeapply` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：`ada0230b-23eb-495b-9b13-599422dfbc73`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 融入申请 |
| 物理表 | `tlm_financeapply` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 230 个 |
| 子表 | 4 个 |
| 关联引用 | 44 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `financeApplyLease` | `tlm.financeapply.FinanceApplyLease` | composition |
| `financeApplyProtocol` | `tlm.financeapply.FinanceApplyProtocol` | composition |
| `financeApplyInvestors` | `tlm.financeapply.FinanceApplyInvestors` | composition |
| `defines` | `tlm.financeapply.FinanceApplyDefine` | composition |

## 关联引用 (44个)

| 字段名 | 引用类型 |
|--------|---------|
| `fxcustomerBankAccount` | `` |
| `fxfunctionalcurrency` | `` |
| `base_rate_type` | `tlm_interestrateRef` |
| `fxsettlemethod` | `` |
| `` | `` |
| `fxsupplierBankAccount` | `` |
| `fxourbankaccount` | `` |
| `interest_accid` | `bd_enterprisebankacctref` |
| `settlement_method` | `` |
| `accentity` | `ucf-org-center.bd_fundsorg_na` |
| `fxratetype` | `` |
| `agency_infuse_income_acc` | `` |
| `interest_currency` | `bd_currencytenantref` |
| `origin_id` | `` |
| `capital_currency` | `bd_currencytenantref` |
| `old_currency` | `` |
| `manual_associate_purchase` | `` |
| `supplier` | `` |
| `fi_define_character_def` | `` |
| `fxinterestbeartranscurrency` | `` |
| `otherAccid` | `` |
| `protocol_number` | `tlm_financingregisterRef` |
| `infuse_income_accid` | `bd_enterprisebankacctref` |
| `rrsupplierBankAccount` | `` |
| `tenant_id` | `` |
| `cashflowplanbackup` | `` |
| `cashflowplan` | `tlm_financingregister_cashflowRef` |
| `agency_interest_acc` | `` |
| `ytenant_id` | `` |
| `associate_purchase` | `` |
| `accentity_raw` | `ucf-org-center.bd_financeorgtreeref_na` |
| `bustype` | `bd_transtypelistref` |
| `exchangerate_type` | `` |
| `rrcustomerBankAccount` | `` |
| `settlement_currency` | `` |
| `agency_output_currency` | `` |
| `fxothertype_object` | `` |
| `customer` | `` |

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

> 共 230 个直连字段

### 文本字段 (83个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `code` | `code` | 单据编号 |
| `create_method` | `create_method` | `createMethod` | 生成方式 |
| `effective_doc` | `effective_doc` | `effectiveDoc` | 单据生效时机 |
| `is_effective` | `is_effective` | `isEffective` | 是否生效 |
| `is_abandoned` | `is_abandoned` | `isabandoned` | 是否废弃 |
| `initialization` | `initialization` | `initialization` | 是否初始化 |
| `vouvher_status` | `vouvher_status` | `vouvherstatus` | 单据状态 |
| `loan_interest_rate` | `loan_interest_rate` | `loanInterestRate` | 贷款利率管理id |
| `interestRateValues` | `interestRateValues` | `interestRateValues` | 现金流引用利率值集合 |
| `debtcode` | `debtcode` | `debtcode` | 借据号 |
| `debtstatus` | `debtstatus` | `debtstatus` | 借据状态 |
| `exhibition_float_type` | `exhibition_float_type` | `exhibitionfloatType` | 展期浮动方式 |
| `expire_end_type` | `expire_end_type` | `expireEndType` | 到期结束方式 |
| `endReason` | `endReason` | `endReason` | 结束原因 |
| `trans_seq_no` | `trans_seq_no` | `transSeqNo` | 银企联请求流水号 |
| `failure_reason` | `failure_reason` | `failureReason` | 失败原因 |
| `third_party_account` | `third_party_account` | `thirdPartyAccount` | 第三方账户联行号 |
| `other_type` | `other_type` | `otherType` | 对方类型 |
| `settlementId` | `settlementId` | `settlementId` | 结算单id |
| `unsettlementId` | `unsettlementId` | `unsettlementId` | 待结算id |
| `settlementbId` | `settlementbId` | `settlementbId` | 结算明细id |
| `settlementNo` | `settlementNo` | `settlementNo` | 结算单号 |
| `cf_business_type` | `cf_business_type` | `cfBusinessType` | 上个写现金流的业务类型 |
| `cf_beforebusiness_type` | `cf_beforebusiness_type` | `cfBeforeBusinessType` | 备份上个写现金流的业务类型 |
| `accounting_docId` | `accounting_docId` | `accountingDocId` | 会计平台的凭证id |
| `voucherNo` | `voucherNo` | `voucherNo` | 凭证号 |
| `manual_associate` | `manual_associate` | `manualAssociate` | 是否开启人工关联协同单据 |
| `remark1` | `remark1` | `remark1` | 备用1 |
| `remark2` | `remark2` | `remark2` | 备用2 |
| `remark3` | `remark3` | `remark3` | 备用3 |
| `born_source_system` | `born_source_system` | `bornSourceSystem` | 来源业务系统 |
| `born_source_type` | `born_source_type` | `bornSourceTyoe` | 来源业务单据 |
| `born_id` | `born_id` | `bornID` | 来源业务流水号 |
| `xyzotheraccountname` | `xyzotheraccountname` | `xyzotherAccountName` | 对方账户名称 |
| `xyzotherbankaccount` | `xyzotherbankaccount` | `xyzotherBankAccount` | 对方银行账号 |
| `xyzotheropenaccountbank` | `xyzotheropenaccountbank` | `xyzotherOpenAccountBank` | 对方账户开户行 |
| `fxsettlestatus` | `fxsettlestatus` | `fxsettleStatus` | 结算状态 |
| `fxothertype` | `fxothertype` | `fxotherType` | 对方类型 |
| `fxotheraccountname` | `fxotheraccountname` | `fxotherAccountName` | 对方账户名称 |
| `fxotherbankaccount` | `fxotherbankaccount` | `fxotherBankAccount` | 对方银行账号 |
| `fxotherbanktype` | `fxotherbanktype` | `fxotherBankType` | 对方账户银行类别 |
| `fxotheropenaccountbank` | `fxotheropenaccountbank` | `fxotherOpenAccountBank` | 对方账户开户行 |
| `fxotheraccountunitbanknum` | `fxotheraccountunitbanknum` | `fxotherAccountUnitBankNum` | 对方账户联行号 |
| `other_account_input` | `other_account_input` | `otherAccountInput` | 本方银行账户 |
| `financein_type` | `financein_type` | `financeInType` | 协议类型:0-新增,1-变更,2-备份,默认0 |
| `change_debtcode` | `change_debtcode` | `changeDebtCode` | 变更借据号 |
| `change_reason` | `change_reason` | `changeReason` | 变更原因 |
| `change_version` | `change_version` | `changeVersion` | 变更版本号 |
| `latest_version` | `latest_version` | `latestVersion` | 最新的版本号 |
| `advance_principal` | `advance_principal` | `advancePrincipal` | 是否预付本金 |
| `contract_type` | `contract_type` | `contractType` | 担保方式 |
| `allow_loan` | `allow_loan` | `allowLoan` | 允许内部借贷:yes/no |
| `capital_source` | `capital_source` | `capitalSource` | 资金来源 |
| `isRelateCheckBill` | `isRelateCheckBill` | `isRelateCheckBill` | 是否关联对账单 |
| `associated_bank_statements` | `associated_bank_statements` | `associatedBankStatements` | 关联银行对账单id |
| `associated_claim_form` | `associated_claim_form` | `associatedClaimForm` | 关联认领单id |
| `bank_transaction_num` | `bank_transaction_num` | `bankTransactionNum` | 银行交易流水号 |
| `incorporation_num` | `incorporation_num` | `incorporationNum` | 勾兑号 |
| `entry_time` | `entry_time` | `entryTime` | 入账时机 |
| `holiday_principle` | `holiday_principle` | `holidayPrinciple` | 节假日处理原则 |
| `period_head_tail` | `period_head_tail` | `periodHeadTail` | 周期首尾规则 |
| `interest_settlement_rule` | `interest_settlement_rule` | `interestSettlementRule` | 结息头尾规则 |
| `withholding_rule` | `withholding_rule` | `withholdingRule` | 预提头尾规则 |
| `source_type` | `source_type` | `sourcetype` | 上游类型 |
| `loan_code` | `loan_code` | `loanCode` | 贷款编号 |
| `auth_link` | `auth_link` | `authLink` | 认证链接 |
| `is_sync_purchase` | `is_sync_purchase` | `isSyncPurchase` | 协同生成申购申请 |
| `ori_bill_no` | `ori_bill_no` | `oriBillNo` | 来源单据编号 |
| `ori_business_no` | `ori_business_no` | `oriBusinessNo` | 来源业务编号 |
| `term_unit` | `term_unit` | `financeintermUnit` | 融入期限类型 |
| `term` | `term` | `financeinterm` | 融入期限 |
| `remark` | `remark` | `remark` | 备注 |
| `register_creat_flag` | `register_creat_flag` | `registerCreatFlag` | 是否自动生成融入登记 |
| `direct_connection` | `direct_connection` | `directConnection` | 是否直连 |
| `` | `creator` | `creator` | 创建人 |
| `modifyStatus` | `modifyStatus` | `modifyStatus` | 协同后是否有修改 |
| `` | `modifier` | `modifier` | 修改人 |
| `` | `auditor` | `auditor` | 审批人 |
| `float_type` | `float_type` | `floatType` | 浮动方式 |
| `third_account` | `third_account` | `thirdAccout` | 第三方银行账号 |
| `third_banktype` | `third_banktype` | `thirdBanktype` | 第三方账户名称 |
| `third_number` | `third_number` | `thirdNumber` | 第三方账户开户行 |
| `sync_msg` | `sync_msg` | `syncMsg` | 协同失败原因 |

### 引用字段 (39个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 资金组织 |
| `associate_purchase` | `associate_purchase` | `associatePurchase` | 协同到申购后申购的id |
| `protocol_number` | `protocol_number` | `protocolNumber` | 融资协议id |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `cashflowplanbackup` | `cashflowplanbackup` | `cashflowplanbackup` | 现金流计划备份 |
| `old_currency` | `old_currency` | `oldcurrency` | 本币币种 |
| `exchangerate_type` | `exchangerate_type` | `exchangerateType` | 本币币种汇率类型 |
| `settlement_method` | `settlement_method` | `settlementMethod` | 结算方式 |
| `rrsupplierBankAccount` | `rrsupplierBankAccount` | `rrsupplierBankAccount` | 融入供应商银行账号 |
| `rrcustomerBankAccount` | `rrcustomerBankAccount` | `rrcustomerBankAccount` | 融入客户银行账号 |
| `manual_associate_purchase` | `manual_associate_purchase` | `manualassociatePurchase` | 手动协同到申购后申购的id |
| `otherAccid` | `otherAccid` | `otherAccid` | 对方银行账户 |
| `fxinterestbeartranscurrency` | `fxinterestbeartranscurrency` | `fxinterestBearTransCurrency` | 计息交易币种 |
| `fxfunctionalcurrency` | `fxfunctionalcurrency` | `fxfunctionalCurrency` | 本币币种 |
| `fxratetype` | `fxratetype` | `fxrateType` | 汇率类型 |
| `fxsettlemethod` | `fxsettlemethod` | `fxsettleMethod` | 结算方式 |
| `fxourbankaccount` | `fxourbankaccount` | `fxourBankAccount` | 本方银行账户 |
| `fxothertype_object` | `fxothertype_object` | `fxotherTypeObject` | 资金业务对象银行账户id |
| `fxsupplierBankAccount` | `fxsupplierBankAccount` | `fxsupplierBankAccount` | 付息供应商银行账号 |
| `fxcustomerBankAccount` | `fxcustomerBankAccount` | `fxcustomerBankAccount` | 付息客户银行账号 |
| `origin_id` | `origin_id` | `originId` | 变更关联的原借据id |
| `supplier` | `supplier` | `supplier` | 供应商id |
| `customer` | `customer` | `customer` | 客户id |
| `agency_infuse_income_acc` | `agency_infuse_income_acc` | `agencyInfuseIncomeAcc` | 代理收入账户 |
| `agency_interest_acc` | `agency_interest_acc` | `agencyInterestAcc` | 代理付息账户 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `cashflowplan` | `cashflowplan` | `cashflowplan` | 现金流计划ID |
| `capital_currency` | `capital_currency` | `capitalCurrency` | 本金币种id |
| `bustype` | `bustype` | `bustype` | 交易类型id |
| `base_rate_type` | `base_rate_type` | `baseRateType` | 基准利率类型id |
| `interest_currency` | `interest_currency` | `interestCurrency` | 计息币种id |
| `interest_accid` | `interest_accid` | `interestAccid` | 计息账户id |
| `infuse_income_accid` | `infuse_income_accid` | `infuseIncomeAccid` | 收入账户ID |
| `agency_output_currency` | `agency_output_currency` | `agencyOutputCurrency` | 代理支出账户币种 |
| `settlement_currency` | `settlement_currency` | `settlementCurrency` | 结算币种 |

### 日期字段 (23个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `exhibition_period_end_date` | `exhibition_period_end_date` | `exhibitionPeriodEndDate` | 展期后到期日 |
| `endDate` | `endDate` | `endDate` | 结束日期 |
| `last_fx_date` | `last_fx_date` | `lastfxdate` | 上次付息日 |
| `last_hb_date` | `last_hb_date` | `lasthbdate` | 上次还本日 |
| `first_financeinexpire_date` | `first_financeinexpire_date` | `firstfinanceinexpireDate` | 融入到期日期(初始) |
| `settlementDate` | `settlementDate` | `settlementDate` | 单结算日期 |
| `fxbegindate` | `fxbegindate` | `fxbegindate` | 付息起息日 |
| `fxenddate` | `fxenddate` | `fxenddate` | 付息止息日 |
| `amortized_cost_update_date` | `amortized_cost_update_date` | `amortizedCostUpdateDate` | 摊余成本更新日期 |
| `withholding_interest_date` | `withholding_interest_date` | `withholdingInterestDate` | 预提起息日 |
| `first_accrual_date` | `first_accrual_date` | `firstAccrualDate` | 首次预提利息日 |
| `change_date` | `change_date` | `changeDate` | 变更日期 |
| `advance_date` | `advance_date` | `advanceDate` | 预付本金日期 |
| `financeindate` | `financeindate` | `financeindate` | 预计融入日期 |
| `financeinexpire_date` | `financeinexpire_date` | `financeinexpireDate` | 预计融入到期日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `first_repayment_date` | `first_repayment_date` | `firstRepaymentDate` | 首次还款日 |
| `first_effect_date` | `first_effect_date` | `firstEffectDate` | 调整首次生效日 |
| `first_payment_date` | `first_payment_date` | `firstPaymentDate` | 首次付息日 |
| `interest_rate_date` | `interest_rate_date` | `interestRateDate` | 初始利率日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isWfControlled` | `isWfControlled` | 审批流控制 |

### 枚举字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `settlement_status` | `settlement_status` | `settlementStatus` | 结算状态 |
| `is_budget` | `is_budget` | `isBudget` | 是否占用預算 |
| `term_type` | `term_type` | `termType` | 融资期限分类 |
| `cmd_push_status` | `cmd_push_status` | `cmdPushStatus` | 指令推送状态 |
| `transaction_result` | `transaction_result` | `transactionResult` | 交易结果 |
| `repayment_type` | `repayment_type` | `repaymentType` | 还款方式 |
| `repayment_cycle` | `repayment_cycle` | `repaymentCycle` | 还本周期 |
| `interest_rate_type` | `interest_rate_type` | `interestRateType` | 利率类型 |
| `year_month_day` | `year_month_day` | `yearMonthDay` | 年/月/日利率 |
| `rate_adjust_cycle` | `rate_adjust_cycle` | `rateAdjustCycle` | 利率调整周期 |
| `interest_days` | `interest_days` | `interestDays` | 计息天数 |
| `settlement_type` | `settlement_type` | `settlementType` | 结息方式 |
| `settlement_cycle` | `settlement_cycle` | `settlementCycle` | 结息周期 |
| `financeinMethod` | `financeinMethod` | `financeinMethod` | 融入方式 |
| `trustee_pay_type` | `trustee_pay_type` | `trusteePayType` | 受托支付类型 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `version` | `version` | `version` | 版本号 |
| `term_number` | `term_number` | `financeintermNumber` | 融入期限 |

### 短整数 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_status` | `audit_status` | `auditstatus` | 审批状态 |
| `voucherstatus` | `voucherstatus` | `voucherstatus` | 凭证状态 |
| `srcitem` | `srcitem` | `srcitem` | 来源系统编码 |
| `billtype` | `billtype` | `billtype` | 单据类型编码 |
| `accrual_period` | `accrual_period` | `accrualPeriod` | 预提利息周期 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `` | `returncount` | `returncount` | 退回次数 |
| `` | `status` | `status` | 单据状态 |
| `send_sync` | `send_sync` | `sendSync` | 是否协同 |

### 长整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `cf_business_id` | `cf_business_id` | `cfBusinessId` | 上个写现金流的业务id |
| `cf_beforebusiness_id` | `cf_beforebusiness_id` | `cfBeforeBusinessId` | 备份上个写现金流的业务id |
| `origin_id_bak` | `origin_id_bak` | `originIdBak` | 备份单据关联的变更单 |
| `associated_apply` | `associated_apply` | `associatedApply` | 协同来源融入申请ID |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (43个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `repaid_amount` | `repaid_amount` | `repaidAmount` | 已还本金额 |
| `pay_interest_amount` | `pay_interest_amount` | `payInterestAmount` | 已付息金额 |
| `debtbalance` | `debtbalance` | `debtbalance` | 借据余额 |
| `exhibition_period_amount` | `exhibition_period_amount` | `exhibitionPeriodAmount` | 展期金额 |
| `exhibition_float_value` | `exhibition_float_value` | `exhibitionfloatValue` | 展期浮动值 |
| `exhibition_rate` | `exhibition_rate` | `exhibitionRate` | 展期利率 |
| `firealnatoriginAmount` | `firealnatoriginAmount` | `firealnatoriginAmount` | 实际收款金额(本金币种) |
| `exchangerate` | `exchangerate` | `exchangerate` | 本币币种汇率  |
| `financeinnatlocalAmount` | `financeinnatlocalAmount` | `financeinnatlocalAmount` | 融入金额(本币币种) |
| `fireallocalAmount` | `fireallocalAmount` | `fireallocalAmount` | 实际收款金额(本币币种) |
| `ownPayAmountBB` | `ownPayAmountBB` | `ownPayAmountBB` | 自主支付金额(本币币种) |
| `realownPayAmountBJ` | `realownPayAmountBJ` | `realownPayAmountBJ` | 实际收款金额(本金币种) |
| `trusteePayAmountBB` | `trusteePayAmountBB` | `trusteePayAmountBB` | 受托支付金额(本币币种) |
| `realownPayAmountBB` | `realownPayAmountBB` | `realownPayAmountBB` | 实际收款金额(本币币种) |
| `fxamountxy` | `fxamountxy` | `fxamountxy` | 付息金额(协议币种) |
| `fxinterestcontractedrate` | `fxinterestcontractedrate` | `fxinterestContractedRate` | 利息约定汇率 |
| `fxtradeamount` | `fxtradeamount` | `fxtradeAmount` | 付息金额(计息币种) |
| `fxrate` | `fxrate` | `fxrate` | 汇率 |
| `fxfunctionalcurrencyamount` | `fxfunctionalcurrencyamount` | `fxfunctionalCurrencyAmount` | 付息金额(本币币种) |
| `tobeamortizedXYWhenNum` | `tobeamortizedXYWhenNum` | `tobeamortizedXYWhenNum` | 需摊销费用(协议币种) |
| `amortized_cost` | `amortized_cost` | `amortizedCost` | 摊余成本 |
| `realInAmountBJWhenNum` | `realInAmountBJWhenNum` | `realInAmountBJWhenNum` | 实际融入金额(本金币种) |
| `tobeamortizedBJWhenNum` | `tobeamortizedBJWhenNum` | `tobeamortizedBJWhenNum` | 需摊销费用(本金币种) |
| `realInAmountBBWhenNum` | `realInAmountBBWhenNum` | `realInAmountBBWhenNum` | 实际融入金额(本币币种) |
| `tobeamortizedBBWhenNum` | `tobeamortizedBBWhenNum` | `tobeamortizedBBWhenNum` | 需摊销费用(本币币种) |
| `real_accrual_rate` | `real_accrual_rate` | `realAccrualRate` | 实际利率(%)(每个预提周期) |
| `amortized_cost_first` | `amortized_cost_first` | `amortizedCostFirst` | 融入时摊余成本 |
| `advance_amount` | `advance_amount` | `advanceAmount` | 预付本金 |
| `can_loan_amount` | `can_loan_amount` | `canLoanAmount` | 可用金额 |
| `lock_amount` | `lock_amount` | `lockAmount` | 已锁定金额 |
| `issue_num` | `issue_num` | `issueNum` | 发行数量 |
| `financeinamount` | `financeinamount` | `financeinamount` | 融入金额(协议币种) |
| `issue_unit_price` | `issue_unit_price` | `issueunitPrice` | 发行价格 |
| `realInAmount` | `realInAmount` | `realInAmount` | 实际融入金额 |
| `financeinnatoriginAmount` | `financeinnatoriginAmount` | `financeinnatoriginAmount` | 融入金额(本金币种) |
| `realInAmountXYWhenNum` | `realInAmountXYWhenNum` | `realInAmountXYWhenNum` | 实际融入金额(协议币种) |
| `capital_exchange_rate` | `capital_exchange_rate` | `capitalExchangeRate` | 本金约定汇率(%) |
| `base_rate` | `base_rate` | `baserate` | 基准利率(%) |
| `float_value` | `float_value` | `floatValue` | 浮动值 |
| `debt_rate` | `debt_rate` | `debtRate` | 借据利率(%) |
| `appoint_rate` | `appoint_rate` | `appointRate` | 利息约定汇率 |
| `ownPayAmountBJ` | `ownPayAmountBJ` | `ownPayAmountBJ` | 自主支付金额(本金币种) |
| `trusteePayAmountBJ` | `trusteePayAmountBJ` | `trusteePayAmountBJ` | 受托支付金额(本金币种) |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fi_define_character_def` | `fi_define_character_def` | `fiDefineCharacterDef` | 融入登记特征自定义项 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |

### other (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 融入申请自由自定义项 |
| `` | `` | `financeApplyInvestors` | 投资人子表 |
| `` | `` | `financeApplyLease` | 融入申请租赁物 |
| `` | `` | `financeApplyProtocol` | 融入申请关联协议 |
