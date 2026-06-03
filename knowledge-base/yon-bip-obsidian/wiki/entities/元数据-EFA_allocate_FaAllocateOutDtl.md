---
tags: [BIP, 元数据, 数据字典, EFA.allocate.FaAllocateOutDtl]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 固定资产调出单明细 (`EFA.allocate.FaAllocateOutDtl`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_bill_allocate_out_dtl` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`9fb75ddf-28be-4d5e-9a69-41d0d73b70f5`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 固定资产调出单明细 |
| 物理表 | `fa_bill_allocate_out_dtl` |
| 数据库 schema | `yonbip-fi-efa` |
| 所属应用 | `EFA` |
| 直连字段 | 81 个 |
| 子表 | 0 个 |
| 关联引用 | 20 个 |

## 关联引用 (20个)

| 字段名 | 引用类型 |
|--------|---------|
| `org_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `acc_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `allocate_settle_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `allocate_out_asset_id` | `` |
| `asset_calc_id` | `` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `in_accentity_id` | `finbd.bd_allaccbodyref` |
| `org_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `reduce_way_id` | `finbd.bd_reducewayref` |
| `asset_id` | `yonbip-fi-efa.fa_assetsquery_basic_ref` |
| `asset_category_id` | `` |
| `disposal_convention_id` | `yonbip-fi-efa.fa_depr_conventionref` |
| `allocate_out_id` | `` |
| `tax_item_id` | `yonbip-fi-taxpubdoc.RefTable_55c5b82f11` |
| `accbook_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `depr_convention_id` | `yonbip-fi-efa.fa_depr_conventionref` |

## 继承接口 (5个, 19字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **业务流基础** (`iuap.busiObj.BusinessFlowItf`)
  - `bizflow_id` → `bizflow_id`
  - `bizflowinstance_id` → `bizflowinstance_id`
  - `bizflow_makebillcode` → `bizflow_makebillcode`
  - `bizflowname` → `bizflowname`
  - `sourcebusiobj` → `sourcebusiobj`
  - `sourcechild_id` → `sourcechild_id`
  - `sourcecode` → `sourcecode`
  - `source_id` → `source_id`
- **业务流多来源** (`iuap.busiObj.BusinessFlowSourcesItf`)
  - `firstbusiobj` → `firstbusiobj`
  - `firstchild_id` → `firstchild_id`
  - `firstcode` → `firstcode`
  - `first_id` → `first_id`
  - `sourcegrand_id` → `sourcegrand_id`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 81 个直连字段

### 文本字段 (16个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `begin_date` | `begin_date` | `beginDate` | 固定资产开始使用日期 |
| `create_asset_date` | `create_asset_date` | `createAssetDate` | 建卡日期 |
| `id` | `id` | `id` | 主键 |
| `bizflowinstance_id` | `bizflowinstance_id` | `bizFlowInstanceId` | 业务流实例id |
| `bizflow_makebillcode` | `bizflow_makebillcode` | `bizFlowMakeBillCode` | 单据转换规则编码 |
| `bizflow_id` | `bizflow_id` | `bizflowId` | 业务流id |
| `bizflowname` | `bizflowname` | `bizflowName` | 流程名称 |
| `sourcebusiobj` | `sourcebusiobj` | `sourceBusiObj` | 上游业务对象 |
| `sourcechild_id` | `sourcechild_id` | `sourceChildId` | 上游单据子表id |
| `sourcecode` | `sourcecode` | `sourceCode` | 上游单据号 |
| `source_id` | `source_id` | `sourceId` | 上游单据主表id |
| `firstbusiobj` | `firstbusiobj` | `firstBusiObj` | 来源业务对象 |
| `firstchild_id` | `firstchild_id` | `firstChildId` | 来源单据子表id |
| `firstcode` | `firstcode` | `firstCode` | 来源单据号 |
| `first_id` | `first_id` | `firstId` | 来源单据主表id |
| `sourcegrand_id` | `sourcegrand_id` | `sourceGrandId` | 来源孙表id |

### 引用字段 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `in_accentity_id` | `in_accentity_id` | `inAccentityId` | 调入会计主体 |
| `acc_rate_type_id` | `acc_rate_type_id` | `accRateTypeId` | 本币汇率类型 |
| `accbook_currtype_id` | `accbook_currtype_id` | `accbookCurrtypeId` | 本币币种 |
| `accbook_id` | `accbook_id` | `accbookId` | 账簿ID |
| `allocate_out_asset_id` | `allocate_out_asset_id` | `allocateOutAssetId` | 固定资产调出单详情id |
| `allocate_out_id` | `allocate_out_id` | `allocateOutId` | 固定资产调出 |
| `allocate_settle_currtype_id` | `allocate_settle_currtype_id` | `allocateSettleCurrtypeId` | 调拨结算币种ID |
| `asset_calc_id` | `asset_calc_id` | `assetCalcId` | 卡片核算id |
| `asset_category_id` | `asset_category_id` | `assetCategoryId` | 固定资产类别 |
| `asset_id` | `asset_id` | `assetId` | 卡片id |
| `depr_convention_id` | `depr_convention_id` | `deprDonventionId` | 折旧惯例 |
| `disposal_convention_id` | `disposal_convention_id` | `disposalConventionId` | 处置惯例 |
| `org_currtype_id` | `org_currtype_id` | `orgCurrtypeId` | 组织币币种ID |
| `org_rate_type_id` | `org_rate_type_id` | `orgRateTypeId` | 组织币汇率类型 |
| `reduce_way_id` | `reduce_way_id` | `reduceWayId` | 减少方式(系统) |
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

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_rate_ops` | `acc_rate_ops` | `accRateOps` | 本币汇率折算方式 |
| `org_rate_ops` | `org_rate_ops` | `orgRateOps` | 组织币汇率折算方式 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accrued_period` | `accrued_period` | `accruedPeriod` | 已计提期数 |
| `life_month` | `life_month` | `lifeMonth` | 固定资产使用月限 |
| `life_year` | `life_year` | `lifeYear` | 固定资产使用年限 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (36个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `org_fair_value_cost` | `org_fair_value_cost` | `orgFairValueCost` | 组织币公允价值成本 |
| `acc_fair_value_cost` | `acc_fair_value_cost` | `accFairValueCost` | 本币公允价值成本 |
| `org_fair_value` | `org_fair_value` | `orgFairValue` | 组织币公允价值 |
| `org_year_fair_value_change` | `org_year_fair_value_change` | `orgYearFairValueChange` | 组织币本年公允价值变动 |
| `org_accum_fair_value_change` | `org_accum_fair_value_change` | `orgAccumFairValueChange` | 组织币累计公允价值变动 |
| `org_year_fair_value_gainloss` | `org_year_fair_value_gainloss` | `orgYearFairValueGainloss` | 组织币本年公允价值变动损益 |
| `org_accum_fair_value_gainloss` | `org_accum_fair_value_gainloss` | `orgAccumFairValueGainloss` | 组织币累计公允价值变动损益 |
| `org_comprehensive_income` | `org_comprehensive_income` | `orgComprehensiveIncome` | 组织币其他综合收益 |
| `acc_fair_value` | `acc_fair_value` | `accFairValue` | 本币公允价值 |
| `acc_year_fair_value_change` | `acc_year_fair_value_change` | `accYearFairValueChange` | 本币本年公允价值变动 |
| `acc_accum_fair_value_change` | `acc_accum_fair_value_change` | `accAccumFairValueChange` | 本币累计公允价值变动 |
| `acc_year_fair_value_gainloss` | `acc_year_fair_value_gainloss` | `accYearFairValueGainloss` | 本币本年公允价值变动损益 |
| `acc_accum_fair_value_gainloss` | `acc_accum_fair_value_gainloss` | `accAccumFairValueGainloss` | 本币累计公允价值变动损益 |
| `acc_comprehensive_income` | `acc_comprehensive_income` | `accComprehensiveIncome` | 本币其他综合收益 |
| `acc_accum_depr_amount` | `acc_accum_depr_amount` | `accAccumDeprAmount` | 本币累计折旧额 |
| `acc_accum_imp_amount` | `acc_accum_imp_amount` | `accAccumImpAmount` | 本币累计减值 |
| `acc_allocate_amount` | `acc_allocate_amount` | `accAllocateAmount` | 本币调拨金额 |
| `acc_tax_amount` | `acc_tax_amount` | `accTaxAmount` | 本币税额 |
| `acc_allocate_income` | `acc_allocate_income` | `accAllocateIncome` | 本币调拨收入 |
| `acc_currtype_ori_amount` | `acc_currtype_ori_amount` | `accCurrtypeOriAmount` | 本币原值 |
| `acc_net_amount` | `acc_net_amount` | `accNetAmount` | 本币账面净额 |
| `acc_net_value` | `acc_net_value` | `accNetValue` | 本币账面净值 |
| `acc_rate` | `acc_rate` | `accRate` | 本币汇率 |
| `adjustment_depreciation` | `adjustment_depreciation` | `adjustmentDepreciation` | 本币调整折旧 |
| `org_accum_depr_amount` | `org_accum_depr_amount` | `orgAccumDeprAmount` | 组织币累计折旧 |
| `org_accum_imp_amount` | `org_accum_imp_amount` | `orgAccumImpAmount` | 组织币累计减值 |
| `org_adjustment_depreciation` | `org_adjustment_depreciation` | `orgAdjustmentDepreciation` | 组织币调整折旧 |
| `org_allocate_amount` | `org_allocate_amount` | `orgAllocateAmount` | 组织币调拨金额 |
| `org_tax_amount` | `org_tax_amount` | `orgTaxAmount` | 组织币税额 |
| `org_net_value` | `org_net_value` | `orgNetValue` | 组织币账面净值 |
| `org_ori_value_amount` | `org_ori_value_amount` | `orgOriValueAmount` | 组织币原值 |
| `org_rate` | `org_rate` | `orgRate` | 组织币汇率 |
| `org_net_amount` | `org_net_amount` | `orgNetAmount` | 组织币账面价值 |
| `settle_allocate_amount` | `settle_allocate_amount` | `settleAllocateAmount` | 结算币调拨金额 |
| `settle_tax_amount` | `settle_tax_amount` | `settleTaxAmount` | 结算币税额 |
| `tax_rate` | `tax_rate` | `taxRate` | 税率 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义特征 |
