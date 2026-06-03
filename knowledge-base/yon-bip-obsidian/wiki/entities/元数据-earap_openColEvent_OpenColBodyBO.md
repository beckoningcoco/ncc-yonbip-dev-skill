---
tags: [BIP, 元数据, 数据字典, earap.openColEvent.OpenColBodyBO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 期初收款明细信息 (`earap.openColEvent.OpenColBodyBO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_ledger_b` | domain：`yonbip-fi-earap` | 应用：`EAR` | 业务对象ID：`a3f2fe0b-477e-44fe-8df5-4da6086e533f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 期初收款明细信息 |
| 物理表 | `arap_ledger_b` |
| 数据库 schema | `yonbip-fi-earap` |
| 所属应用 | `EAR` |
| 直连字段 | 155 个 |
| 子表 | 1 个 |
| 关联引用 | 51 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `taxGrandsonItem` | `earap.openColEvent.OpenColBOTaxCalculationResult` | composition |

## 关联引用 (51个)

| 字段名 | 引用类型 |
|--------|---------|
| `org_exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `ori_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `src_order_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `finance_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `whtax_id` | `` |
| `employee_bank_account_id` | `ucf-staff-center.bd_staffbankaccref` |
| `wbs` | `` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |
| `inventory_org_id` | `ucf-org-center.bd_inventoryorg` |
| `ar_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `settle_subject_id` | `fiepub.fiepub_accsubjectref` |
| `acc_year_id` | `finbd.bd_period` |
| `customer_bank_account_id` | `productcenter.aa_merchantagentfinancialref` |
| `grp_exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `tax_subject_id` | `yonbip-fi-taxpubdoc.RefTable_839443ba26` |
| `cost_center_id` | `finbd.bd_costcenterref` |
| `enterprise_bank_account_id` | `ucfbasedoc.bd_enterprisebank` |
| `carryover_year_id` | `finbd.bd_period` |
| `free_ch_id` | `` |
| `event_type_id` | `yonbip-fi-eaai2.RefTable_a70ca2f048` |
| `ytenant_id` | `` |
| `tax_code_id` | `yonbip-fi-taxpubdoc.RefTable_832e0ffa60` |
| `ar_subject_id` | `fiepub.fiepub_accsubjectref` |
| `bill_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `` | `` |
| `settle_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `acc_book_id` | `fiepub.fiepub_accountbookref` |
| `opp_procenter_id` | `finbd.bd_allaccbodyref_inner` |
| `verify_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `expense_item_id` | `yonyoufi.bd_expenseitemref` |
| `procenter_id` | `finbd.bd_allaccbodyref_inner` |
| `activity` | `` |
| `quick_type_id` | `finbd.bd_paymenttyperef` |
| `cost_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `funder_bank_account_id` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobjbank_Ref` |
| `note_no_id` | `drft.drft_billnoref` |
| `settle_mode_id` | `productcenter.aa_settlemethodref` |
| `event_id` | `` |
| `amount_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `acc_exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `carryover_period_id` | `finbd.bd_period` |
| `staff_id` | `ucf-staff-center.bd_staff_all_ref` |
| `dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `cost_subject_id` | `fiepub.fiepub_accsubjectref` |
| `gbl_exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `acc_period_id` | `finbd.bd_period` |
| `note_type_id` | `drft.drft_billtyperef` |
| `enterprise_cash_account_id` | `ucfbasedoc.bd_enterprisecashacct` |
| `material_id` | `productcenter.pc_nomalproductref` |

## 继承接口 (2个, 3字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`

## 字段列表（按类型分组）

> 共 155 个直连字段

### 文本字段 (34个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_period_code` | `acc_period_code` | `accPeriodCode` | 会计期间编码 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年度编码 |
| `body_id` | `body_id` | `body` | 明细ID |
| `carryover_body_id` | `carryover_body_id` | `carryoverBody` | 结转事务行 |
| `carryover_event_id` | `carryover_event_id` | `carryoverEvent` | 结转事务 |
| `carryover_grandson_id` | `carryover_grandson_id` | `carryoverGrandson` | 结转事务孙ID |
| `carryover_period_code` | `carryover_period_code` | `carryoverPeriodCode` | 结转期间编码 |
| `carryover_year_code` | `carryover_year_code` | `carryoverYearCode` | 结转年度编码 |
| `check_no` | `check_no` | `checkNo` | 勾兑号 |
| `contract_no` | `contract_no` | `contractNo` | 合同编号 |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | 全局事务ID |
| `id` | `id` | `id` | 主键 |
| `invoice_no` | `invoice_no` | `invoiceNo` | 发票编号 |
| `object_bank_account_no` | `object_bank_account_no` | `objectBankAccountNo` | 往来对象银行账号 |
| `order_no` | `order_no` | `orderNo` | 订单编号 |
| `ori_arap_event_type` | `ori_arap_event_type` | `oriArapEventType` | 源头事务类型 |
| `ori_bill_id` | `ori_bill_id` | `oriBillId` | 源头单据ID |
| `ori_bill_no` | `ori_bill_no` | `oriBillNo` | 源头单据号 |
| `ori_bill_row_id` | `ori_bill_row_id` | `oriBillRowId` | 源头单据行ID |
| `ori_bill_type` | `ori_bill_type` | `oriBillType` | 源头单据类型 |
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
| `src_exe_detail_id` | `src_exe_detail_id` | `srcExeDetailId` | 来源单据执行明细id |
| `src_grandson_id` | `src_grandson_id` | `srcGrandson` | 来源核算ID |
| `src_order_id` | `src_order_id` | `srcOrderId` | 来源订单主表ID |
| `src_order_row_id` | `src_order_row_id` | `srcOrderRowId` | 来源订单子表ID |

### 引用字段 (49个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_book_id` | `acc_book_id` | `accBook` | 财务账簿ID |
| `acc_exchange_rate_type_id` | `acc_exchange_rate_type_id` | `accExchangeRateType` | 汇率类型 |
| `acc_period_id` | `acc_period_id` | `accPeriod` | 会计期间ID |
| `acc_year_id` | `acc_year_id` | `accYear` | 会计年度ID |
| `activity` | `activity` | `activity` | 活动 |
| `amount_org_id` | `amount_org_id` | `amountOrg` | 收款组织 |
| `ar_subject_id` | `ar_subject_id` | `arSubject` | 应收账款科目 |
| `ar_subject_vid` | `ar_subject_vid` | `arSubjectVid` | 应收账款科目版本 |
| `bill_org_id` | `bill_org_id` | `billOrg` | 开票组织 |
| `carryover_period_id` | `carryover_period_id` | `carryoverPeriod` | 结转期间ID |
| `carryover_year_id` | `carryover_year_id` | `carryoverYear` | 结转年度ID |
| `cost_center_id` | `cost_center_id` | `costCenter` | 成本中心 |
| `cost_subject_id` | `cost_subject_id` | `costSubject` | 费用科目 |
| `cost_subject_vid` | `cost_subject_vid` | `costSubjectVid` | 费用科目版本 |
| `creator` | `creator` | `creator` | 创建人 |
| `customer_bank_account_id` | `customer_bank_account_id` | `customerBankAccount` | 客户银行账户 |
| `dept_id` | `dept_id` | `dept` | 部门 |
| `employee_bank_account_id` | `employee_bank_account_id` | `employeeBankAccount` | 员工银行账户 |
| `enterprise_bank_account_id` | `enterprise_bank_account_id` | `enterpriseBankAccount` | 企业银行账户 |
| `enterprise_cash_account_id` | `enterprise_cash_account_id` | `enterpriseCashAccount` | 企业现金账户 |
| `event_id` | `event_id` | `event` | 外键 |
| `event_type_id` | `event_type_id` | `eventType` | 会计事务 |
| `expense_item_id` | `expense_item_id` | `expenseItem` | 费用项目 |
| `finance_org_id` | `finance_org_id` | `financeOrg` | 会计主体ID |
| `funder_bank_account_id` | `funder_bank_account_id` | `funderBankAccount` | 资金业务对象账户 |
| `gbl_exchange_rate_type_id` | `gbl_exchange_rate_type_id` | `gblExchangeRateType` | 全局币汇率类型 |
| `grp_exchange_rate_type_id` | `grp_exchange_rate_type_id` | `grpExchangeRateType` | 集团币汇率类型 |
| `inventory_org_id` | `inventory_org_id` | `inventoryOrg` | 库存组织 |
| `material_id` | `material_id` | `material` | 物料 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `note_no_id` | `note_no_id` | `noteNo` | 票据号 |
| `note_type_id` | `note_type_id` | `noteType` | 票据类型 |
| `opp_procenter_id` | `opp_procenter_id` | `oppProCenter` | 对方利润中心 |
| `org_exchange_rate_type_id` | `org_exchange_rate_type_id` | `orgExchangeRateType` | 组织币汇率类型 |
| `ori_currency_id` | `ori_currency_id` | `oriCurrency` | 原币 |
| `procenter_id` | `procenter_id` | `proCenter` | 利润中心 |
| `project_id` | `project_id` | `project` | 项目 |
| `quick_type_id` | `quick_type_id` | `quickType` | 款项类型 |
| `settle_mode_id` | `settle_mode_id` | `settleMode` | 结算方式 |
| `settle_subject_id` | `settle_subject_id` | `settleSubject` | 资金结算科目 |
| `settle_subject_vid` | `settle_subject_vid` | `settleSubjectVid` | 资金结算科目版本 |
| `src_order_type_id` | `src_order_type_id` | `srcOrderType` | 来源订单类型 |
| `staff_id` | `staff_id` | `staff` | 业务员 |
| `tax_code_id` | `tax_code_id` | `taxCode` | 税码(租户) |
| `tax_subject_id` | `tax_subject_id` | `taxSubject` | 税目 |
| `verify_currency_id` | `verify_currency_id` | `verifyCurrency` | 应核销币种 |
| `wbs` | `wbs` | `wbs` | WBS |
| `whtax_id` | `whtax_id` | `whtax` | 代扣税税码 |
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
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `settle_date` | `settle_date` | `settleDate` | 结算时间 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_hangup` | `bln_hangup` | `blnHangUp` | 是否挂起 |
| `bln_prepare` | `bln_prepare` | `blnPrepare` | 是否预收 |

### 枚举字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_exchange_rate_ops` | `acc_exchange_rate_ops` | `accExchangeRateOps` | 本币汇率折算方式 |
| `amount_direction` | `amount_direction` | `amountDirection` | 借贷方向 |
| `arap_event_type` | `arap_event_type` | `arapEventType` | 收付会计事务 |
| `balance_state` | `balance_state` | `balanceState` | 清账状态 |
| `digest` | `digest` | `digest` | 处理摘要 |
| `gbl_exchange_rate_ops` | `gbl_exchange_rate_ops` | `gblExchangeRateOps` | 全局币汇率折算方式 |
| `grp_exchange_rate_ops` | `grp_exchange_rate_ops` | `grpExchangeRateOps` | 集团币汇率折算方式 |
| `local_balance_state` | `local_balance_state` | `localBalanceState` | 本币清账状态 |
| `org_exchange_rate_ops` | `org_exchange_rate_ops` | `orgExchangeRateOps` | 组织币汇率折算方式 |
| `settle_state` | `settle_state` | `settleState` | 结算状态 |
| `src_bill_type` | `src_bill_type` | `srcBillType` | 业务事项 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_carryover` | `bln_carryover` | `blnCarryover` | 是否结转 |
| `dtc_status` | `dtc_status` | `dtcStatus` | 全局事务状态 |
| `issue_no` | `issue_no` | `issueNo` | 收款期号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (44个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_amount` | `acc_amount` | `accAmount` | 本币金额 |
| `acc_arap_amount` | `acc_arap_amount` | `accArapAmount` | 本币核算金额 |
| `acc_balance` | `acc_balance` | `accBalance` | 本币余额 |
| `acc_exchange_rate` | `acc_exchange_rate` | `accExchangeRate` | 汇率 |
| `acc_tax_amount` | `acc_tax_amount` | `accTaxAmount` | 本币税额 |
| `acc_tax_excluded_amount` | `acc_tax_excluded_amount` | `accTaxExcludedAmount` | 本币无税金额 |
| `acc_tax_included_amount` | `acc_tax_included_amount` | `accTaxIncludedAmount` | 本币收款金额 |
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
| `ori_tax_included_amount` | `ori_tax_included_amount` | `oriTaxIncludedAmount` | 收款金额 |
| `ori_whtax_amount` | `ori_whtax_amount` | `oriWhtaxAmount` | 代扣税税额 |
| `row_no` | `row_no` | `rowNo` | 行号 |
| `src_order_row_no` | `src_order_row_no` | `srcOrderRowNo` | 来源订单行号 |
| `tax_rate` | `tax_rate` | `taxRate` | 税率 |
| `verify_amount` | `verify_amount` | `verifyAmount` | 应核销金额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义特征 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `taxGrandsonItem` | 计税单 |
