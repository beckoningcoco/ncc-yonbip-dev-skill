---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.tendersummary.CpuDsnMaterialDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 招标小结物料明细 (`lawbid.tendersummary.CpuDsnMaterialDetail`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_tendersummary_material`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 招标小结物料明细 |
| 物理表 | `cpu_tendersummary_material` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:03:20.0880` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2026-05-22 23:55:07:000

## 依赖接口（5个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 定标单物料子表接口 | `lawdecision.itf.ICpuDsnMaterialDetail` | 470 |
| 2 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 3 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 4 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 5 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（125个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `enterpriseId` | enterpriseId | `enterprise_id` | Long |
| 3 | `consignationId` | consignationId | `consignation_id` | Long |
| 4 | `demandOrg` | 需求组织 | `demand_org` | String |
| 5 | `orderNo` | 序号(外系统编号) | `order_no` | String |
| 6 | `purchaseSolutionNo` | 采购方案号 | `purchase_solution_no` | String |
| 7 | `sequenceNo` | 顺序号 | `sequence_no` | String |
| 8 | `reqOrgId` | 需求公司Id | `req_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 9 | `reqOrgNameGroup` | 需求公司分组 | `req_org_name_group` | String |
| 10 | `reqOrgNameGroupId` | 需求公司分组id | `req_org_name_group_id` | String |
| 11 | `materialIngredient` | 材质 | `material_ingredient` | String |
| 12 | `materialBrand` | 品牌 | `material_brand` | String |
| 13 | `materialQualifyStandard` | 质量要求 | `material_qualify_standard` | String |
| 14 | `purCategory` | 采购类别 | `pur_category` | String |
| 15 | `purchaseCount` | 采购数量 | `purchase_count` | Decimal |
| 16 | `bidNum` | 投标计价数量 | `bid_num` | Decimal |
| 17 | `taxBidPrice` | 投标含税单价 | `tax_bid_price` | Decimal |
| 18 | `taxRecentPrice` | 投标含税单价 | `tax_recent_price` | Decimal |
| 19 | `lastPrice` | 上期价格 | `last_price` | Decimal |
| 20 | `purCount` | 采购数量 | `pur_count` | Decimal |
| 21 | `mainCount` | 主数量 | `main_count` | Decimal |
| 22 | `rate` | 投标税率(%) | `rate` | Decimal |
| 23 | `referPrice` | 参考单价 | `refer_price` | Decimal |
| 24 | `bidPrice` | 投标无税单价 | `bid_price` | Decimal |
| 25 | `recentPrice` | 投标无税单价 | `recent_price` | Decimal |
| 26 | `highestPrice` | 最高限价 | `highest_price` | Decimal |
| 27 | `winNum` | 拟中标数量 | `win_num` | Decimal |
| 28 | `bidBottom` | 标底 | `bid_bottom` | Decimal |
| 29 | `taxWinPrice` | 拟中标含税单价 | `tax_win_price` | Decimal |
| 30 | `planPrice` | 计划价格 | `plan_price` | Decimal |
| 31 | `invPurExchRate` | 采购换算率 | `inv_pur_exch_rate` | Decimal |
| 32 | `reqTime` | 需求日期 | `req_time` | Date |
| 33 | `winRate` | 拟中标税率(%) | `win_rate` | Decimal |
| 34 | `invPriceExchRate` | 计价换算率 | `inv_price_exch_rate` | Decimal |
| 35 | `recommendCount` | 推荐家数 | `recommend_count` | Decimal |
| 36 | `winPrice` | 拟中标无税单价 | `win_price` | Decimal |
| 37 | `materialDetail` | 需求描述 | `material_detail` | String |
| 38 | `lowestPrice` | 最低无税报价 | `lowest_price` | Decimal |
| 39 | `supplyCount` | 保供家数 | `supply_count` | Decimal |
| 40 | `startDate` | 开始时间 | `start_date` | Date |
| 41 | `endDate` | 结束时间 | `end_date` | Date |
| 42 | `currencyId` | 币种id | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 43 | `taxBidTotalPrice` | 投标含税总价 | `tax_bid_total_price` | Decimal |
| 44 | `bidTotalPrice` | 投标无税总价 | `bid_total_price` | Decimal |
| 45 | `taxTotalPrice` | 拟中标含税总价 | `tax_total_price` | Decimal |
| 46 | `totalPrice` | 拟中标无税总价 | `total_price` | Decimal |
| 47 | `receiveAddress` | 施工地点 | `receive_address` | String |
| 48 | `deliveryPlace` | 交货地点 | `delivery_place` | String |
| 49 | `notes` | 备注 | `notes` | String |
| 50 | `recommendReason` | 备注 | `recommend_reason` | String |
| 51 | `erpSourceId` | erpSourceId | `erp_source_id` | String |
| 52 | `erpSourceBid` | 外系统子表id | `erp_source_bid` | String |
| 53 | `openRateValue` | 汇率 | `open_rate_value` | Decimal |
| 54 | `materialDetailId` | 原燃材料需求清单id | `material_detail_id` | Long |
| 55 | `state` | 是否中标 | `state` | Integer |
| 56 | `isBidMaterial` | 物料是否报价 | `is_bid_material` | Integer |
| 57 | `supplierRate` | 推供应链税率 | `supplier_rate` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 58 | `conversionTaxSinglePrice` | 换算后含税单价 | `conversion_tax_single_price` | Decimal |
| 59 | `supplydocId` | 投标人ID | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 60 | `supEnterpriseId` | 租户 | `sup_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 61 | `decisionId` | 定标单主键 | `decision_id` | 99f460d4-748b-4181-a22c-b517478411e1 |
| 62 | `conversionSinglePrice` | 换算后无税单价 | `conversion_single_price` | Decimal |
| 63 | `demandBillId` | 标段物料主键 | `demand_bill_id` | 3fe14cdc-d32f-4161-80ad-994d5f6c57e3 |
| 64 | `ifcancel` | 是否作废 | `ifcancel` | Integer |
| 65 | `dsnMaterialDetailDefineCharacter` | 中标物料明细表表体自定义项 | `dsn_material_detail_define_character` | 5e2329c0-43b5-41bf-9883-2fa8ba3ce208 |
| 66 | `dsnMaterialDetailFreeCharacteristics` | 招标小结自由项特征组 | `dsn_material_detail_free_characteristics` | a6c8e6be-0d3b-4c61-b2a7-f4461dfbed2a |
| 67 | `conversionTotalPrice` | 换算后无税总价 | `conversion_total_price` | Decimal |
| 68 | `priceWay` | 报价方式 | `price_way` | String |
| 69 | `discountPrice` | 折算报价 | `discount_price` | Decimal |
| 70 | `currency` | 币种 | `currency` | String |
| 71 | `conversionTaxTotalPrice` | 换算后含税总价 | `conversion_tax_total_price` | Decimal |
| 72 | `subitem` | 分项 | `subitem` | Integer |
| 73 | `conversionWinPrice` | 换算后拟中标无税单价 | `conversion_win_price` | Decimal |
| 74 | `coefficient` | 换算系数 | `coefficient` | Decimal |
| 75 | `openRateTime` | 汇率日期 | `open_rate_time` | DateTime |
| 76 | `discountTotalPrice` | 折算人民币总价 | `discount_total_price` | Decimal |
| 77 | `backup` | 分项备注 | `backup` | String |
| 78 | `conversionTaxWinPrice` | 换算后中标含税单价 | `conversion_tax_win_price` | Decimal |
| 79 | `conversionTotalWinPrice` | 换算后拟中标无税总价 | `conversion_total_win_price` | Decimal |
| 80 | `reqId` | 采购需求id | `req_id` | bac52eb7-97d5-4c52-8a52-cc1d9bf96c66 |
| 81 | `biddingMaterialId` | 投标物料id | `bidding_material_id` | 102df149-dc26-44a9-8fbe-02be312d8a34 |
| 82 | `conversionTaxTotalWinPrice` | 换算后拟中标含税总价 | `conversion_tax_total_win_price` | Decimal |
| 83 | `markMaterialId` | 评标物料id | `mark_material_id` | 8c4341a0-e9a3-4c70-9df2-525171b82f42 |
| 84 | `uniteBidderId` | 联合体投标人租户Id | `unite_bidder_id` | Long |
| 85 | `uniteBidderName` | 联合体投标人名称 | `unite_bidder_name` | String |
| 86 | `isContract` | 是否推合同标识 | `is_contract` | Integer |
| 87 | `materialId` | 物料id | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 88 | `bidCount` | 投标数量 | `bid_count` | Decimal |
| 89 | `winCount` | 中标数量 | `win_count` | Decimal |
| 90 | `bidMainCount` | 投标主数量 | `bid_main_count` | Decimal |
| 91 | `winMainCount` | 中标主数量 | `win_main_count` | Decimal |
| 92 | `mainUnitId` | 主单位主键 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 93 | `purUnitId` | 采购单位主键 | `pur_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 94 | `invPurExchRateType` | 采购换算率类型 | `inv_pur_exch_rate_type` | Short |
| 95 | `bidTax` | 投标税额 | `bid_tax` | Decimal |
| 96 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 97 | `conversionWinTax` | 换算后中标税额 | `conversion_win_tax` | Decimal |
| 98 | `dr` | 逻辑删除标记 | `dr` | Integer |
| 99 | `freeDefine` | 招标小结物料明细表体自定义项 | `` | e31f5829-f837-4614-979f-f13d37dea3ef |
| 100 | `invPriceExchRateDen` | 计价换算率分母 | `inv_price_exch_rate_den` | Decimal |
| 101 | `invPriceExchRateNum` | 计价换算率分子 | `inv_price_exch_rate_num` | Decimal |
| 102 | `invPurExchRateDen` | 采购换算率分母 | `inv_pur_exch_rate_den` | Decimal |
| 103 | `invPurExchRateNum` | 采购换算率分子 | `inv_pur_exch_rate_num` | Decimal |
| 104 | `materialClassId` | 物料分类主键 | `material_class_id` | Long |
| 105 | `materialClassName` | 物料分类名称 | `material_class_name` | String |
| 106 | `materialModel` | 物料型号 | `material_model` | String |
| 107 | `materialName` | 工程名称 | `material_name` | String |
| 108 | `materialNo` | 工程编码 | `material_no` | String |
| 109 | `materialSpecification` | 规格 | `material_specification` | String |
| 110 | `measureUnit` | 计价单位主键 | `measure_unit` | String |
| 111 | `openRateValueOps` | 开标汇率折算方式 | `open_rate_value_ops` | ExchangeRateMethod |
| 112 | `projectId` | 招标项目主键 | `project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 113 | `pubts` | 时间戳 | `pubts` | DateTime |
| 114 | `rank` | 排名 | `rank` | Integer |
| 115 | `reqOrgName` | 需求公司 | `req_org_name` | 14302233-1394-4a70-94e1-bed51636f312 |
| 116 | `rowNo` | 行号 | `row_no` | Decimal |
| 117 | `sectionId` | 标段主键 | `section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 118 | `supEnterpriseName` | 供应商企业名称 | `sup_enterprise_name` | String |
| 119 | `supplydocName` | 拟中标供应商 | `supplydoc_name` | String |
| 120 | `taxRateId` | 税率ID | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 121 | `totalScore` | 总分 | `total_score` | Decimal |
| 122 | `ts` | 时间戳 | `ts` | DateTime |
| 123 | `winTax` | 中标税额 | `win_tax` | Decimal |
| 124 | `winTaxRateId` | 税率ID | `win_tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 125 | `ytenant` | 租户id | `ytenant_id` | String |

---

## 关联属性（21个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `purUnitId` | 采购单位主键 | `pc.unit.Unit` | Service |  |
| 2 | `dsnMaterialDetailDefineCharacter` | 中标物料明细表表体自定义项 | `lawbid.tendersummary.SummaryMaterialDefineCharacter` | None |  |
| 3 | `markMaterialId` | 评标物料id | `lawbid.scoringdata.ScoringDataMarkMateriel` | None |  |
| 4 | `sectionId` | 标段主键 | `lawbid.section.LawbidSection` | None |  |
| 5 | `materialId` | 物料id | `pc.product.Product` | Service |  |
| 6 | `dsnMaterialDetailFreeCharacteristics` | 招标小结自由项特征组 | `lawbid.tendersummary.SummaryMaterialFreeCharacteristics` | None |  |
| 7 | `reqId` | 采购需求id | `sourcing.pureq.IpuPuReq` | Service |  |
| 8 | `reqOrgName` | 需求公司 | `org.func.BaseOrg` | Service |  |
| 9 | `demandBillId` | 标段物料主键 | `lawbid.section.LawbidSectionMaterial` | None |  |
| 10 | `supplierRate` | 推供应链税率 | `archive.taxArchives.TaxRateArchive` | Service |  |
| 11 | `supplydocId` | 投标人ID | `aa.vendor.Vendor` | Service |  |
| 12 | `winTaxRateId` | 税率ID | `archive.taxArchives.TaxRateArchive` | Service |  |
| 13 | `freeDefine` | 招标小结物料明细表体自定义项 | `lawbid.tendersummary.CpuDsnMaterialDetailFreeDefine` | None | true |
| 14 | `biddingMaterialId` | 投标物料id | `lawbid.bid.BiddingMaterialDetailVO` | None |  |
| 15 | `supEnterpriseId` | 租户 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 16 | `decisionId` | 定标单主键 | `lawbid.tendersummary.CpuDecision` | None | true |
| 17 | `taxRateId` | 税率ID | `archive.taxArchives.TaxRateArchive` | Service |  |
| 18 | `currencyId` | 币种id | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 19 | `reqOrgId` | 需求公司Id | `org.func.BaseOrg` | Service |  |
| 20 | `projectId` | 招标项目主键 | `lawbid.project.LawbidProject` | None |  |
| 21 | `mainUnitId` | 主单位主键 | `pc.unit.Unit` | Service |  |
