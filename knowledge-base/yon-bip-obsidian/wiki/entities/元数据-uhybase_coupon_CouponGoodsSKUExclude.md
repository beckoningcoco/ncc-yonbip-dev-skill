---
tags: [BIP, 元数据, 数据字典, uhybase.coupon.CouponGoodsSKUExclude]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 卡券商品SKU例外表 (`uhybase.coupon.CouponGoodsSKUExclude`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mp_goodsscopeexception` | domain：`uhy` | 应用：`SDMB` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 卡券商品SKU例外表 |
| 物理表 | `mp_goodsscopeexception` |
| domain/服务域 | `uhy` |
| schema | `yilian` |
| 所属应用 | `SDMB` |
| 直连字段 | 14 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `iGoodsSKUID` | `productcenter.pc_productskuquerymaintreeref` |
| `iDocID` | `` |
| `ytenant_id` | `` |

## 继承接口 (2个, 2字段)

- **会员租户相关** (`base.itf.IMembercorp`)
  - `iCorpId` → `iCorpId`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 14 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cOuterGoodsSKUCode` | `cOuterGoodsSKUCode` | `cOuterGoodsSKUCode` | 外部系统商品SKU编码 |
| `cOuterGoodsCode` | `cOuterGoodsCode` | `cOuterGoodsCode` | 外部系统商品编码 |
| `cAppID` | `cAppID` | `cAppID` | cAppID |
| `cGoodsCode` | `cGoodsCode` | `cGoodsCode` | 商品编码 |
| `cGoodsSKUName` | `cGoodsSKUName` | `cGoodsSKUName` | 商品名称 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iGoodsSKUID` | `iGoodsSKUID` | `iGoodsSKUID` | 适用商品SKUID |
| `iDocID` | `iDocID` | `iDocID` | 卡券ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iScopeCategory` | `iScopeCategory` | `iScopeCategory` | 按商品分类 |
| `iScopeType` | `iScopeType` | `iScopeType` | 类型 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 适用商品分类ID |
| `iGoodsID` | `iGoodsID` | `iGoodsID` | 例外商品ID |
| `iCorpId` | `iCorpId` | `membercorp` | 租户 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `pubts` | 时间戳 |
