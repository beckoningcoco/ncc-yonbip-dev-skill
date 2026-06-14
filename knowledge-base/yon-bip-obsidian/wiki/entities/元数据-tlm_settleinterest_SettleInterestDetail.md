---
tags: [BIP, 元数据, 数据字典, tlm.settleinterest.SettleInterestDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 融资结息明细信息 (`tlm.settleinterest.SettleInterestDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_settleinterest_detail` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 融资结息明细信息 |
| 物理表 | `tlm_settleinterest_detail` |
| domain/服务域 | `yonbip-fi-ctmtlm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `TLM` |
| 直连字段 | 44 个 |
| 子表 | 0 个 |
| 关联引用 | 9 个 |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `rateType` | `ucfbasedoc.bd_exchangeratetyperef` |
| `interestCurrency` | `` |
| `natCurrency` | `ucfbasedoc.bd_currencytenantref` |
| `ytenant_id` | `` |
| `` | `` |
| `mainid` | `` |
| `protocol_currency` | `ucfbasedoc.bd_currencytenantref` |
| `tenant_id` | `` |

## 继承接口 (3个, 10字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 44 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `detail_code` | `detail_code` | `detailCode` | 结息明细编号 |
| `cashflowplan` | `cashflowplan` | `cashflowplan` | 现金流计划ID |
| `interest_accrual_day` | `interest_accrual_day` | `interestAccrualDay` | 计息天数 |
| `voucher_status` | `voucher_status` | `voucherStatus` | 凭证状态 |
| `WithholdingDetail` | `WithholdingDetail` | `WithholdingDetail` | 已预提明细 |
| `` | `code` | `code` | 编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `interest_settlement_method` | `interest_settlement_method` | `interestSettlementMethod` | 结息方式 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `settleinterestObj` | `settleinterestObj` | `settleinterestObj` | 结息对象 |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 结息明细编号 |
| `protocol_currency` | `protocol_currency` | `protocolCurrency` | 协议币种id |
| `natCurrency` | `natCurrency` | `natCurrency` | 本币币种id |
| `rateType` | `rateType` | `rateType` | 汇率类型id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `interestCurrency` | `interestCurrency` | `interestCurrency` | 计息币种 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `begin_date` | `begin_date` | `beginDate` | 结息起息日 |
| `end_date` | `end_date` | `endDate` | 结息止息日 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `interest_type` | `interest_type` | `interestType` | 利息类型（流类型） |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exch_rate_ops` | `exch_rate_ops` | `exchRateOps` | 本币币种汇率折算方式 |
| `` | `status` | `status` | 单据状态 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `interest_rate` | `interest_rate` | `interestRate` | 利率（%） |
| `receipt_balance` | `receipt_balance` | `receiptBalance` | 借据余额（协议币种） |
| `protocolSumB` | `protocolSumB` | `protocolSumB` | 结息金额（协议币种） |
| `protocolSumBInt` | `protocolSumBInt` | `protocolSumBInt` | 结息金额（计息币种） |
| `amount` | `amount` | `amount` | 已预提金额（协议币种） |
| `amountInt` | `amountInt` | `amountInt` | 已预提金额（计息币种） |
| `writeoffSumB` | `writeoffSumB` | `writeoffSumB` | 预提核销差额（协议币种） |
| `writeoffSumBInt` | `writeoffSumBInt` | `writeoffSumBInt` | 预提核销差额（计息币种） |
| `preWriteoffSumB` | `preWriteoffSumB` | `preWriteoffSumB` | 预提核销差额（本币币种） |
| `exchRate` | `exchRate` | `exchRate` | 汇率 |
| `natSumB` | `natSumB` | `natSumB` | 结息金额（本币币种） |
| `localAmount` | `localAmount` | `localAmount` | 已预提金额（本币币种） |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
