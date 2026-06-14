---
tags: [BIP, 元数据, 数据字典, RCL.RCL.RclRecConfirmInfoBody]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户确认信息子表 (`RCL.RCL.RclRecConfirmInfoBody`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcl_recconfirminfo_b` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`eda3ce95-8f5c-4342-850c-26312538b844`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 客户确认信息子表 |
| 物理表 | `rcl_recconfirminfo_b` |
| domain/服务域 | `yonbip-fi-ercl` |
| schema | `fiercl` |
| 所属应用 | `RVN` |
| 直连字段 | 112 个 |
| 子表 | 0 个 |
| 关联引用 | 31 个 |

## 关联引用 (31个)

| 字段名 | 引用类型 |
|--------|---------|
| `expense_item_id` | `finbd.bd_expenseitemref` |
| `ori_currency` | `ucfbasedoc.bd_currencytenantref` |
| `activity` | `` |
| `other_pro_center_id` | `finbd.bd_allaccbodyref_inner` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `contract_currency` | `ucfbasedoc.bd_currencytenantref` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |
| `wbs` | `` |
| `src_trans_type` | `ucfbasedoc.bd_billtyperef` |
| `profit_center_id` | `finbd.bd_allaccbodyref_inner` |
| `rcl_contract_base_info` | `` |
| `ori_trans_type` | `ucfbasedoc.bd_billtyperef` |
| `tax_rate_id` | `yonbip-fi-taxpubdoc.RefTable_55c5b82f11` |
| `customer_confirm_end_period` | `finbd.bd_period` |
| `customer_confirm_start_period` | `finbd.bd_period` |
| `rcl_contract_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `org_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `cost_center_id` | `finbd.bd_costcenterref` |
| `contract_cur_exchange_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `staff_id` | `ucf-staff-center.bd_staff_all_ref` |
| `dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `free_ch_id` | `` |
| `rcl_recconfirminfo_h_id` | `` |
| `ytenant_id` | `` |
| `src_bill_type` | `ucfbasedoc.bd_billtypetreeref` |
| `exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `master_unit_id` | `productcenter.pc_unitref` |
| `unit_id` | `productcenter.pc_unitref` |
| `material_id` | `productcenter.pc_nomalproductref` |
| `ori_bill_type` | `ucfbasedoc.bd_billtypetreeref` |

## 继承接口 (6个, 21字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`
- **业务流基础** (`iuap.busiObj.BusinessFlowItf`)
  - `bizflow_id` → `bizflow_id`
  - `bizflowinstance_id` → `bizflowinstance_id`
  - `bizflow_makebillcode` → `bizflow_makebillcode`
  - `bizflowname` → `bizflowname`
  - `sourcebusiobj` → `sourcebusiobj`
  - `sourcechild_id` → `sourcechild_id`
  - `sourcecode` → `sourcecode`
  - `source_id` → `source_id`
- **业务流多来源** (`iuap.busiObj.BusinessFlowSourcesItf`)
  - `firstbusiobj` → `firstbusiobj`
  - `firstchild_id` → `firstchild_id`
  - `firstcode` → `firstcode`
  - `first_id` → `first_id`
  - `sourcegrand_id` → `sourcegrand_id`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 112 个直连字段

### 文本字段 (45个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contract_code` | `contract_code` | `contractCode` | 履约义务单据号 |
| `contract_detail_id` | `contract_detail_id` | `contractDetailId` | 履约义务行ID |
| `contract_id` | `contract_id` | `contractId` | 履约义务ID |
| `cost_center_code` | `cost_center_code` | `costCenterCode` | 成本中心编码 |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | 分布式事务ID |
| `error_msg` | `error_msg` | `errorMsg` | 回写履约义务失败原因 |
| `exchange_rate_type_code` | `exchange_rate_type_code` | `exchangeRateTypeCode` | 汇率类型编码 |
| `expense_item_code` | `expense_item_code` | `expenseItemCode` | 费用项目编码 |
| `ext_ori_bill_id` | `ext_ori_bill_id` | `extOriBillId` | 源头单据id(外) |
| `ext_ori_bill_no` | `ext_ori_bill_no` | `extOriBillNo` | 源头单据编码(外) |
| `ext_ori_billtype_code` | `ext_ori_billtype_code` | `extOriBillTypeCode` | 源头单据类型编码(外) |
| `ext_ori_body_id` | `ext_ori_body_id` | `extOriBodyId` | 源头单据行id(外) |
| `ext_ori_transtype_code` | `ext_ori_transtype_code` | `extOriTransTypeCode` | 源头交易类型编码(外) |
| `ext_src_bill_code` | `ext_src_bill_code` | `extSrcBillCode` | 来源单据编码(外) |
| `ext_src_bill_id` | `ext_src_bill_id` | `extSrcBillId` | 来源单据id(外) |
| `ext_src_billtype_code` | `ext_src_billtype_code` | `extSrcBilltypeCode` | 来源单据类型编码(外) |
| `ext_src_body_id` | `ext_src_body_id` | `extSrcBodyId` | 来源单据行id(外) |
| `ext_src_systems` | `ext_src_systems` | `extSrcSystems` | 来源单据系统(外) |
| `ext_src_transtype_code` | `ext_src_transtype_code` | `extSrcTranstypeCode` | 来源交易类型编码(外) |
| `material_code` | `material_code` | `materialCode` | 物料编码 |
| `ori_bill_detail_id` | `ori_bill_detail_id` | `oriBillDetailId` | 源头单据行ID |
| `ori_bill_id` | `ori_bill_id` | `oriBillId` | 源头单据ID |
| `ori_code` | `ori_code` | `oriCode` | 源头单据号 |
| `other_pro_center_code` | `other_pro_center_code` | `otherProCenterCode` | 对方利润中心编码 |
| `profit_center_code` | `profit_center_code` | `profitCenterCode` | 利润中心编码 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `src_bill_detail_id` | `src_bill_detail_id` | `srcBillDetailId` | 来源单据行ID |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据ID |
| `src_code` | `src_code` | `srcCode` | 来源单据号 |
| `tax_subject` | `tax_subject` | `taxSubject` | 税目 |
| `tax_subject_code` | `tax_subject_code` | `taxSubjectCode` | 税目编码 |
| `id` | `id` | `id` | 主键 |
| `bizflowinstance_id` | `bizflowinstance_id` | `bizFlowInstanceId` | 业务流实例id |
| `bizflow_makebillcode` | `bizflow_makebillcode` | `bizFlowMakeBillCode` | 单据转换规则编码 |
| `bizflow_id` | `bizflow_id` | `bizflowId` | 业务流id |
| `bizflowname` | `bizflowname` | `bizflowName` | 流程名称 |
| `sourcebusiobj` | `sourcebusiobj` | `sourceBusiObj` | 上游业务对象 |
| `sourcechild_id` | `sourcechild_id` | `sourceChildId` | 上游单据子表id |
| `sourcecode` | `sourcecode` | `sourceCode` | 上游单据号 |
| `source_id` | `source_id` | `sourceId` | 上游单据主表id |
| `firstbusiobj` | `firstbusiobj` | `firstBusiObj` | 来源业务对象 |
| `firstchild_id` | `firstchild_id` | `firstChildId` | 来源单据子表id |
| `firstcode` | `firstcode` | `firstCode` | 来源单据号 |
| `first_id` | `first_id` | `firstId` | 来源单据主表id |
| `sourcegrand_id` | `sourcegrand_id` | `sourceGrandId` | 来源孙表id |

### 引用字段 (30个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contract_cur_exchange_rate_type` | `contract_cur_exchange_rate_type` | `contractCurExchangeRateType` | 合同币汇率类型 |
| `contract_currency` | `contract_currency` | `contractCurrency` | 合同币 |
| `cost_center_id` | `cost_center_id` | `costCenter` | 成本中心 |
| `customer_confirm_end_period` | `customer_confirm_end_period` | `customerConfirmEndPeriod` | 客户确认截止期间 |
| `customer_confirm_start_period` | `customer_confirm_start_period` | `customerConfirmStartPeriod` | 客户确认开始期间 |
| `dept_id` | `dept_id` | `dept` | 部门 |
| `exchange_rate_type_id` | `exchange_rate_type_id` | `exchangeRateType` | 汇率类型 |
| `expense_item_id` | `expense_item_id` | `expenseItem` | 费用项目 |
| `master_unit_id` | `master_unit_id` | `masterUnitId` | 主计量单位 |
| `material_id` | `material_id` | `material` | 物料 |
| `org_currtype_id` | `org_currtype_id` | `orgCurrtype` | 本位币 |
| `ori_bill_type` | `ori_bill_type` | `oriBillType` | 源头单据类型 |
| `ori_currency` | `ori_currency` | `oriCurrency` | 币种 |
| `ori_trans_type` | `ori_trans_type` | `oriTransType` | 源头交易类型 |
| `other_pro_center_id` | `other_pro_center_id` | `otherProCenter` | 对方利润中心 |
| `profit_center_id` | `profit_center_id` | `profitCenter` | 利润中心 |
| `project_id` | `project_id` | `project` | 项目 |
| `rcl_contract_id` | `rcl_contract_id` | `rclContract` | 履约义务信息 |
| `rcl_contract_base_info` | `rcl_contract_base_info` | `rclContractBaseInfo` | 履约义务基本信息行 |
| `rcl_recconfirminfo_h_id` | `rcl_recconfirminfo_h_id` | `rclRecConfirmInfoHeader_id` | 客户确认信息主表 |
| `src_bill_type` | `src_bill_type` | `srcBillType` | 来源单据类型 |
| `src_trans_type` | `src_trans_type` | `srcTransType` | 来源交易类型 |
| `staff_id` | `staff_id` | `staff` | 业务员 |
| `tax_rate_id` | `tax_rate_id` | `taxRateId` | 税率(%) |
| `unit_id` | `unit_id` | `unit` | 单位 |
| `activity` | `activity` | `activity` | 活动 |
| `wbs` | `wbs` | `wbs` | WBS |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exchange_rate_date` | `exchange_rate_date` | `exchangeRateDate` | 汇率日期 |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `source_bill_ts` | `source_bill_ts` | `sourceBillTs` | 来源单据ts |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 枚举字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `con_exch_rate_ops` | `con_exch_rate_ops` | `conExchRateOps` | 合同币汇率折算方式 |
| `dtc_status` | `dtc_status` | `dtcStatus` | 分布式事务状态 |
| `exch_rate_ops` | `exch_rate_ops` | `exchRateOps` | 汇率折算方式 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (27个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `confirm_rate` | `confirm_rate` | `confirmRate` | 客户确认比率 |
| `contract_cur_exchange_rate` | `contract_cur_exchange_rate` | `contractCurExchangeRate` | 合同币汇率 |
| `contract_cur_money` | `contract_cur_money` | `contractCurMoney` | 合同币含税金额 |
| `contract_cur_no_tax_money` | `contract_cur_no_tax_money` | `contractCurNoTaxMoney` | 合同币无税金额 |
| `contract_cur_tax` | `contract_cur_tax` | `contractCurTax` | 合同币税额 |
| `diff_qty` | `diff_qty` | `diffQty` | 差异数量 |
| `exchange_rate` | `exchange_rate` | `exchangeRate` | 汇率 |
| `local_money` | `local_money` | `localMoney` | 本币含税金额 |
| `local_price` | `local_price` | `localPrice` | 本币含税单价 |
| `local_tax` | `local_tax` | `localTax` | 本币税额 |
| `localmny_chargeoff` | `localmny_chargeoff` | `localmnyChargeoff` | 本币回冲含税金额 |
| `localmny_chargeoff_notax` | `localmny_chargeoff_notax` | `localmnyChargeoffNotax` | 本币回冲无税金额 |
| `localmny_chargeoff_tax` | `localmny_chargeoff_tax` | `localmnyChargeoffTax` | 本币回冲税额 |
| `master_unit_qty` | `master_unit_qty` | `masterUnitQty` | 主计量数量 |
| `money` | `money` | `money` | 含税金额 |
| `no_tax_local_money` | `no_tax_local_money` | `noTaxLocalMoney` | 本币无税金额 |
| `no_tax_local_price` | `no_tax_local_price` | `noTaxLocalPrice` | 本币无税单价 |
| `no_tax_money` | `no_tax_money` | `noTaxMoney` | 无税金额 |
| `no_tax_price` | `no_tax_price` | `noTaxPrice` | 无税单价 |
| `orimny_chargeoff` | `orimny_chargeoff` | `orimnyChargeoff` | 回冲含税金额 |
| `orimny_chargeoff_notax` | `orimny_chargeoff_notax` | `orimnyChargeoffNotax` | 回冲无税金额 |
| `orimny_chargeoff_tax` | `orimny_chargeoff_tax` | `orimnyChargeoffTax` | 回冲税额 |
| `price` | `price` | `price` | 含税单价 |
| `quantity` | `quantity` | `quantity` | 数量 |
| `rcl_revenue_contract_version` | `rcl_revenue_contract_version` | `rclRevenueContractVersion` | 履约义务版本号 |
| `tax` | `tax` | `tax` | 税额 |
| `tax_rate` | `tax_rate` | `taxRate` | 税率 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 特征 |
