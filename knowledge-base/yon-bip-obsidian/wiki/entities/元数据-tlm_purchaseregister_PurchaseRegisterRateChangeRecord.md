---
tags: [BIP, 元数据, 数据字典, tlm.purchaseregister.PurchaseRegisterRateChangeRecord]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 申购登记利率变更记录 (`tlm.purchaseregister.PurchaseRegisterRateChangeRecord`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_purchasregister_rate_change_record` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 申购登记利率变更记录 |
| 物理表 | `tlm_purchasregister_rate_change_record` |
| domain/服务域 | `yonbip-fi-ctmtlm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `TLM` |
| 直连字段 | 38 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |
| `base_rate_type` | `tlm_interestrateRef` |
| `mainid` | `` |
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

> 共 38 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `float_type` | `float_type` | `floatType` | 浮动方式 |
| `voucher_type` | `voucher_type` | `voucherType` | 关联单据类型 |
| `voucher_code` | `voucher_code` | `voucherCode` | 关联单据编号 |
| `` | `auditor` | `auditor` | 审批人名称 |
| `` | `code` | `code` | 编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `extra1` | `extra1` | `extra1` | 扩展字段1 |
| `extra2` | `extra2` | `extra2` | 扩展字段2 |
| `extra3` | `extra3` | `extra3` | 扩展字段3 |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 申购登记表id |
| `base_rate_type` | `base_rate_type` | `baseRateType` | 基准利率种类ID |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `effective_date` | `effective_date` | `effectiveDate` | 生效日 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `benchmark_rate_date` | `benchmark_rate_date` | `benchmarkRateDate` | 基准利率日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rate_change_type` | `rate_change_type` | `rateChangeType` | 利率变更类型 |
| `rate_type` | `rate_type` | `rateType` | 利率类型 |

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

### 数值字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `base_rate` | `base_rate` | `baseRate` | 基准利率 |
| `float_value` | `float_value` | `floatValue` | 浮动值 |
| `rate` | `rate` | `rate` | 利率（%） |
| `float_proportion` | `float_proportion` | `floatProportion` | 罚息/复利上浮比例 |
| `float_rate` | `float_rate` | `floatRate` | 罚息/复利利率 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
