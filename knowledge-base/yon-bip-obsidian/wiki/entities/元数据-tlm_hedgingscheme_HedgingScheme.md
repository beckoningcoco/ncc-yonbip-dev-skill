---
tags: [BIP, 元数据, 数据字典, tlm.hedgingscheme.HedgingScheme]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 套保方案 (`tlm.hedgingscheme.HedgingScheme`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_hedgingscheme` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：`796b27cb-cfd2-4a32-a60a-27adab6dd909`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 套保方案 |
| 物理表 | `tlm_hedgingscheme` |
| domain/服务域 | `yonbip-fi-ctmtlm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `TLM` |
| 直连字段 | 60 个 |
| 子表 | 2 个 |
| 关联引用 | 14 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `HedgingSchemeBudget` | `tlm.hedgingscheme.HedgingSchemeQuotaDetail` | composition |
| `HedgingScheme_b` | `tlm.hedgingscheme.HedgingScheme_b` | composition |

## 关联引用 (14个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `character_def` | `` |
| `accentity_raw` | `` |
| `` | `` |
| `accentity` | `ucf-org-center.bd_financeorgtreeref` |
| `plan_number` | `tlm_yeartradeplanref` |
| `iNatCurrencyID` | `` |
| `currency` | `bd_currencytenantreflist` |
| `trade_type` | `bd_transtypelistref` |
| `tenant_id` | `` |

## 继承接口 (8个, 21字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``
- **打印次数** (`base.itf.IPrintCount`)
  - `printCount` → `printCount`
- **币种信息** (`voucher.base.ICurrency`)
  - `iCurrencyID` → `iCurrencyID`
  - `` → ``
  - `iNatCurrencyID` → `iNatCurrencyID`
- **自动编码** (`ucfbase.ucfbaseItf.IAutoCode`)

## 字段列表（按类型分组）

> 共 60 个直连字段

### 文本字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 单据编号 |
| `plan_id` | `plan_id` | `planId` | 年度交易计划id |
| `scenario_name` | `scenario_name` | `scenarioName` | 方案名称 |
| `plan_name` | `plan_name` | `planName` | 计划名称 |
| `unit` | `unit` | `unit` | 单位 |
| `warning_line_descirbe` | `warning_line_descirbe` | `warningLineDescirbe` | 止损或亏损预警线描述 |
| `business_background` | `business_background` | `businessBackground` | 业务背景 |
| `hedging_strategy` | `hedging_strategy` | `hedgingStrategy` | 套保策略 |
| `remark` | `remark` | `remark` | 备注 |
| `budget_msg` | `budget_msg` | `budgetMsg` | 额度预警描述 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `` | `auditor` | `auditor` | 审批人 |

### 引用字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 会计主体id |
| `plan_number` | `plan_number` | `planNumber` | 计划编号 |
| `currency` | `currency` | `currency` | 币种id |
| `trade_type` | `trade_type` | `tradeType` | 交易类型id |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `iNatCurrencyID` | `iNatCurrencyID` | `natCurrency` | 本币 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vouchdate` | `vouchdate` | `vouchdate` | 单据日期 |
| `trading_year` | `trading_year` | `tradingYear` | 交易年度 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isWfControlled` | `isWfControlled` | 审批流控制 |

### 枚举字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_status` | `bill_status` | `billStatus` | 单据状态 |
| `status` | `status` | `status` | 单据状态 |
| `is_include_hedged_items` | `is_include_hedged_items` | `isIncludeHedgedItems` | 是否含被套期项目 |
| `domestic_or_overseas` | `domestic_or_overseas` | `domesticOrOverseas` | 境内/境外 |
| `on_site_or_off_site` | `on_site_or_off_site` | `onSiteOrOffSite` | 场内/场外 |
| `generation_type` | `generation_type` | `generationType` | 生成方式 |
| `is_budget` | `is_budget` | `isBudget` | 是否占用預算 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `printCount` | `printCount` | `printCount` | 打印次数 |

### 短整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `verifystate` | `verifystate` | 审批状态 |
| `audit_status` | `audit_status` | `auditStatus` | 审批状态 |
| `bill_type` | `bill_type` | `billType` | 单据类型 |
| `` | `returncount` | `returncount` | 退回次数 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `scale_of_funds` | `scale_of_funds` | `scaleOfFunds` | 资金占用规模 |
| `physical_operation_scale` | `physical_operation_scale` | `physicalOperationScale` | 实货经营规模 |
| `hedge_scale` | `hedge_scale` | `hedgeScale` | 保值规模 |
| `usable_scale_of_funds` | `usable_scale_of_funds` | `usableScaleOfFunds` | 可用资金占用规模 |
| `usable_hedge_scale` | `usable_hedge_scale` | `usableHedgeScale` | 可用保值规模 |
| `` | `exchRate` | `exchRate` | 汇率 |

### multipleOption (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `trade_category` | `trade_category` | `tradeCategory` | 交易品种 |
| `business_type` | `business_type` | `businessType` | 业务类型 |
| `release_hedge_line` | `release_hedge_line` | `releaseHedgeLine` | 释放套保额度 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `character_def` | `character_def` | `characterDef` | 套保方案特征 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `HedgingSchemeBudget` | 套保额度明细 |
| `` | `` | `HedgingScheme_b` | 套保项目 |
