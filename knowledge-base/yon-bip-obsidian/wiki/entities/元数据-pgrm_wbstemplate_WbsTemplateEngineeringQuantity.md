---
tags: [BIP, 元数据, 数据字典, pgrm.wbstemplate.WbsTemplateEngineeringQuantity]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 工程量指标模板 (`pgrm.wbstemplate.WbsTemplateEngineeringQuantity`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pgrm_template_engineering_quantity` | domain：`yonbip-pm-projectme` | 应用：`PGRM` | 业务对象ID：`5b1fe33b-f5ca-4a2f-96c1-94bf2d130a37`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工程量指标模板 |
| 物理表 | `pgrm_template_engineering_quantity` |
| domain/服务域 | `yonbip-pm-projectme` |
| schema | `pmcloud` |
| 所属应用 | `PGRM` |
| 直连字段 | 15 个 |
| 子表 | 1 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `WbsTemplateEngineeringQuantityItemList` | `pgrm.wbstemplate.WbsTemplateEngineeringQuantityItem` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `compiler_id` | `ucf-staff-center.bd_staff_all_ref` |
| `wbs_template_item_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `compiler_department_id` | `ucf-org-center.org_unit_tree_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `metric_template_id` | `yonbip-pm-projectme.pgrm_engineering_quantity_template_ref` |
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

> 共 15 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `remark` | `remark` | `remark` | 备注 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `compiler_department_id` | `compiler_department_id` | `compilerDepartmentId` | 编制部门 |
| `compiler_id` | `compiler_id` | `compilerId` | 编制人 |
| `creator` | `creator` | `creator` | 创建人 |
| `metric_template_id` | `metric_template_id` | `metricTemplateId` | 指标模板 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `wbs_template_item_id` | `wbs_template_item_id` | `wbsTemplateItemId` | WBS模板明细 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `compile_date` | `compile_date` | `compileDate` | 编制日期 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `WbsTemplateEngineeringQuantityItemList` | 工程量指标模板明细 |
