---
tags: [BIP, 元数据, 数据字典, bd.period.PeriodYear]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 会计期间年 (`bd.period.PeriodYear`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_periodyear` | domain：`finbd` | 应用：`FP` | 业务对象ID：`ec870b84-73ea-4b9c-86b2-48d871f1e650`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 会计期间年 |
| 物理表 | `bd_periodyear` |
| domain/服务域 | `finbd` |
| schema | `iuap_apdoc_finbd` |
| 所属应用 | `FP` |
| 直连字段 | 28 个 |
| 子表 | 3 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `period` | `bd.period.Period` | composition |
| `periodAdjust` | `bd.period.PeriodAdjust` | composition |
| `periodSegment` | `bd.period.PeriodSegment` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |
| `accperiodscheme` | `` |
| `tenant_id` | `` |

## 继承接口 (4个, 12字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 28 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `name` | `name` | `name` | 名称 |
| `obj_id` | `obj_id` | `objId` | 友企连id |
| `description` | `description` | `description` | 描述 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accperiodscheme` | `accperiodscheme` | `accperiodscheme` | 会计日历 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `begindate` | `begindate` | `begindate` | 开始时间 |
| `enddate` | `enddate` | `enddate` | 结束时间 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `num` | `num` | `num` | 期间数量 |
| `half_year_count` | `half_year_count` | `halfYearCount` | 期间半年个数 |
| `period_count` | `period_count` | `periodCount` | 期间个数 |
| `quarter_count` | `quarter_count` | `quarterCount` | 期间季度个数 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `period` | 会计期间 |
| `` | `` | `periodAdjust` | 期间调整期 |
| `` | `` | `periodSegment` | 会计期间段(季度、半年) |
