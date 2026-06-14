---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "cpubase.supplycategory.SupplycategoryMaterial"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 物料维度 (`cpubase.supplycategory.SupplycategoryMaterial`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_supplycategory_mview` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `cpubase.supplycategory.SupplycategoryMaterial` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料维度 |
| 物理表 | `cpu_supplycategory_mview` |
| domain/服务域 | `cpu-base` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 业务对象ID | `a615440f-8a98-4f89-b99c-303906c9779d` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:18:02.9340` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2025-10-24 23:29:26:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202509142212_metadata_cpubase-supplycategory_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `38094c02-9602-491d-bac8-57cc212b0fa9`

## 业务场景

- `UITemplate`
- `report`
- `ruleengine`

## 术语标记

`isAssigned`, `isExtend`, `data_auth`, `isView`, `dataAuth`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 2 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 树型结构 (`ITree`) | `base.itf.ITree` | 231 | 5 |
| 2 | 统一租户接口(扩展) (`IYTenantExt`) | `ucfbase.ucfbaseItf.IYTenantExt` | 24 | 1 |

---

## 直接属性（共 16 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 2 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 3 | `materialId` | 物料Id | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | ✓ |
| 4 | `org` | 所属组织id | `org` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 5 | `materialClassId` | 物料分类Id | `material_class_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `quote` |  | ✓ |
| 6 | `code` | 物料编码 | `code` | String | `text` |  | ✓ |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 8 | `isEnd` | 是否末级 | `isEnd` | Boolean | `switch` |  | ✓ |
| 9 | `level` | 层级 | `level` | Integer | `int` |  | ✓ |
| 10 | `name` | 物料名称 | `name` | String | `text` |  | ✓ |
| 11 | `parent` | 上级分类 | `parent_id` | Long | `long` |  | ✓ |
| 12 | `path` | 路径 | `path` | String | `text` |  | ✓ |
| 13 | `purchaseClassId` | 采购分类Id | `purchase_class_id` | ec3f827d-4cff-462d-b74c-1dd556c96baa | `quote` |  | ✓ |
| 14 | `sort` | 排序号 | `sort_num` | Integer | `int` |  | ✓ |
| 15 | `ts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 16 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |  | ✓ |

---

## 关联属性（共 5 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `purchaseClassId` | 采购分类Id | `pc.cls.PurchaseClass` | `purchase_class_id` |  →  |  |  | Service |  |
| 2 | `materialClassId` | 物料分类Id | `pc.cls.ManagementClass` | `material_class_id` |  →  |  |  | Service |  |
| 3 | `org` | 所属组织id | `org.func.BaseOrg` | `org` |  →  |  |  | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 5 | `materialId` | 物料Id | `pc.product.Product` | `material_id` |  →  |  |  | Service |  |

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `purchaseClassId` (采购分类Id) | `pc.cls.PurchaseClass` | `purchase_class_id` |
| `materialClassId` (物料分类Id) | `pc.cls.ManagementClass` | `material_class_id` |
| `org` (所属组织id) | `org.func.BaseOrg` | `org` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `materialId` (物料Id) | `pc.product.Product` | `material_id` |
