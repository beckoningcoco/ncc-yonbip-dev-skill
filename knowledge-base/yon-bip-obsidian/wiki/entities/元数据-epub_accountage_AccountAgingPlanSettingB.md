---
tags: [BIP, 元数据, 数据字典, epub.accountage.AccountAgingPlanSettingB]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 账龄方案设置子表 (`epub.accountage.AccountAgingPlanSettingB`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`epub_account_ageplan_set_b` | domain：`fiepub` | 应用：`FP` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 账龄方案设置子表 |
| 物理表 | `epub_account_ageplan_set_b` |
| domain/服务域 | `fiepub` |
| schema | `fiepub` |
| 所属应用 | `FP` |
| 直连字段 | 20 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `` | `` |
| `mainid` | `` |
| `tenant_id` | `` |

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

> 共 20 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 父表主键 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dayend` | `dayend` | `dayEnd` | 按天算的账期结束 |
| `daystart` | `daystart` | `dayStart` | 按天算的账期开始 |
| `index_num` | `index_num` | `indexNum` | 序号 |
| `account_period_time_start` | `account_period_time_start` | `accountPeriodTimeStart` | 账期开始 |
| `account_period_time_end` | `account_period_time_end` | `accountPeriodTimeEnd` | 账期结束 |
| `accountPeriodTotal` | `accountPeriodTotal` | `accountPeriodTotal` | 账期总数 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `display_name` | `display_name` | `displayName` | 显示名称 |
