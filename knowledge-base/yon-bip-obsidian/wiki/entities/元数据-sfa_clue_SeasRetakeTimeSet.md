---
tags: [BIP, 元数据, 数据字典, sfa.clue.SeasRetakeTimeSet]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 公海池收回时间设置表 (`sfa.clue.SeasRetakeTimeSet`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sfa_seas_retake_time_set` | domain：`yycrm` | 应用：`SFA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 公海池收回时间设置表 |
| 物理表 | `sfa_seas_retake_time_set` |
| 数据库 schema | `yycrm` |
| 所属应用 | `SFA` |
| 直连字段 | 9 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `rule_id` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 9 个直连字段

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rule_id` | `rule_id` | `ruleId` | 收回规则ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `retake_day` | `retake_day` | `retakeDay` | 收回天数 |
| `retake_hour` | `retake_hour` | `retakeHour` | 收回小时数 |
| `retake_status` | `retake_status` | `retakeStatus` | 收回状态 |
| `retake_minute` | `retake_minute` | `retakeMinute` | 收回分钟数 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
