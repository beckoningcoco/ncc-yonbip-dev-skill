---
tags: [BIP, 元数据, 数据字典, fa.fadisposalbill.DisposalBillDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 处置单表体 (`fa.fadisposalbill.DisposalBillDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_bill_disposal_dtl` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`cecf614f-190b-4498-bbaa-b58480bea529`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 处置单表体 |
| 物理表 | `fa_bill_disposal_dtl` |
| 数据库 schema | `yonbip-fi-efa` |
| 所属应用 | `EFA` |
| 直连字段 | 125 个 |
| 子表 | 0 个 |
| 关联引用 | 24 个 |

## 关联引用 (24个)

| 字段名 | 引用类型 |
|--------|---------|
| `disposal_convention_id` | `yonbip-fi-efa.fa_depr_conventionref` |
| `org_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `period_id` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `acc_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `asset_calc_id` | `` |
| `staff` | `ucf-staff-center.bd_staff_all_ref` |
| `ytenant_id` | `` |
| `disposal_bill_id` | `` |
| `mgt_dept_id` | `ucf-org-center.admin_dept_tree_ref_na` |
| `usage_state_id` | `yonbip-fi-efa.fa_usagestateref` |
| `busi_partner` | `productcenter.base_businesspartnerref` |
| `reduce_way_id` | `finbd.bd_reducewayref` |
| `asset_id` | `yonbip-fi-efa.fa_assetsquery_basic_ref` |
| `depr_method_id` | `yonbip-fi-efa.fa_depreciation_methodlistref` |
| `vendor` | `yssupplier.aa_vendor` |
| `asset_category_id` | `` |
| `usage_dept_id` | `ucf-org-center.admin_dept_tree_ref_na` |
| `project_id` | `ucfbasedoc.bd_projectNewRef` |
| `tax_item_id` | `yonbip-fi-taxpubdoc.RefTable_55c5b82f11` |
| `accbook_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `customer` | `productcenter.merchantRef` |

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

> 共 125 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `period_code` | `period_code` | `period` | 会计期间 |
| `discription` | `discription` | `discription` | 备注 |
| `disposal_effect_date` | `disposal_effect_date` | `reduceDate` | 处置生效日期 |
| `restart_status` | `restart_status` | `resetStatus` | 重启状态 |
| `id` | `id` | `id` | id |

### 引用字段 (24个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_id` | `accbook_id` | `accbook` | 账簿 |
| `period_id` | `period_id` | `periodId` | 会计期间id |
| `asset_id` | `asset_id` | `assetId` | 固定资产 |
| `asset_category_id` | `asset_category_id` | `assetCategoryId` | 资产类别 |
| `mgt_dept_id` | `mgt_dept_id` | `mgmtDeptId` | 管理部门 |
| `disposal_bill_id` | `disposal_bill_id` | `disposalBillId` | 处置单 |
| `depr_method_id` | `depr_method_id` | `deprMethodId` | 折旧方法 |
| `reduce_way_id` | `reduce_way_id` | `reduceWayId` | 减少方式 |
| `disposal_convention_id` | `disposal_convention_id` | `disposalConvention` | 处置惯例 |
| `usage_state_id` | `usage_state_id` | `usageStateId` | 使用状况 |
| `asset_calc_id` | `asset_calc_id` | `calculateId` | 核算信息 |
| `usage_dept_id` | `usage_dept_id` | `operDeptId` | 使用部门 |
| `project_id` | `project_id` | `projectId` | 项目 |
| `accbook_currtype_id` | `accbook_currtype_id` | `accbookCurrtypeId` | 本币币种 |
| `acc_rate_type_id` | `acc_rate_type_id` | `accRateTypeId` | 本币汇率类型 |
| `org_currtype_id` | `org_currtype_id` | `orgCurrtypeId` | 组织币币种 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |
| `busi_partner` | `busi_partner` | `busiPartner` | 业务伙伴 |
| `customer` | `customer` | `customer` | 客户 |
| `staff` | `staff` | `staff` | 员工 |
| `tax_item_id` | `tax_item_id` | `taxItemId` | 税目 |
| `vendor` | `vendor` | `vendor` | 供应商 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | pubts |

### 布尔字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_disposal_curr_depr` | `bln_disposal_curr_depr` | `isDisposalcurdepr` | 处置资产当期计提 |
| `bln_whole_disposal` | `bln_whole_disposal` | `blnWholeDisposal` | 是否完全处置 |
| `bln_senior_depr` | `bln_senior_depr` | `accbookSuperDepr` | 是否高级折旧 |
| `bln_disposal_curr_interest` | `bln_disposal_curr_interest` | `blnDisposalCurrInterest` | 处置当期是否计提利息 |
| `bln_input_vat_recoverable` | `bln_input_vat_recoverable` | `isInputVATRecoverable` | 进项税转出 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_convert_param` | `acc_convert_param` | `accConvertParam` | 本币折算参数 |
| `acc_rate_ops` | `acc_rate_ops` | `accRateOps` | 本币汇率折算方式 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `life_year` | `life_year` | `lifeYear` | 使用年 |
| `life_month` | `life_month` | `lifeMonth` | 使用月限 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (83个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tax_amount` | `tax_amount` | `taxAmount` | 税额 |
| `be_disposal_quantity` | `be_disposal_quantity` | `beforeDisposalAmount` | 处置前数量 |
| `disposal_quantity` | `disposal_quantity` | `disposalAmount` | 处置数量 |
| `disposal_rate` | `disposal_rate` | `disposalRate` | 处置比例 |
| `added_tax_amount` | `added_tax_amount` | `addedTaxAmount` | 增值税 |
| `input_tax_amount` | `input_tax_amount` | `inputValueAddedTax` | 进项税 |
| `scrap_value_rate` | `scrap_value_rate` | `scrapValueRate` | 残值率 |
| `ori_remain_rent_amount` | `ori_remain_rent_amount` | `oriRemainRentAmount` | 原币剩余租赁付款额 |
| `ori_remain_unre_fin_charge` | `ori_remain_unre_fin_charge` | `oriRemainUnreFinCharge` | 原币剩余未确认融资费用 |
| `acc_rate` | `acc_rate` | `accRate` | 本币汇率 |
| `acc_currtype_ori_amount` | `acc_currtype_ori_amount` | `oriValue` | 本币计提原值 |
| `acc_accum_depr_amount` | `acc_accum_depr_amount` | `deprAmount` | 累计折旧 |
| `be_acc_currtype_ori_amount` | `be_acc_currtype_ori_amount` | `beforeDisposalOriValue` | 本币处置前原值 |
| `disposal_ori_value` | `disposal_ori_value` | `disposalOriValue` | 本币处置原值 |
| `be_scrap_value_amount` | `be_scrap_value_amount` | `beforeScrapValue` | 本币处置前净残值 |
| `scrap_value_amount` | `scrap_value_amount` | `scrapValue` | 净残值差额 |
| `be_curr_year_depr_amount` | `be_curr_year_depr_amount` | `beforeYearDeprAmount` | 本币处置前本年折旧 |
| `disposal_curr_year_depr_amount` | `disposal_curr_year_depr_amount` | `disposalYearDeprAmount` | 本币处置本年折旧 |
| `af_curr_year_depr_amount` | `af_curr_year_depr_amount` | `afterYearDeprAmount` | 本币处置后本年折旧 |
| `be_acc_accum_depr_amount` | `be_acc_accum_depr_amount` | `beforeDisposalDepr` | 本币处置前累计折旧 |
| `af_accum_depr_amount` | `af_accum_depr_amount` | `afterDisposalDepreciation` | 本币处置后累计折旧 |
| `acc_adjust_depr_amount` | `acc_adjust_depr_amount` | `accAdjustDeprAmount` | 本币处置影响折旧额 |
| `disposal_accum_depr_amount` | `disposal_accum_depr_amount` | `disposalDepreciation` | 本币处置累计折旧 |
| `be_curr_year_imp_amount` | `be_curr_year_imp_amount` | `beforeCurYearImpAmount` | 本币处置前本年减值 |
| `disposal_curr_year_imp_amount` | `disposal_curr_year_imp_amount` | `disposalCurYearImpAmount` | 本币处置本年减值 |
| `be_impairment_amount` | `be_impairment_amount` | `beforeImpairmentAmount` | 本币处置前减值准备 |
| `disposal_impairment_amount` | `disposal_impairment_amount` | `disposalImpairmentAmount` | 本币处置累计减值 |
| `bf_net_value` | `bf_net_value` | `beforeNetValue` | 本币处置前账面净值 |
| `disposal_net_value` | `disposal_net_value` | `disposalNetValue` | 本币处置账面净值 |
| `bf_net_amount` | `bf_net_amount` | `beforeNetAmount` | 本币处置前账面价值 |
| `disposal_net_amount` | `disposal_net_amount` | `disposalNetAmount` | 本币处置帐面价值 |
| `clean_income_amount` | `clean_income_amount` | `cleanIncomeAmount` | 本币清理收入 |
| `clean_income_tax_amount` | `clean_income_tax_amount` | `cleanIncomeTaxAmount` | 本币清理收入(含税) |
| `clean_cost_amount` | `clean_cost_amount` | `cleanCostAmount` | 本币清理费用 |
| `output_tax_amount` | `output_tax_amount` | `outputValueAddedTax` | 本币清理增值税 |
| `gain_loss_amount` | `gain_loss_amount` | `gainLossAmount` | 本币处置损益额 |
| `acc_remain_rent_amount` | `acc_remain_rent_amount` | `accRemainRentAmount` | 本币剩余租赁付款额 |
| `acc_remain_unre_fin_charge` | `acc_remain_unre_fin_charge` | `accRemainUnreFinCharge` | 本币剩余未确认融资费用 |
| `org_acc_adjust_depr_amount` | `org_acc_adjust_depr_amount` | `orgAccAdjustDeprAmount` | 组织币处置影响折旧额 |
| `org_be_currtype_ori_amount` | `org_be_currtype_ori_amount` | `orgBeCurrtypeOriAmount` | 组织币处置前原值 |
| `org_disposal_ori_value` | `org_disposal_ori_value` | `orgDisposalOriValue` | 组织币处置原值 |
| `org_be_scrap_value_amount` | `org_be_scrap_value_amount` | `orgBeScrapValueAmount` | 组织币处置前净残值数值 |
| `org_scrap_value` | `org_scrap_value` | `orgScrapValue` | 组织币处置净残值 |
| `org_be_curr_year_depr_amount` | `org_be_curr_year_depr_amount` | `orgBeCurrYearDeprAmount` | 组织币处置前本年折旧 |
| `org_disposal_curr_year_depr_amount` | `org_disposal_curr_year_depr_amount` | `orgDisposalCurrYearDeprAmount` | 组织币处置本年折旧 |
| `org_be_accum_depr_amount` | `org_be_accum_depr_amount` | `orgBeAccumDeprAmount` | 组织币处置前累计折旧 |
| `org_disposal_accum_depr_amount` | `org_disposal_accum_depr_amount` | `orgDisposalAccumDeprAmount` | 组织币处置累计折旧 |
| `org_be_curr_year_imp_amount` | `org_be_curr_year_imp_amount` | `orgBeCurrYearImpAmount` | 组织币处置前本年减值 |
| `org_disposal_curr_year_imp_amount` | `org_disposal_curr_year_imp_amount` | `orgDisposalCurrYearImpAmount` | 组织币处置本年减值 |
| `org_be_impairment_amount` | `org_be_impairment_amount` | `orgBeImpairmentAmount` | 组织币处置前累计减值 |
| `org_disposal_impairment_amount` | `org_disposal_impairment_amount` | `orgDisposalImpairmentAmount` | 组织币处置累计减值 |
| `org_be_disposal_net_value` | `org_be_disposal_net_value` | `orgBeDisposalNetValue` | 组织币处置前账面净值 |
| `org_disposal_net_value` | `org_disposal_net_value` | `orgDisposalNetValue` | 组织币处置账面净值 |
| `org_be_disposal_net_amount` | `org_be_disposal_net_amount` | `orgBeDisposalNetAmount` | 组织币处置前账面价值 |
| `org_disposal_net_amount` | `org_disposal_net_amount` | `orgDisposalNetAmount` | 组织币处置账面价值 |
| `org_clean_income_tax_amount` | `org_clean_income_tax_amount` | `orgCleanIncomeTaxAmount` | 组织币清理收入 |
| `org_clean_income_amount` | `org_clean_income_amount` | `orgCleanIncomeAmount` | 组织币清理收入(不含税) |
| `org_clean_cost_amount` | `org_clean_cost_amount` | `orgCleanCostAmount` | 组织币清理费用 |
| `org_tax_amount` | `org_tax_amount` | `orgTaxAmount` | 组织币清理增值税 |
| `org_gain_loss_amount` | `org_gain_loss_amount` | `orgGainLossAmount` | 组织币处置损益额 |
| `org_remain_rent_amount` | `org_remain_rent_amount` | `orgRemainRentAmount` | 组织币剩余租赁付款额 |
| `org_remain_unre_fin_charge` | `org_remain_unre_fin_charge` | `orgRemainUnreFinCharge` | 组织币剩余未确认融资费用 |
| `be_accum_fair_value_change` | `be_accum_fair_value_change` | `beAccumFairValueChange` | 本币处置前累计公允价值变动 |
| `be_accum_fair_value_gainloss` | `be_accum_fair_value_gainloss` | `beAccumFairValueGainloss` | 本币处置前累计公允价值变动损益 |
| `be_fair_value` | `be_fair_value` | `beFairValue` | 本币处置前公允价值 |
| `be_fair_value_cost` | `be_fair_value_cost` | `beFairValueCost` | 本币处置前公允价值成本 |
| `be_other_comprehensive_income` | `be_other_comprehensive_income` | `beOtherComprehensiveIncome` | 本币处置前其他综合收益 |
| `disposal_accum_fair_value_change` | `disposal_accum_fair_value_change` | `disposalAccumFairValueChange` | 本币处置累计公允价值变动 |
| `disposal_accum_fair_value_gainloss` | `disposal_accum_fair_value_gainloss` | `disposalAccumFairValueGainloss` | 本币处置累计公允价值变动损益 |
| `disposal_fair_value` | `disposal_fair_value` | `disposalFairValue` | 本币处置公允价值 |
| `disposal_fair_value_cost` | `disposal_fair_value_cost` | `disposalFairValueCost` | 本币处置公允价值成本 |
| `disposal_other_comprehensive_income` | `disposal_other_comprehensive_income` | `disposalOtherComprehensiveIncome` | 本币处置其他综合收益 |
| `org_be_accum_fair_value_change` | `org_be_accum_fair_value_change` | `orgBeAccumFairValueChange` | 组织币处置前累计公允价值变动 |
| `org_be_accum_fair_value_gainloss` | `org_be_accum_fair_value_gainloss` | `orgBeAccumFairValueGainloss` | 组织币处置前累计公允价值变动损益 |
| `org_be_fair_value` | `org_be_fair_value` | `orgBeFairValue` | 组织币处置前公允价值 |
| `org_be_fair_value_cost` | `org_be_fair_value_cost` | `orgBeFairValueCost` | 组织币处置前公允价值成本 |
| `org_be_other_comprehensive_income` | `org_be_other_comprehensive_income` | `orgBeOtherComprehensiveIncome` | 组织币处置前其他综合收益 |
| `org_disposal_accum_fair_value_change` | `org_disposal_accum_fair_value_change` | `orgDisposalAccumFairValueChange` | 组织币处置累计公允价值变动 |
| `org_disposal_accum_fair_value_gainloss` | `org_disposal_accum_fair_value_gainloss` | `orgDisposalAccumFairValueGainloss` | 组织币处置累计公允价值变动损益 |
| `org_disposal_fair_value` | `org_disposal_fair_value` | `orgDisposalFairValue` | 组织币处置公允价值 |
| `org_disposal_fair_value_cost` | `org_disposal_fair_value_cost` | `orgDisposalFairValueCost` | 组织币处置公允价值成本 |
| `org_disposal_other_comprehensive_income` | `org_disposal_other_comprehensive_income` | `orgDisposalOtherComprehensiveIncome` | 组织币处置其他综合收益 |
| `tax_rate` | `tax_rate` | `taxRate` | 税率 |
