---
tags: [BIP, 元数据, 数据字典, taxpubdoc.taxesClassification.TaxesClassificationList]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 税收分类列表 (`taxpubdoc.taxesClassification.TaxesClassificationList`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tax_classification` | domain：`yonbip-fi-taxpubdoc` | 应用：`DPMTAX` | 业务对象ID：`48ff8b08-8934-40d4-a517-3d806766b47c`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 税收分类列表 |
| 物理表 | `tax_classification` |
| domain/服务域 | `yonbip-fi-taxpubdoc` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `DPMTAX` |
| 直连字段 | 22 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `id` | `` |
| `ytenant_id` | `` |

## 继承接口 (2个, 5字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 22 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `simple_name3` | `simple_name3` | `simpleName3` | 物料和服务分类简称3 |
| `simple_name4` | `simple_name4` | `simpleName4` | 物料和服务分类简称4 |
| `simple_name5` | `simple_name5` | `simpleName5` | 物料和服务分类简称5 |
| `special_tag` | `special_tag` | `special_tag` | 特定要素标签归类 |
| `parent_code` | `parent_code` | `parentCode` | 父级编码 |
| `code` | `code` | `code` | 编码 |
| `simple_name2` | `simple_name2` | `simpleName2` | 物料和服务分类简称2 |
| `policy_name` | `policy_name` | `policyName` | 减免政策名称 |
| `level` | `level` | `level` | 层级 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 外键关联 |
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

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `taxrate` | `taxrate` | `taxrate` | 税率 |
| `isend` | `isend` | `isEnd` | 是否末级 |

### multiLanguage (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 货物和劳务名称 |
| `tax_desc` | `tax_desc` | `taxDesc` | 说明 |
| `simple_name` | `simple_name` | `simpleName` | 物料和服务分类简称 |
