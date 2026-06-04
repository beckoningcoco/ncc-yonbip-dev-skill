---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "lawbid.bid.BiddingMaterialDetailVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 投标报价单物料 (`lawbid.bid.BiddingMaterialDetailVO`)

> **平台版本：BIP 旗舰版 V5**

> ycBusinessCenter 模块 | 物理表：`cpu_bidding_material_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 投标报价单物料 |
| 物理表 | `cpu_bidding_material_detail` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 20:14:18.0910` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

## 部署信息

- 部署时间: 2026-05-22 23:55:21:000

## 依赖接口（6个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 投标单物料子表接口 | `bid.itf.IBiddingMaterialDetail` | 585 |
| 2 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 3 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 4 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 5 | 跨租户供应商租户接口 | `cpu.itf.IVendorTenant` | 14 |
| 6 | lawbidTenant租户相关 | `lawbid.itf.ITenant` | 2 |

---

## 直接属性（145个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `biddingMaterialDetailVODefineCharacter` | 投标报价表体自定义项 | `define_character_id` | af7097ba-db8d-426d-85f9-473f2d930275 |
| 2 | `biddingMaterialDetailVOFreeCharacters` | 投标报价表体自由项特征组 | `free_characters_id` | 3a7c684f-b204-487d-8c95-beeb3ff77e3d |
| 3 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 4 | `dr` | 逻辑删除标记 | `dr` | Short |
| 5 | `lawbidSystemId` | 原始iD | `lawbid_system_id` | Long |
| 6 | `lawbidSystemType` | 原始表 | `lawbid_system_type` | String |
| 7 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 8 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 9 | `id` | ID | `id` | Long |
| 10 | `biddingId` | 投标报价单ID | `bidding_id` | 560d390c-4459-4448-8e73-f6ce26a04dba |
| 11 | `pubts` | 默认值 | `pubts` | DateTime |
| 12 | `tenantId` | 租户 | `tenant_id` | String |
| 13 | `bidProjectId` | 采购项目ID | `bid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 14 | `openRateValueOps` | 开标汇率折算方式 | `open_rate_value_ops` | ExchangeRateMethod |
| 15 | `invPriceExchRateDen` | 计价换算率分母 | `inv_price_exch_rate_den` | Decimal |
| 16 | `invPriceExchRateNum` | 计价换算率分子 | `inv_price_exch_rate_num` | Decimal |
| 17 | `invPurExchRateDen` | 采购换算率分母 | `inv_pur_exch_rate_den` | Decimal |
| 18 | `invPurExchRateNum` | 采购换算率分子 | `inv_pur_exch_rate_num` | Decimal |
| 19 | `rejectQuote` | 是否拒绝报价 | `reject_quote` | Integer |
| 20 | `pushRateValueOps` | 发布汇率折算方式 | `push_rate_value_ops` | ExchangeRateMethod |
| 21 | `taxRateId` | 税率ID | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 22 | `mainUnitId` | 主单位id | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 23 | `purUnitName` | 采购单位 | `pur_unit_name` | String |
| 24 | `purCount` | 采购数量 | `pur_count` | Decimal |
| 25 | `bidMainCount` | 投标主数量 | `bid_main_count` | Decimal |
| 26 | `natTaxSecret` | 转换后的税额或本币税额加密后的密文 | `nat_tax_secret` | String |
| 27 | `invPriceExchRate` | 计价换算率 | `inv_price_exch_rate` | Decimal |
| 28 | `biddingCount` | 投标数量 | `bidding_count` | Decimal |
| 29 | `purUnitId` | 采购单位id | `pur_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 30 | `invPurExchRateType` | 采购换算率类型 | `inv_pur_exch_rate_type` | Short |
| 31 | `taxSecret` | 税额或原币税额加密后的密文 | `tax_secret` | String |
| 32 | `mainCount` | 主数量 | `main_count` | Decimal |
| 33 | `invPurExchRate` | 采购换算率 | `inv_pur_exch_rate` | Decimal |
| 34 | `bidSectionId` | 标段包ID | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 35 | `dimensionPricingId` | 报价ID | `dimension_pricing_id` | efd1e4c5-9da5-490b-acfc-9b097f70f890 |
| 36 | `rowNo` | 行号 | `row_no` | Decimal |
| 37 | `materialId` | 物料id | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 38 | `costQuoteGroupId` | 成本项报价组id | `cost_quote_group_id` | 2b728cc3-82ca-4e8f-8b98-49f9f1df7acd |
| 39 | `materialNo` | 物料编码 | `material_no` | String |
| 40 | `materialName` | 物料名称 | `material_name` | String |
| 41 | `materialSpec` | 物料规格 | `material_spec` | String |
| 42 | `materialModel` | 物料型号 | `material_model` | String |
| 43 | `materialIngredient` | 材质 | `material_ingredient` | String |
| 44 | `materialBrand` | 品牌 | `material_brand` | String |
| 45 | `materialDetail` | 物料详细描述 | `material_detail` | String |
| 46 | `materialExplain` | 物料描述 | `material_explain` | String |
| 47 | `materialQualifyStandard` | 质量要求 | `material_qualify_standard` | String |
| 48 | `receiveAddress` | 收货地址 | `receive_address` | String |
| 49 | `reqDesc` | 需求详情描述 | `req_desc` | String |
| 50 | `reqOrgId` | 需求组织ID | `req_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 51 | `reqOrgName` | 需求组织名称 | `req_org_name` | String |
| 52 | `reqTime` | 需求时间 | `req_time` | Date |
| 53 | `num` | 需求数量 | `num` | Decimal |
| 54 | `unit` | 单位 | `unit` | String |
| 55 | `unitid` | 单位id | `unitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 56 | `purchaseType` | 采购类型 | `purchase_type` | String |
| 57 | `billStates` | 状态 | `bill_states` | String |
| 58 | `conversionTaxSinglePrice` | 换算后含税单价 | `conversion_tax_single_price` | Decimal |
| 59 | `conversionTotalPrice` | 换算后无税总价 | `conversion_total_price` | Decimal |
| 60 | `guaranteedSupply` | 保供量 | `guaranteed_supply` | String |
| 61 | `guaranteedSupplyLimit` | 保供量下限 | `guaranteed_supply_limit` | Decimal |
| 62 | `conversionTaxTotalPrice` | 换算后含税总价 | `conversion_tax_total_price` | Decimal |
| 63 | `orderNo` | 序号(外系统编号) | `order_no` | String |
| 64 | `serviceTime` | 服务时间 | `service_time` | Date |
| 65 | `servicePlace` | 服务地点 | `service_place` | String |
| 66 | `rateTime` | 发布汇率日期 | `rate_time` | DateTime |
| 67 | `serviceContent` | 服务内容 | `service_content` | String |
| 68 | `serviceDemand` | 服务要求 | `service_demand` | String |
| 69 | `openRateTime` | 开标汇率日期 | `open_rate_time` | DateTime |
| 70 | `diagramNo` | 图纸号 | `diagram_no` | String |
| 71 | `currencyId` | 报价币种ID | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 72 | `profession` | 涉及专业 | `profession` | String |
| 73 | `days` | 工期 | `days` | String |
| 74 | `assetOrgId` | 组织ID | `asset_org_id` | String |
| 75 | `conversionSinglePrice` | 换算后无税单价 | `conversion_single_price` | Decimal |
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
| 90 | `pushRateValue` | 估算汇率 | `push_rate_value` | Decimal |
| 91 | `openRateValue` | 开标汇率值 | `open_rate_value` | Decimal |
| 92 | `repairRequirements` | 主要修复工艺要求 | `repair_requirements` | String |
| 93 | `standard` | 验收标准及方法 | `standard` | String |
| 94 | `requirement` | 对承修方的要求 | `requirement` | String |
| 95 | `producer` | 产地 | `producer` | String |
| 96 | `manufacturer` | 制造商 | `manufacturer` | String |
| 97 | `supMaterialIngredient` | 供应商材质 | `sup_material_ingredient` | String |
| 98 | `supSingleWeight` | 供应商单重 | `sup_single_weight` | Decimal |
| 99 | `supProducer` | 供应商产地 | `sup_producer` | String |
| 100 | `supManufacturer` | 供应商制造商 | `sup_manufacturer` | String |
| 101 | `supLifetime` | 供应商使用寿命 | `sup_lifetime` | String |
| 102 | `supTotalWeight` | 供应商总重 | `sup_total_weight` | Decimal |
| 103 | `erpSourceId` | 外系统id | `erp_source_id` | String |
| 104 | `erpSourceBid` | 外系统子表id | `erp_source_bid` | String |
| 105 | `referPrice` | 参考单价 | `refer_price` | Decimal |
| 106 | `lastPrice` | 上期价格 | `last_price` | Decimal |
| 107 | `highestPrice` | 最高限价 | `highest_price` | Decimal |
| 108 | `bidBottom` | 标底 | `bid_bottom` | Decimal |
| 109 | `planPrice` | 计划价格 | `plan_price` | Decimal |
| 110 | `startDate` | 开始时间 | `start_date` | Date |
| 111 | `endDate` | 结束时间 | `end_date` | Date |
| 112 | `notes` | 备注 | `notes` | String |
| 113 | `bidCount` | 投标数量 | `bid_count` | Decimal |
| 114 | `singlePrice` | 不含税单价 | `single_price` | Decimal |
| 115 | `tax` | 税额 | `tax` | Decimal |
| 116 | `taxSinglePrice` | 含税单价 | `tax_single_price` | Decimal |
| 117 | `totalPrice` | 不含税总价 | `total_price` | Decimal |
| 118 | `taxTotalPrice` | 含税总价 | `tax_total_price` | Decimal |
| 119 | `demandBillId` | 标段包物料ID | `demand_bill_id` | 3fe14cdc-d32f-4161-80ad-994d5f6c57e3 |
| 120 | `supplydocId` | 供应商档案ID | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 121 | `isNegotiate` | 是否谈判 0否,1是 | `is_negotiate` | Integer |
| 122 | `rate` | 税率 | `rate` | Decimal |
| 123 | `singlePriceSecret` | 单价加密 | `single_price_secret` | String |
| 124 | `priceWay` | 报价方式 | `price_way` | String |
| 125 | `discountPrice` | 折算报价 | `discount_price` | Decimal |
| 126 | `currency` | 币种 | `currency` | String |
| 127 | `totalDiscountPrice` | 折算报价总价 | `total_discount_price` | Decimal |
| 128 | `supplyCount` | 保供家数 | `supply_count` | Decimal |
| 129 | `subitem` | 分项 | `subitem` | Integer |
| 130 | `backup` | 分项备注 | `backup` | String |
| 131 | `uniteBidderId` | 联合体投标人租户Id | `unite_bidder_id` | Long |
| 132 | `uniteBidderName` | 联合体投标人名称 | `unite_bidder_name` | String |
| 133 | `bidCountSecret` | 投标数量加密 | `bid_count_secret` | String |
| 134 | `notaxSinglePrice` | 无税单价 | `notax_single_price` | Decimal |
| 135 | `notaxTotalPrice` | 无税总价 | `notax_total_price` | Decimal |
| 136 | `fileId` | 附件 | `file_id` | String |
| 137 | `taxDiscountPrice` | 含税折算报价 | `tax_discount_price` | Decimal |
| 138 | `taxSinglePriceSecret` | 含税单价加密 | `tax_single_price_secret` | String |
| 139 | `natTax` | 换算后税额 | `nat_tax` | Decimal |
| 140 | `encryptInfoKey` | 供应商投标报价CA加密密钥密文 | `encrypt_info_key` | String |
| 141 | `encryptInfo` | 结构化加密密文 | `encrypt_info` | String |
| 142 | `isBidMaterial` | 物料是否投标 | `is_bid_material` | Integer |
| 143 | `costs` | 投标单物料子表成本项明细孙表 | `` | efd1d7e1-4710-4419-a989-50f7eff2dca9 |
| 144 | `defines` | 投标单物料子表自定义项表 | `` | 196a2733-21ca-4179-999c-a90c96d8f807 |
| 145 | `steps` | 标段物料价格梯度明细 | `` | e50a695f-6794-4a63-bd2b-2ff8becadb91 |

---

## 关联属性（20个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `costs` | 投标单物料子表成本项明细孙表 | `lawbid.bid.BiddingMaterialDetailCostVO` | None | true |
| 2 | `costQuoteGroupId` | 成本项报价组id | `aa.costquote.CpuCostPricing` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `purUnitId` | 采购单位id | `pc.unit.Unit` | Service |  |
| 5 | `biddingId` | 投标报价单ID | `lawbid.bid.BiddingVO` | None | true |
| 6 | `materialId` | 物料id | `pc.product.Product` | Service |  |
| 7 | `bidProjectId` | 采购项目ID | `lawbid.project.LawbidProject` | None |  |
| 8 | `steps` | 标段物料价格梯度明细 | `lawbid.bid.BiddingMaterialStep` | None | true |
| 9 | `dimensionPricingId` | 报价ID | `aa.quotation.BiQuotationHead` | Service |  |
| 10 | `defines` | 投标单物料子表自定义项表 | `lawbid.bid.BiddingMaterialDetailFreeDefine` | None | true |
| 11 | `demandBillId` | 标段包物料ID | `lawbid.section.LawbidSectionMaterial` | None |  |
| 12 | `biddingMaterialDetailVOFreeCharacters` | 投标报价表体自由项特征组 | `lawbid.bid.BiddingMaterialDetailVOFreeCharacters` | None |  |
| 13 | `supplydocId` | 供应商档案ID | `aa.vendor.Vendor` | Service |  |
| 14 | `unitid` | 单位id | `pc.unit.Unit` | Service |  |
| 15 | `biddingMaterialDetailVODefineCharacter` | 投标报价表体自定义项 | `lawbid.bid.BiddingMaterialDetailVODefineCharacter` | None |  |
| 16 | `currencyId` | 报价币种ID | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 17 | `reqOrgId` | 需求组织ID | `org.func.BaseOrg` | Service |  |
| 18 | `taxRateId` | 税率ID | `archive.taxArchives.TaxRateArchive` | Service |  |
| 19 | `bidSectionId` | 标段包ID | `lawbid.section.LawbidSection` | None |  |
| 20 | `mainUnitId` | 主单位id | `pc.unit.Unit` | Service |  |
