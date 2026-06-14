---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.ibuyoffer.TaxCalculationResult"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 计税结果 (`sourcing.ibuyoffer.TaxCalculationResult`)

> ycSouringInquiry | 物理表：`tax_calc_result`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计税结果 |
| 物理表 | `tax_calc_result` |
| domain/服务域 | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:10:35.6470` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | 主键 |

---

## 直接属性（44个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `TaxResultDetailList` | 计税结果明细 | `` | c216ac21-7a18-4ac8-a13f-8c21b0555007 |
| 2 | `calcCurrencyId` | 计税币种 | `calc_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 3 | `calcMny` | 计税金额 | `calc_mny` | Decimal |
| 4 | `calcQty` | 计税数量 | `calc_qty` | Decimal |
| 5 | `calcTaxMny` | 计算税额 | `calc_tax_mny` | Decimal |
| 6 | `calculationComponentFormula` | 计税组件表达式 | `calculation_component_formula` | String |
| 7 | `calculationComponentId` | 计税组件id | `calculation_component_id` | f30c18c7-70b9-4933-a20f-0447c0f7eb26 |
| 8 | `calculationInputBid` | 计税输入明细id | `calculation_input_bid` | 002f1c0c-815d-4afd-a93e-446e31a5abc9 |
| 9 | `calculationInputId` | 计税输入id | `calculation_input_id` | String |
| 10 | `createTime` | 创建时间 | `create_time` | DateTime |
| 11 | `creator` | 创建人 | `creator` | String |
| 12 | `currType` | 计税币种 | `curr_type` | String |
| 13 | `currencyId` | 原币 | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 14 | `deductTaxrateQty` | 减免税率值 | `deduct_taxrate_qty` | Decimal |
| 15 | `deductionType` | 抵扣类型主键 | `deduction_type` | String |
| 16 | `dr` | 逻辑删除标记 | `dr` | Short |
| 17 | `exchangeRate` | 汇率 | `exchange_rate` | Decimal |
| 18 | `exchangeRateMethod` | 汇率折算方式 | `exchange_rate_method` | String |
| 19 | `finDeductTaxMny` | 最终减免税额 | `fin_deduct_tax_mny` | Decimal |
| 20 | `finTaxMny` | 最终税额 | `fin_tax_mny` | Decimal |
| 21 | `id` | 主键 | `id` | String |
| 22 | `lineAmountMark` | 行金额标识 | `line_amount_mark` | String |
| 23 | `localCurrencyId` | 本币 | `local_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 24 | `localTaxMny` | 本币税额 | `local_tax_mny` | Decimal |
| 25 | `modifier` | 修改人 | `modifier` | String |
| 26 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 27 | `oriTaxMny` | 原币税额 | `ori_tax_mny` | Decimal |
| 28 | `pubts` | 时间戳 | `pubts` | DateTime |
| 29 | `roundingId` | 舍入规则 | `rounding_id` | String |
| 30 | `sourceBusiObj` | 上游业务对象 | `source_busi_obj` | String |
| 31 | `sourceId` | 上游单据id | `source_id` | String |
| 32 | `sourcechildId` | 上游单据子表id | `sourcechild_id` | 52035a4f-aa8a-4ec4-8b75-858a5396cca4 |
| 33 | `taxBaseAmt` | 税基 | `tax_base_amt` | Decimal |
| 34 | `taxBureauArchiveId` | 税制 | `tax_bureau_archive_id` | d910183c-a1c4-48b2-8bc4-0b9f1dda6eb8 |
| 35 | `taxCategoryArchiveId` | 税种 | `tax_category_archive_id` | 01a37978-70b8-4e8c-83d7-3a9b79d84917 |
| 36 | `taxCodeId` | 税码 | `tax_code_id` | 3f7c3856-5b00-4506-b458-a64eed0d3bfb |
| 37 | `taxItemId` | 税目 | `tax_item_id` | 0eea81a1-2a5f-4f44-af40-c1da88b6edde |
| 38 | `taxrateId` | 税率 | `taxrate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 39 | `taxrateQty` | 税率值 | `taxrate_qty` | Decimal |
| 40 | `totDeductMny` | 累计减免金额(明细汇总) | `tot_deduct_mny` | Decimal |
| 41 | `totDeductTaxMny` | 累计减免税额(明细汇总) | `tot_deduct_tax_mny` | Decimal |
| 42 | `unitId` | 计税单位 | `unit_id` | Long |
| 43 | `withHoldRemit` | 是否代扣代缴 | `with_hold_remit` | String |
| 44 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（13个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `localCurrencyId` | 本币 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `taxBureauArchiveId` | 税制 | `archive.taxArchives.TaxBureauArchive` | Service |  |
| 4 | `taxCategoryArchiveId` | 税种 | `archive.taxArchives.TaxCategoryArchive` | Service |  |
| 5 | `taxCodeId` | 税码 | `taxpubdoc.taxengine.TaxCode` | Service |  |
| 6 | `calcCurrencyId` | 计税币种 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 7 | `TaxResultDetailList` | 计税结果明细 | `sourcing.ibuyoffer.TaxCalculationResultDetail` | None | true |
| 8 | `calculationComponentId` | 计税组件id | `taxpubdoc.taxengine.TaxCalculationComponent` | Service |  |
| 9 | `calculationInputBid` | 计税输入明细id | `taxpubdoc.taxengine.TaxCalculationInputDetail` | Service |  |
| 10 | `taxrateId` | 税率 | `archive.taxArchives.TaxRateArchive` | Service |  |
| 11 | `sourcechildId` | 上游单据子表id | `sourcing.ibuyoffer.CpuPriceQuotationOfferDetail` | None | true |
| 12 | `currencyId` | 原币 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 13 | `taxItemId` | 税目 | `taxpubdoc.taxpubdoc.TaxItem` | Service |  |
