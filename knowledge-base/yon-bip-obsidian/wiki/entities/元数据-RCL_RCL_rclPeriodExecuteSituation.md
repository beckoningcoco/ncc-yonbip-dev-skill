---
tags: [BIP, 元数据, 数据字典, RCL.RCL.rclPeriodExecuteSituation]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 分期执行情况 (`RCL.RCL.rclPeriodExecuteSituation`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcl_periodexec` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`29a1c8eb-18f3-4f82-b4a8-2d20ae258702`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 分期执行情况 |
| 物理表 | `rcl_periodexec` |
| domain/服务域 | `yonbip-fi-ercl` |
| schema | `fiercl` |
| 所属应用 | `RVN` |
| 直连字段 | 294 个 |
| 子表 | 0 个 |
| 关联引用 | 13 个 |

## 关联引用 (13个)

| 字段名 | 引用类型 |
|--------|---------|
| `period_id` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `activity` | `` |
| `material_type_id` | `productcenter.pc_managementclassref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `wbs` | `` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `rcl_revenuecontract_base_id` | `` |
| `material_id` | `productcenter.baseProductRef` |
| `base_info_id` | `` |
| `acc_book_id` | `fiepub.fiepub_accountbooktreeref` |
| `project_id` | `ucfbasedoc.bd_projectNewRef` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 294 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | 分布式事务ID |
| `period_code` | `period_code` | `periodCode` | 期间编码 |

### 引用字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `material_id` | `material_id` | `materialId` | 物料 |
| `activity` | `activity` | `activity` | 活动 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |
| `project_id` | `project_id` | `projectId` | 项目 |
| `wbs` | `wbs` | `wbs` | WBS |
| `base_info_id` | `base_info_id` | `baseInfoId` | 履约义务行主键 |
| `period_id` | `period_id` | `periodId` | 期间 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `material_type_id` | `material_type_id` | `materialTypeId` | 物料类别 |
| `rcl_revenuecontract_base_id` | `rcl_revenuecontract_base_id` | `rclRevenuecontractBaseId` | 履约义务主表 |
| `acc_book_id` | `acc_book_id` | `accBook` | 账簿 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_check` | `bln_check` | `blnCheck` | 是否验收 |
| `bln_start_flag` | `bln_start_flag` | `blnStartFlag` | 期初标志 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dtc_status` | `dtc_status` | `dtcStatus` | 分布式事务状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (271个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `outbound_quantity_current` | `outbound_quantity_current` | `OutboundQuantityCurrent` | 本期出库数量 |
| `outbound_quantity_total` | `outbound_quantity_total` | `OutboundQuantityTotal` | 累计出库数量 |
| `cur_carry_forward_cost` | `cur_carry_forward_cost` | `curCarryForwardCost` | 本期结转成本 |
| `cur_carry_forward_cost_save` | `cur_carry_forward_cost_save` | `curCarryForwardCostSave` | 本期结转成本（保存） |
| `cur_confirm_loss` | `cur_confirm_loss` | `curConfirmLoss` | 本期确认损失 |
| `cur_confirm_loss_save` | `cur_confirm_loss_save` | `curConfirmLossSave` | 本期确认损失（保存） |
| `expect_cost` | `expect_cost` | `expectCost` | 预计成本 |
| `expect_debt` | `expect_debt` | `expectDebt` | 预计负债 |
| `invoice_quantity_current_saved` | `invoice_quantity_current_saved` | `invoiceQuantityCurrentSaved` | 本期开票数量(保存) |
| `invoice_quantity_total_saved` | `invoice_quantity_total_saved` | `invoiceQuantityTotalSaved` | 累计开票数量(保存) |
| `localmny_interest_current` | `localmny_interest_current` | `localmnyInterestCurrent` | 本币本期含税利息收入 |
| `localmny_interest_current_saved` | `localmny_interest_current_saved` | `localmnyInterestCurrentSaved` | 本币本期含税利息收入(保存) |
| `localmny_interest_notax_current` | `localmny_interest_notax_current` | `localmnyInterestNotaxCurrent` | 本币本期无税利息收入 |
| `localmny_interest_notax_current_saved` | `localmny_interest_notax_current_saved` | `localmnyInterestNotaxCurrentSaved` | 本币本期无税利息收入(保存) |
| `localmny_interest_notax_total` | `localmny_interest_notax_total` | `localmnyInterestNotaxTotal` | 本币累计无税利息收入 |
| `localmny_interest_notax_total_saved` | `localmny_interest_notax_total_saved` | `localmnyInterestNotaxTotalSaved` | 本币累计无税利息收入(保存) |
| `localmny_interest_tax_current` | `localmny_interest_tax_current` | `localmnyInterestTaxCurrent` | 本币本期利息收入税额 |
| `localmny_interest_tax_current_saved` | `localmny_interest_tax_current_saved` | `localmnyInterestTaxCurrentSaved` | 本币本期利息收入税额(保存) |
| `localmny_interest_tax_total` | `localmny_interest_tax_total` | `localmnyInterestTaxTotal` | 本币累计利息收入税额 |
| `localmny_interest_tax_total_saved` | `localmny_interest_tax_total_saved` | `localmnyInterestTaxTotalSaved` | 本币累计利息收入税额(保存) |
| `localmny_interest_total` | `localmny_interest_total` | `localmnyInterestTotal` | 本币累计含税利息收入 |
| `localmny_interest_total_saved` | `localmny_interest_total_saved` | `localmnyInterestTotalSaved` | 本币累计含税利息收入(保存) |
| `localmny_invoice_current_saved` | `localmny_invoice_current_saved` | `localmnyInvoiceCurrentSaved` | 本币本期开票含税金额(保存) |
| `localmny_invoice_notax_current_saved` | `localmny_invoice_notax_current_saved` | `localmnyInvoiceNotaxCurrentSaved` | 本币本期开票无税金额(保存) |
| `localmny_invoice_notax_total_saved` | `localmny_invoice_notax_total_saved` | `localmnyInvoiceNotaxTotalSaved` | 本币累计开票无税金额(保存) |
| `localmny_invoice_tax_current_saved` | `localmny_invoice_tax_current_saved` | `localmnyInvoiceTaxCurrentSaved` | 本币本期开票税额(保存) |
| `localmny_invoice_tax_total_saved` | `localmny_invoice_tax_total_saved` | `localmnyInvoiceTaxTotalSaved` | 本币累计开票税额(保存) |
| `localmny_invoice_total_saved` | `localmny_invoice_total_saved` | `localmnyInvoiceTotalSaved` | 本币累计开票含税金额(保存) |
| `localmny_outbound_current` | `localmny_outbound_current` | `localmnyOutboundCurrent` | 本币本期出库含税金额 |
| `localmny_outbound_notax_current` | `localmny_outbound_notax_current` | `localmnyOutboundNotaxCurrent` | 本币本期出库无税金额 |
| `localmny_outbound_notax_total` | `localmny_outbound_notax_total` | `localmnyOutboundNotaxTotal` | 本币累计出库无税金额 |
| `localmny_outbound_tax_current` | `localmny_outbound_tax_current` | `localmnyOutboundTaxCurrent` | 本币本期出库税额 |
| `localmny_outbound_tax_total` | `localmny_outbound_tax_total` | `localmnyOutboundTaxTotal` | 本币累计出库税额 |
| `localmny_outbound_total` | `localmny_outbound_total` | `localmnyOutboundTotal` | 本币累计出库含税金额 |
| `localmny_receivable_current_saved` | `localmny_receivable_current_saved` | `localmnyReceivableCurrentSaved` | 本币本期含税应收(保存) |
| `localmny_receivable_notax_current_saved` | `localmny_receivable_notax_current_saved` | `localmnyReceivableNotaxCurrentSaved` | 本币本期无税应收(保存) |
| `localmny_receivable_notax_total_saved` | `localmny_receivable_notax_total_saved` | `localmnyReceivableNotaxTotalSaved` | 本币累计无税应收(保存) |
| `localmny_receivable_tax_current_saved` | `localmny_receivable_tax_current_saved` | `localmnyReceivableTaxCurrentSaved` | 本币本期应收税额(保存) |
| `localmny_receivable_tax_total_saved` | `localmny_receivable_tax_total_saved` | `localmnyReceivableTaxTotalSaved` | 本币累计应收税额(保存) |
| `localmny_receivable_total_saved` | `localmny_receivable_total_saved` | `localmnyReceivableTotalSaved` | 本币累计含税应收(保存) |
| `orimny_interest_current` | `orimny_interest_current` | `orimnyInterestCurrent` | 本期含税利息收入 |
| `orimny_interest_current_saved` | `orimny_interest_current_saved` | `orimnyInterestCurrentSaved` | 本期含税利息收入(保存) |
| `orimny_interest_notax_current` | `orimny_interest_notax_current` | `orimnyInterestNotaxCurrent` | 本期无税利息收入 |
| `orimny_interest_notax_current_saved` | `orimny_interest_notax_current_saved` | `orimnyInterestNotaxCurrentSaved` | 本期无税利息收入(保存) |
| `orimny_interest_notax_total` | `orimny_interest_notax_total` | `orimnyInterestNotaxTotal` | 累计无税利息收入 |
| `orimny_interest_notax_total_saved` | `orimny_interest_notax_total_saved` | `orimnyInterestNotaxTotalSaved` | 累计无税利息收入(保存) |
| `orimny_interest_tax_current` | `orimny_interest_tax_current` | `orimnyInterestTaxCurrent` | 本期利息收入税额 |
| `orimny_interest_tax_current_saved` | `orimny_interest_tax_current_saved` | `orimnyInterestTaxCurrentSaved` | 本期利息收入税额(保存) |
| `orimny_interest_tax_total` | `orimny_interest_tax_total` | `orimnyInterestTaxTotal` | 累计利息收入税额 |
| `orimny_interest_tax_total_saved` | `orimny_interest_tax_total_saved` | `orimnyInterestTaxTotalSaved` | 累计利息收入税额(保存) |
| `orimny_interest_total` | `orimny_interest_total` | `orimnyInterestTotal` | 累计含税利息收入 |
| `orimny_interest_total_saved` | `orimny_interest_total_saved` | `orimnyInterestTotalSaved` | 累计含税利息收入(保存) |
| `orimny_invoice_current_saved` | `orimny_invoice_current_saved` | `orimnyInvoiceCurrentSaved` | 本期开票含税金额(保存) |
| `orimny_invoice_notax_current_saved` | `orimny_invoice_notax_current_saved` | `orimnyInvoiceNotaxCurrentSaved` | 本期开票无税金额(保存) |
| `orimny_invoice_notax_total_saved` | `orimny_invoice_notax_total_saved` | `orimnyInvoiceNotaxTotalSaved` | 累计开票无税金额(保存) |
| `orimny_invoice_tax_current_saved` | `orimny_invoice_tax_current_saved` | `orimnyInvoiceTaxCurrentSaved` | 本期开票税额(保存) |
| `orimny_invoice_tax_total_saved` | `orimny_invoice_tax_total_saved` | `orimnyInvoiceTaxTotalSaved` | 累计开票税额(保存) |
| `orimny_invoice_total_saved` | `orimny_invoice_total_saved` | `orimnyInvoiceTotalSaved` | 累计开票含税金额(保存) |
| `orimny_outbound_current` | `orimny_outbound_current` | `orimnyOutboundCurrent` | 本期出库含税金额 |
| `orimny_outbound_notax_current` | `orimny_outbound_notax_current` | `orimnyOutboundNotaxCurrent` | 本期出库无税金额 |
| `orimny_outbound_notax_total` | `orimny_outbound_notax_total` | `orimnyOutboundNotaxTotal` | 累计出库无税金额 |
| `orimny_outbound_tax_current` | `orimny_outbound_tax_current` | `orimnyOutboundTaxCurrent` | 本期出库税额 |
| `orimny_outbound_tax_total` | `orimny_outbound_tax_total` | `orimnyOutboundTaxTotal` | 累计出库税额 |
| `orimny_outbound_total` | `orimny_outbound_total` | `orimnyOutboundTotal` | 累计出库含税金额 |
| `orimny_receivable_current_saved` | `orimny_receivable_current_saved` | `orimnyReceivableCurrentSaved` | 本期含税应收(保存) |
| `orimny_receivable_notax_current_saved` | `orimny_receivable_notax_current_saved` | `orimnyReceivableNotaxCurrentSaved` | 本期无税应收(保存) |
| `orimny_receivable_notax_total_saved` | `orimny_receivable_notax_total_saved` | `orimnyReceivableNotaxTotalSaved` | 累计无税应收(保存) |
| `orimny_receivable_tax_current_saved` | `orimny_receivable_tax_current_saved` | `orimnyReceivableTaxCurrentSaved` | 本期应收税额(保存) |
| `orimny_receivable_tax_total_saved` | `orimny_receivable_tax_total_saved` | `orimnyReceivableTaxTotalSaved` | 累计应收税额(保存) |
| `orimny_receivable_total_saved` | `orimny_receivable_total_saved` | `orimnyReceivableTotalSaved` | 累计含税应收(保存) |
| `total_carry_forward_cost` | `total_carry_forward_cost` | `totalCarryForwardCost` | 累计结转成本 |
| `total_carry_forward_cost_save` | `total_carry_forward_cost_save` | `totalCarryForwardCostSave` | 累计结转成本（保存） |
| `total_confirm_loss` | `total_confirm_loss` | `totalConfirmLoss` | 累计确认损失 |
| `total_confirm_loss_save` | `total_confirm_loss_save` | `totalConfirmLossSave` | 累计确认损失（保存） |
| `total_cost` | `total_cost` | `totalCost` | 累计成本 |
| `sign_quantity_current_saved` | `sign_quantity_current_saved` | `signQuantityCurrentSaved` | 本期客户确认数量(保存) |
| `localmny_settlement_notax_current_saved` | `localmny_settlement_notax_current_saved` | `localmnySettlementNotaxCurrentSaved` | 本币本期结算无税金额(保存) |
| `orimny_schedule_total` | `orimny_schedule_total` | `orimnyScheduleTotal` | 累计进度含税金额 |
| `localmny_deferrevenue_total` | `localmny_deferrevenue_total` | `localmnyDeferrevenueTotal` | 本币累计含税递延收入 |
| `localmny_revenue_tax_total` | `localmny_revenue_tax_total` | `localmnyRevenueTaxTotal` | 本币累计收入税额 |
| `orimny_sign_current` | `orimny_sign_current` | `orimnySignCurrent` | 本期客户确认含税金额 |
| `orimny_schedule_tax_total` | `orimny_schedule_tax_total` | `orimnyScheduleTaxTotal` | 累计进度税额 |
| `localmny_deferrevenue_tax_current` | `localmny_deferrevenue_tax_current` | `localmnyDeferrevenueTaxCurrent` | 本币本期递延收入税额 |
| `localmny_settlement_tax_total_saved` | `localmny_settlement_tax_total_saved` | `localmnySettlementTaxTotalSaved` | 本币累计结算税额(保存) |
| `orimny_deferrevenue_current_cfmd_saved` | `orimny_deferrevenue_current_cfmd_saved` | `orimnyDeferrevenueCurrentCfmdSaved` | 本期已确认含税递延收入(保存) |
| `orimny_settlement_tax_current_saved` | `orimny_settlement_tax_current_saved` | `orimnySettlementTaxCurrentSaved` | 本期结算税额(保存) |
| `localmny_revenue_current_saved` | `localmny_revenue_current_saved` | `localmnyRevenueCurrentSaved` | 本币本期含税收入(保存) |
| `orimny_settlement_total` | `orimny_settlement_total` | `orimnySettlementTotal` | 累计结算含税金额 |
| `orimny_sign_total_saved` | `orimny_sign_total_saved` | `orimnySignTotalSaved` | 累计客户确认含税金额(保存) |
| `orimny_deferrevenue_notax_total_cfmd` | `orimny_deferrevenue_notax_total_cfmd` | `orimnyDeferrevenueNotaxTotalCfmd` | 累计已确认无税递延收入 |
| `orimny_sign_tax_current` | `orimny_sign_tax_current` | `orimnySignTaxCurrent` | 本期客户确认税额 |
| `localmny_deferrevenue_total_saved` | `localmny_deferrevenue_total_saved` | `localmnyDeferrevenueTotalSaved` | 本币累计含税递延收入(保存) |
| `orimny_invoice_notax_total` | `orimny_invoice_notax_total` | `orimnyInvoiceNotaxTotal` | 累计开票无税金额 |
| `orimny_settlement_current` | `orimny_settlement_current` | `orimnySettlementCurrent` | 本期结算含税金额 |
| `version` | `version` | `version` | 版本号 |
| `orimny_revenue_current` | `orimny_revenue_current` | `orimnyRevenueCurrent` | 本期含税收入 |
| `localmny_sign_total` | `localmny_sign_total` | `localmnySignTotal` | 本币累计客户确认含税金额 |
| `orimny_collection_tax_total` | `orimny_collection_tax_total` | `orimnyCollectionTaxTotal` | 累计收款税额 |
| `orimny_revenue_notax_total` | `orimny_revenue_notax_total` | `orimnyRevenueNotaxTotal` | 累计无税收入 |
| `localmny_sign_current` | `localmny_sign_current` | `localmnySignCurrent` | 本币本期客户确认含税金额 |
| `orimny_collection_notax_total` | `orimny_collection_notax_total` | `orimnyCollectionNotaxTotal` | 累计收款无税金额 |
| `orimny_collection_current_saved` | `orimny_collection_current_saved` | `orimnyCollectionCurrentSaved` | 本期收款含税金额(保存) |
| `localmny_invoice_total` | `localmny_invoice_total` | `localmnyInvoiceTotal` | 本币累计开票含税金额 |
| `sign_quantity_total_saved` | `sign_quantity_total_saved` | `signQuantityTotalSaved` | 累计客户确认数量(保存) |
| `settlement_quantity_current` | `settlement_quantity_current` | `settlementQuantityCurrent` | 本期结算数量 |
| `orimny_sign_tax_total_saved` | `orimny_sign_tax_total_saved` | `orimnySignTaxTotalSaved` | 累计客户确认税额(保存) |
| `orimny_deferrevenue_current_saved` | `orimny_deferrevenue_current_saved` | `orimnyDeferrevenueCurrentSaved` | 本期含税递延收入(保存) |
| `localmny_revenue_total_saved` | `localmny_revenue_total_saved` | `localmnyRevenueTotalSaved` | 本币累计含税收入(保存) |
| `orimny_settlement_total_saved` | `orimny_settlement_total_saved` | `orimnySettlementTotalSaved` | 累计结算含税金额(保存) |
| `localmny_collection_tax_current` | `localmny_collection_tax_current` | `localmnyCollectionTaxCurrent` | 本币本期收款税额 |
| `localmny_receivable_notax_total` | `localmny_receivable_notax_total` | `localmnyReceivableNotaxTotal` | 本币累计无税应收 |
| `localmny_settlement_current_saved` | `localmny_settlement_current_saved` | `localmnySettlementCurrentSaved` | 本币本期结算含税金额(保存) |
| `localmny_sign_tax_total_saved` | `localmny_sign_tax_total_saved` | `localmnySignTaxTotalSaved` | 本币累计客户确认税额(保存) |
| `localmny_deferrevenue_current_cfmd` | `localmny_deferrevenue_current_cfmd` | `localmnyDeferrevenueCurrentCfmd` | 本币本期已确认含税递延收入 |
| `localmny_settlement_notax_current` | `localmny_settlement_notax_current` | `localmnySettlementNotaxCurrent` | 本币本期结算无税金额 |
| `orimny_settlement_notax_current_saved` | `orimny_settlement_notax_current_saved` | `orimnySettlementNotaxCurrentSaved` | 本期结算无税金额(保存) |
| `orimny_receivable_notax_current` | `orimny_receivable_notax_current` | `orimnyReceivableNotaxCurrent` | 本期无税应收 |
| `localmny_deferrevenue_tax_total_cfmd` | `localmny_deferrevenue_tax_total_cfmd` | `localmnyDeferrevenueTaxTotalCfmd` | 本币累计已确认递延收入税额 |
| `orimny_collection_current` | `orimny_collection_current` | `orimnyCollectionCurrent` | 本期收款含税金额 |
| `localmny_receivable_notax_current` | `localmny_receivable_notax_current` | `localmnyReceivableNotaxCurrent` | 本币本期无税应收 |
| `orimny_deferrevenue_notax_total_cfmd_saved` | `orimny_deferrevenue_notax_total_cfmd_saved` | `orimnyDeferrevenueNotaxTotalCfmdSaved` | 累计已确认无税递延收入(保存) |
| `localmny_deferrevenue_tax_total_saved` | `localmny_deferrevenue_tax_total_saved` | `localmnyDeferrevenueTaxTotalSaved` | 本币累计递延收入税额(保存) |
| `orimny_sign_notax_total_saved` | `orimny_sign_notax_total_saved` | `orimnySignNotaxTotalSaved` | 累计客户确认无税金额(保存) |
| `settlement_quantity_total` | `settlement_quantity_total` | `settlementQuantityTotal` | 累计结算数量 |
| `localmny_settlement_current` | `localmny_settlement_current` | `localmnySettlementCurrent` | 本币本期结算含税金额 |
| `localmny_collection_notax_total_saved` | `localmny_collection_notax_total_saved` | `localmnyCollectionNotaxTotalSaved` | 本币累计收款无税金额(保存) |
| `localmny_invoice_notax_total` | `localmny_invoice_notax_total` | `localmnyInvoiceNotaxTotal` | 本币累计开票无税金额 |
| `progress` | `progress` | `progress` | 履约进度 |
| `localmny_deferrevenue_notax_total_cfmd_saved` | `localmny_deferrevenue_notax_total_cfmd_saved` | `localmnyDeferrevenueNotaxTotalCfmdSaved` | 本币累计已确认无税递延收入(保存) |
| `orimny_deferrevenue_notax_current_cfmd` | `orimny_deferrevenue_notax_current_cfmd` | `orimnyDeferrevenueNotaxCurrentCfmd` | 本期已确认无税递延收入 |
| `orimny_invoice_tax_total` | `orimny_invoice_tax_total` | `orimnyInvoiceTaxTotal` | 累计开票税额 |
| `orimny_schedule_tax_current` | `orimny_schedule_tax_current` | `orimnyScheduleTaxCurrent` | 本期进度税额 |
| `current_process` | `current_process` | `currentProcess` | 本期进度 |
| `localmny_settlement_tax_current` | `localmny_settlement_tax_current` | `localmnySettlementTaxCurrent` | 本币本期结算税额 |
| `orimny_invoice_current` | `orimny_invoice_current` | `orimnyInvoiceCurrent` | 本期开票含税金额 |
| `localmny_collection_current` | `localmny_collection_current` | `localmnyCollectionCurrent` | 本币本期收款含税金额 |
| `localmny_schedule_notax_current` | `localmny_schedule_notax_current` | `localmnyScheduleNotaxCurrent` | 本币本期进度无税金额 |
| `localmny_collection_notax_current` | `localmny_collection_notax_current` | `localmnyCollectionNotaxCurrent` | 本币本期收款无税金额 |
| `localmny_deferrevenue_current_cfmd_saved` | `localmny_deferrevenue_current_cfmd_saved` | `localmnyDeferrevenueCurrentCfmdSaved` | 本币本期已确认含税递延收入(保存) |
| `orimny_revenue_tax_current_saved` | `orimny_revenue_tax_current_saved` | `orimnyRevenueTaxCurrentSaved` | 本期收入税额(保存) |
| `localmny_deferrevenue_notax_current_cfmd_saved` | `localmny_deferrevenue_notax_current_cfmd_saved` | `localmnyDeferrevenueNotaxCurrentCfmdSaved` | 本币本期已确认无税递延收入(保存) |
| `orimny_deferrevenue_notax_current_cfmd_saved` | `orimny_deferrevenue_notax_current_cfmd_saved` | `orimnyDeferrevenueNotaxCurrentCfmdSaved` | 本期已确认无税递延收入(保存) |
| `localmny_schedule_notax_total` | `localmny_schedule_notax_total` | `localmnyScheduleNotaxTotal` | 本币累计进度无税金额 |
| `localmny_deferrevenue_tax_current_saved` | `localmny_deferrevenue_tax_current_saved` | `localmnyDeferrevenueTaxCurrentSaved` | 本币本期递延收入税额(保存) |
| `localmny_sign_tax_current_saved` | `localmny_sign_tax_current_saved` | `localmnySignTaxCurrentSaved` | 本币本期客户确认税额(保存) |
| `localmny_revenue_notax_current` | `localmny_revenue_notax_current` | `localmnyRevenueNotaxCurrent` | 本币本期无税收入 |
| `localmny_revenue_tax_current` | `localmny_revenue_tax_current` | `localmnyRevenueTaxCurrent` | 本币本期收入税额 |
| `localmny_revenue_total` | `localmny_revenue_total` | `localmnyRevenueTotal` | 本币累计含税收入 |
| `localmny_deferrevenue_notax_total_cfmd` | `localmny_deferrevenue_notax_total_cfmd` | `localmnyDeferrevenueNotaxTotalCfmd` | 本币累计已确认无税递延收入 |
| `orimny_deferrevenue_tax_total` | `orimny_deferrevenue_tax_total` | `orimnyDeferrevenueTaxTotal` | 累计递延收入税额 |
| `orimny_deferrevenue_notax_total` | `orimny_deferrevenue_notax_total` | `orimnyDeferrevenueNotaxTotal` | 累计无税递延收入 |
| `localmny_revenue_notax_total_saved` | `localmny_revenue_notax_total_saved` | `localmnyRevenueNotaxTotalSaved` | 本币累计无税收入(保存) |
| `localmny_invoice_tax_current` | `localmny_invoice_tax_current` | `localmnyInvoiceTaxCurrent` | 本币本期开票税额 |
| `orimny_settlement_notax_current` | `orimny_settlement_notax_current` | `orimnySettlementNotaxCurrent` | 本期结算无税金额 |
| `localmny_revenue_tax_total_saved` | `localmny_revenue_tax_total_saved` | `localmnyRevenueTaxTotalSaved` | 本币累计收入税额(保存) |
| `localmny_sign_tax_total` | `localmny_sign_tax_total` | `localmnySignTaxTotal` | 本币累计客户确认税额 |
| `orimny_settlement_notax_total` | `orimny_settlement_notax_total` | `orimnySettlementNotaxTotal` | 累计结算无税金额 |
| `localmny_sign_notax_total` | `localmny_sign_notax_total` | `localmnySignNotaxTotal` | 本币累计客户确认无税金额 |
| `localmny_settlement_total_saved` | `localmny_settlement_total_saved` | `localmnySettlementTotalSaved` | 本币累计结算含税金额(保存) |
| `localmny_deferrevenue_tax_current_cfmd` | `localmny_deferrevenue_tax_current_cfmd` | `localmnyDeferrevenueTaxCurrentCfmd` | 本币本期已确认递延收入税额 |
| `orimny_collection_tax_total_saved` | `orimny_collection_tax_total_saved` | `orimnyCollectionTaxTotalSaved` | 累计收款税额(保存) |
| `localmny_deferrevenue_notax_current_cfmd` | `localmny_deferrevenue_notax_current_cfmd` | `localmnyDeferrevenueNotaxCurrentCfmd` | 本币本期已确认无税递延收入 |
| `orimny_invoice_tax_current` | `orimny_invoice_tax_current` | `orimnyInvoiceTaxCurrent` | 本期开票税额 |
| `localmny_deferrevenue_tax_current_cfmd_saved` | `localmny_deferrevenue_tax_current_cfmd_saved` | `localmnyDeferrevenueTaxCurrentCfmdSaved` | 本币本期已确认递延收入税额(保存) |
| `orimny_collection_notax_total_saved` | `orimny_collection_notax_total_saved` | `orimnyCollectionNotaxTotalSaved` | 累计收款无税金额(保存) |
| `localmny_settlement_tax_total` | `localmny_settlement_tax_total` | `localmnySettlementTaxTotal` | 本币累计结算税额 |
| `localmny_invoice_notax_current` | `localmny_invoice_notax_current` | `localmnyInvoiceNotaxCurrent` | 本币本期开票无税金额 |
| `localmny_sign_total_saved` | `localmny_sign_total_saved` | `localmnySignTotalSaved` | 本币累计客户确认含税金额(保存) |
| `localmny_deferrevenue_current_saved` | `localmny_deferrevenue_current_saved` | `localmnyDeferrevenueCurrentSaved` | 本币本期含税递延收入(保存) |
| `localmny_receivable_tax_current` | `localmny_receivable_tax_current` | `localmnyReceivableTaxCurrent` | 本币本期应收税额 |
| `localmny_deferrevenue_total_cfmd` | `localmny_deferrevenue_total_cfmd` | `localmnyDeferrevenueTotalCfmd` | 本币累计已确认含税递延收入 |
| `localmny_collection_tax_total_saved` | `localmny_collection_tax_total_saved` | `localmnyCollectionTaxTotalSaved` | 本币累计收款税额(保存) |
| `orimny_sign_notax_current` | `orimny_sign_notax_current` | `orimnySignNotaxCurrent` | 本期客户确认无税金额 |
| `orimny_deferrevenue_notax_total_saved` | `orimny_deferrevenue_notax_total_saved` | `orimnyDeferrevenueNotaxTotalSaved` | 累计无税递延收入(保存) |
| `localmny_settlement_tax_current_saved` | `localmny_settlement_tax_current_saved` | `localmnySettlementTaxCurrentSaved` | 本币本期结算税额(保存) |
| `orimny_collection_total_saved` | `orimny_collection_total_saved` | `orimnyCollectionTotalSaved` | 累计收款含税金额(保存) |
| `orimny_deferrevenue_tax_current_cfmd` | `orimny_deferrevenue_tax_current_cfmd` | `orimnyDeferrevenueTaxCurrentCfmd` | 本期已确认递延收入税额 |
| `localmny_deferrevenue_current` | `localmny_deferrevenue_current` | `localmnyDeferrevenueCurrent` | 本币本期含税递延收入 |
| `localmny_receivable_total` | `localmny_receivable_total` | `localmnyReceivableTotal` | 本币累计含税应收 |
| `localmny_schedule_tax_total` | `localmny_schedule_tax_total` | `localmnyScheduleTaxTotal` | 本币累计进度税额 |
| `invoice_quantity_current` | `invoice_quantity_current` | `invoiceQuantityCurrent` | 本期开票数量 |
| `orimny_sign_tax_current_saved` | `orimny_sign_tax_current_saved` | `orimnySignTaxCurrentSaved` | 本期客户确认税额(保存) |
| `localmny_sign_notax_total_saved` | `localmny_sign_notax_total_saved` | `localmnySignNotaxTotalSaved` | 本币累计客户确认无税金额(保存) |
| `orimny_revenue_current_saved` | `orimny_revenue_current_saved` | `orimnyRevenueCurrentSaved` | 本期含税收入(保存) |
| `orimny_deferrevenue_current_cfmd` | `orimny_deferrevenue_current_cfmd` | `orimnyDeferrevenueCurrentCfmd` | 本期已确认含税递延收入 |
| `localmny_collection_current_saved` | `localmny_collection_current_saved` | `localmnyCollectionCurrentSaved` | 本币本期收款含税金额(保存) |
| `orimny_settlement_current_saved` | `orimny_settlement_current_saved` | `orimnySettlementCurrentSaved` | 本期结算含税金额(保存) |
| `localmny_invoice_current` | `localmny_invoice_current` | `localmnyInvoiceCurrent` | 本币本期开票含税金额 |
| `localmny_sign_notax_current` | `localmny_sign_notax_current` | `localmnySignNotaxCurrent` | 本币本期客户确认无税金额 |
| `orimny_collection_tax_current_saved` | `orimny_collection_tax_current_saved` | `orimnyCollectionTaxCurrentSaved` | 本期收款税额(保存) |
| `orimny_sign_notax_current_saved` | `orimny_sign_notax_current_saved` | `orimnySignNotaxCurrentSaved` | 本期客户确认无税金额(保存) |
| `localmny_collection_notax_total` | `localmny_collection_notax_total` | `localmnyCollectionNotaxTotal` | 本币累计收款无税金额 |
| `orimny_receivable_total` | `orimny_receivable_total` | `orimnyReceivableTotal` | 累计含税应收 |
| `orimny_sign_current_saved` | `orimny_sign_current_saved` | `orimnySignCurrentSaved` | 本期客户确认含税金额(保存) |
| `orimny_receivable_current` | `orimny_receivable_current` | `orimnyReceivableCurrent` | 本期含税应收 |
| `orimny_deferrevenue_total_saved` | `orimny_deferrevenue_total_saved` | `orimnyDeferrevenueTotalSaved` | 累计含税递延收入(保存) |
| `sign_quantity_total` | `sign_quantity_total` | `signQuantityTotal` | 累计客户确认数量 |
| `orimny_invoice_notax_current` | `orimny_invoice_notax_current` | `orimnyInvoiceNotaxCurrent` | 本期开票无税金额 |
| `orimny_receivable_notax_total` | `orimny_receivable_notax_total` | `orimnyReceivableNotaxTotal` | 累计无税应收 |
| `orimny_schedule_notax_total` | `orimny_schedule_notax_total` | `orimnyScheduleNotaxTotal` | 累计进度无税金额 |
| `orimny_collection_notax_current` | `orimny_collection_notax_current` | `orimnyCollectionNotaxCurrent` | 本期收款无税金额 |
| `localmny_deferrevenue_notax_current_saved` | `localmny_deferrevenue_notax_current_saved` | `localmnyDeferrevenueNotaxCurrentSaved` | 本币本期无税递延收入(保存) |
| `row_no` | `row_no` | `rowNo` | 基本信息行号 |
| `localmny_deferrevenue_tax_total_cfmd_saved` | `localmny_deferrevenue_tax_total_cfmd_saved` | `localmnyDeferrevenueTaxTotalCfmdSaved` | 本币累计已确认递延收入税额(保存) |
| `localmny_deferrevenue_notax_total_saved` | `localmny_deferrevenue_notax_total_saved` | `localmnyDeferrevenueNotaxTotalSaved` | 本币累计无税递延收入(保存) |
| `orimny_deferrevenue_tax_total_cfmd_saved` | `orimny_deferrevenue_tax_total_cfmd_saved` | `orimnyDeferrevenueTaxTotalCfmdSaved` | 累计已确认递延收入税额(保存) |
| `settlement_quantity_current_saved` | `settlement_quantity_current_saved` | `settlementQuantityCurrentSaved` | 本期结算数量(保存) |
| `orimny_sign_notax_total` | `orimny_sign_notax_total` | `orimnySignNotaxTotal` | 累计客户确认无税金额 |
| `sign_quantity_current` | `sign_quantity_current` | `signQuantityCurrent` | 本期客户确认数量 |
| `orimny_deferrevenue_tax_current_saved` | `orimny_deferrevenue_tax_current_saved` | `orimnyDeferrevenueTaxCurrentSaved` | 本期递延收入税额(保存) |
| `localmny_deferrevenue_notax_total` | `localmny_deferrevenue_notax_total` | `localmnyDeferrevenueNotaxTotal` | 本币累计无税递延收入 |
| `settlement_quantity_total_saved` | `settlement_quantity_total_saved` | `settlementQuantityTotalSaved` | 累计结算数量(保存) |
| `localmny_sign_notax_current_saved` | `localmny_sign_notax_current_saved` | `localmnySignNotaxCurrentSaved` | 本币本期客户确认无税金额(保存) |
| `localmny_collection_notax_current_saved` | `localmny_collection_notax_current_saved` | `localmnyCollectionNotaxCurrentSaved` | 本币本期收款无税金额(保存) |
| `localmny_settlement_notax_total` | `localmny_settlement_notax_total` | `localmnySettlementNotaxTotal` | 本币累计结算无税金额 |
| `orimny_collection_tax_current` | `orimny_collection_tax_current` | `orimnyCollectionTaxCurrent` | 本期收款税额 |
| `localmny_receivable_tax_total` | `localmny_receivable_tax_total` | `localmnyReceivableTaxTotal` | 本币累计应收税额 |
| `orimny_deferrevenue_notax_current` | `orimny_deferrevenue_notax_current` | `orimnyDeferrevenueNotaxCurrent` | 本期无税递延收入 |
| `send_quantity_total` | `send_quantity_total` | `sendQuantityTotal` | 累计发货数量 |
| `orimny_settlement_tax_total_saved` | `orimny_settlement_tax_total_saved` | `orimnySettlementTaxTotalSaved` | 累计结算税额(保存) |
| `localmny_revenue_tax_current_saved` | `localmny_revenue_tax_current_saved` | `localmnyRevenueTaxCurrentSaved` | 本币本期收入税额(保存) |
| `localmny_sign_tax_current` | `localmny_sign_tax_current` | `localmnySignTaxCurrent` | 本币本期客户确认税额 |
| `orimny_deferrevenue_current` | `orimny_deferrevenue_current` | `orimnyDeferrevenueCurrent` | 本期含税递延收入 |
| `localmny_deferrevenue_total_cfmd_saved` | `localmny_deferrevenue_total_cfmd_saved` | `localmnyDeferrevenueTotalCfmdSaved` | 本币累计已确认含税递延收入(保存) |
| `orimny_revenue_total` | `orimny_revenue_total` | `orimnyRevenueTotal` | 累计含税收入 |
| `localmny_settlement_notax_total_saved` | `localmny_settlement_notax_total_saved` | `localmnySettlementNotaxTotalSaved` | 本币累计结算无税金额(保存) |
| `orimny_revenue_tax_current` | `orimny_revenue_tax_current` | `orimnyRevenueTaxCurrent` | 本期收入税额 |
| `localmny_schedule_total` | `localmny_schedule_total` | `localmnyScheduleTotal` | 本币累计进度含税金额 |
| `localmny_collection_total_saved` | `localmny_collection_total_saved` | `localmnyCollectionTotalSaved` | 本币累计收款含税金额(保存) |
| `localmny_revenue_notax_total` | `localmny_revenue_notax_total` | `localmnyRevenueNotaxTotal` | 本币累计无税收入 |
| `localmny_collection_tax_current_saved` | `localmny_collection_tax_current_saved` | `localmnyCollectionTaxCurrentSaved` | 本币本期收款税额(保存) |
| `orimny_deferrevenue_total_cfmd_saved` | `orimny_deferrevenue_total_cfmd_saved` | `orimnyDeferrevenueTotalCfmdSaved` | 累计已确认含税递延收入(保存) |
| `orimny_settlement_tax_total` | `orimny_settlement_tax_total` | `orimnySettlementTaxTotal` | 累计结算税额 |
| `localmny_collection_total` | `localmny_collection_total` | `localmnyCollectionTotal` | 本币累计收款含税金额 |
| `localmny_sign_current_saved` | `localmny_sign_current_saved` | `localmnySignCurrentSaved` | 本币本期客户确认含税金额(保存) |
| `orimny_schedule_notax_current` | `orimny_schedule_notax_current` | `orimnyScheduleNotaxCurrent` | 本期进度无税金额 |
| `orimny_revenue_notax_total_saved` | `orimny_revenue_notax_total_saved` | `orimnyRevenueNotaxTotalSaved` | 累计无税收入(保存) |
| `localmny_collection_tax_total` | `localmny_collection_tax_total` | `localmnyCollectionTaxTotal` | 本币累计收款税额 |
| `orimny_sign_total` | `orimny_sign_total` | `orimnySignTotal` | 累计客户确认含税金额 |
| `send_quantity_current` | `send_quantity_current` | `sendQuantityCurrent` | 本期发货数量 |
| `orimny_deferrevenue_notax_current_saved` | `orimny_deferrevenue_notax_current_saved` | `orimnyDeferrevenueNotaxCurrentSaved` | 本期无税递延收入(保存) |
| `orimny_deferrevenue_tax_total_cfmd` | `orimny_deferrevenue_tax_total_cfmd` | `orimnyDeferrevenueTaxTotalCfmd` | 累计已确认递延收入税额 |
| `localmny_invoice_tax_total` | `localmny_invoice_tax_total` | `localmnyInvoiceTaxTotal` | 本币累计开票税额 |
| `orimny_schedule_current` | `orimny_schedule_current` | `orimnyScheduleCurrent` | 本期进度含税金额 |
| `orimny_revenue_notax_current` | `orimny_revenue_notax_current` | `orimnyRevenueNotaxCurrent` | 本期无税收入 |
| `localmny_receivable_current` | `localmny_receivable_current` | `localmnyReceivableCurrent` | 本币本期含税应收 |
| `localmny_revenue_notax_current_saved` | `localmny_revenue_notax_current_saved` | `localmnyRevenueNotaxCurrentSaved` | 本币本期无税收入(保存) |
| `localmny_revenue_current` | `localmny_revenue_current` | `localmnyRevenueCurrent` | 本币本期含税收入 |
| `orimny_revenue_tax_total` | `orimny_revenue_tax_total` | `orimnyRevenueTaxTotal` | 累计收入税额 |
| `invoice_quantity_total` | `invoice_quantity_total` | `invoiceQuantityTotal` | 累计开票数量 |
| `localmny_schedule_tax_current` | `localmny_schedule_tax_current` | `localmnyScheduleTaxCurrent` | 本币本期进度税额 |
| `orimny_deferrevenue_tax_current` | `orimny_deferrevenue_tax_current` | `orimnyDeferrevenueTaxCurrent` | 本期递延收入税额 |
| `orimny_revenue_notax_current_saved` | `orimny_revenue_notax_current_saved` | `orimnyRevenueNotaxCurrentSaved` | 本期无税收入(保存) |
| `orimny_deferrevenue_tax_current_cfmd_saved` | `orimny_deferrevenue_tax_current_cfmd_saved` | `orimnyDeferrevenueTaxCurrentCfmdSaved` | 本期已确认递延收入税额(保存) |
| `orimny_sign_tax_total` | `orimny_sign_tax_total` | `orimnySignTaxTotal` | 累计客户确认税额 |
| `localmny_deferrevenue_notax_current` | `localmny_deferrevenue_notax_current` | `localmnyDeferrevenueNotaxCurrent` | 本币本期无税递延收入 |
| `localmny_settlement_total` | `localmny_settlement_total` | `localmnySettlementTotal` | 本币累计结算含税金额 |
| `orimny_deferrevenue_tax_total_saved` | `orimny_deferrevenue_tax_total_saved` | `orimnyDeferrevenueTaxTotalSaved` | 累计递延收入税额(保存) |
| `orimny_deferrevenue_total_cfmd` | `orimny_deferrevenue_total_cfmd` | `orimnyDeferrevenueTotalCfmd` | 累计已确认含税递延收入 |
| `orimny_settlement_tax_current` | `orimny_settlement_tax_current` | `orimnySettlementTaxCurrent` | 本期结算税额 |
| `orimny_collection_total` | `orimny_collection_total` | `orimnyCollectionTotal` | 累计收款含税金额 |
| `orimny_invoice_total` | `orimny_invoice_total` | `orimnyInvoiceTotal` | 累计开票含税金额 |
| `orimny_deferrevenue_total` | `orimny_deferrevenue_total` | `orimnyDeferrevenueTotal` | 累计含税递延收入 |
| `orimny_revenue_total_saved` | `orimny_revenue_total_saved` | `orimnyRevenueTotalSaved` | 累计含税收入(保存) |
| `orimny_receivable_tax_current` | `orimny_receivable_tax_current` | `orimnyReceivableTaxCurrent` | 本期应收税额 |
| `orimny_receivable_tax_total` | `orimny_receivable_tax_total` | `orimnyReceivableTaxTotal` | 累计应收税额 |
| `localmny_deferrevenue_tax_total` | `localmny_deferrevenue_tax_total` | `localmnyDeferrevenueTaxTotal` | 本币累计递延收入税额 |
| `orimny_settlement_notax_total_saved` | `orimny_settlement_notax_total_saved` | `orimnySettlementNotaxTotalSaved` | 累计结算无税金额(保存) |
| `orimny_collection_notax_current_saved` | `orimny_collection_notax_current_saved` | `orimnyCollectionNotaxCurrentSaved` | 本期收款无税金额(保存) |
| `orimny_revenue_tax_total_saved` | `orimny_revenue_tax_total_saved` | `orimnyRevenueTaxTotalSaved` | 累计收入税额(保存) |
| `localmny_schedule_current` | `localmny_schedule_current` | `localmnyScheduleCurrent` | 本币本期进度含税金额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 特征 |
