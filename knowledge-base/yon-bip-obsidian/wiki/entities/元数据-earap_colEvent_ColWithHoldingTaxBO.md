---
tags: [BIP, 元数据, 数据字典, earap.colEvent.ColWithHoldingTaxBO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 日常收款代扣税信息 (`earap.colEvent.ColWithHoldingTaxBO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_ledger_g_wht` | domain：`yonbip-fi-earap` | 应用：`EAR` | 业务对象ID：`d79a1403-5415-484f-b394-8cc7f7b558e4`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 日常收款代扣税信息 |
| 物理表 | `arap_ledger_g_wht` |
| 数据库 schema | `yonbip-fi-earap` |
| 所属应用 | `EAR` |
| 直连字段 | 35 个 |
| 子表 | 0 个 |
| 关联引用 | 15 个 |

## 关联引用 (15个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `finance_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `whtax_id` | `yonbip-fi-taxpubdoc.RefTable_6e574b3619` |
| `carryover_year_id` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `carryover_period_id` | `` |
| `event_type_id` | `yonbip-fi-eaai2.RefTable_a70ca2f048` |
| `ytenant_id` | `` |
| `body_id` | `` |
| `acc_period_id` | `finbd.bd_period` |
| `whtax_type_id` | `yonbip-fi-taxpubdoc.RefTable_9623e95970` |
| `whtax_subject_id` | `ucfbasedoc.bd_taxrate` |
| `acc_book_id` | `fiepub.fiepub_accountbookref` |
| `acc_year_id` | `finbd.bd_period` |
| `event_id` | `` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 35 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_period_code` | `acc_period_code` | `accPeriodCode` | 会计期间编码 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年度编码 |
| `carryover_period_code` | `carryover_period_code` | `carryoverPeriodCode` | 结转期间编码 |
| `carryover_year_code` | `carryover_year_code` | `carryoverYearCode` | 结转年度编码 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_book_id` | `acc_book_id` | `accBook` | 账簿 |
| `acc_period_id` | `acc_period_id` | `accPeriod` | 会计期间 |
| `acc_year_id` | `acc_year_id` | `accYear` | 会计年度 |
| `body_id` | `body_id` | `body` | 日常收款明细信息 |
| `carryover_period_id` | `carryover_period_id` | `carryoverPeriod` | 结转期间 |
| `carryover_year_id` | `carryover_year_id` | `carryoverYear` | 结转年度 |
| `creator` | `creator` | `creator` | 创建人 |
| `event_id` | `event_id` | `event` | 日常收款基本信息 |
| `event_type_id` | `event_type_id` | `eventType` | 会计事务类型ID |
| `finance_org_id` | `finance_org_id` | `financeOrg` | 会计主体 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `whtax_id` | `whtax_id` | `whtax` | 代扣税税码 |
| `whtax_subject_id` | `whtax_subject_id` | `whtaxSubject` | 代扣税税目 |
| `whtax_type_id` | `whtax_type_id` | `whtaxType` | 代扣税类型(系统) |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `arap_event_type` | `arap_event_type` | `arapEventType` | 应收应付会计事务类型 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `order_no` | `order_no` | `orderNo` | 序号 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_carryover` | `bln_carryover` | `blnCarryover` | 是否结转 |
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_whtax_amount` | `acc_whtax_amount` | `accWhtaxAmount` | 本币代扣税税额 |
| `gbl_whtax_amount` | `gbl_whtax_amount` | `gblWhtaxAmount` | 全局币代扣税税额 |
| `grp_whtax_amount` | `grp_whtax_amount` | `grpWhtaxAmount` | 集团币代扣税税额 |
| `org_whtax_amount` | `org_whtax_amount` | `orgWhtaxAmount` | 组织币代扣税税额 |
| `ori_whtax_amount` | `ori_whtax_amount` | `oriWhtaxAmount` | 代扣税税额 |
| `ori_whtax_base_amount` | `ori_whtax_base_amount` | `oriWhtaxBaseAmount` | 税基 |
| `row_no` | `row_no` | `rowNo` | 行号 |
| `whtax_rate` | `whtax_rate` | `whtaxRate` | 税率 |
