---
tags: [BIP, 元数据, 数据字典, EAR.EAR.BadDebtProvRatioBody]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 坏账计提比率明细 (`EAR.EAR.BadDebtProvRatioBody`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_baddebt_ratio_b` | domain：`yonbip-fi-earap` | 应用：`EAR` | 业务对象ID：`c4aa6bb0-8c83-436e-9d91-f076a942d2b4`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 坏账计提比率明细 |
| 物理表 | `arap_baddebt_ratio_b` |
| 数据库 schema | `yonbip-fi-earap` |
| 所属应用 | `EAR` |
| 直连字段 | 29 个 |
| 子表 | 1 个 |
| 关联引用 | 20 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `grandsonItem` | `EAR.EAR.BadDebtProvRatioGrandson` | composition |

## 关联引用 (20个)

| 字段名 | 引用类型 |
|--------|---------|
| `expense_item_id` | `finbd.bd_expenseitemref` |
| `ori_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `pro_center_id` | `finbd.bd_allaccbodyref_inner` |
| `cost_center_id` | `finbd.bd_costcenterref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |
| `staff_id` | `ucf-staff-center.bd_staff_all_ref` |
| `dept_id` | `ucf-org-center.orgcenter_admin_tree_ref` |
| `ytenant_id` | `` |
| `ar_subject_id` | `fiepub.fiepub_accsubjectref` |
| `customer_level_id` | `productcenter.aa_customerlevelref` |
| `header_id` | `` |
| `` | `` |
| `ar_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `customer_type_id` | `transtype.bd_billtyperef` |
| `customer_class_id` | `productcenter.aa_custcategoryref` |
| `acc_age_id` | `fiepub.fiepub_accountageref` |
| `bus_type_id` | `transtype.bd_billtyperef` |
| `customer_id` | `productcenter.aa_invoicemerchantref` |

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

> 共 29 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |

### 引用字段 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_age_id` | `acc_age_id` | `accAge` | 账龄方案 |
| `ar_subject_id` | `ar_subject_id` | `arSubject` | 应收账款科目 |
| `ar_subject_vid` | `ar_subject_vid` | `arSubjectVid` | 应收账款科目版本 |
| `bus_type_id` | `bus_type_id` | `busType` | 交易类型 |
| `cost_center_id` | `cost_center_id` | `costCenter` | 成本中心 |
| `creator` | `creator` | `creator` | 创建人 |
| `customer_id` | `customer_id` | `customer` | 客户 |
| `customer_class_id` | `customer_class_id` | `customerClass` | 客户分类 |
| `customer_level_id` | `customer_level_id` | `customerLevel` | 客户级别 |
| `customer_type_id` | `customer_type_id` | `customerType` | 客户类型 |
| `dept_id` | `dept_id` | `dept` | 部门 |
| `expense_item_id` | `expense_item_id` | `expenseItem` | 费用项目 |
| `header_id` | `header_id` | `headerId` | 坏账计提比率 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ori_currency_id` | `ori_currency_id` | `oriCurrency` | 币种 |
| `pro_center_id` | `pro_center_id` | `proCenter` | 利润中心 |
| `project_id` | `project_id` | `project` | 项目 |
| `staff_id` | `staff_id` | `staff` | 业务员 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `customer_internal_org` | `customer_internal_org` | `customerInternalOrg` | 客户是否内部组织 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `algorithm_type` | `algorithm_type` | `algorithmType` | 基数算法 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ratio` | `ratio` | `ratio` | 计提比率 |
| `row_no` | `row_no` | `rowNo` | 行号 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `grandsonItem` | 坏账计提比率孙表 |
