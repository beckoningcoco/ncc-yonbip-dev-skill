---
tags: [BIP, 元数据, 数据字典, bd.timezonelanguage.NewTimeZoneVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 时区(含编码字段) (`bd.timezonelanguage.NewTimeZoneVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_timezone` | domain：`iuap-apdoc-social` | 应用：`DPMPI` | 业务对象ID：`37415219-d527-4ff8-a552-0de5a85adcab`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 时区(含编码字段) |
| 物理表 | `bd_timezone` |
| 数据库 schema | `iuap-apdoc-social` |
| 所属应用 | `DPMPI` |
| 直连字段 | 3 个 |
| 子表 | 0 个 |
| 关联引用 | 1 个 |

## 关联引用 (1个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 3 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `id` | `id` | `id` | id |

### 引用字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
