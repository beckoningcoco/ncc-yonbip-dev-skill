---
tags: [BIP, 元数据, 数据字典, sfa.highseas.CustomerHighSeasTemplate]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 线索公海模板设置 (`sfa.highseas.CustomerHighSeasTemplate`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sfa_customer_high_seas_template` | domain：`yycrm` | 应用：`SFA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 线索公海模板设置 |
| 物理表 | `sfa_customer_high_seas_template` |
| 数据库 schema | `yycrm` |
| 所属应用 | `SFA` |
| 直连字段 | 24 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `seas_id` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `person_id` | `` |
| `tenant_id` | `` |

## 继承接口 (3个, 10字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
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

> 共 24 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cShowCaption` | `cShowCaption` | `cShowCaption` | 字段名称 |
| `cName` | `cName` | `cItemName` | 列名 |
| `cShowCaption_resid` | `cShowCaption_resid` | `cShowCaptionResid` | 展示名称多语 |
| `cCaption_resid` | `cCaption_resid` | `cCaptionResid` | 名称多语 |
| `cCaption` | `cCaption` | `cCaption` |  |
| `cFieldName` | `cFieldName` | `cFieldName` | 数据库-column |
| `cFieldType` | `cFieldType` | `cFieldType` | 字段类型 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `person_id` | `person_id` | `personId` | 人员id |
| `seas_id` | `seas_id` | `seasId` | 公海ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bShowIt` | `bShowIt` | `bShowIt` | 是否显示 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iTemplateType` | `iTemplateType` | `iTemplateType` | 模板类型 |
| `iOrder` | `iOrder` | `iOrder` | 排序 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
