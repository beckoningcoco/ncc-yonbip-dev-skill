---
tags: [BIP, 元数据, 数据字典, EAR.carryover.CarryOverEventWithHoldingTaxBO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 结转事务代扣税信息 (`EAR.carryover.CarryOverEventWithHoldingTaxBO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_ledger_g_wht` | domain：`yonbip-fi-earap` | 应用：`EAR` | 业务对象ID：`dd62a7df-1cf7-48e7-8e86-7607cd341487`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 结转事务代扣税信息 |
| 物理表 | `arap_ledger_g_wht` |
| 数据库 schema | `yonbip-fi-earap` |
| 所属应用 | `EAR` |
| 直连字段 | 37 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `body_id` | `` |

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

> 共 37 个直连字段

### 文本字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `finance_org_id` | `finance_org_id` | `financeOrg` | 会计主体 |
| `acc_book_id` | `acc_book_id` | `accBook` | 财务账簿 |
| `event_type_id` | `event_type_id` | `eventType` | 会计事务类型 |
| `event_id` | `event_id` | `event` | 结转事务基本信息 |
| `arap_event_type` | `arap_event_type` | `arapEventType` | 收付会计事务类型 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年度编码 |
| `acc_period_code` | `acc_period_code` | `accPeriodCode` | 会计期间编码 |
| `whtax_id` | `whtax_id` | `whtax` | 代扣税税码 |
| `whtax_subject_id` | `whtax_subject_id` | `whtaxSubject` | 代扣税税目 |
| `whtax_type_id` | `whtax_type_id` | `whtaxType` | 代扣税类型 |
| `carryover_period_code` | `carryover_period_code` | `carryOverPeriodCode` | 结转期间编码 |
| `carryover_year_code` | `carryover_year_code` | `carryOverYearCode` | 结转年度编码 |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxId` | 全局分布式事务ID |
| `id` | `id` | `id` | 主键 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `body_id` | `body_id` | `body` | 结转事务明细信息 |
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
| `bln_carryover` | `bln_carryover` | `blnCarryOver` | 是否结转 |
| `order_no` | `order_no` | `orderNo` | 序号 |
| `dtc_status` | `dtc_status` | `dtcStatus` | 分布式事务的状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_year_id` | `acc_year_id` | `accYear` | 会计年度 |
| `acc_period_id` | `acc_period_id` | `accPeriod` | 会计期间 |
| `carryover_period_id` | `carryover_period_id` | `carryOverPeriod` | 结转期间 |
| `carryover_year_id` | `carryover_year_id` | `carryOverYear` | 结转年度 |

### 数值字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `whtax_rate` | `whtax_rate` | `whtaxRate` | 税率 |
| `ori_whtax_base_amount` | `ori_whtax_base_amount` | `oriWhtaxBaseAmount` | 本次税基 |
| `ori_whtax_amount` | `ori_whtax_amount` | `oriWhtaxAmount` | 代扣税税额 |
| `acc_whtax_amount` | `acc_whtax_amount` | `accWhtaxAmount` | 本币代扣税税额 |
| `org_whtax_amount` | `org_whtax_amount` | `orgWhtaxAmount` | 组织币代扣税税额 |
| `grp_whtax_amount` | `grp_whtax_amount` | `grpWhtaxAmount` | 集团币代扣税税额 |
| `gbl_whtax_amount` | `gbl_whtax_amount` | `gblWhtaxAmount` | 全局币代扣税税额 |
| `row_no` | `row_no` | `rowNo` | 行号 |
