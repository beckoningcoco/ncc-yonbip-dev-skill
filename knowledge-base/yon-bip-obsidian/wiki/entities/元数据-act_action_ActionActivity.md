---
tags: [BIP, 元数据, 数据字典, act.action.ActionActivity]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 行动活动 (`act.action.ActionActivity`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`act_action_activity` | domain：`yycrm` | 应用：`ACT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 行动活动 |
| 物理表 | `act_action_activity` |
| 数据库 schema | `yycrm` |
| 所属应用 | `ACT` |
| 直连字段 | 6 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `activity_id` | `` |
| `ytenant_id` | `` |
| `action_id` | `` |
| `task_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 6 个直连字段

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `activity_id` | `activity_id` | `actionActivityId` | 行动活动id |
| `action_id` | `action_id` | `actionId` | 行动id |
| `task_id` | `task_id` | `actionTaskId` | 行动事项id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
