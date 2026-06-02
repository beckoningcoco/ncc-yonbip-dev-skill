---
tags: [BIP, 元数据, 数据字典, apct.contract.ApctPlan]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 付款计划 (`apct.contract.ApctPlan`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `apct_apct_plan` | 应用: `APCT`

## 属性（105 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `groupTaskKey` | groupTaskKey | `groupTaskKey` | String | `text` |
| 2 | `makeRuleCode` | makeRule编码 | `makerule_code` | String | `text` |
| 3 | `source` | source | `source` | String | `text` |
| 4 | `sourceMainPubts` | sourceMainPubts | `sourceMainPubts` | DateTime | `timestamp` |
| 5 | `sourceautoid` | sourceautoid | `sourceautoid` | Long | `long` |
| 6 | `sourceid` | sourceid | `sourceid` | Long | `long` |
| 7 | `upcode` | upcode | `upcode` | String | `text` |
| 8 | `planName` | plan名称 | `plan_name` | String | `text` |
| 9 | `accountDays` | accountDays | `account_days` | Integer | `int` |
| 10 | `advanceFlag` | advanceFlag | `advance_flag` | Short | `short` |
| 11 | `localPlanAmt` | localPlanAmt | `local_plan_amt` | Decimal | `number` |
| 12 | `unapprPlanRefundAmt` | unapprPlanRefundAmt | `unappr_plan_refund_amt` | Decimal | `number` |
| 13 | `acctEntityId` | acctEntityID | `acct_entity_id` | 4928db62-a46d-4829-a26a-1de4bb3bf98c | `quote` |
| 14 | `rowNo` | rowNo | `row_no` | String | `text` |
| 15 | `materialId` | materialID | `material_id` | Long | `long` |
| 16 | `issueNo` | 是否sueNo | `issue_no` | Integer | `int` |
| 17 | `localUnapprAmt` | localUnapprAmt | `local_unappr_amt` | Decimal | `number` |
| 18 | `localApprAmt` | localApprAmt | `local_appr_amt` | Decimal | `number` |
| 19 | `localPaidAmt` | localPaidAmt | `local_paid_amt` | Decimal | `number` |
| 20 | `localApprPlanRefundAmt` | localApprPlanRefundAmt | `local_appr_plan_refund_amt` | Decimal | `number` |
| 21 | `unlocalApprPlanRefundAmt` | unlocalApprPlanRefundAmt | `unlocal_appr_plan_refund_amt` | Decimal | `number` |
| 22 | `payTermId` | payTermID | `pay_term_id` | 3cce8052-512e-4e51-9b6e-57adff40948c | `quote` |
| 23 | `localInvoiceTotal` | localInvoiceTotal | `local_invoice_total` | Decimal | `number` |
| 24 | `originalInvoiceTotal` | originalInvoiceTotal | `original_invoice_total` | Decimal | `number` |
| 25 | `verifiedSubjectOriginalAmt` | verifiedSubjectOriginalAmt | `verified_subject_original_amt` | Decimal | `number` |
| 26 | `unapprSubjectLocalAmt` | unapprSubjectLocalAmt | `unappr_subject_local_amt` | Decimal | `number` |
| 27 | `apprSubjectLocalAmt` | apprSubjectLocalAmt | `appr_subject_local_amt` | Decimal | `number` |
| 28 | `verifiedSubjectLocalAmt` | verifiedSubjectLocalAmt | `verified_subject_local_amt` | Decimal | `number` |
| 29 | `sourceautorowid` | sourceautorowid | `sourceautorowid` | Long | `long` |
| 30 | `supplierId` | supplierID | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 31 | `customer` | customer | `customer_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 32 | `settleModeId` | settleModeID | `settle_mode_id` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff | `quote` |
| 33 | `startTimeId` | startTimeID | `start_time_id` | String | `text` |
| 34 | `startDate` | startDate | `start_date` | String | `date` |
| 35 | `deloyDays` | deloyDays | `deloy_days` | Decimal | `number` |
| 36 | `deloyMonth` | deloyMonth | `deloy_month` | Decimal | `number` |
| 37 | `accountPeriod` | accountPeriod | `account_period` | Decimal | `number` |
| 38 | `accountPeriodUnitId` | accountPeriodUnitID | `account_period_unit_id` | String | `text` |
| 39 | `accountComfirmWay` | accountComfirmWay | `account_comfirm_way` | String | `singleOption` |
| 40 | `fixedAccountDate` | fixedAccountDate | `fixed_account_date` | String | `singleOption` |
| 41 | `fixedAccountDate1` | fixedAccountDate1 | `fixed_account_date1` | String | `singleOption` |
| 42 | `fixedAccountDate2` | fixedAccountDate2 | `fixed_account_date2` | String | `singleOption` |
| 43 | `fixedAccountDate3` | fixedAccountDate3 | `fixed_account_date3` | String | `singleOption` |
| 44 | `fixedAccountDate4` | fixedAccountDate4 | `fixed_account_date4` | String | `singleOption` |
| 45 | `fixedExpireDate` | fixedExpireDate | `fixed_expire_date` | String | `singleOption` |
| 46 | `expireComfirmWay` | expireComfirmWay | `expire_comfirm_way` | String | `singleOption` |
| 47 | `fixedExpireDate1` | fixedExpireDate1 | `fixed_expire_date1` | String | `singleOption` |
| 48 | `fixedExpireDate2` | fixedExpireDate2 | `fixed_expire_date2` | String | `singleOption` |
| 49 | `fixedExpireDate3` | fixedExpireDate3 | `fixed_expire_date3` | String | `singleOption` |
| 50 | `fixedExpireDate4` | fixedExpireDate4 | `fixed_expire_date4` | String | `singleOption` |
| 51 | `localPlanAmtBak` | localPlanAmtBak | `local_plan_amt_bak` | Decimal | `number` |
| 52 | `unapprPlanRefundAmtBak` | unapprPlanRefundAmtBak | `unappr_plan_refund_amt_bak` | Decimal | `number` |
| 53 | `localUnapprAmtBak` | localUnapprAmtBak | `local_unappr_amt_bak` | Decimal | `number` |
| 54 | `localApprAmtBak` | localApprAmtBak | `local_appr_amt_bak` | Decimal | `number` |
| 55 | `localPaidAmtBak` | localPaidAmtBak | `local_paid_amt_bak` | Decimal | `number` |
| 56 | `localApprPlanRefundAmtBak` | localApprPlanRefundAmtBak | `local_appr_plan_refund_amt_bak` | Decimal | `number` |
| 57 | `unlocalApprPlanRefundAmtBak` | unlocalApprPlanRefundAmtBak | `unlocal_appr_plan_refund_amt_bak` | Decimal | `number` |
| 58 | `localInvoiceTotalBak` | localInvoiceTotalBak | `local_invoice_total_bak` | Decimal | `number` |
| 59 | `originalInvoiceTotalBak` | originalInvoiceTotalBak | `original_invoice_total_bak` | Decimal | `number` |
| 60 | `verifiedSubjectOriginalAmtBak` | verifiedSubjectOriginalAmtBak | `verified_subject_original_amt_bak` | Decimal | `number` |
| 61 | `unapprSubjectLocalAmtBak` | unapprSubjectLocalAmtBak | `unappr_subject_local_amt_bak` | Decimal | `number` |
| 62 | `apprSubjectLocalAmtBak` | apprSubjectLocalAmtBak | `appr_subject_local_amt_bak` | Decimal | `number` |
| 63 | `verifiedSubjectLocalAmtBak` | verifiedSubjectLocalAmtBak | `verified_subject_local_amt_bak` | Decimal | `number` |
| 64 | `apprAmtBak` | apprAmtBak | `appr_amt_bak` | Decimal | `number` |
| 65 | `apprPlanRefundAmtBak` | apprPlanRefundAmtBak | `appr_plan_refund_amt_bak` | Decimal | `number` |
| 66 | `apprSubjectAmtBak` | apprSubjectAmtBak | `appr_subject_amt_bak` | Decimal | `number` |
| 67 | `paidAmtBak` | paidAmtBak | `paid_amt_bak` | Decimal | `number` |
| 68 | `planAmtBak` | planAmtBak | `plan_amt_bak` | Decimal | `number` |
| 69 | `unapprAmtBak` | unapprAmtBak | `unappr_amt_bak` | Decimal | `number` |
| 70 | `unapprSubjectAmtBak` | unapprSubjectAmtBak | `unappr_subject_amt_bak` | Decimal | `number` |
| 71 | `verfitySubjectAmtBak` | verfitySubjectAmtBak | `verfity_subject_amt_bak` | Decimal | `number` |
| 72 | `availableAmt` | availableAmt | `available_amt` | Decimal | `number` |
| 73 | `expenseReferenceAmt` | expenseReferenceAmt | `expense_reference_amt` | Decimal | `number` |
| 74 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 75 | `amtTypeId` | amtTypeID | `amt_type_id` | 14b092f3-5d27-4a47-82a0-d6bad074c9f1 | `quote` |
| 76 | `apprAmt` | apprAmt | `appr_amt` | Decimal | `number` |
| 77 | `apprPlanRefundAmt` | apprPlanRefundAmt | `appr_plan_refund_amt` | Decimal | `number` |
| 78 | `apprSubjectAmt` | apprSubjectAmt | `appr_subject_amt` | Decimal | `number` |
| 79 | `beginBase` | beginBase | `begin_base` | a4a03d83-ea92-422d-9f64-b5f18f26a4a9 | `quote` |
| 80 | `beginDate` | beginDate | `begin_date` | Date | `date` |
| 81 | `code` | 编码 | `code` | String | `text` |
| 82 | `condition` | condition | `condition` | String | `text` |
| 83 | `createDate` | createDate | `create_date` | Date | `date` |
| 84 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 85 | `creator` | 创建人 | `creator` | String | `text` |
| 86 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 87 | `ctId` | ctID | `ct_id` | 84a309b9-2fd0-48d8-9b75-8251a20928c2 | `quote` |
| 88 | `expenseitemId` | expenseitemID | `expenseitem_id` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 | `quote` |
| 89 | `id` | ID | `id` | Long | `long` |
| 90 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |
| 91 | `marginFlag` | marginFlag | `margin_flag` | Short | `short` |
| 92 | `modifier` | 修改人 | `modifier` | String | `text` |
| 93 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 94 | `modifyDate` | modifyDate | `modify_date` | Date | `date` |
| 95 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 96 | `paidAmt` | paidAmt | `paid_amt` | Decimal | `number` |
| 97 | `payEndDate` | payEndDate | `pay_end_date` | Date | `date` |
| 98 | `planAmt` | planAmt | `plan_amt` | Decimal | `number` |
| 99 | `planRatio` | planRatio | `plan_ratio` | Decimal | `number` |
| 100 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 101 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 102 | `unapprAmt` | unapprAmt | `unappr_amt` | Decimal | `number` |
| 103 | `unapprSubjectAmt` | unapprSubjectAmt | `unappr_subject_amt` | Decimal | `number` |
| 104 | `verfitySubjectAmt` | verfitySubjectAmt | `verfity_subject_amt` | Decimal | `number` |
| 105 | `apctApctPlanDcs` | apctApctPlanDcs | `apctApctPlanDcs` | cde09d16-fa32-4c96-84f2-9a52269eefb0 | `UserDefine` |

## 关联（14 个）

- `ctId` -> `apct.contract.Apct` (0..n) 
- `supplierId` -> `aa.vendor.Vendor` () 
- `apctApctPlanDcs` -> `apct.contract.ApctPlanDcsVo` () 
- `expenseitemId` -> `bd.expenseitem.ExpenseItem` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `amtTypeId` -> `bd.paymenttype.PaymentTypeVO` () 
- `creatorId` -> `base.user.User` () 
- `modifierId` -> `base.user.User` () 
- `acctEntityId` -> `bd.adminOrg.FinanceOrgVO` () 
- `settleModeId` -> `aa.settlemethod.SettleMethod` () 
- `tenant` -> `base.tenant.Tenant` () 
- `beginBase` -> `bd.payments.PayStartBase` () 
- `customer` -> `aa.merchant.Merchant` () 
- `payTermId` -> `bd.payments.PayAgreement` () 
