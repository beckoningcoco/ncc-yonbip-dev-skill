---
tags: [BIP, 元数据, 数据字典, tlm.financein.FinanceIn_sx]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 融入登记关联授信 (`tlm.financein.FinanceIn_sx`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_financein_sx` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 融入登记关联授信 |
| 物理表 | `tlm_financein_sx` |
| domain/服务域 | `yonbip-fi-ctmtlm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `TLM` |
| 直连字段 | 38 个 |
| 子表 | 0 个 |
| 关联引用 | 12 个 |

## 关联引用 (12个)

| 字段名 | 引用类型 |
|--------|---------|
| `exchange_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `agreement_currency` | `` |
| `agreement` | `` |
| `` | `` |
| `agreementmainid` | `` |
| `ytenant_id` | `` |
| `financein_sx_character_def` | `` |
| `mainid` | `` |
| `protocol_currency` | `` |
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

> 共 38 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `auditor` | `auditor` | 审批人名称 |
| `` | `code` | `code` | 编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `occupy_id` | `occupy_id` | `occupyId` | 登记单号id |
| `releaseoccupy_id` | `releaseoccupy_id` | `releaseoccupyId` | 释放登记单号id |
| `addmethod` | `addmethod` | `addmethod` | 授信添加方式 |
| `is_add` | `is_add` | `isAdd` | 是否新增 |
| `is_new` | `is_new` | `isNew` | 是否新增 |

### 引用字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `protocol_currency` | `protocol_currency` | `protocolCurrency` | 业务币种id |
| `mainid` | `mainid` | `mainid` | 融资登记主表id |
| `exchange_rate_type` | `exchange_rate_type` | `exchangeRateType` | 汇率类型id |
| `agreement` | `agreement` | `agreement` | 授信明细id |
| `agreementmainid` | `agreementmainid` | `agreementmainid` | 授信id |
| `agreement_currency` | `agreement_currency` | `agreementCurrency` | 授信币种 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `status` | `status` | 单据状态 |
| `exchange_rate_ops` | `exchange_rate_ops` | `exchangeRateOps` | 核算汇率折算方式 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | 主键 |

### 数值字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `current_amount` | `current_amount` | `currentAmount` | 本次使用额度 |
| `exchange_rate` | `exchange_rate` | `exchangeRate` | 核算汇率 |
| `total_amount` | `total_amount` | `totalAmount` | 总占用额度 |
| `remain_amount` | `remain_amount` | `remainAmount` | 剩余占用额度 |
| `current_sx_amount` | `current_sx_amount` | `currentSxAmount` | 本次使用额度（授信币种） |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `financein_sx_character_def` | `financein_sx_character_def` | `financeIn_sxCharacterDef` | 融入登记关联授信特征 |
