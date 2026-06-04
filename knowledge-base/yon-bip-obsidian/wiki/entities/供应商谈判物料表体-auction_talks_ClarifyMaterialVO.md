---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.talks.ClarifyMaterialVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 供应商谈判物料表体 (`auction.talks.ClarifyMaterialVO`)

> ycSouringAuction | 物理表：`cpu_clarify_choose_material`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商谈判物料表体 |
| 物理表 | `cpu_clarify_choose_material` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:26:18.8120` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 物料信息 |

---

## 直接属性（42个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 物料信息 | `id` | Long |
| 2 | `bidCount` | 投标数量 | `bid_count` | Decimal |
| 3 | `bidderDetailId` | 投标人 | `bidder_detail_id` | 114e7542-f47d-408a-9b62-60eb271e4556 |
| 4 | `brand` | 商标品牌 | `brand` | String |
| 5 | `invPriceExchRate` | 计价换算率 | `inv_price_exch_rate` | Decimal |
| 6 | `invPriceExchRateDen` | 计价换算率分母 | `inv_price_exch_rate_den` | Decimal |
| 7 | `invPriceExchRateNum` | 计价换算率分子 | `inv_price_exch_rate_num` | Decimal |
| 8 | `invPurExchRate` | 采购换算率 | `inv_pur_exch_rate` | Decimal |
| 9 | `invPurExchRateDen` | 采购换算率分母 | `inv_pur_exch_rate_den` | Decimal |
| 10 | `invPurExchRateNum` | 采购换算率分子 | `inv_pur_exch_rate_num` | Decimal |
| 11 | `invPurExchRateType` | 采购换算率类型 | `inv_pur_exch_rate_type` | Short |
| 12 | `mainCount` | 主数量 | `main_count` | Decimal |
| 13 | `mainUnitId` | 主单位主键 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 14 | `materialName` | 物料名称 | `material_name` | String |
| 15 | `materialNo` | 物料编码 | `material_no` | String |
| 16 | `materialSpecification` | 规格 | `material_specification` | String |
| 17 | `measureUnit` | 采购计价单位 | `measure_unit` | String |
| 18 | `multipleCurrentStage` | 招标阶段 | `multiple_current_stage` | Integer |
| 19 | `purchaseCount` | 采购计价数量 | `purchase_count` | Decimal |
| 20 | `purCount` | 采购数量 | `pur_count` | Decimal |
| 21 | `purUnitId` | 采购单位主键 | `pur_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 22 | `remark` | 备注 | `remark` | String |
| 23 | `specificationModel` | 型号 | `specification_model` | String |
| 24 | `whithUnit` | 需用单位 | `whith_unit` | String |
| 25 | `ytenantId` | 租户 | `ytenant_id` | String |
| 26 | `dr` | 逻辑删除标记 | `dr` | Short |
| 27 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 28 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 29 | `pubts` | 时间戳 | `pubts` | DateTime |
| 30 | `enterpriseId` | 租户 | `enterprise_id` | Long |
| 31 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 32 | `bidClarifyId` | 澄清 | `bid_clarify_id` | dffcae36-3871-4d90-9ec5-ed563f559bd9 |
| 33 | `maximumPrice` | 最高限价 | `maximum_price` | Decimal |
| 34 | `materialDetailId` | 物料详情表 | `material_detail_id` | d1c773f8-faee-4714-9ef2-044060d8ee18 |
| 35 | `priceHigh` | 最高投标限价 | `price_high` | Integer |
| 36 | `guidePrice` | 谈判指导价 | `guide_price` | Decimal |
| 37 | `stepSize` | 报价步长 | `step_size` | Decimal |
| 38 | `deliveryAddress` | 交货地 | `delivery_address` | String |
| 39 | `rowNo` | 行号 | `row_no` | Decimal |
| 40 | `ClarifyMaterialDefineCharacter` | 谈判单价格谈判表体自定义项 | `define_character_id` | 9fcb1087-58c4-4462-8f36-c95142f0a309 |
| 41 | `materialId` | 物料ID | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 42 | `bodydefine` | 谈判物料自定义项 | `` | 624635da-8d96-4184-93c5-c190aa675666 |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bidderDetailId` | 投标人 | `auction.talks.ClarifyBidderVO` | None | true |
| 2 | `bidClarifyId` | 澄清 | `auction.talks.BidClarifyVO` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `ClarifyMaterialDefineCharacter` | 谈判单价格谈判表体自定义项 | `auction.talks.ClarifyMaterialDefineCharacter` | None |  |
| 5 | `purUnitId` | 采购单位主键 | `pc.unit.Unit` | Service |  |
| 6 | `materialDetailId` | 物料详情表 | `auction.project.AuctionSectionMaterial` | None |  |
| 7 | `bodydefine` | 谈判物料自定义项 | `auction.talks.ClarifyMaterialDefine` | None | true |
| 8 | `materialId` | 物料ID | `pc.product.Product` | Service |  |
| 9 | `mainUnitId` | 主单位主键 | `pc.unit.Unit` | Service |  |
