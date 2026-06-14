---
tags: [BIP, 元数据, 数据字典, fa.faaddition.AdditionCalculateInfo]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 新增单核算信息 (`fa.faaddition.AdditionCalculateInfo`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_bill_add_calc` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`26f6782d-c405-466f-8424-c393cad9c921`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 新增单核算信息 |
| 物理表 | `fa_bill_add_calc` |
| domain/服务域 | `yonbip-fi-efa` |
| schema | `fiefa` |
| 所属应用 | `EFA` |
| 直连字段 | 191 个 |
| 子表 | 1 个 |
| 关联引用 | 25 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `subjects` | `fa.faaddition.AdditionSubjectAssignment` | composition |

## 关联引用 (25个)

| 字段名 | 引用类型 |
|--------|---------|
| `asset_book_category_id` | `efa.fa_accbookassetclassref` |
| `accbook_property_id` | `fiepub.epub_accountbookpropertyref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `accentity_id` | `ucf-org-center.org_unit_tree_ref` |
| `org_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `grp_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `grp_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `depr_convention_id` | `yonbip-fi-efa.fa_depr_conventionref` |
| `depr_method_id` | `yonbip-fi-efa.fa_depreciation_methodlistref` |
| `disposal_convention_id` | `yonbip-fi-efa.fa_depr_conventionref` |
| `org_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `period_id` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `` | `` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `exchange_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `addition_bill_id` | `` |
| `gbl_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `asset_category_id` | `yonbip-fi-efa.fa_categorytree_ref` |
| `ori_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `gbl_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `tax_item_id` | `ucfbasedoc.bd_taxrate` |
| `accbook_currtype_id` | `ucfbasedoc.bd_currencytenantref` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 191 个直连字段

### 文本字段 (21个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_rate_date` | `acc_rate_date` | `accRateDate` | 本币汇率日期 |
| `accbook_start_date` | `accbook_start_date` | `accbookStartDate` | 启用日期 |
| `account_failure_reason` | `account_failure_reason` | `accountFailureReason` | 建账失败原因 |
| `account_status` | `account_status` | `accountStatus` | 建账状态 |
| `amortized_adjust_date` | `amortized_adjust_date` | `amortiAdjustDate` | 生效日期 |
| `accounting_classifi` | `accounting_classifi` | `booktype` | 账簿分类 |
| `create_asset_date` | `create_asset_date` | `createAssetDate` | 建卡日期 |
| `aprn_start_date` | `aprn_start_date` | `deprStartDate` | 开始折旧日期 |
| `depr_status` | `depr_status` | `deprStatus` | 折旧状态 |
| `disposal_date` | `disposal_date` | `disposalDate` | 处置日期 |
| `end_depr_date` | `end_depr_date` | `endDeprDate` | 结束折旧日期 |
| `first_amortized_adjust_date` | `first_amortized_adjust_date` | `firstAmortiAdjustDate` | 摊销起始日期 |
| `disposal_status` | `disposal_status` | `fixedStatus` | 处置状态 |
| `gbl_rate_date` | `gbl_rate_date` | `gblRateDate` | 全局币汇率日期 |
| `grp_rate_date` | `grp_rate_date` | `grpRateDate` | 集团币汇率日期 |
| `makerule_code` | `makerule_code` | `makeRuleCode` | 生单规则号 |
| `org_rate_date` | `org_rate_date` | `orgRateDate` | 组织币汇率日期 |
| `period_code` | `period_code` | `period` | 会计期间编码 |
| `scrap_value_type` | `scrap_value_type` | `scrapValueType` | 残值类型 |
| `workload_unit` | `workload_unit` | `workloadUnit` | 工作量单位 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (23个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `addition_bill_id` | `addition_bill_id` | `additionBillId` | 主表ID |
| `accbook_id` | `accbook_id` | `accbook` | 账簿 |
| `accbook_currtype_id` | `accbook_currtype_id` | `accbookCurrtypeId` | 本币币种 |
| `accbook_property_id` | `accbook_property_id` | `accbookProperty` | 账簿属性 |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `asset_book_category_id` | `asset_book_category_id` | `assetBookCategoryId` | 固定资产账簿类别 |
| `asset_category_id` | `asset_category_id` | `assetCategoryId` | 固定资产类别 |
| `depr_convention_id` | `depr_convention_id` | `deprConvention` | 折旧惯例 |
| `depr_method_id` | `depr_method_id` | `deprMethodId` | 折旧方法 |
| `disposal_convention_id` | `disposal_convention_id` | `disposalConvention` | 处置惯例 |
| `exchange_rate_type` | `exchange_rate_type` | `exchangeRateType` | 本币汇率类型 |
| `gbl_currtype_id` | `gbl_currtype_id` | `gblCurrtypeId` | 全局币币种 |
| `gbl_rate_type_id` | `gbl_rate_type_id` | `gblRateTypeId` | 全局币汇率类型 |
| `grp_currtype_id` | `grp_currtype_id` | `grpCurrtypeId` | 集团币币种 |
| `grp_rate_type_id` | `grp_rate_type_id` | `grpRateTypeId` | 集团币汇率类型 |
| `org_currtype_id` | `org_currtype_id` | `orgCurrtypeId` | 组织币币种 |
| `org_rate_type_id` | `org_rate_type_id` | `orgRateTypeId` | 组织币汇率类型 |
| `ori_currtype_id` | `ori_currtype_id` | `oriCurrtypeId` | 原币币种 |
| `period_id` | `period_id` | `periodId` | 会计期间 |
| `tax_item_id` | `tax_item_id` | `taxItemId` | 税目 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_amortized_adjust` | `bln_amortized_adjust` | `amortiAdjustMark` | 摊销调整标识 |
| `bln_senior_depr` | `bln_senior_depr` | `blnSuperDepr` | 是否高级折旧 |
| `bln_depr` | `bln_depr` | `isDepr` | 是否折旧 |
| `bln_init` | `bln_init` | `isInit` | 是否期初数据 |
| `bln_month_depr` | `bln_month_depr` | `isMonthdepr` | 新增资产当期计提 |

### 枚举字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_convert_param` | `acc_convert_param` | `accConvertParam` | 本币折算参数 |
| `exchange_rate_ops` | `exchange_rate_ops` | `exchangeRateOps` | 本币汇率折算方式 |
| `gbl_convert_param` | `gbl_convert_param` | `gblConvertParam` | 全局币折算参数 |
| `gbl_rate_ops` | `gbl_rate_ops` | `gblRateOps` | 全局币汇率折算方式 |
| `grp_convert_param` | `grp_convert_param` | `grpConvertParam` | 集团币折算参数 |
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

### 数值字段 (123个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_accum_int_accrued_amount` | `acc_accum_int_accrued_amount` | `accAccumIntAccruedAmount` | 本币累计计提利息 |
| `acc_adjust_depr_amount` | `acc_adjust_depr_amount` | `accAdjustDeprAmount` | 本币追溯调整折旧 |
| `org_accum_int_accrued_amount` | `org_accum_int_accrued_amount` | `orgAccumIntAccruedAmount` | 组织币累计计提利息 |
| `org_adjust_depr_amount` | `org_adjust_depr_amount` | `orgAdjustDeprAmount` | 组织币追溯调整折旧 |
| `acc_accum_fair_value_change` | `acc_accum_fair_value_change` | `accAccumFairValueChange` | 本币累计公允价值变动 |
| `acc_accum_fair_value_gainloss` | `acc_accum_fair_value_gainloss` | `accAccumFairValueGainloss` | 本币累计公允价值变动损益 |
| `acc_beginning_lease_liability` | `acc_beginning_lease_liability` | `accBeginningLeaseLiability` | 本币期初租赁负债 |
| `acc_comprehensive_income` | `acc_comprehensive_income` | `accComprehensiveIncome` | 本币其他综合收益 |
| `acc_fair_value` | `acc_fair_value` | `accFairValue` | 本币公允价值 |
| `acc_fair_value_cost` | `acc_fair_value_cost` | `accFairValueCost` | 本币公允价值成本 |
| `acc_init_direct_cost` | `acc_init_direct_cost` | `accInitDirectCost` | 本币初始直接费用 |
| `acc_lease_incentive_amount` | `acc_lease_incentive_amount` | `accLeaseIncentiveAmount` | 本币租金激励金额 |
| `acc_lease_payment` | `acc_lease_payment` | `accLeasePayment` | 本币租赁付款额合计 |
| `acc_pre_liability` | `acc_pre_liability` | `accPreLiability` | 本币预计负债 |
| `acc_pre_restore_cost` | `acc_pre_restore_cost` | `accPreRestoreCost` | 本币预计还原成本 |
| `acc_uncon_finance_cost` | `acc_uncon_finance_cost` | `accUnconFinanceCost` | 本币未确认融资费用 |
| `acc_year_fair_value_change` | `acc_year_fair_value_change` | `accYearFairValueChange` | 本币本年公允价值变动 |
| `acc_year_fair_value_gainloss` | `acc_year_fair_value_gainloss` | `accYearFairValueGainloss` | 本币本年公允价值变动损益 |
| `accum_imp_amount` | `accum_imp_amount` | `accumImpAmount` | 本币累计减值 |
| `added_tax_amount` | `added_tax_amount` | `addedTaxAmount` | 本币税额 |
| `cur_year_imp_amount` | `cur_year_imp_amount` | `curYearImpAmount` | 本币本年减值 |
| `acc_accum_depr_amount` | `acc_accum_depr_amount` | `deprAmount` | 本币累计折旧 |
| `exchange_rate` | `exchange_rate` | `exchangeRate` | 本币汇率 |
| `accum_workload` | `accum_workload` | `existingWorkload` | 累计工作量 |
| `ori_currtype_ori_amount` | `ori_currtype_ori_amount` | `fcOriValue` | 原币原值 |
| `gbl_accum_depr_amount` | `gbl_accum_depr_amount` | `gblAccumDeprAmount` | 全局币累计折旧 |
| `gbl_accum_fair_value_change` | `gbl_accum_fair_value_change` | `gblAccumFairValueChange` | 全局币累计公允价值变动 |
| `gbl_accum_fair_value_gainloss` | `gbl_accum_fair_value_gainloss` | `gblAccumFairValueGainloss` | 全局币累计公允价值变动损益 |
| `gbl_accum_imp_amount` | `gbl_accum_imp_amount` | `gblAccumImpAmount` | 全局币累计减值 |
| `gbl_added_tax_amount` | `gbl_added_tax_amount` | `gblAddedTaxAmount` | 全局币税额 |
| `gbl_beginning_lease_liability` | `gbl_beginning_lease_liability` | `gblBeginningLeaseLiability` | 全局币期初租赁负债 |
| `gbl_comprehensive_income` | `gbl_comprehensive_income` | `gblComprehensiveIncome` | 全局币其他综合收益 |
| `gbl_cost_amount` | `gbl_cost_amount` | `gblCostAmount` | 全局币原始成本 |
| `gbl_cur_year_imp_amount` | `gbl_cur_year_imp_amount` | `gblCurYearImpAmount` | 全局币本年减值 |
| `gbl_fair_value` | `gbl_fair_value` | `gblFairValue` | 全局币公允价值 |
| `gbl_fair_value_cost` | `gbl_fair_value_cost` | `gblFairValueCost` | 全局币公允价值成本 |
| `gbl_lease_payment` | `gbl_lease_payment` | `gblLeasePayment` | 全局币租赁付款额合计 |
| `gbl_net_amount` | `gbl_net_amount` | `gblNetAmount` | 全局币账面价值 |
| `gbl_net_value` | `gbl_net_value` | `gblNetValue` | 全局币账面净值 |
| `gbl_ori_value_amount` | `gbl_ori_value_amount` | `gblOriValueAmount` | 全局币原值 |
| `gbl_period_depr_amount` | `gbl_period_depr_amount` | `gblPeriodDeprAmount` | 全局币期折旧 |
| `gbl_period_depr_rate` | `gbl_period_depr_rate` | `gblPeriodDeprRate` | 全局币期折旧率 |
| `gbl_rate` | `gbl_rate` | `gblRate` | 全局币汇率 |
| `gbl_recoverable_cost_amount` | `gbl_recoverable_cost_amount` | `gblRecoverableCostAmount` | 全局币可回收成本 |
| `gbl_scrap_value_amount` | `gbl_scrap_value_amount` | `gblScrapValueAmount` | 全局币净残值 |
| `gbl_uncon_finance_cost` | `gbl_uncon_finance_cost` | `gblUnconFinanceCost` | 全局币未确认融资费用 |
| `gbl_unit_depr_amount` | `gbl_unit_depr_amount` | `gblUnitDeprAmount` | 全局币单位折旧 |
| `gbl_year_depr_amount` | `gbl_year_depr_amount` | `gblYearDeprAmount` | 全局币本年折旧 |
| `gbl_year_fair_value_change` | `gbl_year_fair_value_change` | `gblYearFairValueChange` | 全局币本年公允价值变动 |
| `gbl_year_fair_value_gainloss` | `gbl_year_fair_value_gainloss` | `gblYearFairValueGainloss` | 全局币本年公允价值变动损益 |
| `grp_accum_depr_amount` | `grp_accum_depr_amount` | `grpAccumDeprAmount` | 集团币累计折旧 |
| `grp_accum_fair_value_change` | `grp_accum_fair_value_change` | `grpAccumFairValueChange` | 集团币累计公允价值变动 |
| `grp_accum_fair_value_gainloss` | `grp_accum_fair_value_gainloss` | `grpAccumFairValueGainloss` | 集团币累计公允价值变动损益 |
| `grp_accum_imp_amount` | `grp_accum_imp_amount` | `grpAccumImpAmount` | 集团币累计减值 |
| `grp_added_tax_amount` | `grp_added_tax_amount` | `grpAddedTaxAmount` | 集团币税额 |
| `grp_beginning_lease_liability` | `grp_beginning_lease_liability` | `grpBeginningLeaseLiability` | 集团币期初租赁负债 |
| `grp_comprehensive_income` | `grp_comprehensive_income` | `grpComprehensiveIncome` | 集团币其他综合收益 |
| `grp_cost_amount` | `grp_cost_amount` | `grpCostAmount` | 集团币原始成本 |
| `grp_cur_year_imp_amount` | `grp_cur_year_imp_amount` | `grpCurYearImpAmount` | 集团币本年减值 |
| `grp_fair_value` | `grp_fair_value` | `grpFairValue` | 集团币公允价值 |
| `grp_fair_value_cost` | `grp_fair_value_cost` | `grpFairValueCost` | 集团币公允价值成本 |
| `grp_lease_payment` | `grp_lease_payment` | `grpLeasePayment` | 集团币租赁付款额合计 |
| `grp_net_amount` | `grp_net_amount` | `grpNetAmount` | 集团币账面价值 |
| `grp_net_value` | `grp_net_value` | `grpNetValue` | 集团币账面净值 |
| `grp_ori_value_amount` | `grp_ori_value_amount` | `grpOriValueAmount` | 集团币原值 |
| `grp_period_depr_amount` | `grp_period_depr_amount` | `grpPeriodDeprAmount` | 集团币期折旧 |
| `grp_period_depr_rate` | `grp_period_depr_rate` | `grpPeriodDeprRate` | 集团币期折旧率 |
| `grp_rate` | `grp_rate` | `grpRate` | 集团币汇率 |
| `grp_recoverable_cost_amount` | `grp_recoverable_cost_amount` | `grpRecoverableCostAmount` | 集团币可回收成本 |
| `grp_scrap_value_amount` | `grp_scrap_value_amount` | `grpScrapValueAmount` | 集团币净残值 |
| `grp_uncon_finance_cost` | `grp_uncon_finance_cost` | `grpUnconFinanceCost` | 集团币未确认融资费用 |
| `grp_unit_depr_amount` | `grp_unit_depr_amount` | `grpUnitDeprAmount` | 集团币单位折旧 |
| `grp_year_depr_amount` | `grp_year_depr_amount` | `grpYearDeprAmount` | 集团币本年折旧 |
| `grp_year_fair_value_change` | `grp_year_fair_value_change` | `grpYearFairValueChange` | 集团币本年公允价值变动 |
| `grp_year_fair_value_gainloss` | `grp_year_fair_value_gainloss` | `grpYearFairValueGainloss` | 集团币本年公允价值变动损益 |
| `init_acc_accum_depr_amount` | `init_acc_accum_depr_amount` | `initDeprAmount` | 本币累计折旧初始值 |
| `init_gbl_accum_depr_amount` | `init_gbl_accum_depr_amount` | `initGblAccumDeprAmount` | 全局币累计折旧初始值 |
| `init_grp_accum_depr_amount` | `init_grp_accum_depr_amount` | `initGrpAccumDeprAmount` | 集团币累计折旧初始值 |
| `init_org_accum_depr_amount` | `init_org_accum_depr_amount` | `initOrgAccumDeprAmount` | 组织币累计折旧初始值 |
| `period_depr_amount` | `period_depr_amount` | `monthDeprAmount` | 本币期折旧 |
| `period_depr_rate` | `period_depr_rate` | `monthDeprRate` | 本币期折旧率 |
| `month_workload` | `month_workload` | `monthWorkload` | 月工作量 |
| `net_amount` | `net_amount` | `netAmount` | 本币账面价值 |
| `net_value` | `net_value` | `netValue` | 本币账面净值 |
| `org_accum_depr_amount` | `org_accum_depr_amount` | `orgAccumDeprAmount` | 组织币累计折旧 |
| `org_accum_fair_value_change` | `org_accum_fair_value_change` | `orgAccumFairValueChange` | 组织币累计公允价值变动 |
| `org_accum_fair_value_gainloss` | `org_accum_fair_value_gainloss` | `orgAccumFairValueGainloss` | 组织币累计公允价值变动损益 |
| `org_accum_imp_amount` | `org_accum_imp_amount` | `orgAccumImpAmount` | 组织币累计减值 |
| `org_added_tax_amount` | `org_added_tax_amount` | `orgAddedTaxAmount` | 组织币税额 |
| `org_beginning_lease_liability` | `org_beginning_lease_liability` | `orgBeginningLeaseLiability` | 组织币期初租赁负债 |
| `org_comprehensive_income` | `org_comprehensive_income` | `orgComprehensiveIncome` | 组织币其他综合收益 |
| `org_cost_amount` | `org_cost_amount` | `orgCostAmount` | 组织币原始成本 |
| `org_cur_year_imp_amount` | `org_cur_year_imp_amount` | `orgCurYearImpAmount` | 组织币本年减值 |
| `org_fair_value` | `org_fair_value` | `orgFairValue` | 组织币公允价值 |
| `org_fair_value_cost` | `org_fair_value_cost` | `orgFairValueCost` | 组织币公允价值成本 |
| `org_init_direct_cost` | `org_init_direct_cost` | `orgInitDirectCost` | 组织币初始直接费用 |
| `org_lease_incentive_amount` | `org_lease_incentive_amount` | `orgLeaseIncentiveAmount` | 组织币租金激励金额 |
| `org_lease_payment` | `org_lease_payment` | `orgLeasePayment` | 组织币租赁付款额合计 |
| `org_net_amount` | `org_net_amount` | `orgNetAmount` | 组织币账面价值 |
| `org_net_value` | `org_net_value` | `orgNetValue` | 组织币账面净值 |
| `org_ori_value_amount` | `org_ori_value_amount` | `orgOriValueAmount` | 组织币原值 |
| `org_period_depr_amount` | `org_period_depr_amount` | `orgPeriodDeprAmount` | 组织币期折旧 |
| `org_period_depr_rate` | `org_period_depr_rate` | `orgPeriodDeprRate` | 组织币期折旧率 |
| `org_pre_liability` | `org_pre_liability` | `orgPreLiability` | 组织币预计负债 |
| `org_pre_restore_cost` | `org_pre_restore_cost` | `orgPreRestoreCost` | 组织币预计还原成本 |
| `org_rate` | `org_rate` | `orgRate` | 组织币汇率 |
| `org_recoverable_cost_amount` | `org_recoverable_cost_amount` | `orgRecoverableCostAmount` | 组织币可回收成本 |
| `org_scrap_value_amount` | `org_scrap_value_amount` | `orgScrapValueAmount` | 组织币净残值 |
| `org_uncon_finance_cost` | `org_uncon_finance_cost` | `orgUnconFinanceCost` | 组织币未确认融资费用 |
| `org_unit_depr_amount` | `org_unit_depr_amount` | `orgUnitDeprAmount` | 组织币单位折旧 |
| `org_year_depr_amount` | `org_year_depr_amount` | `orgYearDeprAmount` | 组织币本年折旧 |
| `org_year_fair_value_change` | `org_year_fair_value_change` | `orgYearFairValueChange` | 组织币本年公允价值变动 |
| `org_year_fair_value_gainloss` | `org_year_fair_value_gainloss` | `orgYearFairValueGainloss` | 组织币本年公允价值变动损益 |
| `acc_currtype_ori_amount` | `acc_currtype_ori_amount` | `oriValue` | 本币原值 |
| `ori_cost_amount` | `ori_cost_amount` | `oricostAmount` | 本币原始成本 |
| `recoverable_cost_amount` | `recoverable_cost_amount` | `recoverableCostAmount` | 本币可回收成本 |
| `residual_workload` | `residual_workload` | `residualWorkload` | 剩余工作量 |
| `scrap_value_amount` | `scrap_value_amount` | `scrapValue` | 本币净残值 |
| `scrap_value_rate` | `scrap_value_rate` | `scrapValueRate` | 净残值率(%) |
| `tax_rate` | `tax_rate` | `taxRate` | 税率 |
| `total_workload` | `total_workload` | `totalWorkload` | 工作总量 |
| `unit_depr_amount` | `unit_depr_amount` | `unitDeprAmount` | 本币单位折旧 |
| `year_depr_amount` | `year_depr_amount` | `yearDeprAmount` | 本币本年折旧 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义项 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `subjects` | 新增单科目分配 |
