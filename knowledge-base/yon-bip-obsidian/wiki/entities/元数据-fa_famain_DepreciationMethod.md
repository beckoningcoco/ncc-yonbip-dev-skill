---
tags: [BIP, 元数据, 数据字典, fa.famain.DepreciationMethod]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 折旧方法 (`fa.famain.DepreciationMethod`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_depr_method` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`af4d5089-0327-44a1-aac6-cf11334e206c`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 折旧方法 |
| 物理表 | `fa_depr_method` |
| 数据库 schema | `yonbip-fi-efa` |
| 所属应用 | `EFA` |
| 直连字段 | 26 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `depr_method_type_id` | `` |

## 继承接口 (4个, 9字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **档案状态** (`iuap.busiObj.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`

## 字段列表（按类型分组）

> 共 26 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `depr_method_path` | `depr_method_path` | `deprMethodPath` | 折旧方法类全路径 |
| `real_month_depr_amount_formula` | `real_month_depr_amount_formula` | `realMonthDeprAmountFormula` | 自定义折旧额公式 |
| `real_month_depr_rate_formula` | `real_month_depr_rate_formula` | `realMonthDeprRateFormula` | 自定义折旧率公式 |
| `update_month_depr_amount` | `update_month_depr_amount` | `updateMonthDeprAmount` | 修改月折旧额公式 |
| `update_month_depr_rate` | `update_month_depr_rate` | `updateMonthDeprRate` | 修改月折旧率公式 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `depr_method_type_id` | `depr_method_type_id` | `methodTypeId` | 方法类型 |
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

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_depr` | `bln_depr` | `isDepreciation` | 是否折旧 |
| `bln_preset` | `bln_preset` | `isPreset` | 是否为预置数据 |
| `residual_amortization` | `residual_amortization` | `residualAmortization` | 剩余摊销 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable` | `enable` | `enable` | 档案状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `calc_base_value` | `calc_base_value` | `calcBaseValueId` | 折旧基值 |

### multiLanguage (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `description` | `description` | `description` | 描述 |
| `month_depr_amount_formula` | `month_depr_amount_formula` | `monthDeprAmountFormula` | 折旧额公式 |
| `month_depr_rate_formula` | `month_depr_rate_formula` | `monthDeprRateFormula` | 折旧率公式 |
| `name` | `name` | `name` | 名称 |
