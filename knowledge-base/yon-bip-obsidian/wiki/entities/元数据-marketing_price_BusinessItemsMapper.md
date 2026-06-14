---
tags: [BIP, 元数据, 数据字典, marketing.price.BusinessItemsMapper]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 价格项子表 (`marketing.price.BusinessItemsMapper`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`udh_business_items_mapper` | domain：`marketingbill` | 应用：`B2Bpricing` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 价格项子表 |
| 物理表 | `udh_business_items_mapper` |
| domain/服务域 | `marketingbill` |
| 所属应用 | `B2Bpricing` |
| 直连字段 | 7 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `billfield_id` | `` |
| `ytenant_id` | `` |
| `business_items_id` | `` |
| `bill_type` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 7 个直连字段

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `billfield_id` | `billfield_id` | `billFieldId` | 单据字段 |
| `bill_type` | `bill_type` | `billTypeId` | 单据类型 |
| `business_items_id` | `business_items_id` | `businessItemsId` | 价格项主表ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `b_prepare` | `b_prepare` | `isPrepare` | 是否预制 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubuts` | `pubuts` | `pubts` | 时间戳 |
