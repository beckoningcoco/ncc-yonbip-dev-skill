---
tags: [BIP, 元数据, 数据字典, fa.transferfievent.FIEventAssetLeaseInfo]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 卡片使用权信息 (`fa.transferfievent.FIEventAssetLeaseInfo`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_ledger_b_lease` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`9a9f8733-e495-4106-af7d-06e5ff48af94`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 卡片使用权信息 |
| 物理表 | `fa_ledger_b_lease` |
| 数据库 schema | `yonbip-fi-efa` |
| 所属应用 | `EFA` |
| 直连字段 | 48 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `handler` | `ucf-staff-center.bd_staff_all_ref` |
| `event_basic_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `handle_dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `lessor_id` | `yssupplier.aa_vendor` |
| `tax_item_id` | `yonbip-fi-taxpubdoc.RefTable_55c5b82f11` |

## 继承接口 (3个, 6字段)

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

> 共 48 个直连字段

### 文本字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年编码 |
| `accbook_id` | `accbook_id` | `accbook` | 账簿ID |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体ID |
| `contract_date` | `contract_date` | `contractDate` | 合同签订日期 |
| `contract_no` | `contract_no` | `contractNo` | 合同号 |
| `direction` | `direction` | `direction` | 方向 |
| `discount_rate_type` | `discount_rate_type` | `discountRateType` | 期折现率计算方式 |
| `header_id` | `header_id` | `headerId` | 主表ID |
| `id` | `id` | `id` | 主键 |
| `interest_algorithm_type` | `interest_algorithm_type` | `interestAlgorithmType` | 利息计提算法 |
| `lease_end_date` | `lease_end_date` | `leaseEndDate` | 止租日期 |
| `lease_start_date` | `lease_start_date` | `leaseStartDate` | 起租日期 |
| `acc_period_code` | `acc_period_code` | `period` | 会计期间编码 |
| `renewal_end_date` | `renewal_end_date` | `renewalEndDate` | 续租截止期 |
| `start_count_date` | `start_count_date` | `startCountDate` | 起算日期 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `event_basic_id` | `event_basic_id` | `FIEventAssetBasicInfo_id` | 卡片基本信息 |
| `creator` | `creator` | `creator` | 创建人 |
| `handle_dept_id` | `handle_dept_id` | `handleDeptId` | 经办部门 |
| `handler` | `handler` | `handler` | 经办人 |
| `lessor_id` | `lessor_id` | `lessorId` | 出租方 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `tax_item_id` | `tax_item_id` | `taxItemId` | 税目% |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_purchase_option` | `bln_purchase_option` | `blnPurchaseOption` | 执行购买选择权 |
| `bln_renewal_option` | `bln_renewal_option` | `blnRenewalOption` | 执行续租选择权 |
| `bln_tax_deductible` | `bln_tax_deductible` | `blnTaxDeductible` | 税额可抵扣 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_year_id` | `acc_year_id` | `accYearId` | 会计年ID |
| `acc_period_id` | `acc_period_id` | `periodId` | 会计期间ID |

### 数值字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `beginning_lease_liability` | `beginning_lease_liability` | `beginningLeaseLiability` | 期初租赁负债 |
| `discount_day_rate` | `discount_day_rate` | `discountDayRate` | 日折现率% |
| `discount_month_rate` | `discount_month_rate` | `discountMonthRate` | 月折现率 |
| `discount_rate` | `discount_rate` | `discountRate` | 期折现率 |
| `discount_year_rate` | `discount_year_rate` | `discountYearRate` | 年折现率% |
| `init_direct_cost` | `init_direct_cost` | `initDirectCost` | 初始直接费用 |
| `lease_incentive_amount` | `lease_incentive_amount` | `leaseIncentiveAmount` | 租赁激励金额 |
| `lease_ori_value_amount` | `lease_ori_value_amount` | `leaseOriValueAmount` | 使用权资产原值 |
| `lease_payment` | `lease_payment` | `leasePayment` | 租赁付款额 |
| `pre_liability` | `pre_liability` | `preLiability` | 预计负债 |
| `pre_restore_cost` | `pre_restore_cost` | `preRestoreCost` | 预计还原成本 |
| `purchase_price` | `purchase_price` | `purchasePrice` | 购买价格 |
| `tax_amount` | `tax_amount` | `taxAmount` | 税额 |
| `tax_rate` | `tax_rate` | `taxRate` | 税率 |
| `uncon_finance_cost` | `uncon_finance_cost` | `unconFinanceCost` | 未确认融资费用 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contract_name` | `contract_name` | `contractName` | 合同名称 |
