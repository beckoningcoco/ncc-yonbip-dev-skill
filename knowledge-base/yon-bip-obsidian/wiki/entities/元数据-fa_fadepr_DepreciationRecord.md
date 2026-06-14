---
tags: [BIP, 元数据, 数据字典, fa.fadepr.DepreciationRecord]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 折旧清单 (`fa.fadepr.DepreciationRecord`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_depr_record_calc` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`67f3c379-b5c2-4df7-a484-850f913f4c6b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 折旧清单 |
| 物理表 | `fa_depr_record_calc` |
| domain/服务域 | `yonbip-fi-efa` |
| schema | `fiefa` |
| 所属应用 | `EFA` |
| 直连字段 | 88 个 |
| 子表 | 1 个 |
| 关联引用 | 25 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodies` | `fa.fadepr.DeprAssignDtl` | composition |

## 关联引用 (25个)

| 字段名 | 引用类型 |
|--------|---------|
| `accpurpose_id` | `finbd.bd_accpurposeref` |
| `activity` | `` |
| `` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `wbs` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref_inner` |
| `grp_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `category_id` | `yonbip-fi-efa.fa_categorymainref` |
| `asset_id` | `yonbip-fi-efa.fa_assetsquery_basic_ref` |
| `depr_method_id` | `yonbip-fi-efa.fa_depreciation_methodlistref` |
| `usage_dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `org_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `period_id` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `asset_calc_id` | `` |
| `ytenant_id` | `` |
| `mgt_profit_center_id` | `finbd.bd_allaccbodyref_inner` |
| `mgt_dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `usage_state_id` | `yonbip-fi-efa.fa_usagestateref` |
| `gbl_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `asset_category_id` | `yonbip-fi-efa.fa_categorymainref` |
| `mgt_cost_center_id` | `finbd.bd_costcenterref` |
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

> 共 88 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年编码 |
| `asset_code` | `asset_code` | `code` | 固定资产编码 |
| `depr_error_msg` | `depr_error_msg` | `deprErrorMsg` | 折旧运行报错信息 |
| `id` | `id` | `id` | 主键 |
| `period_code` | `period_code` | `period` | 会计期间编码 |

### 引用字段 (24个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_id` | `accbook_id` | `accbook` | 账簿 |
| `accbook_currtype_id` | `accbook_currtype_id` | `accbookCurrtypeId` | 本币币种 |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `accpurpose_id` | `accpurpose_id` | `accpurposeId` | 核算目的 |
| `activity` | `activity` | `activity` | 活动 |
| `asset_category_id` | `asset_category_id` | `assetCategoryId` | 固定资产类别 |
| `asset_id` | `asset_id` | `assetId` | 固定资产id |
| `asset_calc_id` | `asset_calc_id` | `calculateId` | 核算信息id |
| `category_id` | `category_id` | `categoryParentId` | 资产类别一级节点 |
| `creator` | `creator` | `creator` | 创建人 |
| `depr_method_id` | `depr_method_id` | `deprMethodId` | 折旧方法 |
| `gbl_currtype_id` | `gbl_currtype_id` | `gblCurrtypeId` | 全局币币种 |
| `grp_currtype_id` | `grp_currtype_id` | `grpCurrtypeId` | 集团币币种 |
| `mgt_cost_center_id` | `mgt_cost_center_id` | `mgmtCostCenterId` | 管理成本中心 |
| `mgt_dept_id` | `mgt_dept_id` | `mgmtDeptId` | 固定资产管理部门 |
| `mgt_profit_center_id` | `mgt_profit_center_id` | `mgmtProfitCenterId` | 管理利润中心 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `usage_dept_id` | `usage_dept_id` | `operDeptId` | 固定资产使用部门 |
| `org_currtype_id` | `org_currtype_id` | `orgCurrtypeId` | 组织币种 |
| `period_id` | `period_id` | `periodId` | 会计期间 |
| `project_id` | `project_id` | `projectId` | 项目 |
| `usage_state_id` | `usage_state_id` | `usageStateId` | 固定资产使用状态 |
| `wbs` | `wbs` | `wbs` | WBS |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_lease` | `bln_lease` | `blnLease` | 使用权资产 |
| `bln_modified` | `bln_modified` | `blnModified` | 是否修改标识 |
| `bln_depr_status` | `bln_depr_status` | `deprStatus` | 折旧运行状态 |
| `bln_inherited` | `bln_inherited` | `isInherited` | 是否继承上月折旧金额 |
| `bln_update` | `bln_update` | `isUpdate` | 是否修改折旧清单 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_year_id` | `acc_year_id` | `accYearId` | 会计年ID |

### 数值字段 (48个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_addition_depr_amount` | `acc_addition_depr_amount` | `accAdditionDeprAmount` | 本币附加折旧金额 |
| `acc_adjust_depr_amount` | `acc_adjust_depr_amount` | `accAdjustDeprAmount` | 本币调整折旧金额 |
| `acc_curr_period_depr_amount` | `acc_curr_period_depr_amount` | `accCurPeriodDeprAmount` | 本币本期折旧金额 |
| `acc_depr_calendar_depr_amount` | `acc_depr_calendar_depr_amount` | `accDeprCalendarSysDeprAmount` | 本币折旧日历系统折旧 |
| `acc_unplan_depr_amount` | `acc_unplan_depr_amount` | `accOutPlanDeprAmount` | 本币计划外折旧金额 |
| `acc_value_amount` | `acc_value_amount` | `accruedOriValue` | 本币计提原值 |
| `accum_disposal_period_amount` | `accum_disposal_period_amount` | `accumDisposalPeriodAmount` | 处置影响折旧额 |
| `accum_imp_amount` | `accum_imp_amount` | `accumImpAmount` | 本币累计减值 |
| `accum_depr_amount` | `accum_depr_amount` | `deprAmount` | 本币累计折旧 |
| `gbl_value_amount` | `gbl_value_amount` | `gblAccrualOriValueAmount` | 全局币计提原值 |
| `gbl_accum_depr_amount` | `gbl_accum_depr_amount` | `gblAccumDeprAmount` | 全局币累计折旧 |
| `gbl_accum_disposal_period_amount` | `gbl_accum_disposal_period_amount` | `gblAccumDisposalPeriodAmount` | 全局币处置影响折旧额 |
| `gbl_accum_imp_amount` | `gbl_accum_imp_amount` | `gblAccumImpAmount` | 全局币累计减值 |
| `gbl_adjust_depr_amount` | `gbl_adjust_depr_amount` | `gblAdjustDeprAmount` | 全局币调整折旧金额 |
| `gbl_period_depr_amount` | `gbl_period_depr_amount` | `gblCurrPeriodDeprAmount` | 全局币本期折旧 |
| `gbl_depr_calendar_depr_amount` | `gbl_depr_calendar_depr_amount` | `gblDeprCalendarDeprAmount` | 全局币折旧日历系统折旧 |
| `gbl_net_value` | `gbl_net_value` | `gblNetValue` | 全局币账面净值 |
| `gbl_unplan_depr_amount` | `gbl_unplan_depr_amount` | `gblOutPlanDeprAmount` | 全局币计划外折旧额 |
| `gbl_total_period_depr_amount` | `gbl_total_period_depr_amount` | `gblTotalPeriodDeprAmount` | 全局币期间折旧总额 |
| `gbl_year_depr_amount` | `gbl_year_depr_amount` | `gblYearDeprAmount` | 全局币本年折旧 |
| `grp_value_amount` | `grp_value_amount` | `grpAccrualOriValueAmount` | 集团币计提原值 |
| `grp_accum_depr_amount` | `grp_accum_depr_amount` | `grpAccumDeprAmount` | 集团币累计折旧 |
| `grp_accum_disposal_period_amount` | `grp_accum_disposal_period_amount` | `grpAccumDisposalPeriodAmount` | 集团币处置影响折旧额 |
| `grp_accum_imp_amount` | `grp_accum_imp_amount` | `grpAccumImpAmount` | 集团币累计减值 |
| `grp_adjust_depr_amount` | `grp_adjust_depr_amount` | `grpAdjustDeprAmount` | 集团币调整折旧金额 |
| `grp_period_depr_amount` | `grp_period_depr_amount` | `grpCurrPeriodDeprAmount` | 集团币本期折旧 |
| `grp_depr_calendar_depr_amount` | `grp_depr_calendar_depr_amount` | `grpDeprCalendarDeprAmount` | 集团币折旧日历系统折旧 |
| `grp_net_value` | `grp_net_value` | `grpNetValue` | 集团币账面净值 |
| `grp_unplan_depr_amount` | `grp_unplan_depr_amount` | `grpOutPlanDeprAmount` | 集团币计划外折旧额 |
| `grp_total_period_depr_amount` | `grp_total_period_depr_amount` | `grpTotalPeriodDeprAmount` | 集团币期间折旧总额 |
| `grp_year_depr_amount` | `grp_year_depr_amount` | `grpYearDeprAmount` | 集团币本年折旧 |
| `acc_cur_period_depr_rate` | `acc_cur_period_depr_rate` | `monthDeprRate` | 月计提折旧率 |
| `net_value` | `net_value` | `netValue` | 本币净值 |
| `org_value_amount` | `org_value_amount` | `orgAccrualOriValueAmount` | 组织币计提原值 |
| `org_accum_depr_amount` | `org_accum_depr_amount` | `orgAccumDeprAmount` | 组织币累计折旧 |
| `org_accum_disposal_period_amount` | `org_accum_disposal_period_amount` | `orgAccumDisposalPeriodAmount` | 组织币处置影响折旧额 |
| `org_accum_imp_amount` | `org_accum_imp_amount` | `orgAccumImpAmount` | 组织币累计减值 |
| `org_adjust_depr_amount` | `org_adjust_depr_amount` | `orgAdjustDeprAmount` | 组织币调整折旧金额 |
| `org_period_depr_amount` | `org_period_depr_amount` | `orgCurrPeriodDeprAmount` | 组织币本期折旧 |
| `org_depr_calendar_depr_amount` | `org_depr_calendar_depr_amount` | `orgDeprCalendarDeprAmount` | 组织币折旧日历系统折旧 |
| `org_net_value` | `org_net_value` | `orgNetValue` | 组织币账面净值 |
| `org_unplan_depr_amount` | `org_unplan_depr_amount` | `orgOutPlanDeprAmount` | 组织币计划外折旧额 |
| `org_total_period_depr_amount` | `org_total_period_depr_amount` | `orgTotalPeriodDeprAmount` | 组织币期间折旧总额 |
| `org_year_depr_amount` | `org_year_depr_amount` | `orgYearDeprAmount` | 组织币本年折旧 |
| `scrap_value` | `scrap_value` | `scrapValue` | 本币净残值 |
| `total_period_depr_amount` | `total_period_depr_amount` | `totalPeriodDeprAmount` | 期间折旧总额 |
| `unit_depr_amount` | `unit_depr_amount` | `unitDeprAmount` | 本币单位折旧 |
| `year_accum_depr_amount` | `year_accum_depr_amount` | `yearDeprAmount` | 本币本年累计折旧 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bodies` | 资产折旧清单明细 |
