---
tags: [BIP, 元数据, 数据字典, aa.warehouse.WarehouseDefine]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 仓库档案自定义项 (`aa.warehouse.WarehouseDefine`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`aa_warehouse_define` | domain：`productcenter` | 应用：`DPMSI` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 仓库档案自定义项 |
| 物理表 | `aa_warehouse_define` |
| 数据库 schema | `productcenter` |
| 所属应用 | `DPMSI` |
| 直连字段 | 33 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `id` | `` |
| `tenant_id` | `` |

## 继承接口 (3个, 32字段)

- **固定自定义项(仓库)** (`base.itf.UserdefItemWarehouse`)
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 33 个直连字段

### 文本字段 (30个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `define1` | `define1` | 自定义项1 |
| `` | `define2` | `define2` | 自定义项2 |
| `` | `define3` | `define3` | 自定义项3 |
| `` | `define4` | `define4` | 自定义项4 |
| `` | `define5` | `define5` | 自定义项5 |
| `` | `define6` | `define6` | 自定义项6 |
| `` | `define7` | `define7` | 自定义项7 |
| `` | `define8` | `define8` | 自定义项8 |
| `` | `define9` | `define9` | 自定义项9 |
| `` | `define10` | `define10` | 自定义项10 |
| `` | `define11` | `define11` | 自定义项11 |
| `` | `define12` | `define12` | 自定义项12 |
| `` | `define13` | `define13` | 自定义项13 |
| `` | `define14` | `define14` | 自定义项14 |
| `` | `define15` | `define15` | 自定义项15 |
| `` | `define16` | `define16` | 自定义项16 |
| `` | `define17` | `define17` | 自定义项17 |
| `` | `define18` | `define18` | 自定义项18 |
| `` | `define19` | `define19` | 自定义项19 |
| `` | `define20` | `define20` | 自定义项20 |
| `` | `define21` | `define21` | 自定义项21 |
| `` | `define22` | `define22` | 自定义项22 |
| `` | `define23` | `define23` | 自定义项23 |
| `` | `define24` | `define24` | 自定义项24 |
| `` | `define25` | `define25` | 自定义项25 |
| `` | `define26` | `define26` | 自定义项26 |
| `` | `define27` | `define27` | 自定义项27 |
| `` | `define28` | `define28` | 自定义项28 |
| `` | `define29` | `define29` | 自定义项29 |
| `` | `define30` | `define30` | 自定义项30 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 仓库档案 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |
