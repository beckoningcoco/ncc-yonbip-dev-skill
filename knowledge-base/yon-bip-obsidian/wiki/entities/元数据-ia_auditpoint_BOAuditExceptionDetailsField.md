---
tags: [BIP, 元数据, 数据字典, ia.auditpoint.BOAuditExceptionDetailsField]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 异常明细字段 (`ia.auditpoint.BOAuditExceptionDetailsField`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ssc_ia_bo_audit_exception_details_field` | domain：`yonbip-mid-sscia` | 应用：`ZNSH` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 异常明细字段 |
| 物理表 | `ssc_ia_bo_audit_exception_details_field` |
| 数据库 schema | `yonbip-mid-sscia` |
| 所属应用 | `ZNSH` |
| 直连字段 | 30 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `` | `` |
| `bo_audit_id` | `` |

## 字段列表（按类型分组）

> 共 30 个直连字段

### 文本字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人名称 |
| `deal_mode` | `deal_mode` | `dealMode` | 处理方式 |
| `enum_array` | `enum_array` | `enumArray` | 枚举信息 |
| `field_code` | `field_code` | `fieldCode` | 字段编码 |
| `field_data_source` | `field_data_source` | `fieldDataSource` | 数据来源 |
| `field_name` | `field_name` | `fieldName` | 字段名称 |
| `field_resId` | `field_resId` | `fieldResId` | 字段名称多语 |
| `field_source` | `field_source` | `fieldSource` | 字段来源元数据URI |
| `field_source_name` | `field_source_name` | `fieldSourceName` | 字段来源 |
| `field_source_name_resId` | `field_source_name_resId` | `fieldSourceNameResId` | 字段来源多语 |
| `field_type` | `field_type` | `fieldType` | 字段类型 |
| `id` | `id` | `id` | 主键id |
| `` | `modifier` | `modifier` | 修改人名称 |
| `ref_code` | `ref_code` | `refCode` | 参照编码 |
| `ref_id` | `ref_id` | `refId` | 引用参照 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bo_audit_id` | `bo_audit_id` | `boAuditId` | 业务对象检查 |
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
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `order` | `order` | `order` | 序号 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `field_deal_name` | `field_deal_name` | `fieldDealName` | 字段处理名称 |
| `field_display_name` | `field_display_name` | `fieldDisplayName` | 字段显示名称 |
