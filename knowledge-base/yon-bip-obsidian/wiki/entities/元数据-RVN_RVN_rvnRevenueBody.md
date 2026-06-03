---
tags: [BIP, 元数据, 数据字典, RVN.RVN.rvnRevenueBody]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 收入确认子表 (`RVN.RVN.rvnRevenueBody`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rvn_revenue_b` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`970aec86-accd-400b-9270-08da6b0726af`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 收入确认子表 |
| 物理表 | `rvn_revenue_b` |
| 数据库 schema | `yonbip-fi-ercl` |
| 所属应用 | `RVN` |
| 直连字段 | 99 个 |
| 子表 | 0 个 |
| 关联引用 | 41 个 |

## 关联引用 (41个)

| 字段名 | 引用类型 |
|--------|---------|
| `contract_asset_account_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `expense_item_id` | `finbd.bd_expenseitemref` |
| `org_exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `ori_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `procenter_id` | `finbd.bd_allaccbodyref_inner` |
| `activity` | `` |
| `tax_out_account_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `contract_type` | `ucfbasedoc.bd_billtyperef` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `wbs` | `` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |
| `glb_exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `src_trans_type_id` | `ucfbasedoc.bd_billtyperef` |
| `contract_asset_account_id` | `fiepub.fiepub_accsubjectref` |
| `trade_confirm_rule_id` | `fiepub.fiepub_receivable_confirm_ref` |
| `rvn_revenue_base_id` | `` |
| `invoice_type_id` | `ucfbasedoc.bd_invoiceref` |
| `ori_trans_type_id` | `ucfbasedoc.bd_billtyperef` |
| `revenue_account_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `income_confirm_rule_id` | `fiepub.fiepub_income_confirm_ref` |
| `contract_row_id` | `yonbip-fi-ercl.RefTable_c75ebbb386` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `con_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `grp_exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `tax_subject_id` | `yonbip-fi-taxpubdoc.RefTable_55c5b82f11` |
| `acc_exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `cost_center_id` | `finbd.bd_costcenterref` |
| `staff_id` | `ucf-staff-center.bd_staff_all_ref` |
| `ytenant_id` | `` |
| `dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `free_ch_id` | `` |
| `con_exchange_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `src_bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `tax_out_account_id` | `fiepub.fiepub_accsubjectref` |
| `tax_rate_id` | `yonbip-fi-taxpubdoc.RefTable_55c5b82f11` |
| `unit_id` | `productcenter.pc_unitref` |
| `material_id` | `productcenter.pc_nomalproductref` |
| `ori_bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `contract_id` | `yonbip-fi-ercl.RefTable_da1e623072` |
| `opp_procenter_id` | `finbd.bd_allaccbodyref_inner` |
| `revenue_account_id` | `fiepub.fiepub_accsubjectref` |

## 继承接口 (4个, 8字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`

## 字段列表（按类型分组）

> 共 99 个直连字段

### 文本字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据ID |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | 全局事务ID |
| `invoice_code` | `invoice_code` | `invoiceCode` | 发票代码 |
| `contract_no` | `contract_no` | `contractNo` | 履约义务单据号 |
| `ori_bill_no` | `ori_bill_no` | `oriBillNo` | 源头单据号 |
| `dtc_status` | `dtc_status` | `dtcStatus` | 全局事务状态 |
| `src_bill_row_id` | `src_bill_row_id` | `srcBillRowId` | 来源单据行ID |
| `src_bill_no` | `src_bill_no` | `srcBillNo` | 来源单据号 |
| `order_no` | `order_no` | `orderNo` | 订单编号 |
| `ori_bill_row_id` | `ori_bill_row_id` | `oriBillRowId` | 源头单据行ID |
| `invoice_number` | `invoice_number` | `invoiceNumber` | 发票号码 |
| `ori_bill_id` | `ori_bill_id` | `oriBillId` | 源头单据ID |
| `remarks` | `remarks` | `remarks` | 备注 |

### 引用字段 (40个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `org_exchange_rate_type_id` | `org_exchange_rate_type_id` | `orgExchangeRateType` | 组织币汇率类型 |
| `ori_currency_id` | `ori_currency_id` | `oriCurrency` | 币种 |
| `contract_type` | `contract_type` | `contractType` | 履约义务交易类型 |
| `wbs` | `wbs` | `wbs` | WBS |
| `contract_asset_account_id` | `contract_asset_account_id` | `contractAssetAccount` | 收入结转科目 |
| `contract_row_id` | `contract_row_id` | `contractRowId` | 履约义务行ID |
| `cost_center_id` | `cost_center_id` | `costCenter` | 成本中心 |
| `src_bill_type_id` | `src_bill_type_id` | `srcBillType` | 来源单据类型 |
| `ori_bill_type_id` | `ori_bill_type_id` | `oriBillType` | 源头单据类型 |
| `revenue_account_id` | `revenue_account_id` | `revenueAccount` | 收入科目 |
| `contract_asset_account_vid` | `contract_asset_account_vid` | `contractAssetAccountVid` | 收入结转科目版本 |
| `procenter_id` | `procenter_id` | `proCenter` | 利润中心 |
| `activity` | `activity` | `activity` | 活动 |
| `src_trans_type_id` | `src_trans_type_id` | `srcTransType` | 来源交易类型 |
| `rvn_revenue_base_id` | `rvn_revenue_base_id` | `rvnRevenueBaseId` | 收入确认主表 |
| `income_confirm_rule_id` | `income_confirm_rule_id` | `incomeConfirmRule` | 收入确认规则 |
| `creator` | `creator` | `creator` | 创建人 |
| `con_currency_id` | `con_currency_id` | `conCurrency` | 合同币 |
| `staff_id` | `staff_id` | `staff` | 业务员 |
| `dept_id` | `dept_id` | `dept` | 部门 |
| `con_exchange_rate_type` | `con_exchange_rate_type` | `conExchangeRateType` | 合同币汇率类型 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `project_id` | `project_id` | `project` | 项目 |
| `invoice_type_id` | `invoice_type_id` | `invoiceType` | 发票类型 |
| `ori_trans_type_id` | `ori_trans_type_id` | `oriTransType` | 源头交易类型 |
| `revenue_account_vid` | `revenue_account_vid` | `revenueAccountVid` | 收入科目版本 |
| `grp_exchange_rate_type_id` | `grp_exchange_rate_type_id` | `grpExchangeRateType` | 集团币汇率类型 |
| `tax_subject_id` | `tax_subject_id` | `taxSubject` | 税目 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |
| `tax_rate_id` | `tax_rate_id` | `taxRate` | 税率 |
| `unit_id` | `unit_id` | `unit` | 单位 |
| `opp_procenter_id` | `opp_procenter_id` | `oppProCenter` | 对方利润中心 |
| `expense_item_id` | `expense_item_id` | `expenseItem` | 费用项目 |
| `tax_out_account_vid` | `tax_out_account_vid` | `taxOutAccountVid` | 待转销项税科目版本 |
| `glb_exchange_rate_type_id` | `glb_exchange_rate_type_id` | `glbExchangeRateType` | 全局币汇率类型 |
| `trade_confirm_rule_id` | `trade_confirm_rule_id` | `tradeConfirmRule` | 应收确认规则 |
| `acc_exchange_rate_type_id` | `acc_exchange_rate_type_id` | `accExchangeRateType` | 汇率类型 |
| `tax_out_account_id` | `tax_out_account_id` | `taxOutAccount` | 待转销项税科目 |
| `material_id` | `material_id` | `material` | 物料 |
| `contract_id` | `contract_id` | `contractId` | 履约义务ID |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bus_date` | `bus_date` | `busDate` | 业务日期 |
| `exchange_rate_date` | `exchange_rate_date` | `exchangeRateDate` | 汇率日期 |
| `invoice_date` | `invoice_date` | `invoiceDate` | 发票日期 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 枚举字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `con_exch_rate_ops` | `con_exch_rate_ops` | `conExchRateOps` | 合同币汇率折算方式 |
| `exch_rate_ops` | `exch_rate_ops` | `exchRateOps` | 汇率折算方式 |
| `glb_exch_rate_ops` | `glb_exch_rate_ops` | `glbExchRateOps` | 全局币汇率折算方式 |
| `grp_exch_rate_ops` | `grp_exch_rate_ops` | `grpExchRateOps` | 集团币汇率折算方式 |
| `org_exch_rate_ops` | `org_exch_rate_ops` | `orgExchRateOps` | 组织币汇率折算方式 |
| `adjust_type` | `adjust_type` | `adjustType` | 调整类型 |
| `direction` | `direction` | `direction` | 方向 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (30个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `org_exchange_rate` | `org_exchange_rate` | `orgExchangeRate` | 组织本币汇率 |
| `con_exchange_rate` | `con_exchange_rate` | `conExchangeRate` | 合同币汇率 |
| `local_tax_amount` | `local_tax_amount` | `localTaxAmount` | 本币税额 |
| `grp_tax_amount` | `grp_tax_amount` | `grpTaxAmount` | 集团本币税额 |
| `row_no` | `row_no` | `rowNo` | 行号 |
| `grp_exchange_rate` | `grp_exchange_rate` | `grpExchangeRate` | 集团本币汇率 |
| `ori_tax_excluded_amount` | `ori_tax_excluded_amount` | `oriTaxExcludedAmount` | 无税金额 |
| `acc_exchange_rate` | `acc_exchange_rate` | `accExchangeRate` | 汇率 |
| `ori_tax_amount` | `ori_tax_amount` | `oriTaxAmount` | 税额 |
| `acc_tax_included_amount` | `acc_tax_included_amount` | `accTaxIncludedAmount` | 本币含税金额 |
| `glb_exchange_rate` | `glb_exchange_rate` | `glbExchangeRate` | 全局本币汇率 |
| `org_tax_amount` | `org_tax_amount` | `orgTaxAmount` | 组织本币税额 |
| `ori_tax_excluded_price` | `ori_tax_excluded_price` | `oriTaxExcludedPrice` | 无税单价 |
| `con_tax_excluded_amount` | `con_tax_excluded_amount` | `conTaxExcludedAmount` | 合同币无税金额 |
| `acc_tax_excluded_price` | `acc_tax_excluded_price` | `accTaxExcludedPrice` | 本币无税单价 |
| `glb_tax_amount` | `glb_tax_amount` | `glbTaxAmount` | 全局本币税额 |
| `tax_rate_number` | `tax_rate_number` | `taxRateNumber` | 税率值 |
| `acc_tax_included_price` | `acc_tax_included_price` | `accTaxIncludedPrice` | 本币含税单价 |
| `con_tax_included_amount` | `con_tax_included_amount` | `conTaxIncludedAmount` | 合同币含税金额 |
| `org_tax_included_amount` | `org_tax_included_amount` | `orgTaxIncludedAmount` | 组织本币含税金额 |
| `con_tax_amount` | `con_tax_amount` | `conTaxAmount` | 合同币税额 |
| `glb_tax_included_amount` | `glb_tax_included_amount` | `glbTaxIncludedAmount` | 全局本币含税金额 |
| `grp_tax_included_amount` | `grp_tax_included_amount` | `grpTaxIncludedAmount` | 集团本币含税金额 |
| `grp_tax_excluded_amount` | `grp_tax_excluded_amount` | `grpTaxExcludedAmount` | 集团币无税金额 |
| `ori_tax_included_amount` | `ori_tax_included_amount` | `oriTaxIncludedAmount` | 含税金额 |
| `org_tax_excluded_amount` | `org_tax_excluded_amount` | `orgTaxExcludedAmount` | 组织币无税金额 |
| `ori_tax_included_price` | `ori_tax_included_price` | `oriTaxIncludedPrice` | 含税单价 |
| `quantity` | `quantity` | `quantity` | 数量 |
| `glb_tax_excluded_amount` | `glb_tax_excluded_amount` | `glbTaxExcludedAmount` | 全局币无税金额 |
| `local_tax_excluded_amount` | `local_tax_excluded_amount` | `localTaxExcludedAmount` | 本币无税金额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 特征 |
