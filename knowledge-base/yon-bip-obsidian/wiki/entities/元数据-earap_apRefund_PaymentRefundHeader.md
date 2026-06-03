---
tags: [BIP, 元数据, 数据字典, earap.apRefund.PaymentRefundHeader]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 付款退款单基本信息 (`earap.apRefund.PaymentRefundHeader`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ap_payment_h` | domain：`yonbip-fi-earapbill` | 应用：`EAP` | 业务对象ID：`e9c36855-30e0-4d2b-a38e-441b985193e7`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 付款退款单基本信息 |
| 物理表 | `ap_payment_h` |
| 数据库 schema | `yonbip-fi-earapbill` |
| 所属应用 | `EAP` |
| 直连字段 | 97 个 |
| 子表 | 3 个 |
| 关联引用 | 33 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodyItem` | `earap.apRefund.PaymentRefundBody` | composition |
| `approvalTasks` | `earap.apRefund.PaymentRefundApprovalTask` | composition |
| `bpmSteps` | `earap.apRefund.PaymentRefundBpmStep` | composition |

## 关联引用 (33个)

| 字段名 | 引用类型 |
|--------|---------|
| `funder_id` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `ori_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `finance_org_id` | `ucf-org-center.bd_financeorgtreeref_na` |
| `activity` | `yonbip-pm-projectme.RefTable_ebcf54ed61` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `employee_bank_account_id` | `ucf-staff-center.bd_staffbankaccref` |
| `project_id` | `ucfbasedoc.bd_projectNewRef` |
| `wbs` | `yonbip-pm-commonbd.wbs_doc_ref` |
| `employee_id` | `ucf-staff-center.bd_staff_leave_ref` |
| `funder_bank_account_id` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobjbank_Ref` |
| `settle_mode_id` | `productcenter.aa_settlemethodref` |
| `supplier_id` | `yssupplier.aa_vendorSimpleRef` |
| `treasury_org` | `ucf-org-center.bd_fundsorg_na` |
| `org_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `creator` | `u8c-auth.bip_user_ref` |
| `` | `` |
| `org_id` | `ucf-org-center.org_pure_tree_ref` |
| `enterprise_bank_account_id` | `ucfbasedoc.bd_enterprisebank` |
| `bill_type_id` | `transtype.bd_billtypetreeref` |
| `cooperater` | `u8c-auth.bip_user_ref` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `staff_id` | `ucf-staff-center.bd_staff_leave_ref` |
| `dept_id` | `ucf-org-center.admin_dept_tree_ref_na` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `src_app_id` | `fiepub.fiepub_sourceapplicationref` |
| `supplier_bank_account_id` | `yssupplier.aa_vendorbankref` |
| `bus_type_id` | `transtype.bd_billtyperef` |
| `exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `enterprise_cash_account_id` | `ucfbasedoc.bd_enterprisecashacct` |
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
- **打印次数拆分** (`base.itf.IPrintCountSplit`)
  - `directPrintCount` → `directPrintCount`
  - `previewPrintCount` → `previewPrintCount`

## 字段列表（按类型分组）

> 共 97 个直连字段

### 文本字段 (28个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contract_no` | `contract_no` | `contractNo` | 合同编号 |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxId` | 全局事务ID |
| `ext_system_code` | `ext_system_code` | `extSystemCode` | 外部系统编码 |
| `ext_vouch_code` | `ext_vouch_code` | `extVouchCode` | 外部系统单号 |
| `object_bank_account_no` | `object_bank_account_no` | `objectBankAccountNo` | 往来对象银行账号 |
| `order_no` | `order_no` | `orderNo` | 订单编号 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `retailer_name` | `retailer_name` | `retailer` | 散户 |
| `shop_id` | `shop_id` | `shop` | 商家 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据ID |
| `src_bill_type` | `src_bill_type` | `srcBillType` | 来源单据类型 |
| `sourcechild_id` | `sourcechild_id` | `sourceChildId` | 上游单据子表id |
| `bizflowinstance_id` | `bizflowinstance_id` | `bizFlowInstanceId` | 业务流实例id |
| `bizflow_makebillcode` | `bizflow_makebillcode` | `bizFlowMakeBillCode` | 单据转换规则编码 |
| `bizflow_id` | `bizflow_id` | `bizflowId` | 业务流id |
| `bizflowname` | `bizflowname` | `bizflowName` | 流程名称 |
| `sourcebusiObj` | `sourcebusiObj` | `sourceBusiObj` | 上游业务对象 |
| `sourcecode` | `sourcecode` | `sourceCode` | 上游单据号 |
| `source_id` | `source_id` | `sourceId` | 上游单据主表id |
| `firstchild_id` | `firstchild_id` | `firstChildId` | 来源单据子表id |
| `firstbusiobj` | `firstbusiobj` | `firstBusiObj` | 来源业务对象 |
| `firstcode` | `firstcode` | `firstCode` | 来源单据号 |
| `first_id` | `first_id` | `firstId` | 来源单据主表id |
| `sourcegrand_id` | `sourcegrand_id` | `sourceGrandId` | 来源孙表id |
| `auditnote` | `auditnote` | `auditNote` | 审批批语 |
| `procinst_id` | `procinst_id` | `procinstId` | 流程实例ID |
| `bill_code` | `bill_code` | `code` | 编码 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (29个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_type_id` | `bill_type_id` | `billType` | 单据类型 |
| `cooperater` | `cooperater` | `cooperater` | 协同确认人 |
| `dept_id` | `dept_id` | `dept` | 部门 |
| `employee_id` | `employee_id` | `employee` | 员工 |
| `employee_bank_account_id` | `employee_bank_account_id` | `employeeBankAccount` | 员工银行账户 |
| `enterprise_bank_account_id` | `enterprise_bank_account_id` | `enterpriseBankAccount` | 企业银行账户 |
| `enterprise_cash_account_id` | `enterprise_cash_account_id` | `enterpriseCashAccount` | 企业现金账户 |
| `exchange_rate_type_id` | `exchange_rate_type_id` | `exchangeRateType` | 汇率类型 |
| `finance_org_id` | `finance_org_id` | `financeOrg` | 应付会计主体 |
| `funder_id` | `funder_id` | `funder` | 资金业务伙伴 |
| `funder_bank_account_id` | `funder_bank_account_id` | `funderBankAccount` | 资金业务伙伴银行账户 |
| `org_id` | `org_id` | `org` | 业务组织 |
| `org_currency_id` | `org_currency_id` | `orgCurrency` | 本币 |
| `ori_currency_id` | `ori_currency_id` | `oriCurrency` | 原币币种 |
| `partner_id` | `partner_id` | `partner` | 业务伙伴 |
| `project_id` | `project_id` | `project` | 项目 |
| `settle_mode_id` | `settle_mode_id` | `settleMode` | 结算方式 |
| `src_app_id` | `src_app_id` | `srcApp` | 来源应用 |
| `staff_id` | `staff_id` | `staff` | 业务员 |
| `supplier_id` | `supplier_id` | `supplier` | 供应商 |
| `supplier_bank_account_id` | `supplier_bank_account_id` | `supplierBankAccount` | 供应商银行账户 |
| `treasury_org` | `treasury_org` | `treasuryOrg` | 资金组织 |
| `bus_type_id` | `bus_type_id` | `bustype` | 交易类型 |
| `auditor` | `auditor` | `auditor` | 审批人 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |
| `activity` | `activity` | `activity` | 活动 |
| `wbs` | `wbs` | `wbs` | WBS |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_date` | `bill_date` | `billDate` | 单据日期 |
| `exchange_rate_date` | `exchange_rate_date` | `exchangeRateDate` | 汇率日期 |

### 日期时间 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审核日期 |
| `cooperate_time` | `cooperate_time` | `cooperateTime` | 协同确认时间 |
| `effect_time` | `effect_time` | `effectTime` | 生效时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批日期 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_write_off` | `bln_write_off` | `blnWriteOff` | 是否冲销单 |

### 枚举字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `business_type` | `business_type` | `businessType` | 业务类型 |
| `cooperate_flag` | `cooperate_flag` | `cooperateFlag` | 协同标识 |
| `cooperate_state` | `cooperate_state` | `cooperateState` | 协同确认状态 |
| `effect_state` | `effect_state` | `effectState` | 生效状态 |
| `object_type` | `object_type` | `objectType` | 往来对象类型 |
| `busi_post_status` | `busi_post_status` | `postStatus` | 过账状态 |
| `settle_state` | `settle_state` | `settleState` | 结算状态 |
| `settle_submit_type` | `settle_submit_type` | `settleSubmitType` | 提交结算标识 |
| `src_system` | `src_system` | `srcSystem` | 来源系统 |
| `status` | `status` | `status` | 单据状态 |
| `write_off_state` | `write_off_state` | `writeOffState` | 冲销状态 |
| `verifystate` | `verifystate` | `verifyState` | 单据状态 |

### 整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dtc_status` | `dtc_status` | `dtcStatus` | 全局事务状态 |
| `exchange_rate_ops` | `exchange_rate_ops` | `exchangeRateOps` | 汇率折算方式 |
| `print_count` | `print_count` | `printCount` | 打印次数 |
| `direct_print_count` | `direct_print_count` | `directPrintCount` | 直接打印次数 |
| `preview_print_count` | `preview_print_count` | `previewPrintCount` | 预览打印次数 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `eeac_version` | `eeac_version` | `eeacVersion` | 事项中心版本号 |

### 数值字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exchange_rate` | `exchange_rate` | `exchangeRate` | 汇率 |
| `local_tax_excluded_amount` | `local_tax_excluded_amount` | `localTaxExcludedAmount` | 本币无税金额 |
| `local_tax_included_amount` | `local_tax_included_amount` | `localTaxIncludedAmount` | 本币金额 |
| `ori_occupy_amount` | `ori_occupy_amount` | `oriOccupyAmount` | 预占用金额 |
| `ori_tax_excluded_amount` | `ori_tax_excluded_amount` | `oriTaxExcludedAmount` | 无税金额 |
| `ori_tax_included_amount` | `ori_tax_included_amount` | `oriTaxIncludedAmount` | 退款金额 |
| `src_bill_amount` | `src_bill_amount` | `srcBillAmount` | 来源单据总金额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义特征 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bodyItem` | 付款退款单明细信息 |
| `` | `` | `approvalTasks` | 付款退款单审批任务信息 |
| `` | `` | `bpmSteps` | 收款退款单业务阶段信息 |
