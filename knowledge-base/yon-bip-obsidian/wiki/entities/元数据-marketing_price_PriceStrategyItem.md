---
tags: [BIP, 元数据, 数据字典, marketing.price.PriceStrategyItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 定价策略价格项 (`marketing.price.PriceStrategyItem`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`udh_price_strategy_item` | domain：`marketingbill` | 应用：`B2Bpricing` | 业务对象ID：`88cd1550-0cdb-48cd-b7e2-84585010bc0d`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 定价策略价格项 |
| 物理表 | `udh_price_strategy_item` |
| 数据库 schema | `marketingbill` |
| 所属应用 | `B2Bpricing` |
| 直连字段 | 10 个 |
| 子表 | 0 个 |
| 关联引用 | 0 个 |

## 字段列表（按类型分组）

> 共 10 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `billno` | `billno` | `billno` | 单据编号 |
| `field_name` | `field_name` | `fieldName` | 字段 |
| `item_text` | `item_text` | `itemText` | 价格项名称 |
| `domainKey` | `domainKey` | `domainKey` | 映射领域 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isCanEdit` | `isCanEdit` | `isCanEdit` | 是否可编辑 |
| `b_header` | `b_header` | `isHeader` | 是否表头字段 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 单据主表id |
| `tenant_id` | `tenant_id` | `tenantId` | 租户id |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubuts` | `pubuts` | `pubts` | 时间戳 |
