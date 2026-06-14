---
tags: [BIP, 元数据, 数据字典, marketing.price.PriceStrategyStep]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 定价策略取价步骤 (`marketing.price.PriceStrategyStep`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`udh_price_strategy_step` | domain：`marketingbill` | 应用：`B2Bpricing` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 定价策略取价步骤 |
| 物理表 | `udh_price_strategy_step` |
| domain/服务域 | `marketingbill` |
| 所属应用 | `B2Bpricing` |
| 直连字段 | 21 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `udh_pricing_type_id` | `pricingTyperef` |
| `udh_price_strategy_id` | `` |
| `ytenant_id` | `` |
| `udh_price_strategy_item_Main_id` | `` |

## 继承接口 (3个, 3字段)

- **逻辑删除相关** (`base.itf.Deletable`)
  - `iDeleted` → `iDeleted`
- **U订货租户相关** (`base.itf.IUordercorp`)
  - `iCorpId` → `iCorpId`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 21 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `description` | `description` | `description` | 描述 |
| `udh_price_strategy_item_id` | `udh_price_strategy_item_id` | `priceItemId` | 价格项id |
| `mutex_group` | `mutex_group` | `mutex_group` | 适用互斥组 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `udh_price_strategy_id` | `udh_price_strategy_id` | `priceStrategyId` | 定价策略ID |
| `udh_pricing_type_id` | `udh_pricing_type_id` | `pricingTypeId` | 定价类型ID |
| `udh_price_strategy_item_Main_id` | `udh_price_strategy_item_Main_id` | `priceItemMainId` | 价格项 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `b_show_only` | `b_show_only` | `bShowOnly` | 仅显示 |
| `noParticipate` | `noParticipate` | `noParticipate` | 不参与计算 |
| `b_subtotal` | `b_subtotal` | `bSubtotal` | 小计项 |
| `bnecessary_step` | `bnecessary_step` | `bNecessaryStep` | 必要步骤 |
| `iDeleted` | `iDeleted` | `isDeleted` | 逻辑删除标记 |

### 短整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `step` | `step` | `step` | 步骤 |
| `begin_step` | `begin_step` | `beginStep` | 从 |
| `end_step` | `end_step` | `endStep` | 到 |
| `priority_level` | `priority_level` | `priority_level` | 组内优先级 |
| `version` | `version` | `version` | 版本号 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 单据id |
| `iBizId` | `iBizId` | `bizId` | 商家 |
| `tenant_id` | `tenant_id` | `uordercorp` | 租户ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubuts` | `pubuts` | `pubts` | 时间戳 |
