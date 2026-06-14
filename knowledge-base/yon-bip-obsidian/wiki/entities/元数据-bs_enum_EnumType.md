---
tags: [BIP, 元数据, 数据字典, bs.enum.EnumType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 枚举类型 (`bs.enum.EnumType`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`aa_enum_type` | domain：`u8c-baseservice` | 应用：`` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 枚举类型 |
| 物理表 | `aa_enum_type` |
| domain/服务域 | `u8c-baseservice` |
| 所属应用 | `` |
| 直连字段 | 11 个 |
| 子表 | 1 个 |
| 关联引用 | 1 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `items` | `bs.enum.EnumItem` | composition |

## 关联引用 (1个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |

## 字段列表（按类型分组）

> 共 11 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `description` | `description` | `description` | 枚举名称 |
| `description_resid` | `description_resid` | `description_resid` | 资源ID |
| `domain_code` | `domain_code` | `domain_code` | 微服务域名 |
| `enumtype` | `enumtype` | `enumtype` | 枚举编码 |
| `nametype` | `nametype` | `nametype` | 枚举类型 |
| `subid` | `subid` | `subid` | subId |
| `tenant_id` | `tenant_id` | `tenant_id` | 租户 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ideleted` | `ideleted` | `ideleted` | 删除标识 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `items` | 枚举项 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
