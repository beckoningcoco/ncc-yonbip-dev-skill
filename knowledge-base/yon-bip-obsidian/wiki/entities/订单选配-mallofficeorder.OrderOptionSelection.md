---
tags: ["BIP", "元数据", "数据字典", "ycYuncaiMall", "mall.mallofficeorder.OrderOptionSelection"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 订单选配 (`mall.mallofficeorder.OrderOptionSelection`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycYuncaiMall 模块实体元数据字典。
> 物理表：`order_option_selection` | 所属应用：`ycYuncaiMall`
> 来源：元数据API `queryByUri` 返回的 `mall.mallofficeorder.OrderOptionSelection` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 订单选配 |
| 物理表 | `order_option_selection` |
| domain/服务域 | `yonbip-cpu-mall` |
| schema | `cpu_mall` |
| 所属应用 | `ycYuncaiMall` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:16:49.8880` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `SELECTION_ID` | `SELECTION_ID` | Long | ID |

## 部署信息

- **部署时间**: 2025-10-24 23:19:29:000
- **安装来源**: `/app/data_scripts/cpu-mall-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-mall/0010_iuap_common/DML/0270_iuap_metadata/202508060958_metadata_mall-mallofficeorder_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `4f64b755-1e01-4d5c-bf28-4ed9e8b1b6db`

## 术语标记

`BusinessData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 2 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 2 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 10 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 2 | `id` | ID | `SELECTION_ID` | Long | `long` |  | ✓ |
| 3 | `optionId` | 商品选配ID | `OPTION_ID` | Long | `long` |  | ✓ |
| 4 | `orderDetailId` | 订单行ID | `ORDER_DETAIL_ID` | a6cf30ba-d19e-40fb-83d2-615ee56f6f85 | `quote` |  | ✓ |
| 5 | `price` | 价格 | `price` | Decimal | `number` |  | ✓ |
| 6 | `propertyId` | 商品属性ID | `property_id` | String | `text` |  | ✓ |
| 7 | `propertyName` | 商品属性名称 | `property_name` | String | `text` |  | ✓ |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |  | ✓ |
| 9 | `quantity` | 数量 | `quantity` | Decimal | `number` |  | ✓ |
| 10 | `ytenant` | 租户id | `ytenant_id` | String | `text` | ✓ | ✓ |

---

## 关联属性（共 1 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `orderDetailId` | 订单行ID | `mall.mallofficeorder.OrderDetail` | `ORDER_DETAIL_ID` | orderoption → orderDetailId | 0..n | true | None |  |

### Composition（子表）

- **orderDetailId**: `orderoption` → `mall.mallofficeorder.OrderDetail` | 0..n
