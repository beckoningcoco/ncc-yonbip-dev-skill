---
tags: [BIP, 元数据, 数据字典, tlm.execcontractchange.ExecContractChange]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 融入变更 (`tlm.execcontractchange.ExecContractChange`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_execcontractchange` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：`3a83aabe-c438-4eb1-aa24-fb11e890f2c9`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 融入变更 |
| 物理表 | `tlm_execcontractchange` |
| domain/服务域 | `yonbip-fi-ctmtlm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `TLM` |
| 直连字段 | 318 个 |
| 子表 | 15 个 |
| 关联引用 | 68 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `financein_checkFlow` | `tlm.execcontractchange.ExecContractChangecheckFlow` | composition |
| `financeinCostFlow` | `tlm.execcontractchange.ExecContractChangeCostFlow` | composition |
| `financein_cashflow` | `tlm.execcontractchange.ExecContractChangecashflow` | composition |
| `financeinRateChangeRecord` | `tlm.execcontractchange.ExecContractChangeRateChangeRecord` | composition |
| `financeInChange` | `tlm.execcontractchange.ExecContractChangeChange` | composition |
| `financeInInvestors` | `tlm.execcontractchange.ExecContractChangeInvestors` | composition |
| `customRate` | `tlm.execcontractchange.ExecContractChangeCustomRate` | composition |
| `financeInDebt` | `tlm.execcontractchange.ExecContractChangeDebt` | composition |
| `financeInnterestAdjustment` | `tlm.execcontractchange.ExecContractChangeInterestAdjustment` | composition |
| `financein_db` | `tlm.execcontractchange.ExecContractChangeDb` | composition |
| `financeInChangeDetail` | `tlm.execcontractchange.ExecContractChangeDetail` | composition |
| `financeInUnderwriters` | `tlm.execcontractchange.ExecContractChangeUnderwriters` | composition |
| `financeInPartners` | `tlm.execcontractchange.ExecContractChangePartners` | composition |
| `financein_sx` | `tlm.execcontractchange.ExecContractChangeSx` | composition |
| `financeInWithholdingPlan` | `tlm.execcontractchange.ExecContractChangeWithholdingPlan` | composition |

## 关联引用 (68个)

| 字段名 | 引用类型 |
|--------|---------|
| `fxcustomerBankAccount` | `` |
| `fxfunctionalcurrency` | `` |
| `base_rate_type` | `tlm_interestrateRef` |
| `` | `` |
| `fxsupplierBankAccount` | `` |
| `opposite_settle_currency` | `` |
| `accentity` | `ucf-org-center.bd_fundsorg_na` |
| `fxratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `agency_infuse_income_acc` | `bd_enterprisebankacctref` |
| `interest_currency` | `` |
| `capital_currency` | `ucfbasedoc.bd_currencytenantref` |
| `old_currency` | `` |
| `supplier` | `yssupplier.aa_vendor` |
| `fi_define_character_def` | `` |
| `fxinterestbeartranscurrency` | `` |
| `rrsupplierBankAccount` | `rrsupplierBankAccount` |
| `tenant_id` | `` |
| `cashflowplanbackup` | `tlm_financingregister_cashflowRef` |
| `cashflowplan` | `tlm_financingregister_cashflowRef` |
| `agency_interest_acc` | `bd_enterprisebankacctref` |
| `cost_center` | `finbd.bd_costcenterref` |
| `financeApply_id` | `tlm_financeapplyRef` |
| `rrcustomerBankAccount` | `` |
| `settlement_currency` | `` |
| `origin_id_bak` | `` |
| `agency_output_currency` | `ucfbasedoc.bd_currencytenantref` |
| `pay_currency` | `` |
| `fxothertype_object` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobjbank_Ref` |
| `fxsettlemethod` | `aa_settlemethodref` |
| `dept_id` | `ucf-org-center.bd_adminorgsharetreeref` |
| `profit_center` | `` |
| `fxourbankaccount` | `bd_enterprisebankacctref` |
| `interest_accid` | `bd_enterprisebankacctref` |
| `settlement_method` | `aa_settlemethodref` |
| `outlay_accid` | `bd_enterprisebankacctref` |
| `origin_id` | `yonbip-fi-ctmtlm.tlm_financeinRef` |
| `manual_associate_purchase` | `` |
| `otherAccid` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobjbank_Ref` |
| `protocol_number` | `tlm_financingregisterRef` |
| `infuse_income_accid` | `bd_enterprisebankacctref` |
| `agency_settle_interest_acc` | `bd_enterprisebankacctref` |
| `ytenant_id` | `` |
| `associate_purchase` | `tlm_purchaseregisterRef` |
| `accentity_raw` | `ucf-org-center.bd_financeorgtreeref_na` |
| `agency_income_acc` | `bd_enterprisebankacctref` |
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

> 共 318 个直连字段

### 文本字段 (86个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `abstract_info` | `abstract_info` | `abstractInfo` | 摘要 |
| `accounting_docId` | `accounting_docId` | `accountingDocId` | 会计平台的凭证id |
| `allow_loan` | `allow_loan` | `allowLoan` | 允许内部借贷:yes/no |
| `assessment_period` | `assessment_period` | `assessmentPeriod` | 分摊周期 |
| `associated_bank_statements` | `associated_bank_statements` | `associatedBankStatements` | 关联银行对账单id |
| `associated_claim_form` | `associated_claim_form` | `associatedClaimForm` | 关联认领单id |
| `auto_extension_term_unit` | `auto_extension_term_unit` | `autoExtensionTermUnit` | 期限单位 |
| `bank_transaction_num` | `bank_transaction_num` | `bankTransactionNum` | 银行交易流水号 |
| `bill_effective_time` | `bill_effective_time` | `billEffectiveTime` | 单据生效时机 |
| `born_id` | `born_id` | `bornID` | 来源业务流水号 |
| `born_source_system` | `born_source_system` | `bornSourceSystem` | 来源业务系统 |
| `born_source_type` | `born_source_type` | `bornSourceTyoe` | 来源业务单据 |
| `capital_source` | `capital_source` | `capitalSource` | 资金来源 |
| `cf_beforebusiness_type` | `cf_beforebusiness_type` | `cfBeforeBusinessType` | 备份上个写现金流的业务类型 |
| `cf_business_type` | `cf_business_type` | `cfBusinessType` | 上个写现金流的业务类型 |
| `change_debtcode` | `change_debtcode` | `changeDebtCode` | 变更借据号 |
| `change_reason` | `change_reason` | `changeReason` | 变更原因 |
| `change_version` | `change_version` | `changeVersion` | 变更版本号 |
| `change_voucher_code` | `change_voucher_code` | `changeVoucherCode` | 变更单据编码 |
| `change_voucher_type` | `change_voucher_type` | `changeVoucherType` | 变更单据类型 |
| `contract_type` | `contract_type` | `contractType` | 担保方式 |
| `debtcode` | `debtcode` | `debtcode` | 借据号 |
| `debtstatus` | `debtstatus` | `debtstatus` | 借据状态 |
| `endReason` | `endReason` | `endReason` | 结束原因 |
| `entry_time` | `entry_time` | `entryTime` | 入账时机 |
| `financein_create_method` | `financein_create_method` | `financeinCreateMethod` | 融入单生成方式 |
| `term` | `term` | `financeinterm` | 融入期限 |
| `financein_type` | `financein_type` | `financeInType` | 协议类型:0-新增,1-变更,2-备份,默认0 |
| `fxotheraccountname` | `fxotheraccountname` | `fxotherAccountName` | 对方账户名称 |
| `fxotheraccountunitbanknum` | `fxotheraccountunitbanknum` | `fxotherAccountUnitBankNum` | 对方账户联行号 |
| `fxotherbankaccount` | `fxotherbankaccount` | `fxotherBankAccount` | 对方银行账号 |
| `fxotherbanktype` | `fxotherbanktype` | `fxotherBankType` | 对方账户银行类别 |
| `fxotheropenaccountbank` | `fxotheropenaccountbank` | `fxotherOpenAccountBank` | 对方账户开户行 |
| `fxothertype` | `fxothertype` | `fxotherType` | 对方类型 |
| `fxsettlestatus` | `fxsettlestatus` | `fxsettleStatus` | 结算状态 |
| `if_direct_Connection` | `if_direct_Connection` | `ifDirectConnection` | 是否直连 |
| `included_expiration_date` | `included_expiration_date` | `includedExpirationDate` | 是否含到期日 |
| `incorporation_num` | `incorporation_num` | `incorporationNum` | 勾兑号 |
| `initialization` | `initialization` | `initialization` | 是否期初 |
| `interes_base` | `interes_base` | `interesBase` | 提前还本计息基数 |
| `interestRateValues` | `interestRateValues` | `interestRateValues` | 现金流引用利率值集合 |
| `internal_acct_wr_date` | `internal_acct_wr_date` | `internalAcctWrDate` | 内部账写账日期 |
| `is_compound_interest` | `is_compound_interest` | `isCompoundInterest` | 是否计算复利 |
| `is_effective` | `is_effective` | `isEffective` | 是否生效 |
| `is_penalty` | `is_penalty` | `isPenalty` | 是否计算罚息 |
| `isRelateCheckBill` | `isRelateCheckBill` | `isRelateCheckBill` | 是否关联对账单 |
| `latest_version` | `latest_version` | `latestVersion` | 最新的版本号 |
| `loan_interest_rate` | `loan_interest_rate` | `loanInterestRate` | 贷款利率管理id |
| `manual_associate` | `manual_associate` | `manualAssociate` | 是否开启人工关联协同单据 |
| `modifyStatus` | `modifyStatus` | `modifyStatus` | 融入单是否修改过 yes no |
| `month_adjust_date` | `month_adjust_date` | `monthAdjustDate` | 月末日期调整(还本) |
| `month_interest_adjust_date` | `month_interest_adjust_date` | `monthInterestAdjustDate` | 月末日期调整(计息) |
| `month_wh_adjust_date` | `month_wh_adjust_date` | `monthWithHoldingAdjustDate` | 月末日期调整(预提) |
| `netIdentificateCode` | `netIdentificateCode` | `netIdentificateCode` | 轧差识别码 |
| `normal_interes_base` | `normal_interes_base` | `normalInteresBase` | 正常还本计息基数 |
| `other_account_input` | `other_account_input` | `otherAccountInput` | 本方银行账户 |
| `payfee_id` | `payfee_id` | `payfeeID` | 生成付费单id |
| `postscript_info` | `postscript_info` | `postscriptInfo` | 附言 |
| `pre_debt_status` | `pre_debt_status` | `predebtstatus` | 上次借据状态 |
| `purchaseMethod` | `purchaseMethod` | `purchaseMethod` | 申购方式 |
| `register_creat_flag` | `register_creat_flag` | `registerCreatFlag` | 是否融资自动生成 |
| `remark1` | `remark1` | `remark1` | 备用1 |
| `remark2` | `remark2` | `remark2` | 备用2 |
| `remark3` | `remark3` | `remark3` | 备用3 |
| `repay_type` | `repay_type` | `repayType` | 偿还类型 |
| `settlementbId` | `settlementbId` | `settlementbId` | 结算明细id |
| `settlementId` | `settlementId` | `settlementId` | 结算单id |
| `settlementNo` | `settlementNo` | `settlementNo` | 结算单号 |
| `settle_param` | `settle_param` | `settleParam` | 结算集成参数:资金结算stwb,不结算no |
| `source_type` | `source_type` | `sourcetype` | 上游类型 |
| `third_account` | `third_account` | `thirdAccout` | 第三方银行账号 |
| `third_banktype` | `third_banktype` | `thirdBanktype` | 第三方账户名称 |
| `third_name` | `third_name` | `thirdName` | 第三方名称 |
| `third_number` | `third_number` | `thirdNumber` | 第三方账户开户行 |
| `unsettlementId` | `unsettlementId` | `unsettlementId` | 待结算id |
| `use_overdue` | `use_overdue` | `useOverdue` | 是否启用逾期 |
| `voucherNo` | `voucherNo` | `voucherNo` | 凭证号 |
| `vouvher_status` | `vouvher_status` | `vouvherstatus` | 单据状态 |
| `xyzotheraccountname` | `xyzotheraccountname` | `xyzotherAccountName` | 对方账户名称 |
| `xyzotherbankaccount` | `xyzotherbankaccount` | `xyzotherBankAccount` | 对方银行账号 |
| `xyzotheropenaccountbank` | `xyzotheropenaccountbank` | `xyzotherOpenAccountBank` | 对方账户开户行 |
| `` | `auditor` | `auditor` | 审批人名称 |
| `` | `code` | `code` | 编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `sync_msg` | `sync_msg` | `syncMsg` | 协同失败原因 |

### 引用字段 (52个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 会计主体 |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `agency_income_acc` | `agency_income_acc` | `agencyIncomeAcc` | 代理收入账户 |
| `agency_infuse_income_acc` | `agency_infuse_income_acc` | `agencyInfuseIncomeAcc` | 代理收入账户 |
| `agency_interest_acc` | `agency_interest_acc` | `agencyInterestAcc` | 代理付息账户 |
| `agency_output_currency` | `agency_output_currency` | `agencyOutputCurrency` | 代理收入账户币种 |
| `agency_settle_interest_acc` | `agency_settle_interest_acc` | `agencySettleInterestAcc` | 代理付息账户 |
| `associate_purchase` | `associate_purchase` | `associatePurchase` | 协同到申购后申购的id |
| `base_rate_type` | `base_rate_type` | `baseRateType` | 基准利率种类 |
| `bond_type` | `bond_type` | `bondType` | 债券类别 |
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `capital_currency` | `capital_currency` | `capitalCurrency` | 本金币种 |
| `cashflowplan` | `cashflowplan` | `cashflowplan` | 现金流计划 |
| `cashflowplanbackup` | `cashflowplanbackup` | `cashflowplanbackup` | 现金流计划备份 |
| `cost_center` | `cost_center` | `costCenter` | 成本中心 |
| `customer` | `customer` | `customer` | 客户id |
| `dept_id` | `dept_id` | `deptid` | 部门 |
| `exchangerate_type` | `exchangerate_type` | `exchangerateType` | 本币币种汇率类型 |
| `fee_item` | `fee_item` | `feeItem` | 付费项目 |
| `financeApply_id` | `financeApply_id` | `financeApplyID` | 融入申请单id |
| `fxothertype_object` | `fxothertype_object` | `fxotherTypeObject` | 资金业务对象银行账户id |
| `fxourbankaccount` | `fxourbankaccount` | `fxourBankAccount` | 本方银行账户 |
| `fxratetype` | `fxratetype` | `fxrateType` | 汇率类型 |
| `fxsettlemethod` | `fxsettlemethod` | `fxsettleMethod` | 结算方式 |
| `infuse_income_accid` | `infuse_income_accid` | `infuseIncomeAccid` | 收入账户 |
| `interest_accid` | `interest_accid` | `interestAccid` | 计息账户 |
| `origin_id` | `origin_id` | `originId` | 变更关联的原借据id |
| `associate_purchase_change` | `associate_purchase_change` | `associatePurchaseChange` | 协同到申购变更后申购变更的id |
| `otherAccid` | `otherAccid` | `otherAccid` | 对方银行账户 |
| `outlay_accid` | `outlay_accid` | `outlayAccid` | 支出账户 |
| `protocol_number` | `protocol_number` | `protocolNumber` | 协议号 |
| `rrsupplierBankAccount` | `rrsupplierBankAccount` | `rrsupplierBankAccount` | 融入供应商银行账号 |
| `settlement_method` | `settlement_method` | `settlementMethod` | 结算方式 |
| `supplier` | `supplier` | `supplier` | 供应商id |
| `fxcustomerBankAccount` | `fxcustomerBankAccount` | `fxcustomerBankAccount` | 付息客户银行账号 |
| `fxfunctionalcurrency` | `fxfunctionalcurrency` | `fxfunctionalCurrency` | 本币币种 |
| `fxinterestbeartranscurrency` | `fxinterestbeartranscurrency` | `fxinterestBearTransCurrency` | 计息交易币种 |
| `fxsupplierBankAccount` | `fxsupplierBankAccount` | `fxsupplierBankAccount` | 付息供应商银行账号 |
| `interest_currency` | `interest_currency` | `interestCurrency` | 计息币种 |
| `manual_associate_purchase` | `manual_associate_purchase` | `manualassociatePurchase` | 手动协同到申购后申购的id |
| `old_currency` | `old_currency` | `oldcurrency` | 本币币种 |
| `opposite_settle_currency` | `opposite_settle_currency` | `oppositeSettleCurrency` | 对方结算币种 |
| `origin_id_bak` | `origin_id_bak` | `originIdBak` | 备份单据关联融入登记单的id |
| `pay_currency` | `pay_currency` | `payCurrency` | 付费币种 |
| `profit_center` | `profit_center` | `profitCenter` | 利润中心 |
| `rrcustomerBankAccount` | `rrcustomerBankAccount` | `rrcustomerBankAccount` | 融入客户银行账号 |
| `settlement_currency` | `settlement_currency` | `settlementCurrency` | 结算币种 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |

### 日期字段 (27个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `advance_date` | `advance_date` | `advanceDate` | 预付本金日期 |
| `amortized_cost_update_date` | `amortized_cost_update_date` | `amortizedCostUpdateDate` | 摊余成本更新日期 |
| `apportion_begin_date` | `apportion_begin_date` | `apportionBeginDate` | 分摊开始日期 |
| `apportion_end_date` | `apportion_end_date` | `apportionEndDate` | 分摊结束日期 |
| `change_date` | `change_date` | `changeDate` | 变更日期 |
| `endDate` | `endDate` | `endDate` | 结束日期 |
| `exhibition_period_end_date` | `exhibition_period_end_date` | `exhibitionPeriodEndDate` | 展期后到期日 |
| `financeindate` | `financeindate` | `financeindate` | 融入日期 |
| `financeinexpire_date` | `financeinexpire_date` | `financeinexpireDate` | 融入到期日期 |
| `first_accrual_date` | `first_accrual_date` | `firstAccrualDate` | 首次预提利息日 |
| `first_assessment_date` | `first_assessment_date` | `firstAssessmentDate` | 首次分摊日 |
| `first_effect_date` | `first_effect_date` | `firstEffectDate` | 调整首次生效日期 |
| `first_financeinexpire_date` | `first_financeinexpire_date` | `firstfinanceinexpireDate` | 融入到期日期(初始) |
| `first_payment_date` | `first_payment_date` | `firstPaymentDate` | 首次付息日 |
| `first_repayment_date` | `first_repayment_date` | `firstRepaymentDate` | 首次还款日 |
| `fxbegindate` | `fxbegindate` | `fxbegindate` | 付息起息日 |
| `fxenddate` | `fxenddate` | `fxenddate` | 付息止息日 |
| `interest_rate_date` | `interest_rate_date` | `interestRateDate` | 初始利率日期 |
| `last_fx_date` | `last_fx_date` | `lastfxdate` | 上次付息日 |
| `last_hb_date` | `last_hb_date` | `lasthbdate` | 上次还本日 |
| `redempdate` | `redempdate` | `redemdate` | 赎回日期 |
| `settlementDate` | `settlementDate` | `settlementDate` | 单结算日期 |
| `withholding_interest_date` | `withholding_interest_date` | `withholdingInterestDate` | 预提起息日 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |

### 枚举字段 (33个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accrual_period` | `accrual_period` | `accrualPeriod` | 预提利息周期 |
| `allocation_type` | `allocation_type` | `allocationType` | 费用分摊类型 |
| `advance_principal` | `advance_principal` | `advancePrincipal` | 是否预付本金 |
| `exhibition_float_type` | `exhibition_float_type` | `exhibitionfloatType` | 展期浮动方式 |
| `expire_end_type` | `expire_end_type` | `expireEndType` | 到期结束方式 |
| `financeinMethod` | `financeinMethod` | `financeinMethod` | 融入方式 |
| `term_unit` | `term_unit` | `financeintermUnit` | 融入期限类型 |
| `float_type` | `float_type` | `floatType` | 浮动方式 |
| `holiday_interest_principle` | `holiday_interest_principle` | `holidayInterestPrinciple` | 节假日计息原则 |
| `holiday_principle` | `holiday_principle` | `holidayPrinciple` | 节假日处理原则 |
| `interest_days` | `interest_days` | `interestDays` | 计息天数 |
| `interest_rate_type` | `interest_rate_type` | `interestRateType` | 利率类型 |
| `interest_settlement_rule` | `interest_settlement_rule` | `interestSettlementRule` | 结息头尾规则 |
| `is_budget` | `is_budget` | `isBudget` | 是否占用預算 |
| `is_freeze_inner_account` | `is_freeze_inner_account` | `isFreezeInnerAccount` | 是否冻结内部账户 |
| `is_support_settle_center` | `is_support_settle_center` | `isSupportSettleCenter` | 是否集成结算中心 |
| `more_Currency` | `more_Currency` | `moreCurrency` | 是否多币种贷款 |
| `other_type` | `other_type` | `otherType` | 对方类型 |
| `overdue_auto_extension` | `overdue_auto_extension` | `overdueAutoExtension` | 逾期自动展期 |
| `pay_fee_same_time` | `pay_fee_same_time` | `payFeeSameTime` | 是否同时扣费 |
| `period_head_tail` | `period_head_tail` | `periodHeadTail` | 周期首尾规则 |
| `rate_adjust_cycle` | `rate_adjust_cycle` | `rateAdjustCycle` | 利率调整周期 |
| `redemption_option` | `redemption_option` | `redemptionOption` | 赎回选择权 |
| `release_budget` | `release_budget` | `releaseBudget` | 释放预算 |
| `repayment_cycle` | `repayment_cycle` | `repaymentCycle` | 还款周期 |
| `repayment_type` | `repayment_type` | `repaymentType` | 还款方式 |
| `settlement_cycle` | `settlement_cycle` | `settlementCycle` | 结息周期 |
| `settlement_status` | `settlement_status` | `settlementStatus` | 结算状态 |
| `settlement_type` | `settlement_type` | `settlementType` | 结息方式 |
| `term_type` | `term_type` | `termType` | 融资期限分类 |
| `trustee_pay_type` | `trustee_pay_type` | `trusteePayType` | 受托支付类型 |
| `withholding_rule` | `withholding_rule` | `withholdingRule` | 预提头尾规则 |
| `year_month_day` | `year_month_day` | `yearMonthDay` | 年/月/日 |

### 整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `auto_extension_term_num` | `auto_extension_term_num` | `autoExtensionTermNum` | 自动展期期限 |
| `term_number` | `term_number` | `financeintermNumber` | 融入期限数量 |
| `grace_period` | `grace_period` | `gracePeriod` | 宽限期 |
| `is_new` | `is_new` | `isNew` | 是否新单据 1-是 0或者为空-否 |
| `version` | `version` | `version` | 版本号 |

### 短整数 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `afterNetDir` | `afterNetDir` | `afterNetDir` | 轧差后收付方向 |
| `audit_status` | `audit_status` | `auditstatus` | 审批状态 |
| `billtype` | `billtype` | `billtype` | 单据类型编码 |
| `netSettleCount` | `netSettleCount` | `netSettleCount` | 轧差结算总笔数 |
| `send_sync` | `send_sync` | `sendSync` | 是否发起协同:1是0否 |
| `srcitem` | `srcitem` | `srcitem` | 来源系统编码 |
| `voucherstatus` | `voucherstatus` | `voucherstatus` | 凭证状态 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `` | `returncount` | `returncount` | 退回次数 |
| `` | `status` | `status` | 单据状态 |

### 长整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cf_beforebusiness_id` | `cf_beforebusiness_id` | `cfBeforeBusinessId` | 备份上个写现金流的业务id |
| `cf_business_id` | `cf_business_id` | `cfBusinessId` | 上个写现金流的业务id |
| `change_voucher_id` | `change_voucher_id` | `changeVoucherId` | 变更单据Id |
| `` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | 主键 |

### 数值字段 (78个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `advance_amount` | `advance_amount` | `advanceAmount` | 预付本金 |
| `advance_amount_bj` | `advance_amount_bj` | `advanceAmountBJ` | 预付本金(本金币种) |
| `afterNetAmt` | `afterNetAmt` | `afterNetAmt` | 轧差后金额 |
| `amortized_cost` | `amortized_cost` | `amortizedCost` | 摊余成本 |
| `amortized_cost_first` | `amortized_cost_first` | `amortizedCostFirst` | 融入时摊余成本 |
| `appoint_rate` | `appoint_rate` | `appointRate` | 利息约定汇率 |
| `base_rate` | `base_rate` | `baserate` | 基准利率 |
| `can_loan_amount` | `can_loan_amount` | `canLoanAmount` | 可用金额 |
| `capital_exchange_rate` | `capital_exchange_rate` | `capitalExchangeRate` | 本金约定汇率 |
| `compound_float_percent` | `compound_float_percent` | `compoundFloatPercent` | 复利上浮比例(%) |
| `compound_rate` | `compound_rate` | `compoundRate` | 复利利率(%) |
| `debtbalance` | `debtbalance` | `debtbalance` | 借据余额 |
| `debtbalance_bj` | `debtbalance_bj` | `debtbalanceBJ` | 借据余额(本金币种) |
| `debt_rate` | `debt_rate` | `debtRate` | 借据利率 |
| `exchangerate` | `exchangerate` | `exchangerate` | 本币币种汇率  |
| `exhibition_float_value` | `exhibition_float_value` | `exhibitionfloatValue` | 展期浮动值 |
| `exhibition_period_amount` | `exhibition_period_amount` | `exhibitionPeriodAmount` | 展期金额 |
| `exhibition_rate` | `exhibition_rate` | `exhibitionRate` | 展期利率 |
| `financeinamount` | `financeinamount` | `financeinamount` | 融入金额(协议币种) |
| `financeinnatlocalAmount` | `financeinnatlocalAmount` | `financeinnatlocalAmount` | 融入金额(本币币种) |
| `financeinnatoriginAmount` | `financeinnatoriginAmount` | `financeinnatoriginAmount` | 融入金额(本金币种) |
| `fireallocalAmount` | `fireallocalAmount` | `fireallocalAmount` | 实际收款金额(本币币种) |
| `firealnatoriginAmount` | `firealnatoriginAmount` | `firealnatoriginAmount` | 实际收款金额(本金币种) |
| `float_value` | `float_value` | `floatValue` | 浮动值 |
| `fxamountxy` | `fxamountxy` | `fxamountxy` | 付息金额(协议币种) |
| `fxfunctionalcurrencyamount` | `fxfunctionalcurrencyamount` | `fxfunctionalCurrencyAmount` | 付息金额(本币币种) |
| `fxinterestcontractedrate` | `fxinterestcontractedrate` | `fxinterestContractedRate` | 利息约定汇率 |
| `fxrate` | `fxrate` | `fxrate` | 汇率 |
| `fxtradeamount` | `fxtradeamount` | `fxtradeAmount` | 付息金额(计息币种) |
| `initial_interest_amt_jx` | `initial_interest_amt_jx` | `initialInterestAmtJX` | 期初付息金额(计息币种) |
| `initial_interest_amt_xy` | `initial_interest_amt_xy` | `initialInterestAmtXY` | 期初付息金额(协议币种) |
| `initial_repayment_amt_bj` | `initial_repayment_amt_bj` | `initialRepaymentAmtBJ` | 期初还本金额(本金币种) |
| `initial_repayment_amt_xy` | `initial_repayment_amt_xy` | `initialRepaymentAmtXY` | 期初还本金额(协议币种) |
| `init_un_wt_amt_int_ccy` | `init_un_wt_amt_int_ccy` | `initUnWtAmtIntCcy` | 期初未核销预提金额(计息币种) |
| `init_wt_amt_int_ccy` | `init_wt_amt_int_ccy` | `initWtAmtIntCcy` | 期初预提金额(计息币种) |
| `issue_num` | `issue_num` | `issueNum` | 发行数量 |
| `issue_unit_price` | `issue_unit_price` | `issueunitPrice` | 发行单价 |
| `lock_amount` | `lock_amount` | `lockAmount` | 已锁定金额 |
| `ownPayAmountBB` | `ownPayAmountBB` | `ownPayAmountBB` | 自主支付金额(本币币种) |
| `ownPayAmountBJ` | `ownPayAmountBJ` | `ownPayAmountBJ` | 自主支付金额(本金币种) |
| `pay_interest_amount` | `pay_interest_amount` | `payInterestAmount` | 已付息金额 |
| `pay_interest_amount_jx` | `pay_interest_amount_jx` | `payInterestAmountJX` | 已付息金额(计息币种) |
| `penalty_float_percent` | `penalty_float_percent` | `penaltyFloatPercent` | 罚息上浮比例(%) |
| `penalty_rate` | `penalty_rate` | `penaltyRate` | 罚息利率(%) |
| `real_accrual_rate` | `real_accrual_rate` | `realAccrualRate` | 实际利率(%)(每个预提周期) |
| `realInAmountBBWhenNum` | `realInAmountBBWhenNum` | `realInAmountBBWhenNum` | 实际融入金额(本币币种) |
| `realInAmountBJWhenNum` | `realInAmountBJWhenNum` | `realInAmountBJWhenNum` | 实际融入金额(本金币种) |
| `realInAmountXYWhenNum` | `realInAmountXYWhenNum` | `realInAmountXYWhenNum` | 实际融入金额(协议币种) |
| `realownPayAmountBB` | `realownPayAmountBB` | `realownPayAmountBB` | 实际收款金额(本币币种) |
| `realownPayAmountBJ` | `realownPayAmountBJ` | `realownPayAmountBJ` | 实际收款金额(本金币种) |
| `reduce_interest_amount` | `reduce_interest_amount` | `reduceInterestAmount` | 减免利息 |
| `reduce_interest_amount_jx` | `reduce_interest_amount_jx` | `reduceInterestAmountJX` | 减免利息(计息币种) |
| `reduce_principal_amount` | `reduce_principal_amount` | `reducePrincipalAmount` | 减免本金 |
| `reduce_principal_amount_bj` | `reduce_principal_amount_bj` | `reducePrincipalAmountBJ` | 减免本金(本金币种) |
| `repaid_amount` | `repaid_amount` | `repaidAmount` | 已还本金额 |
| `repaid_amount_bj` | `repaid_amount_bj` | `repaidAmountBJ` | 已还本金额(本金币种) |
| `reservation_price` | `reservation_price` | `reservationPrice` | 留购价款 |
| `settlement_nopay_amount` | `settlement_nopay_amount` | `settlementNoPayAmount` | 已结未付利息 |
| `settlement_nopay_amount_jx` | `settlement_nopay_amount_jx` | `settlementNoPayAmountJX` | 已结未付利息(计息币种) |
| `settlement_total_amount` | `settlement_total_amount` | `settlementTotalAmount` | 已结息金额 |
| `settlement_total_amount_jx` | `settlement_total_amount_jx` | `settlementTotalAmountJX` | 已结息金额(计息币种) |
| `tjtd_in_use_amount` | `tjtd_in_use_amount` | `tjtdInUseAmount` | 已占用金额(协议币种) |
| `tjtd_release_amount` | `tjtd_release_amount` | `tjtdReleaseAmount` | 已释放金额(协议币种) |
| `tobeamortizedBBWhenNum` | `tobeamortizedBBWhenNum` | `tobeamortizedBBWhenNum` | 需摊销费用(本币币种) |
| `tobeamortizedBJWhenNum` | `tobeamortizedBJWhenNum` | `tobeamortizedBJWhenNum` | 需摊销费用(本金币种) |
| `tobeamortizedXYWhenNum` | `tobeamortizedXYWhenNum` | `tobeamortizedXYWhenNum` | 需摊销费用(协议币种) |
| `trusteePayAmountBB` | `trusteePayAmountBB` | `trusteePayAmountBB` | 受托支付金额(本币币种) |
| `trusteePayAmountBJ` | `trusteePayAmountBJ` | `trusteePayAmountBJ` | 受托支付金额(本金币种) |
| `underwriting_amount` | `underwriting_amount` | `underwritingAmount` | 承销费(协议币种) |
| `underwriting_amount_capital` | `underwriting_amount_capital` | `underwritingAmountCapital` | 承销费(付费币种) |
| `underwriting_amount_local` | `underwriting_amount_local` | `underwritingAmountLocal` | 承销费(本币币种) |
| `underwriting_rate` | `underwriting_rate` | `underwritingRate` | 承销费率(%) |
| `un_wt_amt_int_ccy` | `un_wt_amt_int_ccy` | `unWtAmtTntCcy` | 未核销预提金额(计息币种) |
| `vf_reduce_interest_amount` | `vf_reduce_interest_amount` | `vfReduceInterestAmount` | 已核销减免利息 |
| `vf_reduce_interest_amount_jx` | `vf_reduce_interest_amount_jx` | `vfReduceInterestAmountJX` | 已核销减免利息(计息币种) |
| `vf_reduce_principal_amount` | `vf_reduce_principal_amount` | `vfReducePrincipalAmount` | 已核销减免本金 |
| `vf_reduce_principal_amount_bj` | `vf_reduce_principal_amount_bj` | `vfReducePrincipalAmountBJ` | 已核销减免本金(本金币种) |
| `wt_amt_int_ccy` | `wt_amt_int_ccy` | `wtAmtIntCcy` | 已预提金额(计息币种) |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fi_define_character_def` | `fi_define_character_def` | `fiDefineCharacterDef` | 融入变更自定义项 |

### timestamp (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `relate_check_bill_pubts` | `relate_check_bill_pubts` | `relateCheckBillpubts` | 银行对账单时间戳 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `customRate` | 融入变更自定义利率 |
| `` | `` | `financeInChange` | 融入变更记录表 |
| `` | `` | `financeInChangeDetail` | 融入变更变更明细 |
| `` | `` | `financeInDebt` | 融入变更关联借据 |
| `` | `` | `financeInInvestors` | 投资人子表 |
| `` | `` | `financeInPartners` | 合作机构子表 |
| `` | `` | `financeInUnderwriters` | 承销商子表 |
| `` | `` | `financeInWithholdingPlan` | 融入变更利息摊销表 |
| `` | `` | `financeInnterestAdjustment` | 融入变更利息调整生效日期 |
| `` | `` | `financeinCostFlow` | 融入变更费用明细 |
| `` | `` | `financeinRateChangeRecord` | 融入利率变更记录 |
| `` | `` | `financein_cashflow` | 融入变更现金流 |
| `` | `` | `financein_checkFlow` | 融入核算流 |
| `` | `` | `financein_db` | 融入变更关联担保 |
| `` | `` | `financein_sx` | 融入变更关联授信 |
