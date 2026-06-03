---
tags: [BIP, 元数据, 数据字典, RCL.RCL.rclExecuteSituation]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 执行情况 (`RCL.RCL.rclExecuteSituation`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcl_execsituation` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`29a1c8eb-18f3-4f82-b4a8-2d20ae258702`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 执行情况 |
| 物理表 | `rcl_execsituation` |
| 数据库 schema | `yonbip-fi-ercl` |
| 所属应用 | `RVN` |
| 直连字段 | 236 个 |
| 子表 | 0 个 |
| 关联引用 | 12 个 |

## 关联引用 (12个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `acc_book_id` | `fiepub.fiepub_accountbooktreeref` |
| `activity` | `` |
| `material_type_id` | `productcenter.pc_managementclassref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `wbs` | `` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `rcl_revenuecontract_base_id` | `` |
| `material_id` | `productcenter.baseProductRef` |
| `base_info_id` | `` |
| `project_id` | `ucfbasedoc.bd_projectNewRef` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 236 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | 分布式事务ID |
| `send_quantity` | `send_quantity` | `sendQuantity` | 已发货数量 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rcl_revenuecontract_base_id` | `rcl_revenuecontract_base_id` | `rclRevenuecontractBaseId` | 履约义务主表 |
| `activity` | `activity` | `activity` | 活动 |
| `wbs` | `wbs` | `wbs` | WBS |
| `base_info_id` | `base_info_id` | `baseInfoId` | 基本信息行主键 |
| `material_id` | `material_id` | `materialId` | 物料 |
| `material_type_id` | `material_type_id` | `materialTypeId` | 物料类别 |
| `project_id` | `project_id` | `projectId` | 项目 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |
| `acc_book_id` | `acc_book_id` | `accBook` | 账簿 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dtc_status` | `dtc_status` | `dtcStatus` | 分布式事务状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (216个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `expect_cost` | `expect_cost` | `expectCost` | 预计成本 |
| `expect_debt` | `expect_debt` | `expectDebt` | 预计负债 |
| `invoice_quantity` | `invoice_quantity` | `invoiceQuantity` | 已开票数量 |
| `invoice_quantity_saved` | `invoice_quantity_saved` | `invoiceQuantitySaved` | 已开票数量(保存) |
| `invoice_quantity_tobe` | `invoice_quantity_tobe` | `invoiceQuantityTobe` | 待开票数量 |
| `localmny_availreceivable` | `localmny_availreceivable` | `localmnyAvailreceivable` | 本币含税可用应收 |
| `localmny_availreceivable_notax` | `localmny_availreceivable_notax` | `localmnyAvailreceivableNotax` | 本币无税可用应收 |
| `localmny_availreceivable_notax_saved` | `localmny_availreceivable_notax_saved` | `localmnyAvailreceivableNotaxSaved` | 本币无税可用应收(保存) |
| `localmny_availreceivable_saved` | `localmny_availreceivable_saved` | `localmnyAvailreceivableSaved` | 本币含税可用应收(保存) |
| `localmny_availreceivable_tax` | `localmny_availreceivable_tax` | `localmnyAvailreceivableTax` | 本币可用应收税额 |
| `localmny_availreceivable_tax_saved` | `localmny_availreceivable_tax_saved` | `localmnyAvailreceivableTaxSaved` | 本币可用应收税额(保存) |
| `localmny_collectible` | `localmny_collectible` | `localmnyCollectible` | 本币可收款含税金额 |
| `localmny_collectible_notax` | `localmny_collectible_notax` | `localmnyCollectibleNotax` | 本币可收款无税金额 |
| `localmny_collectible_tax` | `localmny_collectible_tax` | `localmnyCollectibleTax` | 本币可收款税额 |
| `localmny_collection` | `localmny_collection` | `localmnyCollection` | 本币已收款含税金额 |
| `localmny_collection_notax` | `localmny_collection_notax` | `localmnyCollectionNotax` | 本币已收款无税金额 |
| `localmny_collection_notax_saved` | `localmny_collection_notax_saved` | `localmnyCollectionNotaxSaved` | 本币已收款无税金额(保存) |
| `localmny_collection_notax_tobe` | `localmny_collection_notax_tobe` | `localmnyCollectionNotaxTobe` | 本币待收款无税金额 |
| `localmny_collection_saved` | `localmny_collection_saved` | `localmnyCollectionSaved` | 本币已收款含税金额(保存) |
| `localmny_collection_tax` | `localmny_collection_tax` | `localmnyCollectionTax` | 本币已收款税额 |
| `localmny_collection_tax_saved` | `localmny_collection_tax_saved` | `localmnyCollectionTaxSaved` | 本币已收款税额(保存) |
| `localmny_collection_tax_tobe` | `localmny_collection_tax_tobe` | `localmnyCollectionTaxTobe` | 本币待收款税额 |
| `localmny_collection_tobe` | `localmny_collection_tobe` | `localmnyCollectionTobe` | 本币待收款含税金额 |
| `localmny_contractasset` | `localmny_contractasset` | `localmnyContractasset` | 本币含税合同资产 |
| `localmny_contractasset_notax` | `localmny_contractasset_notax` | `localmnyContractassetNotax` | 本币无税合同资产 |
| `localmny_contractasset_notax_saved` | `localmny_contractasset_notax_saved` | `localmnyContractassetNotaxSaved` | 本币无税合同资产(保存) |
| `localmny_contractasset_saved` | `localmny_contractasset_saved` | `localmnyContractassetSaved` | 本币含税合同资产(保存) |
| `localmny_contractasset_tax` | `localmny_contractasset_tax` | `localmnyContractassetTax` | 本币合同资产税额 |
| `localmny_contractasset_tax_saved` | `localmny_contractasset_tax_saved` | `localmnyContractassetTaxSaved` | 本币合同资产税额(保存) |
| `localmny_deferrevenue` | `localmny_deferrevenue` | `localmnyDeferrevenue` | 本币含税递延收入 |
| `localmny_deferrevenue_cfmd` | `localmny_deferrevenue_cfmd` | `localmnyDeferrevenueCfmd` | 本币已确认含税递延收入 |
| `localmny_deferrevenue_cfmd_saved` | `localmny_deferrevenue_cfmd_saved` | `localmnyDeferrevenueCfmdSaved` | 本币已确认含税递延收入(保存) |
| `localmny_deferrevenue_notax` | `localmny_deferrevenue_notax` | `localmnyDeferrevenueNotax` | 本币无税递延收入 |
| `localmny_deferrevenue_notax_cfmd` | `localmny_deferrevenue_notax_cfmd` | `localmnyDeferrevenueNotaxCfmd` | 本币已确认无税递延收入 |
| `localmny_deferrevenue_notax_cfmd_saved` | `localmny_deferrevenue_notax_cfmd_saved` | `localmnyDeferrevenueNotaxCfmdSaved` | 本币已确认无税递延收入(保存) |
| `localmny_deferrevenue_notax_saved` | `localmny_deferrevenue_notax_saved` | `localmnyDeferrevenueNotaxSaved` | 本币无税递延收入(保存) |
| `localmny_deferrevenue_notax_tobe` | `localmny_deferrevenue_notax_tobe` | `localmnyDeferrevenueNotaxTobe` | 本币待确认无税递延收入 |
| `localmny_deferrevenue_saved` | `localmny_deferrevenue_saved` | `localmnyDeferrevenueSaved` | 本币含税递延收入(保存) |
| `localmny_deferrevenue_tax` | `localmny_deferrevenue_tax` | `localmnyDeferrevenueTax` | 本币递延收入税额 |
| `localmny_deferrevenue_tax_cfmd` | `localmny_deferrevenue_tax_cfmd` | `localmnyDeferrevenueTaxCfmd` | 本币已确认递延收入税额 |
| `localmny_deferrevenue_tax_cfmd_saved` | `localmny_deferrevenue_tax_cfmd_saved` | `localmnyDeferrevenueTaxCfmdSaved` | 本币已确认递延收入税额(保存) |
| `localmny_deferrevenue_tax_saved` | `localmny_deferrevenue_tax_saved` | `localmnyDeferrevenueTaxSaved` | 本币递延收入税额(保存) |
| `localmny_deferrevenue_tax_tobe` | `localmny_deferrevenue_tax_tobe` | `localmnyDeferrevenueTaxTobe` | 本币待确认递延收入税额 |
| `localmny_deferrevenue_tobe` | `localmny_deferrevenue_tobe` | `localmnyDeferrevenueTobe` | 本币待确认含税递延收入 |
| `localmny_interest` | `localmny_interest` | `localmnyInterest` | 本币已确认含税利息收入 |
| `localmny_interest_notax` | `localmny_interest_notax` | `localmnyInterestNotax` | 本币已确认无税利息收入 |
| `localmny_interest_notax_saved` | `localmny_interest_notax_saved` | `localmnyInterestNotaxSaved` | 本币已确认无税利息收入(保存) |
| `localmny_interest_notax_tobe` | `localmny_interest_notax_tobe` | `localmnyInterestNotaxTobe` | 本币待确认无税利息收入 |
| `localmny_interest_saved` | `localmny_interest_saved` | `localmnyInterestSaved` | 本币已确认含税利息收入(保存) |
| `localmny_interest_tax` | `localmny_interest_tax` | `localmnyInterestTax` | 本币已确认利息收入税额 |
| `localmny_interest_tax_saved` | `localmny_interest_tax_saved` | `localmnyInterestTaxSaved` | 本币已确认利息收入税额(保存) |
| `localmny_interest_tax_tobe` | `localmny_interest_tax_tobe` | `localmnyInterestTaxTobe` | 本币待确认利息收入税额 |
| `localmny_interest_tobe` | `localmny_interest_tobe` | `localmnyInterestTobe` | 本币待确认含税利息收入 |
| `localmny_invoice` | `localmny_invoice` | `localmnyInvoice` | 本币已开票含税金额 |
| `localmny_invoice_notax` | `localmny_invoice_notax` | `localmnyInvoiceNotax` | 本币已开票无税金额 |
| `localmny_invoice_notax_saved` | `localmny_invoice_notax_saved` | `localmnyInvoiceNotaxSaved` | 本币已开票无税金额(保存) |
| `localmny_invoice_notax_tobe` | `localmny_invoice_notax_tobe` | `localmnyInvoiceNotaxTobe` | 本币待开票无税金额 |
| `localmny_invoice_saved` | `localmny_invoice_saved` | `localmnyInvoiceSaved` | 本币已开票含税金额(保存) |
| `localmny_invoice_tax` | `localmny_invoice_tax` | `localmnyInvoiceTax` | 本币已开票税额 |
| `localmny_invoice_tax_saved` | `localmny_invoice_tax_saved` | `localmnyInvoiceTaxSaved` | 本币已开票税额(保存) |
| `localmny_invoice_tax_tobe` | `localmny_invoice_tax_tobe` | `localmnyInvoiceTaxTobe` | 本币待开票税额 |
| `localmny_invoice_tobe` | `localmny_invoice_tobe` | `localmnyInvoiceTobe` | 本币待开票含税金额 |
| `localmny_outbound` | `localmny_outbound` | `localmnyOutbound` | 本币已出库含税金额 |
| `localmny_outbound_notax` | `localmny_outbound_notax` | `localmnyOutboundNotax` | 本币已出库无税金额 |
| `localmny_outbound_notax_tobe` | `localmny_outbound_notax_tobe` | `localmnyOutboundNotaxTobe` | 本币待出库无税金额 |
| `localmny_outbound_tax` | `localmny_outbound_tax` | `localmnyOutboundTax` | 本币已出库税额 |
| `localmny_outbound_tax_tobe` | `localmny_outbound_tax_tobe` | `localmnyOutboundTaxTobe` | 本币待出库税额 |
| `localmny_outbound_tobe` | `localmny_outbound_tobe` | `localmnyOutboundTobe` | 本币待出库含税金额 |
| `localmny_receivable` | `localmny_receivable` | `localmnyReceivable` | 本币已确认含税应收 |
| `localmny_receivable_notax` | `localmny_receivable_notax` | `localmnyReceivableNotax` | 本币已确认无税应收 |
| `localmny_receivable_notax_saved` | `localmny_receivable_notax_saved` | `localmnyReceivableNotaxSaved` | 本币已确认无税应收(保存) |
| `localmny_receivable_notax_tobe` | `localmny_receivable_notax_tobe` | `localmnyReceivableNotaxTobe` | 本币待确认无税应收 |
| `localmny_receivable_saved` | `localmny_receivable_saved` | `localmnyReceivableSaved` | 本币已确认含税应收(保存) |
| `localmny_receivable_tax` | `localmny_receivable_tax` | `localmnyReceivableTax` | 本币已确认应收税额 |
| `localmny_receivable_tax_saved` | `localmny_receivable_tax_saved` | `localmnyReceivableTaxSaved` | 本币已确认应收税额(保存) |
| `localmny_receivable_tax_tobe` | `localmny_receivable_tax_tobe` | `localmnyReceivableTaxTobe` | 本币待确认应收税额 |
| `localmny_receivable_tobe` | `localmny_receivable_tobe` | `localmnyReceivableTobe` | 本币待确认含税应收 |
| `localmny_revenue` | `localmny_revenue` | `localmnyRevenue` | 本币已确认含税收入 |
| `localmny_revenue_notax` | `localmny_revenue_notax` | `localmnyRevenueNotax` | 本币已确认无税收入 |
| `localmny_revenue_notax_saved` | `localmny_revenue_notax_saved` | `localmnyRevenueNotaxSaved` | 本币已确认无税收入(保存) |
| `localmny_revenue_notax_tobe` | `localmny_revenue_notax_tobe` | `localmnyRevenueNotaxTobe` | 本币待确认无税收入 |
| `localmny_revenue_saved` | `localmny_revenue_saved` | `localmnyRevenueSaved` | 本币已确认含税收入(保存) |
| `localmny_revenue_tax` | `localmny_revenue_tax` | `localmnyRevenueTax` | 本币已确认收入税额 |
| `localmny_revenue_tax_saved` | `localmny_revenue_tax_saved` | `localmnyRevenueTaxSaved` | 本币已确认收入税额(保存) |
| `localmny_revenue_tax_tobe` | `localmny_revenue_tax_tobe` | `localmnyRevenueTaxTobe` | 本币待确认收入税额 |
| `localmny_revenue_tobe` | `localmny_revenue_tobe` | `localmnyRevenueTobe` | 本币待确认含税收入 |
| `localmny_schedule` | `localmny_schedule` | `localmnySchedule` | 本币进度含税金额 |
| `localmny_schedule_notax` | `localmny_schedule_notax` | `localmnyScheduleNotax` | 本币进度无税金额 |
| `localmny_schedule_tax` | `localmny_schedule_tax` | `localmnyScheduleTax` | 本币进度税额 |
| `localmny_settlement` | `localmny_settlement` | `localmnySettlement` | 本币已结算含税金额 |
| `localmny_settlement_notax` | `localmny_settlement_notax` | `localmnySettlementNotax` | 本币已结算无税金额 |
| `localmny_settlement_notax_saved` | `localmny_settlement_notax_saved` | `localmnySettlementNotaxSaved` | 本币已结算无税金额(保存) |
| `localmny_settlement_notax_tobe` | `localmny_settlement_notax_tobe` | `localmnySettlementNotaxTobe` | 本币待结算无税金额 |
| `localmny_settlement_saved` | `localmny_settlement_saved` | `localmnySettlementSaved` | 本币已结算含税金额(保存) |
| `localmny_settlement_tax` | `localmny_settlement_tax` | `localmnySettlementTax` | 本币已结算税额 |
| `localmny_settlement_tax_saved` | `localmny_settlement_tax_saved` | `localmnySettlementTaxSaved` | 本币已结算税额(保存) |
| `localmny_settlement_tax_tobe` | `localmny_settlement_tax_tobe` | `localmnySettlementTaxTobe` | 本币待结算税额 |
| `localmny_settlement_tobe` | `localmny_settlement_tobe` | `localmnySettlementTobe` | 本币待结算含税金额 |
| `localmny_sign` | `localmny_sign` | `localmnySign` | 本币已客户确认含税金额 |
| `localmny_sign_notax` | `localmny_sign_notax` | `localmnySignNotax` | 本币已客户确认无税金额 |
| `localmny_sign_notax_saved` | `localmny_sign_notax_saved` | `localmnySignNotaxSaved` | 本币已客户确认无税金额(保存) |
| `localmny_sign_notax_tobe` | `localmny_sign_notax_tobe` | `localmnySignNotaxTobe` | 本币待客户确认无税金额 |
| `localmny_sign_saved` | `localmny_sign_saved` | `localmnySignSaved` | 本币已客户确认含税金额(保存) |
| `localmny_sign_tax` | `localmny_sign_tax` | `localmnySignTax` | 本币已客户确认税额 |
| `localmny_sign_tax_saved` | `localmny_sign_tax_saved` | `localmnySignTaxSaved` | 本币已客户确认税额(保存) |
| `localmny_sign_tax_tobe` | `localmny_sign_tax_tobe` | `localmnySignTaxTobe` | 本币待客户确认税额 |
| `localmny_sign_tobe` | `localmny_sign_tobe` | `localmnySignTobe` | 本币待客户确认含税金额 |
| `localmny_toreceivable` | `localmny_toreceivable` | `localmnyToreceivable` | 本币含税待合同资产转应收 |
| `localmny_toreceivable_notax` | `localmny_toreceivable_notax` | `localmnyToreceivableNotax` | 本币无税待合同资产转应收 |
| `localmny_toreceivable_notax_saved` | `localmny_toreceivable_notax_saved` | `localmnyToreceivableNotaxSaved` | 本币无税待合同资产转应收(保存) |
| `localmny_toreceivable_saved` | `localmny_toreceivable_saved` | `localmnyToreceivableSaved` | 本币含税待合同资产转应收(保存) |
| `localmny_toreceivable_tax` | `localmny_toreceivable_tax` | `localmnyToreceivableTax` | 本币待合同资产转应收税额 |
| `localmny_toreceivable_tax_saved` | `localmny_toreceivable_tax_saved` | `localmnyToreceivableTaxSaved` | 本币待合同资产转应收税额(保存) |
| `orimny_collection` | `orimny_collection` | `orimnyCollection` | 已收款含税金额 |
| `orimny_collection_notax` | `orimny_collection_notax` | `orimnyCollectionNotax` | 已收款无税金额 |
| `orimny_collection_notax_saved` | `orimny_collection_notax_saved` | `orimnyCollectionNotaxSaved` | 已收款无税金额(保存) |
| `orimny_collection_notax_tobe` | `orimny_collection_notax_tobe` | `orimnyCollectionNotaxTobe` | 待收款无税金额 |
| `orimny_collection_saved` | `orimny_collection_saved` | `orimnyCollectionSaved` | 已收款含税金额(保存) |
| `orimny_collection_tax` | `orimny_collection_tax` | `orimnyCollectionTax` | 已收款税额 |
| `orimny_collection_tax_saved` | `orimny_collection_tax_saved` | `orimnyCollectionTaxSaved` | 已收款税额(保存) |
| `orimny_collection_tax_tobe` | `orimny_collection_tax_tobe` | `orimnyCollectionTaxTobe` | 待收款税额 |
| `orimny_collection_tobe` | `orimny_collection_tobe` | `orimnyCollectionTobe` | 待收款含税金额 |
| `orimny_deferrevenue` | `orimny_deferrevenue` | `orimnyDeferrevenue` | 含税递延收入 |
| `orimny_deferrevenue_cfmd` | `orimny_deferrevenue_cfmd` | `orimnyDeferrevenueCfmd` | 已确认含税递延收入 |
| `orimny_deferrevenue_cfmd_saved` | `orimny_deferrevenue_cfmd_saved` | `orimnyDeferrevenueCfmdSaved` | 已确认含税递延收入(保存) |
| `orimny_deferrevenue_notax` | `orimny_deferrevenue_notax` | `orimnyDeferrevenueNotax` | 无税递延收入 |
| `orimny_deferrevenue_notax_cfmd` | `orimny_deferrevenue_notax_cfmd` | `orimnyDeferrevenueNotaxCfmd` | 已确认无税递延收入 |
| `orimny_deferrevenue_notax_cfmd_saved` | `orimny_deferrevenue_notax_cfmd_saved` | `orimnyDeferrevenueNotaxCfmdSaved` | 已确认无税递延收入(保存) |
| `orimny_deferrevenue_notax_saved` | `orimny_deferrevenue_notax_saved` | `orimnyDeferrevenueNotaxSaved` | 无税递延收入(保存) |
| `orimny_deferrevenue_notax_tobe` | `orimny_deferrevenue_notax_tobe` | `orimnyDeferrevenueNotaxTobe` | 待确认无税递延收入 |
| `orimny_deferrevenue_saved` | `orimny_deferrevenue_saved` | `orimnyDeferrevenueSaved` | 含税递延收入(保存) |
| `orimny_deferrevenue_tax` | `orimny_deferrevenue_tax` | `orimnyDeferrevenueTax` | 递延收入税额 |
| `orimny_deferrevenue_tax_cfmd` | `orimny_deferrevenue_tax_cfmd` | `orimnyDeferrevenueTaxCfmd` | 已确认递延收入税额 |
| `orimny_deferrevenue_tax_cfmd_saved` | `orimny_deferrevenue_tax_cfmd_saved` | `orimnyDeferrevenueTaxCfmdSaved` | 已确认递延收入税额(保存) |
| `orimny_deferrevenue_tax_saved` | `orimny_deferrevenue_tax_saved` | `orimnyDeferrevenueTaxSaved` | 递延收入税额(保存) |
| `orimny_deferrevenue_tax_tobe` | `orimny_deferrevenue_tax_tobe` | `orimnyDeferrevenueTaxTobe` | 待确认递延收入税额 |
| `orimny_deferrevenue_tobe` | `orimny_deferrevenue_tobe` | `orimnyDeferrevenueTobe` | 待确认含税递延收入 |
| `orimny_interest` | `orimny_interest` | `orimnyInterest` | 已确认含税利息收入 |
| `orimny_interest_notax` | `orimny_interest_notax` | `orimnyInterestNotax` | 已确认无税利息收入 |
| `orimny_interest_notax_saved` | `orimny_interest_notax_saved` | `orimnyInterestNotaxSaved` | 已确认无税利息收入(保存) |
| `orimny_interest_notax_tobe` | `orimny_interest_notax_tobe` | `orimnyInterestNotaxTobe` | 待确认无税利息收入 |
| `orimny_interest_saved` | `orimny_interest_saved` | `orimnyInterestSaved` | 已确认含税利息收入(保存) |
| `orimny_interest_tax` | `orimny_interest_tax` | `orimnyInterestTax` | 已确认利息收入税额 |
| `orimny_interest_tax_saved` | `orimny_interest_tax_saved` | `orimnyInterestTaxSaved` | 已确认利息收入税额(保存) |
| `orimny_interest_tax_tobe` | `orimny_interest_tax_tobe` | `orimnyInterestTaxTobe` | 待确认利息收入税额 |
| `orimny_interest_tobe` | `orimny_interest_tobe` | `orimnyInterestTobe` | 待确认含税利息收入 |
| `orimny_invoice` | `orimny_invoice` | `orimnyInvoice` | 已开票含税金额 |
| `orimny_invoice_notax` | `orimny_invoice_notax` | `orimnyInvoiceNotax` | 已开票无税金额 |
| `orimny_invoice_notax_saved` | `orimny_invoice_notax_saved` | `orimnyInvoiceNotaxSaved` | 已开票无税金额(保存) |
| `orimny_invoice_notax_tobe` | `orimny_invoice_notax_tobe` | `orimnyInvoiceNotaxTobe` | 待开票无税金额 |
| `orimny_invoice_saved` | `orimny_invoice_saved` | `orimnyInvoiceSaved` | 已开票含税金额(保存) |
| `orimny_invoice_tax` | `orimny_invoice_tax` | `orimnyInvoiceTax` | 已开票税额 |
| `orimny_invoice_tax_saved` | `orimny_invoice_tax_saved` | `orimnyInvoiceTaxSaved` | 已开票税额(保存) |
| `orimny_invoice_tax_tobe` | `orimny_invoice_tax_tobe` | `orimnyInvoiceTaxTobe` | 待开票税额 |
| `orimny_invoice_tobe` | `orimny_invoice_tobe` | `orimnyInvoiceTobe` | 待开票含税金额 |
| `orimny_outbound` | `orimny_outbound` | `orimnyOutbound` | 已出库含税金额 |
| `orimny_outbound_notax` | `orimny_outbound_notax` | `orimnyOutboundNotax` | 已出库无税金额 |
| `orimny_outbound_notax_tobe` | `orimny_outbound_notax_tobe` | `orimnyOutboundNotaxTobe` | 待出库无税金额 |
| `orimny_outbound_tax` | `orimny_outbound_tax` | `orimnyOutboundTax` | 已出库税额 |
| `orimny_outbound_tax_tobe` | `orimny_outbound_tax_tobe` | `orimnyOutboundTaxTobe` | 待出库税额 |
| `orimny_outbound_tobe` | `orimny_outbound_tobe` | `orimnyOutboundTobe` | 待出库含税金额 |
| `orimny_receivable` | `orimny_receivable` | `orimnyReceivable` | 已确认含税应收 |
| `orimny_receivable_notax` | `orimny_receivable_notax` | `orimnyReceivableNotax` | 已确认无税应收 |
| `orimny_receivable_notax_saved` | `orimny_receivable_notax_saved` | `orimnyReceivableNotaxSaved` | 已确认无税应收(保存) |
| `orimny_receivable_notax_tobe` | `orimny_receivable_notax_tobe` | `orimnyReceivableNotaxTobe` | 待确认无税应收 |
| `orimny_receivable_saved` | `orimny_receivable_saved` | `orimnyReceivableSaved` | 已确认含税应收(保存) |
| `orimny_receivable_tax` | `orimny_receivable_tax` | `orimnyReceivableTax` | 已确认应收税额 |
| `orimny_receivable_tax_saved` | `orimny_receivable_tax_saved` | `orimnyReceivableTaxSaved` | 已确认应收税额(保存) |
| `orimny_receivable_tax_tobe` | `orimny_receivable_tax_tobe` | `orimnyReceivableTaxTobe` | 待确认应收税额 |
| `orimny_receivable_tobe` | `orimny_receivable_tobe` | `orimnyReceivableTobe` | 待确认含税应收 |
| `orimny_revenue` | `orimny_revenue` | `orimnyRevenue` | 已确认含税收入 |
| `orimny_revenue_notax` | `orimny_revenue_notax` | `orimnyRevenueNotax` | 已确认无税收入 |
| `orimny_revenue_notax_saved` | `orimny_revenue_notax_saved` | `orimnyRevenueNotaxSaved` | 已确认无税收入(保存) |
| `orimny_revenue_notax_tobe` | `orimny_revenue_notax_tobe` | `orimnyRevenueNotaxTobe` | 待确认无税收入 |
| `orimny_revenue_saved` | `orimny_revenue_saved` | `orimnyRevenueSaved` | 已确认含税收入(保存) |
| `orimny_revenue_tax` | `orimny_revenue_tax` | `orimnyRevenueTax` | 已确认收入税额 |
| `orimny_revenue_tax_saved` | `orimny_revenue_tax_saved` | `orimnyRevenueTaxSaved` | 已确认收入税额(保存) |
| `orimny_revenue_tax_tobe` | `orimny_revenue_tax_tobe` | `orimnyRevenueTaxTobe` | 待确认收入税额 |
| `orimny_revenue_tobe` | `orimny_revenue_tobe` | `orimnyRevenueTobe` | 待确认含税收入 |
| `orimny_schedule` | `orimny_schedule` | `orimnySchedule` | 进度含税金额 |
| `orimny_schedule_notax` | `orimny_schedule_notax` | `orimnyScheduleNotax` | 进度无税金额 |
| `orimny_schedule_tax` | `orimny_schedule_tax` | `orimnyScheduleTax` | 进度税额 |
| `orimny_settlement` | `orimny_settlement` | `orimnySettlement` | 已结算含税金额 |
| `orimny_settlement_notax` | `orimny_settlement_notax` | `orimnySettlementNotax` | 已结算无税金额 |
| `orimny_settlement_notax_saved` | `orimny_settlement_notax_saved` | `orimnySettlementNotaxSaved` | 已结算无税金额(保存) |
| `orimny_settlement_notax_tobe` | `orimny_settlement_notax_tobe` | `orimnySettlementNotaxTobe` | 待结算无税金额 |
| `orimny_settlement_saved` | `orimny_settlement_saved` | `orimnySettlementSaved` | 已结算含税金额(保存) |
| `orimny_settlement_tax` | `orimny_settlement_tax` | `orimnySettlementTax` | 已结算税额 |
| `orimny_settlement_tax_saved` | `orimny_settlement_tax_saved` | `orimnySettlementTaxSaved` | 已结算税额(保存) |
| `orimny_settlement_tax_tobe` | `orimny_settlement_tax_tobe` | `orimnySettlementTaxTobe` | 待结算税额 |
| `orimny_settlement_tobe` | `orimny_settlement_tobe` | `orimnySettlementTobe` | 待结算含税金额 |
| `orimny_sign` | `orimny_sign` | `orimnySign` | 已客户确认含税金额 |
| `orimny_sign_notax` | `orimny_sign_notax` | `orimnySignNotax` | 已客户确认无税金额 |
| `orimny_sign_notax_saved` | `orimny_sign_notax_saved` | `orimnySignNotaxSaved` | 已客户确认无税金额(保存) |
| `orimny_sign_notax_tobe` | `orimny_sign_notax_tobe` | `orimnySignNotaxTobe` | 待客户确认无税金额 |
| `orimny_sign_saved` | `orimny_sign_saved` | `orimnySignSaved` | 已客户确认含税金额(保存) |
| `orimny_sign_tax` | `orimny_sign_tax` | `orimnySignTax` | 已客户确认税额 |
| `orimny_sign_tax_saved` | `orimny_sign_tax_saved` | `orimnySignTaxSaved` | 已客户确认税额(保存) |
| `orimny_sign_tax_tobe` | `orimny_sign_tax_tobe` | `orimnySignTaxTobe` | 待客户确认税额 |
| `orimny_sign_tobe` | `orimny_sign_tobe` | `orimnySignTobe` | 待客户确认含税金额 |
| `outbound_quantity` | `outbound_quantity` | `outboundQuantity` | 已出库数量 |
| `outbound_quantity_tobe` | `outbound_quantity_tobe` | `outboundQuantityTobe` | 待出库数量 |
| `performance_progress` | `performance_progress` | `performanceProgress` | 履约进度 |
| `row_no` | `row_no` | `rowNo` | 基本信息行号 |
| `send_quantity_tobe` | `send_quantity_tobe` | `sendQuantityTobe` | 待发货数量 |
| `settlement_quantity` | `settlement_quantity` | `settlementQuantity` | 已结算数量 |
| `settlement_quantity_saved` | `settlement_quantity_saved` | `settlementQuantitySaved` | 已结算数量(保存) |
| `settlement_quantity_tobe` | `settlement_quantity_tobe` | `settlementQuantityTobe` | 待结算数量 |
| `sign_quantity` | `sign_quantity` | `signQuantity` | 已客户确认数量 |
| `sign_quantity_saved` | `sign_quantity_saved` | `signQuantitySaved` | 已客户确认数量(保存) |
| `sign_quantity_tobe` | `sign_quantity_tobe` | `signQuantityTobe` | 待客户确认数量 |
| `total_carry_forward_cost` | `total_carry_forward_cost` | `totalCarryForwardCost` | 累计结转成本 |
| `total_carry_forward_cost_save` | `total_carry_forward_cost_save` | `totalCarryForwardCostSave` | 累计结转成本（保存） |
| `total_confirm_loss` | `total_confirm_loss` | `totalConfirmLoss` | 累计确认损失 |
| `total_confirm_loss_save` | `total_confirm_loss_save` | `totalConfirmLossSave` | 累计确认损失（保存） |
| `total_cost` | `total_cost` | `totalCost` | 累计成本 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 特征 |
