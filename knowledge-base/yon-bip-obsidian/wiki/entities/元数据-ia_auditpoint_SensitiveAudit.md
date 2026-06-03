---
tags: [BIP, 元数据, 数据字典, ia.auditpoint.SensitiveAudit]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 敏感词检查 (`ia.auditpoint.SensitiveAudit`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ssc_ia_sensitive_audit` | domain：`yonbip-mid-sscia` | 应用：`ZNSH` | 业务对象ID：`64a389a9-d4ed-4a33-a019-75b0639c665d`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 敏感词检查 |
| 物理表 | `ssc_ia_sensitive_audit` |
| 数据库 schema | `yonbip-mid-sscia` |
| 所属应用 | `ZNSH` |
| 直连字段 | 27 个 |
| 子表 | 2 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `sensitiveAuditConditions` | `ia.auditpoint.SensitiveAuditCondition` | composition |
| `sensitiveAuditFields` | `ia.auditpoint.SensitiveAuditField` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `` | `` |
| `source_trans_type_id` | `` |
| `source_bill_type_id` | `` |
| `audit_point_id` | `` |

## 字段列表（按类型分组）

> 共 27 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键id |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_point_id` | `audit_point_id` | `auditPoint` | 审核要点 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `source_bill_type_id` | `source_bill_type_id` | `sourceBillType` | 来源单据类型 |
| `source_trans_type_id` | `source_trans_type_id` | `sourceTransType` | 来源交易类型 |
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

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 启用状态 |
| `data_condition` | `data_condition` | `dataCondition` | 数据过滤条件 |
| `preset_tag` | `preset_tag` | `presetTag` | 是否预置 |

### 短整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `check_scope` | `check_scope` | `checkScope` | 检查范围 |
| `data_source` | `data_source` | `dataSource` | 票单数据源 |
| `dr` | `dr` | `dr` | 逻辑删除标记 |
| `effective` | `effective` | `effective` | 是否有效 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `version` | `version` | `version` | 版本号 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `un_sensitive_message` | `un_sensitive_message` | `unSensitiveMessage` | 通过话术 |
| `sensitive_message` | `sensitive_message` | `sensitiveMessage` | 不通过话术 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `sensitiveAuditConditions` | 过滤条件配置 |
| `` | `` | `sensitiveAuditFields` | 敏感词检查字段 |
