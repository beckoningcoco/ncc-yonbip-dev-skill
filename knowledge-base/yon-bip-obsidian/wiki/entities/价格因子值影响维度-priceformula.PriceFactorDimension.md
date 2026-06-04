---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "aa.priceformula.PriceFactorDimension"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 价格因子值影响维度 (`aa.priceformula.PriceFactorDimension`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_price_factor_dimension` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `aa.priceformula.PriceFactorDimension` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 价格因子值影响维度 |
| 物理表 | `cpu_price_factor_dimension` |
| 数据库 schema | `cpu-bi-service` |
| 所属应用 | `ycPriceCenter` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:24:43.7560` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2024-03-23 00:00:54:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V3_R5_2312/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202401021916_metadata_aa-priceformula.zip`
- **安装人**: migration
- **安装排名**: `062973a4-9b8d-48f0-b99b-fac803e6f23f`

## 术语标记

`BusinessData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 1 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 5 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `factor` | 价格因子 | `factor` | 5cf7014b-8d50-40b9-b2a0-bc00ad18e423 | `quote` |  | ✓ |
| 2 | `factorDimension` | 因子维度 | `factor_dimension` | 5cf7014b-8d50-40b9-b2a0-bc00ad18e423 | `quote` |  | ✓ |
| 3 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 5 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 3 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 2 | `factor` | 价格因子 | `aa.priceformula.PriceFactor` | `factor` | PriceFactorDimensionList → factor | 0..n | true | None |  |
| 3 | `factorDimension` | 因子维度 | `aa.priceformula.PriceFactor` | `factor_dimension` |  →  |  |  | None |  |

### Composition（子表）

- **factor**: `PriceFactorDimensionList` → `aa.priceformula.PriceFactor` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
