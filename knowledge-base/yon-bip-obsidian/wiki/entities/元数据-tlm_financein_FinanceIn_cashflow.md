---
tags: [BIP, 元数据, 数据字典, tlm.financein.FinanceIn_cashflow]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 融入登记现金流 (`tlm.financein.FinanceIn_cashflow`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_financein_cashflow` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：`9e1696a2-6b52-4635-910b-ae1743c20260`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 融入登记现金流 |
| 物理表 | `tlm_financein_cashflow` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 50 个 |
| 子表 | 1 个 |
| 关联引用 | 10 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `financeIn_cashflow_interest` | `tlm.financein.FinanceIn_cashflow_interest` | composition |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `deal_currency` | `ucfbasedoc.bd_currencytenantref` |
| `ytenant_id` | `` |
| `mainid` | `tlm_financeinRef` |
| `protocol_currency` | `ucfbasedoc.bd_currencytenantref` |
| `tenant_id` | `` |
| `flow_type` | `tlm_flowtypeRef` |

## 继承接口 (3个, 6字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`

## 字段列表（按类型分组）

> 共 50 个直连字段

### 文本字段 (17个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `auditor` | `auditor` | 审批人名称 |
| `` | `creator` | `creator` | 创建人名称 |
| `ifAfterAuditAutoCreate` | `ifAfterAuditAutoCreate` | `ifAfterAuditAutoCreate` | 是否审批通过自动生成 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `event` | `event` | `event` | 事件 |
| `code` | `code` | `code` | 现金流ID |
| `relate_code` | `relate_code` | `relateCode` | 关联现金流ID |
| `term_unit` | `term_unit` | `termUnit` | 期限类型 |
| `term` | `term` | `term` | 期限 |
| `direction` | `direction` | `direction` | 方向 |
| `plan_scope` | `plan_scope` | `planScope` | 计划内/外 |
| `if_used` | `if_used` | `ifUsed` | 参照是否被使用 |
| `interest_rate_ids` | `interest_rate_ids` | `interestRateIds` | 现金流引用(浮动)利率id集合 |
| `interest_rate_values` | `interest_rate_values` | `interestRateValues` | 现金流引用(浮动)利率值集合 |
| `if_own_add` | `if_own_add` | `isOwnAdd` | 是否手动添加 |
| `interest_base` | `interest_base` | `interestBase` | 计息基数 |
| `relate_code_for_show` | `relate_code_for_show` | `relateCodeForShow` | 展示关联现金流ID |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `mainid` | `mainid` | `mainid` | 融资登记id |
| `flow_type` | `flow_type` | `flowType` | 流类型id |
| `protocol_currency` | `protocol_currency` | `protocolCurrency` | 协议币种id |
| `deal_currency` | `deal_currency` | `dealCurrency` | 交易币种id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `interest_begin_date` | `interest_begin_date` | `interestBeginDate` | 起息日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `plan_date` | `plan_date` | `planDate` | 起息日期 |
| `end_date` | `end_date` | `endDate` | 止息日期 |
| `execute_date` | `execute_date` | `executeDate` | 执行日期 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `term_number` | `term_number` | `termNumber` | 期限 |

### 短整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `status` | `status` | 单据状态 |
| `is_overdue` | `is_overdue` | `isOverdue` | 是否逾期 |
| `execute_status` | `execute_status` | `executeStatus` | 执行状态 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sync_code` | `sync_code` | `syncCode` | 协同现金流ID |
| `` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | 主键 |
| `voucher_id` | `voucher_id` | `voucherId` | 关联单据id |

### 数值字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `protocol_currency_amount` | `protocol_currency_amount` | `protocolAmount` | 利息金额(协议币种) |
| `deal_currency_amount` | `deal_currency_amount` | `dealCurrencyAmount` | 利息金额(结息币种) |
| `execute_amount` | `execute_amount` | `executeAmount` | 执行金额 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `financeIn_cashflow_interest` | 融入现金流利息分段 |
