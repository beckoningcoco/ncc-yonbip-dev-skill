---
tags: [BIP, 元数据, 数据字典, aa.productsofstore.ProductsofStore]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 门店经营范围 (`aa.productsofstore.ProductsofStore`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`aa_products_of_store` | domain：`yxybase` | 应用：`` | 业务对象ID：`4e072e28-7fcf-4fc9-a2f0-26281a62629a`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 门店经营范围 |
| 物理表 | `aa_products_of_store` |
| 数据库 schema | `yxybase` |
| 所属应用 | `` |
| 直连字段 | 22 个 |
| 子表 | 3 个 |
| 关联引用 | 10 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `productBrands` | `aa.productsofstore.ProductBrandChild` | composition |
| `productClass` | `aa.productsofstore.ProductClassChild` | composition |
| `excludeProducts` | `aa.productsofstore.ExcludeProducts` | composition |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `product_class_id` | `` |
| `ytenant_id` | `` |
| `product_brand_id` | `` |
| `iCustID` | `` |
| `tenant_id` | `` |

## 继承接口 (5个, 10字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **客户接口** (`aa.itf.ICust`)
  - `iCustID` → `iCustID`
- **客户接口** (`aa.itf.ICustAll`)
- **客户接口平台档案对加盟店可见** (`aa.itf.ICustExtend`)
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 22 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `code` | `code` | 编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `productClassDES` | `productClassDES` | `productClassDES` | 指定商品分类 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iCustID` | `iCustID` | `cust` | cust |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `product_brand_id` | `product_brand_id` | `productbrand` | 品牌 |
| `product_class_id` | `product_class_id` | `productclass` | 分类 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |
| `memo` | `memo` | `memo` | 备注 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `excludeProducts` | 例外商品 |
| `` | `` | `productBrands` | 商品品牌子表 |
| `` | `` | `productClass` | 商品分类子表 |
