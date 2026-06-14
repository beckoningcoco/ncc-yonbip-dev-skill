---
tags: [BIP, 元数据, 数据字典, RCL.RCL.rclAppointRecordBase]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 履约记录父实体 (`RCL.RCL.rclAppointRecordBase`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcl_appoint_r` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`bac05af3-16cf-4b3b-97c1-208a96ae37f2`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 履约记录父实体 |
| 物理表 | `rcl_appoint_r` |
| domain/服务域 | `yonbip-fi-ercl` |
| schema | `fiercl` |
| 所属应用 | `RVN` |
| 直连字段 | 81 个 |
| 子表 | 0 个 |
| 关联引用 | 17 个 |

## 关联引用 (17个)

| 字段名 | 引用类型 |
|--------|---------|
| `period` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `activity` | `` |
| `calculate_rule_id` | `fiepub.fiepub_income_confirm_ref` |
| `exchange_ratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `wbs` | `` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `material_id` | `productcenter.baseProductRef` |
| `rcl_revenuecontract_base_id` | `` |
| `base_info_id` | `yonbip-fi-ercl.RefTable_c75ebbb386` |
| `acc_book_id` | `fiepub.fiepub_accountbooktreeref` |
| `receive_type_id` | `finbd.bd_paymenttyperef` |
| `unit_id` | `productcenter.pc_unitref_new` |
| `currency` | `ucfbasedoc.bd_currencytenantref` |
| `project_id` | `ucfbasedoc.bd_projectNewRef` |

## 继承接口 (4个, 8字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 81 个直连字段

### 文本字段 (29个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `src_bill_version` | `src_bill_version` | `srcBillVersion` | 来源单据版本 |
| `src_bill_no` | `src_bill_no` | `srcBillNo` | 来源单据编号 |
| `ori_transtype_code` | `ori_transtype_code` | `oriTranstypeCode` | 源头交易类型编码 |
| `ext_begin_body_id` | `ext_begin_body_id` | `extBeginBodyId` | 源头单据行id(外) |
| `ext_begin_bill_no` | `ext_begin_bill_no` | `extBeginBillNo` | 源头单据编码(外) |
| `ori_billtype_code` | `ori_billtype_code` | `oriBilltypeCode` | 源头单据类型编码 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据主键 |
| `ext_src_transtype_code` | `ext_src_transtype_code` | `extSrcTranstypeCode` | 来源交易类型编码(外) |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | 分布式事务ID |
| `ext_begin_billtype_code` | `ext_begin_billtype_code` | `extBeginBilltypeCode` | 源头单据类型编码(外) |
| `ori_body_id` | `ori_body_id` | `oriBodyId` | 源头单据行id |
| `ext_src_billcode` | `ext_src_billcode` | `extSrcBillcode` | 来源单据编码(外) |
| `ext_src_body_id` | `ext_src_body_id` | `extSrcBodyId` | 来源单据行id(外) |
| `src_bill_body_id` | `src_bill_body_id` | `srcBillBodyId` | 来源单据行主键 |
| `ext_src_systems` | `ext_src_systems` | `extSrcSystems` | 来源单据系统(外) |
| `ext_src_billtype_code` | `ext_src_billtype_code` | `extSrcBillTypeCode` | 来源单据类型编码(外) |
| `ext_src_bill_id` | `ext_src_bill_id` | `extSrcBillId` | 来源单据id(外) |
| `src_billtype_code` | `src_billtype_code` | `srcBilltypeCode` | 来源单据类型编码 |
| `receiptplan_body_id` | `receiptplan_body_id` | `receiptplanBodyId` | 收款计划行主键 |
| `ori_bill_no` | `ori_bill_no` | `oriBillNo` | 源头单据编号 |
| `receiptplan_id` | `receiptplan_id` | `receiptplanId` | 收款计划主键 |
| `src_transtype_code` | `src_transtype_code` | `srcTranstypeCode` | 来源交易类型编码 |
| `business_plugin_code` | `business_plugin_code` | `businessPluginCode` | 业务插件编码 |
| `ext_begin_bill_id` | `ext_begin_bill_id` | `extBeginBillId` | 源头单据id(外) |
| `ori_bill_id` | `ori_bill_id` | `oriBillId` | 源头单据id |
| `src_receiptplan_id` | `src_receiptplan_id` | `srcReceiptplanId` | 来源收款计划主键 |
| `ext_begin_transtype_code` | `ext_begin_transtype_code` | `extBeginTranstypeCode` | 源头交易类型编码(外) |
| `contract_code` | `contract_code` | `contractCode` | 合同号 |

### 引用字段 (16个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_book_id` | `acc_book_id` | `accBook` | 账簿 |
| `activity` | `activity` | `activity` | 活动 |
| `wbs` | `wbs` | `wbs` | WBS |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |
| `calculate_rule_id` | `calculate_rule_id` | `calculateRuleId` | 计算规则 |
| `period` | `period` | `period` | 期间 |
| `material_id` | `material_id` | `materialId` | 物料 |
| `project_id` | `project_id` | `projectId` | 项目 |
| `exchange_ratetype` | `exchange_ratetype` | `exchangeRatetype` | 汇率类型 |
| `rcl_revenuecontract_base_id` | `rcl_revenuecontract_base_id` | `rclRevenuecontractBaseId` | 履约义务主表父实体 |
| `base_info_id` | `base_info_id` | `baseInfoId` | 基本信息行主键 |
| `unit_id` | `unit_id` | `unitId` | 计量单位 |
| `currency` | `currency` | `currency` | 币种 |
| `receive_type_id` | `receive_type_id` | `receiveTypeId` | 款项类型 |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `business_date` | `business_date` | `businessDate` | 业务日期 |
| `check_date` | `check_date` | `checkDate` | 验收日期 |
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
| `bln_check` | `bln_check` | `blnCheck` | 是否验收 |

### 枚举字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exch_rate_ops` | `exch_rate_ops` | `exchRateOps` | 汇率折算方式 |
| `opn_state` | `opn_state` | `opnState` | 操作状态 |
| `business_ope` | `business_ope` | `businessOpe` | 业务处理 |
| `dtc_status` | `dtc_status` | `dtcStatus` | 分布式事务状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (23个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `expect_debt` | `expect_debt` | `expectDebt` | 预计负债 |
| `expect_cost` | `expect_cost` | `expectCost` | 预计成本 |
| `total_cost` | `total_cost` | `totalCost` | 累计成本 |
| `cur_confirm_loss` | `cur_confirm_loss` | `curConfirmLoss` | 本次确认损失 |
| `cur_carry_forward_cost` | `cur_carry_forward_cost` | `curCarryForwardCost` | 本次结转成本 |
| `total_confirm_loss` | `total_confirm_loss` | `totalConfirmLoss` | 累计确认损失 |
| `total_carry_forward_cost` | `total_carry_forward_cost` | `totalCarryForwardCost` | 累计结转成本 |
| `exchange_rate` | `exchange_rate` | `exchangeRate` | 汇率 |
| `localmny_notax` | `localmny_notax` | `localmnyNotax` | 本币无税金额 |
| `version` | `version` | `version` | 版本 |
| `orimny_notax` | `orimny_notax` | `orimnyNotax` | 无税金额 |
| `serial_no` | `serial_no` | `serialNo` | 履约记录序号 |
| `orimny` | `orimny` | `orimny` | 含税金额 |
| `localmny_tax` | `localmny_tax` | `localmnyTax` | 本币税额 |
| `local_unitprice_notax` | `local_unitprice_notax` | `localUnitpriceNotax` | 本币无税单价 |
| `ori_unitprice` | `ori_unitprice` | `oriUnitprice` | 含税单价 |
| `orimny_tax` | `orimny_tax` | `orimnyTax` | 税额 |
| `localmny` | `localmny` | `localmny` | 本币含税金额 |
| `quantity` | `quantity` | `quantity` | 数量 |
| `ori_unitprice_notax` | `ori_unitprice_notax` | `oriUnitpriceNotax` | 无税单价 |
| `local_unitprice` | `local_unitprice` | `localUnitprice` | 本币含税单价 |
| `contract_row_no` | `contract_row_no` | `contractRowNo` | 履约义务行号 |
| `perform_progress` | `perform_progress` | `performProgress` | 履约进度 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 特征 |
