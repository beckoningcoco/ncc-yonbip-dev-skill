---
tags: [BIP, 元数据, 数据字典, bgtm.budgetscheme.BudgetSchemeMatchRule]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 项目适配规则 (`bgtm.budgetscheme.BudgetSchemeMatchRule`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bgtm_budget_scheme_match_rule` | domain：`yonbip-pm-projectme` | 应用：`BGTM` | 业务对象ID：`7250739b-c9c1-4646-aeb9-0454ea9b31cc`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 项目适配规则 |
| 物理表 | `bgtm_budget_scheme_match_rule` |
| domain/服务域 | `yonbip-pm-projectme` |
| schema | `pmcloud` |
| 所属应用 | `BGTM` |
| 直连字段 | 11 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `budget_scheme_id` | `` |
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

> 共 11 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `attribute_val` | `attribute_val` | `attributeVal` | 属性值 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `budget_scheme_id` | `budget_scheme_id` | `budgetSchemeId` | 主表外键 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `attribute_type` | `attribute_type` | `attributeType` | 属性类型 |
| `dr` | `dr` | `dr` | 逻辑删除 |
