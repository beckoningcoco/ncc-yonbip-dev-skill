---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "auction.talkResponse.ClarifyMaterialOfferVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 价格谈判回复表体 (`auction.talkResponse.ClarifyMaterialOfferVO`)

> ycBusinessCenter | 物理表：`cpu_clarify_material`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 价格谈判回复表体 |
| 物理表 | `cpu_clarify_material` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 23:26:48.0280` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 报价明细 |

---

## 直接属性（69个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 报价明细 | `id` | Long |
| 2 | `clarifyMaterialId` | 物料表主键 | `clarify_material_id` | e0a9a572-ba78-475e-957b-d2283c3d6a34 |
| 3 | `bidClarifyBidderId` | 谈判供应商 | `bid_clarify_bidder_id` | 21a7d9ba-783e-4848-aaa0-b95b280f37c5 |
| 4 | `enterpriseId` | 委托单 | `enterprise_id` | Long |
| 5 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 6 | `bidClarifyId` | 谈判单 | `bid_clarify_id` | dffcae36-3871-4d90-9ec5-ed563f559bd9 |
| 7 | `materialNo` | 物料编码 | `material_no` | String |
| 8 | `materialName` | 物料名称 | `material_name` | String |
| 9 | `materialExplain` | 物料描述 | `material_explain` | String |
| 10 | `materialSpecification` | 规格型号 | `material_specification` | String |
| 11 | `measureUnit` | 采购计价单位 | `measure_unit` | String |
| 12 | `purchaseCount` | 采购计价数量 | `purchase_count` | Decimal |
| 13 | `consignationId` | 委托单 | `consignation_id` | Long |
| 14 | `specificationModel` | 规格型号 | `specification_model` | String |
| 15 | `texture` | 质材 | `texture` | String |
| 16 | `deliveryAddress` | 交货地址 | `delivery_address` | String |
| 17 | `startTime` | 供货开始时间 | `start_time` | Date |
| 18 | `endTime` | 结束时间 | `end_time` | Date |
| 19 | `whithUnit` | 需用单位 | `whith_unit` | String |
| 20 | `brand` | 商标品牌 | `brand` | String |
| 21 | `supEnterpriseName` | 供应商企业名称 | `bidder_name` | String |
| 22 | `maximumPrice` | 最高限价 | `maximum_price` | Decimal |
| 23 | `priceHigh` | 最高限价 | `price_high` | Decimal |
| 24 | `ts` | 时间戳 | `ts` | DateTime |
| 25 | `taxRateId` | 税率ID | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 26 | `invPriceExchRateDen` | 计价换算率分母 | `inv_price_exch_rate_den` | Decimal |
| 27 | `invPriceExchRateNum` | 计价换算率分子 | `inv_price_exch_rate_num` | Decimal |
| 28 | `invPurExchRateDen` | 采购换算率分母 | `inv_pur_exch_rate_den` | Decimal |
| 29 | `invPurExchRateNum` | 采购换算率分子 | `inv_pur_exch_rate_num` | Decimal |
| 30 | `lastTaxTotalPrices` | 上一次投标含税金额 | `last_tax_total_prices` | Decimal |
| 31 | `lastTotalPrices` | 上一次投标无税金额 | `last_total_prices` | Decimal |
| 32 | `dr` | 逻辑删除标记 | `dr` | Short |
| 33 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 34 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 35 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 36 | `pubts` | 时间戳 | `pubts` | DateTime |
| 37 | `bidCount` | 上次投标数量 | `bid_count` | Decimal |
| 38 | `guidePrice` | 谈判指导价 | `guide_price` | Decimal |
| 39 | `stepSize` | 报价步长 | `step_size` | Decimal |
| 40 | `files` | 附件 | `files` | String |
| 41 | `taxSinglePrice` | 上次投标含税单价 | `tax_single_price` | Decimal |
| 42 | `originRate` | 上次税率 | `origin_rate` | Decimal |
| 43 | `singlePrice` | 上次投标无税单价 | `single_price` | Decimal |
| 44 | `bidAmount` | 投标数量 | `bid_amount` | Decimal |
| 45 | `currencyId` | 投标币种 | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 46 | `cpuClarifyMaterialDefineCharacter` | 谈判磋商表体自定义项特征 | `define_character_id` | f703fa81-d705-4c24-bd33-636836e8d3b4 |
| 47 | `taxPrice` | 投标含税单价 | `tax_price` | Decimal |
| 48 | `rate` | 税率(%) | `rate` | Decimal |
| 49 | `notaxPrice` | 投标无税单价 | `notax_price` | Decimal |
| 50 | `taxTotalPrices` | 投标含税总价 | `tax_total_prices` | Decimal |
| 51 | `rowNo` | 行号 | `row_no` | Decimal |
| 52 | `supEnterpriseId` | 供应商企业 | `bidder_id` | Long |
| 53 | `materialDetailId` | 标包物料 | `material_detail_id` | d1c773f8-faee-4714-9ef2-044060d8ee18 |
| 54 | `tax` | 税额 | `tax` | Decimal |
| 55 | `totalPrices` | 投标无税总价 | `total_prices` | Decimal |
| 56 | `cpuClarifyMaterialFreeCharacteristics` | 谈判磋商表体自由项特征组 | `free_characters_id` | 70c99f75-54db-4094-bde5-b9349cd932ac |
| 57 | `materialId` | 物料档案 | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 58 | `remark` | 备注 | `remark` | String |
| 59 | `invPurExchRate` | 采购换算率 | `inv_pur_exch_rate` | Decimal |
| 60 | `invPriceExchRate` | 计价换算率 | `inv_price_exch_rate` | Decimal |
| 61 | `purCount` | 采购数量 | `pur_count` | Decimal |
| 62 | `purUnitId` | 采购单位主键 | `pur_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 63 | `bidNum` | 投标数量 | `bid_num` | Decimal |
| 64 | `mainCount` | 主数量 | `main_count` | Decimal |
| 65 | `mainUnitId` | 主单位 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 66 | `bidMainCount` | 投标主数量 | `bid_main_count` | Decimal |
| 67 | `lastBidCount` | 上次投标数量 | `last_bid_count` | Decimal |
| 68 | `invPurExchRateType` | 采购换算率类型 | `inv_pur_exch_rate_type` | Short |
| 69 | `bodydefine` | 谈判磋商价格谈判回复表体自定义项 | `` | dbfeeccb-66c4-4e31-aa0c-8981a9f22b66 |

---

## 关联属性（13个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `cpuClarifyMaterialFreeCharacteristics` | 谈判磋商表体自由项特征组 | `auction.talkResponse.CpuClarifyMaterialFreeCharacteristics` | None |  |
| 2 | `bidClarifyId` | 谈判单 | `auction.talks.BidClarifyVO` | None |  |
| 3 | `clarifyMaterialId` | 物料表主键 | `auction.talks.ClarifyMaterialVO` | None |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `purUnitId` | 采购单位主键 | `pc.unit.Unit` | Service |  |
| 6 | `bodydefine` | 谈判磋商价格谈判回复表体自定义项 | `auction.talkResponse.ClarifyMaterialOfferDefine` | None | true |
| 7 | `bidClarifyBidderId` | 谈判供应商 | `auction.talkResponse.ClarifyBidderVO` | None | true |
| 8 | `materialId` | 物料档案 | `pc.product.Product` | Service |  |
| 9 | `cpuClarifyMaterialDefineCharacter` | 谈判磋商表体自定义项特征 | `auction.talkResponse.CpuClarifyMaterialDefineCharacter` | None |  |
| 10 | `materialDetailId` | 标包物料 | `auction.project.AuctionSectionMaterial` | None |  |
| 11 | `currencyId` | 投标币种 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 12 | `taxRateId` | 税率ID | `archive.taxArchives.TaxRateArchive` | Service |  |
| 13 | `mainUnitId` | 主单位 | `pc.unit.Unit` | Service |  |
