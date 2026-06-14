---
tags: [BIP, 元数据, 数据字典, uhybase.coupon.CouponExchangeRules]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 优惠券兑换规则 (`uhybase.coupon.CouponExchangeRules`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mp_coupongoodsconvertrule` | domain：`uhy` | 应用：`SDMB` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 优惠券兑换规则 |
| 物理表 | `mp_coupongoodsconvertrule` |
| domain/服务域 | `uhy` |
| schema | `yilian` |
| 所属应用 | `SDMB` |
| 直连字段 | 22 个 |
| 子表 | 1 个 |
| 关联引用 | 5 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `couponGoodsConvertFreeDefine` | `uhybase.coupon.CouponGoodsConvertFreeDefine` | composition |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `iGoodsSKUID` | `` |
| `iCouponID` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `couponExchangeRulesDefineCharacter` | `` |

## 继承接口 (2个, 2字段)

- **会员租户相关** (`base.itf.IMembercorp`)
  - `iCorpId` → `iCorpId`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 22 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cGoodsSKUName` | `cGoodsSKUName` | `cGoodsSKUName` | 兑换商品 |
| `cAppID` | `cAppID` | `cAppID` | cAppID |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iGoodsSKUID` | `iGoodsSKUID` | `iGoodsSKUID` | 兑换商品SKUID |
| `iCouponID` | `iCouponID` | `iCouponID` | 卡券ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iMaxGoodsQuantity` | `iMaxGoodsQuantity` | `iMaxGoodsQuantity` | 最大兑换商品数量 |
| `iDependOn` | `iDependOn` | `iDependOn` | 适用商品类型 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 卡券兑换规则Id |
| `iGoodsID` | `iGoodsID` | `iGoodsID` | 兑换商品ID |
| `iGoodsClassID` | `iGoodsClassID` | `iGoodsClassID` | 商品分类ID |
| `iCorpId` | `iCorpId` | `membercorp` | 租户 |

### 数值字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fSalePrice` | `fSalePrice` | `fSalePrice` | 零售价 |
| `fDiscountPrice` | `fDiscountPrice` | `fDiscountPrice` | 折后价 |
| `iGoodsCompanyBurdenAmount` | `iGoodsCompanyBurdenAmount` | `iGoodsCompanyBurdenAmount` | 企业分摊金额 |
| `iGoodsDistributorBurdenAmount` | `iGoodsDistributorBurdenAmount` | `iGoodsDistributorBurdenAmount` | 分销商分摊金额 |
| `iGoodsStoreBurdenAmount` | `iGoodsStoreBurdenAmount` | `iGoodsStoreBurdenAmount` | 门店分摊金额 |
| `iGoodsCompanyBurdenBl` | `iGoodsCompanyBurdenBl` | `iGoodsCompanyBurdenBl` | 企业分摊比例 |
| `iGoodsDistributorBurdenBl` | `iGoodsDistributorBurdenBl` | `iGoodsDistributorBurdenBl` | 分销商分摊比例 |
| `iGoodsStoreBurdenBl` | `iGoodsStoreBurdenBl` | `iGoodsStoreBurdenBl` | 门店分摊比例 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `couponExchangeRulesDefineCharacter` | `couponExchangeRulesDefineCharacter` | `couponExchangeRulesDefineCharacter` | 自定义项特征属性组 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `couponGoodsConvertFreeDefine` | 优惠券自由自定义项 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `pubts` | 时间戳 |
