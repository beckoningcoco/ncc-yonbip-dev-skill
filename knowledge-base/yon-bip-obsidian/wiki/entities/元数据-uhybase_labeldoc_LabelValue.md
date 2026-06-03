---
tags: [BIP, 元数据, 数据字典, uhybase.labeldoc.LabelValue]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 标签值 (`uhybase.labeldoc.LabelValue`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mp_labelvalue` | domain：`uhy` | 应用：`SDMB` | 业务对象ID：`a6833a6a-ef2c-44be-be20-dcb141a02800`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 标签值 |
| 物理表 | `mp_labelvalue` |
| 数据库 schema | `uhy` |
| 所属应用 | `SDMB` |
| 直连字段 | 6 个 |
| 子表 | 0 个 |
| 关联引用 | 2 个 |

## 关联引用 (2个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `iLabelID` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 6 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cLabelCode` | `cLabelCode` | `cLabelCode` | 标签值code |
| `cLabelValue` | `cLabelValue` | `cLabelValue` | 标签值 |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iLabelID` | `iLabelID` | `iLabelID` | 标签档案id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `pubts` | 时间戳 |
