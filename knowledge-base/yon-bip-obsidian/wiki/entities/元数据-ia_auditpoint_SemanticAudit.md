---
tags: [BIP, 元数据, 数据字典, ia.auditpoint.SemanticAudit]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 语义模型检查 (`ia.auditpoint.SemanticAudit`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ssc_ia_semantic_audit` | domain：`yonbip-mid-sscia` | 应用：`ZNSH` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 语义模型检查 |
| 物理表 | `ssc_ia_semantic_audit` |
| domain/服务域 | `yonbip-mid-sscia` |
| schema | `intelligent_audit` |
| 所属应用 | `ZNSH` |
| 直连字段 | 28 个 |
| 子表 | 4 个 |
| 关联引用 | 9 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `semanticAuditRules` | `ia.auditpoint.SemanticAuditRule` | composition |
| `semanticAuditRuleStatisticals` | `ia.auditpoint.SemanticAuditRule` | composition |
| `semanticAuditRuleGroupFields` | `ia.auditpoint.SemanticAuditRule` | composition |
| `semanticAuditRuleResultDetails` | `ia.auditpoint.SemanticAuditRule` | composition |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |
| `semantic_register_id` | `` |
| `audit_point_id` | `` |

## 字段列表（按类型分组）

> 共 28 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `check_rule` | `check_rule` | `checkRule` | 统计字段检查规则 |
| `` | `creator` | `creator` | 创建人名称 |
| `id` | `id` | `id` | 主键id |
| `` | `modifier` | `modifier` | 修改人名称 |
| `object_check_rule` | `object_check_rule` | `objectCheckRule` | 对象检查规则 |
| `result_type` | `result_type` | `resultType` | 结果类型 |
| `select_param` | `select_param` | `selectParam` | 查询参数 |
| `semantic_code` | `semantic_code` | `semanticCode` | 语义模型编码 |
| `semantic_id` | `semantic_id` | `semanticId` | 语义模型ID |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_point_id` | `audit_point_id` | `auditPoint` | 规则 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `semantic_register_id` | `semantic_register_id` | `semanticRegisterId` | 语义模型注册表ID |
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
| `group_statistics` | `group_statistics` | `groupStatistics` | 分组及统计 |
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |
| `effective` | `effective` | `effective` | 是否有效 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |

### other (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `semanticAuditRuleGroupFields` | 语义模型检查规则配置 |
| `` | `` | `semanticAuditRuleResultDetails` | 语义模型检查规则配置 |
| `` | `` | `semanticAuditRuleStatisticals` | 语义模型检查规则配置 |
| `` | `` | `semanticAuditRules` | 语义模型检查规则配置 |
