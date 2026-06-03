---
tags: [BIP, 元数据, 数据字典, pc.product.ProductSpecItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料关联的规格值明细 (`pc.product.ProductSpecItem`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`productspecitem` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料关联的规格值明细 |
| 物理表 | `productspecitem` |
| 数据库 schema | `productcenter` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 12 个 |
| 子表 | 1 个 |
| 关联引用 | 5 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `productspecitemalbums` | `pc.product.ProductSpecItemAlbum` | composition |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `lsSpecItems_id` | `` |
| `` | `` |
| `productId` | `` |
| `iSpecId` | `` |
| `ytenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`coredoc.pub.TenantObselete`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 12 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `specValue` | `specValue` | `specValue` | 规格值 |
| `img_business_id` | `img_business_id` | `imgBusinessId` | 规格值图片ID |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户ID |
| `productId` | `productId` | `productId` | 物料ID |
| `iSpecId` | `iSpecId` | `iSpecId` | 规格ID |
| `lsSpecItems_id` | `lsSpecItems_id` | `lsSpecItems_id` | 规格值ID |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `haveImg` | `haveImg` | `haveImg` | 是否有图片 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iOrder` | `iOrder` | `iOrder` | 规格值排序 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户ID(旧) |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `productspecitemalbums` | 物料关联的规格值明细的相册 |
