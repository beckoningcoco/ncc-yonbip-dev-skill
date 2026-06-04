---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.talks.ClarifyMaterialOfferVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 价格谈判回复表体 (`lawbid.talks.ClarifyMaterialOfferVO`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_clarify_material`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 价格谈判回复表体 |
| 物理表 | `cpu_clarify_material` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:03:08.7200` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 报价明细 |

## 部署信息

- 部署时间: 2026-05-22 23:54:59:000

---

## 直接属性（73个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bidAmount` | 投标计价数量 | `bid_amount` | Decimal |
| 2 | `bidClarifyBidderId` | 谈判供应商 | `bid_clarify_bidder_id` | 3302bb43-825d-497a-8190-4c944ec8f7d3 |
| 3 | `bidClarifyId` | 谈判单 | `bid_clarify_id` | Long |
| 4 | `bidCount` | 上次投标计价数量 | `bid_count` | Decimal |
| 5 | `bidMainCount` | 投标主数量 | `bid_main_count` | Decimal |
| 6 | `bidNum` | 投标数量 | `bid_num` | Decimal |
| 7 | `brand` | 商标品牌 | `brand` | String |
| 8 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 9 | `clarifyMaterialId` | 物料表 | `clarify_material_id` | 191cbf46-5b2f-4c83-90fa-1d21d452dc3f |
| 10 | `consignationId` | 委托单 | `consignation_id` | Long |
| 11 | `costQuoteGroupId` | 成本项报价组id | `cost_quote_group_id` | 2b728cc3-82ca-4e8f-8b98-49f9f1df7acd |
| 12 | `cpuClarifyMaterialDefineCharacter` | 谈判磋商价格谈判回复表体自定义项 | `define_character_id` | 9b7fe5e6-04dd-4248-a4ec-430a8a7afb6b |
| 13 | `cpuClarifyMaterialFreeCharacteristics` | 谈判磋商价格谈判回复表体自由项特征组 | `free_characters_id` | 41e85682-4c56-4b89-b0b4-a9ab4c76be3b |
| 14 | `currencyId` | 投标币种 | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 15 | `deliveryAddress` | 交货地址 | `delivery_address` | String |
| 16 | `dimensionPricingId` | 报价ID | `dimension_pricing_id` | efd1e4c5-9da5-490b-acfc-9b097f70f890 |
| 17 | `dr` | 逻辑删除标记 | `dr` | Short |
| 18 | `endTime` | 结束时间 | `end_time` | Date |
| 19 | `enterpriseId` | 委托单 | `enterprise_id` | Long |
| 20 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 21 | `files` | 附件 | `files` | String |
| 22 | `guidePrice` | 谈判指导价 | `guide_price` | Decimal |
| 23 | `id` | 报价明细 | `id` | Long |
| 24 | `invPriceExchRate` | 计价换算率 | `inv_price_exch_rate` | Decimal |
| 25 | `invPriceExchRateDen` | 计价换算率分母 | `inv_price_exch_rate_den` | Decimal |
| 26 | `invPriceExchRateNum` | 计价换算率分子 | `inv_price_exch_rate_num` | Decimal |
| 27 | `invPurExchRate` | 采购换算率 | `inv_pur_exch_rate` | Decimal |
| 28 | `invPurExchRateDen` | 采购换算率分母 | `inv_pur_exch_rate_den` | Decimal |
| 29 | `invPurExchRateNum` | 采购换算率分子 | `inv_pur_exch_rate_num` | Decimal |
| 30 | `invPurExchRateType` | 采购换算率类型 | `inv_pur_exch_rate_type` | Short |
| 31 | `lastBidCount` | 上次投标数量 | `last_bid_count` | Decimal |
| 32 | `lastRoundRank` | 上一次投标排名 | `last_round_rank` | Integer |
| 33 | `lastTaxTotalPrices` | 上一次投标含税金额 | `last_tax_total_prices` | Decimal |
| 34 | `lastTotalPrices` | 上一次投标无税金额 | `last_total_prices` | Decimal |
| 35 | `mainCount` | 主数量 | `main_count` | Decimal |
| 36 | `mainUnitId` | 主单位 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 37 | `materialDetailId` | 标包物料 | `material_detail_id` | 3fe14cdc-d32f-4161-80ad-994d5f6c57e3 |
| 38 | `materialExplain` | 物料描述 | `material_explain` | String |
| 39 | `materialId` | 物料档案 | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 40 | `materialName` | 物料名称 | `material_name` | String |
| 41 | `materialNo` | 物料编码 | `material_no` | String |
| 42 | `materialSpecification` | 规格型号 | `material_specification` | String |
| 43 | `maximumPrice` | 最高限价 | `maximum_price` | Decimal |
| 44 | `measureUnit` | 采购计价单位 | `measure_unit` | String |
| 45 | `notaxPrice` | 投标无税单价 | `notax_price` | Decimal |
| 46 | `openRateValue` | 开标汇率值 | `open_rate_value` | Decimal |
| 47 | `openRateValueOps` | 开标汇率折算方式 | `open_rate_value_ops` | ExchangeRateMethod |
| 48 | `originRate` | 上次税率 | `origin_rate` | Decimal |
| 49 | `priceHigh` | 最高限价 | `price_high` | Integer |
| 50 | `pubts` | 时间戳 | `pubts` | DateTime |
| 51 | `purCount` | 采购数量 | `pur_count` | Decimal |
| 52 | `purUnitId` | 采购单位 | `pur_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 53 | `purchaseCount` | 采购计价数量 | `purchase_count` | Decimal |
| 54 | `rate` | 税率(%) | `rate` | Decimal |
| 55 | `remark` | 备注 | `remark` | String |
| 56 | `rowNo` | 行号 | `row_no` | Decimal |
| 57 | `singlePrice` | 上次投标无税单价 | `single_price` | Decimal |
| 58 | `specificationModel` | 规格型号 | `specification_model` | String |
| 59 | `startTime` | 供货开始时间 | `start_time` | Date |
| 60 | `stepSize` | 报价步长 | `step_size` | Decimal |
| 61 | `supEnterpriseId` | 供应商企业 | `bidder_id` | Long |
| 62 | `supEnterpriseName` | 供应商企业名称 | `bidder_name` | String |
| 63 | `tax` | 税额 | `tax` | Decimal |
| 64 | `taxPrice` | 投标含税单价 | `tax_price` | Decimal |
| 65 | `taxRateId` | 税率ID | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 66 | `taxSinglePrice` | 上次投标含税单价 | `tax_single_price` | Decimal |
| 67 | `taxTotalPrices` | 投标含税总价 | `tax_total_prices` | Decimal |
| 68 | `texture` | 质材 | `texture` | String |
| 69 | `totalPrices` | 投标无税总价 | `total_prices` | Decimal |
| 70 | `ts` | 时间戳 | `ts` | DateTime |
| 71 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 72 | `whithUnit` | 需用单位 | `whith_unit` | String |
| 73 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（13个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `cpuClarifyMaterialFreeCharacteristics` | 谈判磋商价格谈判回复表体自由项特征组 | `lawbid.talkResponse.CpuClarifyMaterialFreeCharacteristics` | None |  |
| 2 | `clarifyMaterialId` | 物料表 | `lawbid.talks.ClarifyBidderDetailMaterialVO` | None |  |
| 3 | `costQuoteGroupId` | 成本项报价组id | `aa.costquote.CpuCostPricing` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `purUnitId` | 采购单位 | `pc.unit.Unit` | Service |  |
| 6 | `bidClarifyBidderId` | 谈判供应商 | `lawbid.talkResponse.ClarifyBidderVO` | None |  |
| 7 | `materialId` | 物料档案 | `pc.product.Product` | Service |  |
| 8 | `cpuClarifyMaterialDefineCharacter` | 谈判磋商价格谈判回复表体自定义项 | `lawbid.talkResponse.CpuClarifyMaterialDefineCharacter` | None |  |
| 9 | `dimensionPricingId` | 报价ID | `aa.quotation.BiQuotationHead` | Service |  |
| 10 | `materialDetailId` | 标包物料 | `lawbid.section.LawbidSectionMaterial` | None |  |
| 11 | `currencyId` | 投标币种 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 12 | `taxRateId` | 税率ID | `archive.taxArchives.TaxRateArchive` | Service |  |
| 13 | `mainUnitId` | 主单位 | `pc.unit.Unit` | Service |  |
