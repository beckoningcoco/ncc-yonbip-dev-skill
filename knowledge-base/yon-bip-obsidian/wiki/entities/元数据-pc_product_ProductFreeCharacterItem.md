---
tags: [BIP, 元数据, 数据字典, pc.product.ProductFreeCharacterItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料特征值冗余表 (`pc.product.ProductFreeCharacterItem`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`productfreecharacteritem` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料特征值冗余表 |
| 物理表 | `productfreecharacteritem` |
| domain/服务域 | `productcenter` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 13 个 |
| 子表 | 1 个 |
| 关联引用 | 5 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `productFreeCharacterItemAlbums` | `pc.product.ProductSpecItemAlbum` | composition |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `characteristics_id` | `productcenter.base_characteristicsref` |
| `product_id` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `character_id` | `productcenter.base_characterref` |

## 继承接口 (2个, 2字段)

- **租户相关** (`coredoc.pub.TenantObselete`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 13 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键ID |
| `character_code` | `character_code` | `characterCode` | 特征编码 |
| `character_value_id` | `character_value_id` | `characterValueId` | 特征值ID |
| `img_business_id` | `img_business_id` | `imgBusinessId` | 特征图片 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户ID |
| `product_id` | `product_id` | `productId` | 物料ID |
| `characteristics_id` | `characteristics_id` | `characteristicsId` | 特征组ID |
| `character_id` | `character_id` | `characterId` | 特征ID |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `have_img` | `have_img` | `haveImg` | 是否有图片 |
| `iorder` | `iorder` | `iOrder` | 排序 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenant` | 租户ID(旧) |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `productFreeCharacterItemAlbums` | 物料关联的规格值明细的相册 |
