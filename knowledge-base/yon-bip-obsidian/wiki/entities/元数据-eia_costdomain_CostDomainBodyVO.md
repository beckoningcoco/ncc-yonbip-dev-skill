---
tags: [BIP, 元数据, 数据字典, eia.costdomain.CostDomainBodyVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 成本域详细信息 (`eia.costdomain.CostDomainBodyVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ia_cost_domain_b` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`9aff1a4e-4fe1-4479-93b1-82803a05801b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 成本域详细信息 |
| 物理表 | `ia_cost_domain_b` |
| 数据库 schema | `yonbip-fi-eia` |
| 所属应用 | `EIA` |
| 直连字段 | 11 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `warehouse_id` | `productcenter.aa_warehouse` |
| `stock_org_id` | `ucf-org-center.org_pure_tree_ref` |
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

### 引用字段 (6个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `header_id` | `header_id` | 0119be07-4d2d-4cfe-89f4-18e7682aed24 | 成本域主表id |
| `creator` | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 创建人 |
| `warehouse_id` | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | 仓库 |
| `stock_org_id` | `stock_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | 库存组织 |
| `modifier` | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 修改人 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

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
