---
tags: [BIP, 元数据, 数据字典, ia.auditpoint.IndexAudit]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 指标检查 (`ia.auditpoint.IndexAudit`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ssc_ia_index_audit` | domain：`yonbip-mid-sscia` | 应用：`ZNSH` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 指标检查 |
| 物理表 | `ssc_ia_index_audit` |
| 数据库 schema | `yonbip-mid-sscia` |
| 所属应用 | `ZNSH` |
| 直连字段 | 23 个 |
| 子表 | 3 个 |
| 关联引用 | 7 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `indexAuditRule` | `ia.auditpoint.IndexAuditRule` | composition |
| `indexAuditRuleGroupDimension` | `ia.auditpoint.IndexAuditRule` | composition |
| `indexAuditRuleResult` | `ia.auditpoint.IndexAuditRule` | composition |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `` | `` |
| `audit_point_id` | `` |

## 字段列表（按类型分组）

> 共 23 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ads_table_name` | `ads_table_name` | `adsTableName` | 轻建模表名 |
| `check_rule` | `check_rule` | `checkRule` | 检查规则 |
| `` | `creator` | `creator` | 创建人名称 |
| `id` | `id` | `id` | 主键id |
| `` | `modifier` | `modifier` | 修改人名称 |
| `result_type` | `result_type` | `resultType` | 结果类型 |
| `select_param` | `select_param` | `selectParam` | 查询参数 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_point_id` | `audit_point_id` | `auditPoint` | 规则 |
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

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `indexAuditRule` | 指标检查规则 |
| `` | `` | `indexAuditRuleGroupDimension` | 指标检查规则 |
| `` | `` | `indexAuditRuleResult` | 指标检查规则 |
