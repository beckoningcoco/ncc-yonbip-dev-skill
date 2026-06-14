---
tags: [BIP, 元数据, 数据字典, act.task.TaskItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 任务事项 (`act.task.TaskItem`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`act_action_item` | domain：`yycrm` | 应用：`ACT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 任务事项 |
| 物理表 | `act_action_item` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `ACT` |
| 直连字段 | 15 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `activity_id` | `` |
| `business_object` | `` |
| `ytenant_id` | `` |
| `action_id` | `` |
| `matter_type` | `` |
| `task_id` | `` |

## 字段列表（按类型分组）

> 共 15 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_number_card` | `bill_number_card` | `billNumberCard` | 卡片表单编码 |
| `bill_type_code` | `bill_type_code` | `billTypeCode` | 单据类型编码 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `action_id` | `action_id` | `actionId` | 行动id |
| `activity_id` | `activity_id` | `activityId` | 活动ID |
| `business_object` | `business_object` | `businessObject` | 业务对象 |
| `matter_type` | `matter_type` | `matterType` | 事项类型 |
| `task_id` | `task_id` | `taskId` | 任务ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_extra` | `is_extra` | `isExtra` | 是否行动类型规定外事项 |
| `is_required` | `is_required` | `isRequired` | 是否必填 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `action_complete_status` | `action_complete_status` | `actionCompleteStatus` | 事项完成状态 |
| `display_order` | `display_order` | `displayOrder` | 显示顺序 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `display_name` | `display_name` | `displayName` | 显示名称 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
