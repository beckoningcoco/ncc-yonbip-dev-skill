---
tags: ["BIP", "元数据", "数据字典", "ycYuncaiMall", "mall.operatingprice.CpuOperatingPriceSupplier"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 运营价格协议供应商档案 (`mall.operatingprice.CpuOperatingPriceSupplier`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycYuncaiMall 模块实体元数据字典。
> 物理表：`cpu_operating_price_supplier` | 所属应用：`ycYuncaiMall`
> 来源：元数据API `queryByUri` 返回的 `mall.operatingprice.CpuOperatingPriceSupplier` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 运营价格协议供应商档案 |
| 物理表 | `cpu_operating_price_supplier` |
| domain/服务域 | `yonbip-cpu-mall` |
| schema | `cpu_mall` |
| 所属应用 | `ycYuncaiMall` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:16:55.2110` |

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

## 直接属性（共 7 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 2 | `priceProductId` | 协议子表ID | `price_product_id` | de39a65e-7538-46bf-8b50-6f90b55d8067 | `quote` |  | ✓ |
| 3 | `supplyDocId` | 供应商档案ID | `supply_doc_id` | Long | `long` |  | ✓ |
| 4 | `dr` | 逻辑删除标识 | `dr` | Boolean | `switch` |  | ✓ |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |  | ✓ |
| 6 | `supplyDocName` | 供应商 | `supply_doc_name` | String | `text` |  | ✓ |
| 7 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 2 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 2 | `priceProductId` | 协议子表ID | `mall.operatingprice.CpuOperatingPriceProduct` | `price_product_id` | suppliers → priceProductId | 0..n | true | None |  |

### Composition（子表）

- **priceProductId**: `suppliers` → `mall.operatingprice.CpuOperatingPriceProduct` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
