---
tags: [BIP, 元数据, 数据字典, taxpubdoc.taxWithholding.taxWithholdingType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 代扣税类型 (`taxpubdoc.taxWithholding.taxWithholdingType`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tax_withholding_type` | domain：`yonbip-fi-taxpubdoc` | 应用：`DPMTAX` | 业务对象ID：`7d833a8a-45e2-47f8-84bf-4e9c741f5361`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 代扣税类型 |
| 物理表 | `tax_withholding_type` |
| domain/服务域 | `yonbip-fi-taxpubdoc` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `DPMTAX` |
| 直连字段 | 23 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `tax_category_archive_id` | `tax.category_archive_ref` |
| `ytenant_id` | `` |
| `currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `tax_rate_id` | `yonbip-fi-taxpubdoc.RefTable_839443ba26` |
| `country_id` | `ucfbasedoc.bd_countryref` |

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

> 共 23 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr_flag` | `dr_flag` | `drFlag` | 唯一索引的字段 |
| `id` | `id` | `id` | 主键 |
| `tax_rate_code` | `tax_rate_code` | `taxRateCode` | 税率编码 |
| `tax_withholding_type_code` | `tax_withholding_type_code` | `taxWithholdingTypeCode` | 代扣税类型编码 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `country_id` | `country_id` | `countryId` | 国家类型(系统) |
| `creator` | `creator` | `creator` | 创建人 |
| `currency_id` | `currency_id` | `currencyId` | 币种id |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `tax_category_archive_id` | `tax_category_archive_id` | `taxCategoryArchiveId` | 税种id |
| `tax_rate_id` | `tax_rate_id` | `taxRateId` | 税率id |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

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
| `accumulate_type` | `accumulate_type` | `accumulateType` | 累计类型 |
| `enable` | `enable` | `enable` | 档案状态 |
| `rounding_rule` | `rounding_rule` | `roundingRule` | 舍入规则 |
| `tax_basis` | `tax_basis` | `taxBasis` | 计税依据 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accuracy` | `accuracy` | `accuracy` | 精度 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `description` | `description` | `description` | 代扣税类型名称 |
