---
tags: [BIP, 元数据, 数据字典, bd.assets.ReduceWay]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 减少方式 (`bd.assets.ReduceWay`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_reduceway` | domain：`finbd` | 应用：`FP` | 业务对象ID：`193a7de7-7d3c-4f60-90c1-bca1c8a19129`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 减少方式 |
| 物理表 | `bd_reduceway` |
| domain/服务域 | `finbd` |
| schema | `iuap_apdoc_finbd` |
| 所属应用 | `FP` |
| 直连字段 | 20 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `` | `` |
| `tenant_id` | `` |

## 继承接口 (5个, 14字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **启用** (`ucfbase.ucfbaseItf.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 20 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `code` | `code` | String | 编码 |
| `` | `creator` | String | 创建人名称 |
| `` | `modifier` | String | 修改人名称 |
| `objid` | `objid` | String | 友企连id |
| `remark` | `remark` | String | 备注 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | 创建人 |
| `` | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | 修改人 |
| `tenant_id` | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | 租户 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_date` | `create_date` | Date | 创建日期 |
| `modify_date` | `modify_date` | Date | 修改日期 |

### 日期时间 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `disablets` | `disablets` | DateTime | 停用时间 |
| `enablets` | `enablets` | DateTime | 启用时间 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `presetdate` | `presetdate` | Boolean | 是否为预置数据 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `enable` | `enable` | sys_intboolean | 启用 |

### 长整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `id` | `id` | Long | ID |

### multiLanguage (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `name` | `name` | String | 名称 |

### timestamp (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_time` | `create_time` | DateTime | 创建时间 |
| `modify_time` | `modify_time` | DateTime | 修改时间 |
| `pubts` | `pubts` | DateTime | 时间戳 |
