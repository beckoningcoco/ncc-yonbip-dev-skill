---
tags: [BIP, 元数据, 数据字典, archive.taxArchives.TaxCategoryArchive]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 税种档案 (`archive.taxArchives.TaxCategoryArchive`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tax_category_archive` | domain：`yonbip-fi-taxpubdoc` | 应用：`DPMTAX` | 业务对象ID：`6773d686-b6f2-4a00-9b3a-42125048f0b2`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 税种档案 |
| 物理表 | `tax_category_archive` |
| domain/服务域 | `yonbip-fi-taxpubdoc` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `DPMTAX` |
| 直连字段 | 26 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `country` | `ucfbasedoc.bd_countryref` |
| `exchange_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `income_currency` | `ucfbasedoc.bd_currencytenantref` |
| `tax_bureau_archive_id` | `yonbip-fi-taxpubdoc.RefTable_5d0668e420` |

## 继承接口 (4个, 9字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **档案状态** (`iuap.busiObj.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`

## 字段列表（按类型分组）

> 共 26 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 税种编码 |
| `country_code` | `country_code` | `countryCode` | 国家地区编码 |
| `id` | `id` | `id` | 主键 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `country` | `country` | `country` | 国家地区 |
| `creator` | `creator` | `creator` | 创建人 |
| `income_currency` | `income_currency` | `currency` | 纳税币种 |
| `exchange_rate_type` | `exchange_rate_type` | `exchangeRateType` | 汇率类型 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `tax_bureau_archive_id` | `tax_bureau_archive_id` | `taxBureauArchiveId` | 税制名称 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `effective_date` | `effective_date` | `effectiveDate` | 生效日期 |
| `invalidation_date` | `invalidation_date` | `invalidationDate` | 失效日期 |

### 日期时间 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `disablets` | `disablets` | `disablets` | 停用时间 |
| `enablets` | `enablets` | `enablets` | 启用时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable` | `enable` | `enable` | 档案状态 |
| `is_global` | `is_global` | `isGlobal` | 是否预置 |
| `social_data` | `social_data` | `socialData` | 社会化数据 |
| `tax_rounding_rule` | `tax_rounding_rule` | `taxRoundingRule` | 舍入规则 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `default_precision` | `default_precision` | `defaultPrecision` | 精度 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### multipleOption (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `application_scene` | `application_scene` | `applicationScene` | 应用场景 |
| `tax_period_type` | `tax_period_type` | `taxPeriodType` | 纳税期限 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 税种名称 |
