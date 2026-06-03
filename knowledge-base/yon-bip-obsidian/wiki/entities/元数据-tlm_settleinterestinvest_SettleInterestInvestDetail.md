---
tags: [BIP, 元数据, 数据字典, tlm.settleinterestinvest.SettleInterestInvestDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 投资结息明细信息 (`tlm.settleinterestinvest.SettleInterestInvestDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_settleinterestinvest_detail` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 投资结息明细信息 |
| 物理表 | `tlm_settleinterestinvest_detail` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 36 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `rate_type` | `` |
| `nat_currency` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `mainid` | `` |
| `protocol_currency` | `` |
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

> 共 36 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `detail_code` | `detail_code` | `detailCode` | 明细编号 |
| `cashflow_id` | `cashflow_id` | `cashflowplan` | 现金流计划ID |
| `interest_accrual_day` | `interest_accrual_day` | `interestAccrualDay` | 计息天数 |
| `interest_settlement_method` | `interest_settlement_method` | `interestSettlementMethod` | 结息方式 |
| `interest_type` | `interest_type` | `interestType` | 利息类型 |
| `settleinterestobj` | `settleinterestobj` | `settleinterestObj` | 结息对象 |
| `voucher_status` | `voucher_status` | `voucherStatus` | 凭证状态 |
| `withholding_detail` | `withholding_detail` | `withholdingDetail` | 已预提明细 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 关联ID |
| `protocol_currency` | `protocol_currency` | `protocolCurrency` | 协议币种 |
| `nat_currency` | `nat_currency` | `natCurrency` | 本币币种 |
| `rate_type` | `rate_type` | `rateType` | 汇率类型 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `begin_date` | `begin_date` | `beginDate` | 结息起息日 |
| `end_date` | `end_date` | `endDate` | 结息止息日 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exchange_rate_ops` | `exchange_rate_ops` | `exchangeRateOps` | 汇率折算方式 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |

### 数值字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `interest_rate` | `interest_rate` | `interestRate` | 利率(%) |
| `purchase_balance` | `purchase_balance` | `purchaseBalance` | 申购单余额(协议币种) |
| `settlement_amount_x` | `settlement_amount_x` | `settlementAmountX` | 结息金额(计息币种) |
| `settlement_amount_b` | `settlement_amount_b` | `settlementAmountB` | 结息金额(本币币种) |
| `withholding_amount_x` | `withholding_amount_x` | `withholdingAmountX` | 已预提金额(计息币种) |
| `withholding_amount_b` | `withholding_amount_b` | `withholdingAmountB` | 已预提金额(本币币种) |
| `writeoff_amount_x` | `writeoff_amount_x` | `writeoffAmountX` | 核销后差额合计(计息币种) |
| `writeoff_amount_b` | `writeoff_amount_b` | `writeoffAmountB` | 预提核销差额合计(本币币种) |
| `exchange_rate` | `exchange_rate` | `exchangeRate` | 汇率 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
