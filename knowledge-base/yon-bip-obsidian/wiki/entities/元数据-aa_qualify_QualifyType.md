---
tags: [BIP, 元数据, 数据字典, aa.qualify.QualifyType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 资质类型 (`aa.qualify.QualifyType`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`aa_qualify_type` | domain：`yssupplier` | 应用：`DPMSPL` | 业务对象ID：`5faa3f53-1054-4ee1-b8d1-c5fcd3ccb434`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 资质类型 |
| 物理表 | `aa_qualify_type` |
| 数据库 schema | `yssupplier` |
| 所属应用 | `DPMSPL` |
| 直连字段 | 9 个 |
| 子表 | 0 个 |
| 关联引用 | 0 个 |

## 继承接口 (1个, 5字段)

- **树型结构** (`base.itf.ITree`)
  - `` → ``
  - `level` → `level`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`

## 字段列表（按类型分组）

> 共 9 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `parent_id` | `parent_id` | `parentId` | 父级分类ID |
| `path` | `path` | `path` | 路径 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isEnd` | `isEnd` | 是否末级 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `level` | `level` | `level` | 层级 |
| `sort_num` | `sort_num` | `sort` | 排序号 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `parent_id` | `parent_id` | `parent` | 上级分类 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 资质分类名称 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
