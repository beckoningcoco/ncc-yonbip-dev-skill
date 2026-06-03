---
tags: [BIP, 元数据, 数据字典, apct.contract.Apct]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同单据表 (`apct.contract.Apct`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`apct_apct` | domain：`apct` | 应用：`APCT` | 业务对象ID：`7474fc16-45d2-47b5-b2ed-84fe62cac46d`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同单据表 |
| 物理表 | `apct_apct` |
| 数据库 schema | `apct` |
| 所属应用 | `APCT` |
| 直连字段 | 305 个 |
| 子表 | 17 个 |
| 关联引用 | 45 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `margins` | `apct.contract.ApctMargin` | composition |
| `processes` | `apct.contract.ApctProcess` | composition |
| `hisrecords` | `apct.contract.ApctHisrecord` | composition |
| `apctownersub` | `apct.contract.ApctOwnerSub` | composition |
| `relateVouchers` | `apct.contract.ApctRelateVoucher` | composition |
| `apctInvoiceinfos` | `apct.contract.ApctInvoiceinfo` | composition |
| `apctOwnerChangelogs` | `apct.contract.ApctOwnerChangeLog` | composition |
| `thirdVoucher` | `apct.contract.ApctThirdVoucher` | composition |
| `receiptplans` | `apct.contract.ApctReceiptplan` | composition |
| `ibpmcurrentauditors` | `apct.contract.ApctIBpmApprovalTask` | composition |
| `materials` | `apct.contract.ApctMaterial` | composition |
| `plans` | `apct.contract.ApctPlan` | composition |
| `ibpmsteps` | `apct.contract.ApctIBpmStep` | composition |
| `memorabilias` | `apct.contract.ApctMemorabilia` | composition |
| `apctInvoicinginfos` | `apct.contract.ApctInvoicinginfo` | composition |
| `items` | `apct.contract.ApctItem` | composition |
| `apctCounterpartys` | `apct.contract.ApctCounterparty` | composition |

## 关联引用 (45个)

| 字段名 | 引用类型 |
|--------|---------|
| `rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `` | `` |
| `supplier_id` | `yssupplier.aa_vendor` |
| `contract_ledgerId` | `` |
| `activity` | `` |
| `contract_type` | `` |
| `wbs` | `` |
| `local_currency` | `` |
| `payer_account_id` | `` |
| `org_id` | `ucf-org-center.org_pure_tree_ref` |
| `apctApctDcs` | `` |
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
| `customer_id` | `` |

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

> 共 305 个直连字段

### 文本字段 (20个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `groupTaskKey` | `groupTaskKey` | `groupTaskKey` | 分组任务KEY |
| `makerule_code` | `makerule_code` | `makeRuleCode` | 生单规则编号 |
| `` | `source` | `source` | 上游单据类型 |
| `` | `upcode` | `upcode` | 上游单据号 |
| `push_bill_system` | `push_bill_system` | `pushBillSystem` | 下推单据系统 |
| `bizFlow` | `bizFlow` | `bizFlow` | 业务流id |
| `ct_version_bak` | `ct_version_bak` | `ctVersionBak` | 合同版本号备份 |
| `version_bak` | `version_bak` | `versionBak` | 锁版本号备份 |
| `attachment_id` | `attachment_id` | `attachmentId` | 附件 |
| `` | `auditor` | `auditor` | 审批人名称 |
| `business_code` | `business_code` | `businessCode` | 合同业务号 |
| `code` | `code` | `code` | 合同单据号 |
| `` | `creator` | `creator` | 创建人名称 |
| `ct_version` | `ct_version` | `ctVersion` | 合同版本号 |
| `name` | `name` | `name` | 合同名称 |
| `payee_cardno` | `payee_cardno` | `payeeCardno` | 收款方银行账号 |
| `payer_cardno` | `payer_cardno` | `payerCardno` | 付款方银行账号 |
| `version` | `version` | `version` | 锁版本号 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `ctfrom` | `ctfrom` | `ctfrom` | 来源系统 |

### 引用字段 (27个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acct_entity_id` | `acct_entity_id` | `acctEntityId` | 会计主体 |
| `contract_ledgerId` | `contract_ledgerId` | `contractLedgerId` | 合同台账 |
| `contract_type` | `contract_type` | `contractType` | 合同类型 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `apply_bill_id` | `apply_bill_id` | `applyBillId` | 申请单号 |
| `local_currency` | `local_currency` | `localCurrency` | 本币币种 |
| `parent_id` | `parent_id` | `parentId` | 上级合同 |
| `customer_id` | `customer_id` | `customer` | 客户 |
| `wbs` | `wbs` | `wbs` | WBS |
| `activity` | `activity` | `activity` | 活动 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `currency_id` | `currency_id` | `currencyId` | 币种 |
| `dept_id` | `dept_id` | `deptId` | 承办部门 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `org_id` | `org_id` | `orgId` | 承办组织 |
| `pay_term_id` | `pay_term_id` | `payTermId` | 付款协议 |
| `payee_account_id` | `payee_account_id` | `payeeAccountId` | 收款方银行账户 |
| `payer_account_id` | `payer_account_id` | `payerAccountId` | 付款方银行账户 |
| `personnel_id` | `personnel_id` | `personnelId` | 承办人员 |
| `project_id` | `project_id` | `projectId` | 项目名称 |
| `rate_type_id` | `rate_type_id` | `rateTypeId` | 汇率类型 |
| `settle_type_id` | `settle_type_id` | `settleTypeId` | 结算方式 |
| `sign_org_id` | `sign_org_id` | `signOrgId` | 签约组织(本方) |
| `supplier_id` | `supplier_id` | `supplierId` | 供应商 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |

### 日期字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `inval_date` | `inval_date` | `invalDate` | 计划终止日期 |
| `rate_date` | `rate_date` | `rateDate` | 汇率日期 |
| `sign_date` | `sign_date` | `signDate` | 签字盖章日期 |
| `val_date` | `val_date` | `valDate` | 计划生效日期 |
| `vouchdate` | `vouchdate` | `vouchdate` | 单据日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isprojectapply` | `isprojectapply` | `isprojectapply` | 是否引用立项申请 |
| `iDeleted` | `iDeleted` | `isDeleted` | 逻辑删除标记 |
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `settledcount` | `settledcount` | `settledcount` | 已审批原币付款次数 |

### 短整数 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contract_class` | `contract_class` | `contractClass` | 合同性质 |
| `contract_direction` | `contract_direction` | `contractDirection` | 收支方向 |
| `contract_amount_control` | `contract_amount_control` | `contractAmountControl` | 合同金额控制方式 |
| `history_flag_bak` | `history_flag_bak` | `historyFlagBak` | 是否历史版本备份 |
| `status_bak` | `status_bak` | `statusBak` | 合同状态备份 |
| `beginning_flag` | `beginning_flag` | `beginningFlag` | 期初标识 |
| `history_flag` | `history_flag` | `historyFlag` | 是否历史版本 |
| `open_flag` | `open_flag` | `openFlag` | 是否敞口合同 |
| `populate_mode` | `populate_mode` | `populateMode` | 计划金额计算方式 |
| `` | `returncount` | `returncount` | 退回次数 |
| `status` | `status` | `status` | 合同状态 |
| `` | `verifystate` | `verifystate` | 审批状态 |

### 长整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `sourceautoid` | `sourceautoid` | 上游单据子表id |
| `` | `sourceid` | `sourceid` | 上游单据主表id |
| `change_id` | `change_id` | `changeId` | 当前变更单 |
| `tplid` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | ID |

### 数值字段 (205个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `appr_advance_amt` | `appr_advance_amt` | `apprAdvanceAmt` | 已审批原币预付款金额 |
| `appr_amt` | `appr_amt` | `apprAmt` | 已审批原币付款金额 |
| `appr_margin_amt` | `appr_margin_amt` | `apprMarginAmt` | 已审批原币退保证金金额 |
| `appr_plan_refund_amt` | `appr_plan_refund_amt` | `apprPlanRefundAmt` | 已审批原币退款金额 |
| `original_money_amt` | `original_money_amt` | `originalMoneyAmt` | 原币价税合计 |
| `original_tax_amt` | `original_tax_amt` | `originalTaxAmt` | 原币税额 |
| `no_tax_original_money_amt` | `no_tax_original_money_amt` | `noTaxOriginalMoneyAmt` | 原币无税金额 |
| `local_money_amt` | `local_money_amt` | `localMoneyAmt` | 本币含税金额 |
| `local_tax_amt` | `local_tax_amt` | `localTaxAmt` | 本币税额 |
| `expense_reference_amt` | `expense_reference_amt` | `expenseReferenceAmt` | 原币报销参照金额 |
| `appr_advance_amt_bak` | `appr_advance_amt_bak` | `apprAdvanceAmtBak` | 已审批原币预付款金额备份 |
| `appr_amt_bak` | `appr_amt_bak` | `apprAmtBak` | 已审批原币付款金额备份 |
| `appr_margin_amt_bak` | `appr_margin_amt_bak` | `apprMarginAmtBak` | 已审批原币退保证金金额备份 |
| `appr_plan_refund_amt_bak` | `appr_plan_refund_amt_bak` | `apprPlanRefundAmtBak` | 已审批原币退款金额备份 |
| `original_tax_amt_bak` | `original_tax_amt_bak` | `originalTaxAmtBak` | 原币税额备份 |
| `no_tax_original_money_amt_bak` | `no_tax_original_money_amt_bak` | `noTaxOriginalMoneyAmtBak` | 原币无税金额备份 |
| `local_money_amt_bak` | `local_money_amt_bak` | `localMoneyAmtBak` | 本币含税金额备份 |
| `local_tax_amt_bak` | `local_tax_amt_bak` | `localTaxAmtBak` | 本币税额备份 |
| `no_tax_local_money_amt_bak` | `no_tax_local_money_amt_bak` | `noTaxLocalMoneyAmtBak` | 本币无税金额备份 |
| `local_plan_amt_bak` | `local_plan_amt_bak` | `localPlanAmtBak` | 本币付款金额备份 |
| `retention_appr_plan_refund_amt_bak` | `retention_appr_plan_refund_amt_bak` | `retentionApprPlanRefundAmtBak` | 原币付款已退质保金金额备份 |
| `advance_appr_plan_refund_amt_bak` | `advance_appr_plan_refund_amt_bak` | `advanceApprPlanRefundAmtBak` | 原币已退预付款金额备份 |
| `local_retention_appr_plan_refund_amt_bak` | `local_retention_appr_plan_refund_amt_bak` | `localRetentionApprPlanRefundAmtBak` | 本币付款已退质保金金额备份 |
| `local_advance_appr_plan_refund_amt_bak` | `local_advance_appr_plan_refund_amt_bak` | `localAdvanceApprPlanRefundAmtBak` | 本币已退预付款金额备份 |
| `local_available_amt_bak` | `local_available_amt_bak` | `localAvailableAmtBak` | 本币合同付款可用金额备份 |
| `local_used_amt_bak` | `local_used_amt_bak` | `localUsedAmtBak` | 本币合同付款已用金额备份 |
| `local_original_receipt_amt_bak` | `local_original_receipt_amt_bak` | `localOriginalReceiptAmtBak` | 本币收票金额备份 |
| `local_unappr_amt_bak` | `local_unappr_amt_bak` | `localUnapprAmtBak` | 未审批本币付款金额备份 |
| `local_appr_amt_bak` | `local_appr_amt_bak` | `localApprAmtBak` | 已审批本币付款金额备份 |
| `local_paid_amt_bak` | `local_paid_amt_bak` | `localPaidAmtBak` | 本币已付款金额备份 |
| `local_appr_plan_refund_amt_bak` | `local_appr_plan_refund_amt_bak` | `localApprPlanRefundAmtBak` | 已审批本币退款金额备份 |
| `unlocal_appr_plan_refund_amt_bak` | `unlocal_appr_plan_refund_amt_bak` | `unlocalApprPlanRefundAmtBak` | 未审批本币退款金额备份 |
| `local_unappr_advance_amt_bak` | `local_unappr_advance_amt_bak` | `localUnapprAdvanceAmtBak` | 未审批本币预付款金额备份 |
| `local_appr_advance_amt_bak` | `local_appr_advance_amt_bak` | `localApprAdvanceAmtBak` | 已审批本币预付款金额备份 |
| `local_paid_advance_amt_bak` | `local_paid_advance_amt_bak` | `localPaidAdvanceAmtBak` | 本币已付预付款金额备份 |
| `local_unappr_retention_amt_bak` | `local_unappr_retention_amt_bak` | `localUnapprRetentionAmtBak` | 未审批本币质保金金额备份 |
| `local_appr_retention_amt_bak` | `local_appr_retention_amt_bak` | `localApprRetentionAmtBak` | 已审批本币质保金金额备份 |
| `local_paid_retention_amt_bak` | `local_paid_retention_amt_bak` | `localPaidRetentionAmtBak` | 本币已付质保金金额备份 |
| `local_margin_amt_bak` | `local_margin_amt_bak` | `localMarginAmtBak` | 本币已收保证金金额备份 |
| `local_unappr_margin_amt_bak` | `local_unappr_margin_amt_bak` | `localUnapprMarginAmtBak` | 未审批本币退保证金金额备份 |
| `local_appr_margin_amt_bak` | `local_appr_margin_amt_bak` | `localApprMarginAmtBak` | 已审批本币退保证金金额备份 |
| `local_margin_refund_amt_bak` | `local_margin_refund_amt_bak` | `localMarginRefundAmtBak` | 本币已退保证金金额备份 |
| `unappr_plan_refund_amt_bak` | `unappr_plan_refund_amt_bak` | `unapprPlanRefundAmtBak` | 未审批原币退款金额备份 |
| `unappr_subject_local_amt_bak` | `unappr_subject_local_amt_bak` | `unapprSubjectLocalAmtBak` | 未审批本币应付金额备份 |
| `appr_subject_local_amt_bak` | `appr_subject_local_amt_bak` | `apprSubjectLocalAmtBak` | 已审批本币应付金额备份 |
| `verified_subject_local_amt_bak` | `verified_subject_local_amt_bak` | `verifiedSubjectLocalAmtBak` | 已核销本币应付金额备份 |
| `roriginal_total_amt_bak` | `roriginal_total_amt_bak` | `roriginalTotalAmtBak` | 原币收款金额备份 |
| `rlocal_plan_amt_bak` | `rlocal_plan_amt_bak` | `rlocalPlanAmtBak` | 本币收款金额备份 |
| `ravailable_amt_bak` | `ravailable_amt_bak` | `ravailableAmtBak` | 原币合同收款可用金额备份 |
| `rused_amt_bak` | `rused_amt_bak` | `rusedAmtBak` | 原币合同收款已用金额备份 |
| `rlocal_available_amt_bak` | `rlocal_available_amt_bak` | `rlocalAvailableAmtBak` | 本币合同收款可用金额备份 |
| `rlocal_used_amt_bak` | `rlocal_used_amt_bak` | `rlocalUsedAmtBak` | 本币合同收款已用金额备份 |
| `rretention_appr_plan_refund_amt_bak` | `rretention_appr_plan_refund_amt_bak` | `rretentionApprPlanRefundAmtBak` | 原币收款已退质保金金额备份 |
| `radvance_appr_plan_refund_amt_bak` | `radvance_appr_plan_refund_amt_bak` | `radvanceApprPlanRefundAmtBak` | 原币已退预收款金额备份 |
| `rlocal_retention_appr_plan_refund_amt_bak` | `rlocal_retention_appr_plan_refund_amt_bak` | `rlocalRetentionApprPlanRefundAmtBak` | 本币收款已退质保金金额备份 |
| `rlocal_advance_appr_plan_refund_amt_bak` | `rlocal_advance_appr_plan_refund_amt_bak` | `rlocalAdvanceApprPlanRefundAmtBak` | 本币已退预收款金额备份 |
| `roriginal_receipt_amt_bak` | `roriginal_receipt_amt_bak` | `roriginalReceiptAmtBak` | 原币开票金额备份 |
| `runappr_amt_bak` | `runappr_amt_bak` | `runapprAmtBak` | 未审批原币收款金额备份 |
| `rappr_amt_bak` | `rappr_amt_bak` | `rapprAmtBak` | 已审批原币收款金额备份 |
| `rpaid_amt_bak` | `rpaid_amt_bak` | `rpaidAmtBak` | 原币已收款金额备份 |
| `rappr_plan_refund_amt_bak` | `rappr_plan_refund_amt_bak` | `rapprPlanRefundAmtBak` | 已审批原币退款金额备份 |
| `unrappr_plan_refund_amt_bak` | `unrappr_plan_refund_amt_bak` | `unrapprPlanRefundAmtBak` | 未审批原币退款金额备份 |
| `runappr_advance_amt_bak` | `runappr_advance_amt_bak` | `runapprAdvanceAmtBak` | 未审批原币预收款金额备份 |
| `rappr_advance_amt_bak` | `rappr_advance_amt_bak` | `rapprAdvanceAmtBak` | 已审批原币预收款金额备份 |
| `rpaid_advance_amt_bak` | `rpaid_advance_amt_bak` | `rpaidAdvanceAmtBak` | 原币已收预收款金额备份 |
| `runappr_retention_amt_bak` | `runappr_retention_amt_bak` | `runapprRetentionAmtBak` | 未审批原币质保金金额备份 |
| `rappr_retention_amt_bak` | `rappr_retention_amt_bak` | `rapprRetentionAmtBak` | 已审批原币质保金金额备份 |
| `rpaid_retention_amt_bak` | `rpaid_retention_amt_bak` | `rpaidRetentionAmtBak` | 原币收款质保金金额备份 |
| `rmargin_amt_bak` | `rmargin_amt_bak` | `rmarginAmtBak` | 原币已收保证金金额备份 |
| `runappr_margin_amt_bak` | `runappr_margin_amt_bak` | `runapprMarginAmtBak` | 未审批原币退保证金金额备份 |
| `rappr_margin_amt_bak` | `rappr_margin_amt_bak` | `rapprMarginAmtBak` | 已审批原币退保证金金额备份 |
| `rmargin_refund_amt_bak` | `rmargin_refund_amt_bak` | `rmarginRefundAmtBak` | 原币已退保证金金额备份 |
| `rlocal_original_receipt_amt_bak` | `rlocal_original_receipt_amt_bak` | `rlocalOriginalReceiptAmtBak` | 本币开票金额备份 |
| `rlocal_unappr_amt_bak` | `rlocal_unappr_amt_bak` | `rlocalUnapprAmtBak` | 未审批本币收款金额备份 |
| `rlocal_appr_amt_bak` | `rlocal_appr_amt_bak` | `rlocalApprAmtBak` | 已审批本币收款金额备份 |
| `rlocal_paid_amt_bak` | `rlocal_paid_amt_bak` | `rlocalPaidAmtBak` | 本币已收款金额备份 |
| `rlocal_appr_plan_refund_amt_bak` | `rlocal_appr_plan_refund_amt_bak` | `rlocalApprPlanRefundAmtBak` | 已审批本币退款金额备份 |
| `unrlocal_appr_plan_refund_amt_bak` | `unrlocal_appr_plan_refund_amt_bak` | `unrlocalApprPlanRefundAmtBak` | 未审批本币退款金额备份 |
| `rlocal_unappr_advance_amt_bak` | `rlocal_unappr_advance_amt_bak` | `rlocalUnapprAdvanceAmtBak` | 未审批本币预收款金额备份 |
| `rlocal_appr_advance_amt_bak` | `rlocal_appr_advance_amt_bak` | `rlocalApprAdvanceAmtBak` | 已审批本币预收款金额备份 |
| `rlocal_paid_advance_amt_bak` | `rlocal_paid_advance_amt_bak` | `rlocalPaidAdvanceAmtBak` | 本币已收预收款金额备份 |
| `rlocal_unappr_retention_amt_bak` | `rlocal_unappr_retention_amt_bak` | `rlocalUnapprRetentionAmtBak` | 未审批本币质保金金额备份 |
| `rlocal_appr_retention_amt_bak` | `rlocal_appr_retention_amt_bak` | `rlocalApprRetentionAmtBak` | 已审批本币质保金金额备份 |
| `rlocal_paid_retention_amt_bak` | `rlocal_paid_retention_amt_bak` | `rlocalPaidRetentionAmtBak` | 本币收款质保金金额备份 |
| `rlocal_margin_amt_bak` | `rlocal_margin_amt_bak` | `rlocalMarginAmtBak` | 本币已收保证金金额备份 |
| `rlocal_unappr_margin_amt_bak` | `rlocal_unappr_margin_amt_bak` | `rlocalUnapprMarginAmtBak` | 未审批本币退保证金金额备份 |
| `rlocal_appr_margin_amt_bak` | `rlocal_appr_margin_amt_bak` | `rlocalApprMarginAmtBak` | 已审批本币退保证金金额备份 |
| `rlocal_margin_refund_amt_bak` | `rlocal_margin_refund_amt_bak` | `rlocalMarginRefundAmtBak` | 本币已退保证金金额备份 |
| `runappr_subject_original_amt_bak` | `runappr_subject_original_amt_bak` | `runapprSubjectOriginalAmtBak` | 未审批原币应收金额备份 |
| `rappr_subject_original_amt_bak` | `rappr_subject_original_amt_bak` | `rapprSubjectOriginalAmtBak` | 已审批原币应收金额备份 |
| `rverified_subject_original_amt_bak` | `rverified_subject_original_amt_bak` | `rverifiedSubjectOriginalAmtBak` | 已核销原币应收金额备份 |
| `runappr_subject_local_amt_bak` | `runappr_subject_local_amt_bak` | `runapprSubjectLocalAmtBak` | 未审批本币应收金额备份 |
| `rappr_subject_local_amt_bak` | `rappr_subject_local_amt_bak` | `rapprSubjectLocalAmtBak` | 已审批本币应收金额备份 |
| `rverified_subject_local_amt_bak` | `rverified_subject_local_amt_bak` | `rverifiedSubjectLocalAmtBak` | 已核销本币应收金额备份 |
| `appr_retention_amt_bak` | `appr_retention_amt_bak` | `apprRetentionAmtBak` | 已审批原币质保金金额备份 |
| `appr_subject_amt_bak` | `appr_subject_amt_bak` | `apprSubjectAmtBak` | 已审批原币应付金额备份 |
| `available_amt_bak` | `available_amt_bak` | `availableAmtBak` | 合同可用金额备份 |
| `margin_amt_bak` | `margin_amt_bak` | `marginAmtBak` | 原币已收保证金金额备份 |
| `margin_refund_amt_bak` | `margin_refund_amt_bak` | `marginRefundAmtBak` | 原币已退保证金金额备份 |
| `original_receipt_amt_bak` | `original_receipt_amt_bak` | `originalReceiptAmtBak` | 原币收票金额备份 |
| `paid_advance_amt_bak` | `paid_advance_amt_bak` | `paidAdvanceAmtBak` | 原币已付预付款金额备份 |
| `paid_amt_bak` | `paid_amt_bak` | `paidAmtBak` | 原币已付款金额备份 |
| `paid_retention_amt_bak` | `paid_retention_amt_bak` | `paidRetentionAmtBak` | 原币已付质保金金额备份 |
| `unappr_advance_amt_bak` | `unappr_advance_amt_bak` | `unapprAdvanceAmtBak` | 未审批原币预付款金额备份 |
| `unappr_amt_bak` | `unappr_amt_bak` | `unapprAmtBak` | 未审批原币付款金额备份 |
| `unappr_margin_amt_bak` | `unappr_margin_amt_bak` | `unapprMarginAmtBak` | 未审批原币退保证金金额备份 |
| `unappr_retention_amt_bak` | `unappr_retention_amt_bak` | `unapprRetentionAmtBak` | 未审批原币质保金金额备份 |
| `unappr_subject_amt_bak` | `unappr_subject_amt_bak` | `unapprSubjectAmtBak` | 未审批原币应付金额备份 |
| `used_amt_bak` | `used_amt_bak` | `usedAmtBak` | 合同已用金额备份 |
| `verfity_subject_amt_bak` | `verfity_subject_amt_bak` | `verfitySubjectAmtBak` | 已核销原币应付金额备份 |
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
| `unlocal_appr_plan_refund_amt` | `unlocal_appr_plan_refund_amt` | `unlocalApprPlanRefundAmt` | 未审批本币退款金额 |
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
| `unappr_plan_refund_amt` | `unappr_plan_refund_amt` | `unapprPlanRefundAmt` | 未审批原币退款金额 |
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
| `unrappr_plan_refund_amt` | `unrappr_plan_refund_amt` | `unrapprPlanRefundAmt` | 未审批原币退款金额 |
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
| `unrlocal_appr_plan_refund_amt` | `unrlocal_appr_plan_refund_amt` | `unrlocalApprPlanRefundAmt` | 未审批本币退款金额 |
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
| `appr_retention_amt` | `appr_retention_amt` | `apprRetentionAmt` | 已审批原币质保金金额 |
| `appr_subject_amt` | `appr_subject_amt` | `apprSubjectAmt` | 已审批原币应付金额 |
| `available_amt` | `available_amt` | `availableAmt` | 合同可用金额 |
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
| `used_amt` | `used_amt` | `usedAmt` | 合同已用金额 |
| `verfity_subject_amt` | `verfity_subject_amt` | `verfitySubjectAmt` | 已核销原币应付金额 |

### timestamp (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sourceMainPubts` | `sourceMainPubts` | `sourceMainPubts` | 时间戳 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nexchange_rateOps` | `nexchange_rateOps` | `nexchangeRateOps` | 拆本汇率折算方式 |
| `` | `` | `apctCounterpartys` | 合同相对方 |
| `` | `` | `apctInvoiceinfos` | 收票信息 |
| `` | `` | `apctInvoicinginfos` | 开票信息 |
| `` | `` | `apctOwnerChangelogs` | 所属人维护记录 |
| `` | `` | `apctownersub` | 合同所属人子表 |
| `` | `` | `hisrecords` | 变更历史 |
| `` | `` | `ibpmcurrentauditors` | 合同审批当前审批人 |
| `` | `` | `ibpmsteps` | 合同审批业务阶段 |
| `` | `` | `items` | 合同条款 |
| `` | `` | `margins` | 履约保证金 |
| `` | `` | `materials` | 标的物 |
| `` | `` | `memorabilias` | 合同大事记 |
| `` | `` | `plans` | 付款计划 |
| `` | `` | `processes` | 执行过程 |
| `` | `` | `receiptplans` | 收款计划 |
| `` | `` | `relateVouchers` | 下游关联单据 |
| `` | `` | `thirdVoucher` | 中间表数据标的物和付款计划 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `apctApctDcs` | `apctApctDcs` | `apctApctDcs` | 合同自定义项 |
