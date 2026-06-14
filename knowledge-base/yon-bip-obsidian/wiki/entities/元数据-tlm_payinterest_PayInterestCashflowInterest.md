---
tags: [BIP, 元数据, 数据字典, tlm.payinterest.PayInterestCashflowInterest]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 付息现金流利息分段 (`tlm.payinterest.PayInterestCashflowInterest`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_payinterest_cashflow_interest` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 付息现金流利息分段 |
| 物理表 | `tlm_payinterest_cashflow_interest` |
| domain/服务域 | `yonbip-fi-ctmtlm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `TLM` |
| 直连字段 | 30 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `interest_currency` | `` |
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

> 共 30 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 付息code |
| `` | `creator` | `creator` | 创建人名称 |
| `debt_id` | `debt_id` | `debtId` | 借据id |
| `interest_days` | `interest_days` | `interestDays` | 计息天数 |
| `interest_type` | `interest_type` | `interestType` | 利息类型 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `protocol_id` | `protocol_id` | `protocolId` | 协议id |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `interest_currency` | `interest_currency` | `interestCurrency` | 计息币种 |
| `mainid` | `mainid` | `mainid` | 付息现金流id |
| `` | `modifierId` | `modifierId` | 修改人 |
| `protocol_currency` | `protocol_currency` | `protocolCurrency` | 协议币种 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `stop_date` | `stop_date` | `stopDate` | 止息日 |
| `value_date` | `value_date` | `valueDate` | 起息日 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `status` | `status` | 单据状态 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `interest_amount` | `interest_amount` | `interestAmount` | 利息金额（结息币种） |
| `interest_base_amount` | `interest_base_amount` | `interestBaseAmount` | 计息基础金额 |
| `interest_protocol_amount` | `interest_protocol_amount` | `interestProtocolAmount` | 利息金额（协议币种） |
| `interest_rate` | `interest_rate` | `interestRate` | 利息约定汇率 |
| `rate` | `rate` | `rate` | 利率 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
