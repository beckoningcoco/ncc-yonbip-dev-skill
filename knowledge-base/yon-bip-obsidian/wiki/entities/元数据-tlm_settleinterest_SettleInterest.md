---
tags: [BIP, 元数据, 数据字典, tlm.settleinterest.SettleInterest]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 融资结息 (`tlm.settleinterest.SettleInterest`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_settleinterest` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：`c2efd844-8b36-4de6-8d1b-1c8d91b5d470`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 融资结息 |
| 物理表 | `tlm_settleinterest` |
| domain/服务域 | `yonbip-fi-ctmtlm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `TLM` |
| 直连字段 | 98 个 |
| 子表 | 2 个 |
| 关联引用 | 23 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `SettleInterestDetail` | `tlm.settleinterest.SettleInterestDetail` | composition |
| `defines` | `tlm.settleinterest.SettleInterestDefine` | composition |

## 关联引用 (23个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `cost_center` | `` |
| `financing_org_bank` | `` |
| `` | `` |
| `accentity_raw` | `ucf-org-center.bd_financeorgtreeref` |
| `dept_id` | `` |
| `profit_center` | `` |
| `accentity` | `ucf-org-center.bd_fundsorg_na` |
| `protocol_currency` | `ucfbasedoc.bd_currencytenantref` |
| `bustype` | `bd_transtypelistref` |
| `financial_product` | `tlm_financialProductRef` |
| `sync_id` | `` |
| `rateType` | `ucfbasedoc.bd_exchangeratetyperef` |
| `interestCurrency` | `` |
| `natCurrency` | `ucfbasedoc.bd_currencytenantref` |
| `settleInterestCharacterDef` | `` |
| `debtcode` | `tlm_financeinRef` |
| `protocol_number` | `tlm_financingregisterRef` |
| `tenant_id` | `` |

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

> 共 98 个直连字段

### 文本字段 (28个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `holiday_principle` | `holiday_principle` | `holidayPrinciple` | 节假日处理原则 |
| `interesBase` | `interesBase` | `interesBase` | 计息基数是否为还本金额 |
| `financing_org_type` | `financing_org_type` | `financingOrgType` | 融资机构类型 |
| `interest_settlement_rule` | `interest_settlement_rule` | `interestSettlementRule` | 结息头尾规则 |
| `interest_accrual_day` | `interest_accrual_day` | `interestAccrualDay` | 计息天数 |
| `ymd_interestRate` | `ymd_interestRate` | `ymdInterestRate` | 年/月/日利率 |
| `interest_rate_type` | `interest_rate_type` | `interestRateType` | 利率类型 |
| `interest_settlement_method` | `interest_settlement_method` | `interestSettlementMethod` | 结息方式 |
| `settlement_cycle` | `settlement_cycle` | `settlementCycle` | 结息周期 |
| `settle_interest_voucher` | `settle_interest_voucher` | `settleInterestVoucher` | 结息凭证生成方式 |
| `entry_time` | `entry_time` | `entryTime` | 入账时机 |
| `financing_org_for_other` | `financing_org_for_other` | `financingOrgForOther` | 融资机构 |
| `voucherNo` | `voucherNo` | `voucherNo` | 凭证号 |
| `code` | `code` | `code` | 单据编号 |
| `initialization` | `initialization` | `initialization` | 是否初始化 |
| `generation` | `generation` | `generation` | 生成方式 |
| `plan_voucher` | `plan_voucher` | `planVoucher` | 是否计划结息 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `` | `auditor` | `auditor` | 审批人 |
| `loan_interest_rate` | `loan_interest_rate` | `loanInterestRate` | 存款利率id |
| `interestRateValues` | `interestRateValues` | `interestRateValues` | 存款利率值 |
| `preOperatePurchaseBillCode` | `preOperatePurchaseBillCode` | `preOperatePurchaseBillCode` | 上一次操作申购登记的单据类型编号 |
| `data_source` | `data_source` | `dataSource` | 数据来源 |
| `effective_time` | `effective_time` | `effectiveTime` | 单据生效时机 |
| `is_effect` | `is_effect` | `isEffect` | 是否生效 |
| `modify_status` | `modify_status` | `modifyStatus` | 是否修改过 |
| `sync_msg` | `sync_msg` | `syncMsg` | 协同失败原因 |

### 引用字段 (20个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `financing_org_bank` | `financing_org_bank` | `financingOrgForBank` | 融资机构 |
| `interestCurrency` | `interestCurrency` | `interestCurrency` | 计息币种 |
| `dept_id` | `dept_id` | `deptid` | 部门 |
| `cost_center` | `cost_center` | `costCenter` | 成本中心 |
| `profit_center` | `profit_center` | `profitCenter` | 利润中心 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `accentity` | `accentity` | `accentity` | 资金组织 |
| `protocol_number` | `protocol_number` | `protocolNumber` | 协议号id |
| `debtcode` | `debtcode` | `debtcode` | 借据id |
| `financial_product` | `financial_product` | `financialProduct` | 金融产品id |
| `protocol_currency` | `protocol_currency` | `protocolCurrency` | 协议币种id |
| `natCurrency` | `natCurrency` | `natCurrency` | 本币币种id |
| `rateType` | `rateType` | `rateType` | 汇率类型id |
| `bustype` | `bustype` | `bustype` | 交易类型id |
| `sync_id` | `sync_id` | `syncId` | 协同单ID |

### 日期字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vouch_date` | `vouch_date` | `vouchdate` | 单据日期 |
| `begin_date` | `begin_date` | `beginDate` | 结息起息日 |
| `end_date` | `end_date` | `endDate` | 结息止息日 |
| `financein_end_date` | `financein_end_date` | `financeinEndDate` | 借据结束日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `canuseflow` | `canuseflow` | `canuseflow` | 是否走审批流 |
| `` | `isWfControlled` | `isWfControlled` | 审批流控制 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_budget` | `is_budget` | `isBudget` | 是否占用預算 |

### 短整数 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `if_filter` | `if_filter` | `ifFilter` | 是否过滤:1是0否 |
| `` | `returncount` | `returncount` | 退回次数 |
| `srcitem` | `srcitem` | `srcitem` | 来源系统编码 |
| `` | `status` | `status` | 单据状态 |
| `audit_status` | `audit_status` | `auditStatus` | 单据状态 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `voucherstatus` | `voucherstatus` | `voucherstatus` | 凭证状态 |
| `billtype` | `billtype` | `billtype` | 单据类型编码 |
| `exch_rate_ops` | `exch_rate_ops` | `exchRateOps` | 本币币种汇率折算方式 |
| `send_sync` | `send_sync` | `sendSync` | 协同状态，0-未协同；1-协同成功；2-协同失败；3-不协同 |

### 长整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | 主表id |
| `preOperatePurchaseBillId` | `preOperatePurchaseBillId` | `preOperatePurchaseBillId` | 上一次操作申购登记的单据类型Id |
| `data_source_id` | `data_source_id` | `dataSourceId` | 数据来源Id |
| `filesCount` | `filesCount` | `filesCount` | 附件数 |

### 数值字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `deal_currency_amount` | `deal_currency_amount` | `dealCurrencyAmount` | 现金流交易币种金额 |
| `execute_amount` | `execute_amount` | `executeAmount` | 现金流执行金额 |
| `protocolSumAfterOr` | `protocolSumAfterOr` | `protocolSumAfterOr` | 结息调整后金额(协议币种) |
| `protocol_currency_amount` | `protocol_currency_amount` | `protocolAmount` | 现金流协议币种金额 |
| `appoint_rate` | `appoint_rate` | `appointRate` | 利息约定汇率 |
| `interest_rate` | `interest_rate` | `interestRate` | 利率(%) |
| `protocolSumAfter` | `protocolSumAfter` | `protocolSumAfter` | 结息调整后金额(计息币种) |
| `protocolSumInt` | `protocolSumInt` | `protocolSumInt` | 结息金额合计(计息币种) |
| `protocolSumSub` | `protocolSumSub` | `protocolSumSub` | 结息调整差额(计息币种) |
| `amountSumInt` | `amountSumInt` | `amountSumInt` | 已预提金额合计(计息币种) |
| `writeoffSumInt` | `writeoffSumInt` | `writeoffSumInt` | 核销后差额合计(计息币种) |
| `protocolSum` | `protocolSum` | `protocolSum` | 结息金额(协议币种) |
| `amountSum` | `amountSum` | `amountSum` | 已预提金额(协议币种) |
| `writeoffSum` | `writeoffSum` | `writeoffSum` | 核销后差额合计(协议币种) |
| `exchRate` | `exchRate` | `exchRate` | 汇率 |
| `natSum` | `natSum` | `natSum` | 结息金额(本币币种) |
| `localAmountSum` | `localAmountSum` | `localAmountSum` | 已预提金额(本币币种) |
| `preWriteoffSum` | `preWriteoffSum` | `preWriteoffSum` | 预提核销差额合计(本币币种) |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `settleInterestCharacterDef` | `settleInterestCharacterDef` | `settleInterestCharacterDef` | 融资结息自定义项 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `SettleInterestDetail` | 融资结息明细信息 |
| `` | `` | `defines` | 结息自定义项 |
