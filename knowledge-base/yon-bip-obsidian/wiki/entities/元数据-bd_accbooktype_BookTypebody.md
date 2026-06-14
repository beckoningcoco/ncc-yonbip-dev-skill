---
tags: [BIP, 元数据, 数据字典, bd.accbooktype.BookTypebody]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 会计主体列表 (`bd.accbooktype.BookTypebody`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_booktypebody` | domain：`finbd` | 应用：`GL` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 会计主体列表 |
| 物理表 | `bd_booktypebody` |
| domain/服务域 | `finbd` |
| schema | `iuap_apdoc_finbd` |
| 所属应用 | `GL` |
| 直连字段 | 9 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `accbooktype` | `` |
| `accbody` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 3字段)

- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`

## 字段列表（按类型分组）

> 共 9 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `code` | `code` | 编码 |
| `` | `name` | `name` | 名称 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbody` | `accbody` | `accbody` | 会计主体 |
| `accbooktype` | `accbooktype` | `accbooktype` | 业务账簿 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
| `pubts` | `pubts` | `pubts` | 最新修改时间 |
