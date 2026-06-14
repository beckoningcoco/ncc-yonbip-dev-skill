---
tags: [BIP, 元数据, 数据字典, tlm.derivativesregister.DerivativesRegisterCheckFlow]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 衍生品合约核算流子表 (`tlm.derivativesregister.DerivativesRegisterCheckFlow`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_derivativestregister_check_flow` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 衍生品合约核算流子表 |
| 物理表 | `tlm_derivativestregister_check_flow` |
| domain/服务域 | `yonbip-fi-ctmtlm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `TLM` |
| 直连字段 | 35 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |
| `local_currency` | `` |
| `mainid` | `` |
| `original_currency` | `` |
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

> 共 35 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `auditor` | `auditor` | 审批人名称 |
| `code` | `code` | `code` | 核算编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `event` | `event` | `event` | 核算事件 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `voucher_code` | `voucher_code` | `voucherCode` | 关联单据编码 |
| `voucher_id` | `voucher_id` | `voucherId` | 关联单据id |
| `voucher_type` | `voucher_type` | `voucherType` | 关联单据类型 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `local_currency` | `local_currency` | `localCurrency` | 本币币种 |
| `mainid` | `mainid` | `mainid` | 衍生品合约主表ID |
| `` | `modifierId` | `modifierId` | 修改人 |
| `original_currency` | `original_currency` | `originalCurrency` | 原币币种 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `check_date` | `check_date` | `checkDate` | 核算日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `status` | `status` | 单据状态 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `debt_id` | `debt_id` | `debtId` | 所属借据id |
| `id` | `id` | `id` | ID |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `local_amount` | `local_amount` | `localAmount` | 本币金额 |
| `local_currency_fpal` | `local_currency_fpal` | `localCurrencyFpal` | 本币浮动盈亏 |
| `local_currency_rgal` | `local_currency_rgal` | `localCurrencyRgal` | 本币实际盈亏 |
| `original_amount` | `original_amount` | `originalAmount` | 原币金额 |
| `original_currency_fpal` | `original_currency_fpal` | `originalCurrencyFpal` | 原币浮动盈亏 |
| `original_currency_rgal` | `original_currency_rgal` | `originalCurrencyRgal` | 原币实际盈亏 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
