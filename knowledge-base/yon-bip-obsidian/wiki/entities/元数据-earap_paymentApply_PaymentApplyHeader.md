---
tags: [BIP, 元数据, 数据字典, earap.paymentApply.PaymentApplyHeader]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 付款申请单基本信息 (`earap.paymentApply.PaymentApplyHeader`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ap_payment_apply_h` | domain：`yonbip-fi-earapbill` | 应用：`EAP` | 业务对象ID：`c6214341-20d3-4b76-b47e-2a47995c20a5`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 付款申请单基本信息 |
| 物理表 | `ap_payment_apply_h` |
| 数据库 schema | `yonbip-fi-earapbill` |
| 所属应用 | `EAP` |
| 直连字段 | 80 个 |
| 子表 | 3 个 |
| 关联引用 | 31 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodyItem` | `earap.paymentApply.PaymentApplyBody` | composition |
| `approvalTasks` | `earap.paymentApply.PaymentApplyApprovalTask` | composition |
| `bpmSteps` | `earap.paymentApply.PaymentApplyBpmStep` | composition |

## 关联引用 (31个)

| 字段名 | 引用类型 |
|--------|---------|
| `funder_id` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `ori_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `finance_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `activity` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `employee_bank_account_id` | `ucf-staff-center.bd_staffbankaccref` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |
| `wbs` | `` |
| `employee_id` | `ucf-staff-center.bd_staff_all_ref` |
| `funder_bank_account_id` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobjbank_Ref` |
| `settle_mode_id` | `productcenter.aa_settlemethodref` |
| `supplier_id` | `yssupplier.aa_vendor` |
| `treasury_org` | `ucf-org-center.bd_fundsorg_na` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `org_id` | `ucf-org-center.org_pure_tree_ref` |
| `bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `supplier_staff_id` | `yssupplier.aa_vendorcontatctref` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `staff_id` | `ucf-staff-center.bd_staff_all_ref` |
| `dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `src_app_id` | `fiepub.fiepub_sourceapplicationref` |
| `supplier_bank_account_id` | `yssupplier.aa_vendorbankref` |
| `bus_type_id` | `ucfbasedoc.bd_billtyperef` |
| `closer` | `bip-usercenter.bip_user_ref` |
| `exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `partner_id` | `productcenter.base_businesspartnerref` |

## 继承接口 (11个, 31字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **业务流多来源** (`iuap.busiObj.BusinessFlowSourcesItf`)
  - `firstbusiobj` → `firstbusiobj`
  - `firstchild_id` → `firstchild_id`
  - `firstcode` → `firstcode`
  - `first_id` → `first_id`
  - `sourcegrand_id` → `sourcegrand_id`
- **审批流接口** (`iuap.busiObj.ApprovalFlowItf`)
  - `auditnote` → `auditnote`
  - `auditor` → `auditor`
  - `audit_time` → `audit_time`
  - `procinst_id` → `procinst_id`
  - `verifystate` → `verifystate`
- **打印次数拆分** (`base.itf.IPrintCountSplit`)
  - `directPrintCount` → `directPrintCount`
  - `previewPrintCount` → `previewPrintCount`
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
- **交易类型** (`iuap.busiObj.BustypeItf`)
  - `bustype` → `bustype`
- **打印次数** (`base.itf.IPrintCount`)
  - `printCount` → `printCount`

## 字段列表（按类型分组）

> 共 80 个直连字段

### 文本字段 (22个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_code` | `bill_code` | `code` | 编码 |
| `ext_system_code` | `ext_system_code` | `extSystemCode` | 外部系统编码 |
| `ext_vouch_code` | `ext_vouch_code` | `extVouchCode` | 外部系统单号 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `retailer_name` | `retailer_name` | `retailer` | 散户 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据 |
| `auditnote` | `auditnote` | `auditNote` | 审批批语 |
| `procinst_id` | `procinst_id` | `procinstId` | 流程实例ID |
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

### 引用字段 (27个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_type_id` | `bill_type_id` | `billType` | 单据类型 |
| `bus_type_id` | `bus_type_id` | `bustype` | 交易类型 |
| `closer` | `closer` | `closer` | 关闭人 |
| `creator` | `creator` | `creator` | 创建人 |
| `dept_id` | `dept_id` | `dept` | 部门 |
| `employee_id` | `employee_id` | `employee` | 员工 |
| `employee_bank_account_id` | `employee_bank_account_id` | `employeeBankAccount` | 员工银行账户 |
| `exchange_rate_type_id` | `exchange_rate_type_id` | `exchangeRateType` | 汇率类型ID |
| `finance_org_id` | `finance_org_id` | `financeOrg` | 应付会计主体 |
| `funder_id` | `funder_id` | `funder` | 资金业务伙伴 |
| `funder_bank_account_id` | `funder_bank_account_id` | `funderBankAccount` | 资金业务伙伴银行账户 |
| `org_id` | `org_id` | `org` | 付款申请组织 |
| `ori_currency_id` | `ori_currency_id` | `oriCurrency` | 币种 |
| `partner_id` | `partner_id` | `partner` | 业务伙伴 |
| `project_id` | `project_id` | `project` | 项目 |
| `settle_mode_id` | `settle_mode_id` | `settleMode` | 结算方式 |
| `src_app_id` | `src_app_id` | `srcApp` | 来源应用 |
| `staff_id` | `staff_id` | `staff` | 业务员 |
| `supplier_id` | `supplier_id` | `supplier` | 供应商 |
| `supplier_bank_account_id` | `supplier_bank_account_id` | `supplierBankAccount` | 供应商银行账户 |
| `supplier_staff_id` | `supplier_staff_id` | `supplierStaff` | 供应商联系人 |
| `treasury_org` | `treasury_org` | `treasuryOrg` | 资金组织 |
| `activity` | `activity` | `activity` | 活动 |
| `wbs` | `wbs` | `wbs` | WBS |
| `auditor` | `auditor` | `auditor` | 审批人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_date` | `bill_date` | `billDate` | 单据日期 |
| `hope_pay_date` | `hope_pay_date` | `hopePayDate` | 期望付款日期 |

### 日期时间 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审核日期 |
| `close_time` | `close_time` | `closeTime` | 关闭时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_closed` | `bln_closed` | `blnClosed` | 是否关闭 |
| `bln_pending` | `bln_pending` | `blnPending` | 是否挂起 |

### 枚举字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `business_type` | `business_type` | `businessType` | 业务类型 |
| `object_type` | `object_type` | `objectType` | 往来对象类型 |
| `paid_status` | `paid_status` | `paidStatus` | 付款状态 |
| `src_bill_type` | `src_bill_type` | `srcBillType` | 来源单据类型 |
| `src_system` | `src_system` | `srcSystem` | 单据来源 |
| `supplier_cooperate_state` | `supplier_cooperate_state` | `supplierCooperateState` | 供应商协同状态 |
| `verifystate` | `verifystate` | `verifyState` | 单据状态 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `direct_print_count` | `direct_print_count` | `directPrintCount` | 直接打印次数 |
| `preview_print_count` | `preview_print_count` | `previewPrintCount` | 预览打印次数 |
| `print_count` | `print_count` | `printCount` | 打印次数 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ori_amount` | `ori_amount` | `oriAmount` | 付款申请金额 |
| `ori_close_amount` | `ori_close_amount` | `oriCloseAmount` | 终止付款金额 |
| `ori_occupy_amount` | `ori_occupy_amount` | `oriOccupyAmount` | 付款占用金额 |
| `ori_paid_amount` | `ori_paid_amount` | `oriPaidAmount` | 已付款金额 |
| `ori_unpaid_amount` | `ori_unpaid_amount` | `oriUnpaidAmount` | 未付款金额 |
| `src_bill_amount` | `src_bill_amount` | `srcBillAmount` | 来源单据总金额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义特征 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bodyItem` | 付款申请单明细信息 |
| `` | `` | `approvalTasks` | 付款申请单审批任务信息 |
| `` | `` | `bpmSteps` | 付款申请单业务阶段信息 |
