---
tags: [BIP, 元数据, 数据字典, FIAR.FIAR.CreditorTransferGrandBO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 债权转移查询计划信息 (`FIAR.FIAR.CreditorTransferGrandBO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_ledger_g` | domain：`yonbip-fi-earap` | 应用：`EAR` | 业务对象ID：`86ebf74f-2fd9-450d-9f10-846371f1eda0`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 债权转移查询计划信息 |
| 物理表 | `arap_ledger_g` |
| domain/服务域 | `yonbip-fi-earap` |
| schema | `fiearap` |
| 所属应用 | `EAR` |
| 直连字段 | 41 个 |
| 子表 | 0 个 |
| 关联引用 | 15 个 |

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
| `clue_no` | `` |
| `body_id` | `` |
| `src_grandson_id` | `` |
| `acc_period_id` | `finbd.bd_period` |
| `acc_book_id` | `fiepub.fiepub_accountbookref` |
| `src_event_id` | `` |
| `acc_year_id` | `finbd.bd_period` |
| `ori_grandson_id` | `` |

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

> 共 41 个直连字段

### 文本字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `src_exe_detail_id` | `src_exe_detail_id` | `srcExeDetailId` | 执行明细ID |
| `acc_period_code` | `acc_period_code` | `accPeriodCode` | 会计期间编码 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年度编码 |
| `amount_direction` | `amount_direction` | `amountDirection` | 借贷方向 |
| `digest` | `digest` | `digest` | 处理摘要 |
| `event_id` | `event_id` | `event` | 事务ID |
| `event_type_id` | `event_type_id` | `eventType` | 会计事务 |
| `carryover_body_id` | `carryover_body_id` | `carryoverBody` | 结转事务行 |
| `carryover_event_id` | `carryover_event_id` | `carryoverEvent` | 结转事务 |
| `carryover_grandson_id` | `carryover_grandson_id` | `carryoverGrandson` | 结转事务孙行 |
| `carryover_period_code` | `carryover_period_code` | `carryoverPeriodCode` | 结转期间编码 |
| `carryover_year_code` | `carryover_year_code` | `carryoverYearCode` | 结转年度编码 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_book_id` | `acc_book_id` | `accBook` | 财务账簿ID |
| `acc_period_id` | `acc_period_id` | `accPeriod` | 会计期间ID |
| `acc_year_id` | `acc_year_id` | `accYear` | 会计年度ID |
| `clue_no` | `clue_no` | `aimGrandson` | 转入核算ID |
| `body_id` | `body_id` | `body` | 明细ID |
| `finance_org_id` | `finance_org_id` | `financeOrg` | 会计主体ID |
| `ori_grandson_id` | `ori_grandson_id` | `oriGrandsonId` | 源头核算ID |
| `src_body_id` | `src_body_id` | `srcBody` | 来源事务子表ID |
| `src_event_id` | `src_event_id` | `srcEvent` | 来源事务主表ID |
| `src_grandson_id` | `src_grandson_id` | `srcGrandson` | 来源核算ID |
| `carryover_period_id` | `carryover_period_id` | `carryoverPeriod` | 结转期间 |
| `carryover_year_id` | `carryover_year_id` | `carryoverYear` | 结转年度 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `expire_date` | `expire_date` | `expireDate` | 到期日 |

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

### 数值字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_amount` | `acc_amount` | `accAmount` | 本币金额 |
| `gbl_amount` | `gbl_amount` | `gblAmount` | 全局币金额 |
| `grp_amount` | `grp_amount` | `grpAmount` | 集团币金额 |
| `org_amount` | `org_amount` | `orgAmount` | 组织币金额 |
| `ori_amount` | `ori_amount` | `oriAmount` | 金额 |
