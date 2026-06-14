---
tags: [BIP, 元数据, 数据字典, RCL.RCL.rclOpenContractBaseInfo]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 期初基本信息 (`RCL.RCL.rclOpenContractBaseInfo`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcl_contract_b` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`0dcdcca0-a433-419f-8e06-38e109b5ba50`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 期初基本信息 |
| 物理表 | `rcl_contract_b` |
| domain/服务域 | `yonbip-fi-ercl` |
| schema | `fiercl` |
| 所属应用 | `RVN` |
| 直连字段 | 120 个 |
| 子表 | 2 个 |
| 关联引用 | 43 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `rclOpenContractBaseInfo_tradeConfirmRuleList` | `RCL.RCL.rclOpenContractBaseInfo_tradeConfirmRule` | composition |
| `rclOpenContractBaseInfo_incomeConfirmRuleList` | `RCL.RCL.rclOpenContractBaseInfo_incomeConfirmRule` | composition |

## 关联引用 (43个)

| 字段名 | 引用类型 |
|--------|---------|
| `expense_item_id` | `finbd.bd_expenseitemref` |
| `activity` | `` |
| `exchange_ratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `material_type_id` | `productcenter.pc_managementclassref` |
| `rel_revenuecontract_body_id` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `begin_apportion_period` | `finbd.bd_period` |
| `income_confirm_rule1` | `fiepub.fiepub_income_confirm_ref` |
| `tax_item` | `yonbip-fi-taxpubdoc.RefTable_55c5b82f11` |
| `income_confirm_rule2` | `fiepub.fiepub_income_confirm_ref` |
| `wbs` | `` |
| `standard_curr` | `ucfbasedoc.bd_currencytenantref` |
| `rel_revenuecontract_id` | `yonbip-fi-ercl.RefTable_da1e623072` |
| `rcl_revenuecontract_base_id` | `` |
| `receive_agreement_id` | `ucfbasedoc.bd_receiveagreementref` |
| `defer_income_confirm_rule` | `fiepub.fiepub_income_confirm_ref` |
| `trade_confirm_rule` | `fiepub.fiepub_receivable_confirm_ref` |
| `cost_center_id` | `finbd.bd_costcenterref` |
| `pre_submission_income_rule` | `fiepub.fiepub_income_confirm_ref` |
| `tax_rate_entity` | `yonbip-fi-taxpubdoc.RefTable_55c5b82f11` |
| `unit_id` | `productcenter.pc_unitref` |
| `currency` | `ucfbasedoc.bd_currencytenantref` |
| `income_confirm_rule` | `fiepub.fiepub_income_confirm_ref` |
| `trade_confirm_rule3` | `fiepub.fiepub_receivable_confirm_ref` |
| `trade_confirm_rule2` | `fiepub.fiepub_receivable_confirm_ref` |
| `procenter_id` | `ucf-org-center.bd_financeorgtreeref` |
| `trade_confirm_rule1` | `fiepub.fiepub_receivable_confirm_ref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `main_acc_book_base_info_id` | `yonbip-fi-ercl.RefTable_c75ebbb386` |
| `trade_confirm_rule5` | `fiepub.fiepub_receivable_confirm_ref` |
| `trade_confirm_rule4` | `fiepub.fiepub_receivable_confirm_ref` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `material_id` | `productcenter.pc_nomalproductref` |
| `primary_unit` | `productcenter.pc_unitref` |
| `opp_procenter_id` | `ucf-org-center.bd_financeorgtreeref` |
| `acc_book_id` | `fiepub.fiepub_accountbooktreeref` |
| `income_confirm_rule5` | `fiepub.fiepub_income_confirm_ref` |
| `income_confirm_rule3` | `fiepub.fiepub_income_confirm_ref` |
| `income_confirm_rule4` | `fiepub.fiepub_income_confirm_ref` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 120 个直连字段

### 文本字段 (32个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `asset` | `asset` | `asset` | 资产 |
| `begin_bill_body_id` | `begin_bill_body_id` | `beginBillBodyId` | 源头单据行ID |
| `begin_bill_id` | `begin_bill_id` | `beginBillId` | 源头单据主键 |
| `begin_bill_no` | `begin_bill_no` | `beginBillNo` | 源头单据编码 |
| `begin_billtype_code` | `begin_billtype_code` | `beginBilltypeCode` | 源头单据类型编码 |
| `begin_date` | `begin_date` | `beginDate` | 开始日期 |
| `begin_transtype_code` | `begin_transtype_code` | `beginTranstypeCode` | 源头交易类型编码 |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | 分布式事务ID |
| `end_date` | `end_date` | `endDate` | 截止日期 |
| `ext_begin_bill_id` | `ext_begin_bill_id` | `extBeginBillId` | 源头单据id(外) |
| `ext_begin_bill_no` | `ext_begin_bill_no` | `extBeginBillNo` | 源头单据编码(外) |
| `ext_begin_billtype_code` | `ext_begin_billtype_code` | `extBeginBilltypeCode` | 源头单据类型编码(外) |
| `ext_begin_body_id` | `ext_begin_body_id` | `extBeginBodyId` | 源头单据行id(外) |
| `ext_begin_transtype_code` | `ext_begin_transtype_code` | `extBeginTranstypeCode` | 源头交易类型编码(外) |
| `ext_src_bill_id` | `ext_src_bill_id` | `extSrcBillId` | 来源单据id(外) |
| `ext_src_billcode` | `ext_src_billcode` | `extSrcBillcode` | 来源单据编码(外) |
| `ext_src_billtype_code` | `ext_src_billtype_code` | `extSrcBilltypeCode` | 来源单据类型编码(外) |
| `ext_src_body_id` | `ext_src_body_id` | `extSrcBodyId` | 来源单据行id(外) |
| `ext_src_systems` | `ext_src_systems` | `extSrcSystems` | 来源单据系统(外) |
| `ext_src_transtype_code` | `ext_src_transtype_code` | `extSrcTranstypeCode` | 来源交易类型编码(外) |
| `match_code` | `match_code` | `matchCode` | 匹配码 |
| `memo` | `memo` | `memo` | 备注 |
| `origin_base_id` | `origin_base_id` | `originBaseId` | 原始履约义务基本信息 |
| `rel_match_code` | `rel_match_code` | `relMatchCode` | 关联匹配码 |
| `renewal_end_date` | `renewal_end_date` | `renewalEndDate` | 续租截止日期 |
| `rent_start_date` | `rent_start_date` | `rentStartDate` | 租金起算日期 |
| `src_bill_body_id` | `src_bill_body_id` | `srcBillBodyId` | 来源单据行ID |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据主键 |
| `src_bill_no` | `src_bill_no` | `srcBillNo` | 来源单据编码 |
| `src_billtype_code` | `src_billtype_code` | `srcBilltypeCode` | 来源单据类型编码 |
| `src_transtype_code` | `src_transtype_code` | `srcTranstypeCode` | 来源交易类型编码 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (38个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rcl_revenuecontract_base_id` | `rcl_revenuecontract_base_id` | `rclRevenuecontractBaseId` | 期初履约义务主表 |
| `activity` | `activity` | `activity` | 活动 |
| `wbs` | `wbs` | `wbs` | WBS |
| `begin_apportion_period` | `begin_apportion_period` | `beginApportionPeriod` | 开始分摊期间 |
| `cost_center_id` | `cost_center_id` | `costCenterId` | 成本中心 |
| `currency` | `currency` | `currency` | 币种 |
| `defer_income_confirm_rule` | `defer_income_confirm_rule` | `deferIncomeConfirmRule` | 递延收入确认规则 |
| `exchange_ratetype` | `exchange_ratetype` | `exchangeRatetype` | 汇率类型 |
| `expense_item_id` | `expense_item_id` | `expenseItemId` | 费用项目 |
| `income_confirm_rule1` | `income_confirm_rule1` | `incomeConfirmRule1` | 收入确认规则1 |
| `income_confirm_rule2` | `income_confirm_rule2` | `incomeConfirmRule2` | 收入确认规则2 |
| `income_confirm_rule3` | `income_confirm_rule3` | `incomeConfirmRule3` | 收入确认规则3 |
| `income_confirm_rule4` | `income_confirm_rule4` | `incomeConfirmRule4` | 收入确认规则4 |
| `income_confirm_rule5` | `income_confirm_rule5` | `incomeConfirmRule5` | 收入确认规则5 |
| `material_id` | `material_id` | `materialId` | 物料 |
| `material_type_id` | `material_type_id` | `materialTypeId` | 物料类别 |
| `opp_procenter_id` | `opp_procenter_id` | `oppProcenterId` | 对方利润中心 |
| `pre_submission_income_rule` | `pre_submission_income_rule` | `preSubmissionIncomeRule` | 预提收入规则 |
| `primary_unit` | `primary_unit` | `primaryUnit` | 主计量单位 |
| `procenter_id` | `procenter_id` | `procenterId` | 利润中心 |
| `project_id` | `project_id` | `projectId` | 项目 |
| `receive_agreement_id` | `receive_agreement_id` | `receiveAgreementId` | 收款协议 |
| `rel_revenuecontract_body_id` | `rel_revenuecontract_body_id` | `relRevenuecontractBodyId` | 关联履约义务行 |
| `rel_revenuecontract_id` | `rel_revenuecontract_id` | `relRevenuecontractId` | 关联履约义务 |
| `standard_curr` | `standard_curr` | `standardCurr` | 本位币 |
| `tax_item` | `tax_item` | `taxItem` | 税目 |
| `tax_rate_entity` | `tax_rate_entity` | `taxRateEntity` | 税目税率 |
| `trade_confirm_rule1` | `trade_confirm_rule1` | `tradeConfirmRule1` | 应收确认规则1 |
| `trade_confirm_rule2` | `trade_confirm_rule2` | `tradeConfirmRule2` | 应收确认规则2 |
| `trade_confirm_rule3` | `trade_confirm_rule3` | `tradeConfirmRule3` | 应收确认规则3 |
| `trade_confirm_rule4` | `trade_confirm_rule4` | `tradeConfirmRule4` | 应收确认规则4 |
| `trade_confirm_rule5` | `trade_confirm_rule5` | `tradeConfirmRule5` | 应收确认规则5 |
| `unit_id` | `unit_id` | `unitId` | 计量单位 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |
| `acc_book_id` | `acc_book_id` | `accBook` | 账簿 |
| `main_acc_book_base_info_id` | `main_acc_book_base_info_id` | `mainAccBookBaseInfoId` | 主账簿基本信息行ID |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `check_date` | `check_date` | `checkDate` | 验收日期 |
| `exchange_rate_date` | `exchange_rate_date` | `exchangeRateDate` | 汇率日期 |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `handle_date` | `handle_date` | `handleDate` | 经办日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_check` | `bln_check` | `blnCheck` | 是否验收 |
| `discount_periods_start_from_zero` | `discount_periods_start_from_zero` | `discountPeriodsStartFromZero` | 折现期数从0起算 |
| `exercise_purchase_option` | `exercise_purchase_option` | `exercisePurchaseOption` | 执行购买选择权 |
| `exercise_renewal_option` | `exercise_renewal_option` | `exerciseRenewalOption` | 执行续租选择权 |
| `finance_comp_flag` | `finance_comp_flag` | `financeCompFlag` | 融资成分标识 |
| `write_back_order_status` | `write_back_order_status` | `writeBackOrderStatus` | 回写销售订单行状态 |

### 枚举字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `charge_off_method` | `charge_off_method` | `chargeOffMethod` | 预提回冲方式 |
| `dtc_status` | `dtc_status` | `dtcStatus` | 分布式事务状态 |
| `exch_rate_ops` | `exch_rate_ops` | `exchRateOps` | 汇率折算方式 |
| `interest_accrual_algorithm` | `interest_accrual_algorithm` | `interestAccrualAlgorithm` | 利息计提算法 |
| `period_discount_rate_method` | `period_discount_rate_method` | `periodDiscountRateMethod` | 期折现率计算方式 |
| `post_status` | `post_status` | `postStatus` | 过账状态 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `apportion_num` | `apportion_num` | `apportionNum` | 分摊期数 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `confirm_id` | `confirm_id` | `confirmId` | 确认ID |

### 数值字段 (24个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `annual_discount_rate` | `annual_discount_rate` | `annualDiscountRate` | 年折现率 |
| `exchange_rate` | `exchange_rate` | `exchangeRate` | 汇率 |
| `exp_profit_margin` | `exp_profit_margin` | `expProfitMargin` | 成本加成比例 |
| `expected_gross_profit` | `expected_gross_profit` | `expectedGrossProfit` | 预计毛利率 |
| `finance_income` | `finance_income` | `financeIncome` | 融资收益 |
| `lease_incentive_amount` | `lease_incentive_amount` | `leaseIncentiveAmount` | 租赁激励金额 |
| `local_finance_income` | `local_finance_income` | `localFinanceIncome` | 本币融资收益 |
| `local_unitprice` | `local_unitprice` | `localUnitprice` | 本币含税单价 |
| `local_unitprice_notax` | `local_unitprice_notax` | `localUnitpriceNotax` | 本币无税单价 |
| `localmny` | `localmny` | `localmny` | 本币含税金额 |
| `localmny_notax` | `localmny_notax` | `localmnyNotax` | 本币无税金额 |
| `localmny_tax` | `localmny_tax` | `localmnyTax` | 本币税额 |
| `ori_unitprice` | `ori_unitprice` | `oriUnitprice` | 含税单价 |
| `ori_unitprice_notax` | `ori_unitprice_notax` | `oriUnitpriceNotax` | 无税单价 |
| `orimny` | `orimny` | `orimny` | 含税金额 |
| `orimny_notax` | `orimny_notax` | `orimnyNotax` | 无税金额 |
| `orimny_tax` | `orimny_tax` | `orimnyTax` | 税额 |
| `primary_num` | `primary_num` | `primaryNum` | 主计量数量 |
| `purchase_price` | `purchase_price` | `purchasePrice` | 购买价格 |
| `quantity` | `quantity` | `quantity` | 数量 |
| `ratio` | `ratio` | `ratio` | 比例 |
| `row_no` | `row_no` | `rowNo` | 行号 |
| `src_bill_row_no` | `src_bill_row_no` | `srcBillRowNo` | 来源单据行号 |
| `tax_rate` | `tax_rate` | `taxRate` | 税率 |

### quoteList (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `income_confirm_rule` | `income_confirm_rule` | `incomeConfirmRule` | 收入确认规则 |
| `trade_confirm_rule` | `trade_confirm_rule` | `tradeConfirmRule` | 应收确认规则 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 特征 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `rclOpenContractBaseInfo_tradeConfirmRuleList` | rclOpenContractBaseInfo_tradeConfirmRule |
| `` | `` | `rclOpenContractBaseInfo_incomeConfirmRuleList` | rclOpenContractBaseInfo_incomeConfirmRule |
