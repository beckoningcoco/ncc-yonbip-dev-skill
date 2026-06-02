---
tags: [BIP, 元数据, 数据字典, FIAP.FIAP.APPublicEventTaxCalculationResult]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 计税单 (`FIAP.FIAP.APPublicEventTaxCalculationResult`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `arap_ledger_g_taxcalc` | 应用: `EAP`

## 属性（61 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `accBookId` | accBookID | `acc_book_id` | String | `text` |
| 2 | `accDeductTaxAmount` | accDeductTaxAmount | `acc_deduct_tax_amount` | Decimal | `number` |
| 3 | `accFinTaxAmount` | accFinTaxAmount | `acc_final_tax_amount` | Decimal | `number` |
| 4 | `accPeriodCode` | accPeriod编码 | `acc_period_code` | String | `text` |
| 5 | `accPeriodId` | accPeriodID | `acc_period_id` | Long | `long` |
| 6 | `accTaxAmount` | accTaxAmount | `acc_calc_amount` | Decimal | `number` |
| 7 | `accYearCode` | accYear编码 | `acc_year_code` | String | `text` |
| 8 | `accYearId` | accYearID | `acc_year_id` | Long | `long` |
| 9 | `arapEventType` | arapEventType | `arap_event_type` | String | `text` |
| 10 | `blnCarryover` | blnCarryover | `bln_carryover` | String | `text` |
| 11 | `body` | body | `body_id` | 11df05ba-d92b-4e64-a061-e083057642a8 | `quote` |
| 12 | `calcCurrencyId` | calcCurrencyID | `calc_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 13 | `calcMny` | calcMny | `ori_calc_amount` | Decimal | `number` |
| 14 | `calcQty` | calcQty | `calc_quantity` | Decimal | `number` |
| 15 | `calcTaxMny` | calcTaxMny | `ori_calc_tax_amount` | Decimal | `number` |
| 16 | `calculationComponentFormula` | calculationComponentFormula | `calc_component_formula` | String | `text` |
| 17 | `calculationComponentId` | calculationComponentID | `calc_component_id` | f30c18c7-70b9-4933-a20f-0447c0f7eb26 | `quote` |
| 18 | `calculationInputBid` | calculationInputBid | `calc_input_bid` | 002f1c0c-815d-4afd-a93e-446e31a5abc9 | `quote` |
| 19 | `calculationInputId` | calculationInputID | `calc_input_id` | bce8f91c-16fa-4e46-99b9-47cd0e4a5f89 | `quote` |
| 20 | `carryoverPeriodCode` | carryoverPeriod编码 | `carryover_period_code` | String | `text` |
| 21 | `carryoverPeriodId` | carryoverPeriodID | `carryover_period_id` | Long | `long` |
| 22 | `carryoverYearCode` | carryoverYear编码 | `carryover_year_code` | String | `text` |
| 23 | `carryoverYearId` | carryoverYearID | `carryover_year_id` | Long | `long` |
| 24 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 25 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 26 | `currType` | currType | `calc_currency_type` | taxEngineCurrType | `singleOption` |
| 27 | `deductTaxrateQty` | deductTaxrateQty | `deduct_tax_rate` | Decimal | `number` |
| 28 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 29 | `dtcGtxid` | dtcGtxid | `dtc_gtxid` | String | `text` |
| 30 | `dtcStatus` | dtcStatus | `dtc_status` | Integer | `int` |
| 31 | `event` | event | `event_id` | 5a4e7d5d-57c1-4d58-b931-0477ad5ca5d2 | `quote` |
| 32 | `eventTypeId` | eventTypeID | `event_type_id` | String | `text` |
| 33 | `finDeductTaxMny` | finDeductTaxMny | `ori_deduct_tax_amount` | Decimal | `number` |
| 34 | `finTaxMny` | finTaxMny | `ori_final_tax_amount` | Decimal | `number` |
| 35 | `financeOrgId` | financeOrgID | `finance_org_id` | String | `text` |
| 36 | `freeChId` | freeChID | `free_ch_id` | 25d2f94f-05cd-40d2-b630-25d3819182fa | `UserDefine` |
| 37 | `gblDeductTaxAmount` | gblDeductTaxAmount | `gbl_deduct_tax_amount` | Decimal | `number` |
| 38 | `gblFinTaxAmount` | gblFinTaxAmount | `gbl_final_tax_amount` | Decimal | `number` |
| 39 | `gblTaxAmount` | gblTaxAmount | `gbl_calc_amount` | Decimal | `number` |
| 40 | `grpDeductTaxAmount` | grpDeductTaxAmount | `grp_deduct_tax_amount` | Decimal | `number` |
| 41 | `grpFinTaxAmount` | grpFinTaxAmount | `grp_final_tax_amount` | Decimal | `number` |
| 42 | `grpTaxAmount` | grpTaxAmount | `grp_calc_amount` | Decimal | `number` |
| 43 | `id` | ID | `id` | String | `text` |
| 44 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 45 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 46 | `orgDeductTaxAmount` | orgDeductTaxAmount | `org_deduct_tax_amount` | Decimal | `number` |
| 47 | `orgFinTaxAmount` | orgFinTaxAmount | `org_final_tax_amount` | Decimal | `number` |
| 48 | `orgTaxAmount` | orgTaxAmount | `org_calc_amount` | Decimal | `number` |
| 49 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 50 | `roundingId` | roundingID | `round_type` | taxRoundingRule | `singleOption` |
| 51 | `taxBureauArchiveId` | taxBureauArchiveID | `tax_bureau_id` | d910183c-a1c4-48b2-8bc4-0b9f1dda6eb8 | `quote` |
| 52 | `taxCategoryArchiveId` | taxCategoryArchiveID | `tax_type_id` | 01a37978-70b8-4e8c-83d7-3a9b79d84917 | `quote` |
| 53 | `taxCodeId` | tax编码ID | `tax_code_id` | 3f7c3856-5b00-4506-b458-a64eed0d3bfb | `quote` |
| 54 | `taxItemId` | taxItemID | `tax_subject_id` | 0eea81a1-2a5f-4f44-af40-c1da88b6edde | `quote` |
| 55 | `taxrateId` | taxrateID | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |
| 56 | `taxrateQty` | taxrateQty | `tax_rate` | Decimal | `number` |
| 57 | `totDeductMny` | totDeductMny | `ori_deduct_balance` | Decimal | `number` |
| 58 | `totDeductTaxMny` | totDeductTaxMny | `ori_deduct_tax_balance` | Decimal | `number` |
| 59 | `unitId` | unitID | `calc_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 60 | `withholdRemit` | withholdRemit | `bln_hold_remit` | taxpubdocYNEnum | `singleOption` |
| 61 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（16 个）

- `creator` -> `base.user.BipUser` () 
- `modifier` -> `base.user.BipUser` () 
- `freeChId` -> `FIAP.FIAP.TaxCalculationResultARAPfreeChIdUserDefine` () 
- `taxBureauArchiveId` -> `archive.taxArchives.TaxBureauArchive` () 
- `taxCategoryArchiveId` -> `archive.taxArchives.TaxCategoryArchive` () 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `body` -> `FIAP.FIAP.APPublicEventBody` (0..n) 
- `taxCodeId` -> `taxpubdoc.taxengine.TaxCode` () 
- `calcCurrencyId` -> `bd.currencytenant.CurrencyTenantVO` () 
- `calculationComponentId` -> `taxpubdoc.taxengine.TaxCalculationComponent` () 
- `calculationInputBid` -> `taxpubdoc.taxengine.TaxCalculationInputDetail` () 
- `taxrateId` -> `archive.taxArchives.TaxRateArchive` () 
- `calculationInputId` -> `taxpubdoc.taxengine.TaxCalculationInput` () 
- `unitId` -> `pc.unit.Unit` () 
- `event` -> `FIAP.FIAP.APPublicEvent` () 
- `taxItemId` -> `taxpubdoc.taxpubdoc.TaxItem` () 
