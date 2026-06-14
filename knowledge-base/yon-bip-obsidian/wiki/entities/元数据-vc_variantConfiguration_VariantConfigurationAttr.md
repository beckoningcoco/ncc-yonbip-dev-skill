---
tags: [BIP, 元数据, 数据字典, vc.variantConfiguration.VariantConfigurationAttr]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 选配参数文件属性模版 (`vc.variantConfiguration.VariantConfigurationAttr`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`vc_attr` | domain：`engineeringdata` | 应用：`ED` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 选配参数文件属性模版 |
| 物理表 | `vc_attr` |
| domain/服务域 | `engineeringdata` |
| 所属应用 | `ED` |
| 直连字段 | 12 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |
| `variant_configuration_id` | `` |
| `variant_configuration_attr_group_id` | `` |

## 继承接口 (2个, 5字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`ucfbase.ucfbaseItf.IAuditInfo`)
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 12 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `characteristic` | `characteristic` | `characteristic` | 特征编码 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `variant_configuration_id` | `variant_configuration_id` | `variantConfiguration` | 选配参数文件 |
| `variant_configuration_attr_group_id` | `variant_configuration_attr_group_id` | `variantConfigurationAttrGroup` | 选配参数文件属性组 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期时间 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `seq` | `seq` | `seq` | 排序 |
| `visible` | `visible` | `visible` | 是否可见 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
