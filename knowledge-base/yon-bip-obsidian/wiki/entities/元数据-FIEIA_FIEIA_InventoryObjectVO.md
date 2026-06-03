---
tags: [BIP, 元数据, 数据字典, FIEIA.FIEIA.InventoryObjectVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 存货对象 (`FIEIA.FIEIA.InventoryObjectVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ia_inventoryobj` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`727f84e1-e9a2-4205-aae7-772ad533a1bf`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 存货对象 |
| 物理表 | `ia_inventoryobj` |
| 数据库 schema | `yonbip-fi-eia` |
| 所属应用 | `EIA` |
| 直连字段 | 19 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `activity_id` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ia_sku_id` | `` |
| `wbs_id` | `` |
| `ytenant_id` | `` |
| `material_id` | `productcenter.pc_nomalproductref` |
| `mat_ch_id` | `` |

## 继承接口 (4个, 8字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 19 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `id` | `id` | String | id |
| `batch_code` | `batch_code` | String | 批次号 |
| `mat_ch_id_sensitive_uid` | `mat_ch_id_sensitive_uid` | String | 成本敏感唯一性id |
| `mto_id` | `mto_id` | String | MTO订单id |
| `mto_no` | `mto_no` | String | MTO订单号 |
| `mto_row_id` | `mto_row_id` | String | MTO订单行id |

### 引用字段 (7个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `creator` | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 创建人 |
| `modifier` | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 修改人 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |
| `material_id` | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | 物料ID |
| `ia_sku_id` | `ia_sku_id` | 77f31ce0-b6b5-4cf9-bff3-7be9946ccbaa | 存货sku |
| `activity_id` | `activity_id` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 | 活动 |
| `wbs_id` | `wbs_id` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 | WBS |

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

### 数值字段 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `mto_row_no` | `mto_row_no` | Decimal | MTO订单行号 |

### FreeCT (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `mat_ch_id` | `mat_ch_id` | a5007efa-db93-49a5-928d-2b01dcef72bc | 物料自由项特征组 |
