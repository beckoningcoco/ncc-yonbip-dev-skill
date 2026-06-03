---
tags: [BIP, 元数据, 数据字典, FIAR.FIAR.arVerifytBody]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 应收核销查询分组信息 (`FIAR.FIAR.arVerifytBody`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_ledger_b` | domain：`yonbip-fi-earap` | 应用：`EAR` | 业务对象ID：`df67a357-bdba-43e7-99e3-074a9c204c6a`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 应收核销查询分组信息 |
| 物理表 | `arap_ledger_b` |
| 数据库 schema | `yonbip-fi-earap` |
| 所属应用 | `EAR` |
| 直连字段 | 191 个 |
| 子表 | 1 个 |
| 关联引用 | 72 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `grandsonItem` | `FIAR.FIAR.arVerifyPlan` | composition |

## 关联引用 (72个)

| 字段名 | 引用类型 |
|--------|---------|
| `org_exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `ori_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `finance_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `quick_type_code` | `fiepub.fiepub_accsubjectref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `whtax_id` | `` |
| `employee_bank_account_id` | `ucf-staff-center.bd_staffbankaccref` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |
| `wbs` | `` |
| `purchase_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `inventory_org_id` | `ucf-org-center.bd_inventoryorg` |
| `note_no_id` | `drft.drft_billnoref` |
| `settle_subject_id` | `fiepub.fiepub_accsubjectref` |
| `acc_year_id` | `finbd.bd_period` |
| `invoice_type_id` | `ucfbasedoc.bd_invoiceref` |
| `tax_out_buff_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `customer_bank_account_id` | `productcenter.aa_merchantagentfinancialref` |
| `src_body_id` | `` |
| `grp_exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `tax_subject_id` | `ucfbasedoc.bd_taxrate` |
| `cost_center_id` | `finbd.bd_costcenterref` |
| `enterprise_bank_account_id` | `ucfbasedoc.bd_enterprisebank` |
| `carryover_year_id` | `` |
| `prepare_subject_id` | `fiepub.fiepub_accsubjectref` |
| `event_type_id` | `yonbip-fi-eaai2.RefTable_a70ca2f048` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `bill_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `` | `` |
| `settle_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `unit_id` | `productcenter.pc_unitref` |
| `acc_book_id` | `fiepub.fiepub_accountbookref` |
| `src_event_id` | `` |
| `tax_out_subject_id` | `fiepub.fiepub_accsubjectref` |
| `opp_procenter_id` | `finbd.bd_allaccbodyref_inner` |
| `verify_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `receive_agreement_id` | `ucfbasedoc.bd_receiveagreementref` |
| `expense_item_id` | `yonyoufi.bd_expenseitemref` |
| `procenter_id` | `finbd.bd_allaccbodyref_inner` |
| `tax_in_buff_subject_id` | `fiepub.fiepub_accsubjectref` |
| `activity` | `` |
| `quick_type_id` | `finbd.bd_paymenttyperef` |
| `cost_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `funder_bank_account_id` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobjbank_Ref` |
| `income_buff_subject_id` | `fiepub.fiepub_accsubjectref` |
| `settle_mode_id` | `productcenter.aa_settlemethodref` |
| `prepare_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `tax_in_buff_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `tax_out_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `event_id` | `` |
| `amount_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `income_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `acc_exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `prov_ratio_row_id` | `yonbip-fi-earap.RefTable_697e153746` |
| `tax_in_subject_id` | `fiepub.fiepub_accsubjectref` |
| `carryover_period_id` | `` |
| `staff_id` | `ucf-staff-center.bd_staff_all_ref` |
| `dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `supplier_bank_account_id` | `yssupplier.aa_vendorbankref` |
| `cost_subject_id` | `fiepub.fiepub_accsubjectref` |
| `income_buff_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `gbl_exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `purchase_subject_id` | `fiepub.fiepub_accsubjectref` |
| `acc_period_id` | `finbd.bd_period` |
| `note_type_id` | `drft.drft_billtyperef` |
| `pay_agreement_id` | `ucfbasedoc.bd_payagreementref` |
| `material_id` | `productcenter.pc_nomalproductref` |
| `enterprise_cash_account_id` | `ucfbasedoc.bd_enterprisecashacct` |
| `tax_out_buff_subject_id` | `fiepub.fiepub_accsubjectref` |
| `income_subject_id` | `fiepub.fiepub_accsubjectref` |
| `tax_in_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 191 个直连字段

### 文本字段 (45个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_period_code` | `acc_period_code` | `accPeriodCode` | 会计期间编码 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年度编码 |
| `arap_event_type` | `arap_event_type` | `arapEventType` | 收付会计事务类型 |
| `bizflowinstance_id` | `bizflowinstance_id` | `bizFlowInstanceId` | 业务流实例id |
| `bizflow_makebillcode` | `bizflow_makebillcode` | `bizFlowMakeBillCode` | 单据转换规则编码 |
| `bizflow_id` | `bizflow_id` | `bizflowId` | 业务流id |
| `bizflowname` | `bizflowname` | `bizflowName` | 流程名称 |
| `carryover_body_id` | `carryover_body_id` | `carryoverBody` | 结转事务行 |
| `carryover_event_id` | `carryover_event_id` | `carryoverEvent` | 结转事务 |
| `carryover_period_code` | `carryover_period_code` | `carryoverPeriodCode` | 结转期间编码 |
| `carryover_year_code` | `carryover_year_code` | `carryoverYearCode` | 结转年度编码 |
| `contract_no` | `contract_no` | `contractNo` | 合同号 |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | 全局分布式事务ID |
| `exchange_rate_date` | `exchange_rate_date` | `exchangeRateDate` | 汇率日期 |
| `firstbusiobj` | `firstbusiobj` | `firstBusiObj` | 来源业务对象 |
| `firstchild_id` | `firstchild_id` | `firstChildId` | 来源单据子表id |
| `firstcode` | `firstcode` | `firstCode` | 来源单据号 |
| `first_id` | `first_id` | `firstId` | 来源单据主表id |
| `id` | `id` | `id` | 主键 |
| `invoice_date` | `invoice_date` | `invoiceDate` | 发票日期 |
| `invoice_no` | `invoice_no` | `invoiceNo` | 发票号 |
| `note_date` | `note_date` | `noteDate` | 票据日期 |
| `note_no` | `note_no` | `noteNo` | 票据号 |
| `object_bank_account_no` | `object_bank_account_no` | `objectBankAccountNo` | 往来对象银行账号 |
| `opp_bill_id` | `opp_bill_id` | `oppBillId` | 对应单据ID |
| `opp_bill_row_id` | `opp_bill_row_id` | `oppBillRowId` | 对应单据行ID |
| `order_no` | `order_no` | `orderNo` | 订单号 |
| `ori_bill_id` | `ori_bill_id` | `oriBillId` | 源头单据ID |
| `ori_bill_no` | `ori_bill_no` | `oriBillNo` | 源头单据号 |
| `ori_bill_row_id` | `ori_bill_row_id` | `oriBillRowId` | 源头单据行ID |
| `ori_bill_type` | `ori_bill_type` | `oriBillType` | 源头单据类型 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `sourcebusiobj` | `sourcebusiobj` | `sourceBusiObj` | 上游业务对象 |
| `sourcechild_id` | `sourcechild_id` | `sourceChildId` | 上游单据子表id |
| `sourcecode` | `sourcecode` | `sourceCode` | 上游单据号 |
| `sourcegrand_id` | `sourcegrand_id` | `sourceGrandId` | 来源孙表id |
| `source_id` | `source_id` | `sourceId` | 上游单据主表id |
| `src_arap_event_type` | `src_arap_event_type` | `srcArapEventType` | 来源事务类型 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据ID |
| `src_bill_no` | `src_bill_no` | `srcBillNo` | 来源单据号 |
| `src_bill_row_id` | `src_bill_row_id` | `srcBillRowId` | 来源单据行ID |
| `src_bill_type` | `src_bill_type` | `srcBillType` | 来源单据类型 |
| `src_order_id` | `src_order_id` | `srcOrderId` | 来源订单主表ID |
| `src_order_row_id` | `src_order_row_id` | `srcOrderRowId` | 来源订单子表id(确认应付用) |
| `src_order_type_id` | `src_order_type_id` | `srcOrderType` | 来源订单类型id(确认应付用) |

### 引用字段 (70个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_book_id` | `acc_book_id` | `accBook` | 财务账簿 |
| `acc_exchange_rate_type_id` | `acc_exchange_rate_type_id` | `accExchangeRateType` | 汇率类型 |
| `acc_period_id` | `acc_period_id` | `accPeriod` | 会计期间ID |
| `acc_year_id` | `acc_year_id` | `accYear` | 会计年度ID |
| `activity` | `activity` | `activity` | 活动 |
| `amount_org_id` | `amount_org_id` | `amountOrg` | 收款组织 |
| `bill_org_id` | `bill_org_id` | `billOrg` | 开票组织 |
| `carryover_period_id` | `carryover_period_id` | `carryoverPeriod` | 结转期间 |
| `carryover_year_id` | `carryover_year_id` | `carryoverYear` | 结转年度 |
| `cost_center_id` | `cost_center_id` | `costCenter` | 成本中心 |
| `cost_subject_id` | `cost_subject_id` | `costSubject` | 费用科目 |
| `cost_subject_vid` | `cost_subject_vid` | `costSubjectVid` | 费用科目版本 |
| `creator` | `creator` | `creator` | 创建人 |
| `customer_bank_account_id` | `customer_bank_account_id` | `customerBankAccount` | 客户银行账户 |
| `dept_id` | `dept_id` | `dept` | 部门 |
| `employee_bank_account_id` | `employee_bank_account_id` | `employeeBankAccount` | 员工银行账户 |
| `enterprise_bank_account_id` | `enterprise_bank_account_id` | `enterpriseBankAccount` | 企业银行账户 |
| `enterprise_cash_account_id` | `enterprise_cash_account_id` | `enterpriseCashAccount` | 企业现金账户 |
| `event_id` | `event_id` | `event` | 应收核销 |
| `event_type_id` | `event_type_id` | `eventType` | 会计事务 |
| `expense_item_id` | `expense_item_id` | `expenseItem` | 费用项目 |
| `finance_org_id` | `finance_org_id` | `financeOrg` | 会计主体 |
| `funder_bank_account_id` | `funder_bank_account_id` | `funderBankAccount` | 资金业务对象账户 |
| `gbl_exchange_rate_type_id` | `gbl_exchange_rate_type_id` | `gblExchangeRateType` | 全局币汇率类型 |
| `grp_exchange_rate_type_id` | `grp_exchange_rate_type_id` | `grpExchangeRateType` | 集团币汇率类型 |
| `income_buff_subject_id` | `income_buff_subject_id` | `incomeBuffSubject` | 收入中转科目 |
| `income_buff_subject_vid` | `income_buff_subject_vid` | `incomeBuffSubjectVid` | 收入中转科目版本 |
| `income_subject_id` | `income_subject_id` | `incomeSubject` | 收入科目 |
| `income_subject_vid` | `income_subject_vid` | `incomeSubjectVid` | 收入科目版本 |
| `inventory_org_id` | `inventory_org_id` | `inventoryOrg` | 库存组织 |
| `invoice_type_id` | `invoice_type_id` | `invoiceType` | 发票类型 |
| `material_id` | `material_id` | `material` | 物料 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `note_no_id` | `note_no_id` | `noteNoObj` | 票据号ID |
| `note_type_id` | `note_type_id` | `noteType` | 票据类型 |
| `opp_procenter_id` | `opp_procenter_id` | `oppProCenter` | 对方利润中心 |
| `org_exchange_rate_type_id` | `org_exchange_rate_type_id` | `orgExchangeRateType` | 组织币汇率类型 |
| `ori_currency_id` | `ori_currency_id` | `oriCurrency` | 币种 |
| `pay_agreement_id` | `pay_agreement_id` | `payAgreement` | 付款协议 |
| `prepare_subject_id` | `prepare_subject_id` | `prepareSubject` | 坏账准备科目 |
| `prepare_subject_vid` | `prepare_subject_vid` | `prepareSubjectVid` | 坏账准备科目版本 |
| `procenter_id` | `procenter_id` | `proCenter` | 利润中心 |
| `project_id` | `project_id` | `project` | 项目 |
| `prov_ratio_row_id` | `prov_ratio_row_id` | `provRatioRow` | 坏账计提比率子表ID |
| `purchase_subject_id` | `purchase_subject_id` | `purchaseSubject` | 材料采购科目 |
| `purchase_subject_vid` | `purchase_subject_vid` | `purchaseSubjectVid` | 材料采购科目版本 |
| `quick_type_id` | `quick_type_id` | `quickType` | 款项类型 |
| `quick_type_code` | `quick_type_code` | `quickTypeCode` | 款项类型编码 |
| `receive_agreement_id` | `receive_agreement_id` | `receiveAgreement` | 收款协议 |
| `settle_mode_id` | `settle_mode_id` | `settleMode` | 结算方式 |
| `settle_subject_id` | `settle_subject_id` | `settleSubject` | 资金结算科目 |
| `settle_subject_vid` | `settle_subject_vid` | `settleSubjectVid` | 资金结算科目版本 |
| `src_body_id` | `src_body_id` | `srcBody` | 来源明细ID |
| `src_event_id` | `src_event_id` | `srcEvent` | 来源事务ID |
| `staff_id` | `staff_id` | `staff` | 业务员 |
| `supplier_bank_account_id` | `supplier_bank_account_id` | `supplierBankAccount` | 供应商银行账户 |
| `tax_in_buff_subject_id` | `tax_in_buff_subject_id` | `taxInBuffSubject` | 进项税中转入科目 |
| `tax_in_buff_subject_vid` | `tax_in_buff_subject_vid` | `taxInBuffSubjectVid` | 应交进项税中转科目 |
| `tax_in_subject_id` | `tax_in_subject_id` | `taxInSubject` | 应交进项税科目 |
| `tax_in_subject_vid` | `tax_in_subject_vid` | `taxInSubjectVid` | 应交进项税 |
| `tax_out_buff_subject_id` | `tax_out_buff_subject_id` | `taxOutBuffSubject` | 进项税中转科目 |
| `tax_out_buff_subject_vid` | `tax_out_buff_subject_vid` | `taxOutBuffSubjectVid` | 销项税中转科目版本 |
| `tax_out_subject_id` | `tax_out_subject_id` | `taxOutSubject` | 应交销项税科目 |
| `tax_out_subject_vid` | `tax_out_subject_vid` | `taxOutSubjectVid` | 应交销项税科目版本 |
| `tax_subject_id` | `tax_subject_id` | `taxSubject` | 税目 |
| `unit_id` | `unit_id` | `unit` | 单位 |
| `verify_currency_id` | `verify_currency_id` | `verifyCurrency` | 应核销币种 |
| `wbs` | `wbs` | `wbs` | WBS |
| `whtax_id` | `whtax_id` | `whtax` | 代扣税税码 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

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
| `bln_baddebt_gain` | `bln_baddebt_gain` | `blnBaddebtGain` | 坏账收回(0:否; 1:是) |
| `bln_deduct_tax` | `bln_deduct_tax` | `blnDeductTax` | 税额可抵扣标识 |

### 枚举字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_exchange_rate_ops` | `acc_exchange_rate_ops` | `accExchangeRateOps` | 本币汇率折算方式 |
| `advance_bill_flag` | `advance_bill_flag` | `advanceBillFlag` | 预收款发票标识 |
| `deduct_tax_type` | `deduct_tax_type` | `deductTaxType` | 扣税类别 |
| `gbl_exchange_rate_ops` | `gbl_exchange_rate_ops` | `gblExchangeRateOps` | 全局币汇率折算方式 |
| `grp_exchange_rate_ops` | `grp_exchange_rate_ops` | `grpExchangeRateOps` | 集团币汇率折算方式 |
| `org_exchange_rate_ops` | `org_exchange_rate_ops` | `orgExchangeRateOps` | 组织币汇率折算方式 |
| `settle_state` | `settle_state` | `settleState` | 结算状态 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dtc_status` | `dtc_status` | `dtcStatus` | 分布式事务冻结状态 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_carryover` | `bln_carryover` | `blnCarryover` | 是否结转 |
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (58个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_arap_amount` | `acc_arap_amount` | `accArapAmount` | 本币核算金额 |
| `acc_balance` | `acc_balance` | `accBalance` | 本币余额 |
| `acc_exchange_rate` | `acc_exchange_rate` | `accExchangeRate` | 汇率 |
| `acc_non_deduct_tax` | `acc_non_deduct_tax` | `accNonDeductTax` | 本币不可抵扣税额 |
| `acc_tax_amount` | `acc_tax_amount` | `accTaxAmount` | 本币税额 |
| `acc_tax_excluded_amount` | `acc_tax_excluded_amount` | `accTaxExcludedAmount` | 本币无税金额 |
| `acc_tax_excluded_price` | `acc_tax_excluded_price` | `accTaxExcludedPrice` | 本币无税单价 |
| `acc_tax_included_amount` | `acc_tax_included_amount` | `accTaxIncludedAmount` | 本币含税金额 |
| `acc_tax_included_price` | `acc_tax_included_price` | `accTaxIncludedPrice` | 本币含税单价 |
| `acc_whtax_amount` | `acc_whtax_amount` | `accWhtaxAmount` | 本币代扣税税额 |
| `gbl_arap_amount` | `gbl_arap_amount` | `gblArapAmount` | 全局币核算金额 |
| `gbl_balance` | `gbl_balance` | `gblBalance` | 全局币余额 |
| `gbl_exchange_rate` | `gbl_exchange_rate` | `gblExchangeRate` | 全局币汇率 |
| `gbl_non_deduct_tax` | `gbl_non_deduct_tax` | `gblNonDeductTax` | 全局币不可抵扣税额 |
| `gbl_tax_amount` | `gbl_tax_amount` | `gblTaxAmount` | 全局币税额 |
| `gbl_tax_excluded_amount` | `gbl_tax_excluded_amount` | `gblTaxExcludedAmount` | 全局币无税金额 |
| `gbl_tax_excluded_price` | `gbl_tax_excluded_price` | `gblTaxExcludedPrice` | 全局币无税单价 |
| `gbl_tax_included_amount` | `gbl_tax_included_amount` | `gblTaxIncludedAmount` | 全局币含税金额 |
| `gbl_tax_included_price` | `gbl_tax_included_price` | `gblTaxIncludedPrice` | 全局币含税单价 |
| `gbl_whtax_amount` | `gbl_whtax_amount` | `gblWhtaxAmount` | 全局币代扣税税额 |
| `grp_arap_amount` | `grp_arap_amount` | `grpArapAmount` | 集团币核算金额 |
| `grp_balance` | `grp_balance` | `grpBalance` | 集团币余额 |
| `grp_exchange_rate` | `grp_exchange_rate` | `grpExchangeRate` | 集团币汇率 |
| `grp_non_deduct_tax` | `grp_non_deduct_tax` | `grpNonDeductTax` | 集团币不可抵扣税额 |
| `grp_tax_amount` | `grp_tax_amount` | `grpTaxAmount` | 集团币税额 |
| `grp_tax_excluded_amount` | `grp_tax_excluded_amount` | `grpTaxExcludedAmount` | 集团币无税金额 |
| `grp_tax_excluded_price` | `grp_tax_excluded_price` | `grpTaxExcludedPrice` | 集团币无税单价 |
| `grp_tax_included_amount` | `grp_tax_included_amount` | `grpTaxIncludedAmount` | 集团币含税金额 |
| `grp_tax_included_price` | `grp_tax_included_price` | `grpTaxIncludedPrice` | 集团币含税单价 |
| `grp_whtax_amount` | `grp_whtax_amount` | `grpWhtaxAmount` | 集团币代扣税税额 |
| `non_deduct_tax_rate` | `non_deduct_tax_rate` | `nonDeductTaxRate` | 不可抵扣税率 |
| `org_arap_amount` | `org_arap_amount` | `orgArapAmount` | 组织币核算金额 |
| `org_balance` | `org_balance` | `orgBalance` | 组织币余额 |
| `org_exchange_rate` | `org_exchange_rate` | `orgExchangeRate` | 组织币汇率 |
| `org_non_deduct_tax` | `org_non_deduct_tax` | `orgNonDeductTax` | 组织币不可抵扣税额 |
| `org_tax_amount` | `org_tax_amount` | `orgTaxAmount` | 组织币税额 |
| `org_tax_excluded_amount` | `org_tax_excluded_amount` | `orgTaxExcludedAmount` | 组织币无税金额 |
| `org_tax_excluded_price` | `org_tax_excluded_price` | `orgTaxExcludedPrice` | 组织币无税单价 |
| `org_tax_included_amount` | `org_tax_included_amount` | `orgTaxIncludedAmount` | 组织币含税金额 |
| `org_tax_included_price` | `org_tax_included_price` | `orgTaxIncludedPrice` | 组织币含税单价 |
| `org_whtax_amount` | `org_whtax_amount` | `orgWhtaxAmount` | 组织币代扣税税额 |
| `ori_arap_amount` | `ori_arap_amount` | `oriArapAmount` | 核算金额 |
| `ori_balance` | `ori_balance` | `oriBalance` | 余额 |
| `ori_non_deduct_tax` | `ori_non_deduct_tax` | `oriNonDeductTax` | 不可抵扣税额 |
| `ori_ocupy_amount` | `ori_ocupy_amount` | `oriOcupyAmount` | 预占用金额 |
| `ori_rebate_deduct_amount` | `ori_rebate_deduct_amount` | `oriRebateDeductAmount` | 返利直接抵现金额(应收返利用) |
| `ori_tax_amount` | `ori_tax_amount` | `oriTaxAmount` | 税额 |
| `ori_tax_excluded_amount` | `ori_tax_excluded_amount` | `oriTaxExcludedAmount` | 无税金额 |
| `ori_tax_excluded_price` | `ori_tax_excluded_price` | `oriTaxExcludedPrice` | 无税单价 |
| `ori_tax_included_amount` | `ori_tax_included_amount` | `oriTaxIncludedAmount` | 含税金额 |
| `ori_tax_included_price` | `ori_tax_included_price` | `oriTaxIncludedPrice` | 含税单价 |
| `ori_whtax_amount` | `ori_whtax_amount` | `oriWhtaxAmount` | 代扣税税额 |
| `quantity` | `quantity` | `quantity` | 数量 |
| `remain_quantity` | `remain_quantity` | `remainQuantity` | 数量余额 |
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
| `` | `` | `grandsonItem` | 应收核销查询详情 |
