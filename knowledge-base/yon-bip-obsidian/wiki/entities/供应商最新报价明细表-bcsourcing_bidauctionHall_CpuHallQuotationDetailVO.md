---
tags: ["BIP", "元数据", "数据字典", "ycSouring", "bcsourcing.bidauctionHall.CpuHallQuotationDetailVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 供应商最新报价明细表 (`bcsourcing.bidauctionHall.CpuHallQuotationDetailVO`)

> ycSouring | 物理表：`cpu_hall_quotation_detail_recent`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商最新报价明细表 |
| 物理表 | `cpu_hall_quotation_detail_recent` |
| domain/服务域 | `yonbip-cpu-bcsourcing` |
| schema | `cpu_pubbiz_sourcing` |
| 所属应用 | `ycSouring` |
| 构建时间 | `2026-06-04 23:44:15.1700` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（80个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `materialCode` | 物料编码 | `material_code` | String |
| 2 | `materialSize` | 规格型号 | `material_size` | String |
| 3 | `demandCompany` | 需求公司 | `demand_company` | String |
| 4 | `billStatus` | 单据状态 | `bill_status` | String |
| 5 | `id` | ID | `id` | String |
| 6 | `enterpriseId` | 租户id | `enterprise_id` | Long |
| 7 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 8 | `yTenantId` | 用户中心租户id | `ytenant_id` | String |
| 9 | `hallId` | 竞拍大厅id | `hall_id` | ea14742a-4b23-4790-8ed0-91d03878c335 |
| 10 | `ruleMaterialId` | 竞拍物料行id | `rule_material_id` | 4e020ce8-293e-4091-a615-ad1729c786ba |
| 11 | `baseData` | 物料id | `base_data` | Integer |
| 12 | `demandBillId` | 业务单据子表id | `demand_bill_id` | Long |
| 13 | `hallQuotationId` | 报价表 | `hall_quotation_id` | 66390445-85fd-443a-9ef4-0e6b2ec2e908 |
| 14 | `materialName` | 标的物名称 | `material_name` | String |
| 15 | `demandNum` | 需求数量 | `demand_num` | Decimal |
| 16 | `gatherHallId` | 汇总大厅 | `gather_hall_id` | 35362db2-287c-4497-8f9d-ae4ce4c9de77 |
| 17 | `bidNum` | 投标数量 | `bid_num` | Decimal |
| 18 | `mainCount` | 主数量 | `main_count` | Decimal |
| 19 | `priceRange` | 报价幅度 | `price_range` | Decimal |
| 20 | `initTotalMoney` | 初始报价 | `init_total_money` | Decimal |
| 21 | `numberUnit` | 单位 | `number_unit` | String |
| 22 | `purCount` | 采购数量 | `pur_count` | Decimal |
| 23 | `shareRate` | 分摊比例(%) | `share_rate` | Decimal |
| 24 | `invPurExchRate` | 采购换算率 | `inv_pur_exch_rate` | Decimal |
| 25 | `tax_rate` | 税率(%) | `tax_rate` | Decimal |
| 26 | `invPriceExchRate` | 计价换算率 | `inv_price_exch_rate` | Decimal |
| 27 | `taxPrice` | 单价(含税) | `tax_price` | Decimal |
| 28 | `invPurExchRateType` | 采购换算率类型 | `inv_pur_exch_rate_type` | Short |
| 29 | `taxMoney` | 金额(含税) | `tax_money` | Decimal |
| 30 | `price` | 单价(无税) | `price` | Decimal |
| 31 | `money` | 金额(无税) | `money` | Decimal |
| 32 | `purUnitId` | 采购单位主键 | `pur_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 33 | `mainUnitId` | 主单位主键 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 34 | `biddingCount` | 报价数量 | `bidding_count` | Decimal |
| 35 | `bidMainCount` | 报价主数量 | `bid_main_count` | Decimal |
| 36 | `guidingTaxRate` | 指导税率 | `guiding_tax_rate` | Decimal |
| 37 | `cpuHallQuotationDetailDefineCharacter` | 表体自定义项特征 | `define_character_id` | bdda755e-70d9-4003-ac08-fbcc40f0904a |
| 38 | `cpuHallQuotationDetailFreeCharacteristics` | 表体自由项特征组 | `free_characters_id` | fb095d6e-0183-4f22-b729-eeb087171985 |
| 39 | `bLast` | 有效基础数据 | `bLast` | Integer |
| 40 | `biddingStatus` | 是否中标 | `bidding_status` | String |
| 41 | `applyStatus` | 是否允许进入新一轮竞拍 | `apply_status` | String |
| 42 | `bidInitialPrice` | 起步单价 | `bidInitial_price` | Decimal |
| 43 | `bidTime` | 报价时间 | `bid_time` | DateTime |
| 44 | `bodydefines` | 竞价大厅供应商报价明细自定义项 | `` | bf08be87-3b9e-454e-b0dd-328b7e37d8bd |
| 45 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 46 | `buyerTenantId` | 采购商租户id | `buyer_tenant_id` | String |
| 47 | `controlGuidePrice` | 竞拍控制指导价 | `control_guide_price` | Decimal |
| 48 | `currencyId` | 报价币种 | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 49 | `delayedQuoteCount` | 延时已报价次数 | `delayed_quote_count` | Integer |
| 50 | `demandDesc` | 需求详情描述 | `demand_desc` | String |
| 51 | `demandTime` | 需求时间 | `demand_time` | DateTime |
| 52 | `discountTaxType` | 扣税类别 | `discount_tax_type` | String |
| 53 | `dominantPrice` | 优势价 | `dominant_price` | String |
| 54 | `dr` | dr | `dr` | Short |
| 55 | `firstMoney` | 第一名出价 | `first_money` | Decimal |
| 56 | `guidePrice` | 指导价 | `guide_price` | Decimal |
| 57 | `guidingTaxRateId` | 指导税率主键 | `guiding_tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 58 | `highPrice` | 最高限价 | `high_price` | Decimal |
| 59 | `historyQuotationId` | 历史报价主表id | `history_quotation_id` | Long |
| 60 | `invPriceExchRateDen` | 计价换算率分母 | `inv_price_exch_rate_den` | Decimal |
| 61 | `invPriceExchRateNum` | 计价换算率分子 | `inv_price_exch_rate_num` | Decimal |
| 62 | `invPurExchRateDen` | 采购换算率分母 | `inv_pur_exch_rate_den` | Decimal |
| 63 | `invPurExchRateNum` | 采购换算率分子 | `inv_pur_exch_rate_num` | Decimal |
| 64 | `latestTotalMoney` | 竞价大厅最新报价 | `latest_total_money` | Decimal |
| 65 | `mainUnitName` | 主单位 | `main_unit_name` | String |
| 66 | `materialId` | 物料id | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 67 | `priceMark` | 价格标识 | `price_mark` | Short |
| 68 | `pubts` | 时间戳 | `pubts` | DateTime |
| 69 | `purUnitName` | 采购单位 | `pur_unit_name` | String |
| 70 | `receiveAddress` | 收货地址 | `receive_address` | String |
| 71 | `reducedRatio` | 比率 | `reduced_ratio` | Decimal |
| 72 | `rowNo` | 行号 | `row_no` | Decimal |
| 73 | `sourceChildId` | 业务单据子表id | `source_child_id` | Long |
| 74 | `tax` | 税额 | `tax` | Decimal |
| 75 | `taxRateId` | 税率Id | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 76 | `totalQuoteCount` | 已报价总次数 | `total_quote_count` | Integer |
| 77 | `ts` | 默认值 | `ts` | DateTime |
| 78 | `unitId` | 单位id | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 79 | `vendorTenantId` | 供应商租户id | `vendor_tenant_id` | String |
| 80 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（15个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `purUnitId` | 采购单位主键 | `pc.unit.Unit` | Service |  |
| 3 | `ruleMaterialId` | 竞拍物料行id | `bcsourcing.bidauctionHall.CpuBidauctionRuleMaterialVO` | None |  |
| 4 | `materialId` | 物料id | `pc.product.Product` | Service |  |
| 5 | `cpuHallQuotationDetailFreeCharacteristics` | 表体自由项特征组 | `bcsourcing.bidauctionHall.CpuHallQuotationDetailFreeCharacteristics` | None |  |
| 6 | `bodydefines` | 竞价大厅供应商报价明细自定义项 | `bcsourcing.bidauctionHall.CpuHallQuotationDetailFreedefine` | None | true |
| 7 | `cpuHallQuotationDetailDefineCharacter` | 表体自定义项特征 | `bcsourcing.bidauctionHall.CpuHallQuotationDetailDefineCharacter` | None |  |
| 8 | `guidingTaxRateId` | 指导税率主键 | `archive.taxArchives.TaxRateArchive` | Service |  |
| 9 | `hallId` | 竞拍大厅id | `bcsourcing.bidauctionHall.BidauctionSubHallVO` | None |  |
| 10 | `gatherHallId` | 汇总大厅 | `bcsourcing.bidauctionHall.BidauctionMainHallVO` | None |  |
| 11 | `unitId` | 单位id | `pc.unit.Unit` | Service |  |
| 12 | `currencyId` | 报价币种 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 13 | `taxRateId` | 税率Id | `archive.taxArchives.TaxRateArchive` | Service |  |
| 14 | `hallQuotationId` | 报价表 | `bcsourcing.bidauctionHall.CpuHallQuotationVO` | None | true |
| 15 | `mainUnitId` | 主单位主键 | `pc.unit.Unit` | Service |  |
