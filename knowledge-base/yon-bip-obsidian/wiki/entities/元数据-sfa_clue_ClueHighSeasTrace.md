---
tags: [BIP, 元数据, 数据字典, sfa.clue.ClueHighSeasTrace]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 线索公海业务信息 (`sfa.clue.ClueHighSeasTrace`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sfa_clue_highseas_trace` | domain：`yycrm` | 应用：`SFA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 线索公海业务信息 |
| 物理表 | `sfa_clue_highseas_trace` |
| 数据库 schema | `yycrm` |
| 所属应用 | `SFA` |
| 直连字段 | 21 个 |
| 子表 | 0 个 |
| 关联引用 | 11 个 |

## 关联引用 (11个)

| 字段名 | 引用类型 |
|--------|---------|
| `latestReceiver` | `` |
| `firstReturnReason` | `` |
| `firstReturnSaleArea` | `` |
| `latestOwer` | `` |
| `firstReturnOrg` | `` |
| `latestFollow` | `` |
| `ytenant_id` | `` |
| `firstReturnPerson` | `` |
| `latestAllocateOperator` | `` |
| `id` | `` |
| `firstReturnDept` | `` |

## 继承接口 (2个, 12字段)

- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **公海数据业务信息** (`sfa.common.BusinessTraceForHighsea`)
  - `firstEnterTime` → `firstEnterTime`
  - `lastEnterTime` → `lastEnterTime`
  - `latestAllocateOperator` → `latestAllocateOperator`
  - `latestAllocateOperatorName` → `latestAllocateOperatorName`
  - `latestAllocateTime` → `latestAllocateTime`
  - `latestFollow` → `latestFollow`
  - `latestOwer` → `latestOwer`
  - `latestReceiver` → `latestReceiver`
  - `latestReceiveTime` → `latestReceiveTime`
  - `recoverCount` → `recoverCount`
  - `returnCount` → `returnCount`

## 字段列表（按类型分组）

> 共 21 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `firstReturnRemark` | `firstReturnRemark` | `firstReturnRemark` | 首次退回备注 |
| `latestAllocateOperatorName` | `latestAllocateOperatorName` | `latestAllocateOperatorName` | 最近分配操作人姓名 |

### 引用字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `firstReturnDept` | `firstReturnDept` | `firstReturnDept` | 首次退回部门 |
| `firstReturnOrg` | `firstReturnOrg` | `firstReturnOrg` | 首次退回组织 |
| `firstReturnPerson` | `firstReturnPerson` | `firstReturnPerson` | 首次退回人 |
| `firstReturnReason` | `firstReturnReason` | `firstReturnReason` | 首次退回原因 |
| `firstReturnSaleArea` | `firstReturnSaleArea` | `firstReturnSaleArea` | 首次退回区域 |
| `id` | `id` | `id` | 单据id |
| `latestAllocateOperator` | `latestAllocateOperator` | `latestAllocateOperator` | 最近分配操作人 |
| `latestFollow` | `latestFollow` | `latestFollow` | 最近跟进记录 |
| `latestOwer` | `latestOwer` | `latestOwer` | 最近负责人 |
| `latestReceiver` | `latestReceiver` | `latestReceiver` | 最近领取人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `recoverCount` | `recoverCount` | `recoverCount` | 收回次数 |
| `returnCount` | `returnCount` | `returnCount` | 退回次数 |

### timestamp (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `firstEnterTime` | `firstEnterTime` | `firstEnterTime` | 首次进公海时间 |
| `firstReturnTime` | `firstReturnTime` | `firstReturnTime` | 首次退回时间 |
| `lastEnterTime` | `lastEnterTime` | `lastEnterTime` | 最后进公海时间 |
| `latestAllocateTime` | `latestAllocateTime` | `latestAllocateTime` | 最近分配时间 |
| `latestReceiveTime` | `latestReceiveTime` | `latestReceiveTime` | 最近领取时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
