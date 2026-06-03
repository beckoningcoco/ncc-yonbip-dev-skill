---
tags: [BIP, 元数据, 数据字典, fa.fixedAssetCateBookParamer.FixedAssetCateBookParamer]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 按账簿设置资产类别 (`fa.fixedAssetCateBookParamer.FixedAssetCateBookParamer`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_category_accbook` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`6eacd05d-c5f3-4fb2-a772-0119ef1441b4`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 按账簿设置资产类别 |
| 物理表 | `fa_category_accbook` |
| 数据库 schema | `yonbip-fi-efa` |
| 所属应用 | `EFA` |
| 直连字段 | 55 个 |
| 子表 | 0 个 |
| 关联引用 | 14 个 |

## 关联引用 (14个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `use_depr_convention_id` | `yonbip-fi-efa.fa_depr_conventionref` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `use_disposal_convention_id` | `yonbip-fi-efa.fa_depr_conventionref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `use_depr_method_id` | `yonbip-fi-efa.fa_depreciation_methodlistref` |
| `ytenant_id` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref` |
| `bustype` | `ucfbasedoc.bd_billtyperef` |
| `depr_convention_id` | `yonbip-fi-efa.fa_depr_conventionref` |
| `depr_method_id` | `yonbip-fi-efa.fa_depreciation_methodlistref` |
| `disposal_convention_id` | `yonbip-fi-efa.fa_depr_conventionref` |
| `category_id` | `` |

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

> 共 55 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `description` | `description` | `description` | 描述 |
| `scrap_value_type` | `scrap_value_type` | `scrapValueType` | 残值类型 |
| `use_scrap_value_type` | `use_scrap_value_type` | `useScrapValueType` | 使用权资产残值类型 |
| `version_no` | `version_no` | `versionNo` | 版本号 |
| `auditnote` | `auditnote` | `auditNote` | 审批批语 |
| `procinst_id` | `procinst_id` | `procinstId` | 流程实例ID |
| `id` | `id` | `id` | 主键 |

### 引用字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_id` | `accbook_id` | `accbook` | 业务账簿 |
| `accentity_id` | `accentity_id` | `accentity` | 所属组织 |
| `category_id` | `category_id` | `categoryId` | 分类名称Id |
| `depr_convention_id` | `depr_convention_id` | `deprConventionId` | 折旧惯例 |
| `depr_method_id` | `depr_method_id` | `deprMethodId` | 折旧方法 |
| `disposal_convention_id` | `disposal_convention_id` | `disposalConventionId` | 处置惯例 |
| `use_depr_convention_id` | `use_depr_convention_id` | `useDeprConventionId` | 使用权资产折旧惯例id |
| `use_depr_method_id` | `use_depr_method_id` | `useDeprMethodId` | 使用权资产折旧方法id |
| `use_disposal_convention_id` | `use_disposal_convention_id` | `useDisposalConventionId` | 使用权资产处置惯例id |
| `auditor` | `auditor` | `auditor` | 审批人 |
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `version_end_date` | `version_end_date` | `ruleEndTime` | 规则结束时间 |
| `version_start_date` | `version_start_date` | `ruleStartTime` | 规则启用时间 |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_capital_limit` | `bln_capital_limit` | `blnCapitalLimit` | 资本化标识 |
| `bln_disposal_curr_interest` | `bln_disposal_curr_interest` | `blnDisposalCurrInterest` | 处置资产当期计提利息 |
| `bln_lease` | `bln_lease` | `blnLease` | 使用权资产 |
| `bln_use_acc_accum_depr_curr_effect` | `bln_use_acc_accum_depr_curr_effect` | `blnUseAccAccumDeprCurrEffect` | 使用权资产本币原值、累计折旧调整当期有效 |
| `bln_use_add_curr_depr` | `bln_use_add_curr_depr` | `blnUseAddCurrDepr` | 使用权资产新增资产当期计提 |
| `bln_use_diposal_curr_depr` | `bln_use_diposal_curr_depr` | `blnUseDiposalCurrDepr` | 使用权资产处置资产当期计提 |
| `bln_use_imp_accrue_curr_effect` | `bln_use_imp_accrue_curr_effect` | `blnUseImpAccrueCurrEffect` | 使用权资产减值准备计提当期有效 |
| `bln_depr` | `bln_depr` | `isDepr` | 是否折旧 |
| `bln_diposal_curr_depr` | `bln_diposal_curr_depr` | `isDisposalcurdepr` | 处置资产当期计提 |
| `ifend` | `ifend` | `isEnd` | 是否末级 |
| `bln_imp_accrue_curr_effect` | `bln_imp_accrue_curr_effect` | `isImpairmentProCur` | 减值准备计提当期有效 |
| `bln_add_curr_depr` | `bln_add_curr_depr` | `isNewcurdepr` | 新增资产当期计提 |
| `bln_acc_accum_depr_curr_effect` | `bln_acc_accum_depr_curr_effect` | `isOrivalAccDeprAdjustCur` | 本币原值、累计折旧调整当期有效 |

### 枚举字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `metering_mode` | `metering_mode` | `meteringMode` | 计量模式 |
| `disposal_depr_period` | `disposal_depr_period` | `disposalDeprPeriod` | 处置资产计提期间 |
| `new_depr_period` | `new_depr_period` | `newDeprPeriod` | 新增资产计提期间 |
| `use_disposal_depr_period` | `use_disposal_depr_period` | `useDisposalDeprPeriod` | 使用权处置资产计提期间 |
| `use_new_depr_period` | `use_new_depr_period` | `useNewDeprPeriod` | 使用权新增资产计提期间 |
| `verifystate` | `verifystate` | `verifyState` | 单据状态 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `level` | `level` | `level` | 层级 |
| `life_month` | `life_month` | `lifeMonth` | 使用月 |
| `life_year` | `life_year` | `lifeYear` | 使用年 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `capital_limit_amount` | `capital_limit_amount` | `capitalLimitAmount` | 资本化限额 |
| `scrap_value_amount` | `scrap_value_amount` | `scrapValueAmount` | 残值金额 |
| `scrap_value_rate` | `scrap_value_rate` | `scrapValueRate` | 残值率 |
| `use_scrap_value_amount` | `use_scrap_value_amount` | `useScrapValueAmount` | 使用权资产残值金额 |
| `use_scrap_value_rate` | `use_scrap_value_rate` | `useScrapValueRate` | 使用权资产残值率 |
