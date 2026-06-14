---
tags: [BIP, 元数据, 数据字典, ia.interfaceregister.InterfaceParamRegister]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 接口入参 (`ia.interfaceregister.InterfaceParamRegister`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ssc_ia_interface_param_register` | domain：`yonbip-mid-sscia` | 应用：`ZNSH` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 接口入参 |
| 物理表 | `ssc_ia_interface_param_register` |
| domain/服务域 | `yonbip-mid-sscia` |
| schema | `intelligent_audit` |
| 所属应用 | `ZNSH` |
| 直连字段 | 29 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `interface_register_id` | `` |
| `` | `` |

## 字段列表（按类型分组）

> 共 29 个直连字段

### 文本字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 接口编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `example_value` | `example_value` | `exampleValue` | 参数示例 |
| `field_name` | `field_name` | `fieldName` | 参数名称 |
| `field_name_resId` | `field_name_resId` | `fieldNameResId` | 字段名多语资源 |
| `field_type` | `field_type` | `fieldType` | 参数类型 |
| `id` | `id` | `id` | 主键id |
| `` | `modifier` | `modifier` | 修改人名称 |
| `operator` | `operator` | `operator` | 参数比较符 |
| `ref_code` | `ref_code` | `refCode` | 引用参照 |
| `ref_code_ret_field` | `ref_code_ret_field` | `refCodeRetField` | 参照返回字段 |
| `ref_code_ret_field_name` | `ref_code_ret_field_name` | `refCodeRetFieldName` | 参照返回字段名称 |
| `ref_name` | `ref_name` | `refName` | 参照名称 |
| `remark` | `remark` | `remark` | 参数说明 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `interface_register_id` | `interface_register_id` | `interfaceRegister` | 接口id |
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

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `field_display_name` | `field_display_name` | `fieldDisplayName` | 参数显示名称 |
