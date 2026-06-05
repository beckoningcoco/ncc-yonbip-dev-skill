---
tags: ["BIP", "元数据", "数据字典", "OSM", "osm.OSMOrder.TaxCalculationResult"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 计税结果 (`osm.OSMOrder.TaxCalculationResult`)

> OSM | 物理表：`tax_calc_result`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计税结果 |
| 物理表 | `tax_calc_result` |
| 数据库 schema | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:57:57.3080` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | 主键 |

---

## 直接属性（44个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `TaxResultDetailList` | 计税结果明细 | `` | 579c26cd-3d78-4876-acc8-7aa4ad0d81a8 |
| 2 | `calcCurrencyId` | 计算币种 | `calc_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 3 | `calcMny` | 计税金额 | `calc_mny` | Decimal |
| 4 | `calcQty` | 计税数量 | `calc_qty` | Decimal |
| 5 | `calcTaxMny` | 计算税额 | `calc_tax_mny` | Decimal |
| 6 | `calculationComponentFormula` | 计税组件表达式 | `calculation_component_formula` | String |
| 7 | `calculationComponentId` | 计税组件id | `calculation_component_id` | f30c18c7-70b9-4933-a20f-0447c0f7eb26 |
| 8 | `calculationInputBid` | 计税输入明细id | `calculation_input_bid` | 002f1c0c-815d-4afd-a93e-446e31a5abc9 |
| 9 | `calculationInputId` | 计税输入id | `calculation_input_id` | bce8f91c-16fa-4e46-99b9-47cd0e4a5f89 |
| 10 | `createTime` | 创建时间 | `create_time` | DateTime |
| 11 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 12 | `currType` | 计税币种 | `curr_type` | String |
| 13 | `currencyId` | 原币 | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 14 | `deductTaxrateQty` | 减免税率值 | `deduct_taxrate_qty` | Decimal |
| 15 | `deductionType` | 抵扣类型 | `deduction_type` | fac5ac11-815b-47d3-ba4f-5cd47ff97c2e |
| 16 | `dr` | 逻辑删除标记 | `dr` | Short |
| 17 | `exchangeRate` | 汇率 | `exchange_rate` | Decimal |
| 18 | `exchangeRateMethod` | 汇率换算方式 | `exchange_rate_method` | String |
| 19 | `finDeductTaxMny` | 最终减免税额 | `fin_deduct_tax_mny` | Decimal |
| 20 | `finTaxMny` | 最终税额 | `fin_tax_mny` | Decimal |
| 21 | `id` | 主键 | `id` | String |
| 22 | `lineAmountMark` | 行金额标识 | `line_amount_mark` | String |
| 23 | `localCurrencyId` | 本币 | `local_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 24 | `localTaxMny` | 本币税额 | `local_tax_mny` | Decimal |
| 25 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 26 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 27 | `oriTaxMny` | 原币税额 | `ori_tax_mny` | Decimal |
| 28 | `pubts` | 时间戳 | `pubts` | DateTime |
| 29 | `roundingId` | 舍入规则 | `rounding_id` | String |
| 30 | `sourceId` | 上游单据id | `source_id` | String |
| 31 | `sourcebusiobj` | 上游业务对象 | `source_busi_obj` | String |
| 32 | `sourcechildId` | 上游单据子表id | `sourcechild_id` | String |
| 33 | `taxBaseAmt` | 税基 | `tax_base_amt` | Decimal |
| 34 | `taxBureauArchiveId` | 税制 | `tax_bureau_archive_id` | d910183c-a1c4-48b2-8bc4-0b9f1dda6eb8 |
| 35 | `taxCategoryArchiveId` | 税种 | `tax_category_archive_id` | 01a37978-70b8-4e8c-83d7-3a9b79d84917 |
| 36 | `taxCodeId` | 税码 | `tax_code_id` | 3f7c3856-5b00-4506-b458-a64eed0d3bfb |
| 37 | `taxItemId` | 税目 | `tax_item_id` | 0eea81a1-2a5f-4f44-af40-c1da88b6edde |
| 38 | `taxrateId` | 税率 | `taxrate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 39 | `taxrateQty` | 税率值 | `taxrate_qty` | Decimal |
| 40 | `totDeductMny` | 累计减免金额(明细汇总) | `tot_deduct_mny` | Decimal |
| 41 | `totDeductTaxMny` | 累计减免税额(明细汇总) | `tot_deduct_tax_mny` | Decimal |
| 42 | `unitId` | 计税单位 | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 43 | `withholdRemit` | 是否代扣代缴 | `with_hold_remit` | String |
| 44 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（17个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `creator` | 创建人 | `base.user.BipUser` | Service |  |
| 2 | `localCurrencyId` | 本币 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `deductionType` | 抵扣类型 | `GZTBDM.taxpubdoc.deductionType` | Service |  |
| 5 | `modifier` | 修改人 | `base.user.BipUser` | Service |  |
| 6 | `taxBureauArchiveId` | 税制 | `archive.taxArchives.TaxBureauArchive` | Service |  |
| 7 | `taxCategoryArchiveId` | 税种 | `archive.taxArchives.TaxCategoryArchive` | Service |  |
| 8 | `taxCodeId` | 税码 | `taxpubdoc.taxengine.TaxCode` | Service |  |
| 9 | `calcCurrencyId` | 计算币种 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 10 | `TaxResultDetailList` | 计税结果明细 | `osm.OSMOrder.TaxCalculationResultDetail` | None | true |
| 11 | `calculationComponentId` | 计税组件id | `taxpubdoc.taxengine.TaxCalculationComponent` | Service |  |
| 12 | `calculationInputBid` | 计税输入明细id | `taxpubdoc.taxengine.TaxCalculationInputDetail` | Service |  |
| 13 | `taxrateId` | 税率 | `archive.taxArchives.TaxRateArchive` | Service |  |
| 14 | `calculationInputId` | 计税输入id | `taxpubdoc.taxengine.TaxCalculationInput` | Service |  |
| 15 | `unitId` | 计税单位 | `pc.unit.Unit` | Service |  |
| 16 | `currencyId` | 原币 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 17 | `taxItemId` | 税目 | `taxpubdoc.taxpubdoc.TaxItem` | Service |  |
