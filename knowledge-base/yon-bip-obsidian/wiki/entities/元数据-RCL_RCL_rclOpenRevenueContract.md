---
tags: [BIP, 元数据, 数据字典, RCL.RCL.rclOpenRevenueContract]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 期初履约义务主表 (`RCL.RCL.rclOpenRevenueContract`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcl_contract_h` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`0dcdcca0-a433-419f-8e06-38e109b5ba50`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 期初履约义务主表 |
| 物理表 | `rcl_contract_h` |
| 数据库 schema | `yonbip-fi-ercl` |
| 所属应用 | `RVN` |
| 直连字段 | 81 个 |
| 子表 | 10 个 |
| 关联引用 | 32 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `rclOpenExecuteSituationList` | `RCL.RCL.rclOpenExecuteSituation` | composition |
| `rclOpenAppointRecordList` | `RCL.RCL.rclOpenAppointRecord` | composition |
| `rclOpenContractChangeList` | `RCL.RCL.rclOpenContractChange` | composition |
| `rclOpenContractBaseInfoList` | `RCL.RCL.rclOpenContractBaseInfo` | composition |
| `rclOpenCriticalEventList` | `RCL.RCL.rclOpenCriticalEvent` | composition |
| `rclOpenExcuteStepList` | `RCL.RCL.rclOpenExcuteStep` | composition |
| `rclOpenContractReceiptPlanList` | `RCL.RCL.rclOpenContractReceiptPlan` | composition |
| `rclOpenReceiptPlanList` | `RCL.RCL.rclOpenReceiptPlan` | composition |
| `rclOpenPeriodExecuteSituationList` | `RCL.RCL.rclOpenPeriodExecuteSituation` | composition |
| `rclOpenPeriodPlanList` | `RCL.RCL.rclOpenPeriodPlan` | composition |

## 关联引用 (32个)

| 字段名 | 引用类型 |
|--------|---------|
| `contract_type` | `ucfbasedoc.bd_billtyperef` |
| `` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
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
| `bill_code` | `bill_code` | `billCode` | 单据编号 |
| `bill_date` | `bill_date` | `billDate` | 单据日期 |
| `code` | `code` | `code` | 编码 |
| `contract_code` | `contract_code` | `contractCode` | 合同号 |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | 分布式事务ID |
| `effect_date` | `effect_date` | `effectDate` | 生效日期 |
| `end_date` | `end_date` | `endDate` | 终止日期 |
| `exchange_rate_date` | `exchange_rate_date` | `exchangeRateDate` | 汇率日期 |
| `ext_src_bill_code` | `ext_src_bill_code` | `extSrcBillCode` | 来源单据编码(外) |
| `ext_src_systems` | `ext_src_systems` | `extSrcSystems` | 来源单据系统(外) |
| `link_version` | `link_version` | `linkVersion` | 联查版本 |
| `name` | `name` | `name` | 名称 |
| `origin_id` | `origin_id` | `originId` | 原始版本 |
| `sign_date` | `sign_date` | `signDate` | 签订日期 |
| `src_bill_action_info` | `src_bill_action_info` | `srcBillActionInfo` | 来源单据动作信息 |
| `src_bill_code` | `src_bill_code` | `srcBillCode` | 来源单据编号 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据ID |
| `src_system` | `src_system` | `srcSystem` | 来源应用 |
| `upper_version_contract_id` | `upper_version_contract_id` | `upperVersionContractId` | 上版本合同id |
| `auditnote` | `auditnote` | `auditNote` | 审批批语 |
| `procinst_id` | `procinst_id` | `procinstId` | 流程实例ID |
| `id` | `id` | `id` | 主键 |

### 引用字段 (21个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 会计主体 |
| `bill_type_id` | `bill_type_id` | `billTypeId` | 单据类型 |
| `contract_type` | `contract_type` | `contractType` | 交易类型 |
| `curr_type` | `curr_type` | `currType` | 币种 |
| `customer_id` | `customer_id` | `customerId` | 客户 |
| `dept_id` | `dept_id` | `deptId` | 部门 |
| `employee` | `employee` | `employee` | 人员 |
| `enable_period` | `enable_period` | `enablePeriod` | 启用期间 |
| `exchange_rate_type` | `exchange_rate_type` | `exchangeRateType` | 汇率类型 |
| `parent_id` | `parent_id` | `parentId` | 上级履约义务 |
| `project_id` | `project_id` | `projectId` | 项目 |
| `receive_agreement_id` | `receive_agreement_id` | `receiveAgreementId` | 收款协议 |
| `sale_area_id` | `sale_area_id` | `saleAreaId` | 销售区域 |
| `sign_org_id` | `sign_org_id` | `signOrgId` | 签约组织 |
| `src_bill_type` | `src_bill_type` | `srcBillType` | 来源单据类型 |
| `third_part_id` | `third_part_id` | `thirdPartId` | 第三方主体 |
| `auditor` | `auditor` | `auditor` | 审批人 |
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `check_date` | `check_date` | `checkDate` | 验收日期 |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_check` | `bln_check` | `blnCheck` | 是否验收 |
| `bln_latest` | `bln_latest` | `blnLatest` | 最新版本 |
| `bln_open_contract` | `bln_open_contract` | `blnOpenContract` | 是否敞口 |
| `bln_start_flag` | `bln_start_flag` | `blnStartFlag` | 期初标识 |
| `finance_comp_flag` | `finance_comp_flag` | `financeCompFlag` | 融资成分标识 |
| `bln_temp_save` | `bln_temp_save` | `blnTempSave` | 是否暂存态 |

### 枚举字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `verifystate` | `verifystate` | `verifyState` | 单据状态 |
| `change_type` | `change_type` | `changeType` | 变更方式 |
| `dtc_status` | `dtc_status` | `dtcStatus` | 分布式事务状态 |
| `exch_rate_ops` | `exch_rate_ops` | `exchRateOps` | 汇率折算方式 |
| `receipt_plan_dimension` | `receipt_plan_dimension` | `receiptPlanDimension` | 收款计划维度 |
| `src_bill_status` | `src_bill_status` | `srcBillStatus` | 来源单据状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exchange_rate` | `exchange_rate` | `exchangeRate` | 汇率 |
| `localmny` | `localmny` | `localmny` | 本币含税金额 |
| `localmny_notax` | `localmny_notax` | `localmnyNotax` | 本币无税金额 |
| `localmny_tax` | `localmny_tax` | `localmnyTax` | 本币税额 |
| `orimny` | `orimny` | `orimny` | 含税金额 |
| `orimny_notax` | `orimny_notax` | `orimnyNotax` | 无税金额 |
| `orimny_tax` | `orimny_tax` | `orimnyTax` | 税额 |
| `src_bill_version` | `src_bill_version` | `srcBillVersion` | 来源单据版本号 |
| `version` | `version` | `version` | 版本号 |

### other (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `rclOpenPeriodExecuteSituationList` | 期初分期执行情况 |
| `` | `` | `rclOpenExecuteSituationList` | 期初执行情况 |
| `` | `` | `rclOpenPeriodPlanList` | 期初分期收入计划 |
| `` | `` | `rclOpenReceiptPlanList` | 期初收款计划明细 |
| `` | `` | `rclOpenContractBaseInfoList` | 期初基本信息 |
| `` | `` | `rclOpenExcuteStepList` | 执行过程 |
| `` | `` | `rclOpenContractChangeList` | 期初变更历史 |
| `` | `` | `rclOpenContractReceiptPlanList` | 期初合同收款计划 |
| `` | `` | `rclOpenCriticalEventList` | 大事记 |
| `` | `` | `rclOpenAppointRecordList` | 期初履约记录 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 特征 |
