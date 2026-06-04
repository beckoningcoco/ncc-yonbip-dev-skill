---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.scoringdata.ScoringDataMarkMateriel"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 供应商报价明细 (`auction.scoringdata.ScoringDataMarkMateriel`)

> ycSouringAuction | 物理表：`cpu_mark_materiel_fuel`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商报价明细 |
| 物理表 | `cpu_mark_materiel_fuel` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:26:12.9180` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（105个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `mainId` | 报价单 | `main_id` | b1392faa-f850-4468-b4b3-d7f1f85fc4b4 |
| 3 | `enterpriseId` | 租户 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 4 | `biddingId` | 投标供应商 | `bidding_id` | b1e45acc-57ae-4a37-a971-a848cddafaf1 |
| 5 | `orderNo` | 序号(外系统编号) | `order_no` | String |
| 6 | `sequenceNo` | 顺序号 | `sequence_no` | String |
| 7 | `materialId` | 物料表主键 | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 8 | `materialNo` | 物料编码 | `material_no` | String |
| 9 | `materialName` | 物料名称 | `material_name` | String |
| 10 | `biddingDetailId` | 投标报价单 | `bidding_detail_id` | 6f99718a-b71a-4661-9975-b43aed08885a |
| 11 | `taxRateId` | 税率ID | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 12 | `invPriceExchRateDen` | 计价换算率分母 | `inv_price_exch_rate_den` | Decimal |
| 13 | `invPriceExchRateNum` | 计价换算率分子 | `inv_price_exch_rate_num` | Decimal |
| 14 | `invPurExchRateDen` | 采购换算率分母 | `inv_pur_exch_rate_den` | Decimal |
| 15 | `invPurExchRateNum` | 采购换算率分子 | `inv_pur_exch_rate_num` | Decimal |
| 16 | `isBidMaterial` | 物料是否报价 | `is_bid_material` | Integer |
| 17 | `isrecommend` | 成交候选人 | `isRecommend` | Integer |
| 18 | `iswin` | 推荐成交人 | `isWin` | Integer |
| 19 | `lastPriceTime` | 最新报价时间 | `last_price_time` | DateTime |
| 20 | `lawbid_system_id` | 原始主键 | `lawbid_system_id` | Long |
| 21 | `lawbid_system_type` | 原始主键 | `lawbid_system_type` | String |
| 22 | `markId` | 汇总报价单主键 | `mark_id` | b9b3866d-2cbe-45c9-9f62-3833b717d711 |
| 23 | `materialBidStatus` | 定标状态字段 | `material_bid_status` | Integer |
| 24 | `materialSpecification` | 规格 | `material_specification` | String |
| 25 | `multipleCurrentStage` | 招标阶段 | `multiple_current_stage` | Integer |
| 26 | `quotationRanking` | 物料无税报价排名 | `quotation_ranking` | Integer |
| 27 | `rank` | 排名 | `rank` | String |
| 28 | `sectionMaterialId` | 标包物料 | `section_material_id` | d1c773f8-faee-4714-9ef2-044060d8ee18 |
| 29 | `tax` | 税额 | `tax` | Decimal |
| 30 | `taxMark` | 评标税额 | `tax_mark` | Decimal |
| 31 | `taxQuotationRanking` | 物料含税报价排名 | `tax_quotation_ranking` | Integer |
| 32 | `ts` | 时间戳 | `ts` | DateTime |
| 33 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 34 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 35 | `dr` | 逻辑删除标记 | `dr` | Short |
| 36 | `pubts` | 时间戳 | `pubts` | DateTime |
| 37 | `bidSpecification` | 投标规格型号 | `bid_specification` | String |
| 38 | `materialIngredient` | 材质 | `material_ingredient` | String |
| 39 | `materialBrand` | 品牌 | `material_brand` | String |
| 40 | `materialQualifyStandard` | 质量标准 | `material_qualify_standard` | String |
| 41 | `materialDetail` | 物料详细描述 | `material_detail` | String |
| 42 | `materialModel` | 物料型号 | `material_model` | String |
| 43 | `purchaseCount` | 采购数量 | `purchase_count` | Decimal |
| 44 | `currencyId` | 报价币种 | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 45 | `measureUnit` | 计量单位 | `measure_unit` | String |
| 46 | `referPrice` | 参考单价 | `refer_price` | Decimal |
| 47 | `lastPrice` | 上期价格 | `last_price` | Decimal |
| 48 | `highestPrice` | 最高限价 | `highest_price` | Decimal |
| 49 | `bidBottom` | 标底 | `bid_bottom` | Decimal |
| 50 | `planPrice` | 计划价格 | `plan_price` | Decimal |
| 51 | `startDate` | 供货开始时间 | `start_date` | Date |
| 52 | `endDate` | 供货结束时间 | `end_date` | Date |
| 53 | `deliveryPlace` | 交货地点 | `delivery_place` | String |
| 54 | `demandOrg` | 需用单位 | `demand_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 55 | `erpSourceId` | 外系统单据号 | `erp_source_id` | String |
| 56 | `erpSourceBid` | 外系统子单据号 | `erp_source_bid` | String |
| 57 | `notes` | 备注 | `notes` | String |
| 58 | `bidCount` | 投标数量 | `bid_count` | Decimal |
| 59 | `singlePrice` | 不含税单价 | `single_price` | Decimal |
| 60 | `taxSinglePrice` | 含税单价 | `tax_single_price` | Decimal |
| 61 | `totalPrice` | 不含税总价 | `total_price` | Decimal |
| 62 | `taxTotalPrice` | 含税总价 | `tax_total_price` | Decimal |
| 63 | `demandBillId` | 需求明细单 | `demand_bill_id` | d1c773f8-faee-4714-9ef2-044060d8ee18 |
| 64 | `supplydocId` | 供应商 | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 65 | `markCount` | 评标数量 | `mark_count` | Decimal |
| 66 | `markPrice` | 评标不含税单价 | `mark_price` | Decimal |
| 67 | `taxMarkPrice` | 评标含税单价 | `tax_mark_price` | Decimal |
| 68 | `totalMarkPrice` | 评标不含税总价 | `total_mark_price` | Decimal |
| 69 | `taxTotalMarkPrice` | 评标含税总价 | `tax_total_mark_price` | Decimal |
| 70 | `ifHighest` | 是否最高价 | `if_highest` | Integer |
| 71 | `ifLowest` | 是否最低价 | `if_lowest` | Integer |
| 72 | `projectId` | 招标项目 | `project_id` | 94b777ba-4855-4d81-a975-f6ab6b09f9a8 |
| 73 | `bidSectionId` | 标段(包) | `bid_section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 74 | `bidType` | 采购方式 | `bid_type` | String |
| 75 | `qualifyCheckType` | 资格审核方式 | `qualify_check_type` | Integer |
| 76 | `qualifyCheckStep` | 资格审核当前流程阶段 | `qualify_check_step` | Integer |
| 77 | `supEnterpriseId` | 投标人企业 | `bidder_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 78 | `ifcancel` | 是否取消采购 | `ifcancel` | Integer |
| 79 | `priceWay` | 报价方式 | `price_way` | String |
| 80 | `discountPrice` | 折算报价 | `discount_price` | Decimal |
| 81 | `currency` | 币种 | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 82 | `supplyCount` | 保供家数 | `supply_count` | Decimal |
| 83 | `subitem` | 分项 | `subitem` | Integer |
| 84 | `coefficient` | 换算系数 | `coefficient` | Decimal |
| 85 | `discountTotalPrice` | 折算人民币总价 | `discount_total_price` | Decimal |
| 86 | `backup` | 分项备注 | `backup` | String |
| 87 | `uniteBidderId` | 联合体投标人租户 | `unite_bidder_id` | Long |
| 88 | `uniteBidderName` | 联合体投标人名称 | `unite_bidder_name` | String |
| 89 | `lowestPrice` | 最低投标报价 | `lowest_price` | Decimal |
| 90 | `invPurExchRate` | 采购换算率 | `inv_pur_exch_rate` | Decimal |
| 91 | `scoreRound` | 当前评标轮次 | `score_round` | Integer |
| 92 | `invPriceExchRate` | 计价换算率 | `inv_price_exch_rate` | Decimal |
| 93 | `purNum` | 采购数量 | `pur_num` | Decimal |
| 94 | `scoringDataMarkMaterielFreeCharacteristics` | 汇总报价单表体自由项特征组 | `free_characters_id` | 019683e1-c54c-4ea6-825a-5cda3756219e |
| 95 | `scoringDataMarkMaterielDefineCharacter` | 汇总报价单表体自定义项特征 | `define_character_id` | f195a333-df94-42c0-813d-c1ec7baefe33 |
| 96 | `rate` | 投标税率 | `rate` | Decimal |
| 97 | `bidNum` | 投标数量 | `bid_num` | Decimal |
| 98 | `markNum` | 评标数量 | `mark_num` | Decimal |
| 99 | `purUnitId` | 采购单位 | `pur_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 100 | `mainNum` | 主数量 | `main_num` | Decimal |
| 101 | `bidMainNum` | 投标主数量 | `bid_main_num` | Decimal |
| 102 | `markMainNum` | 评标主数量 | `mark_main_num` | Decimal |
| 103 | `mainUnitId` | 主单位 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 104 | `invPurExchRateType` | 采购换算率类型 | `inv_pur_exch_rate_type` | Short |
| 105 | `bodydefine` | 供应商报价明细自定义项 | `` | aa65ae8c-42d4-4855-8da8-788cd4644973 |

---

## 关联属性（22个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `markId` | 汇总报价单主键 | `auction.scoringdata.CpuMark` | None | true |
| 2 | `demandOrg` | 需用单位 | `org.func.BaseOrg` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `purUnitId` | 采购单位 | `pc.unit.Unit` | Service |  |
| 5 | `scoringDataMarkMaterielDefineCharacter` | 汇总报价单表体自定义项特征 | `auction.scoringdata.ScoringDataMarkMaterielDefineCharacter` | None |  |
| 6 | `bodydefine` | 供应商报价明细自定义项 | `auction.scoringdata.ScoringDataMarkMaterielDefine` | None | true |
| 7 | `biddingDetailId` | 投标报价单 | `auction.bid.BiddingMaterialDetailVO` | None |  |
| 8 | `biddingId` | 投标供应商 | `auction.bid.BiddingVO` | None |  |
| 9 | `materialId` | 物料表主键 | `pc.product.Product` | Service |  |
| 10 | `demandBillId` | 需求明细单 | `auction.project.AuctionSectionMaterial` | None |  |
| 11 | `supplydocId` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 12 | `sectionMaterialId` | 标包物料 | `auction.project.AuctionSectionMaterial` | None |  |
| 13 | `supEnterpriseId` | 投标人企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 14 | `currency` | 币种 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 15 | `enterpriseId` | 租户 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 16 | `currencyId` | 报价币种 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 17 | `mainId` | 报价单 | `auction.scoringdata.ScoringDataMark` | None |  |
| 18 | `taxRateId` | 税率ID | `archive.taxArchives.TaxRateArchive` | Service |  |
| 19 | `projectId` | 招标项目 | `auction.project.AuctionProject` | None |  |
| 20 | `scoringDataMarkMaterielFreeCharacteristics` | 汇总报价单表体自由项特征组 | `auction.scoringdata.ScoringDataMarkMaterielFreeCharacters` | None |  |
| 21 | `bidSectionId` | 标段(包) | `auction.project.AuctionSection` | None |  |
| 22 | `mainUnitId` | 主单位 | `pc.unit.Unit` | Service |  |
