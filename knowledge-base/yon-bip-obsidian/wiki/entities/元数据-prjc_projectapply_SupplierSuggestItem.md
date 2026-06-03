---
tags: [BIP, 元数据, 数据字典, prjc.projectapply.SupplierSuggestItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 供应商推荐明细 (`prjc.projectapply.SupplierSuggestItem`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`prjc_supplier_suggest_b` | domain：`yonbip-pm-projectme` | 应用：`PRJC` | 业务对象ID：`4a03f6c9-5bfa-45cf-999a-ece9d5154b9d`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商推荐明细 |
| 物理表 | `prjc_supplier_suggest_b` |
| 数据库 schema | `yonbip-pm-projectme` |
| 所属应用 | `PRJC` |
| 直连字段 | 35 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `supplier_suggest_b_define_character` | `` |
| `supplier_suggest_id` | `` |
| `supplier` | `yssupplier.aa_vendor` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `suggest_department` | `ucf-org-center.org_unit_tree_ref` |
| `ytenant_id` | `` |

## 继承接口 (5个, 19字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **业务流多来源** (`iuap.busiObj.BusinessFlowSourcesItf`)
  - `firstbusiobj` → `firstbusiobj`
  - `firstchild_id` → `firstchild_id`
  - `firstcode` → `firstcode`
  - `first_id` → `first_id`
  - `sourcegrand_id` → `sourcegrand_id`
- **业务流基础** (`iuap.busiObj.BusinessFlowItf`)
  - `bizflow_id` → `bizflow_id`
  - `bizflowinstance_id` → `bizflowinstance_id`
  - `bizflow_makebillcode` → `bizflow_makebillcode`
  - `bizflowname` → `bizflowname`
  - `sourcebusiobj` → `sourcebusiobj`
  - `sourcechild_id` → `sourcechild_id`
  - `sourcecode` → `sourcecode`
  - `source_id` → `source_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 35 个直连字段

### 文本字段 (20个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bizflowinstance_id` | `bizflowinstance_id` | `bizFlowInstanceId` | 业务流实例id |
| `bizflow_makebillcode` | `bizflow_makebillcode` | `bizFlowMakeBillCode` | 单据转换规则编码 |
| `bizflow_id` | `bizflow_id` | `bizflowId` | 业务流id |
| `bizflowname` | `bizflowname` | `bizflowName` | 流程名称 |
| `firstbusiobj` | `firstbusiobj` | `firstBusiObj` | 来源业务对象 |
| `firstchild_id` | `firstchild_id` | `firstChildId` | 来源单据子表id |
| `firstcode` | `firstcode` | `firstCode` | 来源单据号 |
| `first_id` | `first_id` | `firstId` | 来源单据主表id |
| `id` | `id` | `id` | 主键 |
| `registered_capital` | `registered_capital` | `registeredCapital` | 注册资本 |
| `registration_status` | `registration_status` | `registrationStatus` | 登记状态 |
| `related_performance` | `related_performance` | `relatedPerformance` | 相关业绩 |
| `sourcebusiobj` | `sourcebusiobj` | `sourceBusiObj` | 上游业务对象 |
| `sourcechild_id` | `sourcechild_id` | `sourceChildId` | 上游单据子表id |
| `sourcecode` | `sourcecode` | `sourceCode` | 上游单据号 |
| `sourcegrand_id` | `sourcegrand_id` | `sourceGrandId` | 来源孙表id |
| `source_id` | `source_id` | `sourceId` | 上游单据主表id |
| `stock_right_structure` | `stock_right_structure` | `stockRightStructure` | 股权结构 |
| `suggest_reason` | `suggest_reason` | `suggestReason` | 推荐理由 |
| `supplier_desc` | `supplier_desc` | `supplierDesc` | 供应商简介 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `suggest_department` | `suggest_department` | `suggestDepartment` | 推荐部门 |
| `supplier` | `supplier` | `supplier` | 供应商 |
| `supplier_suggest_id` | `supplier_suggest_id` | `supplierSuggestId` | 供应商推荐 |
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
| `supplier_suggest_b_define_character` | `supplier_suggest_b_define_character` | `supplierSuggestBDefineCharacter` | 明细特征 |
