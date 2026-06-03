---
tags: [BIP, 元数据, 数据字典, pc.tag.TagRule]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 自动标签规则 (`pc.tag.TagRule`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tagrule` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 自动标签规则 |
| 物理表 | `tagrule` |
| 数据库 schema | `productcenter` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 9 个 |
| 子表 | 0 个 |
| 关联引用 | 1 个 |

## 关联引用 (1个)

| 字段名 | 引用类型 |
|--------|---------|
| `tagId` | `` |

## 字段列表（按类型分组）

> 共 9 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `propertyType` | `propertyType` | `propertyType` | 分类 |
| `property` | `property` | `property` | 属性 |
| `caption` | `caption` | `caption` | 名称 |
| `condition` | `condition` | `condition` | 条件 |
| `value1` | `value1` | `value1` | 值1 |
| `value2` | `value2` | `value2` | 值2 |

### 引用字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tagId` | `tagId` | `tag` | 标签 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
