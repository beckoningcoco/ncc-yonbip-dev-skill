---
tags: [BIP, 元数据, 数据字典, tlm.interestcollection.InterestCollectionCashFlow]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 收息现金流子表 (`tlm.interestcollection.InterestCollectionCashFlow`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_interestcollection_cashflow` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 收息现金流子表 |
| 物理表 | `tlm_interestcollection_cashflow` |
| domain/服务域 | `yonbip-fi-ctmtlm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `TLM` |
| 直连字段 | 50 个 |
| 子表 | 1 个 |
| 关联引用 | 7 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `interestCollectionCashflowInterest` | `tlm.interestcollection.InterestCollectionCashflowInterest` | composition |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `deal_currency` | `` |
| `ytenant_id` | `` |
| `accentity_id` | `` |
| `mainid` | `` |
| `protocol_currency` | `` |
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

> 共 50 个直连字段

### 文本字段 (25个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `debt_id` | `debt_id` | `debtId` | 申购主表id |
| `direction` | `direction` | `direction` | 方向 |
| `accentity_Name` | `accentity_Name` | `accentityName` | 资金组织 |
| `cash_flow_type` | `cash_flow_type` | `cashFlowType` | 现金流类型 |
| `code` | `code` | `code` | 现金流编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `creatorId` | `creatorId` | `creatorId` | 创建人 |
| `event` | `event` | `event` | 现金流事件 |
| `ifAfterAuditAutoCreate` | `ifAfterAuditAutoCreate` | `ifAfterAuditAutoCreate` | 是否审批通过自动生成 |
| `if_used` | `if_used` | `ifUsed` | 参照是否被使用 |
| `interest_base` | `interest_base` | `interestBase` | 计息基数 |
| `interest_rate_ids` | `interest_rate_ids` | `interestRateIds` | 现金流引用利率id集合 |
| `interest_rate_values` | `interest_rate_values` | `interestRateValues` | 现金流引用利率值集合 |
| `if_own_add` | `if_own_add` | `isOwnAdd` | 是否手动添加 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `modifierId` | `modifierId` | `modifierId` | 修改人 |
| `plan_scope` | `plan_scope` | `planScope` | 计划内/外 |
| `protocol_id` | `protocol_id` | `protocolId` | 协议id |
| `relate_code` | `relate_code` | `relateCode` | 关联现金流编码 |
| `relate_code_for_show` | `relate_code_for_show` | `relateCodeForShow` | 展示关联现金流ID |
| `relateCodeId` | `relateCodeId` | `relateCodeId` | 关联现金流id |
| `tenant_id` | `tenant_id` | `tenant` | 租户id |
| `term` | `term` | `term` | 融资期限 |
| `term_unit` | `term_unit` | `termUnit` | 期限类型 |
| `voucher_id` | `voucher_id` | `voucherId` | 关联单据id |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 投资收息主表id |
| `accentity_id` | `accentity_id` | `accentityId` | 资金组织Id |
| `deal_currency` | `deal_currency` | `dealCurrency` | 交易币种 |
| `flow_type` | `flow_type` | `flowType` | 流类型 |
| `protocol_currency` | `protocol_currency` | `protocolCurrency` | 协议币种 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `plan_date` | `plan_date` | `planDate` | 计划日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `end_date` | `end_date` | `endDate` | 结束日期 |
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

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 借据id |
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
| `` | `` | `interestCollectionCashflowInterest` | 收息现金流利息分段 |
