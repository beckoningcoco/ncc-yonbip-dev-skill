---
tags: [BIP, 元数据, 数据字典, apct.contract.ApctMaterial]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 标的物 (`apct.contract.ApctMaterial`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `apct_apct_material` | 应用: `APCT`

## 属性（74 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `createDate` | createDate | `create_date` | Date | `date` |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 3 | `creator` | 创建人 | `creator` | String | `text` |
| 4 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 5 | `ctId` | ctID | `ct_id` | 84a309b9-2fd0-48d8-9b75-8251a20928c2 | `quote` |
| 6 | `groupTaskKey` | groupTaskKey | `groupTaskKey` | String | `text` |
| 7 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |
| 8 | `paidAmt` | paidAmt | `paid_amt` | Decimal | `number` |
| 9 | `projectId` | projectID | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |
| 10 | `material` | material | `material` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 11 | `takerOrg` | takerOrg | `taker_org` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 12 | `materialTypeId` | materialTypeID | `material_type_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `quote` |
| 13 | `rowNo` | rowNo | `row_no` | Decimal | `number` |
| 14 | `contractDirection` | contractDirection | `contract_direction` | Short | `short` |
| 15 | `payTermId` | payTermID | `pay_term_id` | 3cce8052-512e-4e51-9b6e-57adff40948c | `quote` |
| 16 | `costCenter` | costCenter | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 | `quote` |
| 17 | `profitCenter` | profitCenter | `profit_center_id` | e33ec72a-3857-4167-89e2-a437168ed3bb | `quote` |
| 18 | `quantity` | quantity | `quantity` | Decimal | `number` |
| 19 | `unit` | unit | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 20 | `taxSubject` | taxSubject | `tax_subject` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |
| 21 | `taxRateId` | taxRateID | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |
| 22 | `originalPrice` | originalPrice | `original_price` | Decimal | `number` |
| 23 | `noTaxOriginalPrice` | noTaxOriginalPrice | `no_tax_original_price` | Decimal | `number` |
| 24 | `originalTax` | originalTax | `original_tax` | Decimal | `number` |
| 25 | `noTaxOriginalMoney` | noTaxOriginalMoney | `no_tax_original_money` | Decimal | `number` |
| 26 | `localPrice` | localPrice | `local_price` | Decimal | `number` |
| 27 | `noTaxLocalPrice` | noTaxLocalPrice | `no_tax_local_price` | Decimal | `number` |
| 28 | `localMoney` | localMoney | `local_money` | Decimal | `number` |
| 29 | `localTax` | localTax | `local_tax` | Decimal | `number` |
| 30 | `noTaxLocalMoney` | noTaxLocalMoney | `no_tax_local_money` | Decimal | `number` |
| 31 | `localInvoiceTotal` | localInvoiceTotal | `local_invoice_total` | Decimal | `number` |
| 32 | `originalInvoiceTotal` | originalInvoiceTotal | `original_invoice_total` | Decimal | `number` |
| 33 | `sourceautorowid` | sourceautorowid | `sourceautorowid` | Long | `long` |
| 34 | `localUsedAmt` | localUsedAmt | `local_used_amt` | Decimal | `number` |
| 35 | `localPaidAmt` | localPaidAmt | `local_paid_amt` | Decimal | `number` |
| 36 | `unapprRefundSubjectAmt` | unapprRefundSubjectAmt | `unappr_refund_subject_amt` | Decimal | `number` |
| 37 | `apprRefundSubjectAmt` | apprRefundSubjectAmt | `appr_refund_subject_amt` | Decimal | `number` |
| 38 | `unapprRefundSubjectLocalAmt` | unapprRefundSubjectLocalAmt | `unappr_refund_subject_local_amt` | Decimal | `number` |
| 39 | `apprRefundSubjectLocalAmt` | apprRefundSubjectLocalAmt | `appr_refund_subject_local_amt` | Decimal | `number` |
| 40 | `paidAmtBak` | paidAmtBak | `paid_amt_bak` | Decimal | `number` |
| 41 | `noTaxOriginalMoneyBak` | noTaxOriginalMoneyBak | `no_tax_original_money_bak` | Decimal | `number` |
| 42 | `noTaxLocalMoneyBak` | noTaxLocalMoneyBak | `no_tax_local_money_bak` | Decimal | `number` |
| 43 | `localInvoiceTotalBak` | localInvoiceTotalBak | `local_invoice_total_bak` | Decimal | `number` |
| 44 | `originalInvoiceTotalBak` | originalInvoiceTotalBak | `original_invoice_total_bak` | Decimal | `number` |
| 45 | `localUsedAmtBak` | localUsedAmtBak | `local_used_amt_bak` | Decimal | `number` |
| 46 | `localPaidAmtBak` | localPaidAmtBak | `local_paid_amt_bak` | Decimal | `number` |
| 47 | `unapprRefundSubjectAmtBak` | unapprRefundSubjectAmtBak | `unappr_refund_subject_amt_bak` | Decimal | `number` |
| 48 | `apprRefundSubjectAmtBak` | apprRefundSubjectAmtBak | `appr_refund_subject_amt_bak` | Decimal | `number` |
| 49 | `unapprRefundSubjectLocalAmtBak` | unapprRefundSubjectLocalAmtBak | `unappr_refund_subject_local_amt_bak` | Decimal | `number` |
| 50 | `apprRefundSubjectLocalAmtBak` | apprRefundSubjectLocalAmtBak | `appr_refund_subject_local_amt_bak` | Decimal | `number` |
| 51 | `usedAmtBak` | usedAmtBak | `used_amt_bak` | Decimal | `number` |
| 52 | `releaseAmtBak` | releaseAmtBak | `relase_amt_bak` | Decimal | `number` |
| 53 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 54 | `wbs` | wbs | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 | `quote` |
| 55 | `activity` | activity | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 | `quote` |
| 56 | `makeRuleCode` | makeRule编码 | `makerule_code` | String | `text` |
| 57 | `modifier` | 修改人 | `modifier` | String | `text` |
| 58 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 59 | `modifyDate` | modifyDate | `modify_date` | Date | `date` |
| 60 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 61 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 62 | `source` | source | `source` | String | `text` |
| 63 | `sourceMainPubts` | sourceMainPubts | `sourceMainPubts` | DateTime | `timestamp` |
| 64 | `sourceautoid` | sourceautoid | `sourceautoid` | Long | `long` |
| 65 | `sourceid` | sourceid | `sourceid` | Long | `long` |
| 66 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 67 | `upcode` | upcode | `upcode` | String | `text` |
| 68 | `id` | ID | `id` | Long | `long` |
| 69 | `expenseitemId` | expenseitemID | `expenseitem_id` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 | `quote` |
| 70 | `pk_projectapply` | pk_projectapply | `pk_projectapply` | 0dd17389-d0ee-4f01-b34b-9a17be57afcb | `quote` |
| 71 | `originalTotalAmt` | originalTotalAmt | `original_total_amt` | Decimal | `number` |
| 72 | `usedAmt` | usedAmt | `used_amt` | Decimal | `number` |
| 73 | `apctApctMaterialDcs` | apctApctMaterialDcs | `apctApctMaterialDcs` | ce564165-f489-4f2e-9d95-b4c278f19d94 | `UserDefine` |
| 74 | `releaseAmt` | releaseAmt | `relase_amt` | Decimal | `number` |

## 关联（20 个）

- `ctId` -> `apct.contract.Apct` (0..n) 
- `expenseitemId` -> `bd.expenseitem.ExpenseItem` () 
- `taxSubject` -> `archive.taxArchives.TaxRateArchive` () 
- `activity` -> `pgrm.projecttask.ProjectScheduleTask` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `costCenter` -> `bd.costcenter.CostCenter` () 
- `takerOrg` -> `org.func.BaseOrg` () 
- `materialTypeId` -> `pc.cls.ManagementClass` () 
- `creatorId` -> `base.user.User` () 
- `modifierId` -> `base.user.User` () 
- `wbs` -> `BGDM.wbs.wbs_doc` () 
- `apctApctMaterialDcs` -> `apct.contract.ApctMaterialDcsVo` () 
- `profitCenter` -> `bd.virtualaccbody.VirtualAccbody` () 
- `unit` -> `pc.unit.Unit` () 
- `material` -> `pc.product.Product` () 
- `pk_projectapply` -> `znbzbx.memoapply.MemoApplyBVO` () 
- `taxRateId` -> `archive.taxArchives.TaxRateArchive` () 
- `projectId` -> `bd.project.ProjectVO` () 
- `tenant` -> `base.tenant.Tenant` () 
- `payTermId` -> `bd.payments.PayAgreement` () 
