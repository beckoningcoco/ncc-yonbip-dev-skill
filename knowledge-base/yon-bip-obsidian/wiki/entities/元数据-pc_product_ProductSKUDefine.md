---
tags: [BIP, 元数据, 数据字典, pc.product.ProductSKUDefine]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料SKU属性(自定义项)表 (`pc.product.ProductSKUDefine`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`productskudefine` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料SKU属性(自定义项)表 |
| 物理表 | `productskudefine` |
| domain/服务域 | `productcenter` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 66 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `productId` | `` |
| `ytenant_id` | `` |
| `skuId` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`coredoc.pub.TenantObselete`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 66 个直连字段

### 文本字段 (60个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `define1` | `define1` | `define1` | SKU扩展属性1 |
| `define2` | `define2` | `define2` | SKU扩展属性2 |
| `define3` | `define3` | `define3` | SKU扩展属性3 |
| `define4` | `define4` | `define4` | SKU扩展属性4 |
| `define5` | `define5` | `define5` | SKU扩展属性5 |
| `define6` | `define6` | `define6` | SKU扩展属性6 |
| `define7` | `define7` | `define7` | SKU扩展属性7 |
| `define8` | `define8` | `define8` | SKU扩展属性8 |
| `define9` | `define9` | `define9` | SKU扩展属性9 |
| `define10` | `define10` | `define10` | SKU扩展属性10 |
| `define11` | `define11` | `define11` | SKU扩展属性11 |
| `define12` | `define12` | `define12` | SKU扩展属性12 |
| `define13` | `define13` | `define13` | SKU扩展属性13 |
| `define14` | `define14` | `define14` | SKU扩展属性14 |
| `define15` | `define15` | `define15` | SKU扩展属性15 |
| `define16` | `define16` | `define16` | SKU扩展属性16 |
| `define17` | `define17` | `define17` | SKU扩展属性17 |
| `define18` | `define18` | `define18` | SKU扩展属性18 |
| `define19` | `define19` | `define19` | SKU扩展属性19 |
| `define20` | `define20` | `define20` | SKU扩展属性20 |
| `define21` | `define21` | `define21` | SKU扩展属性21 |
| `define22` | `define22` | `define22` | SKU扩展属性22 |
| `define23` | `define23` | `define23` | SKU扩展属性23 |
| `define24` | `define24` | `define24` | SKU扩展属性24 |
| `define25` | `define25` | `define25` | SKU扩展属性25 |
| `define26` | `define26` | `define26` | SKU扩展属性26 |
| `define27` | `define27` | `define27` | SKU扩展属性27 |
| `define28` | `define28` | `define28` | SKU扩展属性28 |
| `define29` | `define29` | `define29` | SKU扩展属性29 |
| `define30` | `define30` | `define30` | SKU扩展属性30 |
| `define31` | `define31` | `define31` | SKU扩展属性31 |
| `define32` | `define32` | `define32` | SKU扩展属性32 |
| `define33` | `define33` | `define33` | SKU扩展属性33 |
| `define34` | `define34` | `define34` | SKU扩展属性34 |
| `define35` | `define35` | `define35` | SKU扩展属性35 |
| `define36` | `define36` | `define36` | SKU扩展属性36 |
| `define37` | `define37` | `define37` | SKU扩展属性37 |
| `define38` | `define38` | `define38` | SKU扩展属性38 |
| `define39` | `define39` | `define39` | SKU扩展属性39 |
| `define40` | `define40` | `define40` | SKU扩展属性40 |
| `define41` | `define41` | `define41` | SKU扩展属性41 |
| `define42` | `define42` | `define42` | SKU扩展属性42 |
| `define43` | `define43` | `define43` | SKU扩展属性43 |
| `define44` | `define44` | `define44` | SKU扩展属性44 |
| `define45` | `define45` | `define45` | SKU扩展属性45 |
| `define46` | `define46` | `define46` | SKU扩展属性46 |
| `define47` | `define47` | `define47` | SKU扩展属性47 |
| `define48` | `define48` | `define48` | SKU扩展属性48 |
| `define49` | `define49` | `define49` | SKU扩展属性49 |
| `define50` | `define50` | `define50` | SKU扩展属性50 |
| `define51` | `define51` | `define51` | SKU扩展属性51 |
| `define52` | `define52` | `define52` | SKU扩展属性52 |
| `define53` | `define53` | `define53` | SKU扩展属性53 |
| `define54` | `define54` | `define54` | SKU扩展属性54 |
| `define55` | `define55` | `define55` | SKU扩展属性55 |
| `define56` | `define56` | `define56` | SKU扩展属性56 |
| `define57` | `define57` | `define57` | SKU扩展属性57 |
| `define58` | `define58` | `define58` | SKU扩展属性58 |
| `define59` | `define59` | `define59` | SKU扩展属性59 |
| `define60` | `define60` | `define60` | SKU扩展属性60 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户ID |
| `skuId` | `skuId` | `skuId` | SKUID |
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
