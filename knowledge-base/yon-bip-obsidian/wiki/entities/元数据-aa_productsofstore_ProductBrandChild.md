---
tags: [BIP, 元数据, 数据字典, aa.productsofstore.ProductBrandChild]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 商品品牌子表 (`aa.productsofstore.ProductBrandChild`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`aa_product_range` | domain：`yxybase` | 应用：`` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 商品品牌子表 |
| 物理表 | `aa_product_range` |
| 数据库 schema | `yxybase` |
| 所属应用 | `` |
| 直连字段 | 4 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `products_of_store_id` | `` |
| `ytenant_id` | `` |
| `brand_id` | `aa_productbrand` |

## 继承接口 (1个, 1字段)

- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 4 个直连字段

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `brand_id` | `brand_id` | `brand` | 品牌主键 |
| `products_of_store_id` | `products_of_store_id` | `productsofStore` | 主表主键 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
