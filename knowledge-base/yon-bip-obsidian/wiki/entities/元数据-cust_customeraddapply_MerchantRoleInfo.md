---
tags: [BIP, 元数据, 数据字典, cust.customeraddapply.MerchantRoleInfo]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户角色信息 (`cust.customeraddapply.MerchantRoleInfo`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cust_customeraddapply_merchantRoleInfo` | domain：`yycrm` | 应用：`CUST` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 客户角色信息 |
| 物理表 | `cust_customeraddapply_merchantRoleInfo` |
| 数据库 schema | `yycrm` |
| 所属应用 | `CUST` |
| 直连字段 | 18 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `imerchantId` | `` |
| `ytenant_id` | `` |
| `cReceivingBank` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 18 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cBusinessAccount` | `cBusinessAccount` | `businessAccount` | 商家收款账号 |
| `cBusinessRole` | `cBusinessRole` | `businessRole` | 业务角色 |
| `cCardOwnerName` | `cCardOwnerName` | `cardOwnerName` | 卡主姓名 |
| `dataStatus` | `dataStatus` | `dataStatus` | 数据状态 |
| `sourceDataId` | `sourceDataId` | `sourceDataId` | 客户档案子表数据ID |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `imerchantId` | `imerchantId` | `merchantId` | 所属客户 |
| `cReceivingBank` | `cReceivingBank` | `receivingBank` | 收款银行 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cMerchantOptions` | `cMerchantOptions` | `merchantOptions` | 商家标识选项 |

### 枚举字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cCardType` | `cCardType` | `cardType` | 卡号类型 |
| `settlementMethod` | `settlementMethod` | `settlementMethod` | 自动结算方式 |
| `toBImmigrationMode` | `toBImmigrationMode` | `toBImmigrationMode` | 入驻模式 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bSsettlementCycle` | `bSsettlementCycle` | `settlementCycle` | 结算周期 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dFinalSettlementDate` | `dFinalSettlementDate` | `finalSettlementDate` | 最后结算日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `dUMappExpireDate` | `dUMappExpireDate` | `uMappExpireDate` | 商城到期时间 |
| `dUOrderExpireDate` | `dUOrderExpireDate` | `uOrderExpireDate` | 订货到期时间 |
