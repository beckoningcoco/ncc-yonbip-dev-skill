---
tags: [BIP, 元数据, 数据字典, aa.paymentmethod.PaymentMethod]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 收款方式 (`aa.paymentmethod.PaymentMethod`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`aa_payment_method` | domain：`retail` | 应用：`RM` | 业务对象ID：`7793fd55-db69-458b-a464-d7d06e981e0b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 收款方式 |
| 物理表 | `aa_payment_method` |
| 数据库 schema | `retail` |
| 所属应用 | `RM` |
| 直连字段 | 39 个 |
| 子表 | 3 个 |
| 关联引用 | 10 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `paymentMethodStore` | `aa.paymentmethod.PaymentMethodStore` | composition |
| `paymentMethodWallet` | `aa.paymentmethod.PaymentMethodWallet` | composition |
| `paymentMethodCoupon` | `aa.paymentmethod.PaymentMethodCoupon` | composition |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `paymentCategoryId` | `` |
| `ytenant_id` | `` |
| `cCurrencyId` | `` |
| `settlementId` | `` |
| `tenant_id` | `` |

## 继承接口 (3个, 10字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **erp编码** (`base.itf.IErpCode`)
  - `erpCode` → `erpCode`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 39 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人 |
| `code` | `code` | `code` | 编码 |
| `` | `modifier` | `modifier` | 修改人 |
| `cOnlinePaymethod` | `cOnlinePaymethod` | `cOnlinePaymethod` | 线上支付方式 |
| `iconType` | `iconType` | `iconType` | 图标类型 |
| `erpCode` | `erpCode` | `erpCode` | ERP编码 |
| `settlementName` | `settlementName` | `settlementName` | 结算方式 |
| `cCurrencyName` | `cCurrencyName` | `cCurrencyName` | 币种 |
| `enableState` | `enableState` | `enableState` | 启用状态 |
| `cCurrencyERPCode` | `cCurrencyERPCode` | `cCurrencyERPCode` | 币种编码 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `settlementId` | `settlementId` | `settlementId` | 结算方式id |
| `cCurrencyId` | `cCurrencyId` | `cCurrencyId` | 币种id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `paymentCategoryId` | `paymentCategoryId` | `paymentCategoryId` | 所属类别 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |

### 布尔字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isDefault` | `isDefault` | `isDefault` | 是否默认 |
| `isPayment` | `isPayment` | `isPayment` | 是否缴款 |
| `isOpenCashDrawer` | `isOpenCashDrawer` | `isOpenCashDrawer` | 开钱箱 |
| `isOpening` | `isOpening` | `isOpening` | 期初 |
| `iPoint` | `iPoint` | `iPoint` | 参与积分 |
| `isPublishInvoice` | `isPublishInvoice` | `isPublishInvoice` | 开电票 |
| `isUsedToPC` | `isUsedToPC` | `isUsedToPC` | 适用PC端 |
| `isQuick` | `isQuick` | `isQuick` | PC快速收款 |
| `isUsedToMobile` | `isUsedToMobile` | `isUsedToMobile` | 适用移动端 |
| `isMobileQuick` | `isMobileQuick` | `isMobileQuick` | 移动快速收款 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `paymentType` | `paymentType` | `paymentType` | 收款类型 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fExchangeSettleAmount` | `fExchangeSettleAmount` | `fExchangeSettleAmount` | 汇率起算金额 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建日期 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `paymentMethodCoupon` | 卡券收款方式 |
| `` | `` | `paymentMethodStore` | 门店收款方式 |
| `` | `` | `paymentMethodWallet` | 收款方式对应钱包账户 |
