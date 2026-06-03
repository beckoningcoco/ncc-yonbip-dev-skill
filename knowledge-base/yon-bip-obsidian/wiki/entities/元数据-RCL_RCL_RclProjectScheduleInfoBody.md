---
tags: [BIP, 元数据, 数据字典, RCL.RCL.RclProjectScheduleInfoBody]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 项目进度信息子表 (`RCL.RCL.RclProjectScheduleInfoBody`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcl_projectscheduleinfo_b` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`fd37321e-7bb4-45a8-85bf-07ed2d52cf52`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 项目进度信息子表 |
| 物理表 | `rcl_projectscheduleinfo_b` |
| 数据库 schema | `yonbip-fi-ercl` |
| 所属应用 | `RVN` |
| 直连字段 | 71 个 |
| 子表 | 0 个 |
| 关联引用 | 20 个 |

## 关联引用 (20个)

| 字段名 | 引用类型 |
|--------|---------|
| `rcl_project_scheduleinfo_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `activity` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ori_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `wbs` | `` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `accentity` | `` |
| `exchange_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `src_billtype` | `ucfbasedoc.bd_billtypetreeref` |
| `acc_book_id` | `fiepub.fiepub_accountbooktreeref` |
| `ori_system` | `fiepub.fiepub_sourceapplicationref` |
| `rcl_revenue_contract_id` | `` |
| `ori_bill_type` | `ucfbasedoc.bd_billtypetreeref` |
| `ori_trans_type` | `ucfbasedoc.bd_billtyperef` |
| `rcl_revenue_contract_base_info_id` | `` |
| `src_transtype` | `ucfbasedoc.bd_billtyperef` |
| `tax_rate_id` | `yonbip-fi-taxpubdoc.RefTable_55c5b82f11` |
| `src_system` | `fiepub.fiepub_sourceapplicationref` |

## 继承接口 (6个, 21字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **业务流多来源** (`iuap.busiObj.BusinessFlowSourcesItf`)
  - `firstbusiobj` → `firstbusiobj`
  - `firstchild_id` → `firstchild_id`
  - `firstcode` → `firstcode`
  - `first_id` → `first_id`
  - `sourcegrand_id` → `sourcegrand_id`
- **业务流基础** (`iuap.busiObj.BusinessFlowItf`)
  - `bizflow_id` → `bizflow_id`
  - `bizflowinstance_id` → `bizflowinstance_id`
  - `bizflow_makebillcode` → `bizflow_makebillcode`
  - `bizflowname` → `bizflowname`
  - `sourcebusiobj` → `sourcebusiobj`
  - `sourcechild_id` → `sourcechild_id`
  - `sourcecode` → `sourcecode`
  - `source_id` → `source_id`
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 71 个直连字段

### 文本字段 (32个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ext_ori_bill_id` | `ext_ori_bill_id` | `extOriBillId` | 源头单据id(外) |
| `ext_ori_bill_no` | `ext_ori_bill_no` | `extOriBillNo` | 源头单据编码(外) |
| `ext_ori_bill_row_id` | `ext_ori_bill_row_id` | `extOriBillRowId` | 源头单据行id(外) |
| `ext_ori_billtype_code` | `ext_ori_billtype_code` | `extOriBilltypeCode` | 源头单据类型编码(外) |
| `ext_ori_transtype_code` | `ext_ori_transtype_code` | `extOriTransTypeCode` | 源头交易类型编码(外) |
| `ext_src_bill_id` | `ext_src_bill_id` | `extSrcBillId` | 来源单据id(外) |
| `ext_src_bill_no` | `ext_src_bill_no` | `extSrcBillNo` | 来源单据号(外) |
| `ext_src_bill_row_id` | `ext_src_bill_row_id` | `extSrcBillRowId` | 来源单据行id(外) |
| `ext_src_billtype_code` | `ext_src_billtype_code` | `extSrcBilltypeCode` | 来源单据类型编码(外) |
| `ext_src_system` | `ext_src_system` | `extSrcSystem` | 来源系统(外) |
| `ext_src_transtype_code` | `ext_src_transtype_code` | `extSrcTranstypeCode` | 来源交易类型编码(外) |
| `ori_bill_id` | `ori_bill_id` | `oriBillId` | 源头单据ID |
| `ori_bill_no` | `ori_bill_no` | `oriBillNo` | 源头单据号 |
| `ori_bill_row_id` | `ori_bill_row_id` | `oriBillRowId` | 源头单据行ID |
| `rcl_revenue_contract_no` | `rcl_revenue_contract_no` | `rclRevenueContractNo` | 履约义务单据号 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据ID |
| `src_bill_no` | `src_bill_no` | `srcBillNo` | 来源单据号 |
| `src_bill_row_id` | `src_bill_row_id` | `srcBillRowId` | 来源单据行ID |
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

### 引用字段 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_book_id` | `acc_book_id` | `accBook` | 账簿 |
| `accentity` | `accentity` | `accentity` | 会计主体 |
| `exchange_rate_type` | `exchange_rate_type` | `exchangeRateType` | 汇率类型 |
| `ori_bill_type` | `ori_bill_type` | `oriBillType` | 源头单据类型 |
| `ori_currency_id` | `ori_currency_id` | `oriCurrencyId` | 币种 |
| `ori_system` | `ori_system` | `oriSystem` | 源头系统 |
| `ori_trans_type` | `ori_trans_type` | `oriTransType` | 源头交易类型 |
| `rcl_project_scheduleinfo_id` | `rcl_project_scheduleinfo_id` | `rclProjectScheduleInfoId` | 项目进度信息主表 |
| `rcl_revenue_contract_base_info_id` | `rcl_revenue_contract_base_info_id` | `rclRevenueContractBaseInfoId` | 履约义务行ID |
| `rcl_revenue_contract_id` | `rcl_revenue_contract_id` | `rclRevenueContractId` | 履约义务 |
| `src_billtype` | `src_billtype` | `srcBilltype` | 来源单据类型 |
| `src_system` | `src_system` | `srcSystem` | 来源应用 |
| `src_transtype` | `src_transtype` | `srcTranstype` | 来源交易类型 |
| `tax_rate_id` | `tax_rate_id` | `taxRateId` | 税率(%) |
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

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exch_rate_ops` | `exch_rate_ops` | `exchRateOps` | 汇率折算方式 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_cost` | `acc_cost` | `accCost` | 累计成本 |
| `pre_cost` | `pre_cost` | `preCost` | 预计成本 |
| `pre_liability` | `pre_liability` | `preLiability` | 预计负债 |
| `exchange_rate` | `exchange_rate` | `exchangeRate` | 汇率 |
| `localmny` | `localmny` | `localmny` | 本币含税金额 |
| `localmny_notax` | `localmny_notax` | `localmnyNotax` | 本币无税金额 |
| `localmny_tax` | `localmny_tax` | `localmnyTax` | 本币税额 |
| `orimny` | `orimny` | `orimny` | 含税金额 |
| `orimny_notax` | `orimny_notax` | `orimnyNoTax` | 无税金额 |
| `orimny_tax` | `orimny_tax` | `orimnyTax` | 税额 |
| `schedule_ratio` | `schedule_ratio` | `scheduleRatio` | 进度比例 |
| `tax_rate` | `tax_rate` | `taxRate` | 税率 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 特征 |

### bigText (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `write_back_fail_reason` | `write_back_fail_reason` | `writeBackFailReason` | 回写履约义务失败原因 |
