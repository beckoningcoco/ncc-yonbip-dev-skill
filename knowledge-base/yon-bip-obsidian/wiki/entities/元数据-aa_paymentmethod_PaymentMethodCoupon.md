---
tags: [BIP, 元数据, 数据字典, aa.paymentmethod.PaymentMethodCoupon]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 卡券收款方式 (`aa.paymentmethod.PaymentMethodCoupon`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`aa_payment_method_coupon` | domain：`retail` | 应用：`RM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 卡券收款方式 |
| 物理表 | `aa_payment_method_coupon` |
| 数据库 schema | `retail` |
| 所属应用 | `RM` |
| 直连字段 | 4 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `couponId` | `membercenter_coupon` |
| `ytenant_id` | `` |
| `paymentMethodId` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 4 个直连字段

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `couponId` | `couponId` | `coupon` | 卡券id |
| `paymentMethodId` | `paymentMethodId` | `paymentMethodId` | 卡券收款方式id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 关联表主键 |
