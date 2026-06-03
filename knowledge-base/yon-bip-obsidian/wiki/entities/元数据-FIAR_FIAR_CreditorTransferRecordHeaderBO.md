---
tags: [BIP, 元数据, 数据字典, FIAR.FIAR.CreditorTransferRecordHeaderBO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 待债权转移基本信息 (`FIAR.FIAR.CreditorTransferRecordHeaderBO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_ledger_h` | domain：`yonbip-fi-earap` | 应用：`EAR` | 业务对象ID：`ace91d03-370a-4ceb-9115-b068eef3a2c7`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 待债权转移基本信息 |
| 物理表 | `arap_ledger_h` |
| 数据库 schema | `yonbip-fi-earap` |
| 所属应用 | `EAR` |
| 直连字段 | 78 个 |
| 子表 | 1 个 |
| 关联引用 | 27 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodyItem` | `FIAR.FIAR.CreditorTransferRecordBodyBO` | composition |

## 关联引用 (27个)

| 字段名 | 引用类型 |
|--------|---------|
| `funder_id` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `ori_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `finance_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `gbl_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `biz_bill_trade_type_id` | `ucfbasedoc.bd_billtyperef` |
| `employee_id` | `iuap-ptc-yoncmm.sattUuser` |
| `acc_year_id` | `finbd.bd_period` |
| `acc_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `grp_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `org_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `src_trade_type_id` | `ucfbasedoc.bd_billtyperef` |
| `org_id` | `ucf-org-center.org_pure_tree_ref` |
| `carryover_year_id` | `` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `carryover_period_id` | `` |
| `event_type_id` | `yonbip-fi-eaai2.RefTable_a70ca2f048` |
| `ytenant_id` | `` |
| `src_bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `acc_purpose` | `finbd.bd_accpurposeref` |
| `acc_period_id` | `finbd.bd_period` |
| `acc_book_id` | `fiepub.fiepub_accountbookref` |
| `partner_id` | `productcenter.base_businesspartnerref` |
| `biz_bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `customer_id` | `productcenter.aa_invoicemerchantref` |

## 继承接口 (6个, 18字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **审批流接口** (`iuap.busiObj.ApprovalFlowItf`)
  - `auditnote` → `auditnote`
  - `auditor` → `auditor`
  - `audit_time` → `audit_time`
  - `procinst_id` → `procinst_id`
  - `verifystate` → `verifystate`
- **收付结转主表** (`FIAP.FIAP.IEARAPCarryover`)
  - `bln_carryover` → `bln_carryover`
  - `carryover_event_id` → `carryover_event_id`
  - `carryover_period_id` → `carryover_period_id`
  - `carryover_period_code` → `carryover_period_code`
  - `carryover_year_id` → `carryover_year_id`
  - `carryover_year_code` → `carryover_year_code`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 78 个直连字段

### 文本字段 (20个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_period_code` | `acc_period_code` | `accPeriodCode` | 会计期间编码 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年度编码 |
| `biz_bill_code` | `biz_bill_code` | `bizBillCode` | 业务单据编号 |
| `biz_bill_id` | `biz_bill_id` | `bizBillId` | 业务单据ID |
| `event_code` | `event_code` | `code` | 会计事务记录号 |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | 全局事务ID |
| `opp_bill_id` | `opp_bill_id` | `oppBillId` | 对应单据ID |
| `remarks` | `remarks` | `remarks` | 备注 |
| `retailer_name` | `retailer_name` | `retailer` | 散户 |
| `src_bill_code` | `src_bill_code` | `srcBillCode` | 单据编号 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据ID |
| `src_event_id` | `src_event_id` | `srcEventId` | 来源事务ID |
| `transfer_in_id` | `transfer_in_id` | `transferInId` | 转入对象ID |
| `transfer_in_name` | `transfer_in_name` | `transferInName` | 转入对象名称 |
| `carryover_event_id` | `carryover_event_id` | `carryoverEvent` | 结转事务 |
| `carryover_period_code` | `carryover_period_code` | `carryoverPeriodCode` | 结转期间编码 |
| `carryover_year_code` | `carryover_year_code` | `carryoverYearCode` | 结转年度编码 |
| `auditnote` | `auditnote` | `auditNote` | 审批批语 |
| `procinst_id` | `procinst_id` | `procinstId` | 流程实例ID |
| `id` | `id` | `id` | 主键 |

### 引用字段 (26个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_book_id` | `acc_book_id` | `accBook` | 财务账簿 |
| `acc_currency_id` | `acc_currency_id` | `accCurrency` | 账簿币种 |
| `acc_period_id` | `acc_period_id` | `accPeriod` | 会计期间 |
| `acc_purpose` | `acc_purpose` | `accPurpose` | 核算目的 |
| `acc_year_id` | `acc_year_id` | `accYear` | 会计年度 |
| `biz_bill_type_id` | `biz_bill_type_id` | `bizBillType` | 业务单据类型ID |
| `biz_bill_trade_type_id` | `biz_bill_trade_type_id` | `bizTradeType` | 业务单据交易类型ID |
| `customer_id` | `customer_id` | `customer` | 客户 |
| `employee_id` | `employee_id` | `employee` | 员工 |
| `event_type_id` | `event_type_id` | `eventType` | 会计事务 |
| `finance_org_id` | `finance_org_id` | `financeOrg` | 会计主体 |
| `funder_id` | `funder_id` | `funder` | 资金业务伙伴 |
| `gbl_currency_id` | `gbl_currency_id` | `gblCurrency` | 全局币种 |
| `grp_currency_id` | `grp_currency_id` | `grpCurrency` | 集团币种 |
| `org_id` | `org_id` | `org` | 业务组织 |
| `org_currency_id` | `org_currency_id` | `orgCurrency` | 组织币种 |
| `ori_currency_id` | `ori_currency_id` | `oriCurrency` | 原币 |
| `partner_id` | `partner_id` | `partner` | 业务伙伴 |
| `src_bill_type_id` | `src_bill_type_id` | `srcBillType` | 单据类型 |
| `src_trade_type_id` | `src_trade_type_id` | `srcTradeType` | 交易类型 |
| `carryover_period_id` | `carryover_period_id` | `carryoverPeriod` | 结转期间 |
| `carryover_year_id` | `carryover_year_id` | `carryoverYear` | 结转年度 |
| `auditor` | `auditor` | `auditor` | 审批人 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_date` | `acc_date` | `accDate` | 记账日期 |
| `src_bill_date` | `src_bill_date` | `srcBillDate` | 单据日期 |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_write_off` | `bln_write_off` | `blnWriteOff` | 是否冲销 |

### 枚举字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `arap_event_type` | `arap_event_type` | `arapEventType` | 收付会计事务 |
| `balance_state` | `balance_state` | `balanceState` | 清账标识 |
| `bln_effect` | `bln_effect` | `blnEffect` | 是否生效 |
| `object_type` | `object_type` | `objectType` | 往来对象类型 |
| `settle_state` | `settle_state` | `settleState` | 结算状态 |
| `src_system` | `src_system` | `srcSystem` | 来源系统 |
| `status` | `status` | `status` | 事务状态 |
| `transfer_object_type` | `transfer_object_type` | `transferObjectType` | 转移对象类型 |
| `write_off_state` | `write_off_state` | `writeOffState` | 冲销状态 |
| `verifystate` | `verifystate` | `verifyState` | 单据状态 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dtc_status` | `dtc_status` | `dtcStatus` | 全局事务状态 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_carryover` | `bln_carryover` | `blnCarryover` | 是否结转 |
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_amount` | `acc_amount` | `accAmount` | 本币金额 |
| `acc_balance` | `acc_balance` | `accBalance` | 本币余额 |
| `gbl_amount` | `gbl_amount` | `gblAmount` | 全局币金额 |
| `gbl_balance` | `gbl_balance` | `gblBalance` | 全局币余额 |
| `grp_amount` | `grp_amount` | `grpAmount` | 集团币金额 |
| `grp_balance` | `grp_balance` | `grpBalance` | 集团币余额 |
| `org_amount` | `org_amount` | `orgAmount` | 组织币金额 |
| `org_balance` | `org_balance` | `orgBalance` | 组织币余额 |
| `ori_amount` | `ori_amount` | `oriAmount` | 原币金额 |
| `ori_balance` | `ori_balance` | `oriBalance` | 原币余额 |
| `ori_ocupy_amount` | `ori_ocupy_amount` | `oriOcupyAmount` | 预占用金额 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bodyItem` | 待债权转移明细信息 |
