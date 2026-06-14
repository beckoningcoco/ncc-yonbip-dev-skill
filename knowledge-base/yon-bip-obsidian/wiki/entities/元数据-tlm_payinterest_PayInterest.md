---
tags: [BIP, 元数据, 数据字典, tlm.payinterest.PayInterest]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 融资付息 (`tlm.payinterest.PayInterest`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_payinterest` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：`d756734d-c2cc-4b25-aa90-4017101ed0cc`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 融资付息 |
| 物理表 | `tlm_payinterest` |
| domain/服务域 | `yonbip-fi-ctmtlm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `TLM` |
| 直连字段 | 160 个 |
| 子表 | 8 个 |
| 关联引用 | 40 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `payInterestFinanceInCashFlow` | `tlm.payinterest.PayInterestFinanceInCashFlow` | composition |
| `payInterestCashFlow` | `tlm.payinterest.PayInterestCashFlow` | composition |
| `payIntFutureCashFlow` | `tlm.payinterest.PayIntFutureCashFlow` | composition |
| `payIntTaxReceiptInformation` | `tlm.payinterest.PayIntTaxReceiptInformation` | composition |
| `payIntPaymentDetail` | `tlm.payinterest.PayIntPaymentDetail` | composition |
| `payinterestTax` | `tlm.payinterest.PayinterestTax` | composition |
| `piSumCashFlow` | `tlm.payinterest.PiSumCashFlow` | composition |
| `defines` | `tlm.payinterest.PayInterestDefine` | composition |

## 关联引用 (40个)

| 字段名 | 引用类型 |
|--------|---------|
| `payInterestAmountRef` | `` |
| `financing_org_bank` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `base_rate_type` | `` |
| `payIntCharacterDef` | `` |
| `dept_id` | `ucf-org-center.bd_adminorgsharetreeref` |
| `` | `` |
| `profit_center` | `finbd.bd_allaccbodyref_inner` |
| `accentity` | `ucf-org-center.bd_fundsorg_na` |
| `financial_product` | `yonbip-fi-ctmtlm.tlm_financialProductRef` |
| `ratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `debt_code` | `yonbip-fi-ctmtlm.tlm_financeinRef` |
| `supplier` | `yssupplier.aa_vendor` |
| `protocol_number` | `yonbip-fi-ctmtlm.tlm_financingregisterRef` |
| `settlemethod` | `productcenter.aa_settlemethodref` |
| `tenant_id` | `` |
| `functionalcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `abs_repaymentid` | `` |
| `customer_bankacc` | `yonbip-fi-ctmtlm.aa_merchantbankref` |
| `agency_settle_interest_acc` | `yonbip-fi-ctmtlm.bd_enterprisebankacctref` |
| `ytenant_id` | `` |
| `cost_center` | `finbd.bd_costcenterref` |
| `ourbankaccount` | `yonbip-fi-ctmtlm.bd_enterprisebankacctref` |
| `accentity_raw` | `ucf-org-center.bd_financeorgtreeref_na` |
| `supplier_bankacc` | `yssupplier.aa_vendorbankref` |
| `protocol_currency` | `ucfbasedoc.bd_currencytenantref` |
| `bustype` | `yonbip-fi-ctmtlm.bd_transtypelistref` |
| `othertype_object` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobjbank_Ref` |
| `settlement_currency` | `ucfbasedoc.bd_currencytenantref` |
| `interestbeartranscurrency` | `ucfbasedoc.bd_currencytenantref` |
| `customer` | `productcenter.aa_merchantref` |

## 继承接口 (5个, 17字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 160 个直连字段

### 文本字段 (49个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accounting_docId` | `accounting_docId` | `accountingDocId` | 会计平台的凭证id |
| `bankstatement` | `bankstatement` | `bankStatement` | 银行对账单(付息结算信息) |
| `bank_transaction_num` | `bank_transaction_num` | `bankTransactionNum` | 银行交易流水号 |
| `cf_business_type` | `cf_business_type` | `cfBusinessType` | 上个写融入现金流的业务类型 |
| `isRelateCheckBill` | `isRelateCheckBill` | `isRelateCheckBill` | 是否关联对账单 |
| `incorporation_num` | `incorporation_num` | `incorporationNum` | 财资统一对账码 |
| `associated_bank_statements` | `associated_bank_statements` | `associatedBankStatements` | 关联银行对账单id |
| `associated_claim_form` | `associated_claim_form` | `associatedClaimForm` | 关联认领单id |
| `financing_org_other` | `financing_org_other` | `financingOrgForOther` | 融资机构 |
| `internal_acct_wr_date` | `internal_acct_wr_date` | `internalAcctWrDate` | 内部账写账日期 |
| `is_part_interest` | `is_part_interest` | `isPartInterest` | 是否部分付息 |
| `is_tax` | `is_tax` | `isTax` | 是否启用票夹 |
| `is_endwt` | `is_endwt` | `isEndWt` | 是否末次付息且全部预提 |
| `bankStatement_bank_ccount` | `bankStatement_bank_ccount` | `bankStatementBankAccount` | 银行对账单本方银行账户 |
| `relaterepaymentdocid` | `relaterepaymentdocid` | `relateRepaymentDocId` | 关联还本单id |
| `financing_org_name` | `financing_org_name` | `financingOrgName` | 融资机构 |
| `entry_time` | `entry_time` | `entryTime` | 入账时机 |
| `otheropenaccountbank` | `otheropenaccountbank` | `otherOpenAccountBank` | 对方账户开户行 |
| `otheraccountunitbanknum` | `otheraccountunitbanknum` | `otherAccountUnitBankNum` | 对方账户联行号 |
| `otherbanktype` | `otherbanktype` | `otherBankType` | 对方账户银行类别 |
| `financing_org_type` | `financing_org_type` | `financingOrgType` | 融资机构类型 |
| `otheraccountname` | `otheraccountname` | `otherAccountName` | 对方账户名称 |
| `otherbankaccount` | `otherbankaccount` | `otherBankAccount` | 对方银行账号 |
| `itcollection_code` | `itcollection_code` | `itCollectionCode` | 协同关联的收息单编码 |
| `itcollection_id` | `itcollection_id` | `itCollectionId` | 协同关联的收息单id |
| `protocol_number_version` | `protocol_number_version` | `protocolNumberVersion` | 协议版本号 |
| `settlement_no` | `settlement_no` | `settlementNo` | 付息结算单号 |
| `settlement_slipdetail_id` | `settlement_slipdetail_id` | `settlementSlipDetailId` | 付息结算单明细id |
| `settlement_slip_id` | `settlement_slip_id` | `settlementSlipId` | 付息结算单id |
| `unsettlement_slip_id` | `unsettlement_slip_id` | `unSettlementSlipId` | 付息待结算单id |
| `voucherNo` | `voucherNo` | `voucherNo` | 凭证号 |
| `code` | `code` | `code` | 单据号 |
| `deduct_flag` | `deduct_flag` | `deductFlag` | 是否减免 |
| `settle_param` | `settle_param` | `settleParam` | 是否集成资金结算 |
| `create_method` | `create_method` | `createMethod` | 生成方式 |
| `next_payinterest_plan` | `next_payinterest_plan` | `nextPayInterestPlan` | 下次付息计划 |
| `debt_offset` | `debt_offset` | `debtOffset` | 是否债务抵销 |
| `relaterepaymentdocno` | `relaterepaymentdocno` | `relateRepaymentDocNo` | 关联还本单编号 |
| `loan_interest_rate` | `loan_interest_rate` | `loanInterestRate` | 贷款利率管理id |
| `irate_values` | `irate_values` | `interestRateValues` | 现金流引用利率值集合 |
| `interest_ratetype` | `interest_ratetype` | `interestRateType` | 利率类型枚举 |
| `` | `creator` | `creator` | 创建人 |
| `modify_status` | `modify_status` | `modifyStatus` | 付息单是否修改过 |
| `` | `modifier` | `modifier` | 修改人 |
| `` | `auditor` | `auditor` | 审批人 |
| `isreserve_date` | `isreserve_date` | `isReserveDate` | 是否填写备款日期 |
| `postscript_info` | `postscript_info` | `postscriptInfo` | 附言 |
| `abstract_info` | `abstract_info` | `abstractInfo` | 用途 |
| `sync_msg` | `sync_msg` | `syncMsg` | 协同失败原因 |

### 引用字段 (31个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `dept_id` | `dept_id` | `deptid` | 部门 |
| `cost_center` | `cost_center` | `costCenter` | 成本中心 |
| `profit_center` | `profit_center` | `profitCenter` | 利润中心 |
| `agency_settle_interest_acc` | `agency_settle_interest_acc` | `agencySettleInterestAcc` | 代理付息账户 |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `financing_org_bank` | `financing_org_bank` | `financingOrgForBank` | 融资机构 |
| `supplier` | `supplier` | `supplier` | 供应商id |
| `abs_repaymentid` | `abs_repaymentid` | `aBSRepaymentId` | 专项还款登记单Id |
| `financial_product` | `financial_product` | `financialProduct` | 金融产品 |
| `protocol_currency` | `protocol_currency` | `protocolCurrency` | 协议币种 |
| `settlement_currency` | `settlement_currency` | `settlementCurrency` | 结算币种 |
| `interestbeartranscurrency` | `interestbeartranscurrency` | `interestBearTransCurrency` | 计息交易币种 |
| `customer` | `customer` | `customer` | 客户id |
| `` | `modifierId` | `modifierId` | 修改人 |
| `payInterestAmountRef` | `payInterestAmountRef` | `payInterestAmountRef` | 付息现金流 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `accentity` | `accentity` | `accentity` | 资金组织 |
| `bustype` | `bustype` | `bustype` | 交易类型id |
| `protocol_number` | `protocol_number` | `protocolNumber` | 协议号id |
| `debt_code` | `debt_code` | `debtcode` | 借据号id |
| `functionalcurrency` | `functionalcurrency` | `functionalCurrency` | 本币币种id |
| `ratetype` | `ratetype` | `rateType` | 汇率类型id |
| `settlemethod` | `settlemethod` | `settleMethod` | 结算方式id |
| `othertype_object` | `othertype_object` | `otherTypeObject` | 对方账户名称id |
| `base_rate_type` | `base_rate_type` | `baseRateType` | 基准利率种类id |
| `ourbankaccount` | `ourbankaccount` | `ourBankAccount` | 本方银行账户id |
| `supplier_bankacc` | `supplier_bankacc` | `supplierBankAccount` | 对方账户名称id |
| `customer_bankacc` | `customer_bankacc` | `customerBankAccount` | 对方银行账号id |

### 日期字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bankStatementDate` | `bankStatementDate` | `bankStatementDate` | 银行对账单交易日期 |
| `settlement_date` | `settlement_date` | `settlementDate` | 付息单结算日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `pay_interest_start_date` | `pay_interest_start_date` | `payInsterestStartDate` | 付息起息日 |
| `pay_interest_end_date` | `pay_interest_end_date` | `payInsterestEndDate` | 付息止息日 |
| `expect_date` | `expect_date` | `expectDate` | 期望付款日 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `reserve_date` | `reserve_date` | `reserveDate` | 备款日期 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `if_checkbankstatement` | `if_checkbankstatement` | `ifCheckBankStatement` | 是否勾选银行对账单 |
| `canuseflow` | `canuseflow` | `canuseflow` | 是否走审批流 |
| `` | `isWfControlled` | `isWfControlled` | 审批流控制 |

### 枚举字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sum_pi_mode` | `sum_pi_mode` | `sumPiMode` | 汇总付息方式 |
| `transaction_association_method` | `transaction_association_method` | `transactionAssociationMethod` | 流水关联方式 |
| `is_budget` | `is_budget` | `isBudget` | 是否占用预算 |
| `interest_settlement_method` | `interest_settlement_method` | `interestSettlementMethod` | 结息方式 |
| `if_plan_payinterest` | `if_plan_payinterest` | `ifPlanPayInsterest` | 是否计划付息 |
| `fund_payment_mode` | `fund_payment_mode` | `fundPaymentMode` | 资金支付模式 |
| `settlestatus` | `settlestatus` | `settleStatus` | 结算状态 |
| `othertype` | `othertype` | `otherType` | 对方类型 |
| `interest_settlement_rule` | `interest_settlement_rule` | `interestSettlementRule` | 结息头尾规则 |
| `rush_withholding` | `rush_withholding` | `rushWithholding` | 预提冲销方式 |
| `settled_addition` | `settled_addition` | `settledAddition` | 已结算补单 |

### 短整数 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `if_filter` | `if_filter` | `ifFilter` | 是否过滤:1是0否 |
| `send_settle` | `send_settle` | `sendSettle` | 是否发起结息:1是0否 |
| `` | `returncount` | `returncount` | 退回次数 |
| `` | `status` | `status` | 单据状态 |
| `voucherstatus` | `voucherstatus` | `voucherstatus` | 凭证状态 |
| `audit_status` | `audit_status` | `auditStatus` | 单据状态 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `srcitem` | `srcitem` | `srcitem` | 事项来源 |
| `srcEventType` | `srcEventType` | `srcEventType` | 事项类型 |
| `billtype` | `billtype` | `billtype` | 单据类型 |
| `send_sync` | `send_sync` | `sendSync` | 是否发起过协同 |
| `exchange_rate_ops` | `exchange_rate_ops` | `rateOps` | 本币币种汇率折算方式 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cf_business_id` | `cf_business_id` | `cfBusinessId` | 上个写融入现金流的业务id |
| `filesCount` | `filesCount` | `filesCount` | 附件数 |
| `` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | ID |

### 数值字段 (27个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bankstatementamount` | `bankstatementamount` | `bankStatementAmount` | 银行对账单金额 |
| `wt_amt_int_ccy` | `wt_amt_int_ccy` | `wtAmtIntCcy` | 核销预提金额(计息币种) |
| `penalty_interest_pc_amount` | `penalty_interest_pc_amount` | `penaltyInterestProtocolCurrencyAmount` | 罚息金额合计(协议币种) |
| `appoint_rate` | `appoint_rate` | `appointRate` | 利息约定汇率 |
| `penalty_interest_bc_amount` | `penalty_interest_bc_amount` | `penaltyInterestBearCurrencyAmount` | 罚息金额合计(计息币种) |
| `compound_interest_bc_amount` | `compound_interest_bc_amount` | `compoundInterestBearCurrencyAmount` | 复利金额合计(计息币种) |
| `compound_interest_pc_amount` | `compound_interest_pc_amount` | `compoundInterestProtocolCurrencyAmount` | 复利金额合计(协议币种) |
| `adjust_amount` | `adjust_amount` | `adjustAmount` | 付息调整后金额(协议币种) |
| `diff_amount` | `diff_amount` | `diffAmount` | 付息调整差额(协议币种) |
| `prdeduct_interest_at` | `prdeduct_interest_at` | `prDeductInterestAmount` | 未核销减免利息 |
| `capital_exchange_rate` | `capital_exchange_rate` | `capitalExchangeRate` | 本金约定汇率 |
| `pay_interest_amount` | `pay_interest_amount` | `payInsterestAmount` | 付息金额(协议币种) |
| `interestcontractedrate` | `interestcontractedrate` | `interestContractedRate` | 利息约定汇率 |
| `tax_total_amount` | `tax_total_amount` | `taxTotalAmount` | 代扣代缴税费合计(协议币种) |
| `deduct_interest_at` | `deduct_interest_at` | `deductInterestAmount` | 减免利息 |
| `adjust_tamount` | `adjust_tamount` | `adjustTAmount` | 付息调整后金额(计息币种) |
| `tax_interest_pa` | `tax_interest_pa` | `taxInterestProtocolAmount` | 代扣代缴税费后付息金额(协议币种) |
| `tradeamount` | `tradeamount` | `tradeAmount` | 付息金额(计息币种) |
| `tax_interest_bca` | `tax_interest_bca` | `taxInterestBearCurrencyAmount` | 代扣代缴税费后付息金额(计息币种) |
| `rate` | `rate` | `rate` | 汇率 |
| `functionalcurrencyamount` | `functionalcurrencyamount` | `functionalCurrencyAmount` | 付息金额(本币币种) |
| `pr_dt_interintercurr_amount` | `pr_dt_interintercurr_amount` | `prDeductInterestInterCurrAmount` | 未核销减免利息(计息币种) |
| `dt_prin_intercurramount` | `dt_prin_intercurramount` | `deductInterestInterCurrAmount` | 减免利息(计息币种) |
| `tax_interest_fca` | `tax_interest_fca` | `taxInterestFunctionCurrencyAmount` | 代扣代缴税费后付息金额(本币币种) |
| `debtoffset_inter_amount` | `debtoffset_inter_amount` | `debtOffsetInterestAmount` | 债务抵销利息(计息币种) |
| `real_amount_interCurr` | `real_amount_interCurr` | `realAmountInterCurr` | 实际付息金额(计息币种) |
| `real_amount_funCurr` | `real_amount_funCurr` | `realAmountFunCurr` | 实际付息金额(本币币种) |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `payIntCharacterDef` | `payIntCharacterDef` | `payIntCharacterDef` | 融资付息自定义项 |

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
| `` | `` | `defines` | 付息自定义项 |
| `` | `` | `payIntFutureCashFlow` | 付息未来现金流子表 |
| `` | `` | `payIntPaymentDetail` | 付款明细子表 |
| `` | `` | `payIntTaxReceiptInformation` | 付息税票信息 |
| `` | `` | `payInterestCashFlow` | 付息现金流子表 |
| `` | `` | `payInterestFinanceInCashFlow` | 付息单据勾选融入现金流子表 |
| `` | `` | `payinterestTax` | 付息代扣代缴税费子表 |
| `` | `` | `piSumCashFlow` | 汇总现金流明细表 |
