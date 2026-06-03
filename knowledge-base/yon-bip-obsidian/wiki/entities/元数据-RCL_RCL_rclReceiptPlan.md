---
tags: [BIP, 元数据, 数据字典, RCL.RCL.rclReceiptPlan]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 收款计划明细 (`RCL.RCL.rclReceiptPlan`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcl_receiptplan` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`29a1c8eb-18f3-4f82-b4a8-2d20ae258702`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 收款计划明细 |
| 物理表 | `rcl_receiptplan` |
| 数据库 schema | `yonbip-fi-ercl` |
| 所属应用 | `RVN` |
| 直连字段 | 77 个 |
| 子表 | 0 个 |
| 关联引用 | 13 个 |

## 关联引用 (13个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `activity` | `` |
| `material_type_id` | `productcenter.pc_managementclassref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `wbs` | `` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `rcl_revenuecontract_base_id` | `` |
| `material_id` | `productcenter.baseProductRef` |
| `base_info_id` | `` |
| `payment_type` | `finbd.bd_paymenttyperef` |
| `settle_mode_id` | `productcenter.aa_settlemethodref` |
| `project_id` | `ucfbasedoc.bd_projectNewRef` |

## 继承接口 (2个, 3字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`

## 字段列表（按类型分组）

> 共 77 个直连字段

### 文本字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `collection_end_date` | `collection_end_date` | `collectionEndDate` | 截止日期 |
| `collection_start_date` | `collection_start_date` | `collectionStartDate` | 开始日期 |
| `id` | `id` | `id` | 主键 |
| `finance_name` | `finance_name` | `financeName` | 收款名称 |
| `account_period_unit_id` | `account_period_unit_id` | `accountPeriodUnitId` | 账期单位 |
| `user_define` | `user_define` | `userDefine` | 待定项 |
| `start_time_id` | `start_time_id` | `startTimeId` | 起算时点 |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | 分布式事务ID |
| `src_body_bill_id` | `src_body_bill_id` | `srcBodyBillId` | 来源单据ID |
| `date_id` | `date_id` | `dateId` | 收款协议子表主键 |
| `contract_plan_id` | `contract_plan_id` | `contractPlanId` | 履约义务收款计划ID |
| `asset` | `asset` | `asset` | 资产 |

### 引用字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modifier` | `modifier` | `modifier` | 修改人 |
| `wbs` | `wbs` | `wbs` | WBS |
| `settle_mode_id` | `settle_mode_id` | `settleModeId` | 结算方式 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |
| `material_id` | `material_id` | `materialId` | 物料 |
| `project_id` | `project_id` | `projectId` | 项目 |
| `activity` | `activity` | `activity` | 活动 |
| `material_type_id` | `material_type_id` | `materialTypeId` | 物料类别 |
| `rcl_revenuecontract_base_id` | `rcl_revenuecontract_base_id` | `rclRevenuecontractBaseId` | 履约义务主表 |
| `base_info_id` | `base_info_id` | `baseInfoId` | 基本信息行主键 |
| `payment_type` | `payment_type` | `paymentType` | 款项类型 |
| `creator` | `creator` | `creator` | 创建人 |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `due_date` | `due_date` | `dueDate` | 到期日 |
| `start_date` | `start_date` | `startDate` | 起算日期 |
| `effective_date` | `effective_date` | `effectiveDate` | 出账日 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |

### 布尔字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_discount_included` | `bln_discount_included` | `blnDiscountIncluded` | 是否参与折现 |
| `bln_retention_amount_flag` | `bln_retention_amount_flag` | `blnRetentionAmountFlag` | 质保金标识 |
| `bln_advanced_payment_flag` | `bln_advanced_payment_flag` | `blnAdvancedPaymentFlag` | 预收款标识 |
| `auto_generate` | `auto_generate` | `autoGenerate` | 自动生成 |

### 枚举字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fixed_expire_date3` | `fixed_expire_date3` | `fixedExpireDate3` | 固定到期日3 |
| `fixed_expire_date4` | `fixed_expire_date4` | `fixedExpireDate4` | 固定到期日4 |
| `fixed_expire_date1` | `fixed_expire_date1` | `fixedExpireDate1` | 固定到期日1 |
| `fixed_expire_date2` | `fixed_expire_date2` | `fixedExpireDate2` | 固定到期日2 |
| `expire_comfirm_way` | `expire_comfirm_way` | `expireComfirmWay` | 到期日确认方式 |
| `fixed_expire_date` | `fixed_expire_date` | `fixedExpireDate` | 固定到期日 |
| `fixed_account_date` | `fixed_account_date` | `fixedAccountDate` | 固定出账日 |
| `dtc_status` | `dtc_status` | `dtcStatus` | 分布式事务状态 |
| `fixed_account_date4` | `fixed_account_date4` | `fixedAccountDate4` | 固定出账日4 |
| `fixed_account_date3` | `fixed_account_date3` | `fixedAccountDate3` | 固定出账日3 |
| `account_comfirm_way` | `account_comfirm_way` | `accountComfirmWay` | 出账日确认方式 |
| `fixed_account_date2` | `fixed_account_date2` | `fixedAccountDate2` | 固定出账日2 |
| `fixed_account_date1` | `fixed_account_date1` | `fixedAccountDate1` | 固定出账日1 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `issue_no_con` | `issue_no_con` | `issueNoContract` | 履约义务收款计划期号 |
| `issue_no` | `issue_no` | `issueNo` | 期号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (26个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `collection_present_value` | `collection_present_value` | `collectionPresentValue` | 收款现值 |
| `ori_notax_amount` | `ori_notax_amount` | `oriNoTaxAmount` | 无税金额 |
| `tax_amount` | `tax_amount` | `taxAmount` | 税额 |
| `plan_row_amount` | `plan_row_amount` | `planRowAmount` | 收款计划行收款金额 |
| `account_period` | `account_period` | `accountPeriod` | 账期 |
| `ori_local_receive_amount_saved` | `ori_local_receive_amount_saved` | `orilocalReceiveAmountSaved` | 组织币实际收款(保存) |
| `base_info_amount_saved` | `base_info_amount_saved` | `baseInfoAmountSaved` | 履约义务行收款金额(保存) |
| `local_plan_row_amount_saved` | `local_plan_row_amount_saved` | `localPlanRowAmountSaved` | 组织币收款计划行收款金额(保存) |
| `ori_amount` | `ori_amount` | `oriAmount` | 金额 |
| `deloy_month` | `deloy_month` | `deloyMonth` | 延迟月份 |
| `local_base_info_amount` | `local_base_info_amount` | `localBaseInfoAmount` | 组织币履约义务行收款金额 |
| `tax_rate` | `tax_rate` | `taxRate` | 税率 |
| `contract_amount_saved` | `contract_amount_saved` | `contractAmountSaved` | 履约义务收款金额(保存) |
| `contract_amount` | `contract_amount` | `contractAmount` | 履约义务收款金额 |
| `row_no` | `row_no` | `rowNo` | 基本信息行号 |
| `deloy_days` | `deloy_days` | `deloyDays` | 延迟天数 |
| `local_contract_amount_saved` | `local_contract_amount_saved` | `localContractAmountSaved` | 组织币履约义务收款金额(保存) |
| `ori_receive_amount_saved` | `ori_receive_amount_saved` | `oriReceiveAmountSaved` | 实际收款(保存) |
| `base_info_amount` | `base_info_amount` | `baseInfoAmount` | 履约义务行收款金额 |
| `local_base_info_amount_saved` | `local_base_info_amount_saved` | `localBaseInfoAmountSaved` | 组织币履约义务行收款金额(保存) |
| `ori_local_receive_amount` | `ori_local_receive_amount` | `oriLocalReceiveAmount` | 组织币实际收款 |
| `plan_row_amount_saved` | `plan_row_amount_saved` | `planRowAmountSaved` | 收款计划行收款金额(保存) |
| `local_plan_row_amount` | `local_plan_row_amount` | `localPlanRowAmount` | 组织币收款计划行收款金额 |
| `ori_receive_amount` | `ori_receive_amount` | `oriReceiveAmount` | 实际收款 |
| `local_contract_amount` | `local_contract_amount` | `localContractAmount` | 组织币履约义务收款金额 |
| `ratio` | `ratio` | `ratio` | 比例 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 特征 |
