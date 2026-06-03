---
tags: [BIP, 元数据, 数据字典, areaFormat.model.areaFormatAddressRecord]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 地址格式 (`areaFormat.model.areaFormatAddressRecord`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`area_format_address` | domain：`ucfbasedoc` | 应用：`FRMT` | 业务对象ID：`e05d4a87-0d8f-4143-b2d0-ee5af085ea3f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 地址格式 |
| 物理表 | `area_format_address` |
| 数据库 schema | `ucfbasedoc` |
| 所属应用 | `FRMT` |
| 直连字段 | 21 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `area_base_info_id` | `` |
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

> 共 21 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |
| `addr_segment_code` | `addr_segment_code` | `addr_segment_code` | 地址分段code |
| `addr_name_resid` | `addr_name_resid` | `addr_name_resid` | 名称词条 |
| `addr_separator` | `addr_separator` | `addr_separator` | 地址分隔符 |
| `ref_code` | `ref_code` | `ref_code` | 参照 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 更新人 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `area_base_info_id` | `area_base_info_id` | `area_base_info_id` | 地址表外键 |
| `tenant_id` | `tenant_id` | `tenant` | 租户id |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期时间 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `addr_order` | `addr_order` | `addr_order` | 排序 |
| `is_show` | `is_show` | `is_show` | 是否显示 |
| `is_required` | `is_required` | `is_required` | 是否必填 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 地址表主键 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `addr_alias` | `addr_alias` | `addr_alias` | 别名 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `created_time` | `created_time` | `created_time` | 创建时间 |
| `modified_time` | `modified_time` | `modified_time` | 更新时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
