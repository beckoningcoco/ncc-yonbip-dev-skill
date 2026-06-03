---
tags: [BIP, 元数据, 数据字典, pc.product.SkuFreeCharacterItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# SKU特征冗余表 (`pc.product.SkuFreeCharacterItem`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`skufreecharacteritem` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | SKU特征冗余表 |
| 物理表 | `skufreecharacteritem` |
| 数据库 schema | `productcenter` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 11 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `characteristics_id` | `productcenter.base_characteristicsref` |
| `product_id` | `` |
| `ytenant_id` | `` |
| `productfreecharacteritem_id` | `` |
| `character_id` | `productcenter.base_characterref` |
| `sku_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`coredoc.pub.TenantObselete`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 11 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `character_code` | `character_code` | `characterCode` | 特征ID |
| `character_value_id` | `character_value_id` | `characterValueId` | 特征值ID |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户ID |
| `product_id` | `product_id` | `productId` | 物料ID |
| `sku_id` | `sku_id` | `skuId` | SKUID |
| `characteristics_id` | `characteristics_id` | `characteristicsId` | 特征组ID |
| `character_id` | `character_id` | `characterId` | 特征ID |
| `productfreecharacteritem_id` | `productfreecharacteritem_id` | `productFreeCharacterItemId` | 物料-特征值 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenant` | 租户ID(旧) |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
