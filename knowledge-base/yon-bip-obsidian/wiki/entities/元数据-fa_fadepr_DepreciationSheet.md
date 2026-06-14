---
tags: [BIP, 元数据, 数据字典, fa.fadepr.DepreciationSheet]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 折旧分配表 (`fa.fadepr.DepreciationSheet`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_depr_record_asgmt_gather` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`556f6ad6-0a29-47f7-92e4-4952f717cbf6`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 折旧分配表 |
| 物理表 | `fa_depr_record_asgmt_gather` |
| domain/服务域 | `yonbip-fi-efa` |
| schema | `fiefa` |
| 所属应用 | `EFA` |
| 直连字段 | 58 个 |
| 子表 | 0 个 |
| 关联引用 | 26 个 |

## 关联引用 (26个)

| 字段名 | 引用类型 |
|--------|---------|
| `activity` | `` |
| `accpurpose_id` | `finbd.bd_accpurposeref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `wbs` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref` |
| `grp_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `asset_id` | `yonbip-fi-efa.fa_assetsquery_basic_ref` |
| `usage_dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `usage_cost_center_id` | `finbd.bd_costcenterref` |
| `org_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `period_id` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `product_id` | `productcenter.pc_nomalproductref` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `asset_calc_id` | `` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `mgt_profit_center_id` | `finbd.bd_allaccbodyref_inner` |
| `usage_profit_center_id` | `finbd.bd_allaccbodyref_inner` |
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

> 共 58 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年编码 |
| `id` | `id` | `id` | 主键 |
| `period_code` | `period_code` | `period` | 会计期间编码 |

### 引用字段 (25个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_id` | `accbook_id` | `accbook` | 账簿 |
| `accbook_currtype_id` | `accbook_currtype_id` | `accbookCurrtypeId` | 本币币种 |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `accpurpose_id` | `accpurpose_id` | `accpurpose` | 核算目的列表(系统) |
| `activity` | `activity` | `activity` | 活动 |
| `asset_category_id` | `asset_category_id` | `assetCategoryId` | 固定资产类别 |
| `asset_id` | `asset_id` | `assetId` | 固定资产 |
| `asset_calc_id` | `asset_calc_id` | `calculateId` | 核算信息 |
| `creator` | `creator` | `creator` | 创建人 |
| `gbl_currtype_id` | `gbl_currtype_id` | `gblCurrtypeId` | 全局币币种 |
| `grp_currtype_id` | `grp_currtype_id` | `grpCurrtypeId` | 集团币币种 |
| `mgt_cost_center_id` | `mgt_cost_center_id` | `mgmtCostCenterId` | 管理成本中心 |
| `mgt_dept_id` | `mgt_dept_id` | `mgmtDeptId` | 管理部门 |
| `mgt_profit_center_id` | `mgt_profit_center_id` | `mgmtProfitCenterId` | 管理利润中心 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `usage_cost_center_id` | `usage_cost_center_id` | `operCostCenterId` | 使用成本中心 |
| `usage_dept_id` | `usage_dept_id` | `operDeptId` | 使用部门 |
| `usage_profit_center_id` | `usage_profit_center_id` | `operProfitCenterId` | 使用利润中心 |
| `org_currtype_id` | `org_currtype_id` | `orgCurrtypeId` | 组织币币种 |
| `period_id` | `period_id` | `periodId` | 会计期间 |
| `product_id` | `product_id` | `productId` | 产品 |
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

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_year_id` | `acc_year_id` | `accYearId` | 会计年ID |

### 数值字段 (24个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_adjust_depr_amount` | `acc_adjust_depr_amount` | `accAdjustDeprAmount` | 本币追溯调整折旧额 |
| `acc_period_depr_accural_amount` | `acc_period_depr_accural_amount` | `accPeriodDeprAccuralAmount` | 本币期间折旧计提额 |
| `acc_value_amount` | `acc_value_amount` | `accruedOriValue` | 本币计提原值 |
| `accum_depr_amount` | `accum_depr_amount` | `deprAmount` | 本币累计折旧 |
| `gbl_accum_depr_amount` | `gbl_accum_depr_amount` | `gblAccumDeprAmount` | 全局币累计折旧 |
| `gbl_adjust_depr_amount` | `gbl_adjust_depr_amount` | `gblAdjustDeprAmount` | 全局币追溯调整折旧额 |
| `gbl_period_depr_accural_amount` | `gbl_period_depr_accural_amount` | `gblPeriodDeprAccuralAmount` | 全局币期间折旧计提额 |
| `gbl_period_depr_amount` | `gbl_period_depr_amount` | `gblPeriodDeprAmount` | 全局币本期折旧金额 |
| `gbl_value_amount` | `gbl_value_amount` | `gblValueAmount` | 全局币计提原值 |
| `gbl_year_depr_amount` | `gbl_year_depr_amount` | `gblYearDeprAmount` | 全局币本年折旧 |
| `grp_accum_depr_amount` | `grp_accum_depr_amount` | `grpAccumDeprAmount` | 集团币累计折旧 |
| `grp_adjust_depr_amount` | `grp_adjust_depr_amount` | `grpAdjustDeprAmount` | 集团币追溯调整折旧额 |
| `grp_period_depr_accural_amount` | `grp_period_depr_accural_amount` | `grpPeriodDeprAccuralAmount` | 集团币期间折旧计提额 |
| `grp_period_depr_amount` | `grp_period_depr_amount` | `grpPeriodDeprAmount` | 集团币本期折旧金额 |
| `grp_value_amount` | `grp_value_amount` | `grpValueAmount` | 集团币计提原值 |
| `grp_year_depr_amount` | `grp_year_depr_amount` | `grpYearDeprAmount` | 集团币本年折旧 |
| `month_depr_amount` | `month_depr_amount` | `monthDeprAmount` | 本币本期折旧金额 |
| `org_accum_depr_amount` | `org_accum_depr_amount` | `orgAccumDeprAmount` | 组织币累计折旧 |
| `org_adjust_depr_amount` | `org_adjust_depr_amount` | `orgAdjustDeprAmount` | 组织币追溯调整折旧额 |
| `org_period_depr_accural_amount` | `org_period_depr_accural_amount` | `orgPeriodDeprAccuralAmount` | 组织币期间折旧计提额 |
| `org_period_depr_amount` | `org_period_depr_amount` | `orgPeriodDeprAmount` | 组织币本期折旧金额 |
| `org_value_amount` | `org_value_amount` | `orgValueAmount` | 组织币计提原值 |
| `org_year_depr_amount` | `org_year_depr_amount` | `orgYearDeprAmount` | 组织币本年折旧 |
| `year_accum_depr_amount` | `year_accum_depr_amount` | `yearDeprAmount` | 本币年累计折旧 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义项 |
