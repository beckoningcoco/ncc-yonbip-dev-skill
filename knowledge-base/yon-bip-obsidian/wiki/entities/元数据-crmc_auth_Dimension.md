---
tags: [BIP, 元数据, 数据字典, crmc.auth.Dimension]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 管理维度 (`crmc.auth.Dimension`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`crmc_auth_dimension` | domain：`yycrm` | 应用：`CRMC` | 业务对象ID：`e90da52f-b1d0-4e6a-ba6b-f5334079a8ae`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 管理维度 |
| 物理表 | `crmc_auth_dimension` |
| 数据库 schema | `yycrm` |
| 所属应用 | `CRMC` |
| 直连字段 | 16 个 |
| 子表 | 0 个 |
| 关联引用 | 1 个 |

## 关联引用 (1个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |

## 继承接口 (2个, 3字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`

## 字段列表（按类型分组）

> 共 16 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `meta` | `meta` | `meta` | 元数据 |
| `metaShowField` | `metaShowField` | `metaShowField` | 元数据查询展示字段 |
| `refCode` | `refCode` | `refCode` | 参照编码 |
| `refShowField` | `refShowField` | `refShowField` | 参照显示字段 |
| `relateColumn` | `relateColumn` | `relateColumn` | 关联字段 |

### 引用字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bShow` | `bShow` | `bShow` | 是否显示 |
| `isPreset` | `isPreset` | `isPreset` | 是否预置 |
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `sysid` | `sysid` | `sysid` | 0租户ID |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `description` | `description` | `description` | 描述 |
| `name` | `name` | `name` | 名称 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
