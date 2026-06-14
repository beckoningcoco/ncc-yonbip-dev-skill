---
tags: [BIP, 元数据, 数据字典, tlm.purchaseapply.PurchaseApply]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 申购申请 (`tlm.purchaseapply.PurchaseApply`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_purchaseapply` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：`71d6ae06-c35f-4b46-8d23-fe627e6e80b9`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 申购申请 |
| 物理表 | `tlm_purchaseapply` |
| domain/服务域 | `yonbip-fi-ctmtlm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `TLM` |
| 直连字段 | 100 个 |
| 子表 | 2 个 |
| 关联引用 | 19 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `purchaseApplyCustomRate` | `tlm.purchaseapply.PurchaseApplyCustomRate` | composition |
| `defines` | `tlm.purchaseapply.PurchaseApplyDefine` | composition |

## 关联引用 (19个)

| 字段名 | 引用类型 |
|--------|---------|
| `customer_bank_account` | `` |
| `pa_define_character` | `` |
| `ytenant_id` | `` |
| `accentity_raw` | `ucf-org-center.bd_financeorgtreeref_na` |
| `base_rate_type` | `tlm_interestrateRef` |
| `` | `` |
| `opposite_settle_currency` | `` |
| `accentity` | `ucf-org-center.bd_fundsorg_na` |
| `bus_type` | `bd_transtypelistref` |
| `fund_business_object` | `` |
| `capital_currency` | `` |
| `protocol_number` | `tlm_financingregisterRef` |
| `supplier_bank_account` | `` |
| `tenant_id` | `` |
| `cash_flow_plan` | `tlm_financingregister_cashflowRef` |

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

> 共 100 个直连字段

### 文本字段 (31个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 单据编号 |
| `create_method` | `create_method` | `createMethod` | 生成方式 |
| `sync_finance_apply_id` | `sync_finance_apply_id` | `syncFinanceApplyId` | 协同关联的融入申请id |
| `sync_finance_apply_code` | `sync_finance_apply_code` | `syncFinanceApplyCode` | 协同关联的融入申请编码 |
| `failure_reason` | `failure_reason` | `failureReason` | 失败原因 |
| `month_adjust_date` | `month_adjust_date` | `monthAdjustDate` | 月末日期调整(赎回) |
| `month_interest_adjust_date` | `month_interest_adjust_date` | `monthInterestAdjustDate` | 月末日期调整(利息) |
| `effective_time` | `effective_time` | `effectiveTime` | 单据生效时机 |
| `take_effect` | `take_effect` | `takeEffect` | 是否生效 |
| `purchase_register_id` | `purchase_register_id` | `purchaseRegisterId` | 申购登记id |
| `dis_used` | `dis_used` | `disUsed` | 是否废弃 |
| `purchase_register_code` | `purchase_register_code` | `purchaseRegisterCode` | 申购登记编码 |
| `modify_status` | `modify_status` | `modifyStatus` | 是否编辑过 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `` | `auditor` | `auditor` | 审批人 |
| `direct_connection` | `direct_connection` | `directConnection` | 是否直连 |
| `change_direction` | `change_direction` | `changeDirection` | 变更发起方 |
| `purchase_term` | `purchase_term` | `purchaseTerm` | 申购期限 |
| `investment_term_type` | `investment_term_type` | `investmentTermType` | 投资期限分类 |
| `repayment_type` | `repayment_type` | `repaymentType` | 赎回方式 |
| `remark` | `remark` | `remark` | 备注 |
| `repayment_cycle` | `repayment_cycle` | `repaymentCycle` | 赎回周期 |
| `settlement_cycle` | `settlement_cycle` | `settlementCycle` | 结息周期 |
| `rate_type` | `rate_type` | `rateType` | 利率类型 |
| `interest_days` | `interest_days` | `interestDays` | 计息天数 |
| `year_month_day` | `year_month_day` | `yearMonthDay` | 年/月/日利率 |
| `float_type` | `float_type` | `floatType` | 浮动方式 |
| `rate_adjust_cycle` | `rate_adjust_cycle` | `rateAdjustCycle` | 利率调整周期 |
| `purchase_method` | `purchase_method` | `purchaseMethod` | 申购方式 |
| `sync_msg` | `sync_msg` | `syncMsg` | 协同失败原因 |

### 引用字段 (16个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 资金组织id |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `capital_currency` | `capital_currency` | `capitalCurrency` | 本金币种 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `bus_type` | `bus_type` | `bustype` | 交易类型id |
| `protocol_number` | `protocol_number` | `protocolNumber` | 协议号id |
| `cash_flow_plan` | `cash_flow_plan` | `cashFlowPlan` | 现金流计划ID |
| `base_rate_type` | `base_rate_type` | `baseRateType` | 基准利率类型id |
| `fund_business_object` | `fund_business_object` | `fundBusinessObject` | 资金业务对象 |
| `opposite_settle_currency` | `opposite_settle_currency` | `oppositeSettleCurrency` | 对方结算币种 |
| `customer_bank_account` | `customer_bank_account` | `settleCustomerBankAccount` | 客户银行账号 |
| `supplier_bank_account` | `supplier_bank_account` | `settleSupplierBankAccount` | 供应商银行账号 |

### 日期字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vouch_date` | `vouch_date` | `vouchdate` | 单据日期 |
| `last_settle_interest_date` | `last_settle_interest_date` | `lastSettleInterestDate` | 上一次结息日 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `purchase_date` | `purchase_date` | `purchaseDate` | 预计申购日期 |
| `purchase_end_date` | `purchase_end_date` | `purchaseEndDate` | 预计申购到期日期 |
| `first_repayment_date` | `first_repayment_date` | `firstRepaymentDate` | 首次赎回日 |
| `first_payment_date` | `first_payment_date` | `firstPaymentDate` | 首次收息日 |
| `first_effect_date` | `first_effect_date` | `firstEffectDate` | 调整首次生效日 |
| `interest_rate_date` | `interest_rate_date` | `interestRateDate` | 利率日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `can_use_flow` | `can_use_flow` | `canuseflow` | 是否走审批流 |
| `` | `isWfControlled` | `isWfControlled` | 审批流控制 |

### 枚举字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_budget` | `is_budget` | `isBudget` | 是否占用預算 |
| `cmd_push_status` | `cmd_push_status` | `cmdPushStatus` | 指令推送状态 |
| `transaction_result` | `transaction_result` | `transactionResult` | 交易结果 |
| `purchase_term_unit` | `purchase_term_unit` | `purchaseTermUnit` | 期限单位 |
| `settlement_type` | `settlement_type` | `settlementType` | 结息方式 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `purchase_term_number` | `purchase_term_number` | `purchaseTermNumber` | 申购期限 |

### 短整数 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_status` | `audit_status` | `auditStatus` | 审批状态 |
| `send_sync` | `send_sync` | `sendSync` | 是否发起过协同 |
| `` | `returncount` | `returncount` | 退回次数 |
| `` | `status` | `status` | 单据状态 |
| `create_purchase_register` | `create_purchase_register` | `createPurchaseRegister` | 是否生成申购登记 |
| `src_event_type` | `src_event_type` | `srcEventType` | 事项类型 |
| `src_item` | `src_item` | `srcitem` | 事项来源 |
| `bill_type` | `bill_type` | `billtype` | 单据类型 |
| `` | `verifystate` | `verifystate` | 审批状态 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `tplid` | `tplid` | 模板id |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据id |
| `src_bill_code` | `src_bill_code` | `srcBillCode` | 来源单据号 |
| `id` | `id` | `id` | ID |

### 数值字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `can_infuse_amount` | `can_infuse_amount` | `canInfuseAmount` | 可申购金额 |
| `capital_exchange_rate` | `capital_exchange_rate` | `capitalExchangeRate` | 本金约定汇率 |
| `advance_interest_protocol` | `advance_interest_protocol` | `advanceInterestProtocol` | 垫付利息(协议币种) |
| `advance_interest_principal` | `advance_interest_principal` | `advanceInterestPrincipal` | 垫付利息(本金币种) |
| `advance_interest_local` | `advance_interest_local` | `advanceInterestLocal` | 垫付利息(本币币种) |
| `purchase_num` | `purchase_num` | `purchaseNum` | 申购数量 |
| `purchase_amount` | `purchase_amount` | `purchaseAmount` | 申购金额(协议币种) |
| `deal_price` | `deal_price` | `dealPrice` | 交易单价 |
| `deal_pc_amount` | `deal_pc_amount` | `dealPcAmount` | 交易金额(协议币种) |
| `purchase_pria_mount` | `purchase_pria_mount` | `purchasePriaMount` | 申购金额(本金币种) |
| `deal_cc_amount` | `deal_cc_amount` | `dealCcAmount` | 交易金额(本金币种) |
| `base_rate` | `base_rate` | `baseRate` | 基准利率(%) |
| `float_value` | `float_value` | `floatValue` | 浮动值 |
| `purchaseRate` | `purchaseRate` | `purchaseRate` | 申购单利率(%) |

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
| `pa_define_character` | `pa_define_character` | `purchaseApplyCharacterDef` | 申购申请自定义项 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 申购申请自由自定义项 |
| `` | `` | `purchaseApplyCustomRate` | 自定义利率 |
