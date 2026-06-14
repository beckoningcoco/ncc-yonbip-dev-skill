---
tags: [BIP, 元数据, 数据字典, fa.fareset.FixedAssetResetDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 重启单表体 (`fa.fareset.FixedAssetResetDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_bill_restart_dtl` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`b5459cd9-7f7f-44b2-b2a0-7f8f40cf71f3`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 重启单表体 |
| 物理表 | `fa_bill_restart_dtl` |
| domain/服务域 | `yonbip-fi-efa` |
| schema | `fiefa` |
| 所属应用 | `EFA` |
| 直连字段 | 85 个 |
| 子表 | 0 个 |
| 关联引用 | 15 个 |

## 关联引用 (15个)

| 字段名 | 引用类型 |
|--------|---------|
| `disposal_convention_id` | `yonbip-fi-efa.fa_depr_conventionref` |
| `org_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `period_id` | `finbd.bd_period` |
| `disposal_bill_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `acc_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `asset_calc_id` | `` |
| `ytenant_id` | `` |
| `disposal_bill_dtl_id` | `` |
| `reduce_way_id` | `finbd.bd_reducewayref` |
| `asset_id` | `yonbip-fi-efa.fa_assetsquery_cal_ref` |
| `restart_bill_id` | `` |
| `accbook_currtype_id` | `ucfbasedoc.bd_currencytenantref` |

## 继承接口 (3个, 6字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 85 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `description` | `description` | `description` | 描述 |
| `disposal_code` | `disposal_code` | `disposalCode` | 处置单编码 |
| `period_code` | `period_code` | `period` | 会计期间 |
| `disposal_bill_date` | `disposal_bill_date` | `reduceDate` | 处置单日期 |
| `disposal_effect_date` | `disposal_effect_date` | `reduceEffectDate` | 处置生效日期 |
| `restart_effect_date` | `restart_effect_date` | `resetEffectDate` | 重启生效日期 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_rate_type_id` | `acc_rate_type_id` | `accRateTypeId` | 本币汇率类型 |
| `accbook_id` | `accbook_id` | `accbook` | 账簿ID |
| `accbook_currtype_id` | `accbook_currtype_id` | `accbookCurrtypeId` | 本币币种 |
| `asset_id` | `asset_id` | `assetId` | 固定资产 |
| `asset_calc_id` | `asset_calc_id` | `calculateId` | 固定资产明细ID |
| `disposal_bill_dtl_id` | `disposal_bill_dtl_id` | `disposalBillId` | 处置单明细ID |
| `disposal_convention_id` | `disposal_convention_id` | `disposalConvention` | 处置惯例 |
| `disposal_bill_id` | `disposal_bill_id` | `disposalId` | 处置单ID |
| `restart_bill_id` | `restart_bill_id` | `fixedassetResetId` | 重启单ID |
| `org_currtype_id` | `org_currtype_id` | `orgCurrtypeId` | 组织币币种 |
| `period_id` | `period_id` | `periodId` | 会计期间ID |
| `reduce_way_id` | `reduce_way_id` | `reduceWayId` | 减少方式ID |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `disposal_audit_time` | `disposal_audit_time` | `disposalAuditTime` | 处置单审核日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_convert_param` | `acc_convert_param` | `accConvertParam` | 本币折算参数 |
| `acc_rate_ops` | `acc_rate_ops` | `accRateOps` | 本币汇率折算方式 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_whole_restart` | `bln_whole_restart` | `blnWholeReset` | 是否完全重启 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (55个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `org_be_fair_value_cost` | `org_be_fair_value_cost` | `orgBeFairValueCost` | 组织币处置前公允价值成本 |
| `org_disposal_fair_value_cost` | `org_disposal_fair_value_cost` | `orgDisposalFairValueCost` | 组织币处置公允价值成本 |
| `acc_be_fair_value_cost` | `acc_be_fair_value_cost` | `accBeFairValueCost` | 本币处置前公允价值成本 |
| `acc_disposal_fair_value_cost` | `acc_disposal_fair_value_cost` | `accDisposalFairValueCost` | 本币处置公允价值成本 |
| `org_be_fair_value` | `org_be_fair_value` | `orgBeFairValue` | 组织币处置前公允价值 |
| `org_disposal_fair_value` | `org_disposal_fair_value` | `orgDisposalFairValue` | 组织币处置公允价值 |
| `org_be_year_fair_value_change` | `org_be_year_fair_value_change` | `orgBeYearFairValueChange` | 组织币处置前本年公允价值变动 |
| `org_year_fair_value_change` | `org_year_fair_value_change` | `orgYearFairValueChange` | 组织币处置本年公允价值变动 |
| `org_be_accum_fair_value_change` | `org_be_accum_fair_value_change` | `orgBeAccumFairValueChange` | 组织币处置前累计公允价值变动 |
| `org_accum_fair_value_change` | `org_accum_fair_value_change` | `orgAccumFairValueChange` | 组织币处置累计公允价值变动 |
| `org_be_year_fair_value_gainloss` | `org_be_year_fair_value_gainloss` | `orgBeYearFairValueGainloss` | 组织币处置前本年公允价值变动损益 |
| `org_year_fair_value_gainloss` | `org_year_fair_value_gainloss` | `orgYearFairValueGainloss` | 组织币处置本年公允价值变动损益 |
| `org_be_accum_fair_value_gainloss` | `org_be_accum_fair_value_gainloss` | `orgBeAccumFairValueGainloss` | 组织币处置前累计公允价值变动损益 |
| `org_accum_fair_value_gainloss` | `org_accum_fair_value_gainloss` | `orgAccumFairValueGainloss` | 组织币处置累计公允价值变动损益 |
| `org_be_comprehensive_income` | `org_be_comprehensive_income` | `orgBeComprehensiveIncome` | 组织币处置前其他综合收益 |
| `org_comprehensive_income` | `org_comprehensive_income` | `orgComprehensiveIncome` | 组织币处置其他综合收益 |
| `be_fair_value` | `be_fair_value` | `beFairValue` | 本币处置前公允价值 |
| `disposal_fair_value` | `disposal_fair_value` | `disposalFairValue` | 本币处置公允价值 |
| `be_year_fair_value_change` | `be_year_fair_value_change` | `beYearFairValueChange` | 本币处置前本年公允价值变动 |
| `year_fair_value_change` | `year_fair_value_change` | `yearFairValueChange` | 本币处置本年公允价值变动 |
| `be_accum_fair_value_change` | `be_accum_fair_value_change` | `beAccumFairValueChange` | 本币处置前累计公允价值变动 |
| `accum_fair_value_change` | `accum_fair_value_change` | `accumFairValueChange` | 本币处置累计公允价值变动 |
| `be_year_fair_value_gainloss` | `be_year_fair_value_gainloss` | `beYearFairValueGainloss` | 本币处置前本年公允价值变动损益 |
| `year_fair_value_gainloss` | `year_fair_value_gainloss` | `yearFairValueGainloss` | 本币处置本年公允价值变动损益 |
| `be_accum_fair_value_gainloss` | `be_accum_fair_value_gainloss` | `beAccumFairValueGainloss` | 本币处置前累计公允价值变动损益 |
| `accum_fair_value_gainloss` | `accum_fair_value_gainloss` | `accumFairValueGainloss` | 本币处置累计公允价值变动损益 |
| `be_comprehensive_income` | `be_comprehensive_income` | `beComprehensiveIncome` | 本币处置前其他综合收益 |
| `comprehensive_income` | `comprehensive_income` | `comprehensiveIncome` | 本币处置其他综合收益 |
| `acc_adjust_depr_amount` | `acc_adjust_depr_amount` | `accAdjustDeprAmount` | 本币重启影响折旧额 |
| `acc_rate` | `acc_rate` | `accRate` | 本币汇率 |
| `clean_cost_amount` | `clean_cost_amount` | `cleanCostAmount` | 本币清理费用 |
| `clean_income_amount` | `clean_income_amount` | `cleanIncomeAmount` | 本币清理收入(不含税) |
| `clean_income_tax_amount` | `clean_income_tax_amount` | `cleanIncomeTaxAmount` | 本币清理收入 |
| `disposal_adjust_depr_amount` | `disposal_adjust_depr_amount` | `disposalAdjustDeprAmount` | 本币处置影响折旧额 |
| `disposal_amount` | `disposal_amount` | `disposalAmount` | 处置数量 |
| `disposal_accum_depr` | `disposal_accum_depr` | `disposalDepreciation` | 本币处置累计折旧 |
| `disposal_impairment_amount` | `disposal_impairment_amount` | `disposalImpairmentAmount` | 本币处置累计减值 |
| `disposal_net_amount` | `disposal_net_amount` | `disposalNetAmount` | 本币处置账面价值 |
| `disposal_net_value` | `disposal_net_value` | `disposalNetValue` | 本币处置账面净值 |
| `disposal_ori_value` | `disposal_ori_value` | `disposalOriValue` | 本币处置原值 |
| `gain_loss_amount` | `gain_loss_amount` | `gainLossAmount` | 本币处置损益额 |
| `input_tax_amount` | `input_tax_amount` | `inputValueAddedTax` | 本币进项税  |
| `org_adjust_depr_amount` | `org_adjust_depr_amount` | `orgAdjustDeprAmount` | 组织币重启影响折旧额 |
| `org_clean_cost_amount` | `org_clean_cost_amount` | `orgCleanCostAmount` | 组织币清理费用 |
| `org_clean_income_amount` | `org_clean_income_amount` | `orgCleanIncomeAmount` | 组织币清理收入(不含税) |
| `org_clean_income_tax_amount` | `org_clean_income_tax_amount` | `orgCleanIncomeTaxAmount` | 组织币清理收入 |
| `org_disposal_accum_depr_amount` | `org_disposal_accum_depr_amount` | `orgDisposalAccumDeprAmount` | 组织币处置累计折旧 |
| `org_disposal_adjust_depr_amount` | `org_disposal_adjust_depr_amount` | `orgDisposalAdjustDeprAmount` | 组织币处置影响折旧额 |
| `org_disposal_impairment_amount` | `org_disposal_impairment_amount` | `orgDisposalImpairmentAmount` | 组织币处置累计减值 |
| `org_disposal_net_amount` | `org_disposal_net_amount` | `orgDisposalNetAmount` | 组织币处置账面价值 |
| `org_disposal_net_value` | `org_disposal_net_value` | `orgDisposalNetValue` | 组织币处置账面净值 |
| `org_disposal_ori_value_amount` | `org_disposal_ori_value_amount` | `orgDisposalOriValueAmount` | 组织币处置原值 |
| `org_gain_loss_amount` | `org_gain_loss_amount` | `orgGainLossAmount` | 组织币损益额 |
| `org_tax_amount` | `org_tax_amount` | `orgTaxAmount` | 组织币清理增值税 |
| `output_tax_amount` | `output_tax_amount` | `outputValueAddedTax` | 本币清理增值税 |
