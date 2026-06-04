---
tags: ["BIP", "元数据", "数据字典", "ycYuncaiMall", "ycYuncaiMall.marketProduct.marketProduct"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 超市商品 (`ycYuncaiMall.marketProduct.marketProduct`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycYuncaiMall 模块实体元数据字典。
> 物理表：`cpu_supplycategory` | 所属应用：`ycYuncaiMall`
> 来源：元数据API `queryByUri` 返回的 `ycYuncaiMall.marketProduct.marketProduct` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 超市商品 |
| 物理表 | `cpu_supplycategory` |
| 数据库 schema | `cpu-base` |
| 所属应用 | `ycYuncaiMall` |
| 业务对象ID | `704b510c-6c56-4a00-96f7-6e15e3e36aa3` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:00:34.9300` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-01-23 23:40:38:000
- **安装来源**: `/app/data_scripts/cpu-mall-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-mall/0010_iuap_common/DML/0270_iuap_metadata/202511081037_metadata_ycYuncaiMall-marketProduct_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `25cdae10-5945-422c-bb7a-091bfc78ecd8`

## 术语标记

`BusinessData`, `dataAuth`, `data_auth`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 2 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |

---

## 直接属性（共 12 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `dr` | 逻辑删除标记位 | `dr` | Integer | `int` |  | ✓ |
| 2 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 3 | `productClassId` | 适用商品分类 | `mallclass_id` | c58dfa3a-81e5-4d0e-b4ba-794bced793a1 | `quote` |  | ✓ |
| 4 | `productClassName` | 超市商品分类编码 | `mallclass_name` | String | `text` |  | ✓ |
| 5 | `productCode` | 商品编码 | `product_code` | String | `text` |  | ✓ |
| 6 | `productId` | 商品ID | `product_id` | Long | `long` |  | ✓ |
| 7 | `productName` | 商品名称 | `product_name` | String | `text` |  | ✓ |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 9 | `supplierDocId` | 供应商档案 | `supply_doc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 10 | `supplierId` | 供应商企业ID | `supplier_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 | `quote` |  | ✓ |
| 11 | `supplierName` | 供应商企业名称 | `supplier_name` | String | `text` |  | ✓ |
| 12 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 4 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `supplierDocId` | 供应商档案 | `aa.vendor.Vendor` | `supply_doc_id` |  →  |  |  | Service |  |
| 2 | `productClassId` | 适用商品分类 | `ycYuncaiMall.marketProductClass.marketProductClass` | `mallclass_id` |  →  |  |  | Service |  |
| 3 | `supplierId` | 供应商企业ID | `cpu-privilege.enterprise.EnterprisePOJO` | `supplier_id` |  →  |  |  | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `supplierDocId` (供应商档案) | `aa.vendor.Vendor` | `supply_doc_id` |
| `productClassId` (适用商品分类) | `ycYuncaiMall.marketProductClass.marketProductClass` | `mallclass_id` |
| `supplierId` (供应商企业ID) | `cpu-privilege.enterprise.EnterprisePOJO` | `supplier_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
