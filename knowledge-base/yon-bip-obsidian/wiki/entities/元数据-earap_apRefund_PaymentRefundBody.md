---
tags: [BIP, 元数据, 数据字典, earap.apRefund.PaymentRefundBody]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 付款退款单明细信息 (`earap.apRefund.PaymentRefundBody`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ap_payment_b` | domain：`yonbip-fi-earapbill` | 应用：`EAP` | 业务对象ID：`e9c36855-30e0-4d2b-a38e-441b985193e7`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 付款退款单明细信息 |
| 物理表 | `ap_payment_b` |
| domain/服务域 | `yonbip-fi-earapbill` |
| schema | `fiearapbill` |
| 所属应用 | `EAP` |
| 直连字段 | 104 个 |
| 子表 | 1 个 |
| 关联引用 | 36 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `taxCalculationResultList` | `earap.apRefund.TaxCalculationResult` | composition |

## 关联引用 (36个)

| 字段名 | 引用类型 |
|--------|---------|
| `expense_item_id` | `finbd.bd_expenseitemref` |
| `funder_id` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `ori_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `activity` | `yonbip-pm-projectme.RefTable_ebcf54ed61` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `employee_bank_account_id` | `ucf-staff-center.bd_staffbankaccref` |
| `project_id` | `ucfbasedoc.bd_projectNewRef` |
| `wbs` | `yonbip-pm-commonbd.wbs_doc_ref` |
| `employee_id` | `ucf-staff-center.bd_staff_leave_ref` |
| `header_id` | `` |
| `quick_type_id` | `finbd.bd_paymenttyperef` |
| `supplier_procenter_id` | `finbd.bd_allaccbodyref_inner` |
| `funder_bank_account_id` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobjbank_Ref` |
| `note_no` | `drft.drft_billnoref` |
| `settle_mode_id` | `productcenter.aa_settlemethodref` |
| `supplier_id` | `yssupplier.aa_vendorSimpleRef` |
| `org_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `demander_procenter_id` | `finbd.bd_allaccbodyref_inner` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `tax_subject_id` | `yonbip-fi-taxpubdoc.RefTable_55c5b82f11` |
| `org_id` | `ucf-org-center.org_pure_tree_ref` |
| `clm_contract_lib_id` | `yonbip-ec-contract.clmContractLibRef` |
| `cost_center_id` | `finbd.bd_costcenterref` |
| `enterprise_bank_account_id` | `ucfbasedoc.bd_enterprisebank` |
| `staff_id` | `ucf-staff-center.bd_staff_leave_ref` |
| `dept_id` | `ucf-org-center.admin_dept_tree_ref_na` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `supplier_bank_account_id` | `yssupplier.aa_vendorbankref` |
| `tax_code_id` | `yonbip-fi-taxpubdoc.RefTable_832e0ffa60` |
| `exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `note_type_id` | `drft.drft_billtyperef` |
| `enterprise_cash_account_id` | `ucfbasedoc.bd_enterprisecashacct` |
| `material_id` | `productcenter.baseProductRef` |
| `partner_id` | `productcenter.base_businesspartnerref` |
| `` | `` |

## 继承接口 (4个, 16字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **业务流多来源** (`iuap.busiObj.BusinessFlowSourcesItf`)
  - `firstbusiobj` → `firstbusiobj`
  - `firstchild_id` → `firstchild_id`
  - `firstcode` → `firstcode`
  - `first_id` → `first_id`
  - `sourcegrand_id` → `sourcegrand_id`
- **业务流基础** (`iuap.busiObj.BusinessFlowItf`)
  - `bizflow_id` → `bizflow_id`
  - `bizflowinstance_id` → `bizflowinstance_id`
  - `bizflow_makebillcode` → `bizflow_makebillcode`
  - `bizflowname` → `bizflowname`
  - `sourcebusiobj` → `sourcebusiobj`
  - `sourcechild_id` → `sourcechild_id`
  - `sourcecode` → `sourcecode`
  - `source_id` → `source_id`
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`

## 字段列表（按类型分组）

> 共 104 个直连字段

### 文本字段 (39个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `check_no` | `check_no` | `checkNo` | 财资统一对账码 |
| `contract_no` | `contract_no` | `contractNo` | 合同编号 |
| `cooperate_no` | `cooperate_no` | `cooperateNo` | 协同号 |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxId` | 全局事务ID |
| `ext_row_no` | `ext_row_no` | `extRowNo` | 外部系统子单号 |
| `invoice_no` | `invoice_no` | `invoiceNo` | 发票编号 |
| `object_bank_account_no` | `object_bank_account_no` | `objectBankAccountNo` | 往来对象银行账号 |
| `order_no` | `order_no` | `orderNo` | 订单编号 |
| `ori_bill_id` | `ori_bill_id` | `oriBillId` | 源头单据ID |
| `ori_bill_no` | `ori_bill_no` | `oriBillNo` | 源头单据号 |
| `ori_bill_row_id` | `ori_bill_row_id` | `oriBillRowId` | 源头单据行ID |
| `ori_bill_type` | `ori_bill_type` | `oriBillType` | 源头单据类型 |
| `quick_type_code` | `quick_type_code` | `quickTypeCode` | 款项类型编码 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `retailer_name` | `retailer_name` | `retailer` | 散户 |
| `shop_id` | `shop_id` | `shop` | 商家 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据ID |
| `src_bill_no` | `src_bill_no` | `srcBillNo` | 来源单据号 |
| `src_bill_row_id` | `src_bill_row_id` | `srcBillRowId` | 来源单据行ID |
| `src_bill_type` | `src_bill_type` | `srcBillType` | 来源单据类型 |
| `src_claim_id` | `src_claim_id` | `srcClaimId` | 关联流水 |
| `src_exe_detail_id` | `src_exe_detail_id` | `srcExeDetailId` | 来源单据执行明细ID |
| `src_order_id` | `src_order_id` | `srcOrderId` | 来源订单ID |
| `src_order_row_id` | `src_order_row_id` | `srcOrderRowId` | 来源订单明细ID |
| `src_order_type_id` | `src_order_type_id` | `srcOrderTypeId` | 来源订单类型 |
| `id` | `id` | `id` | 主键 |
| `bizflowinstance_id` | `bizflowinstance_id` | `bizFlowInstanceId` | 业务流实例id |
| `bizflow_makebillcode` | `bizflow_makebillcode` | `bizFlowMakeBillCode` | 单据转换规则编码 |
| `bizflow_id` | `bizflow_id` | `bizflowId` | 业务流id |
| `bizflowname` | `bizflowname` | `bizflowName` | 流程名称 |
| `sourcebusiobj` | `sourcebusiobj` | `sourceBusiObj` | 上游业务对象 |
| `sourcechild_id` | `sourcechild_id` | `sourceChildId` | 上游单据子表id |
| `sourcecode` | `sourcecode` | `sourceCode` | 上游单据号 |
| `source_id` | `source_id` | `sourceId` | 上游单据主表id |
| `firstbusiobj` | `firstbusiobj` | `firstBusiObj` | 来源业务对象 |
| `firstchild_id` | `firstchild_id` | `firstChildId` | 来源单据子表id |
| `firstcode` | `firstcode` | `firstCode` | 来源单据号 |
| `first_id` | `first_id` | `firstId` | 来源单据主表id |
| `sourcegrand_id` | `sourcegrand_id` | `sourceGrandId` | 来源孙表id |

### 引用字段 (34个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tax_code_id` | `tax_code_id` | `taxCodeId` | 税码 |
| `clm_contract_lib_id` | `clm_contract_lib_id` | `clmContractLibId` | 合同库id |
| `cost_center_id` | `cost_center_id` | `costCenter` | 成本中心 |
| `demander_procenter_id` | `demander_procenter_id` | `demanderProCenter` | 需方利润中心 |
| `dept_id` | `dept_id` | `dept` | 部门 |
| `employee_id` | `employee_id` | `employee` | 员工 |
| `employee_bank_account_id` | `employee_bank_account_id` | `employeeBankAccount` | 员工银行账户 |
| `enterprise_bank_account_id` | `enterprise_bank_account_id` | `enterpriseBankAccount` | 企业银行账户 |
| `enterprise_cash_account_id` | `enterprise_cash_account_id` | `enterpriseCashAccount` | 企业现金账户 |
| `exchange_rate_type_id` | `exchange_rate_type_id` | `exchangeRateType` | 汇率类型 |
| `expense_item_id` | `expense_item_id` | `expenseItem` | 费用项目 |
| `funder_id` | `funder_id` | `funder` | 资金业务伙伴 |
| `funder_bank_account_id` | `funder_bank_account_id` | `funderBankAccount` | 资金业务伙伴银行账户 |
| `header_id` | `header_id` | `headerId` | 付款退款基本信息ID |
| `material_id` | `material_id` | `material` | 物料 |
| `note_no` | `note_no` | `noteNo` | 票据号 |
| `note_type_id` | `note_type_id` | `noteType` | 票据类型 |
| `org_id` | `org_id` | `org` | 业务组织 |
| `org_currency_id` | `org_currency_id` | `orgCurrency` | 本币 |
| `ori_currency_id` | `ori_currency_id` | `oriCurrency` | 原币币种 |
| `partner_id` | `partner_id` | `partner` | 业务伙伴 |
| `project_id` | `project_id` | `project` | 项目 |
| `quick_type_id` | `quick_type_id` | `quickType` | 款项类型 |
| `settle_mode_id` | `settle_mode_id` | `settleMode` | 结算方式 |
| `staff_id` | `staff_id` | `staff` | 业务员 |
| `supplier_id` | `supplier_id` | `supplier` | 供应商 |
| `supplier_bank_account_id` | `supplier_bank_account_id` | `supplierBankAccount` | 供应商银行账户 |
| `supplier_procenter_id` | `supplier_procenter_id` | `supplierProCenter` | 供方利润中心 |
| `tax_subject_id` | `tax_subject_id` | `taxSubject` | 税目税率 |
| `activity` | `activity` | `activity` | 活动 |
| `wbs` | `wbs` | `wbs` | WBS |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exchange_rate_date` | `exchange_rate_date` | `exchangeRateDate` | 汇率日期 |
| `expire_date` | `expire_date` | `expireDate` | 到期日 |
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
| `bln_settle_patch` | `bln_settle_patch` | `blnSettlePatch` | 是否结算补单 |
| `brelate_check_bill` | `brelate_check_bill` | `relateCheckBill` | 是否已关联流水 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `object_type` | `object_type` | `objectType` | 往来对象类型 |
| `settle_state` | `settle_state` | `settleState` | 结算状态 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dtc_status` | `dtc_status` | `dtcStatus` | 全局事务状态 |
| `issue_no` | `issue_no` | `issueNo` | 期号 |
| `exchange_rate_ops` | `exchange_rate_ops` | `exchangeRateOps` | 汇率折算方式 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ori_whtax_amount` | `ori_whtax_amount` | `oriWhtaxAmount` | 代扣税税额 |
| `local_whtax_amount` | `local_whtax_amount` | `localWhtaxAmount` | 本币代扣税税额 |
| `exchange_rate` | `exchange_rate` | `exchangeRate` | 汇率 |
| `local_tax_amount` | `local_tax_amount` | `localTaxAmount` | 本币税额 |
| `local_tax_excluded_amount` | `local_tax_excluded_amount` | `localTaxExcludedAmount` | 本币无税金额 |
| `local_tax_included_amount` | `local_tax_included_amount` | `localTaxIncludedAmount` | 本币金额 |
| `ori_occupy_amount` | `ori_occupy_amount` | `oriOccupyAmount` | 预占用金额 |
| `ori_tax_amount` | `ori_tax_amount` | `oriTaxAmount` | 税额 |
| `ori_tax_excluded_amount` | `ori_tax_excluded_amount` | `oriTaxExcludedAmount` | 无税金额 |
| `ori_tax_included_amount` | `ori_tax_included_amount` | `oriTaxIncludedAmount` | 退款金额 |
| `row_no` | `row_no` | `rowNo` | 行号 |
| `src_bill_row_amount` | `src_bill_row_amount` | `srcBillRowAmount` | 来源单据行总金额 |
| `src_order_row_no` | `src_order_row_no` | `srcOrderRowNo` | 来源订单行号 |
| `tax_rate` | `tax_rate` | `taxRate` | 税率 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义特征 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `taxCalculationResultList` | 计税结果 |
