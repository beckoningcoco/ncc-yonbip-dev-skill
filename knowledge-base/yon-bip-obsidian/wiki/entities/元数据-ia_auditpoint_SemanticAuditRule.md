---
tags: [BIP, 元数据, 数据字典, ia.auditpoint.SemanticAuditRule]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 语义模型检查规则配置 (`ia.auditpoint.SemanticAuditRule`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ssc_ia_semantic_audit_rule` | domain：`yonbip-mid-sscia` | 应用：`ZNSH` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 语义模型检查规则配置 |
| 物理表 | `ssc_ia_semantic_audit_rule` |
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
| `semantic_audit_id` | `` |

## 字段列表（按类型分组）

> 共 30 个直连字段

### 文本字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `agg_type` | `agg_type` | `aggType` | 字段聚合类型 sum,max,count |
| `` | `creator` | `creator` | 创建人名称 |
| `field_resId` | `field_resId` | `fieldResId` | 字段来源名称多语 |
| `id` | `id` | `id` | 主键id |
| `` | `modifier` | `modifier` | 修改人名称 |
| `operator` | `operator` | `operator` | 比较符 |
| `param_bound` | `param_bound` | `paramBound` | 参数绑定 |
| `param_source` | `param_source` | `paramSource` | 参数来源,常量constValue,业务对象metaField,公共参数pageStatus,自定义参数terminalType |
| `rule_field_code` | `rule_field_code` | `ruleFieldCode` | 规则字段编码 |
| `rule_field_source` | `rule_field_source` | `ruleFieldSource` | 规则字段来源名称 |
| `rule_field_type` | `rule_field_type` | `ruleFieldType` | 规则字段类型，如：String,Date,Json等 |
| `rule_value` | `rule_value` | `ruleValue` | 规则字段值 |
| `rule_value_code` | `rule_value_code` | `ruleValueCode` | 规则字段值编码 |
| `rule_value_name` | `rule_value_name` | `ruleValueName` | 规则字段值名称 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `semantic_audit_id` | `semantic_audit_id` | `semanticAuditId` | 语义模型检查 |
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
| `dr` | `dr` | `dr` | 逻辑删除标记 |
| `field_order` | `field_order` | `fieldOrder` | 字段顺序 |
| `result_data_source` | `result_data_source` | `resultDataSource` | 结果数据来源3统计字段4分组字段 |
| `rule_type` | `rule_type` | `ruleType` | 规则类型1赋值参数2数据范围过滤字段where3统计字段count4分组字段group5分组过滤字段having6选择字段select7检查规则过滤字段where |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `alias_name` | `alias_name` | `aliasName` | 规则字段显示名称 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
