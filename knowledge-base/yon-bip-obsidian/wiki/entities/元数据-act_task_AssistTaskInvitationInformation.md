---
tags: [BIP, 元数据, 数据字典, act.task.AssistTaskInvitationInformation]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 协访邀请信息 (`act.task.AssistTaskInvitationInformation`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`act_assist_task_invitation_information` | domain：`yycrm` | 应用：`ACT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 协访邀请信息 |
| 物理表 | `act_assist_task_invitation_information` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `ACT` |
| 直连字段 | 10 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `assist_task_id` | `` |
| `assist_person` | `` |
| `ytenant_id` | `` |
| `assist_type` | `` |
| `task_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 10 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `assist_content` | `assist_content` | `assistContent` | 协访说明 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `assist_person` | `assist_person` | `assistPerson` | 协访人 |
| `assist_task_id` | `assist_task_id` | `assistTask` | 协访任务 |
| `assist_type` | `assist_type` | `assistType` | 协访类型 |
| `task_id` | `task_id` | `taskId` | 任务ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `invitation_status` | `invitation_status` | `invitationStatus` | 邀请状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `invitation_date` | `invitation_date` | `invitationDate` | 邀请时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
