---
tags: [BIP, 元数据, 数据字典, sys.secret.UserSecretObj]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 用户密级枚举对象 (`sys.secret.UserSecretObj`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`military_usersecretobj` | domain：`yonbip-ndi-jgmj` | 应用：`GFJGMJ` | 业务对象ID：`377c8073-10c0-4ece-9008-d5b51a60e1a4`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 用户密级枚举对象 |
| 物理表 | `military_usersecretobj` |
| domain/服务域 | `yonbip-ndi-jgmj` |
| schema | `yonbip_ndi_jgmj` |
| 所属应用 | `GFJGMJ` |
| 直连字段 | 15 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |
| `tenantid` | `` |

## 继承接口 (5个, 8字段)

- **审计信息** (`ucfbase.ucfbaseItf.IAuditInfo`)
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `modify_time` → `modify_time`
- **UCF公共租户相关** (`basedoc.basedocItf.BasedocITenant`)
  - `tenantid` → `tenantid`
- **逻辑删除相关** (`base.itf.Deletable`)
  - `iDeleted` → `iDeleted`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 15 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 密级编码 |
| `name` | `name` | `name` | 密级名称 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期时间 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable` | `enable` | `enable` | 状态 |
| `iDeleted` | `iDeleted` | `isDeleted` | 逻辑删除标记 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `secret_type` | `secret_type` | `secretType` | 密级类型 |
| `weight` | `weight` | `weight` | 权重 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
