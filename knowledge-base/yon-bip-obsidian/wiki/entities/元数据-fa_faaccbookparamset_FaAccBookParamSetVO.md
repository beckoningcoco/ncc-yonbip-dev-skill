---
tags: [BIP, 元数据, 数据字典, fa.faaccbookparamset.FaAccBookParamSetVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 固定资产业务账簿参数 (`fa.faaccbookparamset.FaAccBookParamSetVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_accbook_param` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`46754018-4695-4d82-a5f8-956e8b1b7f66`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 固定资产业务账簿参数 |
| 物理表 | `fa_accbook_param` |
| domain/服务域 | `yonbip-fi-efa` |
| schema | `fiefa` |
| 所属应用 | `EFA` |
| 直连字段 | 61 个 |
| 子表 | 0 个 |
| 关联引用 | 14 个 |

## 关联引用 (14个)

| 字段名 | 引用类型 |
|--------|---------|
| `aprn_calendar_id` | `finbd.bd_accperiodscheme` |
| `cat_struct_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `associated_company_accbook_id` | `fiepub.fiepub_accountbookref` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `accbook_start_period_id` | `finbd.bd_period` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref` |
| `bustype` | `ucfbasedoc.bd_billtyperef` |
| `depr_calendar_id` | `finbd.bd_accperiodscheme` |
| `parameter_period_id` | `finbd.bd_period` |
| `current_account_period_id` | `finbd.bd_period` |

## 继承接口 (5个, 12字段)

- **交易类型** (`iuap.busiObj.BustypeItf`)
  - `bustype` → `bustype`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **审批流接口** (`iuap.busiObj.ApprovalFlowItf`)
  - `auditnote` → `auditnote`
  - `auditor` → `auditor`
  - `audit_time` → `audit_time`
  - `procinst_id` → `procinst_id`
  - `verifystate` → `verifystate`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 61 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_enabled` | `accbook_enabled` | `accbookEnabled` | 账簿状态 |
| `current_account_period_code` | `current_account_period_code` | `currentAccountPeriod` | 当期会计期间编码 |
| `depr_gather_dimension` | `depr_gather_dimension` | `deprDimension` | 折旧汇总维度 |
| `make_depr_voucher` | `make_depr_voucher` | `deprVoucher` | 折旧凭证制单 |
| `init_depr_gather_dimension` | `init_depr_gather_dimension` | `initDimension` | 初始折旧汇总维度 |
| `parameter_period_code` | `parameter_period_code` | `parameterPeriodCode` | 参数期间编码 |
| `accbook_start_period_code` | `accbook_start_period_code` | `startperiod` | 账簿启用期间编码 |
| `auditnote` | `auditnote` | `auditNote` | 审批批语 |
| `procinst_id` | `procinst_id` | `procinstId` | 流程实例ID |
| `id` | `id` | `id` | 主键 |

### 引用字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_id` | `accbook_id` | `accbook` | 账簿 |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `aprn_calendar_id` | `aprn_calendar_id` | `assignCalendar` | 分摊日历 |
| `associated_company_accbook_id` | `associated_company_accbook_id` | `associatedCompanyBook` | 关联公司簿 |
| `cat_struct_id` | `cat_struct_id` | `cateStructId` | 资产类别结构 |
| `current_account_period_id` | `current_account_period_id` | `currentAccountPeriodId` | 当前会计期间 |
| `depr_calendar_id` | `depr_calendar_id` | `deprCalendar` | 折旧日历 |
| `parameter_period_id` | `parameter_period_id` | `parameterPeriod` | 参数期间 |
| `accbook_start_period_id` | `accbook_start_period_id` | `startperiodid` | 账簿启用期间ID |
| `auditor` | `auditor` | `auditor` | 审批人 |
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (24个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_accrued_ori_value` | `bln_accrued_ori_value` | `accruedOriValue` | 本币原值增减变动当期生效 |
| `bln_adjust_curr_depr` | `bln_adjust_curr_depr` | `adjustmentDepr` | 管理部门调整当期折旧 |
| `bln_cat_change_curr_depr` | `bln_cat_change_curr_depr` | `category` | 资产类别变化当期折旧 |
| `bln_depr_method` | `bln_depr_method` | `deprMethod` | 折旧方法调整当期有效 |
| `bln_accum_depr_curr_effect` | `bln_accum_depr_curr_effect` | `depreciation` | 累计折旧调整当期生效 |
| `depreciation_stop_periods` | `depreciation_stop_periods` | `depreciationStopPeriods` | 停止折旧期间数计入已计提期数 |
| `bln_disposal_according` | `bln_disposal_according` | `disposalAccording` | 处置按净损益记账 |
| `bln_disposal_asset_curr_depr` | `bln_disposal_asset_curr_depr` | `disposalAssetCurPeriodDepr` | 处置资产当月计提折旧 |
| `bln_imp_depr` | `bln_imp_depr` | `impairmentDepr` | 减值准备是否参与折旧计算 |
| `bln_first_year_disposal_depr` | `bln_first_year_disposal_depr` | `isFirstyeardisposal` | 启用当年处置计提折旧 |
| `bln_last_period_depr` | `bln_last_period_depr` | `lastPeriodDepr` | 使用期限的最后一期折旧提足 |
| `bln_life_month` | `bln_life_month` | `lifeMonth` | 使用月限调整当期有效 |
| `bln_mgn_dept_curr_depr` | `bln_mgn_dept_curr_depr` | `mgmtDeptDepr` | 管理部门转移当期折旧 |
| `bln_modify_depr_list` | `bln_modify_depr_list` | `modifyListing` | 是否允许修改折旧清单 |
| `bln_add_asset_curr_depr` | `bln_add_asset_curr_depr` | `newAssetCurPeriodDepr` | 新增资产当月计提折旧 |
| `bln_usage_dept_curr_depr` | `bln_usage_dept_curr_depr` | `operDeptDepr` | 使用部门转移当期折旧 |
| `bln_period_inherit` | `bln_period_inherit` | `periodInherit` | 是否期间向下继承 |
| `bln_project_change_curr_depr` | `bln_project_change_curr_depr` | `projectChangeDepr` | 项目变化当期折旧 |
| `bln_reclass_curr_depr` | `bln_reclass_curr_depr` | `reclassDepr` | 资产类别重分类当期折旧 |
| `bln_scrap_value_rate` | `bln_scrap_value_rate` | `scrapValueRate` | 净残值率调整当期生效 |
| `bln_sync_down_param` | `bln_sync_down_param` | `syncParameters` | 向下同步固定资产参数 |
| `bln_total_workload_curr_effect` | `bln_total_workload_curr_effect` | `totalWorkload` | 工作总量调整当期有效 |
| `bln_transfer_curr_depr` | `bln_transfer_curr_depr` | `transferDepr` | 分配行维度转移当期折旧 |
| `bln_usage_state` | `bln_usage_state` | `usageState` | 使用状态调整当期有效 |

### 枚举字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `completion_condition` | `completion_condition` | `completionCondition` | 折旧完成判断条件 |
| `depr_treatment` | `depr_treatment` | `deprTreatment` | 资产超期的折旧处理方式 |
| `verifystate` | `verifystate` | `verifyState` | 单据状态 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `divide_dimension` | `divide_dimension` | `assignDimension` | 分割维度 |
| `depr_gather_periods` | `depr_gather_periods` | `deprAccountPeriods` | 折旧分配汇总周期 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_property_id` | `accbook_property_id` | `accountProperty` | 账簿属性 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `depr_gather_dimention_name` | `depr_gather_dimention_name` | `dimensionCheckName` | 折旧汇总维度名称 |
| `depr_voucher_make_name` | `depr_voucher_make_name` | `voucherCheckName` | 折旧凭证制单名称 |
