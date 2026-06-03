---
tags: [BIP, 元数据, 数据字典, RCL.RCL.rclPeriodPlanBase]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 分期收入计划父实体 (`RCL.RCL.rclPeriodPlanBase`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcl_periodplan` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`bac05af3-16cf-4b3b-97c1-208a96ae37f2`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 分期收入计划父实体 |
| 物理表 | `rcl_periodplan` |
| 数据库 schema | `yonbip-fi-ercl` |
| 所属应用 | `RVN` |
| 直连字段 | 79 个 |
| 子表 | 0 个 |
| 关联引用 | 17 个 |

## 关联引用 (17个)

| 字段名 | 引用类型 |
|--------|---------|
| `period_id` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `activity` | `` |
| `calculate_rule_id` | `fiepub.fiepub_income_confirm_ref` |
| `exchange_ratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `material_type_id` | `productcenter.pc_managementclassref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `wbs` | `` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `material_id` | `productcenter.baseProductRef` |
| `rcl_revenuecontract_base_id` | `` |
| `base_info_id` | `` |
| `backwashed_period` | `finbd.bd_period` |
| `acc_book_id` | `fiepub.fiepub_accountbooktreeref` |
| `backwash_period` | `finbd.bd_period` |
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

> 共 79 个直连字段

### 文本字段 (28个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `ext_src_billtype_code` | `ext_src_billtype_code` | `extSrcBilltypeCode` | 来源单据类型编码(外) |
| `src_bill_no` | `src_bill_no` | `srcBillNo` | 来源单据编号 |
| `ext_begin_body_id` | `ext_begin_body_id` | `extBeginBodyId` | 源头单据行id(外) |
| `ext_begin_bill_no` | `ext_begin_bill_no` | `extBeginBillNo` | 源头单据编码(外) |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据ID |
| `batch_no` | `batch_no` | `batchNo` | 批次号 |
| `ext_src_transtype_code` | `ext_src_transtype_code` | `extSrcTranstypeCode` | 来源交易类型编码(外) |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | 分布式事务ID |
| `ext_begin_billtype_code` | `ext_begin_billtype_code` | `extBeginBilltypeCode` | 源头单据类型编码(外) |
| `begin_billtype_code` | `begin_billtype_code` | `beginBilltypeCode` | 源头单据类型编码 |
| `period_code` | `period_code` | `periodCode` | 期间编码 |
| `ext_src_billcode` | `ext_src_billcode` | `extSrcBillcode` | 来源单据编码(外) |
| `begin_bill_row_id` | `begin_bill_row_id` | `beginBillRowId` | 源头单据行ID |
| `ext_src_body_id` | `ext_src_body_id` | `extSrcBodyId` | 来源单据行id(外) |
| `src_system` | `src_system` | `srcSystem` | 来源应用 |
| `ext_src_systems` | `ext_src_systems` | `extSrcSystems` | 来源单据系统(外) |
| `begin_bill_no` | `begin_bill_no` | `beginBillNo` | 源头单据编码 |
| `begin_transtype_code` | `begin_transtype_code` | `beginTranstypeCode` | 源头交易类型编码 |
| `ext_src_bill_id` | `ext_src_bill_id` | `extSrcBillId` | 来源单据id(外) |
| `src_billtype_code` | `src_billtype_code` | `srcBilltypeCode` | 来源单据类型编码 |
| `origin_id` | `origin_id` | `originId` | 原始分期收入计划 |
| `src_transtype_code` | `src_transtype_code` | `srcTranstypeCode` | 来源交易类型编码 |
| `src_bill_row_id` | `src_bill_row_id` | `srcBillRowId` | 来源单据行ID |
| `associated_row_pk` | `associated_row_pk` | `associatedRowPk` | 关联行PK |
| `ext_begin_bill_id` | `ext_begin_bill_id` | `extBeginBillId` | 源头单据id(外) |
| `begin_bill_id` | `begin_bill_id` | `beginBillId` | 源头单据ID |
| `ext_begin_transtype_code` | `ext_begin_transtype_code` | `extBeginTranstypeCode` | 源头交易类型编码(外) |

### 引用字段 (16个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_book_id` | `acc_book_id` | `accBook` | 账簿 |
| `calculate_rule_id` | `calculate_rule_id` | `calculateRuleId` | 计算规则 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `wbs` | `wbs` | `wbs` | WBS |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |
| `material_id` | `material_id` | `materialId` | 物料 |
| `backwash_period` | `backwash_period` | `backwashPeriod` | 回冲期间 |
| `project_id` | `project_id` | `projectId` | 项目 |
| `activity` | `activity` | `activity` | 活动 |
| `exchange_ratetype` | `exchange_ratetype` | `exchangeRatetype` | 汇率类型 |
| `material_type_id` | `material_type_id` | `materialTypeId` | 物料类别 |
| `rcl_revenuecontract_base_id` | `rcl_revenuecontract_base_id` | `rclRevenuecontractBaseId` | 履约义务主表父实体 |
| `base_info_id` | `base_info_id` | `baseInfoId` | 基本信息行主键 |
| `backwashed_period` | `backwashed_period` | `backwashedPeriod` | 被回冲期间 |
| `period_id` | `period_id` | `periodId` | 期间 |
| `creator` | `creator` | `creator` | 创建人 |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exchange_rate_date` | `exchange_rate_date` | `exchangeRateDate` | 汇率日期 |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `business_date` | `business_date` | `businessDate` | 业务日期 |
| `create_time` | `create_time` | `createTime` | 创建时间 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_settle_info_preocc` | `bln_settle_info_preocc` | `blnSettleInfoPreocc` | 结算信息预占 |
| `bln_write_back` | `bln_write_back` | `blnWriteBack` | 收入结算回写标识 |

### 枚举字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exch_rate_ops` | `exch_rate_ops` | `exchRateOps` | 汇率折算方式 |
| `confirm_status` | `confirm_status` | `confirmStatus` | 确认状态 |
| `trigger_event` | `trigger_event` | `triggerEvent` | 生成方式 |
| `post_status` | `post_status` | `postStatus` | 过账状态 |
| `dtc_status` | `dtc_status` | `dtcStatus` | 分布式事务状态 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `order_no` | `order_no` | `orderNo` | 序号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `confirm_id` | `confirm_id` | `confirmId` | 收入确认ID |

### 数值字段 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `orimny_notax_total` | `orimny_notax_total` | `orimnyNotaxTotal` | 累计无税收入 |
| `orimny_notax_current` | `orimny_notax_current` | `orimnyNotaxCurrent` | 本期无税收入 |
| `localmny_notax_current` | `localmny_notax_current` | `localmnyNotaxCurrent` | 本币本期无税收入 |
| `orimny_tax_total` | `orimny_tax_total` | `orimnyTaxTotal` | 累计税额 |
| `exchange_rate` | `exchange_rate` | `exchangeRate` | 汇率 |
| `orimny_total` | `orimny_total` | `orimnyTotal` | 累计含税收入 |
| `localmny_total` | `localmny_total` | `localmnyTotal` | 本币累计含税收入 |
| `localmny_tax_current` | `localmny_tax_current` | `localmnyTaxCurrent` | 本币本期税额 |
| `version` | `version` | `version` | 版本号 |
| `localmny_tax_total` | `localmny_tax_total` | `localmnyTaxTotal` | 本币累计税额 |
| `tax_rate` | `tax_rate` | `taxRate` | 税率 |
| `localmny_current` | `localmny_current` | `localmnyCurrent` | 本币本期含税收入 |
| `row_no` | `row_no` | `rowNo` | 基本信息行号 |
| `localmny_notax_total` | `localmny_notax_total` | `localmnyNotaxTotal` | 本币累计无税收入 |
| `orimny_tax_current` | `orimny_tax_current` | `orimnyTaxCurrent` | 本期税额 |
| `curr_period_confirm_proportion` | `curr_period_confirm_proportion` | `currPeriodConfirmProportion` | 本期进度 |
| `finance_income` | `finance_income` | `financeIncome` | 融资收益 |
| `perform_progress` | `perform_progress` | `performProgress` | 履约进度 |
| `orimny_current` | `orimny_current` | `orimnyCurrent` | 本期含税收入 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 特征 |
