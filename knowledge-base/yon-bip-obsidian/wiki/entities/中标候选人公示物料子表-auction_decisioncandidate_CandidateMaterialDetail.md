---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.decisioncandidate.CandidateMaterialDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 中标候选人公示物料子表 (`auction.decisioncandidate.CandidateMaterialDetail`)

> ycSouringAuction | 物理表：`cpu_candidate_material_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 中标候选人公示物料子表 |
| 物理表 | `cpu_candidate_material_detail` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:25:05.4540` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（116个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `candidateMaterialListDefineCharacter` | 表体自定义项特征属性 | `dsn_material_detail_define_character` | 74555f70-1896-43da-904c-49f9a174e71b |
| 2 | `candidateMaterialListFreeCharacteristics` | 自由项特征组实体 | `dsn_material_detail_free_characteristics` | 2c4dc5d1-8a93-4a79-b3aa-de16765e49f0 |
| 3 | `id` | id | `id` | Long |
| 4 | `enterpriseId` | 企业租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 5 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 6 | `taxRateId` | 税率ID | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 7 | `winTaxRateId` | 税率ID | `win_tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 8 | `invPriceExchRateDen` | 计价换算率分母 | `inv_price_exch_rate_den` | Decimal |
| 9 | `invPriceExchRateNum` | 计价换算率分子 | `inv_price_exch_rate_num` | Decimal |
| 10 | `invPurExchRateDen` | 采购换算率分母 | `inv_pur_exch_rate_den` | Decimal |
| 11 | `invPurExchRateNum` | 采购换算率分子 | `inv_pur_exch_rate_num` | Decimal |
| 12 | `dr` | 逻辑删除标记 | `dr` | Short |
| 13 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 14 | `measureUnit` | 计价单位主键 | `measure_unit` | String |
| 15 | `materialClassId` | 物料分类主键 | `material_class_id` | Long |
| 16 | `openRateValue` | 开标汇率值 | `open_rate_value` | Decimal |
| 17 | `conversionSinglePrice` | 换算后不含税单价 | `conversion_single_price` | Decimal |
| 18 | `conversionTaxSinglePrice` | 换算后含税单价 | `conversion_tax_single_price` | Decimal |
| 19 | `conversionTotalPrice` | 换算后不含税金额 | `conversion_total_price` | Decimal |
| 20 | `conversionTaxTotalPrice` | 换算后含税金额 | `conversion_tax_total_price` | Decimal |
| 21 | `openRateTime` | 开标汇率日期 | `open_rate_time` | DateTime |
| 22 | `conversionWinPrice` | 换算后中标无税单价 | `conversion_win_price` | Decimal |
| 23 | `conversionTaxWinPrice` | 换算后中标含税单价 | `conversion_tax_win_price` | Decimal |
| 24 | `conversionTotalWinPrice` | 换算后中标无税金额 | `conversion_total_win_price` | Decimal |
| 25 | `conversionTaxTotalWinPrice` | 换算后中标含税金额 | `conversion_tax_total_win_price` | Decimal |
| 26 | `materialName` | 工程名称 | `material_name` | String |
| 27 | `materialClassName` | 物料分类名称 | `material_class_name` | String |
| 28 | `bidTax` | 投标税额 | `bid_tax` | Decimal |
| 29 | `winTax` | 中标税额 | `win_tax` | Decimal |
| 30 | `conversionWinTax` | 换算后中标税额 | `conversion_win_tax` | Decimal |
| 31 | `materialModel` | 物料型号 | `material_model` | String |
| 32 | `supplydocName` | 拟中标供应商 | `supplydoc_name` | String |
| 33 | `supEnterpriseName` | 供应商企业名称 | `sup_enterprise_name` | String |
| 34 | `reqOrgName` | 需求公司 | `req_org_name` | 14302233-1394-4a70-94e1-bed51636f312 |
| 35 | `openRateValueOps` | 开标汇率折算方式 | `open_rate_value_ops` | ExchangeRateMethod |
| 36 | `materialNo` | 工程编码 | `material_no` | String |
| 37 | `ts` | 时间戳 | `ts` | DateTime |
| 38 | `materialSpecification` | 规格 | `material_specification` | String |
| 39 | `pubts` | 时间戳 | `pubts` | DateTime |
| 40 | `demandOrg` | 需求组织 | `demand_org` | String |
| 41 | `consignationId` | 委托单ID | `consignation_id` | Long |
| 42 | `orderNo` | 序号(外系统编号) | `order_no` | String |
| 43 | `materialDetail` | 货物描述 | `material_detail` | String |
| 44 | `purchaseSolutionNo` | 采购方案号 | `purchase_solution_no` | String |
| 45 | `sequenceNo` | 顺序号 | `sequence_no` | String |
| 46 | `reqOrgId` | 需求公司Id | `req_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 47 | `reqOrgNameGroup` | 需求公司分组 | `req_org_name_group` | String |
| 48 | `reqOrgNameGroupId` | 需求公司分组id | `req_org_name_group_id` | String |
| 49 | `reqTime` | 需求日期 | `req_time` | Date |
| 50 | `materialIngredient` | 材质 | `material_ingredient` | String |
| 51 | `purchaseCount` | 采购数量 | `purchase_count` | Decimal |
| 52 | `materialBrand` | 物料品牌 | `material_brand` | String |
| 53 | `receiveAddress` | 收货地址 | `receive_address` | String |
| 54 | `materialQualifyStandard` | 质量要求 | `material_qualify_standard` | String |
| 55 | `purCategory` | 采购类别 | `pur_category` | String |
| 56 | `bidNum` | 出价数量 | `bid_num` | Decimal |
| 57 | `taxRecentPrice` | 出价含税单价 | `tax_recent_price` | Decimal |
| 58 | `taxBidPrice` | 投标含税单价 | `tax_bid_price` | Decimal |
| 59 | `rate` | 出价税率(%) | `rate` | Decimal |
| 60 | `lastPrice` | 上期价格 | `last_price` | Decimal |
| 61 | `bidPrice` | 投标无税单价 | `bid_price` | Decimal |
| 62 | `recentPrice` | 出价无税单价 | `recent_price` | Decimal |
| 63 | `referPrice` | 参考单价 | `refer_price` | Decimal |
| 64 | `winNum` | 中标数量 | `win_num` | Decimal |
| 65 | `highestPrice` | 最高限价 | `highest_price` | Decimal |
| 66 | `taxWinPrice` | 中标含税单价 | `tax_win_price` | Decimal |
| 67 | `bidBottom` | 标底 | `bid_bottom` | Decimal |
| 68 | `winRate` | 中标税率(%) | `win_rate` | Decimal |
| 69 | `planPrice` | 计划价格 | `plan_price` | Decimal |
| 70 | `winPrice` | 中标无税单价 | `win_price` | Decimal |
| 71 | `recommendCount` | 推荐家数 | `recommend_count` | Decimal |
| 72 | `lowestPrice` | 最低无税报价 | `lowest_price` | Decimal |
| 73 | `taxTotalPrice` | 含税总价 | `tax_total_price` | Decimal |
| 74 | `supplyCount` | 保供家数 | `supply_count` | Decimal |
| 75 | `totalPrice` | 无税总价 | `total_price` | Decimal |
| 76 | `state` | 是否中标 | `state` | Integer |
| 77 | `startDate` | 开始时间 | `start_date` | Date |
| 78 | `currencyId` | 币种id | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 79 | `endDate` | 结束时间 | `end_date` | Date |
| 80 | `deliveryPlace` | 交货地点 | `delivery_place` | String |
| 81 | `erpSourceId` | 外系统子表主键 | `erp_source_id` | String |
| 82 | `erpSourceBid` | 外系统子表id | `erp_source_bid` | String |
| 83 | `notes` | 备注 | `notes` | String |
| 84 | `materialDetailId` | 原燃材料需求清单id | `material_detail_id` | Long |
| 85 | `supplierRate` | 推供应链税率 | `supplier_rate` | 01e7528c-c35c-4d33-b2aa-382b4b4f4534 |
| 86 | `supplydocId` | 投标人ID | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 87 | `supEnterpriseId` | 租户 | `sup_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 88 | `decisionId` | 定标单主键 | `decision_id` | c93185c0-7cb2-4962-ba11-eb04e1292ca6 |
| 89 | `demandBillId` | 标段物料主键 | `demand_bill_id` | d1c773f8-faee-4714-9ef2-044060d8ee18 |
| 90 | `ifcancel` | 是否作废 | `ifcancel` | Integer |
| 91 | `invPurExchRate` | 采购换算率 | `inv_pur_exch_rate` | Decimal |
| 92 | `bidCount` | 出价数量 | `bid_count` | Decimal |
| 93 | `winCount` | 中标数量 | `win_count` | Decimal |
| 94 | `bidMainCount` | 出价主数量 | `bid_main_count` | Decimal |
| 95 | `mainCount` | 主数量 | `main_count` | Decimal |
| 96 | `winMainCount` | 中标主数量 | `win_main_count` | Decimal |
| 97 | `priceWay` | 报价方式 | `price_way` | String |
| 98 | `invPriceExchRate` | 计价换算率 | `inv_price_exch_rate` | Decimal |
| 99 | `discountPrice` | 折算报价 | `discount_price` | Decimal |
| 100 | `currency` | 币种 | `currency` | String |
| 101 | `mainUnitId` | 主单位主键 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 102 | `subitem` | 分项 | `subitem` | Integer |
| 103 | `coefficient` | 换算系数 | `coefficient` | Decimal |
| 104 | `purCount` | 采购数量 | `pur_count` | Decimal |
| 105 | `discountTotalPrice` | 折算人民币总价 | `discount_total_price` | Decimal |
| 106 | `purUnitId` | 采购单位主键 | `pur_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 107 | `backup` | 分项备注 | `backup` | String |
| 108 | `reqId` | 采购需求id | `req_id` | bac52eb7-97d5-4c52-8a52-cc1d9bf96c66 |
| 109 | `biddingMaterialId` | 投标物料id | `bidding_material_id` | 6f99718a-b71a-4661-9975-b43aed08885a |
| 110 | `markMaterialId` | 评标物料id | `mark_material_id` | 2200f5c0-cb73-44cf-a8f0-6e67980e5793 |
| 111 | `uniteBidderId` | 联合体投标人租户Id | `unite_bidder_id` | Long |
| 112 | `uniteBidderName` | 联合体投标人名称 | `unite_bidder_name` | String |
| 113 | `isContract` | 是否推合同标识 | `is_contract` | Long |
| 114 | `materialId` | 物料id | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 115 | `invPurExchRateType` | 采购换算率类型 | `inv_pur_exch_rate_type` | Short |
| 116 | `freeDefine` | 中标候选人公示物料信息子表自由自定义项表 | `` | 2bb07bf2-dc45-4d96-a3ae-9baa92364f0c |

---

## 关联属性（21个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `candidateMaterialListFreeCharacteristics` | 自由项特征组实体 | `auction.decisioncandidate.CandidateMaterialListFreeCharacteristics` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `purUnitId` | 采购单位主键 | `pc.unit.Unit` | Service |  |
| 4 | `candidateMaterialListDefineCharacter` | 表体自定义项特征属性 | `auction.decisioncandidate.CandidateMaterialListDefineCharacter` | None |  |
| 5 | `markMaterialId` | 评标物料id | `auction.scoringdata.ScoringDataMarkMateriel` | None |  |
| 6 | `materialId` | 物料id | `pc.product.Product` | Service |  |
| 7 | `reqId` | 采购需求id | `sourcing.pureq.IpuPuReq` | Service |  |
| 8 | `reqOrgName` | 需求公司 | `org.func.BaseOrg` | Service |  |
| 9 | `demandBillId` | 标段物料主键 | `auction.project.AuctionSectionMaterial` | None |  |
| 10 | `supplierRate` | 推供应链税率 | `bd.taxrate.TaxRateVO` | Service |  |
| 11 | `supplydocId` | 投标人ID | `aa.vendor.Vendor` | Service |  |
| 12 | `winTaxRateId` | 税率ID | `archive.taxArchives.TaxRateArchive` | Service |  |
| 13 | `freeDefine` | 中标候选人公示物料信息子表自由自定义项表 | `auction.decisioncandidate.CandidateMaterialDetailFreedefine` | None | true |
| 14 | `biddingMaterialId` | 投标物料id | `auction.bid.BiddingMaterialDetailVO` | None |  |
| 15 | `supEnterpriseId` | 租户 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 16 | `enterpriseId` | 企业租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 17 | `decisionId` | 定标单主键 | `auction.decisioncandidate.CpuCandidatePublicity` | None | true |
| 18 | `taxRateId` | 税率ID | `archive.taxArchives.TaxRateArchive` | Service |  |
| 19 | `currencyId` | 币种id | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 20 | `reqOrgId` | 需求公司Id | `org.func.BaseOrg` | Service |  |
| 21 | `mainUnitId` | 主单位主键 | `pc.unit.Unit` | Service |  |
