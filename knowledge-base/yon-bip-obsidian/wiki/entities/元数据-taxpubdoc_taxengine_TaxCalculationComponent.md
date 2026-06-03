---
tags: [BIP, 元数据, 数据字典, taxpubdoc.taxengine.TaxCalculationComponent]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 计税组件 (`taxpubdoc.taxengine.TaxCalculationComponent`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tax_calculation_component` | domain：`yonbip-fi-taxpubdoc` | 应用：`DPMTAX` | 业务对象ID：`fb302e77-e133-40c3-96b3-6030c4a4db97`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计税组件 |
| 物理表 | `tax_calculation_component` |
| 数据库 schema | `yonbip-fi-taxpubdoc` |
| 所属应用 | `DPMTAX` |
| 直连字段 | 24 个 |
| 子表 | 1 个 |
| 关联引用 | 7 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `TaxCalculationComponentDetailList` | `taxpubdoc.taxengine.TaxCalculationComponentDetail` | composition |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `tax_bureau_id` | `yonbip-fi-taxpubdoc.RefTable_457b0fd24` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `ytenant_id` | `` |
| `tax_item_id` | `yonbip-fi-taxpubdoc.RefTable_182eb8090` |
| `tax_category_id` | `tax.category_archive_ref` |

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

> 共 24 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tax_base_formula_name` | `tax_base_formula_name` | `taxBaseFormulaName` | 税基公式对象名称 |
| `component_code` | `component_code` | `componentCode` | 组件编码 |
| `tax_sub_item` | `tax_sub_item` | `taxSubItem` | 子目 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tax_category_id` | `tax_category_id` | `taxCategoryId` | 税种 |
| `tax_item_id` | `tax_item_id` | `taxItemId` | 税目 |
| `tax_bureau_id` | `tax_bureau_id` | `taxBureauId` | 税制 |
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

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `application_type` | `application_type` | `applicationType` | 类型 |
| `enable` | `enable` | `enable` | 档案状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### bigText (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `formula_name` | `formula_name` | `formulaName` | 公式对象名称 |
| `formula` | `formula` | `formula` | 公式 |
| `formula_json` | `formula_json` | `formulaJson` | 公式文本 |
| `tax_base_formula` | `tax_base_formula` | `taxBaseFormula` | 税基公式 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 组件名称 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `TaxCalculationComponentDetailList` | 计税组件公式变量 |
