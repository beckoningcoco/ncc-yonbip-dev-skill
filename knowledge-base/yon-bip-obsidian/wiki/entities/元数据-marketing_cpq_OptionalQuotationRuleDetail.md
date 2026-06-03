---
tags: [BIP, 元数据, 数据字典, marketing.cpq.OptionalQuotationRuleDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 配置报价规则详情 (`marketing.cpq.OptionalQuotationRuleDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`optionalquotationruledetail` | domain：`marketingbill` | 应用：`CPQ` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 配置报价规则详情 |
| 物理表 | `optionalquotationruledetail` |
| 数据库 schema | `marketingbill` |
| 所属应用 | `CPQ` |
| 直连字段 | 17 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `optionalQuotationRuleId` | `` |
| `productId` | `` |
| `ytenant_id` | `` |
| `vcConfigDetailId` | `` |
| `pricingUnitId` | `` |
| `bomUnitId` | `` |
| `productDefineCharacter` | `` |
| `vcConfigId` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 17 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `detailGroupCode` | `detailGroupCode` | `detailGroupCode` | 分组编码 |
| `dosageType` | `dosageType` | `dosageType` | 用量类型(枚举:变动/固定) |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bomUnitId` | `bomUnitId` | `bomUnitId` | BOM单位 |
| `optionalQuotationRuleId` | `optionalQuotationRuleId` | `optionalQuotationRuleId` | 配置报价规则ID |
| `pricingUnitId` | `pricingUnitId` | `pricingUnitId` | 取价单位 |
| `productId` | `productId` | `productId` | 商品 |
| `vcConfigDetailId` | `vcConfigDetailId` | `vcConfigDetailId` | 选配参数文件表体ID |
| `vcConfigId` | `vcConfigId` | `vcConfigId` | 选配参数文件ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `inQuote` | `inQuote` | `inQuote` | 包含在报价内 |
| `isMust` | `isMust` | `isMust` | 是否必选 |
| `isPrice` | `isPrice` | `isPrice` | 是否计价 |
| `numCanChange` | `numCanChange` | `numCanChange` | 数量可改 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `childQty` | `childQty` | `childQty` | 子件用量 |

### FreeCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `productDefineCharacter` | `productDefineCharacter` | `productDefineCharacter` | 物料自由项特征组 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubuts` | `pubuts` | `pubts` | 时间戳 |
