---
tags: [BIP, 元数据, 数据字典, dsfa.taskplan.TaskPlanItemExecutor]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 任务计划明细执行人 (`dsfa.taskplan.TaskPlanItemExecutor`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`dsfa_taskplan_item_executor` | domain：`yycrm` | 应用：`DSFA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 任务计划明细执行人 |
| 物理表 | `dsfa_taskplan_item_executor` |
| 数据库 schema | `yycrm` |
| 所属应用 | `DSFA` |
| 直连字段 | 9 个 |
| 子表 | 1 个 |
| 关联引用 | 7 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `planItemExecutorFreeDef` | `dsfa.taskplan.PlanItemExecutorFreeDef` | composition |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `taskPlanItemExecutorDefineCharacter` | `` |
| `plan_item_id` | `` |
| `ytenant_id` | `` |
| `executor` | `ucf-staff-center.bd_staff_ref` |
| `partner_executor` | `ucf-staff-center.bd_outerstaff_info` |
| `tenant_id` | `` |
| `` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 9 个直连字段

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `partner_executor` | `partner_executor` | `partnerExecutor` | 明细执行人id |
| `executor` | `executor` | `executor` | 明细执行人id |
| `plan_item_id` | `plan_item_id` | `planItemId` | 明细ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 明细执行人子表id |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `taskPlanItemExecutorDefineCharacter` | `taskPlanItemExecutorDefineCharacter` | `taskPlanItemExecutorDefineCharacter` | 计划明细执行人特征组 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `planItemExecutorFreeDef` | 明细执行人自由自定义项 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
