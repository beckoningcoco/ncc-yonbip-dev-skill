---
tags: [BIP, 元数据, 数据字典, marketing.cpq.CostpricingPlanItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 成本取价方案明细 (`marketing.cpq.CostpricingPlanItem`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`udh_cpq_costpricing_planitem` | domain：`marketingbill` | 应用：`CPQ` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 成本取价方案明细 |
| 物理表 | `udh_cpq_costpricing_planitem` |
| 数据库 schema | `marketingbill` |
| 所属应用 | `CPQ` |
| 直连字段 | 9 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `cost_type` | `` |
| `pricing_strategy` | `` |
| `planid` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 9 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `childitem_type` | `childitem_type` | `childitemType` | 子项类别 |
| `inventorycost_method` | `inventorycost_method` | `inventorycostMethod` | 存货成本方式 |
| `pricing_sourcesystem` | `pricing_sourcesystem` | `pricingSourceSystem` | 取价来源系统 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cost_type` | `cost_type` | `costType` | 成本类型 |
| `planid` | `planid` | `planId` | 成本取价方案ID |
| `pricing_strategy` | `pricing_strategy` | `pricingStrategy` | 定价策略 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubuts` | `pubuts` | `pubts` | 时间戳 |
