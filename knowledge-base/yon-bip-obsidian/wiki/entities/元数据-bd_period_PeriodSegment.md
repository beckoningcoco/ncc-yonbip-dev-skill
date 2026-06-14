---
tags: [BIP, 元数据, 数据字典, bd.period.PeriodSegment]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 会计期间段(季度、半年) (`bd.period.PeriodSegment`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_period_segment` | domain：`finbd` | 应用：`FP` | 业务对象ID：`5d1aeec3-4dc7-445e-89e4-03faa0ca385c`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 会计期间段(季度、半年) |
| 物理表 | `bd_period_segment` |
| domain/服务域 | `finbd` |
| schema | `iuap_apdoc_finbd` |
| 所属应用 | `FP` |
| 直连字段 | 24 个 |
| 子表 | 0 个 |
| 关联引用 | 10 个 |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `beginperiod` | `` |
| `ytenant_id` | `` |
| `periodyear` | `` |
| `accperiodscheme` | `` |
| `periodtree` | `` |
| `` | `` |
| `tenant_id` | `` |
| `endperiod` | `` |
| `segmenttype` | `` |

## 继承接口 (3个, 10字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
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

> 共 24 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `name` | `name` | `name` | 名称 |
| `codedate` | `codedate` | `codedate` | 会计期间名称 |
| `description` | `description` | `description` | 描述 |
| `localcode` | `localcode` | `localcode` | 本地会计期间名 |
| `obj_id` | `obj_id` | `objId` | 友企连id |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accperiodscheme` | `accperiodscheme` | `accperiodscheme` | 会计日历 |
| `beginperiod` | `beginperiod` | `beginperiod` | 开始期间 |
| `endperiod` | `endperiod` | `endperiod` | 结束期间 |
| `periodtree` | `periodtree` | `periodtree` | 期间树 |
| `periodyear` | `periodyear` | `periodyear` | 期间年 |
| `segmenttype` | `segmenttype` | `segmenttype` | 期间类型 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
