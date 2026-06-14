---
tags: [BIP, 元数据, 数据字典, tlm.payinterest.PiSumCashFlow]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 汇总现金流明细表 (`tlm.payinterest.PiSumCashFlow`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_pisum_cashflow` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 汇总现金流明细表 |
| 物理表 | `tlm_pisum_cashflow` |
| domain/服务域 | `yonbip-fi-ctmtlm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `TLM` |
| 直连字段 | 41 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `cash_flow` | `` |
| `ytenant_id` | `` |
| `accentity_id` | `` |
| `debt_id` | `tlm_financeinRef` |
| `mainid` | `` |
| `protocol_currency` | `ucfbasedoc.bd_currencytenantref` |
| `trade_currency` | `ucfbasedoc.bd_currencytenantref` |
| `flow_type` | `tlm_flowtypeRef` |

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

> 共 41 个直连字段

### 文本字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `code` | `code` | 现金流ID |
| `relate_cash_flow_id` | `relate_cash_flow_id` | `relateCashFlowId` | 关联现金流 |
| `relate_cash_flow_code` | `relate_cash_flow_code` | `relateCashFlowCode` | 关联现金流ID |
| `direction` | `direction` | `direction` | 方向 |
| `accentity_Name` | `accentity_Name` | `accentityName` | 资金组织 |
| `cf_business_type` | `cf_business_type` | `cfBusinessType` | 上个写融入现金流的业务类型 |
| `` | `creator` | `creator` | 创建人名称 |
| `creatorId` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `modifierId` | `modifierId` | `modifierId` | 修改人 |
| `cash_flow_code` | `cash_flow_code` | `payInterestAmount_code` | 付息勾选现金流编码 |
| `protocol_id` | `protocol_id` | `protocolId` | 协议id |
| `tenant_id` | `tenant_id` | `tenant` | 租户id |
| `term` | `term` | `term` | 融资期限 |
| `term_unit` | `term_unit` | `termUnit` | 期限类型 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 融资付息主表id |
| `debt_id` | `debt_id` | `debtId` | 借据id |
| `flow_type` | `flow_type` | `flowType` | 流类型id |
| `protocol_currency` | `protocol_currency` | `protocolCurrency` | 协议币种id |
| `trade_currency` | `trade_currency` | `tradeCurrency` | 交易币种id |
| `accentity_id` | `accentity_id` | `accentityId` | 资金组织Id |
| `cash_flow` | `cash_flow` | `payInterestAmountRef` | 付息勾选的现金流id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `schedule_date` | `schedule_date` | `scheduleDate` | 计划日期 |
| `start_date` | `start_date` | `startDate` | 开始日期 |
| `end_date` | `end_date` | `endDate` | 结束日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `term_number` | `term_number` | `termNumber` | 期限数量 |

### 短整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `execute_status` | `execute_status` | `executeStatus` | 执行状态 |
| `is_overdue` | `is_overdue` | `isOverdue` | 是否逾期 |
| `` | `status` | `status` | 单据状态 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |
| `cf_business_id` | `cf_business_id` | `cfBusinessId` | 上个写融入现金流的业务id |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `protocol_currency_amount` | `protocol_currency_amount` | `protocolCurrencyAmount` | 协议币种金额 |
| `trade_currency_amount` | `trade_currency_amount` | `tradeCurrencyAmount` | 交易币种金额 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
