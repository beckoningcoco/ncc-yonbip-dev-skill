---
tags: [BIP, 元数据, 数据字典, FIAR.FIAR.ARVerifyEventGrandson]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 应收核销详情 (`FIAR.FIAR.ARVerifyEventGrandson`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_ledger_g` | domain：`yonbip-fi-earap` | 应用：`EAR` | 业务对象ID：`ad337392-5663-46cb-871b-706e07a6f6d8`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 应收核销详情 |
| 物理表 | `arap_ledger_g` |
| 数据库 schema | `yonbip-fi-earap` |
| 所属应用 | `EAR` |
| 直连字段 | 61 个 |
| 子表 | 0 个 |
| 关联引用 | 15 个 |

## 关联引用 (15个)

| 字段名 | 引用类型 |
|--------|---------|
| `src_body_id` | `` |
| `gain_loss_subject_id` | `fiepub.fiepub_accsubjectref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `carryover_year_id` | `` |
| `carryover_period_id` | `` |
| `ytenant_id` | `` |
| `body_id` | `` |
| `opp_grandson_id` | `` |
| `src_grandson_id` | `` |
| `acc_period_id` | `finbd.bd_period` |
| `src_event_id` | `` |
| `acc_year_id` | `finbd.bd_period` |
| `gain_loss_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `event_id` | `` |

## 继承接口 (4个, 14字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **收付结转孙表** (`FIAP.FIAP.IEARAPCarryoverGrandson`)
  - `bln_carryover` → `bln_carryover`
  - `carryover_body_id` → `carryover_body_id`
  - `carryover_event_id` → `carryover_event_id`
  - `carryover_grandson_id` → `carryover_grandson_id`
  - `carryover_period_id` → `carryover_period_id`
  - `carryover_period_code` → `carryover_period_code`
  - `carryover_year_id` → `carryover_year_id`
  - `carryover_year_code` → `carryover_year_code`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 61 个直连字段

### 文本字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_book_id` | `acc_book_id` | `accBook` | 财务账簿ID |
| `b_remarks` | `b_remarks` | `bRemarks` | 表体备注 |
| `bln_write_off` | `bln_write_off` | `blnWriteOff` | 是否冲销单 |
| `clue_no` | `clue_no` | `clueNo` | 线索号 |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | 全局事务ID |
| `event_type_id` | `event_type_id` | `eventType` | 会计事务类型ID |
| `finance_org_id` | `finance_org_id` | `financeOrg` | 会计主体ID |
| `h_remarks` | `h_remarks` | `hRemarks` | 表头备注 |
| `carryover_body_id` | `carryover_body_id` | `carryoverBody` | 结转事务行 |
| `carryover_event_id` | `carryover_event_id` | `carryoverEvent` | 结转事务 |
| `carryover_grandson_id` | `carryover_grandson_id` | `carryoverGrandson` | 结转事务孙行 |
| `carryover_period_code` | `carryover_period_code` | `carryoverPeriodCode` | 结转期间编码 |
| `carryover_year_code` | `carryover_year_code` | `carryoverYearCode` | 结转年度编码 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_period_id` | `acc_period_id` | `accPeriod` | 会计期间ID |
| `acc_year_id` | `acc_year_id` | `accYear` | 会计年度ID |
| `body_id` | `body_id` | `body` | 明细ID |
| `event_id` | `event_id` | `event` | 事务ID |
| `gain_loss_subject_id` | `gain_loss_subject_id` | `gainLossSubject` | 汇兑损益科目 |
| `gain_loss_subject_vid` | `gain_loss_subject_vid` | `gainLossSubjectVid` | 汇兑损益科目版本 |
| `opp_grandson_id` | `opp_grandson_id` | `oppGrandson` | 对方核销详情ID |
| `src_body_id` | `src_body_id` | `srcBody` | 来源明细 |
| `src_event_id` | `src_event_id` | `srcEvent` | 来源事务ID |
| `src_grandson_id` | `src_grandson_id` | `srcGrandson` | 来源核算ID |
| `carryover_period_id` | `carryover_period_id` | `carryoverPeriod` | 结转期间 |
| `carryover_year_id` | `carryover_year_id` | `carryoverYear` | 结转年度 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `amount_direction` | `amount_direction` | `amountDirection` | 借贷方向 |
| `arap_event_type` | `arap_event_type` | `arapEventType` | 收付会计事务 |
| `digest` | `digest` | `digest` | 处理摘要 |
| `acc_gain_loss_flag` | `acc_gain_loss_flag` | `gainLossFlag` | 账簿本币损益标识(枚举值 1:收益; -1:损失) |
| `gbl_gain_loss_flag` | `gbl_gain_loss_flag` | `gblGainLossFlag` | 全局币损益标识(枚举值 1:收益(默认); -1:损失) |
| `grp_gain_loss_flag` | `grp_gain_loss_flag` | `grpGainLossFlag` | 集团币损益标识(枚举值 1:收益(默认); -1:损失) |
| `org_gain_loss_flag` | `org_gain_loss_flag` | `orgGainLossFlag` | 组织币损益标识(枚举值 1:收益(默认); -1:损失) |
| `src_arap_event_type` | `src_arap_event_type` | `srcArapEventType` | 来源收付事务类型 |
| `write_off_state` | `write_off_state` | `writeOffState` | 冲销状态 |
| `acc_exchange_rate_ops` | `acc_exchange_rate_ops` | `accExchangeRateOps` | 本币汇率折算方式 |
| `gbl_exchange_rate_ops` | `gbl_exchange_rate_ops` | `gblExchangeRateOps` | 全局币汇率折算方式 |
| `grp_exchange_rate_ops` | `grp_exchange_rate_ops` | `grpExchangeRateOps` | 集团币汇率折算方式 |
| `mid_exchange_rate_ops` | `mid_exchange_rate_ops` | `midExchangeRateOps` | 核销中间币汇率折算方式 |
| `org_exchange_rate_ops` | `org_exchange_rate_ops` | `orgExchangeRateOps` | 组织币汇率折算方式 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dtc_status` | `dtc_status` | `dtcStatus` | 全局事务状态 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_carryover` | `bln_carryover` | `blnCarryover` | 是否结转 |
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_amount` | `acc_amount` | `accAmount` | 本币金额 |
| `acc_exchange_rate` | `acc_exchange_rate` | `accExchangeRate` | 汇率 |
| `gbl_amount` | `gbl_amount` | `gblAmount` | 全局币金额 |
| `gbl_exchange_rate` | `gbl_exchange_rate` | `gblExchangeRate` | 全局币汇率 |
| `grp_amount` | `grp_amount` | `grpAmount` | 集团币金额 |
| `grp_exchange_rate` | `grp_exchange_rate` | `grpExchangeRate` | 集团币汇率 |
| `mid_amount` | `mid_amount` | `midAmount` | 核销中间币金额 |
| `mid_exchange_rate` | `mid_exchange_rate` | `midExchangeRate` | 核销中间币汇率 |
| `org_amount` | `org_amount` | `orgAmount` | 组织币金额 |
| `org_exchange_rate` | `org_exchange_rate` | `orgExchangeRate` | 组织币汇率 |
| `ori_amount` | `ori_amount` | `oriAmount` | 金额 |
| `row_no` | `row_no` | `rowNo` | 行号 |
