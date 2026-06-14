---
tags: [BIP, 元数据, 数据字典, dsfa.taskplan.TaskPlanRoute]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 任务计划路线 (`dsfa.taskplan.TaskPlanRoute`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`dsfa_taskplan_route` | domain：`yycrm` | 应用：`DSFA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 任务计划路线 |
| 物理表 | `dsfa_taskplan_route` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `DSFA` |
| 直连字段 | 15 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `route_id` | `dsfa_visitrouteref` |
| `ytenant_id` | `` |
| `plan_id` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 15 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_week` | `create_week` | `createWeek` | 拜访日期(周) |
| `create_month` | `create_month` | `createMonth` | 拜访日期(月) |
| `routeLineNo` | `routeLineNo` | `routeLineNo` | 行号 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `route_id` | `route_id` | `routeId` | 路线id |
| `plan_id` | `plan_id` | `planId` | 任务计划ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_circle_task` | `is_circle_task` | `circleTask` | 周期任务 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_frequency` | `create_frequency` | `createFrequency` | 计划频率 |
| `terminal_count` | `terminal_count` | `terminalCount` | 终端数量 |
| `customer_count` | `customer_count` | `customerCount` | 客户数量 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 路线子表id |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `start_date` | `start_date` | `startDate` | 开始日期 |
| `end_date` | `end_date` | `endDate` | 结束日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
