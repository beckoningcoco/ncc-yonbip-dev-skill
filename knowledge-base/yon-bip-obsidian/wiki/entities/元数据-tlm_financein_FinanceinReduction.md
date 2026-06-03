---
tags: [BIP, 元数据, 数据字典, tlm.financein.FinanceinReduction]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 融入登记减免信息子表 (`tlm.financein.FinanceinReduction`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_financein_reduction` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 融入登记减免信息子表 |
| 物理表 | `tlm_financein_reduction` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 36 个 |
| 子表 | 0 个 |
| 关联引用 | 9 个 |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `interest_currency` | `ucfbasedoc.bd_currencytenantref` |
| `` | `` |
| `capital_currency` | `ucfbasedoc.bd_currencytenantref` |
| `ytenant_id` | `` |
| `mainid` | `` |
| `protocol_currency` | `ucfbasedoc.bd_currencytenantref` |
| `tenant_id` | `` |

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

> 共 36 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `voucher_type` | `voucher_type` | `voucherType` | 关联单据类型 |
| `voucher_code` | `voucher_code` | `voucherCode` | 关联单据编号 |
| `` | `auditor` | `auditor` | 审批人名称 |
| `` | `code` | `code` | 编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `extra1` | `extra1` | `extra1` | 扩展字段1 |
| `extra2` | `extra2` | `extra2` | 扩展字段2 |
| `extra3` | `extra3` | `extra3` | 扩展字段3 |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 申购登记主表id |
| `protocol_currency` | `protocol_currency` | `protocolCurrency` | 协议币种id |
| `capital_currency` | `capital_currency` | `capitalCurrency` | 本金币种id |
| `interest_currency` | `interest_currency` | `interestCurrency` | 计息币种id |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `reduce_date` | `reduce_date` | `reduceDate` | 减免日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `reduce_type` | `reduce_type` | `reduceType` | 减免类型 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `status` | `status` | 单据状态 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `voucher_id` | `voucher_id` | `voucherId` | 关联单据ID |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `reduce_principal_amount` | `reduce_principal_amount` | `reducePrincipalAmount` | 减免本金（协议币种） |
| `reduce_interest_amount` | `reduce_interest_amount` | `reduceInterestAmount` | 减免利息（协议币种） |
| `reduce_principal_amount_bj` | `reduce_principal_amount_bj` | `reducePrincipalAmountBJ` | 减免本金（本金币种） |
| `reduce_interest_amount_jx` | `reduce_interest_amount_jx` | `reduceInterestAmountJX` | 减免利息（计息币种） |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
