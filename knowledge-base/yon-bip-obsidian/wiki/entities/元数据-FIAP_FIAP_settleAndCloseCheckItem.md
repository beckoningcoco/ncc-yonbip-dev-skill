---
tags: [BIP, 元数据, 数据字典, FIAP.FIAP.settleAndCloseCheckItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 收付关结账检查项目 (`FIAP.FIAP.settleAndCloseCheckItem`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_period_check_items` | domain：`yonbip-fi-earap` | 应用：`EAP` | 业务对象ID：`3cebc0c1-ea06-439e-9bbc-dcf06b9c7890`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 收付关结账检查项目 |
| 物理表 | `arap_period_check_items` |
| 数据库 schema | `yonbip-fi-earap` |
| 所属应用 | `EAP` |
| 直连字段 | 17 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
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

> 共 17 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `check_type_of_close` | `check_type_of_close` | `checkTypeOfClose` | 关账检查方式 |
| `check_type_of_settle` | `check_type_of_settle` | `checkTypeOfSettle` | 结账检查方式 |
| `class_name` | `class_name` | `className` | 类名 |
| `id` | `id` | `id` | 主键 |
| `item_code` | `item_code` | `itemCode` | 检查项编码 |
| `item_name` | `item_name` | `itemName` | 检查项名称 |
| `item_name_resid` | `item_name_resid` | `itemNameResid` | 检查项名称的资源ID |
| `system_type` | `system_type` | `systemType` | 系统标识 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_preset` | `bln_preset` | `blnPreset` | 是否预置 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `row_no` | `row_no` | `rowNo` | 行号 |
