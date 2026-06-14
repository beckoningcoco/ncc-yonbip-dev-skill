---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.decisionprice.CpuPriceMaterialDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 比价物料子表 (`auction.decisionprice.CpuPriceMaterialDetail`)

> ycSouringAuction | 物理表：`cpu_price_material_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 比价物料子表 |
| 物理表 | `cpu_price_material_detail` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:25:09.9400` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（125个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `demandBillId` | 标段物料主键 | `demand_bill_id` | d1c773f8-faee-4714-9ef2-044060d8ee18 |
| 3 | `ifcancel` | 物料状态 | `ifcancel` | Integer |
| 4 | `materialId` | 物料主键 | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 5 | `enterpriseId` | 租户 | `enterprise_id` | Long |
| 6 | `consignationId` | 委托单主键 | `consignation_id` | Long |
| 7 | `ranking` | 物料报价排名 | `ranking` | Integer |
| 8 | `quotationRanking` | 物料无税报价排名 | `quotation_ranking` | Integer |
| 9 | `taxQuotationRanking` | 物料含税报价排名 | `tax_quotation_ranking` | Integer |
| 10 | `cpuPriceMaterialDetailFreeCharacteristics` | 比价物料明细表自由项特征组 | `cpu_price_material_detail_free_characteristics` | a79a4444-a773-4b40-a1fd-e43ad6b38386 |
| 11 | `cpuPriceMaterialDetailDefineCharacter` | 比价物料明细表表体自定义项 | `cpu_price_material_detail_define_character` | cfd7ec53-cace-4842-b37c-3a274d0b2a9a |
| 12 | `ts` | 时间戳 | `ts` | DateTime |
| 13 | `taxRateId` | 税率ID | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 14 | `winTaxRateId` | 税率ID | `win_tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 15 | `invPriceExchRateDen` | 计价换算率分母 | `inv_price_exch_rate_den` | Decimal |
| 16 | `invPriceExchRateNum` | 计价换算率分子 | `inv_price_exch_rate_num` | Decimal |
| 17 | `invPurExchRateDen` | 采购换算率分母 | `inv_pur_exch_rate_den` | Decimal |
| 18 | `invPurExchRateNum` | 采购换算率分子 | `inv_pur_exch_rate_num` | Decimal |
| 19 | `openRateValueOps` | 开标汇率折算方式 | `open_rate_value_ops` | ExchangeRateMethod |
| 20 | `dr` | 逻辑删除标记 | `dr` | Integer |
| 21 | `materialName` | 工程名称 | `material_name` | String |
| 22 | `materialSpecification` | 规格 | `material_specification` | String |
| 23 | `highestPrice` | 最高限价 | `highest_price` | Decimal |
| 24 | `decisionId` | 外键 | `decision_id` | Long |
| 25 | `materialModel` | 物料型号 | `material_model` | String |
| 26 | `materialClassId` | 物料分类主键 | `material_class_id` | Long |
| 27 | `materialClassName` | 物料分类名称 | `material_class_name` | String |
| 28 | `reqOrgId` | 需求公司主键 | `req_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 29 | `reqOrgName` | 需求公司名称 | `req_org_name` | String |
| 30 | `reqTime` | 需求日期 | `req_time` | Date |
| 31 | `receiveAddress` | 收货地址 | `receive_address` | String |
| 32 | `openRateValue` | 开标汇率值 | `open_rate_value` | Decimal |
| 33 | `conversionSinglePrice` | 换算后不含税单价 | `conversion_single_price` | Decimal |
| 34 | `conversionTaxSinglePrice` | 换算后含税单价 | `conversion_tax_single_price` | Decimal |
| 35 | `conversionTotalPrice` | 换算后不含税金额 | `conversion_total_price` | Decimal |
| 36 | `conversionTaxTotalPrice` | 换算后含税金额 | `conversion_tax_total_price` | Decimal |
| 37 | `openRateTime` | 开标汇率日期 | `open_rate_time` | DateTime |
| 38 | `conversionWinPrice` | 换算后中标无税单价 | `conversion_win_price` | Decimal |
| 39 | `conversionTaxWinPrice` | 换算后中标含税单价 | `conversion_tax_win_price` | Decimal |
| 40 | `conversionTotalWinPrice` | 换算后中标无税金额 | `conversion_total_win_price` | Decimal |
| 41 | `conversionTaxTotalWinPrice` | 换算后中标含税金额 | `conversion_tax_total_win_price` | Decimal |
| 42 | `totalWinPrice` | 中标无税金额 | `total_win_price` | Decimal |
| 43 | `taxTotalWinPrice` | 中标含税金额 | `tax_total_win_price` | Decimal |
| 44 | `materialNo` | 工程编码 | `material_no` | String |
| 45 | `bidTax` | 投标税额 | `bid_tax` | Decimal |
| 46 | `winTax` | 中标税额 | `win_tax` | Decimal |
| 47 | `conversionWinTax` | 换算后中标税额 | `conversion_win_tax` | Decimal |
| 48 | `supplydocName` | 拟中标供应商 | `supplydoc_name` | String |
| 49 | `supEnterpriseName` | 供应商企业名称 | `sup_enterprise_name` | String |
| 50 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 51 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 52 | `pubts` | 时间戳 | `pubts` | DateTime |
| 53 | `materialBrand` | 品牌 | `material_brand` | String |
| 54 | `materialQualifyStandard` | 质量要求 | `material_qualify_standard` | String |
| 55 | `bidProjectId` | 项目主键 | `bid_project_id` | 94b777ba-4855-4d81-a975-f6ab6b09f9a8 |
| 56 | `orderNo` | 序号 | `order_no` | String |
| 57 | `purchaseCount` | 数量 | `purchase_count` | Decimal |
| 58 | `demandOrg` | 需求组织 | `demand_org` | String |
| 59 | `purchaseSolutionNo` | 采购方案号 | `purchase_solution_no` | String |
| 60 | `sequenceNo` | 顺序号 | `sequence_no` | String |
| 61 | `materialDetail` | 需求描述 | `material_detail` | String |
| 62 | `bidNum` | 出价数量 | `bid_num` | Decimal |
| 63 | `taxBidPrice` | 出价含税单价 | `tax_bid_price` | Decimal |
| 64 | `rate` | 出价税率(%) | `rate` | Decimal |
| 65 | `materialIngredient` | 材质 | `material_ingredient` | String |
| 66 | `bidPrice` | 出价无税单价 | `bid_price` | Decimal |
| 67 | `bidSectionId` | 标段(包)编号主键 | `bid_section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 68 | `winNum` | 中标数量 | `win_num` | Decimal |
| 69 | `purCategory` | 采购类别 | `pur_category` | String |
| 70 | `state` | 是否中标 | `state` | Integer |
| 71 | `taxWinPrice` | 中标含税单价 | `tax_win_price` | Decimal |
| 72 | `discountTotalPrice` | 中标金额 | `discount_total_price` | Decimal |
| 73 | `winRate` | 中标税率(%) | `win_rate` | Decimal |
| 74 | `measureUnit` | 计量单位 | `measure_unit` | String |
| 75 | `failBidCause` | 流标原因 | `fail_bid_cause` | String |
| 76 | `winPrice` | 中标无税单价 | `win_price` | Decimal |
| 77 | `release` | 流标释放标识 | `release` | Integer |
| 78 | `lastPrice` | 上期价格 | `last_price` | Decimal |
| 79 | `referPrice` | 参考单价 | `refer_price` | Decimal |
| 80 | `bidBottom` | 标底 | `bid_bottom` | Decimal |
| 81 | `planPrice` | 计划价格 | `plan_price` | Decimal |
| 82 | `recommendCount` | 推荐家数 | `recommend_count` | Decimal |
| 83 | `supplyCount` | 保供家数 | `supply_count` | Decimal |
| 84 | `startDate` | 开始时间 | `start_date` | Date |
| 85 | `endDate` | 结束时间 | `end_date` | Date |
| 86 | `deliveryPlace` | 交货地点 | `delivery_place` | String |
| 87 | `erpSourceId` | 外系统子表主键 | `erp_source_id` | String |
| 88 | `erpSourceBid` | 外系统子表行主键 | `erp_source_bid` | String |
| 89 | `notes` | 备注 | `notes` | String |
| 90 | `materialDetailId` | 原燃材料需求清单主键 | `material_detail_id` | Long |
| 91 | `lowestPrice` | 最低无税单价 | `lowest_price` | Decimal |
| 92 | `isBidMaterial` | 物料是否报价 | `is_bid_material` | Integer |
| 93 | `supplydocId` | 投标人ID | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 94 | `purCount` | 采购数量 | `pur_count` | Decimal |
| 95 | `supEnterpriseId` | 租户 | `sup_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 96 | `priceId` | 定标单主键 | `price_id` | e3af2b56-0a6e-4569-ba63-281df1c9be1b |
| 97 | `purUnitId` | 采购单位主键 | `pur_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 98 | `priceWay` | 报价方式 | `price_way` | String |
| 99 | `mainCount` | 主数量 | `main_count` | Decimal |
| 100 | `discountPrice` | 折算报价 | `discount_price` | Decimal |
| 101 | `bidCount` | 报价计价数量 | `bid_count` | Decimal |
| 102 | `currency` | 币种 | `currency` | String |
| 103 | `invPurExchRateType` | 采购换算率类型 | `inv_pur_exch_rate_type` | Short |
| 104 | `recommendReason` | 备注 | `recommend_reason` | String |
| 105 | `subitem` | 分项 | `subitem` | Integer |
| 106 | `winMainCount` | 中标主数量 | `win_main_count` | Decimal |
| 107 | `biddingMaterialId` | 投标物料主键 | `bidding_material_id` | 6f99718a-b71a-4661-9975-b43aed08885a |
| 108 | `invPurExchRate` | 采购换算率 | `inv_pur_exch_rate` | Decimal |
| 109 | `markMaterialId` | 评标物料主键 | `mark_material_id` | 2200f5c0-cb73-44cf-a8f0-6e67980e5793 |
| 110 | `purValCount` | 采购计价数量 | `pur_val_count` | Decimal |
| 111 | `winCount` | 中标数量 | `win_count` | Decimal |
| 112 | `coefficient` | 换算系数 | `coefficient` | Decimal |
| 113 | `invPriceExchRate` | 计价换算率 | `inv_price_exch_rate` | Decimal |
| 114 | `backup` | 分项备注 | `backup` | String |
| 115 | `bidMainCount` | 报价主数量 | `bid_main_count` | Decimal |
| 116 | `uniteBidderId` | 联合体投标人租户主键 | `unite_bidder_id` | Long |
| 117 | `mainUnitId` | 主单位主键 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 118 | `uniteBidderName` | 联合体投标人名称 | `unite_bidder_name` | String |
| 119 | `recentPrice` | 最近价格 | `recent_price` | Decimal |
| 120 | `taxRecentPrice` | 含税最新报价 | `tax_recent_price` | Decimal |
| 121 | `reqId` | 采购需求主键 | `req_id` | bac52eb7-97d5-4c52-8a52-cc1d9bf96c66 |
| 122 | `currencyId` | 报价币种 | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 123 | `taxTotalPrice` | 竞拍含税总价 | `tax_total_price` | Decimal |
| 124 | `totalPrice` | 竞拍无税总价 | `total_price` | Decimal |
| 125 | `freeDefine` | 比价物料自定义项表 | `` | ae8d3c6b-3e36-4703-b60d-96a6af8d3500 |

---

## 关联属性（20个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `cpuPriceMaterialDetailFreeCharacteristics` | 比价物料明细表自由项特征组 | `auction.decisionprice.CpuPriceMaterialDetailFreeCharacteristics` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `purUnitId` | 采购单位主键 | `pc.unit.Unit` | Service |  |
| 4 | `markMaterialId` | 评标物料主键 | `auction.scoringdata.ScoringDataMarkMateriel` | None |  |
| 5 | `materialId` | 物料主键 | `pc.product.Product` | Service |  |
| 6 | `bidProjectId` | 项目主键 | `auction.project.AuctionProject` | None |  |
| 7 | `reqId` | 采购需求主键 | `sourcing.pureq.IpuPuReq` | Service |  |
| 8 | `demandBillId` | 标段物料主键 | `auction.project.AuctionSectionMaterial` | None |  |
| 9 | `supplydocId` | 投标人ID | `aa.vendor.Vendor` | Service |  |
| 10 | `winTaxRateId` | 税率ID | `archive.taxArchives.TaxRateArchive` | Service |  |
| 11 | `freeDefine` | 比价物料自定义项表 | `auction.decisionprice.CpuPriceMaterialDetailFreeDefine` | None | true |
| 12 | `biddingMaterialId` | 投标物料主键 | `auction.bid.BiddingMaterialDetailVO` | None |  |
| 13 | `supEnterpriseId` | 租户 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 14 | `cpuPriceMaterialDetailDefineCharacter` | 比价物料明细表表体自定义项 | `auction.decisionprice.CpuPriceMaterialDetailDefineCharacter` | None |  |
| 15 | `priceId` | 定标单主键 | `auction.decisionprice.CpuPrice` | None | true |
| 16 | `taxRateId` | 税率ID | `archive.taxArchives.TaxRateArchive` | Service |  |
| 17 | `currencyId` | 报价币种 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 18 | `reqOrgId` | 需求公司主键 | `org.func.BaseOrg` | Service |  |
| 19 | `bidSectionId` | 标段(包)编号主键 | `auction.project.AuctionSection` | None |  |
| 20 | `mainUnitId` | 主单位主键 | `pc.unit.Unit` | Service |  |
