---
tags: [BIP, 元数据, 数据字典, pu.purchaseorder.TaxCalculationResult]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 计税结果 (`pu.purchaseorder.TaxCalculationResult`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `tax_calc_result` | 应用: `PU`

## 属性（34 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `TaxResultDetailList` | TaxResultDetailList | `` | 84784d99-f4c8-479e-a74d-2fbcfd396d56 | `` |
| 2 | `calcCurrencyId` | calcCurrencyID | `calc_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 3 | `calcMny` | calcMny | `calc_mny` | Decimal | `number` |
| 4 | `calcQty` | calcQty | `calc_qty` | Decimal | `number` |
| 5 | `calcTaxMny` | calcTaxMny | `calc_tax_mny` | Decimal | `number` |
| 6 | `calculationComponentFormula` | calculationComponentFormula | `calculation_component_formula` | String | `bigText` |
| 7 | `calculationComponentId` | calculationComponentID | `calculation_component_id` | f30c18c7-70b9-4933-a20f-0447c0f7eb26 | `quote` |
| 8 | `calculationInputBid` | calculationInputBid | `calculation_input_bid` | 002f1c0c-815d-4afd-a93e-446e31a5abc9 | `quote` |
| 9 | `calculationInputId` | calculationInputID | `calculation_input_id` | bce8f91c-16fa-4e46-99b9-47cd0e4a5f89 | `quote` |
| 10 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 11 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 12 | `deductTaxrateQty` | deductTaxrateQty | `deduct_taxrate_qty` | Decimal | `number` |
| 13 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 14 | `finDeductTaxMny` | finDeductTaxMny | `fin_deduct_tax_mny` | Decimal | `number` |
| 15 | `finTaxMny` | finTaxMny | `fin_tax_mny` | Decimal | `number` |
| 16 | `id` | ID | `id` | Long | `long` |
| 17 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 18 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 20 | `roundingId` | roundingID | `rounding_id` | String | `singleOption` |
| 21 | `sourceId` | sourceID | `source_id` | String | `text` |
| 22 | `sourcebusiobj` | sourcebusiobj | `source_busi_obj` | String | `text` |
| 23 | `sourcechildId` | sourcechildID | `sourcechild_id` | String | `text` |
| 24 | `taxBureauArchiveId` | taxBureauArchiveID | `tax_bureau_archive_id` | d910183c-a1c4-48b2-8bc4-0b9f1dda6eb8 | `quote` |
| 25 | `taxCategoryArchiveId` | taxCategoryArchiveID | `tax_category_archive_id` | 01a37978-70b8-4e8c-83d7-3a9b79d84917 | `quote` |
| 26 | `taxCodeId` | tax编码ID | `tax_code_id` | 3f7c3856-5b00-4506-b458-a64eed0d3bfb | `quote` |
| 27 | `taxItemId` | taxItemID | `tax_item_id` | 0eea81a1-2a5f-4f44-af40-c1da88b6edde | `quote` |
| 28 | `taxrateId` | taxrateID | `taxrate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |
| 29 | `taxrateQty` | taxrateQty | `taxrate_qty` | Decimal | `number` |
| 30 | `totDeductMny` | totDeductMny | `tot_deduct_mny` | Decimal | `number` |
| 31 | `totDeductTaxMny` | totDeductTaxMny | `tot_deduct_tax_mny` | Decimal | `number` |
| 32 | `unitId` | unitID | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 33 | `withholdRemit` | withholdRemit | `with_hold_remit` | String | `singleOption` |
| 34 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（14 个）

- `creator` -> `base.user.BipUser` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `modifier` -> `base.user.BipUser` () 
- `taxBureauArchiveId` -> `archive.taxArchives.TaxBureauArchive` () 
- `taxCategoryArchiveId` -> `archive.taxArchives.TaxCategoryArchive` () 
- `taxCodeId` -> `taxpubdoc.taxengine.TaxCode` () 
- `calcCurrencyId` -> `bd.currencytenant.CurrencyTenantVO` () 
- `TaxResultDetailList` -> `pu.purchaseorder.TaxCalculationResultDetail` (0..n) 
- `calculationComponentId` -> `taxpubdoc.taxengine.TaxCalculationComponent` () 
- `calculationInputBid` -> `taxpubdoc.taxengine.TaxCalculationInputDetail` () 
- `taxrateId` -> `archive.taxArchives.TaxRateArchive` () 
- `calculationInputId` -> `taxpubdoc.taxengine.TaxCalculationInput` () 
- `unitId` -> `pc.unit.Unit` () 
- `taxItemId` -> `taxpubdoc.taxpubdoc.TaxItem` () 
