---
tags: [BIP, 元数据, 数据字典, marketing.price.PriceStrategyScope]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 定价策略适应范围 (`marketing.price.PriceStrategyScope`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`udh_price_strategy_scope` | domain：`marketingbill` | 应用：`B2Bpricing` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 定价策略适应范围 |
| 物理表 | `udh_price_strategy_scope` |
| 数据库 schema | `marketingbill` |
| 所属应用 | `B2Bpricing` |
| 直连字段 | 12 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `sale_org_id` | `market_salesorgref` |
| `udh_price_strategy_id` | `` |
| `ytenant_id` | `` |
| `iBizId` | `bizref` |

## 继承接口 (3个, 3字段)

- **逻辑删除相关** (`base.itf.Deletable`)
  - `iDeleted` → `iDeleted`
- **U订货租户相关** (`base.itf.IUordercorp`)
  - `iCorpId` → `iCorpId`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 12 个直连字段

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `udh_price_strategy_id` | `udh_price_strategy_id` | `priceStrategyId` | 定价策略ID |
| `iBizId` | `iBizId` | `bizId` | 商家ID |
| `sale_org_id` | `sale_org_id` | `saleOrgId` | 销售组织ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `canEdit` | `canEdit` | `canEdit` | 是否可改 |
| `idistributed` | `idistributed` | `distributed` | 已分配 |
| `iDeleted` | `iDeleted` | `isDeleted` | 逻辑删除标记 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bizType` | `bizType` | `bizType` | 商家类型 |
| `version` | `version` | `version` | 版本号 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 单据id |
| `tenant_id` | `tenant_id` | `uordercorp` | 租户ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubuts` | `pubuts` | `pubts` | 时间戳 |
