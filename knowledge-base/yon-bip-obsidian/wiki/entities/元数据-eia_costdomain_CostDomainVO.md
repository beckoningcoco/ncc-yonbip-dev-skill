---
tags: [BIP, 元数据, 数据字典, eia.costdomain.CostDomainVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 成本域 (`eia.costdomain.CostDomainVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ia_cost_domain` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`9aff1a4e-4fe1-4479-93b1-82803a05801b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 成本域 |
| 物理表 | `ia_cost_domain` |
| domain/服务域 | `yonbip-fi-eia` |
| schema | `fieia` |
| 所属应用 | `EIA` |
| 直连字段 | 18 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `materials` | `eia.costdomain.CostDomainMaterialVO` | composition |
| `bodies` | `eia.costdomain.CostDomainBodyVO` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `accpurpose_id` | `finbd.bd_accpurposeref` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref_inner` |

## 继承接口 (4个, 7字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 18 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `src_id` | `src_id` | String | 来源主键id |
| `code` | `code` | String | 编码 |
| `id` | `id` | String | id |

### 引用字段 (6个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `accpurpose_id` | `accpurpose_id` | 637f4637-0862-4167-a2bf-ef52818ca9d9 | 核算目的 |
| `accentity_id` | `accentity_id` | e33ec72a-3857-4167-89e2-a437168ed3bb | 会计主体 |
| `accbook_id` | `accbook_id` | 5df8e763-5595-4a87-9ff9-a7ac3bd1e81e | 账簿 |
| `creator` | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 创建人 |
| `modifier` | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 修改人 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_time` | `create_time` | DateTime | 创建时间 |
| `modify_time` | `modify_time` | DateTime | 修改时间 |
| `pubts` | `pubts` | DateTime | pubts |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `pricing_method` | `pricing_method` | fieia_pricingmethod | 计价方式 |
| `level` | `level` | fieia_costdomaincreatemethod | 成本域层级 |

### 短整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `dr` | `dr` | Short | 逻辑删除 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `name` | `name` | String | 名称 |

### other (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `` | a1f8140c-c815-4cc0-b7c5-1a9344d50414 | 成本域详细信息 |
| `` | `` | 22cd164a-dc0d-4210-a384-fcc5c9c0033a | 物料计价方式子表 |
