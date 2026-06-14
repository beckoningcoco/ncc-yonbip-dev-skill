---
tags: [BIP, 元数据, 数据字典, bd.business.BusinessPeriodVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 业务期间 (`bd.business.BusinessPeriodVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_business_period` | domain：`ucfbasedoc` | 应用：`DPMPI` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 业务期间 |
| 物理表 | `bd_business_period` |
| domain/服务域 | `ucfbasedoc` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `DPMPI` |
| 直连字段 | 21 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `start_period` | `ucfbasedoc.bd_periodtyperef` |
| `` | `` |
| `end_period` | `ucfbasedoc.bd_periodtyperef` |
| `businessyear_id` | `` |
| `ytenant_id` | `` |

## 继承接口 (4个, 6字段)

- **审计信息** (`ucfbase.ucfbaseItf.IAuditInfo`)
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `modify_time` → `modify_time`
- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 21 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `code` | `code` | `code` | 编码 |
| `type` | `type` | `type` | 类型 |
| `period_type` | `period_type` | `periodType` | 参照期间类型 |
| `businessperiod_scheme_id` | `businessperiod_scheme_id` | `businessperiodSchemeId` | 业务期间方案 |
| `sysid` | `sysid` | `sysid` | 应用标识 |
| `tenantid` | `tenantid` | `tenant` | 租户(废弃) |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `start_period` | `start_period` | `startPeriod` | 月度开始期间 |
| `end_period` | `end_period` | `endPeriod` | 月度结束期间 |
| `businessyear_id` | `businessyear_id` | `businessyearId` | 索引树 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `start_date` | `start_date` | `startDate` | 月度开始日期 |
| `end_date` | `end_date` | `endDate` | 月度结束日期 |

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

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
