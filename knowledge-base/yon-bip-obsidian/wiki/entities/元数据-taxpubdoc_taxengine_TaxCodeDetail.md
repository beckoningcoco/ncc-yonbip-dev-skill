---
tags: [BIP, 元数据, 数据字典, taxpubdoc.taxengine.TaxCodeDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 税码明细 (`taxpubdoc.taxengine.TaxCodeDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tax_code_b` | domain：`yonbip-fi-taxpubdoc` | 应用：`DPMTAX` | 业务对象ID：`c7f07235-05d9-4146-b7f4-75a995c45edc`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 税码明细 |
| 物理表 | `tax_code_b` |
| 数据库 schema | `yonbip-fi-taxpubdoc` |
| 所属应用 | `DPMTAX` |
| 直连字段 | 19 个 |
| 子表 | 1 个 |
| 关联引用 | 10 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `TaxCodeVariableList` | `taxpubdoc.taxengine.TaxCodeVariable` | composition |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `calculation_component_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `tax_bureau_id` | `yonbip-fi-taxpubdoc.RefTable_457b0fd24` |
| `deduction_type` | `yonbip-fi-taxpubdoc.RefTable_948d15e041` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `tax_code_id` | `` |
| `tax_item_id` | `yonbip-fi-taxpubdoc.RefTable_182eb8090` |
| `tax_category_id` | `` |

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

> 共 19 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 计税步骤编码 |
| `tax_sub_item` | `tax_sub_item` | `taxSubItem` | 子目 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `calculation_component_id` | `calculation_component_id` | `calculationComponentId` | 计税组件 |
| `tax_bureau_id` | `tax_bureau_id` | `taxBureauId` | 税制 |
| `tax_category_id` | `tax_category_id` | `taxCategoryId` | 税种 |
| `tax_code_id` | `tax_code_id` | `taxCodeId` | 税码 |
| `tax_item_id` | `tax_item_id` | `taxItemId` | 税目 |
| `deduction_type` | `deduction_type` | `deductionType` | 抵扣类型 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `order` | `order` | `order` | 执行顺序 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### bigText (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `formula` | `formula` | `formula` | 公式 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `TaxCodeVariableList` | 税码计税组件变量 |
