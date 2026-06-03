---
tags: [BIP, 元数据, 数据字典, aa.qualify.Qualify]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 资质档案 (`aa.qualify.Qualify`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`aa_qualify` | domain：`yssupplier` | 应用：`DPMSPL` | 业务对象ID：`5d58da1f-c370-43fa-8b7d-3be890e8d884`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 资质档案 |
| 物理表 | `aa_qualify` |
| 数据库 schema | `yssupplier` |
| 所属应用 | `DPMSPL` |
| 直连字段 | 11 个 |
| 子表 | 1 个 |
| 关联引用 | 2 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `qualifyGradeList` | `aa.qualify.QualifyGrade` | composition |

## 关联引用 (2个)

| 字段名 | 引用类型 |
|--------|---------|
| `type_id` | `` |
| `` | `` |

## 字段列表（按类型分组）

> 共 11 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 资质编码 |
| `enableocr` | `enableocr` | `enableocr` | 是否支持OCR |
| `is_basic` | `is_basic` | `isBasic` | 是否是基本资质 |
| `necessary` | `necessary` | `necessary` | 是否必须 |

### 引用字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `type_id` | `type_id` | `typeId` | 资质类型主键 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### multiLanguage (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `approve_demand` | `approve_demand` | `approveDemand` | 审核要求 |
| `description` | `description` | `description` | 资质描述 |
| `name` | `name` | `name` | 资质名称 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `qualifyGradeList` | 资质等级 |
