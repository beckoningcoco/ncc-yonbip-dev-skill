---
tags: [BIP, 元数据, 数据字典, eia.costdomain.CostDomainMaterialVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料计价方式子表 (`eia.costdomain.CostDomainMaterialVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ia_cost_domain_m` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`9aff1a4e-4fe1-4479-93b1-82803a05801b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料计价方式子表 |
| 物理表 | `ia_cost_domain_m` |
| 数据库 schema | `yonbip-fi-eia` |
| 所属应用 | `EIA` |
| 直连字段 | 11 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `material_id` | `productcenter.pc_nomalproductref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `header_id` | `yonbip-fi-eia.RefTable_0e6f869743` |
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

> 共 11 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `id` | `id` | String | id |

### 引用字段 (5个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `material_id` | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | 物料ID |
| `header_id` | `header_id` | 0119be07-4d2d-4cfe-89f4-18e7682aed24 | 成本域主表ID |
| `creator` | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 创建人 |
| `modifier` | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 修改人 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_time` | `create_time` | DateTime | 创建时间 |
| `modify_time` | `modify_time` | DateTime | 修改时间 |
| `pubts` | `pubts` | DateTime | pubts |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `pricing_method` | `pricing_method` | fieia_pricingmethod | 计价方式 |

### 短整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `dr` | `dr` | Short | 逻辑删除 |
