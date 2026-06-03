---
tags: [BIP, 元数据, 数据字典, pc.tpl.ProductPropertySource]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料属性来源 (`pc.tpl.ProductPropertySource`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`product_tpl_propsource` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：`843931db-8d08-4b38-9a72-88ac1b3667cf`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料属性来源 |
| 物理表 | `product_tpl_propsource` |
| 数据库 schema | `productcenter` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 8 个 |
| 子表 | 0 个 |
| 关联引用 | 0 个 |

## 字段列表（按类型分组）

> 共 8 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `group` | `group` | `group` | 来源分类 |
| `name` | `name` | `name` | 属性名称 |
| `showType` | `showType` | `showType` | 表现类型 |
| `values` | `values` | `values` | 属性值 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dataType` | `dataType` | `dataType` | 数据类型 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `alias` | `alias` | `alias` | 别名 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
