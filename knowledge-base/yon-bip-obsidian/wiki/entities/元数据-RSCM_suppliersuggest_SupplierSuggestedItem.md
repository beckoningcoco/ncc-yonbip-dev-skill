---
tags: [BIP, 元数据, 数据字典, RSCM.suppliersuggest.SupplierSuggestedItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物资推荐供应商明细 (`RSCM.suppliersuggest.SupplierSuggestedItem`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rscm_supplier_suggested_item` | domain：`yonbip-pm-projectme` | 应用：`RSCM` | 业务对象ID：`41780538-4854-435c-880d-3edac76e4c22`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物资推荐供应商明细 |
| 物理表 | `rscm_supplier_suggested_item` |
| 数据库 schema | `yonbip-pm-projectme` |
| 所属应用 | `RSCM` |
| 直连字段 | 22 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `SupplierSuggested_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `item_define_characteristic` | `` |
| `supplier` | `yssupplier.aa_vendor` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `suggest_department` | `ucf-org-center.org_unit_tree_ref` |
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

> 共 22 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `registered_capital` | `registered_capital` | `registeredCapital` | 注册资本 |
| `registration_status` | `registration_status` | `registrationStatus` | 登记状态 |
| `related_performance` | `related_performance` | `relatedPerformance` | 相关业绩 |
| `stock_right_structure` | `stock_right_structure` | `stockRightStructure` | 股权结构 |
| `suggest_reason` | `suggest_reason` | `suggestReason` | 推荐理由 |
| `supplier_desc` | `supplier_desc` | `supplierDesc` | 供应商简介 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `SupplierSuggested_id` | `SupplierSuggested_id` | `SupplierSuggested_id` | 物资推荐供应商 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `suggest_department` | `suggest_department` | `suggestDepartment` | 推荐部门 |
| `supplier` | `supplier` | `supplier` | 供应商 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `association_flag` | `association_flag` | `associationFlag` | 是否关联 |
| `dishonesty_flag` | `dishonesty_flag` | `dishonestyFlag` | 是否失信 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `insured_number` | `insured_number` | `insuredNumber` | 参保人数 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `paid_capital` | `paid_capital` | `paidCapital` | 实缴资本 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `item_define_characteristic` | `item_define_characteristic` | `itemDefineCharacteristic` | 推荐供应商明细特征 |
