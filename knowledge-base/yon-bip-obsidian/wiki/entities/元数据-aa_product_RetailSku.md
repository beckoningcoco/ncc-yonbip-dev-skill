---
tags: [BIP, 元数据, 数据字典, aa.product.RetailSku]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# (停用)零售物料规格 (`aa.product.RetailSku`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`productsku` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | (停用)零售物料规格 |
| 物理表 | `productsku` |
| 数据库 schema | `productcenter` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 25 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `freeidx1` | `` |
| `freeidx2` | `` |
| `freeidx3` | `` |
| `freeidx4` | `` |
| `freeidx5` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`coredoc.pub.TenantObselete`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 25 个直连字段

### 文本字段 (16个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free1` | `free1` | `free1` | 自由项1 |
| `free10` | `free10` | `free10` | 自由项10 |
| `free2` | `free2` | `free2` | 自由项2 |
| `free3` | `free3` | `free3` | 自由项3 |
| `free4` | `free4` | `free4` | 自由项4 |
| `free5` | `free5` | `free5` | 自由项5 |
| `free6` | `free6` | `free6` | 自由项6 |
| `free7` | `free7` | `free7` | 自由项7 |
| `free8` | `free8` | `free8` | 自由项8 |
| `free9` | `free9` | `free9` | 自由项9 |
| `freex1` | `freex1` | `freex1` | 动态规格值1 |
| `freex2` | `freex2` | `freex2` | 动态规格值2 |
| `freex3` | `freex3` | `freex3` | 动态规格值3 |
| `freex4` | `freex4` | `freex4` | 动态规格值4 |
| `freex5` | `freex5` | `freex5` | 动态规格值5 |
| `cSpecs` | `cSpecs` | `propertiesValue` | 规格值 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `freeidx1` | `freeidx1` | `freeidx1` | 动态规格1 |
| `freeidx2` | `freeidx2` | `freeidx2` | 动态规格2 |
| `freeidx3` | `freeidx3` | `freeidx3` | 动态规格3 |
| `freeidx4` | `freeidx4` | `freeidx4` | 动态规格4 |
| `freeidx5` | `freeidx5` | `freeidx5` | 动态规格5 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `productId` | `productId` | `product` | 所属物料 |
| `id` | `id` | `productSku` | 主键 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
