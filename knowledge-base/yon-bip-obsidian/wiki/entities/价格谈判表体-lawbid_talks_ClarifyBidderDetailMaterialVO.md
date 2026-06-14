---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.talks.ClarifyBidderDetailMaterialVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 价格谈判表体 (`lawbid.talks.ClarifyBidderDetailMaterialVO`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_clarify_choose_material`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 价格谈判表体 |
| 物理表 | `cpu_clarify_choose_material` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:16:55.5060` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 物料信息 |

## 部署信息

- 部署时间: 2026-05-22 23:55:03:000

## 依赖接口（3个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 2 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 3 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（51个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 物料信息 | `id` | Long |
| 2 | `bidCount` | 投标数量 | `bid_count` | Decimal |
| 3 | `bidderDetailId` | 投标人 | `bidder_detail_id` | bba56d77-1d5d-4f71-8c6a-3659c6ea7242 |
| 4 | `brand` | 商标品牌 | `brand` | String |
| 5 | `invPriceExchRate` | 计价换算率 | `inv_price_exch_rate` | Decimal |
| 6 | `invPurExchRate` | 采购换算率 | `inv_pur_exch_rate` | Decimal |
| 7 | `invPurExchRateType` | 采购换算率类型 | `inv_pur_exch_rate_type` | Short |
| 8 | `mainCount` | 主数量 | `main_count` | Decimal |
| 9 | `mainUnitId` | 主单位主键 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 10 | `materialName` | 物料名称 | `material_name` | String |
| 11 | `materialNo` | 物料编码 | `material_no` | String |
| 12 | `materialSpecification` | 规格 | `material_specification` | String |
| 13 | `measureUnit` | 采购计价单位 | `measure_unit` | String |
| 14 | `multipleCurrentStage` | 招标阶段 | `multiple_current_stage` | Integer |
| 15 | `notaxPrice` | 投标无税单价 | `notax_price` | Decimal |
| 16 | `purchaseCount` | 采购计价数量 | `purchase_count` | Decimal |
| 17 | `purCount` | 采购数量 | `pur_count` | Decimal |
| 18 | `purUnitId` | 采购单位主键 | `pur_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 19 | `rank` | 排名 | `rank` | String |
| 20 | `remark` | 备注 | `remark` | String |
| 21 | `specificationModel` | 型号 | `specification_model` | String |
| 22 | `taxPrice` | 投标含税单价 | `tax_price` | Decimal |
| 23 | `taxTotalPrices` | 投标含税总价 | `tax_total_prices` | Decimal |
| 24 | `totalPrices` | 投标无税总价 | `total_prices` | Decimal |
| 25 | `totalScore` | 总分 | `total_score` | Decimal |
| 26 | `whithUnit` | 需用单位 | `whith_unit` | String |
| 27 | `ytenantId` | 租户 | `ytenant_id` | String |
| 28 | `invPriceExchRateDen` | 计价换算率分母 | `inv_price_exch_rate_den` | Decimal |
| 29 | `invPriceExchRateNum` | 计价换算率分子 | `inv_price_exch_rate_num` | Decimal |
| 30 | `invPurExchRateDen` | 采购换算率分母 | `inv_pur_exch_rate_den` | Decimal |
| 31 | `invPurExchRateNum` | 采购换算率分子 | `inv_pur_exch_rate_num` | Decimal |
| 32 | `dr` | 逻辑删除标记 | `dr` | Short |
| 33 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 34 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 35 | `pubts` | 时间戳 | `pubts` | DateTime |
| 36 | `enterpriseId` | 租户 | `enterprise_id` | Long |
| 37 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 38 | `bidClarifyId` | 澄清 | `bid_clarify_id` | d318ae13-0f72-4ceb-84dc-25c79f08b220 |
| 39 | `maximumPrice` | 最高限价 | `maximum_price` | Decimal |
| 40 | `materialDetailId` | 物料详情表 | `material_detail_id` | 3fe14cdc-d32f-4161-80ad-994d5f6c57e3 |
| 41 | `priceHigh` | 最高投标限价 | `price_high` | Integer |
| 42 | `guidePrice` | 谈判指导价 | `guide_price` | Decimal |
| 43 | `stepSize` | 报价步长 | `step_size` | Decimal |
| 44 | `deliveryAddress` | 交货地 | `delivery_address` | String |
| 45 | `rowNo` | 行号 | `row_no` | Decimal |
| 46 | `ClarifyMaterialDefineCharacter` | 谈判单价格谈判表体自定义项 | `define_character_id` | fa93cb93-de9e-41f4-8d9d-f97141b40b8f |
| 47 | `costQuoteGroupId` | 成本项报价组id | `cost_quote_group_id` | 89305c8c-fd63-410b-a9d4-4a1dde15ef7a |
| 48 | `dimensionPricingId` | 报价ID | `dimension_pricing_id` | efd1e4c5-9da5-490b-acfc-9b097f70f890 |
| 49 | `materialId` | 物料ID | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 50 | `bodydefine` | 谈判单物料行自定义项 | `` | ed9a298e-a3c0-4e82-90f8-98c0a3b49068 |
| 51 | `steps` | 谈判单物料价格梯度明细 | `` | 9ff8c20f-694f-473f-a695-2931101c7d76 |

---

## 关联属性（12个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bidderDetailId` | 投标人 | `lawbid.talks.ClarifyBidderVO` | None | true |
| 2 | `bidClarifyId` | 澄清 | `lawbid.talks.BidClarifyVO` | None |  |
| 3 | `costQuoteGroupId` | 成本项报价组id | `aa.costitem.CostItemTemplate` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `ClarifyMaterialDefineCharacter` | 谈判单价格谈判表体自定义项 | `lawbid.talks.ClarifyBidderDetailMaterialDefineCharacter` | None |  |
| 6 | `purUnitId` | 采购单位主键 | `pc.unit.Unit` | Service |  |
| 7 | `materialDetailId` | 物料详情表 | `lawbid.section.LawbidSectionMaterial` | None |  |
| 8 | `bodydefine` | 谈判单物料行自定义项 | `lawbid.talks.ClarifyBidderDetailMaterialDefine` | None | true |
| 9 | `materialId` | 物料ID | `pc.product.Product` | Service |  |
| 10 | `steps` | 谈判单物料价格梯度明细 | `lawbid.talks.TalksMaterialStep` | None | true |
| 11 | `dimensionPricingId` | 报价ID | `aa.quotation.BiQuotationHead` | Service |  |
| 12 | `mainUnitId` | 主单位主键 | `pc.unit.Unit` | Service |  |
