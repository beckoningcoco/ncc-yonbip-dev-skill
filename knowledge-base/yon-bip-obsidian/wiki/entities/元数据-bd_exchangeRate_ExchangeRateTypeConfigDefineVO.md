---
tags: [BIP, 元数据, 数据字典, bd.exchangeRate.ExchangeRateTypeConfigDefineVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 汇率类型同步配置自定义表 (`bd.exchangeRate.ExchangeRateTypeConfigDefineVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_exchangeratetype_config_define` | domain：`ucfbasedoc` | 应用：`DPMPI` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 汇率类型同步配置自定义表 |
| 物理表 | `bd_exchangeratetype_config_define` |
| 数据库 schema | `ucfbasedoc` |
| 所属应用 | `DPMPI` |
| 直连字段 | 16 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `` |
| `ytenant_id` | `` |
| `modifier` | `` |
| `sourcecurrency_id` | `bd_currencytenantref` |
| `exchangerate_type` | `` |
| `targetcurrency_id` | `bd_currencytenantref` |

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

> 共 16 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `bank_source` | `bank_source` | `bankSource` | 数据来源 |
| `sysid` | `sysid` | `sysid` | 应用标识 |
| `tenantid` | `tenantid` | `tenant` | 租户(废弃) |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exchangerate_type` | `exchangerate_type` | `exchangeratetype` | 汇率类型主表主键 |
| `targetcurrency_id` | `targetcurrency_id` | `targetCurrencyId` | 目的币种 |
| `sourcecurrency_id` | `sourcecurrency_id` | `sourceCurrencyId` | 原币种 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exchange_conversion_method` | `exchange_conversion_method` | `exchangeConversionMethod` | 汇率折算方式 |
| `enable` | `enable` | `enable` | 状态 |
| `dr` | `dr` | `dr` | 删除标识 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 配置基本表的ts |
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间 |
