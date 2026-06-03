---
tags: [BIP, 元数据, 数据字典, uhybase.coupon.CouponGoodsClassTemp]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 优惠券商品关系 (`uhybase.coupon.CouponGoodsClassTemp`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mp_coupongoodsclass` | domain：`uhy` | 应用：`SDMB` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 优惠券商品关系 |
| 物理表 | `mp_coupongoodsclass` |
| 数据库 schema | `uhy` |
| 所属应用 | `SDMB` |
| 直连字段 | 13 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `iGoodsSKUID` | `` |
| `iCouponId` | `` |
| `iGoodsID` | `` |
| `ytenant_id` | `` |
| `iGoodsClassId` | `` |

## 继承接口 (2个, 2字段)

- **会员租户相关** (`base.itf.IMembercorp`)
  - `iCorpId` → `iCorpId`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 13 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cAppID` | `cAppID` | `cAppID` | cAppID |
| `cOuterGoodsID` | `cOuterGoodsID` | `cOuterGoodsID` | 商品外部系统编码 |
| `cOuterGoodsSKUID` | `cOuterGoodsSKUID` | `cOuterGoodsSKUID` | 商品SKU外部系统编码 |
| `cOuterID` | `cOuterID` | `cOuterID` | 商品分类外部系统编码 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iCouponId` | `iCouponId` | `iCouponID` | 卡券ID |
| `iGoodsClassId` | `iGoodsClassId` | `iGoodsClassId` | 商品分类ID |
| `iGoodsID` | `iGoodsID` | `iGoodsID` | 商品ID |
| `iGoodsSKUID` | `iGoodsSKUID` | `iGoodsSKUID` | 商品SKUID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iDependOn` | `iDependOn` | `iDependOn` | 类型 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `iCorpId` | `iCorpId` | `membercorp` | 租户 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `pubts` | 时间戳 |
