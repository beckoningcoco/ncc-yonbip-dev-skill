---
tags: ["BIP", "元数据", "数据字典", "ycBase", "business.supplier.BusinessSupplierSolutionExt"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 供应商推荐扩展 (`business.supplier.BusinessSupplierSolutionExt`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_business_rule_solution_supplier_ext` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `business.supplier.BusinessSupplierSolutionExt` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商推荐扩展 |
| 物理表 | `cpu_business_rule_solution_supplier_ext` |
| domain/服务域 | `cpu-base` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycBase` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:16:04.5070` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | 6ad43578-38c9-4919-8f9f-ef1528733280 | 主键 |

## 部署信息

- **部署时间**: 2026-05-22 23:53:06:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202604171051_metadata_business-supplier.zip`
- **安装人**: mongoTools
- **安装排名**: `ac68a075-ffd8-48ab-b11a-fadf93d67fd7`

## 术语标记

`ConfigData`

## 约束

- **migration_id** (MetaClassPrimary): 主键 — 唯一字段: `['id']`

## 依赖接口（共 1 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 8 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | 主键 | `id` | 6ad43578-38c9-4919-8f9f-ef1528733280 | `quote` |  | ✓ |
| 2 | `isSys` | 是否系统预置 | `is_sys` | Short | `short` |  | ✓ |
| 3 | `recommendedQuantity` | 最大推荐数量 | `recommended_quantity` | Integer | `int` |  | ✓ |
| 4 | `resultAggregationMethod` | 查询结果汇总方式 | `result_aggregation_method` | Short | `short` |  | ✓ |
| 5 | `resultClassificationLevel` | 查询结果分类级次 | `result_classification_level` | Short | `short` |  | ✓ |
| 6 | `resultControlType` | 管控方式 | `result_control_type` | String | `text` |  | ✓ |
| 7 | `sysId` | 系统标识 | `sys_id` | Long | `long` |  | ✓ |
| 8 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 2 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 2 | `id` | 主键 | `business.supplier.BusinessSupplierSolution` | `id` | solutionExt → id | 1 | true | None |  |

### Composition（子表）

- **id**: `solutionExt` → `business.supplier.BusinessSupplierSolution` | 1

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
