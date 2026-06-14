---
tags: [BIP, 元数据, 数据字典, uhybase.coupon.CouponStore]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 卡券适用门店关系表 (`uhybase.coupon.CouponStore`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mp_storescope` | domain：`uhy` | 应用：`SDMB` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 卡券适用门店关系表 |
| 物理表 | `mp_storescope` |
| domain/服务域 | `uhy` |
| schema | `yilian` |
| 所属应用 | `SDMB` |
| 直连字段 | 11 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `iDocID` | `` |
| `ytenant_id` | `` |
| `iStoreID` | `yxybase.aa_store` |

## 继承接口 (2个, 2字段)

- **会员租户相关** (`base.itf.IMembercorp`)
  - `iCorpId` → `iCorpId`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 11 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cStoreCode` | `cStoreCode` | `cStoreCode` | 门店编码 |
| `cOuterStoreCode` | `cOuterStoreCode` | `cOuterStoreCode` | 门店外部编码 |
| `cAppID` | `cAppID` | `cAppID` | cAppID |
| `cStoreName` | `cStoreName` | `cStoreName` | 门店名称 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iStoreID` | `iStoreID` | `iStoreID` | 门店ID |
| `iDocID` | `iDocID` | `iDocID` | 卡券ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iScopeType` | `iScopeType` | `iScopeType` | 类型 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 门店子表ID |
| `iCorpId` | `iCorpId` | `membercorp` | 租户 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `pubts` | 时间戳 |
