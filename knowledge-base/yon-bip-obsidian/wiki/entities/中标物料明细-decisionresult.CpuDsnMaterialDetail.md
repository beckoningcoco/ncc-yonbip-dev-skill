---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.decisionresult.CpuDsnMaterialDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 中标物料明细 (`lawbid.decisionresult.CpuDsnMaterialDetail`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSouringBid 模块实体元数据字典。
> 物理表：`cpu_dsn_material_detail` | 所属应用：`ycSouringBid`
> 来源：元数据API `queryByUri` 返回的 `lawbid.decisionresult.CpuDsnMaterialDetail` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 中标物料明细 |
| 物理表 | `cpu_dsn_material_detail` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:16:36.5810` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | id |

## 部署信息

- **部署时间**: 2026-05-22 23:55:29:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-lawbid/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-lawbid/0010_iuap_common/DML/0270_iuap_metadata/202604141424_metadata_lawbid-decisionresult_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `1db77d41-07c9-4dec-b5e4-98b5727f2362`

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`

## 约束

- **migration_id** (MetaClassPrimary): id — 唯一字段: `['id']`

## 依赖接口（共 6 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 定标单物料子表接口 (`ICpuDsnMaterialDetail`) | `lawdecision.itf.ICpuDsnMaterialDetail` | 470 | 82 |
| 2 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 3 | 企业ID (`IEnterprise`) | `cpu.itf.IEnterprise` | 6 | 1 |
| 4 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 5 | 跨租户采购商租户接口 (`IBuyerTenant`) | `cpu.itf.IBuyerTenant` | 10 | 1 |
| 6 | 项目结构属性 (`projectStructureProperties`) | `BGDM.wbs.projectStructureProperties` | 49 | 2 |

---

## 直接属性（共 142 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 | `quote` |  | ✓ |
| 2 | `backup` | 分项备注 | `backup` | String | `text` |  | ✓ |
| 3 | `bidBottom` | 标底 | `bid_bottom` | Decimal | `number` |  | ✓ |
| 4 | `bidCount` | 投标数量 | `bid_count` | Decimal | `number` |  | ✓ |
| 5 | `bidMainCount` | 投标主数量 | `bid_main_count` | Decimal | `number` |  | ✓ |
| 6 | `bidNum` | 投标计价数量 | `bid_num` | Decimal | `number` |  | ✓ |
| 7 | `bidPrice` | 投标无税单价 | `bid_price` | Decimal | `number` |  | ✓ |
| 8 | `biddingMaterialId` | 投标物料主键 | `bidding_material_id` | 102df149-dc26-44a9-8fbe-02be312d8a34 | `quote` |  | ✓ |
| 9 | `businessType` | 业务类型 | `business_type` | String | `text` |  | ✓ |
| 10 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String | `text` |  | ✓ |
| 11 | `cancelSegment` | 供应商报价物料作废阶段 | `cancel_segment` | Integer | `int` |  | ✓ |
| 12 | `coefficient` | 换算系数 | `coefficient` | Decimal | `number` |  | ✓ |
| 13 | `consignationId` | 委托单主键 | `consignation_id` | Long | `long` |  | ✓ |
| 14 | `controlStrategyId` | 管控策略 | `control_strategy_id` | da7e5585-8f8c-4510-b005-9e6bcaf6995d | `quote` |  | ✓ |
| 15 | `conversionSinglePrice` | 换算后不含税单价 | `conversion_single_price` | Decimal | `number` |  | ✓ |
| 16 | `conversionTaxSinglePrice` | 换算后含税单价 | `conversion_tax_single_price` | Decimal | `number` |  | ✓ |
| 17 | `conversionTaxTotalPrice` | 换算后含税金额 | `conversion_tax_total_price` | Decimal | `number` |  | ✓ |
| 18 | `conversionTaxTotalWinPrice` | 换算后中标含税金额 | `conversion_tax_total_win_price` | Decimal | `number` |  | ✓ |
| 19 | `conversionTaxWinPrice` | 换算后中标含税单价 | `conversion_tax_win_price` | Decimal | `number` |  | ✓ |
| 20 | `conversionTotalPrice` | 换算后不含税金额 | `conversion_total_price` | Decimal | `number` |  | ✓ |
| 21 | `conversionTotalWinPrice` | 换算后中标无税金额 | `conversion_total_win_price` | Decimal | `number` |  | ✓ |
| 22 | `conversionWinPrice` | 换算后中标无税单价 | `conversion_win_price` | Decimal | `number` |  | ✓ |
| 23 | `conversionWinTax` | 换算后中标税额 | `conversion_win_tax` | Decimal | `number` |  | ✓ |
| 24 | `costQuoteGroupId` | 成本项报价组id | `cost_quote_group_id` | 2b728cc3-82ca-4e8f-8b98-49f9f1df7acd | `quote` |  | ✓ |
| 25 | `currency` | 币种 | `currency` | String | `text` |  | ✓ |
| 26 | `currencyId` | 币种主键 | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | ✓ |
| 27 | `decisionId` | 定标单主键 | `decision_id` | 1fc86047-2eea-424c-b46f-8fd24fdcc970 | `quote` |  | ✓ |
| 28 | `deliveryPlace` | 交货地点 | `delivery_place` | String | `text` |  | ✓ |
| 29 | `demandBillId` | 标段物料主键 | `demand_bill_id` | 3fe14cdc-d32f-4161-80ad-994d5f6c57e3 | `quote` |  | ✓ |
| 30 | `demandOrg` | 需求组织 | `demand_org` | String | `text` |  | ✓ |
| 31 | `dimensionPricingId` | 报价ID | `dimension_pricing_id` | efd1e4c5-9da5-490b-acfc-9b097f70f890 | `quote` |  | ✓ |
| 32 | `discountPrice` | 折算报价 | `discount_price` | Decimal | `number` |  | ✓ |
| 33 | `discountTotalPrice` | 折算人民币金额 | `discount_total_price` | Decimal | `number` |  | ✓ |
| 34 | `dr` | 逻辑删除标记 | `dr` | Integer | `int` |  | ✓ |
| 35 | `dsnMaterialDetailDefineCharacter` | 中标物料明细表表体自定义项 | `dsn_material_detail_define_character` | 953a6711-6f37-4a0d-afff-8a0f29ab628f | `UserDefine` |  | ✓ |
| 36 | `dsnMaterialDetailFreeCharacteristics` | 中标物料明细表自由项特征组 | `dsn_material_detail_free_characteristics` | 5f5578ca-a1ec-498a-9f92-5eb766d6ddd6 | `FreeCT` |  | ✓ |
| 37 | `endDate` | 结束时间 | `end_date` | Date | `date` |  | ✓ |
| 38 | `enterpriseId` | 企业 | `enterprise_id` | Long | `long` |  | ✓ |
| 39 | `erpSourceBid` | 外系统子表行主键 | `erp_source_bid` | String | `text` |  | ✓ |
| 40 | `erpSourceId` | 外系统子表主键 | `erp_source_id` | String | `text` |  | ✓ |
| 41 | `failBidCause` | 流标原因 | `fail_bid_cause` | String | `text` |  | ✓ |
| 42 | `firstUpLineno` | 源头单据行号 | `first_up_line_no` | Integer | `int` |  | ✓ |
| 43 | `firstsource` | 源头单据类型 | `first_source` | String | `text` |  | ✓ |
| 44 | `firstsourceautoid` | 源头单据子表id | `first_source_auto_id` | Long | `long` |  | ✓ |
| 45 | `firstsourceid` | 源头单据主表id | `first_source_id` | Long | `long` |  | ✓ |
| 46 | `firstupcode` | 源头单据号 | `first_up_code` | String | `text` |  | ✓ |
| 47 | `freeDefine` | 中标物料明细表体自定义项 | `` | 42d50e2a-4ac2-49bf-9f85-eba40cbaa90c | `` |  |  |
| 48 | `highestPrice` | 最高限价 | `highest_price` | Decimal | `number` |  | ✓ |
| 49 | `id` | id | `id` | Long | `long` |  | ✓ |
| 50 | `ifcancel` | 是否废除 | `ifcancel` | Integer | `int` |  | ✓ |
| 51 | `invPriceExchRate` | 计价换算率 | `inv_price_exch_rate` | Decimal | `number` |  | ✓ |
| 52 | `invPriceExchRateDen` | 计价换算率分母 | `inv_price_exch_rate_den` | Decimal | `number` |  | ✓ |
| 53 | `invPriceExchRateNum` | 计价换算率分子 | `inv_price_exch_rate_num` | Decimal | `number` |  | ✓ |
| 54 | `invPurExchRate` | 采购换算率 | `inv_pur_exch_rate` | Decimal | `number` |  | ✓ |
| 55 | `invPurExchRateDen` | 采购换算率分母 | `inv_pur_exch_rate_den` | Decimal | `number` |  | ✓ |
| 56 | `invPurExchRateNum` | 采购换算率分子 | `inv_pur_exch_rate_num` | Decimal | `number` |  | ✓ |
| 57 | `invPurExchRateType` | 采购换算率类型 | `inv_pur_exch_rate_type` | Short | `short` |  | ✓ |
| 58 | `isContract` | 是否推合同标识 | `is_contract` | Integer | `int` |  | ✓ |
| 59 | `isOrder` | 是否推订单标识 | `is_order` | Boolean | `switch` |  | ✓ |
| 60 | `lastPrice` | 上期价格 | `last_price` | Decimal | `number` |  | ✓ |
| 61 | `lowestPrice` | 最低投标单价 | `lowest_price` | Decimal | `number` |  | ✓ |
| 62 | `mainCount` | 主数量 | `main_count` | Decimal | `number` |  | ✓ |
| 63 | `mainUnitId` | 主单位主键 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | ✓ |
| 64 | `markMaterialId` | 汇总报价单表体主键 | `mark_material_id` | 8c4341a0-e9a3-4c70-9df2-525171b82f42 | `quote` |  | ✓ |
| 65 | `materialBrand` | 物料品牌 | `material_brand` | String | `text` |  | ✓ |
| 66 | `materialClassId` | 物料分类主键 | `material_class_id` | Long | `long` |  | ✓ |
| 67 | `materialClassName` | 物料分类名称 | `material_class_name` | String | `text` |  | ✓ |
| 68 | `materialDetail` | 货物描述 | `material_detail` | String | `text` |  | ✓ |
| 69 | `materialDetailId` | 原燃材料需求清单主键 | `material_detail_id` | Long | `long` |  | ✓ |
| 70 | `materialFile` | 附件 | `material_file` | String | `attachment` |  | ✓ |
| 71 | `materialId` | 物料主键 | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | ✓ |
| 72 | `materialIngredient` | 材质 | `material_ingredient` | String | `text` |  | ✓ |
| 73 | `materialModel` | 物料型号 | `material_model` | String | `text` |  | ✓ |
| 74 | `materialName` | 工程名称 | `material_name` | String | `text` |  | ✓ |
| 75 | `materialNo` | 工程编码 | `material_no` | String | `text` |  | ✓ |
| 76 | `materialQualifyStandard` | 质量要求 | `material_qualify_standard` | String | `text` |  | ✓ |
| 77 | `materialSpecification` | 规格 | `material_specification` | String | `text` |  | ✓ |
| 78 | `measureUnit` | 计价单位主键 | `measure_unit` | String | `text` |  | ✓ |
| 79 | `notes` | 备注 | `notes` | String | `text` |  | ✓ |
| 80 | `occupiedByProductSupply` | 物料被用领状态 | `occupied_by_product_supply` | String | `text` |  | ✓ |
| 81 | `openRateTime` | 开标汇率日期 | `open_rate_time` | DateTime | `timestamp` |  | ✓ |
| 82 | `openRateValue` | 开标汇率值 | `open_rate_value` | Decimal | `number` |  | ✓ |
| 83 | `openRateValueOps` | 开标汇率折算方式 | `open_rate_value_ops` | ExchangeRateMethod | `` |  | ✓ |
| 84 | `orderNo` | 序号 | `order_no` | String | `text` |  | ✓ |
| 85 | `planPrice` | 计划价格 | `plan_price` | Decimal | `number` |  | ✓ |
| 86 | `priceWay` | 报价方式 | `price_way` | String | `text` |  | ✓ |
| 87 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 88 | `purCategory` | 采购类别 | `pur_category` | String | `text` |  | ✓ |
| 89 | `purCount` | 采购数量 | `pur_count` | Decimal | `number` |  | ✓ |
| 90 | `purOrgId` | 采购组织 | `pur_org_id` | a4916c85-f087-4e87-a178-0ad37aff7cd0 | `quote` |  | ✓ |
| 91 | `purUnitId` | 采购单位主键 | `pur_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | ✓ |
| 92 | `purchaseCount` | 采购计价数量 | `purchase_count` | Decimal | `number` |  | ✓ |
| 93 | `purchaseSolutionNo` | 采购方案号 | `purchase_solution_no` | String | `text` |  | ✓ |
| 94 | `rank` | 排名 | `rank` | Integer | `int` |  | ✓ |
| 95 | `rate` | 投标税率(%) | `rate` | Decimal | `number` |  | ✓ |
| 96 | `rateTypeId` | 汇率类型 | `rate_type_id` | String | `text` |  | ✓ |
| 97 | `receiveAddress` | 施工地点 | `receive_address` | String | `text` |  | ✓ |
| 98 | `recentPrice` | 最近价格 | `recent_price` | Decimal | `number` |  | ✓ |
| 99 | `recommendCount` | 推荐家数 | `recommend_count` | Decimal | `number` |  | ✓ |
| 100 | `referPrice` | 参考单价 | `refer_price` | Decimal | `number` |  | ✓ |
| 101 | `reqDeptId` | 需求部门id | `req_dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |  | ✓ |
| 102 | `reqId` | 采购需求主键 | `req_id` | bac52eb7-97d5-4c52-8a52-cc1d9bf96c66 | `quote` |  | ✓ |
| 103 | `reqOrgId` | 需求公司主键 | `req_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 104 | `reqOrgName` | 需求公司 | `req_org_name` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 105 | `reqOrgNameGroup` | 需求公司分组 | `req_org_name_group` | String | `text` |  | ✓ |
| 106 | `reqOrgNameGroupId` | 分单组织 | `req_org_name_group_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 107 | `reqTime` | 需求日期 | `req_time` | Date | `date` |  | ✓ |
| 108 | `rowNo` | 行号 | `row_no` | Decimal | `number` |  | ✓ |
| 109 | `sequenceNo` | 顺序号 | `sequence_no` | String | `text` |  | ✓ |
| 110 | `sourceType` | 上游单据类型 | `source_type` | String | `text` |  | ✓ |
| 111 | `startDate` | 开始时间 | `start_date` | Date | `date` |  | ✓ |
| 112 | `state` | 是否中标 | `state` | Integer | `int` |  | ✓ |
| 113 | `steps` | 定标单物料价格梯度明细 | `` | cd0c0823-9ad4-4586-97d7-8037e7e03f59 | `` |  |  |
| 114 | `subitem` | 分项 | `subitem` | Integer | `int` |  | ✓ |
| 115 | `supEnterpriseId` | 供应商企业 | `sup_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 | `quote` |  | ✓ |
| 116 | `supEnterpriseName` | 供应商企业名称 | `sup_enterprise_name` | String | `text` |  | ✓ |
| 117 | `supplierRate` | 推供应商税率 | `supplier_rate` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |  | ✓ |
| 118 | `supplyCount` | 保供家数 | `supply_count` | Decimal | `number` |  | ✓ |
| 119 | `supplydocId` | 拟中标供应商 | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 120 | `supplydocName` | 拟中标供应商 | `supplydoc_name` | String | `text` |  | ✓ |
| 121 | `targetId` | 合同物料id | `target_id` | Long | `long` |  | ✓ |
| 122 | `taxBidPrice` | 投标含税单价 | `tax_bid_price` | Decimal | `number` |  | ✓ |
| 123 | `taxRateId` | 税率ID | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |  | ✓ |
| 124 | `taxRecentPrice` | 含税最新报价 | `tax_recent_price` | Decimal | `number` |  | ✓ |
| 125 | `taxTotalPrice` | 含税金额 | `tax_total_price` | Decimal | `number` |  | ✓ |
| 126 | `taxWinPrice` | 中标含税单价 | `tax_win_price` | Decimal | `number` |  | ✓ |
| 127 | `totalPrice` | 无税金额 | `total_price` | Decimal | `number` |  | ✓ |
| 128 | `totalScore` | 总分 | `total_score` | Decimal | `number` |  | ✓ |
| 129 | `ts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 130 | `uniteBidderId` | 联合体投标人租户主键 | `unite_bidder_id` | Long | `long` |  | ✓ |
| 131 | `uniteBidderName` | 联合体投标人名称 | `unite_bidder_name` | String | `text` |  | ✓ |
| 132 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String | `text` |  | ✓ |
| 133 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 | `quote` |  | ✓ |
| 134 | `winCount` | 中标数量 | `win_count` | Decimal | `number` |  | ✓ |
| 135 | `winMainCount` | 中标主数量 | `win_main_count` | Decimal | `number` |  | ✓ |
| 136 | `winNum` | 中标计价数量 | `win_num` | Decimal | `number` |  | ✓ |
| 137 | `winPrice` | 中标无税单价 | `win_price` | Decimal | `number` |  | ✓ |
| 138 | `winRate` | 中标税率(%) | `win_rate` | Decimal | `number` |  | ✓ |
| 139 | `winRatio` | 中标比例 | `win_ratio` | Decimal | `number` |  | ✓ |
| 140 | `winTax` | 中标税额 | `win_tax` | Decimal | `number` |  | ✓ |
| 141 | `winTaxRateId` | 税率ID | `win_tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |  | ✓ |
| 142 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 29 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `purOrgId` | 采购组织 | `org.func.PurchaseOrg` | `pur_org_id` |  →  |  |  | Service |  |
| 2 | `reqDeptId` | 需求部门id | `bd.adminOrg.AdminOrgVO` | `req_dept_id` |  →  |  |  | Service |  |
| 3 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | `activity` |  →  |  |  | Service |  |
| 4 | `purUnitId` | 采购单位主键 | `pc.unit.Unit` | `pur_unit_id` |  →  |  |  | Service |  |
| 5 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | `wbs` |  →  |  |  | Service |  |
| 6 | `supplierRate` | 推供应商税率 | `archive.taxArchives.TaxRateArchive` | `supplier_rate` |  →  |  |  | Service |  |
| 7 | `biddingMaterialId` | 投标物料主键 | `lawbid.bid.BiddingMaterialDetailVO` | `bidding_material_id` |  →  |  |  | None |  |
| 8 | `taxRateId` | 税率ID | `archive.taxArchives.TaxRateArchive` | `tax_rate_id` |  →  |  |  | Service |  |
| 9 | `currencyId` | 币种主键 | `bd.currencytenant.CurrencyTenantVO` | `currency_id` |  →  |  |  | Service |  |
| 10 | `reqOrgId` | 需求公司主键 | `org.func.BaseOrg` | `req_org_id` |  →  |  |  | Service |  |
| 11 | `mainUnitId` | 主单位主键 | `pc.unit.Unit` | `main_unit_id` |  →  |  |  | Service |  |
| 12 | `costQuoteGroupId` | 成本项报价组id | `aa.costquote.CpuCostPricing` | `cost_quote_group_id` |  →  |  |  | Service |  |
| 13 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 14 | `dsnMaterialDetailDefineCharacter` | 中标物料明细表表体自定义项 | `lawbid.decisionresult.DecisionMaterialListDefineCharacter` | `dsn_material_detail_define_character` |  →  |  |  | None |  |
| 15 | `markMaterialId` | 汇总报价单表体主键 | `lawbid.scoringdata.ScoringDataMarkMateriel` | `mark_material_id` |  →  |  |  | None |  |
| 16 | `reqOrgNameGroupId` | 分单组织 | `org.func.BaseOrg` | `req_org_name_group_id` |  →  |  |  | Service |  |
| 17 | `materialId` | 物料主键 | `pc.product.Product` | `material_id` |  →  |  |  | Service |  |
| 18 | `dsnMaterialDetailFreeCharacteristics` | 中标物料明细表自由项特征组 | `lawbid.decisionresult.DecisionMaterialListFreeCharacteristics` | `dsn_material_detail_free_characteristics` |  →  |  |  | None |  |
| 19 | `steps` | 定标单物料价格梯度明细 | `lawbid.decisionresult.DsnMaterialStep` | `` | steps → materialDetailId | 0..n | true | None |  |
| 20 | `dimensionPricingId` | 报价ID | `aa.quotation.BiQuotationHead` | `dimension_pricing_id` |  →  |  |  | Service |  |
| 21 | `reqId` | 采购需求主键 | `sourcing.pureq.IpuPuReq` | `req_id` |  →  |  |  | Service |  |
| 22 | `reqOrgName` | 需求公司 | `org.func.BaseOrg` | `req_org_name` |  →  |  |  | Service |  |
| 23 | `demandBillId` | 标段物料主键 | `lawbid.section.LawbidSectionMaterial` | `demand_bill_id` |  →  |  |  | None |  |
| 24 | `controlStrategyId` | 管控策略 | `sourcing.businessRuleSolution.BusinessRuleControlStrategy` | `control_strategy_id` |  →  |  |  | Service |  |
| 25 | `supplydocId` | 拟中标供应商 | `aa.vendor.Vendor` | `supplydoc_id` |  →  |  |  | Service |  |
| 26 | `winTaxRateId` | 税率ID | `archive.taxArchives.TaxRateArchive` | `win_tax_rate_id` |  →  |  |  | Service |  |
| 27 | `freeDefine` | 中标物料明细表体自定义项 | `lawbid.decisionresult.CpuDsnMaterialDetailFreeDefine` | `` | freeDefine → id | 1 | true | None | ⚠️ |
| 28 | `supEnterpriseId` | 供应商企业 | `cpu-privilege.enterprise.EnterprisePOJO` | `sup_enterprise_id` |  →  |  |  | Service |  |
| 29 | `decisionId` | 定标单主键 | `lawbid.decisionresult.CpuDecision` | `decision_id` | materialList → decisionId | 1..n | true | None |  |

### Composition（子表）

- **steps**: `steps` → `lawbid.decisionresult.DsnMaterialStep` | 0..n
- **freeDefine**: `freeDefine` → `lawbid.decisionresult.CpuDsnMaterialDetailFreeDefine` | 1 ⚠️ 已废弃
- **decisionId**: `materialList` → `lawbid.decisionresult.CpuDecision` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `purOrgId` (采购组织) | `org.func.PurchaseOrg` | `pur_org_id` |
| `reqDeptId` (需求部门id) | `bd.adminOrg.AdminOrgVO` | `req_dept_id` |
| `activity` (活动) | `pgrm.projecttask.ProjectScheduleTask` | `activity` |
| `purUnitId` (采购单位主键) | `pc.unit.Unit` | `pur_unit_id` |
| `wbs` (WBS) | `BGDM.wbs.wbs_doc` | `wbs` |
| `supplierRate` (推供应商税率) | `archive.taxArchives.TaxRateArchive` | `supplier_rate` |
| `taxRateId` (税率ID) | `archive.taxArchives.TaxRateArchive` | `tax_rate_id` |
| `currencyId` (币种主键) | `bd.currencytenant.CurrencyTenantVO` | `currency_id` |
| `reqOrgId` (需求公司主键) | `org.func.BaseOrg` | `req_org_id` |
| `mainUnitId` (主单位主键) | `pc.unit.Unit` | `main_unit_id` |
| `costQuoteGroupId` (成本项报价组id) | `aa.costquote.CpuCostPricing` | `cost_quote_group_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `reqOrgNameGroupId` (分单组织) | `org.func.BaseOrg` | `req_org_name_group_id` |
| `materialId` (物料主键) | `pc.product.Product` | `material_id` |
| `dimensionPricingId` (报价ID) | `aa.quotation.BiQuotationHead` | `dimension_pricing_id` |
| `reqId` (采购需求主键) | `sourcing.pureq.IpuPuReq` | `req_id` |
| `reqOrgName` (需求公司) | `org.func.BaseOrg` | `req_org_name` |
| `controlStrategyId` (管控策略) | `sourcing.businessRuleSolution.BusinessRuleControlStrategy` | `control_strategy_id` |
| `supplydocId` (拟中标供应商) | `aa.vendor.Vendor` | `supplydoc_id` |
| `winTaxRateId` (税率ID) | `archive.taxArchives.TaxRateArchive` | `win_tax_rate_id` |
| `supEnterpriseId` (供应商企业) | `cpu-privilege.enterprise.EnterprisePOJO` | `sup_enterprise_id` |
