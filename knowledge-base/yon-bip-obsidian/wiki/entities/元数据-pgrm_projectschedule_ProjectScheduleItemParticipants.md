---
tags: [BIP, 元数据, 数据字典, pgrm.projectschedule.ProjectScheduleItemParticipants]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 项目进度参与人 (`pgrm.projectschedule.ProjectScheduleItemParticipants`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`prjc_project_schedule_item_participants` | domain：`yonbip-pm-projectme` | 应用：`PGRM` | 业务对象ID：`5ed50b6c-9204-42ec-8910-4b7147d2f488`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 项目进度参与人 |
| 物理表 | `prjc_project_schedule_item_participants` |
| domain/服务域 | `yonbip-pm-projectme` |
| schema | `pmcloud` |
| 所属应用 | `PGRM` |
| 直连字段 | 18 个 |
| 子表 | 1 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `defines` | `pgrm.projectschedule.ProjectScheduleItemParticipantsDefine` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `schedule_item_id` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `project_id` | `` |
| `org_id` | `` |
| `member_id` | `` |
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

> 共 18 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `user_id` | `user_id` | `userId` | 用户id |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `member_id` | `member_id` | `memberId` | 参与人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `org_id` | `org_id` | `orgId` | 主组织 |
| `project_id` | `project_id` | `projectId` | 项目 |
| `schedule_item_id` | `schedule_item_id` | `scheduleItemId` | 项目进度计划主表外键 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `plan_end_date` | `plan_end_date` | `planEndDate` | 计划结束日期 |
| `plan_start_date` | `plan_start_date` | `planStartDate` | 计划开始日期 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_external_person` | `is_external_person` | `isExternalPerson` | 是否外部人员 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `plan_hours` | `plan_hours` | `planHours` | 计划工时 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 项目进度参与人自定义项 |
