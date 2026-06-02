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

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `apct_apct_receiptplan` | 应用: `APCT`

## 属性（104 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `accountComfirmWay` | accountComfirmWay | `account_comfirm_way` | String | `singleOption` |
| 2 | `accountDays` | accountDays | `account_days` | Integer | `int` |
| 3 | `accountPeriod` | accountPeriod | `account_period` | Decimal | `number` |
| 4 | `accountPeriodUnitId` | accountPeriodUnitID | `account_period_unit_id` | String | `text` |
| 5 | `acctEntityId` | acctEntityID | `acct_entity_id` | 4928db62-a46d-4829-a26a-1de4bb3bf98c | `quote` |
| 6 | `advanceFlag` | advanceFlag | `advance_flag` | Short | `short` |
| 7 | `amtTypeId` | amtTypeID | `amt_type_id` | 14b092f3-5d27-4a47-82a0-d6bad074c9f1 | `quote` |
| 8 | `apctApctReceiptplanDcs` | apctApctReceiptplanDcs | `apctApctReceiptplanDcs` | 9a056779-158d-4d02-9551-55c92c6d813a | `UserDefine` |
| 9 | `apprAmt` | apprAmt | `appr_amt` | Decimal | `number` |
| 10 | `apprAmtBak` | apprAmtBak | `appr_amt_bak` | Decimal | `number` |
| 11 | `apprPlanRefundAmt` | apprPlanRefundAmt | `appr_plan_refund_amt` | Decimal | `number` |
| 12 | `apprPlanRefundAmtBak` | apprPlanRefundAmtBak | `appr_plan_refund_amt_bak` | Decimal | `number` |
| 13 | `apprSubjectAmt` | apprSubjectAmt | `appr_subject_amt` | Decimal | `number` |
| 14 | `apprSubjectAmtBak` | apprSubjectAmtBak | `appr_subject_amt_bak` | Decimal | `number` |
| 15 | `availableAmt` | availableAmt | `available_amt` | Decimal | `number` |
| 16 | `beginBase` | beginBase | `begin_base` | a4a03d83-ea92-422d-9f64-b5f18f26a4a9 | `quote` |
| 17 | `beginDate` | beginDate | `begin_date` | Date | `date` |
| 18 | `code` | 编码 | `code` | String | `text` |
| 19 | `condition` | condition | `condition` | String | `text` |
| 20 | `createDate` | createDate | `create_date` | Date | `date` |
| 21 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 22 | `creator` | 创建人 | `creator` | String | `text` |
| 23 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 24 | `ctId` | ctID | `ct_id` | 84a309b9-2fd0-48d8-9b75-8251a20928c2 | `quote` |
| 25 | `customer` | customer | `customer_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 26 | `deloyDays` | deloyDays | `deloy_days` | Decimal | `number` |
| 27 | `deloyMonth` | deloyMonth | `deloy_month` | Decimal | `number` |
| 28 | `expenseitemId` | expenseitemID | `expenseitem_id` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 | `quote` |
| 29 | `expireComfirmWay` | expireComfirmWay | `expire_comfirm_way` | String | `singleOption` |
| 30 | `fixedAccountDate` | fixedAccountDate | `fixed_account_date` | String | `singleOption` |
| 31 | `fixedAccountDate1` | fixedAccountDate1 | `fixed_account_date1` | String | `singleOption` |
| 32 | `fixedAccountDate2` | fixedAccountDate2 | `fixed_account_date2` | String | `singleOption` |
| 33 | `fixedAccountDate3` | fixedAccountDate3 | `fixed_account_date3` | String | `singleOption` |
| 34 | `fixedAccountDate4` | fixedAccountDate4 | `fixed_account_date4` | String | `singleOption` |
| 35 | `fixedExpireDate` | fixedExpireDate | `fixed_expire_date` | String | `singleOption` |
| 36 | `fixedExpireDate1` | fixedExpireDate1 | `fixed_expire_date1` | String | `singleOption` |
| 37 | `fixedExpireDate2` | fixedExpireDate2 | `fixed_expire_date2` | String | `singleOption` |
| 38 | `fixedExpireDate3` | fixedExpireDate3 | `fixed_expire_date3` | String | `singleOption` |
| 39 | `fixedExpireDate4` | fixedExpireDate4 | `fixed_expire_date4` | String | `singleOption` |
| 40 | `groupTaskKey` | groupTaskKey | `groupTaskKey` | String | `text` |
| 41 | `id` | ID | `id` | Long | `long` |
| 42 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |
| 43 | `issueNo` | 是否sueNo | `issue_no` | Integer | `int` |
| 44 | `localApprAmt` | localApprAmt | `local_appr_amt` | Decimal | `number` |
| 45 | `localApprAmtBak` | localApprAmtBak | `local_appr_amt_bak` | Decimal | `number` |
| 46 | `localApprPlanRefundAmt` | localApprPlanRefundAmt | `local_appr_plan_refund_amt` | Decimal | `number` |
| 47 | `localApprPlanRefundAmtBak` | localApprPlanRefundAmtBak | `local_appr_plan_refund_amt_bak` | Decimal | `number` |
| 48 | `localInvoiceTotal` | localInvoiceTotal | `local_invoice_total` | Decimal | `number` |
| 49 | `localInvoiceTotalBak` | localInvoiceTotalBak | `local_invoice_total_bak` | Decimal | `number` |
| 50 | `localPaidAmt` | localPaidAmt | `local_paid_amt` | Decimal | `number` |
| 51 | `localPaidAmtBak` | localPaidAmtBak | `local_paid_amt_bak` | Decimal | `number` |
| 52 | `localPlanAmt` | localPlanAmt | `local_plan_amt` | Decimal | `number` |
| 53 | `localPlanAmtBak` | localPlanAmtBak | `local_plan_amt_bak` | Decimal | `number` |
| 54 | `localUnapprAmt` | localUnapprAmt | `local_unappr_amt` | Decimal | `number` |
| 55 | `localUnapprAmtBak` | localUnapprAmtBak | `local_unappr_amt_bak` | Decimal | `number` |
| 56 | `makeRuleCode` | makeRule编码 | `makerule_code` | String | `text` |
| 57 | `marginFlag` | marginFlag | `margin_flag` | Short | `short` |
| 58 | `materialId` | materialID | `material_id` | Long | `long` |
| 59 | `modifier` | 修改人 | `modifier` | String | `text` |
| 60 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 61 | `modifyDate` | modifyDate | `modify_date` | Date | `date` |
| 62 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 63 | `originalInvoiceTotal` | originalInvoiceTotal | `original_invoice_total` | Decimal | `number` |
| 64 | `originalInvoiceTotalBak` | originalInvoiceTotalBak | `original_invoice_total_bak` | Decimal | `number` |
| 65 | `paidAmt` | paidAmt | `paid_amt` | Decimal | `number` |
| 66 | `paidAmtBak` | paidAmtBak | `paid_amt_bak` | Decimal | `number` |
| 67 | `payEndDate` | payEndDate | `pay_end_date` | Date | `date` |
| 68 | `planAmt` | planAmt | `plan_amt` | Decimal | `number` |
| 69 | `planAmtBak` | planAmtBak | `plan_amt_bak` | Decimal | `number` |
| 70 | `planName` | plan名称 | `plan_name` | String | `text` |
| 71 | `planRatio` | planRatio | `plan_ratio` | Decimal | `number` |
| 72 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 73 | `rapprSubjectLocalAmt` | rapprSubjectLocalAmt | `rappr_subject_local_amt` | Decimal | `number` |
| 74 | `rapprSubjectLocalAmtBak` | rapprSubjectLocalAmtBak | `rappr_subject_local_amt_bak` | Decimal | `number` |
| 75 | `receiveAgreementId` | receiveAgreementID | `receive_agreement_id` | e336f779-f1e5-4530-b6d5-fa2e5ed1c302 | `quote` |
| 76 | `rowNo` | rowNo | `row_no` | String | `text` |
| 77 | `runapprSubjectLocalAmt` | runapprSubjectLocalAmt | `runappr_subject_local_amt` | Decimal | `number` |
| 78 | `runapprSubjectLocalAmtBak` | runapprSubjectLocalAmtBak | `runappr_subject_local_amt_bak` | Decimal | `number` |
| 79 | `rverifiedSubjectLocalAmt` | rverifiedSubjectLocalAmt | `rverified_subject_local_amt` | Decimal | `number` |
| 80 | `rverifiedSubjectLocalAmtBak` | rverifiedSubjectLocalAmtBak | `rverified_subject_local_amt_bak` | Decimal | `number` |
| 81 | `rverifiedSubjectOriginalAmt` | rverifiedSubjectOriginalAmt | `rverified_subject_original_amt` | Decimal | `number` |
| 82 | `rverifiedSubjectOriginalAmtBak` | rverifiedSubjectOriginalAmtBak | `rverified_subject_original_amt_bak` | Decimal | `number` |
| 83 | `settleModeId` | settleModeID | `settle_mode_id` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff | `quote` |
| 84 | `source` | source | `source` | String | `text` |
| 85 | `sourceMainPubts` | sourceMainPubts | `sourceMainPubts` | DateTime | `timestamp` |
| 86 | `sourceautoid` | sourceautoid | `sourceautoid` | Long | `long` |
| 87 | `sourceautorowid` | sourceautorowid | `sourceautorowid` | Long | `long` |
| 88 | `sourceid` | sourceid | `sourceid` | Long | `long` |
| 89 | `startDate` | startDate | `start_date` | String | `date` |
| 90 | `startTimeId` | startTimeID | `start_time_id` | String | `text` |
| 91 | `supplierId` | supplierID | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 92 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 93 | `unapprAmt` | unapprAmt | `unappr_amt` | Decimal | `number` |
| 94 | `unapprAmtBak` | unapprAmtBak | `unappr_amt_bak` | Decimal | `number` |
| 95 | `unapprPlanRefundAmt` | unapprPlanRefundAmt | `unappr_plan_refund_amt` | Decimal | `number` |
| 96 | `unapprPlanRefundAmtBak` | unapprPlanRefundAmtBak | `unappr_plan_refund_amt_bak` | Decimal | `number` |
| 97 | `unapprSubjectAmt` | unapprSubjectAmt | `unappr_subject_amt` | Decimal | `number` |
| 98 | `unapprSubjectAmtBak` | unapprSubjectAmtBak | `unappr_subject_amt_bak` | Decimal | `number` |
| 99 | `unlocalApprPlanRefundAmt` | unlocalApprPlanRefundAmt | `unlocal_appr_plan_refund_amt` | Decimal | `number` |
| 100 | `unlocalApprPlanRefundAmtBak` | unlocalApprPlanRefundAmtBak | `unlocal_appr_plan_refund_amt_bak` | Decimal | `number` |
| 101 | `upcode` | upcode | `upcode` | String | `text` |
| 102 | `verfitySubjectAmt` | verfitySubjectAmt | `verfity_subject_amt` | Decimal | `number` |
| 103 | `verfitySubjectAmtBak` | verfitySubjectAmtBak | `verfity_subject_amt_bak` | Decimal | `number` |
| 104 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（14 个）

- `ctId` -> `apct.contract.Apct` (0..n) 
- `supplierId` -> `aa.vendor.Vendor` () 
- `expenseitemId` -> `bd.expenseitem.ExpenseItem` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `amtTypeId` -> `bd.paymenttype.PaymentTypeVO` () 
- `creatorId` -> `base.user.User` () 
- `modifierId` -> `base.user.User` () 
- `acctEntityId` -> `bd.adminOrg.FinanceOrgVO` () 
- `receiveAgreementId` -> `bd.receivables.ReceiveAgreement` () 
- `apctApctReceiptplanDcs` -> `apct.contract.ApctReceiptplanDcsVo` () 
- `settleModeId` -> `aa.settlemethod.SettleMethod` () 
- `tenant` -> `base.tenant.Tenant` () 
- `beginBase` -> `bd.payments.PayStartBase` () 
- `customer` -> `aa.merchant.Merchant` () 
