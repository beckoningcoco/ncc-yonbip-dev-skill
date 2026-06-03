---
tags: [BIP, 元数据, 数据字典, bgtm.budgetscheme.BudgetScheme]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 预算编制方案 (`bgtm.budgetscheme.BudgetScheme`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bgtm_budget_scheme` | domain：`yonbip-pm-projectme` | 应用：`BGTM` | 业务对象ID：`7250739b-c9c1-4646-aeb9-0454ea9b31cc`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 预算编制方案 |
| 物理表 | `bgtm_budget_scheme` |
| 数据库 schema | `yonbip-pm-projectme` |
| 所属应用 | `BGTM` |
| 直连字段 | 27 个 |
| 子表 | 3 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `itemsC` | `bgtm.budgetscheme.BudgetDimension` | composition |
| `items` | `bgtm.budgetscheme.BudgetSchemeItem` | composition |
| `itemsB` | `bgtm.budgetscheme.BudgetSchemeMatchRule` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `budget_model_id` | `yonbip-pm-projectme.budget_model_ref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `` | `` |
| `org_id` | `` |

## 继承接口 (5个, 12字段)

- **档案状态** (`iuap.busiObj.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **启用** (`ucfbase.ucfbaseItf.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 27 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `app_code` | `app_code` | `appCode` | 来源应用编码 |
| `break_mny_method` | `break_mny_method` | `breakMnyMethod` | 编制方式 |
| `budget_subject_id` | `budget_subject_id` | `budgetSubjectId` | 预算科目表 |
| `budget_type` | `budget_type` | `budgetType` | 预算类型 |
| `code` | `code` | `code` | 方案编码 |
| `cube_code` | `cube_code` | `cubeCode` | 预算模型编码 |
| `memo` | `memo` | `memo` | 备注 |
| `name` | `name` | `name` | 方案名称 |
| `system_code` | `system_code` | `systemCode` | 来源系统编码 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `budget_model_id` | `budget_model_id` | `budgetModelId` | 预算模型 |
| `org_id` | `org_id` | `orgId` | 业务单元 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `disablets` | `disablets` | `disablets` | 停用时间 |
| `enablets` | `enablets` | `enablets` | 启用时间 |

### 枚举字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `b_enable_sum_mny` | `b_enable_sum_mny` | `enableSumMny` | 启用金额汇总 |
| `benable_estimate_budget` | `benable_estimate_budget` | `enableEstimateBudget` | 启用概算 |
| `enable` | `enable` | `enable` | 档案状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `items` | 预算编制方案明细 |
| `` | `` | `itemsC` | 预算维度 |
| `` | `` | `itemsB` | 项目适配规则 |
