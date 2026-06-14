---
tags: [BIP, 元数据, 数据字典, bd.taxrate.TaxRateVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 税目税率 (`bd.taxrate.TaxRateVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_taxrate` | domain：`ucfbasedoc` | 应用：`GZTBDM` | 业务对象ID：`ff1b2b0f-2fdd-4f31-8c61-50aa23434484`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 税目税率 |
| 物理表 | `bd_taxrate` |
| domain/服务域 | `ucfbasedoc` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 20 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `country` | `ucfbasedoc.bd_countryref` |
| `creator` | `` |
| `ytenant_id` | `` |
| `modifier` | `` |

## 继承接口 (4个, 6字段)

- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **审计信息** (`basedoc.basedocItf.AuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 20 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `objid` | `objid` | `objid` | 友企连主键 |
| `log` | `log` | `log` | 操作日志 |
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `code` | `code` | `code` | 税目编码 |
| `id` | `id` | `id` | ID |
| `sysid` | `sysid` | `sysid` | 应用标识 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `country` | `country` | `country` | 国家 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `taxfree` | `taxfree` | `taxFree` | 免税 |
| `notaxation` | `notaxation` | `noTaxation` | 不征税 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |
| `scope` | `scope` | `scope` | 适用范围 |
| `enable` | `enable` | `enable` | 状态 |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ntaxrate` | `ntaxrate` | `ntaxRate` | 税率 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 税目名称 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 最后修改时间 |
