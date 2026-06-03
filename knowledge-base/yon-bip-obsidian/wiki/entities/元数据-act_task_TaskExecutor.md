---
tags: [BIP, 元数据, 数据字典, act.task.TaskExecutor]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 任务执行人 (`act.task.TaskExecutor`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`act_task_executor` | domain：`yycrm` | 应用：`ACT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 任务执行人 |
| 物理表 | `act_task_executor` |
| 数据库 schema | `yycrm` |
| 所属应用 | `ACT` |
| 直连字段 | 24 个 |
| 子表 | 2 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `headDef` | `act.task.TaskExecutorDef` | composition |
| `freeDef` | `act.task.TaskExecutorFreedef` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `partner_person` | `` |
| `` | `` |
| `ytenant_id` | `` |
| `executor` | `ucf-staff-center.bd_staff_ref` |
| `excutorDefineCharacter` | `` |
| `task_id` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 24 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acceptor` | `acceptor` | `acceptor` | 验收人 |
| `completeDescription` | `completeDescription` | `completeDescription` | 完成说明 |
| `delayReason` | `delayReason` | `delayReason` | 延期原因 |
| `refuseDescription` | `refuseDescription` | `refuseDescription` | 拒绝说明 |
| `schedule_id` | `schedule_id` | `scheduleId` | 日程ID |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `executor` | `executor` | `executor` | 执行人ID |
| `task_id` | `task_id` | `taskId` | 任务ID |
| `partner_person` | `partner_person` | `partnerPerson` | 伙伴执行人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_unlock` | `is_unlock` | `isUnlock` | 解锁状态 |
| `delay_status` | `delay_status` | `delayStatus` | 是否延期 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `execute_status` | `execute_status` | `executeStatus` | 执行状态 |
| `accept_status` | `accept_status` | `acceptStatus` | 验收状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `reform_status` | `reform_status` | `reformStatus` | 整改状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键ID |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `excutorDefineCharacter` | `excutorDefineCharacter` | `excutorDefineCharacter` | 执行人表自定义项特征组 |

### timestamp (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `complete_time` | `complete_time` | `completeTime` | 完成时间 |
| `accept_time` | `accept_time` | `acceptTime` | 验收时间 |
| `end_date` | `end_date` | `endDate` | 延期至 |
| `start_date` | `start_date` | `startDate` | 开始时间 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `freeDef` | 执行人自由自定义项 |
| `` | `` | `headDef` | 执行人固定自定义项 |
