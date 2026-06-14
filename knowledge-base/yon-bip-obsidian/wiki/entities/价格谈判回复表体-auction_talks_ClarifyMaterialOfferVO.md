---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.talks.ClarifyMaterialOfferVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 价格谈判回复表体 (`auction.talks.ClarifyMaterialOfferVO`)

> ycSouringAuction | 物理表：`cpu_clarify_material`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 价格谈判回复表体 |
| 物理表 | `cpu_clarify_material` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:25:36.0400` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 报价明细 |

---

## 直接属性（68个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bidAmount` | 投标计价数量 | `bid_amount` | Decimal |
| 2 | `bidClarifyBidderId` | 谈判供应商 | `bid_clarify_bidder_id` | 21a7d9ba-783e-4848-aaa0-b95b280f37c5 |
| 3 | `bidClarifyId` | 谈判单 | `bid_clarify_id` | dffcae36-3871-4d90-9ec5-ed563f559bd9 |
| 4 | `bidCount` | 上次投标计价数量 | `bid_count` | Decimal |
| 5 | `bidMainCount` | 投标主数量 | `bid_main_count` | Decimal |
| 6 | `bidNum` | 投标数量 | `bid_num` | Decimal |
| 7 | `brand` | 商标品牌 | `brand` | String |
| 8 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 9 | `clarifyMaterialId` | 物料表 | `clarify_material_id` | e0a9a572-ba78-475e-957b-d2283c3d6a34 |
| 10 | `consignationId` | 委托单 | `consignation_id` | Long |
| 11 | `cpuClarifyMaterialDefineCharacter` | 谈判磋商价格谈判回复表体自定义项 | `define_character_id` | f703fa81-d705-4c24-bd33-636836e8d3b4 |
| 12 | `cpuClarifyMaterialFreeCharacteristics` | 谈判磋商价格谈判回复表体自由项特征组 | `free_characters_id` | 70c99f75-54db-4094-bde5-b9349cd932ac |
| 13 | `currencyId` | 投标币种 | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 14 | `deliveryAddress` | 交货地址 | `delivery_address` | String |
| 15 | `dr` | 逻辑删除标记 | `dr` | Short |
| 16 | `endTime` | 结束时间 | `end_time` | Date |
| 17 | `enterpriseId` | 委托单 | `enterprise_id` | Long |
| 18 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 19 | `files` | 附件 | `files` | String |
| 20 | `guidePrice` | 谈判指导价 | `guide_price` | Decimal |
| 21 | `id` | 报价明细 | `id` | Long |
| 22 | `invPriceExchRate` | 计价换算率 | `inv_price_exch_rate` | Decimal |
| 23 | `invPriceExchRateDen` | 计价换算率分母 | `inv_price_exch_rate_den` | Decimal |
| 24 | `invPriceExchRateNum` | 计价换算率分子 | `inv_price_exch_rate_num` | Decimal |
| 25 | `invPurExchRate` | 采购换算率 | `inv_pur_exch_rate` | Decimal |
| 26 | `invPurExchRateDen` | 采购换算率分母 | `inv_pur_exch_rate_den` | Decimal |
| 27 | `invPurExchRateNum` | 采购换算率分子 | `inv_pur_exch_rate_num` | Decimal |
| 28 | `invPurExchRateType` | 采购换算率类型 | `inv_pur_exch_rate_type` | Short |
| 29 | `lastBidCount` | 上次投标数量 | `last_bid_count` | Decimal |
| 30 | `lastTaxTotalPrices` | 上一次投标含税金额 | `last_tax_total_prices` | Decimal |
| 31 | `lastTotalPrices` | 上一次投标无税金额 | `last_total_prices` | Decimal |
| 32 | `mainCount` | 主数量 | `main_count` | Decimal |
| 33 | `mainUnitId` | 主单位 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 34 | `materialDetailId` | 标包物料 | `material_detail_id` | d1c773f8-faee-4714-9ef2-044060d8ee18 |
| 35 | `materialExplain` | 物料描述 | `material_explain` | String |
| 36 | `materialId` | 物料档案 | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 37 | `materialName` | 物料名称 | `material_name` | String |
| 38 | `materialNo` | 物料编码 | `material_no` | String |
| 39 | `materialSpecification` | 规格型号 | `material_specification` | String |
| 40 | `maximumPrice` | 最高限价 | `maximum_price` | Decimal |
| 41 | `measureUnit` | 采购计价单位 | `measure_unit` | String |
| 42 | `notaxPrice` | 投标无税单价 | `notax_price` | Decimal |
| 43 | `originRate` | 上次税率 | `origin_rate` | Decimal |
| 44 | `priceHigh` | 最高限价 | `price_high` | Decimal |
| 45 | `pubts` | 时间戳 | `pubts` | DateTime |
| 46 | `purCount` | 采购数量 | `pur_count` | Decimal |
| 47 | `purUnitId` | 采购单位 | `pur_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 48 | `purchaseCount` | 采购计价数量 | `purchase_count` | Decimal |
| 49 | `rate` | 税率(%) | `rate` | Decimal |
| 50 | `remark` | 备注 | `remark` | String |
| 51 | `rowNo` | 行号 | `row_no` | Decimal |
| 52 | `singlePrice` | 上次投标无税单价 | `single_price` | Decimal |
| 53 | `specificationModel` | 规格型号 | `specification_model` | String |
| 54 | `startTime` | 供货开始时间 | `start_time` | Date |
| 55 | `stepSize` | 报价步长 | `step_size` | Decimal |
| 56 | `supEnterpriseId` | 供应商企业 | `bidder_id` | Long |
| 57 | `supEnterpriseName` | 供应商企业名称 | `bidder_name` | String |
| 58 | `tax` | 税额 | `tax` | Decimal |
| 59 | `taxPrice` | 投标含税单价 | `tax_price` | Decimal |
| 60 | `taxRateId` | 税率ID | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 61 | `taxSinglePrice` | 上次投标含税单价 | `tax_single_price` | Decimal |
| 62 | `taxTotalPrices` | 投标含税总价 | `tax_total_prices` | Decimal |
| 63 | `texture` | 质材 | `texture` | String |
| 64 | `totalPrices` | 投标无税总价 | `total_prices` | Decimal |
| 65 | `ts` | 时间戳 | `ts` | DateTime |
| 66 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 67 | `whithUnit` | 需用单位 | `whith_unit` | String |
| 68 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（12个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `cpuClarifyMaterialFreeCharacteristics` | 谈判磋商价格谈判回复表体自由项特征组 | `auction.talkResponse.CpuClarifyMaterialFreeCharacteristics` | None |  |
| 2 | `bidClarifyId` | 谈判单 | `auction.talks.BidClarifyVO` | None | true |
| 3 | `clarifyMaterialId` | 物料表 | `auction.talks.ClarifyMaterialVO` | None |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `purUnitId` | 采购单位 | `pc.unit.Unit` | Service |  |
| 6 | `materialDetailId` | 标包物料 | `auction.project.AuctionSectionMaterial` | None |  |
| 7 | `bidClarifyBidderId` | 谈判供应商 | `auction.talkResponse.ClarifyBidderVO` | None |  |
| 8 | `currencyId` | 投标币种 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 9 | `materialId` | 物料档案 | `pc.product.Product` | Service |  |
| 10 | `taxRateId` | 税率ID | `archive.taxArchives.TaxRateArchive` | Service |  |
| 11 | `cpuClarifyMaterialDefineCharacter` | 谈判磋商价格谈判回复表体自定义项 | `auction.talkResponse.CpuClarifyMaterialDefineCharacter` | None |  |
| 12 | `mainUnitId` | 主单位 | `pc.unit.Unit` | Service |  |
