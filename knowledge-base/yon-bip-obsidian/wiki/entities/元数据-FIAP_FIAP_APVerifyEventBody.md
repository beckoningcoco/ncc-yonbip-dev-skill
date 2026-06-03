---
tags: [BIP, 元数据, 数据字典, FIAP.FIAP.APVerifyEventBody]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 应付核销分组信息 (`FIAP.FIAP.APVerifyEventBody`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_ledger_b` | domain：`yonbip-fi-earap` | 应用：`EAP` | 业务对象ID：`8a9f25d2-edb3-47c5-ab2d-afc9445199ec`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 应付核销分组信息 |
| 物理表 | `arap_ledger_b` |
| 数据库 schema | `yonbip-fi-earap` |
| 所属应用 | `EAP` |
| 直连字段 | 38 个 |
| 子表 | 1 个 |
| 关联引用 | 9 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `grandsonItem` | `FIAP.FIAP.APVerifyEventGrandson` | composition |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `acc_period_id` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `acc_year_id` | `finbd.bd_period` |
| `carryover_year_id` | `finbd.bd_period` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `carryover_period_id` | `finbd.bd_period` |
| `ytenant_id` | `` |
| `event_id` | `` |

## 继承接口 (4个, 13字段)

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

> 共 38 个直连字段

### 文本字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_book_id` | `acc_book_id` | `accBook` | 财务账簿ID |
| `acc_period_code` | `acc_period_code` | `accPeriodCode` | 会计期间编码 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年度编码 |
| `clue_no` | `clue_no` | `clueNo` | 线索ID |
| `event_type_id` | `event_type_id` | `eventType` | 会计事务类型ID |
| `finance_org_id` | `finance_org_id` | `financeOrg` | 会计主体ID |
| `remarks` | `remarks` | `remarks` | 备注 |
| `src_body_id` | `src_body_id` | `srcBody` | 来源明细ID |
| `carryover_body_id` | `carryover_body_id` | `carryoverBody` | 结转事务行 |
| `carryover_event_id` | `carryover_event_id` | `carryoverEvent` | 结转事务 |
| `carryover_period_code` | `carryover_period_code` | `carryoverPeriodCode` | 结转期间编码 |
| `carryover_year_code` | `carryover_year_code` | `carryoverYearCode` | 结转年度编码 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_period_id` | `acc_period_id` | `accPeriod` | 会计期间ID |
| `acc_year_id` | `acc_year_id` | `accYear` | 会计年度ID |
| `event_id` | `event_id` | `event` | 应付核销基本信息 |
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

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_carryover` | `bln_carryover` | `blnCarryover` | 是否结转 |
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc2_tax_included_amount` | `acc2_tax_included_amount` | `accCAmount` | 贷方本币金额 |
| `acc_tax_included_amount` | `acc_tax_included_amount` | `accDAmount` | 借方本币金额 |
| `gbl2_tax_included_amount` | `gbl2_tax_included_amount` | `gblCAmount` | 贷方全局币金额 |
| `gbl_tax_included_amount` | `gbl_tax_included_amount` | `gblDAmount` | 借方全局币金额 |
| `grp2_tax_included_amount` | `grp2_tax_included_amount` | `grpCAmount` | 贷方集团币金额 |
| `grp_tax_included_amount` | `grp_tax_included_amount` | `grpDAmount` | 借方集团币金额 |
| `org2_tax_included_amount` | `org2_tax_included_amount` | `orgCAmount` | 贷方组织币金额 |
| `org_tax_included_amount` | `org_tax_included_amount` | `orgDAmount` | 借方组织币金额 |
| `ori2_tax_included_amount` | `ori2_tax_included_amount` | `oriCAmount` | 贷方金额 |
| `ori_tax_included_amount` | `ori_tax_included_amount` | `oriDAmount` | 借方金额 |
| `src_order_row_no` | `src_order_row_no` | `srcOrderRowNo` | 来源订单行号 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `grandsonItem` | 应付核销详情 |
