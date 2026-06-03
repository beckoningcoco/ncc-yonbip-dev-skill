---
tags: [BIP, 元数据, 数据字典, fa.transferfievent.FIEventAssetCalcInfo]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 卡片核算信息 (`fa.transferfievent.FIEventAssetCalcInfo`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_ledger_b_calc` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`9a9f8733-e495-4106-af7d-06e5ff48af94`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 卡片核算信息 |
| 物理表 | `fa_ledger_b_calc` |
| 数据库 schema | `yonbip-fi-efa` |
| 所属应用 | `EFA` |
| 直连字段 | 214 个 |
| 子表 | 1 个 |
| 关联引用 | 24 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `eventAssetAssginInfoBodies` | `fa.transferfievent.FIEventAssetAssginInfo` | composition |

## 关联引用 (24个)

| 字段名 | 引用类型 |
|--------|---------|
| `asset_book_category_id` | `efa.fa_accbookassetclassref` |
| `org_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `staff` | `ucf-staff-center.bd_staff_all_ref` |
| `` | `` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `in_accentity_id` | `finbd.bd_allaccbodyref_all` |
| `depr_convention_id` | `yonbip-fi-efa.fa_depr_conventionref` |
| `org_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `grp_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `grp_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `busi_partner` | `productcenter.base_businesspartnerref` |
| `depr_method_id` | `yonbip-fi-efa.fa_depreciation_methodlistref` |
| `vendor` | `yssupplier.aa_vendor` |
| `gbl_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `asset_category_id` | `` |
| `disposal_convention_id` | `yonbip-fi-efa.fa_depr_conventionref` |
| `event_basic_id` | `` |
| `gbl_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `tax_item_id` | `yonbip-fi-taxpubdoc.RefTable_55c5b82f11` |
| `accbook_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `customer` | `productcenter.merchantRef` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 214 个直连字段

### 文本字段 (24个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年编码 |
| `accbook_id` | `accbook_id` | `accbook` | 账簿ID |
| `accbook_start_date` | `accbook_start_date` | `accbookStartDate` | 启用日期 |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `amorti_adjust_date` | `amorti_adjust_date` | `amortiAdjustDate` | 生效日期 |
| `asset_code` | `asset_code` | `assetCode` | 固定资产卡片编码 |
| `asset_id` | `asset_id` | `assetId` | 固定资产 |
| `begin_date` | `begin_date` | `beginDate` | 固定资产开始使用日期 |
| `create_asset_date` | `create_asset_date` | `createAssetDate` | 建卡日期 |
| `depr_start_date` | `depr_start_date` | `deprStartDate` | 开始折旧日期 |
| `depr_status` | `depr_status` | `deprStatus` | 折旧状态 |
| `direction` | `direction` | `direction` | 方向 |
| `disposal_date` | `disposal_date` | `disposalDate` | 处置日期 |
| `end_depr_date` | `end_depr_date` | `endDeprDate` | 结束折旧日期 |
| `fi_event_code` | `fi_event_code` | `eventCode` | 会计事务编码 |
| `fi_event_id` | `fi_event_id` | `eventId` | 会计事务 |
| `exchange_rate_type` | `exchange_rate_type` | `exchangeRateType` | 汇率类型 |
| `disposal_status` | `disposal_status` | `fixedStatus` | 处置状态 |
| `header_id` | `header_id` | `headerId` | 主表ID |
| `id` | `id` | `id` | 主键 |
| `period_code` | `period_code` | `period` | 会计期间编码 |
| `scrap_value_type` | `scrap_value_type` | `scrapValueType` | 残值类型 |
| `usage_state_id` | `usage_state_id` | `usageStateId` | 固定资产使用状态 |
| `workload_unit` | `workload_unit` | `workloadUnit` | 工作量单位 |

### 引用字段 (22个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `event_basic_id` | `event_basic_id` | `eventAssetBasicInfoId` | 基本信息Id |
| `accbook_currtype_id` | `accbook_currtype_id` | `accbookCurrtypeId` | 本币币种 |
| `asset_book_category_id` | `asset_book_category_id` | `assetBookCategoryId` | 固定资产账簿类别 |
| `asset_category_id` | `asset_category_id` | `assetCategoryId` | 固定资产类别 |
| `busi_partner` | `busi_partner` | `busiPartner` | 业务伙伴 |
| `creator` | `creator` | `creator` | 创建人 |
| `customer` | `customer` | `customer` | 客户 |
| `depr_convention_id` | `depr_convention_id` | `deprConventionId` | 折旧惯例 |
| `depr_method_id` | `depr_method_id` | `deprMethodId` | 折旧方法 |
| `disposal_convention_id` | `disposal_convention_id` | `disposalConventionId` | 处置惯例 |
| `gbl_currtype_id` | `gbl_currtype_id` | `gblCurrtypeId` | 全局币币种 |
| `gbl_rate_type_id` | `gbl_rate_type_id` | `gblRateTypeId` | 全局币汇率类型 |
| `grp_currtype_id` | `grp_currtype_id` | `grpCurrtypeId` | 集团币币种 |
| `grp_rate_type_id` | `grp_rate_type_id` | `grpRateTypeId` | 集团币汇率类型 |
| `in_accentity_id` | `in_accentity_id` | `inAccentityId` | 调入会计主体 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `org_currtype_id` | `org_currtype_id` | `orgCurrtypeId` | 组织币币种 |
| `org_rate_type_id` | `org_rate_type_id` | `orgRateTypeId` | 组织币汇率类型 |
| `staff` | `staff` | `staff` | 员工 |
| `tax_item_id` | `tax_item_id` | `taxItemId` | 税目 |
| `vendor` | `vendor` | `vendor` | 供应商 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_amorti_adjust` | `bln_amorti_adjust` | `amortiAdjustMark` | 摊销调整标识 |
| `bln_super_depr` | `bln_super_depr` | `blnSuperDepr` | 是否高级折旧 |
| `bln_depr` | `bln_depr` | `isDepr` | 是否折旧 |
| `is_init` | `is_init` | `isInit` | 是否期初 |
| `bln_input_vat_recoverable` | `bln_input_vat_recoverable` | `isInputVATRecoverable` | 进项税转出 |
| `bln_month_depr` | `bln_month_depr` | `isMonthdepr` | 当月是否计提折旧 |

### 枚举字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exchange_rate_ops` | `exchange_rate_ops` | `exchangeRateOps` | 本币汇率折算方式 |
| `gbl_rate_ops` | `gbl_rate_ops` | `gblRateOps` | 全局币汇率折算方式 |
| `grp_rate_ops` | `grp_rate_ops` | `grpRateOps` | 集团币汇率折算方式 |
| `metering_mode` | `metering_mode` | `meteringMode` | 计量模式 |
| `org_rate_ops` | `org_rate_ops` | `orgRateOps` | 组织币汇率折算方式 |

### 整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accrued_period` | `accrued_period` | `extractedPeriod` | 已计提期数 |
| `life_month` | `life_month` | `lifeMonth` | 使用月限 |
| `life_period_count` | `life_period_count` | `lifePeriodCount` | 折旧总期数 |
| `life_year` | `life_year` | `lifeYear` | 使用年限 |
| `remain_depr_period` | `remain_depr_period` | `remainDeprPeriod` | 剩余折旧期数 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_year_id` | `acc_year_id` | `accYearId` | 会计年ID |
| `period_id` | `period_id` | `periodId` | 会计期间 |

### 数值字段 (144个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_accum_fair_value_change` | `acc_accum_fair_value_change` | `accAccumFairValueChange` | 本币累计公允价值变动 |
| `acc_accum_fair_value_difference` | `acc_accum_fair_value_difference` | `accAccumFairValueDifference` | 本币累计公允价值变动发生额 |
| `acc_accum_fair_value_gainloss` | `acc_accum_fair_value_gainloss` | `accAccumFairValueGainloss` | 本币累计公允价值变动损益 |
| `acc_accum_fair_value_gainloss_difference` | `acc_accum_fair_value_gainloss_difference` | `accAccumFairValueGainlossDifference` | 本币累计公允价值变动损益发生额 |
| `acc_accum_interest` | `acc_accum_interest` | `accAccumInterest` | 本币累计计提利息 |
| `acc_adjust_depr_amount` | `acc_adjust_depr_amount` | `accAdjustDeprAmount` | 本币追溯调整折旧 |
| `acc_comprehensive_Income` | `acc_comprehensive_Income` | `accComprehensiveIncome` | 本币其他综合收益 |
| `acc_comprehensive_income_difference` | `acc_comprehensive_income_difference` | `accComprehensiveIncomeDifference` | 本币其他综合收益发生额 |
| `acc_fair_value` | `acc_fair_value` | `accFairValue` | 本币公允价值 |
| `acc_fair_value_cost` | `acc_fair_value_cost` | `accFairValueCost` | 本币公允价值成本 |
| `acc_fair_value_cost_difference` | `acc_fair_value_cost_difference` | `accFairValueCostDifference` | 本币公允价值成本发生额 |
| `acc_fair_value_difference` | `acc_fair_value_difference` | `accFairValueDifference` | 本币公允价值发生额 |
| `acc_init_direct_cost` | `acc_init_direct_cost` | `accInitDirectCost` | 本币初始直接费用 |
| `acc_lease_incentive_amount` | `acc_lease_incentive_amount` | `accLeaseIncentiveAmount` | 本币租金激励金额 |
| `acc_lease_payment` | `acc_lease_payment` | `accLeasePayment` | 本币租赁付款额合计 |
| `acc_pre_liability` | `acc_pre_liability` | `accPreLiability` | 本币预计负债 |
| `acc_uncon_finance_cost` | `acc_uncon_finance_cost` | `accUnconFinanceCost` | 本币未确认融资费用 |
| `acc_year_fair_value_change` | `acc_year_fair_value_change` | `accYearFairValueChange` | 本币本年公允价值变动 |
| `acc_year_fair_value_difference` | `acc_year_fair_value_difference` | `accYearFairValueDifference` | 本币本年公允价值变动发生额 |
| `acc_year_fair_value_gainloss` | `acc_year_fair_value_gainloss` | `accYearFairValueGainloss` | 本币本年公允价值变动损益 |
| `acc_year_fair_value_gainloss_difference` | `acc_year_fair_value_gainloss_difference` | `accYearFairValueGainlossDifference` | 本币本年公允价值变动损益发生额 |
| `accrual_ori_value` | `accrual_ori_value` | `accrualOriValue` | 本币计提原值 |
| `accum_imp_amount` | `accum_imp_amount` | `accumImpAmount` | 本币累计减值 |
| `added_tax_amount` | `added_tax_amount` | `addedTaxAmount` | 本币税额 |
| `cur_year_imp_amount` | `cur_year_imp_amount` | `curYearImpAmount` | 本币本年减值 |
| `depr_amount` | `depr_amount` | `deprAmount` | 本币累计折旧 |
| `exchange_rate` | `exchange_rate` | `exchangeRate` | 本币汇率 |
| `existing_workload` | `existing_workload` | `existingWorkload` | 累计工作量 |
| `fc_ori_value` | `fc_ori_value` | `fcOriValue` | 原币原值 |
| `gbl_accrual_ori_value_amount` | `gbl_accrual_ori_value_amount` | `gblAccrualOriValueAmount` | 全局币计提原值 |
| `gbl_accum_depr_amount` | `gbl_accum_depr_amount` | `gblAccumDeprAmount` | 全局币累计折旧 |
| `gbl_accum_fair_value_change` | `gbl_accum_fair_value_change` | `gblAccumFairValueChange` | 全局币累计公允价值变动 |
| `gbl_accum_fair_value_difference` | `gbl_accum_fair_value_difference` | `gblAccumFairValueDifference` | 全局币累计公允价值变动发生额 |
| `gbl_accum_fair_value_gainloss` | `gbl_accum_fair_value_gainloss` | `gblAccumFairValueGainloss` | 全局币累计公允价值变动损益 |
| `gbl_accum_fair_value_gainloss_difference` | `gbl_accum_fair_value_gainloss_difference` | `gblAccumFairValueGainlossDifference` | 全局币累计公允价值变动损益发生额 |
| `gbl_accum_imp_amount` | `gbl_accum_imp_amount` | `gblAccumImpAmount` | 全局币累计减值 |
| `gbl_accum_interest` | `gbl_accum_interest` | `gblAccumInterest` | 全局币累计计提利息 |
| `gbl_added_tax_amount` | `gbl_added_tax_amount` | `gblAddedTaxAmount` | 全局币税额 |
| `gbl_adjust_depr_amount` | `gbl_adjust_depr_amount` | `gblAdjustDeprAmount` | 全局币追溯调整折旧 |
| `gbl_comprehensive_income` | `gbl_comprehensive_income` | `gblComprehensiveIncome` | 全局币其他综合收益 |
| `gbl_comprehensive_income_difference` | `gbl_comprehensive_income_difference` | `gblComprehensiveIncomeDifference` | 全局币其他综合收益发生额 |
| `gbl_cost_amount` | `gbl_cost_amount` | `gblCostAmount` | 全局币原始成本 |
| `gbl_cur_year_imp_amount` | `gbl_cur_year_imp_amount` | `gblCurYearImpAmount` | 全局币本年减值 |
| `gbl_fair_value` | `gbl_fair_value` | `gblFairValue` | 全局币公允价值 |
| `gbl_fair_value_cost` | `gbl_fair_value_cost` | `gblFairValueCost` | 全局币公允价值成本 |
| `gbl_fair_value_cost_difference` | `gbl_fair_value_cost_difference` | `gblFairValueCostDifference` | 全局币公允价值成本发生额 |
| `gbl_fair_value_difference` | `gbl_fair_value_difference` | `gblFairValueDifference` | 全局币公允价值发生额 |
| `gbl_init_direct_cost` | `gbl_init_direct_cost` | `gblInitDirectCost` | 全局币初始直接费用 |
| `gbl_lease_incentive_amount` | `gbl_lease_incentive_amount` | `gblLeaseIncentiveAmount` | 全局币租金激励金额 |
| `gbl_lease_payment` | `gbl_lease_payment` | `gblLeasePayment` | 全局币租赁付款额合计 |
| `gbl_net_amount` | `gbl_net_amount` | `gblNetAmount` | 全局币账面价值 |
| `gbl_net_value` | `gbl_net_value` | `gblNetValue` | 全局币账面净值 |
| `gbl_ori_value_amount` | `gbl_ori_value_amount` | `gblOriValueAmount` | 全局币原值 |
| `gbl_pre_liability` | `gbl_pre_liability` | `gblPreLiability` | 全局币预计负债 |
| `gbl_rate` | `gbl_rate` | `gblRate` | 全局币汇率 |
| `gbl_scrap_value_amount` | `gbl_scrap_value_amount` | `gblScrapValueAmount` | 全局币净残值 |
| `gbl_uncon_finance_cost` | `gbl_uncon_finance_cost` | `gblUnconFinanceCost` | 全局币未确认融资费用 |
| `gbl_year_depr_amount` | `gbl_year_depr_amount` | `gblYearDeprAmount` | 全局币本年折旧 |
| `gbl_year_fair_value_change` | `gbl_year_fair_value_change` | `gblYearFairValueChange` | 全局币本年公允价值变动 |
| `gbl_year_fair_value_difference` | `gbl_year_fair_value_difference` | `gblYearFairValueDifference` | 全局币本年公允价值变动发生额 |
| `gbl_year_fair_value_gainloss` | `gbl_year_fair_value_gainloss` | `gblYearFairValueGainloss` | 全局币本年公允价值变动损益 |
| `gbl_year_fair_value_gainloss_difference` | `gbl_year_fair_value_gainloss_difference` | `gblYearFairValueGainlossDifference` | 全局币本年公允价值变动损益发生额 |
| `grp_accrual_ori_value_amount` | `grp_accrual_ori_value_amount` | `grpAccrualOriValueAmount` | 集团币计提原值 |
| `grp_accum_depr_amount` | `grp_accum_depr_amount` | `grpAccumDeprAmount` | 集团币累计折旧 |
| `grp_accum_fair_value_change` | `grp_accum_fair_value_change` | `grpAccumFairValueChange` | 集团币累计公允价值变动 |
| `grp_accum_fair_value_difference` | `grp_accum_fair_value_difference` | `grpAccumFairValueDifference` | 集团币累计公允价值变动发生额 |
| `grp_accum_fair_value_gainloss` | `grp_accum_fair_value_gainloss` | `grpAccumFairValueGainloss` | 集团币累计公允价值变动损益 |
| `grp_accum_fair_value_gainloss_difference` | `grp_accum_fair_value_gainloss_difference` | `grpAccumFairValueGainlossDifference` | 集团币累计公允价值变动损益发生额 |
| `grp_accum_imp_amount` | `grp_accum_imp_amount` | `grpAccumImpAmount` | 集团币累计减值 |
| `grp_accum_interest` | `grp_accum_interest` | `grpAccumInterest` | 集团币累计计提利息 |
| `grp_added_tax_amount` | `grp_added_tax_amount` | `grpAddedTaxAmount` | 集团币税额 |
| `grp_adjust_depr_amount` | `grp_adjust_depr_amount` | `grpAdjustDeprAmount` | 集团币追溯调整折旧 |
| `grp_comprehensive_income` | `grp_comprehensive_income` | `grpComprehensiveIncome` | 集团币其他综合收益 |
| `grp_comprehensive_income_difference` | `grp_comprehensive_income_difference` | `grpComprehensiveIncomeDifference` | 集团币其他综合收益发生额 |
| `grp_cost_amount` | `grp_cost_amount` | `grpCostAmount` | 集团币原始成本 |
| `grp_cur_year_imp_amount` | `grp_cur_year_imp_amount` | `grpCurYearImpAmount` | 集团币本年减值 |
| `grp_fair_value` | `grp_fair_value` | `grpFairValue` | 集团币公允价值 |
| `grp_fair_value_cost` | `grp_fair_value_cost` | `grpFairValueCost` | 集团币公允价值成本 |
| `grp_fair_value_cost_difference` | `grp_fair_value_cost_difference` | `grpFairValueCostDifference` | 集团币公允价值成本发生额 |
| `grp_fair_value_difference` | `grp_fair_value_difference` | `grpFairValueDifference` | 集团币公允价值发生额 |
| `grp_init_direct_cost` | `grp_init_direct_cost` | `grpInitDirectCost` | 集团币初始直接费用 |
| `grp_lease_incentive_amount` | `grp_lease_incentive_amount` | `grpLeaseIncentiveAmount` | 集团币租金激励金额 |
| `grp_lease_payment` | `grp_lease_payment` | `grpLeasePayment` | 集团币租赁付款额合计 |
| `grp_net_amount` | `grp_net_amount` | `grpNetAmount` | 集团币账面价值 |
| `grp_net_value` | `grp_net_value` | `grpNetValue` | 集团币账面净值 |
| `grp_ori_value_amount` | `grp_ori_value_amount` | `grpOriValueAmount` | 集团币原值 |
| `grp_pre_liability` | `grp_pre_liability` | `grpPreLiability` | 集团币预计负债 |
| `grp_rate` | `grp_rate` | `grpRate` | 集团币汇率 |
| `grp_scrap_value_amount` | `grp_scrap_value_amount` | `grpScrapValueAmount` | 集团币净残值 |
| `grp_uncon_finance_cost` | `grp_uncon_finance_cost` | `grpUnconFinanceCost` | 集团币未确认融资费用 |
| `grp_year_depr_amount` | `grp_year_depr_amount` | `grpYearDeprAmount` | 集团币本年折旧 |
| `grp_year_fair_value_change` | `grp_year_fair_value_change` | `grpYearFairValueChange` | 集团币本年公允价值变动 |
| `grp_year_fair_value_difference` | `grp_year_fair_value_difference` | `grpYearFairValueDifference` | 集团币本年公允价值变动发生额 |
| `grp_year_fair_value_gainloss` | `grp_year_fair_value_gainloss` | `grpYearFairValueGainloss` | 集团币本年公允价值变动损益 |
| `grp_year_fair_value_gainloss_difference` | `grp_year_fair_value_gainloss_difference` | `grpYearFairValueGainlossDifference` | 集团币本年公允价值变动损益发生额 |
| `month_workload` | `month_workload` | `monthWorkload` | 当期工作量 |
| `net_amount` | `net_amount` | `netAmount` | 本币账面价值 |
| `net_value` | `net_value` | `netValue` | 本币账面净值 |
| `org_accrual_ori_value_amount` | `org_accrual_ori_value_amount` | `orgAccrualOriValueAmount` | 组织币计提原值 |
| `org_accum_depr_amount` | `org_accum_depr_amount` | `orgAccumDeprAmount` | 组织币累计折旧 |
| `org_accum_fair_value_change` | `org_accum_fair_value_change` | `orgAccumFairValueChange` | 组织币累计公允价值变动 |
| `org_accum_fair_value_difference` | `org_accum_fair_value_difference` | `orgAccumFairValueDifference` | 组织币累计公允价值变动发生额 |
| `org_accum_fair_value_gainloss` | `org_accum_fair_value_gainloss` | `orgAccumFairValueGainloss` | 组织币累计公允价值变动损益 |
| `org_accum_fair_value_gainloss_difference` | `org_accum_fair_value_gainloss_difference` | `orgAccumFairValueGainlossDifference` | 组织币累计公允价值变动损益发生额 |
| `org_accum_imp_amount` | `org_accum_imp_amount` | `orgAccumImpAmount` | 组织币累计减值 |
| `org_accum_interest` | `org_accum_interest` | `orgAccumInterest` | 组织币累计计提利息 |
| `org_added_tax_amount` | `org_added_tax_amount` | `orgAddedTaxAmount` | 组织币税额 |
| `org_adjust_depr_amount` | `org_adjust_depr_amount` | `orgAdjustDeprAmount` | 组织币追溯调整折旧 |
| `org_comprehensive_Income` | `org_comprehensive_Income` | `orgComprehensiveIncome` | 组织币其他综合收益 |
| `org_comprehensive_income_difference` | `org_comprehensive_income_difference` | `orgComprehensiveIncomeDifference` | 组织币其他综合收益发生额 |
| `org_cost_amount` | `org_cost_amount` | `orgCostAmount` | 组织币原始成本 |
| `org_cur_year_imp_amount` | `org_cur_year_imp_amount` | `orgCurYearImpAmount` | 组织币本年减值 |
| `org_fair_value` | `org_fair_value` | `orgFairValue` | 组织币公允价值 |
| `org_fair_value_cost` | `org_fair_value_cost` | `orgFairValueCost` | 组织币公允价值成本 |
| `org_fair_value_cost_difference` | `org_fair_value_cost_difference` | `orgFairValueCostDifference` | 组织币公允价值成本发生额 |
| `org_fair_value_difference` | `org_fair_value_difference` | `orgFairValueDifference` | 组织币公允价值发生额 |
| `org_init_direct_cost` | `org_init_direct_cost` | `orgInitDirectCost` | 组织币初始直接费用 |
| `org_lease_incentive_amount` | `org_lease_incentive_amount` | `orgLeaseIncentiveAmount` | 组织币租金激励金额 |
| `org_lease_payment` | `org_lease_payment` | `orgLeasePayment` | 组织币租赁付款额合计 |
| `org_net_amount` | `org_net_amount` | `orgNetAmount` | 组织币账面价值 |
| `org_net_value` | `org_net_value` | `orgNetValue` | 组织币账面净值 |
| `org_ori_value_amount` | `org_ori_value_amount` | `orgOriValueAmount` | 组织币原值 |
| `org_pre_liability` | `org_pre_liability` | `orgPreLiability` | 组织币预计负债 |
| `org_rate` | `org_rate` | `orgRate` | 组织币汇率 |
| `org_scrap_value_amount` | `org_scrap_value_amount` | `orgScrapValueAmount` | 组织币净残值 |
| `org_uncon_finance_cost` | `org_uncon_finance_cost` | `orgUnconFinanceCost` | 组织币未确认融资费用 |
| `org_year_depr_amount` | `org_year_depr_amount` | `orgYearDeprAmount` | 组织币本年折旧 |
| `org_year_fair_value_change` | `org_year_fair_value_change` | `orgYearFairValueChange` | 组织币本年公允价值变动 |
| `org_year_fair_value_difference` | `org_year_fair_value_difference` | `orgYearFairValueDifference` | 组织币本年公允价值变动发生额 |
| `org_year_fair_value_gainloss` | `org_year_fair_value_gainloss` | `orgYearFairValueGainloss` | 组织币本年公允价值变动损益 |
| `org_year_fair_value_gainloss_difference` | `org_year_fair_value_gainloss_difference` | `orgYearFairValueGainlossDifference` | 组织币本年公允价值变动损益发生额 |
| `ori_accum_interest` | `ori_accum_interest` | `oriAccumInterest` | 原币累计计提利息 |
| `ori_init_direct_cost` | `ori_init_direct_cost` | `oriInitDirectCost` | 原币初始直接费用 |
| `ori_lease_incentive_amount` | `ori_lease_incentive_amount` | `oriLeaseIncentiveAmount` | 原币租金激励金额 |
| `ori_lease_payment` | `ori_lease_payment` | `oriLeasePayment` | 原币租赁付款额合计 |
| `ori_pre_liability` | `ori_pre_liability` | `oriPreLiability` | 原币预计负债 |
| `ori_uncon_finance_cost` | `ori_uncon_finance_cost` | `oriUnconFinanceCost` | 原币未确认融资费用 |
| `ori_value` | `ori_value` | `oriValue` | 本币原值 |
| `ori_cost_amount` | `ori_cost_amount` | `oricostAmount` | 本币原始成本 |
| `scrap_value` | `scrap_value` | `scrapValue` | 本币净残值 |
| `scrap_value_rate` | `scrap_value_rate` | `scrapValueRate` | 净残值率 |
| `tax_rate` | `tax_rate` | `taxRate` | 税率 |
| `total_workload` | `total_workload` | `totalWorkload` | 工作总量 |
| `year_depr_amount` | `year_depr_amount` | `yearDeprAmount` | 本币本年折旧 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义特征id |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `eventAssetAssginInfoBodies` | 卡片分配信息 |
