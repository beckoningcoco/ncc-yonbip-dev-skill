---
tags: [BIP, 元数据, 数据字典, sys.auth.RoleAuth]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 角色权限 (`sys.auth.RoleAuth`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`role_auth` | domain：`u8c-auth` | 应用：`GZTACT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 角色权限 |
| 物理表 | `role_auth` |
| 数据库 schema | `u8c-auth` |
| 所属应用 | `GZTACT` |
| 直连字段 | 14 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `role_id` | `` |
| `ytenant_id` | `` |
| `tenantcenter_id` | `` |

## 字段列表（按类型分组）

> 共 14 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `auth_id` | `auth_id` | `auth` | 权限 |
| `id` | `id` | `id` | ID |
| `parent_id` | `parent_id` | `parentId` | 上级权限ID |
| `permission_code` | `permission_code` | `permissionCode` | 服务编码 |
| `permission_id` | `permission_id` | `permissionId` | 服务ID |
| `permission_type` | `permission_type` | `permissionType` | 服务类别 |
| `role_code` | `role_code` | `roleCode` | 角色编码 |
| `subId` | `subId` | `subId` | 子系统 |
| `system_code` | `system_code` | `systemCode` | 系统标识 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `role_id` | `role_id` | `role` | 角色 |
| `tenantcenter_id` | `tenantcenter_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户ID |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `version_num` | `version_num` | `versionNum` | 版本号 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
