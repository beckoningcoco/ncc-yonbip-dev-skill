---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "aa.pricetype.PriceOrderType"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 取价顺序-定价类型-子表 (`aa.pricetype.PriceOrderType`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_price_priceorder_type` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `aa.pricetype.PriceOrderType` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 取价顺序-定价类型-子表 |
| 物理表 | `cpu_price_priceorder_type` |
| 数据库 schema | `cpu-bi-service` |
| 所属应用 | `ycPriceCenter` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:24:49.7810` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 定价类型表id |

## 部署信息

- **部署时间**: 2026-05-22 23:53:05:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202604031336_metadata_aa-pricetype_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `92afaefc-db9f-44b2-af47-6ee0c8d13d1d`

## 术语标记

`ConfigData`

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
| 1 | `id` | 定价类型表id | `id` | Long | `long` |  | ✓ |
| 2 | `priceType` | 定价类型id | `price_type` | 8495de5e-0f17-483c-947c-a5a8a35739e6 | `quote` |  | ✓ |
| 3 | `priceOrderId` | 主表id | `priceorder_id` | d54d076f-2358-4a10-896a-9d5822c9bafb | `quote` |  | ✓ |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 5 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 3 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `priceOrderId` | 主表id | `aa.pricetype.PriceOrder` | `priceorder_id` | priceOrderTypeList → priceOrderId | 1..n | true | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `priceType` | 定价类型id | `aa.pricetype.PriceType` | `price_type` |  →  |  |  | None |  |

### Composition（子表）

- **priceOrderId**: `priceOrderTypeList` → `aa.pricetype.PriceOrder` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
