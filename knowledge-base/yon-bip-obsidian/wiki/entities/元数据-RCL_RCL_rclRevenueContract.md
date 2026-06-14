---
tags: [BIP, 元数据, 数据字典, RCL.RCL.rclRevenueContract]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 履约义务主表 (`RCL.RCL.rclRevenueContract`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcl_contract_h` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`29a1c8eb-18f3-4f82-b4a8-2d20ae258702`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 履约义务主表 |
| 物理表 | `rcl_contract_h` |
| domain/服务域 | `yonbip-fi-ercl` |
| schema | `fiercl` |
| 所属应用 | `RVN` |
| 直连字段 | 81 个 |
| 子表 | 10 个 |
| 关联引用 | 32 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `rclExecuteSituationList` | `RCL.RCL.rclExecuteSituation` | composition |
| `rclPeriodPlanList` | `RCL.RCL.rclPeriodPlan` | composition |
| `rclContractBaseInfoList` | `RCL.RCL.rclContractBaseInfo` | composition |
| `rclPeriodExecuteSituationList` | `RCL.RCL.rclPeriodExecuteSituation` | composition |
| `rclCriticalEventList` | `RCL.RCL.rclCriticalEvent` | composition |
| `rclReceiptPlanList` | `RCL.RCL.rclReceiptPlan` | composition |
| `rclContractReceiptPlanList` | `RCL.RCL.rclContractReceiptPlan` | composition |
| `rclContractChangeList` | `RCL.RCL.rclContractChange` | composition |
| `rclExcuteStepList` | `RCL.RCL.rclExcuteStep` | composition |
| `rclAppointRecordList` | `RCL.RCL.rclAppointRecord` | composition |

## 关联引用 (32个)

| 字段名 | 引用类型 |
|--------|---------|
| `contract_type` | `ucfbasedoc.bd_billtyperef` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `curr_type` | `ucfbasedoc.bd_currencytenantref` |
| `employee` | `ucf-staff-center.bd_staff_all_ref` |
| `receive_agreement_id` | `ucfbasedoc.bd_receiveagreementref` |
| `accentity` | `ucf-org-center.bd_financeorgtreeref` |
| `sale_area_id` | `productcenter.aa_salearearef` |
| `customer_id` | `productcenter.aa_invoicemerchantref` |
| `enable_period` | `finbd.bd_period` |
| `sign_org_id` | `ucf-org-center.bd_salesorg` |
| `bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `src_bill_type` | `ucfbasedoc.bd_billtypetreeref` |
| `bustype` | `ucfbasedoc.bd_billtyperef` |
| `parent_id` | `` |
| `exchange_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `third_part_id` | `yssupplier.aa_vendor` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |

## 继承接口 (3个, 7字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **审批流接口** (`iuap.busiObj.ApprovalFlowItf`)
  - `auditnote` → `auditnote`
  - `auditor` → `auditor`
  - `audit_time` → `audit_time`
  - `procinst_id` → `procinst_id`
  - `verifystate` → `verifystate`
- **交易类型** (`iuap.busiObj.BustypeItf`)
  - `bustype` → `bustype`

## 字段列表（按类型分组）

> 共 81 个直连字段

### 文本字段 (22个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `src_bill_action_info` | `src_bill_action_info` | `srcBillActionInfo` | 来源单据动作信息 |
| `id` | `id` | `id` | 主键 |
| `end_date` | `end_date` | `endDate` | 终止日期 |
| `sign_date` | `sign_date` | `signDate` | 签订日期 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据ID |
| `ext_src_bill_code` | `ext_src_bill_code` | `extSrcBillCode` | 来源单据编码(外) |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | 分布式事务ID |
| `bill_date` | `bill_date` | `billDate` | 单据日期 |
| `link_version` | `link_version` | `linkVersion` | 联查版本 |
| `name` | `name` | `name` | 名称 |
| `src_system` | `src_system` | `srcSystem` | 来源应用 |
| `ext_src_systems` | `ext_src_systems` | `extSrcSystems` | 来源单据系统(外) |
| `code` | `code` | `code` | 编码 |
| `upper_version_contract_id` | `upper_version_contract_id` | `upperVersionContractId` | 上版本合同id |
| `origin_id` | `origin_id` | `originId` | 原始版本 |
| `src_bill_code` | `src_bill_code` | `srcBillCode` | 来源单据编号 |
| `effect_date` | `effect_date` | `effectDate` | 生效日期 |
| `bill_code` | `bill_code` | `billCode` | 单据编号 |
| `exchange_rate_date` | `exchange_rate_date` | `exchangeRateDate` | 汇率日期 |
| `contract_code` | `contract_code` | `contractCode` | 合同号 |
| `procinst_id` | `procinst_id` | `procinstId` | 流程实例ID |
| `auditnote` | `auditnote` | `auditNote` | 审批批语 |

### 引用字段 (21个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contract_type` | `contract_type` | `contractType` | 交易类型 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `employee` | `employee` | `employee` | 人员 |
| `receive_agreement_id` | `receive_agreement_id` | `receiveAgreementId` | 收款协议 |
| `accentity` | `accentity` | `accentity` | 会计主体 |
| `sale_area_id` | `sale_area_id` | `saleAreaId` | 销售区域 |
| `sign_org_id` | `sign_org_id` | `signOrgId` | 签约组织 |
| `dept_id` | `dept_id` | `deptId` | 部门 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |
| `src_bill_type` | `src_bill_type` | `srcBillType` | 来源单据类型 |
| `project_id` | `project_id` | `projectId` | 项目 |
| `curr_type` | `curr_type` | `currType` | 币种 |
| `customer_id` | `customer_id` | `customerId` | 客户 |
| `enable_period` | `enable_period` | `enablePeriod` | 启用期间 |
| `bill_type_id` | `bill_type_id` | `billTypeId` | 单据类型 |
| `creator` | `creator` | `creator` | 创建人 |
| `parent_id` | `parent_id` | `parentId` | 上级履约义务 |
| `exchange_rate_type` | `exchange_rate_type` | `exchangeRateType` | 汇率类型 |
| `third_part_id` | `third_part_id` | `thirdPartId` | 第三方主体 |
| `auditor` | `auditor` | `auditor` | 审批人 |
| `bustype` | `bustype` | `bustype` | 交易类型 |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `check_date` | `check_date` | `checkDate` | 验收日期 |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批日期 |

### 布尔字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_open_contract` | `bln_open_contract` | `blnOpenContract` | 是否敞口 |
| `finance_comp_flag` | `finance_comp_flag` | `financeCompFlag` | 融资成分标识 |
| `bln_latest` | `bln_latest` | `blnLatest` | 最新版本 |
| `bln_start_flag` | `bln_start_flag` | `blnStartFlag` | 期初标识 |
| `bln_check` | `bln_check` | `blnCheck` | 是否验收 |
| `bln_temp_save` | `bln_temp_save` | `blnTempSave` | 是否暂存态 |

### 枚举字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `change_type` | `change_type` | `changeType` | 变更方式 |
| `src_bill_status` | `src_bill_status` | `srcBillStatus` | 来源单据状态 |
| `receipt_plan_dimension` | `receipt_plan_dimension` | `receiptPlanDimension` | 收款计划维度 |
| `exch_rate_ops` | `exch_rate_ops` | `exchRateOps` | 汇率折算方式 |
| `dtc_status` | `dtc_status` | `dtcStatus` | 分布式事务状态 |
| `verifystate` | `verifystate` | `verifyState` | 单据状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `src_bill_version` | `src_bill_version` | `srcBillVersion` | 来源单据版本号 |
| `exchange_rate` | `exchange_rate` | `exchangeRate` | 汇率 |
| `localmny_notax` | `localmny_notax` | `localmnyNotax` | 本币无税金额 |
| `version` | `version` | `version` | 版本号 |
| `orimny_notax` | `orimny_notax` | `orimnyNotax` | 无税金额 |
| `orimny` | `orimny` | `orimny` | 含税金额 |
| `localmny_tax` | `localmny_tax` | `localmnyTax` | 本币税额 |
| `orimny_tax` | `orimny_tax` | `orimnyTax` | 税额 |
| `localmny` | `localmny` | `localmny` | 本币含税金额 |

### other (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `rclReceiptPlanList` | 收款计划明细 |
| `` | `` | `rclAppointRecordList` | 履约记录 |
| `` | `` | `rclPeriodExecuteSituationList` | 分期执行情况 |
| `` | `` | `rclExecuteSituationList` | 执行情况 |
| `` | `` | `rclContractReceiptPlanList` | 收款计划 |
| `` | `` | `rclContractBaseInfoList` | 基本信息 |
| `` | `` | `rclPeriodPlanList` | 分期收入计划 |
| `` | `` | `rclExcuteStepList` | 执行过程 |
| `` | `` | `rclContractChangeList` | 变更历史 |
| `` | `` | `rclCriticalEventList` | 大事记 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 特征 |
