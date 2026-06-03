---
tags: [BIP, 元数据, 数据字典, tlm.interestcollection.IntColFutureCashFlow]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 收息未来现金流子表 (`tlm.interestcollection.IntColFutureCashFlow`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_intcol_futcashflow` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 收息未来现金流子表 |
| 物理表 | `tlm_intcol_futcashflow` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 47 个 |
| 子表 | 1 个 |
| 关联引用 | 6 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `intColFutureCashflowInterest` | `tlm.interestcollection.IntColFutureCashflowInterest` | composition |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `deal_currency` | `ucfbasedoc.bd_currencytenantref` |
| `ytenant_id` | `` |
| `mainid` | `` |
| `protocol_currency` | `ucfbasedoc.bd_currencytenantref` |
| `` | `` |
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

> 共 47 个直连字段

### 文本字段 (24个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `code` | `code` | `code` | 现金流编码 |
| `relate_codeid` | `relate_codeid` | `relateCodeId` | 关联现金流 |
| `relate_code` | `relate_code` | `relateCode` | 关联现金流ID |
| `direction` | `direction` | `direction` | 方向 |
| `protocol_id` | `protocol_id` | `protocolId` | 协议id |
| `debt_id` | `debt_id` | `debtId` | 借据id |
| `event` | `event` | `event` | 事件 |
| `cash_flow_type` | `cash_flow_type` | `cashFlowType` | 现金流类型 |
| `` | `creator` | `creator` | 创建人名称 |
| `creatorId` | `creatorId` | `creatorId` | 创建人 |
| `ifAfterAuditAutoCreate` | `ifAfterAuditAutoCreate` | `ifAfterAuditAutoCreate` | 是否审批通过自动生成 |
| `if_used` | `if_used` | `ifUsed` | 参照是否被使用 |
| `interest_base` | `interest_base` | `interestBase` | 计息基数 |
| `interest_rate_ids` | `interest_rate_ids` | `interestRateIds` | 现金流引用利率id集合 |
| `interest_rate_values` | `interest_rate_values` | `interestRateValues` | 现金流引用利率值集合 |
| `if_own_add` | `if_own_add` | `isOwnAdd` | 是否手动添加 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `modifierId` | `modifierId` | `modifierId` | 修改人 |
| `plan_scope` | `plan_scope` | `planScope` | 计划内/外 |
| `tenant_id` | `tenant_id` | `tenant` | 租户id |
| `term` | `term` | `term` | 融资期限 |
| `term_unit` | `term_unit` | `termUnit` | 期限类型 |
| `voucher_id` | `voucher_id` | `voucherId` | 关联单据id |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 投资收息主表id |
| `flow_type` | `flow_type` | `flowType` | 流类型id |
| `protocol_currency` | `protocol_currency` | `protocolCurrency` | 协议币种id |
| `deal_currency` | `deal_currency` | `dealCurrency` | 交易币种id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `plan_date` | `plan_date` | `planDate` | 计划日期 |
| `end_date` | `end_date` | `endDate` | 结束日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `execute_date` | `execute_date` | `executeDate` | 执行日期 |
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

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `protocol_currency_amount` | `protocol_currency_amount` | `protocolAmount` | 协议币种金额 |
| `deal_currency_amount` | `deal_currency_amount` | `dealCurrencyAmount` | 交易币种金额 |
| `execute_amount` | `execute_amount` | `executeAmount` | 执行金额 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `intColFutureCashflowInterest` | 收息未来现金流利息分段 |
