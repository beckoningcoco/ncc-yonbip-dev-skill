---
tags: [BIP, 元数据, 数据字典, aa.merchant.MerchantRoleInfo]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户角色信息 (`aa.merchant.MerchantRoleInfo`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`merchantroleinfo` | domain：`productcenter` | 应用：`DPMCUS` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 客户角色信息 |
| 物理表 | `merchantroleinfo` |
| domain/服务域 | `productcenter` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `DPMCUS` |
| 直连字段 | 17 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `imerchantId` | `` |
| `ytenant_id` | `` |
| `cReceivingBank` | `ucfbasedoc.bd_bankcard` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 17 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cBusinessRole` | `cBusinessRole` | `businessRole` | 业务角色 |
| `cBusinessAccount` | `cBusinessAccount` | `businessAccount` | 商家收款账号(废弃) |
| `cCardOwnerName` | `cCardOwnerName` | `cardOwnerName` | 卡主姓名(废弃) |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `imerchantId` | `imerchantId` | `merchantId` | 所属客户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |
| `cReceivingBank` | `cReceivingBank` | `receivingBank` | 收款银行(废弃) |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cMerchantOptions` | `cMerchantOptions` | `merchantOptions` | 营销伙伴 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bSsettlementCycle` | `bSsettlementCycle` | `settlementCycle` | 结算周期(废弃) |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `dFinalSettlementDate` | `dFinalSettlementDate` | `finalSettlementDate` | 最后结算日期(废弃) |
| `dUMappExpireDate` | `dUMappExpireDate` | `uMappExpireDate` | 商城到期时间(废弃) |
| `dUOrderExpireDate` | `dUOrderExpireDate` | `uOrderExpireDate` | 订货到期时间(废弃) |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cCardType` | `cCardType` | `cardType` | 卡号类型(废弃) |
| `settlementMethod` | `settlementMethod` | `settlementMethod` | 自动结算方式(废弃) |
| `toBImmigrationMode` | `toBImmigrationMode` | `toBImmigrationMode` | 入驻模式(废弃) |
