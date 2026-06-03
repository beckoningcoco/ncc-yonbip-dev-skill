---
tags: [BIP, 元数据, 数据字典, EFA.lease.FaLeaseChange]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 使用权资产变更 (`EFA.lease.FaLeaseChange`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_lease_change` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`5cf2bdef-2e5e-496c-9c42-9dd2af7ee31e`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 使用权资产变更 |
| 物理表 | `fa_lease_change` |
| 数据库 schema | `yonbip-fi-efa` |
| 所属应用 | `EFA` |
| 直连字段 | 61 个 |
| 子表 | 5 个 |
| 关联引用 | 15 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `FaLeaseChangeInterestList` | `EFA.lease.FaLeaseChangeInterest` | composition |
| `FaLeaseChangPaymentPlanList` | `EFA.lease.FaLeaseChangPaymentPlan` | composition |
| `FaLeaseChangeFinanceList` | `EFA.lease.FaLeaseChangeFinance` | composition |
| `FaLeaseChangePaymentRuleList` | `EFA.lease.FaLeaseChangePaymentRule` | composition |
| `FaLeaseChangeReduceList` | `EFA.lease.FaLeaseChangeReduce` | composition |

## 关联引用 (15个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `bill_trade_type_id` | `transtype.bd_billtyperef` |
| `ytenant_id` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref` |
| `` | `` |
| `asset_id` | `yonbip-fi-efa.fa_assetsquery_basic_ref` |
| `ori_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `tax_item_id` | `yonbip-fi-taxpubdoc.RefTable_839443ba26` |
| `bill_type_id` | `transtype.bd_billtypetreeref` |

## 继承接口 (1个, 5字段)

- **审批流接口** (`iuap.busiObj.ApprovalFlowItf`)
  - `auditnote` → `auditnote`
  - `auditor` → `auditor`
  - `audit_time` → `audit_time`
  - `procinst_id` → `procinst_id`
  - `verifystate` → `verifystate`

## 字段列表（按类型分组）

> 共 61 个直连字段

### 文本字段 (17个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `auditnote` | `auditnote` | `auditNote` | 审批批语 |
| `busi_post_failure_reason` | `busi_post_failure_reason` | `busiPostFailureReason` | 业务过账失败原因 |
| `change_content` | `change_content` | `changeContent` | 变更内容 |
| `code` | `code` | `code` | 编码 |
| `contract_no` | `contract_no` | `contractNo` | 合同号 |
| `daily_discount_rate_type` | `daily_discount_rate_type` | `dailyDiscountRateType` | 日折现率 |
| `discount_rate_type` | `discount_rate_type` | `discountRateType` | 期折现率计算方式 |
| `id` | `id` | `id` | 主键 |
| `interest_algorithm_type` | `interest_algorithm_type` | `interestAlgorithmType` | 利息计提算法 |
| `ori_app_id` | `ori_app_id` | `oriAppId` | 源头应用ID |
| `ori_bill_id` | `ori_bill_id` | `oriBillId` | 源头单据ID |
| `ori_bill_no` | `ori_bill_no` | `oriBillNo` | 源头单据号 |
| `ori_bill_trade_type_id` | `ori_bill_trade_type_id` | `oriBillTradeTypeId` | 源头交易类型 |
| `ori_bill_type_id` | `ori_bill_type_id` | `oriBillTypeId` | 源头单据类型ID |
| `procinst_id` | `procinst_id` | `procinstId` | 流程实例ID |
| `remarks` | `remarks` | `remarks` | 备注 |
| `bill_date` | `bill_date` | `vouchdate` | 单据日期 |

### 引用字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `asset_id` | `asset_id` | `assetId` | 固定资产卡片(系统) |
| `auditor` | `auditor` | `auditor` | 审批人 |
| `bill_trade_type_id` | `bill_trade_type_id` | `billTradeTypeId` | 交易类型 |
| `bill_type_id` | `bill_type_id` | `billTypeId` | 单据类型 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ori_currtype_id` | `ori_currtype_id` | `oriCurrtypeId` | 原币币种 |
| `tax_item_id` | `tax_item_id` | `taxItemId` | 税目 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `lease_end_date` | `lease_end_date` | `leaseEndDate` | 止租日期 |
| `lease_start_date` | `lease_start_date` | `leaseStartDate` | 起租日期 |
| `renewal_end_date` | `renewal_end_date` | `renewalEndDate` | 续租截止期 |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批日期 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_lease_reduce` | `bln_lease_reduce` | `blnLeaseReduce` | 租赁缩减 |
| `bln_period_start_zero` | `bln_period_start_zero` | `blnPeriodStartZero` | 折现期数从0起算 |
| `bln_purchase_option` | `bln_purchase_option` | `blnPurchaseOption` | 执行购买选择权 |
| `bln_renewal_option` | `bln_renewal_option` | `blnRenewalOption` | 执行续租选择权 |
| `bln_tax_deduction` | `bln_tax_deduction` | `blnTaxDeduction` | 税额可抵扣 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `busi_post_status` | `busi_post_status` | `busiPostStatus` | 业务过账过账状态 |
| `verifystate` | `verifystate` | `verifyState` | 单据状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `busi_post_version` | `busi_post_version` | `busiPostVersion` | 业务过账版本 |
| `tpl_id` | `tpl_id` | `tplId` | 模板ID |

### 数值字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `af_lease_payment` | `af_lease_payment` | `afLeasePayment` | 变更后租赁付款额 |
| `af_tax_amount` | `af_tax_amount` | `afTaxAmount` | 变更后税额 |
| `af_unconfirmed_fc_amount` | `af_unconfirmed_fc_amount` | `afUnconfirmedFcAmount` | 变更后未确认融资费用 |
| `be_lease_payment` | `be_lease_payment` | `beLeasePayment` | 变更前租赁付款额 |
| `be_tax_amount` | `be_tax_amount` | `beTaxAmount` | 变更前税额 |
| `be_unconfirmed_fc_amount` | `be_unconfirmed_fc_amount` | `beUnconfirmedFcAmount` | 变更前未确认融资费用 |
| `discount_month_rate` | `discount_month_rate` | `discountMonthRate` | 月折现率 |
| `discount_rate` | `discount_rate` | `discountRate` | 期折现率 |
| `discount_year_rate` | `discount_year_rate` | `discountYearRate` | 年折现率 |
| `purchase_price` | `purchase_price` | `purchasePrice` | 购买价格 |
| `reduce_rate` | `reduce_rate` | `reduceRate` | 缩减比例(%) |
| `tax_rate` | `tax_rate` | `taxRate` | 税率 |

### other (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `FaLeaseChangPaymentPlanList` | 使用权资产变更付款计划 |
| `` | `` | `FaLeaseChangeFinanceList` | 使用权资产变更财务信息 |
| `` | `` | `FaLeaseChangeInterestList` | 使用权资产变更利息明细 |
| `` | `` | `FaLeaseChangePaymentRuleList` | 使用权资产变更付款规则 |
| `` | `` | `FaLeaseChangeReduceList` | 使用权资产变更缩减项 |
