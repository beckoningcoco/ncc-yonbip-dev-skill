---
tags: [BIP, 元数据, 数据字典, apct.changeBill.ApctChangeBillPlan]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同变更单付款计划 (`apct.changeBill.ApctChangeBillPlan`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`apct_apct_change_plan` | domain：`apct` | 应用：`APCT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同变更单付款计划 |
| 物理表 | `apct_apct_change_plan` |
| 数据库 schema | `apct` |
| 所属应用 | `APCT` |
| 直连字段 | 77 个 |
| 子表 | 0 个 |
| 关联引用 | 14 个 |

## 关联引用 (14个)

| 字段名 | 引用类型 |
|--------|---------|
| `supplier_id` | `` |
| `expenseitem_id` | `finbd.bd_expenseitemlist` |
| `apctChangeBillPlanDcs` | `` |
| `ytenant_id` | `` |
| `amt_type_id` | `finbd.bd_paymenttyperef` |
| `` | `` |
| `acct_entity_id` | `` |
| `change_id` | `` |
| `settle_mode_id` | `` |
| `tenant_id` | `` |
| `begin_base` | `` |
| `customer_id` | `` |
| `pay_term_id` | `` |

## 继承接口 (4个, 11字段)

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

## 字段列表（按类型分组）

> 共 77 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `plan_name` | `plan_name` | `planName` | 计划名称 |
| `` | `creator` | `creator` | 创建人名称 |
| `row_no` | `row_no` | `rowNo` | 标的物行号 |
| `source` | `source` | `source` | 上游单据类型 |
| `upcode` | `upcode` | `upcode` | 上游单据号 |
| `start_time_id` | `start_time_id` | `startTimeId` | 起算时点 |
| `account_period_unit_id` | `account_period_unit_id` | `accountPeriodUnitId` | 账期单位 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `code` | `code` | `code` | 计划编码 |
| `condition` | `condition` | `condition` | 付款条件 |

### 引用字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `begin_base` | `begin_base` | `beginBase` | 起算时点 |
| `change_id` | `change_id` | `changeId` | 变更单 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `acct_entity_id` | `acct_entity_id` | `acctEntityId` | 会计主体 |
| `pay_term_id` | `pay_term_id` | `payTermId` | 付款协议名称 |
| `supplier_id` | `supplier_id` | `supplierId` | 供应商 |
| `customer_id` | `customer_id` | `customer` | 客户 |
| `settle_mode_id` | `settle_mode_id` | `settleModeId` | 结算方式 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `expenseitem_id` | `expenseitem_id` | `expenseitemId` | 费用项目id |
| `amt_type_id` | `amt_type_id` | `amtTypeId` | 款项类型id |

### 日期字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `start_date` | `start_date` | `startDate` | 起算日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `begin_date` | `begin_date` | `beginDate` | 起算日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iDeleted` | `iDeleted` | `isDeleted` | 逻辑删除标记 |

### 枚举字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `account_comfirm_way` | `account_comfirm_way` | `accountComfirmWay` | 出账日确认方式 |
| `fixed_account_date` | `fixed_account_date` | `fixedAccountDate` | 固定出账日 |
| `fixed_account_date1` | `fixed_account_date1` | `fixedAccountDate1` | 固定出账日1 |
| `fixed_account_date2` | `fixed_account_date2` | `fixedAccountDate2` | 固定出账日2 |
| `fixed_account_date3` | `fixed_account_date3` | `fixedAccountDate3` | 固定出账日3 |
| `fixed_account_date4` | `fixed_account_date4` | `fixedAccountDate4` | 固定出账日4 |
| `fixed_expire_date` | `fixed_expire_date` | `fixedExpireDate` | 固定到期日 |
| `expire_comfirm_way` | `expire_comfirm_way` | `expireComfirmWay` | 到期日确认方式 |
| `fixed_expire_date1` | `fixed_expire_date1` | `fixedExpireDate1` | 固定到期日1 |
| `fixed_expire_date2` | `fixed_expire_date2` | `fixedExpireDate2` | 固定到期日2 |
| `fixed_expire_date3` | `fixed_expire_date3` | `fixedExpireDate3` | 固定到期日3 |
| `fixed_expire_date4` | `fixed_expire_date4` | `fixedExpireDate4` | 固定到期日4 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `issue_no` | `issue_no` | `issueNo` | 期号 |
| `account_days` | `account_days` | `accountDays` | 账期天数 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `advance_flag` | `advance_flag` | `advanceFlag` | 预付款 |
| `margin_flag` | `margin_flag` | `marginFlag` | 质保金 |

### 长整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `material_id` | `material_id` | `materialId` | 标的物ID |
| `sourceautorowid` | `sourceautorowid` | `sourceautorowid` | 上游单据子表行id |
| `sourceid` | `sourceid` | `sourceid` | 上游单据主表id |
| `sourceautoid` | `sourceautoid` | `sourceautoid` | 上游单据子表id |
| `id` | `id` | `id` | ID |

### 数值字段 (23个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `local_plan_amt` | `local_plan_amt` | `localPlanAmt` | 本币计划金额 |
| `local_unappr_amt` | `local_unappr_amt` | `localUnapprAmt` | 未审批本币付款金额 |
| `local_appr_amt` | `local_appr_amt` | `localApprAmt` | 已审批本币付款金额 |
| `local_paid_amt` | `local_paid_amt` | `localPaidAmt` | 本币已付款金额 |
| `local_appr_plan_refund_amt` | `local_appr_plan_refund_amt` | `localApprPlanRefundAmt` | 已审批本币退款金额 |
| `local_invoice_total` | `local_invoice_total` | `localInvoiceTotal` | 累计本币收票金额 |
| `original_invoice_total` | `original_invoice_total` | `originalInvoiceTotal` | 累计原币收票金额 |
| `verified_subject_original_amt` | `verified_subject_original_amt` | `verifiedSubjectOriginalAmt` | 已核销原币应付金额 |
| `unappr_subject_local_amt` | `unappr_subject_local_amt` | `unapprSubjectLocalAmt` | 未审批本币应付金额 |
| `appr_subject_local_amt` | `appr_subject_local_amt` | `apprSubjectLocalAmt` | 已审批本币应付金额 |
| `verified_subject_local_amt` | `verified_subject_local_amt` | `verifiedSubjectLocalAmt` | 已核销本币应付金额 |
| `deloy_days` | `deloy_days` | `deloyDays` | 延迟天数 |
| `deloy_month` | `deloy_month` | `deloyMonth` | 延迟月份 |
| `account_period` | `account_period` | `accountPeriod` | 账期 |
| `plan_ratio` | `plan_ratio` | `planRatio` | 计划比例(%) |
| `plan_amt` | `plan_amt` | `planAmt` | 计划金额 |
| `unappr_subject_amt` | `unappr_subject_amt` | `unapprSubjectAmt` | 未审批原币应付金额 |
| `appr_subject_amt` | `appr_subject_amt` | `apprSubjectAmt` | 已审批原币应付金额 |
| `verfity_subject_amt` | `verfity_subject_amt` | `verfitySubjectAmt` | 已核销原币应付金额 |
| `unappr_amt` | `unappr_amt` | `unapprAmt` | 未审批原币付款金额 |
| `appr_amt` | `appr_amt` | `apprAmt` | 已审批原币付款金额 |
| `paid_amt` | `paid_amt` | `paidAmt` | 原币已付款金额 |
| `appr_plan_refund_amt` | `appr_plan_refund_amt` | `apprPlanRefundAmt` | 已审批原币退款金额 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `pay_end_date` | `pay_end_date` | `payEndDate` | 付款到期日 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `apctChangeBillPlanDcs` | `apctChangeBillPlanDcs` | `apctChangeBillPlanDcs` | 付款计划自定义项 |
