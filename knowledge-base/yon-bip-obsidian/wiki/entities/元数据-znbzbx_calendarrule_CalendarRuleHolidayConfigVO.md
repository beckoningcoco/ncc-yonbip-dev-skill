---
tags: [BIP, 元数据, 数据字典, znbzbx.calendarrule.CalendarRuleHolidayConfigVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 配置节假日补贴 (`znbzbx.calendarrule.CalendarRuleHolidayConfigVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_calendarrule_holiday_config` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 配置节假日补贴 |
| 物理表 | `znbz_calendarrule_holiday_config` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 12 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `pk_calendarrule` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 12 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `partialrange` | `partialrange` | `partialrange` | 部分补贴范围 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_calendarrule` | `pk_calendarrule` | `pk_calendarrule` | 明细主表主键 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `holidaytype` | `holidaytype` | `holidaytype` | 节假日类型 |
| `operator` | `operator` | `operator` | 运算符 |
| `operatortype` | `operatortype` | `operatortype` | 金额/百分比% |
| `operatorvalue` | `operatorvalue` | `operatorvalue` | 金额/百分比%-值 |
| `subsidyvalue` | `subsidyvalue` | `subsidyvalue` | 补贴金额 |
| `valuetype` | `valuetype` | `valuetype` | 补贴取值类型 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
