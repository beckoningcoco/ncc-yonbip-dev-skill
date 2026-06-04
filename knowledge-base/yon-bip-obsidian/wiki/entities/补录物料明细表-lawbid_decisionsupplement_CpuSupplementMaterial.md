---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.decisionsupplement.CpuSupplementMaterial"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 补录物料明细表 (`lawbid.decisionsupplement.CpuSupplementMaterial`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_supplement_material`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 补录物料明细表 |
| 物理表 | `cpu_supplement_material` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:00:20.9430` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2026-05-22 23:55:26:000

## 依赖接口（4个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 补录物料明细表接口 | `lawdecision.itf.ICpuSupplementMaterial` | 465 |
| 2 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 3 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 4 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |

---

## 直接属性（110个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `dr` | 逻辑删除标记 | `dr` | Integer |
| 2 | `materialNo` | 工程编码 | `material_no` | String |
| 3 | `pubts` | 时间戳 | `pubts` | DateTime |
| 4 | `purCategory` | 采购类别 | `pur_category` | String |
| 5 | `supplementMaterialDefineCharacter` | 补录单表体自定义项特征 | `define_character_id` | 50daf601-801d-409e-91cf-b6ff97790d0c |
| 6 | `supplementMaterialFreeCharacters` | 补录单表体自由项特征组 | `free_characters_id` | 21a94724-7d07-42a9-82df-cb507d749b2b |
| 7 | `ts` | 时间戳 | `ts` | DateTime |
| 8 | `ytenant` | 租户 | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 9 | `id` | id | `id` | Long |
| 10 | `enterpriseId` | 企业 | `enterprise_id` | Long |
| 11 | `consignationId` | 委托单主键 | `consignation_id` | Long |
| 12 | `demandOrg` | 需求组织 | `demand_org` | String |
| 13 | `orderNo` | 序号 | `order_no` | String |
| 14 | `materialBrand` | 物料品牌 | `material_brand` | String |
| 15 | `materialDetail` | 需求描述 | `material_detail` | String |
| 16 | `purchaseSolutionNo` | 采购方案号 | `purchase_solution_no` | String |
| 17 | `sequenceNo` | 顺序号 | `sequence_no` | String |
| 18 | `purchaseCount` | 需求数量 | `purchase_count` | Decimal |
| 19 | `reqOrgId` | 需求公司主键 | `req_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 20 | `reqOrgName` | 需求公司 | `req_org_name` | String |
| 21 | `reqId` | 采购需求主键 | `req_id` | bac52eb7-97d5-4c52-8a52-cc1d9bf96c66 |
| 22 | `reqTime` | 需求日期 | `req_time` | Date |
| 23 | `receiveAddress` | 收货地址 | `receive_address` | String |
| 24 | `materialIngredient` | 材质 | `material_ingredient` | String |
| 25 | `bidNum` | 投标数量 | `bid_num` | Decimal |
| 26 | `taxBidPrice` | 投标含税单价 | `tax_bid_price` | Decimal |
| 27 | `materialQualifyStandard` | 质量要求 | `material_qualify_standard` | String |
| 28 | `rate` | 投标税率(%) | `rate` | Decimal |
| 29 | `bidPrice` | 投标无税单价 | `bid_price` | Decimal |
| 30 | `lastPrice` | 上期价格 | `last_price` | Decimal |
| 31 | `bidTax` | 投标税额 | `bid_tax` | Decimal |
| 32 | `winNum` | 中标数量 | `win_num` | Decimal |
| 33 | `taxWinPrice` | 中标含税单价 | `tax_win_price` | Decimal |
| 34 | `referPrice` | 参考单价 | `refer_price` | Decimal |
| 35 | `conversionTaxSinglePrice` | 换算后含税单价 | `conversion_tax_single_price` | Decimal |
| 36 | `winRate` | 中标税率(%) | `win_rate` | Decimal |
| 37 | `isInitial` | 是否是采购项目的 | `is_initial` | Integer |
| 38 | `conversionSinglePrice` | 换算后无税单价 | `conversion_single_price` | Decimal |
| 39 | `highestPrice` | 最高限价 | `highest_price` | Decimal |
| 40 | `bidBottom` | 标底 | `bid_bottom` | Decimal |
| 41 | `conversionTaxWinPrice` | 换算后含税总价 | `conversion_tax_win_price` | Decimal |
| 42 | `winPrice` | 中标无税单价 | `win_price` | Decimal |
| 43 | `conversionTaxTotalPrice` | 换算后含税总价 | `conversion_tax_total_price` | Decimal |
| 44 | `planPrice` | 计划价格 | `plan_price` | Decimal |
| 45 | `recommendCount` | 推荐家数 | `recommend_count` | Decimal |
| 46 | `winTax` | 中标税额 | `win_tax` | Decimal |
| 47 | `conversionWinPrice` | 换算后中标无税单价 | `conversion_win_price` | Decimal |
| 48 | `supplyCount` | 保供家数 | `supply_count` | Decimal |
| 49 | `conversionTotalPrice` | 换算后无税总价 | `conversion_total_price` | Decimal |
| 50 | `startDate` | 开始时间 | `start_date` | Date |
| 51 | `endDate` | 结束时间 | `end_date` | Date |
| 52 | `deliveryPlace` | 交货地点 | `delivery_place` | String |
| 53 | `erpSourceId` | 外系统子表主键 | `erp_source_id` | String |
| 54 | `taxTotalWinPrice` | 中标含税金额 | `tax_total_win_price` | Decimal |
| 55 | `erpSourceBid` | 外系统子表行主键 | `erp_source_bid` | String |
| 56 | `openRateValue` | 汇率 | `open_rate_value` | Decimal |
| 57 | `notes` | 备注 | `notes` | String |
| 58 | `materialDetailId` | 原燃材料需求清单主键 | `material_detail_id` | Long |
| 59 | `lowestPrice` | 最低投标单价 | `lowest_price` | Decimal |
| 60 | `totalWinPrice` | 中标无税金额 | `total_win_price` | Decimal |
| 61 | `supplydocId` | 拟中标供应商 | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 62 | `supplementId` | 定标单主键 | `supplement_id` | 3250792b-8e4a-4a96-9e17-f3200c52ddf3 |
| 63 | `demandBillId` | 标段物料主键 | `demand_bill_id` | 3fe14cdc-d32f-4161-80ad-994d5f6c57e3 |
| 64 | `conversionWinTax` | 换算后中标税额 | `conversion_win_tax` | Decimal |
| 65 | `ifcancel` | 是否作废 | `ifcancel` | Integer |
| 66 | `conversionTaxTotalWinPrice` | 换算后中标含税金额 | `conversion_tax_total_win_price` | Decimal |
| 67 | `priceWay` | 报价方式 | `price_way` | String |
| 68 | `rowNo` | 行号 | `row_no` | Decimal |
| 69 | `conversionTotalWinPrice` | 换算后中标无税金额 | `conversion_total_win_price` | Decimal |
| 70 | `discountPrice` | 折算报价 | `discount_price` | Decimal |
| 71 | `currency` | 币种 | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 72 | `subitem` | 分项 | `subitem` | Integer |
| 73 | `coefficient` | 换算系数 | `coefficient` | Decimal |
| 74 | `discountTotalPrice` | 折算人民币总价 | `discount_total_price` | Decimal |
| 75 | `backup` | 分项备注 | `backup` | String |
| 76 | `uniteBidderId` | 联合体投标人租户主键 | `unite_bidder_id` | Long |
| 77 | `uniteBidderName` | 联合体投标人名称 | `unite_bidder_name` | String |
| 78 | `recentPrice` | 最近价格 | `recent_price` | Decimal |
| 79 | `taxRecentPrice` | 含税最新报价 | `tax_recent_price` | Decimal |
| 80 | `materialId` | 物料主键 | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 81 | `bidCount` | 投标数量 | `bid_count` | Decimal |
| 82 | `bidMainCount` | 投标主数量 | `bid_main_count` | Decimal |
| 83 | `invPriceExchRate` | 计价换算率 | `inv_price_exch_rate` | Decimal |
| 84 | `invPriceExchRateDen` | 计价换算率分母 | `inv_price_exch_rate_den` | Decimal |
| 85 | `invPriceExchRateNum` | 计价换算率分子 | `inv_price_exch_rate_num` | Decimal |
| 86 | `invPurExchRate` | 采购换算率 | `inv_pur_exch_rate` | Decimal |
| 87 | `invPurExchRateDen` | 采购换算率分母 | `inv_pur_exch_rate_den` | Decimal |
| 88 | `invPurExchRateNum` | 采购换算率分子 | `inv_pur_exch_rate_num` | Decimal |
| 89 | `invPurExchRateType` | 采购换算率类型 | `inv_pur_exch_rate_type` | Short |
| 90 | `mainCount` | 主数量 | `main_count` | Decimal |
| 91 | `mainUnitId` | 主单位主键 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 92 | `materialClassId` | 物料分类主键 | `material_class_id` | Long |
| 93 | `materialClassName` | 物料分类名称 | `material_class_name` | String |
| 94 | `materialModel` | 物料型号 | `material_model` | String |
| 95 | `materialName` | 工程名称 | `material_name` | String |
| 96 | `materialSpecification` | 规格 | `material_specification` | String |
| 97 | `measureUnit` | 计价单位主键 | `measure_unit` | String |
| 98 | `openRateTime` | 开标汇率日期 | `open_rate_time` | DateTime |
| 99 | `openRateValueOps` | 开标汇率折算方式 | `open_rate_value_ops` | ExchangeRateMethod |
| 100 | `purCount` | 采购数量 | `pur_count` | Decimal |
| 101 | `purUnitId` | 采购单位主键 | `pur_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 102 | `supEnterpriseId` | 供应商企业 | `sup_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 103 | `supEnterpriseName` | 供应商企业名称 | `sup_enterprise_name` | String |
| 104 | `supplydocName` | 中标供应商 | `supplydoc_name` | String |
| 105 | `taxRateId` | 税率ID | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 106 | `taxTotalBidPrice` | 投标含税金额 | `tax_total_bid_price` | Decimal |
| 107 | `totalBidPrice` | 投标无税金额 | `total_bid_price` | Decimal |
| 108 | `winCount` | 中标数量 | `win_count` | Decimal |
| 109 | `winMainCount` | 中标主数量 | `win_main_count` | Decimal |
| 110 | `winTaxRateId` | 税率ID | `win_tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |

---

## 关联属性（15个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户 | `yht.tenant.YhtTenant` | Service |  |
| 2 | `purUnitId` | 采购单位主键 | `pc.unit.Unit` | Service |  |
| 3 | `supplementId` | 定标单主键 | `lawbid.decisionsupplement.CpuSupplement` | None | true |
| 4 | `materialId` | 物料主键 | `pc.product.Product` | Service |  |
| 5 | `reqId` | 采购需求主键 | `sourcing.pureq.IpuPuReq` | Service |  |
| 6 | `supplementMaterialFreeCharacters` | 补录单表体自由项特征组 | `lawbid.decisionsupplement.CpuSupplementMaterialFreeCharacters` | None |  |
| 7 | `supplementMaterialDefineCharacter` | 补录单表体自定义项特征 | `lawbid.decisionsupplement.CpuSupplementMaterialDefineCharacter` | None |  |
| 8 | `demandBillId` | 标段物料主键 | `lawbid.section.LawbidSectionMaterial` | None |  |
| 9 | `supplydocId` | 拟中标供应商 | `aa.vendor.Vendor` | Service |  |
| 10 | `winTaxRateId` | 税率ID | `archive.taxArchives.TaxRateArchive` | Service |  |
| 11 | `supEnterpriseId` | 供应商企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 12 | `currency` | 币种 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 13 | `taxRateId` | 税率ID | `archive.taxArchives.TaxRateArchive` | Service |  |
| 14 | `reqOrgId` | 需求公司主键 | `org.func.BaseOrg` | Service |  |
| 15 | `mainUnitId` | 主单位主键 | `pc.unit.Unit` | Service |  |
