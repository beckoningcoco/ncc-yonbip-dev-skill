---
tags: [BIP, 元数据, 数据字典, tlm.purchasechange.PurchaseChange]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 申购变更 (`tlm.purchasechange.PurchaseChange`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_purchasechange` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：`46e5bed4-4df4-41c0-944b-8a340e65917f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 申购变更 |
| 物理表 | `tlm_purchasechange` |
| domain/服务域 | `yonbip-fi-ctmtlm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `TLM` |
| 直连字段 | 118 个 |
| 子表 | 5 个 |
| 关联引用 | 19 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `changeDetail` | `tlm.purchasechange.PurchaseChangeDetail` | composition |
| `purchaseChange_cashflow` | `tlm.purchasechange.PurchaseChange_cashflow` | composition |
| `purchaseChange_cashflowBackUp` | `tlm.purchasechange.PurchaseChange_cashflowBackUp` | composition |
| `defines` | `tlm.purchasechange.PurchaseChangeDefine` | composition |
| `purchaseChangeCustomRate` | `tlm.purchasechange.PurchaseChangeCustomRate` | composition |

## 关联引用 (19个)

| 字段名 | 引用类型 |
|--------|---------|
| `purchase_change_character_def` | `` |
| `purchase_code` | `tlm_purchaseregisterRef` |
| `ytenant_id` | `` |
| `accentity_raw` | `ucf-org-center.bd_financeorgtreeref_na` |
| `base_rate_type` | `tlm_interestrateRef` |
| `` | `` |
| `accentity` | `ucf-org-center.bd_fundsorg_na` |
| `tradetype` | `bd_transtypelistref` |
| `associate_change` | `` |
| `cashflow_plan` | `` |
| `protocol_number` | `tlm_financingregisterRef` |
| `tenant_id` | `` |

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

> 共 118 个直连字段

### 文本字段 (35个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modifyStatus` | `modifyStatus` | `modifyStatus` | 是否编辑过 |
| `is_effective` | `is_effective` | `isEffective` | 是否生效 |
| `` | `code` | `code` | 申请编号 |
| `auto_extension_term_unit` | `auto_extension_term_unit` | `autoExtensionTermUnit` | 期限单位 |
| `cf_business_type` | `cf_business_type` | `cfBusinessType` | 上个写现金流的业务类型 |
| `remark` | `remark` | `remark` | 备注 |
| `remark1` | `remark1` | `remark1` | 备注1 |
| `month_adjust_date` | `month_adjust_date` | `monthAdjustDate` | 月末日期调整(赎回) |
| `use_overdue` | `use_overdue` | `useOverdue` | 是否启用逾期 |
| `is_penalty` | `is_penalty` | `isPenalty` | 是否计算罚息 |
| `is_compound_interest` | `is_compound_interest` | `isCompoundInterest` | 是否计算复利 |
| `month_wh_adjust_date` | `month_wh_adjust_date` | `monthWithHoldingAdjustDate` | 月末日期调整(预提) |
| `direct_connection` | `direct_connection` | `directConnection` | 是否直连 |
| `` | `creator` | `creator` | 创建人 |
| `create_method` | `create_method` | `createMethod` | 生成方式 |
| `change_reason` | `change_reason` | `changeReason` | 变更原因 |
| `effective_doc` | `effective_doc` | `effectiveDoc` | 单据生效时机 |
| `` | `modifier` | `modifier` | 修改人 |
| `rate_type` | `rate_type` | `rateType` | 利率类型 |
| `interest_days` | `interest_days` | `interestDays` | 计息天数 |
| `period_head_tail` | `period_head_tail` | `periodHeadTail` | 周期首尾规则 |
| `initialization` | `initialization` | `initialization` | 是否期初 |
| `is_expiration_date` | `is_expiration_date` | `isExpirationDate` | 是否含到期日 |
| `float_type` | `float_type` | `floatType` | 浮动方式 |
| `base_ratetype_name` | `base_ratetype_name` | `baseRateTypeName` | 基准利率种类 |
| `settlement_type` | `settlement_type` | `settlementType` | 结息方式 |
| `settlement_cycle` | `settlement_cycle` | `settlementCycle` | 结息周期 |
| `interes_base` | `interes_base` | `interesBase` | 提前还本计息基数 |
| `normal_interes_base` | `normal_interes_base` | `normalInteresBase` | 正常还本计息基数 |
| `` | `auditor` | `auditor` | 审批人 |
| `withholding_cycle` | `withholding_cycle` | `withholdingCycle` | 预提利息周期 |
| `withholding_rule` | `withholding_rule` | `withholdingRule` | 预提头尾规则 |
| `purchase_term` | `purchase_term` | `purchaseTerm` | 申购期限 |
| `term_unit` | `term_unit` | `purchaseTermUnit` | 融入期限单位 |
| `sync_msg` | `sync_msg` | `syncMsg` | 协同失败原因 |

### 引用字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 资金组织id |
| `associate_change` | `associate_change` | `associateChange` | 协同到融入变更单的id |
| `protocol_number` | `protocol_number` | `protocolNumber` | 投资协议id |
| `purchase_code` | `purchase_code` | `purchaseCode` | 申购id |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `cashflow_plan` | `cashflow_plan` | `cashflowPlan` | 现金流计划 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tradetype` | `tradetype` | `bustype` | 交易类型id |
| `base_rate_type` | `base_rate_type` | `baseRateType` | 基准利率种类ID |

### 日期字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `interest_rate_date` | `interest_rate_date` | `interestRateDate` | 初始利率日期 |
| `first_repayment_date` | `first_repayment_date` | `firstRepaymentDate` | 首次赎回日 |
| `plan_paid_date` | `plan_paid_date` | `planPaidDate` | 已宣告待发放日期 |
| `withholding_interest_date` | `withholding_interest_date` | `withholdingInterestDate` | 预提起息日 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `change_date` | `change_date` | `changeDate` | 变更日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `purchase_date` | `purchase_date` | `purchaseDate` | 申购日期 |
| `purchasexpire_date` | `purchasexpire_date` | `purchasexpireDate` | 申购到期日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `first_effect_date` | `first_effect_date` | `firstEffectDate` | 利率调整首次生效日 |
| `first_payment_date` | `first_payment_date` | `firstPaymentDate` | 首次付息日 |
| `first_withholding_cycle` | `first_withholding_cycle` | `firstWithholdingDate` | 首次预提利息日 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isWfControlled` | `isWfControlled` | 审批流控制 |

### 枚举字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `overdue_auto_extension` | `overdue_auto_extension` | `overdueAutoExtension` | 逾期自动展期 |
| `repayment_type` | `repayment_type` | `repaymentType` | 赎回方式 |
| `repayment_cycle` | `repayment_cycle` | `repaymentCycle` | 赎回周期 |
| `month_interest_adjust_date` | `month_interest_adjust_date` | `monthInterestAdjustDate` | 月末日期调整(利息) |
| `investmenterm_type` | `investmenterm_type` | `investmentermType` | 投资期限分类 |
| `year_month_day` | `year_month_day` | `yearMonthDay` | 年月日利率 |
| `holiday_principle` | `holiday_principle` | `holidayPrinciple` | 节假日处理原则 |
| `interest_settlement_rule` | `interest_settlement_rule` | `interestSettlementRule` | 结息头尾规则 |
| `holiday_interest_principle` | `holiday_interest_principle` | `holidayInterestPrinciple` | 节假日计息原则 |
| `rate_adjust_cycle` | `rate_adjust_cycle` | `rateAdjustCycle` | 利率调整周期 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `auto_extension_term_num` | `auto_extension_term_num` | `autoExtensionTermNum` | 自动展期期限 |
| `grace_period` | `grace_period` | `gracePeriod` | 宽限期 |
| `term_number` | `term_number` | `purchaseTermNumber` | 申购期限 |

### 短整数 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `send_sync` | `send_sync` | `sendSync` | 是否发起过协同 |
| `purchase_status` | `purchase_status` | `purchaseStatus` | 申购单状态 |
| `billtype` | `billtype` | `billtype` | 单据类型 |
| `srcitem` | `srcitem` | `srcitem` | 事项来源(系统) |
| `srcEventType` | `srcEventType` | `srcEventType` | 事项类型 |
| `domestic_or_overseas` | `domestic_or_overseas` | `domesticOrOverseas` | 境内/境外 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `` | `returncount` | `returncount` | 退回次数 |
| `` | `status` | `status` | 单据状态 |
| `audit_status` | `audit_status` | `auditStatus` | 审批状态 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cf_business_id` | `cf_business_id` | `cfBusinessId` | 上个写现金流的业务id |
| `` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | ID |

### 数值字段 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `purchase_num` | `purchase_num` | `purchaseNum` | 申购数量 |
| `deal_price` | `deal_price` | `dealPrice` | 交易单价 |
| `deal_pc_fee` | `deal_pc_fee` | `dealPcFee` | 交易费用(协议币种) |
| `declared_interest_protocol` | `declared_interest_protocol` | `declaredInterestProtocol` | 已宣告未发放金额(协议币种) |
| `deal_All_paid_pc_amount` | `deal_All_paid_pc_amount` | `dealAllPaidPcAmount` | 实付金额(协议币种) |
| `occupied_amount` | `occupied_amount` | `occupiedAmount` | 已占用金额(协议币种) |
| `released_amount` | `released_amount` | `releasedAmount` | 已释放金额(协议币种) |
| `penalty_float_percent` | `penalty_float_percent` | `penaltyFloatPercent` | 罚息上浮比例(%) |
| `penalty_rate` | `penalty_rate` | `penaltyRate` | 罚息利率(%) |
| `compound_float_percent` | `compound_float_percent` | `compoundFloatPercent` | 复利上浮比例(%) |
| `compound_rate` | `compound_rate` | `compoundRate` | 复利利率(%) |
| `expected_return` | `expected_return` | `expectedReturn` | 预期收益率 |
| `expected_return_amt` | `expected_return_amt` | `expectedReturnAmt` | 预期收益 |
| `purchaseAmount` | `purchaseAmount` | `purchaseAmount` | 申购金额(协议币种) |
| `deal_pc_amount` | `deal_pc_amount` | `dealPcAmount` | 交易金额(协议币种) |
| `base_rate` | `base_rate` | `baseRate` | 基准利率 |
| `float_value` | `float_value` | `floatValue` | 浮动值 |
| `purchase_rate` | `purchase_rate` | `purchaseRate` | 申购单利率(%) |
| `appoint_rate` | `appoint_rate` | `appointRate` | 利息约定汇率 |

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
| `purchase_change_character_def` | `purchase_change_character_def` | `purchaseChangeCharacterDef` | 申购变更自定义项 |

### other (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `changeDetail` | 变更明细 |
| `` | `` | `defines` | 申购变更自由自定义项 |
| `` | `` | `purchaseChangeCustomRate` | 自定义利率 |
| `` | `` | `purchaseChange_cashflow` | 申购变更现金流 |
| `` | `` | `purchaseChange_cashflowBackUp` | 申购变更现金流备份表 |
