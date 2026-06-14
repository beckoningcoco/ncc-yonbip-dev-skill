---
tags: [BIP, 元数据, 数据字典, RCL.RCL.rclRevenueContractBase]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 履约义务主表父实体 (`RCL.RCL.rclRevenueContractBase`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcl_contract_h` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`bac05af3-16cf-4b3b-97c1-208a96ae37f2`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 履约义务主表父实体 |
| 物理表 | `rcl_contract_h` |
| domain/服务域 | `yonbip-fi-ercl` |
| schema | `fiercl` |
| 所属应用 | `RVN` |
| 直连字段 | 74 个 |
| 子表 | 9 个 |
| 关联引用 | 29 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `rclReceiptPlanBaseList` | `RCL.RCL.rclReceiptPlanBase` | composition |
| `rclAppointRecordBaseList` | `RCL.RCL.rclAppointRecordBase` | composition |
| `rclPeriodPlanBaseList` | `RCL.RCL.rclPeriodPlanBase` | composition |
| `rclPeriodExecuteSituationBaseList` | `RCL.RCL.rclPeriodExecuteSituationBase` | composition |
| `rclContractChangeBaseList` | `RCL.RCL.rclContractChangeBase` | composition |
| `rclExcuteStepBaseList` | `RCL.RCL.rclExcuteStepBase` | composition |
| `rclContractBaseInfoBaseList` | `RCL.RCL.rclContractBaseInfoBase` | composition |
| `rclExecuteSituationBaseList` | `RCL.RCL.rclExecuteSituationBase` | composition |
| `rclCriticalEventBaseList` | `RCL.RCL.rclCriticalEventBase` | composition |

## 关联引用 (29个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `contract_type` | `ucfbasedoc.bd_billtyperef` |
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
| `dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `src_bill_type` | `ucfbasedoc.bd_billtypetreeref` |
| `parent_id` | `` |
| `exchange_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `third_part_id` | `yssupplier.aa_vendor` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |

## 继承接口 (5个, 7字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **币种** (`ecc.revaladjust.ICurrency`)

## 字段列表（按类型分组）

> 共 74 个直连字段

### 文本字段 (20个)

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
| `id` | `id` | `id` | 主键 |

### 引用字段 (19个)

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
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `check_date` | `check_date` | `checkDate` | 验收日期 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_temp_save` | `bln_temp_save` | `blnTempSave` | 是否暂存态 |
| `bln_check` | `bln_check` | `blnCheck` | 是否验收 |
| `bln_latest` | `bln_latest` | `blnLatest` | 最新版本 |
| `bln_open_contract` | `bln_open_contract` | `blnOpenContract` | 是否敞口 |
| `bln_start_flag` | `bln_start_flag` | `blnStartFlag` | 期初标识 |
| `finance_comp_flag` | `finance_comp_flag` | `financeCompFlag` | 融资成分标识 |

### 枚举字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `change_type` | `change_type` | `changeType` | 变更方式 |
| `dtc_status` | `dtc_status` | `dtcStatus` | 分布式事务状态 |
| `receipt_plan_dimension` | `receipt_plan_dimension` | `receiptPlanDimension` | 收款计划维度 |
| `src_bill_status` | `src_bill_status` | `srcBillStatus` | 来源单据状态 |
| `exch_rate_ops` | `exch_rate_ops` | `exchRateOps` | 汇率折算方式 |

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

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 特征 |

### other (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `rclContractBaseInfoBaseList` | 基本信息父实体 |
| `` | `` | `rclPeriodPlanBaseList` | 分期收入计划父实体 |
| `` | `` | `rclAppointRecordBaseList` | 履约记录父实体 |
| `` | `` | `rclReceiptPlanBaseList` | 收款计划父实体 |
| `` | `` | `rclExecuteSituationBaseList` | 执行情况父实体 |
| `` | `` | `rclPeriodExecuteSituationBaseList` | 分期执行情况父实体 |
| `` | `` | `rclExcuteStepBaseList` | 执行过程父实体 |
| `` | `` | `rclContractChangeBaseList` | 变更历史父实体 |
| `` | `` | `rclCriticalEventBaseList` | 大事记父实体 |
