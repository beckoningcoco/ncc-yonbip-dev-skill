---
tags: [BIP, 元数据, 数据字典, hred.ethnicgroup.Country]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 国家/地区 (`hred.ethnicgroup.Country`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`hred_ethnicgroup_country` | domain：`hrcloud-staff-mgr` | 应用：`HRED` | 业务对象ID：`a26c5374-70d5-4a99-9b36-9315bfcb8dec`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 国家/地区 |
| 物理表 | `hred_ethnicgroup_country` |
| 数据库 schema | `hrcloud-staff-mgr` |
| 所属应用 | `HRED` |
| 直连字段 | 10 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `ethnicgroup_id` | `` |
| `` | `` |
| `ytenant_id` | `` |
| `country` | `ucfbasedoc.bd_countryref` |

## 继承接口 (3个, 6字段)

- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`
- **审计信息** (`ucfbase.ucfbaseItf.IAuditInfo`)
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `modify_time` → `modify_time`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 10 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ethnicgroup_id` | `ethnicgroup_id` | `ethnicgroupId` | 民族ID |
| `country` | `country` | `countryId` | 国家ID |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |
