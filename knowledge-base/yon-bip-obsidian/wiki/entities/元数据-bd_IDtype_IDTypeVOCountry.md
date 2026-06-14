---
tags: [BIP, 元数据, 数据字典, bd.IDtype.IDTypeVOCountry]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 国家地区 (`bd.IDtype.IDTypeVOCountry`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_idtype_country` | domain：`ucf-staff-center` | 应用：`DPMSTF` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 国家地区 |
| 物理表 | `bd_idtype_country` |
| domain/服务域 | `ucf-staff-center` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `DPMSTF` |
| 直连字段 | 13 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `country` | `ucfbasedoc.bd_countryref` |
| `` | `` |
| `ytenant_id` | `` |
| `id_type_id` | `ucfbasedoc.bd_IDtyperef` |

## 继承接口 (4个, 9字段)

- **启用** (`ucfbase.ucfbaseItf.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`ucfbase.ucfbaseItf.IAuditInfo`)
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `modify_time` → `modify_time`
- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 13 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id_type_id` | `id_type_id` | `id_type_id` | 证件类型ID |
| `country` | `country` | `country` | 国家/地区 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |

### 日期时间 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enablets` | `enablets` | `enablets` | 启用时间 |
| `disablets` | `disablets` | `disablets` | 停用时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable` | `enable` | `enable` | 启用 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |
