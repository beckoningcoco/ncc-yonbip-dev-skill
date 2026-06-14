---
tags: [BIP, 元数据, 数据字典, uhybase.coupon.CouponRuleStores]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 优惠券发放规则门店配置 (`uhybase.coupon.CouponRuleStores`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mp_couponrulestores` | domain：`uhy` | 应用：`SDMB` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 优惠券发放规则门店配置 |
| 物理表 | `mp_couponrulestores` |
| domain/服务域 | `uhy` |
| schema | `yilian` |
| 所属应用 | `SDMB` |
| 直连字段 | 10 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `cAppID` | `` |
| `iCouponRuleID` | `` |
| `ytenant_id` | `` |
| `iStoreID` | `yxybase.aa_store` |

## 继承接口 (1个, 1字段)

- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 10 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cStoreCode` | `cStoreCode` | `cStoreCode` | 门店编码 |
| `cStoreName` | `cStoreName` | `cStoreName` | 门店名称 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iStoreID` | `iStoreID` | `iStoreID` | 门店ID |
| `cAppID` | `cAppID` | `cAppID` | 会籍 |
| `iCouponRuleID` | `iCouponRuleID` | `iCouponRuleID` | 规则id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iStoreType` | `iStoreType` | `iStoreType` | 门店类型 |
| `iRate` | `iRate` | `iRate` | 发放比例(%) |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 门店子表ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `pubts` | 时间戳 |
