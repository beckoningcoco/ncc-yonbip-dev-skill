---
tags: [BIP, 元数据, 数据字典, znbzbx.mileageallowance.AllowanceDimensionVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 匹配维度 (`znbzbx.mileageallowance.AllowanceDimensionVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_mileageallowance_dimension` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 匹配维度 |
| 物理表 | `znbz_mileageallowance_dimension` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 12 个 |
| 子表 | 1 个 |
| 关联引用 | 4 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `DimensionToGroupBVO` | `znbzbx.mileageallowance.AllowanceGroupBVO` | composition |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `pk_mileageallowance` | `` |
| `` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 12 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dimensionname` | `dimensionname` | `dimensionname` | 维度名称 |
| `dimensioncode` | `dimensioncode` | `dimensioncode` | 维度编码 |
| `recordname` | `recordname` | `recordname` | 受控表字段名称 |
| `recordcode` | `recordcode` | `recordcode` | 受控表字段编码 |
| `vmemo` | `vmemo` | `vmemo` | 备注 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_mileageallowance` | `pk_mileageallowance` | `pk_mileageallowance` | 主表主键 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isprepare` | `isprepare` | `isprepare` | 是否预制维度 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `DimensionToGroupBVO` | 匹配项 |
