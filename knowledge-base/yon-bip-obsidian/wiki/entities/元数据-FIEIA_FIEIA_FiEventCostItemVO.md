---
tags: [BIP, 元数据, 数据字典, FIEIA.FIEIA.FiEventCostItemVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 存货费用项目表 (`FIEIA.FIEIA.FiEventCostItemVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ia_ledger_g` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`7a81b995-4432-4f45-9738-2547c307759a`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 存货费用项目表 |
| 物理表 | `ia_ledger_g` |
| domain/服务域 | `yonbip-fi-eia` |
| schema | `fieia` |
| 所属应用 | `EIA` |
| 直连字段 | 47 个 |
| 子表 | 0 个 |
| 关联引用 | 27 个 |

## 关联引用 (27个)

| 字段名 | 引用类型 |
|--------|---------|
| `supplier_id` | `yssupplier.aa_vendor` |
| `material_acc_id` | `fiepub.fiepub_accsubjectref` |
| `accpurpose_id` | `finbd.bd_accpurposeref` |
| `product_acc_id` | `fiepub.fiepub_accsubjectref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `control_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `entrust_acc_id` | `fiepub.fiepub_accsubjectref` |
| `cost_item_id` | `yonyoufi.bd_expenseitemref` |
| `accentity_id` | `finbd.bd_allaccbodyref_inner` |
| `global_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `transfer_acc_id` | `fiepub.fiepub_accsubjectref` |
| `currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `org_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `period_id` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `transfer_acc_v_id` | `fiepub.fiepub_accsubjectref` |
| `material_acc_v_id` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `ytenant_id` | `` |
| `group_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `entrust_acc_v_id` | `fiepub.fiepub_accsubjectref` |
| `header_id` | `` |
| `detail_id` | `` |
| `invoice_supplier_id` | `yssupplier.aa_vendor` |
| `product_acc_v_id` | `fiepub.fiepub_accsubjectref` |
| `accbook_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `acc_year_id` | `finbd.bd_periodyear` |

## 字段列表（按类型分组）

> 共 47 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年编码 |
| `period_code` | `period_code` | `periodCode` |  记账会计期间 |
| `src_bill_row_id` | `src_bill_row_id` | `srcBillRowId` | 来源单据行id |

### 引用字段 (27个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `detail_id` | `detail_id` | `detail` | 业务核算子表 |
| `supplier_id` | `supplier_id` | `supplierId` | 供货供应商 |
| `material_acc_id` | `material_acc_id` | `materialAccId` | 材料采购科目 |
| `product_acc_id` | `product_acc_id` | `productAccId` | 生产成本科目 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `control_currtype_id` | `control_currtype_id` | `controlCurrtypeId` | 管控范围本币 |
| `entrust_acc_id` | `entrust_acc_id` | `entrustAccId` | 委托加工物资 |
| `cost_item_id` | `cost_item_id` | `costItemId` | 费用项目 |
| `global_currtype_id` | `global_currtype_id` | `globalCurrtypeId` | 全局本币 |
| `transfer_acc_id` | `transfer_acc_id` | `transferAccId` | 组装拆卸科目 |
| `currency_id` | `currency_id` | `currencyId` | 原币币种 |
| `org_currtype_id` | `org_currtype_id` | `orgCurrtypeId` | 组织本币 |
| `creator` | `creator` | `creator` | 创建人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |
| `group_currtype_id` | `group_currtype_id` | `groupCurrtypeId` | 集团本币 |
| `invoice_supplier_id` | `invoice_supplier_id` | `invoiceSupplierId` | 开票供应商 |
| `accbook_currtype_id` | `accbook_currtype_id` | `accbookCurrtypeId` | 账簿本币 |
| `acc_year_id` | `acc_year_id` | `accYearId` | 会计年ID |
| `accbook_id` | `accbook_id` | `accbook` | 账簿 |
| `accentity_id` | `accentity_id` | `accentity` |  会计主体 |
| `accpurpose_id` | `accpurpose_id` | `accpurpose` | 核算目的 |
| `entrust_acc_v_id` | `entrust_acc_v_id` | `entrustAccVId` | 委托加工物资版本ID |
| `header_id` | `header_id` | `header` | 业务主表信息 |
| `material_acc_v_id` | `material_acc_v_id` | `materialAccVId` | 材料采购科目版本ID |
| `period_id` | `period_id` | `period` | 记账会计期间id |
| `product_acc_v_id` | `product_acc_v_id` | `productAccVId` | 生产成本科目版本ID |
| `transfer_acc_v_id` | `transfer_acc_v_id` | `transferAccVId` | 组装拆卸科目版本ID |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | pubts |
| `create_time` | `create_time` | `createTime` | 创建时间 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `control_price` | `control_price` | `controlPrice` | 管控范围本币单价 |
| `global_amount` | `global_amount` | `globalAmount` | 全局本币金额 |
| `org_price` | `org_price` | `orgPrice` | 组织本币单价 |
| `control_amount` | `control_amount` | `controlAmount` | 管控范围本币金额 |
| `group_amount` | `group_amount` | `groupAmount` | 集团本币金额 |
| `price` | `price` | `price` | 原币单价 |
| `group_price` | `group_price` | `groupPrice` | 集团本币单价 |
| `amount` | `amount` | `amount` | 原币金额 |
| `global_price` | `global_price` | `globalPrice` | 全局本币单价 |
| `accbook_amount` | `accbook_amount` | `accbookAmount` | 账簿本币金额 |
| `org_amount` | `org_amount` | `orgAmount` | 组织本币金额 |
| `accbook_price` | `accbook_price` | `accbookPrice` | 账簿本币单价 |
