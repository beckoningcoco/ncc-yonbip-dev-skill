---
tags: [BIP, 元数据, 数据字典, ia.auditpoint.IndexAuditRule]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 指标检查规则 (`ia.auditpoint.IndexAuditRule`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ssc_ia_index_audit_rule` | domain：`yonbip-mid-sscia` | 应用：`ZNSH` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 指标检查规则 |
| 物理表 | `ssc_ia_index_audit_rule` |
| 数据库 schema | `yonbip-mid-sscia` |
| 所属应用 | `ZNSH` |
| 直连字段 | 34 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `` | `` |
| `index_audit_id` | `` |

## 字段列表（按类型分组）

> 共 34 个直连字段

### 文本字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人名称 |
| `derived_function` | `derived_function` | `derivedFunction` | 高级运算符 |
| `derived_function_name` | `derived_function_name` | `derivedFunctionName` | 高级运算符名称 |
| `id` | `id` | `id` | 主键id |
| `` | `modifier` | `modifier` | 修改人名称 |
| `param_code` | `param_code` | `paramCode` | 字段编码 |
| `param_type` | `param_type` | `paramType` | 字段类型 |
| `param_uri` | `param_uri` | `paramUri` | 元数据 |
| `period_column` | `period_column` | `periodColumn` | 期间字段列名 |
| `period_id` | `period_id` | `periodId` | 期间字段ID |
| `period_name` | `period_name` | `periodName` | 期间字段名称 |
| `period_type` | `period_type` | `periodType` | 期间类型 |
| `ref_code` | `ref_code` | `refCode` | 参照编码 |
| `ref_name` | `ref_name` | `refName` | 参照名称 |
| `rule_value` | `rule_value` | `ruleValue` | 规则值 |
| `source` | `source` | `source` | 来源 |
| `source_code` | `source_code` | `sourceCode` | 来源编码 |
| `source_name` | `source_name` | `sourceName` | 来源名称 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `index_audit_id` | `index_audit_id` | `indexAudit` | 指标检查 |
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

### 短整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |
| `rule_type` | `rule_type` | `ruleType` | 规则类型1指标检查2分组维度3数据范围4检查规则5结果数据 |
| `source_type` | `source_type` | `sourceType` | 结果数据来源类型1指标检查2分组维度 |

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

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `param_name` | `param_name` | `paramName` | 字段名称 |
