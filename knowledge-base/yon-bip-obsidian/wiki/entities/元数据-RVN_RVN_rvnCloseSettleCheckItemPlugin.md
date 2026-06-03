---
tags: [BIP, 元数据, 数据字典, RVN.RVN.rvnCloseSettleCheckItemPlugin]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 关结账检查项插件 (`RVN.RVN.rvnCloseSettleCheckItemPlugin`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rvn_check_register_plugin` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`d509c88b-7400-4266-be0c-142fcb7de404`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 关结账检查项插件 |
| 物理表 | `rvn_check_register_plugin` |
| 数据库 schema | `yonbip-fi-ercl` |
| 所属应用 | `RVN` |
| 直连字段 | 15 个 |
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

> 共 15 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `check_item_id` | `check_item_id` | `checkItemId` | 检查项外键 |
| `interface_type` | `interface_type` | `interfaceType` | 接口类型(rpc) |
| `interface_url` | `interface_url` | `interfaceUrl` | 接口地址(rpc) |
| `item_code` | `item_code` | `itemCode` | 检查项编码 |
| `used_type` | `used_type` | `usedType` | 用于(0-关账;1-结账;2-关结账) |
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
