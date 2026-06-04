---
tags: ["BIP", "元数据", "数据字典", "lawbid.bidglance.LawbidGlanceBiddingMaterialDetailVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 开标一览表投标单物料 (`lawbid.bidglance.LawbidGlanceBiddingMaterialDetailVO`)

> **平台版本：BIP 旗舰版 V5**

>  模块 | 物理表：`cpu_bidding_material_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 开标一览表投标单物料 |
| 物理表 | `cpu_bidding_material_detail` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `` |
| 构建时间 | `2026-06-04 20:14:29.2460` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 投标单物料id |

## 部署信息

- 部署时间: 2026-05-22 23:55:27:000

## 依赖接口（4个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 4 | 跨租户供应商租户接口 | `cpu.itf.IVendorTenant` | 14 |

---

## 直接属性（116个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 2 | `dr` | 逻辑删除标记 | `dr` | Short |
| 3 | `fileId` | 附件ID | `file_id` | String |
| 4 | `materialModel` | 物料型号 | `material_model` | String |
| 5 | `materialName` | 物料名称 | `material_name` | String |
| 6 | `materialNo` | 物料编码 | `material_no` | String |
| 7 | `materialSpec` | 物料规格 | `material_spec` | String |
| 8 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 10 | `id` | 投标单物料id | `id` | Long |
| 11 | `biddingId` | 投标主表ID | `bidding_id` | dcf3cae1-a2b4-4e72-aa36-6c678a7f628d |
| 12 | `pubts` | 默认值 | `pubts` | DateTime |
| 13 | `tenantId` | 租户id | `tenant_id` | String |
| 14 | `bidProjectId` | 招标方案主表ID | `bid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 15 | `bidSectionId` | 招标方案标段包ID | `bid_section_id` | 95fd3c1d-7e86-43ec-b5be-66ba3d6c6ad3 |
| 16 | `num` | 需求数量 | `num` | Decimal |
| 17 | `materialExplain` | 物料描述 | `material_explain` | String |
| 18 | `reqDesc` | 需求详情描述 | `req_desc` | String |
| 19 | `unit` | 计价单位 | `unit` | String |
| 20 | `reqTime` | 需求日期 | `req_time` | Date |
| 21 | `reqOrgName` | 需求组织 | `req_org_name` | String |
| 22 | `receiveAddress` | 收货地址 | `receive_address` | String |
| 23 | `highestPrice` | 最高限价 | `highest_price` | Decimal |
| 24 | `materialIngredient` | 材质 | `material_ingredient` | String |
| 25 | `materialBrand` | 品牌 | `material_brand` | String |
| 26 | `materialDetail` | 物料详细描述 | `material_detail` | String |
| 27 | `materialQualifyStandard` | 质量要求 | `material_qualify_standard` | String |
| 28 | `bidCount` | 投标数量 | `bid_count` | Decimal |
| 29 | `taxSinglePrice` | 含税单价 | `tax_single_price` | Decimal |
| 30 | `singlePrice` | 无税单价 | `single_price` | Decimal |
| 31 | `rate` | 税率 | `rate` | Decimal |
| 32 | `rowNo` | 行号 | `row_no` | Decimal |
| 33 | `reqOrgId` | 需求公司id | `req_org_id` | String |
| 34 | `taxTotalPrice` | 含税总价 | `tax_total_price` | Decimal |
| 35 | `materialId` | 物料id | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 36 | `totalPrice` | 无税总价 | `total_price` | Decimal |
| 37 | `unitid` | 单位id | `unitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 38 | `purchaseType` | 采购类型 | `purchase_type` | String |
| 39 | `billStates` | 状态 | `bill_states` | String |
| 40 | `guaranteedSupply` | 保供量 | `guaranteed_supply` | String |
| 41 | `guaranteedSupplyLimit` | 保供量下限 | `guaranteed_supply_limit` | Decimal |
| 42 | `orderNo` | 序号(外系统编号) | `order_no` | String |
| 43 | `serviceTime` | 服务时间 | `service_time` | Date |
| 44 | `servicePlace` | 服务地点 | `service_place` | String |
| 45 | `serviceContent` | 服务内容 | `service_content` | String |
| 46 | `serviceDemand` | 服务要求 | `service_demand` | String |
| 47 | `diagramNo` | 图纸号 | `diagram_no` | String |
| 48 | `profession` | 涉及专业 | `profession` | String |
| 49 | `days` | 工期 | `days` | String |
| 50 | `assetOrgId` | 组织ID | `asset_org_id` | String |
| 51 | `assetOrgName` | 产权单位 | `asset_org_name` | String |
| 52 | `engineeringPlace` | 工程地点 | `engineering_place` | String |
| 53 | `combination` | 是否联合 | `combination` | Integer |
| 54 | `offerRate` | 比率 | `offer_rate` | Decimal |
| 55 | `exploreDate` | 踏勘时间 | `explore_date` | Date |
| 56 | `explorePlace` | 踏勘地点 | `explore_place` | String |
| 57 | `makeStandard` | 制造标准 | `make_standard` | String |
| 58 | `deliveryDate` | 交货日期 | `delivery_date` | Date |
| 59 | `deliveryPlace` | 交货地点 | `delivery_place` | String |
| 60 | `lifetime` | 使用寿命 | `lifetime` | String |
| 61 | `singleWeight` | 单重 | `single_weight` | Decimal |
| 62 | `totalWeight` | 总重 | `total_weight` | Decimal |
| 63 | `repairStandard` | 修复标准 | `repair_standard` | String |
| 64 | `defectName` | 缺陷名称及缺陷经验 | `defect_name` | String |
| 65 | `repairRequirements` | 主要修复工艺要求 | `repair_requirements` | String |
| 66 | `standard` | 验收标准及方法 | `standard` | String |
| 67 | `requirement` | 对承修方的要求 | `requirement` | String |
| 68 | `producer` | 产地 | `producer` | String |
| 69 | `manufacturer` | 制造商 | `manufacturer` | String |
| 70 | `supMaterialIngredient` | 供应商材质 | `sup_material_ingredient` | String |
| 71 | `supSingleWeight` | 供应商单重 | `sup_single_weight` | Decimal |
| 72 | `supProducer` | 供应商产地 | `sup_producer` | String |
| 73 | `supManufacturer` | 供应商制造商 | `sup_manufacturer` | String |
| 74 | `supLifetime` | 供应商使用寿命 | `sup_lifetime` | String |
| 75 | `supTotalWeight` | 供应商总重 | `sup_total_weight` | Decimal |
| 76 | `erpSourceId` | 外系统id | `erp_source_id` | String |
| 77 | `erpSourceBid` | 外系统子表id | `erp_source_bid` | String |
| 78 | `referPrice` | 参考单价 | `refer_price` | Decimal |
| 79 | `lastPrice` | 上期价格 | `last_price` | Decimal |
| 80 | `bidBottom` | 标底 | `bid_bottom` | Decimal |
| 81 | `planPrice` | 计划价格 | `plan_price` | Decimal |
| 82 | `startDate` | 开始时间 | `start_date` | Date |
| 83 | `endDate` | 结束时间 | `end_date` | Date |
| 84 | `notes` | 备注 | `notes` | String |
| 85 | `demandBillId` | 需求明细单ID | `demand_bill_id` | Long |
| 86 | `supplydocId` | 供应商档案ID | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 87 | `isNegotiate` | 是否谈判 0否,1是 | `is_negotiate` | Integer |
| 88 | `singlePriceSecret` | 单价加密 | `single_price_secret` | String |
| 89 | `priceWay` | 报价方式 | `price_way` | String |
| 90 | `discountPrice` | 折算报价 | `discount_price` | Decimal |
| 91 | `currency` | 币种 | `currency` | String |
| 92 | `totalDiscountPrice` | 折算报价总价 | `total_discount_price` | Decimal |
| 93 | `supplyCount` | 保供家数 | `supply_count` | Decimal |
| 94 | `subitem` | 分项 | `subitem` | Integer |
| 95 | `backup` | 分项备注 | `backup` | String |
| 96 | `uniteBidderId` | 联合体投标人租户Id | `unite_bidder_id` | Long |
| 97 | `uniteBidderName` | 联合体投标人名称 | `unite_bidder_name` | String |
| 98 | `bidCountSecret` | 投标数量加密 | `bid_count_secret` | String |
| 99 | `notaxSinglePrice` | 无税单价 | `notax_single_price` | Decimal |
| 100 | `notaxTotalPrice` | 无税总价 | `notax_total_price` | Decimal |
| 101 | `taxDiscountPrice` | 含税折算报价 | `tax_discount_price` | Decimal |
| 102 | `taxSinglePriceSecret` | 含税单价加密 | `tax_single_price_secret` | String |
| 103 | `bidMainCount` | 投标主数量 | `bid_main_count` | Decimal |
| 104 | `biddingCount` | 投标数量 | `bidding_count` | Decimal |
| 105 | `invPriceExchRate` | 计价换算率 | `inv_price_exch_rate` | Decimal |
| 106 | `invPriceExchRateDen` | 计价换算率分母 | `inv_price_exch_rate_den` | Decimal |
| 107 | `invPriceExchRateNum` | 计价换算率分子 | `inv_price_exch_rate_num` | Decimal |
| 108 | `invPurExchRate` | 采购换算率 | `inv_pur_exch_rate` | Decimal |
| 109 | `invPurExchRateDen` | 采购换算率分母 | `inv_pur_exch_rate_den` | Decimal |
| 110 | `invPurExchRateNum` | 采购换算率分子 | `inv_pur_exch_rate_num` | Decimal |
| 111 | `invPurExchRateType` | 采购换算率类型 | `inv_pur_exch_rate_type` | Short |
| 112 | `mainCount` | 主数量 | `main_count` | Decimal |
| 113 | `mainUnitId` | 主单位id | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 114 | `purCount` | 采购数量 | `pur_count` | Decimal |
| 115 | `purUnitId` | 采购单位id | `pur_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 116 | `purUnitName` | 采购单位 | `pur_unit_name` | String |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplydocId` | 供应商档案ID | `aa.vendor.Vendor` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `purUnitId` | 采购单位id | `pc.unit.Unit` | Service |  |
| 4 | `unitid` | 单位id | `pc.unit.Unit` | Service |  |
| 5 | `biddingId` | 投标主表ID | `lawbid.bidglance.LawbidGlanceBiddingVO` | None | true |
| 6 | `materialId` | 物料id | `pc.product.Product` | Service |  |
| 7 | `bidProjectId` | 招标方案主表ID | `lawbid.project.LawbidProject` | None |  |
| 8 | `bidSectionId` | 招标方案标段包ID | `lawbid.bidglance.LawbidGlanceSection` | None |  |
| 9 | `mainUnitId` | 主单位id | `pc.unit.Unit` | Service |  |
