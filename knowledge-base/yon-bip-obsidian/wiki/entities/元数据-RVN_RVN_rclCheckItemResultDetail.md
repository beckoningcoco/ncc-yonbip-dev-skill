---
tags: [BIP, 元数据, 数据字典, RVN.RVN.rclCheckItemResultDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 月结检查项结果记录子表 (`RVN.RVN.rclCheckItemResultDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcl_check_item_result_detail` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`ae231299-b7df-4ace-9a2f-090217babd7b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 月结检查项结果记录子表 |
| 物理表 | `rcl_check_item_result_detail` |
| domain/服务域 | `yonbip-fi-ercl` |
| schema | `fiercl` |
| 所属应用 | `RVN` |
| 直连字段 | 35 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `rclCheckItemResult_id` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |

## 继承接口 (3个, 6字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 35 个直连字段

### 文本字段 (27个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_id` | `bill_id` | `billId` | 单据ID |
| `bill_name` | `bill_name` | `billName` | 单据名称 |
| `bill_no` | `bill_no` | `billNo` | 单据编号 |
| `bill_type` | `bill_type` | `billType` | 单据类型 |
| `id` | `id` | `id` | 主键 |
| `name` | `name` | `name` | 名称 |
| `service_code` | `service_code` | `serviceCode` | 服务编码 |
| `value1` | `value1` | `value1` | 值1 |
| `value10` | `value10` | `value10` | 值10 |
| `value11` | `value11` | `value11` | 值11 |
| `value12` | `value12` | `value12` | 值12 |
| `value13` | `value13` | `value13` | 值13 |
| `value14` | `value14` | `value14` | 值14 |
| `value15` | `value15` | `value15` | 值15 |
| `value16` | `value16` | `value16` | 值16 |
| `value17` | `value17` | `value17` | 值17 |
| `value18` | `value18` | `value18` | 值18 |
| `value19` | `value19` | `value19` | 值19 |
| `value2` | `value2` | `value2` | 值2 |
| `value20` | `value20` | `value20` | 值20 |
| `value3` | `value3` | `value3` | 值3 |
| `value4` | `value4` | `value4` | 值4 |
| `value5` | `value5` | `value5` | 值5 |
| `value6` | `value6` | `value6` | 值6 |
| `value7` | `value7` | `value7` | 值7 |
| `value8` | `value8` | `value8` | 值8 |
| `value9` | `value9` | `value9` | 值9 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `rclCheckItemResult_id` | `rclCheckItemResult_id` | `rclCheckItemResult_id` | 月结检查项结果记录 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |
