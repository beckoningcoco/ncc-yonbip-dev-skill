---
tags: [BIP, 元数据, 数据字典, epub.accountbooktype.AccountBookType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 账簿类型 (`epub.accountbooktype.AccountBookType`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`epub_accountbooktype` | domain：`fiepub` | 应用：`FP` | 业务对象ID：`87bb6494-5664-491f-8928-43f965460ee3`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 账簿类型 |
| 物理表 | `epub_accountbooktype` |
| domain/服务域 | `fiepub` |
| schema | `fiepub` |
| 所属应用 | `FP` |
| 直连字段 | 25 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `accperiodscheme` | `finbd.bd_accperiodscheme` |
| `` | `` |
| `currency` | `ucfbasedoc.bd_currencytenantref` |
| `accsubjectchart` | `fiepub.epub_accsubjectchartref` |
| `costelementtable` | `finbd.bd_costelementtable_ref` |
| `tenant_id` | `` |

## 继承接口 (4个, 12字段)

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
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 25 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `id` | `id` | String | ID |
| `code` | `code` | String | 编码 |
| `` | `creator` | String | 创建人名称 |
| `` | `modifier` | String | 修改人名称 |
| `objid` | `objid` | String | 来源系统的ID |

### 引用字段 (8个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | 创建人 |
| `` | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | 修改人 |
| `tenant_id` | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | 租户 |
| `accperiodscheme` | `accperiodscheme` | e7bb3d2b-b288-4696-b5f0-a9b0626cded8 | 会计期间方案id |
| `accsubjectchart` | `accsubjectchart` | 85ed5168-72ae-41c2-a5a5-51f3fc7b1bc0 | 科目表id |
| `costelementtable` | `costelementtable` | 2cbab17e-f378-4047-8745-4bcf08509108 | 要素表id |
| `currency` | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | 币种id |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_date` | `create_date` | Date | 创建日期 |
| `modify_date` | `modify_date` | Date | 修改日期 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `isexternal` | `isexternal` | Boolean | 对外核算 |
| `isinner` | `isinner` | Boolean | 对内核算 |
| `stopstatus` | `stopstatus` | Boolean | 停用标志 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `name` | `name` | String | 名称 |
| `shortname` | `shortname` | String | 简称 |

### timestamp (5个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_time` | `create_time` | DateTime | 创建时间 |
| `modify_time` | `modify_time` | DateTime | 修改时间 |
| `stop_time` | `stop_time` | DateTime | 停用时间 |
| `pubts` | `pubts` | DateTime | 时间戳 |
| `stop_time` | `stop_time` | DateTime | 停用时间 |
