---
tags: [BIP, 元数据, 数据字典, aa.paymentmethod.PaymentMethodStore]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 门店收款方式 (`aa.paymentmethod.PaymentMethodStore`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`aa_payment_method_store` | domain：`retail` | 应用：`RM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 门店收款方式 |
| 物理表 | `aa_payment_method_store` |
| domain/服务域 | `retail` |
| 所属应用 | `RM` |
| 直连字段 | 8 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `paymentMethodId` | `` |
| `storeId` | `yxybase.aa_store` |

## 继承接口 (1个, 1字段)

- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 8 个直连字段

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `storeId` | `storeId` | `store` | 门店id |
| `paymentMethodId` | `paymentMethodId` | `paymentMethodId` | 收款方式id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isDefault` | `isDefault` | `isDefault` | 默认收款 |
| `isQuick` | `isQuick` | `isQuick` | PC快速收款 |
| `isMobileQuick` | `isMobileQuick` | `isMobileQuick` | 移动快速收款 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
