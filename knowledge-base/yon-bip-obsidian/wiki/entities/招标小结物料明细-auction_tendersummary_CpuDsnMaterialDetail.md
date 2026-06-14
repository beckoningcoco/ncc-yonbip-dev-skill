---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.tendersummary.CpuDsnMaterialDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 招标小结物料明细 (`auction.tendersummary.CpuDsnMaterialDetail`)

> ycSouringAuction | 物理表：`cpu_tendersummary_material`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 招标小结物料明细 |
| 物理表 | `cpu_tendersummary_material` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:25:40.1620` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（122个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `enterpriseId` | 企业租户id | `enterprise_id` | Long |
| 3 | `demandOrg` | 需求组织 | `demand_org` | String |
| 4 | `consignationId` | ID | `consignation_id` | Long |
| 5 | `orderNo` | 序号(外系统编号) | `order_no` | String |
| 6 | `purchaseSolutionNo` | 采购方案号 | `purchase_solution_no` | String |
| 7 | `sequenceNo` | 顺序号 | `sequence_no` | String |
| 8 | `reqOrgId` | 需求公司Id | `req_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 9 | `reqOrgNameGroup` | 需求公司分组 | `req_org_name_group` | String |
| 10 | `reqOrgNameGroupId` | 需求公司分组id | `req_org_name_group_id` | String |
| 11 | `materialIngredient` | 材质 | `material_ingredient` | String |
| 12 | `purCategory` | 采购类别 | `pur_category` | String |
| 13 | `purchaseCount` | 计价数量 | `purchase_count` | Decimal |
| 14 | `bidNum` | 报价计价数量 | `bid_num` | Decimal |
| 15 | `purCount` | 采购数量 | `pur_count` | Decimal |
| 16 | `taxBidPrice` | 投标含税单价 | `tax_bid_price` | Decimal |
| 17 | `taxRecentPrice` | 报价含税单价 | `tax_recent_price` | Decimal |
| 18 | `mainCount` | 主数量 | `main_count` | Decimal |
| 19 | `lastPrice` | 上期价格 | `last_price` | Decimal |
| 20 | `rate` | 报价税率(%) | `rate` | Decimal |
| 21 | `referPrice` | 参考单价 | `refer_price` | Decimal |
| 22 | `bidPrice` | 投标无税单价 | `bid_price` | Decimal |
| 23 | `recentPrice` | 报价无税单价 | `recent_price` | Decimal |
| 24 | `invPurExchRate` | 采购换算率 | `inv_pur_exch_rate` | Decimal |
| 25 | `winNum` | 拟中标数量 | `win_num` | Decimal |
| 26 | `invPriceExchRate` | 计价换算率 | `inv_price_exch_rate` | Decimal |
| 27 | `bidBottom` | 标底 | `bid_bottom` | Decimal |
| 28 | `taxWinPrice` | 拟中标含税单价 | `tax_win_price` | Decimal |
| 29 | `planPrice` | 计划价格 | `plan_price` | Decimal |
| 30 | `reqTime` | 需求日期 | `req_time` | Date |
| 31 | `winRate` | 拟中标税率(%) | `win_rate` | Decimal |
| 32 | `recommendCount` | 推荐家数 | `recommend_count` | Decimal |
| 33 | `taxBidTotalPrice` | 投标含税总价 | `tax_bid_total_price` | Decimal |
| 34 | `bidTotalPrice` | 投标无税总价 | `bid_total_price` | Decimal |
| 35 | `taxTotalPrice` | 拟中标含税总价 | `tax_total_price` | Decimal |
| 36 | `totalPrice` | 拟中标无税总价 | `total_price` | Decimal |
| 37 | `winPrice` | 拟中标无税单价 | `win_price` | Decimal |
| 38 | `materialDetail` | 标的物描述 | `material_detail` | String |
| 39 | `lowestPrice` | 最低无税报价 | `lowest_price` | Decimal |
| 40 | `supplyCount` | 保供家数 | `supply_count` | Decimal |
| 41 | `highestPrice` | 最高限价 | `highest_price` | Decimal |
| 42 | `startDate` | 开始时间 | `start_date` | Date |
| 43 | `state` | 是否中标 | `state` | Integer |
| 44 | `materialBrand` | 品牌 | `material_brand` | String |
| 45 | `endDate` | 结束时间 | `end_date` | Date |
| 46 | `materialQualifyStandard` | 质量要求 | `material_qualify_standard` | String |
| 47 | `currencyId` | 币种id | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 48 | `deliveryPlace` | 交货地点 | `delivery_place` | String |
| 49 | `receiveAddress` | 收货地址 | `receive_address` | String |
| 50 | `notes` | 备注 | `notes` | String |
| 51 | `recommendReason` | 备注 | `recommend_reason` | String |
| 52 | `erpSourceId` | erpSourceId | `erp_source_id` | String |
| 53 | `erpSourceBid` | 外系统子表id | `erp_source_bid` | String |
| 54 | `materialDetailId` | 原燃材料需求清单id | `material_detail_id` | Long |
| 55 | `supplierRate` | 推供应链税率 | `supplier_rate` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 56 | `supplydocId` | 投标人ID | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 57 | `supEnterpriseId` | 租户 | `sup_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 58 | `decisionId` | 定标单主键 | `decision_id` | b2dc61df-e91a-4136-981a-295501d2e771 |
| 59 | `demandBillId` | 标段物料主键 | `demand_bill_id` | d1c773f8-faee-4714-9ef2-044060d8ee18 |
| 60 | `ifcancel` | 是否作废 | `ifcancel` | Integer |
| 61 | `dsnMaterialDetailDefineCharacter` | 中标物料明细表表体自定义项 | `dsn_material_detail_define_character` | 83a54a43-383f-4170-9638-60fc2c22c8d4 |
| 62 | `dsnMaterialDetailFreeCharacteristics` | 招标小结自由项特征组 | `dsn_material_detail_free_characteristics` | 2106741d-d0a6-4c44-b910-c7ca240b6d86 |
| 63 | `bidCount` | 投标数量 | `bid_count` | Decimal |
| 64 | `winCount` | 中标数量 | `win_count` | Decimal |
| 65 | `bidMainCount` | 投标主数量 | `bid_main_count` | Decimal |
| 66 | `winMainCount` | 中标主数量 | `win_main_count` | Decimal |
| 67 | `priceWay` | 报价方式 | `price_way` | String |
| 68 | `discountPrice` | 折算报价 | `discount_price` | Decimal |
| 69 | `currency` | 币种 | `currency` | String |
| 70 | `mainUnitId` | 主单位主键 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 71 | `subitem` | 分项 | `subitem` | Integer |
| 72 | `coefficient` | 换算系数 | `coefficient` | Decimal |
| 73 | `discountTotalPrice` | 折算人民币总价 | `discount_total_price` | Decimal |
| 74 | `purUnitId` | 采购单位主键 | `pur_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 75 | `backup` | 分项备注 | `backup` | String |
| 76 | `reqId` | 采购需求id | `req_id` | bac52eb7-97d5-4c52-8a52-cc1d9bf96c66 |
| 77 | `biddingMaterialId` | 投标物料id | `bidding_material_id` | 6f99718a-b71a-4661-9975-b43aed08885a |
| 78 | `markMaterialId` | 评标物料id | `mark_material_id` | 2200f5c0-cb73-44cf-a8f0-6e67980e5793 |
| 79 | `uniteBidderId` | 联合体投标人租户Id | `unite_bidder_id` | Long |
| 80 | `uniteBidderName` | 联合体投标人名称 | `unite_bidder_name` | String |
| 81 | `isContract` | 是否推合同标识 | `is_contract` | Integer |
| 82 | `materialId` | 物料id | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 83 | `invPurExchRateType` | 采购换算率类型 | `inv_pur_exch_rate_type` | Short |
| 84 | `bidTax` | 投标税额 | `bid_tax` | Decimal |
| 85 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 86 | `conversionSinglePrice` | 换算后不含税单价 | `conversion_single_price` | Decimal |
| 87 | `conversionTaxSinglePrice` | 换算后含税单价 | `conversion_tax_single_price` | Decimal |
| 88 | `conversionTaxTotalPrice` | 换算后含税金额 | `conversion_tax_total_price` | Decimal |
| 89 | `conversionTaxTotalWinPrice` | 换算后中标含税金额 | `conversion_tax_total_win_price` | Decimal |
| 90 | `conversionTaxWinPrice` | 换算后中标含税单价 | `conversion_tax_win_price` | Decimal |
| 91 | `conversionTotalPrice` | 换算后不含税金额 | `conversion_total_price` | Decimal |
| 92 | `conversionTotalWinPrice` | 换算后中标无税金额 | `conversion_total_win_price` | Decimal |
| 93 | `conversionWinPrice` | 换算后中标无税单价 | `conversion_win_price` | Decimal |
| 94 | `conversionWinTax` | 换算后中标税额 | `conversion_win_tax` | Decimal |
| 95 | `dr` | 逻辑删除标记 | `dr` | Integer |
| 96 | `freeDefine` | 招标小结物料明细表体自定义项 | `` | 211d8aec-c6a5-4c18-8a5c-3543e1a97063 |
| 97 | `invPriceExchRateDen` | 计价换算率分母 | `inv_price_exch_rate_den` | Decimal |
| 98 | `invPriceExchRateNum` | 计价换算率分子 | `inv_price_exch_rate_num` | Decimal |
| 99 | `invPurExchRateDen` | 采购换算率分母 | `inv_pur_exch_rate_den` | Decimal |
| 100 | `invPurExchRateNum` | 采购换算率分子 | `inv_pur_exch_rate_num` | Decimal |
| 101 | `materialClassId` | 物料分类主键 | `material_class_id` | Long |
| 102 | `materialClassName` | 物料分类名称 | `material_class_name` | String |
| 103 | `materialModel` | 物料型号 | `material_model` | String |
| 104 | `materialName` | 工程名称 | `material_name` | String |
| 105 | `materialNo` | 工程编码 | `material_no` | String |
| 106 | `materialSpecification` | 规格 | `material_specification` | String |
| 107 | `measureUnit` | 计价单位主键 | `measure_unit` | String |
| 108 | `openRateTime` | 开标汇率日期 | `open_rate_time` | DateTime |
| 109 | `openRateValue` | 开标汇率值 | `open_rate_value` | Decimal |
| 110 | `openRateValueOps` | 开标汇率折算方式 | `open_rate_value_ops` | ExchangeRateMethod |
| 111 | `projectId` | 招标项目主键 | `project_id` | 94b777ba-4855-4d81-a975-f6ab6b09f9a8 |
| 112 | `pubts` | 时间戳 | `pubts` | DateTime |
| 113 | `reqOrgName` | 需求公司 | `req_org_name` | 14302233-1394-4a70-94e1-bed51636f312 |
| 114 | `rowNo` | 行号 | `row_no` | Decimal |
| 115 | `sectionId` | 标段主键 | `section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 116 | `supEnterpriseName` | 供应商企业名称 | `sup_enterprise_name` | String |
| 117 | `supplydocName` | 拟中标供应商 | `supplydoc_name` | String |
| 118 | `taxRateId` | 税率ID | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 119 | `ts` | 时间戳 | `ts` | DateTime |
| 120 | `winTax` | 中标税额 | `win_tax` | Decimal |
| 121 | `winTaxRateId` | 税率ID | `win_tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 122 | `ytenant` | 租户id | `ytenant_id` | String |

---

## 关联属性（21个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `purUnitId` | 采购单位主键 | `pc.unit.Unit` | Service |  |
| 2 | `dsnMaterialDetailDefineCharacter` | 中标物料明细表表体自定义项 | `auction.tendersummary.SummaryMaterialDefineCharacter` | None |  |
| 3 | `markMaterialId` | 评标物料id | `auction.scoringdata.ScoringDataMarkMateriel` | None |  |
| 4 | `sectionId` | 标段主键 | `auction.project.AuctionSection` | None |  |
| 5 | `materialId` | 物料id | `pc.product.Product` | Service |  |
| 6 | `dsnMaterialDetailFreeCharacteristics` | 招标小结自由项特征组 | `auction.tendersummary.SummaryMaterialFreeCharacteristics` | None |  |
| 7 | `reqId` | 采购需求id | `sourcing.pureq.IpuPuReq` | Service |  |
| 8 | `reqOrgName` | 需求公司 | `org.func.BaseOrg` | Service |  |
| 9 | `demandBillId` | 标段物料主键 | `auction.project.AuctionSectionMaterial` | None |  |
| 10 | `supplierRate` | 推供应链税率 | `archive.taxArchives.TaxRateArchive` | Service |  |
| 11 | `supplydocId` | 投标人ID | `aa.vendor.Vendor` | Service |  |
| 12 | `winTaxRateId` | 税率ID | `archive.taxArchives.TaxRateArchive` | Service |  |
| 13 | `freeDefine` | 招标小结物料明细表体自定义项 | `auction.tendersummary.CpuDsnMaterialDetailFreeDefine` | None | true |
| 14 | `biddingMaterialId` | 投标物料id | `auction.bid.BiddingMaterialDetailVO` | None |  |
| 15 | `supEnterpriseId` | 租户 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 16 | `decisionId` | 定标单主键 | `auction.tendersummary.CpuDecision` | None | true |
| 17 | `taxRateId` | 税率ID | `archive.taxArchives.TaxRateArchive` | Service |  |
| 18 | `currencyId` | 币种id | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 19 | `reqOrgId` | 需求公司Id | `org.func.BaseOrg` | Service |  |
| 20 | `projectId` | 招标项目主键 | `auction.project.AuctionProject` | None |  |
| 21 | `mainUnitId` | 主单位主键 | `pc.unit.Unit` | Service |  |
