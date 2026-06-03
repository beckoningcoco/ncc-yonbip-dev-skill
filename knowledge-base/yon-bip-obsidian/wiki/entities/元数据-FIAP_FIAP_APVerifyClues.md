---
tags: [BIP, 元数据, 数据字典, FIAP.FIAP.APVerifyClues]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 核销线索 (`FIAP.FIAP.APVerifyClues`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_verify_clue` | domain：`yonbip-fi-earap` | 应用：`EAP` | 业务对象ID：`a96f16b5-2129-436a-be91-b02d98b5deb7`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 核销线索 |
| 物理表 | `arap_verify_clue` |
| 数据库 schema | `yonbip-fi-earap` |
| 所属应用 | `EAP` |
| 直连字段 | 30 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |

## 继承接口 (3个, 6字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 30 个直连字段

### 文本字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_book_id` | `acc_book_id` | `accBook` | 财务账簿ID |
| `arap_event_grandson_id` | `arap_event_grandson_id` | `arapEventGrandson` | 应收应付事务孙表ID |
| `clue_type` | `clue_type` | `clueType` | 线索类型 |
| `colpay_bill_id` | `colpay_bill_id` | `colpayBill` | 收付款单表头ID |
| `colpay_bill_row_id` | `colpay_bill_row_id` | `colpayBillRow` | 收付款单表体ID |
| `colpay_event_grandson_id` | `colpay_event_grandson_id` | `colpayEventGrandson` | 收付款事务孙表ID(同子表ID) |
| `finance_org_id` | `finance_org_id` | `financeOrg` | 会计主体ID |
| `id` | `id` | `id` | 主键 |
| `purchase_order_id` | `purchase_order_id` | `purchaseOrderId` | 采购来源订单主表id |
| `purchase_order_issue_no` | `purchase_order_issue_no` | `purchaseOrderIssueNo` | 采购订单期号 |
| `purchase_order_no` | `purchase_order_no` | `purchaseOrderNo` | 采购订单号 |
| `purchase_order_row_no` | `purchase_order_row_no` | `purchaseOrderRowNo` | 采购订单行号 |
| `sale_order_id` | `sale_order_id` | `saleOrderId` | 销售来源订单主表id |
| `sale_order_issue_no` | `sale_order_issue_no` | `saleOrderIssueNo` | 销售订单期号 |
| `sale_order_no` | `sale_order_no` | `saleOrderNo` | 销售订单号 |
| `sale_order_row_no` | `sale_order_row_no` | `saleOrderRowNo` | 销售订单行号 |
| `sale_rebate_no` | `sale_rebate_no` | `saleRebateNo` | 销售返利单号 |
| `src_clue_no` | `src_clue_no` | `srcClueNo` | 来源线索号 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_period_id` | `acc_period_id` | `accPeriod` | 会计期间ID |
| `acc_year_id` | `acc_year_id` | `accYear` | 会计年度ID |
| `status` | `status` | `status` | 状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ori_ocupy_amount` | `ori_ocupy_amount` | `oriOcupyAmount` | 预占用金额(原币)' |
| `ori_ocupy_balance` | `ori_ocupy_balance` | `oriOcupyBalance` | 预占用余额(原币) |
