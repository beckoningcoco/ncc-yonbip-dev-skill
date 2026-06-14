---
tags: [BIP, 元数据, 数据字典, EIA.calRow.CalRowsBodyVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 待计算行清单子表 (`EIA.calRow.CalRowsBodyVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ia_cal_rows_b` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`862f1a7e-9900-4b72-88ff-50509a47c871`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 待计算行清单子表 |
| 物理表 | `ia_cal_rows_b` |
| domain/服务域 | `yonbip-fi-eia` |
| schema | `fieia` |
| 所属应用 | `EIA` |
| 直连字段 | 24 个 |
| 子表 | 0 个 |
| 关联引用 | 12 个 |

## 关联引用 (12个)

| 字段名 | 引用类型 |
|--------|---------|
| `ledger_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `cost_domain_id` | `yonbip-fi-eia.RefTable_0e6f869743` |
| `accpurpose_id` | `finbd.bd_accpurposeref` |
| `accbook_id` | `fiepub.fiepub_accountbook_all_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `inventory_obj_id` | `` |
| `ledger_body_id` | `` |
| `ytenant_id` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref_all` |
| `acc_year_id` | `finbd.bd_periodyear` |
| `header_id` | `` |

## 继承接口 (3个, 6字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 24 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计期间年编码 |
| `solution` | `solution` | `solution` | 解决方案 |
| `exec_fail_reason` | `exec_fail_reason` | `execFailReason` | 执行失败原因 |
| `busi_bill_row_id` | `busi_bill_row_id` | `busiBillRowId` | 业务行ID |
| `period_id` | `period_id` | `period` | 会计期间ID |
| `period_code` | `period_code` | `periodCode` | 会计期间编码 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_year_id` | `acc_year_id` | `accYearId` | 会计期间年ID |
| `ledger_id` | `ledger_id` | `ledgerId` | 流水账主表ID |
| `ledger_body_id` | `ledger_body_id` | `ledgerBodyId` | 核算表ID |
| `inventory_obj_id` | `inventory_obj_id` | `inventoryObjId` | 存货对象ID |
| `cost_domain_id` | `cost_domain_id` | `costDomainId` | 成本域ID |
| `accbook_id` | `accbook_id` | `accbook` | 账簿 |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `accpurpose_id` | `accpurpose_id` | `accpurpose` | 核算目的 |
| `header_id` | `header_id` | `headerId` | 待计算行清单ID |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `creator` | `creator` | `creator` | 创建人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exec_status` | `exec_status` | `execStatus` | 执行状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |
