---
tags: ["BIP", "元数据", "数据字典", "ycAuction", "saleauction.talks.ClarifyMaterialVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 供应商谈判物料表体 (`saleauction.talks.ClarifyMaterialVO`)

> ycAuction | 物理表：`cpu_clarify_choose_material`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商谈判物料表体 |
| 物理表 | `cpu_clarify_choose_material` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycAuction` |
| 构建时间 | `2026-06-04 23:45:38.8140` |

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
| 3 | `bidderDetailId` | 投标人 | `bidder_detail_id` | 857fa83e-f705-4f1f-8512-dc700f21a774 |
| 4 | `brand` | 商标品牌 | `brand` | String |
| 5 | `invPriceExchRateDen` | 计价换算率分母 | `inv_price_exch_rate_den` | Decimal |
| 6 | `invPriceExchRateNum` | 计价换算率分子 | `inv_price_exch_rate_num` | Decimal |
| 7 | `invPurExchRateDen` | 采购换算率分母 | `inv_pur_exch_rate_den` | Decimal |
| 8 | `invPurExchRateNum` | 采购换算率分子 | `inv_pur_exch_rate_num` | Decimal |
| 9 | `materialName` | 物料名称 | `material_name` | String |
| 10 | `materialNo` | 物料编码 | `material_no` | String |
| 11 | `materialSpecification` | 规格 | `material_specification` | String |
| 12 | `measureUnit` | 采购计价单位 | `measure_unit` | String |
| 13 | `multipleCurrentStage` | 招标阶段 | `multiple_current_stage` | Integer |
| 14 | `purchaseCount` | 采购计价数量 | `purchase_count` | Decimal |
| 15 | `remark` | 备注 | `remark` | String |
| 16 | `specificationModel` | 型号 | `specification_model` | String |
| 17 | `whithUnit` | 需用单位 | `whith_unit` | String |
| 18 | `ytenantId` | 租户 | `ytenant_id` | String |
| 19 | `dr` | 逻辑删除标记 | `dr` | Short |
| 20 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 21 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 22 | `pubts` | 时间戳 | `pubts` | DateTime |
| 23 | `enterpriseId` | 租户 | `enterprise_id` | Long |
| 24 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 25 | `bidClarifyId` | 澄清 | `bid_clarify_id` | 006ef228-db7d-4d3b-a5b8-bacc392affce |
| 26 | `purUnitId` | 采购单位主键 | `pur_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 27 | `mainCount` | 主数量 | `main_count` | Decimal |
| 28 | `maximumPrice` | 最高限价 | `maximum_price` | Decimal |
| 29 | `materialDetailId` | 物料详情表 | `material_detail_id` | a3dc80cd-0178-4f4f-95e2-5c450aa4e945 |
| 30 | `purCount` | 采购数量 | `pur_count` | Decimal |
| 31 | `mainUnitId` | 主单位主键 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 32 | `priceHigh` | 最高投标限价 | `price_high` | Decimal |
| 33 | `guidePrice` | 谈判指导价 | `guide_price` | Decimal |
| 34 | `invPurExchRate` | 采购换算率 | `inv_pur_exch_rate` | Decimal |
| 35 | `stepSize` | 报价步长 | `step_size` | Decimal |
| 36 | `deliveryAddress` | 交货地 | `delivery_address` | String |
| 37 | `invPriceExchRate` | 计价换算率 | `inv_price_exch_rate` | Decimal |
| 38 | `invPurExchRateType` | 采购换算率类型 | `inv_pur_exch_rate_type` | Short |
| 39 | `rowNo` | 行号 | `row_no` | Decimal |
| 40 | `ClarifyMaterialDefineCharacter` | 谈判单价格谈判表体自定义项 | `define_character_id` | 479482ac-b990-4ffb-b852-2477de741859 |
| 41 | `materialId` | 物料ID | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 42 | `bodydefine` | 谈判物料自定义项 | `` | 154bdf60-5103-405c-9930-21a3ca77cef5 |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bidderDetailId` | 投标人 | `saleauction.talks.ClarifyBidderVO` | None | true |
| 2 | `bidClarifyId` | 澄清 | `saleauction.talks.BidClarifyVO` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `ClarifyMaterialDefineCharacter` | 谈判单价格谈判表体自定义项 | `saleauction.talks.ClarifyMaterialDefineCharacter` | None |  |
| 5 | `purUnitId` | 采购单位主键 | `pc.unit.Unit` | Service |  |
| 6 | `materialDetailId` | 物料详情表 | `saleauction.project.AuctionSectionMaterial` | None |  |
| 7 | `bodydefine` | 谈判物料自定义项 | `saleauction.talks.ClarifyMaterialDefine` | None | true |
| 8 | `materialId` | 物料ID | `pc.product.Product` | Service |  |
| 9 | `mainUnitId` | 主单位主键 | `pc.unit.Unit` | Service |  |
