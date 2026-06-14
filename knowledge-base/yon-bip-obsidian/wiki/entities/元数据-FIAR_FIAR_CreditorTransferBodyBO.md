---
tags: [BIP, 元数据, 数据字典, FIAR.FIAR.CreditorTransferBodyBO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 债权转移查询明细信息 (`FIAR.FIAR.CreditorTransferBodyBO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_ledger_b` | domain：`yonbip-fi-earap` | 应用：`EAR` | 业务对象ID：`86ebf74f-2fd9-450d-9f10-846371f1eda0`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 债权转移查询明细信息 |
| 物理表 | `arap_ledger_b` |
| domain/服务域 | `yonbip-fi-earap` |
| schema | `fiearap` |
| 所属应用 | `EAR` |
| 直连字段 | 44 个 |
| 子表 | 1 个 |
| 关联引用 | 15 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `grandsonItem` | `FIAR.FIAR.CreditorTransferGrandBO` | composition |

## 关联引用 (15个)

| 字段名 | 引用类型 |
|--------|---------|
| `src_body_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `finance_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `carryover_year_id` | `` |
| `carryover_period_id` | `` |
| `ytenant_id` | `` |
| `src_bill_type` | `transtype.bd_billtypetreeref` |
| `clue_no` | `` |
| `` | `` |
| `acc_period_id` | `finbd.bd_period` |
| `acc_book_id` | `fiepub.fiepub_accountbookref` |
| `src_event_id` | `` |
| `acc_year_id` | `finbd.bd_period` |
| `event_id` | `` |

## 继承接口 (5个, 18字段)

- **收付核算金额** (`FIAP.FIAP.IArapAmount`)
  - `acc_arap_amount` → `acc_arap_amount`
  - `gbl_arap_amount` → `gbl_arap_amount`
  - `grp_arap_amount` → `grp_arap_amount`
  - `org_arap_amount` → `org_arap_amount`
  - `ori_arap_amount` → `ori_arap_amount`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **收付结转子表** (`FIAP.FIAP.IEARAPCarryoverBody`)
  - `bln_carryover` → `bln_carryover`
  - `carryover_body_id` → `carryover_body_id`
  - `carryover_event_id` → `carryover_event_id`
  - `carryover_period_id` → `carryover_period_id`
  - `carryover_period_code` → `carryover_period_code`
  - `carryover_year_id` → `carryover_year_id`
  - `carryover_year_code` → `carryover_year_code`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 44 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `src_bill_row_id` | `src_bill_row_id` | `srcBillRowId` | 来源单据行ID |
| `acc_period_code` | `acc_period_code` | `accPeriodCode` | 会计期间 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年度 |
| `event_type_id` | `event_type_id` | `eventType` | 会计事务 |
| `transfer_out_id` | `transfer_out_id` | `transferOutId` | 债权债务转出对象ID |
| `transfer_out_name` | `transfer_out_name` | `transferOutName` | 债权债务转出对象名称 |
| `carryover_body_id` | `carryover_body_id` | `carryoverBody` | 结转事务行 |
| `carryover_event_id` | `carryover_event_id` | `carryoverEvent` | 结转事务 |
| `carryover_period_code` | `carryover_period_code` | `carryoverPeriodCode` | 结转期间编码 |
| `carryover_year_code` | `carryover_year_code` | `carryoverYearCode` | 结转年度编码 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `src_bill_type` | `src_bill_type` | `srcBillType` | 来源单据类型 |
| `acc_book_id` | `acc_book_id` | `accBook` | 财务账簿ID |
| `acc_period_id` | `acc_period_id` | `accPeriod` | 会计期间ID |
| `acc_year_id` | `acc_year_id` | `accYear` | 会计年度ID |
| `clue_no` | `clue_no` | `aimBody` | 转入明细ID |
| `event_id` | `event_id` | `event` | 事务ID |
| `finance_org_id` | `finance_org_id` | `financeOrg` | 会计主体ID |
| `src_body_id` | `src_body_id` | `srcBody` | 来源明细ID |
| `src_event_id` | `src_event_id` | `srcEvent` | 来源事务主表ID |
| `carryover_period_id` | `carryover_period_id` | `carryoverPeriod` | 结转期间 |
| `carryover_year_id` | `carryover_year_id` | `carryoverYear` | 结转年度 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `arap_event_type` | `arap_event_type` | `arapEventType` | 收付事务类型 |
| `src_arap_event_type` | `src_arap_event_type` | `srcArapEventType` | 来源收付事务类型 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_carryover` | `bln_carryover` | `blnCarryover` | 是否结转 |
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_tax_included_amount` | `acc_tax_included_amount` | `accTaxIncludedAmount` | 本币含税金额 |
| `gbl_tax_included_amount` | `gbl_tax_included_amount` | `gblTaxIncludedAmount` | 全局币含税金额 |
| `grp_tax_included_amount` | `grp_tax_included_amount` | `grpTaxIncludedAmount` | 集团币含税金额 |
| `org_tax_included_amount` | `org_tax_included_amount` | `orgTaxIncludedAmount` | 组织币含税金额 |
| `ori_tax_included_amount` | `ori_tax_included_amount` | `oriTaxIncludedAmount` | 含税金额 |
| `src_order_row_no` | `src_order_row_no` | `srcOrderRowNo` | 来源订单行号 |
| `acc_arap_amount` | `acc_arap_amount` | `accArapAmount` | 本币核算金额 |
| `gbl_arap_amount` | `gbl_arap_amount` | `gblArapAmount` | 全局币核算金额 |
| `grp_arap_amount` | `grp_arap_amount` | `grpArapAmount` | 集团币核算金额 |
| `org_arap_amount` | `org_arap_amount` | `orgArapAmount` | 组织币核算金额 |
| `ori_arap_amount` | `ori_arap_amount` | `oriArapAmount` | 核算金额 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `grandsonItem` | 债权转移查询计划信息 |
