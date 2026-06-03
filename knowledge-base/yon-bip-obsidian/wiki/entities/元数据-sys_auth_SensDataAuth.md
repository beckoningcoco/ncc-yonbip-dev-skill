---
tags: [BIP, 元数据, 数据字典, sys.auth.SensDataAuth]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 敏感数据权限 (`sys.auth.SensDataAuth`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sensdata_auth` | domain：`u8c-auth` | 应用：`GZTACT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 敏感数据权限 |
| 物理表 | `sensdata_auth` |
| 数据库 schema | `u8c-auth` |
| 所属应用 | `GZTACT` |
| 直连字段 | 14 个 |
| 子表 | 1 个 |
| 关联引用 | 4 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `rolesensdatas` | `sys.auth.RoleSensData` | composition |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `parentcode` | `` |
| `ytenant_id` | `` |
| `tenant_id` | `` |
| `` | `` |

## 继承接口 (2个, 2字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`

## 字段列表（按类型分组）

> 共 14 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 敏感数据编码 |
| `name` | `name` | `name` | 敏感数据名称 |
| `res_id` | `res_id` | `resId` | 多语资源编码 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `parentcode` | `parentcode` | `parentCode` | 分组编码 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `hasauth` | `hasauth` | `hasAuth` | 是否有权 |
| `isenable` | `isenable` | `isEnable` | 是否启用 |
| `isend` | `isend` | `isEnd` | 是否末级 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `level` | `level` | `level` | 层级 |
| `ordernum` | `ordernum` | `orderNum` | 序号 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `rolesensdatas` | 角色敏感数据 |
