---
tags: [BIP, 元数据, 数据字典, EAP.ManualVerify.APManualVerify]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 应付手工核销 (`EAP.ManualVerify.APManualVerify`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_ledger_g` | domain：`yonbip-fi-earap` | 应用：`EAP` | 业务对象ID：`cb998bdd-300a-4364-88f0-49850e870704`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 应付手工核销 |
| 物理表 | `arap_ledger_g` |
| 数据库 schema | `yonbip-fi-earap` |
| 所属应用 | `EAP` |
| 直连字段 | 96 个 |
| 子表 | 0 个 |
| 关联引用 | 35 个 |

## 关联引用 (35个)

| 字段名 | 引用类型 |
|--------|---------|
| `b_expense_item_id` | `finbd.bd_expenseitemref` |
| `h_funder_id` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `event_id` | `` |
| `b_ori_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `finance_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `b_procenter_id` | `finbd.bd_allaccbodyref_inner` |
| `h_gbl_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `b_project_id` | `ucfbasedoc.bd_projectcardref` |
| `h_biz_bill_trade_type_id` | `ucfbasedoc.bd_billtyperef` |
| `h_employee_id` | `ucf-staff-center.bd_staff_all_ref` |
| `b_quick_type_id` | `finbd.bd_paymenttyperef` |
| `ar_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `h_supplier_id` | `yssupplier.aa_vendor` |
| `h_acc_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `h_grp_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `h_org_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `b_dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `settle_mode_id` | `productcenter.aa_settlemethodref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `h_org_id` | `ucf-org-center.org_pure_tree_ref` |
| `b_cost_center_id` | `finbd.bd_costcenterref` |
| `ap_subject_id` | `fiepub.fiepub_accsubjectref` |
| `ap_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `b_staff_id` | `ucf-staff-center.bd_staff_all_ref` |
| `ytenant_id` | `` |
| `h_src_app_id` | `fiepub.fiepub_sourceapplicationref` |
| `ar_subject_id` | `fiepub.fiepub_accsubjectref` |
| `acc_book_id` | `fiepub.fiepub_accountbookref` |
| `b_material_id` | `productcenter.pc_nomalproductref` |
| `h_partner_id` | `productcenter.base_businesspartnerref` |
| `b_opp_procenter_id` | `finbd.bd_allaccbodyref_inner` |
| `body_id` | `` |
| `h_biz_bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `h_customer_id` | `productcenter.aa_merchantinorganizationref` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 96 个直连字段

### 文本字段 (23个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_period_code` | `acc_period_code` | `accPeriodCode` | 会计期间 |
| `b_free_ch_id` | `b_free_ch_id` | `bFreechID` | 子表特征项 |
| `b_remarks` | `b_remarks` | `bRemarks` | 表体备注 |
| `balance_state` | `balance_state` | `balanceState` | 清账状态 |
| `h_biz_bill_code` | `h_biz_bill_code` | `bizBillCode` | 单据编号 |
| `h_biz_bill_id` | `h_biz_bill_id` | `bizBillId` | 单据id |
| `carryover_body_id` | `carryover_body_id` | `carryoverBodyId` | 结转事务行ID |
| `carryover_event_id` | `carryover_event_id` | `carryoverEventId` | 结转事务ID |
| `carryover_grandson_id` | `carryover_grandson_id` | `carryoverGrandsonId` | 结转事务孙ID |
| `carryover_period_id` | `carryover_period_id` | `carryoverPeriodId` | 结转期间ID |
| `carryover_year_id` | `carryover_year_id` | `carryoverYearId` | 结转年度ID |
| `b_contract_no` | `b_contract_no` | `contractNo` | 合同号 |
| `dtc_status` | `dtc_status` | `dtcStatus` | 分布式事务状态 |
| `h_event_code` | `h_event_code` | `eventCode` | 事务编号 |
| `h_free_ch_id` | `h_free_ch_id` | `hFreechID` | 主表特征项 |
| `h_remarks` | `h_remarks` | `hRemarks` | 表头备注 |
| `id` | `id` | `id` | 主键 |
| `b_invoice_no` | `b_invoice_no` | `invoiceNo` | 发票号 |
| `b_order_no` | `b_order_no` | `orderNo` | 订单号 |
| `ori_arap_event_type` | `ori_arap_event_type` | `oriArapEventType` | 源头事务类型 |
| `ori_grandson_id` | `ori_grandson_id` | `oriGrandsonID` | 源头核算ID |
| `src_exe_detail_id` | `src_exe_detail_id` | `srcExeDetailId` | 来源单据执行明细id |
| `b_wbs` | `b_wbs` | `wbs` | WBS |

### 引用字段 (35个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_book_id` | `acc_book_id` | `accBook` | 财务账簿 |
| `h_acc_currency_id` | `h_acc_currency_id` | `accCurrency` | 本币 |
| `ap_subject_id` | `ap_subject_id` | `apSubject` | 应付科目 |
| `ap_subject_vid` | `ap_subject_vid` | `apSubjectVid` | 应付科目版本 |
| `ar_subject_id` | `ar_subject_id` | `arSubject` | 应收科目 |
| `ar_subject_vid` | `ar_subject_vid` | `arSubjectVid` | 应收科目版本 |
| `h_biz_bill_type_id` | `h_biz_bill_type_id` | `bizBillType` | 业务类型 |
| `h_biz_bill_trade_type_id` | `h_biz_bill_trade_type_id` | `bizTradeType` | 交易类型 |
| `body_id` | `body_id` | `bodyID` | 事务明细行ID |
| `b_cost_center_id` | `b_cost_center_id` | `costCenter` | 成本中心 |
| `creator` | `creator` | `creator` | 创建人 |
| `h_customer_id` | `h_customer_id` | `customer` | 客户 |
| `b_dept_id` | `b_dept_id` | `department` | 部门 |
| `h_employee_id` | `h_employee_id` | `employee` | 员工 |
| `event_id` | `event_id` | `eventID` | 事务ID |
| `b_expense_item_id` | `b_expense_item_id` | `expenseItem` | 费用项目 |
| `finance_org_id` | `finance_org_id` | `financeOrg` | 会计主体 |
| `h_funder_id` | `h_funder_id` | `funder` | 资金业务对象 |
| `h_gbl_currency_id` | `h_gbl_currency_id` | `gblCurrency` | 全局本币 |
| `h_grp_currency_id` | `h_grp_currency_id` | `grpCurrency` | 集团本币 |
| `b_material_id` | `b_material_id` | `material` | 物料 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `b_opp_procenter_id` | `b_opp_procenter_id` | `oppProCenter` | 对方利润中心 |
| `h_org_id` | `h_org_id` | `org` | 业务组织 |
| `h_org_currency_id` | `h_org_currency_id` | `orgCurrency` | 组织本币 |
| `b_ori_currency_id` | `b_ori_currency_id` | `oriCurrency` | 币种 |
| `h_partner_id` | `h_partner_id` | `partner` | 业务伙伴 |
| `b_procenter_id` | `b_procenter_id` | `proCenter` | 利润中心 |
| `b_project_id` | `b_project_id` | `project` | 项目 |
| `b_quick_type_id` | `b_quick_type_id` | `quickType` | 款项类型 |
| `settle_mode_id` | `settle_mode_id` | `settleModeId` | 结算方式 |
| `h_src_app_id` | `h_src_app_id` | `srcApp` | 来源应用 |
| `b_staff_id` | `b_staff_id` | `staff` | 业务员 |
| `h_supplier_id` | `h_supplier_id` | `supplier` | 供应商 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `h_acc_date` | `h_acc_date` | `accDate` | 记账日期 |
| `expire_date` | `expire_date` | `expireDate` | 到期日 |
| `local_clear_time` | `local_clear_time` | `localClearTime` | 本币清账时间 |
| `h_src_bill_date` | `h_src_bill_date` | `srcBillDate` | 单据日期 |
| `start_date` | `start_date` | `startDate` | 起算日期 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_hangup` | `bln_hangup` | `blnHangUp` | 是否挂起 |

### 枚举字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_exchange_rate_ops` | `acc_exchange_rate_ops` | `accExchangeRateOps` | 本币汇率折算方式 |
| `arap_event_type` | `arap_event_type` | `arapEventType` | 事务类型 |
| `h_bln_effect` | `h_bln_effect` | `blnEffect` | 是否生效 |
| `digest` | `digest` | `digest` | 处理摘要 |
| `gbl_exchange_rate_ops` | `gbl_exchange_rate_ops` | `gblExchangeRateOps` | 全局币汇率折算方式 |
| `grp_exchange_rate_ops` | `grp_exchange_rate_ops` | `grpExchangeRateOps` | 集团币汇率折算方式 |
| `negativeRowCount` | `negativeRowCount` | `negativeRowCount` | 单内计划行金额是否一致 |
| `h_object_type` | `h_object_type` | `objectType` | 往来对象类型 |
| `org_exchange_rate_ops` | `org_exchange_rate_ops` | `orgExchangeRateOps` | 组织币汇率折算方式 |
| `verify_curr_rule` | `verify_curr_rule` | `verifyCurrRule` | 币种核销规则 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `issue_no` | `issue_no` | `issueNo` | 期号 |
| `rowCount` | `rowCount` | `rowCount` | 单内计划行数 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (16个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_amount` | `acc_amount` | `accAmount` | 本币金额 |
| `acc_balance` | `acc_balance` | `accBalance` | 本币余额 |
| `acc_exchange_rate` | `acc_exchange_rate` | `accExchangeRate` | 汇率 |
| `gbl_amount` | `gbl_amount` | `gblAmount` | 全局币金额 |
| `gbl_balance` | `gbl_balance` | `gblBalance` | 全局币余额 |
| `gbl_exchange_rate` | `gbl_exchange_rate` | `gblExchangeRate` | 全局币汇率 |
| `grp_amount` | `grp_amount` | `grpAmount` | 集团币金额 |
| `grp_balance` | `grp_balance` | `grpBalance` | 集团币余额 |
| `grp_exchange_rate` | `grp_exchange_rate` | `grpExchangeRate` | 集团币汇率 |
| `org_amount` | `org_amount` | `orgAmount` | 组织币金额 |
| `org_balance` | `org_balance` | `orgBalance` | 组织币余额 |
| `org_exchange_rate` | `org_exchange_rate` | `orgExchangeRate` | 组织币汇率 |
| `ori_amount` | `ori_amount` | `oriAmount` | 金额 |
| `ori_balance` | `ori_balance` | `oriBalance` | 余额 |
| `ori_ocupy_amount` | `ori_ocupy_amount` | `oriOcupyAmount` | 预占用金额 |
| `row_no` | `row_no` | `rowNo` | 行号 |
