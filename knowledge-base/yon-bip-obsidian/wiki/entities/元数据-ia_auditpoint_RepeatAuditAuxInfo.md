---
tags: [BIP, 元数据, 数据字典, ia.auditpoint.RepeatAuditAuxInfo]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 重复事件检查辅助信息 (`ia.auditpoint.RepeatAuditAuxInfo`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ssc_ia_repeat_audit_aux_info` | domain：`yonbip-mid-sscia` | 应用：`ZNSH` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 重复事件检查辅助信息 |
| 物理表 | `ssc_ia_repeat_audit_aux_info` |
| 数据库 schema | `yonbip-mid-sscia` |
| 所属应用 | `ZNSH` |
| 直连字段 | 31 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `repeat_audit_id` | `` |
| `ytenant_id` | `` |
| `` | `` |

## 字段列表（按类型分组）

> 共 31 个直连字段

### 文本字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `entity_display_name` | `entity_display_name` | `entityDisplayName` | 字段来源 |
| `field_display_name` | `field_display_name` | `fieldDisplayName` | 单据字段 |
| `entity` | `entity` | `entity` | 数据源 |
| `parent_entity` | `parent_entity` | `parentEntity` | 父级数据源 |
| `field_name` | `field_name` | `fieldName` | 字段名 |
| `field_type` | `field_type` | `fieldType` | 字段类型 |
| `child_field` | `child_field` | `childField` | 子表字段 |
| `enum_array` | `enum_array` | `enumArray` | 枚举信息 |
| `ref_code` | `ref_code` | `refCode` | 参照编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `define_field` | `define_field` | `defineField` | 自定义字段名 |
| `entity_resId` | `entity_resId` | `entityResId` | 实体显示名称多语资源id |
| `field_resId` | `field_resId` | `fieldResId` | 字段显示名称多语资源id |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `repeat_audit_id` | `repeat_audit_id` | `repeatAudit` | 重复事件检查项id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 日期时间 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_enum` | `is_enum` | `isEnum` | 是否枚举 |
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `version` | `version` | `version` | 版本号 |
| `order` | `order` | `order` | 序号 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `alias_name` | `alias_name` | `aliasName` | 字段显示名称 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
