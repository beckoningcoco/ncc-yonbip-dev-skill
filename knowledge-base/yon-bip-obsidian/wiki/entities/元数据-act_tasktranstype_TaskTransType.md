---
tags: [BIP, 元数据, 数据字典, act.tasktranstype.TaskTransType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 任务交易类型 (`act.tasktranstype.TaskTransType`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`act_task_trans_type` | domain：`yycrm` | 应用：`ACT` | 业务对象ID：`051158c5-1567-4a8b-b0d4-7a263fe7344b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 任务交易类型 |
| 物理表 | `act_task_trans_type` |
| 数据库 schema | `yycrm` |
| 所属应用 | `ACT` |
| 直连字段 | 30 个 |
| 子表 | 2 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `taskSettingMatterList` | `act.tasktranstype.TaskSettingMatter` | composition |
| `taskTransTypeRemindRuleList` | `act.tasktranstype.TaskTransTypeRemindRule` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |
| `action_trans_type` | `` |
| `bustype` | `transtype.bd_billtyperef` |
| `tenant_id` | `` |

## 继承接口 (3个, 10字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 30 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `task_object` | `task_object` | `taskObject` | 任务对象 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bustype` | `bustype` | `bustype` | 任务类型 |
| `action_trans_type` | `action_trans_type` | `actionTransType` | 行动类型 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_accept_and_reject` | `is_accept_and_reject` | `isAllowAcceptAndReject` | 允许接受拒绝 |
| `is_allow_roll_out` | `is_allow_roll_out` | `isAllowRollOut` | 允许转派 |
| `is_auto_complete` | `is_auto_complete` | `isAutoComplete` | 是否自动完成 |
| `is_check_and_accept` | `is_check_and_accept` | `isCheckAndAccept` | 需要验收 |
| `is_executor_default_me` | `is_executor_default_me` | `isExecutorDefaultMe` | 执行人默认本人 |
| `ban_manual_create` | `ban_manual_create` | `banManualCreate` | 禁止手动创建 |
| `from_visit_route` | `from_visit_route` | `fromVisitRoute` | 按拜访路线创建 |
| `auto_lock_visitor` | `auto_lock_visitor` | `autoLockVisitor` | 自动锁定隐藏拜访对象 |
| `follow_route_strictly` | `follow_route_strictly` | `followRouteStrictly` | 严格按路线拜访 |
| `is_allow_new_task` | `is_allow_new_task` | `isAllowNewTask` | 有未完成任务不允许执行新任务 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `message_reminder_type` | `message_reminder_type` | `messageReminderType` | 消息通知 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_preset` | `is_preset` | `isPreset` | 是否预置 |
| `structure_type` | `structure_type` | `structureType` | 任务结构 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `taskSettingMatterList` | 任务类型设置关联事项 |
| `` | `` | `taskTransTypeRemindRuleList` | 提醒规则 |
