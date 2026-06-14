---
tags: [BIP, 元数据, 数据字典, sys.auth.RoleSensData]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 角色敏感数据 (`sys.auth.RoleSensData`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`role_sensdata` | domain：`u8c-auth` | 应用：`GZTACT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 角色敏感数据 |
| 物理表 | `role_sensdata` |
| domain/服务域 | `u8c-auth` |
| schema | `iuap_apcom_auth` |
| 所属应用 | `GZTACT` |
| 直连字段 | 6 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `sensdata_id` | `` |
| `role_id` | `` |
| `ytenant_id` | `` |

## 字段列表（按类型分组）

> 共 6 个直连字段

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `role_id` | `role_id` | `role` | 角色 |
| `sensdata_id` | `sensdata_id` | `sensDataAuth` | 敏感数据 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户ID |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `auth_level` | `auth_level` | `authLevel` | 权限级别 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
