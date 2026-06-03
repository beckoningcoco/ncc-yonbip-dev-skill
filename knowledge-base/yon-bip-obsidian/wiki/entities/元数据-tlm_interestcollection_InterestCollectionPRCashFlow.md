---
tags: [BIP, 元数据, 数据字典, tlm.interestcollection.InterestCollectionPRCashFlow]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 收息单据勾选融入现金流子表 (`tlm.interestcollection.InterestCollectionPRCashFlow`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_interestcollection_prcashflow` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 收息单据勾选融入现金流子表 |
| 物理表 | `tlm_interestcollection_prcashflow` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 34 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `accentity_id` | `` |
| `cash_flow` | `tlm_purchaseregister_cashflowRef` |
| `mainid` | `` |
| `protocol_currency` | `` |
| `trade_currency` | `` |
| `flow_type` | `` |

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

> 共 34 个直连字段

### 文本字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity_Name` | `accentity_Name` | `accentityName` | 资金组织 |
| `` | `code` | `code` | 编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `creatorId` | `creatorId` | `creatorId` | 创建人 |
| `debt_id` | `debt_id` | `debtId` | 借据id |
| `direction` | `direction` | `direction` | 方向 |
| `event` | `event` | `event` | 现金流事件枚举 |
| `execute_state` | `execute_state` | `executeState` | 执行状态 |
| `cash_flow_code` | `cash_flow_code` | `interestCollectionAmount_code` | 收息勾选现金流编码 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `modifierId` | `modifierId` | `modifierId` | 修改人 |
| `protocol_id` | `protocol_id` | `protocolId` | 协议id |
| `relate_cash_flow_code` | `relate_cash_flow_code` | `relateCashFlowCode` | 关联现金流编码 |
| `relate_cash_flow_id` | `relate_cash_flow_id` | `relateCashFlowId` | 关联现金流id |
| `tenant_id` | `tenant_id` | `tenant` | 租户id |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cash_flow` | `cash_flow` | `interestCollectionAmountRef` | 收息现金流ID |
| `accentity_id` | `accentity_id` | `accentityId` | 资金组织Id |
| `flow_type` | `flow_type` | `flowType` | 流类型 |
| `mainid` | `mainid` | `mainid` | 收息主键 |
| `protocol_currency` | `protocol_currency` | `protocolCurrency` | 协议币种 |
| `trade_currency` | `trade_currency` | `tradeCurrency` | 交易币种 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `schedule_date` | `schedule_date` | `scheduleDate` | 计划日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `status` | `status` | 单据状态 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
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
