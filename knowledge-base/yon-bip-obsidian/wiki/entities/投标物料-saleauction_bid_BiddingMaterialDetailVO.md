---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "saleauction.bid.BiddingMaterialDetailVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 投标物料 (`saleauction.bid.BiddingMaterialDetailVO`)

> ycBusinessCenter | 物理表：`cpu_bidding_material_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 投标物料 |
| 物理表 | `cpu_bidding_material_detail` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 23:43:51.0540` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（138个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `biddingId` | 投标主表ID | `bidding_id` | af94c771-f926-452b-8760-f06c22b53d8f |
| 3 | `pubts` | 默认值 | `pubts` | DateTime |
| 4 | `tenantId` | 租户 | `tenant_id` | String |
| 5 | `bidProjectId` | 招标方案主表ID | `bid_project_id` | 9f8b9356-4cd6-4ae7-8dc0-c84dfecdda07 |
| 6 | `bidSectionId` | 招标方案标段包ID | `bid_section_id` | 052621d8-fde7-4ab0-94bf-b179c720ce6d |
| 7 | `rowNo` | 行号 | `row_no` | Decimal |
| 8 | `receiveAddress` | 收货地址 | `receive_address` | String |
| 9 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 10 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 11 | `materialName` | 物料名称 | `material_name` | String |
| 12 | `materialSpec` | 物料规格 | `material_spec` | String |
| 13 | `reqOrgName` | 需求公司名称 | `req_org_name` | String |
| 14 | `unit` | 单位 | `unit` | String |
| 15 | `lawbidSystemId` | 原始iD | `lawbid_system_id` | Long |
| 16 | `lawbidSystemType` | 原始表 | `lawbid_system_type` | String |
| 17 | `purUnitName` | 采购单位 | `pur_unit_name` | String |
| 18 | `isBidMaterial` | 物料是否报价 | `is_bid_material` | Integer |
| 19 | `pushRateValue` | 发布汇率值 | `push_rate_value` | Decimal |
| 20 | `openRateValue` | 开标汇率值 | `open_rate_value` | Decimal |
| 21 | `conversionSinglePrice` | 换算后不含税单价 | `conversion_single_price` | Decimal |
| 22 | `conversionTaxSinglePrice` | 换算后含税单价 | `conversion_tax_single_price` | Decimal |
| 23 | `conversionTotalPrice` | 换算后不含税总价 | `conversion_total_price` | Decimal |
| 24 | `conversionTaxTotalPrice` | 换算后含税总价 | `conversion_tax_total_price` | Decimal |
| 25 | `rateTime` | 发布汇率日期 | `rate_time` | DateTime |
| 26 | `openRateTime` | 开标汇率日期 | `open_rate_time` | DateTime |
| 27 | `taxSecret` | 税额或原币税额加密后的密文 | `tax_secret` | String |
| 28 | `natTaxSecret` | 转换后的税额或本币税额加密后的密文 | `nat_tax_secret` | String |
| 29 | `materialModel` | 物料型号 | `material_model` | String |
| 30 | `materialNo` | 物料编码 | `material_no` | String |
| 31 | `openRateValueOps` | 开标汇率折算方式 | `open_rate_value_ops` | ExchangeRateMethod |
| 32 | `pushRateValueOps` | 发布汇率折算方式 | `push_rate_value_ops` | ExchangeRateMethod |
| 33 | `taxRateId` | 税率ID | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 34 | `dr` | 逻辑删除标记 | `dr` | Short |
| 35 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 36 | `materialId` | 物料id | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 37 | `materialDetail` | 物料描述 | `material_detail` | String |
| 38 | `materialIngredient` | 材质 | `material_ingredient` | String |
| 39 | `materialExplain` | 物料描述 | `material_explain` | String |
| 40 | `reqDesc` | 需求详情描述 | `req_desc` | String |
| 41 | `reqOrgId` | 需求公司id | `req_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 42 | `num` | 需求数量 | `num` | Decimal |
| 43 | `invPurExchRate` | 采购换算率 | `inv_pur_exch_rate` | Decimal |
| 44 | `reqTime` | 需求日期 | `req_time` | Date |
| 45 | `invPriceExchRate` | 计价换算率 | `inv_price_exch_rate` | Decimal |
| 46 | `unitid` | 单位id | `unitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 47 | `biddingCount` | 投标数量 | `bidding_count` | Decimal |
| 48 | `purchaseType` | 采购类型 | `purchase_type` | String |
| 49 | `invPurExchRateType` | 采购换算率类型 | `inv_pur_exch_rate_type` | Short |
| 50 | `bidCount` | 投标数量 | `bid_count` | Decimal |
| 51 | `mainCount` | 主数量 | `main_count` | Decimal |
| 52 | `billStates` | 状态 | `bill_states` | String |
| 53 | `purCount` | 采购数量 | `pur_count` | Decimal |
| 54 | `guaranteedSupply` | 保供量 | `guaranteed_supply` | String |
| 55 | `bidMainCount` | 投标主数量 | `bid_main_count` | Decimal |
| 56 | `guaranteedSupplyLimit` | 保供量下限 | `guaranteed_supply_limit` | Decimal |
| 57 | `orderNo` | 序号(外系统编号) | `order_no` | String |
| 58 | `serviceTime` | 服务时间 | `service_time` | Date |
| 59 | `highestPrice` | 最高限价 | `highest_price` | Decimal |
| 60 | `purUnitId` | 采购单位主键 | `pur_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 61 | `servicePlace` | 服务地点 | `service_place` | String |
| 62 | `rate` | 税率(%) | `rate` | Decimal |
| 63 | `mainUnitId` | 主单位主键 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 64 | `serviceContent` | 服务内容 | `service_content` | String |
| 65 | `taxSinglePrice` | 含税单价 | `tax_single_price` | Decimal |
| 66 | `serviceDemand` | 服务要求 | `service_demand` | String |
| 67 | `singlePrice` | 无税单价 | `single_price` | Decimal |
| 68 | `diagramNo` | 图纸号 | `diagram_no` | String |
| 69 | `taxTotalPrice` | 含税总价 | `tax_total_price` | Decimal |
| 70 | `profession` | 涉及专业 | `profession` | String |
| 71 | `totalPrice` | 无税总价 | `total_price` | Decimal |
| 72 | `days` | 工期 | `days` | String |
| 73 | `materialBrand` | 品牌厂家 | `material_brand` | String |
| 74 | `assetOrgId` | 组织ID | `asset_org_id` | String |
| 75 | `materialQualifyStandard` | 质量要求 | `material_qualify_standard` | String |
| 76 | `assetOrgName` | 产权单位 | `asset_org_name` | String |
| 77 | `engineeringPlace` | 工程地点 | `engineering_place` | String |
| 78 | `combination` | 是否联合 | `combination` | Integer |
| 79 | `offerRate` | 比率 | `offer_rate` | Decimal |
| 80 | `exploreDate` | 踏勘时间 | `explore_date` | Date |
| 81 | `explorePlace` | 踏勘地点 | `explore_place` | String |
| 82 | `makeStandard` | 制造标准 | `make_standard` | String |
| 83 | `deliveryDate` | 交货日期 | `delivery_date` | Date |
| 84 | `deliveryPlace` | 交货地点 | `delivery_place` | String |
| 85 | `lifetime` | 使用寿命 | `lifetime` | String |
| 86 | `singleWeight` | 单重 | `single_weight` | Decimal |
| 87 | `totalWeight` | 总重 | `total_weight` | Decimal |
| 88 | `repairStandard` | 修复标准 | `repair_standard` | String |
| 89 | `defectName` | 缺陷名称及缺陷经验 | `defect_name` | String |
| 90 | `repairRequirements` | 主要修复工艺要求 | `repair_requirements` | String |
| 91 | `standard` | 验收标准及方法 | `standard` | String |
| 92 | `requirement` | 对承修方的要求 | `requirement` | String |
| 93 | `producer` | 产地 | `producer` | String |
| 94 | `manufacturer` | 制造商 | `manufacturer` | String |
| 95 | `supMaterialIngredient` | 供应商材质 | `sup_material_ingredient` | String |
| 96 | `supSingleWeight` | 供应商单重 | `sup_single_weight` | Decimal |
| 97 | `supProducer` | 供应商产地 | `sup_producer` | String |
| 98 | `supManufacturer` | 供应商制造商 | `sup_manufacturer` | String |
| 99 | `supLifetime` | 供应商使用寿命 | `sup_lifetime` | String |
| 100 | `supTotalWeight` | 供应商总重 | `sup_total_weight` | Decimal |
| 101 | `erpSourceId` | 外系统id | `erp_source_id` | String |
| 102 | `erpSourceBid` | 外系统子表id | `erp_source_bid` | String |
| 103 | `biddingMaterialDetailAuctionFreeCharacters` | 竞卖报价表体自由项特征组 | `free_characters_id` | d317561b-b540-4da3-9dac-ea886e191522 |
| 104 | `referPrice` | 参考单价 | `refer_price` | Decimal |
| 105 | `lastPrice` | 上期价格 | `last_price` | Decimal |
| 106 | `bidBottom` | 标底 | `bid_bottom` | Decimal |
| 107 | `planPrice` | 计划价格 | `plan_price` | Decimal |
| 108 | `startDate` | 开始时间 | `start_date` | Date |
| 109 | `endDate` | 结束时间 | `end_date` | Date |
| 110 | `demandBillId` | 需求明细单ID | `demand_bill_id` | a3dc80cd-0178-4f4f-95e2-5c450aa4e945 |
| 111 | `supplydocId` | 供应商档案ID | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 112 | `isNegotiate` | 是否谈判 0否,1是 | `is_negotiate` | Integer |
| 113 | `singlePriceSecret` | 单价加密 | `single_price_secret` | String |
| 114 | `priceWay` | 报价方式 | `price_way` | String |
| 115 | `discountPrice` | 折算报价 | `discount_price` | Decimal |
| 116 | `currency` | 币种 | `currency` | String |
| 117 | `totalDiscountPrice` | 折算报价总价 | `total_discount_price` | Decimal |
| 118 | `supplyCount` | 保供家数 | `supply_count` | Decimal |
| 119 | `subitem` | 分项 | `subitem` | Integer |
| 120 | `backup` | 分项备注 | `backup` | String |
| 121 | `notes` | 备注 | `notes` | String |
| 122 | `uniteBidderId` | 联合体投标人租户Id | `unite_bidder_id` | Long |
| 123 | `uniteBidderName` | 联合体投标人名称 | `unite_bidder_name` | String |
| 124 | `bidCountSecret` | 投标数量加密 | `bid_count_secret` | String |
| 125 | `notaxSinglePrice` | 无税单价 | `notax_single_price` | Decimal |
| 126 | `notaxTotalPrice` | 无税总价 | `notax_total_price` | Decimal |
| 127 | `taxDiscountPrice` | 含税折算报价 | `tax_discount_price` | Decimal |
| 128 | `taxSinglePriceSecret` | 含税单价加密 | `tax_single_price_secret` | String |
| 129 | `fileId` | 附件 | `file_id` | String |
| 130 | `currencyId` | 币种 | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 131 | `tax` | 税额 | `tax` | Decimal |
| 132 | `natTax` | 换算后税额 | `nat_tax` | Decimal |
| 133 | `biddingMaterialDetailAuctionDefineCharacters` | 竞卖报价单表体自定义特征 | `define_character_id` | a9fc4e59-52f2-4a6c-8c56-71f3b9dce300 |
| 134 | `defines` | 投标物料自定义项表 | `` | d04a2ba7-a1bd-4e05-afb7-0e9146bff624 |
| 135 | `invPriceExchRateDen` | 计价换算率分母 | `inv_price_exch_rate_den` | Decimal |
| 136 | `invPriceExchRateNum` | 计价换算率分子 | `inv_price_exch_rate_num` | Decimal |
| 137 | `invPurExchRateDen` | 采购换算率分母 | `inv_pur_exch_rate_den` | Decimal |
| 138 | `invPurExchRateNum` | 采购换算率分子 | `inv_pur_exch_rate_num` | Decimal |

---

## 关联属性（16个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `biddingMaterialDetailAuctionFreeCharacters` | 竞卖报价表体自由项特征组 | `saleauction.bid.BiddingMaterialDetailAuctionFreeCharacters` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `purUnitId` | 采购单位主键 | `pc.unit.Unit` | Service |  |
| 4 | `biddingId` | 投标主表ID | `saleauction.bid.BiddingVO` | None | true |
| 5 | `materialId` | 物料id | `pc.product.Product` | Service |  |
| 6 | `bidProjectId` | 招标方案主表ID | `saleauction.project.AuctionProject` | None |  |
| 7 | `defines` | 投标物料自定义项表 | `saleauction.bid.BiddingMaterialDetailAuctionFreeDefine` | None | true |
| 8 | `demandBillId` | 需求明细单ID | `saleauction.project.AuctionSectionMaterial` | None |  |
| 9 | `supplydocId` | 供应商档案ID | `aa.vendor.Vendor` | Service |  |
| 10 | `unitid` | 单位id | `pc.unit.Unit` | Service |  |
| 11 | `biddingMaterialDetailAuctionDefineCharacters` | 竞卖报价单表体自定义特征 | `saleauction.bid.BiddingMaterialDetailAuctionDefineCharacters` | None |  |
| 12 | `currencyId` | 币种 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 13 | `reqOrgId` | 需求公司id | `org.func.BaseOrg` | Service |  |
| 14 | `taxRateId` | 税率ID | `archive.taxArchives.TaxRateArchive` | Service |  |
| 15 | `bidSectionId` | 招标方案标段包ID | `saleauction.project.AuctionSection` | None |  |
| 16 | `mainUnitId` | 主单位主键 | `pc.unit.Unit` | Service |  |
