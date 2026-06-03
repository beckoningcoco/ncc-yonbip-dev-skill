---
tags: [BIP, 元数据, 数据字典, ed.configurationCode.ConfigurationCode]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 配置号 (`ed.configurationCode.ConfigurationCode`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ed_configuration_code` | domain：`engineeringdata` | 应用：`ED` | 业务对象ID：`92c14fa0-1057-4713-a278-5d6e75dc038e`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 配置号 |
| 物理表 | `ed_configuration_code` |
| 数据库 schema | `engineeringdata` |
| 所属应用 | `ED` |
| 直连字段 | 17 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `product_id` | `` |
| `ytenant_id` | `` |
| `freect_h` | `` |
| `` | `` |
| `org_id` | `` |

## 继承接口 (2个, 9字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 17 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `ed_free_uid` | `ed_free_uid` | `edFreeUid` | 选配特征组唯一标识 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `name` | `name` | `name` | 名称 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `org_id` | `org_id` | `orgId` | 组织 |
| `product_id` | `product_id` | `productId` | 物料 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### OptionCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `freect_h` | `freect_h` | `edFreeCts` | 选配特征组实体 |
