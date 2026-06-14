---
tags: [BIP, 元数据, 数据字典, FIAP.FIAP.ApLossEarnEventBodyBO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 应付汇兑损益明细信息 (`FIAP.FIAP.ApLossEarnEventBodyBO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_ledger_b` | domain：`yonbip-fi-earap` | 应用：`EAP` | 业务对象ID：`3a6844be-d2df-48ce-a45d-3308a5f8f2d4`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 应付汇兑损益明细信息 |
| 物理表 | `arap_ledger_b` |
| domain/服务域 | `yonbip-fi-earap` |
| schema | `fiearap` |
| 所属应用 | `EAP` |
| 直连字段 | 51 个 |
| 子表 | 1 个 |
| 关联引用 | 16 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `grandsonItem` | `FIAP.FIAP.ApLossEarnEventGrandsonBO` | composition |

## 关联引用 (16个)

| 字段名 | 引用类型 |
|--------|---------|
| `org_exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `src_body_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `grp_exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `acc_exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `carryover_year_id` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `carryover_period_id` | `` |
| `event_type_id` | `yonbip-fi-eaai2.RefTable_a70ca2f048` |
| `ytenant_id` | `` |
| `gbl_exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `` | `` |
| `acc_period_id` | `finbd.bd_period` |
| `src_event_id` | `` |
| `acc_year_id` | `finbd.bd_period` |
| `event_id` | `` |

## 继承接口 (2个, 6字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **收付核算金额** (`FIAP.FIAP.IArapAmount`)
  - `acc_arap_amount` → `acc_arap_amount`
  - `gbl_arap_amount` → `gbl_arap_amount`
  - `grp_arap_amount` → `grp_arap_amount`
  - `org_arap_amount` → `org_arap_amount`
  - `ori_arap_amount` → `ori_arap_amount`

## 字段列表（按类型分组）

> 共 51 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_book_id` | `acc_book_id` | `accBook` | 财务账簿 |
| `acc_period_code` | `acc_period_code` | `accPeriodCode` | 会计期间编码 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年度编码 |
| `carryover_body_id` | `carryover_body_id` | `carryoverBody` | 结转事务行 |
| `carryover_event_id` | `carryover_event_id` | `carryoverEvent` | 结转事务 |
| `carryover_period_code` | `carryover_period_code` | `carryoverPeriodCode` | 结转期间编码 |
| `carryover_year_code` | `carryover_year_code` | `carryoverYearCode` | 结转年度编码 |
| `finance_org_id` | `finance_org_id` | `financeOrg` | 会计主体 |
| `id` | `id` | `id` | 主键 |
| `src_arap_event_type` | `src_arap_event_type` | `srcArapEventType` | 来源收付会计事务 |

### 引用字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_exchange_rate_type_id` | `acc_exchange_rate_type_id` | `accExchangeRateType` | 汇率类型 |
| `acc_period_id` | `acc_period_id` | `accPeriod` | 会计期间ID |
| `acc_year_id` | `acc_year_id` | `accYear` | 会计年度ID |
| `carryover_period_id` | `carryover_period_id` | `carryoverPeriod` | 结转期间 |
| `carryover_year_id` | `carryover_year_id` | `carryoverYear` | 结转年度 |
| `creator` | `creator` | `creator` | 创建人 |
| `event_id` | `event_id` | `event` | 应付汇兑损益事务 |
| `event_type_id` | `event_type_id` | `eventType` | 会计事务 |
| `gbl_exchange_rate_type_id` | `gbl_exchange_rate_type_id` | `gblExchangeRateType` | 全局币汇率类型 |
| `grp_exchange_rate_type_id` | `grp_exchange_rate_type_id` | `grpExchangeRateType` | 集团币汇率类型 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `org_exchange_rate_type_id` | `org_exchange_rate_type_id` | `orgExchangeRateType` | 组织币汇率类型 |
| `src_body_id` | `src_body_id` | `srcBody` | 来源明细ID |
| `src_event_id` | `src_event_id` | `srcEvent` | 来源事务ID |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `exchange_rate_date` | `exchange_rate_date` | `exchangeRateDate` | 汇率日期 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_exchange_rate_ops` | `acc_exchange_rate_ops` | `accExchangeRateOps` | 本币汇率折算方式 |
| `arap_event_type` | `arap_event_type` | `arapEventType` | 收付会计事务 |
| `gbl_exchange_rate_ops` | `gbl_exchange_rate_ops` | `gblExchangeRateOps` | 全局币汇率折算方式 |
| `grp_exchange_rate_ops` | `grp_exchange_rate_ops` | `grpExchangeRateOps` | 集团币汇率折算方式 |
| `org_exchange_rate_ops` | `org_exchange_rate_ops` | `orgExchangeRateOps` | 组织币汇率折算方式 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_carryover` | `bln_carryover` | `blnCarryover` | 是否结转 |
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_arap_amount` | `acc_arap_amount` | `accArapAmount` | 本币核算金额 |
| `acc_exchange_rate` | `acc_exchange_rate` | `accExchangeRate` | 汇率 |
| `acc_tax_included_amount` | `acc_tax_included_amount` | `accTaxIncludedAmount` | 本币含税金额 |
| `gbl_arap_amount` | `gbl_arap_amount` | `gblArapAmount` | 全局币核算金额 |
| `gbl_exchange_rate` | `gbl_exchange_rate` | `gblExchangeRate` | 全局币汇率 |
| `gbl_tax_included_amount` | `gbl_tax_included_amount` | `gblTaxIncludedAmount` | 全局币含税金额 |
| `grp_arap_amount` | `grp_arap_amount` | `grpArapAmount` | 集团币核算金额 |
| `grp_exchange_rate` | `grp_exchange_rate` | `grpExchangeRate` | 集团币汇率 |
| `grp_tax_included_amount` | `grp_tax_included_amount` | `grpTaxIncludedAmount` | 集团币含税金额 |
| `org_arap_amount` | `org_arap_amount` | `orgArapAmount` | 组织币核算金额 |
| `org_exchange_rate` | `org_exchange_rate` | `orgExchangeRate` | 组织币汇率 |
| `org_tax_included_amount` | `org_tax_included_amount` | `orgTaxIncludedAmount` | 组织币含税金额 |
| `ori_arap_amount` | `ori_arap_amount` | `oriArapAmount` | 核算金额 |
| `ori_tax_included_amount` | `ori_tax_included_amount` | `oriTaxIncludedAmount` | 含税金额 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `grandsonItem` | 应付汇兑损益计划信息 |
