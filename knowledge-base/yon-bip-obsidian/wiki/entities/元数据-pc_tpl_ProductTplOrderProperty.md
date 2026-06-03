---
tags: [BIP, 元数据, 数据字典, pc.tpl.ProductTplOrderProperty]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料模板-订单属性 (`pc.tpl.ProductTplOrderProperty`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`product_tpl_orderprop` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料模板-订单属性 |
| 物理表 | `product_tpl_orderprop` |
| 数据库 schema | `productcenter` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 13 个 |
| 子表 | 1 个 |
| 关联引用 | 5 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `valueItems` | `pc.tpl.ProductTplOrderPropertyValue` | composition |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `tpl_id` | `` |
| `ytenant_id` | `` |
| `propertyType` | `` |
| `` | `` |
| `tenant_id` | `` |

## 继承接口 (3个, 3字段)

- **逻辑删除相关** (`base.itf.Deletable`)
  - `iDeleted` → `iDeleted`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 13 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `propertyAlias` | `propertyAlias` | `alias` | 属性别名 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `propertyType` | `propertyType` | `propertyType` | 属性名称 |
| `tpl_id` | `tpl_id` | `template` | 物料模板 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isWebRequired` | `isWebRequired` | `isRequired` | 前端必输 |
| `isShow` | `isShow` | `isShow` | 前端显示 |
| `iDeleted` | `iDeleted` | `isDeleted` | 逻辑删除标记 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iLimitNum` | `iLimitNum` | `limitNum` | 字数限制 |
| `ordernumber` | `ordernumber` | `order` | 排序号 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `valueItems` | 物料模板-订单属性值 |
