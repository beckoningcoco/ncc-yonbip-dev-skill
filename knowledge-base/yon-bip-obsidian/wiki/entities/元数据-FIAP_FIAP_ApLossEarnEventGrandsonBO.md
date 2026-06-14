---
tags: [BIP, 元数据, 数据字典, FIAP.FIAP.ApLossEarnEventGrandsonBO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 应付汇兑损益计划信息 (`FIAP.FIAP.ApLossEarnEventGrandsonBO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_ledger_g` | domain：`yonbip-fi-earap` | 应用：`EAP` | 业务对象ID：`3a6844be-d2df-48ce-a45d-3308a5f8f2d4`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 应付汇兑损益计划信息 |
| 物理表 | `arap_ledger_g` |
| domain/服务域 | `yonbip-fi-earap` |
| schema | `fiearap` |
| 所属应用 | `EAP` |
| 直连字段 | 58 个 |
| 子表 | 0 个 |
| 关联引用 | 15 个 |

## 关联引用 (15个)

| 字段名 | 引用类型 |
|--------|---------|
| `ori_grandson_id` | `` |
| `src_body_id` | `` |
| `gain_loss_subject_id` | `fiepub.fiepub_accsubjectref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `carryover_year_id` | `` |
| `carryover_period_id` | `` |
| `event_type_id` | `yonbip-fi-eaai2.RefTable_a70ca2f048` |
| `ytenant_id` | `` |
| `body_id` | `` |
| `src_grandson_id` | `` |
| `acc_period_id` | `finbd.bd_period` |
| `src_event_id` | `` |
| `acc_year_id` | `finbd.bd_period` |
| `gain_loss_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 58 个直连字段

### 文本字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_book_id` | `acc_book_id` | `accBook` | 财务账簿ID |
| `acc_period_code` | `acc_period_code` | `accPeriodCode` | 会计期间编码 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年度编码 |
| `carryover_body_id` | `carryover_body_id` | `carryoverBody` | 结转事务行 |
| `carryover_event_id` | `carryover_event_id` | `carryoverEvent` | 结转事务 |
| `carryover_grandson_id` | `carryover_grandson_id` | `carryoverGrandson` | 结转事务孙行 |
| `carryover_period_code` | `carryover_period_code` | `carryoverPeriodCode` | 结转期间编码 |
| `carryover_year_code` | `carryover_year_code` | `carryoverYearCode` | 结转年度编码 |
| `event_id` | `event_id` | `event` | 事务表头ID |
| `finance_org_id` | `finance_org_id` | `financeOrg` | 会计主体ID |
| `id` | `id` | `id` | 主键 |
| `src_arap_event_type` | `src_arap_event_type` | `srcArapEventType` | 来源收付会计事务 |

### 引用字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_period_id` | `acc_period_id` | `accPeriod` | 会计期间ID |
| `acc_year_id` | `acc_year_id` | `accYear` | 会计年度ID |
| `body_id` | `body_id` | `body` | 应付汇兑损益事务明细 |
| `carryover_period_id` | `carryover_period_id` | `carryoverPeriod` | 结转期间 |
| `carryover_year_id` | `carryover_year_id` | `carryoverYear` | 结转年度 |
| `creator` | `creator` | `creator` | 创建人 |
| `event_type_id` | `event_type_id` | `eventType` | 会计事务 |
| `gain_loss_subject_id` | `gain_loss_subject_id` | `gainLossSubject` | 汇兑损益科目 |
| `gain_loss_subject_vid` | `gain_loss_subject_vid` | `gainLossSubjectVid` | 汇兑损益科目版本 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ori_grandson_id` | `ori_grandson_id` | `oriGrandson` | 源头核算ID |
| `src_body_id` | `src_body_id` | `srcBody` | 来源事务明细ID |
| `src_event_id` | `src_event_id` | `srcEvent` | 来源事务ID |
| `src_grandson_id` | `src_grandson_id` | `srcGrandson` | 来源核算ID |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_hangup` | `bln_hangup` | `blnHangUp` | 是否挂起 |

### 枚举字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_exchange_rate_ops` | `acc_exchange_rate_ops` | `accExchangeRateOps` | 本币汇率折算方式 |
| `acc_gain_loss_flag` | `acc_gain_loss_flag` | `accGainLossFlag` | 账簿本币损益标识 |
| `amount_direction` | `amount_direction` | `amountDirection` | 借贷方向 |
| `arap_event_type` | `arap_event_type` | `arapEventType` | 收付会计事务类型 |
| `digest` | `digest` | `digest` | 处理摘要 |
| `gbl_exchange_rate_ops` | `gbl_exchange_rate_ops` | `gblExchangeRateOps` | 全局币汇率折算方式 |
| `gbl_gain_loss_flag` | `gbl_gain_loss_flag` | `gblGainLossFlag` | 全局本币损益标识 |
| `grp_exchange_rate_ops` | `grp_exchange_rate_ops` | `grpExchangeRateOps` | 集团币汇率折算方式 |
| `grp_gain_loss_flag` | `grp_gain_loss_flag` | `grpGainLossFlag` | 集团本币损益标识 |
| `org_exchange_rate_ops` | `org_exchange_rate_ops` | `orgExchangeRateOps` | 组织币汇率折算方式 |
| `org_gain_loss_flag` | `org_gain_loss_flag` | `orgGainLossFlag` | 组织本币损益标识 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_carryover` | `bln_carryover` | `blnCarryover` | 是否结转 |
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_amount` | `acc_amount` | `accAmount` | 本币金额 |
| `acc_balance` | `acc_balance` | `accBalance` | 本币余额 |
| `acc_exchange_rate` | `acc_exchange_rate` | `accExchangeRate` | 账簿本币汇率 |
| `gbl_amount` | `gbl_amount` | `gblAmount` | 全局币金额 |
| `gbl_balance` | `gbl_balance` | `gblBalance` | 全局币余额 |
| `gbl_exchange_rate` | `gbl_exchange_rate` | `gblExchangeRate` | 全局币汇率 |
| `grp_amount` | `grp_amount` | `grpAmount` | 集团币金额 |
| `grp_balance` | `grp_balance` | `grpBalance` | 集团币余额 |
| `grp_exchange_rate` | `grp_exchange_rate` | `grpExchangeRate` | 集团币汇率 |
| `org_amount` | `org_amount` | `orgAmount` | 组织币金额 |
| `org_balance` | `org_balance` | `orgBalance` | 组织币余额 |
| `org_exchange_rate` | `org_exchange_rate` | `orgExchangeRate` | 组织币汇率 |
| `ori_amount` | `ori_amount` | `oriAmount` | 金额 |
| `ori_balance` | `ori_balance` | `oriBalance` | 原币余额 |
