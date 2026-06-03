---
tags: [BIP, 元数据, 数据字典, RVN.RVN.rvnBatchSettleAcc]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 收入管理批量结账 (`RVN.RVN.rvnBatchSettleAcc`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rvn_period_close_account` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`27bdf536-4316-48fc-b789-41610de20f4e`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 收入管理批量结账 |
| 物理表 | `rvn_period_close_account` |
| 数据库 schema | `yonbip-fi-ercl` |
| 所属应用 | `RVN` |
| 直连字段 | 25 个 |
| 子表 | 0 个 |
| 关联引用 | 9 个 |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `acc_period` | `finbd.bd_period` |
| `close_modifier` | `u8c-auth.ba_user_ref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `finance_org_id` | `ucf-org-center.bd_financeorgtreeref_na` |
| `acc_book_id` | `fiepub.fiepub_accountbooktreeref` |
| `acc_year` | `finbd.bd_period` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `settle_modifier` | `u8c-auth.ba_user_ref` |
| `ytenant_id` | `` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 25 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_period_code` | `acc_period_code` | `accPeriodCode` | 会计期间编码 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年度编码 |
| `system_type` | `system_type` | `systemType` | 系统标识 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_book_id` | `acc_book_id` | `accBook` | 账簿 |
| `acc_period` | `acc_period` | `accPeriod` | 会计期间 |
| `acc_year` | `acc_year` | `accYear` | 会计年度 |
| `close_modifier` | `close_modifier` | `closeModifier` | 关账执行人 |
| `finance_org_id` | `finance_org_id` | `financeOrg` | 会计主体 |
| `settle_modifier` | `settle_modifier` | `settleModifier` | 结账执行人 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `begin_date` | `begin_date` | `beginDate` | 会计期间开始日期 |
| `close_time` | `close_time` | `closeTime` | 关账执行时间 |
| `end_date` | `end_date` | `endDate` | 会计期间结束日期 |
| `settle_time` | `settle_time` | `settleTime` | 结账执行时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 枚举字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `close_check_state` | `close_check_state` | `closeCheckState` | 关账检查结果 |
| `close_state` | `close_state` | `closeState` | 关账状态 |
| `settle_check_state` | `settle_check_state` | `settleCheckState` | 结账检查结果 |
| `settle_state` | `settle_state` | `settleState` | 结账状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |
