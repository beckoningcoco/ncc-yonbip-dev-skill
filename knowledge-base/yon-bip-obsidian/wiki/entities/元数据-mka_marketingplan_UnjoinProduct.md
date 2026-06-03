---
tags: [BIP, 元数据, 数据字典, mka.marketingplan.UnjoinProduct]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 营销方案排除商品 (`mka.marketingplan.UnjoinProduct`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mka_unjoin_product` | domain：`yycrm` | 应用：`MKA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 营销方案排除商品 |
| 物理表 | `mka_unjoin_product` |
| 数据库 schema | `yycrm` |
| 所属应用 | `MKA` |
| 直连字段 | 5 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `product` | `productcenter.pc_productquerytreeref` |
| `ytenant_id` | `` |
| `marketPlanId` | `` |

## 继承接口 (2个, 2字段)

- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 5 个直连字段

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `product` | `product` | `product` | 商品 |
| `marketPlanId` | `marketPlanId` | `marketPlanId` | 营销方案ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 排除商品子表主键 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
