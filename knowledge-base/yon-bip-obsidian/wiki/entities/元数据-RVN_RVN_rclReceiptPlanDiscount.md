---
tags: [BIP, 元数据, 数据字典, RVN.RVN.rclReceiptPlanDiscount]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 收款计划折现 (`RVN.RVN.rclReceiptPlanDiscount`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcl_receipt_plan_discount` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`6280abd8-2dde-4781-b77a-0346edb31386`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 收款计划折现 |
| 物理表 | `rcl_receipt_plan_discount` |
| domain/服务域 | `yonbip-fi-ercl` |
| schema | `fiercl` |
| 所属应用 | `RVN` |
| 直连字段 | 31 个 |
| 子表 | 0 个 |
| 关联引用 | 10 个 |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `material` | `productcenter.baseProductRef` |
| `activity` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `rclFinanceIncomeAllocation_id` | `` |
| `project` | `ucfbasedoc.bd_projectNewRef` |
| `wbs` | `` |
| `currency` | `ucfbasedoc.bd_currencytenantref` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |

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

> 共 31 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contract_row_id` | `contract_row_id` | `contractRowId` | 履约义务行ID |
| `receipt_plan_row_id` | `receipt_plan_row_id` | `receiptPlanRowId` | 收款计划行ID |
| `id` | `id` | `id` | 主键 |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `currency` | `currency` | `currency` | 币种 |
| `material` | `material` | `material` | 物料 |
| `project` | `project` | `project` | 项目 |
| `rclFinanceIncomeAllocation_id` | `rclFinanceIncomeAllocation_id` | `rclFinanceIncomeAllocation_id` | 融资收益分摊 |
| `activity` | `activity` | `activity` | 活动 |
| `wbs` | `wbs` | `wbs` | WBS |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `end_date` | `end_date` | `endDate` | 截止日期 |
| `planned_receipt_date` | `planned_receipt_date` | `plannedReceiptDate` | 计划收款日期 |
| `start_date` | `start_date` | `startDate` | 开始日期 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_discounted` | `is_discounted` | `isDiscounted` | 是否折现 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contract_row_no` | `contract_row_no` | `contractRowNo` | 履约义务行 |
| `receipt_plan_detail_period_no` | `receipt_plan_detail_period_no` | `receiptPlanDetailPeriodNo` | 收款计划明细期号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `confirm_receipt_present_value` | `confirm_receipt_present_value` | `confirmReceiptPresentValue` | 确认收款现值 |
| `discount_factor` | `discount_factor` | `discountFactor` | 折现系数 |
| `discount_period_count` | `discount_period_count` | `discountPeriodCount` | 折现期数 |
| `money` | `money` | `money` | 含税金额 |
| `no_tax_money` | `no_tax_money` | `noTaxMoney` | 无税金额 |
| `receipt_original_value` | `receipt_original_value` | `receiptOriginalValue` | 收款原值 |
| `receipt_present_value` | `receipt_present_value` | `receiptPresentValue` | 收款现值 |
| `tax` | `tax` | `tax` | 税额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 特征 |
