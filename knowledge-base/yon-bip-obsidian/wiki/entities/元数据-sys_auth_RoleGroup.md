---
tags: [BIP, 元数据, 数据字典, sys.auth.RoleGroup]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 角色组管理 (`sys.auth.RoleGroup`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`role_group` | domain：`u8c-auth` | 应用：`GZTACT` | 业务对象ID：`7d545648-fac9-444e-b258-a581ad7f5c9e`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 角色组管理 |
| 物理表 | `role_group` |
| 数据库 schema | `u8c-auth` |
| 所属应用 | `GZTACT` |
| 直连字段 | 20 个 |
| 子表 | 0 个 |
| 关联引用 | 2 个 |

## 关联引用 (2个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `tenant_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 20 个直连字段

### 文本字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modifier` | `modifier` | `modifier` | 修改人 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `group_name2` | `group_name2` | `name2` | 角色组名二 |
| `group_name3` | `group_name3` | `name3` | 角色组名三 |
| `group_name4` | `group_name4` | `name4` | 角色组名四 |
| `group_name5` | `group_name5` | `name5` | 角色组名五 |
| `group_name6` | `group_name6` | `name6` | 角色组名六 |
| `role_name` | `role_name` | `roleName` | 分配角色 |
| `tcenter_id_str` | `tcenter_id_str` | `tenantcenterId` | 友互通租户id |
| `code` | `code` | `code` | 编码 |
| `org_id` | `org_id` | `orgId` | 所属组织id |
| `org_name` | `org_name` | `orgName` | 所属组织 |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户ID |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isSys` | `isSys` | `isSys` | 系统标签 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `role_group_type` | `role_group_type` | `roleGroupType` | 类型 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `pubts` | `pubts` | `ts` | 时间戳 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `group_name` | `group_name` | `name` | 名称 |
