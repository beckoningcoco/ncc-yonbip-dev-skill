---
tags: [BIP, 元数据, 数据字典, aa.reason.Reason]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 原因档案 (`aa.reason.Reason`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`aa_reason` | domain：`productcenter` | 应用：`DPMSI` | 业务对象ID：`168eb757-c21a-45bb-91f5-e5488cc8a709`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 原因档案 |
| 物理表 | `aa_reason` |
| 数据库 schema | `productcenter` |
| 所属应用 | `DPMSI` |
| 直连字段 | 20 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `` | `` |
| `tenant_id` | `` |

## 继承接口 (6个, 14字段)

- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **erp编码** (`base.itf.IErpCode`)
  - `erpCode` → `erpCode`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **逻辑删除相关** (`base.itf.Deletable`)
  - `iDeleted` → `iDeleted`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 20 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `erpCode` | `erpCode` | String | 外部编码 |
| `` | `modifier` | String | 修改人 |
| `` | `creator` | String | 创建人 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户 |
| `tenant_id` | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | 租户(废弃) |
| `` | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | 修改人 |
| `` | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | 创建人 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `modify_date` | `modify_date` | Date | 修改日期 |
| `create_date` | `create_date` | Date | 创建日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `stopstatus` | `stopstatus` | Boolean | 启用状态 |
| `iDeleted` | `iDeleted` | Boolean | 删除状态 |

### 整数 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `ordernum` | `ordernum` | Integer | 顺序 |
| `sourcetype` | `sourcetype` | Integer | 是否系统预置 |

### 长整数 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `id` | `id` | Long | ID |
| `reasonType` | `reasonType` | Long | 原因类型 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `reason` | `reason` | String | 原因 |

### timestamp (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `stop_time` | `stop_time` | DateTime | 停用时间 |
| `pubts` | `pubts` | DateTime | 时间戳 |
| `modify_time` | `modify_time` | DateTime | 修改时间 |
| `create_time` | `create_time` | DateTime | 创建时间 |
