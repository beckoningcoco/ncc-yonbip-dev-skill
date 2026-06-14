---
tags: ["BIP", "元数据", "数据字典", "ycYuncaiMall", "mall.operatingprice.CpuOperatingPriceProduct"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 运营价格协议子表 (`mall.operatingprice.CpuOperatingPriceProduct`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycYuncaiMall 模块实体元数据字典。
> 物理表：`cpu_operating_price_product` | 所属应用：`ycYuncaiMall`
> 来源：元数据API `queryByUri` 返回的 `mall.operatingprice.CpuOperatingPriceProduct` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 运营价格协议子表 |
| 物理表 | `cpu_operating_price_product` |
| domain/服务域 | `yonbip-cpu-mall` |
| schema | `cpu_mall` |
| 所属应用 | `ycYuncaiMall` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:08:18.8630` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2025-10-24 23:19:31:000
- **安装来源**: `/app/data_scripts/cpu-mall-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-mall/0010_iuap_common/DML/0270_iuap_metadata/202508061549_metadata_mall-operatingprice.zip`
- **安装人**: mongoTools
- **安装排名**: `1d57f57e-77b7-4c5f-b148-4d53348c9321`

## 术语标记

`BusinessData`

## 约束

- **bizUniqueIndex_transform** (transformKey): 主键 — 唯一字段: `['id']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`
- **bizUniqueIndex** (Unique): 主键 — 唯一字段: `['id']`

## 依赖接口（共 2 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |

---

## 直接属性（共 17 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 2 | `priceId` | 协议主表ID | `price_id` | 54f73169-773d-40df-9fbc-c092f4201577 | `quote` |  | ✓ |
| 3 | `exceedPublicPrice` | 是否可超过公开价格 | `exceed_public_price` | Integer | `int` |  | ✓ |
| 4 | `productId` | 商品 | `product_id` | Long | `long` |  | ✓ |
| 5 | `priceDirection` | 调价方向 | `price_direction` | Integer | `int` |  | ✓ |
| 6 | `priceRate` | 调价比例 | `price_rate` | Decimal | `number` |  | ✓ |
| 7 | `priceAmount` | 调价金额 | `price_amount` | Decimal | `number` |  | ✓ |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |  | ✓ |
| 9 | `categorys` | 运营价格协议商品分类 | `` | 9b793d46-bb9b-4b98-83d7-288ac14475e8 | `` |  |  |
| 10 | `dr` | 逻辑删除标识 | `dr` | Boolean | `switch` |  | ✓ |
| 11 | `priceBegin` | 价格区间（起） | `price_begin` | Decimal | `number` |  | ✓ |
| 12 | `priceEnd` | 价格区间（止） | `price_end` | Decimal | `number` |  | ✓ |
| 13 | `priority` | 优先级 | `priority` | Integer | `int` |  | ✓ |
| 14 | `productdefineCharacterId` | 自定义项特征 | `define_character_id` | 32e38707-8afe-47a1-92ca-8334952753fd | `UserDefine` |  | ✓ |
| 15 | `suppliers` | 运营价格协议供应商档案 | `` | 737cce8a-269b-4291-a595-63514155b9c2 | `` |  |  |
| 16 | `supplyCatalogId` | 供货目录 | `supplycatalog_id` | 5f5d18df-3d80-4cc1-8413-93fd4e2c2b20 | `quote` |  | ✓ |
| 17 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 6 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `supplyCatalogId` | 供货目录 | `mall.productShelves.ProductShelves` | `supplycatalog_id` |  →  |  |  | Service |  |
| 2 | `categorys` | 运营价格协议商品分类 | `mall.operatingprice.CpuOperatingPriceCategory` | `` | categorys → priceProductId | 0..n | true | None |  |
| 3 | `suppliers` | 运营价格协议供应商档案 | `mall.operatingprice.CpuOperatingPriceSupplier` | `` | suppliers → priceProductId | 0..n | true | None |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 5 | `priceId` | 协议主表ID | `mall.operatingprice.CpuOperatingPrice` | `price_id` | priceProducts → priceId | 0..n | true | None |  |
| 6 | `productdefineCharacterId` | 自定义项特征 | `mall.operatingprice.CpuOperatingPriceProductCharacter` | `define_character_id` |  →  |  |  | None |  |

### Composition（子表）

- **categorys**: `categorys` → `mall.operatingprice.CpuOperatingPriceCategory` | 0..n
- **suppliers**: `suppliers` → `mall.operatingprice.CpuOperatingPriceSupplier` | 0..n
- **priceId**: `priceProducts` → `mall.operatingprice.CpuOperatingPrice` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `supplyCatalogId` (供货目录) | `mall.productShelves.ProductShelves` | `supplycatalog_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
