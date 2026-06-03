---
tags: [BIP, 元数据, 数据字典, RVN.RVN.costAndLossDt]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 成本及损失明细 (`RVN.RVN.costAndLossDt`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cost_loss_d` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`970aec86-accd-400b-9270-08da6b0726af`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 成本及损失明细 |
| 物理表 | `cost_loss_d` |
| 数据库 schema | `yonbip-fi-ercl` |
| 所属应用 | `RVN` |
| 直连字段 | 44 个 |
| 子表 | 0 个 |
| 关联引用 | 21 个 |

## 关联引用 (21个)

| 字段名 | 引用类型 |
|--------|---------|
| `begin_bill_type` | `ucfbasedoc.bd_billtypetreeref` |
| `expense_item_id` | `finbd.bd_expenseitemref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `ori_currency` | `ucfbasedoc.bd_currencytenantref` |
| `rvn_revenuebill_id` | `` |
| `revenue_contract_body_id` | `yonbip-fi-ercl.RefTable_c75ebbb386` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `material_type_id` | `productcenter.pc_managementclassref` |
| `dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `begin_bill_trade_type` | `ucfbasedoc.bd_billtyperef` |
| `ytenant_id` | `` |
| `free_ch_id` | `` |
| `employee` | `ucf-staff-center.bd_staff_all_ref` |
| `material_id` | `productcenter.baseProductRef` |
| `src_bill_type` | `ucfbasedoc.bd_billtypetreeref` |
| `customer_id` | `productcenter.aa_invoicemerchantref` |
| `revenue_contract_id` | `yonbip-fi-ercl.RefTable_da1e623072` |
| `src_bill_trade_type` | `ucfbasedoc.bd_billtyperef` |
| `foreign_key` | `` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |

## 继承接口 (3个, 6字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 44 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `begin_bill_body_id` | `begin_bill_body_id` | `beginBillBodyId` | 源头单据行ID |
| `begin_bill_id` | `begin_bill_id` | `beginBillId` | 源头单据ID |
| `begin_bill_no` | `begin_bill_no` | `beginBillNo` | 源头单据编号 |
| `contract_no` | `contract_no` | `contractNo` | 履约义务单据号 |
| `material_code` | `material_code` | `materialCode` | 物料编码 |
| `src_bill_body_id` | `src_bill_body_id` | `srcBillBodyId` | 来源单据行ID字段32 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据ID |
| `src_bill_no` | `src_bill_no` | `srcBillNo` | 来源单据号 |

### 引用字段 (20个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `foreign_key` | `foreign_key` | `foreignKey` | 外键 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `creator` | `creator` | `creator` | 创建人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |
| `begin_bill_trade_type` | `begin_bill_trade_type` | `beginBillTradeType` | 源头交易类型 |
| `begin_bill_type` | `begin_bill_type` | `beginBillType` | 源头单据类型 |
| `customer_id` | `customer_id` | `customerId` | 客户 |
| `dept_id` | `dept_id` | `deptId` | 部门 |
| `employee` | `employee` | `employee` | 业务员 |
| `expense_item_id` | `expense_item_id` | `expenseItemId` | 费用项目 |
| `material_id` | `material_id` | `materialId` | 物料 |
| `material_type_id` | `material_type_id` | `materialTypeId` | 物料类别 |
| `ori_currency` | `ori_currency` | `oriCurrency` | 币种 |
| `project_id` | `project_id` | `projectId` | 项目 |
| `revenue_contract_body_id` | `revenue_contract_body_id` | `revenueContractBodyId` | 履约义务行ID |
| `revenue_contract_id` | `revenue_contract_id` | `revenueContractId` | 履约义务ID |
| `rvn_revenuebill_id` | `rvn_revenuebill_id` | `rvnRevenueBill_id` | 收入确认单 |
| `src_bill_trade_type` | `src_bill_trade_type` | `srcBillTradeType` | 来源交易类型 |
| `src_bill_type` | `src_bill_type` | `srcBillType` | 来源单据类型 |
| `rvn_revenuebill_id` | `rvn_revenuebill_id` | `rvnRevenueBillId` | 收入确认主表基类 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `adjust_type` | `adjust_type` | `adjustType` | 调整类型 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `appoint_record` | `appoint_record` | `appointRecord` | 履约进度 |
| `base_row_no` | `base_row_no` | `baseRowNo` | 履约义务行 |
| `cur_carry_forward_cost` | `cur_carry_forward_cost` | `curCarryForwardCost` | 本次结转成本 |
| `cur_confirm_loss` | `cur_confirm_loss` | `curConfirmLoss` | 本次确认损失 |
| `expect_cost` | `expect_cost` | `expectCost` | 预计成本 |
| `save_total_carry_forward_cost` | `save_total_carry_forward_cost` | `saveTotalCarryForwardCost` | 保存累计结转成本 |
| `save_total_confirm_loss` | `save_total_confirm_loss` | `saveTotalConfirmLoss` | 保存累计确认损失 |
| `total_carry_forward_cost` | `total_carry_forward_cost` | `totalCarryForwardCost` | 累计结转成本 |
| `total_confirm_loss` | `total_confirm_loss` | `totalConfirmLoss` | 累计确认损失 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 特征 |
