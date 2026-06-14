---
tags: [BIP, 元数据, 数据字典, aa.qualify.QualifyGrade]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 资质等级 (`aa.qualify.QualifyGrade`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`aa_qualify_grade` | domain：`yssupplier` | 应用：`DPMSPL` | 业务对象ID：`74fabd41-0484-49ca-8154-e52d1a3ac64d`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 资质等级 |
| 物理表 | `aa_qualify_grade` |
| domain/服务域 | `yssupplier` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `DPMSPL` |
| 直连字段 | 5 个 |
| 子表 | 0 个 |
| 关联引用 | 1 个 |

## 关联引用 (1个)

| 字段名 | 引用类型 |
|--------|---------|
| `qualify_id` | `` |

## 字段列表（按类型分组）

> 共 5 个直连字段

### 引用字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `qualify_id` | `qualify_id` | `qualifyId` | 资质主键 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `grade_level` | `grade_level` | `gradeLevel` | 优先级别 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 资质等级名称 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
