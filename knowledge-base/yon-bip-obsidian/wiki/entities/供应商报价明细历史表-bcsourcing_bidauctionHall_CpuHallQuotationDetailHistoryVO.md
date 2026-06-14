---
tags: ["BIP", "元数据", "数据字典", "ycSouring", "bcsourcing.bidauctionHall.CpuHallQuotationDetailHistoryVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 供应商报价明细历史表 (`bcsourcing.bidauctionHall.CpuHallQuotationDetailHistoryVO`)

> ycSouring | 物理表：`cpu_hall_quotation_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商报价明细历史表 |
| 物理表 | `cpu_hall_quotation_detail` |
| domain/服务域 | `yonbip-cpu-bcsourcing` |
| schema | `cpu_pubbiz_sourcing` |
| 所属应用 | `ycSouring` |
| 构建时间 | `2026-06-04 23:43:08.0170` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（64个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `materialName` | 物料名称 | `material_name` | String |
| 2 | `materialCode` | 物料编码 | `material_code` | String |
| 3 | `materialSize` | 规格型号 | `material_size` | String |
| 4 | `demandNum` | 需求数量 | `demand_num` | Decimal |
| 5 | `demandCompany` | 需求公司 | `demand_company` | String |
| 6 | `biddingCount` | 报价数量 | `bidding_count` | Decimal |
| 7 | `bidMainCount` | 报价主数量 | `bid_main_count` | Decimal |
| 8 | `currency_id` | 报价币种 | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 9 | `gatherHallId` | 主大厅id | `gather_hall_id` | 35362db2-287c-4497-8f9d-ae4ce4c9de77 |
| 10 | `hQuotationHistoryDetailDefineCharacter` | 竞拍报价明细历史自定义项 | `define_character_id` | 0c426204-c22d-4015-9ff9-ed710aa1ac6c |
| 11 | `hQuotationHistoryDetailFreeCharacteristics` | 竞拍报价明细历史自由项特征组 | `free_characters_id` | 8a2d44bc-432b-41e1-b581-094d685027f0 |
| 12 | `invPriceExchRate` | 计价换算率 | `inv_price_exch_rate` | Decimal |
| 13 | `invPurExchRateType` | 采购换算率类型 | `inv_pur_exch_rate_type` | Short |
| 14 | `mainCount` | 主数量 | `main_count` | Decimal |
| 15 | `mainUnitId` | 主单位id | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 16 | `mainUnitName` | 主单位 | `main_unit_name` | String |
| 17 | `purCount` | 采购数量 | `pur_count` | Decimal |
| 18 | `purUnitId` | 采购单位id | `pur_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 19 | `purUnitName` | 采购单位 | `pur_unit_name` | String |
| 20 | `recentQuotationDetailId` | 最新报价子表id | `recent_quotation_detail_id` | da829e48-cdb2-4ad8-b83a-3e9d892200fe |
| 21 | `recentQuotationId` | 最新报价主表id | `recent_quotation_id` | 66390445-85fd-443a-9ef4-0e6b2ec2e908 |
| 22 | `vendorTenantId` | 供应商租户id | `vendor_tenant_id` | String |
| 23 | `taxRateId` | 税率Id | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 24 | `guidingTaxRateId` | 指导税率主键 | `guiding_tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 25 | `rowNo` | 行号 | `row_no` | Decimal |
| 26 | `invPriceExchRateDen` | 计价换算率分母 | `inv_price_exch_rate_den` | Decimal |
| 27 | `invPriceExchRateNum` | 计价换算率分子 | `inv_price_exch_rate_num` | Decimal |
| 28 | `invPurExchRateDen` | 采购换算率分母 | `inv_pur_exch_rate_den` | Decimal |
| 29 | `invPurExchRateNum` | 采购换算率分子 | `inv_pur_exch_rate_num` | Decimal |
| 30 | `baseData` | 基准数据标识 | `base_data` | Integer |
| 31 | `bidInitialPrice` | 起步单价 | `bidInitial_price` | Decimal |
| 32 | `reducedRatio` | 比率 | `reduced_ratio` | Decimal |
| 33 | `discountTaxType` | 扣税类别 | `discount_tax_type` | String |
| 34 | `priceMark` | 价格标识 | `price_mark` | Short |
| 35 | `tax` | 税额 | `tax` | Decimal |
| 36 | `materialId` | 物料id | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 37 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 38 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 39 | `pubts` | 时间戳 | `pubts` | DateTime |
| 40 | `invPurExchRate` | 采购换算率 | `inv_pur_exch_rate` | Decimal |
| 41 | `bidNum` | 投标数量 | `bid_num` | Decimal |
| 42 | `unitId` | 单位id | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 43 | `numberUnit` | 单位 | `number_unit` | String |
| 44 | `demandTime` | 需求日期 | `demand_time` | DateTime |
| 45 | `tax_rate` | 税率(%) | `tax_rate` | Decimal |
| 46 | `guidingTaxRate` | 指导税率 | `guiding_tax_rate` | Decimal |
| 47 | `taxPrice` | 单价(含税) | `tax_price` | Decimal |
| 48 | `taxMoney` | 金额(含税) | `tax_money` | Decimal |
| 49 | `shareRate` | 分摊比例 | `share_rate` | Decimal |
| 50 | `price` | 单价(无税) | `price` | Decimal |
| 51 | `money` | 金额(无税) | `money` | Decimal |
| 52 | `receiveAddress` | 收货地址 | `receive_address` | String |
| 53 | `demandDesc` | 详情描述 | `demand_desc` | String |
| 54 | `id` | ID | `id` | String |
| 55 | `ts` | 默认值 | `ts` | DateTime |
| 56 | `dr` | dr | `dr` | Short |
| 57 | `enterpriseId` | 租户id | `enterprise_id` | Long |
| 58 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 59 | `yTenantId` | 用户中心租户id | `ytenant_id` | String |
| 60 | `hallId` | 竞拍大厅id | `hall_id` | ea14742a-4b23-4790-8ed0-91d03878c335 |
| 61 | `ruleMaterialId` | 竞拍物料行id | `rule_material_id` | 4e020ce8-293e-4091-a615-ad1729c786ba |
| 62 | `demandBillId` | 业务单据子表id | `demand_bill_id` | Long |
| 63 | `hallQuotationId` | 报价表id | `hall_quotation_id` | c0b51096-cc84-48ff-a4db-4d6e1b420b6a |
| 64 | `highPrice` | 最高限价 | `high_price` | Decimal |

---

## 关联属性（16个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `hQuotationHistoryDetailDefineCharacter` | 竞拍报价明细历史自定义项 | `bcsourcing.bidauctionHall.CpuHallQuotationHistoryDetailDefineCharacter` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `purUnitId` | 采购单位id | `pc.unit.Unit` | Service |  |
| 4 | `ruleMaterialId` | 竞拍物料行id | `bcsourcing.bidauctionHall.CpuBidauctionRuleMaterialVO` | None |  |
| 5 | `materialId` | 物料id | `pc.product.Product` | Service |  |
| 6 | `recentQuotationId` | 最新报价主表id | `bcsourcing.bidauctionHall.CpuHallQuotationVO` | None |  |
| 7 | `hQuotationHistoryDetailFreeCharacteristics` | 竞拍报价明细历史自由项特征组 | `bcsourcing.bidauctionHall.CpuHallQuotationHistoryDetailFreeCharacteristics` | None |  |
| 8 | `guidingTaxRateId` | 指导税率主键 | `archive.taxArchives.TaxRateArchive` | Service |  |
| 9 | `hallId` | 竞拍大厅id | `bcsourcing.bidauctionHall.BidauctionSubHallVO` | None |  |
| 10 | `gatherHallId` | 主大厅id | `bcsourcing.bidauctionHall.BidauctionMainHallVO` | None |  |
| 11 | `unitId` | 单位id | `pc.unit.Unit` | Service |  |
| 12 | `recentQuotationDetailId` | 最新报价子表id | `bcsourcing.bidauctionHall.CpuHallQuotationDetailVO` | None |  |
| 13 | `taxRateId` | 税率Id | `archive.taxArchives.TaxRateArchive` | Service |  |
| 14 | `currency_id` | 报价币种 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 15 | `hallQuotationId` | 报价表id | `bcsourcing.bidauctionHall.CpuHallQuotationHistoryVO` | None | true |
| 16 | `mainUnitId` | 主单位id | `pc.unit.Unit` | Service |  |
