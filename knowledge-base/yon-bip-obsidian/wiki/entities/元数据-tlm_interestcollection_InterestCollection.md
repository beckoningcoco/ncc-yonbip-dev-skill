---
tags: [BIP, 元数据, 数据字典, tlm.interestcollection.InterestCollection]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 投资收息 (`tlm.interestcollection.InterestCollection`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_interestcollection` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：`f1415018-e168-4e5a-91bc-0ce292d90288`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 投资收息 |
| 物理表 | `tlm_interestcollection` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 153 个 |
| 子表 | 6 个 |
| 关联引用 | 37 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `interestCollectionTax` | `tlm.interestcollection.InterestCollectionTax` | composition |
| `interestCollectionCashFlow` | `tlm.interestcollection.InterestCollectionCashFlow` | composition |
| `intColPaymentDetail` | `tlm.interestcollection.IntColPaymentDetail` | composition |
| `interestCollectionPRCashFlow` | `tlm.interestcollection.InterestCollectionPRCashFlow` | composition |
| `intColFutureCashFlow` | `tlm.interestcollection.IntColFutureCashFlow` | composition |
| `defines` | `tlm.interestcollection.InterestCollectionDefine` | composition |

## 关联引用 (37个)

| 字段名 | 引用类型 |
|--------|---------|
| `financing_org_bank` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `base_rate_type` | `` |
| `dept_id` | `ucf-org-center.bd_adminorgsharetreeref` |
| `` | `` |
| `interest_collection_amountref` | `` |
| `profit_center` | `finbd.bd_allaccbodyref_inner` |
| `accentity` | `ucf-org-center.bd_fundsorg_na` |
| `financial_product` | `yonbip-fi-ctmtlm.tlm_financialProductRef` |
| `ratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `debt_code` | `yonbip-fi-ctmtlm.tlm_purchaseregisterRef` |
| `supplier` | `yssupplier.aa_vendor` |
| `protocol_number` | `yonbip-fi-ctmtlm.tlm_financingregisterRef` |
| `settlemethod` | `productcenter.aa_settlemethodref` |
| `tenant_id` | `` |
| `functionalcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `customer_bankacc` | `yonbip-fi-ctmtlm.aa_merchantbankref` |
| `agency_settle_interest_acc` | `yonbip-fi-ctmtlm.bd_enterprisebankacctref` |
| `ytenant_id` | `` |
| `cost_center` | `finbd.bd_costcenterref` |
| `ourbankaccount` | `yonbip-fi-ctmtlm.bd_enterprisebankacctref` |
| `accentity_raw` | `ucf-org-center.bd_financeorgtreeref_na` |
| `intColltionCharacterDef` | `` |
| `supplier_bankacc` | `yssupplier.aa_vendorbankref` |
| `protocol_currency` | `ucfbasedoc.bd_currencytenantref` |
| `bustype` | `yonbip-fi-ctmtlm.bd_transtypelistref` |
| `othertype_object` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobjbank_Ref` |
| `material` | `productcenter.productref` |
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

> 共 153 个直连字段

### 文本字段 (49个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 单据号 |
| `incorporation_num` | `incorporation_num` | `incorporationNum` | 财资统一对账码 |
| `isRelateCheckBill` | `isRelateCheckBill` | `isRelateCheckBill` | 是否关联流水 |
| `associated_bank_statements` | `associated_bank_statements` | `associatedBankStatements` | 关联银行流水ID |
| `sync_msg` | `sync_msg` | `syncMsg` | 协同失败原因 |
| `internal_acct_wr_date` | `internal_acct_wr_date` | `internalAcctWrDate` | 内部账写账日期 |
| `invoice_timing` | `invoice_timing` | `invoiceTiming` | 开票时机 |
| `is_part_interest` | `is_part_interest` | `isPartInterest` | 是否部分收息 |
| `is_endwt` | `is_endwt` | `isEndWt` | 是否末次收息且全部预提 |
| `otheropenaccountbank` | `otheropenaccountbank` | `otherOpenAccountBank` | 对方账户开户行 |
| `otheraccountunitbanknum` | `otheraccountunitbanknum` | `otherAccountUnitBankNum` | 对方账户联行号 |
| `otherbanktype` | `otherbanktype` | `otherBankType` | 对方账户银行类别 |
| `financing_org_type` | `financing_org_type` | `financingOrgType` | 投资机构类型 |
| `otheraccountname` | `otheraccountname` | `otherAccountName` | 对方账户名称 |
| `otherbankaccount` | `otherbankaccount` | `otherBankAccount` | 对方银行账号 |
| `associated_claim_form` | `associated_claim_form` | `associatedClaimForm` | 关联认领单id |
| `bankStatement_bank_ccount` | `bankStatement_bank_ccount` | `bankStatementBankAccount` | 银行流水本方银行账户 |
| `relateprcid` | `relateprcid` | `relatePRId` | 关联赎回单id |
| `bankstatement` | `bankstatement` | `bankStatement` | 银行流水(收息结算信息) |
| `unsettlement_slip_id` | `unsettlement_slip_id` | `unSettlementSlipId` | 收息待结算单id |
| `settlement_no` | `settlement_no` | `settlementNo` | 收息结算单号 |
| `voucherNo` | `voucherNo` | `voucherNo` | 凭证号 |
| `entry_time` | `entry_time` | `entryTime` | 入账时机 |
| `ourbankaccountStr` | `ourbankaccountStr` | `ourBankAccountStr` | 本方银行账号 |
| `bank_transaction_num` | `bank_transaction_num` | `bankTransactionNum` | 银行交易流水号 |
| `settlement_slip_id` | `settlement_slip_id` | `settlementSlipId` | 收息结算单id |
| `settlement_slipdetail_id` | `settlement_slipdetail_id` | `settlementSlipDetailId` | 收息结算单明细id |
| `protocol_number_version` | `protocol_number_version` | `protocolNumberVersion` | 协议版本号 |
| `accounting_docId` | `accounting_docId` | `accountingDocId` | 会计平台的凭证id |
| `cf_business_type` | `cf_business_type` | `cfBusinessType` | 上个写融入现金流的业务类型 |
| `deduct_flag` | `deduct_flag` | `deductFlag` | 是否减免 |
| `financing_org_other` | `financing_org_other` | `financingOrgForOther` | 投资机构 |
| `settle_param` | `settle_param` | `settleParam` | 是否集成资金结算 |
| `payinterest_id` | `payinterest_id` | `payinterestId` | 协同关联的付息单id |
| `payinterest_code` | `payinterest_code` | `payinterestCode` | 协同关联的付息单编码 |
| `next_intercoll_plan` | `next_intercoll_plan` | `nextInterCollPlan` | 下次收息计划 |
| `create_method` | `create_method` | `createMethod` | 生成方式 |
| `debt_offset` | `debt_offset` | `debtOffset` | 是否收益抵销 |
| `othertype` | `othertype` | `otherType` | 对方类型 |
| `relateprcno` | `relateprcno` | `relatePRNo` | 关联赎回单编号 |
| `deposit_interest_rate` | `deposit_interest_rate` | `depositInterestRate` | 存款利率管理id |
| `irate_values` | `irate_values` | `interestRateValues` | 现金流引用利率值集合 |
| `interest_ratetype` | `interest_ratetype` | `interestRateType` | 利率类型枚举 |
| `` | `creator` | `creator` | 创建人 |
| `modify_status` | `modify_status` | `modifyStatus` | 收息单是否修改过 |
| `` | `modifier` | `modifier` | 修改人 |
| `` | `auditor` | `auditor` | 审批人 |
| `postscript_info` | `postscript_info` | `postscriptInfo` | 附言 |
| `abstract_info` | `abstract_info` | `abstractInfo` | 用途 |

### 引用字段 (30个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 资金组织 |
| `bustype` | `bustype` | `bustype` | 交易类型id |
| `dept_id` | `dept_id` | `deptid` | 部门 |
| `material` | `material` | `material` | 物料 |
| `cost_center` | `cost_center` | `costCenter` | 成本中心 |
| `profit_center` | `profit_center` | `profitCenter` | 利润中心 |
| `agency_settle_interest_acc` | `agency_settle_interest_acc` | `agencySettleInterestAcc` | 代理收息账户 |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `financing_org_bank` | `financing_org_bank` | `financingOrgForBank` | 投资机构 |
| `supplier` | `supplier` | `supplier` | 供应商id |
| `financial_product` | `financial_product` | `financialProduct` | 金融产品 |
| `protocol_currency` | `protocol_currency` | `protocolCurrency` | 协议币种 |
| `interestbeartranscurrency` | `interestbeartranscurrency` | `interestBearTransCurrency` | 计息币种 |
| `customer` | `customer` | `customer` | 客户id |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `interest_collection_amountref` | `interest_collection_amountref` | `interestCollectionAmountRef` | 收息现金流 |
| `protocol_number` | `protocol_number` | `protocolNumber` | 协议号id |
| `debt_code` | `debt_code` | `debtcode` | 申购单号id |
| `functionalcurrency` | `functionalcurrency` | `functionalCurrency` | 本币币种id |
| `ratetype` | `ratetype` | `rateType` | 汇率类型id |
| `settlemethod` | `settlemethod` | `settleMethod` | 结算方式id |
| `base_rate_type` | `base_rate_type` | `baseRateType` | 基准利率种类id |
| `ourbankaccount` | `ourbankaccount` | `ourBankAccount` | 本方银行账户id |
| `othertype_object` | `othertype_object` | `otherTypeObject` | 对方账户名称id |
| `supplier_bankacc` | `supplier_bankacc` | `supplierBankAccount` | 对方账户名称id |
| `customer_bankacc` | `customer_bankacc` | `customerBankAccount` | 银行账号id |
| `` | `creatorId` | `creatorId` | 创建人id |

### 日期字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `bankStatementDate` | `bankStatementDate` | `bankStatementDate` | 银行流水交易日期 |
| `settlement_date` | `settlement_date` | `settlementDate` | 收息单结算日期 |
| `interest_collection_start_date` | `interest_collection_start_date` | `interestCollectionStartDate` | 收息起息日 |
| `interest_collection_end_date` | `interest_collection_end_date` | `interestCollectionEndDate` | 收息止息日 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `canuseflow` | `canuseflow` | `canuseflow` | 是否走审批流 |
| `if_checkbankstatement` | `if_checkbankstatement` | `ifCheckBankStatement` | 是否勾选银行流水 |
| `` | `isWfControlled` | `isWfControlled` | 审批流控制 |

### 枚举字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `settled_addition` | `settled_addition` | `settledAddition` | 已结算补单 |
| `transaction_association_method` | `transaction_association_method` | `transactionAssociationMethod` | 流水关联方式 |
| `interest_settlement_method` | `interest_settlement_method` | `interestSettlementMethod` | 结息方式 |
| `is_budget` | `is_budget` | `isBudget` | 是否占用预算 |
| `if_plan_interestcollection` | `if_plan_interestcollection` | `ifPlanInterestCollection` | 是否计划收息 |
| `settlestatus` | `settlestatus` | `settleStatus` | 结算状态 |
| `interest_settlement_rule` | `interest_settlement_rule` | `interestSettlementRule` | 结息头尾规则 |
| `rush_withholding` | `rush_withholding` | `rushWithholding` | 预提冲销方式 |

### 短整数 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_status` | `audit_status` | `auditStatus` | 单据状态 |
| `rate_ops` | `rate_ops` | `rateOps` | 汇率折算方式 |
| `` | `status` | `status` | 单据状态 |
| `returncount` | `returncount` | `returncount` | 退回次数 |
| `if_filter` | `if_filter` | `ifFilter` | 是否过滤:1是0否 |
| `send_settle` | `send_settle` | `sendSettle` | 是否发起结息:1是0否 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `voucherstatus` | `voucherstatus` | `voucherstatus` | 过账状态 |
| `srcitem` | `srcitem` | `srcitem` | 事项来源 |
| `srcEventType` | `srcEventType` | `srcEventType` | 事项类型 |
| `billtype` | `billtype` | `billtype` | 单据类型 |
| `send_sync` | `send_sync` | `sendSync` | 是否发起过协同 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `filesCount` | `filesCount` | `filesCount` | 附件数 |
| `` | `tplid` | `tplid` | 模板id |
| `cf_business_id` | `cf_business_id` | `cfBusinessId` | 上个写融入现金流的业务id |

### 数值字段 (28个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `issued_tax_money` | `issued_tax_money` | `issuedTaxMoney` | 已开税票金额 |
| `real_tax_money` | `real_tax_money` | `realTaxMoney` | 实际开票金额 |
| `wt_amt_int_ccy` | `wt_amt_int_ccy` | `wtAmtIntCcy` | 核销预提金额(计息币种) |
| `penalty_interest_pc_amount` | `penalty_interest_pc_amount` | `penaltyInterestProtocolCurrencyAmount` | 罚息金额合计(协议币种) |
| `interestcontractedrate` | `interestcontractedrate` | `interestContractedRate` | 利息约定汇率 |
| `penalty_interest_bc_amount` | `penalty_interest_bc_amount` | `penaltyInterestBearCurrencyAmount` | 罚息金额合计(计息币种) |
| `compound_interest_bc_amount` | `compound_interest_bc_amount` | `compoundInterestBearCurrencyAmount` | 复利金额合计(计息币种) |
| `compound_interest_pc_amount` | `compound_interest_pc_amount` | `compoundInterestProtocolCurrencyAmount` | 复利金额合计(协议币种) |
| `bankstatementamount` | `bankstatementamount` | `bankStatementAmount` | 银行流水金额 |
| `prdeduct_interest_at` | `prdeduct_interest_at` | `prDeductInterestAmount` | 未核销减免利息 |
| `deduct_interest_at` | `deduct_interest_at` | `deductInterestAmount` | 减免利息 |
| `investredem_rate` | `investredem_rate` | `investredemRate` | 提前赎回利率(%) |
| `interest_collection_amount` | `interest_collection_amount` | `interestCollectionAmount` | 收息金额(协议币种) |
| `tax_total_amount` | `tax_total_amount` | `taxTotalAmount` | 代扣代缴税费合计(协议币种) |
| `dt_prin_intercurramount` | `dt_prin_intercurramount` | `deductInterestInterCurrAmount` | 减免利息(计息币种) |
| `tax_interest_pa` | `tax_interest_pa` | `taxInterestProtocolAmount` | 代扣代缴税费后收息金额(协议币种) |
| `tradeamount` | `tradeamount` | `tradeAmount` | 收息金额(计息币种) |
| `debtoffset_inter_amount` | `debtoffset_inter_amount` | `debtOffsetInterestAmount` | 抵销利息(计息币种) |
| `tax_interest_bca` | `tax_interest_bca` | `taxInterestBearCurrencyAmount` | 代扣代缴税费后收息金额(计息币种) |
| `rate` | `rate` | `rate` | 汇率 |
| `functionalcurrencyamount` | `functionalcurrencyamount` | `functionalCurrencyAmount` | 收息金额(本币币种) |
| `capital_exchange_rate` | `capital_exchange_rate` | `capitalExchangeRate` | 本金约定汇率 |
| `adjust_amount_intercurr` | `adjust_amount_intercurr` | `adjustAmountInterCurr` | 调整后收息金额(计息币种) |
| `tax_interest_fca` | `tax_interest_fca` | `taxInterestFunctionCurrencyAmount` | 代扣代缴税费后收息金额(本币币种) |
| `real_amount_interCurr` | `real_amount_interCurr` | `realAmountInterCurr` | 实收利息金额(计息币种) |
| `adjust_amount` | `adjust_amount` | `adjustAmount` | 调整后收息金额(协议币种) |
| `diff_amount` | `diff_amount` | `diffAmount` | 收息调整差额(协议币种) |
| `real_amount_funCurr` | `real_amount_funCurr` | `realAmountFunCurr` | 实收利息金额(本币币种) |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `intColltionCharacterDef` | `intColltionCharacterDef` | `intColltionCharacterDef` | 投资收息自定义项 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |

### other (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 收息自定义项 |
| `` | `` | `intColFutureCashFlow` | 收息未来现金流子表 |
| `` | `` | `intColPaymentDetail` | 收款明细子表 |
| `` | `` | `interestCollectionCashFlow` | 收息现金流子表 |
| `` | `` | `interestCollectionPRCashFlow` | 收息单据勾选融入现金流子表 |
| `` | `` | `interestCollectionTax` | 收息代扣代缴税费子表 |
