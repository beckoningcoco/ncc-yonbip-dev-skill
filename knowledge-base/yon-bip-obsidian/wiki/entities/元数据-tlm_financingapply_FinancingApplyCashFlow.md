---
tags: [BIP, 元数据, 数据字典, tlm.financingapply.FinancingApplyCashFlow]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 融资申请现金流 (`tlm.financingapply.FinancingApplyCashFlow`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_financingapply_cash_flow` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：`3855b640-5338-43b8-9321-0b2214c2e625`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 融资申请现金流 |
| 物理表 | `tlm_financingapply_cash_flow` |
| domain/服务域 | `yonbip-fi-ctmtlm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `TLM` |
| 直连字段 | 49 个 |
| 子表 | 1 个 |
| 关联引用 | 11 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `financingApplyCashFlowInterest` | `tlm.financingapply.FinancingApplyCashFlowInterest` | composition |

## 关联引用 (11个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `deal_currency` | `ucfbasedoc.bd_currencytenantref` |
| `ytenant_id` | `` |
| `sync_code` | `` |
| `mainid` | `tlm_financialProductRef` |
| `protocol_currency` | `ucfbasedoc.bd_currencytenantref` |
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

> 共 49 个直连字段

### 文本字段 (17个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `event` | `event` | `event` | 事件 |
| `code` | `code` | `code` | 现金流ID |
| `relate_code` | `relate_code` | `relateCode` | 关联现金流ID |
| `term_unit` | `term_unit` | `termUnit` | 期限类型 |
| `term` | `term` | `term` | 期限 |
| `direction` | `direction` | `direction` | 方向 |
| `plan_scope` | `plan_scope` | `planScope` | 计划内/外 |
| `if_used` | `if_used` | `ifUsed` | 参照是否被使用 |
| `if_own_add` | `if_own_add` | `isOwnAdd` | 是否手动添加 |
| `interest_rate_ids` | `interest_rate_ids` | `interestRateIds` | 现金流引用（浮动）利率id集合 |
| `interest_rate_values` | `interest_rate_values` | `interestRateValues` | 现金流引用（浮动）利率值集合 |
| `ifAfterAuditAutoCreate` | `ifAfterAuditAutoCreate` | `ifAfterAuditAutoCreate` | 是否审批通过自动生成 |
| `` | `auditor` | `auditor` | 审批人名称 |
| `` | `creator` | `creator` | 创建人名称 |
| `interest_base` | `interest_base` | `interestBase` | 计息基数 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `voucher_type` | `voucher_type` | `voucherType` | 关联单据类型 |

### 引用字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 融资申请主表id |
| `flow_type` | `flow_type` | `flowType` | 流类型id |
| `sync_code` | `sync_code` | `syncCode` | 协同现金流ID |
| `protocol_currency` | `protocol_currency` | `protocolCurrency` | 协议币种id |
| `deal_currency` | `deal_currency` | `dealCurrency` | 交易币种id |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `plan_date` | `plan_date` | `planDate` | 计划日期 |
| `end_date` | `end_date` | `endDate` | 结束日期 |
| `execute_date` | `execute_date` | `executeDate` | 执行日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `term_number` | `term_number` | `termNumber` | 期限 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `execute_status` | `execute_status` | `executeStatus` | 执行状态 |
| `` | `status` | `status` | 单据状态 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `voucher_id` | `voucher_id` | `voucherId` | 关联单据id |
| `debt_id` | `debt_id` | `debtId` | 所属借据id |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `protocol_currency_amount` | `protocol_currency_amount` | `protocolAmount` | 协议币种金额 |
| `deal_currency_amount` | `deal_currency_amount` | `dealCurrencyAmount` | 交易币种金额 |
| `execute_amount` | `execute_amount` | `executeAmount` | 执行金额 |

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
| `` | `` | `financingApplyCashFlowInterest` | 融资申请现金流利息分段 |
