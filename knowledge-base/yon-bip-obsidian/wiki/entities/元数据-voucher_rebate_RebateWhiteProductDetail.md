---
tags: [BIP, 元数据, 数据字典, voucher.rebate.RebateWhiteProductDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 例外商品明细 (`voucher.rebate.RebateWhiteProductDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`udh_productrebate_whiteproductdetail` | domain：`marketingbill` | 应用：`BBSMK` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 例外商品明细 |
| 物理表 | `udh_productrebate_whiteproductdetail` |
| 数据库 schema | `marketingbill` |
| 所属应用 | `BBSMK` |
| 直连字段 | 8 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `productId` | `` |
| `ytenant_id` | `` |
| `iBizId` | `` |
| `whiteMainId` | `` |
| `skuId` | `` |

## 继承接口 (2个, 2字段)

- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **U订货租户相关** (`base.itf.IUordercorp`)
  - `iCorpId` → `iCorpId`

## 字段列表（按类型分组）

> 共 8 个直连字段

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iBizId` | `iBizId` | `bizId` | 供应商ID |
| `productId` | `productId` | `productId` | 商品ID |
| `skuId` | `skuId` | `skuId` | skuID |
| `whiteMainId` | `whiteMainId` | `whiteMainId` | 例外商品表ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `iCorpId` | `iCorpId` | `uordercorp` | 租户 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubuts` | `pubuts` | `pubts` | 时间戳 |
