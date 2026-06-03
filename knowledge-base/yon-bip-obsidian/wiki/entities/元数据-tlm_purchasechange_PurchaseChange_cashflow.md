---
tags: [BIP, 元数据, 数据字典, tlm.purchasechange.PurchaseChange_cashflow]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 申购变更现金流 (`tlm.purchasechange.PurchaseChange_cashflow`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_purchasechange_cashflow` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：`303db6d5-34dc-4b52-80a6-b78c27409ae2`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 申购变更现金流 |
| 物理表 | `tlm_purchasechange_cashflow` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 53 个 |
| 子表 | 1 个 |
| 关联引用 | 10 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `purchaseChange_cashflow_interest` | `tlm.purchasechange.PurchaseChange_cashflow_interest` | composition |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `deal_currency` | `bd_currencytenantreflist` |
| `ytenant_id` | `` |
| `mainid` | `` |
| `protocol_currency` | `bd_currencytenantreflist` |
| `tenant_id` | `` |
| `flow_type` | `tlm_flowtypeRef` |

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

> 共 53 个直连字段

### 文本字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `event` | `event` | `event` | 现金流事件 |
| `code` | `code` | `code` | 现金流ID |
| `ifAfterAuditAutoCreate` | `ifAfterAuditAutoCreate` | `ifAfterAuditAutoCreate` | 是否审批通过自动生成 |
| `interest_rate_ids` | `interest_rate_ids` | `interestRateIds` | 现金流引用利率id集合 |
| `interest_rate_values` | `interest_rate_values` | `interestRateValues` | 现金流引用利率值集合 |
| `relate_code_for_show` | `relate_code_for_show` | `relateCodeForShow` | 展示关联现金流ID |
| `cash_flow_type` | `cash_flow_type` | `cashFlowType` | 现金流类型 |
| `interest_base` | `interest_base` | `interestBase` | 计息基数 |
| `` | `auditor` | `auditor` | 审批人名称 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `relate_code` | `relate_code` | `relateCode` | 关联现金流ID |
| `term_unit` | `term_unit` | `termUnit` | 期限类型 |
| `term` | `term` | `term` | 期限 |
| `direction` | `direction` | `direction` | 方向 |
| `planScope` | `planScope` | `planScope` | 计划内/外 |
| `if_used` | `if_used` | `ifUsed` | 参照是否被使用 |
| `if_own_add` | `if_own_add` | `isOwnAdd` | 是否手动添加 |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 申购登记主表id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `flow_type` | `flow_type` | `flowType` | 流类型id |
| `protocol_currency` | `protocol_currency` | `protocolCurrency` | 协议币种id |
| `deal_currency` | `deal_currency` | `dealCurrency` | 交易币种id |

### 日期字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `interest_begin_date` | `interest_begin_date` | `interestBeginDate` | 起息日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `plan_date` | `plan_date` | `planDate` | 计划日期 |
| `end_date` | `end_date` | `endDate` | 结束日期 |
| `executeDate` | `executeDate` | `executeDate` | 执行日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `from_pr` | `from_pr` | `frompr` | 是否来自申购单 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `term_number` | `term_number` | `termNumber` | 期限 |

### 短整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_overdue` | `is_overdue` | `isOverdue` | 是否逾期 |
| `` | `status` | `status` | 单据状态 |
| `executeStatus` | `executeStatus` | `executeStatus` | 执行状态 |
| `is_init` | `is_init` | `isInit` | 是否期初 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `voucher_id` | `voucher_id` | `voucherId` | 关联单据ID |
| `id` | `id` | `id` | 主键 |
| `sync_code` | `sync_code` | `syncCode` | 协同现金流ID |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `protocol_currency_amount` | `protocol_currency_amount` | `protocolAmount` | 协议币种金额 |
| `deal_currency_amount` | `deal_currency_amount` | `dealCurrencyAmount` | 交易币种金额 |
| `executeAmount` | `executeAmount` | `executeAmount` | 执行金额 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `purchaseChange_cashflow_interest` | 申购现金流利息分段 |
