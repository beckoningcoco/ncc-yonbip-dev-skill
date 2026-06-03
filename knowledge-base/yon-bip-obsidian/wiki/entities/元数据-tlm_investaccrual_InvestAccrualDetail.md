---
tags: [BIP, 元数据, 数据字典, tlm.investaccrual.InvestAccrualDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 投资预提利息明细信息 (`tlm.investaccrual.InvestAccrualDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_investaccrual_detail` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 投资预提利息明细信息 |
| 物理表 | `tlm_investaccrual_detail` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 45 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `detail_protocol_currency` | `ucfbasedoc.bd_currencytenantref` |
| `` | `` |
| `detail_locol_currency` | `ucfbasedoc.bd_currencytenantref` |
| `mainid` | `` |
| `detail_interest_currency` | `ucfbasedoc.bd_currencytenantref` |
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

> 共 45 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `invest_accrual_detail_code` | `invest_accrual_detail_code` | `investAccrualDetailCode` | 预提明细编号 |
| `detail_interest_days` | `detail_interest_days` | `detail_interestDays` | 计息天数 |
| `detail_rate_type` | `detail_rate_type` | `detail_rateType` | 利率类型 |
| `detail_with_holding_object` | `detail_with_holding_object` | `detail_withHoldingObject` | 预提对象 |
| `detail_voucher_status` | `detail_voucher_status` | `detail_voucherStatus` | 凭证状态 |
| `relateRecordCode` | `relateRecordCode` | `relateRecordCode` | 关联计划编码 |
| `` | `code` | `code` | 编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `voucherId` | `voucherId` | `voucherId` | 凭证id |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `detail_interest_currency` | `detail_interest_currency` | `detail_interestCurrency` | 计息币种id |
| `mainid` | `mainid` | `mainid` | 预提主键id |
| `detail_protocol_currency` | `detail_protocol_currency` | `detail_protocolCurrency` | 协议币种id |
| `detail_locol_currency` | `detail_locol_currency` | `detail_localCurrency` | 本币币种id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `detail_begin_date` | `detail_begin_date` | `detail_beginDate` | 预提起息日 |
| `detail_end_date` | `detail_end_date` | `detail_endDate` | 预提止息日 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `status` | `status` | 单据状态 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `relateRecordId` | `relateRecordId` | `relateRecordId` | 关联计划id |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `detail_interest_rate` | `detail_interest_rate` | `detail_interestRate` | 利率（%） |
| `detail_receipt_balance` | `detail_receipt_balance` | `detail_receiptBalance` | 申购单余额（协议币种） |
| `detail_withholding_amount` | `detail_withholding_amount` | `detail_withholdingAmount` | 预提金额（协议币种） |
| `detailProIncInvAmount` | `detailProIncInvAmount` | `detailProIncInvAmount` | 投资收益(协议币种) |
| `detailProIntAdjAmount` | `detailProIntAdjAmount` | `detailProIntAdjAmount` | 利息调整(协议币种) |
| `detail_interestreceipt_balance` | `detail_interestreceipt_balance` | `detail_interestReceiptBalance` | 申购单余额（计息币种） |
| `detail_withholding_local_amount` | `detail_withholding_local_amount` | `detail_withholdingLocalAmount` | 预提金额（本币币种） |
| `detail_wdIntereestAmount` | `detail_wdIntereestAmount` | `detail_wdIntereestAmount` | 预提金额（计息币种） |
| `detailInterestIncInvAmount` | `detailInterestIncInvAmount` | `detailInterestIncInvAmount` | 投资收益(计息币种) |
| `detailLocProIncInvAmount` | `detailLocProIncInvAmount` | `detailLocProIncInvAmount` | 投资收益（本币币种） |
| `detailLocIntAdjAmount` | `detailLocIntAdjAmount` | `detailLocIntAdjAmount` | 利息调整（本币币种） |
| `detailInterestIntAdjAmount` | `detailInterestIntAdjAmount` | `detailInterestIntAdjAmount` | 利息调整(计息币种) |
| `amount_written_offdef_det` | `amount_written_offdef_det` | `amountWrittenOffDefDet` | 已核销金额备份(计息币种) |
| `amount_written_off_det` | `amount_written_off_det` | `amountWrittenOffDet` | 已核销金额(计息币种) |
| `unamount_written_off_det` | `unamount_written_off_det` | `unAmountWrittenOffDet` | 未核销金额(计息币种) |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
