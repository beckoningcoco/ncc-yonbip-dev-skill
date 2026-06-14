---
tags: [BIP, 元数据, 数据字典, RVN.RVN.RclInterestAllocation]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 利息分摊 (`RVN.RVN.RclInterestAllocation`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcl_interest_allocation` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`6280abd8-2dde-4781-b77a-0346edb31386`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 利息分摊 |
| 物理表 | `rcl_interest_allocation` |
| domain/服务域 | `yonbip-fi-ercl` |
| schema | `fiercl` |
| 所属应用 | `RVN` |
| 直连字段 | 53 个 |
| 子表 | 0 个 |
| 关联引用 | 15 个 |

## 关联引用 (15个)

| 字段名 | 引用类型 |
|--------|---------|
| `period` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `activity` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `project` | `ucfbasedoc.bd_projectcardref` |
| `wbs` | `` |
| `exchange_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `src_app` | `fiepub.fiepub_sourceapplicationref` |
| `src_bill_type` | `ucfbasedoc.bd_billtypetreeref` |
| `src_bustype` | `ucfbasedoc.bd_billtyperef` |
| `material` | `productcenter.pc_nomalproductref` |
| `rclFinanceIncomeAllocation_id` | `` |
| `currency` | `ucfbasedoc.bd_currencytenantref` |

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

> 共 53 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `asset` | `asset` | `asset` | 资产 |
| `contract_row_id` | `contract_row_id` | `contractRowId` | 履约义务行ID |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据id |
| `src_bill_no` | `src_bill_no` | `srcBillNo` | 来源单据号 |
| `src_bill_row_id` | `src_bill_row_id` | `srcBillRowId` | 来源单据行id |
| `id` | `id` | `id` | 主键 |

### 引用字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `currency` | `currency` | `currency` | 币种 |
| `exchange_type` | `exchange_type` | `exchangeType` | 汇率类型 |
| `material` | `material` | `material` | 物料 |
| `period` | `period` | `period` | 期间 |
| `project` | `project` | `project` | 项目 |
| `rclFinanceIncomeAllocation_id` | `rclFinanceIncomeAllocation_id` | `rclFinanceIncomeAllocation_id` | 融资收益分摊 |
| `src_app` | `src_app` | `srcApp` | 来源应用 |
| `src_bill_type` | `src_bill_type` | `srcBillType` | 来源单据类型 |
| `src_bustype` | `src_bustype` | `srcBustype` | 来源交易类型 |
| `activity` | `activity` | `activity` | 活动 |
| `wbs` | `wbs` | `wbs` | WBS |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `end_date` | `end_date` | `endDate` | 止算日期 |
| `exchange_date` | `exchange_date` | `exchangeDate` | 汇率日期 |
| `start_date` | `start_date` | `startDate` | 起算日期 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exch_rate_ops` | `exch_rate_ops` | `exchRateOps` | 汇率折算方式 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contract_row_no` | `contract_row_no` | `contractRowNo` | 履约义务行 |
| `period_count` | `period_count` | `periodCount` | 期数 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (22个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `annual_discount_rate` | `annual_discount_rate` | `annualDiscountRate` | 年折现率 |
| `confirm_current_interest_income` | `confirm_current_interest_income` | `confirmCurrentInterestIncome` | 确认本期利息收入 |
| `confirm_initial_unrealized_financing_income` | `confirm_initial_unrealized_financing_income` | `confirmInitialUnrealizedFinancingIncome` | 确认期初未实现融资收益 |
| `confirm_local_current_interest_income` | `confirm_local_current_interest_income` | `confirmLocalCurrentInterestIncome` | 确认本币本期利息收入 |
| `confirm_local_initial_unrealized_financing_income` | `confirm_local_initial_unrealized_financing_income` | `confirmLocalInitialUnrealizedFinancingIncome` | 确认本币期初未实现融资收益 |
| `cumulative_interest_income` | `cumulative_interest_income` | `cumulativeInterestIncome` | 累计利息收入 |
| `current_interest_income` | `current_interest_income` | `currentInterestIncome` | 本期利息收入 |
| `ending_net_investment_balance` | `ending_net_investment_balance` | `endingNetInvestmentBalance` | 期末净投资余额 |
| `ending_unrealized_financing_income` | `ending_unrealized_financing_income` | `endingUnrealizedFinancingIncome` | 期末未实现融资收益 |
| `exchange_rate` | `exchange_rate` | `exchangeRate` | 汇率 |
| `initial_net_investment_balance` | `initial_net_investment_balance` | `initialNetInvestmentBalance` | 期初净投资余额 |
| `initial_unrealized_financing_income` | `initial_unrealized_financing_income` | `initialUnrealizedFinancingIncome` | 期初未实现融资收益 |
| `local_cumulative_interest_income` | `local_cumulative_interest_income` | `localCumulativeInterestIncome` | 本币累计利息收入 |
| `local_current_interest_income` | `local_current_interest_income` | `localCurrentInterestIncome` | 本币本期利息收入 |
| `local_ending_net_investment_balance` | `local_ending_net_investment_balance` | `localEndingNetInvestmentBalance` | 本币期末净投资余额 |
| `local_ending_unrealized_financing_income` | `local_ending_unrealized_financing_income` | `localEndingUnrealizedFinancingIncome` | 本币期末未实现融资收益 |
| `local_initial_net_investment_balance` | `local_initial_net_investment_balance` | `localInitialNetInvestmentBalance` | 本币期初净投资余额 |
| `local_initial_unrealized_financing_income` | `local_initial_unrealized_financing_income` | `localInitialUnrealizedFinancingIncome` | 本币期初未实现融资收益 |
| `local_principal_reduction_amount` | `local_principal_reduction_amount` | `localPrincipalReductionAmount` | 本币本金减少额 |
| `local_receipt_excluded_tax_amount` | `local_receipt_excluded_tax_amount` | `localReceiptExcludedTaxAmount` | 本币收款无税金额 |
| `principal_reduction_amount` | `principal_reduction_amount` | `principalReductionAmount` | 本金减少额 |
| `receipt_excluded_tax_amount` | `receipt_excluded_tax_amount` | `receiptExcludedTaxAmount` | 收款无税金额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 特征 |
