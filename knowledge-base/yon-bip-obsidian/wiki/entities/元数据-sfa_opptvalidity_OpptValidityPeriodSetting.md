---
tags: [BIP, 元数据, 数据字典, sfa.opptvalidity.OpptValidityPeriodSetting]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 商机有效期设置 (`sfa.opptvalidity.OpptValidityPeriodSetting`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sfa_oppt_validity_period_setting` | domain：`yycrm` | 应用：`SFA` | 业务对象ID：`15e1909e-036e-4cc5-b160-3aec57988979`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 商机有效期设置 |
| 物理表 | `sfa_oppt_validity_period_setting` |
| 数据库 schema | `yycrm` |
| 所属应用 | `SFA` |
| 直连字段 | 22 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `` | `` |

## 继承接口 (3个, 11字段)

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
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`

## 字段列表（按类型分组）

> 共 22 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `applicable_scope_enum` | `applicable_scope_enum` | `applicableScopeEnum` | 适用范围（0-全部，1-过滤条件） |
| `` | `creator` | `creator` | 创建人名称 |
| `setting_describe` | `setting_describe` | `describe` | 描述 |
| `filter_condition` | `filter_condition` | `filterCondition` | 过滤条件 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `name` | `name` | `name` | 规则名称 |
| `period_start_point` | `period_start_point` | `periodStartPoint` | 效期起算时点(0-商机新增) |
| `validity_period_unit` | `validity_period_unit` | `validityPeriodUnit` | 有效期单位(0-小时，1-天) |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `max_validity_period` | `max_validity_period` | `maxValidityPeriod` | 最大延期天数 |
| `priority` | `priority` | `priority` | 优先级 |
| `validity_period` | `validity_period` | `validityPeriod` | 有效期 |

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
