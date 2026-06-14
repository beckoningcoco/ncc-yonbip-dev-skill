---
tags: [BIP, 元数据, 数据字典, ia.auditpoint.AuditPointParam]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 规则参数设置 (`ia.auditpoint.AuditPointParam`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ssc_ia_audit_point_param` | domain：`yonbip-mid-sscia` | 应用：`ZNSH` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 规则参数设置 |
| 物理表 | `ssc_ia_audit_point_param` |
| domain/服务域 | `yonbip-mid-sscia` |
| schema | `intelligent_audit` |
| 所属应用 | `ZNSH` |
| 直连字段 | 37 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `` | `` |
| `audit_point_id` | `` |

## 字段列表（按类型分组）

> 共 37 个直连字段

### 文本字段 (20个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人名称 |
| `data_source` | `data_source` | `dataSource` | 页面参数来源secType语义模型参数secCondParam条件参数secRuleParam统计字段检查规则参数secObjectRuleParam对象检查规则参数 |
| `enum_array` | `enum_array` | `enumArray` | 枚举信息 |
| `id` | `id` | `id` | 主键id |
| `` | `modifier` | `modifier` | 修改人名称 |
| `operator` | `operator` | `operator` | 比较符 |
| `param_code` | `param_code` | `paramCode` | 参数编码 |
| `param_resId` | `param_resId` | `paramResId` | 参数名称多语 |
| `param_source` | `param_source` | `paramSource` | 参数来源,常量constValue,业务对象metaField,公共参数pageStatus,自定义参数terminalType |
| `param_type` | `param_type` | `paramType` | 参数类型 |
| `param_type_code` | `param_type_code` | `paramTypeCode` | 参数类型编码 |
| `param_type_resId` | `param_type_resId` | `paramTypeResId` | 参数类型多语 |
| `param_uri` | `param_uri` | `paramUri` | 参数实体URI |
| `ref_code` | `ref_code` | `refCode` | 参照编码 |
| `ref_name` | `ref_name` | `refName` | 参照名称 |
| `ref_name_resId` | `ref_name_resId` | `refNameResId` | 参照名称多语 |
| `ref_ret_field` | `ref_ret_field` | `refRetField` | 参照返回字段 |
| `ref_ret_field_name` | `ref_ret_field_name` | `refRetFieldName` | 参照返回字段名称 |
| `ref_ret_field_name_resId` | `ref_ret_field_name_resId` | `refRetFieldNameResId` | 参照返回字段名称多语 |
| `relation_obj` | `relation_obj` | `relationObj` | 关联对象ID,如：业务对象检查ID,语义模型检查规则ID等等 |

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

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `required` | `required` | `required` | 是否必输 |
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 短整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |
| `field_order` | `field_order` | `fieldOrder` | 字段顺序 |
| `page_order` | `page_order` | `pageOrder` | 页面顺序 |
| `param_scene` | `param_scene` | `paramScene` | 参数应用场景1业务对象2语义模型3指标 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `param_name` | `param_name` | `paramName` | 参数名称 |
