---
tags: [BIP, 元数据, 数据字典, znbzbx.calendarrule.CalendarRuleRefVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 报销明细映射补贴明细 (`znbzbx.calendarrule.CalendarRuleRefVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_calendarrule_ref` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 报销明细映射补贴明细 |
| 物理表 | `znbz_calendarrule_ref` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 13 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `pk_calendarrule` | `` |
| `tenant_id` | `` |

## 继承接口 (3个, 4字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`

## 字段列表（按类型分组）

> 共 13 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `btfield` | `btfield` | `btfield` | 补贴明细子表字段编码 |
| `btfieldref` | `btfieldref` | `btfieldref` | 补贴明细子表字段名称 |
| `bxfield` | `bxfield` | `bxfield` | 报销明细子表字段编码 |
| `bxfieldref` | `bxfieldref` | `bxfieldref` | 报销明细子表字段名称 |
| `remark` | `remark` | `remark` | 备注 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_calendarrule` | `pk_calendarrule` | `pk_calendarrule` | 明细主表主键 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `prestatus` | `prestatus` | `prestatus` | 是否预制 |
| `stopstatus` | `stopstatus` | `stopstatus` | 启用状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
