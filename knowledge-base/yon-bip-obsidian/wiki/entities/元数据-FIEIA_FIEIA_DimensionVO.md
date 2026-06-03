---
tags: [BIP, 元数据, 数据字典, FIEIA.FIEIA.DimensionVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 存货基础维度 (`FIEIA.FIEIA.DimensionVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ia_ledger_b_x_account` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`de7e28d9-cc9b-446b-a45a-764bb5a65bd1`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 存货基础维度 |
| 物理表 | `ia_ledger_b_x_account` |
| 数据库 schema | `yonbip-fi-eia` |
| 所属应用 | `EIA` |
| 直连字段 | 17 个 |
| 子表 | 0 个 |
| 关联引用 | 10 个 |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `period_id` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `cost_domain_id` | `yonbip-fi-eia.RefTable_0e6f869743` |
| `accpurpose_id` | `finbd.bd_accpurposeref` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `inventory_obj_id` | `` |
| `ytenant_id` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref_inner` |
| `acc_year_id` | `finbd.bd_periodyear` |

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

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年编码 |
| `period_code` | `period_code` | `periodCode` |  记账会计期间 |

### 引用字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `cost_domain_id` | `cost_domain_id` | `costDomainId` | 成本域(租户) |
| `accpurpose_id` | `accpurpose_id` | `accpurpose` | 核算目的 |
| `accbook_id` | `accbook_id` | `accbook` | 核算账簿 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `inventory_obj_id` | `inventory_obj_id` | `inventoryObjId` | 存货对象 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `acc_year_id` | `acc_year_id` | `accYearId` | 会计年ID |
| `period_id` | `period_id` | `period` | 记账会计期间id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `pubts` | `pubts` | `pubts` | pubts |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |
