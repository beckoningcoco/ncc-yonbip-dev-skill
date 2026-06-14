---
tags: [BIP, 元数据, 数据字典, tlm.derivativesregister.DerivativesRegister]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 衍生品合约 (`tlm.derivativesregister.DerivativesRegister`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_derivativesregister` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：`c7e27e39-e503-496c-a59e-f09300337bcd`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 衍生品合约 |
| 物理表 | `tlm_derivativesregister` |
| domain/服务域 | `yonbip-fi-ctmtlm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `TLM` |
| 直连字段 | 266 个 |
| 子表 | 8 个 |
| 关联引用 | 53 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `financingRegisterMargin` | `tlm.derivativesregister.DerivativesRegisterMargin` | composition |
| `financingRegisterCashFlow` | `tlm.derivativesregister.DerivativesRegisterCashFlow` | composition |
| `investmentRegisterCheckFlow` | `tlm.derivativesregister.DerivativesRegisterCheckFlow` | composition |
| `financingRegisterInquiry` | `tlm.derivativesregister.DerivativesRegisterInquiry` | composition |
| `financingRegisterQuota` | `tlm.derivativesregister.DerivativesRegisterQuota` | composition |
| `principalAmortizationPlan` | `tlm.derivativesregister.PrincipalAmortizationPlan` | composition |
| `financingRegisterRelatedBusiness` | `tlm.derivativesregister.DerivativesRegisterRelatedBusiness` | composition |
| `financingRegisterAgreement` | `tlm.derivativesregister.DerivativesRegisterAgreement` | composition |

## 关联引用 (53个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `financing_org_bank` | `` |
| `exchange_rate_type_out` | `` |
| `wbs` | `` |
| `near_purchase_currency` | `` |
| `accentity` | `` |
| `near_sold_currency` | `` |
| `financial_product` | `` |
| `near_denomination_currency` | `` |
| `denomination_currency` | `` |
| `fundBusinessObject` | `` |
| `capital_currency` | `` |
| `tenant_id` | `` |
| `convertible_currency` | `` |
| `income_accid` | `` |
| `protocol_currency` | `` |
| `trade_category` | `` |
| `out_near_sold_currency` | `` |
| `out_near_denomination_currency` | `` |
| `local_accid` | `` |
| `exchange_currency_in` | `` |
| `activity` | `` |
| `base_interest_rate_type_in` | `` |
| `dept_id` | `` |
| `exchange_rate_type_in` | `` |
| `scheme_number` | `` |
| `settlement_method` | `` |
| `out_near_purchase_currency` | `` |
| `outlay_accid` | `` |
| `project_id` | `` |
| `old_currency` | `` |
| `expense_out_account_local_in` | `` |
| `infuse_capital_currency` | `` |
| `valuation_currency` | `` |
| `ytenant_id` | `` |
| `accentity_raw` | `` |
| `fr_define_character` | `` |
| `bus_type` | `` |
| `exchange_currency_out` | `` |
| `exchange_rate_type` | `` |
| `change_with_primary` | `` |
| `base_interest_rate_type_out` | `` |
| `expense_account_out` | `` |

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

> 共 266 个直连字段

### 文本字段 (81个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `advance_principal` | `advance_principal` | `advancePrincipal` | 是否摊还本金 |
| `apply_method` | `apply_method` | `applyMethod` | 申请方式 |
| `` | `auditor` | `auditor` | 审批人名称 |
| `auto_infuse_fail_reason` | `auto_infuse_fail_reason` | `autoInfuseFailReason` | 自动生单失败原因 |
| `auto_infuse_status` | `auto_infuse_status` | `autoInfuseStatus` | 自动生单状态 |
| `bak_protocol_status` | `bak_protocol_status` | `bakProtocolStatus` | 备份协议状态 |
| `before_autoend_status` | `before_autoend_status` | `beforeAutoEndStatus` | 自动结束前的合约状态 |
| `cf_business_type` | `cf_business_type` | `cfBusinessType` | 上个写现金流的业务类型 |
| `change_protocol_number` | `change_protocol_number` | `changeProtocolNumber` | 变更协议号 |
| `change_reason` | `change_reason` | `changeReason` | 变更原因 |
| `code` | `code` | `code` | 单据编号 |
| `create_method` | `create_method` | `createMethod` | 生成方式 |
| `` | `creator` | `creator` | 创建人名称 |
| `credit_occupancy_method` | `credit_occupancy_method` | `creditOccupancyMethod` | 信用占用方式 |
| `currency_pair` | `currency_pair` | `currencyPair` | 货币对 |
| `delivery_frequency` | `delivery_frequency` | `deliveryFrequency` | 交割频率 |
| `delivery_frequency_in` | `delivery_frequency_in` | `deliveryFrequencyIn` | 换入交割频率 |
| `delivery_frequency_out` | `delivery_frequency_out` | `deliveryFrequencyOut` | 换出交割频率 |
| `delivery_methods` | `delivery_methods` | `deliveryMethods` | 交割方式 |
| `deposit_receipt_number` | `deposit_receipt_number` | `depositReceiptNumber` | 备用字段 |
| `derivative_application_form` | `derivative_application_form` | `derivativeApplicationForm` | 衍生品申请单id |
| `derivative_application_form_no` | `derivative_application_form_no` | `derivativeApplicationFormNo` | 衍生品申请单编号 |
| `end_reason` | `end_reason` | `endReason` | 结束原因 |
| `expire_end_type` | `expire_end_type` | `expireEndType` | 到期结束方式 |
| `far_delivery_method` | `far_delivery_method` | `farDeliveryMethod` | 交割方式(远端) |
| `far_term_type` | `far_term_type` | `farTermType` | 期限类型(远端) |
| `far_trade_direction` | `far_trade_direction` | `farTradeDirection` | 交易方向(远端) |
| `financing_apply_code` | `financing_apply_code` | `financingApplyCode` | 流水号 |
| `financing_org_other` | `financing_org_other` | `financingOrgForOther` | 交易机构 |
| `financing_org_type` | `financing_org_type` | `financingOrgType` | 交易机构类型 |
| `floating_mode_in` | `floating_mode_in` | `floatingModeIn` | 浮动方式 |
| `floating_mode_out` | `floating_mode_out` | `floatingModeOut` | 浮动方式(换出) |
| `forward_term_type` | `forward_term_type` | `forwardTermType` | 期限类型 |
| `fund_payment_type` | `fund_payment_type` | `fundPaymentType` | 资金支付模式 |
| `if_direct_Connection` | `if_direct_Connection` | `ifDirectConnection` | 是否直连 |
| `interest_accrual_days_in` | `interest_accrual_days_in` | `interestAccrualDaysIn` | 计息天数(换入) |
| `interest_accrual_days_out` | `interest_accrual_days_out` | `interestAccrualDaysOut` | 计息天数(换出) |
| `interest_adjusting_cycle_in` | `interest_adjusting_cycle_in` | `interestAdjustingCycleIn` | 利率调整周期 |
| `interest_adjusting_cycle_out` | `interest_adjusting_cycle_out` | `interestAdjustingCycleOut` | 利率调整周期(换出) |
| `interest_rate_type_in` | `interest_rate_type_in` | `interestRateTypeIn` | 利率类型 |
| `interest_rate_type_out` | `interest_rate_type_out` | `interestRateTypeOut` | 利率类型 |
| `interest_settlement_rule_in` | `interest_settlement_rule_in` | `interestSettlementRuleIn` | 结息头尾规则 |
| `interest_settlement_rule_out` | `interest_settlement_rule_out` | `interestSettlementRuleOut` | 结息头尾规则 |
| `interest_type_in` | `interest_type_in` | `interestTypeIn` | 年/月/日利率 |
| `interest_type_out` | `interest_type_out` | `interestTypeOut` | 年/月/日利率 |
| `isInit` | `isInit` | `isInit` | 是否初始化 |
| `last_version` | `last_version` | `lastVersion` | 最新的版本号 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `near_currency_pair` | `near_currency_pair` | `nearCurrencyPair` | 货币对(近端) |
| `near_delivery_method` | `near_delivery_method` | `nearDeliveryMethod` | 交割方式(近端) |
| `near_term_type` | `near_term_type` | `nearTermType` | 期限类型(近端) |
| `near_trade_direction` | `near_trade_direction` | `nearTradeDirection` | 交易方向(近端) |
| `num_unit` | `num_unit` | `numUnit` | 数量单位 |
| `other_account` | `other_account` | `otherAccout` | 对方银行账号 |
| `other_bank` | `other_bank` | `otherBank` | 对方账户开户行 |
| `other_banktype` | `other_banktype` | `otherBanktype` | 对方账户银行类别 |
| `other_name` | `other_name` | `otherName` | 对方账户名称 |
| `other_number` | `other_number` | `otherNumber` | 对方账户联行号 |
| `other_type` | `other_type` | `otherType` | 对方类型 |
| `out_near_currency_pair` | `out_near_currency_pair` | `outNearCurrencyPair` | 货币对(远端) |
| `plan_name` | `plan_name` | `planName` | 年度交易计划名称 |
| `principal_exchange_method` | `principal_exchange_method` | `principalExchangeMethod` | 本金交换方式 |
| `product_name` | `product_name` | `productName` | 产品名称 |
| `protocol_number` | `protocol_number` | `protocolNumber` | 合约号 |
| `protocol_status` | `protocol_status` | `protocolStatus` | 合约状态 |
| `protocol_type` | `protocol_type` | `protocolType` | 合约类型：0登记、1变更、2展期、3备份 |
| `rate_adjust_cycle` | `rate_adjust_cycle` | `rateAdjustCycle` | 利率调整周期 |
| `release_bill` | `release_bill` | `releaseBill` | 预算释放单据 |
| `release_timing` | `release_timing` | `releaseTiming` | 预算释放时机 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `scheme_title` | `scheme_title` | `schemeTitle` | 方案标题 |
| `settle_param` | `settle_param` | `settleParam` | 结算集成参数:资金结算stwb,不结算no |
| `settlement_status` | `settlement_status` | `settlementStatus` | 结算状态 |
| `source` | `source` | `source` | 来源 |
| `source_type` | `source_type` | `sourcetype` | 上游类型 |
| `sync_accessory` | `sync_accessory` | `syncAccessory` | 是否协同附件/影像 |
| `term` | `term` | `term` | 宽限期 |
| `term_unit` | `term_unit` | `termUnit` | 期限单位 |
| `transaction_method` | `transaction_method` | `transactionMethod` | 交易方式 |
| `version` | `version` | `version` | 版本号 |
| `version_type` | `version_type` | `versionType` | 版本生成类型 |

### 引用字段 (44个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 资金组织 |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `activity` | `activity` | `activity` | 活动 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `base_interest_rate_type_in` | `base_interest_rate_type_in` | `baseInterestRateTypeIn` | 基准利率类型id |
| `base_interest_rate_type_out` | `base_interest_rate_type_out` | `baseInterestRateTypeOut` | 基准利率类型id |
| `bus_type` | `bus_type` | `bustype` | 交易类型ID |
| `capital_currency` | `capital_currency` | `capitalCurrency` | 本金币种ID |
| `change_with_primary` | `change_with_primary` | `changeWithPrimary` | 变更关联的原协议id |
| `convertible_currency` | `convertible_currency` | `convertibleCurrency` | 兑换币种id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `denomination_currency` | `denomination_currency` | `denominationCurrency` | 计价币种id |
| `dept_id` | `dept_id` | `deptid` | 部门ID |
| `exchange_currency_in` | `exchange_currency_in` | `exchangeCurrencyIn` | 换入币种id |
| `exchange_currency_out` | `exchange_currency_out` | `exchangeCurrencyOut` | 换出币种id |
| `exchange_rate_type` | `exchange_rate_type` | `exchangeRateType` | 本币币种汇率类型ID |
| `exchange_rate_type_in` | `exchange_rate_type_in` | `exchangeRateTypeIn` | 本币币种汇率类型ID |
| `exchange_rate_type_out` | `exchange_rate_type_out` | `exchangeRateTypeOut` | 本币币种汇率类型ID(换出) |
| `expense_account_out` | `expense_account_out` | `expenseAccountOut` | 收款账户ID |
| `expense_out_account_local_in` | `expense_out_account_local_in` | `expenseOutAccountLocalIn` | 支出账户ID |
| `financial_product` | `financial_product` | `financialProduct` | 金融产品 |
| `financing_org_bank` | `financing_org_bank` | `financingOrgForBank` | 交易机构ID |
| `fundBusinessObject` | `fundBusinessObject` | `fundBusinessObject` | 对方账户名称id |
| `income_accid` | `income_accid` | `incomeAccid` | 收入账户ID |
| `infuse_capital_currency` | `infuse_capital_currency` | `infuseCapitalCurrency` | 本金币种ID |
| `local_accid` | `local_accid` | `localAccid` | 本方账户ID |
| `` | `modifierId` | `modifierId` | 修改人 |
| `near_denomination_currency` | `near_denomination_currency` | `nearDenominationCurrency` | 计价币种ID(近端) |
| `near_purchase_currency` | `near_purchase_currency` | `nearPurchaseCurrency` | 买入/换入币种id(近端) |
| `near_sold_currency` | `near_sold_currency` | `nearSoldCurrency` | 卖出/换出币种ID(近端) |
| `old_currency` | `old_currency` | `oldCurrency` | 本币币种ID |
| `out_near_denomination_currency` | `out_near_denomination_currency` | `outNearDenominationCurrency` | 计价币种ID(远端) |
| `out_near_purchase_currency` | `out_near_purchase_currency` | `outNearPurchaseCurrency` | 买入/换入币种ID(远端) |
| `out_near_sold_currency` | `out_near_sold_currency` | `outNearSoldCurrency` | 卖出/换出币种id(远端) |
| `outlay_accid` | `outlay_accid` | `outlayAccid` | 支出账户ID |
| `project_id` | `project_id` | `projectid` | 项目ID |
| `protocol_currency` | `protocol_currency` | `protocolCurrency` | 协议币种 |
| `scheme_number` | `scheme_number` | `schemeNumber` | 方案编号id |
| `settlement_method` | `settlement_method` | `settlementMethod` | 结算方式ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `trade_category` | `trade_category` | `tradeCategory` | 标的物id |
| `valuation_currency` | `valuation_currency` | `valuationCurrency` | 估值币种id |
| `wbs` | `wbs` | `wbs` | wbs |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (34个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `begin_date` | `begin_date` | `beginDate` | 开始日期 |
| `change_date` | `change_date` | `changeDate` | 变更日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `delivery_date` | `delivery_date` | `deliveryDate` | 交割日期 |
| `delivery_date_from` | `delivery_date_from` | `deliveryDateFrom` | 交割日期从 |
| `delivery_date_to` | `delivery_date_to` | `deliveryDateTo` | 交割日期至 |
| `end_date` | `end_date` | `endDate` | 结束日期 |
| `exhibition_period_end_date` | `exhibition_period_end_date` | `exhibitionPeriodEndDate` | 展期后到期日 |
| `expire_date` | `expire_date` | `expireDate` | 到期日期 |
| `far_delivery_date` | `far_delivery_date` | `farDeliveryDate` | 交割日期(远端) |
| `far_delivery_date_end` | `far_delivery_date_end` | `farDeliveryDateEnd` | 交割日期至(远端) |
| `far_delivery_date_start` | `far_delivery_date_start` | `farDeliveryDateStart` | 交割日期从(远端) |
| `far_end_date` | `far_end_date` | `farEndDate` | 到期日期(远端) |
| `far_end_start_date` | `far_end_start_date` | `farStartDate` | 起息日期(远端) |
| `first_delivery_date` | `first_delivery_date` | `firstDeliveryDate` | 首次交割日 |
| `first_delivery_in_date` | `first_delivery_in_date` | `firstDeliveryInDate` | 换入首次交割日 |
| `first_delivery_out_date` | `first_delivery_out_date` | `firstDeliveryOutDate` | 换出首次交割日 |
| `first_effect_date` | `first_effect_date` | `firstEffectDate` | 调整首次生效日期 |
| `first_effective_date_in` | `first_effective_date_in` | `firstEffectiveDateIn` | 调整首次生效日 |
| `first_effective_date_out` | `first_effective_date_out` | `firstEffectiveDateOut` | 调整首次生效日(换出) |
| `init_fx_date` | `init_fx_date` | `initFxDate` | 初始化付息日 |
| `interest_start_date` | `interest_start_date` | `interestStartDate` | 初始化付息日 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `near_delivery_date` | `near_delivery_date` | `nearDeliveryDate` | 交割日期(近端) |
| `near_delivery_date_end` | `near_delivery_date_end` | `nearDeliveryDateEnd` | 交割日期至(近端) |
| `near_delivery_date_start` | `near_delivery_date_start` | `nearDeliveryDateStart` | 交割日期从(近端) |
| `near_end_date` | `near_end_date` | `nearEndDate` | 到期日期(近端) |
| `near_start_date` | `near_start_date` | `nearStartDate` | 起息日期(近端) |
| `plan_year` | `plan_year` | `planYear` | 计划年度 |
| `sign_date` | `sign_date` | `signDate` | 签约日期 |
| `valuation_date` | `valuation_date` | `valuationDate` | 估值日期 |
| `version_date` | `version_date` | `versionDate` | 版本生成时间 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `canuseflow` | `canuseflow` | `canuseflow` | 是否走审批流 |
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |

### 枚举字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `holiday_interest_principle` | `holiday_interest_principle` | `holidayInterestPrinciple` | 节假日计息原则 |
| `interest_settlement_rule` | `interest_settlement_rule` | `interestSettlementRule` | 结息头尾规则 |
| `is_budget` | `is_budget` | `isBudget` | 是否已发起预算 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `term_number` | `term_number` | `termNumber` | 宽限期期限数量 |

### 短整数 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_status` | `audit_status` | `auditStatus` | 审批状态 |
| `domestic_or_overseas` | `domestic_or_overseas` | `domesticOrOverseas` | 境内/境外 |
| `exchange_rate_unit` | `exchange_rate_unit` | `exchangeRateUnit` | 汇率单位 |
| `foreign_trade_direction` | `foreign_trade_direction` | `foreignTradeDirection` | 交易方向(外汇掉期) |
| `on_site_or_off_site` | `on_site_or_off_site` | `onSiteOrOffSite` | 场内/场外 |
| `` | `returncount` | `returncount` | 退回次数 |
| `` | `status` | `status` | 单据状态 |
| `trade_direction` | `trade_direction` | `tradeDirection` | 交易方向 |
| `trade_direction_export` | `trade_direction_export` | `tradeDirectionExport` | 交易方向(导入使用) |
| `trade_direction_rate` | `trade_direction_rate` | `tradeDirectionRate` | 交易方向(利率掉期) |
| `transaction_purpose` | `transaction_purpose` | `transactionPurpose` | 交易目的 |
| `` | `verifystate` | `verifystate` | 审批状态 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cf_business_id` | `cf_business_id` | `cfBusinessId` | 上个写现金流的业务id |
| `id` | `id` | `id` | ID |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (73个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `advance_principal_amount` | `advance_principal_amount` | `advancePrincipalAmount` | 初始化换出本金 |
| `amount_delivered` | `amount_delivered` | `amountDelivered` | 已交割金额 |
| `amount_of_dividends_paid` | `amount_of_dividends_paid` | `amountOfDividendsPaid` | 初始化换出已摊还本金 |
| `buy_amount` | `buy_amount` | `buyAmount` | 买入金额 |
| `can_infuse_amount` | `can_infuse_amount` | `canInfuseAmount` | 可交易金额 |
| `canInfuse_num` | `canInfuse_num` | `canInfuseNum` | 可交易数量 |
| `capital_exchange_rate` | `capital_exchange_rate` | `capitalExchangeRate` | 本金约定汇率 |
| `closing_price` | `closing_price` | `closingPrice` | 期末价格 |
| `contract_price` | `contract_price` | `contractPrice` | 协议价格 |
| `deal_price` | `deal_price` | `dealPrice` | 交易单价 |
| `deliverable_amount` | `deliverable_amount` | `deliverableAmount` | 可交割金额 |
| `exchange_amount_in` | `exchange_amount_in` | `exchangeAmountIn` | 换入名义本金(换入币种) |
| `exchange_amount_local_in` | `exchange_amount_local_in` | `exchangeAmountLocalIn` | 换入名义本金(本币币种) |
| `exchange_amount_local_out` | `exchange_amount_local_out` | `exchangeAmountLocalOut` | 换出名义本金(本币币种) |
| `exchange_amount_out` | `exchange_amount_out` | `exchangeAmountOut` | 换出名义本金(换出币种) |
| `exchange_in_less_price` | `exchange_in_less_price` | `exchangeInLessPrice` | 换入保底价格(利息收入/换入利息) |
| `exchange_in_market_price` | `exchange_in_market_price` | `exchangeInMarketPrice` | 换入市场参考价(利息收入/换入利息) |
| `exchange_less_price` | `exchange_less_price` | `exchangeLessPrice` | 换出目标价格(利息支出/换出利息) |
| `exchange_market_price` | `exchange_market_price` | `exchangeMarketPrice` | 换出市场参考价(利息支出/换出利息) |
| `exchange_rate` | `exchange_rate` | `exchangeRate` | 本币币种汇率 |
| `exchange_rate_in` | `exchange_rate_in` | `exchangeRateIn` | 换入利率(%) |
| `exchange_rate_local_in` | `exchange_rate_local_in` | `exchangeRateLocalIn` | 本币币种汇率 |
| `exchange_rate_o_put` | `exchange_rate_o_put` | `exchangeRateOPut` | 换出利率(利息支出) |
| `exchange_rate_out` | `exchange_rate_out` | `exchangeRateOut` | 本币币种汇率(换出) |
| `exhibition_period_amount` | `exhibition_period_amount` | `exhibitionPeriodAmount` | 展期金额 |
| `far_balance` | `far_balance` | `farBalance` | 合约远端余额 |
| `far_closed_amount` | `far_closed_amount` | `farClosedAmount` | 远端已平仓金额 |
| `far_delivered_amount` | `far_delivered_amount` | `farDeliveredAmount` | 远端已交割金额 |
| `far_estimated_price` | `far_estimated_price` | `farEstimatedPrice` | 远端价格(远端) |
| `far_transaction_amount` | `far_transaction_amount` | `farTransactionAmount` | 远端已交易金额 |
| `finance_innate_local_amount` | `finance_innate_local_amount` | `financeInnateLocalAmount` | 交易保证金(本币币种) |
| `finance_innate_origin_amount` | `finance_innate_origin_amount` | `financeInnateOriginAmount` | 交易保证金(本金币种) |
| `floating_value_in` | `floating_value_in` | `floatingValueIn` | 浮动值 |
| `floating_value_out` | `floating_value_out` | `floatingValueOut` | 浮动值(换出) |
| `funds_used_scale` | `funds_used_scale` | `fundsUsedScale` | 资金占用规模 |
| `handicap` | `handicap` | `handicap` | 差点(bps) |
| `infuse_capital_rate` | `infuse_capital_rate` | `infuseCapitalRate` | 本金约定汇率 |
| `infused_amount` | `infused_amount` | `infusedAmount` | 已交易金额 |
| `infused_num` | `infused_num` | `infusedNum` | 已交易数量 |
| `init_fx_amount` | `init_fx_amount` | `initFxAmount` | 初始化换入利息 |
| `init_hb_amount` | `init_hb_amount` | `initHbAmount` | 初始化换入本金 |
| `interest_rate_in` | `interest_rate_in` | `interestRateIn` | 基准利率(%) |
| `interest_rate_out` | `interest_rate_out` | `interestRateOut` | 基准利率(换出) |
| `jx_amount` | `jx_amount` | `jxAmount` | 初始化换入已摊还本金 |
| `less_price` | `less_price` | `lessPrice` | 目标价格(汇率) |
| `margin_amount` | `margin_amount` | `marginAmount` | 合约保证金 |
| `margin_ratio` | `margin_ratio` | `marginRatio` | 保证金比例 |
| `market_reference_price_exchange_rate` | `market_reference_price_exchange_rate` | `marketReferencePriceExchangeRate` | 市场参照价(汇率) |
| `market_reference_price_fixed_rate` | `market_reference_price_fixed_rate` | `marketReferencePriceFixedRate` | 市场参考价(固定利率) |
| `market_reference_price_float_rate` | `market_reference_price_float_rate` | `marketReferencePriceFloatRate` | 市场参照价(浮动利率) |
| `near_balance` | `near_balance` | `nearBalance` | 合约近端余额 |
| `near_closed_amount` | `near_closed_amount` | `nearClosedAmount` | 近端已平仓金额 |
| `near_delivered_amount` | `near_delivered_amount` | `nearDeliveredAmount` | 近端已交割金额 |
| `near_estimated_price` | `near_estimated_price` | `nearEstimatedPrice` | 近端价格 |
| `near_purchase_money` | `near_purchase_money` | `nearPurchaseMoney` | 买入/换入金额(近端) |
| `near_sold_money` | `near_sold_money` | `nearSoldMoney` | 卖出/换出金额(近端) |
| `near_transaction_amount` | `near_transaction_amount` | `nearTransactionAmount` | 近端已交易金额 |
| `num` | `num` | `num` | 数量 |
| `opening_price` | `opening_price` | `openingPrice` | 期初价格 |
| `out_near_purchase_money` | `out_near_purchase_money` | `outNearPurchaseMoney` | 买入/换入金额(远端) |
| `out_near_sold_money` | `out_near_sold_money` | `outNearSoldMoney` | 卖出/换出金额(远端) |
| `pay_amount` | `pay_amount` | `payAmount` | 已摊还本金 |
| `pay_interest_amount` | `pay_interest_amount` | `payInterestAmount` | 初始化换出利息 |
| `price` | `price` | `price` | 单价 |
| `protocol_amount` | `protocol_amount` | `protocolAmount` | 合约金额 |
| `protocol_balance` | `protocol_balance` | `protocolBalance` | 合约余额 |
| `purchase_money` | `purchase_money` | `purchaseMoney` | 买入金额 |
| `quota_occupation_scale` | `quota_occupation_scale` | `quotaOccupationScale` | 额度占用规模 |
| `repaid_amount` | `repaid_amount` | `repaidAmount` | 已平仓金额 |
| `sell_amount` | `sell_amount` | `sellAmount` | 卖出金额 |
| `sold_money` | `sold_money` | `soldMoney` | 卖出金额 |
| `time_point_position_scale` | `time_point_position_scale` | `timePointPositionScale` | 时点持仓规模 |
| `valuation_amount` | `valuation_amount` | `valuationAmount` | 估值金额 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `financingRegisterAgreement` | 衍生品合约关联授信子表 |
| `` | `` | `financingRegisterCashFlow` | 衍生品合约现金流子表 |
| `` | `` | `financingRegisterInquiry` | 衍生品合约询价信息子表 |
| `` | `` | `financingRegisterMargin` | 衍生品合约关联保证金子表 |
| `` | `` | `financingRegisterQuota` | 衍生品合约关联额度子表 |
| `` | `` | `financingRegisterRelatedBusiness` | 衍生品合约关联业务子表 |
| `` | `` | `investmentRegisterCheckFlow` | 衍生品合约核算流子表 |
| `` | `` | `principalAmortizationPlan` | 衍生品合约本金摊还计划子表 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fr_define_character` | `fr_define_character` | `financingRegisterCharacterDef` | 衍生品合约主表特征属性 |
