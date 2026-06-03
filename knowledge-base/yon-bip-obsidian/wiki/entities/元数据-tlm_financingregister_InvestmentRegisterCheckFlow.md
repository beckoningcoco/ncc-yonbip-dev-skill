---
tags: [BIP, 元数据, 数据字典, tlm.financingregister.InvestmentRegisterCheckFlow]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 金融合同核算流 (`tlm.financingregister.InvestmentRegisterCheckFlow`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_investmentregister_check_flow` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 金融合同核算流 |
| 物理表 | `tlm_investmentregister_check_flow` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 49 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |
| `local_currency` | `bd_currencytenantreflist` |
| `mainid` | `` |
| `original_currency` | `bd_currencytenantreflist` |
| `tenant_id` | `` |

## 继承接口 (3个, 6字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 49 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `auditor` | `auditor` | 审批人名称 |
| `code` | `code` | `code` | 核算编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `event` | `event` | `event` | 核算事件 |
| `voucher_id` | `voucher_id` | `voucherId` | 关联单据id |
| `voucher_type` | `voucher_type` | `voucherType` | 关联单据类型 |
| `voucher_code` | `voucher_code` | `voucherCode` | 关联单据编号 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `auditorId` | `auditorId` | 审批人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `mainid` | `mainid` | `mainid` | 投资登记主表id |
| `original_currency` | `original_currency` | `originalCurrency` | 原币币种id |
| `local_currency` | `local_currency` | `localCurrency` | 本币币种id |

### 日期字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `check_date` | `check_date` | `checkDate` | 核算日期 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `status` | `status` | 单据状态 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `debt_id` | `debt_id` | `debtId` | 所属借据id |
| `` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | 主键 |

### 数值字段 (20个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `original_currency_fpal` | `original_currency_fpal` | `originalCurrencyFpal` | 原币浮动盈亏 |
| `declared_unpaid_cc_interest` | `declared_unpaid_cc_interest` | `declaredUnpaidCcInterest` | 已宣告未发放的利息(原币币种) |
| `original_currency_rgal` | `original_currency_rgal` | `originalCurrencyRgal` | 原币实际盈亏 |
| `init_cc_gains_losses` | `init_cc_gains_losses` | `initCcGainsLosses` | 初始损益/损益调整(原币币种) |
| `real_cc_interest` | `real_cc_interest` | `realCcInterest` | 实际利息(原币币种) |
| `amortized_cc_cost` | `amortized_cc_cost` | `amortizedCcCost` | 摊余成本(原币币种) |
| `fair_cc_value` | `fair_cc_value` | `fairCcValue` | 公允价值(原币币种) |
| `deal_cc_amount` | `deal_cc_amount` | `dealCcAmount` | 实收金额(原币币种) |
| `local_currency_fpal` | `local_currency_fpal` | `localCurrencyFpal` | 本币浮动盈亏 |
| `deal_all_paid_cc_amount` | `deal_all_paid_cc_amount` | `dealAllPaidCcAmount` | 交易金额(原币币种) |
| `local_currency_rgal` | `local_currency_rgal` | `localCurrencyRgal` | 本币实际盈亏 |
| `declared_unpaid_oc_interest` | `declared_unpaid_oc_interest` | `declaredUnpaidOcInterest` | 已宣告未发放的利息(本币币种) |
| `init_oc_gains_losses` | `init_oc_gains_losses` | `initOcGainsLosses` | 初始损益/损益调整(本币币种) |
| `real_oc_interest` | `real_oc_interest` | `realOcInterest` | 实际利息(本币币种) |
| `amortized_oc_cost` | `amortized_oc_cost` | `amortizedOcCost` | 摊余成本(本币币种) |
| `fair_oc_value` | `fair_oc_value` | `fairOcValue` | 公允价值(本币币种) |
| `deal_all_paid_oc_amount` | `deal_all_paid_oc_amount` | `dealAllPaidOcAmount` | 实收金额(本币币种) |
| `deal_oc_amount` | `deal_oc_amount` | `dealOcAmount` | 交易金额(本币币种) |
| `original_amount` | `original_amount` | `originalAmount` | 原币币种金额 |
| `local_amount` | `local_amount` | `localAmount` | 本币币种金额 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
