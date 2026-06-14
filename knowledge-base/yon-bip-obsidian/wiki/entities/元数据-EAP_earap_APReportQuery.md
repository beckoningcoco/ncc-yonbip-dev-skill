---
tags: [BIP, 元数据, 数据字典, EAP.earap.APReportQuery]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 应付账表查询 (`EAP.earap.APReportQuery`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_ledger_g` | domain：`yonbip-fi-earap` | 应用：`EAP` | 业务对象ID：`bb44788f-b8a8-4ce4-9ad7-22edf46f295f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 应付账表查询 |
| 物理表 | `arap_ledger_g` |
| domain/服务域 | `yonbip-fi-earap` |
| schema | `fiearap` |
| 所属应用 | `EAP` |
| 直连字段 | 66 个 |
| 子表 | 0 个 |
| 关联引用 | 31 个 |

## 关联引用 (31个)

| 字段名 | 引用类型 |
|--------|---------|
| `ar_subject_id` | `fiepub.fiepub_accsubjectref` |
| `h_src_app_id` | `fiepub.fiepub_sourceapplicationref` |
| `h_customer_id` | `productcenter.aa_merchant_master` |
| `h_partner_id` | `productcenter.base_businesspartnerref` |
| `h_org_id` | `ucf-org-center.org_pure_tree_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `b_material_id` | `productcenter.pc_nomalproductref` |
| `b_project_id` | `ucfbasedoc.bd_projectcardref` |
| `acc_book_id` | `fiepub.fiepub_accountbookref` |
| `b_expense_item_id` | `finbd.bd_expenseitemref` |
| `b_dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `b_procenter_id` | `finbd.bd_allaccbodyref_inner` |
| `h_employee_id` | `bd_staff_all_ref` |
| `b_staff_id` | `ucf-staff-center.bd_staff_all_ref` |
| `h_gbl_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `h_funder_id` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `b_ori_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `b_opp_procenter_id` | `finbd.bd_allaccbodyref_inner` |
| `ap_subject_id` | `fiepub.fiepub_accsubjectref` |
| `finance_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `b_cost_center_id` | `finbd.bd_costcenterref` |
| `ytenant_id` | `` |
| `h_supplier_id` | `yssupplier.aa_vendor` |
| `h_acc_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `ap_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `h_org_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `ar_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `h_biz_bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `h_grp_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `h_biz_bill_trade_type_id` | `ucfbasedoc.bd_billtyperef` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 66 个直连字段

### 文本字段 (24个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `h_biz_bill_id` | `h_biz_bill_id` | `h_src_bill_id` | 单据ID |
| `h_biz_bill_code` | `h_biz_bill_code` | `h_src_bill_code` | 单据编号 |
| `arap_event_type` | `arap_event_type` | `h_arap_event_type` | 事务类型 |
| `h_event_code` | `h_event_code` | `h_event_code` | 事务编号 |
| `h_object_type` | `h_object_type` | `h_object_type` | 往来对象类型 |
| `b_order_no` | `b_order_no` | `b_order_no` | 订单号 |
| `b_contract_no` | `b_contract_no` | `b_contract_no` | 合同号 |
| `b_invoice_no` | `b_invoice_no` | `b_invoice_no` | 发票号 |
| `body_id` | `body_id` | `b_id` | 事务明细行ID |
| `carryover_event_id` | `carryover_event_id` | `carryover_event_id` | 结转事务ID |
| `carryover_period_id` | `carryover_period_id` | `carryover_period_id` | 结转期间ID |
| `carryover_year_id` | `carryover_year_id` | `carryover_year_id` | 结转年度ID |
| `carryover_body_id` | `carryover_body_id` | `carryover_body_id` | 结转事务行ID |
| `carryover_grandson_id` | `carryover_grandson_id` | `carryover_grandson_id` | 结转事务孙ID |
| `event_id` | `event_id` | `h_id` | 事务ID |
| `ori_arap_event_type` | `ori_arap_event_type` | `ori_arap_event_type` | 源头事务类型 |
| `ori_grandson_id` | `ori_grandson_id` | `ori_grandson_id` | 源头核算ID |
| `org_amount` | `org_amount` | `g_org_amount` | 组织币金额 |
| `grp_amount` | `grp_amount` | `g_grp_amount` | 集团币金额 |
| `gbl_amount` | `gbl_amount` | `g_gbl_amount` | 全局币金额 |
| `b_free_ch_id` | `b_free_ch_id` | `b_free_ch_id` | 子表特征项 |
| `digest` | `digest` | `g_digest` | 处理摘要 |
| `h_free_ch_id` | `h_free_ch_id` | `h_free_ch_id` | 主表特征项 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (31个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `finance_org_id` | `finance_org_id` | `h_finance_org_id` | 会计主体 |
| `acc_book_id` | `acc_book_id` | `h_acc_book_id` | 财务账簿 |
| `h_biz_bill_trade_type_id` | `h_biz_bill_trade_type_id` | `h_src_trade_type_id` | 交易类型 |
| `h_biz_bill_type_id` | `h_biz_bill_type_id` | `h_src_bill_type_id` | 业务类型 |
| `h_org_id` | `h_org_id` | `h_org_id` | 业务组织 |
| `b_staff_id` | `b_staff_id` | `b_staff_id` | 业务员 |
| `h_customer_id` | `h_customer_id` | `h_customer_id` | 客户档案(租户) |
| `h_supplier_id` | `h_supplier_id` | `h_supplier_id` | 供应商 |
| `h_employee_id` | `h_employee_id` | `h_employee_id` | 员工 |
| `h_funder_id` | `h_funder_id` | `h_funder_id` | 资金业务对象 |
| `h_partner_id` | `h_partner_id` | `h_partner_id` | 业务伙伴 |
| `b_material_id` | `b_material_id` | `b_material_id` | 物料 |
| `b_opp_procenter_id` | `b_opp_procenter_id` | `b_opp_procenter_id` | 对方利润中心 |
| `b_cost_center_id` | `b_cost_center_id` | `b_cost_center_id` | 成本中心 |
| `b_dept_id` | `b_dept_id` | `b_dept_id` | 部门 |
| `b_expense_item_id` | `b_expense_item_id` | `b_expense_item_id` | 费用项目 |
| `b_procenter_id` | `b_procenter_id` | `b_procenter_id` | 利润中心 |
| `b_project_id` | `b_project_id` | `b_project_id` | 项目 |
| `b_ori_currency_id` | `b_ori_currency_id` | `b_ori_currency_id` | 币种 |
| `h_acc_currency_id` | `h_acc_currency_id` | `h_acc_currency_id` | 本币 |
| `ap_subject_vid` | `ap_subject_vid` | `g_ap_subject_vid` | 应付科目版本 |
| `ap_subject_id` | `ap_subject_id` | `g_ap_subject_id` | 应付科目 |
| `ar_subject_id` | `ar_subject_id` | `g_ar_subject_id` | 应收科目 |
| `ar_subject_vid` | `ar_subject_vid` | `g_ar_subject_vid` | 应收科目版本 |
| `h_src_app_id` | `h_src_app_id` | `h_src_system` | 来源应用 |
| `h_org_currency_id` | `h_org_currency_id` | `h_org_currency_id` | 组织本币 |
| `h_grp_currency_id` | `h_grp_currency_id` | `h_grp_currency_id` | 集团本币 |
| `h_gbl_currency_id` | `h_gbl_currency_id` | `h_gbl_currency_id` | 全局本币 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `h_src_bill_date` | `h_src_bill_date` | `h_src_bill_date` | 单据日期 |
| `h_acc_date` | `h_acc_date` | `h_acc_date` | 记账日期 |
| `start_date` | `start_date` | `g_start_date` | 起算日期 |
| `expire_date` | `expire_date` | `g_expire_date` | 到期日 |

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

### 数值字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ori_amount` | `ori_amount` | `g_ori_amount` | 金额 |
| `acc_amount` | `acc_amount` | `g_acc_amount` | 本币金额 |
| `dtc_status` | `dtc_status` | `dtc_status` | 分布式事务状态 |
