---
tags: [BIP, 元数据, 数据字典, ia.auditpoint.CustomAuditParam]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 请求参数 (`ia.auditpoint.CustomAuditParam`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ssc_ia_custom_audit_param` | domain：`yonbip-mid-sscia` | 应用：`ZNSH` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 请求参数 |
| 物理表 | `ssc_ia_custom_audit_param` |
| domain/服务域 | `yonbip-mid-sscia` |
| schema | `intelligent_audit` |
| 所属应用 | `ZNSH` |
| 直连字段 | 32 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `` | `` |
| `interface_param_register` | `` |
| `custom_audit_id` | `` |

## 字段列表（按类型分组）

> 共 32 个直连字段

### 文本字段 (16个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `child_field` | `child_field` | `childField` | 子表字段 |
| `` | `creator` | `creator` | 创建人名称 |
| `entity_resId` | `entity_resId` | `entityResId` | 实体显示名称多语资源id |
| `field_type` | `field_type` | `fieldType` | 参数类型 |
| `id` | `id` | `id` | 主键id |
| `` | `modifier` | `modifier` | 修改人名称 |
| `param_source` | `param_source` | `paramSource` | 参数来源 |
| `param_source_name` | `param_source_name` | `paramSourceName` | 参数来源 |
| `param_value` | `param_value` | `paramValue` | 常量参数值 |
| `param_value_ref` | `param_value_ref` | `paramValueRef` | 单据字段 |
| `param_value_ref_name` | `param_value_ref_name` | `paramValueRefName` | 单据字段显示名 |
| `param_value_ref_res_id` | `param_value_ref_res_id` | `paramValueRefResId` | 单据字段资源多语 |
| `ref_code` | `ref_code` | `refCode` | 参照编码 |
| `ref_code_ret_field` | `ref_code_ret_field` | `refCodeRetField` | 参照返回字段 |
| `ref_code_ret_field_name` | `ref_code_ret_field_name` | `refCodeRetFieldName` | 参照返回字段名称 |
| `ref_name` | `ref_name` | `refName` | 参照名称 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `custom_audit_id` | `custom_audit_id` | `customAudit` | 自定义检查 |
| `interface_param_register` | `interface_param_register` | `interfaceParamRegister` | 接口参数id |
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
| `ref_source_type` | `ref_source_type` | `refSourceType` | 参照值来源类型 0-常量 1-公共参数 2-自定义参数 |
| `required` | `required` | `required` | 是否必输 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sort` | `sort` | `sort` | 序号 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
