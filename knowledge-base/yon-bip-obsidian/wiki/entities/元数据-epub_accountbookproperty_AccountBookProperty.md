---
tags: [BIP, 元数据, 数据字典, epub.accountbookproperty.AccountBookProperty]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 账簿属性 (`epub.accountbookproperty.AccountBookProperty`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`epub_accountbookproperty` | domain：`fiepub` | 应用：`FP` | 业务对象ID：`e915cdcb-4260-4ed8-9dcc-6fcd3e8a623a`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 账簿属性 |
| 物理表 | `epub_accountbookproperty` |
| domain/服务域 | `fiepub` |
| schema | `fiepub` |
| 所属应用 | `FP` |
| 直连字段 | 22 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `creatorId` | `` |
| `modifierId` | `` |
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

> 共 22 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `assetsAccClassifi` | `assetsAccClassifi` | String | 适用账簿分类 |
| `code` | `code` | String | 账簿属性编码 |
| `creator` | `creator` | String | 创建人名称 |
| `id` | `id` | String | 主键id |
| `ledgerAccClassifi` | `ledgerAccClassifi` | String | 适用账簿分类 |
| `modifier` | `modifier` | String | 修改人名称 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `creatorId` | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | 创建人 |
| `modifierId` | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | 修改人 |
| `tenant_id` | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | 租户 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_date` | `create_date` | Date | 创建日期 |
| `modify_date` | `modify_date` | Date | 修改日期 |

### 布尔字段 (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `assetsAttribute` | `assetsAttribute` | Boolean | 固定资产属性 |
| `ledgerProp` | `ledgerProp` | Boolean | 总账属性 |
| `stopstatus` | `stopstatus` | Boolean | 停用状态 |
| `taxbookProp` | `taxbookProp` | Boolean | 税簿属性 |

### timestamp (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_time` | `create_time` | DateTime | 创建时间 |
| `modify_time` | `modify_time` | DateTime | 修改时间 |
| `pubts` | `pubts` | DateTime | 时间戳 |
| `stop_time` | `stop_time` | DateTime | 停用时间 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `desc` | `desc` | String | 描述 |
| `name` | `name` | String | 账簿属性名称 |
