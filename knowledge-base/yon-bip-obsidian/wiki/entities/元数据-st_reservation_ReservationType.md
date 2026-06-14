---
tags: [BIP, 元数据, 数据字典, st.reservation.ReservationType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 跟踪线索类型主表 (`st.reservation.ReservationType`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`st_reservationtype` | domain：`ustock` | 应用：`ST` | 业务对象ID：`fa8b448c-fac5-4328-9b5b-ba2311b7571c`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 跟踪线索类型主表 |
| 物理表 | `st_reservationtype` |
| domain/服务域 | `ustock` |
| schema | `ustock` |
| 所属应用 | `ST` |
| 直连字段 | 8 个 |
| 子表 | 1 个 |
| 关联引用 | 3 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `details` | `st.reservation.ReservationTypes` | composition |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `` | `` |
| `tenant_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 8 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isSystem` | `isSystem` | `isSystem` | 是否是系统预制 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `details` | 跟踪线索类型子表 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
