---
tags: [BIP, 元数据, 数据字典, tlm.financingapply.FinancingApply]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 融资申请 (`tlm.financingapply.FinancingApply`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_financingapply` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：`fb960cf0-bf97-411c-9672-11a734f8d3ea`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 融资申请 |
| 物理表 | `tlm_financingapply` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 157 个 |
| 子表 | 15 个 |
| 关联引用 | 47 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `financingApplyCashFlow` | `tlm.financingapply.FinancingApplyCashFlow` | composition |
| `financingApplyAgreement` | `tlm.financingapply.FinancingApplyAgreement` | composition |
| `financingApplyRecord` | `tlm.financingapply.FinancingApplyRecord` | composition |
| `customRate` | `tlm.financingapply.FinancingApplyCustomRate` | composition |
| `financingApplySyndicated` | `tlm.financingapply.FinancingApplySyndicated` | composition |
| `financingApplyContract` | `tlm.financingapply.FinancingApplyContract` | composition |
| `financingApplyInterestCurrency` | `tlm.financingapply.FinancingApplyInterestCurrency` | composition |
| `defines` | `tlm.financingapply.FinancingApplyDefine` | composition |
| `financingApplyMargin` | `tlm.financingapply.FinancingApplyMargin` | composition |
| `financingApplyProperty` | `tlm.financingapply.FinancingApplyProperty` | composition |
| `financingApplyCurrency` | `tlm.financingapply.FinancingApplyCurrency` | composition |
| `financingApplyPartner` | `tlm.financingapply.FinancingApplyPartner` | composition |
| `financingApplyParity` | `tlm.financingapply.FinancingApplyParity` | composition |
| `financingApplyUnderwriter` | `tlm.financingapply.FinancingApplyUnderwriter` | composition |
| `financingApplyCustody` | `tlm.financingapply.FinancingApplyCustody` | composition |

## 关联引用 (47个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `asset_specific_plan` | `tlm_assetspecificplan_ref` |
| `activity` | `yonbip-pm-projectme.project_activity_ref` |
| `trading_market` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `financing_org_bank` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `base_rate_type` | `tlm_interestrateRef` |
| `dept_id` | `ucf-org-center.bd_adminorgsharetreeref` |
| `wbs` | `yonbip-pm-commonbd.wbs_doc_ref` |
| `accentity` | `ucf-org-center.bd_fundsorg_na` |
| `financial_product` | `tlm_financialProductRef` |
| `interest_currency` | `ucfbasedoc.bd_currencytenantref` |
| `protocol` | `` |
| `capital_currency` | `ucfbasedoc.bd_currencytenantref` |
| `supplier` | `yssupplier.aa_vendor` |
| `bond_regist_ration` | `tlm_bondregisterRef` |
| `property` | `yonbip-fi-ctmgrm.grm_propertyrightref` |
| `project_id` | `ucfbasedoc.bd_projectNewRef` |
| `old_currency` | `ucfbasedoc.bd_currencytenantref` |
| `tenant_id` | `` |
| `ytenant_id` | `` |
| `accentity_raw` | `ucf-org-center.bd_financeorgtreeref_na` |
| `protocol_currency` | `ucfbasedoc.bd_currencytenantref` |
| `bus_type` | `bd_transtypelistref` |
| `exchange_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `investment_apply` | `` |
| `relation_past_protocol` | `tlm_financingregisterRef` |
| `trustee` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `bond_class` | `tlm_bondclassdefinitionRef` |
| `fa_character_def` | `` |
| `customer` | `productcenter.aa_merchantref` |

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

> 共 157 个直连字段

### 文本字段 (57个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 单据编号 |
| `apply_type` | `apply_type` | `applyType` | 申请方式 |
| `financing_org_other` | `financing_org_other` | `financingOrgForOther` | 融资机构 |
| `fund_payment_type` | `fund_payment_type` | `fundPaymentType` | 资金支付模式 |
| `rollover_originator` | `rollover_originator` | `rolloverOriginator` | 展期发起方 |
| `frc_sync_direction` | `frc_sync_direction` | `frcSyncDirection` | 融资/投资变更发起方 |
| `is_financingregister` | `is_financingregister` | `isFinancingRegister` | 是否自动生成融资登记 |
| `cashflowplan_gen_reminders` | `cashflowplan_gen_reminders` | `cashFlowPlanGenReminders` | 现金流计划生成提醒 |
| `failure_reason` | `failure_reason` | `failureReason` | 失败原因 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `trustee_type` | `trustee_type` | `trusteeType` | 受托人机构类型 |
| `renew` | `renew` | `renew` | 是否续签 |
| `more_currency` | `more_currency` | `moreCurrency` | 是否多币种贷款 |
| `financing_org_type` | `financing_org_type` | `financingOrgType` | 融资机构类型 |
| `term_unit` | `term_unit` | `termUnit` | 期限类型 |
| `term` | `term` | `term` | 期限 |
| `term_type` | `term_type` | `termType` | 融资期限分类 |
| `repayment_type` | `repayment_type` | `repaymentType` | 还款方式 |
| `repayment_cycle` | `repayment_cycle` | `repaymentCycle` | 还款周期 |
| `rate_type` | `rate_type` | `rateType` | 利率类型 |
| `has_debt_rating` | `has_debt_rating` | `hasDebtRating` | 是否有债项评级 |
| `interest_days` | `interest_days` | `interestDays` | 计息天数 |
| `debt_rating` | `debt_rating` | `debtRating` | 债项评级结果 |
| `loan_interest_rate` | `loan_interest_rate` | `loanInterestRate` | 现金流引用利率id集合(融资方向) |
| `deposit_interest_rate` | `deposit_interest_rate` | `depositInterestRate` | 现金流引用利率id集合(投资方向) |
| `interest_rate_values` | `interest_rate_values` | `interestRateValues` | 贷款利率管理值 |
| `year_month_day` | `year_month_day` | `yearMonthDay` | 年/月/日利率 |
| `fp_sync_direction` | `fp_sync_direction` | `fpSyncDirection` | 融入/申购发起方 |
| `ri_sync_direction` | `ri_sync_direction` | `riSyncDirection` | 还本/赎回发起方 |
| `float_type` | `float_type` | `floatType` | 浮动方式 |
| `pi_sync_direction` | `pi_sync_direction` | `piSyncDirection` | 付息/收息发起方 |
| `rate_adjust_cycle` | `rate_adjust_cycle` | `rateAdjustCycle` | 利率调整周期 |
| `red_sync_direction` | `red_sync_direction` | `redSyncDirection` | 融资/贷款减免协同方向 |
| `settlement_type` | `settlement_type` | `settlementType` | 结息方式 |
| `fpc_sync_direction` | `fpc_sync_direction` | `fpcSyncDirection` | 融入/申购变更发起方 |
| `settlement_cycle` | `settlement_cycle` | `settlementCycle` | 结息周期 |
| `call_option` | `call_option` | `callOption` | 是否有赎回选择权 |
| `contract_originator` | `contract_originator` | `contractOriginator` | 合同发起方 |
| `if_direct_connection` | `if_direct_connection` | `ifDirectConnection` | 是否直联 |
| `source` | `source` | `source` | 来源 |
| `month_adjust_date` | `month_adjust_date` | `monthAdjustDate` | 月末日期调整(还款) |
| `create_method` | `create_method` | `createMethod` | 生成方式 |
| `bill_effective_time` | `bill_effective_time` | `billEffectiveTime` | 单据生效时机 |
| `if_effective` | `if_effective` | `ifEffective` | 是否生效 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `sync_accessory` | `sync_accessory` | `syncAccessory` | 是否协同附件 |
| `contract_type` | `contract_type` | `contractType` | 担保方式 |
| `` | `creator` | `creator` | 创建人 |
| `` | `auditor` | `auditor` | 审批人 |
| `normal_interes_base` | `normal_interes_base` | `normalInteresBase` | 正常还本计息基数 |
| `interes_base` | `interes_base` | `interesBase` | 提前还本计息基数 |
| `month_interest_adjust_date` | `month_interest_adjust_date` | `monthInterestAdjustDate` | 月末日期调整(计息) |
| `included_expiration_date` | `included_expiration_date` | `includedExpirationDate` | 是否含到期日 |
| `auto_generate_contract` | `auto_generate_contract` | `autoGenerateContract` | 是否自动生成合同:是yes、否-no |
| `far_delivery_method` | `far_delivery_method` | `farDeliveryMethod` | 融资业务：保理公开类型：公开保理、隐蔽保理 |
| `far_trade_direction` | `far_trade_direction` | `farTradeDirection` | 融资业务：保理追索权类型（枚举）：有追索权yes、无追索no |
| `sync_msg` | `sync_msg` | `syncMsg` | 协同失败原因 |

### 引用字段 (31个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 资金组织 |
| `financial_product` | `financial_product` | `financialProduct` | 金融产品id |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `protocol` | `protocol` | `protocol` | 协议 |
| `investment_apply` | `investment_apply` | `investmentApply` | 投资申请id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `asset_specific_plan` | `asset_specific_plan` | `assetSpecificPlan` | 资产专项计划id |
| `trustee` | `trustee` | `trustee` | 受托人id |
| `bond_class` | `bond_class` | `bondClass` | 债券类别id |
| `trading_market` | `trading_market` | `tradingMarket` | 交易市场id |
| `relation_past_protocol` | `relation_past_protocol` | `relationPastProtocol` | 关联原协议id |
| `property` | `property` | `property` | 关联物权id |
| `financing_org_bank` | `financing_org_bank` | `financingOrgForBank` | 融资机构ID |
| `protocol_currency` | `protocol_currency` | `protocolCurrency` | 协议币种id |
| `customer` | `customer` | `customer` | 客户id |
| `supplier` | `supplier` | `supplier` | 供应商id |
| `capital_currency` | `capital_currency` | `capitalCurrency` | 本金币种id |
| `old_currency` | `old_currency` | `oldCurrency` | 本币币种ID |
| `exchange_rate_type` | `exchange_rate_type` | `exchangeRateType` | 本币币种汇率类型ID |
| `base_rate_type` | `base_rate_type` | `baseRateType` | 基准利率类型id |
| `bond_regist_ration` | `bond_regist_ration` | `bondRegistration` | 债券注册登记id |
| `interest_currency` | `interest_currency` | `interestCurrency` | 计息币种id |
| `bus_type` | `bus_type` | `bustype` | 交易类型id |
| `project_id` | `project_id` | `projectid` | 项目id |
| `wbs` | `wbs` | `wbs` | WBSid |
| `activity` | `activity` | `activity` | 活动id |
| `dept_id` | `dept_id` | `deptid` | 部门id |

### 日期字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `standard_expire_date` | `standard_expire_date` | `standardExpireDate` | 预计到期日期 |
| `begin_date` | `begin_date` | `beginDate` | 开始日期 |
| `expire_date` | `expire_date` | `expireDate` | 到期日期 |
| `first_repayment_date` | `first_repayment_date` | `firstRepaymentDate` | 首次还款日 |
| `first_effect_date` | `first_effect_date` | `firstEffectDate` | 调整首次生效日 |
| `first_payment_date` | `first_payment_date` | `firstPaymentDate` | 首次付息日 |
| `redeem_date` | `redeem_date` | `redeemDate` | 赎回日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isWfControlled` | `isWfControlled` | 审批流控制 |
| `canuseflow` | `canuseflow` | `canuseflow` | 是否走审批流 |

### 枚举字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cmd_push_status` | `cmd_push_status` | `cmdPushStatus` | 指令发送状态 |
| `transaction_result` | `transaction_result` | `transactionResult` | 交易结果 |
| `is_budget` | `is_budget` | `isBudget` | 是否占用预算 |
| `period_head_tail` | `period_head_tail` | `periodHeadTail` | 周期首尾规则 |
| `holiday_principle` | `holiday_principle` | `holidayPrinciple` | 节假日处理原则 |
| `interest_settlement_rule` | `interest_settlement_rule` | `interestSettlementRule` | 结息头尾规则 |
| `holiday_interest_principle` | `holiday_interest_principle` | `holidayInterestPrinciple` | 节假日计息原则 |
| `interest_accrual_days_in` | `interest_accrual_days_in` | `interestAccrualDaysIn` | 衍生品：计息天数；投融资：计息算法 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `term_number` | `term_number` | `termNumber` | 期限 |
| `grace_period` | `grace_period` | `gracePeriod` | 宽限期(天) |

### 短整数 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_status` | `audit_status` | `auditStatus` | 审批状态 |
| `apply_status` | `apply_status` | `applyStatus` | 是否废弃 |
| `change_status` | `change_status` | `changeStatus` | 变更状态 |
| `is_backup` | `is_backup` | `isBackup` | 备份标识 |
| `` | `returncount` | `returncount` | 退回次数 |
| `` | `status` | `status` | 单据状态 |
| `lend_by_trustee` | `lend_by_trustee` | `lendByTrustee` | 是否通过受托人放款 |
| `send_sync` | `send_sync` | `sendSync` | 是否发起协同 |
| `receive_sync` | `receive_sync` | `receiveSync` | 接收协同状态 |
| `` | `verifystate` | `verifystate` | 审批状态 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `change_id` | `change_id` | `changeId` | 变更ID |
| `` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | ID |

### 数值字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `infuse_capital_rate` | `infuse_capital_rate` | `infuseCapitalRate` | 本金约定汇率 |
| `finance_innate_local_amount` | `finance_innate_local_amount` | `financeInnateLocalAmount` | 融入金额(本币币种) |
| `price` | `price` | `price` | 单价 |
| `num` | `num` | `num` | 数量 |
| `protocol_amount` | `protocol_amount` | `protocolAmount` | 协议金额 |
| `capital_exchange_rate` | `capital_exchange_rate` | `capitalExchangeRate` | 本金约定汇率 |
| `exchange_rate` | `exchange_rate` | `exchangeRate` | 本币币种汇率 |
| `underwriting_rate` | `underwriting_rate` | `underwritingRate` | 承销费率(%) |
| `base_rate` | `base_rate` | `baseRate` | 基准利率(%) |
| `float_value` | `float_value` | `floatValue` | 浮动值 |
| `protocol_rate` | `protocol_rate` | `protocolRate` | 预计利率(%) |
| `appoint_rate` | `appoint_rate` | `appointRate` | 利息约定汇率 |
| `available_balance` | `available_balance` | `availableBalance` | 剩余可用额度 |

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
| `fa_character_def` | `fa_character_def` | `faCharacterDef` | 融资申请自定义项 |

### other (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `customRate` | 自定义利率 |
| `` | `` | `defines` | 融资申请自定义项 |
| `` | `` | `financingApplyAgreement` | 融资申请关联授信 |
| `` | `` | `financingApplyCashFlow` | 融资申请现金流 |
| `` | `` | `financingApplyContract` | 融资申请关联担保 |
| `` | `` | `financingApplyCurrency` | 融资申请本金币种 |
| `` | `` | `financingApplyCustody` | 融资申请托管机构 |
| `` | `` | `financingApplyInterestCurrency` | 融资申请计息币种 |
| `` | `` | `financingApplyMargin` | 融资申请关联保证金 |
| `` | `` | `financingApplyParity` | 比价信息子表 |
| `` | `` | `financingApplyPartner` | 合作机构子表 |
| `` | `` | `financingApplyProperty` | 融资申请关联物权 |
| `` | `` | `financingApplyRecord` | 申请明细子表 |
| `` | `` | `financingApplySyndicated` | 银团贷款子表字段 |
| `` | `` | `financingApplyUnderwriter` | 承销商子表 |
