---
tags: [BIP, 元数据, 数据字典, taxpubdoc.taxesClassification.TaxesClassification]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 税收分类 (`taxpubdoc.taxesClassification.TaxesClassification`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tax_classification` | domain：`yonbip-fi-taxpubdoc` | 应用：`DPMTAX` | 业务对象ID：`48ff8b08-8934-40d4-a517-3d806766b47c`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 税收分类 |
| 物理表 | `tax_classification` |
| 数据库 schema | `yonbip-fi-taxpubdoc` |
| 所属应用 | `DPMTAX` |
| 直连字段 | 27 个 |
| 子表 | 3 个 |
| 关联引用 | 7 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `TaxesClassificationListList` | `taxpubdoc.taxesClassification.TaxesClassificationList` | composition |
| `TaxClassPolicyList` | `taxpubdoc.taxesClassification.TaxClassPolicy` | composition |
| `TaxClassCustomsList` | `taxpubdoc.taxesClassification.TaxClassCustoms` | composition |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `parent_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `ytenant_id` | `` |

## 继承接口 (3个, 11字段)

- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **树型结构** (`iuap.busiObj.ITree`)
  - `ifend` → `ifend`
  - `level` → `level`
  - `name` → `name`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`

## 字段列表（按类型分组）

> 共 27 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `parent_code` | `parent_code` | `parentCode` | 父级编码 |
| `simple_name2` | `simple_name2` | `simpleName2` | 物料和服务分类简称2 |
| `simple_name3` | `simple_name3` | `simpleName3` | 物料和服务分类简称3 |
| `simple_name4` | `simple_name4` | `simpleName4` | 物料和服务分类简称4 |
| `simple_name5` | `simple_name5` | `simpleName5` | 物料和服务分类简称5 |
| `code` | `code` | `code` | 编码 |
| `special_tag` | `special_tag` | `special_tag` | 特定要素标签归类 |
| `id` | `id` | `id` | 主键 |
| `path` | `path` | `path` | 路径 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `parent_id` | `parent_id` | `parent` | 税收分类 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `country` | `country` | `country` | 国家地区 |

### 整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `taxrate` | `taxrate` | `taxrate` | 税率 |
| `isend` | `isend` | `isEnd` | 是否末级 |
| `level` | `level` | `level` | 层级 |
| `sort_num` | `sort_num` | `sort` | 排序号 |

### multiLanguage (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `simple_name` | `simple_name` | `simpleName` | 物料和服务分类简称 |
| `tax_desc` | `tax_desc` | `taxDesc` | 说明 |
| `name` | `name` | `name` | 货物和劳务名称 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `TaxesClassificationListList` | 税收分类列表 |
| `` | `` | `TaxClassPolicyList` | 税收政策 |
| `` | `` | `TaxClassCustomsList` | 海关HS编码 |
