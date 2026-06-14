---
tags: [BIP, 元数据, 数据字典, ia.auditpoint.SensitiveAuditField]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 敏感词检查字段 (`ia.auditpoint.SensitiveAuditField`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ssc_ia_sensitive_audit_field` | domain：`yonbip-mid-sscia` | 应用：`ZNSH` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 敏感词检查字段 |
| 物理表 | `ssc_ia_sensitive_audit_field` |
| domain/服务域 | `yonbip-mid-sscia` |
| schema | `intelligent_audit` |
| 所属应用 | `ZNSH` |
| 直连字段 | 27 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `sensitive_audit_id` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `sensitive_word_repository_id` | `ia_sensitiveWordRepositoryref` |

## 字段列表（按类型分组）

> 共 27 个直连字段

### 文本字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键id |
| `entity_display_name` | `entity_display_name` | `entityDisplayName` | 字段来源 |
| `entity` | `entity` | `entity` | 数据源 |
| `field_display_name` | `field_display_name` | `fieldDisplayName` | 单据字段 |
| `child_field` | `child_field` | `childField` | 子表字段 |
| `field_name` | `field_name` | `fieldName` | 字段名 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `entity_resId` | `entity_resId` | `entityResId` | 实体显示名称多语资源id |
| `field_resId` | `field_resId` | `fieldResId` | 字段显示名称多语资源id |
| `tax_business_obj` | `tax_business_obj` | `taxBusinessObj` | 业务对象 |
| `tax_invoice_type` | `tax_invoice_type` | `taxInvoiceType` | 税务票单类型 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sensitive_audit_id` | `sensitive_audit_id` | `sensitiveAudit` | 敏感词检查项 |
| `sensitive_word_repository_id` | `sensitive_word_repository_id` | `sensitiveWordRepository` | 敏感词库id |
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

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 启用状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `version` | `version` | `version` | 版本号 |

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
