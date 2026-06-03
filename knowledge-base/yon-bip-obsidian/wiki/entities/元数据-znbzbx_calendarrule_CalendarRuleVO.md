---
tags: [BIP, 元数据, 数据字典, znbzbx.calendarrule.CalendarRuleVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 差旅日历规则 (`znbzbx.calendarrule.CalendarRuleVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_calendarrule` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：`5e249a13-bf4c-4954-a177-1088c46e0836`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 差旅日历规则 |
| 物理表 | `znbz_calendarrule` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 25 个 |
| 子表 | 5 个 |
| 关联引用 | 10 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `calendarruleholidayconfigs` | `znbzbx.calendarrule.CalendarRuleHolidayConfigVO` | composition |
| `calendarrulealterrefs` | `znbzbx.calendarrule.CalendarRuleAlterRefVO` | composition |
| `calendarruleorgs` | `znbzbx.calendarrule.CalendarRuleOrgVO` | composition |
| `calendarruleapplyrefs` | `znbzbx.calendarrule.CalendarRuleApplyRefVO` | composition |
| `calendarrulerefs` | `znbzbx.calendarrule.CalendarRuleRefVO` | composition |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `cfinaceorg` | `` |
| `ytenant_id` | `` |
| `tenant_id` | `` |

## 继承接口 (4个, 12字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`

## 字段列表（按类型分组）

> 共 25 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `calendar` | `calendar` | `calendar` | 差旅日历 |
| `code` | `code` | `code` | 规则编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cfinaceorg` | `cfinaceorg` | `cfinaceorg` | 费用承担组织 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 启用状态 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mode` | `mode` | `mode` | 模式 |
| `subsidyscope` | `subsidyscope` | `subsidyscope` | 补贴范围 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### other (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `calendarrulealterrefs` | 变更后明细映射补贴明细 |
| `` | `` | `calendarruleapplyrefs` | 申请明细映射补贴明细 |
| `` | `` | `calendarruleholidayconfigs` | 配置节假日补贴 |
| `` | `` | `calendarruleorgs` | 差旅日历规则业务单元 |
| `` | `` | `calendarrulerefs` | 报销明细映射补贴明细 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 规则名称 |
