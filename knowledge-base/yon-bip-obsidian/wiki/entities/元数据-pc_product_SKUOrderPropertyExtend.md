---
tags: [BIP, 元数据, 数据字典, pc.product.SKUOrderPropertyExtend]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# (停用)物料订单属性(管理组织) (`pc.product.SKUOrderPropertyExtend`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`productskuorderproperty` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | (停用)物料订单属性(管理组织) |
| 物理表 | `productskuorderproperty` |
| domain/服务域 | `productcenter` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 14 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `productApplyRangeId` | `` |
| `productId` | `` |
| `ytenant_id` | `` |
| `skuPropertyTypeId` | `` |
| `skuId` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`coredoc.pub.TenantObselete`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 14 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `promptMessage` | `promptMessage` | `promptMessage` | 属性值 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户ID |
| `productId` | `productId` | `productId` | 物料ID |
| `productApplyRangeId` | `productApplyRangeId` | `productApplyRangeId` | 物料分配范围ID |
| `skuPropertyTypeId` | `skuPropertyTypeId` | `skuPropertyTypeId` | 物料模板上物料订单属性ID |
| `skuId` | `skuId` | `skuId` | SKUID |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isRequired` | `isRequired` | `isRequired` | 前端必输 |
| `isShow` | `isShow` | `isShow` | 前端显示 |
| `isCreator` | `isCreator` | `isCreator` | 是否创建者 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iLimitNum` | `iLimitNum` | `iLimitNum` | 字数限制 |
| `iOrder` | `iOrder` | `iOrder` | 排序 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 物料订单属性主键ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户ID(旧) |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
