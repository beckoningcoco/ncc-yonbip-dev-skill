---
tags: [BIP, 元数据, 数据字典, EAR.badDebt.BadDebtOccurrenceHeader]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 坏账发生基本信息 (`EAR.badDebt.BadDebtOccurrenceHeader`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_ledger_h` | domain：`yonbip-fi-earap` | 应用：`EAR` | 业务对象ID：`5f69ef44-123a-49a3-8838-339e78ef01e6`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 坏账发生基本信息 |
| 物理表 | `arap_ledger_h` |
| domain/服务域 | `yonbip-fi-earap` |
| schema | `fiearap` |
| 所属应用 | `EAR` |
| 直连字段 | 63 个 |
| 子表 | 1 个 |
| 关联引用 | 23 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodyItem` | `EAR.badDebt.BadDebtOccurrenceBody` | composition |

## 关联引用 (23个)

| 字段名 | 引用类型 |
|--------|---------|
| `ori_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `finance_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `gbl_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `voucher_type_id` | `fiepub.epub_vouchertype_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `carryover_year_id` | `` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `carryover_period_id` | `` |
| `event_type_id` | `yonbip-fi-eaai2.RefTable_a70ca2f048` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `acc_purpose` | `finbd.bd_accpurposeref` |
| `acc_period_id` | `finbd.bd_period` |
| `acc_book_id` | `fiepub.fiepub_accountbookref` |
| `prov_ratio_id` | `` |
| `acc_year_id` | `finbd.bd_periodyear` |
| `acc_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `grp_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `org_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `prov_rule_id` | `yonbip-fi-earap.RefTable_5efbc6401` |
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

> 共 63 个直连字段

### 文本字段 (17个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_period_code` | `acc_period_code` | `accPeriodCode` | 会计期间编码 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年度编码 |
| `check_error_msg` | `check_error_msg` | `checkErrorMsg` | 会计事务校验异常信息 |
| `event_code` | `event_code` | `code` | 会计事务记录号 |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | 全局事务ID |
| `entry_id` | `entry_id` | `entry` | 事项分录 |
| `entry_code` | `entry_code` | `entryCode` | 事项分录编码	 |
| `post_status_code` | `post_status_code` | `postStatusCode` | 事项分录生成状态编码 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `voucher_id` | `voucher_id` | `voucher` | 总账凭证 |
| `voucher_code` | `voucher_code` | `voucherCode` | 总账凭证号 |
| `auditnote` | `auditnote` | `auditNote` | 审批批语 |
| `carryover_event_id` | `carryover_event_id` | `carryoverEvent` | 结转事务 |
| `carryover_period_code` | `carryover_period_code` | `carryoverPeriodCode` | 结转期间编码 |
| `carryover_year_code` | `carryover_year_code` | `carryoverYearCode` | 结转年度编码 |
| `id` | `id` | `id` | 主键 |
| `procinst_id` | `procinst_id` | `procinstId` | 流程实例ID |

### 引用字段 (21个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_book_id` | `acc_book_id` | `accBook` | 财务账簿 |
| `acc_currency_id` | `acc_currency_id` | `accCurrency` | 本币 |
| `acc_period_id` | `acc_period_id` | `accPeriod` | 会计期间 |
| `acc_purpose` | `acc_purpose` | `accPurpose` | 核算目的 |
| `acc_year_id` | `acc_year_id` | `accYear` | 会计年度 |
| `customer_id` | `customer_id` | `customer` | 客户 |
| `event_type_id` | `event_type_id` | `eventType` | 会计事务 |
| `finance_org_id` | `finance_org_id` | `financeOrg` | 会计主体 |
| `gbl_currency_id` | `gbl_currency_id` | `gblCurrency` | 全局币 |
| `grp_currency_id` | `grp_currency_id` | `grpCurrency` | 集团币 |
| `org_currency_id` | `org_currency_id` | `orgCurrency` | 组织币 |
| `ori_currency_id` | `ori_currency_id` | `oriCurrency` | 币种 |
| `prov_ratio_id` | `prov_ratio_id` | `provRatio` | 坏账计提比率 |
| `prov_rule_id` | `prov_rule_id` | `provRule` | 坏账计提规则 |
| `voucher_type_id` | `voucher_type_id` | `voucherType` | 总账凭证类型 |
| `auditor` | `auditor` | `auditor` | 审批人 |
| `carryover_period_id` | `carryover_period_id` | `carryoverPeriod` | 结转期间 |
| `carryover_year_id` | `carryover_year_id` | `carryoverYear` | 结转年度 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_date` | `acc_date` | `accDate` | 记账日期 |
| `src_bill_date` | `src_bill_date` | `busDate` | 业务日期 |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批日期 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `arap_event_type` | `arap_event_type` | `arapEventType` | 收付会计事务 |
| `bln_effect` | `bln_effect` | `blnEffect` | 生效状态 |
| `object_type` | `object_type` | `objectType` | 往来对象类型 |
| `post_state` | `post_state` | `postState` | 事项分录生成状态 |
| `src_arap_event_type` | `src_arap_event_type` | `srcArapEventType` | 来源收付会计事务 |
| `status` | `status` | `status` | 事务状态 |
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

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `send_data_version` | `send_data_version` | `sendDataVersion` | 发送会计平台数据版本 |

### 数值字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_amount` | `acc_amount` | `accAmount` | 本币金额 |
| `gbl_amount` | `gbl_amount` | `gblAmount` | 全局币金额 |
| `grp_amount` | `grp_amount` | `grpAmount` | 集团币金额 |
| `org_amount` | `org_amount` | `orgAmount` | 组织币金额 |
| `ori_amount` | `ori_amount` | `oriAmount` | 原币金额 |
| `ori_balance` | `ori_balance` | `oriBalance` | 累计收回原币金额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义特征 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bodyItem` | 坏账发生明细信息 |
