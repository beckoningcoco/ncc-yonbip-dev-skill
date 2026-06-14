---
tags: [BIP, 元数据, 数据字典, fa.faaddition.AdditionLease]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 新增单租赁信息 (`fa.faaddition.AdditionLease`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_bill_add_lease` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`26f6782d-c405-466f-8424-c393cad9c921`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 新增单租赁信息 |
| 物理表 | `fa_bill_add_lease` |
| domain/服务域 | `yonbip-fi-efa` |
| schema | `fiefa` |
| 所属应用 | `EFA` |
| 直连字段 | 43 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `handler` | `ucf-staff-center.bd_staff_all_ref` |
| `addition_bill_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `handle_dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `lessor_id` | `yssupplier.aa_vendor` |
| `tax_item_id` | `yonbip-fi-taxbd.RefTable_6d8751fe20` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 43 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contract_date` | `contract_date` | `contractDate` | 合同签订日期 |
| `contract_no` | `contract_no` | `contractNo` | 合同号 |
| `daily_discount_rate_type` | `daily_discount_rate_type` | `dailyDiscountRateType` | 日折现率计算方式(系统参数) |
| `discount_method` | `discount_method` | `discountMethod` | 折现方式 |
| `discount_rate_type` | `discount_rate_type` | `discountRateType` | 期折现率计算方式 |
| `id` | `id` | `id` | 主键 |
| `interest_algorithm_type` | `interest_algorithm_type` | `interestAlgorithmType` | 利息计提算法 |
| `lease_end_date` | `lease_end_date` | `leaseEndDate` | 止租日期 |
| `lease_start_date` | `lease_start_date` | `leaseStartDate` | 起租日期 |
| `renewal_end_date` | `renewal_end_date` | `renewalEndDate` | 续租截止期 |
| `start_count_date` | `start_count_date` | `startCountDate` | 起算日期 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `addition_bill_id` | `addition_bill_id` | `additionBillId` | 主表ID |
| `creator` | `creator` | `creator` | 创建人 |
| `handle_dept_id` | `handle_dept_id` | `handleDeptId` | 经办部门 |
| `handler` | `handler` | `handler` | 经办人 |
| `lessor_id` | `lessor_id` | `lessorId` | 出租方 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `tax_item_id` | `tax_item_id` | `taxItemId` | 税目 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_period_start_zero` | `bln_period_start_zero` | `blnPeriodStartZero` | 折现期数从0起算 |
| `bln_purchase_option` | `bln_purchase_option` | `blnPurchaseOption` | 执行购买选择权 |
| `bln_renewal_option` | `bln_renewal_option` | `blnRenewalOption` | 执行续租选择权 |
| `bln_tax_deductible` | `bln_tax_deductible` | `blnTaxDeductible` | 税额可抵扣 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `beginning_lease_liability` | `beginning_lease_liability` | `beginningLeaseLiability` | 期初租赁负债 |
| `discount_day_rate` | `discount_day_rate` | `discountDayRate` | 日折现率 |
| `discount_month_rate` | `discount_month_rate` | `discountMonthRate` | 月折现率 |
| `discount_rate` | `discount_rate` | `discountRate` | 期折现率 |
| `discount_year_rate` | `discount_year_rate` | `discountYearRate` | 年折现率 |
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
