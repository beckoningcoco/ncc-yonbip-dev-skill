---
tags: [BIP, 元数据, 数据字典, ia.auditpoint.GptContentAuditField]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 大模型检查相关字段 (`ia.auditpoint.GptContentAuditField`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ssc_ia_gpt_audit_field` | domain：`yonbip-mid-sscia` | 应用：`ZNSH` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 大模型检查相关字段 |
| 物理表 | `ssc_ia_gpt_audit_field` |
| domain/服务域 | `yonbip-mid-sscia` |
| schema | `intelligent_audit` |
| 所属应用 | `ZNSH` |
| 直连字段 | 24 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `` | `` |
| `gpt_audit_detail_id` | `` |

## 字段列表（按类型分组）

> 共 24 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_field_name` | `audit_field_name` | `auditFieldName` | 检查项关联字段名称 |
| `` | `creator` | `creator` | 创建人名称 |
| `entity` | `entity` | `entity` | 实体 |
| `entity_display_name` | `entity_display_name` | `entityDisplayName` | 实体显示名称 |
| `enum_array` | `enum_array` | `enumArray` | 枚举信息 |
| `field` | `field` | `field` | 字段 |
| `field_display_name` | `field_display_name` | `fieldDisplayName` | 字段显示名称 |
| `id` | `id` | `id` | 主键id |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `gpt_audit_detail_id` | `gpt_audit_detail_id` | `gptContentAuditDetail` | 大模型检查项 |
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

### 布尔字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_enum` | `is_enum` | `isEnum` | 是否枚举 |
| `manual_flag` | `manual_flag` | `manualFlag` | 手工插入 |
| `relation_bill` | `relation_bill` | `relationBill` | 是否关联单 |
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
