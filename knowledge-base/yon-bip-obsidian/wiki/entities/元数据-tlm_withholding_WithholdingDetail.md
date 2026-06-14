---
tags: [BIP, 元数据, 数据字典, tlm.withholding.WithholdingDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 预提利息明细信息 (`tlm.withholding.WithholdingDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_withholding_detail` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 预提利息明细信息 |
| 物理表 | `tlm_withholding_detail` |
| domain/服务域 | `yonbip-fi-ctmtlm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `TLM` |
| 直连字段 | 40 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `` | `` |
| `mainid` | `` |
| `protocol_currency` | `ucfbasedoc.bd_currencytenantref` |
| `protocolCurrencyInt` | `` |
| `tenant_id` | `` |
| `functionalcurrency` | `ucfbasedoc.bd_currencytenantref` |

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

> 共 40 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `detail_code` | `detail_code` | `detailCode` | 预提明细编号 |
| `interest_days` | `interest_days` | `interestDays` | 计息天数 |
| `with_holding_object` | `with_holding_object` | `withHoldingObject` | 预提对象 |
| `` | `code` | `code` | 编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `voucherId` | `voucherId` | `voucherId` | 凭证id |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 主表id |
| `protocol_currency` | `protocol_currency` | `protocolCurrency` | 协议币种id |
| `functionalcurrency` | `functionalcurrency` | `functionalCurrency` | 本币币种id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `protocolCurrencyInt` | `protocolCurrencyInt` | `protocolCurrencyInt` | 计息币种 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `begin_date` | `begin_date` | `beginDate` | 预提起息日 |
| `end_date` | `end_date` | `endDate` | 预提止息日 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rate_type` | `rate_type` | `rateType` | 利率类型 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `detail_voucher_status` | `detail_voucher_status` | `detail_voucherStatus` | 凭证状态 |
| `` | `status` | `status` | 单据状态 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `interest_rate` | `interest_rate` | `interestRate` | 利率（%） |
| `receipt_balance` | `receipt_balance` | `receiptBalance` | 借据余额（协议币种） |
| `financialExpensesDet` | `financialExpensesDet` | `financialExpensesDet` | 财务费用（计息币种） |
| `withholding_amount` | `withholding_amount` | `withholdingAmount` | 预提金额（协议币种） |
| `interestAdjustmentDet` | `interestAdjustmentDet` | `interestAdjustmentDet` | 利息调整（计息币种） |
| `withholding_local_amount` | `withholding_local_amount` | `withholdingLocalAmount` | 预提金额（本币币种） |
| `natInterestAdjustmentDet` | `natInterestAdjustmentDet` | `natInterestAdjustmentDet` | 利息调整（本币币种） |
| `withholdingAmountInt` | `withholdingAmountInt` | `withholdingAmountInt` | 预提金额（计息币种） |
| `natFinancialExpensesDet` | `natFinancialExpensesDet` | `natFinancialExpensesDet` | 财务费用（本币币种） |
| `amountNotWrittenOffDet` | `amountNotWrittenOffDet` | `amountNotWrittenOffDet` | 未核销金额（计息币种） |
| `amountWrittenOffDefDet` | `amountWrittenOffDefDet` | `amountWrittenOffDefDet` | 已核销金额备份(计息币种) |
| `amountWrittenOffDet` | `amountWrittenOffDet` | `amountWrittenOffDet` | 已核销金额（计息币种） |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
