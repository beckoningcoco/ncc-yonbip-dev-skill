---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.scoringdata.ScoringDataMarkMateriel"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 汇总报价物料表体 (`lawbid.scoringdata.ScoringDataMarkMateriel`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_mark_materiel_fuel`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 汇总报价物料表体 |
| 物理表 | `cpu_mark_materiel_fuel` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:02:50.3630` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

## 部署信息

- 部署时间: 2026-05-22 23:55:03:000

## 依赖接口（3个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（123个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `scoringDataMarkMaterielFreeCharacteristics` | 汇总报价单表体自由项特征组 | `free_characters_id` | ddd653aa-1728-4c88-80c1-bbb61905fd49 |
| 2 | `scoringDataMarkMaterielDefineCharacter` | 汇总报价单表体自定义项 | `define_character_id` | 2ec06534-559c-498f-bee9-c1ece0381e93 |
| 3 | `dimensionPricingId` | 报价ID | `dimension_pricing_id` | efd1e4c5-9da5-490b-acfc-9b097f70f890 |
| 4 | `biddingDetailId` | 投标报价单 | `bidding_detail_id` | 102df149-dc26-44a9-8fbe-02be312d8a34 |
| 5 | `costQuoteGroupId` | 成本项报价组id | `cost_quote_group_id` | 2b728cc3-82ca-4e8f-8b98-49f9f1df7acd |
| 6 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short |
| 8 | `lawbid_system_id` | 原始主键 | `lawbid_system_id` | Long |
| 9 | `lawbid_system_type` | 原始主键 | `lawbid_system_type` | String |
| 10 | `materialId` | 物料 | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 11 | `multipleCurrentStage` | 招标阶段 | `multiple_current_stage` | Integer |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime |
| 13 | `taxRateId` | 税率ID | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 14 | `invPriceExchRateDen` | 计价换算率分母 | `inv_price_exch_rate_den` | Decimal |
| 15 | `invPriceExchRateNum` | 计价换算率分子 | `inv_price_exch_rate_num` | Decimal |
| 16 | `invPurExchRateDen` | 采购换算率分母 | `inv_pur_exch_rate_den` | Decimal |
| 17 | `invPurExchRateNum` | 采购换算率分子 | `inv_pur_exch_rate_num` | Decimal |
| 18 | `sectionMaterialId` | 标包物料 | `section_material_id` | 3fe14cdc-d32f-4161-80ad-994d5f6c57e3 |
| 19 | `recommendStatus` | 供应商淘汰状态 | `recommend_status` | Integer |
| 20 | `markId` | 汇总报价单主键 | `mark_id` | 0d8c335a-8f53-4e4c-86f3-6a93455e5d20 |
| 21 | `purNum` | 采购数量 | `pur_num` | Decimal |
| 22 | `bidNum` | 投标数量 | `bid_num` | Decimal |
| 23 | `markNum` | 评标数量 | `mark_num` | Decimal |
| 24 | `purUnitId` | 采购单位 | `pur_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 25 | `mainNum` | 主数量 | `main_num` | Decimal |
| 26 | `bidMainNum` | 投标主数量 | `bid_main_num` | Decimal |
| 27 | `markMainNum` | 评标主数量 | `mark_main_num` | Decimal |
| 28 | `mainUnitId` | 主单位 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 29 | `invPurExchRate` | 采购换算率 | `inv_pur_exch_rate` | Decimal |
| 30 | `invPriceExchRate` | 计价换算率 | `inv_price_exch_rate` | Decimal |
| 31 | `invPurExchRateType` | 采购换算率类型 | `inv_pur_exch_rate_type` | Short |
| 32 | `stepSeq` | 当前分步开标阶段 | `step_seq` | Integer |
| 33 | `conversionSinglePrice` | 换算后不含税单价 | `conversion_single_price` | Decimal |
| 34 | `conversionTaxSinglePrice` | 换算后含税单价 | `conversion_tax_single_price` | Decimal |
| 35 | `conversionTotalPrice` | 换算后不含税总价 | `conversion_total_price` | Decimal |
| 36 | `conversionTaxTotalPrice` | 换算后含税总价 | `conversion_tax_total_price` | Decimal |
| 37 | `openRateTime` | 开标汇率日期 | `open_rate_time` | DateTime |
| 38 | `tax` | 税额 | `tax` | Decimal |
| 39 | `taxMark` | 评标税额 | `tax_mark` | Decimal |
| 40 | `conversionTaxTotal` | 换算后税额总价 | `conversion_tax_total` | Decimal |
| 41 | `lastPriceTime` | 最新报价时间 | `last_price_time` | DateTime |
| 42 | `noTaxLastPrice` | 上期成交价无税单价 | `no_tax_last_price` | Decimal |
| 43 | `historyLowestPrice` | 历史最低价含税单价 | `history_lowest_price` | Decimal |
| 44 | `noTaxLowestPrice` | 历史最低价无税单价 | `no_tax_lowest_price` | Decimal |
| 45 | `pricePoints` | 价格分% | `price_points` | Decimal |
| 46 | `priceWeighted` | 价格加权分 | `price_weighted` | Decimal |
| 47 | `totalScore` | 总分 | `total_score` | Decimal |
| 48 | `rank` | 排名 | `rank` | String |
| 49 | `iswin` | 推荐成交人 | `isWin` | Integer |
| 50 | `isrecommend` | 成交候选人 | `isRecommend` | Integer |
| 51 | `openRateValueOps` | 开标汇率折算方式 | `open_rate_value_ops` | ExchangeRateMethod |
| 52 | `ts` | 时间戳 | `ts` | DateTime |
| 53 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 54 | `id` | ID | `id` | Long |
| 55 | `mainId` | 报价单 | `main_id` | d7ba184f-30df-4eb9-a0d9-91c375b93db8 |
| 56 | `enterpriseId` | 租户 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 57 | `biddingId` | 投标供应商 | `bidding_id` | 560d390c-4459-4448-8e73-f6ce26a04dba |
| 58 | `orderNo` | 序号(外系统编号) | `order_no` | String |
| 59 | `sequenceNo` | 顺序号 | `sequence_no` | String |
| 60 | `materialNo` | 物料编码 | `material_no` | String |
| 61 | `materialName` | 物料名称 | `material_name` | String |
| 62 | `materialSpecification` | 规格 | `material_specification` | String |
| 63 | `bidSpecification` | 投标规格型号 | `bid_specification` | String |
| 64 | `currencyId` | 报价币种 | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 65 | `materialIngredient` | 材质 | `material_ingredient` | String |
| 66 | `openRateValue` | 开标汇率值 | `open_rate_value` | Decimal |
| 67 | `materialBrand` | 品牌 | `material_brand` | String |
| 68 | `materialQualifyStandard` | 质量标准 | `material_qualify_standard` | String |
| 69 | `materialDetail` | 物料详细描述 | `material_detail` | String |
| 70 | `materialModel` | 物料型号 | `material_model` | String |
| 71 | `purchaseCount` | 采购数量 | `purchase_count` | Decimal |
| 72 | `measureUnit` | 计量单位 | `measure_unit` | String |
| 73 | `referPrice` | 参考单价 | `refer_price` | Decimal |
| 74 | `lastPrice` | 上期价格 | `last_price` | Decimal |
| 75 | `highestPrice` | 最高限价 | `highest_price` | Decimal |
| 76 | `bidBottom` | 标底 | `bid_bottom` | Decimal |
| 77 | `planPrice` | 计划价格 | `plan_price` | Decimal |
| 78 | `startDate` | 供货开始时间 | `start_date` | Date |
| 79 | `endDate` | 供货结束时间 | `end_date` | Date |
| 80 | `deliveryPlace` | 交货地点 | `delivery_place` | String |
| 81 | `demandOrg` | 需用单位 | `demand_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 82 | `erpSourceId` | 外系统单据号 | `erp_source_id` | String |
| 83 | `erpSourceBid` | 外系统子单据号 | `erp_source_bid` | String |
| 84 | `notes` | 备注 | `notes` | String |
| 85 | `bidCount` | 投标数量 | `bid_count` | Decimal |
| 86 | `singlePrice` | 不含税单价 | `single_price` | Decimal |
| 87 | `taxSinglePrice` | 含税单价 | `tax_single_price` | Decimal |
| 88 | `totalPrice` | 不含税总价 | `total_price` | Decimal |
| 89 | `taxTotalPrice` | 含税总价 | `tax_total_price` | Decimal |
| 90 | `demandBillId` | 需求明细单 | `demand_bill_id` | 3fe14cdc-d32f-4161-80ad-994d5f6c57e3 |
| 91 | `supplydocId` | 供应商 | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 92 | `markCount` | 评标数量 | `mark_count` | Decimal |
| 93 | `markPrice` | 评标不含税单价 | `mark_price` | Decimal |
| 94 | `taxMarkPrice` | 评标含税单价 | `tax_mark_price` | Decimal |
| 95 | `totalMarkPrice` | 评标不含税总价 | `total_mark_price` | Decimal |
| 96 | `taxTotalMarkPrice` | 评标含税总价 | `tax_total_mark_price` | Decimal |
| 97 | `ifHighest` | 是否最高价 | `if_highest` | Integer |
| 98 | `ifLowest` | 是否最低价 | `if_lowest` | Integer |
| 99 | `projectId` | 招标项目 | `project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 100 | `isBidMaterial` | 物料是否报价 | `is_bid_material` | Integer |
| 101 | `bidSectionId` | 标段(包) | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 102 | `bidType` | 采购方式 | `bid_type` | String |
| 103 | `qualifyCheckType` | 资格审核方式 | `qualify_check_type` | Integer |
| 104 | `qualifyCheckStep` | 资格审核当前流程阶段 | `qualify_check_step` | Integer |
| 105 | `rowNo` | 行号 | `row_no` | Decimal |
| 106 | `supEnterpriseId` | 投标人企业 | `bidder_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 107 | `ifcancel` | 是否取消采购 | `ifcancel` | Integer |
| 108 | `priceWay` | 报价方式 | `price_way` | String |
| 109 | `discountPrice` | 折算报价 | `discount_price` | Decimal |
| 110 | `currency` | 币种 | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 111 | `supplyCount` | 保供家数 | `supply_count` | Decimal |
| 112 | `subitem` | 分项 | `subitem` | Integer |
| 113 | `coefficient` | 换算系数 | `coefficient` | Decimal |
| 114 | `discountTotalPrice` | 折算人民币总价 | `discount_total_price` | Decimal |
| 115 | `backup` | 分项备注 | `backup` | String |
| 116 | `uniteBidderId` | 联合体投标人租户 | `unite_bidder_id` | Long |
| 117 | `uniteBidderName` | 联合体投标人名称 | `unite_bidder_name` | String |
| 118 | `lowestPrice` | 最低投标报价 | `lowest_price` | Decimal |
| 119 | `scoreRound` | 当前评标轮次 | `score_round` | Integer |
| 120 | `scoringGroupId` | 评标组主键 | `scoring_group_id` | bd52c08b-9c24-45c6-b5ba-6209956c1411 |
| 121 | `rate` | 投标税率 | `rate` | Decimal |
| 122 | `bodydefine` | 汇总报价物料表体自定义项 | `` | 2c6ac402-1923-4487-8f82-6aabc1722dbd |
| 123 | `steps` | 汇总报价单物料价格梯度明细 | `` | 1ffb0365-ed48-47b6-acbd-b38f5f1f4c6e |

---

## 关联属性（26个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `markId` | 汇总报价单主键 | `lawbid.scoringdata.CpuMark` | None | true |
| 2 | `demandOrg` | 需用单位 | `org.func.BaseOrg` | Service |  |
| 3 | `purUnitId` | 采购单位 | `pc.unit.Unit` | Service |  |
| 4 | `scoringDataMarkMaterielDefineCharacter` | 汇总报价单表体自定义项 | `lawbid.scoringdata.ScoringDataMarkMaterielDefineCharacter` | None |  |
| 5 | `currency` | 币种 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 6 | `currencyId` | 报价币种 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 7 | `taxRateId` | 税率ID | `archive.taxArchives.TaxRateArchive` | Service |  |
| 8 | `bidSectionId` | 标段(包) | `lawbid.section.LawbidSection` | None |  |
| 9 | `mainUnitId` | 主单位 | `pc.unit.Unit` | Service |  |
| 10 | `costQuoteGroupId` | 成本项报价组id | `aa.costquote.CpuCostPricing` | Service |  |
| 11 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 12 | `bodydefine` | 汇总报价物料表体自定义项 | `lawbid.scoringdata.ScoringDataMarkMaterielDefine` | None | true |
| 13 | `biddingDetailId` | 投标报价单 | `lawbid.bid.BiddingMaterialDetailVO` | None |  |
| 14 | `biddingId` | 投标供应商 | `lawbid.bid.BiddingVO` | None |  |
| 15 | `scoringGroupId` | 评标组主键 | `lawbid.scoringgroup.ScoringGroupVO` | None |  |
| 16 | `materialId` | 物料 | `pc.product.Product` | Service |  |
| 17 | `steps` | 汇总报价单物料价格梯度明细 | `lawbid.scoringdata.MarkMaterialStep` | None | true |
| 18 | `dimensionPricingId` | 报价ID | `aa.quotation.BiQuotationHead` | Service |  |
| 19 | `demandBillId` | 需求明细单 | `lawbid.section.LawbidSectionMaterial` | None |  |
| 20 | `supplydocId` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 21 | `sectionMaterialId` | 标包物料 | `lawbid.section.LawbidSectionMaterial` | None |  |
| 22 | `supEnterpriseId` | 投标人企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 23 | `enterpriseId` | 租户 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 24 | `mainId` | 报价单 | `lawbid.scoringdata.ScoringDataMark` | None |  |
| 25 | `projectId` | 招标项目 | `lawbid.project.LawbidProject` | None |  |
| 26 | `scoringDataMarkMaterielFreeCharacteristics` | 汇总报价单表体自由项特征组 | `lawbid.scoringdata.ScoringDataMarkMaterielFreeCharacters` | None |  |
