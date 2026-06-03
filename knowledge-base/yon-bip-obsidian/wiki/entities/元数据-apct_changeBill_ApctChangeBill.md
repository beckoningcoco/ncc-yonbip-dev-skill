---
tags: [BIP, 元数据, 数据字典, apct.changeBill.ApctChangeBill]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同变更单据表 (`apct.changeBill.ApctChangeBill`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`apct_apct_change` | domain：`apct` | 应用：`APCT` | 业务对象ID：`4bb9c472-739a-4118-be8d-1cd1b176517c`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同变更单据表 |
| 物理表 | `apct_apct_change` |
| 数据库 schema | `apct` |
| 所属应用 | `APCT` |
| 直连字段 | 183 个 |
| 子表 | 7 个 |
| 关联引用 | 34 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `receiptplans` | `apct.changeBill.ApctChangeReceiptBillPlan` | composition |
| `changeibpmcurrentauditor` | `apct.changeBill.ApctChangeIBpmCurrentAuditor` | composition |
| `materials` | `apct.changeBill.ApctChangeBillMaterial` | composition |
| `plans` | `apct.changeBill.ApctChangeBillPlan` | composition |
| `ibpmsteps` | `apct.changeBill.ApctChangeBillIBpmStep` | composition |
| `items` | `apct.changeBill.ApctChangeBillItem` | composition |
| `apctChangeCounterpartys` | `apct.changeBill.ApctChangeCounterparty` | composition |

## 关联引用 (34个)

| 字段名 | 引用类型 |
|--------|---------|
| `rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `apctChangeBillDcs` | `` |
| `supplier_id` | `yssupplier.aa_vendor` |
| `activity` | `` |
| `` | `` |
| `ct_bustype` | `transtype.bd_billtyperef` |
| `wbs` | `` |
| `local_currency` | `` |
| `payer_account_id` | `` |
| `org_id` | `ucf-org-center.org_pure_tree_ref` |
| `currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `sign_org_id` | `ucf-org-center.org_pure_tree_ref` |
| `tenant_id` | `` |
| `pay_term_id` | `` |
| `payee_account_id` | `` |
| `ytenant_id` | `` |
| `dept_id` | `ucf-org-center.bd_admindepttreeviewref` |
| `acct_entity_id` | `ucf-org-center.bd_financeorgtreeref` |
| `bustype` | `transtype.bd_billtyperef` |
| `parent_id` | `` |
| `apply_bill_id` | `znbzbx.znbzbx_memoapplyref` |
| `personnel_id` | `ucf-staff-center.bd_staff_ref` |
| `settle_type_id` | `productcenter.aa_settlemethodref` |
| `project_id` | `ucfbasedoc.bd_projectNewRef` |
| `customer_id` | `aa.merchant.Merchant` |

## 继承接口 (9个, 28字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **逻辑删除相关** (`base.itf.Deletable`)
  - `iDeleted` → `iDeleted`
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **生单回写** (`base.itf.IBackWrite`)
  - `groupTaskKey` → `groupTaskKey`
  - `makerule_code` → `makerule_code`
  - `` → ``
  - `` → ``
  - `` → ``
  - `sourceMainPubts` → `sourceMainPubts`
  - `` → ``
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`

## 字段列表（按类型分组）

> 共 183 个直连字段

### 文本字段 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `attachment_id` | `attachment_id` | `attachmentId` | 附件 |
| `` | `auditor` | `auditor` | 审批人名称 |
| `code` | `code` | `code` | 合同编码 |
| `bizFlow` | `bizFlow` | `bizFlow` | 业务流id |
| `business_code` | `business_code` | `businessCode` | 合同业务号 |
| `ct_code` | `ct_code` | `ctCode` | 合同单据号 |
| `ct_version` | `ct_version` | `ctVersion` | 合同前版本号 |
| `name` | `name` | `name` | 合同名称 |
| `payee_cardno` | `payee_cardno` | `payeeCardno` | 收款方银行账号 |
| `payer_cardno` | `payer_cardno` | `payerCardno` | 付款方银行账号 |
| `reason` | `reason` | `reason` | 变更原因 |
| `version` | `version` | `version` | 合同锁版本号 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `push_bill_system` | `push_bill_system` | `pushBillSystem` | 下推单据系统 |
| `groupTaskKey` | `groupTaskKey` | `groupTaskKey` | 分组任务KEY |
| `makerule_code` | `makerule_code` | `makeRuleCode` | 生单规则编号 |
| `` | `source` | `source` | 上游单据类型 |
| `` | `upcode` | `upcode` | 上游单据号 |

### 引用字段 (26个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `pay_term_id` | `pay_term_id` | `payTermId` | 付款协议 |
| `acct_entity_id` | `acct_entity_id` | `acctEntityId` | 会计主体 |
| `apply_bill_id` | `apply_bill_id` | `applyBillId` | 申请单号 |
| `bustype` | `bustype` | `bustype` | 变更单类型 |
| `ct_bustype` | `ct_bustype` | `ctBustype` | 合同类型 |
| `currency_id` | `currency_id` | `currencyId` | 币种 |
| `dept_id` | `dept_id` | `deptId` | 承办部门 |
| `local_currency` | `local_currency` | `localCurrency` | 本币币种 |
| `org_id` | `org_id` | `orgId` | 承办组织 |
| `payee_account_id` | `payee_account_id` | `payeeAccountId` | 收款方银行账户 |
| `payer_account_id` | `payer_account_id` | `payerAccountId` | 付款方银行账户 |
| `personnel_id` | `personnel_id` | `personnelId` | 承办人员 |
| `project_id` | `project_id` | `projectId` | 项目名称 |
| `rate_type_id` | `rate_type_id` | `rateTypeId` | 汇率类型 |
| `settle_type_id` | `settle_type_id` | `settleTypeId` | 结算方式 |
| `sign_org_id` | `sign_org_id` | `signOrgId` | 签约组织(本方) |
| `supplier_id` | `supplier_id` | `supplierId` | 供应商 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `activity` | `activity` | `activity` | 活动 |
| `parent_id` | `parent_id` | `parentId` | 上级合同 |
| `customer_id` | `customer_id` | `customer` | 客户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `wbs` | `wbs` | `wbs` | WBS |

### 日期字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `ct_vouchdate` | `ct_vouchdate` | `ctVouchdate` | 合同单据日期 |
| `ct_date` | `ct_date` | `ctDate` | 合同日期 |
| `inval_date` | `inval_date` | `invalDate` | 计划终止日期 |
| `rate_date` | `rate_date` | `rateDate` | 汇率日期 |
| `sign_date` | `sign_date` | `signDate` | 签字盖章日期 |
| `val_date` | `val_date` | `valDate` | 计划生效日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iDeleted` | `iDeleted` | `isDeleted` | 逻辑删除标记 |
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |

### 短整数 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contract_direction` | `contract_direction` | `contractDirection` | 收支方向 |
| `beginning_flag` | `beginning_flag` | `beginningFlag` | 期初标识 |
| `open_flag` | `open_flag` | `openFlag` | 是否敞口合同 |
| `populate_mode` | `populate_mode` | `populateMode` | 计划金额计算方式 |
| `status` | `status` | `status` | 合同状态 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `` | `returncount` | `returncount` | 退回次数 |

### 长整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tplid` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | ID |
| `before_ct_id` | `before_ct_id` | `beforeCtId` | 变更前合同 |
| `ct_id` | `ct_id` | `ctId` | 合同 |
| `` | `sourceautoid` | `sourceautoid` | 上游单据子表id |
| `` | `sourceid` | `sourceid` | 上游单据主表id |

### 数值字段 (100个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `available_amt` | `available_amt` | `availableAmt` | 合同可用金额 |
| `used_amt` | `used_amt` | `usedAmt` | 合同已用金额 |
| `appr_advance_amt` | `appr_advance_amt` | `apprAdvanceAmt` | 已审批原币预付款金额 |
| `appr_amt` | `appr_amt` | `apprAmt` | 已审批原币付款金额 |
| `appr_margin_amt` | `appr_margin_amt` | `apprMarginAmt` | 已审批原币退保证金金额 |
| `appr_plan_refund_amt` | `appr_plan_refund_amt` | `apprPlanRefundAmt` | 已审批原币退款金额 |
| `appr_retention_amt` | `appr_retention_amt` | `apprRetentionAmt` | 已审批原币质保金金额 |
| `appr_subject_amt` | `appr_subject_amt` | `apprSubjectAmt` | 已审批原币应付金额 |
| `exceed_ratio` | `exceed_ratio` | `exceedRatio` | 超合同付款比例 |
| `margin_amt` | `margin_amt` | `marginAmt` | 原币已收保证金金额 |
| `margin_refund_amt` | `margin_refund_amt` | `marginRefundAmt` | 原币已退保证金金额 |
| `nexchange_rate` | `nexchange_rate` | `nexchangeRate` | 拆本汇率 |
| `original_receipt_amt` | `original_receipt_amt` | `originalReceiptAmt` | 原币收票金额 |
| `original_total_amt` | `original_total_amt` | `originalTotalAmt` | 原币付款金额 |
| `paid_advance_amt` | `paid_advance_amt` | `paidAdvanceAmt` | 原币已付预付款金额 |
| `paid_amt` | `paid_amt` | `paidAmt` | 原币已付款金额 |
| `paid_retention_amt` | `paid_retention_amt` | `paidRetentionAmt` | 原币已付质保金金额 |
| `unappr_advance_amt` | `unappr_advance_amt` | `unapprAdvanceAmt` | 未审批原币预付款金额 |
| `unappr_amt` | `unappr_amt` | `unapprAmt` | 未审批原币付款金额 |
| `unappr_margin_amt` | `unappr_margin_amt` | `unapprMarginAmt` | 未审批原币退保证金金额 |
| `unappr_retention_amt` | `unappr_retention_amt` | `unapprRetentionAmt` | 未审批原币质保金金额 |
| `unappr_subject_amt` | `unappr_subject_amt` | `unapprSubjectAmt` | 未审批原币应付金额 |
| `verfity_subject_amt` | `verfity_subject_amt` | `verfitySubjectAmt` | 已核销原币应付金额 |
| `original_money_amt` | `original_money_amt` | `originalMoneyAmt` | 原币价税合计 |
| `original_tax_amt` | `original_tax_amt` | `originalTaxAmt` | 原币税额 |
| `no_tax_original_money_amt` | `no_tax_original_money_amt` | `noTaxOriginalMoneyAmt` | 原币无税金额 |
| `local_money_amt` | `local_money_amt` | `localMoneyAmt` | 本币含税金额 |
| `local_tax_amt` | `local_tax_amt` | `localTaxAmt` | 本币税额 |
| `no_tax_local_money_amt` | `no_tax_local_money_amt` | `noTaxLocalMoneyAmt` | 本币无税金额 |
| `local_plan_amt` | `local_plan_amt` | `localPlanAmt` | 本币付款金额 |
| `retention_appr_plan_refund_amt` | `retention_appr_plan_refund_amt` | `retentionApprPlanRefundAmt` | 原币付款已退质保金金额 |
| `advance_appr_plan_refund_amt` | `advance_appr_plan_refund_amt` | `advanceApprPlanRefundAmt` | 原币已退预付款金额 |
| `local_retention_appr_plan_refund_amt` | `local_retention_appr_plan_refund_amt` | `localRetentionApprPlanRefundAmt` | 本币付款已退质保金金额 |
| `local_advance_appr_plan_refund_amt` | `local_advance_appr_plan_refund_amt` | `localAdvanceApprPlanRefundAmt` | 本币已退预付款金额 |
| `local_available_amt` | `local_available_amt` | `localAvailableAmt` | 本币合同付款可用金额 |
| `local_used_amt` | `local_used_amt` | `localUsedAmt` | 本币合同付款已用金额 |
| `local_original_receipt_amt` | `local_original_receipt_amt` | `localOriginalReceiptAmt` | 本币收票金额 |
| `local_unappr_amt` | `local_unappr_amt` | `localUnapprAmt` | 未审批本币付款金额 |
| `local_appr_amt` | `local_appr_amt` | `localApprAmt` | 已审批本币付款金额 |
| `local_paid_amt` | `local_paid_amt` | `localPaidAmt` | 本币已付款金额 |
| `local_appr_plan_refund_amt` | `local_appr_plan_refund_amt` | `localApprPlanRefundAmt` | 已审批本币退款金额 |
| `local_unappr_advance_amt` | `local_unappr_advance_amt` | `localUnapprAdvanceAmt` | 未审批本币预付款金额 |
| `local_appr_advance_amt` | `local_appr_advance_amt` | `localApprAdvanceAmt` | 已审批本币预付款金额 |
| `local_paid_advance_amt` | `local_paid_advance_amt` | `localPaidAdvanceAmt` | 本币已付预付款金额 |
| `local_unappr_retention_amt` | `local_unappr_retention_amt` | `localUnapprRetentionAmt` | 未审批本币质保金金额 |
| `local_appr_retention_amt` | `local_appr_retention_amt` | `localApprRetentionAmt` | 已审批本币质保金金额 |
| `local_paid_retention_amt` | `local_paid_retention_amt` | `localPaidRetentionAmt` | 本币已付质保金金额 |
| `local_margin_amt` | `local_margin_amt` | `localMarginAmt` | 本币已收保证金金额 |
| `local_unappr_margin_amt` | `local_unappr_margin_amt` | `localUnapprMarginAmt` | 未审批本币退保证金金额 |
| `local_appr_margin_amt` | `local_appr_margin_amt` | `localApprMarginAmt` | 已审批本币退保证金金额 |
| `local_margin_refund_amt` | `local_margin_refund_amt` | `localMarginRefundAmt` | 本币已退保证金金额 |
| `unappr_subject_local_amt` | `unappr_subject_local_amt` | `unapprSubjectLocalAmt` | 未审批本币应付金额 |
| `appr_subject_local_amt` | `appr_subject_local_amt` | `apprSubjectLocalAmt` | 已审批本币应付金额 |
| `verified_subject_local_amt` | `verified_subject_local_amt` | `verifiedSubjectLocalAmt` | 已核销本币应付金额 |
| `roriginal_total_amt` | `roriginal_total_amt` | `roriginalTotalAmt` | 原币收款金额 |
| `rlocal_plan_amt` | `rlocal_plan_amt` | `rlocalPlanAmt` | 本币收款金额 |
| `ravailable_amt` | `ravailable_amt` | `ravailableAmt` | 原币合同收款可用金额 |
| `rused_amt` | `rused_amt` | `rusedAmt` | 原币合同收款已用金额 |
| `rlocal_available_amt` | `rlocal_available_amt` | `rlocalAvailableAmt` | 本币合同收款可用金额 |
| `rlocal_used_amt` | `rlocal_used_amt` | `rlocalUsedAmt` | 本币合同收款已用金额 |
| `rretention_appr_plan_refund_amt` | `rretention_appr_plan_refund_amt` | `rretentionApprPlanRefundAmt` | 原币收款已退质保金金额 |
| `radvance_appr_plan_refund_amt` | `radvance_appr_plan_refund_amt` | `radvanceApprPlanRefundAmt` | 原币已退预收款金额 |
| `rlocal_retention_appr_plan_refund_amt` | `rlocal_retention_appr_plan_refund_amt` | `rlocalRetentionApprPlanRefundAmt` | 本币收款已退质保金金额 |
| `rlocal_advance_appr_plan_refund_amt` | `rlocal_advance_appr_plan_refund_amt` | `rlocalAdvanceApprPlanRefundAmt` | 本币已退预收款金额 |
| `roriginal_receipt_amt` | `roriginal_receipt_amt` | `roriginalReceiptAmt` | 原币开票金额 |
| `runappr_amt` | `runappr_amt` | `runapprAmt` | 未审批原币收款金额 |
| `rappr_amt` | `rappr_amt` | `rapprAmt` | 已审批原币收款金额 |
| `rpaid_amt` | `rpaid_amt` | `rpaidAmt` | 原币已收款金额 |
| `rappr_plan_refund_amt` | `rappr_plan_refund_amt` | `rapprPlanRefundAmt` | 已审批原币退款金额 |
| `runappr_advance_amt` | `runappr_advance_amt` | `runapprAdvanceAmt` | 未审批原币预收款金额 |
| `rappr_advance_amt` | `rappr_advance_amt` | `rapprAdvanceAmt` | 已审批原币预收款金额 |
| `rpaid_advance_amt` | `rpaid_advance_amt` | `rpaidAdvanceAmt` | 原币已收预收款金额 |
| `runappr_retention_amt` | `runappr_retention_amt` | `runapprRetentionAmt` | 未审批原币质保金金额 |
| `rappr_retention_amt` | `rappr_retention_amt` | `rapprRetentionAmt` | 已审批原币质保金金额 |
| `rpaid_retention_amt` | `rpaid_retention_amt` | `rpaidRetentionAmt` | 原币收款质保金金额 |
| `rmargin_amt` | `rmargin_amt` | `rmarginAmt` | 原币已收保证金金额 |
| `runappr_margin_amt` | `runappr_margin_amt` | `runapprMarginAmt` | 未审批原币退保证金金额 |
| `rappr_margin_amt` | `rappr_margin_amt` | `rapprMarginAmt` | 已审批原币退保证金金额 |
| `rmargin_refund_amt` | `rmargin_refund_amt` | `rmarginRefundAmt` | 原币已退保证金金额 |
| `rlocal_original_receipt_amt` | `rlocal_original_receipt_amt` | `rlocalOriginalReceiptAmt` | 本币开票金额 |
| `rlocal_unappr_amt` | `rlocal_unappr_amt` | `rlocalUnapprAmt` | 未审批本币收款金额 |
| `rlocal_appr_amt` | `rlocal_appr_amt` | `rlocalApprAmt` | 已审批本币收款金额 |
| `rlocal_paid_amt` | `rlocal_paid_amt` | `rlocalPaidAmt` | 本币已收款金额 |
| `rlocal_appr_plan_refund_amt` | `rlocal_appr_plan_refund_amt` | `rlocalApprPlanRefundAmt` | 已审批本币退款金额 |
| `rlocal_unappr_advance_amt` | `rlocal_unappr_advance_amt` | `rlocalUnapprAdvanceAmt` | 未审批本币预收款金额 |
| `rlocal_appr_advance_amt` | `rlocal_appr_advance_amt` | `rlocalApprAdvanceAmt` | 已审批本币预收款金额 |
| `rlocal_paid_advance_amt` | `rlocal_paid_advance_amt` | `rlocalPaidAdvanceAmt` | 本币已收预收款金额 |
| `rlocal_unappr_retention_amt` | `rlocal_unappr_retention_amt` | `rlocalUnapprRetentionAmt` | 未审批本币质保金金额 |
| `rlocal_appr_retention_amt` | `rlocal_appr_retention_amt` | `rlocalApprRetentionAmt` | 已审批本币质保金金额 |
| `rlocal_paid_retention_amt` | `rlocal_paid_retention_amt` | `rlocalPaidRetentionAmt` | 本币收款质保金金额 |
| `rlocal_margin_amt` | `rlocal_margin_amt` | `rlocalMarginAmt` | 本币已收保证金金额 |
| `rlocal_unappr_margin_amt` | `rlocal_unappr_margin_amt` | `rlocalUnapprMarginAmt` | 未审批本币退保证金金额 |
| `rlocal_appr_margin_amt` | `rlocal_appr_margin_amt` | `rlocalApprMarginAmt` | 已审批本币退保证金金额 |
| `rlocal_margin_refund_amt` | `rlocal_margin_refund_amt` | `rlocalMarginRefundAmt` | 本币已退保证金金额 |
| `runappr_subject_original_amt` | `runappr_subject_original_amt` | `runapprSubjectOriginalAmt` | 未审批原币应收金额 |
| `rappr_subject_original_amt` | `rappr_subject_original_amt` | `rapprSubjectOriginalAmt` | 已审批原币应收金额 |
| `rverified_subject_original_amt` | `rverified_subject_original_amt` | `rverifiedSubjectOriginalAmt` | 已核销原币应收金额 |
| `runappr_subject_local_amt` | `runappr_subject_local_amt` | `runapprSubjectLocalAmt` | 未审批本币应收金额 |
| `rappr_subject_local_amt` | `rappr_subject_local_amt` | `rapprSubjectLocalAmt` | 已审批本币应收金额 |
| `rverified_subject_local_amt` | `rverified_subject_local_amt` | `rverifiedSubjectLocalAmt` | 已核销本币应收金额 |

### timestamp (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `sourceMainPubts` | `sourceMainPubts` | `sourceMainPubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `apctChangeBillDcs` | `apctChangeBillDcs` | `apctChangeBillDcs` | 付款合同变更单自定义项 |

### other (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nexchange_rateOps` | `nexchange_rateOps` | `nexchangeRateOps` | 拆本汇率折算方式 |
| `` | `` | `apctChangeCounterpartys` | 合同变更单相对方 |
| `` | `` | `changeibpmcurrentauditor` | 变更单审批当前审批人 |
| `` | `` | `ibpmsteps` | 变更单审批业务阶段 |
| `` | `` | `items` | 合同条款 |
| `` | `` | `materials` | 合同变更单标的物 |
| `` | `` | `plans` | 合同变更单付款计划 |
| `` | `` | `receiptplans` | 合同变更单收款计划 |
