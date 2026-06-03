---
tags: [BIP, 元数据, 数据字典, marketing.cpq.OptionalQuotationRule]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 配置报价规则 (`marketing.cpq.OptionalQuotationRule`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`optionalquotationrule` | domain：`marketingbill` | 应用：`CPQ` | 业务对象ID：`89c6a395-f537-4e38-8508-33079d0c9b7c`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 配置报价规则 |
| 物理表 | `optionalquotationrule` |
| 数据库 schema | `marketingbill` |
| 所属应用 | `CPQ` |
| 直连字段 | 29 个 |
| 子表 | 4 个 |
| 关联引用 | 13 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `detailGroups` | `marketing.cpq.OptionalQuotationRuleDetailGroup` | composition |
| `details` | `marketing.cpq.OptionalQuotationRuleDetail` | composition |
| `orgs` | `marketing.cpq.OptionalQuotationRuleOrg` | composition |
| `products` | `marketing.cpq.OptionalQuotationRuleProduct` | composition |

## 关联引用 (13个)

| 字段名 | 引用类型 |
|--------|---------|
| `costPricingId` | `` |
| `productId` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `productDefineCharacter` | `` |
| `orgId` | `` |
| `phasedisplayRuleId` | `` |
| `vcConfigId` | `engineeringdata.ed_variant_configuration_ref` |

## 继承接口 (3个, 10字段)

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
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``

## 字段列表（按类型分组）

> 共 29 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `code` | `code` | 编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `cExplain` | `cExplain` | `explain` | 说明 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `name` | `name` | `name` | 名称 |
| `priceLevel` | `priceLevel` | `priceLevel` | 定价阶层 |
| `priceMethod` | `priceMethod` | `priceMethod` | 定价方式 |
| `pricingUnitType` | `pricingUnitType` | `pricingUnitType` | 询价单位类型 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `costPricingId` | `costPricingId` | `costPricingId` | 成本取价方案ID |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `orgId` | `orgId` | `orgId` | 销售组织 |
| `phasedisplayRuleId` | `phasedisplayRuleId` | `phasedisplayRuleId` | 盈亏显示规则ID |
| `productId` | `productId` | `productId` | 商家id |
| `vcConfigId` | `vcConfigId` | `vcConfigId` | 选配参数文件ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `priority` | `priority` | `priority` | 优先级 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iStatus` | `iStatus` | `status` | 状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubuts` | `pubuts` | `pubts` | 时间戳 |

### other (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `detailGroups` | 配置报价规则详情分组 |
| `` | `` | `details` | 配置报价规则详情 |
| `` | `` | `orgs` | 配置报价规则适用组织 |
| `` | `` | `products` | 配置报价规则适用物料 |

### FreeCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `productDefineCharacter` | `productDefineCharacter` | `productDefineCharacter` | 物料自由项特征组 |
