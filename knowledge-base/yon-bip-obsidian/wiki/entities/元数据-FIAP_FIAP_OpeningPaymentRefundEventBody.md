---
tags: [BIP, 元数据, 数据字典, FIAP.FIAP.OpeningPaymentRefundEventBody]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 期初付款退款明细信息 (`FIAP.FIAP.OpeningPaymentRefundEventBody`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_ledger_b` | domain：`yonbip-fi-earap` | 应用：`EAP` | 业务对象ID：`4205f958-e456-49bc-bd85-7db2f8e8e135`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 期初付款退款明细信息 |
| 物理表 | `arap_ledger_b` |
| 数据库 schema | `yonbip-fi-earap` |
| 所属应用 | `EAP` |
| 直连字段 | 152 个 |
| 子表 | 1 个 |
| 关联引用 | 48 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `taxGrandsonItem` | `FIAP.FIAP.OpeningPaymentRefundEventTaxCalculationResult` | composition |

## 关联引用 (48个)

| 字段名 | 引用类型 |
|--------|---------|
| `expense_item_id` | `yonyoufi.bd_expenseitemref` |
| `org_exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `ori_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `finance_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `procenter_id` | `finbd.bd_allaccbodyref_inner` |
| `activity` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `whtax_id` | `` |
| `employee_bank_account_id` | `ucf-staff-center.bd_staffbankaccref` |
| `wbs` | `` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |
| `quick_type_id` | `finbd.bd_paymenttyperef` |
| `inventory_org_id` | `ucf-org-center.bd_inventoryorg` |
| `cost_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `funder_bank_account_id` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobjbank_Ref` |
| `settle_subject_id` | `fiepub.fiepub_accsubjectref` |
| `note_no_id` | `drft.drft_billnoref` |
| `settle_mode_id` | `productcenter.aa_settlemethodref` |
| `acc_year_id` | `finbd.bd_period` |
| `event_id` | `` |
| `amount_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `grp_exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `tax_subject_id` | `yonbip-fi-taxpubdoc.RefTable_839443ba26` |
| `acc_exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `enterprise_bank_account_id` | `ucfbasedoc.bd_enterprisebank` |
| `cost_center_id` | `finbd.bd_costcenterref` |
| `ap_subject_id` | `fiepub.fiepub_accsubjectref` |
| `ap_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `staff_id` | `ucf-staff-center.bd_staff_all_ref` |
| `free_ch_id` | `` |
| `dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `ytenant_id` | `` |
| `tax_code_id` | `yonbip-fi-taxpubdoc.RefTable_832e0ffa60` |
| `supplier_bank_account_id` | `yssupplier.aa_vendorbankref` |
| `cost_subject_id` | `fiepub.fiepub_accsubjectref` |
| `src_bill_type` | `ucfbasedoc.bd_billtypetreeref` |
| `bill_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `gbl_exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `acc_period_id` | `finbd.bd_period` |
| `` | `` |
| `note_type_id` | `drft.drft_billtyperef` |
| `settle_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `acc_book_id` | `fiepub.fiepub_accountbookref` |
| `enterprise_cash_account_id` | `ucfbasedoc.bd_enterprisecashacct` |
| `material_id` | `productcenter.pc_nomalproductref` |
| `ori_bill_type` | `ucfbasedoc.bd_billtypetreeref` |
| `opp_procenter_id` | `finbd.bd_allaccbodyref_inner` |

## 继承接口 (2个, 3字段)

- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 152 个直连字段

### 文本字段 (38个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_period_code` | `acc_period_code` | `accPeriodCode` | 会计期间编码 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年度编码 |
| `arap_event_type` | `arap_event_type` | `arapEventType` | 收付会计事务 |
| `bln_carryover` | `bln_carryover` | `blnCarryover` | 是否结转 |
| `body_id` | `body_id` | `body` | 明细ID |
| `carryover_body_id` | `carryover_body_id` | `carryoverBody` | 结转事务行 |
| `carryover_event_id` | `carryover_event_id` | `carryoverEvent` | 结转事务 |
| `carryover_grandson_id` | `carryover_grandson_id` | `carryoverGrandson` | 结转事务孙Id |
| `carryover_period_id` | `carryover_period_id` | `carryoverPeriod` | 结转期间 |
| `carryover_period_code` | `carryover_period_code` | `carryoverPeriodCode` | 结转期间编码 |
| `carryover_year_id` | `carryover_year_id` | `carryoverYear` | 结转年度 |
| `carryover_year_code` | `carryover_year_code` | `carryoverYearCode` | 结转年度编码 |
| `check_no` | `check_no` | `checkNo` | 勾兑号 |
| `contract_no` | `contract_no` | `contractNo` | 合同编号 |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | 全局事务ID |
| `event_type_id` | `event_type_id` | `eventType` | 会计事务 |
| `invoice_no` | `invoice_no` | `invoiceNo` | 发票编号 |
| `object_bank_account_no` | `object_bank_account_no` | `objectBankAccountNo` | 往来对象银行账号 |
| `order_no` | `order_no` | `orderNo` | 订单编号 |
| `ori_arap_event_type` | `ori_arap_event_type` | `oriArapEventType` | 源头事务类型 |
| `ori_bill_id` | `ori_bill_id` | `oriBillId` | 源头单据ID |
| `ori_bill_no` | `ori_bill_no` | `oriBillNo` | 源头单据号 |
| `ori_bill_row_id` | `ori_bill_row_id` | `oriBillRowId` | 源头单据行ID |
| `ori_grandson_id` | `ori_grandson_id` | `oriGrandsonId` | 源头孙表ID |
| `ori_bill_trade_type_id` | `ori_bill_trade_type_id` | `oriTradeType` | 源头单据交易类型 |
| `quick_type_code` | `quick_type_code` | `quickTypeCode` | 款项类型编码 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `src_arap_event_type` | `src_arap_event_type` | `srcArapEventType` | 来源收付会计事务 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据ID |
| `src_bill_no` | `src_bill_no` | `srcBillNo` | 来源单据号 |
| `src_bill_row_id` | `src_bill_row_id` | `srcBillRowId` | 来源单据行ID |
| `src_body_id` | `src_body_id` | `srcBody` | 来源明细ID |
| `src_event_id` | `src_event_id` | `srcEvent` | 来源事务ID |
| `src_grandson_id` | `src_grandson_id` | `srcGrandson` | 来源核算ID |
| `src_order_id` | `src_order_id` | `srcOrder` | 来源订单ID |
| `src_order_row_id` | `src_order_row_id` | `srcOrderRow` | 来源订单行ID |
| `src_order_type_id` | `src_order_type_id` | `srcOrderType` | 来源订单类型 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (46个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `event_id` | `event_id` | `event` | 期初付款退款主表 |
| `tax_code_id` | `tax_code_id` | `taxCode` | 税码(租户) |
| `activity` | `activity` | `activity` | 活动 |
| `wbs` | `wbs` | `wbs` | WBS |
| `whtax_id` | `whtax_id` | `whtax` | 代扣税税码 |
| `acc_book_id` | `acc_book_id` | `accBook` | 财务账簿ID |
| `acc_exchange_rate_type_id` | `acc_exchange_rate_type_id` | `accExchangeRateType` | 汇率类型 |
| `acc_period_id` | `acc_period_id` | `accPeriod` | 会计期间ID |
| `acc_year_id` | `acc_year_id` | `accYear` | 会计年度ID |
| `amount_org_id` | `amount_org_id` | `amountOrg` | 付款组织 |
| `ap_subject_id` | `ap_subject_id` | `apSubject` | 应付账款科目 |
| `ap_subject_vid` | `ap_subject_vid` | `apSubjectVid` | 应付账款科目版本 |
| `bill_org_id` | `bill_org_id` | `billOrg` | 收票组织 |
| `cost_center_id` | `cost_center_id` | `costCenter` | 成本中心 |
| `cost_subject_id` | `cost_subject_id` | `costSubject` | 费用科目 |
| `cost_subject_vid` | `cost_subject_vid` | `costSubjectVid` | 费用科目版本 |
| `dept_id` | `dept_id` | `dept` | 部门 |
| `employee_bank_account_id` | `employee_bank_account_id` | `employeeBankAccount` | 员工银行账户 |
| `enterprise_bank_account_id` | `enterprise_bank_account_id` | `enterpriseBankAccount` | 企业银行账户 |
| `enterprise_cash_account_id` | `enterprise_cash_account_id` | `enterpriseCashAccount` | 企业现金账户 |
| `expense_item_id` | `expense_item_id` | `expenseItem` | 费用项目 |
| `finance_org_id` | `finance_org_id` | `financeOrg` | 会计主体ID |
| `funder_bank_account_id` | `funder_bank_account_id` | `funderBankAccount` | 资金业务对象银行账户 |
| `gbl_exchange_rate_type_id` | `gbl_exchange_rate_type_id` | `gblExchangeRateType` | 全局币汇率类型 |
| `grp_exchange_rate_type_id` | `grp_exchange_rate_type_id` | `grpExchangeRateType` | 集团币汇率类型 |
| `inventory_org_id` | `inventory_org_id` | `inventoryOrg` | 库存组织 |
| `material_id` | `material_id` | `material` | 物料 |
| `note_no_id` | `note_no_id` | `noteNo` | 票据号 |
| `note_type_id` | `note_type_id` | `noteType` | 票据类型 |
| `opp_procenter_id` | `opp_procenter_id` | `oppProCenter` | 对方利润中心 |
| `org_exchange_rate_type_id` | `org_exchange_rate_type_id` | `orgExchangeRateType` | 组织币汇率类型 |
| `ori_bill_type` | `ori_bill_type` | `oriBillType` | 源头单据类型 |
| `ori_currency_id` | `ori_currency_id` | `oriCurrency` | 原币 |
| `procenter_id` | `procenter_id` | `proCenter` | 利润中心 |
| `project_id` | `project_id` | `project` | 项目 |
| `quick_type_id` | `quick_type_id` | `quickType` | 款项类型 |
| `settle_mode_id` | `settle_mode_id` | `settleMode` | 结算方式 |
| `settle_subject_id` | `settle_subject_id` | `settleSubject` | 资金结算科目 |
| `settle_subject_vid` | `settle_subject_vid` | `settleSubjectVid` | 资金结算科目版本 |
| `src_bill_type` | `src_bill_type` | `srcBillType` | 来源单据类型 |
| `staff_id` | `staff_id` | `staff` | 业务员 |
| `supplier_bank_account_id` | `supplier_bank_account_id` | `supplierBankAccount` | 供应商银行账户 |
| `tax_subject_id` | `tax_subject_id` | `taxSubject` | 税目 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `clear_time` | `clear_time` | `clearTime` | 清账时间 |
| `exchange_rate_date` | `exchange_rate_date` | `exchangeRateDate` | 汇率日期 |
| `expire_date` | `expire_date` | `expireDate` | 到期日 |
| `local_clear_time` | `local_clear_time` | `localClearTime` | 本币清账时间 |
| `note_date` | `note_date` | `noteDate` | 票据日期 |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `settle_date` | `settle_date` | `settleDate` | 结算时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_hangup` | `bln_hangup` | `blnHangUp` | 是否挂起 |
| `bln_prepare` | `bln_prepare` | `blnPrepare` | 是否预付 |

### 枚举字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_exchange_rate_ops` | `acc_exchange_rate_ops` | `accExchangeRateOps` | 本币汇率折算方式 |
| `amount_direction` | `amount_direction` | `amountDirection` | 借贷方向 |
| `balance_state` | `balance_state` | `balanceState` | 清账状态 |
| `digest` | `digest` | `digest` | 处理摘要 |
| `gbl_exchange_rate_ops` | `gbl_exchange_rate_ops` | `gblExchangeRateOps` | 全局币汇率折算方式 |
| `grp_exchange_rate_ops` | `grp_exchange_rate_ops` | `grpExchangeRateOps` | 集团币汇率折算方式 |
| `local_balance_state` | `local_balance_state` | `localBalanceState` | 本币清账状态 |
| `org_exchange_rate_ops` | `org_exchange_rate_ops` | `orgExchangeRateOps` | 组织币汇率折算方式 |
| `settle_state` | `settle_state` | `settleState` | 结算状态 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dtc_status` | `dtc_status` | `dtcStatus` | 全局事务状态 |
| `issue_no` | `issue_no` | `issueNo` | 付款期号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (43个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_amount` | `acc_amount` | `accAmount` | 本币金额 |
| `acc_arap_amount` | `acc_arap_amount` | `accArapAmount` | 本币核算金额 |
| `acc_balance` | `acc_balance` | `accBalance` | 本币余额 |
| `acc_exchange_rate` | `acc_exchange_rate` | `accExchangeRate` | 汇率 |
| `acc_tax_amount` | `acc_tax_amount` | `accTaxAmount` | 本币税额 |
| `acc_tax_excluded_amount` | `acc_tax_excluded_amount` | `accTaxExcludedAmount` | 本币无税金额 |
| `acc_tax_included_amount` | `acc_tax_included_amount` | `accTaxIncludedAmount` | 本币付款金额 |
| `acc_whtax_amount` | `acc_whtax_amount` | `accWhtaxAmount` | 本币代扣税税额 |
| `gbl_amount` | `gbl_amount` | `gblAmount` | 全局币金额 |
| `gbl_arap_amount` | `gbl_arap_amount` | `gblArapAmount` | 全局币核算金额 |
| `gbl_balance` | `gbl_balance` | `gblBalance` | 全局币余额 |
| `gbl_exchange_rate` | `gbl_exchange_rate` | `gblExchangeRate` | 全局币汇率 |
| `gbl_tax_amount` | `gbl_tax_amount` | `gblTaxAmount` | 全局币税额 |
| `gbl_tax_excluded_amount` | `gbl_tax_excluded_amount` | `gblTaxExcludedAmount` | 全局币无税金额 |
| `gbl_tax_included_amount` | `gbl_tax_included_amount` | `gblTaxIncludedAmount` | 全局币含税金额 |
| `gbl_whtax_amount` | `gbl_whtax_amount` | `gblWhtaxAmount` | 全局币代扣税税额 |
| `grp_amount` | `grp_amount` | `grpAmount` | 集团币金额 |
| `grp_arap_amount` | `grp_arap_amount` | `grpArapAmount` | 集团币核算金额 |
| `grp_balance` | `grp_balance` | `grpBalance` | 集团币余额 |
| `grp_exchange_rate` | `grp_exchange_rate` | `grpExchangeRate` | 集团币汇率 |
| `grp_tax_amount` | `grp_tax_amount` | `grpTaxAmount` | 集团币税额 |
| `grp_tax_excluded_amount` | `grp_tax_excluded_amount` | `grpTaxExcludedAmount` | 集团币无税金额 |
| `grp_tax_included_amount` | `grp_tax_included_amount` | `grpTaxIncludedAmount` | 集团币含税金额 |
| `grp_whtax_amount` | `grp_whtax_amount` | `grpWhtaxAmount` | 集团币代扣税税额 |
| `org_amount` | `org_amount` | `orgAmount` | 组织币金额 |
| `org_arap_amount` | `org_arap_amount` | `orgArapAmount` | 组织币核算金额 |
| `org_balance` | `org_balance` | `orgBalance` | 组织币余额 |
| `org_exchange_rate` | `org_exchange_rate` | `orgExchangeRate` | 组织币汇率 |
| `org_tax_amount` | `org_tax_amount` | `orgTaxAmount` | 组织币税额 |
| `org_tax_excluded_amount` | `org_tax_excluded_amount` | `orgTaxExcludedAmount` | 组织币无税金额 |
| `org_tax_included_amount` | `org_tax_included_amount` | `orgTaxIncludedAmount` | 组织币含税金额 |
| `org_whtax_amount` | `org_whtax_amount` | `orgWhtaxAmount` | 组织币代扣税税额 |
| `ori_amount` | `ori_amount` | `oriAmount` | 金额 |
| `ori_arap_amount` | `ori_arap_amount` | `oriArapAmount` | 核算金额 |
| `ori_balance` | `ori_balance` | `oriBalance` | 余额 |
| `ori_ocupy_amount` | `ori_ocupy_amount` | `oriOcupyAmount` | 预占用金额 |
| `ori_tax_amount` | `ori_tax_amount` | `oriTaxAmount` | 税额 |
| `ori_tax_excluded_amount` | `ori_tax_excluded_amount` | `oriTaxExcludedAmount` | 无税金额 |
| `ori_tax_included_amount` | `ori_tax_included_amount` | `oriTaxIncludedAmount` | 付款金额 |
| `ori_whtax_amount` | `ori_whtax_amount` | `oriWhtaxAmount` | 代扣税税额 |
| `row_no` | `row_no` | `rowNo` | 行号 |
| `src_order_row_no` | `src_order_row_no` | `srcOrderRowNo` | 来源订单行号 |
| `tax_rate` | `tax_rate` | `taxRate` | 税率 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义特征 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `taxGrandsonItem` | 计税单 |
