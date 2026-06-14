---
tags: [BIP, 元数据, 数据字典, RVN.RVN.rvnRevenueBillBody]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 收入确认单子表 (`RVN.RVN.rvnRevenueBillBody`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rvn_revenuebill_b` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`25063173-63c6-4559-acc7-1a47b0509bc2`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 收入确认单子表 |
| 物理表 | `rvn_revenuebill_b` |
| domain/服务域 | `yonbip-fi-ercl` |
| schema | `fiercl` |
| 所属应用 | `RVN` |
| 直连字段 | 134 个 |
| 子表 | 0 个 |
| 关联引用 | 37 个 |

## 关联引用 (37个)

| 字段名 | 引用类型 |
|--------|---------|
| `begin_bill_type` | `ucfbasedoc.bd_billtypetreeref` |
| `expense_item_id` | `finbd.bd_expenseitemref` |
| `glb_tax_exchange_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `ori_currency` | `ucfbasedoc.bd_currencytenantref` |
| `pro_center` | `ucf-org-center.bd_financeorgtreeref` |
| `activity` | `` |
| `revenue_contract_body_id` | `` |
| `material_type_id` | `productcenter.pc_managementclassref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `begin_bill_trade_type` | `ucfbasedoc.bd_billtyperef` |
| `wbs` | `` |
| `charge_off_start_period` | `finbd.bd_period` |
| `employee` | `ucf-staff-center.bd_staff_all_ref` |
| `charge_off_end_period` | `finbd.bd_period` |
| `org_tax_exchange_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `con_tax_exchange_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `customer_id` | `productcenter.aa_invoicemerchantref` |
| `unit_id` | `productcenter.pc_unitref` |
| `revenue_contract_id` | `` |
| `src_bill_trade_type` | `ucfbasedoc.bd_billtyperef` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `con_currency` | `ucfbasedoc.bd_currencytenantref` |
| `cost_center` | `finbd.bd_costcenterref` |
| `dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `charged_off_period` | `finbd.bd_period` |
| `material_id` | `productcenter.pc_nomalproductref` |
| `src_app` | `fiepub.fiepub_sourceapplicationref` |
| `src_bill_type` | `ucfbasedoc.bd_billtypetreeref` |
| `exchange_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `tax_rate` | `yonbip-fi-taxpubdoc.RefTable_55c5b82f11` |
| `opp_pro_center` | `ucf-org-center.bd_financeorgtreeref` |
| `grp_tax_exchange_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `rvn_revenuebill_id` | `` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |
| `caculate_rule` | `fiepub.fiepub_income_confirm_ref` |

## 继承接口 (4个, 8字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 134 个直连字段

### 文本字段 (26个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `begin_bill_body_id` | `begin_bill_body_id` | `beginBillBodyId` | 源头单据行ID |
| `begin_bill_id` | `begin_bill_id` | `beginBillId` | 源头单据ID |
| `begin_bill_no` | `begin_bill_no` | `beginBillNo` | 源头单据号 |
| `charge_off_bill_no` | `charge_off_bill_no` | `chargeOffBillNo` | 回冲单据号 |
| `charged_off_bill_id` | `charged_off_bill_id` | `chargedOffBillId` | 回冲单据id |
| `charged_off_row_id` | `charged_off_row_id` | `chargedOffRowId` | 回冲单据行id |
| `charged_off_row_no` | `charged_off_row_no` | `chargedOffRowNo` | 回冲单据行 |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | 分布式事务id |
| `dtc_status` | `dtc_status` | `dtcStatus` | 分布式事务状态 |
| `ext_begin_bill_id` | `ext_begin_bill_id` | `extBeginBillId` | 源头单据id(外) |
| `ext_begin_bill_no` | `ext_begin_bill_no` | `extBeginBillNo` | 源头单据编码(外) |
| `ext_begin_billtype_code` | `ext_begin_billtype_code` | `extBeginBilltypeBode` | 源头单据类型编码(外) |
| `ext_begin_body_id` | `ext_begin_body_id` | `extBeginBodyId` | 源头单据行id(外) |
| `ext_begin_transtype_code` | `ext_begin_transtype_code` | `extBeginTranstypeCode` | 源头交易类型编码(外) |
| `ext_src_bill_id` | `ext_src_bill_id` | `extSrcBillId` | 来源单据id(外) |
| `ext_src_billcode` | `ext_src_billcode` | `extSrcBillcode` | 来源单据编码(外) |
| `ext_src_billtype_code` | `ext_src_billtype_code` | `extSrcBilltypeCode` | 来源单据类型编码(外) |
| `ext_src_body_id` | `ext_src_body_id` | `extSrcBodyId` | 来源单据行id(外) |
| `ext_src_systems` | `ext_src_systems` | `extSrcSystems` | 来源单据系统(外) |
| `ext_src_transtype_code` | `ext_src_transtype_code` | `extSrcTranstypeCode` | 来源交易类型编码(外) |
| `material_code` | `material_code` | `materialCode` | 物料编码 |
| `revenue_contract_bill_no` | `revenue_contract_bill_no` | `revenueContractBillNo` | 履约义务单据号 |
| `src_bill_body_id` | `src_bill_body_id` | `srcBillBodyId` | 来源单据行ID |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据ID |
| `src_bill_no` | `src_bill_no` | `srcBillNo` | 来源单据号 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (36个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `begin_bill_trade_type` | `begin_bill_trade_type` | `beginBillTradeType` | 源头交易类型 |
| `begin_bill_type` | `begin_bill_type` | `beginBillType` | 源头单据类型 |
| `caculate_rule` | `caculate_rule` | `caculateRule` | 计算规则 |
| `charge_off_end_period` | `charge_off_end_period` | `chargeOffEndPeriod` | 回冲截止期间 |
| `charge_off_start_period` | `charge_off_start_period` | `chargeOffStartPeriod` | 回冲开始期间 |
| `charged_off_period` | `charged_off_period` | `chargedOffPeriod` | 被回冲期间 |
| `con_currency` | `con_currency` | `conCurrency` | 合同币 |
| `con_tax_exchange_rate_type` | `con_tax_exchange_rate_type` | `conTaxExchangeRateType` | 合同币汇率类型 |
| `cost_center` | `cost_center` | `costCenter` | 成本中心 |
| `customer_id` | `customer_id` | `customerId` | 客户 |
| `dept_id` | `dept_id` | `deptId` | 部门 |
| `employee` | `employee` | `employee` | 业务员 |
| `exchange_rate_type` | `exchange_rate_type` | `exchangeRateType` | 汇率类型 |
| `expense_item_id` | `expense_item_id` | `expenseItemId` | 费用项目 |
| `glb_tax_exchange_rate_type` | `glb_tax_exchange_rate_type` | `glbTaxExchangeRateType` | 全局币汇率类型 |
| `grp_tax_exchange_rate_type` | `grp_tax_exchange_rate_type` | `grpTaxExchangeRateType` | 集团币汇率类型 |
| `material_id` | `material_id` | `materialId` | 物料 |
| `material_type_id` | `material_type_id` | `materialTypeId` | 物料类别 |
| `opp_pro_center` | `opp_pro_center` | `oppProCenter` | 对方利润中心 |
| `org_tax_exchange_rate_type` | `org_tax_exchange_rate_type` | `orgTaxExchangeRateType` | 组织币汇率类型 |
| `ori_currency` | `ori_currency` | `oriCurrency` | 币种 |
| `pro_center` | `pro_center` | `proCenter` | 利润中心 |
| `project_id` | `project_id` | `projectId` | 项目 |
| `revenue_contract_body_id` | `revenue_contract_body_id` | `revenueContractBodyId` | 履约义务行ID |
| `revenue_contract_id` | `revenue_contract_id` | `revenueContractId` | 履约义务ID |
| `rvn_revenuebill_id` | `rvn_revenuebill_id` | `rvnRevenueBill_id` | 收入确认单 |
| `src_app` | `src_app` | `srcApp` | 来源应用 |
| `src_bill_trade_type` | `src_bill_trade_type` | `srcBillTradeType` | 来源交易类型 |
| `src_bill_type` | `src_bill_type` | `srcBillType` | 来源单据类型 |
| `tax_rate` | `tax_rate` | `taxRate` | 税率 |
| `unit_id` | `unit_id` | `unitId` | 计量单位 |
| `activity` | `activity` | `activity` | 活动 |
| `wbs` | `wbs` | `wbs` | WBS |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

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

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pre_submission_identify` | `pre_submission_identify` | `preSubmissionIdentify` | 预提标识 |

### 枚举字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `adjust_type` | `adjust_type` | `adjustType` | 调整类型 |
| `charge_off_method` | `charge_off_method` | `chargeOffMethod` | 预提回冲方式 |
| `con_exch_rate_ops` | `con_exch_rate_ops` | `conExchRateOps` | 合同币汇率折算方式 |
| `confirm_status` | `confirm_status` | `confirmStatus` | 确认状态 |
| `create_type` | `create_type` | `createType` | 生成方式 |
| `exch_rate_ops` | `exch_rate_ops` | `exchRateOps` | 汇率折算方式 |
| `glb_exch_rate_ops` | `glb_exch_rate_ops` | `glbExchRateOps` | 全局币汇率折算方式 |
| `grp_exch_rate_ops` | `grp_exch_rate_ops` | `grpExchRateOps` | 集团币汇率折算方式 |
| `org_exch_rate_ops` | `org_exch_rate_ops` | `orgExchRateOps` | 组织币汇率折算方式 |
| `post_status` | `post_status` | `postStatus` | 过账状态 |
| `pre_submission_chargeoff_type` | `pre_submission_chargeoff_type` | `preSubmissionChargeoffType` | 预提回冲类型 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (54个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `appoint_record` | `appoint_record` | `appointRecord` | 履约进度 |
| `base_row_no` | `base_row_no` | `baseRowNo` | 履约义务行 |
| `con_tax_amount` | `con_tax_amount` | `conTaxAmount` | 合同币税额 |
| `con_tax_exchange_rate` | `con_tax_exchange_rate` | `conTaxExchangeRate` | 合同币汇率 |
| `con_tax_excluded_amount` | `con_tax_excluded_amount` | `conTaxExcludedAmount` | 合同币无税金额 |
| `con_tax_included_amount` | `con_tax_included_amount` | `conTaxIncludedAmount` | 合同币含税金额 |
| `cur_period_confirm_exclude_tax` | `cur_period_confirm_exclude_tax` | `curPeriodConfirmExcludeTax` | 本次收入(无税) |
| `cur_period_confirm_include_tax` | `cur_period_confirm_include_tax` | `curPeriodConfirmIncludeTax` | 本次收入(含税) |
| `cur_period_process` | `cur_period_process` | `curPeriodProcess` | 本次进度 |
| `exchange_rate` | `exchange_rate` | `exchangeRate` | 汇率 |
| `glb_tax_amount` | `glb_tax_amount` | `glbTaxAmount` | 全局币税额 |
| `glb_tax_exchange_rate` | `glb_tax_exchange_rate` | `glbTaxExchangeRate` | 全局币汇率 |
| `glb_tax_excluded_amount` | `glb_tax_excluded_amount` | `glbTaxExcludedAmount` | 全局币无税金额 |
| `glb_tax_included_amount` | `glb_tax_included_amount` | `glbTaxIncludedAmount` | 全局币含税金额 |
| `grp_tax_amount` | `grp_tax_amount` | `grpTaxAmount` | 集团币税额 |
| `grp_tax_exchange_rate` | `grp_tax_exchange_rate` | `grpTaxExchangeRate` | 集团币汇率 |
| `grp_tax_excluded_amount` | `grp_tax_excluded_amount` | `grpTaxExcludedAmount` | 集团币无税金额 |
| `grp_tax_included_amount` | `grp_tax_included_amount` | `grpTaxIncludedAmount` | 集团币含税金额 |
| `local_chargeoff_income_exclude_tax` | `local_chargeoff_income_exclude_tax` | `localChargeoffIncomeExcludeTax` | 本币回冲无税收入 |
| `local_chargeoff_income_exclude_tax_tobe` | `local_chargeoff_income_exclude_tax_tobe` | `localChargeoffIncomeExcludeTaxTobe` | 本币待回冲无税收入 |
| `local_chargeoff_income_include_tax` | `local_chargeoff_income_include_tax` | `localChargeoffIncomeIncludeTax` | 本币回冲含税收入 |
| `local_chargeoff_income_include_tax_tobe` | `local_chargeoff_income_include_tax_tobe` | `localChargeoffIncomeIncludeTaxTobe` | 本币待回冲含税收入 |
| `local_chargeoff_income_tax` | `local_chargeoff_income_tax` | `localChargeoffIncomeTax` | 本币回冲税额 |
| `local_chargeoff_income_tax_tobe` | `local_chargeoff_income_tax_tobe` | `localChargeoffIncomeTaxTobe` | 本币待回冲税额 |
| `local_cur_period_exclude_tax` | `local_cur_period_exclude_tax` | `localCurPeriodExcludeTax` | 本币本次收入(无税) |
| `local_cur_period_include_tax` | `local_cur_period_include_tax` | `localCurPeriodIncludeTax` | 本币本次收入(含税) |
| `local_cur_period_tax` | `local_cur_period_tax` | `localCurPeriodTax` | 本币本次税额 |
| `local_total_income_exclude_tax` | `local_total_income_exclude_tax` | `localTotalIncomeExcludeTax` | 本币累计收入(无税) |
| `local_total_income_include_tax` | `local_total_income_include_tax` | `localTotalIncomeIncludeTax` | 本币累计收入(含税) |
| `local_total_tax` | `local_total_tax` | `localTotalTax` | 本币累计税额 |
| `org_tax_amount` | `org_tax_amount` | `orgTaxAmount` | 组织币税额 |
| `org_tax_exchange_rate` | `org_tax_exchange_rate` | `orgTaxExchangeRate` | 组织币汇率 |
| `org_tax_excluded_amount` | `org_tax_excluded_amount` | `orgTaxExcludedAmount` | 组织币无税金额 |
| `org_tax_included_amount` | `org_tax_included_amount` | `orgTaxIncludedAmount` | 组织币含税金额 |
| `ori_chargeoff_income_exclude_tax` | `ori_chargeoff_income_exclude_tax` | `oriChargeoffIncomeExcludeTax` | 回冲无税收入 |
| `ori_chargeoff_income_exclude_tax_tobe` | `ori_chargeoff_income_exclude_tax_tobe` | `oriChargeoffIncomeExcludeTaxTobe` | 待回冲无税收入 |
| `ori_chargeoff_income_include_tax` | `ori_chargeoff_income_include_tax` | `oriChargeoffIncomeIncludeTax` | 回冲含税收入 |
| `ori_chargeoff_income_include_tax_tobe` | `ori_chargeoff_income_include_tax_tobe` | `oriChargeoffIncomeIncludeTaxTobe` | 待回冲含税收入 |
| `ori_chargeoff_income_tax` | `ori_chargeoff_income_tax` | `oriChargeoffIncomeTax` | 回冲税额 |
| `ori_chargeoff_income_tax_tobe` | `ori_chargeoff_income_tax_tobe` | `oriChargeoffIncomeTaxTobe` | 待回冲税额 |
| `ori_tax_amount` | `ori_tax_amount` | `oriTaxAmount` | 本次税额 |
| `ori_tax_excluded_price` | `ori_tax_excluded_price` | `oriTaxExcludedPrice` | 无税单价 |
| `ori_tax_included_price` | `ori_tax_included_price` | `oriTaxIncludedPrice` | 含税单价 |
| `quantity` | `quantity` | `quantity` | 数量 |
| `save_local_total_income_exclude_tax` | `save_local_total_income_exclude_tax` | `saveLocalTotalIncomeExcludeTax` | 保存本币累计收入(无税) |
| `save_local_total_income_include_tax` | `save_local_total_income_include_tax` | `saveLocalTotalIncomeIncludeTax` | 保存本币累计收入(含税) |
| `save_local_total_tax` | `save_local_total_tax` | `saveLocalTotalTax` | 保存本币累计税额 |
| `save_total_income_exclude_tax` | `save_total_income_exclude_tax` | `saveTotalIncomeExcludeTax` | 保存累计收入(无税) |
| `save_total_income_include_tax` | `save_total_income_include_tax` | `saveTotalIncomeIncludeTax` | 保存累计收入(含税) |
| `save_total_tax` | `save_total_tax` | `saveTotalTax` | 保存累计税额 |
| `tax_rate_number` | `tax_rate_number` | `taxRateNumber` | 税率值 |
| `total_income_exclude_tax` | `total_income_exclude_tax` | `totalIncomeExcludeTax` | 累计收入(无税) |
| `total_income_include_tax` | `total_income_include_tax` | `totalIncomeIncludeTax` | 累计收入(含税) |
| `total_tax` | `total_tax` | `totalTax` | 累计税额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 特征 |
