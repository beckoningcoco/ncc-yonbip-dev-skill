---
tags: [BIP, 元数据, 数据字典, bd.timezonelanguage.TimeZoneVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 时区 (`bd.timezonelanguage.TimeZoneVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sdm_utc_time_base_with_name` | domain：`iuap-apdoc-social` | 应用：`DPMPI` | 业务对象ID：`8c96451c-ec11-476d-b2a1-d4b23a4e283d`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 时区 |
| 物理表 | `sdm_utc_time_base_with_name` |
| 数据库 schema | `iuap-apdoc-social` |
| 所属应用 | `DPMPI` |
| 直连字段 | 15 个 |
| 子表 | 0 个 |
| 关联引用 | 2 个 |

## 关联引用 (2个)

| 字段名 | 引用类型 |
|--------|---------|
| `tenant_id` | `` |
| `ytenant_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 15 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `auto_id` | `auto_id` | `auto_id` | auto_id |
| `cityserid` | `cityserid` | `cityserid` | 代表城市多语言key |
| `pk` | `pk` | `id` | id |
| `introduction` | `introduction` | `introduction` | 介绍 |
| `off_set` | `off_set` | `off_set` | 偏移量 |
| `pk` | `pk` | `pk` | 主键 |
| `standard` | `standard` | `standard` | 标准 |
| `sys_id` | `sys_id` | `sys_id` | sys_id |
| `timenameserid` | `timenameserid` | `timenameserid` | 时区名称多语言key |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenant_id` | 时区名称 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 删除标志 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `ts` | 偏移量 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `city` | `city` | `city` | 代表城市 |
| `timename` | `timename` | `timename` | 时区名称 |
