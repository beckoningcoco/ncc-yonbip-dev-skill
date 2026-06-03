---
tags: [BIP, 元数据, 数据字典, ia.auditpoint.BusinessObjectAudit]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 业务对象检查 (`ia.auditpoint.BusinessObjectAudit`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ssc_ia_bo_audit` | domain：`yonbip-mid-sscia` | 应用：`ZNSH` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 业务对象检查 |
| 物理表 | `ssc_ia_bo_audit` |
| 数据库 schema | `yonbip-mid-sscia` |
| 所属应用 | `ZNSH` |
| 直连字段 | 26 个 |
| 子表 | 3 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `boAuditGroupFields` | `ia.auditpoint.BOAuditGroupField` | composition |
| `boAuditFieldDeals` | `ia.auditpoint.BOAuditFieldDeal` | composition |
| `boAuditExceptionDetailsFields` | `ia.auditpoint.BOAuditExceptionDetailsField` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `voucher_relation_id` | `` |
| `` | `` |
| `audit_point_id` | `` |

## 字段列表（按类型分组）

> 共 26 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `check_rule` | `check_rule` | `checkRule` | 统计字段检查规则 |
| `` | `creator` | `creator` | 创建人名称 |
| `id` | `id` | `id` | 主键id |
| `` | `modifier` | `modifier` | 修改人名称 |
| `object_check_rule` | `object_check_rule` | `objectCheckRule` | 对象检查规则 |
| `result_type` | `result_type` | `resultType` | 结果类型 |
| `select_param` | `select_param` | `selectParam` | 查询参数 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_point_id` | `audit_point_id` | `auditPoint` | 规则 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `voucher_relation_id` | `voucher_relation_id` | `voucherRelation` | 单据关系 |
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

### 短整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `check_scope` | `check_scope` | `checkScope` | 检查范围(0当前业务对象 1关联业务对象) |
| `dr` | `dr` | `dr` | 逻辑删除标记 |
| `effective` | `effective` | `effective` | 是否有效 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `boAuditExceptionDetailsFields` | 异常明细字段 |
| `` | `` | `boAuditFieldDeals` | 字段处理 |
| `` | `` | `boAuditGroupFields` | 设置分组字段 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
