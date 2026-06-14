---
tags: [BIP, 元数据, 数据字典, sys.auth.RoleKanBan]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 看板权限 (`sys.auth.RoleKanBan`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`role_kanban` | domain：`u8c-auth` | 应用：`GZTACT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 看板权限 |
| 物理表 | `role_kanban` |
| domain/服务域 | `u8c-auth` |
| schema | `iuap_apcom_auth` |
| 所属应用 | `GZTACT` |
| 直连字段 | 5 个 |
| 子表 | 0 个 |
| 关联引用 | 1 个 |

## 关联引用 (1个)

| 字段名 | 引用类型 |
|--------|---------|
| `role_id` | `` |

## 字段列表（按类型分组）

> 共 5 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `subId` | `subId` | `subId` | 子系统 |

### 引用字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `role_id` | `role_id` | `role` | 角色 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `kanban_id` | `kanban_id` | `kanban` | 看板ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
