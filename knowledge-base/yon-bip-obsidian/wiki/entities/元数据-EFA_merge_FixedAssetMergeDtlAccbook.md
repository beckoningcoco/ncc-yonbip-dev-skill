---
tags: [BIP, 元数据, 数据字典, EFA.merge.FixedAssetMergeDtlAccbook]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 固定资产合并账簿明细表 (`EFA.merge.FixedAssetMergeDtlAccbook`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_bill_merge_dtl_accbook` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`afefa915-7e8e-4281-b822-4de51cd16ddc`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 固定资产合并账簿明细表 |
| 物理表 | `fa_bill_merge_dtl_accbook` |
| domain/服务域 | `yonbip-fi-efa` |
| schema | `fiefa` |
| 所属应用 | `EFA` |
| 直连字段 | 66 个 |
| 子表 | 0 个 |
| 关联引用 | 11 个 |

## 关联引用 (11个)

| 字段名 | 引用类型 |
|--------|---------|
| `org_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `merge_id` | `` |
| `asset_id` | `yonbip-fi-efa.fa_assetsquery_basic_ref` |
| `accbook` | `fiepub.fiepub_accountbookref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `asset_category_id` | `efa.fa_accbookassetclassref` |
| `disposal_convention_id` | `yonbip-fi-efa.fa_depr_conventionref` |
| `ytenant_id` | `` |
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

> 共 66 个直连字段

### 文本字段 (16个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_start_date` | `accbook_start_date` | `accbookStartDate` | 启用日期 |
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

### 引用字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook` | `accbook` | `accbook` | 账簿 |
| `accbook_currtype_id` | `accbook_currtype_id` | `accbookCurrtypeId` | 本币币种 |
| `asset_category_id` | `asset_category_id` | `assetCategoryId` | 固定资产类别 |
| `asset_id` | `asset_id` | `assetId` | 固定资产卡片 |
| `depr_convention_id` | `depr_convention_id` | `deprConventionId` | 折旧惯例 |
| `disposal_convention_id` | `disposal_convention_id` | `disposalConventionId` | 处置惯例 |
| `merge_id` | `merge_id` | `mergeId` | 合并单id |
| `org_currtype_id` | `org_currtype_id` | `orgCurrtypeId` | 组织币币种 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_belong_to_add` | `bln_belong_to_add` | `blnBelongToAdd` | 是否属于新增 |
| `bln_belong_to_before_card` | `bln_belong_to_before_card` | `blnBelongToBeforeCard` | 折旧是否归属合并前卡片 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `quantity` | `quantity` | `quantity` | 数量 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (32个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
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
| `acc_accum_depr_amount` | `acc_accum_depr_amount` | `accAccumDeprAmount` | 本币累计折旧 |
| `acc_cur_period_depr_amount` | `acc_cur_period_depr_amount` | `accCurPeriodDeprAmount` | 本币本期计提折旧额 |
| `acc_ori_value_amount` | `acc_ori_value_amount` | `accCurrtypeOriAmount` | 本币原值 |
| `acc_accum_imp_amount` | `acc_accum_imp_amount` | `accumImpAmountass` | 本币减值准备 |
| `acc_cur_year_imp_amount` | `acc_cur_year_imp_amount` | `curYearImpAmount` | 本币本年减值 |
| `acc_net_amount` | `acc_net_amount` | `netAmount` | 本币账面价值 |
| `acc_net_value` | `acc_net_value` | `netValue` | 本币账面净值 |
| `org_accum_depr_amount` | `org_accum_depr_amount` | `orgAccumDeprAmount` | 组织币累计折旧 |
| `org_accum_imp_amount` | `org_accum_imp_amount` | `orgAccumImpAmount` | 组织币累计减值 |
| `org_cur_year_imp_amount` | `org_cur_year_imp_amount` | `orgCurYearImpAmount` | 组织币本年减值 |
| `org_net_amount` | `org_net_amount` | `orgNetAmount` | 组织币账面价值 |
| `org_net_value` | `org_net_value` | `orgNetValue` | 组织币账面净值 |
| `org_ori_value_amount` | `org_ori_value_amount` | `orgOriValueAmount` | 组织币原值 |
| `org_period_depr_amount` | `org_period_depr_amount` | `orgPeriodDeprAmount` | 组织币本期计提折旧 |
| `org_scrap_value_amount` | `org_scrap_value_amount` | `orgScrapValueAmount` | 组织币净残值 |
| `org_year_depr_amount` | `org_year_depr_amount` | `orgYearDeprAmount` | 组织币本年折旧 |
| `acc_scrap_value_amount` | `acc_scrap_value_amount` | `scrapValueAmount` | 本币净残值 |
| `acc_year_depr_amount` | `acc_year_depr_amount` | `yearDeprAmount` | 本币本年累计折旧 |
| `acc_fair_value_cost` | `acc_fair_value_cost` | `accFairValueCost` | 本币公允价值成本 |
| `org_fair_value_cost` | `org_fair_value_cost` | `orgFairValueCost` | 组织币公允价值成本 |
