---
tags: [BIP, 元数据, 数据字典, ia.auditpoint.RepeatAudit]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 重复事件检查 (`ia.auditpoint.RepeatAudit`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ssc_ia_repeat_audit` | domain：`yonbip-mid-sscia` | 应用：`ZNSH` | 业务对象ID：`270e1c91-eae8-4fd8-98ed-79479da6b61d`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 重复事件检查 |
| 物理表 | `ssc_ia_repeat_audit` |
| 数据库 schema | `yonbip-mid-sscia` |
| 所属应用 | `ZNSH` |
| 直连字段 | 32 个 |
| 子表 | 1 个 |
| 关联引用 | 7 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `repeatAuditAuxInfos` | `ia.auditpoint.RepeatAuditAuxInfo` | composition |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `` | `` |
| `source_trans_type_id` | `` |
| `source_bill_type_id` | `` |
| `audit_point_id` | `` |

## 字段列表（按类型分组）

> 共 32 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `rule` | `rule` | `rule` | 规则配置 |
| `time_field` | `time_field` | `timeField` | 字段名 |
| `field_display_name` | `field_display_name` | `fieldDisplayName` | 日期类型 |
| `trans_type_range` | `trans_type_range` | `transTypeRange` | 数据范围id |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `field_resId` | `field_resId` | `fieldResId` | 时间字段显示名称多语资源id |
| `fixed_date_condition` | `fixed_date_condition` | `fixedDateCondition` | 固定条件 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人id |
| `audit_point_id` | `audit_point_id` | `auditPoint` | 规则 |
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
| `data_condition` | `data_condition` | `dateCondition` | 日期范围条件 |
| `preset_tag` | `preset_tag` | `presetTag` | 预置标记 |

### 短整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `time_scope` | `time_scope` | `timeScope` | 校验时间范围 |
| `time_type` | `time_type` | `timeType` | 校验时间类型 |
| `dr` | `dr` | `dr` | 逻辑删除标记 |
| `effective` | `effective` | `effective` | 是否有效 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `version` | `version` | `version` | 版本号 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `un_repeat_message` | `un_repeat_message` | `unRepeatMessage` | 通过话术 |
| `repeat_message` | `repeat_message` | `repeatMessage` | 不通过话术 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `repeatAuditAuxInfos` | 重复事件检查辅助信息 |
