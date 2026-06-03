---
tags: [BIP, 元数据, 数据字典, tlm.financingrollover.FinancingRolloverTransactionFlow]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 交易进度表 (`tlm.financingrollover.FinancingRolloverTransactionFlow`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_financingrollover_transaction_flow` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 交易进度表 |
| 物理表 | `tlm_financingrollover_transaction_flow` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 52 个 |
| 子表 | 0 个 |
| 关联引用 | 9 个 |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `deal_currency` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `sync_code` | `` |
| `mainid` | `` |
| `protocol_currency` | `` |
| `tenant_id` | `` |
| `flow_type` | `` |

## 继承接口 (3个, 10字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 52 个直连字段

### 文本字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `business_key` | `business_key` | `businessKey` | 业务主键 |
| `code` | `code` | `code` | 现金流ID |
| `contract_id` | `contract_id` | `contractId` | 合约主键 |
| `contract_refer_num` | `contract_refer_num` | `contractReferNum` | 合约参考号 |
| `` | `creator` | `creator` | 创建人名称 |
| `currency` | `currency` | `currency` | 币种 |
| `diary_id` | `diary_id` | `diaryId` | 交易进度主键 |
| `direction` | `direction` | `direction` | 方向 |
| `event` | `event` | `event` | 核算事件 |
| `if_used` | `if_used` | `ifUsed` | 参照是否被使用 |
| `is_ok` | `is_ok` | `isOk` | 准备 |
| `if_own_add` | `if_own_add` | `isOwnAdd` | 是否手动添加 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `operate` | `operate` | `operate` | 交易操作 |
| `plan_scope` | `plan_scope` | `planScope` | 计划内/外 |
| `relate_code` | `relate_code` | `relateCode` | 关联现金流ID |
| `session_key` | `session_key` | `sessionId` | session主键 |
| `voucher_type` | `voucher_type` | `voucherType` | 关联单据类型 |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `deal_currency` | `deal_currency` | `dealCurrency` | 交易币种 |
| `flow_type` | `flow_type` | `flowType` | 流类型 |
| `mainid` | `mainid` | `mainid` | 融入登记id |
| `` | `modifierId` | `modifierId` | 修改人 |
| `protocol_currency` | `protocol_currency` | `protocolCurrency` | 协议币种 |
| `sync_code` | `sync_code` | `syncCode` | 协同费用计划ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cashflow_date` | `cashflow_date` | `cashflowDate` | 现金流日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `effective_date` | `effective_date` | `effectiveDate` | 生效日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `record_date` | `record_date` | `recordDate` | 记录日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |

### 短整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `execute_status` | `execute_status` | `executeStatus` | 执行状态 |
| `is_init` | `is_init` | `isInit` | 是否初始化 |
| `is_overdue` | `is_overdue` | `isOverdue` | 是否逾期 |
| `` | `status` | `status` | 单据状态 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `debt_id` | `debt_id` | `debtId` | 所属借据id |
| `id` | `id` | `id` | ID |
| `` | `tplid` | `tplid` | 模板id |
| `voucher_id` | `voucher_id` | `voucherId` | 关联单据id |

### 数值字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `balance` | `balance` | `balance` | 余额 |
| `deal_currency_amount` | `deal_currency_amount` | `dealCurrencyAmount` | 交易币种金额 |
| `execute_amount` | `execute_amount` | `executeAmount` | 结算金额 |
| `interest` | `interest` | `interest` | 利息 |
| `interest_adjustment` | `interest_adjustment` | `interestAdjustment` | 利息调整 |
| `principal` | `principal` | `principal` | 本金 |
| `protocol_currency_amount` | `protocol_currency_amount` | `protocolAmount` | 协议币种金额 |
| `total_interest` | `total_interest` | `totalInterest` | 总利率 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
