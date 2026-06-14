---
tags: [BIP, 元数据, 数据字典, bd.business.BusinessYearVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 业务期间年度 (`bd.business.BusinessYearVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_business_year` | domain：`ucfbasedoc` | 应用：`DPMPI` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 业务期间年度 |
| 物理表 | `bd_business_year` |
| domain/服务域 | `ucfbasedoc` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `DPMPI` |
| 直连字段 | 17 个 |
| 子表 | 1 个 |
| 关联引用 | 5 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `BusinessPeriodVOList` | `bd.business.BusinessPeriodVO` | composition |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `businessperiod_scheme_id` | `` |
| `ytenant_id` | `` |

## 继承接口 (4个, 6字段)

- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`
- **审计信息** (`ucfbase.ucfbaseItf.IAuditInfo`)
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `modify_time` → `modify_time`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 17 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `code` | `code` | `code` | 编码 |
| `sysid` | `sysid` | `sysid` | 应用标识 |
| `tenantid` | `tenantid` | `tenant` | 租户(废弃) |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `businessperiod_scheme_id` | `businessperiod_scheme_id` | `businessperiodSchemeId` | 业务期间方案 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `start_date` | `start_date` | `startDate` | 开始日期 |
| `end_date` | `end_date` | `endDate` | 结束日期 |

### 日期时间 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable` | `enable` | `enable` | 启用状态 |
| `dr` | `dr` | `dr` | 删除状态 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `BusinessPeriodVOList` | 业务期间 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
