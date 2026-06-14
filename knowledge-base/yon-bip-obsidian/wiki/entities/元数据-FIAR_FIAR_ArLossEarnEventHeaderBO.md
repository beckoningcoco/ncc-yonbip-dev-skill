---
tags: [BIP, 元数据, 数据字典, FIAR.FIAR.ArLossEarnEventHeaderBO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 应收汇兑损益基本信息 (`FIAR.FIAR.ArLossEarnEventHeaderBO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_ledger_h` | domain：`yonbip-fi-earap` | 应用：`EAR` | 业务对象ID：`dec9ad5b-0499-41f1-86a7-0ceda1d2cc91`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 应收汇兑损益基本信息 |
| 物理表 | `arap_ledger_h` |
| domain/服务域 | `yonbip-fi-earap` |
| schema | `fiearap` |
| 所属应用 | `EAR` |
| 直连字段 | 56 个 |
| 子表 | 1 个 |
| 关联引用 | 20 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodyItem` | `FIAR.FIAR.ArLossEarnEventBodyBO` | composition |

## 关联引用 (20个)

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
| `carryover_period_id` | `` |
| `event_type_id` | `yonbip-fi-eaai2.RefTable_a70ca2f048` |
| `ytenant_id` | `` |
| `src_app_id` | `fiepub.fiepub_sourceapplicationref` |
| `src_trade_type_id` | `ucfbasedoc.bd_billtyperef` |
| `acc_purpose` | `finbd.bd_accpurposeref` |
| `acc_period_id` | `finbd.bd_period` |
| `acc_book_id` | `fiepub.fiepub_accountbookref` |
| `acc_year_id` | `finbd.bd_period` |
| `acc_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `grp_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `org_currency_id` | `ucfbasedoc.bd_currencytenantref` |

## 继承接口 (2个, 2字段)

- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 56 个直连字段

### 文本字段 (17个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `event_code` | `event_code` | `code` | 损益事务记录号 |
| `acc_period_code` | `acc_period_code` | `accPeriodCode` | 会计期间 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年度 |
| `batch_no` | `batch_no` | `batchno` | 计算批次号 |
| `carryover_event_id` | `carryover_event_id` | `carryoverEvent` | 结转事务 |
| `carryover_period_code` | `carryover_period_code` | `carryoverPeriodCode` | 结转期间编码 |
| `carryover_year_code` | `carryover_year_code` | `carryoverYearCode` | 结转年度编码 |
| `check_error_msg` | `check_error_msg` | `checkErrorMsg` | 会计事务校验异常信息 |
| `entry_code` | `entry_code` | `entryCode` | 事项分录编码 |
| `entry_id` | `entry_id` | `entryId` | 事项分录id |
| `id` | `id` | `id` | 主键 |
| `post_status_code` | `post_status_code` | `postStatusCode` | 事项分录生成状态编码 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `src_event_id` | `src_event_id` | `srcEvent` | 来源事务ID |
| `src_bill_id` | `src_bill_id` | `srcGrandsonId` | 来源事务核算行ID |
| `voucher_code` | `voucher_code` | `voucherCode` | 总账凭证号 |
| `voucher_id` | `voucher_id` | `voucherId` | 凭证ID |

### 引用字段 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `src_trade_type_id` | `src_trade_type_id` | `bustype` | 交易类型 |
| `acc_book_id` | `acc_book_id` | `accBook` | 财务账簿 |
| `acc_currency_id` | `acc_currency_id` | `accCurrency` | 账簿本币 |
| `acc_period_id` | `acc_period_id` | `accPeriod` | 会计期间ID |
| `acc_purpose` | `acc_purpose` | `accPurpose` | 核算目的 |
| `acc_year_id` | `acc_year_id` | `accYear` | 会计年度ID |
| `carryover_period_id` | `carryover_period_id` | `carryoverPeriod` | 结转期间 |
| `carryover_year_id` | `carryover_year_id` | `carryoverYear` | 结转年度 |
| `creator` | `creator` | `creator` | 创建人 |
| `event_type_id` | `event_type_id` | `eventType` | 会计事务 |
| `finance_org_id` | `finance_org_id` | `financeOrg` | 会计主体 |
| `gbl_currency_id` | `gbl_currency_id` | `gblCurrency` | 全局本币 |
| `grp_currency_id` | `grp_currency_id` | `grpCurrency` | 集团本币 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `org_currency_id` | `org_currency_id` | `orgCurrency` | 组织本币 |
| `ori_currency_id` | `ori_currency_id` | `oriCurrency` | 原币 |
| `src_app_id` | `src_app_id` | `srcApp` | 来源应用 |
| `voucher_type_id` | `voucher_type_id` | `voucherType` | 凭证类型 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_date` | `acc_date` | `accDate` | 记账日期 |
| `src_bill_date` | `src_bill_date` | `busDate` | 计算日期 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `arap_event_type` | `arap_event_type` | `arapEventType` | 收付会计事务 |
| `bln_effect` | `bln_effect` | `blnEffect` | 生效状态 |
| `bln_write_off` | `bln_write_off` | `blnWriteOff` | 是否冲销 |
| `post_state` | `post_state` | `postState` | 事项分录生成状态 |
| `status` | `status` | `status` | 事务状态 |
| `write_off_state` | `write_off_state` | `writeOffState` | 冲销状态 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_carryover` | `bln_carryover` | `blnCarryover` | 是否结转 |
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `send_data_version` | `send_data_version` | `sendDataVersion` | 发送会计平台数据版本 |

### 数值字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_amount` | `acc_amount` | `accAmount` | 本币金额 |
| `gbl_amount` | `gbl_amount` | `gblAmount` | 全局币金额 |
| `grp_amount` | `grp_amount` | `grpAmount` | 集团币金额 |
| `org_amount` | `org_amount` | `orgAmount` | 组织币金额 |
| `ori_amount` | `ori_amount` | `oriAmount` | 金额 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bodyItem` | 应收汇兑损益明细信息 |
