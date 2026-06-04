---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.decisionresult.CpuDsnMaterialDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 中标物料明细 (`auction.decisionresult.CpuDsnMaterialDetail`)

> ycSouringAuction | 物理表：`cpu_dsn_material_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 中标物料明细 |
| 物理表 | `cpu_dsn_material_detail` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:25:56.5750` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（114个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `enterpriseId` | 企业 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 3 | `consignationId` | 委托单主键 | `consignation_id` | Long |
| 4 | `demandOrg` | 需求组织 | `demand_org` | String |
| 5 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 6 | `winTax` | 中标税额 | `win_tax` | Decimal |
| 7 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime |
| 9 | `materialClassId` | 物料分类主键 | `material_class_id` | Long |
| 10 | `supplydocName` | 投标人名称 | `supplydoc_name` | String |
| 11 | `reqOrgName` | 需求公司 | `req_org_name` | 14302233-1394-4a70-94e1-bed51636f312 |
| 12 | `targetId` | 合同物料id | `target_id` | Long |
| 13 | `controlStrategyId` | 管控策略 | `control_strategy_id` | da7e5585-8f8c-4510-b005-9e6bcaf6995d |
| 14 | `reqDeptId` | 需求部门id | `req_dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 |
| 15 | `purOrgId` | 采购组织 | `pur_org_id` | a4916c85-f087-4e87-a178-0ad37aff7cd0 |
| 16 | `taxRateId` | 税率ID | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 17 | `winTaxRateId` | 税率ID | `win_tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 18 | `invPriceExchRateDen` | 计价换算率分母 | `inv_price_exch_rate_den` | Decimal |
| 19 | `invPriceExchRateNum` | 计价换算率分子 | `inv_price_exch_rate_num` | Decimal |
| 20 | `invPurExchRateDen` | 采购换算率分母 | `inv_pur_exch_rate_den` | Decimal |
| 21 | `invPurExchRateNum` | 采购换算率分子 | `inv_pur_exch_rate_num` | Decimal |
| 22 | `businessType` | 业务类型 | `business_type` | String |
| 23 | `supEnterpriseName` | 供应商企业名称 | `sup_enterprise_name` | String |
| 24 | `isOrder` | 是否推订单标识 | `is_order` | Boolean |
| 25 | `ts` | 时间戳 | `ts` | DateTime |
| 26 | `materialClassName` | 物料分类名称 | `material_class_name` | String |
| 27 | `dr` | 删除标识 | `dr` | Short |
| 28 | `ytenantId` | 租户 | `ytenant_id` | String |
| 29 | `materialName` | 工程名称 | `material_name` | String |
| 30 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 31 | `materialModel` | 物料型号 | `material_model` | String |
| 32 | `materialNo` | 工程编码 | `material_no` | String |
| 33 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 34 | `conversionWinTax` | 换算后中标税额 | `conversion_win_tax` | Decimal |
| 35 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 36 | `materialSpecification` | 规格 | `material_specification` | String |
| 37 | `orderNo` | 序号 | `order_no` | String |
| 38 | `materialDetail` | 标的物描述 | `material_detail` | String |
| 39 | `purchaseSolutionNo` | 采购方案号 | `purchase_solution_no` | String |
| 40 | `sequenceNo` | 顺序号 | `sequence_no` | String |
| 41 | `reqOrgId` | 需求公司 | `req_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 42 | `reqOrgNameGroup` | 需求公司分组 | `req_org_name_group` | String |
| 43 | `reqOrgNameGroupId` | 需求公司分组主键 | `req_org_name_group_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 44 | `reqTime` | 需求日期 | `req_time` | Date |
| 45 | `materialIngredient` | 材质 | `material_ingredient` | String |
| 46 | `measureUnit` | 计价单位主键 | `measure_unit` | String |
| 47 | `purchaseCount` | 数量 | `purchase_count` | Decimal |
| 48 | `materialBrand` | 品牌 | `material_brand` | String |
| 49 | `receiveAddress` | 收货地址 | `receive_address` | String |
| 50 | `materialQualifyStandard` | 质量要求 | `material_qualify_standard` | String |
| 51 | `purCategory` | 采购类别 | `pur_category` | String |
| 52 | `bidNum` | 竞拍数量 | `bid_num` | Decimal |
| 53 | `taxBidPrice` | 竞拍含税单价 | `tax_bid_price` | Decimal |
| 54 | `rate` | 竞拍税率(%) | `rate` | Decimal |
| 55 | `lastPrice` | 上期价格 | `last_price` | Decimal |
| 56 | `referPrice` | 参考单价 | `refer_price` | Decimal |
| 57 | `bidPrice` | 竞拍无税单价 | `bid_price` | Decimal |
| 58 | `highestPrice` | 最高限价 | `highest_price` | Decimal |
| 59 | `winNum` | 中标数量 | `win_num` | Decimal |
| 60 | `taxWinPrice` | 中标含税单价 | `tax_win_price` | Decimal |
| 61 | `bidBottom` | 标底 | `bid_bottom` | Decimal |
| 62 | `winRate` | 中标税率(%) | `win_rate` | Decimal |
| 63 | `planPrice` | 计划价格 | `plan_price` | Decimal |
| 64 | `recommendCount` | 推荐家数 | `recommend_count` | Decimal |
| 65 | `winPrice` | 中标无税单价 | `win_price` | Decimal |
| 66 | `taxTotalPrice` | 含税总价 | `tax_total_price` | Decimal |
| 67 | `supplyCount` | 保供家数 | `supply_count` | Decimal |
| 68 | `totalPrice` | 无税总价 | `total_price` | Decimal |
| 69 | `state` | 是否中标 | `state` | Integer |
| 70 | `startDate` | 开始时间 | `start_date` | Date |
| 71 | `currencyId` | 币种id | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 72 | `endDate` | 结束时间 | `end_date` | Date |
| 73 | `deliveryPlace` | 交货地点 | `delivery_place` | String |
| 74 | `erpSourceId` | 外系统子表主键 | `erp_source_id` | String |
| 75 | `erpSourceBid` | 外系统子表行主键 | `erp_source_bid` | String |
| 76 | `notes` | 备注 | `notes` | String |
| 77 | `materialDetailId` | 原燃材料需求清单id | `material_detail_id` | Long |
| 78 | `supplierRate` | 推供应链税率 | `supplier_rate` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 79 | `lowestPrice` | 最低无税投标报价 | `lowest_price` | Decimal |
| 80 | `supplydocId` | 中标竞拍方 | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 81 | `supEnterpriseId` | 中标竞拍方 | `sup_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 82 | `decisionId` | 定标单主键 | `decision_id` | cef2e51c-ec7a-4453-9655-76897331f5b9 |
| 83 | `demandBillId` | 标段物料主键 | `demand_bill_id` | d1c773f8-faee-4714-9ef2-044060d8ee18 |
| 84 | `ifcancel` | 是否作废 | `ifcancel` | Integer |
| 85 | `priceWay` | 报价方式 | `price_way` | String |
| 86 | `invPriceExchRate` | 计价换算率 | `inv_price_exch_rate` | Decimal |
| 87 | `discountPrice` | 折算报价 | `discount_price` | Decimal |
| 88 | `currency` | 币种 | `currency` | String |
| 89 | `mainCount` | 主数量 | `main_count` | Decimal |
| 90 | `mainUnitId` | 主单位主键 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 91 | `invPurExchRate` | 采购换算率 | `inv_pur_exch_rate` | Decimal |
| 92 | `purCount` | 采购数量 | `pur_count` | Decimal |
| 93 | `subitem` | 分项 | `subitem` | Integer |
| 94 | `invPurExchRateType` | 采购换算率类型 | `inv_pur_exch_rate_type` | Short |
| 95 | `coefficient` | 换算系数 | `coefficient` | Decimal |
| 96 | `dsnMaterialDetailDefineCharacter` | 中标物料明细表表体自定义项 | `dsn_material_detail_define_character` | 9b6543fe-2fd8-4df9-b612-5ee9663c5fe6 |
| 97 | `discountTotalPrice` | 折算人民币总价 | `discount_total_price` | Decimal |
| 98 | `backup` | 分项备注 | `backup` | String |
| 99 | `reqId` | 采购需求主键 | `req_id` | bac52eb7-97d5-4c52-8a52-cc1d9bf96c66 |
| 100 | `purUnitId` | 采购单位主键 | `pur_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 101 | `winMainCount` | 中标主数量 | `win_main_count` | Decimal |
| 102 | `biddingMaterialId` | 投标物料主键 | `bidding_material_id` | 6f99718a-b71a-4661-9975-b43aed08885a |
| 103 | `markMaterialId` | 评标物料主键 | `mark_material_id` | 2200f5c0-cb73-44cf-a8f0-6e67980e5793 |
| 104 | `uniteBidderId` | 联合体投标人租户主键 | `unite_bidder_id` | Long |
| 105 | `bidCount` | 报价计价数量 | `bid_count` | Decimal |
| 106 | `uniteBidderName` | 联合体投标人名称 | `unite_bidder_name` | String |
| 107 | `winCount` | 中标数量 | `win_count` | Decimal |
| 108 | `isContract` | 是否推合同标识 | `is_contract` | Long |
| 109 | `bidMainCount` | 报价主数量 | `bid_main_count` | Decimal |
| 110 | `recentPrice` | 竞拍无税总价 | `recent_price` | Decimal |
| 111 | `taxRecentPrice` | 竞拍含税总价 | `tax_recent_price` | Decimal |
| 112 | `materialId` | 物料id | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 113 | `dsnMaterialDetailFreeCharacteristics` | 采购结果自由项特征组 | `dsn_material_detail_free_characteristics` | f796c56a-7bd0-4396-b367-fb758568b0ba |
| 114 | `freeDefine` | 采购结果物料明细自定义项表 | `` | fe647f5c-9838-4448-92ef-0ef897fc4368 |

---

## 关联属性（27个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `purOrgId` | 采购组织 | `org.func.PurchaseOrg` | Service |  |
| 2 | `reqDeptId` | 需求部门id | `bd.adminOrg.AdminOrgVO` | Service |  |
| 3 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 4 | `purUnitId` | 采购单位主键 | `pc.unit.Unit` | Service |  |
| 5 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 6 | `supplierRate` | 推供应链税率 | `archive.taxArchives.TaxRateArchive` | Service |  |
| 7 | `biddingMaterialId` | 投标物料主键 | `auction.bid.BiddingMaterialDetailVO` | None |  |
| 8 | `taxRateId` | 税率ID | `archive.taxArchives.TaxRateArchive` | Service |  |
| 9 | `currencyId` | 币种id | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 10 | `reqOrgId` | 需求公司 | `org.func.BaseOrg` | Service |  |
| 11 | `mainUnitId` | 主单位主键 | `pc.unit.Unit` | Service |  |
| 12 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 13 | `dsnMaterialDetailDefineCharacter` | 中标物料明细表表体自定义项 | `auction.decisionresult.AuctionDecisionMaterialListDefineCharacter` | None |  |
| 14 | `markMaterialId` | 评标物料主键 | `auction.scoringdata.ScoringDataMarkMateriel` | None |  |
| 15 | `reqOrgNameGroupId` | 需求公司分组主键 | `org.func.BaseOrg` | Service |  |
| 16 | `materialId` | 物料id | `pc.product.Product` | Service |  |
| 17 | `dsnMaterialDetailFreeCharacteristics` | 采购结果自由项特征组 | `auction.decisionresult.AuctionDecisionMaterialListFreeCharacteristics` | None |  |
| 18 | `reqId` | 采购需求主键 | `sourcing.pureq.IpuPuReq` | Service |  |
| 19 | `reqOrgName` | 需求公司 | `org.func.BaseOrg` | Service |  |
| 20 | `demandBillId` | 标段物料主键 | `auction.project.AuctionSectionMaterial` | None |  |
| 21 | `controlStrategyId` | 管控策略 | `sourcing.businessRuleSolution.BusinessRuleControlStrategy` | Service |  |
| 22 | `supplydocId` | 中标竞拍方 | `aa.vendor.Vendor` | Service |  |
| 23 | `winTaxRateId` | 税率ID | `archive.taxArchives.TaxRateArchive` | Service |  |
| 24 | `freeDefine` | 采购结果物料明细自定义项表 | `auction.decisionresult.CpuDsnMaterialDetailFreeDefine` | None | true |
| 25 | `supEnterpriseId` | 中标竞拍方 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 26 | `enterpriseId` | 企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 27 | `decisionId` | 定标单主键 | `auction.decisionresult.CpuDecision` | None | true |
