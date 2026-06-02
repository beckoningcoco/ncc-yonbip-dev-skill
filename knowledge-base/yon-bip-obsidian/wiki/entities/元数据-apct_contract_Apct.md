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

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `apct_apct` | 应用: `APCT`

## 属性（305 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `groupTaskKey` | groupTaskKey | `groupTaskKey` | String | `text` |
| 2 | `isprojectapply` | 是否projectapply | `isprojectapply` | Boolean | `switch` |
| 3 | `makeRuleCode` | makeRule编码 | `makerule_code` | String | `text` |
| 4 | `source` | source | `source` | String | `text` |
| 5 | `sourceMainPubts` | sourceMainPubts | `sourceMainPubts` | DateTime | `timestamp` |
| 6 | `sourceautoid` | sourceautoid | `sourceautoid` | Long | `long` |
| 7 | `sourceid` | sourceid | `sourceid` | Long | `long` |
| 8 | `upcode` | upcode | `upcode` | String | `text` |
| 9 | `acctEntityId` | acctEntityID | `acct_entity_id` | 4928db62-a46d-4829-a26a-1de4bb3bf98c | `quote` |
| 10 | `contractLedgerId` | contractLedgerID | `contract_ledgerId` | a2b72a3c-8c65-4b56-8e8f-35821ac27556 | `quote` |
| 11 | `contractType` | contractType | `contract_type` | b23c8bcc-9978-44fb-a5d5-b54d687b59bb | `quote` |
| 12 | `contractClass` | contractClass | `contract_class` | Short | `short` |
| 13 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 14 | `applyBillId` | applyBillID | `apply_bill_id` | c89a2b73-7637-4642-abc1-c49bf1a5c460 | `quote` |
| 15 | `apprAdvanceAmt` | apprAdvanceAmt | `appr_advance_amt` | Decimal | `number` |
| 16 | `apprAmt` | apprAmt | `appr_amt` | Decimal | `number` |
| 17 | `apprMarginAmt` | apprMarginAmt | `appr_margin_amt` | Decimal | `number` |
| 18 | `apprPlanRefundAmt` | apprPlanRefundAmt | `appr_plan_refund_amt` | Decimal | `number` |
| 19 | `contractDirection` | contractDirection | `contract_direction` | Short | `short` |
| 20 | `localCurrency` | localCurrency | `local_currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 21 | `parentId` | parentID | `parent_id` | 84a309b9-2fd0-48d8-9b75-8251a20928c2 | `quote` |
| 22 | `customer` | customer | `customer_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 23 | `pushBillSystem` | pushBillSystem | `push_bill_system` | String | `text` |
| 24 | `originalMoneyAmt` | originalMoneyAmt | `original_money_amt` | Decimal | `number` |
| 25 | `originalTaxAmt` | originalTaxAmt | `original_tax_amt` | Decimal | `number` |
| 26 | `noTaxOriginalMoneyAmt` | noTaxOriginalMoneyAmt | `no_tax_original_money_amt` | Decimal | `number` |
| 27 | `localMoneyAmt` | localMoneyAmt | `local_money_amt` | Decimal | `number` |
| 28 | `localTaxAmt` | localTaxAmt | `local_tax_amt` | Decimal | `number` |
| 29 | `nexchangeRateOps` | nexchangeRateOps | `nexchange_rateOps` | ExchangeRateMethod | `` |
| 30 | `bizFlow` | bizFlow | `bizFlow` | String | `text` |
| 31 | `contractAmountControl` | contractAmountControl | `contract_amount_control` | Short | `short` |
| 32 | `expenseReferenceAmt` | expenseReferenceAmt | `expense_reference_amt` | Decimal | `number` |
| 33 | `apprAdvanceAmtBak` | apprAdvanceAmtBak | `appr_advance_amt_bak` | Decimal | `number` |
| 34 | `apprAmtBak` | apprAmtBak | `appr_amt_bak` | Decimal | `number` |
| 35 | `apprMarginAmtBak` | apprMarginAmtBak | `appr_margin_amt_bak` | Decimal | `number` |
| 36 | `apprPlanRefundAmtBak` | apprPlanRefundAmtBak | `appr_plan_refund_amt_bak` | Decimal | `number` |
| 37 | `originalTaxAmtBak` | originalTaxAmtBak | `original_tax_amt_bak` | Decimal | `number` |
| 38 | `noTaxOriginalMoneyAmtBak` | noTaxOriginalMoneyAmtBak | `no_tax_original_money_amt_bak` | Decimal | `number` |
| 39 | `localMoneyAmtBak` | localMoneyAmtBak | `local_money_amt_bak` | Decimal | `number` |
| 40 | `localTaxAmtBak` | localTaxAmtBak | `local_tax_amt_bak` | Decimal | `number` |
| 41 | `noTaxLocalMoneyAmtBak` | noTaxLocalMoneyAmtBak | `no_tax_local_money_amt_bak` | Decimal | `number` |
| 42 | `localPlanAmtBak` | localPlanAmtBak | `local_plan_amt_bak` | Decimal | `number` |
| 43 | `retentionApprPlanRefundAmtBak` | retentionApprPlanRefundAmtBak | `retention_appr_plan_refund_amt_bak` | Decimal | `number` |
| 44 | `advanceApprPlanRefundAmtBak` | advanceApprPlanRefundAmtBak | `advance_appr_plan_refund_amt_bak` | Decimal | `number` |
| 45 | `localRetentionApprPlanRefundAmtBak` | localRetentionApprPlanRefundAmtBak | `local_retention_appr_plan_refund_amt_bak` | Decimal | `number` |
| 46 | `localAdvanceApprPlanRefundAmtBak` | localAdvanceApprPlanRefundAmtBak | `local_advance_appr_plan_refund_amt_bak` | Decimal | `number` |
| 47 | `localAvailableAmtBak` | localAvailableAmtBak | `local_available_amt_bak` | Decimal | `number` |
| 48 | `localUsedAmtBak` | localUsedAmtBak | `local_used_amt_bak` | Decimal | `number` |
| 49 | `localOriginalReceiptAmtBak` | localOriginalReceiptAmtBak | `local_original_receipt_amt_bak` | Decimal | `number` |
| 50 | `localUnapprAmtBak` | localUnapprAmtBak | `local_unappr_amt_bak` | Decimal | `number` |
| 51 | `localApprAmtBak` | localApprAmtBak | `local_appr_amt_bak` | Decimal | `number` |
| 52 | `localPaidAmtBak` | localPaidAmtBak | `local_paid_amt_bak` | Decimal | `number` |
| 53 | `localApprPlanRefundAmtBak` | localApprPlanRefundAmtBak | `local_appr_plan_refund_amt_bak` | Decimal | `number` |
| 54 | `unlocalApprPlanRefundAmtBak` | unlocalApprPlanRefundAmtBak | `unlocal_appr_plan_refund_amt_bak` | Decimal | `number` |
| 55 | `localUnapprAdvanceAmtBak` | localUnapprAdvanceAmtBak | `local_unappr_advance_amt_bak` | Decimal | `number` |
| 56 | `localApprAdvanceAmtBak` | localApprAdvanceAmtBak | `local_appr_advance_amt_bak` | Decimal | `number` |
| 57 | `localPaidAdvanceAmtBak` | localPaidAdvanceAmtBak | `local_paid_advance_amt_bak` | Decimal | `number` |
| 58 | `localUnapprRetentionAmtBak` | localUnapprRetentionAmtBak | `local_unappr_retention_amt_bak` | Decimal | `number` |
| 59 | `localApprRetentionAmtBak` | localApprRetentionAmtBak | `local_appr_retention_amt_bak` | Decimal | `number` |
| 60 | `localPaidRetentionAmtBak` | localPaidRetentionAmtBak | `local_paid_retention_amt_bak` | Decimal | `number` |
| 61 | `localMarginAmtBak` | localMarginAmtBak | `local_margin_amt_bak` | Decimal | `number` |
| 62 | `localUnapprMarginAmtBak` | localUnapprMarginAmtBak | `local_unappr_margin_amt_bak` | Decimal | `number` |
| 63 | `localApprMarginAmtBak` | localApprMarginAmtBak | `local_appr_margin_amt_bak` | Decimal | `number` |
| 64 | `localMarginRefundAmtBak` | localMarginRefundAmtBak | `local_margin_refund_amt_bak` | Decimal | `number` |
| 65 | `unapprPlanRefundAmtBak` | unapprPlanRefundAmtBak | `unappr_plan_refund_amt_bak` | Decimal | `number` |
| 66 | `unapprSubjectLocalAmtBak` | unapprSubjectLocalAmtBak | `unappr_subject_local_amt_bak` | Decimal | `number` |
| 67 | `apprSubjectLocalAmtBak` | apprSubjectLocalAmtBak | `appr_subject_local_amt_bak` | Decimal | `number` |
| 68 | `verifiedSubjectLocalAmtBak` | verifiedSubjectLocalAmtBak | `verified_subject_local_amt_bak` | Decimal | `number` |
| 69 | `roriginalTotalAmtBak` | roriginalTotalAmtBak | `roriginal_total_amt_bak` | Decimal | `number` |
| 70 | `rlocalPlanAmtBak` | rlocalPlanAmtBak | `rlocal_plan_amt_bak` | Decimal | `number` |
| 71 | `ravailableAmtBak` | ravailableAmtBak | `ravailable_amt_bak` | Decimal | `number` |
| 72 | `rusedAmtBak` | rusedAmtBak | `rused_amt_bak` | Decimal | `number` |
| 73 | `rlocalAvailableAmtBak` | rlocalAvailableAmtBak | `rlocal_available_amt_bak` | Decimal | `number` |
| 74 | `rlocalUsedAmtBak` | rlocalUsedAmtBak | `rlocal_used_amt_bak` | Decimal | `number` |
| 75 | `rretentionApprPlanRefundAmtBak` | rretentionApprPlanRefundAmtBak | `rretention_appr_plan_refund_amt_bak` | Decimal | `number` |
| 76 | `radvanceApprPlanRefundAmtBak` | radvanceApprPlanRefundAmtBak | `radvance_appr_plan_refund_amt_bak` | Decimal | `number` |
| 77 | `rlocalRetentionApprPlanRefundAmtBak` | rlocalRetentionApprPlanRefundAmtBak | `rlocal_retention_appr_plan_refund_amt_bak` | Decimal | `number` |
| 78 | `rlocalAdvanceApprPlanRefundAmtBak` | rlocalAdvanceApprPlanRefundAmtBak | `rlocal_advance_appr_plan_refund_amt_bak` | Decimal | `number` |
| 79 | `roriginalReceiptAmtBak` | roriginalReceiptAmtBak | `roriginal_receipt_amt_bak` | Decimal | `number` |
| 80 | `runapprAmtBak` | runapprAmtBak | `runappr_amt_bak` | Decimal | `number` |
| 81 | `rapprAmtBak` | rapprAmtBak | `rappr_amt_bak` | Decimal | `number` |
| 82 | `rpaidAmtBak` | rpaidAmtBak | `rpaid_amt_bak` | Decimal | `number` |
| 83 | `rapprPlanRefundAmtBak` | rapprPlanRefundAmtBak | `rappr_plan_refund_amt_bak` | Decimal | `number` |
| 84 | `unrapprPlanRefundAmtBak` | unrapprPlanRefundAmtBak | `unrappr_plan_refund_amt_bak` | Decimal | `number` |
| 85 | `runapprAdvanceAmtBak` | runapprAdvanceAmtBak | `runappr_advance_amt_bak` | Decimal | `number` |
| 86 | `rapprAdvanceAmtBak` | rapprAdvanceAmtBak | `rappr_advance_amt_bak` | Decimal | `number` |
| 87 | `rpaidAdvanceAmtBak` | rpaidAdvanceAmtBak | `rpaid_advance_amt_bak` | Decimal | `number` |
| 88 | `runapprRetentionAmtBak` | runapprRetentionAmtBak | `runappr_retention_amt_bak` | Decimal | `number` |
| 89 | `rapprRetentionAmtBak` | rapprRetentionAmtBak | `rappr_retention_amt_bak` | Decimal | `number` |
| 90 | `rpaidRetentionAmtBak` | rpaidRetentionAmtBak | `rpaid_retention_amt_bak` | Decimal | `number` |
| 91 | `rmarginAmtBak` | rmarginAmtBak | `rmargin_amt_bak` | Decimal | `number` |
| 92 | `runapprMarginAmtBak` | runapprMarginAmtBak | `runappr_margin_amt_bak` | Decimal | `number` |
| 93 | `rapprMarginAmtBak` | rapprMarginAmtBak | `rappr_margin_amt_bak` | Decimal | `number` |
| 94 | `rmarginRefundAmtBak` | rmarginRefundAmtBak | `rmargin_refund_amt_bak` | Decimal | `number` |
| 95 | `rlocalOriginalReceiptAmtBak` | rlocalOriginalReceiptAmtBak | `rlocal_original_receipt_amt_bak` | Decimal | `number` |
| 96 | `rlocalUnapprAmtBak` | rlocalUnapprAmtBak | `rlocal_unappr_amt_bak` | Decimal | `number` |
| 97 | `rlocalApprAmtBak` | rlocalApprAmtBak | `rlocal_appr_amt_bak` | Decimal | `number` |
| 98 | `rlocalPaidAmtBak` | rlocalPaidAmtBak | `rlocal_paid_amt_bak` | Decimal | `number` |
| 99 | `rlocalApprPlanRefundAmtBak` | rlocalApprPlanRefundAmtBak | `rlocal_appr_plan_refund_amt_bak` | Decimal | `number` |
| 100 | `unrlocalApprPlanRefundAmtBak` | unrlocalApprPlanRefundAmtBak | `unrlocal_appr_plan_refund_amt_bak` | Decimal | `number` |
| 101 | `rlocalUnapprAdvanceAmtBak` | rlocalUnapprAdvanceAmtBak | `rlocal_unappr_advance_amt_bak` | Decimal | `number` |
| 102 | `rlocalApprAdvanceAmtBak` | rlocalApprAdvanceAmtBak | `rlocal_appr_advance_amt_bak` | Decimal | `number` |
| 103 | `rlocalPaidAdvanceAmtBak` | rlocalPaidAdvanceAmtBak | `rlocal_paid_advance_amt_bak` | Decimal | `number` |
| 104 | `rlocalUnapprRetentionAmtBak` | rlocalUnapprRetentionAmtBak | `rlocal_unappr_retention_amt_bak` | Decimal | `number` |
| 105 | `rlocalApprRetentionAmtBak` | rlocalApprRetentionAmtBak | `rlocal_appr_retention_amt_bak` | Decimal | `number` |
| 106 | `rlocalPaidRetentionAmtBak` | rlocalPaidRetentionAmtBak | `rlocal_paid_retention_amt_bak` | Decimal | `number` |
| 107 | `rlocalMarginAmtBak` | rlocalMarginAmtBak | `rlocal_margin_amt_bak` | Decimal | `number` |
| 108 | `rlocalUnapprMarginAmtBak` | rlocalUnapprMarginAmtBak | `rlocal_unappr_margin_amt_bak` | Decimal | `number` |
| 109 | `rlocalApprMarginAmtBak` | rlocalApprMarginAmtBak | `rlocal_appr_margin_amt_bak` | Decimal | `number` |
| 110 | `rlocalMarginRefundAmtBak` | rlocalMarginRefundAmtBak | `rlocal_margin_refund_amt_bak` | Decimal | `number` |
| 111 | `runapprSubjectOriginalAmtBak` | runapprSubjectOriginalAmtBak | `runappr_subject_original_amt_bak` | Decimal | `number` |
| 112 | `rapprSubjectOriginalAmtBak` | rapprSubjectOriginalAmtBak | `rappr_subject_original_amt_bak` | Decimal | `number` |
| 113 | `rverifiedSubjectOriginalAmtBak` | rverifiedSubjectOriginalAmtBak | `rverified_subject_original_amt_bak` | Decimal | `number` |
| 114 | `runapprSubjectLocalAmtBak` | runapprSubjectLocalAmtBak | `runappr_subject_local_amt_bak` | Decimal | `number` |
| 115 | `rapprSubjectLocalAmtBak` | rapprSubjectLocalAmtBak | `rappr_subject_local_amt_bak` | Decimal | `number` |
| 116 | `rverifiedSubjectLocalAmtBak` | rverifiedSubjectLocalAmtBak | `rverified_subject_local_amt_bak` | Decimal | `number` |
| 117 | `apprRetentionAmtBak` | apprRetentionAmtBak | `appr_retention_amt_bak` | Decimal | `number` |
| 118 | `apprSubjectAmtBak` | apprSubjectAmtBak | `appr_subject_amt_bak` | Decimal | `number` |
| 119 | `availableAmtBak` | availableAmtBak | `available_amt_bak` | Decimal | `number` |
| 120 | `ctVersionBak` | ctVersionBak | `ct_version_bak` | String | `text` |
| 121 | `historyFlagBak` | historyFlagBak | `history_flag_bak` | Short | `short` |
| 122 | `marginAmtBak` | marginAmtBak | `margin_amt_bak` | Decimal | `number` |
| 123 | `marginRefundAmtBak` | marginRefundAmtBak | `margin_refund_amt_bak` | Decimal | `number` |
| 124 | `originalReceiptAmtBak` | originalReceiptAmtBak | `original_receipt_amt_bak` | Decimal | `number` |
| 125 | `paidAdvanceAmtBak` | paidAdvanceAmtBak | `paid_advance_amt_bak` | Decimal | `number` |
| 126 | `paidAmtBak` | paidAmtBak | `paid_amt_bak` | Decimal | `number` |
| 127 | `paidRetentionAmtBak` | paidRetentionAmtBak | `paid_retention_amt_bak` | Decimal | `number` |
| 128 | `unapprAdvanceAmtBak` | unapprAdvanceAmtBak | `unappr_advance_amt_bak` | Decimal | `number` |
| 129 | `unapprAmtBak` | unapprAmtBak | `unappr_amt_bak` | Decimal | `number` |
| 130 | `unapprMarginAmtBak` | unapprMarginAmtBak | `unappr_margin_amt_bak` | Decimal | `number` |
| 131 | `unapprRetentionAmtBak` | unapprRetentionAmtBak | `unappr_retention_amt_bak` | Decimal | `number` |
| 132 | `unapprSubjectAmtBak` | unapprSubjectAmtBak | `unappr_subject_amt_bak` | Decimal | `number` |
| 133 | `usedAmtBak` | usedAmtBak | `used_amt_bak` | Decimal | `number` |
| 134 | `verfitySubjectAmtBak` | verfitySubjectAmtBak | `verfity_subject_amt_bak` | Decimal | `number` |
| 135 | `versionBak` | versionBak | `version_bak` | String | `text` |
| 136 | `statusBak` | statusBak | `status_bak` | Short | `short` |
| 137 | `noTaxLocalMoneyAmt` | noTaxLocalMoneyAmt | `no_tax_local_money_amt` | Decimal | `number` |
| 138 | `localPlanAmt` | localPlanAmt | `local_plan_amt` | Decimal | `number` |
| 139 | `retentionApprPlanRefundAmt` | retentionApprPlanRefundAmt | `retention_appr_plan_refund_amt` | Decimal | `number` |
| 140 | `advanceApprPlanRefundAmt` | advanceApprPlanRefundAmt | `advance_appr_plan_refund_amt` | Decimal | `number` |
| 141 | `localRetentionApprPlanRefundAmt` | localRetentionApprPlanRefundAmt | `local_retention_appr_plan_refund_amt` | Decimal | `number` |
| 142 | `localAdvanceApprPlanRefundAmt` | localAdvanceApprPlanRefundAmt | `local_advance_appr_plan_refund_amt` | Decimal | `number` |
| 143 | `localAvailableAmt` | localAvailableAmt | `local_available_amt` | Decimal | `number` |
| 144 | `localUsedAmt` | localUsedAmt | `local_used_amt` | Decimal | `number` |
| 145 | `localOriginalReceiptAmt` | localOriginalReceiptAmt | `local_original_receipt_amt` | Decimal | `number` |
| 146 | `localUnapprAmt` | localUnapprAmt | `local_unappr_amt` | Decimal | `number` |
| 147 | `localApprAmt` | localApprAmt | `local_appr_amt` | Decimal | `number` |
| 148 | `localPaidAmt` | localPaidAmt | `local_paid_amt` | Decimal | `number` |
| 149 | `localApprPlanRefundAmt` | localApprPlanRefundAmt | `local_appr_plan_refund_amt` | Decimal | `number` |
| 150 | `unlocalApprPlanRefundAmt` | unlocalApprPlanRefundAmt | `unlocal_appr_plan_refund_amt` | Decimal | `number` |
| 151 | `localUnapprAdvanceAmt` | localUnapprAdvanceAmt | `local_unappr_advance_amt` | Decimal | `number` |
| 152 | `localApprAdvanceAmt` | localApprAdvanceAmt | `local_appr_advance_amt` | Decimal | `number` |
| 153 | `localPaidAdvanceAmt` | localPaidAdvanceAmt | `local_paid_advance_amt` | Decimal | `number` |
| 154 | `localUnapprRetentionAmt` | localUnapprRetentionAmt | `local_unappr_retention_amt` | Decimal | `number` |
| 155 | `localApprRetentionAmt` | localApprRetentionAmt | `local_appr_retention_amt` | Decimal | `number` |
| 156 | `localPaidRetentionAmt` | localPaidRetentionAmt | `local_paid_retention_amt` | Decimal | `number` |
| 157 | `localMarginAmt` | localMarginAmt | `local_margin_amt` | Decimal | `number` |
| 158 | `localUnapprMarginAmt` | localUnapprMarginAmt | `local_unappr_margin_amt` | Decimal | `number` |
| 159 | `localApprMarginAmt` | localApprMarginAmt | `local_appr_margin_amt` | Decimal | `number` |
| 160 | `localMarginRefundAmt` | localMarginRefundAmt | `local_margin_refund_amt` | Decimal | `number` |
| 161 | `unapprPlanRefundAmt` | unapprPlanRefundAmt | `unappr_plan_refund_amt` | Decimal | `number` |
| 162 | `unapprSubjectLocalAmt` | unapprSubjectLocalAmt | `unappr_subject_local_amt` | Decimal | `number` |
| 163 | `apprSubjectLocalAmt` | apprSubjectLocalAmt | `appr_subject_local_amt` | Decimal | `number` |
| 164 | `verifiedSubjectLocalAmt` | verifiedSubjectLocalAmt | `verified_subject_local_amt` | Decimal | `number` |
| 165 | `roriginalTotalAmt` | roriginalTotalAmt | `roriginal_total_amt` | Decimal | `number` |
| 166 | `rlocalPlanAmt` | rlocalPlanAmt | `rlocal_plan_amt` | Decimal | `number` |
| 167 | `ravailableAmt` | ravailableAmt | `ravailable_amt` | Decimal | `number` |
| 168 | `rusedAmt` | rusedAmt | `rused_amt` | Decimal | `number` |
| 169 | `rlocalAvailableAmt` | rlocalAvailableAmt | `rlocal_available_amt` | Decimal | `number` |
| 170 | `rlocalUsedAmt` | rlocalUsedAmt | `rlocal_used_amt` | Decimal | `number` |
| 171 | `rretentionApprPlanRefundAmt` | rretentionApprPlanRefundAmt | `rretention_appr_plan_refund_amt` | Decimal | `number` |
| 172 | `radvanceApprPlanRefundAmt` | radvanceApprPlanRefundAmt | `radvance_appr_plan_refund_amt` | Decimal | `number` |
| 173 | `rlocalRetentionApprPlanRefundAmt` | rlocalRetentionApprPlanRefundAmt | `rlocal_retention_appr_plan_refund_amt` | Decimal | `number` |
| 174 | `rlocalAdvanceApprPlanRefundAmt` | rlocalAdvanceApprPlanRefundAmt | `rlocal_advance_appr_plan_refund_amt` | Decimal | `number` |
| 175 | `roriginalReceiptAmt` | roriginalReceiptAmt | `roriginal_receipt_amt` | Decimal | `number` |
| 176 | `runapprAmt` | runapprAmt | `runappr_amt` | Decimal | `number` |
| 177 | `rapprAmt` | rapprAmt | `rappr_amt` | Decimal | `number` |
| 178 | `rpaidAmt` | rpaidAmt | `rpaid_amt` | Decimal | `number` |
| 179 | `rapprPlanRefundAmt` | rapprPlanRefundAmt | `rappr_plan_refund_amt` | Decimal | `number` |
| 180 | `unrapprPlanRefundAmt` | unrapprPlanRefundAmt | `unrappr_plan_refund_amt` | Decimal | `number` |
| 181 | `runapprAdvanceAmt` | runapprAdvanceAmt | `runappr_advance_amt` | Decimal | `number` |
| 182 | `rapprAdvanceAmt` | rapprAdvanceAmt | `rappr_advance_amt` | Decimal | `number` |
| 183 | `rpaidAdvanceAmt` | rpaidAdvanceAmt | `rpaid_advance_amt` | Decimal | `number` |
| 184 | `runapprRetentionAmt` | runapprRetentionAmt | `runappr_retention_amt` | Decimal | `number` |
| 185 | `rapprRetentionAmt` | rapprRetentionAmt | `rappr_retention_amt` | Decimal | `number` |
| 186 | `rpaidRetentionAmt` | rpaidRetentionAmt | `rpaid_retention_amt` | Decimal | `number` |
| 187 | `rmarginAmt` | rmarginAmt | `rmargin_amt` | Decimal | `number` |
| 188 | `runapprMarginAmt` | runapprMarginAmt | `runappr_margin_amt` | Decimal | `number` |
| 189 | `rapprMarginAmt` | rapprMarginAmt | `rappr_margin_amt` | Decimal | `number` |
| 190 | `rmarginRefundAmt` | rmarginRefundAmt | `rmargin_refund_amt` | Decimal | `number` |
| 191 | `rlocalOriginalReceiptAmt` | rlocalOriginalReceiptAmt | `rlocal_original_receipt_amt` | Decimal | `number` |
| 192 | `rlocalUnapprAmt` | rlocalUnapprAmt | `rlocal_unappr_amt` | Decimal | `number` |
| 193 | `rlocalApprAmt` | rlocalApprAmt | `rlocal_appr_amt` | Decimal | `number` |
| 194 | `rlocalPaidAmt` | rlocalPaidAmt | `rlocal_paid_amt` | Decimal | `number` |
| 195 | `rlocalApprPlanRefundAmt` | rlocalApprPlanRefundAmt | `rlocal_appr_plan_refund_amt` | Decimal | `number` |
| 196 | `unrlocalApprPlanRefundAmt` | unrlocalApprPlanRefundAmt | `unrlocal_appr_plan_refund_amt` | Decimal | `number` |
| 197 | `rlocalUnapprAdvanceAmt` | rlocalUnapprAdvanceAmt | `rlocal_unappr_advance_amt` | Decimal | `number` |
| 198 | `rlocalApprAdvanceAmt` | rlocalApprAdvanceAmt | `rlocal_appr_advance_amt` | Decimal | `number` |
| 199 | `rlocalPaidAdvanceAmt` | rlocalPaidAdvanceAmt | `rlocal_paid_advance_amt` | Decimal | `number` |
| 200 | `rlocalUnapprRetentionAmt` | rlocalUnapprRetentionAmt | `rlocal_unappr_retention_amt` | Decimal | `number` |
| 201 | `rlocalApprRetentionAmt` | rlocalApprRetentionAmt | `rlocal_appr_retention_amt` | Decimal | `number` |
| 202 | `rlocalPaidRetentionAmt` | rlocalPaidRetentionAmt | `rlocal_paid_retention_amt` | Decimal | `number` |
| 203 | `rlocalMarginAmt` | rlocalMarginAmt | `rlocal_margin_amt` | Decimal | `number` |
| 204 | `rlocalUnapprMarginAmt` | rlocalUnapprMarginAmt | `rlocal_unappr_margin_amt` | Decimal | `number` |
| 205 | `rlocalApprMarginAmt` | rlocalApprMarginAmt | `rlocal_appr_margin_amt` | Decimal | `number` |
| 206 | `rlocalMarginRefundAmt` | rlocalMarginRefundAmt | `rlocal_margin_refund_amt` | Decimal | `number` |
| 207 | `runapprSubjectOriginalAmt` | runapprSubjectOriginalAmt | `runappr_subject_original_amt` | Decimal | `number` |
| 208 | `rapprSubjectOriginalAmt` | rapprSubjectOriginalAmt | `rappr_subject_original_amt` | Decimal | `number` |
| 209 | `rverifiedSubjectOriginalAmt` | rverifiedSubjectOriginalAmt | `rverified_subject_original_amt` | Decimal | `number` |
| 210 | `runapprSubjectLocalAmt` | runapprSubjectLocalAmt | `runappr_subject_local_amt` | Decimal | `number` |
| 211 | `rapprSubjectLocalAmt` | rapprSubjectLocalAmt | `rappr_subject_local_amt` | Decimal | `number` |
| 212 | `rverifiedSubjectLocalAmt` | rverifiedSubjectLocalAmt | `rverified_subject_local_amt` | Decimal | `number` |
| 213 | `wbs` | wbs | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 | `quote` |
| 214 | `activity` | activity | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 | `quote` |
| 215 | `apprRetentionAmt` | apprRetentionAmt | `appr_retention_amt` | Decimal | `number` |
| 216 | `apprSubjectAmt` | apprSubjectAmt | `appr_subject_amt` | Decimal | `number` |
| 217 | `attachmentId` | attachmentID | `attachment_id` | String | `text` |
| 218 | `auditDate` | auditDate | `audit_date` | Date | `date` |
| 219 | `auditTime` | auditTime | `audit_time` | DateTime | `timestamp` |
| 220 | `auditor` | auditor | `auditor` | String | `text` |
| 221 | `auditorId` | auditorID | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 222 | `availableAmt` | availableAmt | `available_amt` | Decimal | `number` |
| 223 | `beginningFlag` | beginningFlag | `beginning_flag` | Short | `short` |
| 224 | `businessCode` | business编码 | `business_code` | String | `text` |
| 225 | `bustype` | bustype | `bustype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |
| 226 | `changeId` | changeID | `change_id` | Long | `long` |
| 227 | `code` | 编码 | `code` | String | `text` |
| 228 | `createDate` | createDate | `create_date` | Date | `date` |
| 229 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 230 | `creator` | 创建人 | `creator` | String | `text` |
| 231 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 232 | `ctVersion` | ctVersion | `ct_version` | String | `text` |
| 233 | `currencyId` | currencyID | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 234 | `deptId` | deptID | `dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 235 | `exceedRatio` | exceedRatio | `exceed_ratio` | Decimal | `number` |
| 236 | `historyFlag` | historyFlag | `history_flag` | Short | `short` |
| 237 | `invalDate` | invalDate | `inval_date` | Date | `date` |
| 238 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |
| 239 | `isWfControlled` | 是否WfControlled | `isWfControlled` | Boolean | `switch` |
| 240 | `marginAmt` | marginAmt | `margin_amt` | Decimal | `number` |
| 241 | `marginRefundAmt` | marginRefundAmt | `margin_refund_amt` | Decimal | `number` |
| 242 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 243 | `name` | 名称 | `name` | String | `text` |
| 244 | `nexchangeRate` | nexchangeRate | `nexchange_rate` | Decimal | `number` |
| 245 | `openFlag` | openFlag | `open_flag` | Short | `short` |
| 246 | `orgId` | orgID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 247 | `originalReceiptAmt` | originalReceiptAmt | `original_receipt_amt` | Decimal | `number` |
| 248 | `originalTotalAmt` | originalTotalAmt | `original_total_amt` | Decimal | `number` |
| 249 | `paidAdvanceAmt` | paidAdvanceAmt | `paid_advance_amt` | Decimal | `number` |
| 250 | `paidAmt` | paidAmt | `paid_amt` | Decimal | `number` |
| 251 | `paidRetentionAmt` | paidRetentionAmt | `paid_retention_amt` | Decimal | `number` |
| 252 | `payTermId` | payTermID | `pay_term_id` | 3cce8052-512e-4e51-9b6e-57adff40948c | `quote` |
| 253 | `payeeAccountId` | payeeAccountID | `payee_account_id` | 4b6dcfa2-1d07-407d-a35a-9b219fadf37c | `quote` |
| 254 | `payeeCardno` | payeeCardno | `payee_cardno` | String | `text` |
| 255 | `payerAccountId` | payerAccountID | `payer_account_id` | fbc20885-a507-45bd-a986-74d3fc28d38a | `quote` |
| 256 | `payerCardno` | payerCardno | `payer_cardno` | String | `text` |
| 257 | `personnelId` | personnelID | `personnel_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 258 | `populateMode` | populateMode | `populate_mode` | Short | `short` |
| 259 | `projectId` | projectID | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |
| 260 | `rateDate` | rateDate | `rate_date` | Date | `date` |
| 261 | `rateTypeId` | rateTypeID | `rate_type_id` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |
| 262 | `returncount` | returncount | `returncount` | Short | `short` |
| 263 | `settleTypeId` | settleTypeID | `settle_type_id` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff | `quote` |
| 264 | `signDate` | signDate | `sign_date` | Date | `date` |
| 265 | `signOrgId` | signOrgID | `sign_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 266 | `status` | 状态 | `status` | Short | `short` |
| 267 | `supplierId` | supplierID | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 268 | `tplid` | tplid | `tplid` | Long | `long` |
| 269 | `unapprAdvanceAmt` | unapprAdvanceAmt | `unappr_advance_amt` | Decimal | `number` |
| 270 | `unapprAmt` | unapprAmt | `unappr_amt` | Decimal | `number` |
| 271 | `unapprMarginAmt` | unapprMarginAmt | `unappr_margin_amt` | Decimal | `number` |
| 272 | `unapprRetentionAmt` | unapprRetentionAmt | `unappr_retention_amt` | Decimal | `number` |
| 273 | `unapprSubjectAmt` | unapprSubjectAmt | `unappr_subject_amt` | Decimal | `number` |
| 274 | `usedAmt` | usedAmt | `used_amt` | Decimal | `number` |
| 275 | `valDate` | valDate | `val_date` | Date | `date` |
| 276 | `verfitySubjectAmt` | verfitySubjectAmt | `verfity_subject_amt` | Decimal | `number` |
| 277 | `verifystate` | verifystate | `verifystate` | Short | `short` |
| 278 | `version` | 版本号 | `version` | String | `text` |
| 279 | `vouchdate` | vouchdate | `vouchdate` | Date | `date` |
| 280 | `id` | ID | `id` | Long | `long` |
| 281 | `settledcount` | settledcount | `settledcount` | Integer | `int` |
| 282 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 283 | `modifyDate` | modifyDate | `modify_date` | Date | `date` |
| 284 | `modifier` | 修改人 | `modifier` | String | `text` |
| 285 | `ctfrom` | ctfrom | `ctfrom` | String | `text` |
| 286 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 287 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 288 | `apctApctDcs` | apctApctDcs | `apctApctDcs` | 79f9eb04-861b-4bb2-954d-dfd8db7bd8e9 | `UserDefine` |
| 289 | `apctCounterpartys` | apctCounterpartys | `` | 87f101ec-e15c-4e2a-b80c-5953c4b4c7f3 | `` |
| 290 | `apctInvoiceinfos` | apctInvoiceinfos | `` | ca31a591-ac9c-4dd1-a5ee-7c9bd867c537 | `` |
| 291 | `apctInvoicinginfos` | apctInvoicinginfos | `` | 0401ac42-da28-43c4-8dd5-706519d026f7 | `` |
| 292 | `apctOwnerChangelogs` | apctOwnerChangelogs | `` | 3e18d3a0-b8c9-44b8-a3e8-17d62cd66022 | `` |
| 293 | `apctownersub` | apctownersub | `` | f29c219b-459d-4e64-8af1-a4bddfd38cff | `` |
| 294 | `hisrecords` | hisrecords | `` | 8a2d94d5-0cef-4340-b444-7d231a9c4c2b | `` |
| 295 | `ibpmcurrentauditors` | ibpmcurrentauditors | `` | 51169115-e150-4e34-8fdd-2bbded5087bd | `` |
| 296 | `ibpmsteps` | ibpmsteps | `` | ccbc0025-5aba-44db-8273-e7260fcf97a9 | `` |
| 297 | `items` | items | `` | 6fd02b5e-0a5b-40f6-92e8-1e1f626df0a0 | `` |
| 298 | `margins` | margins | `` | 9b101166-8c8d-46f3-ba77-8b8b92992aaf | `` |
| 299 | `materials` | materials | `` | 9cb52058-54d9-491b-a012-1f5c6202f9ca | `` |
| 300 | `memorabilias` | memorabilias | `` | e88e1ebe-d800-43e1-aa04-d438b94dd821 | `` |
| 301 | `plans` | plans | `` | f6f2aec8-fae4-49c4-83cd-0399d152fa6f | `` |
| 302 | `processes` | processes | `` | 6370d646-06e2-4b47-8e48-6cc95e7c0ace | `` |
| 303 | `receiptplans` | receiptplans | `` | 4442e9a2-d3da-40a7-bc71-ee97ac39c278 | `` |
| 304 | `relateVouchers` | relateVouchers | `` | 1e9ef373-d6b0-4482-8c02-28c42aef5da0 | `` |
| 305 | `thirdVoucher` | thirdVoucher | `` | f98fe4d6-bb3f-499f-a852-3fd5ad25f06d | `` |

## 关联（45 个）

- `rateTypeId` -> `bd.exchangeRate.ExchangeRateTypeVO` () 
- `margins` -> `apct.contract.ApctMargin` (0..n) 
- `supplierId` -> `aa.vendor.Vendor` () 
- `contractLedgerId` -> `CLM.clmContract.contractLib` () 
- `activity` -> `pgrm.projecttask.ProjectScheduleTask` () 
- `contractType` -> `DZHTFW.econtract.contractType` () 
- `creatorId` -> `base.user.User` () 
- `modifierId` -> `base.user.User` () 
- `wbs` -> `BGDM.wbs.wbs_doc` () 
- `localCurrency` -> `bd.currencytenant.CurrencyTenantVO` () 
- `payerAccountId` -> `bd.enterprise.OrgFinBankacctVO` () 
- `apctOwnerChangelogs` -> `apct.contract.ApctOwnerChangeLog` (1..n) 
- `orgId` -> `org.func.BaseOrg` () 
- `thirdVoucher` -> `apct.contract.ApctThirdVoucher` (0..n) 
- `apctApctDcs` -> `apct.contract.ApctDcsVo` () 
- `receiptplans` -> `apct.contract.ApctReceiptplan` (0..n) 
- `ibpmcurrentauditors` -> `apct.contract.ApctIBpmApprovalTask` (0..n) 
- `ibpmsteps` -> `apct.contract.ApctIBpmStep` (0..n) 
- `memorabilias` -> `apct.contract.ApctMemorabilia` (0..n) 
- `currencyId` -> `bd.currencytenant.CurrencyTenantVO` () 
- `signOrgId` -> `org.func.BaseOrg` () 
- `tenant` -> `base.tenant.Tenant` () 
- `payTermId` -> `bd.payments.PayAgreement` () 
- `processes` -> `apct.contract.ApctProcess` (0..n) 
- `payeeAccountId` -> `aa.vendor.VendorBank` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `hisrecords` -> `apct.contract.ApctHisrecord` (0..n) 
- `apctownersub` -> `apct.contract.ApctOwnerSub` (1..n) 
- `relateVouchers` -> `apct.contract.ApctRelateVoucher` (0..n) 
- `deptId` -> `bd.adminOrg.AdminOrgVO` () 
- `acctEntityId` -> `bd.adminOrg.FinanceOrgVO` () 
- `apctInvoiceinfos` -> `apct.contract.ApctInvoiceinfo` (0..n) 
- `bustype` -> `bd.bill.TransType` () 
- `parentId` -> `apct.contract.Apct` () 
- `auditorId` -> `base.user.User` () 
- `applyBillId` -> `znbzbx.memoapply.MemoApplyVO` () 
- `personnelId` -> `bd.staff.Staff` () 
- `materials` -> `apct.contract.ApctMaterial` (0..n) 
- `plans` -> `apct.contract.ApctPlan` (0..n) 
- `settleTypeId` -> `aa.settlemethod.SettleMethod` () 
- `apctInvoicinginfos` -> `apct.contract.ApctInvoicinginfo` (0..n) 
- `projectId` -> `bd.project.ProjectVO` () 
- `items` -> `apct.contract.ApctItem` (0..n) 
- `apctCounterpartys` -> `apct.contract.ApctCounterparty` (0..n) 
- `customer` -> `aa.merchant.Merchant` () 
