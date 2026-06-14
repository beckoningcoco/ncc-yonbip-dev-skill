---
tags: [BIP, 元数据, 数据字典, ia.auditpoint.GptContentAuditDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 大模型检查项 (`ia.auditpoint.GptContentAuditDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ssc_ia_gpt_audit_detail` | domain：`yonbip-mid-sscia` | 应用：`ZNSH` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 大模型检查项 |
| 物理表 | `ssc_ia_gpt_audit_detail` |
| domain/服务域 | `yonbip-mid-sscia` |
| schema | `intelligent_audit` |
| 所属应用 | `ZNSH` |
| 直连字段 | 26 个 |
| 子表 | 1 个 |
| 关联引用 | 6 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `gptContentAuditFields` | `ia.auditpoint.GptContentAuditField` | composition |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `` | `` |
| `content_audit_id` | `` |
| `relation_bill_id` | `` |

## 字段列表（按类型分组）

> 共 26 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_msg` | `audit_msg` | `auditMsg` | 审核要求 |
| `` | `creator` | `creator` | 创建人名称 |
| `explanation` | `explanation` | `explanation` | 补充说明 |
| `field_positions` | `field_positions` | `fieldPositions` | 字段位置 |
| `gpt_audit_msg` | `gpt_audit_msg` | `gptAuditMsg` | 大模型审核要求 |
| `id` | `id` | `id` | 主键id |
| `knowledge_info` | `knowledge_info` | `knowledgeInfo` | 知识库 |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `content_audit_id` | `content_audit_id` | `contentAudit` | 非标附件检查项 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `relation_bill_id` | `relation_bill_id` | `relationBillId` | 关联单ID |
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

### 短整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_tag` | `audit_tag` | `auditTag` | 审核标签 |
| `aux_mode` | `aux_mode` | `auxMode` | 辅助信息 |
| `business_type` | `business_type` | `businessType` | 审核场景 |
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `display_name` | `display_name` | `displayName` | 显示名称 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `gptContentAuditFields` | 大模型检查相关字段 |
