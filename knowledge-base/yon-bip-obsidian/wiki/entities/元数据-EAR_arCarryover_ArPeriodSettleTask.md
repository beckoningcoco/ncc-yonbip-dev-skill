---
tags: [BIP, 元数据, 数据字典, EAR.arCarryover.ArPeriodSettleTask]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 应收结转任务 (`EAR.arCarryover.ArPeriodSettleTask`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_period_settle_task` | domain：`yonbip-fi-earap` | 应用：`EAR` | 业务对象ID：`fa0ff95c-ddcb-4817-be2f-43a8b089993e`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 应收结转任务 |
| 物理表 | `arap_period_settle_task` |
| 数据库 schema | `yonbip-fi-earap` |
| 所属应用 | `EAR` |
| 直连字段 | 22 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `acc_period_id` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `finance_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `acc_book_id` | `fiepub.fiepub_accountbookref` |
| `acc_year_id` | `finbd.bd_periodyear` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |

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

> 共 22 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年度编码 |
| `acc_period_code` | `acc_period_code` | `accPeriodCode` | 会计期间编码 |
| `trace_id` | `trace_id` | `traceId` | 链路ID |
| `task_type` | `task_type` | `taskType` | 任务类型 |
| `task_order` | `task_order` | `taskOrder` | 任务批号 |
| `task_state` | `task_state` | `taskState` | 任务状态 |
| `special` | `special` | `special` | 特殊说明 |
| `system_type` | `system_type` | `systemType` | 系统标识 |
| `settle_id` | `settle_id` | `settleId` | 月结ID |
| `condition` | `condition` | `condition` | 子任务查询条件 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `finance_org_id` | `finance_org_id` | `financeOrg` | 会计主体 |
| `acc_book_id` | `acc_book_id` | `accBook` | 财务账簿 |
| `acc_year_id` | `acc_year_id` | `accYear` | 会计年度 |
| `acc_period_id` | `acc_period_id` | `accPeriod` | 会计期间 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |
