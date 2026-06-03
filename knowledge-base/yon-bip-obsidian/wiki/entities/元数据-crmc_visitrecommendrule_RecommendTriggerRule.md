---
tags: [BIP, 元数据, 数据字典, crmc.visitrecommendrule.RecommendTriggerRule]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 触发规则 (`crmc.visitrecommendrule.RecommendTriggerRule`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`crmc_recommend_trigger_rule` | domain：`yycrm` | 应用：`CRMC` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 触发规则 |
| 物理表 | `crmc_recommend_trigger_rule` |
| 数据库 schema | `yycrm` |
| 所属应用 | `CRMC` |
| 直连字段 | 21 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `time_zone` | `` |
| `rule_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 21 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dispatch_task_id` | `dispatch_task_id` | `dispatchTaskId` | 调度任务id |
| `execute_time_interval_unit` | `execute_time_interval_unit` | `executeTimeIntervalUnit` | 执行间隔时间单位 |
| `mode_value` | `mode_value` | `modeValue` | 执行日期 周1-7/月1-31,32为每月最后一天,多个值用';'分隔 |
| `period_end_time` | `period_end_time` | `periodEndTime` | 周期执行-结束时间 |
| `period_start_time` | `period_start_time` | `periodStartTime` | 周期执行-开始时间 |
| `specify_execute_time` | `specify_execute_time` | `specifyExecuteTime` | 指定执行时间 |
| `time_zone_code` | `time_zone_code` | `timeZoneCode` | 时区UTC |
| `trigger_rule` | `trigger_rule` | `triggerRule` | 触发方式(actual_time:实时评分，job:定时任务) |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rule_id` | `rule_id` | `ruleId` | 规则id |
| `time_zone` | `time_zone` | `timeZone` | 时区 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `end_date` | `end_date` | `endDate` | 定时规则-结束日期 |
| `start_date` | `start_date` | `startDate` | 定时规则-开始日期 |

### 整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `execute_frequency` | `execute_frequency` | `executeFrequency` | 定时规则-执行频率 |
| `execute_time_interval` | `execute_time_interval` | `executeTimeInterval` | 执行间隔时间 |
| `execute_type` | `execute_type` | `executeType` | 执行方式 |
| `period_interval_time` | `period_interval_time` | `periodIntervalTime` | 时间间隔 |
| `period_interval_time_unit` | `period_interval_time_unit` | `periodIntervalTimeUnit` | 时间间隔单位 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `trigger_type` | `trigger_type` | `triggerType` | 触发方式 |
