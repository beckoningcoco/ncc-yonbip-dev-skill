---
tags: [BIP, 元数据, 数据字典, znbzbx.mileageallowance.AllowanceGroupVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 匹配组 (`znbzbx.mileageallowance.AllowanceGroupVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_mileageallowance_group` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 匹配组 |
| 物理表 | `znbz_mileageallowance_group` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 12 个 |
| 子表 | 2 个 |
| 关联引用 | 5 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `AllowanceGroupBVO` | `znbzbx.mileageallowance.AllowanceGroupBVO` | composition |
| `GroupToPriceVO` | `znbzbx.mileageallowance.AllowancePriceVO` | composition |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `` | `` |
| `pk_mileageallowance` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 12 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `groupcode` | `groupcode` | `groupcode` | 匹配组编码 |
| `groupname` | `groupname` | `groupname` | 匹配组名称 |
| `groupb` | `groupb` | `groupb` | 匹配项 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_mileageallowance` | `pk_mileageallowance` | `pk_mileageallowance` | 主表主键 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enablestatus` | `enablestatus` | `enablestatus` | 启用状态 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `priority` | `priority` | `priority` | 优先级 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `AllowanceGroupBVO` | 匹配项 |
| `` | `` | `GroupToPriceVO` | 里程补贴单价 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
