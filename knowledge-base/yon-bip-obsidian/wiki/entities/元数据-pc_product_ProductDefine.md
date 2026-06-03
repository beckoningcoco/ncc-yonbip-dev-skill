---
tags: [BIP, 元数据, 数据字典, pc.product.ProductDefine]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料属性(自定义项)表 (`pc.product.ProductDefine`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`productdefine` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料属性(自定义项)表 |
| 物理表 | `productdefine` |
| 数据库 schema | `productcenter` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 35 个 |
| 子表 | 0 个 |
| 关联引用 | 2 个 |

## 关联引用 (2个)

| 字段名 | 引用类型 |
|--------|---------|
| `productId` | `` |
| `ytenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`coredoc.pub.TenantObselete`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 35 个直连字段

### 文本字段 (30个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `define1` | `define1` | `define1` | 物料扩展属性1 |
| `define2` | `define2` | `define2` | 物料扩展属性2 |
| `define3` | `define3` | `define3` | 物料扩展属性3 |
| `define4` | `define4` | `define4` | 物料扩展属性4 |
| `define5` | `define5` | `define5` | 物料扩展属性5 |
| `define6` | `define6` | `define6` | 物料扩展属性6 |
| `define7` | `define7` | `define7` | 物料扩展属性7 |
| `define8` | `define8` | `define8` | 物料扩展属性8 |
| `define9` | `define9` | `define9` | 物料扩展属性9 |
| `define10` | `define10` | `define10` | 物料扩展属性10 |
| `define11` | `define11` | `define11` | 物料扩展属性11 |
| `define12` | `define12` | `define12` | 物料扩展属性12 |
| `define13` | `define13` | `define13` | 物料扩展属性13 |
| `define14` | `define14` | `define14` | 物料扩展属性14 |
| `define15` | `define15` | `define15` | 物料扩展属性15 |
| `define16` | `define16` | `define16` | 物料扩展属性16 |
| `define17` | `define17` | `define17` | 物料扩展属性17 |
| `define18` | `define18` | `define18` | 物料扩展属性18 |
| `define19` | `define19` | `define19` | 物料扩展属性19 |
| `define20` | `define20` | `define20` | 物料扩展属性20 |
| `define21` | `define21` | `define21` | 物料扩展属性21 |
| `define22` | `define22` | `define22` | 物料扩展属性22 |
| `define23` | `define23` | `define23` | 物料扩展属性23 |
| `define24` | `define24` | `define24` | 物料扩展属性24 |
| `define25` | `define25` | `define25` | 物料扩展属性25 |
| `define26` | `define26` | `define26` | 物料扩展属性26 |
| `define27` | `define27` | `define27` | 物料扩展属性27 |
| `define28` | `define28` | `define28` | 物料扩展属性28 |
| `define29` | `define29` | `define29` | 物料扩展属性29 |
| `define30` | `define30` | `define30` | 物料扩展属性30 |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户ID |
| `productId` | `productId` | `productId` | 物料ID |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户ID(旧) |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
