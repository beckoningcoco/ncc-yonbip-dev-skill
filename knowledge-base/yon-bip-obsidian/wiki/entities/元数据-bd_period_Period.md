---
tags: [BIP, 元数据, 数据字典, bd.period.Period]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 会计期间 (`bd.period.Period`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_period` | domain：`finbd` | 应用：`FP` | 业务对象ID：`de0a06e3-d12a-4159-a2c1-4093ddad2eff`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 会计期间 |
| 物理表 | `bd_period` |
| domain/服务域 | `finbd` |
| schema | `iuap_apdoc_finbd` |
| 所属应用 | `FP` |
| 直连字段 | 24 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `periodyear` | `` |
| `accperiodscheme` | `` |
| `periodtree` | `` |
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

> 共 24 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `name` | `name` | `name` | 名称 |
| `obj_id` | `obj_id` | `objId` | 友企连id |
| `accperiodyear2` | `accperiodyear2` | `accperiodyear2` | 期间年 |
| `localcode` | `localcode` | `localcode` | 本地会计期间名 |
| `description` | `description` | `description` | 描述 |
| `codedate` | `codedate` | `codedate` | 会计期间名称 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `periodyear` | `periodyear` | `periodyear` | 期间年 |
| `periodtree` | `periodtree` | `periodtree` | 会计期间树 |
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
