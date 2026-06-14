---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "cpubase.supplycategory.SupplycategoryMaterialClass"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 物料分类维度 (`cpubase.supplycategory.SupplycategoryMaterialClass`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_supplycategory_mcview` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `cpubase.supplycategory.SupplycategoryMaterialClass` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料分类维度 |
| 物理表 | `cpu_supplycategory_mcview` |
| domain/服务域 | `cpu-base` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 业务对象ID | `de8f0f21-0e87-4c18-b502-2eea6369aa74` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:18:59.3030` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `material_class_id` | `material_class_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 | 物料分类id |

## 部署信息

- **部署时间**: 2025-10-24 23:29:26:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202509142212_metadata_cpubase-supplycategory_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `38094c02-9602-491d-bac8-57cc212b0fa9`

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`, `isView`

## 约束

- **migration_materialClassId** (MetaClassPrimary): 物料分类id — 唯一字段: `['materialClassId']`

## 依赖接口（共 2 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 树型结构 (`ITree`) | `base.itf.ITree` | 231 | 5 |
| 2 | 统一租户接口(扩展) (`IYTenantExt`) | `ucfbase.ucfbaseItf.IYTenantExt` | 24 | 1 |

---

## 直接属性（共 13 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `code` | 物料分类编码 | `code` | String | `text` |  | ✓ |
| 2 | `name` | 物料分类名称 | `name` | String | `text` |  | ✓ |
| 3 | `materialClassId` | 物料分类id | `material_class_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `quote` |  | ✓ |
| 4 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 6 | `parent` | 上级分类 | `parent_id` | Long | `long` |  | ✓ |
| 7 | `level` | 层级 | `level` | Integer | `int` |  | ✓ |
| 8 | `path` | 路径 | `path` | String | `text` |  | ✓ |
| 9 | `sort` | 排序号 | `sort_num` | Integer | `int` |  | ✓ |
| 10 | `isEnd` | 是否末级 | `isEnd` | Boolean | `switch` |  | ✓ |
| 11 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |  | ✓ |
| 12 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 13 | `ts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |

---

## 关联属性（共 2 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `materialClassId` | 物料分类id | `pc.cls.ManagementClass` | `material_class_id` |  →  |  |  | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `materialClassId` (物料分类id) | `pc.cls.ManagementClass` | `material_class_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
