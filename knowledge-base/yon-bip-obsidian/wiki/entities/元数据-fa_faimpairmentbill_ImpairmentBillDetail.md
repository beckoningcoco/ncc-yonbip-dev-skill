---
tags: [BIP, 元数据, 数据字典, fa.faimpairmentbill.ImpairmentBillDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 减值单表体 (`fa.faimpairmentbill.ImpairmentBillDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_bill_impairment_dtl` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`f72ee487-da6b-4411-b344-7739d770b213`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 减值单表体 |
| 物理表 | `fa_bill_impairment_dtl` |
| domain/服务域 | `yonbip-fi-efa` |
| schema | `fiefa` |
| 所属应用 | `EFA` |
| 直连字段 | 57 个 |
| 子表 | 1 个 |
| 关联引用 | 16 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `assignments` | `fa.faimpairmentbill.ImpairmentAssignment` | composition |

## 关联引用 (16个)

| 字段名 | 引用类型 |
|--------|---------|
| `org_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `period_id` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `acc_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `asset_calc_id` | `` |
| `impairment_bill_id` | `` |
| `ytenant_id` | `` |
| `accbook_cat_id` | `efa-demo.RefTable_7ad125e247` |
| `asset_id` | `yonbip-fi-efa.RefTable_e18239682` |
| `asset_category_id` | `yonbip-fi-efa.RefTable_7e6adb5888` |
| `impairment_reason_id` | `` |
| `impairment_unit_id` | `yonbip-fi-efa.fa_impairmentunit_ref` |
| `accbook_currtype_id` | `ucfbasedoc.bd_currencytenantref` |

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

> 共 57 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `period_code` | `period_code` | `period` | 会计期间 |
| `impairment_effect_date` | `impairment_effect_date` | `impairmentDate` | 减值生效日期 |
| `name` | `name` | `name` | 减值名称 |
| `effect_depr_date` | `effect_depr_date` | `effectDeprDate` | 影响折旧日期 |
| `amort_adjust_date` | `amort_adjust_date` | `amortiAdjustDate` | 摊销起始日期 |
| `acc_convert_param` | `acc_convert_param` | `accConvertParam` | 本币折算参数 |
| `id` | `id` | `id` | id |

### 引用字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_id` | `accbook_id` | `accbook` | 账簿 |
| `period_id` | `period_id` | `periodId` | 会计期间ID |
| `asset_id` | `asset_id` | `assetId` | 固定资产 |
| `asset_category_id` | `asset_category_id` | `assetCategoryId` | 资产类别 |
| `accbook_cat_id` | `accbook_cat_id` | `faaccbook` | 资产类别账簿 |
| `impairment_bill_id` | `impairment_bill_id` | `impairmentBillId` | 减值单主表 |
| `accbook_currtype_id` | `accbook_currtype_id` | `accbookCurrtypeId` | 本币币种 |
| `impairment_unit_id` | `impairment_unit_id` | `impairmentUnitId` | 减值单元id |
| `impairment_reason_id` | `impairment_reason_id` | `impairmentReasonId` | 减值原因 |
| `asset_calc_id` | `asset_calc_id` | `calculateId` | 卡片核算信息ID |
| `acc_rate_type_id` | `acc_rate_type_id` | `accRateTypeId` | 本币汇率类型 |
| `org_currtype_id` | `org_currtype_id` | `orgCurrtypeId` | 组织币币种 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | pubts |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_next_period_effect_depr` | `bln_next_period_effect_depr` | `nextPeriodEffectDepr` | 是否下期影响折旧 |
| `bln_imp_accrue_curr_effect` | `bln_imp_accrue_curr_effect` | `blnImpAccrueCurrEffect` | 减值准备计提当期有效 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `impairment_type` | `impairment_type` | `impairmentType` | 减值类型 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `residue_life_month` | `residue_life_month` | `residueLifeMonth` | 剩余折旧月限 |
| `bln_depr` | `bln_depr` | `isDepr` | 是否折旧调整 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (25个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `impairment_basic_value` | `impairment_basic_value` | `impairmentBasicValue` | 减值基值 |
| `depr_calender_depr_amount` | `depr_calender_depr_amount` | `depreciationCalendarSysDepreciationAmount` | 折旧日历系统折旧 |
| `adjust_depr_amount` | `adjust_depr_amount` | `accAdjustDeprAmount` | 调整折旧 |
| `unplan_depr_amount` | `unplan_depr_amount` | `outPlanDeprAmount` | 计划外折旧金额 |
| `curr_period_depr_accum_amount` | `curr_period_depr_accum_amount` | `depreciationTotalAmount` | 本期折旧总额 |
| `acc_currtype_ori_amount` | `acc_currtype_ori_amount` | `oriValue` | 本币原值 |
| `scrap_value` | `scrap_value` | `scrapValue` | 本币净残值 |
| `accum_depr_amount` | `accum_depr_amount` | `deprAmount` | 本币累计折旧 |
| `impairment_amount` | `impairment_amount` | `impairmentAmount` | 本币累计减值 |
| `net_amount` | `net_amount` | `netAmount` | 本币净额 |
| `acc_rate` | `acc_rate` | `accRate` | 本币汇率 |
| `accrued_amount` | `accrued_amount` | `accruedAmount` | 本币本次计提减值 |
| `ori_impairment_amount` | `ori_impairment_amount` | `oriImpairmentAmount` | 本币已计提累计减值 |
| `net_value` | `net_value` | `netValue` | 本币净值 |
| `recover_amount` | `recover_amount` | `recoverAmount` | 本币可回收金额 |
| `org_currtype_ori_amount` | `org_currtype_ori_amount` | `orgOriValueAmount` | 组织币原值 |
| `org_scrap_value` | `org_scrap_value` | `orgScrapValueAmount` | 组织币净残值 |
| `org_accum_depr_amount` | `org_accum_depr_amount` | `orgAccumDeprAmount` | 组织币累计折旧 |
| `org_impairment_amount` | `org_impairment_amount` | `orgAccumImpAmount` | 组织币累计减值 |
| `org_accrued_amount` | `org_accrued_amount` | `orgAccruedAmount` | 组织币计提减值 |
| `org_ori_impairment_amount` | `org_ori_impairment_amount` | `orgOriImpairmentAmount` | 组织币已计提累计减值 |
| `org_recover_amount` | `org_recover_amount` | `orgRecoverAmount` | 组织币可回收金额 |
| `org_net_value` | `org_net_value` | `orgNetValue` | 组织币账面净值 |
| `org_net_amount` | `org_net_amount` | `orgNetAmount` | 组织本币账面价值 |
| `org_adjust_depr_amount` | `org_adjust_depr_amount` | `orgAdjustDeprAmount` | 组织币追溯调整折旧 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `assignments` | 减值单分配信息 |
