---
tags: [BIP, 元数据, 数据字典, epub.accountage.AccountAgingPlanSetting]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 账龄方案设置 (`epub.accountage.AccountAgingPlanSetting`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`epub_account_ageplan_set` | domain：`fiepub` | 应用：`FP` | 业务对象ID：`a8b71a26-f747-4ce8-8ad5-e161086e569c`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 账龄方案设置 |
| 物理表 | `epub_account_ageplan_set` |
| domain/服务域 | `fiepub` |
| schema | `fiepub` |
| 所属应用 | `FP` |
| 直连字段 | 23 个 |
| 子表 | 1 个 |
| 关联引用 | 6 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `accountAgingPlanSettingB` | `epub.accountage.AccountAgingPlanSettingB` | composition |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `character` | `` |
| `ytenant_id` | `` |
| `` | `` |
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

> 共 23 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |
| `code` | `code` | `code` | 编码 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `active` | `active` | `active` | 启用 |
| `default_status` | `default_status` | `defaultStatus` | 默认 |
| `type` | `type` | `type` | 类型 |
| `iscontaintoday` | `iscontaintoday` | `iscontaintoday` | 到期日期当天是否算到期 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `timeunit` | `timeunit` | `timeunit` | 时间单位 |
| `unitnumber` | `unitnumber` | `unitnumber` | 单位天数 |
| `` | `` | `accountAgingPlanSettingB` | 账龄方案设置子表 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `character` | `character` | `character` | 成本组件特征属性 |
