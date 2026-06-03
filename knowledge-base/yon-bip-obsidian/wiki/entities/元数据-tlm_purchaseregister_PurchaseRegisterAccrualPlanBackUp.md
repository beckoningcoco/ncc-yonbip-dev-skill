---
tags: [BIP, 元数据, 数据字典, tlm.purchaseregister.PurchaseRegisterAccrualPlanBackUp]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 预提利息计划备份 (`tlm.purchaseregister.PurchaseRegisterAccrualPlanBackUp`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_purchaseregister_accrual_plan_backUp` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 预提利息计划备份 |
| 物理表 | `tlm_purchaseregister_accrual_plan_backUp` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 37 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |
| `sync_code` | `` |
| `mainid` | `` |
| `protocol_currency` | `` |
| `tenant_id` | `` |

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

> 共 37 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `auditor` | `auditor` | 审批人名称 |
| `code` | `code` | `code` | 预提利息计划编号 |
| `` | `creator` | `creator` | 创建人名称 |
| `interest_days` | `interest_days` | `interestDays` | 计息天数 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `relate_code` | `relate_code` | `relateCode` | 关联预提利息计划编号 |
| `voucher_type` | `voucher_type` | `voucherType` | 关联单据类型 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `mainid` | `mainid` | `mainid` | 申购登记id |
| `` | `modifierId` | `modifierId` | 修改人 |
| `protocol_currency` | `protocol_currency` | `protocolCurrency` | 协议币种 |
| `sync_code` | `sync_code` | `syncCode` | 协同预提利息计划ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accrual_begin_date` | `accrual_begin_date` | `accrualBeginDate` | 预提起息日 |
| `accrual_date` | `accrual_date` | `accrualDate` | 预提日期 |
| `accrual_end_date` | `accrual_end_date` | `accrualEndDate` | 预提止息日 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `execute_status` | `execute_status` | `executeStatus` | 预提状态 |
| `` | `status` | `status` | 单据状态 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `debt_id` | `debt_id` | `debtId` | 所属借据id |
| `id` | `id` | `id` | ID |
| `` | `tplid` | `tplid` | 模板id |
| `voucher_id` | `voucher_id` | `voucherId` | 关联单据id |

### 数值字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accrual_amount` | `accrual_amount` | `accrualAmount` | 预提利息金额 |
| `amortized_cost_amount` | `amortized_cost_amount` | `amortizedCostAmount` | 摊余成本 |
| `cash_out_in_amount` | `cash_out_in_amount` | `cashOutInAmount` | 现金流出流入 |
| `interest_adjustment_amount` | `interest_adjustment_amount` | `interestAdjustmentAmount` | 利息调整 |
| `invest_income_amount` | `invest_income_amount` | `investIncomeAmount` | 投资收益 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
