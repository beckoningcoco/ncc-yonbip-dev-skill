---
tags: ["BIP", "元数据", "数据字典", "ycSupplierManagement", "cpu-supplymgr.supplymanage.ManageMaterial"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 准入管理材料 (`cpu-supplymgr.supplymanage.ManageMaterial`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSupplierManagement 模块实体元数据字典。
> 物理表：`cpu_manage_material` | 所属应用：`ycSupplierManagement`
> 来源：元数据API `queryByUri` 返回的 `cpu-supplymgr.supplymanage.ManageMaterial` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 准入管理材料 |
| 物理表 | `cpu_manage_material` |
| 数据库 schema | `cpu-supplymgr` |
| 所属应用 | `ycSupplierManagement` |
| 业务对象ID | `d211fcdf-96d9-496f-8e92-cb3a169973d6` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:35:16.7450` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 主键 |

## 部署信息

- **部署时间**: 2026-05-22 23:46:00:000
- **安装来源**: `/app/data_scripts/cpu-suppliermgr-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-suppliermgr/0010_iuap_common/DML/0270_iuap_metadata/202603311155_metadata_cpu-supplymgr-supplymanage_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `d47bcfbb-3be6-4db3-8239-8c86110dc430`

## 术语标记

`BusinessData`

## 约束

- **migration_id** (MetaClassPrimary): 主键 — 唯一字段: `['id']`

## 依赖接口（共 1 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 10 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `cpuSupplyManageId` | 准入管理主键 | `cpu_supply_manage_id` | dd2cc0b2-a937-4a7f-8d59-5010ef76f477 | `quote` |  | ✓ |
| 2 | `dr` | 逻辑删除标识 | `dr` | Long | `long` |  | ✓ |
| 3 | `id` | 主键 | `id` | Long | `long` |  | ✓ |
| 4 | `materialClassCode` | 物料分类编码 | `material_class_code` | String | `text` |  | ✓ |
| 5 | `materialClassId` | 物料分类主键 | `material_class_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `quote` |  | ✓ |
| 6 | `materialClassName` | 物料分类名称 | `material_class_name` | String | `text` |  | ✓ |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 8 | `rowNo` | 行号 | `row_no` | Long | `long` |  | ✓ |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 10 | `ytenantId` | 租户主键 | `ytenant_id` | String | `text` |  | ✓ |

---

## 关联属性（共 3 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `materialClassId` | 物料分类主键 | `pc.cls.ManagementClass` | `material_class_id` |  →  |  |  | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `cpuSupplyManageId` | 准入管理主键 | `cpu-supplymgr.supplymanage.SupplyManage` | `cpu_supply_manage_id` | manageMaterial → cpuSupplyManageId | 0..n | true | None |  |

### Composition（子表）

- **cpuSupplyManageId**: `manageMaterial` → `cpu-supplymgr.supplymanage.SupplyManage` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `materialClassId` (物料分类主键) | `pc.cls.ManagementClass` | `material_class_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
