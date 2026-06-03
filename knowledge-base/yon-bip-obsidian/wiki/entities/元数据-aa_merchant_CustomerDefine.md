---
tags: [BIP, 元数据, 数据字典, aa.merchant.CustomerDefine]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户(自定义项)表(废弃) (`aa.merchant.CustomerDefine`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`customerdefine` | domain：`productcenter` | 应用：`DPMCUS` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 客户(自定义项)表(废弃) |
| 物理表 | `customerdefine` |
| 数据库 schema | `productcenter` |
| 所属应用 | `DPMCUS` |
| 直连字段 | 35 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `imerchantId` | `` |
| `ytenant_id` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 35 个直连字段

### 文本字段 (30个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `define1` | `define1` | `customerDefine1` | 客户扩展属性1 |
| `define10` | `define10` | `customerDefine10` | 客户扩展属性10 |
| `define11` | `define11` | `customerDefine11` | 客户扩展属性11 |
| `define12` | `define12` | `customerDefine12` | 客户扩展属性12 |
| `define13` | `define13` | `customerDefine13` | 客户扩展属性13 |
| `define14` | `define14` | `customerDefine14` | 客户扩展属性14 |
| `define15` | `define15` | `customerDefine15` | 客户扩展属性15 |
| `define16` | `define16` | `customerDefine16` | 客户扩展属性16 |
| `define17` | `define17` | `customerDefine17` | 客户扩展属性17 |
| `define18` | `define18` | `customerDefine18` | 客户扩展属性18 |
| `define19` | `define19` | `customerDefine19` | 客户扩展属性19 |
| `define2` | `define2` | `customerDefine2` | 客户扩展属性2 |
| `define20` | `define20` | `customerDefine20` | 客户扩展属性20 |
| `define21` | `define21` | `customerDefine21` | 客户扩展属性21 |
| `define22` | `define22` | `customerDefine22` | 客户扩展属性22 |
| `define23` | `define23` | `customerDefine23` | 客户扩展属性23 |
| `define24` | `define24` | `customerDefine24` | 客户扩展属性24 |
| `define25` | `define25` | `customerDefine25` | 客户扩展属性25 |
| `define26` | `define26` | `customerDefine26` | 客户扩展属性26 |
| `define27` | `define27` | `customerDefine27` | 客户扩展属性27 |
| `define28` | `define28` | `customerDefine28` | 客户扩展属性28 |
| `define29` | `define29` | `customerDefine29` | 客户扩展属性29 |
| `define3` | `define3` | `customerDefine3` | 客户扩展属性3 |
| `define30` | `define30` | `customerDefine30` | 客户扩展属性30 |
| `define4` | `define4` | `customerDefine4` | 客户扩展属性4 |
| `define5` | `define5` | `customerDefine5` | 客户扩展属性5 |
| `define6` | `define6` | `customerDefine6` | 客户扩展属性6 |
| `define7` | `define7` | `customerDefine7` | 客户扩展属性7 |
| `define8` | `define8` | `customerDefine8` | 客户扩展属性8 |
| `define9` | `define9` | `customerDefine9` | 客户扩展属性9 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `imerchantId` | `imerchantId` | `merchantId` | 所属客户 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
