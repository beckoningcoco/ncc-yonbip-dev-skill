---
tags: [BIP, 元数据, 数据字典, EAR.badDebt.BadDebtRecoveryBody]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 坏账收回明细信息 (`EAR.badDebt.BadDebtRecoveryBody`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_ledger_b` | domain：`yonbip-fi-earap` | 应用：`EAR` | 业务对象ID：`78ead09b-eb99-422c-ad91-f50af3946cf4`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 坏账收回明细信息 |
| 物理表 | `arap_ledger_b` |
| domain/服务域 | `yonbip-fi-earap` |
| schema | `fiearap` |
| 所属应用 | `EAR` |
| 直连字段 | 70 个 |
| 子表 | 0 个 |
| 关联引用 | 23 个 |

## 关联引用 (23个)

| 字段名 | 引用类型 |
|--------|---------|
| `org_exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `src_body_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `ori_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `finance_org_id` | `ucf-org-center.bd_financeorgtreeref_na` |
| `grp_exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `acc_exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `prov_ratio_row_id` | `yonbip-fi-earap.RefTable_697e153746` |
| `carryover_year_id` | `finbd.bd_periodyear` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `carryover_period_id` | `finbd.bd_period` |
| `prepare_subject_id` | `fiepub.fiepub_accsubjectref` |
| `event_type_id` | `yonbip-fi-eaai2.RefTable_a70ca2f048` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `gbl_exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `src_grandson_id` | `` |
| `acc_period_id` | `finbd.bd_period` |
| `acc_book_id` | `fiepub.fiepub_accountbookref` |
| `src_event_id` | `` |
| `acc_year_id` | `finbd.bd_periodyear` |
| `prepare_subject_vid` | `fiepub.epub_accsubject_treetableref` |
| `event_id` | `` |

## 继承接口 (4个, 11字段)

- **收付核算金额** (`FIAP.FIAP.IArapAmount`)
  - `acc_arap_amount` → `acc_arap_amount`
  - `gbl_arap_amount` → `gbl_arap_amount`
  - `grp_arap_amount` → `grp_arap_amount`
  - `org_arap_amount` → `org_arap_amount`
  - `ori_arap_amount` → `ori_arap_amount`
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

> 共 70 个直连字段

### 文本字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `carryover_event_id` | `carryover_event_id` | `carryoverEvent` | 结转事务 |
| `ori_arap_event_type` | `ori_arap_event_type` | `oriArapEventType` | 源头事务类型 |
| `body_id` | `body_id` | `body` | 明细ID |
| `carryover_year_code` | `carryover_year_code` | `carryoverYearCode` | 结转年度编码 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据ID |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | 全局事务ID |
| `carryover_period_code` | `carryover_period_code` | `carryoverPeriodCode` | 结转期间编码 |
| `src_arap_event_type` | `src_arap_event_type` | `srcArapEventType` | 来源收付会计事务类型 |
| `carryover_body_id` | `carryover_body_id` | `carryoverBody` | 结转事务行 |
| `acc_period_code` | `acc_period_code` | `accPeriodCode` | 会计期间编码 |
| `src_bill_row_id` | `src_bill_row_id` | `srcBillRowId` | 来源单据行ID |
| `carryover_grandson_id` | `carryover_grandson_id` | `carryoverGrandson` | 结转事务孙ID |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年度编码 |

### 引用字段 (22个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |
| `org_exchange_rate_type_id` | `org_exchange_rate_type_id` | `orgExchangeRateType` | 组织币汇率类型 |
| `ori_currency_id` | `ori_currency_id` | `oriCurrency` | 币种 |
| `finance_org_id` | `finance_org_id` | `financeOrg` | 会计主体 |
| `acc_year_id` | `acc_year_id` | `accYear` | 会计年度 |
| `src_body_id` | `src_body_id` | `srcBody` | 来源明细 |
| `grp_exchange_rate_type_id` | `grp_exchange_rate_type_id` | `grpExchangeRateType` | 集团币汇率类型 |
| `carryover_year_id` | `carryover_year_id` | `carryoverYear` | 结转年度ID |
| `prepare_subject_id` | `prepare_subject_id` | `prepareSubject` | 坏账发生科目 |
| `event_type_id` | `event_type_id` | `eventType` | 会计事务 |
| `src_grandson_id` | `src_grandson_id` | `srcGrandson` | 来源核算行 |
| `acc_book_id` | `acc_book_id` | `accBook` | 财务账簿 |
| `src_event_id` | `src_event_id` | `srcEvent` | 来源事务 |
| `prepare_subject_vid` | `prepare_subject_vid` | `prepareSubjectVid` | 坏账准备科目版本 |
| `event_id` | `event_id` | `event` | 坏账收回基本信息 |
| `acc_exchange_rate_type_id` | `acc_exchange_rate_type_id` | `accExchangeRateType` | 汇率类型 |
| `prov_ratio_row_id` | `prov_ratio_row_id` | `provRatioRow` | 计提比率维度 |
| `carryover_period_id` | `carryover_period_id` | `carryoverPeriod` | 结转期间ID |
| `gbl_exchange_rate_type_id` | `gbl_exchange_rate_type_id` | `gblExchangeRateType` | 全局币汇率类型 |
| `acc_period_id` | `acc_period_id` | `accPeriod` | 会计期间 |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exchange_rate_date` | `exchange_rate_date` | `exchangeRateDate` | 汇率日期 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 枚举字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_exchange_rate_ops` | `acc_exchange_rate_ops` | `accExchangeRateOps` | 本币汇率折算方式 |
| `gbl_exchange_rate_ops` | `gbl_exchange_rate_ops` | `gblExchangeRateOps` | 全局币汇率折算方式 |
| `grp_exchange_rate_ops` | `grp_exchange_rate_ops` | `grpExchangeRateOps` | 集团币汇率折算方式 |
| `org_exchange_rate_ops` | `org_exchange_rate_ops` | `orgExchangeRateOps` | 组织币汇率折算方式 |
| `amount_direction` | `amount_direction` | `amountDirection` | 借贷方向 |
| `digest` | `digest` | `digest` | 处理摘要 |
| `arap_event_type` | `arap_event_type` | `arapEventType` | 收付会计事务类型 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_carryover` | `bln_carryover` | `blnCarryover` | 是否结转 |
| `dtc_status` | `dtc_status` | `dtcStatus` | 全局事务状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_arap_amount` | `acc_arap_amount` | `accArapAmount` | 本币核算金额 |
| `gbl_arap_amount` | `gbl_arap_amount` | `gblArapAmount` | 全局币核算金额 |
| `grp_arap_amount` | `grp_arap_amount` | `grpArapAmount` | 集团币核算金额 |
| `org_arap_amount` | `org_arap_amount` | `orgArapAmount` | 组织币核算金额 |
| `ori_arap_amount` | `ori_arap_amount` | `oriArapAmount` | 核算金额 |
| `org_exchange_rate` | `org_exchange_rate` | `orgExchangeRate` | 组织币汇率 |
| `acc_amount` | `acc_amount` | `accAmount` | 本币金额 |
| `ori_amount` | `ori_amount` | `oriAmount` | 原币金额 |
| `org_tax_included_amount` | `org_tax_included_amount` | `orgTaxIncludedAmount` | 组织币含税金额 |
| `grp_amount` | `grp_amount` | `grpAmount` | 集团币金额 |
| `gbl_exchange_rate` | `gbl_exchange_rate` | `gblExchangeRate` | 全局币汇率 |
| `grp_exchange_rate` | `grp_exchange_rate` | `grpExchangeRate` | 集团币汇率 |
| `grp_tax_included_amount` | `grp_tax_included_amount` | `grpTaxIncludedAmount` | 集团币含税金额 |
| `acc_exchange_rate` | `acc_exchange_rate` | `accExchangeRate` | 汇率 |
| `gbl_amount` | `gbl_amount` | `gblAmount` | 全局币金额 |
| `acc_tax_included_amount` | `acc_tax_included_amount` | `accTaxIncludedAmount` | 本币含税金额 |
| `ori_tax_included_amount` | `ori_tax_included_amount` | `oriTaxIncludedAmount` | 原币含税金额 |
| `gbl_tax_included_amount` | `gbl_tax_included_amount` | `gblTaxIncludedAmount` | 全局币含税金额 |
| `org_amount` | `org_amount` | `orgAmount` | 组织币金额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义特征 |
