---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "aa.pricecenter.BiDimensionPricing"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 报价主表 (`aa.pricecenter.BiDimensionPricing`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`bi_dimension_pricing` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `aa.pricecenter.BiDimensionPricing` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 报价主表 |
| 物理表 | `bi_dimension_pricing` |
| domain/服务域 | `cpu-bi-service` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 业务对象ID | `be3a885a-39e9-4f3b-8c98-70e4d3287590` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:16:06.1910` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2025-10-24 23:29:25:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202509142115_metadata_aa-pricecenter_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `8d3abdbf-d98e-4f67-ad7c-646e01ce1079`

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`

## 约束

- **id** (transformKey): 主键 — 唯一字段: `['id']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 1 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 8 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `biMaterialPriceTrend` | 物料价格趋势 | `` | aebdf487-c0bd-4099-a565-60e0c72a391a | `` |  |  |
| 2 | `biPriceEntityList` | 价格目录 | `` | eb9690f1-b4ed-4223-8ce3-06710f2c6242 | `` |  |  |
| 3 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 4 | `priceCalcuMethod` | 价格计算方式 | `price_calcu_method` | PriceCalcuMethod | `` |  | ✓ |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 6 | `supModiDim` | 供应商是否可改价格维度 | `sup_modi_dim` | SupModiDim | `` |  | ✓ |
| 7 | `supModiQuaLad` | 供应商是否可改数量阶梯 | `sup_modi_qua_lad` | SupModiQuaLad | `` |  | ✓ |
| 8 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 3 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 2 | `biPriceEntityList` | 价格目录 | `aa.pricecenter.BiPriceEntity` | `` | biPriceEntityList → quotationId | 1..n | true | None |  |
| 3 | `biMaterialPriceTrend` | 物料价格趋势 | `aa.pricecenter.BiMaterialPriceTrend` | `` | biMaterialPriceTrend → quotationId | 1..n | true | None |  |

### Composition（子表）

- **biPriceEntityList**: `biPriceEntityList` → `aa.pricecenter.BiPriceEntity` | 1..n
- **biMaterialPriceTrend**: `biMaterialPriceTrend` → `aa.pricecenter.BiMaterialPriceTrend` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
