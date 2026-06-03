---
tags: [BIP, 元数据, 数据字典, RVN.RVN.rvnCloseSettleCheckItems]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 关结账检查项 (`RVN.RVN.rvnCloseSettleCheckItems`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rvn_check_items` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`bf67aa1f-2062-426f-8ba6-39b0ccce4090`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 关结账检查项 |
| 物理表 | `rvn_check_items` |
| 数据库 schema | `yonbip-fi-ercl` |
| 所属应用 | `RVN` |
| 直连字段 | 16 个 |
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

> 共 16 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `check_type_of_close` | `check_type_of_close` | `checkTypeOfClose` | 关账检查方式(0-不检查;1-不通过则警告;2-不通过则失败) |
| `check_type_of_settle` | `check_type_of_settle` | `checkTypeOfSettle` | 结账检查方式(0-不检查;1-不通过则警告;2-不通过则失败) |
| `item_code` | `item_code` | `itemCode` | 检查项编码 |
| `merge_result` | `merge_result` | `mergeResult` | 是否合并结果(0-否;1-是) |
| `system_type` | `system_type` | `systemType` | 系统标识(1-收入管理) |
| `id` | `id` | `id` | 主键 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_preset` | `bln_preset` | `blnPreset` | 是否预置(0-否;1-是) |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `row_no` | `row_no` | `rowNo` | 行号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `item_name` | `item_name` | `itemName` | 检查项简体名称 |
