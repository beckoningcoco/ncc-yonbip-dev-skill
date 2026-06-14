---
tags: [BIP, 元数据, 数据字典, bd.invoice.InvoiceTypeVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 发票类型 (`bd.invoice.InvoiceTypeVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_invoice_type` | domain：`ucfbasedoc` | 应用：`DPMTAX` | 业务对象ID：`e3f6bfb3-3fbd-41cc-a095-6c82cd036764`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 发票类型 |
| 物理表 | `bd_invoice_type` |
| domain/服务域 | `ucfbasedoc` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `DPMTAX` |
| 直连字段 | 19 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `` |
| `ytenant_id` | `` |
| `modifier` | `` |
| `` | `` |

## 继承接口 (4个, 6字段)

- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`
- **审计信息** (`basedoc.basedocItf.AuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 19 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `code` | `code` | `code` | 编码 |
| `real_code` | `real_code` | `realCode` | 发票编码 |
| `country` | `country` | `country` | 国家/地区 |
| `application_scope` | `application_scope` | `applicationScope` | 应用范围 |
| `sysid` | `sysid` | `sysid` | 应用标识 |
| `tenantid` | `tenantid` | `tenant` | 租户(废弃) |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable` | `enable` | `enable` | 状态 |
| `iorder` | `iorder` | `iorder` | 排序 |
| `dr` | `dr` | `dr` | 删除状态 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |
| `standard_name` | `standard_name` | `standardName` | 标准名称 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间 |

### referenceList (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `countries` | `countries` | 国家/地区 |
