---
tags: [BIP, 元数据, 数据字典, EIA.EIA.DepreciationRateChild]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 计提比率Child (`EIA.EIA.DepreciationRateChild`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ia_depreciation_rate_b` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`8d76ab92-c6c4-4aa6-8d58-1635fbf20704`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计提比率Child |
| 物理表 | `ia_depreciation_rate_b` |
| domain/服务域 | `yonbip-fi-eia` |
| schema | `fieia` |
| 所属应用 | `EIA` |
| 直连字段 | 21 个 |
| 子表 | 1 个 |
| 关联引用 | 13 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `grands` | `EIA.EIA.DepreciationRateChildItem` | composition |

## 关联引用 (13个)

| 字段名 | 引用类型 |
|--------|---------|
| `material_cost_id` | `productcenter.pc_costclassref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `material_class_id` | `productcenter.pc_managementclassref` |
| `stock_org_id` | `ucf-org-center.org_pure_tree_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `material_id` | `productcenter.baseProductRef` |
| `warehouse_id` | `productcenter.aa_warehouse` |
| `mat_ch_id` | `` |
| `` | `` |
| `wbs_id` | `yonbip-pm-commonbd.wbs_doc_ref` |
| `header_id` | `` |
| `project_id` | `ucfbasedoc.bd_projectNewRef` |

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

> 共 21 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `batch_code` | `batch_code` | `batchCode` | 批次号 |
| `mto` | `mto` | `mto` | MTO信息 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stock_org_id` | `stock_org_id` | `stockOrg` | 库存组织 |
| `warehouse_id` | `warehouse_id` | `warehouse` | 仓库 |
| `material_class_id` | `material_class_id` | `materialClassId` | 物料分类 |
| `material_cost_id` | `material_cost_id` | `materialCostId` | 成本分类 |
| `material_id` | `material_id` | `materialId` | 物料 |
| `project_id` | `project_id` | `projectId` | 项目 |
| `wbs_id` | `wbs_id` | `wbsId` | 核算WBS |
| `header_id` | `header_id` | `header` | 外键 |
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
| `row_no` | `row_no` | `rowNo` | 行号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### FreeCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mat_ch_id` | `mat_ch_id` | `matChId` | 物料自由项特征组 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `grands` | 计提比率Item |
