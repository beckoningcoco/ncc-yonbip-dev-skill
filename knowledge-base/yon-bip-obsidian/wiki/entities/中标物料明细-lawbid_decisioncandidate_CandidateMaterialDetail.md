---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.decisioncandidate.CandidateMaterialDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 中标物料明细 (`lawbid.decisioncandidate.CandidateMaterialDetail`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_candidate_material_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 中标物料明细 |
| 物理表 | `cpu_candidate_material_detail` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:00:08.6370` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2026-05-22 23:55:02:000

## 依赖接口（5个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 2 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 3 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 4 | 中标候选人公示物料子表接口 | `lawdecision.itf.ICpuCandidateMaterialDetail` | 381 |
| 5 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |

---

## 直接属性（116个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `candidateMaterialListDefineCharacter` | 表体自定义项特征属性 | `dsn_material_detail_define_character` | 8ab94051-b9dc-4f77-b53e-9839d6376be2 |
| 2 | `candidateMaterialListFreeCharacteristics` | 自由项特征组实体 | `dsn_material_detail_free_characteristics` | 92dee638-0629-4494-9d4d-b66d663bbc4a |
| 3 | `id` | id | `id` | Long |
| 4 | `enterpriseId` | enterpriseId | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 5 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 6 | `taxRateId` | 税率ID | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 7 | `winTaxRateId` | 税率ID | `win_tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 8 | `invPriceExchRateDen` | 计价换算率分母 | `inv_price_exch_rate_den` | Decimal |
| 9 | `invPriceExchRateNum` | 计价换算率分子 | `inv_price_exch_rate_num` | Decimal |
| 10 | `invPurExchRateDen` | 采购换算率分母 | `inv_pur_exch_rate_den` | Decimal |
| 11 | `invPurExchRateNum` | 采购换算率分子 | `inv_pur_exch_rate_num` | Decimal |
| 12 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 13 | `dr` | 逻辑删除标记 | `dr` | Integer |
| 14 | `measureUnit` | 计价单位主键 | `measure_unit` | String |
| 15 | `materialClassId` | 物料分类主键 | `material_class_id` | Long |
| 16 | `conversionTotalPrice` | 换算后不含税金额 | `conversion_total_price` | Decimal |
| 17 | `conversionTaxTotalPrice` | 换算后含税金额 | `conversion_tax_total_price` | Decimal |
| 18 | `materialName` | 工程名称 | `material_name` | String |
| 19 | `materialClassName` | 物料分类名称 | `material_class_name` | String |
| 20 | `bidTax` | 投标税额 | `bid_tax` | Decimal |
| 21 | `winTax` | 中标税额 | `win_tax` | Decimal |
| 22 | `conversionWinTax` | 换算后中标税额 | `conversion_win_tax` | Decimal |
| 23 | `materialModel` | 物料型号 | `material_model` | String |
| 24 | `supplydocName` | 拟中标供应商 | `supplydoc_name` | String |
| 25 | `supEnterpriseName` | 供应商企业名称 | `sup_enterprise_name` | String |
| 26 | `reqOrgName` | 需求公司 | `req_org_name` | 14302233-1394-4a70-94e1-bed51636f312 |
| 27 | `openRateValueOps` | 开标汇率折算方式 | `open_rate_value_ops` | ExchangeRateMethod |
| 28 | `materialNo` | 工程编码 | `material_no` | String |
| 29 | `ts` | 时间戳 | `ts` | DateTime |
| 30 | `materialSpecification` | 规格 | `material_specification` | String |
| 31 | `pubts` | 时间戳 | `pubts` | DateTime |
| 32 | `consignationId` | consignationId | `consignation_id` | Long |
| 33 | `demandOrg` | 需求组织 | `demand_org` | String |
| 34 | `orderNo` | 序号(外系统编号) | `order_no` | String |
| 35 | `purchaseSolutionNo` | 采购方案号 | `purchase_solution_no` | String |
| 36 | `materialDetail` | 货物描述 | `material_detail` | String |
| 37 | `sequenceNo` | 顺序号 | `sequence_no` | String |
| 38 | `reqOrgId` | 需求公司Id | `req_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 39 | `reqOrgNameGroup` | 需求公司分组 | `req_org_name_group` | String |
| 40 | `reqOrgNameGroupId` | 需求公司分组id | `req_org_name_group_id` | String |
| 41 | `reqTime` | 需求日期 | `req_time` | Date |
| 42 | `materialIngredient` | 材质 | `material_ingredient` | String |
| 43 | `purchaseCount` | 采购数量 | `purchase_count` | Decimal |
| 44 | `materialBrand` | 物料品牌 | `material_brand` | String |
| 45 | `receiveAddress` | 收货地址 | `receive_address` | String |
| 46 | `materialQualifyStandard` | 质量要求 | `material_qualify_standard` | String |
| 47 | `purCategory` | 采购类别 | `pur_category` | String |
| 48 | `bidNum` | 投标数量 | `bid_num` | Decimal |
| 49 | `taxRecentPrice` | 投标含税单价 | `tax_recent_price` | Decimal |
| 50 | `taxBidPrice` | 投标含税单价 | `tax_bid_price` | Decimal |
| 51 | `lastPrice` | 上期价格 | `last_price` | Decimal |
| 52 | `rate` | 投标税率(%) | `rate` | Decimal |
| 53 | `referPrice` | 参考单价 | `refer_price` | Decimal |
| 54 | `bidPrice` | 投标无税单价 | `bid_price` | Decimal |
| 55 | `recentPrice` | 投标无税单价 | `recent_price` | Decimal |
| 56 | `highestPrice` | 最高限价 | `highest_price` | Decimal |
| 57 | `winNum` | 中标数量 | `win_num` | Decimal |
| 58 | `bidBottom` | 标底 | `bid_bottom` | Decimal |
| 59 | `taxWinPrice` | 中标含税单价 | `tax_win_price` | Decimal |
| 60 | `planPrice` | 计划价格 | `plan_price` | Decimal |
| 61 | `winRate` | 中标税率(%) | `win_rate` | Decimal |
| 62 | `recommendCount` | 推荐家数 | `recommend_count` | Decimal |
| 63 | `winPrice` | 中标无税单价 | `win_price` | Decimal |
| 64 | `lowestPrice` | 最低无税报价 | `lowest_price` | Decimal |
| 65 | `supplyCount` | 保供家数 | `supply_count` | Decimal |
| 66 | `taxTotalPrice` | 含税总价 | `tax_total_price` | Decimal |
| 67 | `state` | 是否中标 | `state` | Integer |
| 68 | `startDate` | 开始时间 | `start_date` | Date |
| 69 | `totalPrice` | 无税总价 | `total_price` | Decimal |
| 70 | `endDate` | 结束时间 | `end_date` | Date |
| 71 | `deliveryPlace` | 交货地点 | `delivery_place` | String |
| 72 | `erpSourceId` | erpSourceId | `erp_source_id` | String |
| 73 | `erpSourceBid` | 外系统子表id | `erp_source_bid` | String |
| 74 | `notes` | 备注 | `notes` | String |
| 75 | `materialDetailId` | 原燃材料需求清单id | `material_detail_id` | Long |
| 76 | `supplierRate` | 推供应链税率 | `supplier_rate` | 01e7528c-c35c-4d33-b2aa-382b4b4f4534 |
| 77 | `conversionSinglePrice` | 换算后无税单价 | `conversion_single_price` | Decimal |
| 78 | `openRateTime` | 开标汇率日期 | `open_rate_time` | DateTime |
| 79 | `conversionTaxSinglePrice` | 换算后含税单价 | `conversion_tax_single_price` | Decimal |
| 80 | `currencyId` | 报价币种ID | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 81 | `supplydocId` | 投标人ID | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 82 | `openRateValue` | 开标汇率值 | `open_rate_value` | Decimal |
| 83 | `conversionWinPrice` | 换算后中标无税单价 | `conversion_win_price` | Decimal |
| 84 | `conversionTaxWinPrice` | 换算后中标含税单价 | `conversion_tax_win_price` | Decimal |
| 85 | `supEnterpriseId` | 租户 | `sup_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 86 | `conversionTotalWinPrice` | 换算后中标无税总价 | `conversion_total_win_price` | Decimal |
| 87 | `conversionTaxTotalWinPrice` | 换算后中标含税总价 | `conversion_tax_total_win_price` | Decimal |
| 88 | `decisionId` | 定标单主键 | `decision_id` | 585541ea-ad90-4a33-a108-ebac173a8032 |
| 89 | `demandBillId` | 标段物料主键 | `demand_bill_id` | 3fe14cdc-d32f-4161-80ad-994d5f6c57e3 |
| 90 | `ifcancel` | 是否作废 | `ifcancel` | Integer |
| 91 | `invPurExchRate` | 采购换算率 | `inv_pur_exch_rate` | Decimal |
| 92 | `bidCount` | 投标数量 | `bid_count` | Decimal |
| 93 | `winCount` | 中标数量 | `win_count` | Decimal |
| 94 | `bidMainCount` | 投标主数量 | `bid_main_count` | Decimal |
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
| 109 | `biddingMaterialId` | 投标物料id | `bidding_material_id` | 102df149-dc26-44a9-8fbe-02be312d8a34 |
| 110 | `markMaterialId` | 评标物料id | `mark_material_id` | 8c4341a0-e9a3-4c70-9df2-525171b82f42 |
| 111 | `uniteBidderId` | 联合体投标人租户Id | `unite_bidder_id` | Long |
| 112 | `uniteBidderName` | 联合体投标人名称 | `unite_bidder_name` | String |
| 113 | `isContract` | 是否推合同标识 | `is_contract` | Long |
| 114 | `materialId` | 物料id | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 115 | `invPurExchRateType` | 采购换算率类型 | `inv_pur_exch_rate_type` | Short |
| 116 | `freeDefine` | 采购结果物料明细自定义项表 | `` | 04c9b165-f4ff-4671-b1c0-04980b1f2b43 |

---

## 关联属性（21个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `candidateMaterialListFreeCharacteristics` | 自由项特征组实体 | `lawbid.decisioncandidate.CandidateMaterialListFreeCharacteristics` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `purUnitId` | 采购单位主键 | `pc.unit.Unit` | Service |  |
| 4 | `candidateMaterialListDefineCharacter` | 表体自定义项特征属性 | `lawbid.decisioncandidate.CandidateMaterialListDefineCharacter` | None |  |
| 5 | `markMaterialId` | 评标物料id | `lawbid.scoringdata.ScoringDataMarkMateriel` | None |  |
| 6 | `materialId` | 物料id | `pc.product.Product` | Service |  |
| 7 | `reqId` | 采购需求id | `sourcing.pureq.IpuPuReq` | Service |  |
| 8 | `reqOrgName` | 需求公司 | `org.func.BaseOrg` | Service |  |
| 9 | `demandBillId` | 标段物料主键 | `lawbid.section.LawbidSectionMaterial` | None |  |
| 10 | `supplierRate` | 推供应链税率 | `bd.taxrate.TaxRateVO` | Service |  |
| 11 | `supplydocId` | 投标人ID | `aa.vendor.Vendor` | Service |  |
| 12 | `winTaxRateId` | 税率ID | `archive.taxArchives.TaxRateArchive` | Service |  |
| 13 | `freeDefine` | 采购结果物料明细自定义项表 | `lawbid.decisioncandidate.CandidateMaterialDetailFreedefine` | None | true |
| 14 | `biddingMaterialId` | 投标物料id | `lawbid.bid.BiddingMaterialDetailVO` | None |  |
| 15 | `supEnterpriseId` | 租户 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 16 | `enterpriseId` | enterpriseId | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 17 | `decisionId` | 定标单主键 | `lawbid.decisioncandidate.CpuCandidatePublicity` | None | true |
| 18 | `taxRateId` | 税率ID | `archive.taxArchives.TaxRateArchive` | Service |  |
| 19 | `currencyId` | 报价币种ID | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 20 | `reqOrgId` | 需求公司Id | `org.func.BaseOrg` | Service |  |
| 21 | `mainUnitId` | 主单位主键 | `pc.unit.Unit` | Service |  |
