---
tags: [BIP, 元数据, 数据字典, eia.inventoryobj.SkuVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 存货sku表 (`eia.inventoryobj.SkuVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ia_sku` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`4ded7e67-e089-4d56-aab6-08694c7291bf`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 存货sku表 |
| 物理表 | `ia_sku` |
| 数据库 schema | `yonbip-fi-eia` |
| 所属应用 | `EIA` |
| 直连字段 | 19 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `material_id` | `productcenter.pc_nomalproductref` |

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

> 共 19 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `id` | `id` | String | id |
| `free10` | `free10` | String | 规格10 |
| `free2` | `free2` | String | 规格2 |
| `free3` | `free3` | String | 规格3 |
| `free1` | `free1` | String | 规格1 |
| `free6` | `free6` | String | 规格6 |
| `free7` | `free7` | String | 规格7 |
| `free4` | `free4` | String | 规格4 |
| `free5` | `free5` | String | 规格5 |
| `free8` | `free8` | String | 规格8 |
| `free9` | `free9` | String | 规格9 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `creator` | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 创建人 |
| `modifier` | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 修改人 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |
| `material_id` | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | 物料ID |

### 日期时间 (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `modify_time` | `modify_time` | DateTime | 修改时间 |
| `create_time` | `create_time` | DateTime | 创建时间 |
| `pubts` | `pubts` | DateTime | pubts |

### 短整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `dr` | `dr` | Short | 逻辑删除 |
