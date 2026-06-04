---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.quotationrecord.QuotationRecordMaterielVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 报价历史物料表体 (`lawbid.quotationrecord.QuotationRecordMaterielVO`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_quotation_record_materiel`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 报价历史物料表体 |
| 物理表 | `cpu_quotation_record_materiel` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:00:34.7990` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

## 部署信息

- 部署时间: 2026-05-22 23:55:02:000

## 依赖接口（3个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 2 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 3 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（115个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `mainId` | 报价单 | `main_id` | 121e86e2-ab6e-4c29-87d0-aa9fde3841f6 |
| 3 | `biddingDetailId` | 投标报价单 | `bidding_detail_id` | 102df149-dc26-44a9-8fbe-02be312d8a34 |
| 4 | `materialId` | 物料 | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 5 | `costQuoteGroupId` | 成本项报价组id | `cost_quote_group_id` | Long |
| 6 | `dimensionPricingId` | 报价ID | `dimension_pricing_id` | efd1e4c5-9da5-490b-acfc-9b097f70f890 |
| 7 | `enterpriseId` | 租户 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 8 | `biddingId` | 投标供应商 | `bidding_id` | 560d390c-4459-4448-8e73-f6ce26a04dba |
| 9 | `orderNo` | 序号(外系统编号) | `order_no` | String |
| 10 | `sequenceNo` | 顺序号 | `sequence_no` | String |
| 11 | `lawbid_system_id` | 原始主键 | `lawbid_system_id` | Long |
| 12 | `lawbid_system_type` | 原始主键 | `lawbid_system_type` | String |
| 13 | `ts` | 时间戳 | `ts` | DateTime |
| 14 | `sectionMaterialId` | 标包物料 | `section_material_id` | 3fe14cdc-d32f-4161-80ad-994d5f6c57e3 |
| 15 | `multipleCurrentStage` | 招标阶段 | `multiple_current_stage` | Integer |
| 16 | `purNum` | 采购数量 | `pur_num` | Decimal |
| 17 | `bidNum` | 投标数量 | `bid_num` | Decimal |
| 18 | `markNum` | 评标数量 | `mark_num` | Decimal |
| 19 | `purUnitId` | 采购单位 | `pur_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 20 | `mainNum` | 主数量 | `main_num` | Decimal |
| 21 | `bidMainNum` | 投标主数量 | `bid_main_num` | Decimal |
| 22 | `markMainNum` | 评标主数量 | `mark_main_num` | Decimal |
| 23 | `mainUnitId` | 主单位 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 24 | `invPurExchRate` | 采购换算率 | `inv_pur_exch_rate` | Decimal |
| 25 | `invPriceExchRate` | 计价换算率 | `inv_price_exch_rate` | Decimal |
| 26 | `invPurExchRateType` | 采购换算率类型 | `inv_pur_exch_rate_type` | Short |
| 27 | `stepSeq` | 当前分步开标阶段 | `step_seq` | Integer |
| 28 | `conversionSinglePrice` | 换算后不含税单价 | `conversion_single_price` | Decimal |
| 29 | `conversionTaxSinglePrice` | 换算后含税单价 | `conversion_tax_single_price` | Decimal |
| 30 | `conversionTotalPrice` | 换算后不含税总价 | `conversion_total_price` | Decimal |
| 31 | `conversionTaxTotalPrice` | 换算后含税总价 | `conversion_tax_total_price` | Decimal |
| 32 | `openRateTime` | 开标汇率日期 | `open_rate_time` | DateTime |
| 33 | `rank` | 当前批次排名 | `rank` | String |
| 34 | `sourceId` | 来源单据id | `source_id` | Long |
| 35 | `sourceType` | 来源单据类型 | `source_type` | String |
| 36 | `sourceBatchNo` | 来源单据批次号 | `source_batch_no` | String |
| 37 | `sourceQuotationStatus` | 当前来源批次是否报价,1是,0否 | `source_quotation_status` | Integer |
| 38 | `tax` | 税额 | `tax` | Decimal |
| 39 | `taxMark` | 评标税额 | `tax_mark` | Decimal |
| 40 | `conversionTaxTotal` | 换算后税额总价 | `conversion_tax_total` | Decimal |
| 41 | `openRateValueOps` | 开标汇率折算方式 | `open_rate_value_ops` | ExchangeRateMethod |
| 42 | `invPriceExchRateDen` | 计价换算率分母 | `inv_price_exch_rate_den` | Decimal |
| 43 | `invPriceExchRateNum` | 计价换算率分子 | `inv_price_exch_rate_num` | Decimal |
| 44 | `invPurExchRateDen` | 采购换算率分母 | `inv_pur_exch_rate_den` | Decimal |
| 45 | `invPurExchRateNum` | 采购换算率分子 | `inv_pur_exch_rate_num` | Decimal |
| 46 | `dr` | 逻辑删除标记 | `dr` | Short |
| 47 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 48 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 49 | `pubts` | 时间戳 | `pubts` | DateTime |
| 50 | `materialNo` | 物料编码 | `material_no` | String |
| 51 | `materialName` | 物料名称 | `material_name` | String |
| 52 | `materialSpecification` | 规格 | `material_specification` | String |
| 53 | `bidSpecification` | 投标规格型号 | `bid_specification` | String |
| 54 | `materialIngredient` | 材质 | `material_ingredient` | String |
| 55 | `materialBrand` | 品牌 | `material_brand` | String |
| 56 | `materialQualifyStandard` | 质量标准 | `material_qualify_standard` | String |
| 57 | `materialDetail` | 物料详细描述 | `material_detail` | String |
| 58 | `materialModel` | 物料型号 | `material_model` | String |
| 59 | `purchaseCount` | 采购数量 | `purchase_count` | Decimal |
| 60 | `measureUnit` | 计量单位 | `measure_unit` | String |
| 61 | `currencyId` | 报价币种 | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 62 | `openRateValue` | 开标汇率值 | `open_rate_value` | Decimal |
| 63 | `referPrice` | 参考单价 | `refer_price` | Decimal |
| 64 | `lastPrice` | 上期价格 | `last_price` | Decimal |
| 65 | `highestPrice` | 最高限价 | `highest_price` | Decimal |
| 66 | `bidBottom` | 标底 | `bid_bottom` | Decimal |
| 67 | `planPrice` | 计划价格 | `plan_price` | Decimal |
| 68 | `startDate` | 供货开始时间 | `start_date` | Date |
| 69 | `endDate` | 供货结束时间 | `end_date` | Date |
| 70 | `deliveryPlace` | 交货地点 | `delivery_place` | String |
| 71 | `demandOrg` | 需用单位 | `demand_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 72 | `erpSourceId` | 外系统单据号 | `erp_source_id` | String |
| 73 | `erpSourceBid` | 外系统子单据号 | `erp_source_bid` | String |
| 74 | `notes` | 备注 | `notes` | String |
| 75 | `bidCount` | 投标数量 | `bid_count` | Decimal |
| 76 | `singlePrice` | 不含税单价 | `single_price` | Decimal |
| 77 | `taxSinglePrice` | 含税单价 | `tax_single_price` | Decimal |
| 78 | `totalPrice` | 不含税总价 | `total_price` | Decimal |
| 79 | `taxTotalPrice` | 含税总价 | `tax_total_price` | Decimal |
| 80 | `demandBillId` | 需求明细单 | `demand_bill_id` | 3fe14cdc-d32f-4161-80ad-994d5f6c57e3 |
| 81 | `supplydocId` | 供应商 | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 82 | `markCount` | 评标数量 | `mark_count` | Decimal |
| 83 | `markPrice` | 评标不含税单价 | `mark_price` | Decimal |
| 84 | `taxMarkPrice` | 评标含税单价 | `tax_mark_price` | Decimal |
| 85 | `totalMarkPrice` | 评标不含税总价 | `total_mark_price` | Decimal |
| 86 | `taxTotalMarkPrice` | 评标含税总价 | `tax_total_mark_price` | Decimal |
| 87 | `ifHighest` | 是否最高价 | `if_highest` | Integer |
| 88 | `ifLowest` | 是否最低价 | `if_lowest` | Integer |
| 89 | `projectId` | 招标项目 | `project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 90 | `bidSectionId` | 标段(包)id | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 91 | `bidType` | 采购方式 | `bid_type` | String |
| 92 | `isBidMaterial` | 物料是否报价 | `is_bid_material` | Integer |
| 93 | `qualifyCheckType` | 资格审核方式 | `qualify_check_type` | Integer |
| 94 | `qualifyCheckStep` | 资格审核当前流程阶段 | `qualify_check_step` | Integer |
| 95 | `rowNo` | 行号 | `row_no` | Decimal |
| 96 | `supEnterpriseId` | 投标人企业 | `bidder_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 97 | `ifcancel` | 是否取消采购 | `ifcancel` | Integer |
| 98 | `priceWay` | 报价方式 | `price_way` | String |
| 99 | `discountPrice` | 折算报价 | `discount_price` | Decimal |
| 100 | `currency` | 币种 | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 101 | `supplyCount` | 保供家数 | `supply_count` | Decimal |
| 102 | `subitem` | 分项 | `subitem` | Integer |
| 103 | `coefficient` | 换算系数 | `coefficient` | Decimal |
| 104 | `discountTotalPrice` | 折算人民币总价 | `discount_total_price` | Decimal |
| 105 | `backup` | 分项备注 | `backup` | String |
| 106 | `uniteBidderId` | 联合体投标人租户 | `unite_bidder_id` | Long |
| 107 | `uniteBidderName` | 联合体投标人名称 | `unite_bidder_name` | String |
| 108 | `lowestPrice` | 最低投标报价 | `lowest_price` | Decimal |
| 109 | `scoreRound` | 当前评标轮次 | `score_round` | Integer |
| 110 | `scoringGroupId` | 评标组主键 | `scoring_group_id` | bd52c08b-9c24-45c6-b5ba-6209956c1411 |
| 111 | `rate` | 投标税率 | `rate` | Decimal |
| 112 | `quotationRecordMaterielDefineCharacter` | 报价历史表体自定义项特征 | `define_character_id` | 9d16677c-3614-4a76-8426-910a4424fc8f |
| 113 | `quotationRecordMaterielFreeCharacteristics` | 报价历史表体自由项特征组 | `free_characters_id` | 3022c343-550a-4dce-96b1-528d75263312 |
| 114 | `bodydefine` | 报价历史物料表体自定义项 | `` | 328fe71e-022a-4d6f-819c-0d55223e6203 |
| 115 | `steps` | 报价历史物料价格梯度明细 | `` | 2f42b5d7-c10d-42cc-a93e-cddc2d841fcf |

---

## 关联属性（23个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `quotationRecordMaterielFreeCharacteristics` | 报价历史表体自由项特征组 | `lawbid.quotationrecord.QuotationRecordVOMaterielFreeCharacters` | None |  |
| 2 | `demandOrg` | 需用单位 | `org.func.BaseOrg` | Service |  |
| 3 | `quotationRecordMaterielDefineCharacter` | 报价历史表体自定义项特征 | `lawbid.quotationrecord.QuotationRecordVOMaterielDefineCharacter` | None |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `purUnitId` | 采购单位 | `pc.unit.Unit` | Service |  |
| 6 | `bodydefine` | 报价历史物料表体自定义项 | `lawbid.quotationrecord.QuotationRecordVOMaterielDefine` | None | true |
| 7 | `biddingDetailId` | 投标报价单 | `lawbid.bid.BiddingMaterialDetailVO` | None |  |
| 8 | `biddingId` | 投标供应商 | `lawbid.bid.BiddingVO` | None |  |
| 9 | `scoringGroupId` | 评标组主键 | `lawbid.scoringgroup.ScoringGroupVO` | None |  |
| 10 | `materialId` | 物料 | `pc.product.Product` | Service |  |
| 11 | `steps` | 报价历史物料价格梯度明细 | `lawbid.quotationrecord.QuotationRecordMaterielStepVO` | None | true |
| 12 | `dimensionPricingId` | 报价ID | `aa.quotation.BiQuotationHead` | Service |  |
| 13 | `demandBillId` | 需求明细单 | `lawbid.section.LawbidSectionMaterial` | None |  |
| 14 | `supplydocId` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 15 | `sectionMaterialId` | 标包物料 | `lawbid.section.LawbidSectionMaterial` | None |  |
| 16 | `supEnterpriseId` | 投标人企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 17 | `currency` | 币种 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 18 | `enterpriseId` | 租户 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 19 | `currencyId` | 报价币种 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 20 | `mainId` | 报价单 | `lawbid.quotationrecord.QuotationRecordVO` | None | true |
| 21 | `projectId` | 招标项目 | `lawbid.project.LawbidProject` | None |  |
| 22 | `bidSectionId` | 标段(包)id | `lawbid.section.LawbidSection` | None |  |
| 23 | `mainUnitId` | 主单位 | `pc.unit.Unit` | Service |  |
