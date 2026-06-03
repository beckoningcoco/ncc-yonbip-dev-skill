---
tags: [BIP, 元数据, 数据字典, apct.contract.ApctReceiptplan]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 收款计划 (`apct.contract.ApctReceiptplan`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`apct_apct_receiptplan` | domain：`apct` | 应用：`APCT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 收款计划 |
| 物理表 | `apct_apct_receiptplan` |
| 数据库 schema | `apct` |
| 所属应用 | `APCT` |
| 直连字段 | 104 个 |
| 子表 | 0 个 |
| 关联引用 | 14 个 |

## 关联引用 (14个)

| 字段名 | 引用类型 |
|--------|---------|
| `ct_id` | `` |
| `supplier_id` | `` |
| `expenseitem_id` | `` |
| `ytenant_id` | `` |
| `amt_type_id` | `` |
| `` | `` |
| `acct_entity_id` | `` |
| `receive_agreement_id` | `` |
| `apctApctReceiptplanDcs` | `` |
| `settle_mode_id` | `` |
| `tenant_id` | `` |
| `begin_base` | `` |
| `customer_id` | `` |

## 继承接口 (5个, 18字段)

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
- **生单回写** (`base.itf.IBackWrite`)
  - `groupTaskKey` → `groupTaskKey`
  - `makerule_code` → `makerule_code`
  - `` → ``
  - `` → ``
  - `` → ``
  - `sourceMainPubts` → `sourceMainPubts`
  - `` → ``

## 字段列表（按类型分组）

> 共 104 个直连字段

### 文本字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `account_period_unit_id` | `account_period_unit_id` | `accountPeriodUnitId` | 账期单位 |
| `code` | `code` | `code` | 计划编码 |
| `condition` | `condition` | `condition` | 收款条件 |
| `` | `creator` | `creator` | 创建人名称 |
| `groupTaskKey` | `groupTaskKey` | `groupTaskKey` | 分组任务KEY |
| `makerule_code` | `makerule_code` | `makeRuleCode` | 生单规则编号 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `plan_name` | `plan_name` | `planName` | 计划名称 |
| `row_no` | `row_no` | `rowNo` | 标的物行号 |
| `source` | `source` | `source` | 上游单据类型 |
| `start_time_id` | `start_time_id` | `startTimeId` | 起算时点 |
| `upcode` | `upcode` | `upcode` | 上游单据号 |

### 引用字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acct_entity_id` | `acct_entity_id` | `acctEntityId` | 会计主体 |
| `amt_type_id` | `amt_type_id` | `amtTypeId` | 款项类型 |
| `begin_base` | `begin_base` | `beginBase` | 起算时点 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `ct_id` | `ct_id` | `ctId` | 合同 |
| `customer_id` | `customer_id` | `customer` | 客户 |
| `expenseitem_id` | `expenseitem_id` | `expenseitemId` | 费用项目 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `receive_agreement_id` | `receive_agreement_id` | `receiveAgreementId` | 收款协议名称 |
| `settle_mode_id` | `settle_mode_id` | `settleModeId` | 结算方式 |
| `supplier_id` | `supplier_id` | `supplierId` | 供应商 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `begin_date` | `begin_date` | `beginDate` | 起算日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `pay_end_date` | `pay_end_date` | `payEndDate` | 收款到期日 |
| `start_date` | `start_date` | `startDate` | 起算日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iDeleted` | `iDeleted` | `isDeleted` | 逻辑删除标记 |

### 枚举字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `account_comfirm_way` | `account_comfirm_way` | `accountComfirmWay` | 出账日确认方式 |
| `expire_comfirm_way` | `expire_comfirm_way` | `expireComfirmWay` | 到期日确认方式 |
| `fixed_account_date` | `fixed_account_date` | `fixedAccountDate` | 固定出账日 |
| `fixed_account_date1` | `fixed_account_date1` | `fixedAccountDate1` | 固定出账日1 |
| `fixed_account_date2` | `fixed_account_date2` | `fixedAccountDate2` | 固定出账日2 |
| `fixed_account_date3` | `fixed_account_date3` | `fixedAccountDate3` | 固定出账日3 |
| `fixed_account_date4` | `fixed_account_date4` | `fixedAccountDate4` | 固定出账日4 |
| `fixed_expire_date` | `fixed_expire_date` | `fixedExpireDate` | 固定到期日 |
| `fixed_expire_date1` | `fixed_expire_date1` | `fixedExpireDate1` | 固定到期日1 |
| `fixed_expire_date2` | `fixed_expire_date2` | `fixedExpireDate2` | 固定到期日2 |
| `fixed_expire_date3` | `fixed_expire_date3` | `fixedExpireDate3` | 固定到期日3 |
| `fixed_expire_date4` | `fixed_expire_date4` | `fixedExpireDate4` | 固定到期日4 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `account_days` | `account_days` | `accountDays` | 账期天数 |
| `issue_no` | `issue_no` | `issueNo` | 期号 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `advance_flag` | `advance_flag` | `advanceFlag` | 预收款 |
| `margin_flag` | `margin_flag` | `marginFlag` | 质保金 |

### 长整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `material_id` | `material_id` | `materialId` | 标的物ID |
| `sourceautoid` | `sourceautoid` | `sourceautoid` | 上游单据子表id |
| `sourceautorowid` | `sourceautorowid` | `sourceautorowid` | 上游单据子表行id |
| `sourceid` | `sourceid` | `sourceid` | 上游单据主表id |

### 数值字段 (47个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `account_period` | `account_period` | `accountPeriod` | 账期 |
| `appr_amt` | `appr_amt` | `apprAmt` | 已审批原币收款金额 |
| `appr_amt_bak` | `appr_amt_bak` | `apprAmtBak` | 已审批原币收款金额备份 |
| `appr_plan_refund_amt` | `appr_plan_refund_amt` | `apprPlanRefundAmt` | 已审批原币退款金额 |
| `appr_plan_refund_amt_bak` | `appr_plan_refund_amt_bak` | `apprPlanRefundAmtBak` | 已审批原币退款金额备份 |
| `appr_subject_amt` | `appr_subject_amt` | `apprSubjectAmt` | 已审批原币应收金额 |
| `appr_subject_amt_bak` | `appr_subject_amt_bak` | `apprSubjectAmtBak` | 已审批原币应收金额备份 |
| `available_amt` | `available_amt` | `availableAmt` | 原币收款计划可用金额 |
| `deloy_days` | `deloy_days` | `deloyDays` | 延迟天数 |
| `deloy_month` | `deloy_month` | `deloyMonth` | 延迟月份 |
| `local_appr_amt` | `local_appr_amt` | `localApprAmt` | 已审批本币收款金额 |
| `local_appr_amt_bak` | `local_appr_amt_bak` | `localApprAmtBak` | 已审批本币收款金额备份 |
| `local_appr_plan_refund_amt` | `local_appr_plan_refund_amt` | `localApprPlanRefundAmt` | 已审批本币退款金额 |
| `local_appr_plan_refund_amt_bak` | `local_appr_plan_refund_amt_bak` | `localApprPlanRefundAmtBak` | 已审批本币退款金额备份 |
| `local_invoice_total` | `local_invoice_total` | `localInvoiceTotal` | 累计本币开票金额 |
| `local_invoice_total_bak` | `local_invoice_total_bak` | `localInvoiceTotalBak` | 累计本币开票金额备份 |
| `local_paid_amt` | `local_paid_amt` | `localPaidAmt` | 本币已收款金额 |
| `local_paid_amt_bak` | `local_paid_amt_bak` | `localPaidAmtBak` | 本币已收款金额备份 |
| `local_plan_amt` | `local_plan_amt` | `localPlanAmt` | 本币计划金额 |
| `local_plan_amt_bak` | `local_plan_amt_bak` | `localPlanAmtBak` | 本币计划金额备份 |
| `local_unappr_amt` | `local_unappr_amt` | `localUnapprAmt` | 未审批本币收款金额 |
| `local_unappr_amt_bak` | `local_unappr_amt_bak` | `localUnapprAmtBak` | 未审批本币收款金额备份 |
| `original_invoice_total` | `original_invoice_total` | `originalInvoiceTotal` | 累计原币开票金额 |
| `original_invoice_total_bak` | `original_invoice_total_bak` | `originalInvoiceTotalBak` | 累计原币开票金额备份 |
| `paid_amt` | `paid_amt` | `paidAmt` | 原币已收款金额 |
| `paid_amt_bak` | `paid_amt_bak` | `paidAmtBak` | 原币已收款金额备份 |
| `plan_amt` | `plan_amt` | `planAmt` | 计划金额 |
| `plan_amt_bak` | `plan_amt_bak` | `planAmtBak` | 计划金额备份 |
| `plan_ratio` | `plan_ratio` | `planRatio` | 计划比例 |
| `rappr_subject_local_amt` | `rappr_subject_local_amt` | `rapprSubjectLocalAmt` | 已审批本币应收金额 |
| `rappr_subject_local_amt_bak` | `rappr_subject_local_amt_bak` | `rapprSubjectLocalAmtBak` | 已审批本币应收金额备份 |
| `runappr_subject_local_amt` | `runappr_subject_local_amt` | `runapprSubjectLocalAmt` | 未审批本币应收金额 |
| `runappr_subject_local_amt_bak` | `runappr_subject_local_amt_bak` | `runapprSubjectLocalAmtBak` | 未审批本币应收金额备份 |
| `rverified_subject_local_amt` | `rverified_subject_local_amt` | `rverifiedSubjectLocalAmt` | 已核销本币应收金额 |
| `rverified_subject_local_amt_bak` | `rverified_subject_local_amt_bak` | `rverifiedSubjectLocalAmtBak` | 已核销本币应收金额备份 |
| `rverified_subject_original_amt` | `rverified_subject_original_amt` | `rverifiedSubjectOriginalAmt` | 已核销原币应收金额 |
| `rverified_subject_original_amt_bak` | `rverified_subject_original_amt_bak` | `rverifiedSubjectOriginalAmtBak` | 已核销原币应收金额备份 |
| `unappr_amt` | `unappr_amt` | `unapprAmt` | 未审批原币收款金额 |
| `unappr_amt_bak` | `unappr_amt_bak` | `unapprAmtBak` | 未审批原币收款金额备份 |
| `unappr_plan_refund_amt` | `unappr_plan_refund_amt` | `unapprPlanRefundAmt` | 未审批原币退款金额 |
| `unappr_plan_refund_amt_bak` | `unappr_plan_refund_amt_bak` | `unapprPlanRefundAmtBak` | 未审批原币退款金额备份 |
| `unappr_subject_amt` | `unappr_subject_amt` | `unapprSubjectAmt` | 未审批原币应收金额 |
| `unappr_subject_amt_bak` | `unappr_subject_amt_bak` | `unapprSubjectAmtBak` | 未审批原币应收金额备份 |
| `unlocal_appr_plan_refund_amt` | `unlocal_appr_plan_refund_amt` | `unlocalApprPlanRefundAmt` | 未审批本币退款金额 |
| `unlocal_appr_plan_refund_amt_bak` | `unlocal_appr_plan_refund_amt_bak` | `unlocalApprPlanRefundAmtBak` | 未审批本币退款金额备份 |
| `verfity_subject_amt` | `verfity_subject_amt` | `verfitySubjectAmt` | 已核销原币应收金额 |
| `verfity_subject_amt_bak` | `verfity_subject_amt_bak` | `verfitySubjectAmtBak` | 已核销原币应收金额备份 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `apctApctReceiptplanDcs` | `apctApctReceiptplanDcs` | `apctApctReceiptplanDcs` | 收款计划自定义项 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `sourceMainPubts` | `sourceMainPubts` | `sourceMainPubts` | 时间戳 |
