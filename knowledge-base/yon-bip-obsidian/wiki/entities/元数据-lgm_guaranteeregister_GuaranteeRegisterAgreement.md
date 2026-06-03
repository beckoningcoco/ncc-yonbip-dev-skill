---
tags: [BIP, 元数据, 数据字典, lgm.guaranteeregister.GuaranteeRegisterAgreement]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 开函登记关联授信 (`lgm.guaranteeregister.GuaranteeRegisterAgreement`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`lgm_guaranteeregister_agreement` | domain：`yonbip-fi-ctmlgm` | 应用：`LGM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 开函登记关联授信 |
| 物理表 | `lgm_guaranteeregister_agreement` |
| 数据库 schema | `yonbip-fi-ctmlgm` |
| 所属应用 | `LGM` |
| 直连字段 | 29 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `exchangeRateType` | `` |
| `agreement` | `` |
| `` | `` |
| `ytenant_id` | `` |
| `guaranteeCurrency` | `` |
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

> 共 29 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isOwnAdd` | `isOwnAdd` | `isOwnAdd` | 是否手动添加 |
| `srcOccupyCode` | `srcOccupyCode` | `srcOccupyCode` | 来源占用单code |
| `srcOccupyType` | `srcOccupyType` | `srcOccupyType` | 来源占用单类型 |
| `backItem1` | `backItem1` | `backItem1` | backItem1 |
| `backItem2` | `backItem2` | `backItem2` | backItem2 |
| `backItem3` | `backItem3` | `backItem3` | backItem3 |
| `backItem4` | `backItem4` | `backItem4` | backItem4 |
| `backItem5` | `backItem5` | `backItem5` | backItem5 |
| `` | `auditor` | `auditor` | 审批人名称 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 开函登记id |
| `agreement` | `agreement` | `agreement` | 授信id |
| `guaranteeCurrency` | `guaranteeCurrency` | `guaranteeCurrency` | 保函币种id |
| `exchangeRateType` | `exchangeRateType` | `exchangeRateType` | 汇率类型id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exchange_rate_ops` | `exchange_rate_ops` | `exchangeRateOps` | 汇率折算方式 |

### 长整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `agreement_main_id` | `agreement_main_id` | `agreementMainId` | 授信主表id |
| `occupy_id` | `occupy_id` | `occupyId` | 占用单id |
| `releaseId` | `releaseId` | `releaseId` | 释放单id |
| `srcOccupyId` | `srcOccupyId` | `srcOccupyId` | 来源占用单Id |
| `id` | `id` | `id` | ID |

### 数值字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exchangeRate` | `exchangeRate` | `exchangeRate` | 核算汇率 |
| `current_amount` | `current_amount` | `currentAmount` | 占用额度(保函币种) |
| `remainAvailableAmountBH` | `remainAvailableAmountBH` | `remainAvailableAmountBH` | 剩余可用额度(保函币种) |
| `currentAmountSX` | `currentAmountSX` | `currentAmountSX` | 占用额度(授信币种) |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
