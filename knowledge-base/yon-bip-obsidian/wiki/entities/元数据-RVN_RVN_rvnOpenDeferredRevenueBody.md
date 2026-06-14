---
tags: [BIP, 元数据, 数据字典, RVN.RVN.rvnOpenDeferredRevenueBody]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 期初递延收入确认明细 (`RVN.RVN.rvnOpenDeferredRevenueBody`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rvn_deferred_revenue_b` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`11185fa1-8933-4b39-9c66-66331f2376c7`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 期初递延收入确认明细 |
| 物理表 | `rvn_deferred_revenue_b` |
| domain/服务域 | `yonbip-fi-ercl` |
| schema | `fiercl` |
| 所属应用 | `RVN` |
| 直连字段 | 111 个 |
| 子表 | 0 个 |
| 关联引用 | 43 个 |

## 关联引用 (43个)

| 字段名 | 引用类型 |
|--------|---------|
| `contract_asset_account_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `expense_item_id` | `finbd.bd_expenseitemref` |
| `org_exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `ori_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `pro_center_id` | `finbd.bd_allaccbodyref_inner` |
| `activity` | `` |
| `tax_out_account_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `contract_type_id` | `ucfbasedoc.bd_billtyperef` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |
| `wbs` | `` |
| `glb_exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `src_trans_type_id` | `ucfbasedoc.bd_billtyperef` |
| `contract_asset_account_id` | `fiepub.fiepub_accsubjectref` |
| `trade_confirm_rule_id` | `fiepub.fiepub_receivable_confirm_ref` |
| `invoice_type_id` | `ucfbasedoc.bd_invoiceref` |
| `ori_trans_type_id` | `ucfbasedoc.bd_billtyperef` |
| `rvn_deferred_revenue_base_id` | `` |
| `revenue_account_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `income_confirm_rule_id` | `fiepub.fiepub_income_confirm_ref` |
| `contract_base_id` | `yonbip-fi-ercl.RefTable_c75ebbb386` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `con_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `grp_exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `tax_subject_id` | `yonbip-fi-taxpubdoc.RefTable_55c5b82f11` |
| `acc_exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `cost_center_id` | `finbd.bd_costcenterref` |
| `staff_id` | `ucf-staff-center.bd_staff_all_ref` |
| `deferred_confirm_rule_id` | `fiepub.fiepub_income_confirm_ref` |
| `dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `con_exchange_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `src_bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `tax_out_account_id` | `fiepub.fiepub_accsubjectref` |
| `tax_rate_id` | `yonbip-fi-taxpubdoc.RefTable_55c5b82f11` |
| `unit_id` | `productcenter.pc_unitref` |
| `material_id` | `productcenter.pc_nomalproductref` |
| `ori_bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `contract_id` | `yonbip-fi-ercl.RefTable_da1e623072` |
| `opp_pro_center_id` | `finbd.bd_allaccbodyref_inner` |
| `revenue_account_id` | `fiepub.fiepub_accsubjectref` |
| `contract_execute_id` | `yonbip-fi-ercl.Implementation` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 111 个直连字段

### 文本字段 (16个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contract_no` | `contract_no` | `contractNo` | 履约义务单据号 |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | 全局事务ID |
| `dtc_status` | `dtc_status` | `dtcStatus` | 全局事务状态 |
| `id` | `id` | `id` | 主键 |
| `invoice_code` | `invoice_code` | `invoiceCode` | 发票代码 |
| `invoice_number` | `invoice_number` | `invoiceNumber` | 发票号码 |
| `order_no` | `order_no` | `orderNo` | 订单编号 |
| `ori_bill_id` | `ori_bill_id` | `oriBillId` | 源头单据ID |
| `ori_bill_no` | `ori_bill_no` | `oriBillNo` | 源头单据号 |
| `ori_bill_row_id` | `ori_bill_row_id` | `oriBillRowId` | 源头单据行ID |
| `ori_contract_base_row_id` | `ori_contract_base_row_id` | `oriContractBaseRowId` | 原始履约义务行主键 |
| `ori_contract_id` | `ori_contract_id` | `oriContractId` | 原始履约义务主键 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据ID |
| `src_bill_no` | `src_bill_no` | `srcBillNo` | 来源单据号 |
| `src_bill_row_id` | `src_bill_row_id` | `srcBillRowId` | 来源单据行ID |

### 引用字段 (42个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_exchange_rate_type_id` | `acc_exchange_rate_type_id` | `accExchangeRateType` | 汇率类型 |
| `activity` | `activity` | `activity` | 活动 |
| `con_currency_id` | `con_currency_id` | `conCurrency` | 合同币 |
| `con_exchange_rate_type` | `con_exchange_rate_type` | `conExchangeRateType` | 合同币汇率类型 |
| `contract_asset_account_id` | `contract_asset_account_id` | `contractAssetAccount` | 递延结转科目 |
| `contract_asset_account_vid` | `contract_asset_account_vid` | `contractAssetAccountVid` | 递延结转科目版本 |
| `contract_base_id` | `contract_base_id` | `contractBaseRowId` | 履约义务行主键 |
| `contract_execute_id` | `contract_execute_id` | `contractExecuteId` | 履约义务执行情况 |
| `contract_id` | `contract_id` | `contractId` | 履约义务主键 |
| `contract_type_id` | `contract_type_id` | `contractType` | 履约义务交易类型 |
| `cost_center_id` | `cost_center_id` | `costCenter` | 成本中心 |
| `creator` | `creator` | `creator` | 创建人 |
| `deferred_confirm_rule_id` | `deferred_confirm_rule_id` | `deferredConfirmRule` | 递延收入确认规则 |
| `dept_id` | `dept_id` | `dept` | 部门 |
| `expense_item_id` | `expense_item_id` | `expenseItem` | 费用项目 |
| `glb_exchange_rate_type_id` | `glb_exchange_rate_type_id` | `glbExchangeRateType` | 全局币汇率类型 |
| `grp_exchange_rate_type_id` | `grp_exchange_rate_type_id` | `grpExchangeRateType` | 集团币汇率类型 |
| `income_confirm_rule_id` | `income_confirm_rule_id` | `incomeConfirmRule` | 收入确认规则 |
| `invoice_type_id` | `invoice_type_id` | `invoiceType` | 发票类型 |
| `material_id` | `material_id` | `material` | 物料 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `opp_pro_center_id` | `opp_pro_center_id` | `oppProCenter` | 对方利润中心 |
| `org_exchange_rate_type_id` | `org_exchange_rate_type_id` | `orgExchangeRateType` | 组织币汇率类型 |
| `ori_bill_type_id` | `ori_bill_type_id` | `oriBillType` | 源头单据类型 |
| `ori_currency_id` | `ori_currency_id` | `oriCurrency` | 币种 |
| `ori_trans_type_id` | `ori_trans_type_id` | `oriTransType` | 源头交易类型 |
| `pro_center_id` | `pro_center_id` | `proCenter` | 利润中心 |
| `project_id` | `project_id` | `project` | 项目 |
| `revenue_account_id` | `revenue_account_id` | `revenueAccount` | 递延科目 |
| `revenue_account_vid` | `revenue_account_vid` | `revenueAccountVid` | 递延科目版本 |
| `rvn_deferred_revenue_base_id` | `rvn_deferred_revenue_base_id` | `rvnDeferredRevenueBaseId` | 期初递延收入确认 |
| `src_bill_type_id` | `src_bill_type_id` | `srcBillType` | 来源单据类型 |
| `src_trans_type_id` | `src_trans_type_id` | `srcTransType` | 来源交易类型 |
| `staff_id` | `staff_id` | `staff` | 业务员 |
| `tax_out_account_id` | `tax_out_account_id` | `taxOutAccount` | 待转销项税科目 |
| `tax_out_account_vid` | `tax_out_account_vid` | `taxOutAccountVid` | 待转销项税科目版本 |
| `tax_rate_id` | `tax_rate_id` | `taxRate` | 税率 |
| `tax_subject_id` | `tax_subject_id` | `taxSubject` | 税目 |
| `trade_confirm_rule_id` | `trade_confirm_rule_id` | `tradeConfirmRule` | 应收确认规则 |
| `unit_id` | `unit_id` | `unit` | 单位 |
| `wbs` | `wbs` | `wbs` | WBS |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bus_date` | `bus_date` | `busDate` | 业务日期 |
| `exchange_rate_date` | `exchange_rate_date` | `exchangeRateDate` | 汇率日期 |
| `invoice_date` | `invoice_date` | `invoiceDate` | 发票日期 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `adjust_type` | `adjust_type` | `adjustType` | 调整类型 |
| `con_exch_rate_ops` | `con_exch_rate_ops` | `conExchRateOps` | 合同币汇率折算方式 |
| `direction` | `direction` | `direction` | 借贷方向 |
| `exch_rate_ops` | `exch_rate_ops` | `exchRateOps` | 汇率折算方式 |
| `glb_exch_rate_ops` | `glb_exch_rate_ops` | `glbExchRateOps` | 全局币汇率折算方式 |
| `grp_exch_rate_ops` | `grp_exch_rate_ops` | `grpExchRateOps` | 集团币汇率折算方式 |
| `org_exch_rate_ops` | `org_exch_rate_ops` | `orgExchRateOps` | 组织币汇率折算方式 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (38个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_exchange_rate` | `acc_exchange_rate` | `accExchangeRate` | 汇率 |
| `acc_tax_excluded_price` | `acc_tax_excluded_price` | `accTaxExcludedPrice` | 本币无税单价 |
| `acc_tax_included_amount` | `acc_tax_included_amount` | `accTaxIncludedAmount` | 本币含税金额 |
| `acc_tax_included_price` | `acc_tax_included_price` | `accTaxIncludedPrice` | 本币含税单价 |
| `con_exchange_rate` | `con_exchange_rate` | `conExchangeRate` | 合同币汇率 |
| `con_tax_amount` | `con_tax_amount` | `conTaxAmount` | 合同币税额 |
| `con_tax_excluded_amount` | `con_tax_excluded_amount` | `conTaxExcludedAmount` | 合同币无税金额 |
| `con_tax_included_amount` | `con_tax_included_amount` | `conTaxIncludedAmount` | 合同币含税金额 |
| `glb_exchange_rate` | `glb_exchange_rate` | `glbExchangeRate` | 全局本币汇率 |
| `glb_tax_amount` | `glb_tax_amount` | `glbTaxAmount` | 全局本币税额 |
| `glb_tax_excluded_amount` | `glb_tax_excluded_amount` | `glbTaxExcludedAmount` | 全局币无税金额 |
| `glb_tax_included_amount` | `glb_tax_included_amount` | `glbTaxIncludedAmount` | 全局本币含税金额	 |
| `grp_exchange_rate` | `grp_exchange_rate` | `grpExchangeRate` | 集团本币汇率 |
| `grp_tax_amount` | `grp_tax_amount` | `grpTaxAmount` | 集团本币税额 |
| `grp_tax_excluded_amount` | `grp_tax_excluded_amount` | `grpTaxExcludedAmount` | 集团币无税金额 |
| `grp_tax_included_amount` | `grp_tax_included_amount` | `grpTaxIncludedAmount` | 集团本币含税金额 |
| `local_tax_amount` | `local_tax_amount` | `localTaxAmount` | 本币税额 |
| `local_tax_excluded_amount` | `local_tax_excluded_amount` | `localTaxExcludedAmount` | 本币无税金额 |
| `org_exchange_rate` | `org_exchange_rate` | `orgExchangeRate` | 组织本币汇率 |
| `org_tax_amount` | `org_tax_amount` | `orgTaxAmount` | 组织本币税额 |
| `org_tax_excluded_amount` | `org_tax_excluded_amount` | `orgTaxExcludedAmount` | 组织币无税金额 |
| `org_tax_included_amount` | `org_tax_included_amount` | `orgTaxIncludedAmount` | 组织本币含税金额 |
| `ori_tax_amount` | `ori_tax_amount` | `oriTaxAmount` | 税额 |
| `ori_tax_excluded_amount` | `ori_tax_excluded_amount` | `oriTaxExcludedAmount` | 无税金额 |
| `ori_tax_excluded_price` | `ori_tax_excluded_price` | `oriTaxExcludedPrice` | 无税单价 |
| `ori_tax_included_amount` | `ori_tax_included_amount` | `oriTaxIncludedAmount` | 含税金额 |
| `ori_tax_included_price` | `ori_tax_included_price` | `oriTaxIncludedPrice` | 含税单价 |
| `quantity` | `quantity` | `quantity` | 数量 |
| `recoil_quantity` | `recoil_quantity` | `recoilQuantity` | 待冲销数量 |
| `recoil_tax_amount` | `recoil_tax_amount` | `recoilTaxAmount` | 待冲销税额 |
| `recoil_tax_excluded_amount` | `recoil_tax_excluded_amount` | `recoilTaxExcludedAmount` | 待冲销无税金额 |
| `recoil_tax_included_amount` | `recoil_tax_included_amount` | `recoilTaxIncludedAmount` | 待冲销含税金额 |
| `red_sum_quantity` | `red_sum_quantity` | `redSumQuantity` | 已冲销数量 |
| `red_sum_tax_amount` | `red_sum_tax_amount` | `redSumTaxAmount` | 已冲销税额 |
| `red_sum_tax_excluded_amount` | `red_sum_tax_excluded_amount` | `redSumTaxExcludedAmount` | 已冲销无税金额 |
| `red_sum_tax_included_amount` | `red_sum_tax_included_amount` | `redSumTaxIncludedAmount` | 已冲销含税金额 |
| `row_no` | `row_no` | `rowNo` | 行号 |
| `tax_rate_number` | `tax_rate_number` | `taxRateNumber` | 税率值 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 特征 |
