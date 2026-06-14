---
tags: [BIP, 元数据, 数据字典, earap.paymentApply.PaymentApplyBody]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 付款申请单明细信息 (`earap.paymentApply.PaymentApplyBody`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ap_payment_apply_b` | domain：`yonbip-fi-earapbill` | 应用：`EAP` | 业务对象ID：`c6214341-20d3-4b76-b47e-2a47995c20a5`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 付款申请单明细信息 |
| 物理表 | `ap_payment_apply_b` |
| domain/服务域 | `yonbip-fi-earapbill` |
| schema | `fiearapbill` |
| 所属应用 | `EAP` |
| 直连字段 | 69 个 |
| 子表 | 0 个 |
| 关联引用 | 22 个 |

## 关联引用 (22个)

| 字段名 | 引用类型 |
|--------|---------|
| `expense_item_id` | `finbd.bd_expenseitemref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `activity` | `` |
| `org_id` | `ucf-org-center.org_pure_tree_ref` |
| `cost_center_id` | `finbd.bd_costcenterref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `employee_bank_account_id` | `ucf-staff-center.bd_staffbankaccref` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |
| `wbs` | `` |
| `staff_id` | `ucf-staff-center.bd_staff_all_ref` |
| `dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `supplier_bank_account_id` | `yssupplier.aa_vendorbankref` |
| `tax_code_id` | `yonbip-fi-taxpubdoc.RefTable_832e0ffa60` |
| `header_id` | `` |
| `quick_type_id` | `finbd.bd_paymenttyperef` |
| `supplier_procenter_id` | `finbd.bd_allaccbodyref_inner` |
| `funder_bank_account_id` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobjbank_Ref` |
| `material_id` | `productcenter.pc_nomalproductref` |
| `settle_mode_id` | `productcenter.aa_settlemethodref` |
| `demander_procenter_id` | `finbd.bd_allaccbodyref_inner` |

## 继承接口 (6个, 21字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
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
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 69 个直连字段

### 文本字段 (32个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contract_no` | `contract_no` | `contractNo` | 合同编号 |
| `ext_row_no` | `ext_row_no` | `extRowNo` | 外部系统子单号 |
| `invoice_no` | `invoice_no` | `invoiceNo` | 发票号 |
| `order_no` | `order_no` | `orderNo` | 订单编号 |
| `ori_bill_id` | `ori_bill_id` | `oriBillId` | 源头单据 |
| `ori_bill_no` | `ori_bill_no` | `oriBillNo` | 源头单据号 |
| `ori_bill_row_id` | `ori_bill_row_id` | `oriBillRowId` | 源头单据行 |
| `ori_bill_type` | `ori_bill_type` | `oriBillType` | 源头单据类型 |
| `quick_type_code` | `quick_type_code` | `quickTypeCode` | 款项类型编码 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据 |
| `src_bill_no` | `src_bill_no` | `srcBillNo` | 来源单据号 |
| `src_bill_row_id` | `src_bill_row_id` | `srcBillRowId` | 来源单据行 |
| `src_bill_type` | `src_bill_type` | `srcBillType` | 来源单据类型 |
| `src_exe_detail_id` | `src_exe_detail_id` | `srcExeDetailId` | 来源单据执行明细 |
| `src_order_id` | `src_order_id` | `srcOrderId` | 来源订单主表 |
| `src_order_row_id` | `src_order_row_id` | `srcOrderRowId` | 来源订单子表 |
| `src_order_type_id` | `src_order_type_id` | `srcOrderType` | 来源订单类型 |
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

### 引用字段 (21个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tax_code_id` | `tax_code_id` | `taxCodeId` | 税码 |
| `cost_center_id` | `cost_center_id` | `costCenter` | 成本中心 |
| `demander_procenter_id` | `demander_procenter_id` | `demanderProCenter` | 需方利润中心 |
| `dept_id` | `dept_id` | `dept` | 部门 |
| `employee_bank_account_id` | `employee_bank_account_id` | `employeeBankAccount` | 员工银行账户 |
| `expense_item_id` | `expense_item_id` | `expenseItem` | 费用项目 |
| `funder_bank_account_id` | `funder_bank_account_id` | `funderBankAccount` | 资金业务伙伴银行账户 |
| `header_id` | `header_id` | `headerId` | 付款申请单基本信息 |
| `material_id` | `material_id` | `material` | 物料 |
| `org_id` | `org_id` | `org` | 付款申请组织 |
| `project_id` | `project_id` | `project` | 项目 |
| `quick_type_id` | `quick_type_id` | `quickType` | 款项类型 |
| `settle_mode_id` | `settle_mode_id` | `settleMode` | 结算方式 |
| `staff_id` | `staff_id` | `staff` | 业务员 |
| `supplier_bank_account_id` | `supplier_bank_account_id` | `supplierBankAccount` | 供应商银行账户 |
| `supplier_procenter_id` | `supplier_procenter_id` | `supplierProCenter` | 供方利润中心 |
| `activity` | `activity` | `activity` | 活动 |
| `wbs` | `wbs` | `wbs` | WBS |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `expire_date` | `expire_date` | `expireDate` | 到期日 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `paid_status` | `paid_status` | `paidStatus` | 付款状态 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `issue_no` | `issue_no` | `issueNo` | 期号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ori_amount` | `ori_amount` | `oriAmount` | 付款申请金额 |
| `ori_close_amount` | `ori_close_amount` | `oriCloseAmount` | 终止付款金额 |
| `ori_occupy_amount` | `ori_occupy_amount` | `oriOccupyAmount` | 付款占用金额 |
| `ori_paid_amount` | `ori_paid_amount` | `oriPaidAmount` | 已付款金额 |
| `ori_unpaid_amount` | `ori_unpaid_amount` | `oriUnpaidAmount` | 未付款金额 |
| `row_no` | `row_no` | `rowNo` | 行号 |
| `src_bill_row_amount` | `src_bill_row_amount` | `srcBillRowAmount` | 来源单据行总金额 |
| `src_order_row_no` | `src_order_row_no` | `srcOrderRowNo` | 来源订单行号 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义特征 |
