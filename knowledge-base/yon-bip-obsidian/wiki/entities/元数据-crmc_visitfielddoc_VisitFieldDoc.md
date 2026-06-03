---
tags: [BIP, 元数据, 数据字典, crmc.visitfielddoc.VisitFieldDoc]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 拜访公共字段档案 (`crmc.visitfielddoc.VisitFieldDoc`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`crmc_visit_field_doc` | domain：`yycrm` | 应用：`CRMC` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 拜访公共字段档案 |
| 物理表 | `crmc_visit_field_doc` |
| 数据库 schema | `yycrm` |
| 所属应用 | `CRMC` |
| 直连字段 | 17 个 |
| 子表 | 0 个 |
| 关联引用 | 2 个 |

## 关联引用 (2个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 17 个直连字段

### 文本字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cCaption` | `cCaption` | `cCaption` | 列标题 |
| `cCaption_resid` | `cCaption_resid` | `cCaption_resid` | 标题多语 |
| `cControlType` | `cControlType` | `cControlType` | 字段控制类型 |
| `cEnumType` | `cEnumType` | `cEnumType` | 枚举类型 |
| `cFieldDocType` | `cFieldDocType` | `cFieldDocType` | 档案字段类型 |
| `cFieldName` | `cFieldName` | `cFieldName` | 列 |
| `cName` | `cName` | `cName` | 列名 |
| `cRefRetID` | `cRefRetID` | `cRefRetID` | 参照返回信息 |
| `cRefType` | `cRefType` | `cRefType` | 参照类型 |
| `cShowCaption` | `cShowCaption` | `cShowCaption` | 列显示标题 |
| `cShowCaption_resid` | `cShowCaption_resid` | `cShowCaption_resid` | 显示标题多语 |
| `iOrder` | `iOrder` | `iOrder` | 排序 |
| `refReturn` | `refReturn` | `refReturn` | 返回值 |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
