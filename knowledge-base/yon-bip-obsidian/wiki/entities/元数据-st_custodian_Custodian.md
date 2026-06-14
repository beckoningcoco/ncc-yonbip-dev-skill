---
tags: [BIP, 元数据, 数据字典, st.custodian.Custodian]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 保管者对象 (`st.custodian.Custodian`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`st_custodian` | domain：`ustock` | 应用：`ST` | 业务对象ID：`17103156-eeba-4f59-9c92-828f6cc0179e`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 保管者对象 |
| 物理表 | `st_custodian` |
| domain/服务域 | `ustock` |
| schema | `ustock` |
| 所属应用 | `ST` |
| 直连字段 | 17 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `vendor` | `` |
| `` | `` |
| `customer` | `` |

## 继承接口 (2个, 9字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 17 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `code` | `code` | String | 保管者编码 |
| `` | `creator` | String | 创建人名称 |
| `cmemo` | `cmemo` | String | 备注 |
| `` | `modifier` | String | 修改人名称 |
| `name` | `name` | String | 保管者名称 |
| `custodian_type` | `custodian_type` | String | 保管者类型 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | 创建人 |
| `customer` | `customer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | 客户 |
| `` | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | 修改人 |
| `vendor` | `vendor` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | 供应商 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_date` | `create_date` | Date | 创建日期 |
| `modify_date` | `modify_date` | Date | 修改日期 |

### 长整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `id` | `id` | Long | ID |

### timestamp (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_time` | `create_time` | DateTime | 创建时间 |
| `modify_time` | `modify_time` | DateTime | 修改时间 |
| `pubts` | `pubts` | DateTime | 时间戳 |
