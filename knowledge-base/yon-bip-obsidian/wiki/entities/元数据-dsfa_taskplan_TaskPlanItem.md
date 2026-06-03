---
tags: [BIP, 元数据, 数据字典, dsfa.taskplan.TaskPlanItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 任务计划明细 (`dsfa.taskplan.TaskPlanItem`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`dsfa_taskplan_item` | domain：`yycrm` | 应用：`DSFA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 任务计划明细 |
| 物理表 | `dsfa_taskplan_item` |
| 数据库 schema | `yycrm` |
| 所属应用 | `DSFA` |
| 直连字段 | 21 个 |
| 子表 | 3 个 |
| 关联引用 | 12 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `partnerPlanItemExecutorList` | `dsfa.taskplan.PartnerTaskPlanItemExecutor` | composition |
| `planItemExecutorList` | `dsfa.taskplan.TaskPlanItemExecutor` | composition |
| `taskPlanItemFreeDef` | `dsfa.taskplan.TaskPlanItemFreeDef` | composition |

## 关联引用 (12个)

| 字段名 | 引用类型 |
|--------|---------|
| `assist_task` | `` |
| `` | `` |
| `assist_person` | `` |
| `route_id` | `` |
| `taskPlanItemDefineCharacter` | `` |
| `ytenant_id` | `` |
| `plan_id` | `` |
| `terminal` | `yxybase.aa_storeterminal` |
| `tenant_id` | `` |
| `customer_id` | `cust_customerref` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 21 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `routeLineNo` | `routeLineNo` | `routeLineNo` | 行号 |
| `summary` | `summary` | `summary` | 任务摘要 |
| `content` | `content` | `content` | 任务内容 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `plan_id` | `plan_id` | `planId` | 计划ID |
| `assist_person` | `assist_person` | `assistPerson` | 协访人 |
| `assist_task` | `assist_task` | `assistTask` | 协访任务 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `route_id` | `route_id` | `routeId` | 路线id |
| `customer_id` | `customer_id` | `customer` | 客户 |
| `terminal` | `terminal` | `terminal` | 终端id |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 明细执行人子表id |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `lineNo` | `lineNo` | `lineNo` | 行号 |

### other (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `execute_status` | `execute_status` | `executeStatus` | 执行状态 |
| `` | `` | `partnerPlanItemExecutorList` | 任务计划明细伙伴执行人 |
| `` | `` | `planItemExecutorList` | 任务计划明细执行人 |
| `` | `` | `taskPlanItemFreeDef` | 明细自由自定义项 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `start_date` | `start_date` | `startDate` | 开始时间 |
| `end_date` | `end_date` | `endDate` | 结束时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `taskPlanItemDefineCharacter` | `taskPlanItemDefineCharacter` | `taskPlanItemDefineCharacter` | 计划明细特征组 |
