---
tags: [BIP, 元数据, 数据字典, areaFormat.model.areaFormatRecord]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 区域格式 (`areaFormat.model.areaFormatRecord`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`area_base_info` | domain：`ucfbasedoc` | 应用：`FRMT` | 业务对象ID：`e05d4a87-0d8f-4143-b2d0-ee5af085ea3f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 区域格式 |
| 物理表 | `area_base_info` |
| 数据库 schema | `ucfbasedoc` |
| 所属应用 | `FRMT` |
| 直连字段 | 24 个 |
| 子表 | 4 个 |
| 关联引用 | 7 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `areaFormatTimeRecords` | `areaFormat.model.areaFormatTimeRecord` | composition |
| `areaFormatAddressRecords` | `areaFormat.model.areaFormatAddressRecord` | composition |
| `areaFormatNumberRecords` | `areaFormat.model.areaFormatNumberRecord` | composition |
| `areaFormatDateRecords` | `areaFormat.model.areaFormatDateRecord` | composition |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |
| `tenant_id` | `` |

## 继承接口 (3个, 6字段)

- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 24 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `area_code` | `area_code` | `area_code` | 地址编码 |
| `area_desc` | `area_desc` | `area_desc` | 描述 |
| `format_number` | `format_number` | `format_number` | 数字格式 |
| `format_date` | `format_date` | `format_date` | 日期格式 |
| `format_time` | `format_time` | `format_time` | 时间格式 |
| `format_address` | `format_address` | `format_address` | 地址格式 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 更新人 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenant` | 租户id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `created_time` | `created_time` | `created_time` | 创建时间 |
| `modified_time` | `modified_time` | `modified_time` | 修改时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_default` | `is_default` | `is_default` | 是否默认 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |
| `sourceid` | `sourceid` | `sourceid` | 来源id |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `area_name` | `area_name` | `area_name` | 地址名称 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `areaFormatAddressRecords` | 地址格式 |
| `` | `` | `areaFormatDateRecords` | 日期格式 |
| `` | `` | `areaFormatNumberRecords` | 数字格式 |
| `` | `` | `areaFormatTimeRecords` | 时间格式 |
