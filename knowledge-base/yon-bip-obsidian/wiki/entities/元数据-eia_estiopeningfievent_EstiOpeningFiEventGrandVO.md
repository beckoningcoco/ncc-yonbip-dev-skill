---
tags: [BIP, 元数据, 数据字典, eia.estiopeningfievent.EstiOpeningFiEventGrandVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 暂估期初费用项目 (`eia.estiopeningfievent.EstiOpeningFiEventGrandVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ia_ledger_g` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`5bb48654-c664-4ef5-85e2-2549df94844f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 暂估期初费用项目 |
| 物理表 | `ia_ledger_g` |
| 数据库 schema | `yonbip-fi-eia` |
| 所属应用 | `EIA` |
| 直连字段 | 43 个 |
| 子表 | 0 个 |
| 关联引用 | 23 个 |

## 关联引用 (23个)

| 字段名 | 引用类型 |
|--------|---------|
| `org_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `period_id` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `supplier_id` | `yssupplier.aa_vendor` |
| `material_acc_v_id` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `accpurpose_id` | `finbd.bd_accpurposeref` |
| `material_acc_id` | `fiepub.epub_accsubject_treetableref` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `control_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `cost_item_id` | `yonyoufi.bd_expenseitemref` |
| `entrust_acc_id` | `fiepub.epub_accsubject_treetableref` |
| `ytenant_id` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref_inner` |
| `global_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `group_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `entrust_acc_v_id` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `header_id` | `` |
| `detail_id` | `` |
| `currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `invoice_supplier_id` | `yssupplier.aa_vendor` |
| `accbook_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `acc_year_id` | `finbd.bd_periodyear` |

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

> 共 43 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `period_code` | `period_code` | `periodCode` |  记账会计期间 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年编码 |
| `src_bill_row_id` | `src_bill_row_id` | `srcBillRowId` | 来源单据行ID |
| `id` | `id` | `id` | id |

### 引用字段 (23个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accpurpose_id` | `accpurpose_id` | `accpurpose` | 核算目的 |
| `accentity_id` | `accentity_id` | `accentity` |  会计主体 |
| `accbook_id` | `accbook_id` | `accbook` | 账簿 |
| `period_id` | `period_id` | `period` | 记账会计期间id |
| `acc_year_id` | `acc_year_id` | `accYearId` | 会计年ID |
| `cost_item_id` | `cost_item_id` | `costItemId` | 费用项目 |
| `supplier_id` | `supplier_id` | `supplierId` | 供货供应商 |
| `invoice_supplier_id` | `invoice_supplier_id` | `invoiceSupplierId` | 开票供应商 |
| `currency_id` | `currency_id` | `currencyId` | 原币币种 |
| `accbook_currtype_id` | `accbook_currtype_id` | `accbookCurrtypeId` | 账簿本币 |
| `org_currtype_id` | `org_currtype_id` | `orgCurrtypeId` | 组织本币 |
| `group_currtype_id` | `group_currtype_id` | `groupCurrtypeId` | 集团本币 |
| `global_currtype_id` | `global_currtype_id` | `globalCurrtypeId` | 全局本币 |
| `material_acc_id` | `material_acc_id` | `materialAccId` | 材料采购科目 |
| `material_acc_v_id` | `material_acc_v_id` | `materialAccVId` | 材料采购科目版本ID |
| `entrust_acc_id` | `entrust_acc_id` | `entrustAccId` | 委托加工物资 |
| `entrust_acc_v_id` | `entrust_acc_v_id` | `entrustAccVId` | 委托加工物资版本ID |
| `control_currtype_id` | `control_currtype_id` | `controlCurrtypeId` | 管控范围本币 |
| `detail_id` | `detail_id` | `detail` | 暂估期初综合信息ID |
| `header_id` | `header_id` | `header` | 暂估期初主表ID |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | pubts |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `price` | `price` | `price` | 原币单价 |
| `amount` | `amount` | `amount` | 原币金额 |
| `accbook_price` | `accbook_price` | `accbookPrice` | 账簿本币单价 |
| `accbook_amount` | `accbook_amount` | `accbookAmount` | 账簿本币金额 |
| `org_price` | `org_price` | `orgPrice` | 组织本币单价 |
| `org_amount` | `org_amount` | `orgAmount` | 组织本币金额 |
| `group_price` | `group_price` | `groupPrice` | 集团本币单价 |
| `group_amount` | `group_amount` | `groupAmount` | 集团本币金额 |
| `global_price` | `global_price` | `globalPrice` | 全局本币单价 |
| `global_amount` | `global_amount` | `globalAmount` | 全局本币金额 |
| `control_amount` | `control_amount` | `controlAmount` | 管控范围本币金额 |
| `control_price` | `control_price` | `controlPrice` | 管控范围本币单价 |
