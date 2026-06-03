---
tags: [BIP, 元数据, 数据字典, marketing.price.PriceStrategyMatchRule]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 定价策略匹配规则 (`marketing.price.PriceStrategyMatchRule`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`udh_price_strategy_matchrule` | domain：`marketingbill` | 应用：`B2Bpricing` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 定价策略匹配规则 |
| 物理表 | `udh_price_strategy_matchrule` |
| 数据库 schema | `marketingbill` |
| 所属应用 | `B2Bpricing` |
| 直连字段 | 29 个 |
| 子表 | 0 个 |
| 关联引用 | 13 个 |

## 关联引用 (13个)

| 字段名 | 引用类型 |
|--------|---------|
| `value` | `productcenter.merchantRef` |
| `udh_pre_pricing_dimension_id` | `` |
| `udh_price_strategy_matching_id` | `` |
| `productvalue` | `productcenter.productref` |
| `ytenant_id` | `` |

## 继承接口 (3个, 3字段)

- **逻辑删除相关** (`base.itf.Deletable`)
  - `iDeleted` → `iDeleted`
- **U订货租户相关** (`base.itf.IUordercorp`)
  - `iCorpId` → `iCorpId`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 29 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `field_name` | `field_name` | `fieldName` | 字段名称 |
| `field_type` | `field_type` | `fieldType` | 字段类型 |
| `group_key` | `group_key` | `groupKey` | 分组值 |
| `value` | `value` | `value` | 维度冗余值 |
| `value` | `value` | `productSaleType` | 商品售卖类型 |
| `value` | `value` | `CPQOption` | CPQ选配 |
| `value` | `value` | `optionalMaterial` | 是否可选配物料 |
| `udh_pre_pricing_dimension_values` | `udh_pre_pricing_dimension_values` | `pricePreDimensionValues` | 维度拼接值 |

### 引用字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `udh_price_strategy_matching_id` | `udh_price_strategy_matching_id` | `priceStrategyId` | 策略id |
| `value` | `value` | `currentOrg` | 匹配维度id |
| `value` | `value` | `agentId` | 匹配维度id |
| `value` | `value` | `agentClassId` | 匹配维度id |
| `value` | `value` | `agentLevelId` | 匹配维度id |
| `productvalue` | `productvalue` | `productId` | 匹配维度id |
| `value` | `value` | `materialClassId` | 匹配维度id |
| `value` | `value` | `productLine` | 匹配维度id |
| `value` | `value` | `optionParameterFile` | 选配参数文件 |
| `udh_pre_pricing_dimension_id` | `udh_pre_pricing_dimension_id` | `pricePreDimensionId` | 系统预设维度表ID |
| `productvalue` | `productvalue` | `productAuth` | 物料权限 |
| `value` | `value` | `topProductId` | 顶层物料Id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_biz` | `is_biz` | `isBiz` | 是否商家规则 |
| `iDeleted` | `iDeleted` | `isDeleted` | 逻辑删除标记 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `value` | `value` | `businessType` | 业务类型 |
| `version` | `version` | `version` | 版本号 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 规则主键 |
| `iBizId` | `iBizId` | `bizId` | 商家id |
| `tenant_id` | `tenant_id` | `uordercorp` | 租户ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubuts` | `pubuts` | `pubts` | 时间戳 |
