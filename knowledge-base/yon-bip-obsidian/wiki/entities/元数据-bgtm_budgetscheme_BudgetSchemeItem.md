---
tags: [BIP, 元数据, 数据字典, bgtm.budgetscheme.BudgetSchemeItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 预算编制方案明细 (`bgtm.budgetscheme.BudgetSchemeItem`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bgtm_budget_scheme_b` | domain：`yonbip-pm-projectme` | 应用：`BGTM` | 业务对象ID：`7250739b-c9c1-4646-aeb9-0454ea9b31cc`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 预算编制方案明细 |
| 物理表 | `bgtm_budget_scheme_b` |
| 数据库 schema | `yonbip-pm-projectme` |
| 所属应用 | `BGTM` |
| 直连字段 | 30 个 |
| 子表 | 0 个 |
| 关联引用 | 18 个 |

## 关联引用 (18个)

| 字段名 | 引用类型 |
|--------|---------|
| `parent_id` | `` |
| `expense_item_id` | `finbd.bd_expenseitemref` |
| `grade_id` | `ucf-staff-center.bd_graderef` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `cost_factor_oid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `product_id` | `productcenter.pc_nomalproductref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `management_class_id` | `productcenter.pc_managementclassref` |
| `ytenant_id` | `` |
| `month_id` | `finbd.bd_period` |
| `year_id` | `finbd.bd_periodyear` |
| `cost_center_id` | `finbd.bd_costcenterref` |
| `subject_item_id` | `yonbip-pm-commonbd.bgdm_budgetsubject_ref` |
| `budget_scheme_id` | `` |
| `wbs_id` | `yonbip-pm-commonbd.RefTable_1906842236` |
| `invest_project_id` | `ucfbasedoc.bd_investprojectref` |
| `expense_item_type_id` | `finbd.bd_expenseitemtyperef` |
| `cost_factor_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |

## 继承接口 (3个, 13字段)

- **树型结构** (`iuap.busiObj.ITree`)
  - `ifend` → `ifend`
  - `level` → `level`
  - `name` → `name`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **树型结构** (`ucfbase.ucfbaseItf.ITree`)
  - `` → ``
  - `level` → `level`
  - `name` → `name`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 30 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `name` | `name` | `name` | 节点标题 |
| `path` | `path` | `path` | 路径 |

### 引用字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cost_factor_vid` | `cost_factor_vid` | `costFactorVid` | 成本要素Vid |
| `budget_scheme_id` | `budget_scheme_id` | `budgetSchemeId` | 主表外键 |
| `parent_id` | `parent_id` | `parent` | 上级分类 |
| `cost_center_id` | `cost_center_id` | `costCenterId` | 成本中心 |
| `cost_factor_oid` | `cost_factor_oid` | `costFactorOid` | 成本要素 |
| `expense_item_id` | `expense_item_id` | `expenseItemId` | 费用项目 |
| `expense_item_type_id` | `expense_item_type_id` | `expenseItemTypeId` | 费用项目类别 |
| `grade_id` | `grade_id` | `gradeId` | 职等 |
| `invest_project_id` | `invest_project_id` | `investProjectId` | 投资项目 |
| `management_class_id` | `management_class_id` | `managementClassId` | 物料分类 |
| `month_id` | `month_id` | `monthId` | 期间(月) |
| `product_id` | `product_id` | `productId` | 物料 |
| `subject_item_id` | `subject_item_id` | `subjectItemId` | 预算科目 |
| `wbs_id` | `wbs_id` | `wbsId` | WBS |
| `year_id` | `year_id` | `yearId` | 期间(年) |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `revenue_expense_type` | `revenue_expense_type` | `revenueExpenseType` | 收支类型 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `level` | `level` | `level` | 层级 |
| `sort_num` | `sort_num` | `sort` | 排序号 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isend` | `isend` | `isEnd` | 是否末级 |
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `standard_unit_price` | `standard_unit_price` | `standardUnitPrice` | 标准单价 |
