---
tags: [BIP, 元数据, 数据字典, pc.brand.BrandDefine]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 品牌属性(自定义项)表 (`pc.brand.BrandDefine`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`branddefine` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 品牌属性(自定义项)表 |
| 物理表 | `branddefine` |
| domain/服务域 | `productcenter` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 33 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `id` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 33 个直连字段

### 文本字段 (30个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `define1` | `define1` | `brandDefine1` | 品牌扩展属性1 |
| `define10` | `define10` | `brandDefine10` | 品牌扩展属性10 |
| `define11` | `define11` | `brandDefine11` | 品牌扩展属性11 |
| `define12` | `define12` | `brandDefine12` | 品牌扩展属性12 |
| `define13` | `define13` | `brandDefine13` | 品牌扩展属性13 |
| `define14` | `define14` | `brandDefine14` | 品牌扩展属性14 |
| `define15` | `define15` | `brandDefine15` | 品牌扩展属性15 |
| `define16` | `define16` | `brandDefine16` | 品牌扩展属性16 |
| `define17` | `define17` | `brandDefine17` | 品牌扩展属性17 |
| `define18` | `define18` | `brandDefine18` | 品牌扩展属性18 |
| `define19` | `define19` | `brandDefine19` | 品牌扩展属性19 |
| `define2` | `define2` | `brandDefine2` | 品牌扩展属性2 |
| `define20` | `define20` | `brandDefine20` | 品牌扩展属性20 |
| `define21` | `define21` | `brandDefine21` | 品牌扩展属性21 |
| `define22` | `define22` | `brandDefine22` | 品牌扩展属性22 |
| `define23` | `define23` | `brandDefine23` | 品牌扩展属性23 |
| `define24` | `define24` | `brandDefine24` | 品牌扩展属性24 |
| `define25` | `define25` | `brandDefine25` | 品牌扩展属性25 |
| `define26` | `define26` | `brandDefine26` | 品牌扩展属性26 |
| `define27` | `define27` | `brandDefine27` | 品牌扩展属性27 |
| `define28` | `define28` | `brandDefine28` | 品牌扩展属性28 |
| `define29` | `define29` | `brandDefine29` | 品牌扩展属性29 |
| `define3` | `define3` | `brandDefine3` | 品牌扩展属性3 |
| `define30` | `define30` | `brandDefine30` | 品牌扩展属性30 |
| `define4` | `define4` | `brandDefine4` | 品牌扩展属性4 |
| `define5` | `define5` | `brandDefine5` | 品牌扩展属性5 |
| `define6` | `define6` | `brandDefine6` | 品牌扩展属性6 |
| `define7` | `define7` | `brandDefine7` | 品牌扩展属性7 |
| `define8` | `define8` | `brandDefine8` | 品牌扩展属性8 |
| `define9` | `define9` | `brandDefine9` | 品牌扩展属性9 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 品牌ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
