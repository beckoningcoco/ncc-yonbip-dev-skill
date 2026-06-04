---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.decisionprice.CpuPriceMaterialDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 比价物料子表 (`lawbid.decisionprice.CpuPriceMaterialDetail`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_price_material_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 比价物料子表 |
| 物理表 | `cpu_price_material_detail` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:00:19.4020` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2026-05-22 23:55:02:000

## 依赖接口（5个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 比价物质表接口 | `lawdecision.itf.ICpuPriceMaterialDetail` | 477 |
| 2 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 3 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 4 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 5 | 企业ID | `cpu.itf.IEnterprise` | 6 |

---

## 直接属性（130个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 2 | `decisionId` | 外键 | `decision_id` | Long |
| 3 | `dr` | 删除标识 | `dr` | Integer |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime |
| 5 | `reqId` | 采购需求主键 | `req_id` | bac52eb7-97d5-4c52-8a52-cc1d9bf96c66 |
| 6 | `priceCandidateId` | 拟中标供应商 | `price_candidate_id` | 84865df5-c553-4d21-b059-289978f0954e |
| 7 | `rowNo` | 行号 | `row_no` | Decimal |
| 8 | `cpuPriceMaterialDetailFreeCharacteristics` | 比价物料明细表自由项特征组 | `cpu_price_material_detail_free_characteristics` | c6441a95-5acb-47d1-8047-e98d12cfa064 |
| 9 | `cpuPriceMaterialDetailDefineCharacter` | 比价物料明细表表体自定义项 | `cpu_price_material_detail_define_character` | 18a0ea20-036c-4aac-9620-fddc1084f4d7 |
| 10 | `materialSpecification` | 规格 | `material_specification` | String |
| 11 | `highestPrice` | 最高限价 | `highest_price` | Decimal |
| 12 | `materialDetail` | 需求描述 | `material_detail` | String |
| 13 | `totalScore` | 总分 | `total_score` | Decimal |
| 14 | `taxRateId` | 税率ID | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 15 | `winTaxRateId` | 税率ID | `win_tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 16 | `invPriceExchRateDen` | 计价换算率分母 | `inv_price_exch_rate_den` | Decimal |
| 17 | `invPriceExchRateNum` | 计价换算率分子 | `inv_price_exch_rate_num` | Decimal |
| 18 | `invPurExchRateDen` | 采购换算率分母 | `inv_pur_exch_rate_den` | Decimal |
| 19 | `invPurExchRateNum` | 采购换算率分子 | `inv_pur_exch_rate_num` | Decimal |
| 20 | `materialClassId` | 物料分类主键 | `material_class_id` | Long |
| 21 | `openRateValueOps` | 开标汇率折算方式 | `open_rate_value_ops` | ExchangeRateMethod |
| 22 | `materialClassName` | 物料分类名称 | `material_class_name` | String |
| 23 | `reqOrgName` | 需求组织名称 | `req_org_name` | String |
| 24 | `reqTime` | 需求日期 | `req_time` | Date |
| 25 | `materialNo` | 工程编码 | `material_no` | String |
| 26 | `bidTax` | 投标税额 | `bid_tax` | Decimal |
| 27 | `winTax` | 中标税额 | `win_tax` | Decimal |
| 28 | `conversionWinTax` | 换算后中标税额 | `conversion_win_tax` | Decimal |
| 29 | `materialModel` | 物料型号 | `material_model` | String |
| 30 | `totalWinPrice` | 中标无税金额 | `total_win_price` | Decimal |
| 31 | `taxTotalWinPrice` | 中标含税金额 | `tax_total_win_price` | Decimal |
| 32 | `supplydocName` | 拟中标供应商 | `supplydoc_name` | String |
| 33 | `supEnterpriseName` | 供应商企业名称 | `sup_enterprise_name` | String |
| 34 | `ranking` | 物料报价排名 | `ranking` | Integer |
| 35 | `quotationRanking` | 物料无税报价排名 | `quotation_ranking` | Integer |
| 36 | `taxQuotationRanking` | 物料含税报价排名 | `tax_quotation_ranking` | Integer |
| 37 | `reqOrgId` | 需求组织主键 | `req_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 38 | `receiveAddress` | 收货地址 | `receive_address` | String |
| 39 | `materialName` | 工程名称 | `material_name` | String |
| 40 | `dimensionPricingId` | 报价ID | `dimension_pricing_id` | efd1e4c5-9da5-490b-acfc-9b097f70f890 |
| 41 | `ts` | 时间戳 | `ts` | DateTime |
| 42 | `ytenant` | 租户 | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 43 | `id` | id | `id` | Long |
| 44 | `demandBillId` | 标段物料主键 | `demand_bill_id` | 3fe14cdc-d32f-4161-80ad-994d5f6c57e3 |
| 45 | `ifcancel` | 物料状态 | `ifcancel` | Integer |
| 46 | `materialId` | 物料id | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 47 | `enterpriseId` | 企业 | `enterprise_id` | Long |
| 48 | `costQuoteGroupId` | 成本项报价组id | `cost_quote_group_id` | 2b728cc3-82ca-4e8f-8b98-49f9f1df7acd |
| 49 | `consignationId` | 委托单主键 | `consignation_id` | Long |
| 50 | `materialBrand` | 物料品牌 | `material_brand` | String |
| 51 | `materialQualifyStandard` | 质量要求 | `material_qualify_standard` | String |
| 52 | `bidProjectId` | 招标项目主键 | `bid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 53 | `orderNo` | 序号 | `order_no` | String |
| 54 | `purchaseCount` | 采购数量 | `purchase_count` | Decimal |
| 55 | `demandOrg` | 需求组织 | `demand_org` | String |
| 56 | `purchaseSolutionNo` | 采购方案号 | `purchase_solution_no` | String |
| 57 | `sequenceNo` | 顺序号 | `sequence_no` | String |
| 58 | `bidNum` | 投标数量 | `bid_num` | Decimal |
| 59 | `taxBidPrice` | 投标含税单价 | `tax_bid_price` | Decimal |
| 60 | `rate` | 投标税率(%) | `rate` | Decimal |
| 61 | `materialIngredient` | 材质 | `material_ingredient` | String |
| 62 | `bidPrice` | 投标无税单价 | `bid_price` | Decimal |
| 63 | `bidSectionId` | 标段(包)编号id | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 64 | `winNum` | 中标数量 | `win_num` | Decimal |
| 65 | `purCategory` | 采购类别 | `pur_category` | String |
| 66 | `taxWinPrice` | 中标含税单价 | `tax_win_price` | Decimal |
| 67 | `discountTotalPrice` | 中标金额 | `discount_total_price` | Decimal |
| 68 | `failBidCause` | 流标原因 | `fail_bid_cause` | String |
| 69 | `winRate` | 中标税率(%) | `win_rate` | Decimal |
| 70 | `release` | 流标释放标识 | `release` | Integer |
| 71 | `measureUnit` | 计量单位 | `measure_unit` | String |
| 72 | `winPrice` | 中标无税单价 | `win_price` | Decimal |
| 73 | `purCount` | 采购数量 | `pur_count` | Decimal |
| 74 | `lastPrice` | 上期价格 | `last_price` | Decimal |
| 75 | `purValCount` | 采购计价数量 | `pur_val_count` | Decimal |
| 76 | `referPrice` | 参考单价 | `refer_price` | Decimal |
| 77 | `mainCount` | 主数量 | `main_count` | Decimal |
| 78 | `bidBottom` | 标底 | `bid_bottom` | Decimal |
| 79 | `planPrice` | 计划价格 | `plan_price` | Decimal |
| 80 | `invPurExchRate` | 采购换算率 | `inv_pur_exch_rate` | Decimal |
| 81 | `recommendCount` | 推荐家数 | `recommend_count` | Decimal |
| 82 | `invPriceExchRate` | 计价换算率 | `inv_price_exch_rate` | Decimal |
| 83 | `supplyCount` | 保供家数 | `supply_count` | Decimal |
| 84 | `startDate` | 开始时间 | `start_date` | Date |
| 85 | `endDate` | 结束时间 | `end_date` | Date |
| 86 | `deliveryPlace` | 交货地点 | `delivery_place` | String |
| 87 | `mainUnitId` | 主单位主键 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 88 | `erpSourceId` | 外系统子表主键 | `erp_source_id` | String |
| 89 | `erpSourceBid` | 外系统子表行主键 | `erp_source_bid` | String |
| 90 | `notes` | 备注 | `notes` | String |
| 91 | `materialDetailId` | 原燃材料需求清单主键 | `material_detail_id` | Long |
| 92 | `lowestPrice` | 最低投标单价 | `lowest_price` | Decimal |
| 93 | `supplydocId` | 拟中标供应商 | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 94 | `recommendReason` | 备注 | `recommend_reason` | String |
| 95 | `supEnterpriseId` | 供应商企业 | `sup_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 96 | `priceId` | 定标单主键 | `price_id` | 43d481da-1475-4536-be5f-09ce6d40dce3 |
| 97 | `winMainCount` | 中标主数量 | `win_main_count` | Decimal |
| 98 | `priceWay` | 报价方式 | `price_way` | String |
| 99 | `purUnitId` | 采购单位主键 | `pur_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 100 | `discountPrice` | 折算报价 | `discount_price` | Decimal |
| 101 | `bidCount` | 投标数量 | `bid_count` | Decimal |
| 102 | `currency` | 币种 | `currency` | String |
| 103 | `winCount` | 中标数量 | `win_count` | Decimal |
| 104 | `subitem` | 分项 | `subitem` | Integer |
| 105 | `bidMainCount` | 投标主数量 | `bid_main_count` | Decimal |
| 106 | `biddingMaterialId` | 投标物料主键 | `bidding_material_id` | 102df149-dc26-44a9-8fbe-02be312d8a34 |
| 107 | `invPurExchRateType` | 采购换算率类型 | `inv_pur_exch_rate_type` | Short |
| 108 | `markMaterialId` | 汇总报价单表体主键 | `mark_material_id` | 8c4341a0-e9a3-4c70-9df2-525171b82f42 |
| 109 | `coefficient` | 换算系数 | `coefficient` | Decimal |
| 110 | `backup` | 分项备注 | `backup` | String |
| 111 | `uniteBidderId` | 联合体投标人租户主键 | `unite_bidder_id` | Long |
| 112 | `uniteBidderName` | 联合体投标人名称 | `unite_bidder_name` | String |
| 113 | `state` | 是否中标 | `state` | Integer |
| 114 | `recentPrice` | 最近价格 | `recent_price` | Decimal |
| 115 | `taxRecentPrice` | 含税最新报价 | `tax_recent_price` | Decimal |
| 116 | `taxTotalPrice` | 投标含税总价 | `tax_total_price` | Decimal |
| 117 | `totalPrice` | 投标无税总价 | `total_price` | Decimal |
| 118 | `isBidMaterial` | 物料是否报价 | `is_bid_material` | Integer |
| 119 | `currencyId` | 报价币种 | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 120 | `openRateValue` | 汇率 | `open_rate_value` | Decimal |
| 121 | `conversionTaxSinglePrice` | 换算后含税单价 | `conversion_tax_single_price` | Decimal |
| 122 | `conversionSinglePrice` | 换算后无税单价 | `conversion_single_price` | Decimal |
| 123 | `openRateTime` | 汇率日期 | `open_rate_time` | DateTime |
| 124 | `conversionTotalPrice` | 换算后无税总价 | `conversion_total_price` | Decimal |
| 125 | `conversionTaxTotalPrice` | 换算后含税总价 | `conversion_tax_total_price` | Decimal |
| 126 | `conversionWinPrice` | 换算后中标无税单价 | `conversion_win_price` | Decimal |
| 127 | `conversionTaxWinPrice` | 换算后中标含税单价 | `conversion_tax_win_price` | Decimal |
| 128 | `conversionTotalWinPrice` | 换算后中标无税总价 | `conversion_total_win_price` | Decimal |
| 129 | `conversionTaxTotalWinPrice` | 换算后中标含税总价 | `conversion_tax_total_win_price` | Decimal |
| 130 | `steps` | 比价单物料价格梯度明细 | `` | 3406d109-eaee-46ff-a728-ffac593a4207 |

---

## 关联属性（23个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `cpuPriceMaterialDetailFreeCharacteristics` | 比价物料明细表自由项特征组 | `lawbid.decisionprice.CpuPriceMaterialDetailFreeCharacteristics` | None |  |
| 2 | `costQuoteGroupId` | 成本项报价组id | `aa.costquote.CpuCostPricing` | Service |  |
| 3 | `ytenant` | 租户 | `yht.tenant.YhtTenant` | Service |  |
| 4 | `purUnitId` | 采购单位主键 | `pc.unit.Unit` | Service |  |
| 5 | `markMaterialId` | 汇总报价单表体主键 | `lawbid.scoringdata.ScoringDataMarkMateriel` | None |  |
| 6 | `materialId` | 物料id | `pc.product.Product` | Service |  |
| 7 | `bidProjectId` | 招标项目主键 | `lawbid.project.LawbidProject` | None |  |
| 8 | `steps` | 比价单物料价格梯度明细 | `lawbid.decisionprice.PriceMaterialStep` | None | true |
| 9 | `dimensionPricingId` | 报价ID | `aa.quotation.BiQuotationHead` | Service |  |
| 10 | `reqId` | 采购需求主键 | `sourcing.pureq.IpuPuReq` | Service |  |
| 11 | `demandBillId` | 标段物料主键 | `lawbid.section.LawbidSectionMaterial` | None |  |
| 12 | `supplydocId` | 拟中标供应商 | `aa.vendor.Vendor` | Service |  |
| 13 | `winTaxRateId` | 税率ID | `archive.taxArchives.TaxRateArchive` | Service |  |
| 14 | `biddingMaterialId` | 投标物料主键 | `lawbid.bid.BiddingMaterialDetailVO` | None |  |
| 15 | `supEnterpriseId` | 供应商企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 16 | `cpuPriceMaterialDetailDefineCharacter` | 比价物料明细表表体自定义项 | `lawbid.decisionprice.CpuPriceMaterialDetailDefineCharacter` | None |  |
| 17 | `priceId` | 定标单主键 | `lawbid.decisionprice.CpuPrice` | None | true |
| 18 | `taxRateId` | 税率ID | `archive.taxArchives.TaxRateArchive` | Service |  |
| 19 | `currencyId` | 报价币种 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 20 | `reqOrgId` | 需求组织主键 | `org.func.BaseOrg` | Service |  |
| 21 | `priceCandidateId` | 拟中标供应商 | `lawbid.decisionprice.CpuPriceCandidate` | None |  |
| 22 | `bidSectionId` | 标段(包)编号id | `lawbid.section.LawbidSection` | None |  |
| 23 | `mainUnitId` | 主单位主键 | `pc.unit.Unit` | Service |  |
