---
tags: [BIP, 元数据, 数据字典, earap.payment.TaxCalculationResult]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 计税结果 (`earap.payment.TaxCalculationResult`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `stwb_tax_calc_result` | 应用: `EAP`

## 属性（40 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `lineAmountMark` | lineAmountMark | `line_amount_mark` | String | `text` |
| 2 | `calculationInputId` | calculationInputID | `calculation_input_id` | bce8f91c-16fa-4e46-99b9-47cd0e4a5f89 | `quote` |
| 3 | `taxCategoryArchiveId` | taxCategoryArchiveID | `tax_category_archive_id` | 01a37978-70b8-4e8c-83d7-3a9b79d84917 | `quote` |
| 4 | `finDeductTaxMny` | finDeductTaxMny | `fin_deduct_tax_mny` | Decimal | `number` |
| 5 | `deductTaxrateQty` | deductTaxrateQty | `deduct_taxrate_qty` | Decimal | `number` |
| 6 | `taxBureauArchiveId` | taxBureauArchiveID | `tax_bureau_archive_id` | d910183c-a1c4-48b2-8bc4-0b9f1dda6eb8 | `quote` |
| 7 | `calculationInputBid` | calculationInputBid | `calculation_input_bid` | 002f1c0c-815d-4afd-a93e-446e31a5abc9 | `quote` |
| 8 | `calculationComponentFormula` | calculationComponentFormula | `calculation_component_formula` | String | `bigText` |
| 9 | `totDeductMny` | totDeductMny | `tot_deduct_mny` | Decimal | `number` |
| 10 | `finTaxMny` | finTaxMny | `fin_tax_mny` | Decimal | `number` |
| 11 | `taxrateQty` | taxrateQty | `taxrate_qty` | Decimal | `number` |
| 12 | `taxItemId` | taxItemID | `tax_item_id` | 0eea81a1-2a5f-4f44-af40-c1da88b6edde | `quote` |
| 13 | `taxrateId` | taxrateID | `taxrate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |
| 14 | `taxCodeId` | tax编码ID | `tax_code_id` | 3f7c3856-5b00-4506-b458-a64eed0d3bfb | `quote` |
| 15 | `calculationComponentId` | calculationComponentID | `calculation_component_id` | f30c18c7-70b9-4933-a20f-0447c0f7eb26 | `quote` |
| 16 | `withholdRemit` | withholdRemit | `withhold_remit` | taxpubdocYNEnum | `singleOption` |
| 17 | `calcQty` | calcQty | `calc_qty` | Decimal | `number` |
| 18 | `calcMny` | calcMny | `calc_mny` | Decimal | `number` |
| 19 | `totDeductTaxMny` | totDeductTaxMny | `tot_deduct_tax_mny` | Decimal | `number` |
| 20 | `calcTaxMny` | calcTaxMny | `calc_tax_mny` | Decimal | `number` |
| 21 | `unitId` | unitID | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 22 | `bizObjType` | bizObjType | `biz_obj_type` | String | `text` |
| 23 | `deductionType` | deductionType | `deduction_type` | fac5ac11-815b-47d3-ba4f-5cd47ff97c2e | `quote` |
| 24 | `currencyId` | currencyID | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 25 | `localCurrencyId` | localCurrencyID | `local_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 26 | `exchangeRate` | exchangeRate | `exchange_rate` | Decimal | `number` |
| 27 | `exchangeRateMethod` | exchangeRateMethod | `exchange_rate_method` | String | `text` |
| 28 | `oriTaxMny` | oriTaxMny | `ori_tax_mny` | Decimal | `number` |
| 29 | `localTaxMny` | localTaxMny | `local_tax_mny` | Decimal | `number` |
| 30 | `currType` | currType | `curr_type` | taxEngineCurrType | `singleOption` |
| 31 | `mainid` | mainid | `mainid` | 83697b00-1e51-4a2d-a1d3-13cd2c8003f2 | `quote` |
| 32 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 33 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 34 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 35 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 36 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 37 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 38 | `id` | ID | `id` | String | `text` |
| 39 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 40 | `TaxCalculationResultDetailList` | TaxCalculationResultDetailList | `` | fafc3813-37be-4942-931e-cea27a2be252 | `` |

## 关联（17 个）

- `creator` -> `base.user.BipUser` () 
- `localCurrencyId` -> `bd.currencytenant.CurrencyTenantVO` () [废]
- `deductionType` -> `GZTBDM.taxpubdoc.deductionType` () [废]
- `modifier` -> `base.user.BipUser` () 
- `taxBureauArchiveId` -> `archive.taxArchives.TaxBureauArchive` () [废]
- `taxCategoryArchiveId` -> `archive.taxArchives.TaxCategoryArchive` () [废]
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `taxCodeId` -> `taxpubdoc.taxengine.TaxCode` () [废]
- `calculationComponentId` -> `taxpubdoc.taxengine.TaxCalculationComponent` () [废]
- `calculationInputBid` -> `taxpubdoc.taxengine.TaxCalculationInputDetail` () [废]
- `taxrateId` -> `archive.taxArchives.TaxRateArchive` () [废]
- `TaxCalculationResultDetailList` -> `earap.payment.TaxCalculationResultDetail` (0..n) 
- `calculationInputId` -> `taxpubdoc.taxengine.TaxCalculationInput` () [废]
- `unitId` -> `pc.unit.Unit` () [废]
- `currencyId` -> `bd.currencytenant.CurrencyTenantVO` () [废]
- `mainid` -> `earap.payment.PaymentBody` (0..n) [废]
- `taxItemId` -> `taxpubdoc.taxpubdoc.TaxItem` () [废]
