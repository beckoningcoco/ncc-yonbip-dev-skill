---
tags: [BIP, 元数据, 数据字典, bgtm.budgetmodel.BudgetModelItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 预算模型明细 (`bgtm.budgetmodel.BudgetModelItem`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bgtm_budget_model_b` | domain：`yonbip-pm-projectme` | 应用：`BGTM` | 业务对象ID：`667ea9df-0a9d-41bf-ac86-78fd2dfa8f57`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 预算模型明细 |
| 物理表 | `bgtm_budget_model_b` |
| domain/服务域 | `yonbip-pm-projectme` |
| schema | `pmcloud` |
| 所属应用 | `BGTM` |
| 直连字段 | 22 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `budget_model_id` | `yonbip-pm-projectme.budget_model_ref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |

## 继承接口 (3个, 6字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 22 个直连字段

### 文本字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name2` | `name2` | `name2` | 维度名称 |
| `name3` | `name3` | `name3` | 维度名称 |
| `name4` | `name4` | `name4` | 维度名称 |
| `name5` | `name5` | `name5` | 维度名称 |
| `name6` | `name6` | `name6` | 维度名称 |
| `name_res_id` | `name_res_id` | `nameResId` | 维度名称多语资源 |
| `bd_ref` | `bd_ref` | `bdRef` | 公共档案参照 |
| `bd_ref_url` | `bd_ref_url` | `bdRefUrl` | 参照URL |
| `character_id` | `character_id` | `characterId` | 特征ID |
| `code` | `code` | `code` | 维度编码 |
| `name` | `name` | `name` | 维度名称 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `budget_model_id` | `budget_model_id` | `budgetModelId` | 主表外键 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `active_flag` | `active_flag` | `activeFlag` | 是否启动维度 |
| `query_condition_flag` | `query_condition_flag` | `queryConditionFlag` | 是否查询条件 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |
