---
tags: [BIP, 元数据, 数据字典, FIAP.FIAP.TransferGrandson]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 待债务转移列表计划信息 (`FIAP.FIAP.TransferGrandson`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_ledger_g` | domain：`yonbip-fi-earap` | 应用：`EAP` | 业务对象ID：`4c4449a2-c22d-493f-965b-3ae6900d7762`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 待债务转移列表计划信息 |
| 物理表 | `arap_ledger_g` |
| domain/服务域 | `yonbip-fi-earap` |
| schema | `fiearap` |
| 所属应用 | `EAP` |
| 直连字段 | 55 个 |
| 子表 | 0 个 |
| 关联引用 | 18 个 |

## 关联引用 (18个)

| 字段名 | 引用类型 |
|--------|---------|
| `src_body_id` | `` |
| `gain_loss_subject_id` | `fiepub.epub_accsubject_treetableref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `finance_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `carryover_year_id` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `carryover_period_id` | `` |
| `ap_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `ytenant_id` | `` |
| `clue_no` | `` |
| `body_id` | `` |
| `src_grandson_id` | `` |
| `acc_period_id` | `finbd.bd_period` |
| `ap_subject_id` | `fiepub.epub_accsubject_treetableref` |
| `acc_book_id` | `ucf-org-center.bd_financeorgtreeref` |
| `src_event_id` | `` |
| `acc_year_id` | `finbd.bd_period` |
| `gain_loss_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |

## 继承接口 (4个, 14字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **收付结转孙表** (`FIAP.FIAP.IEARAPCarryoverGrandson`)
  - `bln_carryover` → `bln_carryover`
  - `carryover_body_id` → `carryover_body_id`
  - `carryover_event_id` → `carryover_event_id`
  - `carryover_grandson_id` → `carryover_grandson_id`
  - `carryover_period_id` → `carryover_period_id`
  - `carryover_period_code` → `carryover_period_code`
  - `carryover_year_id` → `carryover_year_id`
  - `carryover_year_code` → `carryover_year_code`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 55 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `amount_direction` | `amount_direction` | `amountDirection` | 借贷方向 |
| `carryover_body_id` | `carryover_body_id` | `carryoverBody` | 结转事务行 |
| `carryover_event_id` | `carryover_event_id` | `carryoverEvent` | 结转事务 |
| `carryover_grandson_id` | `carryover_grandson_id` | `carryoverGrandson` | 结转事务孙行 |
| `carryover_period_code` | `carryover_period_code` | `carryoverPeriodCode` | 结转期间编码 |
| `carryover_year_code` | `carryover_year_code` | `carryoverYearCode` | 结转年度编码 |
| `digest` | `digest` | `digest` | 处理摘要 |
| `event_id` | `event_id` | `event` | 事务ID |
| `event_type_id` | `event_type_id` | `eventType` | 会计事务 |
| `id` | `id` | `id` | 主键 |
| `issue_no` | `issue_no` | `issueNo` | 付款期号 |

### 引用字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ap_subject_id` | `ap_subject_id` | `aPSubject` | 应付账款科目 |
| `acc_book_id` | `acc_book_id` | `accBook` | 财务账簿 |
| `acc_period_id` | `acc_period_id` | `accPeriod` | 会计期间ID |
| `acc_year_id` | `acc_year_id` | `accYear` | 会计年度ID |
| `clue_no` | `clue_no` | `aimGrandson` | 转入核算ID |
| `ap_subject_vid` | `ap_subject_vid` | `apSubjectVid` | 应付账款科目版本 |
| `body_id` | `body_id` | `body` | 债务转移子表 |
| `carryover_period_id` | `carryover_period_id` | `carryoverPeriod` | 结转期间 |
| `carryover_year_id` | `carryover_year_id` | `carryoverYear` | 结转年度 |
| `creator` | `creator` | `creator` | 创建人 |
| `finance_org_id` | `finance_org_id` | `financeOrg` | 会计主体 |
| `gain_loss_subject_id` | `gain_loss_subject_id` | `gainLossSubject` | 汇兑损益科目 |
| `gain_loss_subject_vid` | `gain_loss_subject_vid` | `gainLossSubjectVid` | 汇兑损益科目版本 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `src_body_id` | `src_body_id` | `srcBody` | 来源事务子表ID |
| `src_event_id` | `src_event_id` | `srcEvent` | 来源事务主表ID |
| `src_grandson_id` | `src_grandson_id` | `srcGrandson` | 来源核算ID |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `expire_date` | `expire_date` | `expireDate` | 到期日 |
| `start_date` | `start_date` | `startDate` | 起算日期 |

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

### 枚举字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `balance_state` | `balance_state` | `balanceState` | 清账状态 |
| `bln_deposit` | `bln_deposit` | `blnDeposit` | 是否保证金 |
| `bln_prepare` | `bln_prepare` | `blnPrepare` | 是否预付 |
| `convert_way` | `convert_way` | `convertWay` | 预付核销方法 |
| `src_arap_event_type` | `src_arap_event_type` | `srcArapEventType` | 来源收付会计事务 |

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
| `acc_balance` | `acc_balance` | `accBalance` | 本币余额 |
| `gbl_amount` | `gbl_amount` | `gblAmount` | 全局币金额 |
| `gbl_balance` | `gbl_balance` | `gblBalance` | 全局币余额 |
| `grp_amount` | `grp_amount` | `grpAmount` | 集团币金额 |
| `grp_balance` | `grp_balance` | `grpBalance` | 集团币余额 |
| `org_amount` | `org_amount` | `orgAmount` | 组织币金额 |
| `org_balance` | `org_balance` | `orgBalance` | 组织币余额 |
| `ori_amount` | `ori_amount` | `oriAmount` | 金额 |
| `ori_balance` | `ori_balance` | `oriBalance` | 余额 |
| `ori_ocupy_amount` | `ori_ocupy_amount` | `oriOcupyAmount` | 预占用金额 |
| `ratio` | `ratio` | `ratio` | 付款比例 |
