---
tags: [BIP, 元数据, 数据字典, RVN.RVN.RclOutboundInfoBody]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 出库信息子表 (`RVN.RVN.RclOutboundInfoBody`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcl_outboundinfo_b` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`9b3513e7-ab6c-4a80-8e3f-a5d452e54ab1`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 出库信息子表 |
| 物理表 | `rcl_outboundinfo_b` |
| 数据库 schema | `yonbip-fi-ercl` |
| 所属应用 | `RVN` |
| 直连字段 | 89 个 |
| 子表 | 0 个 |
| 关联引用 | 26 个 |

## 关联引用 (26个)

| 字段名 | 引用类型 |
|--------|---------|
| `activity` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ori_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `wbs` | `` |
| `employee` | `ucf-staff-center.bd_staff_all_ref` |
| `accentity` | `` |
| `src_billtype` | `ucfbasedoc.bd_billtyperef` |
| `ori_system` | `fiepub.fiepub_sourceapplicationref` |
| `cost_center_id` | `finbd.bd_costcenterref` |
| `unit_id` | `productcenter.pc_unitref` |
| `ori_trans_type` | `ucfbasedoc.bd_billtyperef` |
| `src_transtype` | `ucfbasedoc.bd_billtyperef` |
| `tax_rate_id` | `yonbip-fi-taxpubdoc.RefTable_55c5b82f11` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `pro_center_Id` | `ucf-org-center.bd_financeorgtreeref` |
| `rcl_outboundinfo_id` | `` |
| `main_measurement_unit` | `productcenter.pc_unitref` |
| `dept` | `ucf-org-center.org_unit_tree_ref` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `material_id` | `productcenter.pc_nomalproductref` |
| `exchange_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `opp_procenter_id` | `ucf-org-center.bd_financeorgtreeref` |
| `ori_bill_type` | `ucfbasedoc.bd_billtypetreeref` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |
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

> 共 89 个直连字段

### 文本字段 (40个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cost_center_code` | `cost_center_code` | `costCenterCode` | 成本中心编码 |
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
| `opp_procenter_code` | `opp_procenter_code` | `oppProcenterCode` | 对方利润中心编码 |
| `ori_bill_id` | `ori_bill_id` | `oriBillId` | 源头单据ID |
| `ori_bill_no` | `ori_bill_no` | `oriBillNo` | 源头单据号 |
| `ori_bill_row_id` | `ori_bill_row_id` | `oriBillRowId` | 源头单据行ID |
| `pro_center_code` | `pro_center_code` | `proCenterCode` | 利润中心编码 |
| `rcl_revenue_contract_base_info_id` | `rcl_revenue_contract_base_info_id` | `rclRevenueContractBaseInfoId` | 履约义务行ID |
| `rcl_revenue_contract_base_info_no` | `rcl_revenue_contract_base_info_no` | `rclRevenueContractBaseInfoNo` | 履约义务行号 |
| `rcl_revenue_contract_id` | `rcl_revenue_contract_id` | `rclRevenueContractId` | 履约义务ID |
| `rcl_revenue_contract_name` | `rcl_revenue_contract_name` | `rclRevenueContractName` | 履约义务名称 |
| `rcl_revenue_contract_no` | `rcl_revenue_contract_no` | `rclRevenueContractNo` | 履约义务单据号 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据ID |
| `src_bill_no` | `src_bill_no` | `srcBillNo` | 来源单据号 |
| `src_bill_row_id` | `src_bill_row_id` | `srcBillRowId` | 来源单据行ID |
| `write_sale_out_result` | `write_sale_out_result` | `writeSaleOutResult` | 回写销售出库_已生成收入出库信息 |
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

### 引用字段 (25个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 会计主体 |
| `cost_center_id` | `cost_center_id` | `costCenterId` | 成本中心 |
| `dept` | `dept` | `dept` | 部门 |
| `employee` | `employee` | `employee` | 业务员 |
| `exchange_rate_type` | `exchange_rate_type` | `exchangeRateType` | 汇率类型 |
| `main_measurement_unit` | `main_measurement_unit` | `mainMeasurementUnit` | 主计量单位 |
| `material_id` | `material_id` | `materialId` | 物料 |
| `opp_procenter_id` | `opp_procenter_id` | `oppProcenterId` | 对方利润中心 |
| `ori_bill_type` | `ori_bill_type` | `oriBillType` | 源头单据类型 |
| `ori_currency_id` | `ori_currency_id` | `oriCurrencyId` | 币种 |
| `ori_system` | `ori_system` | `oriSystem` | 源头系统 |
| `ori_trans_type` | `ori_trans_type` | `oriTransType` | 源头交易类型 |
| `pro_center_Id` | `pro_center_Id` | `proCenterId` | 利润中心 |
| `project_id` | `project_id` | `projectId` | 项目 |
| `rcl_outboundinfo_id` | `rcl_outboundinfo_id` | `rclOutboundInfoId` | 出库信息主表 |
| `src_billtype` | `src_billtype` | `srcBilltype` | 来源单据类型 |
| `src_system` | `src_system` | `srcSystem` | 来源应用 |
| `src_transtype` | `src_transtype` | `srcTranstype` | 来源交易类型 |
| `tax_rate_id` | `tax_rate_id` | `taxRateId` | 税率(%) |
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
| `rev_manage_calculate` | `rev_manage_calculate` | `checkByRevenueManagement` | 收入管理核算 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exch_rate_ops` | `exch_rate_ops` | `exchRateOps` | 汇率折算方式 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exchange_rate` | `exchange_rate` | `exchangeRate` | 汇率 |
| `local_unitprice` | `local_unitprice` | `localUnitprice` | 本币无税单价 |
| `local_unitprice_notax` | `local_unitprice_notax` | `localUnitpriceNotax` | 本币含税单价 |
| `localmny` | `localmny` | `localmny` | 本币含税金额 |
| `localmny_notax` | `localmny_notax` | `localmnyNotax` | 本币无税金额 |
| `localmny_tax` | `localmny_tax` | `localmnyTax` | 本币税额 |
| `main_measurement_quantity` | `main_measurement_quantity` | `mainMeasurementQuantity` | 主计量数量 |
| `ori_unitprice` | `ori_unitprice` | `oriUnitprice` | 含税单价 |
| `ori_unitprice_notax` | `ori_unitprice_notax` | `oriUnitpriceNotax` | 无税单价 |
| `orimny` | `orimny` | `orimny` | 含税金额 |
| `orimny_notax` | `orimny_notax` | `orimnyNoTax` | 无税金额 |
| `orimny_tax` | `orimny_tax` | `orimnyTax` | 税额 |
| `quantity` | `quantity` | `quantity` | 数量 |
| `rcl_revenue_contract_version` | `rcl_revenue_contract_version` | `rclRevenueContractVersion` | 履约义务版本号 |
| `tax_rate` | `tax_rate` | `taxRate` | 税率 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 特征 |

### bigText (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `write_back_failure_reason` | `write_back_failure_reason` | `writeBackFailureReason` | 回写履约义务失败原因 |
