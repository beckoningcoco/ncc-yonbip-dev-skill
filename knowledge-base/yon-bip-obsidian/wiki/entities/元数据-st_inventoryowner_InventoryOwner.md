---
tags: [BIP, 元数据, 数据字典, st.inventoryowner.InventoryOwner]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 货主对象 (`st.inventoryowner.InventoryOwner`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`inventoryowner` | domain：`ustock` | 应用：`` | 业务对象ID：`4e8a7581-5e79-45e2-9e04-1fc5eabdb9a9`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 货主对象 |
| 物理表 | `inventoryowner` |
| domain/服务域 | `ustock` |
| schema | `ustock` |
| 所属应用 | `` |
| 直连字段 | 9 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `vendor` | `` |
| `tenant_id` | `` |
| `customer` | `` |

## 继承接口 (2个, 2字段)

- **货权归属** (`st.inventoryowner.IOwnerType`)
  - `` → ``
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 9 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `code` | String | 编码 |
| `` | `name` | String | 名称 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `customer` | `customer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | 客户 |
| `tenant_id` | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | 租户 |
| `vendor` | `vendor` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | VMI供应商 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

### 整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `ownertype` | Integer | 货权归属 |

### 长整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `id` | `id` | Long | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `pubts` | `pubts` | DateTime | 时间戳 |
