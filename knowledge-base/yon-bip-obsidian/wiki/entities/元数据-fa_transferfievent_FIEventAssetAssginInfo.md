---
tags: [BIP, 元数据, 数据字典, fa.transferfievent.FIEventAssetAssginInfo]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 卡片分配信息 (`fa.transferfievent.FIEventAssetAssginInfo`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_ledger_b_asgmt` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`9a9f8733-e495-4106-af7d-06e5ff48af94`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 卡片分配信息 |
| 物理表 | `fa_ledger_b_asgmt` |
| 数据库 schema | `yonbip-fi-efa` |
| 所属应用 | `EFA` |
| 直连字段 | 262 个 |
| 子表 | 0 个 |
| 关联引用 | 40 个 |

## 关联引用 (40个)

| 字段名 | 引用类型 |
|--------|---------|
| `fair_value_subject_id` | `fiepub.fiepub_accsubjectref` |
| `profit_center_id` | `finbd.bd_allaccbodyref_inner` |
| `imp_subject_id` | `fiepub.epub_accsubject_treetableref` |
| `uncon_finance_cost_subject_id` | `fiepub.fiepub_accsubjectref` |
| `activity` | `` |
| `lease_payment_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `depr_subject_id` | `fiepub.epub_accsubject_treetableref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `orivalue_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `wbs` | `` |
| `fair_value_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `grp_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `pre_liability_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `orivalue_subject_id` | `fiepub.epub_accsubject_treetableref` |
| `comprehensive_income_subject_id` | `fiepub.fiepub_accsubjectref` |
| `usage_cost_center_id` | `finbd.bd_costcenterref` |
| `event_calc_id` | `` |
| `uncon_finance_cost_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `init_direct_cost_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `lease_incentive_subject_id` | `fiepub.fiepub_accsubjectref` |
| `pre_liability_subject_id` | `fiepub.fiepub_accsubjectref` |
| `imp_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `org_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `product_id` | `productcenter.pc_nomalproductref` |
| `dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `lease_payment_subject_id` | `fiepub.fiepub_accsubjectref` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `depr_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `comprehensive_income_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `lease_incentive_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `init_direct_cost_subject_id` | `fiepub.fiepub_accsubjectref` |
| `gbl_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `accum_interest_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `fair_value_gainloss_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `accum_interest_subject_id` | `fiepub.fiepub_accsubjectref` |
| `fair_value_gainloss_subject_id` | `fiepub.fiepub_accsubjectref` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |
| `accbook_currtype_id` | `ucfbasedoc.bd_currencytenantref` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 262 个直连字段

### 文本字段 (21个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年编码 |
| `accbook_id` | `accbook_id` | `accbook` | 账簿ID |
| `accbook_start_date` | `accbook_start_date` | `accbookStartDate` | 启用日期 |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体ID |
| `asset_book_category_id` | `asset_book_category_id` | `assetBookCategoryId` | 固定资产账簿类别 |
| `asset_code` | `asset_code` | `assetCode` | 固定资产编码 |
| `asset_id` | `asset_id` | `assetId` | 固定资产ID |
| `begin_date` | `begin_date` | `beginDate` | 固定资产开始使用日期 |
| `busi_date` | `busi_date` | `busiDate` | 业务日期 |
| `create_asset_date` | `create_asset_date` | `createAssetDate` | 建卡日期 |
| `depr_voucher_make_sign` | `depr_voucher_make_sign` | `deprVoucherMakeSign` | 折旧凭证制单标识 |
| `direction` | `direction` | `direction` | 方向 |
| `fi_event_code` | `fi_event_code` | `eventCode` | 会计事务编码 |
| `disposal_status` | `disposal_status` | `fixedStatus` | 处置状态 |
| `header_id` | `header_id` | `headerId` | 主表ID |
| `id` | `id` | `id` | 主键 |
| `mgt_dept_id` | `mgt_dept_id` | `mgmtDeptId` | 固定资产管理部门 |
| `period_code` | `period_code` | `period` | 会计期间编码 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `usage_state_id` | `usage_state_id` | `usageStateId` | 固定资产使用状态 |
| `user_id` | `user_id` | `userId` | 使用人 |

### 引用字段 (39个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `depr_subject_id` | `depr_subject_id` | `deprSubjectId` | 累计折旧科目-原始版本 |
| `depr_subject_vid` | `depr_subject_vid` | `deprSubjectVid` | 累计折旧科目 |
| `event_calc_id` | `event_calc_id` | `eventAssetCalcInfoId` | 核算信息Id |
| `imp_subject_id` | `imp_subject_id` | `impSubjectId` | 累计减值科目-原始版本 |
| `imp_subject_vid` | `imp_subject_vid` | `impSubjectVid` | 累计减值科目 |
| `orivalue_subject_id` | `orivalue_subject_id` | `orivalueSubjectId` | 原值科目-原始版本 |
| `orivalue_subject_vid` | `orivalue_subject_vid` | `orivalueSubjectVid` | 原值科目 |
| `accbook_currtype_id` | `accbook_currtype_id` | `accbookCurrtypeId` | 本币币种 |
| `accum_interest_subject_id` | `accum_interest_subject_id` | `accumInterestSubjectId` | 利息支出科目-原始版本 |
| `accum_interest_subject_vid` | `accum_interest_subject_vid` | `accumInterestSubjectVid` | 利息支出科目 |
| `activity` | `activity` | `activity` | 活动 |
| `comprehensive_income_subject_id` | `comprehensive_income_subject_id` | `comprehensiveIncomeSubjectId` | 其他综合收益科目-原始版本 |
| `comprehensive_income_subject_vid` | `comprehensive_income_subject_vid` | `comprehensiveIncomeSubjectVid` | 其他综合收益科目 |
| `usage_cost_center_id` | `usage_cost_center_id` | `costCenterId` | 使用成本中心 |
| `creator` | `creator` | `creator` | 创建人 |
| `dept_id` | `dept_id` | `deptId` | 部门 |
| `fair_value_gainloss_subject_id` | `fair_value_gainloss_subject_id` | `fairValueGainlossSubjectId` | 公允价值变动损益科目-原始版本 |
| `fair_value_gainloss_subject_vid` | `fair_value_gainloss_subject_vid` | `fairValueGainlossSubjectVid` | 公允价值变动损益科目 |
| `fair_value_subject_id` | `fair_value_subject_id` | `fairValueSubjectId` | 公允价值变动科目-原始版本 |
| `fair_value_subject_vid` | `fair_value_subject_vid` | `fairValueSubjectVid` | 公允价值变动科目 |
| `gbl_currtype_id` | `gbl_currtype_id` | `gblCurrtypeId` | 全局币币种 |
| `grp_currtype_id` | `grp_currtype_id` | `grpCurrtypeId` | 集团币币种 |
| `init_direct_cost_subject_id` | `init_direct_cost_subject_id` | `initDirectCostSubjectId` | 初始直接费用科目-原始版本 |
| `init_direct_cost_subject_vid` | `init_direct_cost_subject_vid` | `initDirectCostSubjectVid` | 初始直接费用科目 |
| `lease_incentive_subject_id` | `lease_incentive_subject_id` | `leaseIncentiveSubjectId` | 租金激励科目-原始版本 |
| `lease_incentive_subject_vid` | `lease_incentive_subject_vid` | `leaseIncentiveSubjectVid` | 租金激励科目 |
| `lease_payment_subject_id` | `lease_payment_subject_id` | `leasePaymentSubjectId` | 租赁付款额科目-原始版本 |
| `lease_payment_subject_vid` | `lease_payment_subject_vid` | `leasePaymentSubjectVid` | 租赁付款额科目 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `org_currtype_id` | `org_currtype_id` | `orgCurrtypeId` | 组织币币种 |
| `pre_liability_subject_id` | `pre_liability_subject_id` | `preLiabilitySubjectId` | 预计负债科目-原始版本 |
| `pre_liability_subject_vid` | `pre_liability_subject_vid` | `preLiabilitySubjectVid` | 预计负债科目 |
| `product_id` | `product_id` | `productId` | 产品 |
| `profit_center_id` | `profit_center_id` | `profitCenterId` | 使用利润中心 |
| `project_id` | `project_id` | `projectId` | 项目 |
| `uncon_finance_cost_subject_id` | `uncon_finance_cost_subject_id` | `unconFinanceCostSubjectId` | 未确认融资费用科目-原始版本 |
| `uncon_finance_cost_subject_vid` | `uncon_finance_cost_subject_vid` | `unconFinanceCostSubjectVid` | 未确认融资费用科目 |
| `wbs` | `wbs` | `wbs` | WBS |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accrued_period` | `accrued_period` | `extractedPeriod` | 已计提期数 |
| `life_month` | `life_month` | `lifeMonth` | 使用月限 |
| `life_year` | `life_year` | `lifeYear` | 使用年限 |
| `quantity` | `quantity` | `quantity` | 数量 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_year_id` | `acc_year_id` | `accYearId` | 会计年ID |
| `period_id` | `period_id` | `periodId` | 会计期间 |

### 数值字段 (187个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `af_proportion` | `af_proportion` | `afProportion` | 转移后比例 |
| `be_proportion` | `be_proportion` | `beProportion` | 转移前比例 |
| `delta_proportion` | `delta_proportion` | `deltaProportion` | 增减比例 |
| `acc_accum_fair_value_difference` | `acc_accum_fair_value_difference` | `accAccumFairValueDifference` | 本币累计公允价值变动发生额 |
| `acc_accum_fair_value_gainloss_difference` | `acc_accum_fair_value_gainloss_difference` | `accAccumFairValueGainlossDifference` | 本币累计公允价值变动损益发生额 |
| `acc_accum_interest` | `acc_accum_interest` | `accAccumInterest` | 本币累计计提利息 |
| `acc_accum_interest_difference` | `acc_accum_interest_difference` | `accAccumInterestDifference` | 本币累计计提利息发生额 |
| `acc_adjust_depr_amount` | `acc_adjust_depr_amount` | `accAdjustDeprAmount` | 本币追溯调整折旧 |
| `acc_af_accum_fair_value` | `acc_af_accum_fair_value` | `accAfAccumFairValue` | 本币变动后累计公允价变动 |
| `acc_af_accum_fair_value_gainloss` | `acc_af_accum_fair_value_gainloss` | `accAfAccumFairValueGainloss` | 本币变动后累计公允价值变动损益 |
| `acc_af_comprehensive_income` | `acc_af_comprehensive_income` | `accAfComprehensiveIncome` | 本币变动后其他综合收益 |
| `acc_af_fair_value` | `acc_af_fair_value` | `accAfFairValue` | 本币变动后公允价值 |
| `acc_af_fair_value_cost` | `acc_af_fair_value_cost` | `accAfFairValueCost` | 本币变动后公允价值成本 |
| `acc_comprehensive_income_difference` | `acc_comprehensive_income_difference` | `accComprehensiveIncomeDifference` | 本币其他综合收益发生额 |
| `acc_fair_value_cost_difference` | `acc_fair_value_cost_difference` | `accFairValueCostDifference` | 本币公允价值成本发生额 |
| `acc_fair_value_difference` | `acc_fair_value_difference` | `accFairValueDifference` | 本币公允价值发生额 |
| `acc_init_direct_cost` | `acc_init_direct_cost` | `accInitDirectCost` | 本币初始直接费用 |
| `acc_init_direct_cost_difference` | `acc_init_direct_cost_difference` | `accInitDirectCostDifference` | 本币初始直接费用发生额 |
| `acc_lease_incentive_amount` | `acc_lease_incentive_amount` | `accLeaseIncentiveAmount` | 本币租金激励金额 |
| `acc_lease_incentive_amount_difference` | `acc_lease_incentive_amount_difference` | `accLeaseIncentiveAmountDifference` | 本币租金激励金额发生额 |
| `acc_lease_payment` | `acc_lease_payment` | `accLeasePayment` | 本币租赁付款额合计 |
| `acc_lease_payment_difference` | `acc_lease_payment_difference` | `accLeasePaymentDifference` | 本币租赁付款额合计发生额 |
| `acc_pre_liability` | `acc_pre_liability` | `accPreLiability` | 本币预计负债 |
| `acc_pre_liability_difference` | `acc_pre_liability_difference` | `accPreLiabilityDifference` | 本币预计负债发生额 |
| `acc_uncon_finance_cost` | `acc_uncon_finance_cost` | `accUnconFinanceCost` | 本币未确认融资费用 |
| `acc_uncon_finance_cost_difference` | `acc_uncon_finance_cost_difference` | `accUnconFinanceCostDifference` | 本币未确认融资费用发生额 |
| `acc_year_fair_value_difference` | `acc_year_fair_value_difference` | `accYearFairValueDifference` | 本币本年公允价值变动发生额 |
| `acc_year_fair_value_gainloss_difference` | `acc_year_fair_value_gainloss_difference` | `accYearFairValueGainlossDifference` | 本币本年公允价值变动损益发生额 |
| `accrual_ori_value` | `accrual_ori_value` | `accrualOriValue` | 本币计提原值 |
| `af_card_depr_amount` | `af_card_depr_amount` | `afCardDeprAmount` | 变动后卡片本币累计折旧 |
| `af_card_imp_amount` | `af_card_imp_amount` | `afCardImpAmount` | 变动后卡片本币减值 |
| `af_card_ori_value` | `af_card_ori_value` | `afCardOriValue` | 变动后卡片本币原值 |
| `af_depr_amount` | `af_depr_amount` | `afDeprAmount` | 变动后本币累计折旧 |
| `af_impairment_amount` | `af_impairment_amount` | `afImpairmentAmount` | 变动后本币减值 |
| `af_ori_value` | `af_ori_value` | `afOriValue` | 变动后本币原值 |
| `af_scrap_value` | `af_scrap_value` | `afScrapValue` | 变动后本币残值 |
| `depr_amount` | `depr_amount` | `deprAmount` | 本币累计折旧发生额 |
| `gbl_accrual_ori_value_amount` | `gbl_accrual_ori_value_amount` | `gblAccrualOriValueAmount` | 全局币计提原值 |
| `gbl_accum_depr_amount` | `gbl_accum_depr_amount` | `gblAccumDeprAmount` | 全局币累计折旧发生额 |
| `gbl_accum_fair_value_difference` | `gbl_accum_fair_value_difference` | `gblAccumFairValueDifference` | 全局币累计公允价值变动发生额 |
| `gbl_accum_fair_value_gainloss_difference` | `gbl_accum_fair_value_gainloss_difference` | `gblAccumFairValueGainlossDifference` | 全局币累计公允价值变动损益发生额 |
| `gbl_accum_imp_amount` | `gbl_accum_imp_amount` | `gblAccumImpAmount` | 全局币累计减值 |
| `gbl_accum_interest` | `gbl_accum_interest` | `gblAccumInterest` | 全局币累计计提利息 |
| `gbl_accum_interest_difference` | `gbl_accum_interest_difference` | `gblAccumInterestDifference` | 全局币累计计提利息发生额 |
| `gbl_addition_depr_amount` | `gbl_addition_depr_amount` | `gblAdditionDeprAmount` | 全局币附加折旧费用金额 |
| `gbl_adjust_depr_amount` | `gbl_adjust_depr_amount` | `gblAdjustDeprAmount` | 全局币追溯调整折旧 |
| `gbl_af_accum_fair_value` | `gbl_af_accum_fair_value` | `gblAfAccumFairValue` | 全局币变动后累计公允价变动 |
| `gbl_af_accum_fair_value_gainloss` | `gbl_af_accum_fair_value_gainloss` | `gblAfAccumFairValueGainloss` | 全局币变动后累计公允价值变动损益 |
| `gbl_af_card_depr_amount` | `gbl_af_card_depr_amount` | `gblAfCardDeprAmount` | 全局币变动后卡片累计折旧 |
| `gbl_af_card_imp_amount` | `gbl_af_card_imp_amount` | `gblAfCardImpAmount` | 全局币变动后卡片减值 |
| `gbl_af_card_ori_value_amount` | `gbl_af_card_ori_value_amount` | `gblAfCardOriValueAmount` | 全局币变动后卡片原值 |
| `gbl_af_comprehensive_income` | `gbl_af_comprehensive_income` | `gblAfComprehensiveIncome` | 全局币变动后其他综合收益 |
| `gbl_af_depr_amount` | `gbl_af_depr_amount` | `gblAfDeprAmount` | 全局币变动后累计折旧 |
| `gbl_af_fair_value` | `gbl_af_fair_value` | `gblAfFairValue` | 全局币变动后公允价值 |
| `gbl_af_fair_value_cost` | `gbl_af_fair_value_cost` | `gblAfFairValueCost` | 全局币变动后公允价值成本 |
| `gbl_af_impairment_amount` | `gbl_af_impairment_amount` | `gblAfImpairmentAmount` | 全局币变动后减值 |
| `gbl_af_ori_value_amount` | `gbl_af_ori_value_amount` | `gblAfOriValueAmount` | 全局币变动后原值 |
| `gbl_af_scrap_value_amount` | `gbl_af_scrap_value_amount` | `gblAfScrapValueAmount` | 全局币变动后残值 |
| `gbl_clean_cost_amount` | `gbl_clean_cost_amount` | `gblCleanCostAmount` | 全局币清理费用金额 |
| `gbl_clean_income_amount` | `gbl_clean_income_amount` | `gblCleanIncomeAmount` | 全局币清理收入金额 |
| `gbl_comprehensive_income_difference` | `gbl_comprehensive_income_difference` | `gblComprehensiveIncomeDifference` | 全局币其他综合收益发生额 |
| `gbl_disposal_amount` | `gbl_disposal_amount` | `gblDisposalAmount` | 全局币固定资产清理金额 |
| `gbl_disposal_gain_amount` | `gbl_disposal_gain_amount` | `gblDisposalGainAmount` | 全局币处置收益金额 |
| `gbl_disposal_loss_amount` | `gbl_disposal_loss_amount` | `gblDisposalLossAmount` | 全局币处置损失金额 |
| `gbl_fair_value_cost_difference` | `gbl_fair_value_cost_difference` | `gblFairValueCostDifference` | 全局币公允价值成本发生额 |
| `gbl_fair_value_difference` | `gbl_fair_value_difference` | `gblFairValueDifference` | 全局币公允价值发生额 |
| `gbl_imp_loss_amount` | `gbl_imp_loss_amount` | `gblImpLossAmount` | 全局币减值损失金额 |
| `gbl_init_direct_cost` | `gbl_init_direct_cost` | `gblInitDirectCost` | 全局币初始直接费用 |
| `gbl_init_direct_cost_difference` | `gbl_init_direct_cost_difference` | `gblInitDirectCostDifference` | 全局币初始直接费用发生额 |
| `gbl_lease_incentive_amount` | `gbl_lease_incentive_amount` | `gblLeaseIncentiveAmount` | 全局币租金激励金额 |
| `gbl_lease_incentive_amount_difference` | `gbl_lease_incentive_amount_difference` | `gblLeaseIncentiveAmountDifference` | 全局币租金激励金额发生额 |
| `gbl_lease_payment` | `gbl_lease_payment` | `gblLeasePayment` | 全局币租赁付款额合计 |
| `gbl_lease_payment_difference` | `gbl_lease_payment_difference` | `gblLeasePaymentDifference` | 全局币租赁付款额合计发生额 |
| `gbl_ori_value_amount` | `gbl_ori_value_amount` | `gblOriValueAmount` | 全局币原值 |
| `gbl_period_depr_amount` | `gbl_period_depr_amount` | `gblPeriodDeprAmount` | 全局币折旧费用金额 |
| `gbl_pre_liability` | `gbl_pre_liability` | `gblPreLiability` | 全局币预计负债 |
| `gbl_pre_liability_difference` | `gbl_pre_liability_difference` | `gblPreLiabilityDifference` | 全局币预计负债发生额 |
| `gbl_tax_amount` | `gbl_tax_amount` | `gblTaxAmount` | 全局币税额 |
| `gbl_uncon_finance_cost` | `gbl_uncon_finance_cost` | `gblUnconFinanceCost` | 全局币未确认融资费用 |
| `gbl_uncon_finance_cost_difference` | `gbl_uncon_finance_cost_difference` | `gblUnconFinanceCostDifference` | 全局币未确认融资费用发生额 |
| `gbl_year_fair_value_difference` | `gbl_year_fair_value_difference` | `gblYearFairValueDifference` | 全局币本年公允价值变动发生额 |
| `gbl_year_fair_value_gainloss_difference` | `gbl_year_fair_value_gainloss_difference` | `gblYearFairValueGainlossDifference` | 全局币本年公允价值变动损益发生额 |
| `grp_accrual_ori_value_amount` | `grp_accrual_ori_value_amount` | `grpAccrualOriValueAmount` | 集团币计提原值 |
| `grp_accum_depr_amount` | `grp_accum_depr_amount` | `grpAccumDeprAmount` | 集团币累计折旧发生额 |
| `grp_accum_fair_value_difference` | `grp_accum_fair_value_difference` | `grpAccumFairValueDifference` | 集团币累计公允价值变动发生额 |
| `grp_accum_fair_value_gainloss_difference` | `grp_accum_fair_value_gainloss_difference` | `grpAccumFairValueGainlossDifference` | 集团币累计公允价值变动损益发生额 |
| `grp_accum_imp_amount` | `grp_accum_imp_amount` | `grpAccumImpAmount` | 集团币累计减值 |
| `grp_accum_interest` | `grp_accum_interest` | `grpAccumInterest` | 集团币累计计提利息 |
| `grp_accum_interest_difference` | `grp_accum_interest_difference` | `grpAccumInterestDifference` | 集团币累计计提利息发生额 |
| `grp_addition_depr_amount` | `grp_addition_depr_amount` | `grpAdditionDeprAmount` | 集团币附加折旧费用金额 |
| `grp_adjust_depr_amount` | `grp_adjust_depr_amount` | `grpAdjustDeprAmount` | 集团币追溯调整折旧 |
| `grp_af_accum_fair_value` | `grp_af_accum_fair_value` | `grpAfAccumFairValue` | 集团币变动后累计公允价变动 |
| `grp_af_accum_fair_value_gainloss` | `grp_af_accum_fair_value_gainloss` | `grpAfAccumFairValueGainloss` | 集团币变动后累计公允价值变动损益 |
| `grp_af_card_depr_amount` | `grp_af_card_depr_amount` | `grpAfCardDeprAmount` | 集团币变动后卡片累计折旧 |
| `grp_af_card_imp_amount` | `grp_af_card_imp_amount` | `grpAfCardImpAmount` | 集团币变动后卡片减值 |
| `grp_af_card_ori_value_amount` | `grp_af_card_ori_value_amount` | `grpAfCardOriValueAmount` | 集团币变动后卡片原值 |
| `grp_af_comprehensive_income` | `grp_af_comprehensive_income` | `grpAfComprehensiveIncome` | 集团币变动后其他综合收益 |
| `grp_af_depr_amount` | `grp_af_depr_amount` | `grpAfDeprAmount` | 集团币变动后累计折旧 |
| `grp_af_fair_value` | `grp_af_fair_value` | `grpAfFairValue` | 集团币变动后公允价值 |
| `grp_af_fair_value_cost` | `grp_af_fair_value_cost` | `grpAfFairValueCost` | 集团币变动后公允价值成本 |
| `grp_af_impairment_amount` | `grp_af_impairment_amount` | `grpAfImpairmentAmount` | 集团币变动后减值 |
| `grp_af_ori_value_amount` | `grp_af_ori_value_amount` | `grpAfOriValueAmount` | 集团币变动后原值 |
| `grp_af_scrap_value_amount` | `grp_af_scrap_value_amount` | `grpAfScrapValueAmount` | 集团币变动后残值 |
| `grp_clean_cost_amount` | `grp_clean_cost_amount` | `grpCleanCostAmount` | 集团币清理费用金额 |
| `grp_clean_income_amount` | `grp_clean_income_amount` | `grpCleanIncomeAmount` | 集团币清理收入金额 |
| `grp_comprehensive_income_difference` | `grp_comprehensive_income_difference` | `grpComprehensiveIncomeDifference` | 集团币其他综合收益发生额 |
| `grp_disposal_amount` | `grp_disposal_amount` | `grpDisposalAmount` | 集团币固定资产清理金额 |
| `grp_disposal_gain_amount` | `grp_disposal_gain_amount` | `grpDisposalGainAmount` | 集团币处置收益金额 |
| `grp_disposal_loss_amount` | `grp_disposal_loss_amount` | `grpDisposalLossAmount` | 集团币处置损失金额 |
| `grp_fair_value_cost_difference` | `grp_fair_value_cost_difference` | `grpFairValueCostDifference` | 集团币公允价值成本发生额 |
| `grp_fair_value_difference` | `grp_fair_value_difference` | `grpFairValueDifference` | 集团币公允价值发生额 |
| `grp_imp_loss_amount` | `grp_imp_loss_amount` | `grpImpLossAmount` | 集团币减值损失金额 |
| `grp_init_direct_cost` | `grp_init_direct_cost` | `grpInitDirectCost` | 集团币初始直接费用 |
| `grp_init_direct_cost_difference` | `grp_init_direct_cost_difference` | `grpInitDirectCostDifference` | 集团币初始直接费用发生额 |
| `grp_lease_incentive_amount` | `grp_lease_incentive_amount` | `grpLeaseIncentiveAmount` | 集团币租金激励金额 |
| `grp_lease_incentive_amount_difference` | `grp_lease_incentive_amount_difference` | `grpLeaseIncentiveAmountDifference` | 集团币租金激励金额发生额 |
| `grp_lease_payment` | `grp_lease_payment` | `grpLeasePayment` | 集团币租赁付款额合计 |
| `grp_lease_payment_difference` | `grp_lease_payment_difference` | `grpLeasePaymentDifference` | 集团币租赁付款额合计发生额 |
| `grp_ori_value_amount` | `grp_ori_value_amount` | `grpOriValueAmount` | 集团币原值 |
| `grp_period_depr_amount` | `grp_period_depr_amount` | `grpPeriodDeprAmount` | 集团币折旧费用金额 |
| `grp_pre_liability` | `grp_pre_liability` | `grpPreLiability` | 集团币预计负债 |
| `grp_pre_liability_difference` | `grp_pre_liability_difference` | `grpPreLiabilityDifference` | 集团币预计负债发生额 |
| `grp_tax_amount` | `grp_tax_amount` | `grpTaxAmount` | 集团币税额 |
| `grp_uncon_finance_cost` | `grp_uncon_finance_cost` | `grpUnconFinanceCost` | 集团币未确认融资费用 |
| `grp_uncon_finance_cost_difference` | `grp_uncon_finance_cost_difference` | `grpUnconFinanceCostDifference` | 集团币未确认融资费用发生额 |
| `grp_year_fair_value_difference` | `grp_year_fair_value_difference` | `grpYearFairValueDifference` | 集团币本年公允价值变动发生额 |
| `grp_year_fair_value_gainloss_difference` | `grp_year_fair_value_gainloss_difference` | `grpYearFairValueGainlossDifference` | 集团币本年公允价值变动损益发生额 |
| `impairment_amount` | `impairment_amount` | `impairmentAmount` | 本币累计减值 |
| `org_accrual_ori_value_amount` | `org_accrual_ori_value_amount` | `orgAccrualOriValueAmount` | 组织币计提原值 |
| `org_accum_depr_amount` | `org_accum_depr_amount` | `orgAccumDeprAmount` | 组织币累计折旧发生额 |
| `org_accum_fair_value_difference` | `org_accum_fair_value_difference` | `orgAccumFairValueDifference` | 组织币累计公允价值变动发生额 |
| `org_accum_fair_value_gainloss_difference` | `org_accum_fair_value_gainloss_difference` | `orgAccumFairValueGainlossDifference` | 组织币累计公允价值变动损益发生额 |
| `org_accum_imp_amount` | `org_accum_imp_amount` | `orgAccumImpAmount` | 组织币累计减值 |
| `org_accum_interest` | `org_accum_interest` | `orgAccumInterest` | 组织币累计计提利息 |
| `org_accum_interest_difference` | `org_accum_interest_difference` | `orgAccumInterestDifference` | 组织币累计计提利息发生额 |
| `org_addition_depr_amount` | `org_addition_depr_amount` | `orgAdditionDeprAmount` | 组织币附加折旧费用金额 |
| `org_adjust_depr_amount` | `org_adjust_depr_amount` | `orgAdjustDeprAmount` | 组织币追溯调整折旧 |
| `org_af_accum_fair_value` | `org_af_accum_fair_value` | `orgAfAccumFairValue` | 组织币变动后累计公允价变动 |
| `org_af_accum_fair_value_gainloss` | `org_af_accum_fair_value_gainloss` | `orgAfAccumFairValueGainloss` | 组织币变动后累计公允价值变动损益 |
| `org_af_card_depr_amount` | `org_af_card_depr_amount` | `orgAfCardDeprAmount` | 组织币变动后卡片累计折旧 |
| `org_af_card_imp_amount` | `org_af_card_imp_amount` | `orgAfCardImpAmount` | 组织币变动后卡片减值 |
| `org_af_card_ori_value_amount` | `org_af_card_ori_value_amount` | `orgAfCardOriValueAmount` | 组织币变动后卡片原值 |
| `org_af_comprehensive_income` | `org_af_comprehensive_income` | `orgAfComprehensiveIncome` | 组织币变动后其他综合收益 |
| `org_af_depr_amount` | `org_af_depr_amount` | `orgAfDeprAmount` | 组织币变动后累计折旧 |
| `org_af_fair_value` | `org_af_fair_value` | `orgAfFairValue` | 组织币变动后公允价值 |
| `org_af_fair_value_cost` | `org_af_fair_value_cost` | `orgAfFairValueCost` | 组织币变动后公允价值成本 |
| `org_af_impairment_amount` | `org_af_impairment_amount` | `orgAfImpairmentAmount` | 组织币变动后减值 |
| `org_af_ori_value_amount` | `org_af_ori_value_amount` | `orgAfOriValueAmount` | 组织币变动后原值 |
| `org_af_scrap_value_amount` | `org_af_scrap_value_amount` | `orgAfScrapValueAmount` | 组织币变动后残值 |
| `org_clean_cost_amount` | `org_clean_cost_amount` | `orgCleanCostAmount` | 组织币清理费用金额 |
| `org_clean_income_amount` | `org_clean_income_amount` | `orgCleanIncomeAmount` | 组织币清理收入金额 |
| `org_comprehensive_income_difference` | `org_comprehensive_income_difference` | `orgComprehensiveIncomeDifference` | 组织币其他综合收益发生额 |
| `org_disposal_amount` | `org_disposal_amount` | `orgDisposalAmount` | 组织币固定资产清理金额 |
| `org_disposal_gain_amount` | `org_disposal_gain_amount` | `orgDisposalGainAmount` | 组织币处置收益金额 |
| `org_disposal_loss_amount` | `org_disposal_loss_amount` | `orgDisposalLossAmount` | 组织币处置损失金额 |
| `org_fair_value_cost_difference` | `org_fair_value_cost_difference` | `orgFairValueCostDifference` | 组织币公允价值成本发生额 |
| `org_fair_value_difference` | `org_fair_value_difference` | `orgFairValueDifference` | 组织币公允价值发生额 |
| `org_imp_loss_amount` | `org_imp_loss_amount` | `orgImpLossAmount` | 组织币减值损失金额 |
| `org_init_direct_cost` | `org_init_direct_cost` | `orgInitDirectCost` | 组织币初始直接费用 |
| `org_init_direct_cost_difference` | `org_init_direct_cost_difference` | `orgInitDirectCostDifference` | 组织币初始直接费用发生额 |
| `org_lease_incentive_amount` | `org_lease_incentive_amount` | `orgLeaseIncentiveAmount` | 组织币租金激励金额 |
| `org_lease_incentive_amount_difference` | `org_lease_incentive_amount_difference` | `orgLeaseIncentiveAmountDifference` | 组织币租金激励金额发生额 |
| `org_lease_payment` | `org_lease_payment` | `orgLeasePayment` | 组织币租赁付款额合计 |
| `org_lease_payment_difference` | `org_lease_payment_difference` | `orgLeasePaymentDifference` | 组织币租赁付款额合计发生额 |
| `org_ori_value_amount` | `org_ori_value_amount` | `orgOriValueAmount` | 组织币原值 |
| `org_period_depr_amount` | `org_period_depr_amount` | `orgPeriodDeprAmount` | 组织币折旧费用金额 |
| `org_pre_liability` | `org_pre_liability` | `orgPreLiability` | 组织币预计负债 |
| `org_pre_liability_difference` | `org_pre_liability_difference` | `orgPreLiabilityDifference` | 组织币预计负债发生额 |
| `org_tax_amount` | `org_tax_amount` | `orgTaxAmount` | 组织币税额 |
| `org_uncon_finance_cost` | `org_uncon_finance_cost` | `orgUnconFinanceCost` | 组织币未确认融资费用 |
| `org_uncon_finance_cost_difference` | `org_uncon_finance_cost_difference` | `orgUnconFinanceCostDifference` | 组织币未确认融资费用发生额 |
| `org_year_fair_value_difference` | `org_year_fair_value_difference` | `orgYearFairValueDifference` | 组织币本年公允价值变动发生额 |
| `org_year_fair_value_gainloss_difference` | `org_year_fair_value_gainloss_difference` | `orgYearFairValueGainlossDifference` | 组织币本年公允价值变动损益发生额 |
| `ori_accum_interest` | `ori_accum_interest` | `oriAccumInterest` | 原币累计计提利息 |
| `ori_accum_interest_difference` | `ori_accum_interest_difference` | `oriAccumInterestDifference` | 原币累计计提利息发生额 |
| `ori_init_direct_cost` | `ori_init_direct_cost` | `oriInitDirectCost` | 原币初始直接费用 |
| `ori_init_direct_cost_difference` | `ori_init_direct_cost_difference` | `oriInitDirectCostDifference` | 原币初始直接费用发生额 |
| `ori_lease_incentive_amount` | `ori_lease_incentive_amount` | `oriLeaseIncentiveAmount` | 原币租金激励金额 |
| `ori_lease_incentive_amount_difference` | `ori_lease_incentive_amount_difference` | `oriLeaseIncentiveAmountDifference` | 原币租金激励金额发生额 |
| `ori_lease_payment` | `ori_lease_payment` | `oriLeasePayment` | 原币租赁付款额合计 |
| `ori_lease_payment_difference` | `ori_lease_payment_difference` | `oriLeasePaymentDifference` | 原币租赁付款额合计发生额 |
| `ori_pre_liability` | `ori_pre_liability` | `oriPreLiability` | 原币预计负债 |
| `ori_pre_liability_difference` | `ori_pre_liability_difference` | `oriPreLiabilityDifference` | 原币预计负债发生额 |
| `ori_uncon_finance_cost` | `ori_uncon_finance_cost` | `oriUnconFinanceCost` | 原币未确认融资费用 |
| `ori_uncon_finance_cost_difference` | `ori_uncon_finance_cost_difference` | `oriUnconFinanceCostDifference` | 原币未确认融资费用发生额 |
| `ori_value` | `ori_value` | `oriValue` | 本币原值 |
| `scrap_value_rate` | `scrap_value_rate` | `scrapValueRate` | 净残值率 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义特征id |

### multiLanguage (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `asset_model` | `asset_model` | `assetModel` | 固定资产型号 |
| `location` | `location` | `location` | 固定资产存放地点 |
| `name` | `name` | `name` | 固定资产名称 |
| `specification` | `specification` | `specification` | 固定资产规格 |
