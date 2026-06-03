---
tags: [BIP, 元数据, 数据字典, pc.tpl.ProductTplOrderPropertySum]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料模板-订单属性 (`pc.tpl.ProductTplOrderPropertySum`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`product_tpl_orderprop` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料模板-订单属性 |
| 物理表 | `product_tpl_orderprop` |
| 数据库 schema | `productcenter` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 10 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `tpl_id` | `` |
| `ytenant_id` | `` |
| `propertyType` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 10 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `propertyAlias` | `propertyAlias` | `alias` | 属性别名 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `propertyType` | `propertyType` | `propertyType` | 属性名称 |
| `tpl_id` | `tpl_id` | `template` | 物料模板 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isWebRequired` | `isWebRequired` | `isRequired` | 前端必输 |
| `isShow` | `isShow` | `isShow` | 前端显示 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iLimitNum` | `iLimitNum` | `limitNum` | 字数限制 |
| `ordernumber` | `ordernumber` | `order` | 排序 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
