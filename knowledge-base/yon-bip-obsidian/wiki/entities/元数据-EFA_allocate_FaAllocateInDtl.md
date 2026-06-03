---
tags: [BIP, 元数据, 数据字典, EFA.allocate.FaAllocateInDtl]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 固定资产调入单明细 (`EFA.allocate.FaAllocateInDtl`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_bill_allocate_in_dtl` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`f110b003-9df9-45e8-b3ed-621aad532394`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 固定资产调入单明细 |
| 物理表 | `fa_bill_allocate_in_dtl` |
| 数据库 schema | `yonbip-fi-efa` |
| 所属应用 | `EFA` |
| 直连字段 | 70 个 |
| 子表 | 0 个 |
| 关联引用 | 16 个 |

## 关联引用 (16个)

| 字段名 | 引用类型 |
|--------|---------|
| `org_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `allocate_settle_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `asset_calc_id` | `` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `allocate_in_id` | `` |
| `depr_convention_id` | `yonbip-fi-efa.fa_depr_conventionref` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `reduce_way_id` | `finbd.bd_reducewayref` |
| `asset_id` | `yonbip-fi-efa.fa_assetsquery_basic_ref` |
| `disposal_convention_id` | `yonbip-fi-efa.fa_depr_conventionref` |
| `tax_item_id` | `yonbip-fi-taxpubdoc.RefTable_55c5b82f11` |
| `accbook_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `out_accentity_id` | `finbd.bd_allaccbodyref` |

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

> 共 70 个直连字段

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

### 引用字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `out_accentity_id` | `out_accentity_id` | `outAccentityId` | 调出会计主体 |
| `allocate_in_id` | `allocate_in_id` | `AllocateInId` | 固定资产调入单 |
| `accbook_currtype_id` | `accbook_currtype_id` | `accbookCurrtypeId` | 本币币种 |
| `accbook_id` | `accbook_id` | `accbookId` | 账簿ID |
| `allocate_settle_currtype_id` | `allocate_settle_currtype_id` | `allocateSettleCurrtypeId` | 调拨结算币种ID |
| `asset_calc_id` | `asset_calc_id` | `assetCalcId` | 卡片核算id |
| `asset_id` | `asset_id` | `assetId` | 固定资产卡片(系统) |
| `depr_convention_id` | `depr_convention_id` | `deprConventionId` | 折旧惯例 |
| `disposal_convention_id` | `disposal_convention_id` | `disposalConventionId` | 处置惯例 |
| `org_currtype_id` | `org_currtype_id` | `orgCurrtypeId` | 组织币币种ID |
| `reduce_way_id` | `reduce_way_id` | `reduceWayId` | 减少方式ID |
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

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_first_accbook` | `bln_first_accbook` | `blnFirstAccbook` | 是否第一个账簿 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accrued_period` | `accrued_period` | `accruedPeriod` | 已计提期数 |
| `life_month` | `life_month` | `lifeMonth` | 使用月限 |
| `life_year` | `life_year` | `lifeYear` | 使用年限 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (30个)

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
| `acc_allocate_pay` | `acc_allocate_pay` | `accAllocatePay` | 本币调入支出 |
| `acc_currtype_ori_amount` | `acc_currtype_ori_amount` | `accCurrtypeOriAmount` | 本币原值 |
| `acc_net_amount` | `acc_net_amount` | `accNetAmount` | 本币账面价值 |
| `acc_net_value` | `acc_net_value` | `accNetValue` | 本币账面净值 |
| `org_accum_depr_amount` | `org_accum_depr_amount` | `orgAccumDeprAmount` | 组织币累计折旧 |
| `org_accum_imp_amount` | `org_accum_imp_amount` | `orgAccumImpAmount` | 组织币累计减值 |
| `org_net_amount` | `org_net_amount` | `orgNetAmount` | 组织币账面价值 |
| `org_net_value` | `org_net_value` | `orgNetValue` | 组织币账面净值 |
| `org_ori_value_amount` | `org_ori_value_amount` | `orgOriValueAmount` | 组织币原值 |
| `settle_allocate_amount` | `settle_allocate_amount` | `settleAllocateAmount` | 结算币调拨金额 |
| `settle_tax_amount` | `settle_tax_amount` | `settleTaxAmount` | 结算币税额 |
| `tax_rate` | `tax_rate` | `taxRate` | 税率 |
| `acc_tax_amount` | `acc_tax_amount` | `accTaxAmount` | 本币税额 |
| `org_tax_amount` | `org_tax_amount` | `orgTaxAmount` | 组织币税额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 定义特征ID |
