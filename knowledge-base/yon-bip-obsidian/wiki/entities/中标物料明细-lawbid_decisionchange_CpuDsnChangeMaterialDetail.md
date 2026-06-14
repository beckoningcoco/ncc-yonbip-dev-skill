---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.decisionchange.CpuDsnChangeMaterialDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 中标物料明细 (`lawbid.decisionchange.CpuDsnChangeMaterialDetail`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_dsn_change_material_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 中标物料明细 |
| 物理表 | `cpu_dsn_change_material_detail` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:00:13.4990` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2026-05-22 23:55:02:000

## 依赖接口（5个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 3 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 4 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 5 | 定标变更物料子表接口 | `lawdecision.itf.ICpuDsnChangeMaterialDetail` | 202 |

---

## 直接属性（126个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `decisionMaterialId` | 采购结果物料行id | `dsn_material_id` | 23f77ada-9b2b-43f8-963c-0d689e9b2464 |
| 2 | `id` | id | `id` | Long |
| 3 | `decisionChangeId` | 变更单主键 | `decision_change_id` | d8109c8f-5f05-450c-933b-1cb6591705e0 |
| 4 | `enterpriseId` | 企业 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 5 | `consignationId` | 委托单主键 | `consignation_id` | Long |
| 6 | `demandOrg` | 需求组织 | `demand_org` | String |
| 7 | `orderNo` | 序号 | `order_no` | String |
| 8 | `purchaseSolutionNo` | 采购方案号 | `purchase_solution_no` | String |
| 9 | `materialDetail` | 物料描述 | `material_detail` | String |
| 10 | `sequenceNo` | 顺序号 | `sequence_no` | String |
| 11 | `reqOrgId` | 需求公司主键 | `req_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 12 | `reqOrgNameGroup` | 需求公司分组 | `req_org_name_group` | String |
| 13 | `reqOrgNameGroupId` | 需求公司分组id | `req_org_name_group_id` | String |
| 14 | `reqTime` | 需求日期 | `req_time` | Date |
| 15 | `materialIngredient` | 材质 | `material_ingredient` | String |
| 16 | `purchaseCount` | 采购数量 | `purchase_count` | Decimal |
| 17 | `materialBrand` | 品牌 | `material_brand` | String |
| 18 | `receiveAddress` | 收货地址 | `receive_address` | String |
| 19 | `materialQualifyStandard` | 质量要求 | `material_qualify_standard` | String |
| 20 | `purCategory` | 采购类别 | `pur_category` | String |
| 21 | `bidNum` | 投标数量 | `bid_num` | Decimal |
| 22 | `taxRecentPrice` | 投标含税单价 | `tax_recent_price` | Decimal |
| 23 | `taxBidPrice` | 投标含税单价 | `tax_bid_price` | Decimal |
| 24 | `lastPrice` | 上期价格 | `last_price` | Decimal |
| 25 | `rate` | 投标税率（%） | `rate` | Decimal |
| 26 | `referPrice` | 参考单价 | `refer_price` | Decimal |
| 27 | `bidPrice` | 投标无税单价 | `bid_price` | Decimal |
| 28 | `recentPrice` | 投标无税单价 | `recent_price` | Decimal |
| 29 | `openRateValue` | 汇率 | `open_rate_value` | Decimal |
| 30 | `conversionTaxSinglePrice` | 换算后含税单价 | `conversion_tax_single_price` | Decimal |
| 31 | `winRatio` | 中标比例 | `win_ratio` | Integer |
| 32 | `conversionSinglePrice` | 换算后无税单价 | `conversion_single_price` | Decimal |
| 33 | `highestPrice` | 最高限价 | `highest_price` | Decimal |
| 34 | `winNum` | 中标数量 | `win_num` | Decimal |
| 35 | `bidBottom` | 标底 | `bid_bottom` | Decimal |
| 36 | `taxWinPrice` | 中标含税单价 | `tax_win_price` | Decimal |
| 37 | `planPrice` | 计划价格 | `plan_price` | Decimal |
| 38 | `winRate` | 中标税率（%） | `win_rate` | Decimal |
| 39 | `recommendCount` | 推荐家数 | `recommend_count` | Decimal |
| 40 | `winPrice` | 中标无税单价 | `win_price` | Decimal |
| 41 | `supplyCount` | 保供家数 | `supply_count` | Decimal |
| 42 | `taxTotalPrice` | 中标含税总价 | `tax_total_price` | Decimal |
| 43 | `state` | 是否中标 | `state` | Integer |
| 44 | `startDate` | 开始时间 | `start_date` | Date |
| 45 | `costQuoteGroupId` | 成本项报价组id | `cost_quote_group_id` | Long |
| 46 | `totalPrice` | 中标无税总价 | `total_price` | Decimal |
| 47 | `endDate` | 结束时间 | `end_date` | Date |
| 48 | `currencyId` | 币种主键" | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 49 | `conversionTaxWinPrice` | 换算后中标含税单价 | `conversion_tax_win_price` | Decimal |
| 50 | `deliveryPlace` | 交货地点 | `delivery_place` | String |
| 51 | `conversionWinPrice` | 换算后中标无税单价 | `conversion_win_price` | Decimal |
| 52 | `conversionTaxTotalWinPrice` | 换算后中标含税总价 | `conversion_tax_total_win_price` | Decimal |
| 53 | `winTax` | 中标税额 | `win_tax` | Decimal |
| 54 | `erpSourceId` | 外系统子表主键 | `erp_source_id` | String |
| 55 | `conversionTotalWinPrice` | 换算后中标无税总价 | `conversion_total_win_price` | Decimal |
| 56 | `erpSourceBid` | 外系统子表行主键 | `erp_source_bid` | String |
| 57 | `openRateTime` | 汇率日期 | `open_rate_time` | DateTime |
| 58 | `notes` | 备注 | `notes` | String |
| 59 | `materialDetailId` | 原燃材料需求清单主键 | `material_detail_id` | Long |
| 60 | `supplierRate` | 推供应链税率 | `supplier_rate` | 01e7528c-c35c-4d33-b2aa-382b4b4f4534 |
| 61 | `rowNo` | 行号 | `row_no` | Decimal |
| 62 | `conversionWinTax` | 换算后中标税额 | `conversion_win_tax` | Decimal |
| 63 | `lowestPrice` | 最低投标单价 | `lowest_price` | Decimal |
| 64 | `supplydocId` | 拟中标供应商 | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 65 | `supEnterpriseId` | 租户 | `sup_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 66 | `demandBillId` | 标段物料主键 | `demand_bill_id` | 3fe14cdc-d32f-4161-80ad-994d5f6c57e3 |
| 67 | `sourceType` | 来源单据类型 | `source_type` | String |
| 68 | `failBidCause` | 流标原因 | `fail_bid_cause` | String |
| 69 | `ifcancel` | 是否作废 | `ifcancel` | Integer |
| 70 | `cancelSegment` | 流标环节 | `cancel_segment` | Integer |
| 71 | `priceWay` | 报价方式 | `price_way` | String |
| 72 | `discountPrice` | 折算报价 | `discount_price` | Decimal |
| 73 | `currency` | 币种 | `currency` | String |
| 74 | `subitem` | 分项 | `subitem` | Integer |
| 75 | `coefficient` | 换算系数 | `coefficient` | Decimal |
| 76 | `discountTotalPrice` | 折算人民币总价 | `discount_total_price` | Decimal |
| 77 | `backup` | 分项备注 | `backup` | String |
| 78 | `reqId` | 采购需求主键 | `req_id` | bac52eb7-97d5-4c52-8a52-cc1d9bf96c66 |
| 79 | `biddingMaterialId` | 投标物料主键 | `bidding_material_id` | 102df149-dc26-44a9-8fbe-02be312d8a34 |
| 80 | `markMaterialId` | 汇总报价单表体主键 | `mark_material_id` | 8c4341a0-e9a3-4c70-9df2-525171b82f42 |
| 81 | `uniteBidderId` | 联合体投标人租户主键 | `unite_bidder_id` | Long |
| 82 | `uniteBidderName` | 联合体投标人名称 | `unite_bidder_name` | String |
| 83 | `isContract` | 是否推合同标识 | `is_contract` | Integer |
| 84 | `dimensionPricingId` | 报价ID | `dimension_pricing_id` | efd1e4c5-9da5-490b-acfc-9b097f70f890 |
| 85 | `materialId` | 物料主键 | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 86 | `winCount` | 中标数量 | `win_count` | Decimal |
| 87 | `invPurExchRate` | 采购换算率 | `inv_pur_exch_rate` | Decimal |
| 88 | `invPriceExchRate` | 计价换算率 | `inv_price_exch_rate` | Decimal |
| 89 | `bidCount` | 投标数量 | `bid_count` | Decimal |
| 90 | `bidMainCount` | 投标主数量 | `bid_main_count` | Decimal |
| 91 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 92 | `conversionTaxTotalPrice` | 换算后含税金额 | `conversion_tax_total_price` | Decimal |
| 93 | `conversionTotalPrice` | 换算后不含税金额 | `conversion_total_price` | Decimal |
| 94 | `dr` | 逻辑删除标记 | `dr` | Short |
| 95 | `firstUpLineno` | 源头单据行号 | `first_up_line_no` | Integer |
| 96 | `firstsource` | 源头单据类型 | `first_source` | String |
| 97 | `firstsourceautoid` | 源头单据子表id | `first_source_auto_id` | Long |
| 98 | `firstsourceid` | 源头单据主表id | `first_source_id` | Long |
| 99 | `firstupcode` | 源头单据号 | `first_up_code` | String |
| 100 | `invPriceExchRateDen` | 计价换算率分母 | `inv_price_exch_rate_den` | Decimal |
| 101 | `invPriceExchRateNum` | 计价换算率分子 | `inv_price_exch_rate_num` | Decimal |
| 102 | `invPurExchRateDen` | 采购换算率分母 | `inv_pur_exch_rate_den` | Decimal |
| 103 | `invPurExchRateNum` | 采购换算率分子 | `inv_pur_exch_rate_num` | Decimal |
| 104 | `invPurExchRateType` | 采购换算率类型 | `inv_pur_exch_rate_type` | Short |
| 105 | `mainCount` | 主数量 | `main_count` | Decimal |
| 106 | `mainUnitId` | 主单位主键 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 107 | `materialClassId` | 物料分类主键 | `material_class_id` | Long |
| 108 | `materialClassName` | 物料分类名称 | `material_class_name` | String |
| 109 | `materialModel` | 物料型号 | `material_model` | String |
| 110 | `materialName` | 工程名称 | `material_name` | String |
| 111 | `materialNo` | 工程编码 | `material_no` | String |
| 112 | `materialSpecification` | 规格 | `material_specification` | String |
| 113 | `measureUnit` | 计价单位主键 | `measure_unit` | String |
| 114 | `openRateValueOps` | 开标汇率折算方式 | `open_rate_value_ops` | ExchangeRateMethod |
| 115 | `pubts` | 时间戳 | `pubts` | DateTime |
| 116 | `purCount` | 采购数量 | `pur_count` | Decimal |
| 117 | `purUnitId` | 采购单位主键 | `pur_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 118 | `rateTypeId` | 汇率类型 | `rate_type_id` | String |
| 119 | `reqOrgName` | 需求公司 | `req_org_name` | 14302233-1394-4a70-94e1-bed51636f312 |
| 120 | `steps` | 定标单物料价格梯度明细 | `` | a4e3d12c-db79-4ef0-ab7e-02776ad0ac55 |
| 121 | `supEnterpriseName` | 供应商企业名称 | `sup_enterprise_name` | String |
| 122 | `supplydocName` | 拟中标供应商 | `supplydoc_name` | String |
| 123 | `ts` | 时间戳 | `ts` | DateTime |
| 124 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 125 | `winMainCount` | 中标主数量 | `win_main_count` | Decimal |
| 126 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（19个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `decisionChangeId` | 变更单主键 | `lawbid.decisionchange.CpuDecisionChange` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `purUnitId` | 采购单位主键 | `pc.unit.Unit` | Service |  |
| 4 | `markMaterialId` | 汇总报价单表体主键 | `lawbid.scoringdata.ScoringDataMarkMateriel` | None |  |
| 5 | `materialId` | 物料主键 | `pc.product.Product` | Service |  |
| 6 | `decisionMaterialId` | 采购结果物料行id | `lawbid.decisionresult.CpuDsnMaterialDetail` | None |  |
| 7 | `steps` | 定标单物料价格梯度明细 | `lawbid.decisionchange.DsnChangeMaterialStep` | None | true |
| 8 | `dimensionPricingId` | 报价ID | `aa.quotation.BiQuotationHead` | Service |  |
| 9 | `reqId` | 采购需求主键 | `sourcing.pureq.IpuPuReq` | Service |  |
| 10 | `reqOrgName` | 需求公司 | `org.func.BaseOrg` | Service |  |
| 11 | `demandBillId` | 标段物料主键 | `lawbid.section.LawbidSectionMaterial` | None |  |
| 12 | `supplierRate` | 推供应链税率 | `bd.taxrate.TaxRateVO` | Service |  |
| 13 | `supplydocId` | 拟中标供应商 | `aa.vendor.Vendor` | Service |  |
| 14 | `biddingMaterialId` | 投标物料主键 | `lawbid.bid.BiddingMaterialDetailVO` | None |  |
| 15 | `supEnterpriseId` | 租户 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 16 | `enterpriseId` | 企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 17 | `currencyId` | 币种主键" | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 18 | `reqOrgId` | 需求公司主键 | `org.func.BaseOrg` | Service |  |
| 19 | `mainUnitId` | 主单位主键 | `pc.unit.Unit` | Service |  |
