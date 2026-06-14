---
tags: [BIP, 元数据, 数据字典, EFA.EFA.FaDeprPreAccount]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 折旧中间表 (`EFA.EFA.FaDeprPreAccount`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_depr_pre_account` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`f441f26d-7e25-4a64-aa16-93f71fd46050`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 折旧中间表 |
| 物理表 | `fa_depr_pre_account` |
| domain/服务域 | `yonbip-fi-efa` |
| schema | `fiefa` |
| 所属应用 | `EFA` |
| 直连字段 | 384 个 |
| 子表 | 0 个 |
| 关联引用 | 9 个 |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `asset_sub_cat_id` | `yonbip-fi-efa.fa_subcategoryref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `place_id` | `ucf-amc-ambd.ampub_location_ref` |
| `unit_id` | `productcenter.pc_unitref` |
| `vendor_id` | `yssupplier.aa_vendor` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `tax_item_id` | `yonbip-fi-taxpubdoc.RefTable_55c5b82f11` |

## 继承接口 (3个, 6字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 384 个直连字段

### 文本字段 (76个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年编码 |
| `accbook_cat_id` | `accbook_cat_id` | `accbookCatId` | 账簿级固定资产类别 |
| `accbook_currtype_id` | `accbook_currtype_id` | `accbookCurrtypeId` | 账簿币种 |
| `accbook_id` | `accbook_id` | `accbookId` | 账簿ID |
| `accbook_start_date` | `accbook_start_date` | `accbookStartDate` | 启用日期 |
| `accentity_id` | `accentity_id` | `accentityId` | 会计主体 |
| `accsubject_id` | `accsubject_id` | `accsubjectId` | 折旧费用科目createAsset |
| `amortized_adjust_date` | `amortized_adjust_date` | `amortizedAdjustDate` | 摊销起始日期 |
| `amortized_adjust_period` | `amortized_adjust_period` | `amortizedAdjustPeriod` | 摊销期间 |
| `asgmt_code` | `asgmt_code` | `asgmtCode` | 折旧分配CODE |
| `asset_add_way_id` | `asset_add_way_id` | `assetAddWayId` | 固定资产增加方式 |
| `asset_calc_id` | `asset_calc_id` | `assetCalcId` | 固定资产核算ID |
| `asset_code` | `asset_code` | `assetCode` | 固定资产卡片编码 |
| `asset_custodian_id` | `asset_custodian_id` | `assetCustodianId` | 固定资产保管人 |
| `asset_id` | `asset_id` | `assetId` | 固定资产 |
| `asset_location` | `asset_location` | `assetLocation` | 固定资产存放地点 |
| `asset_model` | `asset_model` | `assetModel` | 固定资产型号 |
| `asset_name` | `asset_name` | `assetName` | 固定资产名称 |
| `asset_specification` | `asset_specification` | `assetSpecification` | 固定资产规格 |
| `asset_user_id` | `asset_user_id` | `assetUserId` | 固定资产使用人 |
| `begin_date` | `begin_date` | `beginDate` | 开始使用日期 |
| `begin_depr_date` | `begin_depr_date` | `beginDeprDate` | 开始折旧日期 |
| `bill_id` | `bill_id` | `billId` | 当前单据ID |
| `bill_no` | `bill_no` | `billNo` | 当前单据号 |
| `create_asset_date` | `create_asset_date` | `createAssetDate` | 建卡日期 |
| `depr_convention_id` | `depr_convention_id` | `deprConventionId` | 折旧惯例 |
| `depr_event_status` | `depr_event_status` | `deprEventStatus` | 折旧事件状态 |
| `depr_event_type` | `depr_event_type` | `deprEventType` | 折旧事件类型 |
| `depr_method_code` | `depr_method_code` | `deprMethodCode` | 折旧方法code |
| `depr_method_id` | `depr_method_id` | `deprMethodId` | 折旧方法 |
| `depr_start_period` | `depr_start_period` | `deprStartPeriod` | 开始折旧的会计期间 |
| `depr_status` | `depr_status` | `deprStatus` | 折旧状态:0正常折旧1折旧完成 |
| `depr_type` | `depr_type` | `deprType` | 折旧类型s |
| `description` | `description` | `description` | 描述说明 |
| `disposal_convention_id` | `disposal_convention_id` | `disposalConventionId` | 处置惯例 |
| `disposal_status` | `disposal_status` | `disposalStatus` | 处置状态 |
| `end_accbook_cat_id` | `end_accbook_cat_id` | `endAccbookCatId` | 期末账簿级资产类别 |
| `end_amortized_date` | `end_amortized_date` | `endAmortizedDate` | 期末摊销起始日期 |
| `end_amortized_period` | `end_amortized_period` | `endAmortizedPeriod` | 期末摊销期间 |
| `end_asgmt_code` | `end_asgmt_code` | `endAsgmtCode` | 期末折旧分配CODE |
| `end_depr_date` | `end_depr_date` | `endDeprDate` | 结束折旧日期 |
| `end_depr_method_id` | `end_depr_method_id` | `endDeprMethodId` | 期末折旧方法 |
| `end_mgt_dept_id` | `end_mgt_dept_id` | `endMgtDeptId` | 期末管理部门 |
| `end_mgt_profit_center_id` | `end_mgt_profit_center_id` | `endMgtProfitCenterId` | 期末管理利润中心 |
| `end_tenant_cat_id` | `end_tenant_cat_id` | `endTenantCatId` | 租户级期末资产类别 |
| `end_usage_state_id` | `end_usage_state_id` | `endUsageStateId` | 期末资产状态ID |
| `exchange_rate_type` | `exchange_rate_type` | `exchangeRateType` | 汇率类型 |
| `fi_event_code` | `fi_event_code` | `fiEventCode` | 资产事务编码 |
| `first_period_depr` | `first_period_depr` | `firstPeriodDepr` | 首期折旧:1:首期计提 |
| `gbl_currtype_id` | `gbl_currtype_id` | `gblCurrtypeId` | 全局币币种ID |
| `gbl_rate_type_id` | `gbl_rate_type_id` | `gblRateTypeId` | 全局币汇率类型 |
| `grp_currtype_id` | `grp_currtype_id` | `grpCurrtypeId` | 集团币币种ID |
| `grp_rate_type_id` | `grp_rate_type_id` | `grpRateTypeId` | 集团币汇率类型 |
| `init_accbook_cat_id` | `init_accbook_cat_id` | `initAccbookCatId` | 期初账簿级资产类别 |
| `init_asgmt_code` | `init_asgmt_code` | `initAsgmtCode` | 期初折旧分配CODE |
| `init_depr_method_id` | `init_depr_method_id` | `initDeprMethodId` | 期初折旧方法 |
| `init_mgt_dept_id` | `init_mgt_dept_id` | `initMgtDeptId` | 期初管理部门 |
| `init_mgt_profit_center_id` | `init_mgt_profit_center_id` | `initMgtProfitCenterId` | 期初管理利润中心 |
| `init_tenant_cat_id` | `init_tenant_cat_id` | `initTenantCatId` | 租户级期初资产类别 |
| `init_usage_state_id` | `init_usage_state_id` | `initUsageStateId` | 期初资产状态ID |
| `ledger_id` | `ledger_id` | `ledgerId` | 资产明细账Id |
| `mgt_dept_id` | `mgt_dept_id` | `mgtDeptId` | 管理部门 |
| `mgt_profit_center_id` | `mgt_profit_center_id` | `mgtProfitCenterId` | 管理利润中心 |
| `opp_accentity_id` | `opp_accentity_id` | `oppAccentityId` | 对方会计主体 |
| `org_currtype_id` | `org_currtype_id` | `orgCurrtypeId` | 组织币币种ID |
| `org_rate_type_id` | `org_rate_type_id` | `orgRateTypeId` | 组织币汇率类型 |
| `period_begin_date` | `period_begin_date` | `periodBeginDate` | 会计期间开始日期 |
| `period_code` | `period_code` | `periodCode` | 会计期间 |
| `period_event_status` | `period_event_status` | `periodEventStatus` | 期间事件状态 |
| `reduce_date` | `reduce_date` | `reduceDate` | 处置生效日期 |
| `summary` | `summary` | `summary` | 摘要 |
| `tag_no` | `tag_no` | `tagNo` | 标签号 |
| `tenant_cat_id` | `tenant_cat_id` | `tenantCatId` | 租户级固定资产类别 |
| `usage_state_id` | `usage_state_id` | `usageStateId` | 资产状态ID |
| `workload_unit` | `workload_unit` | `workloadUnit` | 工作量单位 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `asset_sub_cat_id` | `asset_sub_cat_id` | `assetSubcategoryId` | 资产子类 |
| `place_id` | `place_id` | `placeId` | 存放地点 |
| `tax_item_id` | `tax_item_id` | `taxItemId` | 税目 |
| `unit_id` | `unit_id` | `unitId` | 计量单位 |
| `vendor_id` | `vendor_id` | `vendorId` | 供应商 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_amortized_adjust` | `bln_amortized_adjust` | `blnAmortizedAdjust` | 摊销调整标识 |
| `bln_depr` | `bln_depr` | `blnDepr` | 是否折旧 |
| `bln_effect` | `bln_effect` | `blnEffect` | 生效标识(当期生效传TRUE |
| `bln_end_amortized_adjust` | `bln_end_amortized_adjust` | `blnEndAmortizedAdjust` | 期末摊销调整标识 |
| `bln_end_usage_state` | `bln_end_usage_state` | `blnEndUsageState` | 期末资产状态 |
| `bln_event_depr_flag` | `bln_event_depr_flag` | `blnEventDeprFlag` | 事件影响折旧计算标识 |
| `bln_gbl_enable` | `bln_gbl_enable` | `blnGblEnable` | 是否启用全局币 |
| `bln_grp_enable` | `bln_grp_enable` | `blnGrpEnable` | 是否启用集团币 |
| `bln_inherited` | `bln_inherited` | `blnInherited` | 是否继承 |
| `bln_init` | `bln_init` | `blnInit` | 是否期初 |
| `bln_init_usage_state` | `bln_init_usage_state` | `blnInitUsageState` | 期初资产状态 |
| `bln_last_period_depr` | `bln_last_period_depr` | `blnLastPeriodDepr` | 使用寿命最后一个月提足 |
| `bln_lease` | `bln_lease` | `blnLease` | 使用权资产信息 |
| `bln_org_enable` | `bln_org_enable` | `blnOrgEnable` | 是否启用组织币 |
| `bln_update_depr_amount` | `bln_update_depr_amount` | `blnUpdateDeprAmount` | 修改折旧金额 |
| `bln_usage_state` | `bln_usage_state` | `blnUsageState` | 资产状态 |
| `end_bln_depr_inherited` | `end_bln_depr_inherited` | `endBlnDeprInherited` | 期末是否折旧继承 |
| `init_bln_depr_inherited` | `init_bln_depr_inherited` | `initBlnDeprInherited` | 期初是否折旧继承 |
| `residual_amortization` | `residual_amortization` | `residualAmortization` | 是否剩余摊销 |

### 枚举字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exchange_rate_ops` | `exchange_rate_ops` | `exchangeRateOps` | 汇率折算方式 |
| `org_rate_ops` | `org_rate_ops` | `orgRateOps` | 组织币汇率折算方式 |
| `grp_rate_ops` | `grp_rate_ops` | `grpRateOps` | 集团币汇率折算方式 |
| `gbl_rate_ops` | `gbl_rate_ops` | `gblRateOps` | 全局币汇率折算方式 |

### 整数 (21个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accrued_period` | `accrued_period` | `accruedPeriod` | 已计提期数 |
| `aprn_accrued_period` | `aprn_accrued_period` | `aprnAccruedPeriod` | 分摊日历已计提期数 |
| `aprn_calendar_period_count` | `aprn_calendar_period_count` | `aprnCalendarPeriodCount` | 分摊日历期数 |
| `asset_num` | `asset_num` | `assetNum` | 数量 |
| `be_year_remain_period` | `be_year_remain_period` | `beYearRemainPeriod` | 年初折旧剩余期数 |
| `conver_moment_period` | `conver_moment_period` | `converMomentPeriod` | 转换时点计提期数 |
| `depr_calendar_period_count` | `depr_calendar_period_count` | `deprCalendarPeriodCount` | 折旧日历期数 |
| `double_counter` | `double_counter` | `doubleCounter` | 双倍余额计数器 |
| `end_life_count` | `end_life_count` | `endLifeCount` | 期末寿命 |
| `end_life_month` | `end_life_month` | `endLifeMonth` | 期末使用月限 |
| `end_life_year` | `end_life_year` | `endLifeYear` | 期末使用年限 |
| `init_life_count` | `init_life_count` | `initLifeCount` | 期初寿命 |
| `init_life_month` | `init_life_month` | `initLifeMonth` | 期初使用月限 |
| `init_life_year` | `init_life_year` | `initLifeYear` | 期初使用年限 |
| `life_count` | `life_count` | `lifeCount` | 使用寿命 |
| `life_month` | `life_month` | `lifeMonth` | 使用月限 |
| `life_year` | `life_year` | `lifeYear` | 使用年限 |
| `sort_num` | `sort_num` | `sortNum` | 事件排序 |
| `sum_year_counter` | `sum_year_counter` | `sumYearCounter` | 年数总和计数器 |
| `sum_year_remain_month` | `sum_year_remain_month` | `sumYearRemainMonth` | 年数总和法剩余月 |
| `sum_year_remain_year` | `sum_year_remain_year` | `sumYearRemainYear` | 年数总和法剩余年 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_year_id` | `acc_year_id` | `accYearId` | 会计年ID |
| `accbook_property_id` | `accbook_property_id` | `accbookPropertyId` | 账簿属性 |
| `accpurpose_id` | `accpurpose_id` | `accpurposeId` | 核算目的 |
| `aprn_calendar_id` | `aprn_calendar_id` | `aprnCalendarId` | 分摊日历 |
| `booktype_id` | `booktype_id` | `booktypeId` | 账簿分类 |
| `depr_calendar_id` | `depr_calendar_id` | `deprCalendarId` | 折旧日历 |
| `end_mgt_cost_center_id` | `end_mgt_cost_center_id` | `endMgtCostCenterId` | 期末管理成本中心 |
| `init_mgt_cost_center_id` | `init_mgt_cost_center_id` | `initMgtCostCenterId` | 期初管理成本中心 |
| `mgt_cost_center_id` | `mgt_cost_center_id` | `mgtCostCenterId` | 管理成本中心 |
| `period_id` | `period_id` | `periodId` | 会计期间ID |

### 数值字段 (241个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_accum_depr_amount` | `acc_accum_depr_amount` | `accAccumDeprAmount` | 本币累计折旧 |
| `acc_accum_imp_amount` | `acc_accum_imp_amount` | `accAccumImpAmount` | 本币累计减值 |
| `acc_accum_out_plan_amount` | `acc_accum_out_plan_amount` | `accAccumOutPlanAmount` | 本币累计计划外折旧金额 |
| `acc_addition_depr_amount` | `acc_addition_depr_amount` | `accAdditionDeprAmount` | 本币附加折旧 |
| `acc_adjust_amount` | `acc_adjust_amount` | `accAdjustAmount` | 本币调整折旧 |
| `acc_adjust_amount_period` | `acc_adjust_amount_period` | `accAdjustAmountPeriod` | 本币调整折旧金额BY期间 |
| `acc_be_year_accum_imp_amount` | `acc_be_year_accum_imp_amount` | `accBeYearAccumImpAmount` | 年初本币累计减值 |
| `acc_be_year_period_depr_amount` | `acc_be_year_period_depr_amount` | `accBeYearPeriodDeprAmount` | 年初本币累计折旧 |
| `acc_be_year_scrap_value_amount` | `acc_be_year_scrap_value_amount` | `accBeYearScrapValueAmount` | 年初本币净残值 |
| `acc_be_year_value_amount` | `acc_be_year_value_amount` | `accBeYearValueAmount` | 年初本币原值 |
| `acc_cost_amount` | `acc_cost_amount` | `accCostAmount` | 本币调整成本金额 |
| `acc_cost_deduct_amount` | `acc_cost_deduct_amount` | `accCostDeductAmount` | 本币调整成本抵减金额 |
| `acc_cur_period_depr_amount` | `acc_cur_period_depr_amount` | `accCurPeriodDeprAmount` | 本币本期折旧金额 |
| `acc_cur_period_depr_rate` | `acc_cur_period_depr_rate` | `accCurPeriodDeprRate` | 本币本期月折旧率 |
| `acc_cur_year_depr_amount` | `acc_cur_year_depr_amount` | `accCurYearDeprAmount` | 本币本年折旧 |
| `acc_depr_calender_amount` | `acc_depr_calender_amount` | `accDeprCalenderAmount` | 本币折旧日历系统折旧金额 |
| `acc_init_depr_amount` | `acc_init_depr_amount` | `accInitDeprAmount` | 本币初始累计折旧 |
| `acc_init_year_depr_amount` | `acc_init_year_depr_amount` | `accInitYearDeprAmount` | 币初始本年累计折旧金额 |
| `acc_last_period_depr_amount` | `acc_last_period_depr_amount` | `accLastPeriodDeprAmount` | 本币上期折旧额 |
| `acc_last_period_depr_rate` | `acc_last_period_depr_rate` | `accLastPeriodDeprRate` | 本币上期折旧率 |
| `acc_ltd_deduct_amount_period` | `acc_ltd_deduct_amount_period` | `accLtdDeductAmountPeriod` | 本币累计折旧抵减金额BY期间 |
| `acc_ltd_deduction_amount` | `acc_ltd_deduction_amount` | `accLtdDeductionAmount` | 本币累计折旧抵减额 |
| `acc_net_amount` | `acc_net_amount` | `accNetAmount` | 本币账面净额 |
| `acc_net_value_amount` | `acc_net_value_amount` | `accNetValueAmount` | 本币账面净值 |
| `acc_out_plan_amount` | `acc_out_plan_amount` | `accOutPlanAmount` | 本币计划外折旧额 |
| `acc_pre_accum_depr_amount` | `acc_pre_accum_depr_amount` | `accPreAccumDeprAmount` | 上期本币累计折旧 |
| `acc_pre_accum_imp_amount` | `acc_pre_accum_imp_amount` | `accPreAccumImpAmount` | 上期本币累计减值 |
| `acc_pre_period_depr_amount` | `acc_pre_period_depr_amount` | `accPrePeriodDeprAmount` | 上期本币期折旧 |
| `acc_pre_scrap_value_amount` | `acc_pre_scrap_value_amount` | `accPreScrapValueAmount` | 上期本币净残值 |
| `acc_pre_value_amount` | `acc_pre_value_amount` | `accPreValueAmount` | 上期本币原值 |
| `acc_pre_year_depr_amount` | `acc_pre_year_depr_amount` | `accPreYearDeprAmount` | 上期本币本年折旧 |
| `acc_prorate_calender_amount` | `acc_prorate_calender_amount` | `accProrateCalenderAmount` | 本币分摊日历系统折旧金额 |
| `acc_scrap_value_amount` | `acc_scrap_value_amount` | `accScrapValueAmount` | 本币残值 |
| `acc_scrap_value_rate` | `acc_scrap_value_rate` | `accScrapValueRate` | 残值率 |
| `acc_value_amount` | `acc_value_amount` | `accValueAmount` | 本币原值 |
| `acc_ytd_deduct_amount` | `acc_ytd_deduct_amount` | `accYtdDeductAmount` | 本币年累计折旧抵减金额 |
| `accum_depred_workload` | `accum_depred_workload` | `accumDepredWorkload` | 已计提工作量 |
| `accum_disposal_period_amount` | `accum_disposal_period_amount` | `accumDisposalPeriodAmount` | 处置影响折旧额 |
| `accum_workload` | `accum_workload` | `accumWorkload` | 累计工作量 |
| `added_tax_amount` | `added_tax_amount` | `addedTaxAmount` | 增值税 |
| `asset_tax_rate` | `asset_tax_rate` | `assetTaxRate` | 固定资产税率 |
| `base_amount` | `base_amount` | `baseAmount` | 基值 |
| `be_acc_cur_period_depr_amount` | `be_acc_cur_period_depr_amount` | `beAccCurPeriodDeprAmount` | 修改前本期本币折旧额 |
| `be_org_cur_period_depr_amount` | `be_org_cur_period_depr_amount` | `beOrgCurPeriodDeprAmount` | 修改前本期组织币折旧额 |
| `be_year_accum_workload` | `be_year_accum_workload` | `beYearAccumWorkload` | 年初累计工作量 |
| `be_year_total_workload` | `be_year_total_workload` | `beYearTotalWorkload` | 年初工作总量 |
| `compare_amount` | `compare_amount` | `compareAmount` | 比较值 |
| `conver_moment_amount` | `conver_moment_amount` | `converMomentAmount` | 转换时点金额 |
| `cur_year_imp_amount` | `cur_year_imp_amount` | `curYearImpAmount` | 本年减值 |
| `disposal_period_amount` | `disposal_period_amount` | `disposalPeriodAmount` | 处置折旧费用 |
| `disposal_period_rate` | `disposal_period_rate` | `disposalPeriodRate` | 处置折旧率 |
| `disposal_unit_depr_amount` | `disposal_unit_depr_amount` | `disposalUnitDeprAmount` | 处置单位折旧 |
| `end_acc_accum_depr_amount` | `end_acc_accum_depr_amount` | `endAccAccumDeprAmount` | 期末本币累计折旧 |
| `end_acc_accum_imp_amount` | `end_acc_accum_imp_amount` | `endAccAccumImpAmount` | 本币期末累计减值 |
| `end_acc_scrap_value_amount` | `end_acc_scrap_value_amount` | `endAccScrapValueAmount` | 期末本币残值 |
| `end_acc_scrap_value_rate` | `end_acc_scrap_value_rate` | `endAccScrapValueRate` | 期末本币残值率 |
| `end_acc_value_amount` | `end_acc_value_amount` | `endAccValueAmount` | 期末本币原值 |
| `end_gbl_accum_depr_amount` | `end_gbl_accum_depr_amount` | `endGblAccumDeprAmount` | 期末全局币累计折旧 |
| `end_gbl_accum_imp_amount` | `end_gbl_accum_imp_amount` | `endGblAccumImpAmount` | 期末全局币累计减值 |
| `end_gbl_scrap_value_amount` | `end_gbl_scrap_value_amount` | `endGblScrapValueAmount` | 期末全局币残值金额 |
| `end_gbl_value_amount` | `end_gbl_value_amount` | `endGblValueAmount` | 期末全局币原值金额 |
| `end_grp_accum_depr_amount` | `end_grp_accum_depr_amount` | `endGrpAccumDeprAmount` | 期末集团币累计折旧 |
| `end_grp_accum_imp_amount` | `end_grp_accum_imp_amount` | `endGrpAccumImpAmount` | 期末集团币累计减值 |
| `end_grp_scrap_value_amount` | `end_grp_scrap_value_amount` | `endGrpScrapValueAmount` | 期末集团币残值金额 |
| `end_grp_value_amount` | `end_grp_value_amount` | `endGrpValueAmount` | 期末集团币原值金额 |
| `end_org_accum_depr_amount` | `end_org_accum_depr_amount` | `endOrgAccumDeprAmount` | 期末组织币累计折旧 |
| `end_org_accum_imp_amount` | `end_org_accum_imp_amount` | `endOrgAccumImpAmount` | 期末组织币累计减值 |
| `end_org_scrap_value_amount` | `end_org_scrap_value_amount` | `endOrgScrapValueAmount` | 期末组织币残值金额 |
| `end_org_value_amount` | `end_org_value_amount` | `endOrgValueAmount` | 期末组织币原值金额 |
| `end_total_workload` | `end_total_workload` | `endTotalWorkload` | 期末总工作量 |
| `event_affect_workload` | `event_affect_workload` | `eventAffectWorkload` | 事件影响工作量 |
| `exchange_rate` | `exchange_rate` | `exchangeRate` | 汇率 |
| `gbl_accum_depr_amount` | `gbl_accum_depr_amount` | `gblAccumDeprAmount` | 全局币累计折旧 |
| `gbl_accum_disposal_period_amount` | `gbl_accum_disposal_period_amount` | `gblAccumDisposalPeriodAmount` | 全局币处置影响折旧额 |
| `gbl_accum_imp_amount` | `gbl_accum_imp_amount` | `gblAccumImpAmount` | 全局币累计减值 |
| `gbl_accum_out_plan_amount` | `gbl_accum_out_plan_amount` | `gblAccumOutPlanAmount` | 全局币累计计划外折旧金额 |
| `gbl_added_tax_amount` | `gbl_added_tax_amount` | `gblAddedTaxAmount` | 全局币增值税 |
| `gbl_addition_depr_amount` | `gbl_addition_depr_amount` | `gblAdditionDeprAmount` | 全局币附加折旧金额 |
| `gbl_adjust_amount` | `gbl_adjust_amount` | `gblAdjustAmount` | 全局币调整折旧金额 |
| `gbl_base_amount` | `gbl_base_amount` | `gblBaseAmount` | 全局币基值 |
| `gbl_be_year_accum_imp_amount` | `gbl_be_year_accum_imp_amount` | `gblBeYearAccumImpAmount` | 年初全局币累计减值 |
| `gbl_be_year_period_depr_amount` | `gbl_be_year_period_depr_amount` | `gblBeYearPeriodDeprAmount` | 年初全局币累计折旧 |
| `gbl_be_year_scrap_value_amount` | `gbl_be_year_scrap_value_amount` | `gblBeYearScrapValueAmount` | 年初全局币净残值 |
| `gbl_be_year_value_amount` | `gbl_be_year_value_amount` | `gblBeYearValueAmount` | 年初全局币原值 |
| `gbl_compare_amount` | `gbl_compare_amount` | `gblCompareAmount` | 全局币比较值 |
| `gbl_conver_moment_amount` | `gbl_conver_moment_amount` | `gblConverMomentAmount` | 全局币转换时点金额 |
| `gbl_cost_amount` | `gbl_cost_amount` | `gblCostAmount` | 全局币调整成本金额 |
| `gbl_cost_deduct_amount` | `gbl_cost_deduct_amount` | `gblCostDeductAmount` | 全局币调整成本抵减金额 |
| `gbl_cur_period_depr_amount` | `gbl_cur_period_depr_amount` | `gblCurPeriodDeprAmount` | 全局币本期折旧金额 |
| `gbl_cur_period_depr_rate` | `gbl_cur_period_depr_rate` | `gblCurPeriodDeprRate` | 全局币本期计提折旧率 |
| `gbl_cur_year_depr_amount` | `gbl_cur_year_depr_amount` | `gblCurYearDeprAmount` | 全局币本年折旧金额 |
| `gbl_cur_year_imp_amount` | `gbl_cur_year_imp_amount` | `gblCurYearImpAmount` | 全局币本年减值 |
| `gbl_depr_calender_amount` | `gbl_depr_calender_amount` | `gblDeprCalenderAmount` | 全局币折旧日历系统折旧金额 |
| `gbl_disposal_period_amount` | `gbl_disposal_period_amount` | `gblDisposalPeriodAmount` | 全局币处置折旧费用 |
| `gbl_disposal_period_rate` | `gbl_disposal_period_rate` | `gblDisposalPeriodRate` | 全局币处置折旧率 |
| `gbl_disposal_unit_depr_amount` | `gbl_disposal_unit_depr_amount` | `gblDisposalUnitDeprAmount` | 全局币处置单位折旧 |
| `gbl_init_depr_amount` | `gbl_init_depr_amount` | `gblInitDeprAmount` | 全局币初始累计折旧金额 |
| `gbl_init_year_depr_amount` | `gbl_init_year_depr_amount` | `gblInitYearDeprAmount` | 全局币初始本年累计折旧金额 |
| `gbl_last_period_depr_amount` | `gbl_last_period_depr_amount` | `gblLastPeriodDeprAmount` | 全局币上期折旧金额 |
| `gbl_last_period_depr_rate` | `gbl_last_period_depr_rate` | `gblLastPeriodDeprRate` | 全局币上期折旧率 |
| `gbl_ltd_deduction_amount` | `gbl_ltd_deduction_amount` | `gblLtdDeductionAmount` | 全局币累计折旧抵减金额 |
| `gbl_net_amount` | `gbl_net_amount` | `gblNetAmount` | 全局币账面净额 |
| `gbl_net_value_amount` | `gbl_net_value_amount` | `gblNetValueAmount` | 全局币账面净值 |
| `gbl_out_plan_amount` | `gbl_out_plan_amount` | `gblOutPlanAmount` | 全局币计划外折旧金额 |
| `gbl_period_adjust_amount` | `gbl_period_adjust_amount` | `gblPeriodAdjustAmount` | 全局币调整折旧金额BY期间 |
| `gbl_period_ltd_deduct_amount` | `gbl_period_ltd_deduct_amount` | `gblPeriodLtdDeductAmount` | 全局币累计折旧抵减金额BY期间 |
| `gbl_pre_accum_depr_amount` | `gbl_pre_accum_depr_amount` | `gblPreAccumDeprAmount` | 上期全局币累计折旧 |
| `gbl_pre_accum_imp_amount` | `gbl_pre_accum_imp_amount` | `gblPreAccumImpAmount` | 上期全局币累计减值 |
| `gbl_pre_period_depr_amount` | `gbl_pre_period_depr_amount` | `gblPrePeriodDeprAmount` | 上期全局币期折旧 |
| `gbl_pre_scrap_value_amount` | `gbl_pre_scrap_value_amount` | `gblPreScrapValueAmount` | 上期全局币净残值 |
| `gbl_pre_value_amount` | `gbl_pre_value_amount` | `gblPreValueAmount` | 上期全局币原值 |
| `gbl_pre_year_depr_amount` | `gbl_pre_year_depr_amount` | `gblPreYearDeprAmount` | 上期全局币本年折旧 |
| `gbl_pre_year_imp_amount` | `gbl_pre_year_imp_amount` | `gblPreYearImpAmount` | 上期全局币本年减值 |
| `gbl_prorate_calender_amount` | `gbl_prorate_calender_amount` | `gblProrateCalenderAmount` | 全局币分摊日历系统折旧金额 |
| `gbl_rate` | `gbl_rate` | `gblRate` | 全局币汇率 |
| `gbl_scrap_value_amount` | `gbl_scrap_value_amount` | `gblScrapValueAmount` | 全局币残值金额 |
| `gbl_unit_depr_amount` | `gbl_unit_depr_amount` | `gblUnitDeprAmount` | 全局币单位工作量折旧 |
| `gbl_value_amount` | `gbl_value_amount` | `gblValueAmount` | 全局币原值金额 |
| `gbl_ytd_deduct_amount` | `gbl_ytd_deduct_amount` | `gblYtdDeductAmount` | 全局币年累计折旧抵减金额 |
| `grp_accum_depr_amount` | `grp_accum_depr_amount` | `grpAccumDeprAmount` | 集团币累计折旧 |
| `grp_accum_disposal_period_amount` | `grp_accum_disposal_period_amount` | `grpAccumDisposalPeriodAmount` | 集团币处置影响折旧额 |
| `grp_accum_imp_amount` | `grp_accum_imp_amount` | `grpAccumImpAmount` | 集团币累计减值 |
| `grp_accum_out_plan_amount` | `grp_accum_out_plan_amount` | `grpAccumOutPlanAmount` | 集团币累计计划外折旧金额 |
| `grp_added_tax_amount` | `grp_added_tax_amount` | `grpAddedTaxAmount` | 集团币增值税 |
| `grp_addition_depr_amount` | `grp_addition_depr_amount` | `grpAdditionDeprAmount` | 集团币附加折旧金额 |
| `grp_adjust_amount` | `grp_adjust_amount` | `grpAdjustAmount` | 集团币调整折旧金额 |
| `grp_base_amount` | `grp_base_amount` | `grpBaseAmount` | 集团币基值 |
| `grp_be_year_accum_imp_amount` | `grp_be_year_accum_imp_amount` | `grpBeYearAccumImpAmount` | 年初集团币累计减值 |
| `grp_be_year_period_depr_amount` | `grp_be_year_period_depr_amount` | `grpBeYearPeriodDeprAmount` | 年初集团币累计折旧 |
| `grp_be_year_scrap_value_amount` | `grp_be_year_scrap_value_amount` | `grpBeYearScrapValueAmount` | 年初集团币净残值 |
| `grp_be_year_value_amount` | `grp_be_year_value_amount` | `grpBeYearValueAmount` | 年初集团币原值 |
| `grp_compare_amount` | `grp_compare_amount` | `grpCompareAmount` | 集团币比较值 |
| `grp_conver_moment_amount` | `grp_conver_moment_amount` | `grpConverMomentAmount` | 集团币转换时点金额 |
| `grp_cost_amount` | `grp_cost_amount` | `grpCostAmount` | 集团币调整成本金额 |
| `grp_cost_deduct_amount` | `grp_cost_deduct_amount` | `grpCostDeductAmount` | 集团币调整成本抵减金额 |
| `grp_cur_period_depr_amount` | `grp_cur_period_depr_amount` | `grpCurPeriodDeprAmount` | 集团币本期折旧金额 |
| `grp_cur_period_depr_rate` | `grp_cur_period_depr_rate` | `grpCurPeriodDeprRate` | 集团币本期计提折旧率 |
| `grp_cur_year_depr_amount` | `grp_cur_year_depr_amount` | `grpCurYearDeprAmount` | 集团币本年折旧金额 |
| `grp_cur_year_imp_amount` | `grp_cur_year_imp_amount` | `grpCurYearImpAmount` | 集团币本年减值 |
| `grp_depr_calender_amount` | `grp_depr_calender_amount` | `grpDeprCalenderAmount` | 集团币折旧日历系统折旧金额 |
| `grp_disposal_period_amount` | `grp_disposal_period_amount` | `grpDisposalPeriodAmount` | 集团币处置折旧费用 |
| `grp_disposal_period_rate` | `grp_disposal_period_rate` | `grpDisposalPeriodRate` | 集团币处置折旧率 |
| `grp_disposal_unit_depr_amount` | `grp_disposal_unit_depr_amount` | `grpDisposalUnitDeprAmount` | 集团币处置单位折旧 |
| `grp_init_depr_amount` | `grp_init_depr_amount` | `grpInitDeprAmount` | 集团币初始累计折旧金额 |
| `grp_init_year_depr_amount` | `grp_init_year_depr_amount` | `grpInitYearDeprAmount` | 集团币初始本年累计折旧金额 |
| `grp_last_period_depr_amount` | `grp_last_period_depr_amount` | `grpLastPeriodDeprAmount` | 集团币上期折旧金额 |
| `grp_last_period_depr_rate` | `grp_last_period_depr_rate` | `grpLastPeriodDeprRate` | 集团币上期折旧率 |
| `grp_ltd_deduction_amount` | `grp_ltd_deduction_amount` | `grpLtdDeductionAmount` | 集团币累计折旧抵减金额 |
| `grp_net_amount` | `grp_net_amount` | `grpNetAmount` | 集团币账面净额 |
| `grp_net_value_amount` | `grp_net_value_amount` | `grpNetValueAmount` | 集团币账面净值 |
| `grp_out_plan_amount` | `grp_out_plan_amount` | `grpOutPlanAmount` | 集团币计划外折旧金额 |
| `grp_period_adjust_amount` | `grp_period_adjust_amount` | `grpPeriodAdjustAmount` | 集团币调整折旧金额BY期间 |
| `grp_period_ltd_deduct_amount` | `grp_period_ltd_deduct_amount` | `grpPeriodLtdDeductAmount` | 集团币累计折旧抵减金额BY期间 |
| `grp_pre_accum_depr_amount` | `grp_pre_accum_depr_amount` | `grpPreAccumDeprAmount` | 上期集团币累计折旧 |
| `grp_pre_accum_imp_amount` | `grp_pre_accum_imp_amount` | `grpPreAccumImpAmount` | 上期集团币累计减值 |
| `grp_pre_period_depr_amount` | `grp_pre_period_depr_amount` | `grpPrePeriodDeprAmount` | 上期集团币期折旧 |
| `grp_pre_scrap_value_amount` | `grp_pre_scrap_value_amount` | `grpPreScrapValueAmount` | 上期集团币净残值 |
| `grp_pre_value_amount` | `grp_pre_value_amount` | `grpPreValueAmount` | 上期集团币原值 |
| `grp_pre_year_depr_amount` | `grp_pre_year_depr_amount` | `grpPreYearDeprAmount` | 上期集团币本年折旧 |
| `grp_pre_year_imp_amount` | `grp_pre_year_imp_amount` | `grpPreYearImpAmount` | 上期集团币本年减值 |
| `grp_prorate_calender_amount` | `grp_prorate_calender_amount` | `grpProrateCalenderAmount` | 集团币分摊日历系统折旧金额 |
| `grp_rate` | `grp_rate` | `grpRate` | 集团币汇率 |
| `grp_scrap_value_amount` | `grp_scrap_value_amount` | `grpScrapValueAmount` | 集团币残值金额 |
| `grp_unit_depr_amount` | `grp_unit_depr_amount` | `grpUnitDeprAmount` | 集团币单位工作量折旧 |
| `grp_value_amount` | `grp_value_amount` | `grpValueAmount` | 集团币原值金额 |
| `grp_ytd_deduct_amount` | `grp_ytd_deduct_amount` | `grpYtdDeductAmount` | 集团币年累计折旧抵减金额 |
| `init_acc_accum_depr_amount` | `init_acc_accum_depr_amount` | `initAccAccumDeprAmount` | 期初本币累计折旧 |
| `init_acc_accum_imp_amount` | `init_acc_accum_imp_amount` | `initAccAccumImpAmount` | 期初本币累计减值 |
| `init_acc_scrap_value_amount` | `init_acc_scrap_value_amount` | `initAccScrapValueAmount` | 期初本币残值 |
| `init_acc_scrap_value_rate` | `init_acc_scrap_value_rate` | `initAccScrapValueRate` | 期初本币残值率 |
| `init_acc_value_amount` | `init_acc_value_amount` | `initAccValueAmount` | 期初本币原值 |
| `init_gbl_accum_depr_amount` | `init_gbl_accum_depr_amount` | `initGblAccumDeprAmount` | 期初全局币累计折旧 |
| `init_gbl_accum_imp_amount` | `init_gbl_accum_imp_amount` | `initGblAccumImpAmount` | 期初全局币累计减值 |
| `init_gbl_scrap_value_amount` | `init_gbl_scrap_value_amount` | `initGblScrapValueAmount` | 期初全局币残值金额 |
| `init_gbl_value_amount` | `init_gbl_value_amount` | `initGblValueAmount` | 期初全局币原值金额 |
| `init_grp_accum_depr_amount` | `init_grp_accum_depr_amount` | `initGrpAccumDeprAmount` | 期初集团币累计折旧 |
| `init_grp_accum_imp_amount` | `init_grp_accum_imp_amount` | `initGrpAccumImpAmount` | 期初集团币累计减值 |
| `init_grp_scrap_value_amount` | `init_grp_scrap_value_amount` | `initGrpScrapValueAmount` | 期初集团币残值金额 |
| `init_grp_value_amount` | `init_grp_value_amount` | `initGrpValueAmount` | 期初集团币原值金额 |
| `init_org_accum_depr_amount` | `init_org_accum_depr_amount` | `initOrgAccumDeprAmount` | 期初组织币累计折旧 |
| `init_org_accum_imp_amount` | `init_org_accum_imp_amount` | `initOrgAccumImpAmount` | 期初组织币累计减值 |
| `init_org_scrap_value_amount` | `init_org_scrap_value_amount` | `initOrgScrapValueAmount` | 期初组织币残值金额 |
| `init_org_value_amount` | `init_org_value_amount` | `initOrgValueAmount` | 期初组织币原值金额 |
| `init_total_workload` | `init_total_workload` | `initTotalWorkload` | 期初总工作量 |
| `month_workload` | `month_workload` | `monthWorkload` | 本期工作量 |
| `org_accum_depr_amount` | `org_accum_depr_amount` | `orgAccumDeprAmount` | 组织币累计折旧 |
| `org_accum_disposal_period_amount` | `org_accum_disposal_period_amount` | `orgAccumDisposalPeriodAmount` | 组织币处置影响折旧额 |
| `org_accum_imp_amount` | `org_accum_imp_amount` | `orgAccumImpAmount` | 组织币累计减值 |
| `org_accum_out_plan_amount` | `org_accum_out_plan_amount` | `orgAccumOutPlanAmount` | 组织币累计计划外折旧金额 |
| `org_added_tax_amount` | `org_added_tax_amount` | `orgAddedTaxAmount` | 组织币增值税 |
| `org_addition_depr_amount` | `org_addition_depr_amount` | `orgAdditionDeprAmount` | 组织币附加折旧金额 |
| `org_adjust_amount` | `org_adjust_amount` | `orgAdjustAmount` | 组织币调整折旧金额 |
| `org_base_amount` | `org_base_amount` | `orgBaseAmount` | 组织币基值 |
| `org_be_year_accum_imp_amount` | `org_be_year_accum_imp_amount` | `orgBeYearAccumImpAmount` | 年初组织币累计减值 |
| `org_be_year_period_depr_amount` | `org_be_year_period_depr_amount` | `orgBeYearPeriodDeprAmount` | 年初组织币累计折旧 |
| `org_be_year_scrap_value_amount` | `org_be_year_scrap_value_amount` | `orgBeYearScrapValueAmount` | 年初组织币净残值 |
| `org_be_year_value_amount` | `org_be_year_value_amount` | `orgBeYearValueAmount` | 年初组织币原值 |
| `org_compare_amount` | `org_compare_amount` | `orgCompareAmount` | 组织币比较值 |
| `org_conver_moment_amount` | `org_conver_moment_amount` | `orgConverMomentAmount` | 组织币转换时点金额 |
| `org_cost_amount` | `org_cost_amount` | `orgCostAmount` | 组织币调整成本金额 |
| `org_cost_deduct_amount` | `org_cost_deduct_amount` | `orgCostDeductAmount` | 组织币调整成本抵减金额 |
| `org_cur_period_depr_amount` | `org_cur_period_depr_amount` | `orgCurPeriodDeprAmount` | 组织币本期折旧金额 |
| `org_cur_period_depr_rate` | `org_cur_period_depr_rate` | `orgCurPeriodDeprRate` | 组织币本期计提折旧率 |
| `org_cur_year_depr_amount` | `org_cur_year_depr_amount` | `orgCurYearDeprAmount` | 组织币本年折旧金额 |
| `org_cur_year_imp_amount` | `org_cur_year_imp_amount` | `orgCurYearImpAmount` | 组织币本年减值 |
| `org_depr_calender_amount` | `org_depr_calender_amount` | `orgDeprCalenderAmount` | 组织币折旧日历系统折旧金额 |
| `org_disposal_period_amount` | `org_disposal_period_amount` | `orgDisposalPeriodAmount` | 组织币处置折旧费用 |
| `org_disposal_period_rate` | `org_disposal_period_rate` | `orgDisposalPeriodRate` | 组织币处置折旧率 |
| `org_disposal_unit_depr_amount` | `org_disposal_unit_depr_amount` | `orgDisposalUnitDeprAmount` | 组织币处置单位折旧 |
| `org_init_depr_amount` | `org_init_depr_amount` | `orgInitDeprAmount` | 组织币初始累计折旧金额 |
| `org_init_year_depr_amount` | `org_init_year_depr_amount` | `orgInitYearDeprAmount` | 组织币初始本年累计折旧金额 |
| `org_last_period_depr_amount` | `org_last_period_depr_amount` | `orgLastPeriodDeprAmount` | 组织币上期折旧金额 |
| `org_last_period_depr_rate` | `org_last_period_depr_rate` | `orgLastPeriodDeprRate` | 组织币上期折旧率 |
| `org_ltd_deduction_amount` | `org_ltd_deduction_amount` | `orgLtdDeductionAmount` | 组织币累计折旧抵减金额 |
| `org_net_amount` | `org_net_amount` | `orgNetAmount` | 组织币账面净额 |
| `org_net_value_amount` | `org_net_value_amount` | `orgNetValueAmount` | 组织币账面净值 |
| `org_out_plan_amount` | `org_out_plan_amount` | `orgOutPlanAmount` | 组织币计划外折旧金额 |
| `org_period_adjust_amount` | `org_period_adjust_amount` | `orgPeriodAdjustAmount` | 组织币调整折旧金额BY期间 |
| `org_period_ltd_deduct_amount` | `org_period_ltd_deduct_amount` | `orgPeriodLtdDeductAmount` | 组织币累计折旧抵减金额BY期间 |
| `org_pre_accum_depr_amount` | `org_pre_accum_depr_amount` | `orgPreAccumDeprAmount` | 上期组织币累计折旧 |
| `org_pre_accum_imp_amount` | `org_pre_accum_imp_amount` | `orgPreAccumImpAmount` | 上期组织币累计减值 |
| `org_pre_period_depr_amount` | `org_pre_period_depr_amount` | `orgPrePeriodDeprAmount` | 上期组织币期折旧 |
| `org_pre_scrap_value_amount` | `org_pre_scrap_value_amount` | `orgPreScrapValueAmount` | 上期组织币净残值 |
| `org_pre_value_amount` | `org_pre_value_amount` | `orgPreValueAmount` | 上期组织币原值 |
| `org_pre_year_depr_amount` | `org_pre_year_depr_amount` | `orgPreYearDeprAmount` | 上期组织币本年折旧 |
| `org_pre_year_imp_amount` | `org_pre_year_imp_amount` | `orgPreYearImpAmount` | 上期组织币本年减值 |
| `org_prorate_calender_amount` | `org_prorate_calender_amount` | `orgProrateCalenderAmount` | 组织币分摊日历系统折旧金额 |
| `org_rate` | `org_rate` | `orgRate` | 组织币汇率 |
| `org_scrap_value_amount` | `org_scrap_value_amount` | `orgScrapValueAmount` | 组织币残值金额 |
| `org_unit_depr_amount` | `org_unit_depr_amount` | `orgUnitDeprAmount` | 组织币单位工作量折旧 |
| `org_value_amount` | `org_value_amount` | `orgValueAmount` | 组织币原值金额 |
| `org_ytd_deduct_amount` | `org_ytd_deduct_amount` | `orgYtdDeductAmount` | 组织币年累计折旧抵减金额 |
| `ori_currtype_ori_amount` | `ori_currtype_ori_amount` | `oriCurrtypeOriAmount` | 原币原值金额 |
| `pre_accum_workload` | `pre_accum_workload` | `preAccumWorkload` | 上期累计工作量 |
| `pre_remain_period` | `pre_remain_period` | `preRemainPeriod` | 上期折旧剩余期数 |
| `pre_total_workload` | `pre_total_workload` | `preTotalWorkload` | 上期工作总量 |
| `pre_workload` | `pre_workload` | `preWorkload` | 上期工作量 |
| `pre_year_imp_amount` | `pre_year_imp_amount` | `preYearImpAmount` | 上期本币本年减值 |
| `silent_workload` | `silent_workload` | `silentWorkload` | 沉默工作量 |
| `total_workload` | `total_workload` | `totalWorkload` | 总工作量 |
| `unit_depr_amount` | `unit_depr_amount` | `unitDeprAmount` | 单位工作量折旧 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义项 |
