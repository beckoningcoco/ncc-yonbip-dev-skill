---
tags: [BIP, 元数据, 数据字典, bs.enum.EnumItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 枚举项 (`bs.enum.EnumItem`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`aa_enum_item` | domain：`u8c-baseservice` | 应用：`` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 枚举项 |
| 物理表 | `aa_enum_item` |
| 数据库 schema | `u8c-baseservice` |
| 所属应用 | `` |
| 直连字段 | 10 个 |
| 子表 | 0 个 |
| 关联引用 | 1 个 |

## 关联引用 (1个)

| 字段名 | 引用类型 |
|--------|---------|
| `typeid` | `` |

## 字段列表（按类型分组）

> 共 10 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enumcode` | `enumcode` | `enumcode` | 编码 |
| `enumname` | `enumname` | `enumname` | 枚举项名称 |
| `enumname_resid` | `enumname_resid` | `enumname_resid` | 资源编码 |
| `icon` | `icon` | `icon` | 图标 |
| `localid` | `localid` | `localid` | localid |

### 引用字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `typeid` | `typeid` | `typeid` | 枚举类型主键 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enumindex` | `enumindex` | `enumindex` | 序号 |
| `ideleted` | `ideleted` | `ideleted` | 删除标识 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
