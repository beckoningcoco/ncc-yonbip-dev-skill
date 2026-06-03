---
tags: [BIP, 元数据, 数据字典, tlm.financingrollover.FinancingRolloverCashFlowBackup]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 融入展期关联现金流历史备份表 (`tlm.financingrollover.FinancingRolloverCashFlowBackup`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_financingrollover_cashflow_backup` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 融入展期关联现金流历史备份表 |
| 物理表 | `tlm_financingrollover_cashflow_backup` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 45 个 |
| 子表 | 1 个 |
| 关联引用 | 9 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `rolloverCashFlowInterestBackup` | `tlm.financingrollover.FinancingRolloverCashFlowInterestBackup` | composition |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `deal_currency` | `` |
| `ytenant_id` | `` |
| `` | `` |
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

> 共 45 个直连字段

### 文本字段 (16个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 现金流ID |
| `` | `creator` | `creator` | 创建人名称 |
| `direction` | `direction` | `direction` | 方向 |
| `event` | `event` | `event` | 现金流事件 |
| `ifAfterAuditAutoCreate` | `ifAfterAuditAutoCreate` | `ifAfterAuditAutoCreate` | 是否审批通过自动生成 |
| `if_used` | `if_used` | `ifUsed` | 参照是否被使用 |
| `interest_base` | `interest_base` | `interestBase` | 计息基数 |
| `interest_rate_ids` | `interest_rate_ids` | `interestRateIds` | 现金流引用利率id集合 |
| `interest_rate_values` | `interest_rate_values` | `interestRateValues` | 现金流引用利率值集合 |
| `if_own_add` | `if_own_add` | `isOwnAdd` | 是否手动添加 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `plan_scope` | `plan_scope` | `planScope` | 计划内/外 |
| `relate_code` | `relate_code` | `relateCode` | 关联现金流ID |
| `relate_code_for_show` | `relate_code_for_show` | `relateCodeForShow` | 展示关联现金流ID |
| `term` | `term` | `term` | 融资期限 |
| `term_unit` | `term_unit` | `termUnit` | 期限类型 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `deal_currency` | `deal_currency` | `dealCurrency` | 交易币种 |
| `flow_type` | `flow_type` | `flowType` | 流类型 |
| `mainid` | `mainid` | `mainid` | 融入展期ID |
| `` | `modifierId` | `modifierId` | 修改人 |
| `protocol_currency` | `protocol_currency` | `protocolCurrency` | 协议币种 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `end_date` | `end_date` | `endDate` | 结束日期 |
| `execute_date` | `execute_date` | `executeDate` | 执行日期 |
| `interest_begin_date` | `interest_begin_date` | `interestBeginDate` | 起息日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `plan_date` | `plan_date` | `planDate` | 计划日期 |
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
| `id` | `id` | `id` | ID |
| `` | `tplid` | `tplid` | 模板id |
| `voucher_id` | `voucher_id` | `voucherId` | 关联单据id |

### 数值字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `deal_currency_amount` | `deal_currency_amount` | `dealCurrencyAmount` | 交易币种金额 |
| `execute_amount` | `execute_amount` | `executeAmount` | 执行金额 |
| `protocol_currency_amount` | `protocol_currency_amount` | `protocolAmount` | 协议币种金额 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `rolloverCashFlowInterestBackup` | 融入展期现金流利息分段历史备份表 |
