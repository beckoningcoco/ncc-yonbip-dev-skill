---
tags: [BIP, 元数据, 数据字典, earap.payable.PayableBody]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 应付结算清单明细信息 (`earap.payable.PayableBody`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ap_payable_b` | domain：`yonbip-ec-contract` | 应用：`STB` | 业务对象ID：`d610a7e5-78db-461c-a39c-57d3d42a26b8`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 应付结算清单明细信息 |
| 物理表 | `ap_payable_b` |
| 数据库 schema | `yonbip-ec-contract` |
| 所属应用 | `STB` |
| 直连字段 | 98 个 |
| 子表 | 3 个 |
| 关联引用 | 33 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `grandsonItem` | `earap.payable.PayableProtocol` | composition |
| `taxCalcResultItem` | `earap.payable.PayableTaxCalcResult` | composition |
| `withHoldingTaxItem` | `earap.payable.PayableWithHoldingTax` | composition |

## 关联引用 (33个)

| 字段名 | 引用类型 |
|--------|---------|
| `expense_item_id` | `finbd.bd_expenseitemref` |
| `funder_id` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `ori_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `activity` | `` |
| `whtax_id` | `yonbip-fi-taxpubdoc.RefTable_6e574b3619` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |
| `wbs` | `` |
| `employee_id` | `ucf-staff-center.bd_staff_all_ref` |
| `header_id` | `` |
| `supplier_procenter_id` | `finbd.bd_allaccbodyref_inner` |
| `supplier_id` | `yssupplier.aa_vendor` |
| `invoice_type_id` | `ucfbasedoc.bd_invoiceref` |
| `org_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `demander_procenter_id` | `finbd.bd_allaccbodyref_inner` |
| `` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `pay_agreement_id` | `ucfbasedoc.bd_payagreementref` |
| `tax_subject_id` | `yonbip-fi-taxpubdoc.RefTable_839443ba26` |
| `org_id` | `ucf-org-center.org_pure_tree_ref` |
| `cost_center_id` | `finbd.bd_costcenterref` |
| `contract_lib_id` | `yonbip-ec-contract.clmContractLibRef` |
| `staff_id` | `ucf-staff-center.bd_staff_all_ref` |
| `dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `tax_code_id` | `yonbip-fi-taxpubdoc.RefTable_832e0ffa60` |
| `exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `unit_id` | `productcenter.pc_unitref` |
| `material_id` | `productcenter.pc_nomalproductref` |
| `partner_id` | `productcenter.base_businesspartnerref` |

## 继承接口 (6个, 21字段)

- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`
- **业务流基础** (`iuap.busiObj.BusinessFlowItf`)
  - `bizflow_id` → `bizflow_id`
  - `bizflowinstance_id` → `bizflowinstance_id`
  - `bizflow_makebillcode` → `bizflow_makebillcode`
  - `bizflowname` → `bizflowname`
  - `sourcebusiobj` → `sourcebusiobj`
  - `sourcechild_id` → `sourcechild_id`
  - `sourcecode` → `sourcecode`
  - `source_id` → `source_id`
- **业务流多来源** (`iuap.busiObj.BusinessFlowSourcesItf`)
  - `firstbusiobj` → `firstbusiobj`
  - `firstchild_id` → `firstchild_id`
  - `firstcode` → `firstcode`
  - `first_id` → `first_id`
  - `sourcegrand_id` → `sourcegrand_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 98 个直连字段

### 文本字段 (32个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `invoice_no` | `invoice_no` | `invoiceNo` | 发票编号 |
| `src_bill_row_id` | `src_bill_row_id` | `srcBillRowId` | 来源单据行ID |
| `cooperate_no` | `cooperate_no` | `cooperateNo` | 协同号 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据ID |
| `ori_bill_id` | `ori_bill_id` | `oriBillId` | 源头单据ID |
| `contract_no` | `contract_no` | `contractNo` | 合同编号 |
| `ori_bill_no` | `ori_bill_no` | `oriBillNo` | 源头单据号 |
| `retailer_name` | `retailer_name` | `retailer` | 散户 |
| `ori_bill_row_id` | `ori_bill_row_id` | `oriBillRowId` | 源头单据行ID |
| `src_bill_type` | `src_bill_type` | `srcBillType` | 来源单据类型 |
| `ori_bill_type` | `ori_bill_type` | `oriBillType` | 源头单据类型 |
| `ext_row_no` | `ext_row_no` | `extRowNo` | 外部系统子单号 |
| `invoice_code` | `invoice_code` | `invoiceCode` | 发票代码 |
| `src_bill_no` | `src_bill_no` | `srcBillNo` | 来源单据号 |
| `order_no` | `order_no` | `orderNo` | 订单编号 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxId` | 全局事务ID |
| `accounting_method` | `accounting_method` | `accountingMethod` | 立账方式 |
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

### 引用字段 (29个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contract_lib_id` | `contract_lib_id` | `contractLibId` | 合同中心ID |
| `tax_code_id` | `tax_code_id` | `taxCode` | 税码 |
| `staff_id` | `staff_id` | `staff` | 业务员 |
| `demander_procenter_id` | `demander_procenter_id` | `demanderProCenter` | 需方利润中心 |
| `pay_agreement_id` | `pay_agreement_id` | `agreement` | 付款协议 |
| `project_id` | `project_id` | `project` | 项目 |
| `invoice_type_id` | `invoice_type_id` | `invoiceType` | 发票类型 |
| `dept_id` | `dept_id` | `dept` | 部门 |
| `employee_id` | `employee_id` | `employee` | 员工 |
| `header_id` | `header_id` | `headerId` | 应付结算清单主表ID |
| `supplier_id` | `supplier_id` | `supplier` | 供应商 |
| `supplier_procenter_id` | `supplier_procenter_id` | `supplierProCenter` | 供方利润中心 |
| `partner_id` | `partner_id` | `partner` | 业务伙伴 |
| `material_id` | `material_id` | `material` | 物料 |
| `expense_item_id` | `expense_item_id` | `expenseItem` | 费用项目 |
| `tax_subject_id` | `tax_subject_id` | `taxSubject` | 税目税率 |
| `cost_center_id` | `cost_center_id` | `costCenter` | 成本中心 |
| `unit_id` | `unit_id` | `unit` | 单位 |
| `funder_id` | `funder_id` | `funder` | 资金业务对象 |
| `whtax_id` | `whtax_id` | `whtax` | 代扣税税码 |
| `org_id` | `org_id` | `org` | 业务组织 |
| `ori_currency_id` | `ori_currency_id` | `oriCurrency` | 原币币种 |
| `org_currency_id` | `org_currency_id` | `orgCurrency` | 本币 |
| `exchange_rate_type_id` | `exchange_rate_type_id` | `exchangeRateType` | 汇率类型 |
| `activity` | `activity` | `activity` | 活动 |
| `wbs` | `wbs` | `wbs` | WBS |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `invoice_date` | `invoice_date` | `invoiceDate` | 发票日期 |
| `start_date` | `start_date` | `startDate` | 起算日期 |
| `exchange_rate_date` | `exchange_rate_date` | `exchangeRateDate` | 汇率日期 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_deduct_tax` | `bln_deduct_tax` | `blnDeductTax` | 抵扣标识 |

### 枚举字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `deduct_tax_type` | `deduct_tax_type` | `deductTaxType` | 扣税类别 |
| `object_type` | `object_type` | `objectType` | 往来对象类型 |
| `estimate_backwash` | `estimate_backwash` | `estimateBackwash` | 是否暂估回冲 |
| `exchange_rate_ops` | `exchange_rate_ops` | `exchangeRateOps` | 汇率折算方式 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dtc_status` | `dtc_status` | `dtcStatus` | 全局事务状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (20个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ori_tax_included_amount` | `ori_tax_included_amount` | `oriTaxIncludedAmount` | 含税金额 |
| `local_tax_included_price` | `local_tax_included_price` | `localTaxIncludedPrice` | 本币含税单价 |
| `local_non_deduct_tax` | `local_non_deduct_tax` | `localNonDeductTax` | 本币不可抵扣税额 |
| `ori_tax_included_price` | `ori_tax_included_price` | `oriTaxIncludedPrice` | 含税单价 |
| `ori_tax_excluded_amount` | `ori_tax_excluded_amount` | `oriTaxExcludedAmount` | 无税金额 |
| `row_no` | `row_no` | `rowNo` | 行号 |
| `local_tax_included_amount` | `local_tax_included_amount` | `localTaxIncludedAmount` | 本币含税金额 |
| `ori_tax_excluded_price` | `ori_tax_excluded_price` | `oriTaxExcludedPrice` | 无税单价 |
| `ori_whtax_amount` | `ori_whtax_amount` | `oriWhtaxAmount` | 代扣税税额 |
| `local_whtax_amount` | `local_whtax_amount` | `localWhtaxAmount` | 本币代扣税税额 |
| `src_bill_row_amount` | `src_bill_row_amount` | `srcBillRowAmount` | 来源单据行总金额 |
| `non_deduct_tax_rate` | `non_deduct_tax_rate` | `nonDeductTaxRate` | 不可抵扣税率 |
| `local_tax_amount` | `local_tax_amount` | `localTaxAmount` | 本币税额 |
| `ori_non_deduct_tax` | `ori_non_deduct_tax` | `oriNonDeductTax` | 不可抵扣税额 |
| `ori_tax_amount` | `ori_tax_amount` | `oriTaxAmount` | 税额 |
| `quantity` | `quantity` | `quantity` | 数量 |
| `local_tax_excluded_price` | `local_tax_excluded_price` | `localTaxExcludedPrice` | 本币无税单价 |
| `local_tax_excluded_amount` | `local_tax_excluded_amount` | `localTaxExcludedAmount` | 本币无税金额 |
| `tax_rate` | `tax_rate` | `taxRate` | 税率 |
| `exchange_rate` | `exchange_rate` | `exchangeRate` | 汇率 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义特征 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `withHoldingTaxItem` | 应付结算清单代扣税信息 |
| `` | `` | `grandsonItem` | 应付结算清单计划信息 |
| `` | `` | `taxCalcResultItem` | 计税结果 |
