---
tags: [BIP, 元数据, 数据字典, fa.fadepr.DeprAssignDtl]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 资产折旧清单明细 (`fa.fadepr.DeprAssignDtl`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_depr_record_asgmt` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`67f3c379-b5c2-4df7-a484-850f913f4c6b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 资产折旧清单明细 |
| 物理表 | `fa_depr_record_asgmt` |
| 数据库 schema | `yonbip-fi-efa` |
| 所属应用 | `EFA` |
| 直连字段 | 78 个 |
| 子表 | 0 个 |
| 关联引用 | 29 个 |

## 关联引用 (29个)

| 字段名 | 引用类型 |
|--------|---------|
| `activity` | `` |
| `accbook_property_id` | `fiepub.epub_accountbookpropertyref` |
| `accpurpose_id` | `finbd.bd_accpurposeref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `wbs` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref` |
| `grp_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `depr_record_id` | `` |
| `asset_id` | `yonbip-fi-efa.fa_assetsquery_basic_ref` |
| `usage_dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `usage_cost_center_id` | `finbd.bd_costcenterref` |
| `org_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `period_id` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `product_id` | `productcenter.pc_nomalproductref` |
| `mgt_cost_center_id` | `finbd.bd_costcenterref` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `asset_category_id` | `yonbip-fi-efa.fa_categorymainref` |
| `accounting_classifi` | `fiepub.fiepub_accountbooktypelistref` |
| `asset_calc_id` | `` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `usage_profit_center_id` | `finbd.bd_allaccbodyref_inner` |
| `mgt_dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `usage_state_id` | `yonbip-fi-efa.fa_usagestateref` |
| `gbl_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `mgt_profit_center_id` | `finbd.bd_allaccbodyref_inner` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |
| `accbook_currtype_id` | `ucfbasedoc.bd_currencytenantref` |

## 继承接口 (4个, 8字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 78 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年编码 |
| `asgmt_gather_sign` | `asgmt_gather_sign` | `asgmtGatherSign` | 分配汇总标识 |
| `asset_code` | `asset_code` | `assetCode` | 固定资产卡片编码 |
| `gbl_year_depr_amount` | `gbl_year_depr_amount` | `gblYearDeprAmount` | 全局币本年折旧 |
| `grp_year_depr_amount` | `grp_year_depr_amount` | `grpYearDeprAmount` | 集团币本年折旧 |
| `id` | `id` | `id` | 主键 |
| `period_code` | `period_code` | `period` | 会计期间编码 |
| `voucher_make_sign` | `voucher_make_sign` | `voucherMakeSign` | 凭证制单标识 |

### 引用字段 (28个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_id` | `accbook_id` | `accbook` | 账簿 |
| `accbook_currtype_id` | `accbook_currtype_id` | `accbookCurrtypeId` | 本币币种 |
| `accbook_property_id` | `accbook_property_id` | `accbookProperty` | 账簿属性 |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `accpurpose_id` | `accpurpose_id` | `accpurpose` | 核算目的列表(系统) |
| `activity` | `activity` | `activity` | 活动 |
| `asset_id` | `asset_id` | `assetId` | 固定资产 |
| `asset_category_id` | `asset_category_id` | `assetsCategoryVO` | 固定资产类别(租户) |
| `accounting_classifi` | `accounting_classifi` | `booktype` | 账簿类型(系统) |
| `asset_calc_id` | `asset_calc_id` | `calculateId` | 核算信息(租户) |
| `creator` | `creator` | `creator` | 创建人 |
| `gbl_currtype_id` | `gbl_currtype_id` | `gblCurrtypeId` | 全局币币种 |
| `grp_currtype_id` | `grp_currtype_id` | `grpCurrtypeId` | 集团币币种 |
| `mgt_dept_id` | `mgt_dept_id` | `mgmtDeptId` | 固定资产管理部门 |
| `mgt_cost_center_id` | `mgt_cost_center_id` | `mgtCostCenter` | 管理成本中心 |
| `mgt_profit_center_id` | `mgt_profit_center_id` | `mgtProfitCenter` | 管理利润中心 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `usage_cost_center_id` | `usage_cost_center_id` | `operCostCenterId` | 使用成本中心 |
| `usage_dept_id` | `usage_dept_id` | `operDeptId` | 固定资产使用部门 |
| `usage_profit_center_id` | `usage_profit_center_id` | `operProfitCenterId` | 使用利润中心 |
| `org_currtype_id` | `org_currtype_id` | `orgCurrtypeId` | 组织币种 |
| `period_id` | `period_id` | `periodId` | 会计期间 |
| `product_id` | `product_id` | `productId` | 产品 |
| `project_id` | `project_id` | `projectId` | 项目 |
| `depr_record_id` | `depr_record_id` | `recordId` | 清单 |
| `usage_state_id` | `usage_state_id` | `usagestate` | 固定资产使用状态(系统) |
| `wbs` | `wbs` | `wbs` | WBS |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accrued_period` | `accrued_period` | `accrued_period` | 已计提期数 |
| `life_month` | `life_month` | `lifeMonth` | 使用月数 |
| `life_year` | `life_year` | `lifeYear` | 使用年数 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_year_id` | `acc_year_id` | `accYearId` | 会计年ID |

### 数值字段 (33个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_addition_depr_amount` | `acc_addition_depr_amount` | `accAdditionDeprAmount` | 本币附加折旧金额 |
| `acc_adjust_depr_amount` | `acc_adjust_depr_amount` | `accAdjustDeprAmount` | 本币调整折旧金额 |
| `acc_depr_calendar_depr_amount` | `acc_depr_calendar_depr_amount` | `accDeprCalendarSysDeprAmount` | 本币折旧日历系统折旧 |
| `acc_init_depr_amount` | `acc_init_depr_amount` | `accInitDeprAmount` | 本币初始折旧金额 |
| `acc_unplan_depr_amount` | `acc_unplan_depr_amount` | `accOutPlanDeprAmount` | 本币计划外折旧金额 |
| `acc_value_amount` | `acc_value_amount` | `accValueAmount` | 计提原值 |
| `accum_imp_amount` | `accum_imp_amount` | `accumImpAmount` | 累计减值 |
| `accum_depr_amount` | `accum_depr_amount` | `deprAmount` | 本币累计折旧 |
| `gbl_accum_depr_amount` | `gbl_accum_depr_amount` | `gblAccumDeprAmount` | 全局币累计折旧 |
| `gbl_accum_imp_amount` | `gbl_accum_imp_amount` | `gblAccumImpAmount` | 全局币累计减值 |
| `gbl_adjust_depr_amount` | `gbl_adjust_depr_amount` | `gblAdjustDeprAmount` | 全局币调整折旧金额 |
| `gbl_net_value` | `gbl_net_value` | `gblNetValue` | 全局币账面净值 |
| `gbl_period_depr_amount` | `gbl_period_depr_amount` | `gblPeriodDeprAmount` | 全局币本期折旧 |
| `gbl_value_amount` | `gbl_value_amount` | `gblValueAmount` | 全局币计提原值 |
| `grp_accum_depr_amount` | `grp_accum_depr_amount` | `grpAccumDeprAmount` | 集团币累计折旧 |
| `grp_accum_imp_amount` | `grp_accum_imp_amount` | `grpAccumImpAmount` | 集团币累计减值 |
| `grp_adjust_depr_amount` | `grp_adjust_depr_amount` | `grpAdjustDeprAmount` | 集团币调整折旧金额 |
| `grp_net_value` | `grp_net_value` | `grpNetValue` | 集团币账面净值 |
| `grp_period_depr_amount` | `grp_period_depr_amount` | `grpPeriodDeprAmount` | 集团币本期折旧 |
| `grp_value_amount` | `grp_value_amount` | `grpValueAmount` | 集团币计提原值 |
| `acc_curr_period_depr_amount` | `acc_curr_period_depr_amount` | `monthDeprAmount` | 本币本期折旧金额 |
| `org_accum_depr_amount` | `org_accum_depr_amount` | `orgAccumDeprAmount` | 组织币累计折旧 |
| `org_accum_imp_amount` | `org_accum_imp_amount` | `orgAccumImpAmount` | 组织币累计减值 |
| `org_adjust_depr_amount` | `org_adjust_depr_amount` | `orgAdjustDeprAmount` | 组织币调整折旧金额 |
| `org_net_value` | `org_net_value` | `orgNetValue` | 组织币账面净值 |
| `org_period_depr_amount` | `org_period_depr_amount` | `orgPeriodDeprAmount` | 组织币本期折旧 |
| `org_value_amount` | `org_value_amount` | `orgValueAmount` | 组织币计提原值 |
| `org_year_depr_amount` | `org_year_depr_amount` | `orgYearDeprAmount` | 组织币本年折旧 |
| `asgmt_ratio` | `asgmt_ratio` | `proportion` | 分摊比例 |
| `scrap_value` | `scrap_value` | `scrapValue` | 净残值 |
| `scrap_value_rate` | `scrap_value_rate` | `scrapValueRate` | 净残值率 |
| `total_period_depr_amount` | `total_period_depr_amount` | `totalTotalDeprAmount` | 本币本期折旧总额 |
| `year_accum_depr_amount` | `year_accum_depr_amount` | `yearDeprAmount` | 本币本年累计折旧 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义项 |
