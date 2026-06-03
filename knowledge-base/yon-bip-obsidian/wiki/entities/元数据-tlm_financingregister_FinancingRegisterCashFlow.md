---
tags: [BIP, 元数据, 数据字典, tlm.financingregister.FinancingRegisterCashFlow]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 金融合同现金流 (`tlm.financingregister.FinancingRegisterCashFlow`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_financingregister_cash_flow` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：`873ba360-a797-4cd9-bf2e-8aa15483f804`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 金融合同现金流 |
| 物理表 | `tlm_financingregister_cash_flow` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 57 个 |
| 子表 | 1 个 |
| 关联引用 | 11 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `financingRegisterCashFlowInterest` | `tlm.financingregister.FinancingRegisterCashFlowInterest` | composition |

## 关联引用 (11个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `deal_currency` | `bd_currencytenantreflist` |
| `ytenant_id` | `` |
| `sync_code` | `` |
| `mainid` | `tlm_financialProductRef` |
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

> 共 57 个直连字段

### 文本字段 (22个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `auditor` | `auditor` | 审批人名称 |
| `voucher_type` | `voucher_type` | `voucherType` | 关联单据类型 |
| `relate_code_for_show` | `relate_code_for_show` | `relateCodeForShow` | 展示关联现金流ID |
| `cash_flow_type` | `cash_flow_type` | `cashFlowType` | 现金流类型 |
| `principal_interest_type` | `principal_interest_type` | `principalInterestType` | 类型 |
| `direct_link_id` | `direct_link_id` | `directLinkId` | 银企联现金流id |
| `direct_link_Relate_id` | `direct_link_Relate_id` | `directLinkRelateId` | 银企联关联现金流id |
| `interest_base` | `interest_base` | `interestBase` | 计息基数 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `event` | `event` | `event` | 现金流事件 |
| `direction` | `direction` | `direction` | 方向 |
| `code` | `code` | `code` | 现金流ID |
| `relate_code` | `relate_code` | `relateCode` | 关联现金流ID |
| `term_unit` | `term_unit` | `termUnit` | 期限单位 |
| `term` | `term` | `term` | 期限 |
| `if_own_add` | `if_own_add` | `isOwnAdd` | 是否手动添加 |
| `plan_scope` | `plan_scope` | `planScope` | 计划内/外 |
| `if_used` | `if_used` | `ifUsed` | 参照是否被使用 |
| `interest_rate_ids` | `interest_rate_ids` | `interestRateIds` | 现金流引用(浮动)利率id集合 |
| `interest_rate_values` | `interest_rate_values` | `interestRateValues` | 现金流引用(浮动)利率值集合 |
| `ifAfterAuditAutoCreate` | `ifAfterAuditAutoCreate` | `ifAfterAuditAutoCreate` | 是否审批通过自动生成 |

### 引用字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `auditorId` | `auditorId` | 审批人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `flow_type` | `flow_type` | `flowType` | 流类型id |
| `mainid` | `mainid` | `mainid` | 融资登记id |
| `protocol_currency` | `protocol_currency` | `protocolCurrency` | 协议币种id |
| `sync_code` | `sync_code` | `syncCode` | 协同现金流ID |
| `deal_currency` | `deal_currency` | `dealCurrency` | 交易币种id |

### 日期字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `interest_begin_date` | `interest_begin_date` | `interestBeginDate` | 起息日期 |
| `plan_date` | `plan_date` | `planDate` | 起息日期 |
| `end_date` | `end_date` | `endDate` | 止息日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `execute_date` | `execute_date` | `executeDate` | 执行日期 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `term_number` | `term_number` | `termNumber` | 期限 |

### 短整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `status` | `status` | 单据状态 |
| `is_overdue` | `is_overdue` | `isOverdue` | 是否逾期 |
| `is_init` | `is_init` | `isInit` | 是否期初 |
| `execute_status` | `execute_status` | `executeStatus` | 执行状态 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `debt_id` | `debt_id` | `debtId` | 所属借据id |
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
| `` | `` | `financingRegisterCashFlowInterest` | 金融合同现金流利息分段 |
