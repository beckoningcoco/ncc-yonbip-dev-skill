---
tags: [BIP, 元数据, 数据字典, uhybase.coupon.CouponGoodsTag]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 优惠券商品标签关系 (`uhybase.coupon.CouponGoodsTag`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mp_coupongoodstag` | domain：`uhy` | 应用：`SDMB` | 业务对象ID：`a3595085-828e-48ea-b609-c9dc644c4a25`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 优惠券商品标签关系 |
| 物理表 | `mp_coupongoodstag` |
| domain/服务域 | `uhy` |
| schema | `yilian` |
| 所属应用 | `SDMB` |
| 直连字段 | 8 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `iCouponID` | `` |
| `ytenant_id` | `` |
| `iGoodsTagID` | `productcenter.pc_tagref` |

## 继承接口 (2个, 2字段)

- **会员租户相关** (`base.itf.IMembercorp`)
  - `iCorpId` → `iCorpId`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 8 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cAppID` | `cAppID` | `cAppID` | cAppID |
| `cGoodsTagName` | `cGoodsTagName` | `cGoodsTagName` | 商品标签名称 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iGoodsTagID` | `iGoodsTagID` | `iGoodsTagID` | 适用商品标签ID |
| `iCouponID` | `iCouponID` | `iCouponID` | 卡券ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 适用商品标签ID |
| `iCorpId` | `iCorpId` | `membercorp` | 租户 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `pubts` | 时间戳 |
