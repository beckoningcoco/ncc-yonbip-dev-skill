---
tags: [BIP, 元数据, 数据字典, pc.product.ProductSpecItemAlbum]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料关联的规格值明细的相册 (`pc.product.ProductSpecItemAlbum`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`productspecitemalbum` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料关联的规格值明细的相册 |
| 物理表 | `productspecitemalbum` |
| 数据库 schema | `productcenter` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 12 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `productId` | `` |
| `ytenant_id` | `` |
| `product_freecharacteritem_id` | `` |
| `productSpecItemId` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`coredoc.pub.TenantObselete`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 12 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cImgName` | `cImgName` | `imgName` | 物料图片 |
| `cFolder` | `cFolder` | `folder` | 图片路径 |
| `cType` | `cType` | `type` | 图片类型 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户ID |
| `productId` | `productId` | `productId` | 物料ID |
| `product_freecharacteritem_id` | `product_freecharacteritem_id` | `productFreeCharacterItemId` | 物料关联特征ID |
| `productSpecItemId` | `productSpecItemId` | `productSpecItemId` | 物料关联的规格值明细ID |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iSort` | `iSort` | `sort` | 顺序 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户ID(旧) |
| `cSize` | `cSize` | `size` | 图片大小 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
