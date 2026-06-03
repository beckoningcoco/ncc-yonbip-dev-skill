---
tags: [BIP, 元数据, 数据字典, GL.GL.glBalanceTrial]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 试算平衡结果 (`GL.GL.glBalanceTrial`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`gl_balance_trial` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`00bd551e-d089-493a-afbe-30f6b0c7681f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 试算平衡结果 |
| 物理表 | `gl_balance_trial` |
| 数据库 schema | `yonbip-fi-egl` |
| 所属应用 | `GL` |
| 直连字段 | 24 个 |
| 子表 | 1 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `glBalanceTrialDetailList` | `GL.GL.glBalanceTrialDetail` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `period` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `accbook` | `fiepub.fiepub_accountbookref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `currency` | `yonbip-fi-fadatr.currencyRef` |
| `two_level_accentity_id` | `ucf-org-center.org_pure_tree_ref` |
| `ytenant_id` | `` |
| `` | `` |

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

> 共 24 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `auxiliary` | `auxiliary` | `auxiliary` | 辅助核算 |
| `currency_type` | `currency_type` | `currencyType` | 币种类型 |
| `id` | `id` | `id` | 主键 |
| `task_id` | `task_id` | `taskId` | 任务id |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook` | `accbook` | `accbook` | 账簿 |
| `creator` | `creator` | `creator` | 创建人 |
| `currency` | `currency` | `currency` | 币种 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `period` | `period` | `period` | 会计期间 |
| `two_level_accentity_id` | `two_level_accentity_id` | `twoLevelAccentityId` | 内部核算单元 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `trial_result` | `trial_result` | `trialResult` | 试算结果 |
| `trial_source` | `trial_source` | `trialSource` | 试算来源 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `balance_sum` | `balance_sum` | `balanceSum` | 借贷余额合计差额 |
| `credit_balance` | `credit_balance` | `creditBalance` | 贷方余额 |
| `debit_balance` | `debit_balance` | `debitBalance` | 借方余额 |
| `occur_credit_amount` | `occur_credit_amount` | `occurCreditAmount` | 贷方发生额 |
| `occur_debit_amount` | `occur_debit_amount` | `occurDebitAmount` | 借方发生额 |
| `occur_sum` | `occur_sum` | `occurSum` | 借贷发生额合计差额 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `glBalanceTrialDetailList` | 试算平衡结果详情 |
